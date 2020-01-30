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

import hipe.network.JunctionNode;

public class MethodOverriding__GEN_641_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("MethodOverriding__GEN_production"), this::check_constraint_13));
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
	
	public boolean check_constraint_13(HMatch match) {
		org.gravity.modisco.MMethodDefinition mMethod = (org.gravity.modisco.MMethodDefinition) match.getNodes()[1];
		ModiscoTGG.MDefinitionToTMember mMethodToTMethod = (ModiscoTGG.MDefinitionToTMember) match.getNodes()[0];
		org.gravity.typegraph.basic.TMethodDefinition tOverriding = (org.gravity.typegraph.basic.TMethodDefinition) match.getNodes()[5];
		org.gravity.typegraph.basic.TMethodDefinition tMethod = (org.gravity.typegraph.basic.TMethodDefinition) match.getNodes()[2];
		ModiscoTGG.MDefinitionToTMember mOverridingToTOverriding = (ModiscoTGG.MDefinitionToTMember) match.getNodes()[3];
		org.gravity.modisco.MMethodDefinition mOverriding = (org.gravity.modisco.MMethodDefinition) match.getNodes()[4];
		boolean predicate = !mMethod.equals(mOverriding) && !tMethod.equals(tOverriding) && !mMethodToTMethod.equals(mOverridingToTOverriding);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

