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

public class MemberInClassVisibility__CC_3002_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> modifierAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> tModifierAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionLeft(getSelf(), name2actor.get("MemberInClassVisibility__CC_5409_nacjunction"), this::check_constraint_170));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> modifier_6_Matches = modifierAttrMap.get(matchObjects[6]);
		if(modifier_6_Matches == null) {
			modifier_6_Matches = new LinkedList<>();
			modifierAttrMap.put(matchObjects[6], modifier_6_Matches);
		}
		
		modifier_6_Matches.add(match);
		
		Collection<HMatch> tModifier_1_Matches = tModifierAttrMap.get(matchObjects[1]);
		if(tModifier_1_Matches == null) {
			tModifier_1_Matches = new LinkedList<>();
			tModifierAttrMap.put(matchObjects[1], tModifier_1_Matches);
		}
		
		tModifier_1_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = modifierAttrMap.get(matchObjects[6]);
		if(matches_0 != null) {
			matches.remove(match);
		}
		Collection<HMatch> matches_1 = tModifierAttrMap.get(matchObjects[1]);
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
		if(obj instanceof org.eclipse.modisco.java.Modifier) {
			if(modifierAttrMap.containsKey(obj)) {
				for(HMatch match : modifierAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		if(obj instanceof org.gravity.typegraph.basic.TModifier) {
			if(tModifierAttrMap.containsKey(obj)) {
				for(HMatch match : tModifierAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_170(HMatch match) {
		org.eclipse.modisco.java.Modifier mModifier = (org.eclipse.modisco.java.Modifier) match.getNodes()[6];
		org.gravity.typegraph.basic.TModifier tModifier = (org.gravity.typegraph.basic.TModifier) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.modiscotgg.UserDefined_defaultVisibility csp_72 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.modiscotgg.UserDefined_defaultVisibility();
		csp_72.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mModifier.getVisibility(), "org.eclipse.modisco.java.VisibilityKind"));
		csp_72.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tModifier.getTVisibility(), "org.gravity.typegraph.basic.TVisibility"));
		csp_72.solve();
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_73 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_73.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mModifier.isStatic(), "boolean"));
		csp_73.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tModifier.isIsStatic(), "boolean"));
		csp_73.solve();
		
		boolean predicate = csp_72.isSatisfied() && csp_73.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

