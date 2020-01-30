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
		
public class TClass_object_SP8 extends GenericObjectActor<org.gravity.typegraph.basic.TClass> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeLeft<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TClass_defines_2_reference"), this::returnTrue));
		ports.add(new PortNodeLeft<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TClass_implements_0_reference"), this::check_constraint_24));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TypeGraph_classes_5_reference"), this::check_constraint_165));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TypeToTAbstractType_target_11_reference"), this::check_constraint_182));
	}
	
	public boolean check_constraint_24(org.gravity.typegraph.basic.TClass tClass) {
		return String.valueOf(tClass.getTName()).equals("Anonymous");
	}
	
	public boolean check_constraint_165(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return tPrimitiveClass.isTLib()==true && String.valueOf(tPrimitiveClass.getTName()).equals("double");
	}
	
	public boolean check_constraint_182(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return String.valueOf(tPrimitiveClass.getTName()).equals("short") && tPrimitiveClass.isTLib()==true;
	}
	
}


