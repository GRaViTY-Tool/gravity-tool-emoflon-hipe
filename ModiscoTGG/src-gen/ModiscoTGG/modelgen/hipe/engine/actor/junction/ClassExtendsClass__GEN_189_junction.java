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

public class ClassExtendsClass__GEN_189_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("ClassExtendsClass__GEN_production"), this::check_constraint_3));
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
	
	public boolean check_constraint_3(HMatch match) {
		org.gravity.typegraph.basic.TClass tExtendedClass = (org.gravity.typegraph.basic.TClass) match.getNodes()[5];
		ModiscoTGG.ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ModiscoTGG.ClassDeclarationToTClass) match.getNodes()[3];
		ModiscoTGG.ClassDeclarationToTClass eClassDeclarationToTClass = (ModiscoTGG.ClassDeclarationToTClass) match.getNodes()[0];
		org.eclipse.modisco.java.ClassDeclaration eExtendedClass = (org.eclipse.modisco.java.ClassDeclaration) match.getNodes()[4];
		org.eclipse.modisco.java.ClassDeclaration eClassDeclaration = (org.eclipse.modisco.java.ClassDeclaration) match.getNodes()[1];
		org.gravity.typegraph.basic.TClass tClass = (org.gravity.typegraph.basic.TClass) match.getNodes()[2];
		boolean predicate = !eClassDeclaration.equals(eExtendedClass) && !tClass.equals(tExtendedClass) && !eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

