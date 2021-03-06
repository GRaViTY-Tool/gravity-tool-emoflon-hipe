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

public class FieldAccessReadWrite__BWD_2268_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("FieldAccessReadWrite__BWD_production"), this::check_constraint_104));
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
	
	public boolean check_constraint_104(HMatch match) {
		org.gravity.modisco.MDefinition mMember = (org.gravity.modisco.MDefinition) match.getNodes()[8];
		ModiscoTGG.MDefinitionToTMember mMemberToTMember = (ModiscoTGG.MDefinitionToTMember) match.getNodes()[7];
		ModiscoTGG.MDefinitionToTMember mMethodToTMethod = (ModiscoTGG.MDefinitionToTMember) match.getNodes()[0];
		org.gravity.modisco.MFieldDefinition mField = (org.gravity.modisco.MFieldDefinition) match.getNodes()[1];
		boolean predicate = !mField.equals(mMember) && !mMemberToTMember.equals(mMethodToTMethod);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

