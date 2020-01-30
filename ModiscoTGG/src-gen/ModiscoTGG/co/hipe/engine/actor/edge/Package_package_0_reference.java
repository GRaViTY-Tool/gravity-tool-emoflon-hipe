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

public class Package_package_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.Package,org.eclipse.modisco.java.Package> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("PackageToPGPackage__CO_2794_nacjunction"), this::check_constraint_145));
		ports.add(new PortEdge(getSelf(), name2actor.get("PackageToPGPackage_mPackage_package_outgoing_SRC__FILTER_NAC_production"), this::check_constraint_147));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("SubPackageToPGPackage__CO_2424_junction"), this::returnTrue));
	}	

	public boolean check_constraint_145(EdgeMatch edge) {
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) edge.source();
		org.eclipse.modisco.java.Package FILTER_NAC_NODE = (org.eclipse.modisco.java.Package) edge.target();
		boolean predicate = !FILTER_NAC_NODE.equals(mPackage);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_147(EdgeMatch edge) {
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) edge.source();
		org.eclipse.modisco.java.Package FILTER_NAC_NODE = (org.eclipse.modisco.java.Package) edge.target();
		boolean predicate = !FILTER_NAC_NODE.equals(mPackage);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

