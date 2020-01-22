package ModiscoTGG.co.hipe.engine.actor.edge;

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

public class TPackage_classes_0_reference extends AbstractActor {

	private List<Port<EdgeMatch>> ports;

	private Map<org.gravity.typegraph.basic.TPackage, Set<EdgeMatch>> sourceElements = new HashMap<org.gravity.typegraph.basic.TPackage, Set<EdgeMatch>>();
	private Map<org.gravity.typegraph.basic.TClass, Set<EdgeMatch>> targetElements = new HashMap<org.gravity.typegraph.basic.TClass, Set<EdgeMatch>>();
	private HiPESet<EdgeMatch> matches = new HiPESet<>();
	
	private Map<org.gravity.typegraph.basic.TClass, Set<org.gravity.typegraph.basic.TPackage>> pending = new HashMap<>();

	private int finishedNodes = 0;
	
	public TPackage_classes_0_reference() {
	}
	
	public void initActor(InitActor m) {
		Map<String, ActorRef> name2actor = m.name2actor;
		ports = new LinkedList<>();
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClass__CO_2720_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClass__CO_2721_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("AnonymousClass_tAnonymous_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassInAnonymous__CO_2748_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassInAnonymous__CO_2749_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("ClassInAnonymous_tNestedType_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassInnerAnonClassMember__CO_741_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ClassInnerAnonClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_770_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassInnerAnonClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_770_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassInnerClassMember__CO_794_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ClassInnerClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_823_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassInnerClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_823_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("Class__CO_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("Class_tType_classes_incoming_TRG__FILTER_NAC_902_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("Class_tType_classes_incoming_TRG__FILTER_NAC_902_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("EnumInAnonymous__CO_2760_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("EnumInAnonymous__CO_2761_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("EnumInAnonymous_tNestedType_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("Enum__CO_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("Enum_tType_classes_incoming_TRG__FILTER_NAC_1038_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("Enum_tType_classes_incoming_TRG__FILTER_NAC_1038_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("NestedClassInType__CO_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("NestedClassInType_tNestedType_classes_incoming_TRG__FILTER_NAC_1924_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("NestedClassInType_tNestedType_classes_incoming_TRG__FILTER_NAC_1924_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("NestedEnum__CO_triangle_0_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("NestedEnum_tNestedType_classes_incoming_TRG__FILTER_NAC_1975_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("NestedEnum_tNestedType_classes_incoming_TRG__FILTER_NAC_1975_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsBoolean__CO_2804_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsBoolean__CO_2805_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("PrimitiveTypeIsBoolean_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsByte__CO_2806_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsByte__CO_2807_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("PrimitiveTypeIsByte_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsChar__CO_2808_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsChar__CO_2809_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("PrimitiveTypeIsChar_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsDouble__CO_2810_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsDouble__CO_2811_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("PrimitiveTypeIsDouble_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsFloat__CO_2812_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsFloat__CO_2813_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("PrimitiveTypeIsFloat_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsInt__CO_2814_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsInt__CO_2815_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("PrimitiveTypeIsInt_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsLong__CO_2816_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsLong__CO_2817_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("PrimitiveTypeIsLong_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsShort__CO_2818_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypeIsShort__CO_2819_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("PrimitiveTypeIsShort_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypesIsVoid__CO_2820_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PrimitiveTypesIsVoid__CO_2821_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("PrimitiveTypesIsVoid_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("TypeParameter__CO_2834_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("TypeParameter__CO_2835_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("TypeParameter_tClass_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("TypesOrphaned__CO_2836_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("TypesOrphaned__CO_2837_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("TypesOrphaned_tType_classes_incoming_TRG__FILTER_NAC_production"), this::returnTrue));
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

	private void addMatch(InputMessage message, org.gravity.typegraph.basic.TPackage source, org.gravity.typegraph.basic.TClass target) {
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
		Set<org.gravity.typegraph.basic.TPackage> sourcePending = pending.get(target);
		if(sourcePending == null) {
			sourcePending = new HashSet<org.gravity.typegraph.basic.TPackage>();
			pending.put((org.gravity.typegraph.basic.TClass) target, sourcePending);
		}
		sourcePending.add((org.gravity.typegraph.basic.TPackage) source);
	}
	
	private void leftAdded(NodeAddedLeft<org.gravity.typegraph.basic.TPackage> message) {
		if(sourceElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
			
		sourceElements.put(message.input, null);
		for(org.gravity.typegraph.basic.TClass target : message.input.getClasses()) {
			if(targetElements.containsKey(target))
				addMatch(message.initialMessage, message.input, target);
			else
				addPendingMatch(message.input, target);
		}
		message.initialMessage.decrement();
	}

	private void rightAdded(NodeAddedRight<org.gravity.typegraph.basic.TClass> message) {
		if(targetElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
		
		targetElements.put(message.input, null);
		if(pending.containsKey(message.input)) {
			Set<org.gravity.typegraph.basic.TPackage> pendingsSources = pending.get(message.input);
			for(org.gravity.typegraph.basic.TPackage source : pendingsSources) {
				addMatch(message.initialMessage, source, message.input);
			}
			pending.remove(message.input);
		}
		message.initialMessage.decrement();
	}

	private void leftRemoved(NodeDeletedLeft<org.gravity.typegraph.basic.TPackage> message) {
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
			Set<org.gravity.typegraph.basic.TPackage> sourcePending = pending.get(match.target());
			if(sourcePending == null) continue;
			sourcePending.remove(match.source());
		}
		message.initialMessage.decrement();
	}

	private void rightRemoved(NodeDeletedRight<org.gravity.typegraph.basic.TClass> message) {
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

	private void addReference(ReferenceAdded<org.gravity.typegraph.basic.TPackage, org.gravity.typegraph.basic.TClass> message) {
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
	
	private void removeReference(ReferenceDeleted<org.gravity.typegraph.basic.TPackage, org.gravity.typegraph.basic.TClass> message) {
		Set<org.gravity.typegraph.basic.TPackage> pendingSources = pending.get(message.target);
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
						
		if(message.node instanceof org.gravity.typegraph.basic.TPackage) {
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

