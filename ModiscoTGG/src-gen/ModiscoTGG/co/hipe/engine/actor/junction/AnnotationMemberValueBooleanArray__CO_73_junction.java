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

public class AnnotationMemberValueBooleanArray__CO_73_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> tBoolNodeAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> booleanLiteralAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("AnnotationMemberValueBooleanArray__CO_69_junction"), this::check_constraint_2));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> tBoolNode_2_Matches = tBoolNodeAttrMap.get(matchObjects[2]);
		if(tBoolNode_2_Matches == null) {
			tBoolNode_2_Matches = new LinkedList<>();
			tBoolNodeAttrMap.put(matchObjects[2], tBoolNode_2_Matches);
		}
		
		tBoolNode_2_Matches.add(match);
		
		Collection<HMatch> booleanLiteral_1_Matches = booleanLiteralAttrMap.get(matchObjects[1]);
		if(booleanLiteral_1_Matches == null) {
			booleanLiteral_1_Matches = new LinkedList<>();
			booleanLiteralAttrMap.put(matchObjects[1], booleanLiteral_1_Matches);
		}
		
		booleanLiteral_1_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = tBoolNodeAttrMap.get(matchObjects[2]);
		if(matches_0 != null) {
			matches.remove(match);
		}
		Collection<HMatch> matches_1 = booleanLiteralAttrMap.get(matchObjects[1]);
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
		if(obj instanceof org.gravity.typegraph.basic.annotations.TBoolNode) {
			if(tBoolNodeAttrMap.containsKey(obj)) {
				for(HMatch match : tBoolNodeAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		if(obj instanceof org.eclipse.modisco.java.BooleanLiteral) {
			if(booleanLiteralAttrMap.containsKey(obj)) {
				for(HMatch match : booleanLiteralAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_2(HMatch match) {
		org.gravity.typegraph.basic.annotations.TBoolNode tValue = (org.gravity.typegraph.basic.annotations.TBoolNode) match.getNodes()[2];
		org.eclipse.modisco.java.BooleanLiteral mValue = (org.eclipse.modisco.java.BooleanLiteral) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_1 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_1.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mValue.isValue(), "boolean"));
		csp_1.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tValue.isValue(), "boolean"));
		csp_1.solve();
		
		boolean predicate = csp_1.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

