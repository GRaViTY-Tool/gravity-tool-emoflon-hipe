package org.gravity.modisco.processing.fwd.dataflow;

import static guru.nidi.graphviz.model.Factory.mutGraph;
import static guru.nidi.graphviz.model.Factory.mutNode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.Assignment;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.MethodInvocation;
import org.eclipse.modisco.java.NamedElement;
import org.eclipse.modisco.java.VariableDeclarationFragment;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MAnonymous;
import org.gravity.modisco.MGravityModel;

import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.attribute.RankDir;
import guru.nidi.graphviz.attribute.Style;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;

/**
 * Functionality to draw dot graphs with intra-procedural data flow edges for
 * method/field definitions of Java programs. The drawn graphs are based on the
 * program representations created by the data flow handlers.
 * 
 * @author dmebus
 *
 */
public class GraphVisualizer {

	private static final Logger LOGGER = Logger.getLogger(GraphVisualizer.class);

	private GraphVisualizer() {
		// This class shouldn't be instantiated
	}

	/**
	 * Draws the dot graphs for each StatementHandlerDataFlow instance in the given
	 * list. The graphs are exported as PNG image files to a folder with the given
	 * folder name (inside the project folder).
	 * 
	 * @param handlers   The list of StatementHandlerDataFlow instances, for which a
	 *                   graph is supposed to be drawn.
	 * 
	 * @param folderName The name, that should be given to the output folder. If a
	 *                   folder with that name already exists, it is used.
	 */
	public static void drawGraphs(List<StatementHandlerDataFlow> handlers, String folderName) {
		String projectName = ((MGravityModel) handlers.get(0).getMemberDef().eResource().getContents().get(0))
				.getName();
		for (int i = 0; i< handlers.size(); i++) {
			StatementHandlerDataFlow handler = handlers.get(i);
			EObject memberDef = handler.getMemberDef();
			String className = "Unknown";
			String memberName = ((NamedElement) memberDef).getName();
			String memberType = "Misc";
			EObject defContainer = memberDef.eContainer();
			if (memberDef instanceof MAbstractMethodDefinition) {
				memberType = "Method";
				if (defContainer instanceof MAnonymous) {
					className = "Anonymous-class";
				} else {
					className = ((NamedElement) defContainer).getName();
				}
			} else if (memberDef instanceof VariableDeclarationFragment) {
				memberType = "Field";
				className = ((NamedElement) defContainer.eContainer()).getName();
			}
			MutableGraph g = mutGraph("graph" + i).setDirected(true).graphAttrs().add(RankDir.TOP_TO_BOTTOM)
					.graphAttrs().add("dpi", 72);
			HashMap<FlowNode, MutableNode> graphNodes = new HashMap<>();
			// Creating a graph node for each FlowNode
			Collection<FlowNode> alreadySeenNodes = new ArrayList<>(handler.getAlreadySeen().values());
			for (FlowNode node : alreadySeenNodes) {
				MutableNode graphNode = getDotNode(node);
				g.add(graphNode);
				graphNodes.put(node, graphNode);
			}
			// Set containment edges (+ links to nodes of called/accessed methods/fields)
			// for all graph nodes
			drawContainmentEdges(handler, graphNodes, alreadySeenNodes);
			// Set flow edges
			drawFlowEdges(graphNodes, alreadySeenNodes);
			try {
				Graphviz.fromGraph(g).width(5000).render(Format.PNG)
						.toFile(new File(folderName + File.separator + projectName + File.separator + "Class-"
								+ className + "-" + memberType + "-" + memberName + ".png"));
			} catch (IOException e) {
				LOGGER.log(Level.ERROR, e.getMessage(), e);
			}
		}
	}

	/**
	 * Draws the flow edges between the graph nodes
	 * 
	 * @param graphNodes The nodes of the graph
	 * @param alreadySeenNodes 
	 */
	private static void drawFlowEdges(HashMap<FlowNode, MutableNode> graphNodes,
			Collection<FlowNode> alreadySeenNodes) {
		for (FlowNode node : alreadySeenNodes) {
			MutableNode graphNode = graphNodes.get(node);
			for (FlowNode out : node.getOutRef()) {
				MutableNode outNode = graphNodes.get(out);
				if (outNode != null) {
					graphNode.addLink(
							graphNode.linkTo(outNode).with(Style.DASHED, Label.of("flows to"), Color.BLUE));
				}
			}
		}
	}

	/**
	 * Set containment edges (+ links to nodes of called/accessed methods/fields)
	 * for all graph nodes
	 * 
	 * @param handler
	 * @param graphNodes The nodes of the graph
	 * @param alreadySeenNodes
	 */
	private static void drawContainmentEdges(StatementHandlerDataFlow handler,
			HashMap<FlowNode, MutableNode> graphNodes, Collection<FlowNode> alreadySeenNodes) {
		for (FlowNode node : alreadySeenNodes) {
			MutableNode graphNode = graphNodes.get(node);
			EObject modelElement = node.getModelElement();
			if (modelElement == null) {
				continue;
			}
			EObject eContainer = modelElement.eContainer();
			FlowNode flowCont = handler.getAlreadySeen().get(eContainer);
			if (flowCont == null) {
				continue;
			}
			if (modelElement instanceof MethodInvocation) {
				graphNode.addLink(graphNode
						.linkTo(getDotNode(handler.getFlowNodeForElement(((MethodInvocation) modelElement).getMethod()))
								.add(Style.FILLED, Color.GRAY))
						.with(Style.DOTTED, Label.of("calls"), Color.GRAY));
			}
			if (modelElement instanceof ClassInstanceCreation) {
				graphNode.addLink(graphNode.linkTo(
						getDotNode(handler.getFlowNodeForElement(((ClassInstanceCreation) modelElement).getMethod()))
								.add(Style.FILLED, Color.GRAY))
						.with(Style.DOTTED, Label.of("calls"), Color.GRAY));
			}
			graphNodes.get(flowCont).addLink(graphNode);
		}
	}

	/**
	 * Returns a (new) dot graph node for the given FlowNode. If the node already
	 * exists, the existing one is returned (by the mutNode constructor), so
	 * duplicates are prevented.
	 * 
	 * @param node The FlowNode, for which a dot graph node is requested.
	 * @return The requested dot graph node, which corresponds to the given
	 *         FlowNode.
	 */
	private static MutableNode getDotNode(FlowNode node) {
		EObject modelElement = node.getModelElement();
		MutableNode graphNode = null;
		if (modelElement != null) {
			String label = modelElement.eClass().getName();
			if (modelElement instanceof NamedElement) {
				String name = ((NamedElement) modelElement).getName();
				if (name != null) {
					label += " " + name;
				}
			}
			if (modelElement instanceof Assignment) {
				label += " " + ((Assignment) modelElement).getOperator().toString();
			}
			graphNode = mutNode(Integer.toString(modelElement.hashCode())).add(Label.of(label));
		} else {
			graphNode = mutNode(Integer.toString(node.hashCode())).add(Label.of("null"));
		}
		return graphNode;
	}
}
