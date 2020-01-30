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

public class Package_package_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.Package,org.eclipse.modisco.java.Package> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PackageToPGPackage__CONSISTENCY_6340_nacjunction"), this::check_constraint_221));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PackageToPGPackage__FWD_6342_nacjunction"), this::check_constraint_223));
		ports.add(new PortEdge(getSelf(), name2actor.get("PackageToPGPackage_mPackage_package_outgoing_SRC__FILTER_NAC_production"), this::check_constraint_224));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("SubPackageToPGPackage__CONSISTENCY_triangle_2_triangleJunction"), this::returnTrue));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("SubPackageToPGPackage__FWD_5558_junction"), this::returnTrue));
	}	

	public boolean check_constraint_221(EdgeMatch edge) {
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) edge.source();
		org.eclipse.modisco.java.Package FILTER_NAC_NODE = (org.eclipse.modisco.java.Package) edge.target();
		boolean predicate = !FILTER_NAC_NODE.equals(mPackage);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_223(EdgeMatch edge) {
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) edge.source();
		org.eclipse.modisco.java.Package FILTER_NAC_NODE = (org.eclipse.modisco.java.Package) edge.target();
		boolean predicate = !FILTER_NAC_NODE.equals(mPackage);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_224(EdgeMatch edge) {
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) edge.source();
		org.eclipse.modisco.java.Package FILTER_NAC_NODE = (org.eclipse.modisco.java.Package) edge.target();
		boolean predicate = !FILTER_NAC_NODE.equals(mPackage);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

