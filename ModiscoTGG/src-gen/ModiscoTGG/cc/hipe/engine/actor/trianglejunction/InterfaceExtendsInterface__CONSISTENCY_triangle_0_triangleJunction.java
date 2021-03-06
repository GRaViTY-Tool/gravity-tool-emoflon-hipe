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

import hipe.network.TriangleJunctionNode;

public class InterfaceExtendsInterface__CONSISTENCY_triangle_0_triangleJunction extends GenericTriangleJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, TriangleJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("InterfaceExtendsInterface__CONSISTENCY_2554_junction"), this::check_constraint_154));
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
	
	public boolean check_constraint_154(HMatch match) {
		ModiscoTGG.InterfaceDeclarationToTInterface eSuperInterfaceToTSuperInterface = (ModiscoTGG.InterfaceDeclarationToTInterface) match.getNodes()[2];
		ModiscoTGG.InterfaceDeclarationToTInterface eInterfaceDeclarationToTInterface = (ModiscoTGG.InterfaceDeclarationToTInterface) match.getNodes()[7];
		org.eclipse.modisco.java.InterfaceDeclaration eInterfaceDeclaration = (org.eclipse.modisco.java.InterfaceDeclaration) match.getNodes()[5];
		org.eclipse.modisco.java.InterfaceDeclaration eSuperInterface = (org.eclipse.modisco.java.InterfaceDeclaration) match.getNodes()[4];
		boolean predicate = !eInterfaceDeclaration.equals(eSuperInterface) && !eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

