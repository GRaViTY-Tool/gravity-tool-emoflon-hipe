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

public class TClass_parentClass_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TClass,org.gravity.typegraph.basic.TClass> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnonymousClassTypeClass__CC_861_junction"), this::check_constraint_33));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnonymousClassTypeClass__CONSISTENCY_triangle_0_triangleJunction"), this::check_constraint_36));
	}	

	public boolean check_constraint_33(EdgeMatch edge) {
		org.gravity.typegraph.basic.TClass tClass = (org.gravity.typegraph.basic.TClass) edge.source();
		org.gravity.typegraph.basic.TClass tParent = (org.gravity.typegraph.basic.TClass) edge.target();
		boolean predicate = !tClass.equals(tParent);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_36(EdgeMatch edge) {
		org.gravity.typegraph.basic.TClass tClass = (org.gravity.typegraph.basic.TClass) edge.source();
		org.gravity.typegraph.basic.TClass tParent = (org.gravity.typegraph.basic.TClass) edge.target();
		boolean predicate = !tClass.equals(tParent);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

