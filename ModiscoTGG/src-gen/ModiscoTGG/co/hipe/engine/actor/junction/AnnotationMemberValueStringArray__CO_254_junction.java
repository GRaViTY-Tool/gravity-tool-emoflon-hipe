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

import hipe.network.AbstractJunctionNode;

public class AnnotationMemberValueStringArray__CO_254_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> stringLiteralAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> tTextNodeAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("AnnotationMemberValueStringArray__CO_250_junction"), this::check_constraint_10));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> stringLiteral_1_Matches = stringLiteralAttrMap.get(matchObjects[1]);
		if(stringLiteral_1_Matches == null) {
			stringLiteral_1_Matches = new LinkedList<>();
			stringLiteralAttrMap.put(matchObjects[1], stringLiteral_1_Matches);
		}
		
		stringLiteral_1_Matches.add(match);
		
		Collection<HMatch> tTextNode_2_Matches = tTextNodeAttrMap.get(matchObjects[2]);
		if(tTextNode_2_Matches == null) {
			tTextNode_2_Matches = new LinkedList<>();
			tTextNodeAttrMap.put(matchObjects[2], tTextNode_2_Matches);
		}
		
		tTextNode_2_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = stringLiteralAttrMap.get(matchObjects[1]);
		if(matches_0 != null) {
			matches.remove(match);
		}
		Collection<HMatch> matches_1 = tTextNodeAttrMap.get(matchObjects[2]);
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
		if(obj instanceof org.eclipse.modisco.java.StringLiteral) {
			if(stringLiteralAttrMap.containsKey(obj)) {
				for(HMatch match : stringLiteralAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		if(obj instanceof org.gravity.typegraph.basic.annotations.TTextNode) {
			if(tTextNodeAttrMap.containsKey(obj)) {
				for(HMatch match : tTextNodeAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_10(HMatch match) {
		org.gravity.typegraph.basic.annotations.TTextNode tValue = (org.gravity.typegraph.basic.annotations.TTextNode) match.getNodes()[2];
		org.eclipse.modisco.java.StringLiteral mValue = (org.eclipse.modisco.java.StringLiteral) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_5 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_5.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mValue.getEscapedValue(), "java.lang.String"));
		csp_5.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tValue.getTText(), "java.lang.String"));
		csp_5.solve();
		
		boolean predicate = csp_5.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}
