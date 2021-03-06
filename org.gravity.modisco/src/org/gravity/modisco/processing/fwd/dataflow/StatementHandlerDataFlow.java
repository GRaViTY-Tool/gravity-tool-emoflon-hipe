package org.gravity.modisco.processing.fwd.dataflow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AssertStatement;
import org.eclipse.modisco.java.Block;
import org.eclipse.modisco.java.BreakStatement;
import org.eclipse.modisco.java.CatchClause;
import org.eclipse.modisco.java.ConstructorInvocation;
import org.eclipse.modisco.java.ContinueStatement;
import org.eclipse.modisco.java.DoStatement;
import org.eclipse.modisco.java.EmptyStatement;
import org.eclipse.modisco.java.EnhancedForStatement;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.ExpressionStatement;
import org.eclipse.modisco.java.ForStatement;
import org.eclipse.modisco.java.IfStatement;
import org.eclipse.modisco.java.LabeledStatement;
import org.eclipse.modisco.java.ReturnStatement;
import org.eclipse.modisco.java.Statement;
import org.eclipse.modisco.java.SuperConstructorInvocation;
import org.eclipse.modisco.java.SwitchCase;
import org.eclipse.modisco.java.SwitchStatement;
import org.eclipse.modisco.java.SynchronizedStatement;
import org.eclipse.modisco.java.ThrowStatement;
import org.eclipse.modisco.java.TryStatement;
import org.eclipse.modisco.java.TypeDeclarationStatement;
import org.eclipse.modisco.java.UnresolvedLabeledStatement;
import org.eclipse.modisco.java.VariableDeclarationFragment;
import org.eclipse.modisco.java.VariableDeclarationStatement;
import org.eclipse.modisco.java.WhileStatement;
import org.gravity.modisco.MDefinition;

/**
 * A statement handler for all kinds of java statements, which determines the
 * data flow between statements. The inter-statement flow is used to derive
 * inter-member flow, which is stored in the corresponding fields of each
 * handler.
 * 
 * @author dmebus
 *
 */
public class StatementHandlerDataFlow {

	private static final Logger LOGGER = Logger.getLogger(StatementHandlerDataFlow.class);

	/**
	 * The accesses observed in the member corresponding to this handler.
	 */
	private final Set<FlowNode> memberRef = new HashSet<>();

	/**
	 * The statements and expressions, which have already been processed, associated
	 * with their FlowNode representations.
	 */
	private Map<EObject, FlowNode> alreadySeen = new HashMap<>();

	/**
	 * The member definition corresponding to this handler.
	 */
	private EObject memberDef;

	/**
	 * The expression handler associated with this statement handler.
	 */
	private ExpressionHandlerDataFlow expressionHandler;

	/**
	 * The misc handler associated with this statement handler.
	 */
	private MiscHandlerDataFlow miscHandler;

	public StatementHandlerDataFlow(MDefinition correspondingMember) {
		memberDef = correspondingMember;
		expressionHandler = new ExpressionHandlerDataFlow(this);
		miscHandler = new MiscHandlerDataFlow(this);
	}

	public StatementHandlerDataFlow(VariableDeclarationFragment correspondingMember) {
		memberDef = correspondingMember;
		expressionHandler = new ExpressionHandlerDataFlow(this);
		miscHandler = new MiscHandlerDataFlow(this);
	}

	public FlowNode handle(Statement statement) {
		if (statement instanceof AssertStatement) {
			AssertStatement assertStatement = (AssertStatement) statement;
			return handle(assertStatement);

		} else if (statement instanceof Block) {
			Block block = (Block) statement;
			return handle(block);

		} else if (statement instanceof BreakStatement) {
			BreakStatement breakStatement = (BreakStatement) statement;
			return handle(breakStatement);

		} else if (statement instanceof CatchClause) {
			CatchClause catchClause = (CatchClause) statement;
			return handle(catchClause);

		} else if (statement instanceof ConstructorInvocation) {
			ConstructorInvocation constructorInvocation = (ConstructorInvocation) statement;
			return handle(constructorInvocation);

		} else if (statement instanceof ContinueStatement) {
			ContinueStatement continueStatement = (ContinueStatement) statement;
			return handle(continueStatement);

		} else if (statement instanceof DoStatement) {
			DoStatement doStatement = (DoStatement) statement;
			return handle(doStatement);

		} else if (statement instanceof EmptyStatement) {
			return null;
		} else if (statement instanceof EnhancedForStatement) {
			EnhancedForStatement enhancedForStetement = (EnhancedForStatement) statement;
			return handle(enhancedForStetement);

		} else if (statement instanceof ExpressionStatement) {
			ExpressionStatement expressionStatement = (ExpressionStatement) statement;
			return handle(expressionStatement);

		} else if (statement instanceof ForStatement) {
			ForStatement forStatement = (ForStatement) statement;
			return handle(forStatement);

		} else if (statement instanceof IfStatement) {
			IfStatement ifStatement = (IfStatement) statement;
			return handle(ifStatement);

		} else if (statement instanceof LabeledStatement) {
			LabeledStatement labeledStatement = (LabeledStatement) statement;
			return handle(labeledStatement);

		} else if (statement instanceof ReturnStatement) {
			ReturnStatement returnStatement = (ReturnStatement) statement;
			return handle(returnStatement);

		} else if (statement instanceof SuperConstructorInvocation) {
			SuperConstructorInvocation superConstructorInvocation = (SuperConstructorInvocation) statement;
			return handle(superConstructorInvocation);

		} else if (statement instanceof SwitchCase) {
			SwitchCase switchCase = (SwitchCase) statement;
			return handle(switchCase);

		} else if (statement instanceof SwitchStatement) {
			SwitchStatement switchStatement = (SwitchStatement) statement;
			return handle(switchStatement);

		} else if (statement instanceof SynchronizedStatement) {
			SynchronizedStatement synchronizedStatement = (SynchronizedStatement) statement;
			return handle(synchronizedStatement);

		} else if (statement instanceof ThrowStatement) {
			ThrowStatement throwStatement = (ThrowStatement) statement;
			return handle(throwStatement);

		} else if (statement instanceof TryStatement) {
			TryStatement tryStatement = (TryStatement) statement;
			return handle(tryStatement);

		} else if (statement instanceof TypeDeclarationStatement) {
			TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement) statement;
			return handle(typeDeclarationStatement);

		} else if (statement instanceof UnresolvedLabeledStatement) {
			UnresolvedLabeledStatement unresolvedLabeledStatement = (UnresolvedLabeledStatement) statement;
			return handle(unresolvedLabeledStatement);

		} else if (statement instanceof VariableDeclarationStatement) {
			VariableDeclarationStatement variableDeclarationStatement = (VariableDeclarationStatement) statement;
			return handle(variableDeclarationStatement);

		} else if (statement instanceof WhileStatement) {
			WhileStatement whileStatement = (WhileStatement) statement;
			return handle(whileStatement);

		} else {
			return null;
		}
	}

	private FlowNode handle(WhileStatement whileStatement) {
		FlowNode member = getFlowNodeForElement(whileStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(whileStatement.getBody());
		member.addInRef(expressionHandler.handle(whileStatement.getExpression()));
		return member;
	}

	private FlowNode handle(VariableDeclarationStatement variableDeclarationStatement) {
		FlowNode member = getFlowNodeForElement(variableDeclarationStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (VariableDeclarationFragment fragment : variableDeclarationStatement.getFragments()) {
			miscHandler.handle(fragment);
		}
		return member;
	}

	private FlowNode handle(TypeDeclarationStatement typeDeclarationStatement) {
		FlowNode member = getFlowNodeForElement(typeDeclarationStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		miscHandler.handle(typeDeclarationStatement.getDeclaration());
		return member;
	}

	private FlowNode handle(TryStatement tryStatement) {
		FlowNode member = getFlowNodeForElement(tryStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(tryStatement.getBody());
		Block finallyBlock = tryStatement.getFinally();
		if (finallyBlock != null) {
			handle(finallyBlock);
		}
		for (CatchClause clause : tryStatement.getCatchClauses()) {
			handle(clause);
		}
		return member;
	}

	private FlowNode handle(ThrowStatement throwStatement) {
		FlowNode member = getFlowNodeForElement(throwStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		expressionHandler.handle(throwStatement.getExpression());
		return member;
	}

	private FlowNode handle(SynchronizedStatement synchronizedStatement) {
		FlowNode member = getFlowNodeForElement(synchronizedStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(synchronizedStatement.getBody());
		expressionHandler.handle(synchronizedStatement.getExpression());
		return member;
	}

	private FlowNode handle(SwitchStatement switchStatement) {
		FlowNode member = getFlowNodeForElement(switchStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (Statement statement : switchStatement.getStatements()) {
			handle(statement);
		}
		member.addInRef(expressionHandler.handle(switchStatement.getExpression()));
		return member;
	}

	private FlowNode handle(SwitchCase switchCase) {
		FlowNode member = getFlowNodeForElement(switchCase);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		Expression expression = switchCase.getExpression();
		if (expression != null) {
			member.addInRef(expressionHandler.handle(expression));
		}
		return member;
	}

	private FlowNode handle(SuperConstructorInvocation superConstructorInvocation) {
		FlowNode member = getFlowNodeForElement(superConstructorInvocation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		expressionHandler.handle(superConstructorInvocation.getExpression());
		for (Expression argument : superConstructorInvocation.getArguments()) {
			expressionHandler.handle(argument);
		}
		return member;
	}

	private FlowNode handle(ReturnStatement returnStatement) {
		FlowNode member = getFlowNodeForElement(returnStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		expressionHandler.handle(returnStatement.getExpression());
		return member;
	}

	private FlowNode handle(LabeledStatement labeledStatement) {
		FlowNode member = getFlowNodeForElement(labeledStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		if (labeledStatement != null) {
			handle(labeledStatement.getBody());
		}
		return member;
	}

	private FlowNode handle(IfStatement ifStatement) {
		FlowNode member = getFlowNodeForElement(ifStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(ifStatement.getElseStatement());
		handle(ifStatement.getThenStatement());
		member.addInRef(expressionHandler.handle(ifStatement.getExpression()));
		return member;
	}

	private FlowNode handle(ForStatement forStatement) {
		FlowNode member = getFlowNodeForElement(forStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(forStatement.getBody());
		Expression expression = forStatement.getExpression();
		if (expression != null) {
			member.addInRef(expressionHandler.handle(expression));
		}
		for (Expression initializer : forStatement.getInitializers()) {
			expressionHandler.handle(initializer);
		}
		for (Expression updater : forStatement.getUpdaters()) {
			expressionHandler.handle(updater);
		}
		return member;
	}

	private FlowNode handle(ExpressionStatement expressionStatement) {
		FlowNode member = getFlowNodeForElement(expressionStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		expressionHandler.handle(expressionStatement.getExpression());
		return member;
	}

	private FlowNode handle(EnhancedForStatement enhancedForStatement) {
		FlowNode member = getFlowNodeForElement(enhancedForStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(enhancedForStatement.getBody());
		member.addInRef(expressionHandler.handle(enhancedForStatement.getExpression()));
		return member;
	}

	private FlowNode handle(DoStatement doStatement) {
		FlowNode member = getFlowNodeForElement(doStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(doStatement.getBody());
		member.addInRef(expressionHandler.handle(doStatement.getExpression()));
		return member;
	}

	private FlowNode handle(ContinueStatement continueStatement) {
		return handle(continueStatement.getLabel());
	}

	private FlowNode handle(ConstructorInvocation constructorInvocation) {
		FlowNode member = getFlowNodeForElement(constructorInvocation);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		AbstractMethodDeclaration calledMethod = constructorInvocation.getMethod();
		getFlowNodeForElement(calledMethod); // Creating just a FlowNode for the called method; no handling needed
		EList<Expression> arguments = constructorInvocation.getArguments();
		if (!arguments.isEmpty()) {
			for (Expression argument : arguments) {
				FlowNode argumentNode = expressionHandler.handle(argument);
				FlowNode paramNode = miscHandler.handle(calledMethod.getParameters().get(arguments.indexOf(argument)));
				argumentNode.addOutRef(paramNode);
			}
			getMemberRef().add(member);
		}
		getMemberRef().add(member);
		EObject container = constructorInvocation.eContainer();
		if (container instanceof Expression) {
			expressionHandler.handle((Expression) container).addInRef(member);
		} else if (container instanceof Statement) {
			handle((Statement) container).addInRef(member);
		} else {
			LOGGER.log(Level.INFO, "ERROR: Unknown element type " + container.getClass().getName()
					+ " found in ConstructorInvocation handling.");
		}
		return member;
	}

	private FlowNode handle(BreakStatement breakStatement) {
		return handle(breakStatement.getLabel());
	}

	private FlowNode handle(CatchClause catchClause) {
		FlowNode member = getFlowNodeForElement(catchClause);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		handle(catchClause.getBody());
		miscHandler.handle(catchClause.getException());
		return member;
	}

	private FlowNode handle(AssertStatement assertStatement) {
		FlowNode member = getFlowNodeForElement(assertStatement);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		member.addInRef(expressionHandler.handle(assertStatement.getExpression()));
		expressionHandler.handle(assertStatement.getMessage());
		return member;
	}

	private FlowNode handle(Block block) {
		FlowNode member = getFlowNodeForElement(block);
		if (member.isFromAlreadySeen()) {
			return member;
		}
		for (Statement statement : block.getStatements()) {
			handle(statement);
		}
		return member;
	}

	public Set<FlowNode> getMemberRef() {
		return memberRef;
	}

	public Map<EObject, FlowNode> getAlreadySeen() {
		return alreadySeen;
	}

	public void setAlreadySeen(Map<EObject, FlowNode> nodeMap) {
		alreadySeen = nodeMap;
	}

	public EObject getMemberDef() {
		return memberDef;
	}

	public ExpressionHandlerDataFlow getExpressionHandler() {
		return expressionHandler;
	}

	public MiscHandlerDataFlow getMiscHandler() {
		return miscHandler;
	}

	/**
	 * Checks, if a (non-null) FlowNode has already been created for the given
	 * element and returns it. Otherwise a new FlowNode is created, inserted into
	 * alreadySeen and returned.
	 * 
	 * @param element The element, for which the check is performed.
	 * @return If already present, the FlowNode for the given element. A new
	 *         FlowNode for the element otherwise.
	 */
	FlowNode getFlowNodeForElement(EObject element) {
		FlowNode seenNode = alreadySeen.get(element);
		if (seenNode != null) { // making sure, that null references lead to creation of new nodes
			seenNode.setFromAlreadySeen();
			return seenNode;
		}
		FlowNode member = new FlowNode(element);
		alreadySeen.put(element, member);
		return member;
	}
}
