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
		
public class TClass_object_SP10 extends GenericObjectActor<org.gravity.typegraph.basic.TClass> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("AnonymousClassTypeClass__Marker_CONTEXT__TRG__tClass_0_reference"), this::check_constraint_25));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("ClassInnerClassMember__Marker_CONTEXT__TRG__tOuterClass_0_reference"), this::returnTrue));
		ports.add(new PortNodeLeft<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TClass_pg_7_reference"), this::check_constraint_239));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("TypeGraph_classes_9_reference"), this::check_constraint_265));
	}
	
	public boolean check_constraint_25(org.gravity.typegraph.basic.TClass tClass) {
		return String.valueOf(tClass.getTName()).equals("Anonymous");
	}
	
	public boolean check_constraint_239(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return tPrimitiveClass.isTLib()==true && String.valueOf(tPrimitiveClass.getTName()).equals("char");
	}
	
	public boolean check_constraint_265(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return String.valueOf(tPrimitiveClass.getTName()).equals("short") && tPrimitiveClass.isTLib()==true;
	}
	
}


