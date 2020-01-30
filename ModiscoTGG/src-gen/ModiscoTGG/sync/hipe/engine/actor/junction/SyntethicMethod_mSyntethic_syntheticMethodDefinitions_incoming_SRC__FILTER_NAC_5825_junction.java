package ModiscoTGG.sync.hipe.engine.actor.junction;

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

import hipe.network.JunctionNode;

public class SyntethicMethod_mSyntethic_syntheticMethodDefinitions_incoming_SRC__FILTER_NAC_5825_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("SyntethicMethod__CONSISTENCY_6416_nacjunction"), this::check_constraint_289));
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("SyntethicMethod__FWD_6418_nacjunction"), this::check_constraint_291));
		ports.add(new PortJunction(getSelf(), name2actor.get("SyntethicMethod_mSyntethic_syntheticMethodDefinitions_incoming_SRC__FILTER_NAC_production"), this::check_constraint_292));
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
	
	public boolean check_constraint_289(HMatch match) {
		org.gravity.modisco.MMethodDefinition mDef = (org.gravity.modisco.MMethodDefinition) match.getNodes()[0];
		org.gravity.modisco.MMethodDefinition FILTER_NAC_NODE = (org.gravity.modisco.MMethodDefinition) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(mDef);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_291(HMatch match) {
		org.gravity.modisco.MMethodDefinition mDef = (org.gravity.modisco.MMethodDefinition) match.getNodes()[0];
		org.gravity.modisco.MMethodDefinition FILTER_NAC_NODE = (org.gravity.modisco.MMethodDefinition) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(mDef);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_292(HMatch match) {
		org.gravity.modisco.MMethodDefinition mDef = (org.gravity.modisco.MMethodDefinition) match.getNodes()[0];
		org.gravity.modisco.MMethodDefinition FILTER_NAC_NODE = (org.gravity.modisco.MMethodDefinition) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(mDef);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

