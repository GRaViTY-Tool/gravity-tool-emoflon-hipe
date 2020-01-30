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

public class FieldName__CO_1236_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> tNameAttrMap = new HashMap<>();
	private Map<Object, Collection<HMatch>> mNameAttrMap = new HashMap<>();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(getSelf(), name2actor.get("FieldName__CO_1232_junction"), this::check_constraint_96));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		Object obj = message.node;
		if(obj instanceof org.gravity.typegraph.basic.TName) {
			if(tNameAttrMap.containsKey(obj)) {
				for(HMatch match : tNameAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		if(obj instanceof org.gravity.modisco.MName) {
			if(mNameAttrMap.containsKey(obj)) {
				for(HMatch match : mNameAttrMap.get(obj)) {
					for(Port<HMatch> port : ports) {
						port.sendAttributeChanged(message.initialMessage, match);
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_96(HMatch match) {
		org.gravity.modisco.MFieldName mFieldName = (org.gravity.modisco.MFieldName) match.getNodes()[1];
		org.gravity.typegraph.basic.TField tField = (org.gravity.typegraph.basic.TField) match.getNodes()[2];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_27 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_27.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, mFieldName.getMName(), "java.lang.String"));
		csp_27.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, tField.getTName(), "java.lang.String"));
		csp_27.solve();
		
		boolean predicate = csp_27.isSatisfied();
		match.setConstraintSatisfied(predicate);
		return predicate;
	}
	
}

