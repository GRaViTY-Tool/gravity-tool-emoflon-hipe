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

public class AnnotationMemberValueBoolean__CC_175_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> booleanLiteralAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> tBoolNodeAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("AnnotationMemberValueBoolean__CC_production"), this::check_constraint_5));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> booleanLiteral_3_Matches = booleanLiteralAttrMap.get(matchObjects[3]);
		if(booleanLiteral_3_Matches == null) {
			booleanLiteral_3_Matches = new LinkedList<>();
			booleanLiteralAttrMap.put(matchObjects[3], booleanLiteral_3_Matches);
		}
		
		booleanLiteral_3_Matches.add(match);
		
		Collection<HMatch> tBoolNode_1_Matches = tBoolNodeAttrMap.get(matchObjects[1]);
		if(tBoolNode_1_Matches == null) {
			tBoolNode_1_Matches = new LinkedList<>();
			tBoolNodeAttrMap.put(matchObjects[1], tBoolNode_1_Matches);
		}
		
		tBoolNode_1_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = booleanLiteralAttrMap.get(matchObjects[3]);
		if(matches_0 != null) {
			matches.remove(match);
		}
		Collection<HMatch> matches_1 = tBoolNodeAttrMap.get(matchObjects[1]);
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
		if(obj instanceof org.eclipse.modisco.java.BooleanLiteral) {
			if(booleanLiteralAttrMap.containsKey(obj)) {
				for(HMatch match : booleanLiteralAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		if(obj instanceof org.gravity.typegraph.basic.annotations.TBoolNode) {
			if(tBoolNodeAttrMap.containsKey(obj)) {
				for(HMatch match : tBoolNodeAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_5(HMatch match) {
		org.eclipse.modisco.java.BooleanLiteral mValue = (org.eclipse.modisco.java.BooleanLiteral) match.getNodes()[3];
		org.gravity.typegraph.basic.annotations.TBoolNode tValue = (org.gravity.typegraph.basic.annotations.TBoolNode) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_4 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_4.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mValue.isValue(), "boolean"));
		csp_4.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tValue.isValue(), "boolean"));
		csp_4.solve();
		
		boolean predicate = csp_4.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

