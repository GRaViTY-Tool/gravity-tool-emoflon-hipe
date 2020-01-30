package ModiscoTGG.cc.hipe.engine.actor.junction;

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

public class NestedClassInType__CONSISTENCY_3704_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> namedElementAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> tPackageAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionLeft(getSelf(), name2actor.get("NestedClassInType__CONSISTENCY_5420_nacjunction"), this::check_constraint_198));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> tPackage_2_Matches = tPackageAttrMap.get(matchObjects[2]);
		if(tPackage_2_Matches == null) {
			tPackage_2_Matches = new LinkedList<>();
			tPackageAttrMap.put(matchObjects[2], tPackage_2_Matches);
		}
		
		tPackage_2_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = tPackageAttrMap.get(matchObjects[2]);
		if(matches_0 != null) {
			matches.remove(match);
		}
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
		if(obj instanceof org.gravity.typegraph.basic.TPackage) {
			if(tPackageAttrMap.containsKey(obj)) {
				for(HMatch match : tPackageAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_198(HMatch match) {
		org.eclipse.modisco.java.AbstractTypeDeclaration eOuterType = (org.eclipse.modisco.java.AbstractTypeDeclaration) match.getNodes()[8];
		org.gravity.typegraph.basic.TPackage tNestedPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[2];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.AddSuffix csp_87 = new org.emoflon.ibex.tgg.operational.csp.constraints.AddSuffix();
		csp_87.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, eOuterType.getName(), "java.lang.String"));
		csp_87.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "$", "java.lang.String"));
		csp_87.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tNestedPackage.getTName(), "java.lang.String"));
		csp_87.solve();
		
		boolean predicate = csp_87.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

