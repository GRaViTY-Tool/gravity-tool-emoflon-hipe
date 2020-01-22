package ModiscoTGG.cc.hipe.engine.actor.trianglejunction;

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

import hipe.network.AbstractJunctionNode;

public class ClassInnerAnonClassMember__CONSISTENCY_triangle_5_triangleJunction extends GenericTriangleJunctionActor{
	private Map<Object, Collection<HMatch>> tAbstractTypeAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> tPackageAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("ClassInnerAnonClassMember__CONSISTENCY_triangle_4_triangleJunction"), this::check_constraint_75));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> tPackage_0_Matches = tPackageAttrMap.get(matchObjects[0]);
		if(tPackage_0_Matches == null) {
			tPackage_0_Matches = new LinkedList<>();
			tPackageAttrMap.put(matchObjects[0], tPackage_0_Matches);
		}
		
		tPackage_0_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = tPackageAttrMap.get(matchObjects[0]);
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
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_75(HMatch match) {
		org.gravity.typegraph.basic.TPackage tInnerPackage = (org.gravity.typegraph.basic.TPackage) match.getNodes()[0];
		org.gravity.typegraph.basic.TClass tOuterClass = (org.gravity.typegraph.basic.TClass) match.getNodes()[9];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.AddSuffix csp_36 = new org.emoflon.ibex.tgg.operational.csp.constraints.AddSuffix();
		csp_36.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tOuterClass.getTName(), "java.lang.String"));
		csp_36.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "$1", "java.lang.String"));
		csp_36.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tInnerPackage.getTName(), "java.lang.String"));
		csp_36.solve();
		
		boolean predicate = csp_36.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}
