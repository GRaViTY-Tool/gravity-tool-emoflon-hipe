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
		
public class TClass_object_SP20 extends GenericObjectActor<org.gravity.typegraph.basic.TClass> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("ClassDeclarationToTClass_target_0_reference"), this::returnTrue));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("LinkDefinitionToAnonymous__Marker_CONTEXT__TRG__tType_0_reference"), this::returnTrue));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("SyntethicMethod__Marker_CONTEXT__TRG__tClass_0_reference"), this::returnTrue));
		ports.add(new PortNodeLeft<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TClass_pg_9_reference"), this::check_constraint_249));
	}
	
	public boolean check_constraint_249(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return tPrimitiveClass.isTLib()==true && String.valueOf(tPrimitiveClass.getTName()).equals("float");
	}
	
}


