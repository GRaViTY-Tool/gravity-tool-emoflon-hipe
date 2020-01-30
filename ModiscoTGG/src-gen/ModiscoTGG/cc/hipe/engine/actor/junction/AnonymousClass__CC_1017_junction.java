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

public class AnonymousClass__CC_1017_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> tPackageAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> tAbstractTypeAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionLeft(getSelf(), name2actor.get("AnonymousClass__CC_1015_junction"), this::check_constraint_46));
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
		
		Collection<HMatch> tAbstractType_0_Matches = tAbstractTypeAttrMap.get(matchObjects[0]);
		if(tAbstractType_0_Matches == null) {
			tAbstractType_0_Matches = new LinkedList<>();
			tAbstractTypeAttrMap.put(matchObjects[0], tAbstractType_0_Matches);
		}
		
		tAbstractType_0_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = tPackageAttrMap.get(matchObjects[2]);
		if(matches_0 != null) {
			matches.remove(match);
		}
		Collection<HMatch> matches_1 = tAbstractTypeAttrMap.get(matchObjects[0]);
		if(matches_1 != null) {
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
		if(obj instanceof org.gravity.typegraph.basic.TPackage) {
			if(tPackageAttrMap.containsKey(obj)) {
				for(HMatch match : tPackageAttrMap.get(obj)) {
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
	
	public boolean check_constraint_46(HMatch match) {
		org.gravity.typegraph.basic.TAbstractType tType = (org.gravity.typegraph.basic.TAbstractType) match.getNodes()[0];
		org.gravity.typegraph.basic.TPackage tNewPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[2];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.AddSuffix csp_28 = new org.emoflon.ibex.tgg.operational.csp.constraints.AddSuffix();
		csp_28.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tType.getTName(), "java.lang.String"));
		csp_28.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "$1", "java.lang.String"));
		csp_28.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tNewPackage.getTName(), "java.lang.String"));
		csp_28.solve();
		
		boolean predicate = csp_28.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

