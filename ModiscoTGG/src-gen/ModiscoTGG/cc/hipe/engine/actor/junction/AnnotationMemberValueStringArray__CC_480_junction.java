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

public class AnnotationMemberValueStringArray__CC_480_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> stringLiteralAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> tTextNodeAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("AnnotationMemberValueStringArray__CC_production"), this::check_constraint_17));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> stringLiteral_2_Matches = stringLiteralAttrMap.get(matchObjects[2]);
		if(stringLiteral_2_Matches == null) {
			stringLiteral_2_Matches = new LinkedList<>();
			stringLiteralAttrMap.put(matchObjects[2], stringLiteral_2_Matches);
		}
		
		stringLiteral_2_Matches.add(match);
		
		Collection<HMatch> tTextNode_4_Matches = tTextNodeAttrMap.get(matchObjects[4]);
		if(tTextNode_4_Matches == null) {
			tTextNode_4_Matches = new LinkedList<>();
			tTextNodeAttrMap.put(matchObjects[4], tTextNode_4_Matches);
		}
		
		tTextNode_4_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = stringLiteralAttrMap.get(matchObjects[2]);
		if(matches_0 != null) {
			matches.remove(match);
		}
		Collection<HMatch> matches_1 = tTextNodeAttrMap.get(matchObjects[4]);
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
	
	public boolean check_constraint_17(HMatch match) {
		org.eclipse.modisco.java.StringLiteral mValue = (org.eclipse.modisco.java.StringLiteral) match.getNodes()[2];
		org.gravity.typegraph.basic.annotations.TTextNode tValue = (org.gravity.typegraph.basic.annotations.TTextNode) match.getNodes()[4];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_10 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_10.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mValue.getEscapedValue(), "java.lang.String"));
		csp_10.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tValue.getTText(), "java.lang.String"));
		csp_10.solve();
		
		boolean predicate = csp_10.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

