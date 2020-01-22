package ModiscoTGG.co.hipe.engine.actor.junction;

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

public class FieldAccessWrite__CO_1150_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionLeft(getSelf(), name2actor.get("FieldAccessWrite__CO_2766_nacjunction"), this::check_constraint_93));
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
	
	public boolean check_constraint_93(HMatch match) {
		org.gravity.typegraph.basic.TFieldDefinition tField = (org.gravity.typegraph.basic.TFieldDefinition) match.getNodes()[2];
		org.gravity.typegraph.basic.TMember tMember = (org.gravity.typegraph.basic.TMember) match.getNodes()[11];
		ModiscoTGG.MDefinitionToTMember mMemberToTMember = (ModiscoTGG.MDefinitionToTMember) match.getNodes()[13];
		org.gravity.modisco.MDefinition mMember = (org.gravity.modisco.MDefinition) match.getNodes()[12];
		ModiscoTGG.MDefinitionToTMember mMethodToTMethod = (ModiscoTGG.MDefinitionToTMember) match.getNodes()[0];
		org.gravity.modisco.MFieldDefinition mField = (org.gravity.modisco.MFieldDefinition) match.getNodes()[1];
		boolean predicate = !mField.equals(mMember) && !tField.equals(tMember) && !mMemberToTMember.equals(mMethodToTMethod);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

