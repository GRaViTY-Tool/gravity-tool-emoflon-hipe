package ModiscoTGG.co.hipe.engine.actor.junction;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.Set;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;

import hipe.generic.actor.junction.GenericJunctionActor;

import hipe.network.JunctionNode;

public class InterfaceInAnonymous__CO_1360_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> namedElementAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> tAbstractTypeAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("InterfaceInAnonymous__CO_1358_junction"), this::check_constraint_105));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		Object obj = message.node;
		if(obj instanceof org.eclipse.modisco.java.NamedElement) {
			if(namedElementAttrMap.containsKey(obj)) {
				for(HMatch match : namedElementAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		if(obj instanceof org.gravity.typegraph.basic.TAbstractType) {
			if(tAbstractTypeAttrMap.containsKey(obj)) {
				for(HMatch match : tAbstractTypeAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_105(HMatch match) {
		org.gravity.typegraph.basic.TInterface tNestedType = (org.gravity.typegraph.basic.TInterface) match.getNodes()[6];
		org.eclipse.modisco.java.InterfaceDeclaration mNestedType = (org.eclipse.modisco.java.InterfaceDeclaration) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_28 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_28.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mNestedType.isProxy(), "boolean"));
		csp_28.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tNestedType.isTLib(), "boolean"));
		csp_28.solve();
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_29 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_29.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mNestedType.getName(), "java.lang.String"));
		csp_29.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tNestedType.getTName(), "java.lang.String"));
		csp_29.solve();
		
		boolean predicate = csp_28.isSatisfied() && csp_29.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

