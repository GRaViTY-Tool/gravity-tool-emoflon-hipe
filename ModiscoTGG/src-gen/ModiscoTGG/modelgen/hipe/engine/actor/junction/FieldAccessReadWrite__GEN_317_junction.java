package ModiscoTGG.modelgen.hipe.engine.actor.junction;

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

public class FieldAccessReadWrite__GEN_317_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("FieldAccessReadWrite__GEN_production"), this::check_constraint_7));
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
	
	public boolean check_constraint_7(HMatch match) {
		org.gravity.modisco.MFieldDefinition mField = (org.gravity.modisco.MFieldDefinition) match.getNodes()[6];
		ModiscoTGG.MDefinitionToTMember mMethodToTMethod = (ModiscoTGG.MDefinitionToTMember) match.getNodes()[5];
		org.gravity.typegraph.basic.TFieldDefinition tField = (org.gravity.typegraph.basic.TFieldDefinition) match.getNodes()[4];
		org.gravity.modisco.MDefinition mMember = (org.gravity.modisco.MDefinition) match.getNodes()[1];
		org.gravity.typegraph.basic.TMember tMember = (org.gravity.typegraph.basic.TMember) match.getNodes()[2];
		ModiscoTGG.MDefinitionToTMember mMemberToTMember = (ModiscoTGG.MDefinitionToTMember) match.getNodes()[0];
		boolean predicate = !mField.equals(mMember) && !tField.equals(tMember) && !mMemberToTMember.equals(mMethodToTMethod);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

