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

public class AbstractTypeDeclaration_superInterfaces_0_reference extends AbstractActor {

	private List<Port<EdgeMatch>> ports;

	private Map<org.eclipse.modisco.java.AbstractTypeDeclaration, Set<EdgeMatch>> sourceElements = new HashMap<org.eclipse.modisco.java.AbstractTypeDeclaration, Set<EdgeMatch>>();
	private Map<org.eclipse.modisco.java.TypeAccess, Set<EdgeMatch>> targetElements = new HashMap<org.eclipse.modisco.java.TypeAccess, Set<EdgeMatch>>();
	private HiPESet<EdgeMatch> matches = new HiPESet<>();
	
	private Map<org.eclipse.modisco.java.TypeAccess, Set<org.eclipse.modisco.java.AbstractTypeDeclaration>> pending = new HashMap<>();

	private int finishedNodes = 0;
	
	public AbstractTypeDeclaration_superInterfaces_0_reference() {
	}
	
	public void initActor(InitActor m) {
		Map<String, ActorRef> name2actor = m.name2actor;
		ports = new LinkedList<>();
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClassArray__CC_5205_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClassArray__CONSISTENCY_5213_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("AnnotationMemberValueClassArray_mAccess_superInterfaces_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClass__CC_5221_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationMemberValueClass__CONSISTENCY_5229_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("AnnotationMemberValueClass_mAccess_superInterfaces_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationTypeAccess__CC_5237_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnnotationTypeAccess__CONSISTENCY_5245_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("AnnotationTypeAccess_mAccess_superInterfaces_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeClass__CC_5255_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeClass__CONSISTENCY_5263_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("AnonymousClassTypeClass_mType_superInterfaces_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeInterface__CC_5271_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClassTypeInterface__CONSISTENCY_5279_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("AnonymousClassTypeInterface_mType_superInterfaces_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ArrayTypeToClass__CC_5295_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ArrayTypeToClass__CONSISTENCY_5303_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("ArrayTypeToClass_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassExtendsClass__CC_5311_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassExtendsClass__CONSISTENCY_5319_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("ClassExtendsClass_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ParameterizedTypeToClass__CC_5439_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ParameterizedTypeToClass__CONSISTENCY_5447_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("ParameterizedTypeToClass_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ReturnType__CC_5491_nacjunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ReturnType__CONSISTENCY_5499_nacjunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("ReturnType_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC_production"), this::returnTrue));
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

	private void addMatch(InputMessage message, org.eclipse.modisco.java.AbstractTypeDeclaration source, org.eclipse.modisco.java.TypeAccess target) {
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
		Set<org.eclipse.modisco.java.AbstractTypeDeclaration> sourcePending = pending.get(target);
		if(sourcePending == null) {
			sourcePending = new HashSet<org.eclipse.modisco.java.AbstractTypeDeclaration>();
			pending.put((org.eclipse.modisco.java.TypeAccess) target, sourcePending);
		}
		sourcePending.add((org.eclipse.modisco.java.AbstractTypeDeclaration) source);
	}
	
	private void leftAdded(NodeAddedLeft<org.eclipse.modisco.java.AbstractTypeDeclaration> message) {
		if(sourceElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
			
		sourceElements.put(message.input, null);
		for(org.eclipse.modisco.java.TypeAccess target : message.input.getSuperInterfaces()) {
			if(targetElements.containsKey(target))
				addMatch(message.initialMessage, message.input, target);
			else
				addPendingMatch(message.input, target);
		}
		message.initialMessage.decrement();
	}

	private void rightAdded(NodeAddedRight<org.eclipse.modisco.java.TypeAccess> message) {
		if(targetElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
		
		targetElements.put(message.input, null);
		if(pending.containsKey(message.input)) {
			Set<org.eclipse.modisco.java.AbstractTypeDeclaration> pendingsSources = pending.get(message.input);
			for(org.eclipse.modisco.java.AbstractTypeDeclaration source : pendingsSources) {
				addMatch(message.initialMessage, source, message.input);
			}
			pending.remove(message.input);
		}
		message.initialMessage.decrement();
	}

	private void leftRemoved(NodeDeletedLeft<org.eclipse.modisco.java.AbstractTypeDeclaration> message) {
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
			Set<org.eclipse.modisco.java.AbstractTypeDeclaration> sourcePending = pending.get(match.target());
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

	private void addReference(ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.TypeAccess> message) {
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
	
	private void removeReference(ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.TypeAccess> message) {
		Set<org.eclipse.modisco.java.AbstractTypeDeclaration> pendingSources = pending.get(message.target);
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
						
		if(message.node instanceof org.eclipse.modisco.java.AbstractTypeDeclaration) {
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
