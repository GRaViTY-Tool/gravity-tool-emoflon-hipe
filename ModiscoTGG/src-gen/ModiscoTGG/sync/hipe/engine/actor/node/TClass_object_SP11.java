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
		
public class TClass_object_SP11 extends GenericObjectActor<org.gravity.typegraph.basic.TClass> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("Class__Marker_CREATE__TRG__tType_0_reference"), this::returnTrue));
		ports.add(new PortNodeLeft<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TClass_implements_0_reference"), this::check_constraint_31));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TypeGraph_classes_4_reference"), this::check_constraint_240));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TypeToTAbstractType_target_11_reference"), this::check_constraint_266));
	}
	
	public boolean check_constraint_31(org.gravity.typegraph.basic.TClass tClass) {
		return String.valueOf(tClass.getTName()).equals("Anonymous");
	}
	
	public boolean check_constraint_240(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return String.valueOf(tPrimitiveClass.getTName()).equals("char") && tPrimitiveClass.isTLib()==true;
	}
	
	public boolean check_constraint_266(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return String.valueOf(tPrimitiveClass.getTName()).equals("short") && tPrimitiveClass.isTLib()==true;
	}
	
}


