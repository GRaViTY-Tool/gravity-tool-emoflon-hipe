package ModiscoTGG.sync.hipe.engine.actor.trianglejunction;

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

import hipe.generic.actor.junction.GenericTriangleJunctionActor;

import hipe.network.TriangleJunctionNode;

public class AnonymousClass__CONSISTENCY_triangle_1_triangleJunction extends GenericTriangleJunctionActor{
	private Map<Object, Collection<HMatch>> tPackageAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> tAbstractTypeAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, TriangleJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("AnonymousClass__CONSISTENCY_1197_junction"), this::check_constraint_44));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> tPackage_1_Matches = tPackageAttrMap.get(matchObjects[1]);
		if(tPackage_1_Matches == null) {
			tPackage_1_Matches = new LinkedList<>();
			tPackageAttrMap.put(matchObjects[1], tPackage_1_Matches);
		}
		
		tPackage_1_Matches.add(match);
		
		Collection<HMatch> tAbstractType_5_Matches = tAbstractTypeAttrMap.get(matchObjects[5]);
		if(tAbstractType_5_Matches == null) {
			tAbstractType_5_Matches = new LinkedList<>();
			tAbstractTypeAttrMap.put(matchObjects[5], tAbstractType_5_Matches);
		}
		
		tAbstractType_5_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = tPackageAttrMap.get(matchObjects[1]);
		if(matches_0 != null) {
			matches.remove(match);
		}
		Collection<HMatch> matches_1 = tAbstractTypeAttrMap.get(matchObjects[5]);
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
	
	public boolean check_constraint_44(HMatch match) {
		org.gravity.typegraph.basic.TAbstractType tType = (org.gravity.typegraph.basic.TAbstractType) match.getNodes()[5];
		org.gravity.typegraph.basic.TPackage tNewPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.AddSuffix csp_16 = new org.emoflon.ibex.tgg.operational.csp.constraints.AddSuffix();
		csp_16.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tType.getTName(), "java.lang.String"));
		csp_16.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "$1", "java.lang.String"));
		csp_16.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tNewPackage.getTName(), "java.lang.String"));
		csp_16.solve();
		
		boolean predicate = csp_16.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

