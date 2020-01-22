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

import hipe.network.AbstractJunctionNode;

public class ClassInnerAnonClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_1686_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("ClassInnerAnonClassMember__BWD_6251_nacjunction"), this::check_constraint_65));
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("ClassInnerAnonClassMember__BWD_6252_nacjunction"), this::check_constraint_66));
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("ClassInnerAnonClassMember__CONSISTENCY_6255_nacjunction"), this::check_constraint_69));
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("ClassInnerAnonClassMember__CONSISTENCY_6256_nacjunction"), this::check_constraint_70));
		ports.add(new PortJunction(getSelf(), name2actor.get("ClassInnerAnonClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_production"), this::check_constraint_71));
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
	
	public boolean check_constraint_65(HMatch match) {
		org.gravity.typegraph.basic.TPackage tInnerPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[0];
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(tInnerPackage);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_66(HMatch match) {
		org.gravity.typegraph.basic.TPackage tInnerPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[0];
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(tInnerPackage);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_69(HMatch match) {
		org.gravity.typegraph.basic.TPackage tInnerPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[0];
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(tInnerPackage);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_70(HMatch match) {
		org.gravity.typegraph.basic.TPackage tInnerPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[0];
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(tInnerPackage);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_71(HMatch match) {
		org.gravity.typegraph.basic.TPackage tInnerPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[0];
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) match.getNodes()[2];
		boolean predicate = !FILTER_NAC_NODE.equals(tInnerPackage);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

