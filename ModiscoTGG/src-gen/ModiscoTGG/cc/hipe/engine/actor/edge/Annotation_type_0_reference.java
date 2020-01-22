package ModiscoTGG.cc.hipe.engine.actor.edge;

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

public class Annotation_type_0_reference extends AbstractActor {

	private List<Port<EdgeMatch>> ports;

	private Map<org.eclipse.modisco.java.Annotation, Set<EdgeMatch>> sourceElements = new HashMap<org.eclipse.modisco.java.Annotation, Set<EdgeMatch>>();
	private Map<org.eclipse.modisco.java.TypeAccess, Set<EdgeMatch>> targetElements = new HashMap<org.eclipse.modisco.java.TypeAccess, Set<EdgeMatch>>();
	private HiPESet<EdgeMatch> matches = new HiPESet<>();
	
	private Map<org.eclipse.modisco.java.TypeAccess, Set<org.eclipse.modisco.java.Annotation>> pending = new HashMap<>();

	private int finishedNodes = 0;
	
	public Annotation_type_0_reference() {
	}
	
	public void initActor(InitActor m) {
		Map<String, ActorRef> name2actor = m.name2actor;
		ports = new LinkedList<>();
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClassArray__CC_5206_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClassArray__CC_5208_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClassArray__CC_5211_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClassArray__CONSISTENCY_5214_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClassArray__CONSISTENCY_5216_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClassArray__CONSISTENCY_5219_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("AnnotationMemberValueClassArray_mAccess_type_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClass__CC_5222_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClass__CC_5224_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClass__CC_5227_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClass__CONSISTENCY_5230_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClass__CONSISTENCY_5232_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClass__CONSISTENCY_5235_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("AnnotationMemberValueClass_mAccess_type_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationTypeAccess__CC_604_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationTypeAccess__CONSISTENCY_triangle_2_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeClass__CC_5256_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeClass__CC_5260_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeClass__CC_5262_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeClass__CONSISTENCY_5264_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeClass__CONSISTENCY_5268_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeClass__CONSISTENCY_5270_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("AnonymousClassTypeClass_mType_type_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeInterface__CC_5272_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeInterface__CC_5276_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeInterface__CC_5278_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeInterface__CONSISTENCY_5280_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeInterface__CONSISTENCY_5284_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeInterface__CONSISTENCY_5286_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("AnonymousClassTypeInterface_mType_type_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ArrayTypeToClass__CC_5296_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ArrayTypeToClass__CC_5297_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ArrayTypeToClass__CC_5300_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ArrayTypeToClass__CC_5302_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ArrayTypeToClass__CONSISTENCY_5304_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ArrayTypeToClass__CONSISTENCY_5305_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ArrayTypeToClass__CONSISTENCY_5308_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ArrayTypeToClass__CONSISTENCY_5310_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("ArrayTypeToClass_eTypeAccess_type_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassExtendsClass__CC_5312_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassExtendsClass__CC_5314_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassExtendsClass__CC_5316_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassExtendsClass__CC_5318_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassExtendsClass__CONSISTENCY_5320_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassExtendsClass__CONSISTENCY_5322_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassExtendsClass__CONSISTENCY_5324_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassExtendsClass__CONSISTENCY_5326_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("ClassExtendsClass_eTypeAccess_type_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassImplementsInterface__CC_5327_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassImplementsInterface__CC_5329_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassImplementsInterface__CC_5332_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassImplementsInterface__CC_5334_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassImplementsInterface__CONSISTENCY_5335_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassImplementsInterface__CONSISTENCY_5337_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassImplementsInterface__CONSISTENCY_5340_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassImplementsInterface__CONSISTENCY_5342_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("ClassImplementsInterface_eTypeAccess_type_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("InterfaceExtendsInterface__CC_5381_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("InterfaceExtendsInterface__CC_5383_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("InterfaceExtendsInterface__CC_5386_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("InterfaceExtendsInterface__CC_5388_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("InterfaceExtendsInterface__CONSISTENCY_5389_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("InterfaceExtendsInterface__CONSISTENCY_5391_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("InterfaceExtendsInterface__CONSISTENCY_5394_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("InterfaceExtendsInterface__CONSISTENCY_5396_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("InterfaceExtendsInterface_eTypeAccess_type_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ParameterizedTypeToClass__CC_5440_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ParameterizedTypeToClass__CC_5442_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ParameterizedTypeToClass__CC_5446_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ParameterizedTypeToClass__CONSISTENCY_5448_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ParameterizedTypeToClass__CONSISTENCY_5450_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ParameterizedTypeToClass__CONSISTENCY_5454_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("ParameterizedTypeToClass_eTypeAccess_type_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ReturnType__CC_5492_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ReturnType__CC_5494_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ReturnType__CC_5496_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ReturnType__CC_5498_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ReturnType__CONSISTENCY_5500_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ReturnType__CONSISTENCY_5502_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ReturnType__CONSISTENCY_5504_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ReturnType__CONSISTENCY_5506_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("ReturnType_eTypeAccess_type_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
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

	private void addMatch(InputMessage message, org.eclipse.modisco.java.Annotation source, org.eclipse.modisco.java.TypeAccess target) {
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
		Set<org.eclipse.modisco.java.Annotation> sourcePending = pending.get(target);
		if(sourcePending == null) {
			sourcePending = new HashSet<org.eclipse.modisco.java.Annotation>();
			pending.put((org.eclipse.modisco.java.TypeAccess) target, sourcePending);
		}
		sourcePending.add((org.eclipse.modisco.java.Annotation) source);
	}
	
	private void leftAdded(NodeAddedLeft<org.eclipse.modisco.java.Annotation> message) {
		if(sourceElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
			
		sourceElements.put(message.input, null);
		org.eclipse.modisco.java.TypeAccess target = (org.eclipse.modisco.java.TypeAccess) message.input.getType();
		if(targetElements.containsKey(target))
			addMatch(message.initialMessage, message.input, target);
		else
			addPendingMatch(message.input, target);
		message.initialMessage.decrement();
	}

	private void rightAdded(NodeAddedRight<org.eclipse.modisco.java.TypeAccess> message) {
		if(targetElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
		
		targetElements.put(message.input, null);
		if(pending.containsKey(message.input)) {
			Set<org.eclipse.modisco.java.Annotation> pendingsSources = pending.get(message.input);
			for(org.eclipse.modisco.java.Annotation source : pendingsSources) {
				addMatch(message.initialMessage, source, message.input);
			}
			pending.remove(message.input);
		}
		message.initialMessage.decrement();
	}

	private void leftRemoved(NodeDeletedLeft<org.eclipse.modisco.java.Annotation> message) {
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
			Set<org.eclipse.modisco.java.Annotation> sourcePending = pending.get(match.target());
			if(sourcePending == null) continue;
			sourcePending.remove(match.source());
		}
		message.initialMessage.decrement();
	}

	private void rightRemoved(NodeDeletedRight<org.eclipse.modisco.java.TypeAccess> message) {
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

	private void addReference(ReferenceAdded<org.eclipse.modisco.java.Annotation, org.eclipse.modisco.java.TypeAccess> message) {
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
	
	private void removeReference(ReferenceDeleted<org.eclipse.modisco.java.Annotation, org.eclipse.modisco.java.TypeAccess> message) {
		Set<org.eclipse.modisco.java.Annotation> pendingSources = pending.get(message.target);
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
						
		if(message.node instanceof org.eclipse.modisco.java.Annotation) {
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

