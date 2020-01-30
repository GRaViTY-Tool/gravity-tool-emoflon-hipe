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
		
public class LineComment_object extends GenericObjectActor<org.eclipse.modisco.java.LineComment> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<org.eclipse.modisco.java.LineComment>(getSelf(), name2actor.get("LineCommentToTTextAnnotation_source_0_reference"), this::check_constraint_201));
		ports.add(new PortNodeRight<org.eclipse.modisco.java.LineComment>(getSelf(), name2actor.get("MDefinition_comments_0_reference"), this::check_constraint_200));
	}
	
	public boolean check_constraint_201(org.eclipse.modisco.java.LineComment mComment) {
		return mComment.isPrefixOfParent()==true;
	}
	
	public boolean check_constraint_200(org.eclipse.modisco.java.LineComment mComment) {
		return mComment.isPrefixOfParent()==true;
	}
	
}


