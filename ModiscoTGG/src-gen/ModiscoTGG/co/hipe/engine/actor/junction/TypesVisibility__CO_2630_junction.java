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

public class TypesVisibility__CO_2630_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> modifierAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> tModifierAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("TypesVisibility__CO_2626_junction"), this::check_constraint_207));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> modifier_1_Matches = modifierAttrMap.get(matchObjects[1]);
		if(modifier_1_Matches == null) {
			modifier_1_Matches = new LinkedList<>();
			modifierAttrMap.put(matchObjects[1], modifier_1_Matches);
		}
		
		modifier_1_Matches.add(match);
		
		Collection<HMatch> tModifier_2_Matches = tModifierAttrMap.get(matchObjects[2]);
		if(tModifier_2_Matches == null) {
			tModifier_2_Matches = new LinkedList<>();
			tModifierAttrMap.put(matchObjects[2], tModifier_2_Matches);
		}
		
		tModifier_2_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = modifierAttrMap.get(matchObjects[1]);
		if(matches_0 != null) {
			matches.remove(match);
		}
		Collection<HMatch> matches_1 = tModifierAttrMap.get(matchObjects[2]);
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
	
	public boolean check_constraint_207(HMatch match) {
		org.gravity.typegraph.basic.TModifier tModifier = (org.gravity.typegraph.basic.TModifier) match.getNodes()[2];
		org.eclipse.modisco.java.Modifier mModifier = (org.eclipse.modisco.java.Modifier) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.modiscotgg.UserDefined_defaultVisibility csp_55 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.modiscotgg.UserDefined_defaultVisibility();
		csp_55.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mModifier.getVisibility(), "org.eclipse.modisco.java.VisibilityKind"));
		csp_55.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tModifier.getTVisibility(), "org.gravity.typegraph.basic.TVisibility"));
		csp_55.solve();
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_56 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_56.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mModifier.isStatic(), "boolean"));
		csp_56.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tModifier.isIsStatic(), "boolean"));
		csp_56.solve();
		
		boolean predicate = csp_55.isSatisfied() && csp_56.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

