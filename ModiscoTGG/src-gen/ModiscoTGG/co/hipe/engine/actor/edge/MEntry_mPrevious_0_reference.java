package ModiscoTGG.co.hipe.engine.actor.edge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import hipe.engine.util.HiPESet;
import hipe.engine.actor.Port;
import hipe.engine.match.EdgeMatch;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NewInput;
import hipe.engine.actor.edge.PortEdge;
import hipe.engine.actor.edge.PortEdgeLeft;
import hipe.engine.actor.edge.PortEdgeRight;

import hipe.network.ReferenceNode;

import hipe.generic.actor.GenericReferenceActor;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

public class MEntry_mPrevious_0_reference extends GenericReferenceActor<org.gravity.modisco.MEntry,org.gravity.modisco.MEntry> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MethodParameterLink__CO_1772_junction"), this::check_constraint_123));
	}	

	public boolean check_constraint_123(EdgeMatch edge) {
		org.gravity.modisco.MEntry mEntry = (org.gravity.modisco.MEntry) edge.source();
		org.gravity.modisco.MEntry mPrevEntry = (org.gravity.modisco.MEntry) edge.target();
		boolean predicate = !mEntry.equals(mPrevEntry);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

