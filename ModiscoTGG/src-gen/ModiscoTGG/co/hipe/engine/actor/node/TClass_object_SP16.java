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
		
public class TClass_object_SP16 extends GenericObjectActor<org.gravity.typegraph.basic.TClass> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TClass_parentClass_1_reference"), this::returnTrue));
		ports.add(new PortNodeLeft<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TClass_pg_14_reference"), this::check_constraint_205));
		ports.add(new PortNodeLeft<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TClass_pg_6_reference"), this::check_constraint_156));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TypeGraph_classes_7_reference"), this::check_constraint_173));
	}
	
	public boolean check_constraint_205(org.gravity.typegraph.basic.TClass tClass) {
		return tClass.isTLib()==false && String.valueOf(tClass.getTName()).equals("T");
	}
	
	public boolean check_constraint_156(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return String.valueOf(tPrimitiveClass.getTName()).equals("byte") && tPrimitiveClass.isTLib()==true;
	}
	
	public boolean check_constraint_173(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return String.valueOf(tPrimitiveClass.getTName()).equals("int") && tPrimitiveClass.isTLib()==true;
	}
	
}


