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

public class AnnotationMemberValueNumber__CO_231_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> numberLiteralAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> tNumberNodeAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("AnnotationMemberValueNumber__CO_production"), this::check_constraint_9));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> numberLiteral_5_Matches = numberLiteralAttrMap.get(matchObjects[5]);
		if(numberLiteral_5_Matches == null) {
			numberLiteral_5_Matches = new LinkedList<>();
			numberLiteralAttrMap.put(matchObjects[5], numberLiteral_5_Matches);
		}
		
		numberLiteral_5_Matches.add(match);
		
		Collection<HMatch> tNumberNode_1_Matches = tNumberNodeAttrMap.get(matchObjects[1]);
		if(tNumberNode_1_Matches == null) {
			tNumberNode_1_Matches = new LinkedList<>();
			tNumberNodeAttrMap.put(matchObjects[1], tNumberNode_1_Matches);
		}
		
		tNumberNode_1_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = numberLiteralAttrMap.get(matchObjects[5]);
		if(matches_0 != null) {
			matches.remove(match);
		}
		Collection<HMatch> matches_1 = tNumberNodeAttrMap.get(matchObjects[1]);
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
		if(obj instanceof org.eclipse.modisco.java.NumberLiteral) {
			if(numberLiteralAttrMap.containsKey(obj)) {
				for(HMatch match : numberLiteralAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		if(obj instanceof org.gravity.typegraph.basic.annotations.TNumberNode) {
			if(tNumberNodeAttrMap.containsKey(obj)) {
				for(HMatch match : tNumberNodeAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_9(HMatch match) {
		org.eclipse.modisco.java.NumberLiteral mValue = (org.eclipse.modisco.java.NumberLiteral) match.getNodes()[5];
		org.gravity.typegraph.basic.annotations.TNumberNode tValue = (org.gravity.typegraph.basic.annotations.TNumberNode) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_4 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_4.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mValue.getTokenValue(), "java.lang.String"));
		csp_4.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tValue.getTNumber(), "java.lang.String"));
		csp_4.solve();
		
		boolean predicate = csp_4.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

