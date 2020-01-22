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

public class ModelToPg__CO_1871_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> typeGraphAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> modelAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, AbstractJunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(getSelf(), name2actor.get("ModelToPg__CO_production"), this::check_constraint_126));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> typeGraph_2_Matches = typeGraphAttrMap.get(matchObjects[2]);
		if(typeGraph_2_Matches == null) {
			typeGraph_2_Matches = new LinkedList<>();
			typeGraphAttrMap.put(matchObjects[2], typeGraph_2_Matches);
		}
		
		typeGraph_2_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = typeGraphAttrMap.get(matchObjects[2]);
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
		if(obj instanceof org.gravity.typegraph.basic.TypeGraph) {
			if(typeGraphAttrMap.containsKey(obj)) {
				for(HMatch match : typeGraphAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		if(obj instanceof org.eclipse.modisco.java.Model) {
			if(modelAttrMap.containsKey(obj)) {
				for(HMatch match : modelAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_126(HMatch match) {
		org.gravity.typegraph.basic.TypeGraph tPG = (org.gravity.typegraph.basic.TypeGraph) match.getNodes()[2];
		org.gravity.modisco.MGravityModel mModel = (org.gravity.modisco.MGravityModel) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_41 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_41.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mModel.getName(), "java.lang.String"));
		csp_41.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tPG.getTName(), "java.lang.String"));
		csp_41.solve();
		
		boolean predicate = csp_41.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

