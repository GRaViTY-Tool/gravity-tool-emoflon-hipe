package ModiscoTGG.cc.hipe.engine.actor.node;

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
		
public class TClass_object_SP15 extends GenericObjectActor<org.gravity.typegraph.basic.TClass> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("Enum__Marker_CREATE__TRG__tType_0_reference"), this::returnTrue));
		ports.add(new PortNodeLeft<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TClass_pg_8_reference"), this::check_constraint_249));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TypeGraph_classes_10_reference"), this::check_constraint_275));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TypeGraph_classes_1_reference"), this::check_constraint_47));
	}
	
	public boolean check_constraint_249(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return String.valueOf(tPrimitiveClass.getTName()).equals("double") && tPrimitiveClass.isTLib()==true;
	}
	
	public boolean check_constraint_275(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return String.valueOf(tPrimitiveClass.getTName()).equals("void") && tPrimitiveClass.isTLib()==true;
	}
	
	public boolean check_constraint_47(org.gravity.typegraph.basic.TClass tAnonymous) {
		return tAnonymous.isTLib()==false && String.valueOf(tAnonymous.getTName()).equals("Anonymous");
	}
	
}


