package ModiscoTGG.sync.hipe.engine.actor.trianglejunction;

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

import hipe.generic.actor.junction.GenericTriangleJunctionActor;

import hipe.network.TriangleJunctionNode;

public class MethodOverriding__CONSISTENCY_triangle_0_triangleJunction extends GenericTriangleJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, TriangleJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("MethodOverriding__CONSISTENCY_4013_junction"), this::check_constraint_177));
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
	
	public boolean check_constraint_177(HMatch match) {
		ModiscoTGG.MDefinitionToTMember mOverridingToTOverriding = (ModiscoTGG.MDefinitionToTMember) match.getNodes()[5];
		org.gravity.typegraph.basic.TMethodDefinition tMethod = (org.gravity.typegraph.basic.TMethodDefinition) match.getNodes()[3];
		org.gravity.typegraph.basic.TMethodDefinition tOverriding = (org.gravity.typegraph.basic.TMethodDefinition) match.getNodes()[6];
		ModiscoTGG.MDefinitionToTMember mMethodToTMethod = (ModiscoTGG.MDefinitionToTMember) match.getNodes()[2];
		boolean predicate = !tMethod.equals(tOverriding) && !mMethodToTMethod.equals(mOverridingToTOverriding);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

