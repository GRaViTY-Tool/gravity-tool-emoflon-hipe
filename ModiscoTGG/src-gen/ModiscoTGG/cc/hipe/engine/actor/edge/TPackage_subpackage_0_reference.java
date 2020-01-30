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

public class TPackage_subpackage_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TPackage,org.gravity.typegraph.basic.TPackage> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("AnnotationTypeNested__CC_triangle_0_triangleJunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("AnnotationTypeNested__CONSISTENCY_triangle_8_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("AnonymousClass__CC_1017_junction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("AnonymousClass__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassInnerAnonClassMember__CC_1394_junction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("ClassInnerAnonClassMember__CONSISTENCY_triangle_4_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("ClassInnerClassMember__CC_1489_junction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("ClassInnerClassMember__CONSISTENCY_triangle_4_triangleJunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("NestedClassInType__CC_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("NestedClassInType__CONSISTENCY_triangle_6_triangleJunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("NestedEnum__CC_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("NestedEnum__CONSISTENCY_triangle_8_triangleJunction"), this::returnTrue));
		ports.add(new PortEdge(getSelf(), name2actor.get("NestedInterfaceInType__CC_triangle_1_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("NestedInterfaceInType__CONSISTENCY_triangle_6_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PackageToPGPackage__CC_5436_nacjunction"), this::check_constraint_225));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PackageToPGPackage__CONSISTENCY_5438_nacjunction"), this::check_constraint_228));
		ports.add(new PortEdge(getSelf(), name2actor.get("PackageToPGPackage_tPackage_subpackage_incoming_TRG__FILTER_NAC_production"), this::check_constraint_230));
		ports.add(new PortEdge(getSelf(), name2actor.get("SubPackageToPGPackage__CC_triangle_0_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("SubPackageToPGPackage__CONSISTENCY_triangle_1_triangleJunction"), this::returnTrue));
	}	

	public boolean check_constraint_225(EdgeMatch edge) {
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) edge.source();
		org.gravity.typegraph.basic.TPackage tPackage = (org.gravity.typegraph.basic.TPackage) edge.target();
		boolean predicate = !FILTER_NAC_NODE.equals(tPackage);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_228(EdgeMatch edge) {
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) edge.source();
		org.gravity.typegraph.basic.TPackage tPackage = (org.gravity.typegraph.basic.TPackage) edge.target();
		boolean predicate = !FILTER_NAC_NODE.equals(tPackage);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_230(EdgeMatch edge) {
		org.gravity.typegraph.basic.TPackage FILTER_NAC_NODE = (org.gravity.typegraph.basic.TPackage) edge.source();
		org.gravity.typegraph.basic.TPackage tPackage = (org.gravity.typegraph.basic.TPackage) edge.target();
		boolean predicate = !FILTER_NAC_NODE.equals(tPackage);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

