package ModiscoTGG.cc.hipe.engine.actor.edge;

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

public class MAbstractFlowElement_incomingFlows_0_reference extends GenericReferenceActor<org.gravity.modisco.MAbstractFlowElement,org.gravity.modisco.MFlow> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("OutgoingFlow__CC_3962_junction"), this::check_constraint_218));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("OutgoingFlow__CONSISTENCY_3978_junction"), this::check_constraint_221));
	}	

	public boolean check_constraint_218(EdgeMatch edge) {
		org.gravity.modisco.MAbstractFlowElement mTarget = (org.gravity.modisco.MAbstractFlowElement) edge.source();
		org.gravity.modisco.MFlow mFlow = (org.gravity.modisco.MFlow) edge.target();
		boolean predicate = !mFlow.equals(mTarget);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_221(EdgeMatch edge) {
		org.gravity.modisco.MAbstractFlowElement mTarget = (org.gravity.modisco.MAbstractFlowElement) edge.source();
		org.gravity.modisco.MFlow mFlow = (org.gravity.modisco.MFlow) edge.target();
		boolean predicate = !mFlow.equals(mTarget);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

