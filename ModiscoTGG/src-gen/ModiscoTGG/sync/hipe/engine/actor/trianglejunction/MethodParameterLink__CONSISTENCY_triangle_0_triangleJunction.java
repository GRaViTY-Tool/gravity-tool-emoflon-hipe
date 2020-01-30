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

public class MethodParameterLink__CONSISTENCY_triangle_0_triangleJunction extends GenericTriangleJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, TriangleJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("MethodParameterLink__CONSISTENCY_4123_junction"), this::check_constraint_184));
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
	
	public boolean check_constraint_184(HMatch match) {
		org.gravity.typegraph.basic.TParameter tParameter = (org.gravity.typegraph.basic.TParameter) match.getNodes()[3];
		org.gravity.typegraph.basic.TParameter tPrevParameter = (org.gravity.typegraph.basic.TParameter) match.getNodes()[6];
		ModiscoTGG.MEntryToTParameter eSingleVariableDeclarationToTParameter = (ModiscoTGG.MEntryToTParameter) match.getNodes()[2];
		ModiscoTGG.MEntryToTParameter mmethodSignatureToTMethodSignature = (ModiscoTGG.MEntryToTParameter) match.getNodes()[5];
		boolean predicate = !tParameter.equals(tPrevParameter) && !eSingleVariableDeclarationToTParameter.equals(mmethodSignatureToTMethodSignature);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

