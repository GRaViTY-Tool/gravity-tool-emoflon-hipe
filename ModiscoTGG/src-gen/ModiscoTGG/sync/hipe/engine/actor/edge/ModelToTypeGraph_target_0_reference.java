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

public class ModelToTypeGraph_target_0_reference extends AbstractActor {

	private List<Port<EdgeMatch>> ports;

	private Map<ModiscoTGG.ModelToTypeGraph, Set<EdgeMatch>> sourceElements = new HashMap<ModiscoTGG.ModelToTypeGraph, Set<EdgeMatch>>();
	private Map<org.gravity.typegraph.basic.TypeGraph, Set<EdgeMatch>> targetElements = new HashMap<org.gravity.typegraph.basic.TypeGraph, Set<EdgeMatch>>();
	private HiPESet<EdgeMatch> matches = new HiPESet<>();
	
	private Map<org.gravity.typegraph.basic.TypeGraph, Set<ModiscoTGG.ModelToTypeGraph>> pending = new HashMap<>();

	private int finishedNodes = 0;
	
	public ModelToTypeGraph_target_0_reference() {
	}
	
	public void initActor(InitActor m) {
		Map<String, ActorRef> name2actor = m.name2actor;
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ArrayTypeToClass__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ArrayTypeToClass__FWD_1324_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldName__BWD_2720_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("FieldName__CONSISTENCY_triangle_2_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldName__FWD_2754_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MethodName__BWD_3957_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MethodName__CONSISTENCY_triangle_2_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MethodName__FWD_3991_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ModelToPg__CONSISTENCY_triangle_0_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PackageToPGPackage__BWD_4741_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("PackageToPGPackage__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PackageToPGPackage__FWD_4780_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ParameterizedTypeToClass__CONSISTENCY_triangle_2_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ParameterizedTypeToClass__FWD_4846_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsBoolean__BWD_4877_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("PrimitiveTypeIsBoolean__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsBoolean__FWD_4922_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsByte__BWD_4933_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("PrimitiveTypeIsByte__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsByte__FWD_4978_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsChar__BWD_4989_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("PrimitiveTypeIsChar__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsChar__FWD_5034_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsDouble__BWD_5045_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("PrimitiveTypeIsDouble__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsDouble__FWD_5090_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsFloat__BWD_5101_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("PrimitiveTypeIsFloat__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsFloat__FWD_5146_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsInt__BWD_5157_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("PrimitiveTypeIsInt__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsInt__FWD_5202_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsLong__BWD_5213_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("PrimitiveTypeIsLong__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsLong__FWD_5258_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsShort__BWD_5269_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("PrimitiveTypeIsShort__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsShort__FWD_5314_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypesIsVoid__BWD_5325_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("PrimitiveTypesIsVoid__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypesIsVoid__FWD_5370_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("TypeParameter__BWD_5881_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("TypeParameter__CONSISTENCY_triangle_2_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("TypeParameter__FWD_5920_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("TypesOrphaned__BWD_5932_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("TypesOrphaned__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("TypesOrphaned__FWD_5972_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("UnresolvedTypeDeclaration__BWD_6030_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("UnresolvedTypeDeclaration__CONSISTENCY_triangle_2_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("UnresolvedTypeDeclaration__FWD_6064_junction"), this::returnTrue));
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

	private void addMatch(InputMessage message, ModiscoTGG.ModelToTypeGraph source, org.gravity.typegraph.basic.TypeGraph target) {
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
		Set<ModiscoTGG.ModelToTypeGraph> sourcePending = pending.get(target);
		if(sourcePending == null) {
			sourcePending = new HashSet<ModiscoTGG.ModelToTypeGraph>();
			pending.put((org.gravity.typegraph.basic.TypeGraph) target, sourcePending);
		}
		sourcePending.add((ModiscoTGG.ModelToTypeGraph) source);
	}
	
	private void leftAdded(NodeAddedLeft<ModiscoTGG.ModelToTypeGraph> message) {
		if(sourceElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
			
		sourceElements.put(message.input, null);
		org.gravity.typegraph.basic.TypeGraph target = (org.gravity.typegraph.basic.TypeGraph) message.input.getTarget();
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
			Set<ModiscoTGG.ModelToTypeGraph> pendingsSources = pending.get(message.input);
			for(ModiscoTGG.ModelToTypeGraph source : pendingsSources) {
				addMatch(message.initialMessage, source, message.input);
			}
			pending.remove(message.input);
		}
		message.initialMessage.decrement();
	}

	private void leftRemoved(NodeDeletedLeft<ModiscoTGG.ModelToTypeGraph> message) {
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
			Set<ModiscoTGG.ModelToTypeGraph> sourcePending = pending.get(match.target());
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

	private void addReference(ReferenceAdded<ModiscoTGG.ModelToTypeGraph, org.gravity.typegraph.basic.TypeGraph> message) {
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
	
	private void removeReference(ReferenceDeleted<ModiscoTGG.ModelToTypeGraph, org.gravity.typegraph.basic.TypeGraph> message) {
		Set<ModiscoTGG.ModelToTypeGraph> pendingSources = pending.get(message.target);
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
						
		if(message.node instanceof ModiscoTGG.ModelToTypeGraph) {
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

