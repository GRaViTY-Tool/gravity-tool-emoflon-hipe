package ModiscoTGG.co.hipe.engine.actor.node;

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
		
public class MSingleVariableAccess_object_SP2 extends AbstractActor {
	
	private List<Port<org.gravity.modisco.MSingleVariableAccess>> ports;		
		
	public MSingleVariableAccess_object_SP2() {
	}

	public void initActor(InitActor m) {
		Map<String, ActorRef> name2actor = m.name2actor;
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MAbstractFlowElementToTAbstractFlowElement_source_3_reference"), this::check_constraint_77));
		ports.add(new PortNodeLeft<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MSingleVariableAccess_variable_1_reference"), this::check_constraint_83));
		ports.add(new PortNodeLeft<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MSingleVariableAccess_variable_2_reference"), this::check_constraint_90));
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
	
	private void addNode(ObjectAdded<org.gravity.modisco.MSingleVariableAccess> message) {
		for(Port<org.gravity.modisco.MSingleVariableAccess> port : ports) {
			port.sendAdd(message, message.node);
		}
		message.initialMessage.decrement();
	}
	
	private void removeNode(ObjectDeleted<org.gravity.modisco.MSingleVariableAccess> message) {
		for(Port<org.gravity.modisco.MSingleVariableAccess> port : ports) {
			port.sendRemove(message, message.node);
		}		
		message.initialMessage.decrement();
	}
	
	private void changeAttribute(AttributeChanged<org.gravity.modisco.MSingleVariableAccess> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		
		for(Port<org.gravity.modisco.MSingleVariableAccess> port : ports) {
			port.sendAttributeChanged(message, message.node);
		}
		message.initialMessage.decrement();
	}
	
	private boolean returnTrue(Object o) {
		return true;
	}
	
	public boolean check_constraint_77(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==2;
	}
	
	public boolean check_constraint_83(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==0;
	}
	
	public boolean check_constraint_90(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==1;
	}
	
}


