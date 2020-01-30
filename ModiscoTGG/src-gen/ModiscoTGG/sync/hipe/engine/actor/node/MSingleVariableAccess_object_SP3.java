package ModiscoTGG.sync.hipe.engine.actor.node;

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
		ports.add(new PortNodeRight<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("FieldAccessWrite__Marker_CREATE__SRC__mAccess_0_reference"), this::check_constraint_133));
		ports.add(new PortNodeRight<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MDefinition_mAbstractFieldAccess_3_reference"), this::check_constraint_129));
		ports.add(new PortNodeRight<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MSingleVariableAccessToTAccess_source_0_reference"), this::check_constraint_108));
		ports.add(new PortNodeLeft<org.gravity.modisco.MSingleVariableAccess>(getSelf(), name2actor.get("MSingleVariableAccess_variable_1_reference"), this::check_constraint_118));
	}
	
	public boolean check_constraint_133(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==1;
	}
	
	public boolean check_constraint_129(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==1;
	}
	
	public boolean check_constraint_108(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==2;
	}
	
	public boolean check_constraint_118(org.gravity.modisco.MSingleVariableAccess mAccess) {
		return mAccess.getAccessKind().getValue()==0;
	}
	
}


