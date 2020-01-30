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
		
public class MSingleVariableAccess_object_SP0 extends GenericObjectActor<org.gravity.modisco.MSingleVariableAccess> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MDefinition_mAbstractFieldAccess_1_reference"), this::returnTrue));
		ports.add(new PortNodeRight<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MDefinition_mAbstractFieldAccess_2_reference"), this::check_constraint_85));
		ports.add(new PortNodeRight<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MDefinition_mAbstractFieldAccess_3_reference"), this::check_constraint_92));
		ports.add(new PortNodeRight<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MSingleVariableAccessToTAccess_source_0_reference"), this::check_constraint_75));
	}
	
	public boolean check_constraint_85(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==0;
	}
	
	public boolean check_constraint_92(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==1;
	}
	
	public boolean check_constraint_75(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==2;
	}
	
}


