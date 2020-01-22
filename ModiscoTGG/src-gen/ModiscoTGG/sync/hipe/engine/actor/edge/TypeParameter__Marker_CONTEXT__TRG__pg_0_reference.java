package ModiscoTGG.sync.hipe.engine.actor.edge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import hipe.engine.util.HiPESet;
import hipe.engine.actor.Port;
import hipe.engine.match.EdgeMatch;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NewInput;
import hipe.engine.actor.edge.PortEdge;
import hipe.engine.actor.edge.PortEdgeLeft;
import hipe.engine.actor.edge.PortEdgeRight;
import hipe.engine.message.HiPEMessage;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;
import hipe.engine.message.node.NodeAddedLeft;
import hipe.engine.message.node.NodeAddedRight;
import hipe.engine.message.node.NodeDeletedLeft;
import hipe.engine.message.node.NodeDeletedRight;		
import hipe.engine.message.InitActor;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.InputMessage;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

public class TypeParameter__Marker_CONTEXT__TRG__pg_0_reference extends AbstractActor {

	private List<Port<EdgeMatch>> ports;

	private Map<ModiscoTGG.TypeParameter__Marker, Set<EdgeMatch>> sourceElements = new HashMap<ModiscoTGG.TypeParameter__Marker, Set<EdgeMatch>>();
	private Map<org.gravity.typegraph.basic.TypeGraph, Set<EdgeMatch>> targetElements = new HashMap<org.gravity.typegraph.basic.TypeGraph, Set<EdgeMatch>>();
	private HiPESet<EdgeMatch> matches = new HiPESet<>();
	
	private Map<org.gravity.typegraph.basic.TypeGraph, Set<ModiscoTGG.TypeParameter__Marker>> pending = new HashMap<>();

	private int finishedNodes = 0;
	
	public TypeParameter__Marker_CONTEXT__TRG__pg_0_reference() {
	}
	
	public void initActor(InitActor m) {
		Map<String, ActorRef> name2actor = m.name2actor;
		ports = new LinkedList<>();
		ports.add(new PortEdge(getSelf(), name2actor.get("TypeParameter__CONSISTENCY_triangle_2_triangleJunction"), this::returnTrue));
	}	

	@Override
	public void preStart() throws Exception {
		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		super.postStop();
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(HiPEMessage.class, this::distributeMessage)
				.build();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void distributeMessage(HiPEMessage msg) {
		switch(msg.getType()) {
		case InitActor :
			initActor((InitActor)msg);
			return;
		case AttributeChanged :
			changeAttribute((AttributeChanged)msg);
			return;
		case NodeAddedLeft :
			leftAdded((NodeAddedLeft)msg);
			return;
		case NodeAddedRight :
			rightAdded((NodeAddedRight)msg);
			return;
		case NodeDeletedLeft :
			leftRemoved((NodeDeletedLeft)msg);
			return;
		case NodeDeletedRight :
			rightRemoved((NodeDeletedRight)msg);
			return;
		case ReferenceAdded :
			addReference((ReferenceAdded)msg);
			return;
		case ReferenceDeleted :
			removeReference((ReferenceDeleted)msg);
			return;
		default:
			break;
		}
	}

	private void addMatch(InputMessage message, ModiscoTGG.TypeParameter__Marker source, org.gravity.typegraph.basic.TypeGraph target) {
		EdgeMatch match = new EdgeMatch(source, target);
		if(!matches.add(match))
 			return;
 				
		for(Port<EdgeMatch> port : ports) {
			port.sendAdd(message, match);
		}
		
		Set<EdgeMatch> sourceMatches = sourceElements.get(source);
		if(sourceMatches == null) {
			sourceMatches = new HashSet<EdgeMatch>();
			sourceElements.put(source, sourceMatches);
		}
		
		Set<EdgeMatch> targetMatches = targetElements.get(target);
		if(targetMatches == null) {
			targetMatches = new HashSet<EdgeMatch>();
			targetElements.put(target, targetMatches);
		}
		
		sourceMatches.add(match);
		targetMatches.add(match);
		
	}
	
	private void addPendingMatch(Object source, Object target) {
		Set<ModiscoTGG.TypeParameter__Marker> sourcePending = pending.get(target);
		if(sourcePending == null) {
			sourcePending = new HashSet<ModiscoTGG.TypeParameter__Marker>();
			pending.put((org.gravity.typegraph.basic.TypeGraph) target, sourcePending);
		}
		sourcePending.add((ModiscoTGG.TypeParameter__Marker) source);
	}
	
	private void leftAdded(NodeAddedLeft<ModiscoTGG.TypeParameter__Marker> message) {
		if(sourceElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
			
		sourceElements.put(message.input, null);
		org.gravity.typegraph.basic.TypeGraph target = (org.gravity.typegraph.basic.TypeGraph) message.input.getCONTEXT__TRG__pg();
		if(targetElements.containsKey(target))
			addMatch(message.initialMessage, message.input, target);
		else
			addPendingMatch(message.input, target);
		message.initialMessage.decrement();
	}

	private void rightAdded(NodeAddedRight<org.gravity.typegraph.basic.TypeGraph> message) {
		if(targetElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
		
		targetElements.put(message.input, null);
		if(pending.containsKey(message.input)) {
			Set<ModiscoTGG.TypeParameter__Marker> pendingsSources = pending.get(message.input);
			for(ModiscoTGG.TypeParameter__Marker source : pendingsSources) {
				addMatch(message.initialMessage, source, message.input);
			}
			pending.remove(message.input);
		}
		message.initialMessage.decrement();
	}

	private void leftRemoved(NodeDeletedLeft<ModiscoTGG.TypeParameter__Marker> message) {
		Set<EdgeMatch> sourceMatches = sourceElements.get(message.input);
		if(sourceMatches == null) {
			message.initialMessage.decrement();
			return;
		}
		
		sourceElements.remove(message.input);
		matches.removeAll(sourceMatches);
		
		for(EdgeMatch match : sourceMatches) {
			Set<EdgeMatch> targetMatches = targetElements.get(match.target());
			if(!targetMatches.remove(match))
				continue;
			
			for(Port<EdgeMatch> port : ports) {
				port.sendRemove(message.initialMessage, match);
			}
			
			// remove waiting source from pending matches
			Set<ModiscoTGG.TypeParameter__Marker> sourcePending = pending.get(match.target());
			if(sourcePending == null) continue;
			sourcePending.remove(match.source());
		}
		message.initialMessage.decrement();
	}

	private void rightRemoved(NodeDeletedRight<org.gravity.typegraph.basic.TypeGraph> message) {
		Set<EdgeMatch> targetMatches = targetElements.get(message.input);
		if(targetMatches == null) {
			message.initialMessage.decrement();
			return;
		}
		
		targetElements.remove(message.input);
		matches.removeAll(targetMatches);
		
		for(EdgeMatch match : targetMatches) {
			Set<EdgeMatch> sourceMatches = sourceElements.get(match.source());
			if(!sourceMatches.remove(match))
				continue;
			
			for(Port<EdgeMatch> port : ports) {
				port.sendRemove(message.initialMessage, match);
			}	
							
			// restore pending matches, since target is gone
			addPendingMatch(match.source(), match.target());
		}
		message.initialMessage.decrement();
	}

	private void addReference(ReferenceAdded<ModiscoTGG.TypeParameter__Marker, org.gravity.typegraph.basic.TypeGraph> message) {
		if (sourceElements.containsKey(message.source)) {
			if (targetElements.containsKey(message.target)) {
				addMatch(message.initialMessage, message.source, message.target);
			}
			else {
				addPendingMatch(message.source, message.target);
			}
		}
		message.initialMessage.decrement();
	}
	
	private void removeReference(ReferenceDeleted<ModiscoTGG.TypeParameter__Marker, org.gravity.typegraph.basic.TypeGraph> message) {
		Set<ModiscoTGG.TypeParameter__Marker> pendingSources = pending.get(message.target);
		if(pendingSources != null) {
			pendingSources.remove(message.source);
		}
		
		EdgeMatch newMatch = new EdgeMatch(message.source, message.target);
		EdgeMatch match = matches.removeElement(newMatch);
		
		if(match == null) {
			message.initialMessage.decrement();
			return;
		}
		
		for(Port<EdgeMatch> port : ports) {
			port.sendRemove(message.initialMessage, match);
		}		
		
		Set<EdgeMatch> sourceMatches = sourceElements.get(message.source);
		Set<EdgeMatch> targetMatches = targetElements.get(message.target);
		
		if(sourceMatches != null) sourceMatches.remove(match);
		if(targetMatches != null) targetMatches.remove(match);

		message.initialMessage.decrement();
	}
	
	private void changeAttribute(AttributeChanged<?> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
						
		if(message.node instanceof ModiscoTGG.TypeParameter__Marker) {
			leftChanged(message);
		}
		else {
			rightChanged(message);
		}
		message.initialMessage.decrement();
	}
	
	private void leftChanged(AttributeChanged<?> message) {
		if(!sourceElements.containsKey(message.node)) {
			return;
		}
		
		Set<EdgeMatch> sourceMatches = sourceElements.get(message.node);
		if(sourceMatches == null) {
			return;
		}
		
		for(EdgeMatch match : sourceMatches) {
			for(Port<EdgeMatch> port : ports) {
				port.sendAttributeChanged(message, match);
			}
		}
	}
	
	private void rightChanged(AttributeChanged<?> message) {
		if(!targetElements.containsKey(message.node)) {
			return;
		}
		
		Set<EdgeMatch> targetMatches = targetElements.get(message.node);
		if(targetMatches == null) {
			return;
		}
		
		for(EdgeMatch match : targetMatches) {
			for(Port<EdgeMatch> port : ports) {
				port.sendAttributeChanged(message, match);
			}
		}
	}
	
	private boolean returnTrue(Object o) {
		return true;
	}
	

}

