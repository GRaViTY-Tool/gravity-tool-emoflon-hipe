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

public class TFlow_incomingFlows_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("IncomingFlow__CO_1305_junction"), this::check_constraint_98));
	}	

	public boolean check_constraint_98(EdgeMatch edge) {
		org.gravity.typegraph.basic.TAbstractFlowElement tFlow = (org.gravity.typegraph.basic.TAbstractFlowElement) edge.source();
		org.gravity.typegraph.basic.TAbstractFlowElement tSource = (org.gravity.typegraph.basic.TAbstractFlowElement) edge.target();
		boolean predicate = !tFlow.equals(tSource);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

