package ModiscoTGG.sync.hipe.engine.actor.node;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.actor.node.PortNode;
import hipe.engine.actor.node.PortNodeLeft;
import hipe.engine.actor.node.PortNodeRight;
import hipe.engine.actor.node.PortNodeMatch;
import hipe.engine.actor.node.PortNodeMatchLeft;
import hipe.engine.actor.node.PortNodeMatchRight;

import hipe.engine.message.HiPEMessage;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;
import hipe.engine.message.InitActor;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NewInput;
import hipe.engine.message.input.ObjectAdded;
import hipe.engine.message.input.ObjectDeleted;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.node.NodeAddedLeft;
import hipe.engine.message.node.NodeDeletedLeft;
import hipe.engine.message.node.NodeAddedRight;
import hipe.engine.message.node.NodeDeletedRight;
import hipe.engine.message.junction.MatchAddedLeft;
import hipe.engine.message.junction.MatchAddedRight;
import hipe.engine.message.junction.MatchDeletedLeft;
import hipe.engine.message.junction.MatchDeletedRight;
		
public class TNumberNode_object extends AbstractActor {
	
	private List<Port<org.gravity.typegraph.basic.annotations.TNumberNode>> ports;		
		
	public TNumberNode_object() {
	}

	public void initActor(InitActor m) {
		Map<String, ActorRef> name2actor = m.name2actor;
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.annotations.TNumberNode>(getSelf(), name2actor.get("AnnotationMemberValueNumberArray__Marker_CREATE__TRG__tValue_0_reference"), this::returnTrue));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.annotations.TNumberNode>(getSelf(), name2actor.get("AnnotationMemberValueNumber__Marker_CREATE__TRG__tValue_0_reference"), this::returnTrue));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.annotations.TNumberNode>(getSelf(), name2actor.get("NumberLiteralToTNumberNode_target_0_reference"), this::returnTrue));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.annotations.TNumberNode>(getSelf(), name2actor.get("TAnnotationValue_tValue_3_reference"), this::returnTrue));
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
		case ObjectAdded :
			addNode((ObjectAdded)msg);
			return;
		case ObjectDeleted :
			removeNode((ObjectDeleted)msg);
			return;
		case ReferenceAdded :
			addEdge((ReferenceAdded)msg);
			return;
		case ReferenceDeleted :
			removeEdge((ReferenceDeleted)msg);
			return;
		default:
			break;
		}
	}
	
	private void addEdge(ReferenceAdded message) {
		message.edgeActor.tell(message, getSelf());
	}
	
	private void removeEdge(ReferenceDeleted message) {
		message.edgeActor.tell(message, getSelf());
	}
	
	private void addNode(ObjectAdded<org.gravity.typegraph.basic.annotations.TNumberNode> message) {
		for(Port<org.gravity.typegraph.basic.annotations.TNumberNode> port : ports) {
			port.sendAdd(message, message.node);
		}
		message.initialMessage.decrement();
	}
	
	private void removeNode(ObjectDeleted<org.gravity.typegraph.basic.annotations.TNumberNode> message) {
		for(Port<org.gravity.typegraph.basic.annotations.TNumberNode> port : ports) {
			port.sendRemove(message, message.node);
		}		
		message.initialMessage.decrement();
	}
	
	private void changeAttribute(AttributeChanged<org.gravity.typegraph.basic.annotations.TNumberNode> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		
		for(Port<org.gravity.typegraph.basic.annotations.TNumberNode> port : ports) {
			port.sendAttributeChanged(message, message.node);
		}
		message.initialMessage.decrement();
	}
	
	private boolean returnTrue(Object o) {
		return true;
	}
	
}


