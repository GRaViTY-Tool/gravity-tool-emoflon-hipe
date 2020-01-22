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

import hipe.network.AbstractJunctionNode;

public class ClassExtendsClass__CONSISTENCY_triangle_0_triangleJunction extends GenericTriangleJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("ClassExtendsClass__CONSISTENCY_1366_junction"), this::check_constraint_51));
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
	
	public boolean check_constraint_51(HMatch match) {
		ModiscoTGG.ClassDeclarationToTClass eClassDeclarationToTClass = (ModiscoTGG.ClassDeclarationToTClass) match.getNodes()[7];
		ModiscoTGG.ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ModiscoTGG.ClassDeclarationToTClass) match.getNodes()[2];
		org.eclipse.modisco.java.ClassDeclaration eExtendedClass = (org.eclipse.modisco.java.ClassDeclaration) match.getNodes()[4];
		org.eclipse.modisco.java.ClassDeclaration eClassDeclaration = (org.eclipse.modisco.java.ClassDeclaration) match.getNodes()[5];
		boolean predicate = !eClassDeclaration.equals(eExtendedClass) && !eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

