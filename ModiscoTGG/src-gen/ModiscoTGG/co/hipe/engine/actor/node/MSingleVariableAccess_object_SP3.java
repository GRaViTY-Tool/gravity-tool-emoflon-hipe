package ModiscoTGG.co.hipe.engine.actor.node;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.actor.node.PortNode;
import hipe.engine.actor.node.PortNodeLeft;
import hipe.engine.actor.node.PortNodeRight;
import hipe.engine.actor.node.PortNodeMatch;
import hipe.engine.actor.node.PortNodeMatchLeft;
import hipe.engine.actor.node.PortNodeMatchRight;

import hipe.network.ObjectNode;

import hipe.generic.actor.GenericObjectActor;

import hipe.generic.actor.junction.util.HiPEConfig;
		
public class MSingleVariableAccess_object_SP3 extends GenericObjectActor<org.gravity.modisco.MSingleVariableAccess> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MAbstractFlowElementToTAbstractFlowElement_source_4_reference"), this::check_constraint_84));
		ports.add(new PortNodeRight<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MAbstractFlowElementToTAbstractFlowElement_source_5_reference"), this::check_constraint_91));
		ports.add(new PortNodeRight<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MDefinition_mAbstractFieldAccess_0_reference"), this::check_constraint_78));
	}
	
	public boolean check_constraint_84(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==0;
	}
	
	public boolean check_constraint_91(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==1;
	}
	
	public boolean check_constraint_78(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==2;
	}
	
}


