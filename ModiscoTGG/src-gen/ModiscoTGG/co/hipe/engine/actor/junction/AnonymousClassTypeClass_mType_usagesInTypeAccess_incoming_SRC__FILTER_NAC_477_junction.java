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

import hipe.network.JunctionNode;

public class AnonymousClassTypeClass_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC_477_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("AnonymousClassTypeClass__CO_2710_nacjunction"), this::check_constraint_22));
		ports.add(new PortJunction(getSelf(), name2actor.get("AnonymousClassTypeClass_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production"), this::check_constraint_23));
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
	
	public boolean check_constraint_22(HMatch match) {
		org.eclipse.modisco.java.Type FILTER_NAC_NODE = (org.eclipse.modisco.java.Type) match.getNodes()[2];
		org.eclipse.modisco.java.AbstractTypeDeclaration mParent = (org.eclipse.modisco.java.AbstractTypeDeclaration) match.getNodes()[0];
		boolean predicate = !FILTER_NAC_NODE.equals(mParent);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_23(HMatch match) {
		org.eclipse.modisco.java.Type FILTER_NAC_NODE = (org.eclipse.modisco.java.Type) match.getNodes()[2];
		org.eclipse.modisco.java.AbstractTypeDeclaration mParent = (org.eclipse.modisco.java.AbstractTypeDeclaration) match.getNodes()[0];
		boolean predicate = !FILTER_NAC_NODE.equals(mParent);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

