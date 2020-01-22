package ModiscoTGG.cc.hipe.engine.actor.trianglejunction;

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

import hipe.network.AbstractJunctionNode;

public class SuperConstructorInvocation__CONSISTENCY_triangle_0_triangleJunction extends GenericTriangleJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("SuperConstructorInvocation__CONSISTENCY_4773_junction"), this::check_constraint_287));
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
	
	public boolean check_constraint_287(HMatch match) {
		org.gravity.modisco.MAbstractMethodDefinition mMethod = (org.gravity.modisco.MAbstractMethodDefinition) match.getNodes()[4];
		ModiscoTGG.MDefinitionToTMember mMemberToTMember = (ModiscoTGG.MDefinitionToTMember) match.getNodes()[7];
		ModiscoTGG.MDefinitionToTMember mMethodToTMethod = (ModiscoTGG.MDefinitionToTMember) match.getNodes()[2];
		org.gravity.typegraph.basic.TMember tMember = (org.gravity.typegraph.basic.TMember) match.getNodes()[8];
		org.gravity.modisco.MDefinition mMember = (org.gravity.modisco.MDefinition) match.getNodes()[5];
		org.gravity.typegraph.basic.TMember tMethod = (org.gravity.typegraph.basic.TMember) match.getNodes()[1];
		boolean predicate = !mMember.equals(mMethod) && !tMember.equals(tMethod) && !mMemberToTMember.equals(mMethodToTMethod);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

