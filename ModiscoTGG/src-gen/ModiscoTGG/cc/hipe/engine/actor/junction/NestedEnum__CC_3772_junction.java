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

import hipe.network.AbstractJunctionNode;

public class NestedEnum__CC_3772_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> tAbstractTypeAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> tPackageAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> namedElementAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("NestedEnum__CC_3770_junction"), this::check_constraint_202));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> tPackage_5_Matches = tPackageAttrMap.get(matchObjects[5]);
		if(tPackage_5_Matches == null) {
			tPackage_5_Matches = new LinkedList<>();
			tPackageAttrMap.put(matchObjects[5], tPackage_5_Matches);
		}
		
		tPackage_5_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = tPackageAttrMap.get(matchObjects[5]);
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
		if(obj instanceof org.gravity.typegraph.basic.TAbstractType) {
			if(tAbstractTypeAttrMap.containsKey(obj)) {
				for(HMatch match : tAbstractTypeAttrMap.get(obj)) {
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
		if(obj instanceof org.eclipse.modisco.java.NamedElement) {
			if(namedElementAttrMap.containsKey(obj)) {
				for(HMatch match : namedElementAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_202(HMatch match) {
		org.eclipse.modisco.java.EnumDeclaration eNestedType = (org.eclipse.modisco.java.EnumDeclaration) match.getNodes()[1];
		org.gravity.typegraph.basic.TPackage tNestedPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[5];
		org.eclipse.modisco.java.AbstractTypeDeclaration eOuterType = (org.eclipse.modisco.java.AbstractTypeDeclaration) match.getNodes()[0];
		org.gravity.typegraph.basic.TClass tNestedType = (org.gravity.typegraph.basic.TClass) match.getNodes()[4];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.AddSuffix csp_90 = new org.emoflon.ibex.tgg.operational.csp.constraints.AddSuffix();
		csp_90.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, eOuterType.getName(), "java.lang.String"));
		csp_90.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "$", "java.lang.String"));
		csp_90.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tNestedPackage.getTName(), "java.lang.String"));
		csp_90.solve();
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_91 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_91.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, eNestedType.isProxy(), "boolean"));
		csp_91.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tNestedType.isTLib(), "boolean"));
		csp_91.solve();
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_92 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_92.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, eNestedType.getName(), "java.lang.String"));
		csp_92.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tNestedType.getTName(), "java.lang.String"));
		csp_92.solve();
		
		boolean predicate = csp_90.isSatisfied() && csp_91.isSatisfied() && csp_92.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

