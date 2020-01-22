package ModiscoTGG.cc.hipe.engine.actor.junction;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.Set;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;

import hipe.generic.actor.junction.GenericJunctionActor;

import hipe.network.AbstractJunctionNode;

public class FieldAccessRead_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_2174_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("FieldAccessRead__CC_5377_nacjunction"), this::check_constraint_125));
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("FieldAccessRead__CONSISTENCY_5378_nacjunction"), this::check_constraint_130));
		ports.add(new PortJunction(getSelf(), name2actor.get("FieldAccessRead_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_production"), this::check_constraint_131));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_125(HMatch match) {
		org.gravity.modisco.MDefinition mMember = (org.gravity.modisco.MDefinition) match.getNodes()[0];
		org.gravity.modisco.MDefinition FILTER_NAC_NODE = (org.gravity.modisco.MDefinition) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(mMember);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_130(HMatch match) {
		org.gravity.modisco.MDefinition mMember = (org.gravity.modisco.MDefinition) match.getNodes()[0];
		org.gravity.modisco.MDefinition FILTER_NAC_NODE = (org.gravity.modisco.MDefinition) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(mMember);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_131(HMatch match) {
		org.gravity.modisco.MDefinition mMember = (org.gravity.modisco.MDefinition) match.getNodes()[0];
		org.gravity.modisco.MDefinition FILTER_NAC_NODE = (org.gravity.modisco.MDefinition) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(mMember);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}
