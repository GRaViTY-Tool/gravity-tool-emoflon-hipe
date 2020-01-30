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

public class MMethodDefinition_redefinitions_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.MethodDeclaration,org.eclipse.modisco.java.MethodDeclaration> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MethodOverriding__CC_3377_junction"), this::check_constraint_180));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("MethodOverriding__CONSISTENCY_triangle_0_triangleJunction"), this::check_constraint_183));
	}	

	public boolean check_constraint_180(EdgeMatch edge) {
		org.eclipse.modisco.java.MethodDeclaration mMethod = (org.eclipse.modisco.java.MethodDeclaration) edge.source();
		org.eclipse.modisco.java.MethodDeclaration mOverriding = (org.eclipse.modisco.java.MethodDeclaration) edge.target();
		boolean predicate = !mMethod.equals(mOverriding);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_183(EdgeMatch edge) {
		org.eclipse.modisco.java.MethodDeclaration mMethod = (org.eclipse.modisco.java.MethodDeclaration) edge.source();
		org.eclipse.modisco.java.MethodDeclaration mOverriding = (org.eclipse.modisco.java.MethodDeclaration) edge.target();
		boolean predicate = !mMethod.equals(mOverriding);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

