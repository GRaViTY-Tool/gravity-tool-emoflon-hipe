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

public class TParameter_previous_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TParameter,org.gravity.typegraph.basic.TParameter> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MethodParameterLink__CC_3462_junction"), this::check_constraint_187));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MethodParameterLink__CONSISTENCY_3477_junction"), this::check_constraint_190));
	}	

	public boolean check_constraint_187(EdgeMatch edge) {
		org.gravity.typegraph.basic.TParameter tParameter = (org.gravity.typegraph.basic.TParameter) edge.source();
		org.gravity.typegraph.basic.TParameter tPrevParameter = (org.gravity.typegraph.basic.TParameter) edge.target();
		boolean predicate = !tParameter.equals(tPrevParameter);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_190(EdgeMatch edge) {
		org.gravity.typegraph.basic.TParameter tParameter = (org.gravity.typegraph.basic.TParameter) edge.source();
		org.gravity.typegraph.basic.TParameter tPrevParameter = (org.gravity.typegraph.basic.TParameter) edge.target();
		boolean predicate = !tParameter.equals(tPrevParameter);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

