package ModiscoTGG.sync.hipe.engine.actor.edge;

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

public class TMethodDefinition_overriding_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMethodDefinition,org.gravity.typegraph.basic.TMethodDefinition> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MethodOverriding__BWD_4000_junction"), this::check_constraint_173));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MethodOverriding__CONSISTENCY_4013_junction"), this::check_constraint_176));
	}	

	public boolean check_constraint_173(EdgeMatch edge) {
		org.gravity.typegraph.basic.TMethodDefinition tOverriding = (org.gravity.typegraph.basic.TMethodDefinition) edge.source();
		org.gravity.typegraph.basic.TMethodDefinition tMethod = (org.gravity.typegraph.basic.TMethodDefinition) edge.target();
		boolean predicate = !tMethod.equals(tOverriding);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_176(EdgeMatch edge) {
		org.gravity.typegraph.basic.TMethodDefinition tOverriding = (org.gravity.typegraph.basic.TMethodDefinition) edge.source();
		org.gravity.typegraph.basic.TMethodDefinition tMethod = (org.gravity.typegraph.basic.TMethodDefinition) edge.target();
		boolean predicate = !tMethod.equals(tOverriding);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

