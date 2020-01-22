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

public class MDefinitionToTMember_target_0_reference extends AbstractActor {

	private List<Port<EdgeMatch>> ports;

	private Map<ModiscoTGG.MDefinitionToTMember, Set<EdgeMatch>> sourceElements = new HashMap<ModiscoTGG.MDefinitionToTMember, Set<EdgeMatch>>();
	private Map<org.gravity.typegraph.basic.TMember, Set<EdgeMatch>> targetElements = new HashMap<org.gravity.typegraph.basic.TMember, Set<EdgeMatch>>();
	private HiPESet<EdgeMatch> matches = new HiPESet<>();
	
	private Map<org.gravity.typegraph.basic.TMember, Set<ModiscoTGG.MDefinitionToTMember>> pending = new HashMap<>();

	private int finishedNodes = 0;
	
	public MDefinitionToTMember_target_0_reference() {
	}
	
	public void initActor(InitActor m) {
		Map<String, ActorRef> name2actor = m.name2actor;
		ports = new LinkedList<>();
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassInstanceCreation__BWD_1809_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassInstanceCreation__BWD_1813_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ClassInstanceCreation__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ClassInstanceCreation__CONSISTENCY_triangle_4_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassInstanceCreation__FWD_1872_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassInstanceCreation__FWD_1876_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ConstructorInvocation__BWD_2029_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ConstructorInvocation__BWD_2033_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ConstructorInvocation__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ConstructorInvocation__CONSISTENCY_triangle_4_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ConstructorInvocation__FWD_2092_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ConstructorInvocation__FWD_2096_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldAccessReadWrite__BWD_2280_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("FieldAccessReadWrite__CONSISTENCY_triangle_8_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldAccessReadWrite__FWD_2365_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldAccessRead__BWD_2412_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("FieldAccessRead__CONSISTENCY_triangle_8_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldAccessRead__FWD_2497_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldAccessWrite__BWD_2544_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("FieldAccessWrite__CONSISTENCY_triangle_8_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("FieldAccessWrite__FWD_2629_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("InterfaceMember__BWD_3124_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("InterfaceMember__CONSISTENCY_triangle_5_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("InterfaceMember__FWD_3182_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("LinkDefinitionToAnonymous__BWD_3292_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("LinkDefinitionToAnonymous__CONSISTENCY_triangle_5_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("LinkDefinitionToAnonymous__FWD_3360_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("LinkDefinitionToType__BWD_3385_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("LinkDefinitionToType__CONSISTENCY_triangle_5_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("LinkDefinitionToType__FWD_3453_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MemberInAnnotationVisibility__BWD_3469_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MemberInAnnotationVisibility__CONSISTENCY_triangle_5_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MemberInAnnotationVisibility__FWD_3528_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MemberInClassVisibility__BWD_3550_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MemberInClassVisibility__CONSISTENCY_triangle_5_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MemberInClassVisibility__FWD_3608_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MemberInEnumVisibility__BWD_3631_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MemberInEnumVisibility__CONSISTENCY_triangle_5_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MemberInEnumVisibility__FWD_3689_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MethodInvocation__BWD_3875_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MethodInvocation__BWD_3879_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MethodInvocation__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MethodInvocation__CONSISTENCY_triangle_4_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MethodInvocation__FWD_3938_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("MethodInvocation__FWD_3942_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("SuperConstructorInvocation__BWD_5577_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("SuperConstructorInvocation__BWD_5581_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("SuperConstructorInvocation__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("SuperConstructorInvocation__CONSISTENCY_triangle_4_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("SuperConstructorInvocation__FWD_5640_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("SuperConstructorInvocation__FWD_5644_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("SuperMethodInvocation__BWD_5658_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("SuperMethodInvocation__BWD_5662_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("SuperMethodInvocation__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("SuperMethodInvocation__CONSISTENCY_triangle_4_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("SuperMethodInvocation__FWD_5721_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("SuperMethodInvocation__FWD_5725_junction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("TextAnnotations__BWD_5839_junction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("TextAnnotations__CONSISTENCY_triangle_2_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("TextAnnotations__FWD_5873_junction"), this::returnTrue));
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

	private void addMatch(InputMessage message, ModiscoTGG.MDefinitionToTMember source, org.gravity.typegraph.basic.TMember target) {
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
		Set<ModiscoTGG.MDefinitionToTMember> sourcePending = pending.get(target);
		if(sourcePending == null) {
			sourcePending = new HashSet<ModiscoTGG.MDefinitionToTMember>();
			pending.put((org.gravity.typegraph.basic.TMember) target, sourcePending);
		}
		sourcePending.add((ModiscoTGG.MDefinitionToTMember) source);
	}
	
	private void leftAdded(NodeAddedLeft<ModiscoTGG.MDefinitionToTMember> message) {
		if(sourceElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
			
		sourceElements.put(message.input, null);
		org.gravity.typegraph.basic.TMember target = (org.gravity.typegraph.basic.TMember) message.input.getTarget();
		if(targetElements.containsKey(target))
			addMatch(message.initialMessage, message.input, target);
		else
			addPendingMatch(message.input, target);
		message.initialMessage.decrement();
	}

	private void rightAdded(NodeAddedRight<org.gravity.typegraph.basic.TMember> message) {
		if(targetElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
		
		targetElements.put(message.input, null);
		if(pending.containsKey(message.input)) {
			Set<ModiscoTGG.MDefinitionToTMember> pendingsSources = pending.get(message.input);
			for(ModiscoTGG.MDefinitionToTMember source : pendingsSources) {
				addMatch(message.initialMessage, source, message.input);
			}
			pending.remove(message.input);
		}
		message.initialMessage.decrement();
	}

	private void leftRemoved(NodeDeletedLeft<ModiscoTGG.MDefinitionToTMember> message) {
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
			Set<ModiscoTGG.MDefinitionToTMember> sourcePending = pending.get(match.target());
			if(sourcePending == null) continue;
			sourcePending.remove(match.source());
		}
		message.initialMessage.decrement();
	}

	private void rightRemoved(NodeDeletedRight<org.gravity.typegraph.basic.TMember> message) {
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

	private void addReference(ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember> message) {
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
	
	private void removeReference(ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember> message) {
		Set<ModiscoTGG.MDefinitionToTMember> pendingSources = pending.get(message.target);
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
						
		if(message.node instanceof ModiscoTGG.MDefinitionToTMember) {
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

