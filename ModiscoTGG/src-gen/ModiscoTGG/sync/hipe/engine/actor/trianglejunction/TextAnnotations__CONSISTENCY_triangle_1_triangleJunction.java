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

public class TextAnnotations__CONSISTENCY_triangle_1_triangleJunction extends GenericTriangleJunctionActor{
	private Map<Object, Collection<HMatch>> tTextAnnotationAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> commentAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, TriangleJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("TextAnnotations__CONSISTENCY_triangle_0_triangleJunction"), this::check_constraint_297));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> tTextAnnotation_1_Matches = tTextAnnotationAttrMap.get(matchObjects[1]);
		if(tTextAnnotation_1_Matches == null) {
			tTextAnnotation_1_Matches = new LinkedList<>();
			tTextAnnotationAttrMap.put(matchObjects[1], tTextAnnotation_1_Matches);
		}
		
		tTextAnnotation_1_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = tTextAnnotationAttrMap.get(matchObjects[1]);
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
		if(obj instanceof org.gravity.typegraph.basic.annotations.TTextAnnotation) {
			if(tTextAnnotationAttrMap.containsKey(obj)) {
				for(HMatch match : tTextAnnotationAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		if(obj instanceof org.eclipse.modisco.java.Comment) {
			if(commentAttrMap.containsKey(obj)) {
				for(HMatch match : commentAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_297(HMatch match) {
		org.eclipse.modisco.java.LineComment mComment = (org.eclipse.modisco.java.LineComment) match.getNodes()[3];
		org.gravity.typegraph.basic.annotations.TTextAnnotation tText = (org.gravity.typegraph.basic.annotations.TTextAnnotation) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_60 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_60.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mComment.getContent(), "java.lang.String"));
		csp_60.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tText.getText(), "java.lang.String"));
		csp_60.solve();
		
		boolean predicate = csp_60.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

