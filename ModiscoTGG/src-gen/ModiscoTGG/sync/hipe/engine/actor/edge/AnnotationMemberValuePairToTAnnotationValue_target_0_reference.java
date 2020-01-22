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

public class AnnotationMemberValuePairToTAnnotationValue_target_0_reference extends AbstractActor {

	private List<Port<EdgeMatch>> ports;

	private Map<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, Set<EdgeMatch>> sourceElements = new HashMap<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, Set<EdgeMatch>>();
	private Map<org.gravity.typegraph.basic.annotations.TAnnotationValue, Set<EdgeMatch>> targetElements = new HashMap<org.gravity.typegraph.basic.annotations.TAnnotationValue, Set<EdgeMatch>>();
	private HiPESet<EdgeMatch> matches = new HiPESet<>();
	
	private Map<org.gravity.typegraph.basic.annotations.TAnnotationValue, Set<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue>> pending = new HashMap<>();

	private int finishedNodes = 0;
	
	public AnnotationMemberValuePairToTAnnotationValue_target_0_reference() {
	}
	
	public void initActor(InitActor m) {
		Map<String, ActorRef> name2actor = m.name2actor;
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberKey__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueAnnotationArray__BWD_46_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberValueAnnotationArray__CONSISTENCY_triangle_4_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueAnnotationArray__FWD_83_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueAnnotation__BWD_102_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberValueAnnotation__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueAnnotation__FWD_136_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueBooleanArray__BWD_151_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberValueBooleanArray__CONSISTENCY_triangle_4_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueBooleanArray__FWD_188_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueBoolean__BWD_201_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberValueBoolean__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueBoolean__FWD_235_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClassArray__BWD_247_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberValueClassArray__CONSISTENCY_triangle_8_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClassArray__FWD_310_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClass__BWD_357_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberValueClass__CONSISTENCY_triangle_5_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClass__FWD_418_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueNumberArray__BWD_457_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberValueNumberArray__CONSISTENCY_triangle_4_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueNumberArray__FWD_494_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueNumber__BWD_507_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberValueNumber__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueNumber__FWD_541_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueStringArray__BWD_550_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberValueStringArray__CONSISTENCY_triangle_4_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueStringArray__FWD_587_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueString__BWD_600_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberValueString__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueString__FWD_634_junction"), this::returnTrue));
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

	private void addMatch(InputMessage message, ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue source, org.gravity.typegraph.basic.annotations.TAnnotationValue target) {
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
		Set<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue> sourcePending = pending.get(target);
		if(sourcePending == null) {
			sourcePending = new HashSet<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue>();
			pending.put((org.gravity.typegraph.basic.annotations.TAnnotationValue) target, sourcePending);
		}
		sourcePending.add((ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue) source);
	}
	
	private void leftAdded(NodeAddedLeft<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue> message) {
		if(sourceElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
			
		sourceElements.put(message.input, null);
		org.gravity.typegraph.basic.annotations.TAnnotationValue target = (org.gravity.typegraph.basic.annotations.TAnnotationValue) message.input.getTarget();
		if(targetElements.containsKey(target))
			addMatch(message.initialMessage, message.input, target);
		else
			addPendingMatch(message.input, target);
		message.initialMessage.decrement();
	}

	private void rightAdded(NodeAddedRight<org.gravity.typegraph.basic.annotations.TAnnotationValue> message) {
		if(targetElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
		
		targetElements.put(message.input, null);
		if(pending.containsKey(message.input)) {
			Set<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue> pendingsSources = pending.get(message.input);
			for(ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue source : pendingsSources) {
				addMatch(message.initialMessage, source, message.input);
			}
			pending.remove(message.input);
		}
		message.initialMessage.decrement();
	}

	private void leftRemoved(NodeDeletedLeft<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue> message) {
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
			Set<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue> sourcePending = pending.get(match.target());
			if(sourcePending == null) continue;
			sourcePending.remove(match.source());
		}
		message.initialMessage.decrement();
	}

	private void rightRemoved(NodeDeletedRight<org.gravity.typegraph.basic.annotations.TAnnotationValue> message) {
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

	private void addReference(ReferenceAdded<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, org.gravity.typegraph.basic.annotations.TAnnotationValue> message) {
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
	
	private void removeReference(ReferenceDeleted<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, org.gravity.typegraph.basic.annotations.TAnnotationValue> message) {
		Set<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue> pendingSources = pending.get(message.target);
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
						
		if(message.node instanceof ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue) {
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

