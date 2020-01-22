package ModiscoTGG.cc.hipe.engine.actor.junction;

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

public class Enum_tType_classes_incoming_TRG__FILTER_NAC_1964_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("Enum__CC_5371_nacjunction"), this::check_constraint_106));
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("Enum__CC_5372_nacjunction"), this::check_constraint_107));
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("Enum__CONSISTENCY_5373_nacjunction"), this::check_constraint_109));
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("Enum__CONSISTENCY_5374_nacjunction"), this::check_constraint_110));
		ports.add(new PortJunction(getSelf(), name2actor.get("Enum_tType_classes_incoming_TRG__FILTER_NAC_production"), this::check_constraint_111));
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
	
	public boolean check_constraint_106(HMatch match) {
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) match.getNodes()[2];
		org.gravity.typegraph.basic.TPackage tPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[0];
		boolean predicate = !FILTER_NAC_NODE.equals(tPackage);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_107(HMatch match) {
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) match.getNodes()[2];
		org.gravity.typegraph.basic.TPackage tPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[0];
		boolean predicate = !FILTER_NAC_NODE.equals(tPackage);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_109(HMatch match) {
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) match.getNodes()[2];
		org.gravity.typegraph.basic.TPackage tPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[0];
		boolean predicate = !FILTER_NAC_NODE.equals(tPackage);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_110(HMatch match) {
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) match.getNodes()[2];
		org.gravity.typegraph.basic.TPackage tPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[0];
		boolean predicate = !FILTER_NAC_NODE.equals(tPackage);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_111(HMatch match) {
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) match.getNodes()[2];
		org.gravity.typegraph.basic.TPackage tPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[0];
		boolean predicate = !FILTER_NAC_NODE.equals(tPackage);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

