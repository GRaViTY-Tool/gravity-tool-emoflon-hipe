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
		
public class TClass_object_SP3 extends GenericObjectActor<org.gravity.typegraph.basic.TClass> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("AnonymousClassDeclarationToTClass_target_0_reference"), this::returnTrue));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("ClassInAnonymous__Marker_CONTEXT__TRG__tClass_0_reference"), this::returnTrue));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("PrimitiveTypeIsInt__Marker_CREATE__TRG__tPrimitiveClass_0_reference"), this::check_constraint_263));
		ports.add(new PortNodeRight<org.gravity.typegraph.basic.TClass>(getSelf(), name2actor.get("PrimitiveTypeToTClass_target_0_reference"), this::check_constraint_237));
	}
	
	public boolean check_constraint_263(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return String.valueOf(tPrimitiveClass.getTName()).equals("int") && tPrimitiveClass.isTLib()==true;
	}
	
	public boolean check_constraint_237(org.gravity.typegraph.basic.TClass tPrimitiveClass) {
		return String.valueOf(tPrimitiveClass.getTName()).equals("boolean") && tPrimitiveClass.isTLib()==true;
	}
	
}


