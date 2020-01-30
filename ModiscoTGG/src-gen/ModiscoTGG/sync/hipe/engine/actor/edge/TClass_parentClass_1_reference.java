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

public class TClass_parentClass_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TClass,org.gravity.typegraph.basic.TClass> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ClassExtendsClass__BWD_1353_junction"), this::check_constraint_48));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("ClassExtendsClass__CONSISTENCY_triangle_0_triangleJunction"), this::check_constraint_50));
	}	

	public boolean check_constraint_48(EdgeMatch edge) {
		org.gravity.typegraph.basic.TClass tClass = (org.gravity.typegraph.basic.TClass) edge.source();
		org.gravity.typegraph.basic.TClass tExtendedClass = (org.gravity.typegraph.basic.TClass) edge.target();
		boolean predicate = !tClass.equals(tExtendedClass);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_50(EdgeMatch edge) {
		org.gravity.typegraph.basic.TClass tClass = (org.gravity.typegraph.basic.TClass) edge.source();
		org.gravity.typegraph.basic.TClass tExtendedClass = (org.gravity.typegraph.basic.TClass) edge.target();
		boolean predicate = !tClass.equals(tExtendedClass);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

