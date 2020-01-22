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

public class TypeToTAbstractType_target_0_reference extends AbstractActor {

	private List<Port<EdgeMatch>> ports;

	private Map<ModiscoTGG.TypeToTAbstractType, Set<EdgeMatch>> sourceElements = new HashMap<ModiscoTGG.TypeToTAbstractType, Set<EdgeMatch>>();
	private Map<org.gravity.typegraph.basic.TAbstractType, Set<EdgeMatch>> targetElements = new HashMap<org.gravity.typegraph.basic.TAbstractType, Set<EdgeMatch>>();
	private HiPESet<EdgeMatch> matches = new HiPESet<>();
	
	private Map<org.gravity.typegraph.basic.TAbstractType, Set<ModiscoTGG.TypeToTAbstractType>> pending = new HashMap<>();

	private int finishedNodes = 0;
	
	public TypeToTAbstractType_target_0_reference() {
	}
	
	public void initActor(InitActor m) {
		Map<String, ActorRef> name2actor = m.name2actor;
		ports = new LinkedList<>();
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClassArray__BWD_243_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberValueClassArray__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClassArray__FWD_312_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClass__BWD_353_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationMemberValueClass__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClass__FWD_417_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationTypeNested__BWD_835_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationTypeNested__CONSISTENCY_triangle_6_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationTypeNested__FWD_915_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClass__BWD_1175_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnonymousClass__CONSISTENCY_triangle_6_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClass__FWD_1243_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ArrayTypeToClass__CONSISTENCY_triangle_4_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ArrayTypeToClass__CONSISTENCY_triangle_6_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ArrayTypeToClass__FWD_1314_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldAccessReadWrite__BWD_2281_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("FieldAccessReadWrite__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldAccessReadWrite__FWD_2375_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldAccessRead__BWD_2413_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("FieldAccessRead__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldAccessRead__FWD_2507_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldAccessWrite__BWD_2545_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("FieldAccessWrite__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldAccessWrite__FWD_2639_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldType__BWD_2816_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("FieldType__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldType__FWD_2856_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("LinkDefinitionToType__BWD_3377_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("LinkDefinitionToType__CONSISTENCY_triangle_6_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("LinkDefinitionToType__FWD_3444_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MethodInvocationStaticType__BWD_3820_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MethodInvocationStaticType__CONSISTENCY_triangle_2_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MethodInvocationStaticType__FWD_3860_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MethodParameterType__BWD_4164_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MethodParameterType__CONSISTENCY_triangle_5_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MethodParameterType__FWD_4226_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("NestedClassInType__BWD_4366_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("NestedClassInType__CONSISTENCY_triangle_7_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("NestedClassInType__FWD_4450_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("NestedEnum__BWD_4473_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("NestedEnum__CONSISTENCY_triangle_6_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("NestedEnum__FWD_4559_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("NestedInterfaceInType__BWD_4583_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("NestedInterfaceInType__CONSISTENCY_triangle_7_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("NestedInterfaceInType__FWD_4667_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ParameterizedTypeToClass__CONSISTENCY_triangle_3_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ParameterizedTypeToClass__CONSISTENCY_triangle_6_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ParameterizedTypeToClass__FWD_4836_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ReturnType__BWD_5386_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ReturnType__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ReturnType__FWD_5429_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("SignatureReturnType__BWD_5461_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("SignatureReturnType__CONSISTENCY_triangle_2_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("SignatureReturnType__FWD_5501_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("TypesVisibility__BWD_5984_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("TypesVisibility__CONSISTENCY_triangle_2_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("TypesVisibility__FWD_6018_junction"), this::returnTrue));
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

	private void addMatch(InputMessage message, ModiscoTGG.TypeToTAbstractType source, org.gravity.typegraph.basic.TAbstractType target) {
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
		Set<ModiscoTGG.TypeToTAbstractType> sourcePending = pending.get(target);
		if(sourcePending == null) {
			sourcePending = new HashSet<ModiscoTGG.TypeToTAbstractType>();
			pending.put((org.gravity.typegraph.basic.TAbstractType) target, sourcePending);
		}
		sourcePending.add((ModiscoTGG.TypeToTAbstractType) source);
	}
	
	private void leftAdded(NodeAddedLeft<ModiscoTGG.TypeToTAbstractType> message) {
		if(sourceElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
			
		sourceElements.put(message.input, null);
		org.gravity.typegraph.basic.TAbstractType target = (org.gravity.typegraph.basic.TAbstractType) message.input.getTarget();
		if(targetElements.containsKey(target))
			addMatch(message.initialMessage, message.input, target);
		else
			addPendingMatch(message.input, target);
		message.initialMessage.decrement();
	}

	private void rightAdded(NodeAddedRight<org.gravity.typegraph.basic.TAbstractType> message) {
		if(targetElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
		
		targetElements.put(message.input, null);
		if(pending.containsKey(message.input)) {
			Set<ModiscoTGG.TypeToTAbstractType> pendingsSources = pending.get(message.input);
			for(ModiscoTGG.TypeToTAbstractType source : pendingsSources) {
				addMatch(message.initialMessage, source, message.input);
			}
			pending.remove(message.input);
		}
		message.initialMessage.decrement();
	}

	private void leftRemoved(NodeDeletedLeft<ModiscoTGG.TypeToTAbstractType> message) {
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
			Set<ModiscoTGG.TypeToTAbstractType> sourcePending = pending.get(match.target());
			if(sourcePending == null) continue;
			sourcePending.remove(match.source());
		}
		message.initialMessage.decrement();
	}

	private void rightRemoved(NodeDeletedRight<org.gravity.typegraph.basic.TAbstractType> message) {
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

	private void addReference(ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> message) {
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
	
	private void removeReference(ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> message) {
		Set<ModiscoTGG.TypeToTAbstractType> pendingSources = pending.get(message.target);
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
						
		if(message.node instanceof ModiscoTGG.TypeToTAbstractType) {
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

