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

public class SyntethicMethod_tSyntethic_syntethicMethods_incoming_TRG__FILTER_NAC_2554_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("SyntethicMethod__CO_2833_nacjunction"), this::check_constraint_197));
		ports.add(new PortJunction(getSelf(), name2actor.get("SyntethicMethod_tSyntethic_syntethicMethods_incoming_TRG__FILTER_NAC_production"), this::check_constraint_199));
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
	
	public boolean check_constraint_197(HMatch match) {
		org.gravity.typegraph.basic.TMethodDefinition tDef = (org.gravity.typegraph.basic.TMethodDefinition) match.getNodes()[0];
		org.gravity.typegraph.basic.TMethodDefinition FILTER_NAC_NODE = (org.gravity.typegraph.basic.TMethodDefinition) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(tDef);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_199(HMatch match) {
		org.gravity.typegraph.basic.TMethodDefinition tDef = (org.gravity.typegraph.basic.TMethodDefinition) match.getNodes()[0];
		org.gravity.typegraph.basic.TMethodDefinition FILTER_NAC_NODE = (org.gravity.typegraph.basic.TMethodDefinition) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(tDef);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

