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

public class InterfaceExtendsInterface__GEN_448_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("InterfaceExtendsInterface__GEN_production"), this::check_constraint_11));
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
	
	public boolean check_constraint_11(HMatch match) {
		ModiscoTGG.InterfaceDeclarationToTInterface eInterfaceDeclarationToTInterface = (ModiscoTGG.InterfaceDeclarationToTInterface) match.getNodes()[0];
		org.eclipse.modisco.java.InterfaceDeclaration eSuperInterface = (org.eclipse.modisco.java.InterfaceDeclaration) match.getNodes()[4];
		org.gravity.typegraph.basic.TInterface tInterface = (org.gravity.typegraph.basic.TInterface) match.getNodes()[2];
		org.gravity.typegraph.basic.TInterface tSuperInterface = (org.gravity.typegraph.basic.TInterface) match.getNodes()[5];
		org.eclipse.modisco.java.InterfaceDeclaration eInterfaceDeclaration = (org.eclipse.modisco.java.InterfaceDeclaration) match.getNodes()[1];
		ModiscoTGG.InterfaceDeclarationToTInterface eSuperInterfaceToTSuperInterface = (ModiscoTGG.InterfaceDeclarationToTInterface) match.getNodes()[3];
		boolean predicate = !eInterfaceDeclaration.equals(eSuperInterface) && !tInterface.equals(tSuperInterface) && !eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

