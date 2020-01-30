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

public class AnnotationMemberKey__CC_1_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> tAnnotationValueAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> namedElementAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("AnnotationMemberKey__CC_production"), this::check_constraint_1));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> tAnnotationValue_1_Matches = tAnnotationValueAttrMap.get(matchObjects[1]);
		if(tAnnotationValue_1_Matches == null) {
			tAnnotationValue_1_Matches = new LinkedList<>();
			tAnnotationValueAttrMap.put(matchObjects[1], tAnnotationValue_1_Matches);
		}
		
		tAnnotationValue_1_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = tAnnotationValueAttrMap.get(matchObjects[1]);
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
		if(obj instanceof org.gravity.typegraph.basic.annotations.TAnnotationValue) {
			if(tAnnotationValueAttrMap.containsKey(obj)) {
				for(HMatch match : tAnnotationValueAttrMap.get(obj)) {
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
	
	public boolean check_constraint_1(HMatch match) {
		org.gravity.typegraph.basic.annotations.TAnnotationValue tAnnotationValue = (org.gravity.typegraph.basic.annotations.TAnnotationValue) match.getNodes()[1];
		org.eclipse.modisco.java.AnnotationMemberValuePair mValue = (org.eclipse.modisco.java.AnnotationMemberValuePair) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_0 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_0.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mValue.getName(), "java.lang.String"));
		csp_0.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tAnnotationValue.getTKey(), "java.lang.String"));
		csp_0.solve();
		
		boolean predicate = csp_0.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

