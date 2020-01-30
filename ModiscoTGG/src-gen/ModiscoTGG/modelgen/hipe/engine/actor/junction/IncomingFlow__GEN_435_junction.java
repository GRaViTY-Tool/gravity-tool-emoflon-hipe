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

public class IncomingFlow__GEN_435_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("IncomingFlow__GEN_production"), this::check_constraint_10));
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
	
	public boolean check_constraint_10(HMatch match) {
		org.gravity.typegraph.basic.TAbstractFlowElement tSource = (org.gravity.typegraph.basic.TAbstractFlowElement) match.getNodes()[5];
		org.gravity.modisco.MFlow mFlow = (org.gravity.modisco.MFlow) match.getNodes()[1];
		org.gravity.modisco.MAbstractFlowElement mSource = (org.gravity.modisco.MAbstractFlowElement) match.getNodes()[4];
		org.gravity.typegraph.basic.TFlow tFlow = (org.gravity.typegraph.basic.TFlow) match.getNodes()[2];
		boolean predicate = !mFlow.equals(mSource) && !tFlow.equals(tSource);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

