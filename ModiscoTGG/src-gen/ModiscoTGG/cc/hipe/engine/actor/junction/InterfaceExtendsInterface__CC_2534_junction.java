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

import hipe.network.JunctionNode;

public class InterfaceExtendsInterface__CC_2534_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionLeft(getSelf(), name2actor.get("InterfaceExtendsInterface__CC_5381_nacjunction"), this::check_constraint_151));
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
	
	public boolean check_constraint_151(HMatch match) {
		ModiscoTGG.InterfaceDeclarationToTInterface eInterfaceDeclarationToTInterface = (ModiscoTGG.InterfaceDeclarationToTInterface) match.getNodes()[2];
		ModiscoTGG.InterfaceDeclarationToTInterface eSuperInterfaceToTSuperInterface = (ModiscoTGG.InterfaceDeclarationToTInterface) match.getNodes()[4];
		boolean predicate = !eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface);
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

