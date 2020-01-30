package ModiscoTGG.cc.hipe.engine.actor;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import hipe.engine.message.NewInput;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NotificationMessage;

import hipe.generic.actor.junction.util.HiPEConfig;

public class NotificationActor extends AbstractActor {
	
	private Queue<Notification> notificationCache = new LinkedBlockingQueue<Notification>();
	private ActorRef dispatchActor;
	private Set<Object> discoveredObjects = Collections.synchronizedSet(new LinkedHashSet<>());
	
	private Map<Object, Function<EObject, Collection<EObject>>> explorationConsumer = new HashMap<>();
	
	private int counter = 0;
	public long time = 0;
	public long tell_time = 0;
	
	public NotificationActor(ActorRef dispatchActor) {
		this.dispatchActor = dispatchActor;
		initializeExploration();
	}
	
	private void initializeExploration() {
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getArrayLengthAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ArrayLengthAccess _arraylengthaccess = (org.eclipse.modisco.java.ArrayLengthAccess) obj;
			children.addAll(_arraylengthaccess.getComments());
			if(_arraylengthaccess.getArray() != null)
				children.add(_arraylengthaccess.getArray());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getASTNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ASTNode _astnode = (org.eclipse.modisco.java.ASTNode) obj;
			children.addAll(_astnode.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractMethodDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.AbstractMethodDeclaration _abstractmethoddeclaration = (org.eclipse.modisco.java.AbstractMethodDeclaration) obj;
			children.addAll(_abstractmethoddeclaration.getComments());
			children.addAll(_abstractmethoddeclaration.getAnnotations());
			if(_abstractmethoddeclaration.getModifier() != null)
				children.add(_abstractmethoddeclaration.getModifier());
			if(_abstractmethoddeclaration.getBody() != null)
				children.add(_abstractmethoddeclaration.getBody());
			children.addAll(_abstractmethoddeclaration.getParameters());
			children.addAll(_abstractmethoddeclaration.getThrownExceptions());
			children.addAll(_abstractmethoddeclaration.getTypeParameters());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getImportDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ImportDeclaration _importdeclaration = (org.eclipse.modisco.java.ImportDeclaration) obj;
			children.addAll(_importdeclaration.getComments());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getLinkDefinitionToType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getThisExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ThisExpression _thisexpression = (org.eclipse.modisco.java.ThisExpression) obj;
			children.addAll(_thisexpression.getComments());
			if(_thisexpression.getQualifier() != null)
				children.add(_thisexpression.getQualifier());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getUnresolvedTypeDeclaration__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMSingleVariableAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MSingleVariableAccess _msinglevariableaccess = (org.gravity.modisco.MSingleVariableAccess) obj;
			children.addAll(_msinglevariableaccess.getComments());
			if(_msinglevariableaccess.getQualifier() != null)
				children.add(_msinglevariableaccess.getQualifier());
			children.addAll(_msinglevariableaccess.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTSignatureContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldSignature__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMSuperMethodInvocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MSuperMethodInvocation _msupermethodinvocation = (org.gravity.modisco.MSuperMethodInvocation) obj;
			children.addAll(_msupermethodinvocation.getComments());
			if(_msupermethodinvocation.getQualifier() != null)
				children.add(_msupermethodinvocation.getQualifier());
			children.addAll(_msupermethodinvocation.getArguments());
			children.addAll(_msupermethodinvocation.getTypeArguments());
			children.addAll(_msupermethodinvocation.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getMemberRef(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.MemberRef _memberref = (org.eclipse.modisco.java.MemberRef) obj;
			children.addAll(_memberref.getComments());
			if(_memberref.getQualifier() != null)
				children.add(_memberref.getQualifier());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMemberInEnumVisibility__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPackageToPGPackage__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getBlockComment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.BlockComment _blockcomment = (org.eclipse.modisco.java.BlockComment) obj;
			children.addAll(_blockcomment.getComments());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMFieldDefinition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MFieldDefinition _mfielddefinition = (org.gravity.modisco.MFieldDefinition) obj;
			children.addAll(_mfielddefinition.getComments());
			children.addAll(_mfielddefinition.getAnnotations());
			if(_mfielddefinition.getModifier() != null)
				children.add(_mfielddefinition.getModifier());
			children.addAll(_mfielddefinition.getOwnedFlows());
			if(_mfielddefinition.getType() != null)
				children.add(_mfielddefinition.getType());
			children.addAll(_mfielddefinition.getFragments());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSyntethicMethodToTSyntethicMethod(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedItemAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedItemAccess _unresolveditemaccess = (org.eclipse.modisco.java.UnresolvedItemAccess) obj;
			children.addAll(_unresolveditemaccess.getComments());
			if(_unresolveditemaccess.getQualifier() != null)
				children.add(_unresolveditemaccess.getQualifier());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getParameterizedType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ParameterizedType _parameterizedtype = (org.eclipse.modisco.java.ParameterizedType) obj;
			children.addAll(_parameterizedtype.getComments());
			if(_parameterizedtype.getType() != null)
				children.add(_parameterizedtype.getType());
			children.addAll(_parameterizedtype.getTypeArguments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getIfStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.IfStatement _ifstatement = (org.eclipse.modisco.java.IfStatement) obj;
			children.addAll(_ifstatement.getComments());
			if(_ifstatement.getExpression() != null)
				children.add(_ifstatement.getExpression());
			if(_ifstatement.getThenStatement() != null)
				children.add(_ifstatement.getThenStatement());
			if(_ifstatement.getElseStatement() != null)
				children.add(_ifstatement.getElseStatement());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Expression _expression = (org.eclipse.modisco.java.Expression) obj;
			children.addAll(_expression.getComments());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMSignature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MSignature _msignature = (org.gravity.modisco.MSignature) obj;
			children.addAll(_msignature.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueStringArray__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTFieldSignatureContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationOnBodyDeclaration__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTName(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMModifierToTModifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getInitializer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Initializer _initializer = (org.eclipse.modisco.java.Initializer) obj;
			children.addAll(_initializer.getComments());
			children.addAll(_initializer.getAnnotations());
			if(_initializer.getModifier() != null)
				children.add(_initializer.getModifier());
			if(_initializer.getBody() != null)
				children.add(_initializer.getBody());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueAnnotationArray__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTypeDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.TypeDeclaration _typedeclaration = (org.eclipse.modisco.java.TypeDeclaration) obj;
			children.addAll(_typedeclaration.getComments());
			children.addAll(_typedeclaration.getAnnotations());
			if(_typedeclaration.getModifier() != null)
				children.add(_typedeclaration.getModifier());
			children.addAll(_typedeclaration.getBodyDeclarations());
			children.addAll(_typedeclaration.getCommentsBeforeBody());
			children.addAll(_typedeclaration.getCommentsAfterBody());
			children.addAll(_typedeclaration.getSuperInterfaces());
			children.addAll(_typedeclaration.getTypeParameters());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMemberInAnnotationVisibility__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getEnhancedForStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.EnhancedForStatement _enhancedforstatement = (org.eclipse.modisco.java.EnhancedForStatement) obj;
			children.addAll(_enhancedforstatement.getComments());
			if(_enhancedforstatement.getBody() != null)
				children.add(_enhancedforstatement.getBody());
			if(_enhancedforstatement.getExpression() != null)
				children.add(_enhancedforstatement.getExpression());
			if(_enhancedforstatement.getParameter() != null)
				children.add(_enhancedforstatement.getParameter());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedAnnotationTypeMemberDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedAnnotationTypeMemberDeclaration _unresolvedannotationtypememberdeclaration = (org.eclipse.modisco.java.UnresolvedAnnotationTypeMemberDeclaration) obj;
			children.addAll(_unresolvedannotationtypememberdeclaration.getComments());
			children.addAll(_unresolvedannotationtypememberdeclaration.getAnnotations());
			if(_unresolvedannotationtypememberdeclaration.getModifier() != null)
				children.add(_unresolvedannotationtypememberdeclaration.getModifier());
			if(_unresolvedannotationtypememberdeclaration.getDefault() != null)
				children.add(_unresolvedannotationtypememberdeclaration.getDefault());
			if(_unresolvedannotationtypememberdeclaration.getType() != null)
				children.add(_unresolvedannotationtypememberdeclaration.getType());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getLineCommentToTTextAnnotation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getClassFile(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ClassFile _classfile = (org.eclipse.modisco.java.ClassFile) obj;
			children.addAll(_classfile.getComments());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueAnnotation__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getLinkDefinitionToAnonymous__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTryStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.TryStatement _trystatement = (org.eclipse.modisco.java.TryStatement) obj;
			children.addAll(_trystatement.getComments());
			if(_trystatement.getBody() != null)
				children.add(_trystatement.getBody());
			if(_trystatement.getFinally() != null)
				children.add(_trystatement.getFinally());
			children.addAll(_trystatement.getCatchClauses());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTypeParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.TypeParameter _typeparameter = (org.eclipse.modisco.java.TypeParameter) obj;
			children.addAll(_typeparameter.getComments());
			children.addAll(_typeparameter.getBounds());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClass__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTPackage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TPackage _tpackage = (org.gravity.typegraph.basic.TPackage) obj;
			children.addAll(_tpackage.getTAnnotation());
			children.addAll(_tpackage.getSubpackage());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPackageAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PackageAccess _packageaccess = (org.eclipse.modisco.java.PackageAccess) obj;
			children.addAll(_packageaccess.getComments());
			if(_packageaccess.getQualifier() != null)
				children.add(_packageaccess.getQualifier());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PrimitiveType _primitivetype = (org.eclipse.modisco.java.PrimitiveType) obj;
			children.addAll(_primitivetype.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedEnumDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedEnumDeclaration _unresolvedenumdeclaration = (org.eclipse.modisco.java.UnresolvedEnumDeclaration) obj;
			children.addAll(_unresolvedenumdeclaration.getComments());
			children.addAll(_unresolvedenumdeclaration.getAnnotations());
			if(_unresolvedenumdeclaration.getModifier() != null)
				children.add(_unresolvedenumdeclaration.getModifier());
			children.addAll(_unresolvedenumdeclaration.getBodyDeclarations());
			children.addAll(_unresolvedenumdeclaration.getCommentsBeforeBody());
			children.addAll(_unresolvedenumdeclaration.getCommentsAfterBody());
			children.addAll(_unresolvedenumdeclaration.getSuperInterfaces());
			children.addAll(_unresolvedenumdeclaration.getEnumConstants());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTCall(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TCall _tcall = (org.gravity.typegraph.basic.TCall) obj;
			children.addAll(_tcall.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodInvocation__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getNestedInterfaceInType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterfaceDeclarationToTInterface(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTMemberContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsShort__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractFlowElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TAbstractFlowElement _tabstractflowelement = (org.gravity.typegraph.basic.TAbstractFlowElement) obj;
			children.addAll(_tabstractflowelement.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTEnum(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TEnum _tenum = (org.gravity.typegraph.basic.TEnum) obj;
			children.addAll(_tenum.getTValues());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedType _unresolvedtype = (org.eclipse.modisco.java.UnresolvedType) obj;
			children.addAll(_unresolvedtype.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeDouble(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PrimitiveTypeDouble _primitivetypedouble = (org.eclipse.modisco.java.PrimitiveTypeDouble) obj;
			children.addAll(_primitivetypedouble.getComments());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getNestedClassInType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsChar__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getCharacterLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.CharacterLiteral _characterliteral = (org.eclipse.modisco.java.CharacterLiteral) obj;
			children.addAll(_characterliteral.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getDoStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.DoStatement _dostatement = (org.eclipse.modisco.java.DoStatement) obj;
			children.addAll(_dostatement.getComments());
			if(_dostatement.getExpression() != null)
				children.add(_dostatement.getExpression());
			if(_dostatement.getBody() != null)
				children.add(_dostatement.getBody());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPostfixExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PostfixExpression _postfixexpression = (org.eclipse.modisco.java.PostfixExpression) obj;
			children.addAll(_postfixexpression.getComments());
			if(_postfixexpression.getOperand() != null)
				children.add(_postfixexpression.getOperand());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getSuperConstructorInvocation__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.annotations.TAnnotationValue _tannotationvalue = (org.gravity.typegraph.basic.annotations.TAnnotationValue) obj;
			children.addAll(_tannotationvalue.getTValue());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModifierToTClassEntity(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTypeAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.TypeAccess _typeaccess = (org.eclipse.modisco.java.TypeAccess) obj;
			children.addAll(_typeaccess.getComments());
			if(_typeaccess.getQualifier() != null)
				children.add(_typeaccess.getQualifier());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodInvocationRecursive__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getParenthesizedExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ParenthesizedExpression _parenthesizedexpression = (org.eclipse.modisco.java.ParenthesizedExpression) obj;
			children.addAll(_parenthesizedexpression.getComments());
			if(_parenthesizedexpression.getExpression() != null)
				children.add(_parenthesizedexpression.getExpression());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSuperFieldAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.SuperFieldAccess _superfieldaccess = (org.eclipse.modisco.java.SuperFieldAccess) obj;
			children.addAll(_superfieldaccess.getComments());
			if(_superfieldaccess.getQualifier() != null)
				children.add(_superfieldaccess.getQualifier());
			if(_superfieldaccess.getField() != null)
				children.add(_superfieldaccess.getField());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeToTClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodName__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodOverriding__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTInterface(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TInterface _tinterface = (org.gravity.typegraph.basic.TInterface) obj;
			children.addAll(_tinterface.getTAnnotation());
			if(_tinterface.getTModifier() != null)
				children.add(_tinterface.getTModifier());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getNumberLiteralToTNumberNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTTypeContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeShort(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PrimitiveTypeShort _primitivetypeshort = (org.eclipse.modisco.java.PrimitiveTypeShort) obj;
			children.addAll(_primitivetypeshort.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedVariableDeclarationFragment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedVariableDeclarationFragment _unresolvedvariabledeclarationfragment = (org.eclipse.modisco.java.UnresolvedVariableDeclarationFragment) obj;
			children.addAll(_unresolvedvariabledeclarationfragment.getComments());
			if(_unresolvedvariabledeclarationfragment.getInitializer() != null)
				children.add(_unresolvedvariabledeclarationfragment.getInitializer());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMGravityModel(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MGravityModel _mgravitymodel = (org.gravity.modisco.MGravityModel) obj;
			children.addAll(_mgravitymodel.getOwnedElements());
			children.addAll(_mgravitymodel.getOrphanTypes());
			children.addAll(_mgravitymodel.getUnresolvedItems());
			children.addAll(_mgravitymodel.getCompilationUnits());
			children.addAll(_mgravitymodel.getClassFiles());
			children.addAll(_mgravitymodel.getArchives());
			children.addAll(_mgravitymodel.getMMethodNames());
			children.addAll(_mgravitymodel.getMFieldNames());
			children.addAll(_mgravitymodel.getMExtensions());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getVariableDeclarationFragment__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueNumberArray__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getIncomingFlow__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMConstructorDefinition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MConstructorDefinition _mconstructordefinition = (org.gravity.modisco.MConstructorDefinition) obj;
			children.addAll(_mconstructordefinition.getComments());
			children.addAll(_mconstructordefinition.getAnnotations());
			if(_mconstructordefinition.getModifier() != null)
				children.add(_mconstructordefinition.getModifier());
			children.addAll(_mconstructordefinition.getOwnedFlows());
			if(_mconstructordefinition.getBody() != null)
				children.add(_mconstructordefinition.getBody());
			children.addAll(_mconstructordefinition.getParameters());
			children.addAll(_mconstructordefinition.getThrownExceptions());
			children.addAll(_mconstructordefinition.getTypeParameters());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTypeGraph(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TypeGraph _typegraph = (org.gravity.typegraph.basic.TypeGraph) obj;
			children.addAll(_typegraph.getTAnnotation());
			children.addAll(_typegraph.getPackages());
			children.addAll(_typegraph.getMethods());
			children.addAll(_typegraph.getFields());
			children.addAll(_typegraph.getOwnedTypes());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueBooleanArray__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getCompilationUnit(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.CompilationUnit _compilationunit = (org.eclipse.modisco.java.CompilationUnit) obj;
			children.addAll(_compilationunit.getComments());
			children.addAll(_compilationunit.getImports());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldName__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getBodyDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.BodyDeclaration _bodydeclaration = (org.eclipse.modisco.java.BodyDeclaration) obj;
			children.addAll(_bodydeclaration.getComments());
			children.addAll(_bodydeclaration.getAnnotations());
			if(_bodydeclaration.getModifier() != null)
				children.add(_bodydeclaration.getModifier());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMFlow(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MFlow _mflow = (org.gravity.modisco.MFlow) obj;
			children.addAll(_mflow.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassInAnonymous__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getBooleanLiteralToTBoolNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMAnonymous(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MAnonymous _manonymous = (org.gravity.modisco.MAnonymous) obj;
			children.addAll(_manonymous.getComments());
			children.addAll(_manonymous.getBodyDeclarations());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getLineComment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.LineComment _linecomment = (org.eclipse.modisco.java.LineComment) obj;
			children.addAll(_linecomment.getComments());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMSingleVariableDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MSingleVariableDeclaration _msinglevariabledeclaration = (org.gravity.modisco.MSingleVariableDeclaration) obj;
			children.addAll(_msinglevariabledeclaration.getComments());
			if(_msinglevariabledeclaration.getInitializer() != null)
				children.add(_msinglevariabledeclaration.getInitializer());
			if(_msinglevariabledeclaration.getModifier() != null)
				children.add(_msinglevariabledeclaration.getModifier());
			if(_msinglevariabledeclaration.getType() != null)
				children.add(_msinglevariabledeclaration.getType());
			children.addAll(_msinglevariabledeclaration.getAnnotations());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getEmptyStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.EmptyStatement _emptystatement = (org.eclipse.modisco.java.EmptyStatement) obj;
			children.addAll(_emptystatement.getComments());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTMethodSignature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TMethodSignature _tmethodsignature = (org.gravity.typegraph.basic.TMethodSignature) obj;
			children.addAll(_tmethodsignature.getTAnnotation());
			children.addAll(_tmethodsignature.getOwnedFlows());
			children.addAll(_tmethodsignature.getDefinitions());
			children.addAll(_tmethodsignature.getParameters());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MAccess _maccess = (org.gravity.modisco.MAccess) obj;
			children.addAll(_maccess.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractVariablesContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.AbstractVariablesContainer _abstractvariablescontainer = (org.eclipse.modisco.java.AbstractVariablesContainer) obj;
			children.addAll(_abstractvariablescontainer.getComments());
			if(_abstractvariablescontainer.getType() != null)
				children.add(_abstractvariablescontainer.getType());
			children.addAll(_abstractvariablescontainer.getFragments());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTFieldDefinition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TFieldDefinition _tfielddefinition = (org.gravity.typegraph.basic.TFieldDefinition) obj;
			children.addAll(_tfielddefinition.getTAnnotation());
			children.addAll(_tfielddefinition.getOwnedFlows());
			children.addAll(_tfielddefinition.getTAccessing());
			if(_tfielddefinition.getTModifier() != null)
				children.add(_tfielddefinition.getTModifier());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsByte__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getNamespaceAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.NamespaceAccess _namespaceaccess = (org.eclipse.modisco.java.NamespaceAccess) obj;
			children.addAll(_namespaceaccess.getComments());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMParameterList(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MParameterList _mparameterlist = (org.gravity.modisco.MParameterList) obj;
			children.addAll(_mparameterlist.getMEntrys());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getSignatureReturnType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMMethodInvocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MMethodInvocation _mmethodinvocation = (org.gravity.modisco.MMethodInvocation) obj;
			children.addAll(_mmethodinvocation.getComments());
			children.addAll(_mmethodinvocation.getArguments());
			children.addAll(_mmethodinvocation.getTypeArguments());
			if(_mmethodinvocation.getExpression() != null)
				children.add(_mmethodinvocation.getExpression());
			children.addAll(_mmethodinvocation.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMName(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MName _mname = (org.gravity.modisco.MName) obj;
			children.addAll(_mname.getMSignatures());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueClassArray__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSynchronizedStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.SynchronizedStatement _synchronizedstatement = (org.eclipse.modisco.java.SynchronizedStatement) obj;
			children.addAll(_synchronizedstatement.getComments());
			if(_synchronizedstatement.getBody() != null)
				children.add(_synchronizedstatement.getBody());
			if(_synchronizedstatement.getExpression() != null)
				children.add(_synchronizedstatement.getExpression());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTConstructor(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TConstructor _tconstructor = (org.gravity.typegraph.basic.TConstructor) obj;
			children.addAll(_tconstructor.getTValues());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getInterfaceDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.InterfaceDeclaration _interfacedeclaration = (org.eclipse.modisco.java.InterfaceDeclaration) obj;
			children.addAll(_interfacedeclaration.getComments());
			children.addAll(_interfacedeclaration.getAnnotations());
			if(_interfacedeclaration.getModifier() != null)
				children.add(_interfacedeclaration.getModifier());
			children.addAll(_interfacedeclaration.getBodyDeclarations());
			children.addAll(_interfacedeclaration.getCommentsBeforeBody());
			children.addAll(_interfacedeclaration.getCommentsAfterBody());
			children.addAll(_interfacedeclaration.getSuperInterfaces());
			children.addAll(_interfacedeclaration.getTypeParameters());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getModel(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Model _model = (org.eclipse.modisco.java.Model) obj;
			children.addAll(_model.getOwnedElements());
			children.addAll(_model.getOrphanTypes());
			children.addAll(_model.getUnresolvedItems());
			children.addAll(_model.getCompilationUnits());
			children.addAll(_model.getClassFiles());
			children.addAll(_model.getArchives());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModifierToTFieldEntity(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModelToTypeGraph(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationToTAnnotation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getOutgoingFlow__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodSignature__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeQualifiedExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.AbstractTypeQualifiedExpression _abstracttypequalifiedexpression = (org.eclipse.modisco.java.AbstractTypeQualifiedExpression) obj;
			children.addAll(_abstracttypequalifiedexpression.getComments());
			if(_abstracttypequalifiedexpression.getQualifier() != null)
				children.add(_abstracttypequalifiedexpression.getQualifier());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsLong__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getComment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Comment _comment = (org.eclipse.modisco.java.Comment) obj;
			children.addAll(_comment.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedTypeDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedTypeDeclaration _unresolvedtypedeclaration = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) obj;
			children.addAll(_unresolvedtypedeclaration.getComments());
			children.addAll(_unresolvedtypedeclaration.getAnnotations());
			if(_unresolvedtypedeclaration.getModifier() != null)
				children.add(_unresolvedtypedeclaration.getModifier());
			children.addAll(_unresolvedtypedeclaration.getBodyDeclarations());
			children.addAll(_unresolvedtypedeclaration.getCommentsBeforeBody());
			children.addAll(_unresolvedtypedeclaration.getCommentsAfterBody());
			children.addAll(_unresolvedtypedeclaration.getSuperInterfaces());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getWildCardType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.WildCardType _wildcardtype = (org.eclipse.modisco.java.WildCardType) obj;
			children.addAll(_wildcardtype.getComments());
			if(_wildcardtype.getBound() != null)
				children.add(_wildcardtype.getBound());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeInt(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PrimitiveTypeInt _primitivetypeint = (org.eclipse.modisco.java.PrimitiveTypeInt) obj;
			children.addAll(_primitivetypeint.getComments());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTNumberNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getNamedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.NamedElement _namedelement = (org.eclipse.modisco.java.NamedElement) obj;
			children.addAll(_namedelement.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedItem(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedItem _unresolveditem = (org.eclipse.modisco.java.UnresolvedItem) obj;
			children.addAll(_unresolveditem.getComments());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMMethodName(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MMethodName _mmethodname = (org.gravity.modisco.MMethodName) obj;
			children.addAll(_mmethodname.getMSignatures());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getArrayCreation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ArrayCreation _arraycreation = (org.eclipse.modisco.java.ArrayCreation) obj;
			children.addAll(_arraycreation.getComments());
			children.addAll(_arraycreation.getDimensions());
			if(_arraycreation.getInitializer() != null)
				children.add(_arraycreation.getInitializer());
			if(_arraycreation.getType() != null)
				children.add(_arraycreation.getType());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMClassInstanceCreation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MClassInstanceCreation _mclassinstancecreation = (org.gravity.modisco.MClassInstanceCreation) obj;
			children.addAll(_mclassinstancecreation.getComments());
			children.addAll(_mclassinstancecreation.getArguments());
			children.addAll(_mclassinstancecreation.getTypeArguments());
			if(_mclassinstancecreation.getAnonymousClassDeclaration() != null)
				children.add(_mclassinstancecreation.getAnonymousClassDeclaration());
			if(_mclassinstancecreation.getExpression() != null)
				children.add(_mclassinstancecreation.getExpression());
			if(_mclassinstancecreation.getType() != null)
				children.add(_mclassinstancecreation.getType());
			children.addAll(_mclassinstancecreation.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getManifestAttribute(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTReadWrite(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TReadWrite _treadwrite = (org.gravity.typegraph.basic.TReadWrite) obj;
			children.addAll(_treadwrite.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldAccessWrite__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMSyntheticMethodDefinition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MSyntheticMethodDefinition _msyntheticmethoddefinition = (org.gravity.modisco.MSyntheticMethodDefinition) obj;
			children.addAll(_msyntheticmethoddefinition.getComments());
			children.addAll(_msyntheticmethoddefinition.getAnnotations());
			if(_msyntheticmethoddefinition.getModifier() != null)
				children.add(_msyntheticmethoddefinition.getModifier());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getArchive(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Archive _archive = (org.eclipse.modisco.java.Archive) obj;
			children.addAll(_archive.getComments());
			children.addAll(_archive.getClassFiles());
			if(_archive.getManifest() != null)
				children.add(_archive.getManifest());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getSuperMethodInvocation__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getArrayInitializer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ArrayInitializer _arrayinitializer = (org.eclipse.modisco.java.ArrayInitializer) obj;
			children.addAll(_arrayinitializer.getComments());
			children.addAll(_arrayinitializer.getExpressions());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Type _type = (org.eclipse.modisco.java.Type) obj;
			children.addAll(_type.getComments());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTClassNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberKey__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMemberInClassVisibility__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAbstractMethodInvocationToTAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getArrayInitializerIgnoreExpressionsEdge__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationTypeAccess__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMExtension(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getBreakStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.BreakStatement _breakstatement = (org.eclipse.modisco.java.BreakStatement) obj;
			children.addAll(_breakstatement.getComments());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTAnnotation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.annotations.TAnnotation _tannotation = (org.gravity.typegraph.basic.annotations.TAnnotation) obj;
			children.addAll(_tannotation.getTValues());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAssertStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.AssertStatement _assertstatement = (org.eclipse.modisco.java.AssertStatement) obj;
			children.addAll(_assertstatement.getComments());
			if(_assertstatement.getMessage() != null)
				children.add(_assertstatement.getMessage());
			if(_assertstatement.getExpression() != null)
				children.add(_assertstatement.getExpression());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMFieldSignature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MFieldSignature _mfieldsignature = (org.gravity.modisco.MFieldSignature) obj;
			children.addAll(_mfieldsignature.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getContinueStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ContinueStatement _continuestatement = (org.eclipse.modisco.java.ContinueStatement) obj;
			children.addAll(_continuestatement.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTypeLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.TypeLiteral _typeliteral = (org.eclipse.modisco.java.TypeLiteral) obj;
			children.addAll(_typeliteral.getComments());
			if(_typeliteral.getType() != null)
				children.add(_typeliteral.getType());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTMethod(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TMethod _tmethod = (org.gravity.typegraph.basic.TMethod) obj;
			children.addAll(_tmethod.getSignatures());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getASTNodeToTAnnotatable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getArrayType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ArrayType _arraytype = (org.eclipse.modisco.java.ArrayType) obj;
			children.addAll(_arraytype.getComments());
			if(_arraytype.getElementType() != null)
				children.add(_arraytype.getElementType());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getManifest(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Manifest _manifest = (org.eclipse.modisco.java.Manifest) obj;
			children.addAll(_manifest.getMainAttributes());
			children.addAll(_manifest.getEntryAttributes());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsFloat__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getMethodDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.MethodDeclaration _methoddeclaration = (org.eclipse.modisco.java.MethodDeclaration) obj;
			children.addAll(_methoddeclaration.getComments());
			children.addAll(_methoddeclaration.getAnnotations());
			if(_methoddeclaration.getModifier() != null)
				children.add(_methoddeclaration.getModifier());
			if(_methoddeclaration.getBody() != null)
				children.add(_methoddeclaration.getBody());
			children.addAll(_methoddeclaration.getParameters());
			children.addAll(_methoddeclaration.getThrownExceptions());
			children.addAll(_methoddeclaration.getTypeParameters());
			if(_methoddeclaration.getReturnType() != null)
				children.add(_methoddeclaration.getReturnType());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getUnresolvedTypeDeclarationToTClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getSyntethicMethod__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsInt__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTextAnnotations__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTRead(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TRead _tread = (org.gravity.typegraph.basic.TRead) obj;
			children.addAll(_tread.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassTypeClass__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValuePairToTAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getEnum__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getStringLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.StringLiteral _stringliteral = (org.eclipse.modisco.java.StringLiteral) obj;
			children.addAll(_stringliteral.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeFloat(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PrimitiveTypeFloat _primitivetypefloat = (org.eclipse.modisco.java.PrimitiveTypeFloat) obj;
			children.addAll(_primitivetypefloat.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getModifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Modifier _modifier = (org.eclipse.modisco.java.Modifier) obj;
			children.addAll(_modifier.getComments());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldAccessReadWrite__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.AbstractTypeDeclaration _abstracttypedeclaration = (org.eclipse.modisco.java.AbstractTypeDeclaration) obj;
			children.addAll(_abstracttypedeclaration.getComments());
			children.addAll(_abstracttypedeclaration.getAnnotations());
			if(_abstracttypedeclaration.getModifier() != null)
				children.add(_abstracttypedeclaration.getModifier());
			children.addAll(_abstracttypedeclaration.getBodyDeclarations());
			children.addAll(_abstracttypedeclaration.getCommentsBeforeBody());
			children.addAll(_abstracttypedeclaration.getCommentsAfterBody());
			children.addAll(_abstracttypedeclaration.getSuperInterfaces());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getForStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ForStatement _forstatement = (org.eclipse.modisco.java.ForStatement) obj;
			children.addAll(_forstatement.getComments());
			if(_forstatement.getExpression() != null)
				children.add(_forstatement.getExpression());
			children.addAll(_forstatement.getUpdaters());
			children.addAll(_forstatement.getInitializers());
			if(_forstatement.getBody() != null)
				children.add(_forstatement.getBody());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMAbstractFlowElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MAbstractFlowElement _mabstractflowelement = (org.gravity.modisco.MAbstractFlowElement) obj;
			children.addAll(_mabstractflowelement.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAnnotationMemberValuePair(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.AnnotationMemberValuePair _annotationmembervaluepair = (org.eclipse.modisco.java.AnnotationMemberValuePair) obj;
			children.addAll(_annotationmembervaluepair.getComments());
			if(_annotationmembervaluepair.getValue() != null)
				children.add(_annotationmembervaluepair.getValue());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodDefinition__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPackageToTPackage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getEnumInAnonymous__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTSignature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TSignature _tsignature = (org.gravity.typegraph.basic.TSignature) obj;
			children.addAll(_tsignature.getTAnnotation());
			children.addAll(_tsignature.getOwnedFlows());
			children.addAll(_tsignature.getDefinitions());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueClass__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModifierToTMethodEntity(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMethodInvocationStaticType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getNullLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.NullLiteral _nullliteral = (org.eclipse.modisco.java.NullLiteral) obj;
			children.addAll(_nullliteral.getComments());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodParameterType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getArrayAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ArrayAccess _arrayaccess = (org.eclipse.modisco.java.ArrayAccess) obj;
			children.addAll(_arrayaccess.getComments());
			if(_arrayaccess.getArray() != null)
				children.add(_arrayaccess.getArray());
			if(_arrayaccess.getIndex() != null)
				children.add(_arrayaccess.getIndex());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassImplementsInterface__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTModifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getVariableDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.VariableDeclaration _variabledeclaration = (org.eclipse.modisco.java.VariableDeclaration) obj;
			children.addAll(_variabledeclaration.getComments());
			if(_variabledeclaration.getInitializer() != null)
				children.add(_variabledeclaration.getInitializer());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getManifestEntry(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ManifestEntry _manifestentry = (org.eclipse.modisco.java.ManifestEntry) obj;
			children.addAll(_manifestentry.getAttributes());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeLong(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PrimitiveTypeLong _primitivetypelong = (org.eclipse.modisco.java.PrimitiveTypeLong) obj;
			children.addAll(_primitivetypelong.getComments());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TClass _tclass = (org.gravity.typegraph.basic.TClass) obj;
			children.addAll(_tclass.getTAnnotation());
			if(_tclass.getTModifier() != null)
				children.add(_tclass.getTModifier());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMFieldName(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MFieldName _mfieldname = (org.gravity.modisco.MFieldName) obj;
			children.addAll(_mfieldname.getMSignatures());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getNumberLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.NumberLiteral _numberliteral = (org.eclipse.modisco.java.NumberLiteral) obj;
			children.addAll(_numberliteral.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getJavadoc(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Javadoc _javadoc = (org.eclipse.modisco.java.Javadoc) obj;
			children.addAll(_javadoc.getComments());
			children.addAll(_javadoc.getTags());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getParameterizedTypeToClass__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsBoolean__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getSubPackageToPGPackage__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTFieldSignature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TFieldSignature _tfieldsignature = (org.gravity.typegraph.basic.TFieldSignature) obj;
			children.addAll(_tfieldsignature.getTAnnotation());
			children.addAll(_tfieldsignature.getOwnedFlows());
			children.addAll(_tfieldsignature.getDefinitions());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTWrite(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TWrite _twrite = (org.gravity.typegraph.basic.TWrite) obj;
			children.addAll(_twrite.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getVariableDeclarationFragmentToTFieldDefinition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MClass _mclass = (org.gravity.modisco.MClass) obj;
			children.addAll(_mclass.getComments());
			children.addAll(_mclass.getAnnotations());
			if(_mclass.getModifier() != null)
				children.add(_mclass.getModifier());
			children.addAll(_mclass.getBodyDeclarations());
			children.addAll(_mclass.getCommentsBeforeBody());
			children.addAll(_mclass.getCommentsAfterBody());
			children.addAll(_mclass.getSuperInterfaces());
			children.addAll(_mclass.getTypeParameters());
			if(_mclass.getSuperClass() != null)
				children.add(_mclass.getSuperClass());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TAbstractType _tabstracttype = (org.gravity.typegraph.basic.TAbstractType) obj;
			children.addAll(_tabstracttype.getTAnnotation());
			if(_tabstracttype.getTModifier() != null)
				children.add(_tabstracttype.getTModifier());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getStaticTypeToAccessStaticType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getEnumDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.EnumDeclaration _enumdeclaration = (org.eclipse.modisco.java.EnumDeclaration) obj;
			children.addAll(_enumdeclaration.getComments());
			children.addAll(_enumdeclaration.getAnnotations());
			if(_enumdeclaration.getModifier() != null)
				children.add(_enumdeclaration.getModifier());
			children.addAll(_enumdeclaration.getBodyDeclarations());
			children.addAll(_enumdeclaration.getCommentsBeforeBody());
			children.addAll(_enumdeclaration.getCommentsAfterBody());
			children.addAll(_enumdeclaration.getSuperInterfaces());
			children.addAll(_enumdeclaration.getEnumConstants());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMAbstractFlowElementToTAbstractFlowElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSuperConstructorInvocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.SuperConstructorInvocation _superconstructorinvocation = (org.eclipse.modisco.java.SuperConstructorInvocation) obj;
			children.addAll(_superconstructorinvocation.getComments());
			children.addAll(_superconstructorinvocation.getArguments());
			children.addAll(_superconstructorinvocation.getTypeArguments());
			if(_superconstructorinvocation.getExpression() != null)
				children.add(_superconstructorinvocation.getExpression());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTClassContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueBoolean__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodParameter__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedClassDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedClassDeclaration _unresolvedclassdeclaration = (org.eclipse.modisco.java.UnresolvedClassDeclaration) obj;
			children.addAll(_unresolvedclassdeclaration.getComments());
			children.addAll(_unresolvedclassdeclaration.getAnnotations());
			if(_unresolvedclassdeclaration.getModifier() != null)
				children.add(_unresolvedclassdeclaration.getModifier());
			children.addAll(_unresolvedclassdeclaration.getBodyDeclarations());
			children.addAll(_unresolvedclassdeclaration.getCommentsBeforeBody());
			children.addAll(_unresolvedclassdeclaration.getCommentsAfterBody());
			children.addAll(_unresolvedclassdeclaration.getSuperInterfaces());
			children.addAll(_unresolvedclassdeclaration.getTypeParameters());
			if(_unresolvedclassdeclaration.getSuperClass() != null)
				children.add(_unresolvedclassdeclaration.getSuperClass());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMFieldNameToTField(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPackage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Package _package = (org.eclipse.modisco.java.Package) obj;
			children.addAll(_package.getComments());
			children.addAll(_package.getOwnedElements());
			children.addAll(_package.getOwnedPackages());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeBoolean(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PrimitiveTypeBoolean _primitivetypeboolean = (org.eclipse.modisco.java.PrimitiveTypeBoolean) obj;
			children.addAll(_primitivetypeboolean.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeVoid(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PrimitiveTypeVoid _primitivetypevoid = (org.eclipse.modisco.java.PrimitiveTypeVoid) obj;
			children.addAll(_primitivetypevoid.getComments());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTUnresolvedType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TUnresolvedType _tunresolvedtype = (org.gravity.typegraph.basic.TUnresolvedType) obj;
			children.addAll(_tunresolvedtype.getTAnnotation());
			if(_tunresolvedtype.getTModifier() != null)
				children.add(_tunresolvedtype.getTModifier());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTTextAnnotation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.annotations.TTextAnnotation _ttextannotation = (org.gravity.typegraph.basic.annotations.TTextAnnotation) obj;
			children.addAll(_ttextannotation.getTValues());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TAccess _taccess = (org.gravity.typegraph.basic.TAccess) obj;
			children.addAll(_taccess.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTField(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TField _tfield = (org.gravity.typegraph.basic.TField) obj;
			children.addAll(_tfield.getSignatures());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTAnnotatable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.annotations.TAnnotatable _tannotatable = (org.gravity.typegraph.basic.annotations.TAnnotatable) obj;
			children.addAll(_tannotatable.getTAnnotation());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAnnotation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Annotation _annotation = (org.eclipse.modisco.java.Annotation) obj;
			children.addAll(_annotation.getComments());
			if(_annotation.getType() != null)
				children.add(_annotation.getType());
			children.addAll(_annotation.getValues());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTMember(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TMember _tmember = (org.gravity.typegraph.basic.TMember) obj;
			children.addAll(_tmember.getTAnnotation());
			children.addAll(_tmember.getOwnedFlows());
			children.addAll(_tmember.getTAccessing());
			if(_tmember.getTModifier() != null)
				children.add(_tmember.getTModifier());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAssignment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Assignment _assignment = (org.eclipse.modisco.java.Assignment) obj;
			children.addAll(_assignment.getComments());
			if(_assignment.getLeftHandSide() != null)
				children.add(_assignment.getLeftHandSide());
			if(_assignment.getRightHandSide() != null)
				children.add(_assignment.getRightHandSide());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getFieldAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.FieldAccess _fieldaccess = (org.eclipse.modisco.java.FieldAccess) obj;
			children.addAll(_fieldaccess.getComments());
			if(_fieldaccess.getField() != null)
				children.add(_fieldaccess.getField());
			if(_fieldaccess.getExpression() != null)
				children.add(_fieldaccess.getExpression());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getClassDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ClassDeclaration _classdeclaration = (org.eclipse.modisco.java.ClassDeclaration) obj;
			children.addAll(_classdeclaration.getComments());
			children.addAll(_classdeclaration.getAnnotations());
			if(_classdeclaration.getModifier() != null)
				children.add(_classdeclaration.getModifier());
			children.addAll(_classdeclaration.getBodyDeclarations());
			children.addAll(_classdeclaration.getCommentsBeforeBody());
			children.addAll(_classdeclaration.getCommentsAfterBody());
			children.addAll(_classdeclaration.getSuperInterfaces());
			children.addAll(_classdeclaration.getTypeParameters());
			if(_classdeclaration.getSuperClass() != null)
				children.add(_classdeclaration.getSuperClass());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationTypeNested__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getInfixExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.InfixExpression _infixexpression = (org.eclipse.modisco.java.InfixExpression) obj;
			children.addAll(_infixexpression.getComments());
			if(_infixexpression.getRightOperand() != null)
				children.add(_infixexpression.getRightOperand());
			if(_infixexpression.getLeftOperand() != null)
				children.add(_infixexpression.getLeftOperand());
			children.addAll(_infixexpression.getExtendedOperands());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldDefinition__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getConstructorInvocation__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterfaceInAnonymous__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTFieldContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getReturnStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ReturnStatement _returnstatement = (org.eclipse.modisco.java.ReturnStatement) obj;
			children.addAll(_returnstatement.getComments());
			if(_returnstatement.getExpression() != null)
				children.add(_returnstatement.getExpression());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getMethodInvocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.MethodInvocation _methodinvocation = (org.eclipse.modisco.java.MethodInvocation) obj;
			children.addAll(_methodinvocation.getComments());
			children.addAll(_methodinvocation.getArguments());
			children.addAll(_methodinvocation.getTypeArguments());
			if(_methodinvocation.getExpression() != null)
				children.add(_methodinvocation.getExpression());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodParameterLinkFirst__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMSuperConstructorInvocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MSuperConstructorInvocation _msuperconstructorinvocation = (org.gravity.modisco.MSuperConstructorInvocation) obj;
			children.addAll(_msuperconstructorinvocation.getComments());
			children.addAll(_msuperconstructorinvocation.getArguments());
			children.addAll(_msuperconstructorinvocation.getTypeArguments());
			if(_msuperconstructorinvocation.getExpression() != null)
				children.add(_msuperconstructorinvocation.getExpression());
			children.addAll(_msuperconstructorinvocation.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldAccessToTAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getCastExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.CastExpression _castexpression = (org.eclipse.modisco.java.CastExpression) obj;
			children.addAll(_castexpression.getComments());
			if(_castexpression.getExpression() != null)
				children.add(_castexpression.getExpression());
			if(_castexpression.getType() != null)
				children.add(_castexpression.getType());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedAnnotationDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedAnnotationDeclaration _unresolvedannotationdeclaration = (org.eclipse.modisco.java.UnresolvedAnnotationDeclaration) obj;
			children.addAll(_unresolvedannotationdeclaration.getComments());
			children.addAll(_unresolvedannotationdeclaration.getAnnotations());
			if(_unresolvedannotationdeclaration.getModifier() != null)
				children.add(_unresolvedannotationdeclaration.getModifier());
			children.addAll(_unresolvedannotationdeclaration.getBodyDeclarations());
			children.addAll(_unresolvedannotationdeclaration.getCommentsBeforeBody());
			children.addAll(_unresolvedannotationdeclaration.getCommentsAfterBody());
			children.addAll(_unresolvedannotationdeclaration.getSuperInterfaces());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypesIsVoid__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getReturnType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeParameter__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldAccessRead__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getInstanceofExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.InstanceofExpression _instanceofexpression = (org.eclipse.modisco.java.InstanceofExpression) obj;
			children.addAll(_instanceofexpression.getComments());
			if(_instanceofexpression.getRightOperand() != null)
				children.add(_instanceofexpression.getRightOperand());
			if(_instanceofexpression.getLeftOperand() != null)
				children.add(_instanceofexpression.getLeftOperand());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeByte(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PrimitiveTypeByte _primitivetypebyte = (org.eclipse.modisco.java.PrimitiveTypeByte) obj;
			children.addAll(_primitivetypebyte.getComments());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TParameter _tparameter = (org.gravity.typegraph.basic.TParameter) obj;
			children.addAll(_tparameter.getTAnnotation());
			children.addAll(_tparameter.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassDeclarationToTClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTMethodDefinition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TMethodDefinition _tmethoddefinition = (org.gravity.typegraph.basic.TMethodDefinition) obj;
			children.addAll(_tmethoddefinition.getTAnnotation());
			children.addAll(_tmethoddefinition.getOwnedFlows());
			children.addAll(_tmethoddefinition.getTAccessing());
			if(_tmethoddefinition.getTModifier() != null)
				children.add(_tmethoddefinition.getTModifier());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTBoolNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getClassInstanceCreation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ClassInstanceCreation _classinstancecreation = (org.eclipse.modisco.java.ClassInstanceCreation) obj;
			children.addAll(_classinstancecreation.getComments());
			children.addAll(_classinstancecreation.getArguments());
			children.addAll(_classinstancecreation.getTypeArguments());
			if(_classinstancecreation.getAnonymousClassDeclaration() != null)
				children.add(_classinstancecreation.getAnonymousClassDeclaration());
			if(_classinstancecreation.getExpression() != null)
				children.add(_classinstancecreation.getExpression());
			if(_classinstancecreation.getType() != null)
				children.add(_classinstancecreation.getType());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClass__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractMethodInvocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.AbstractMethodInvocation _abstractmethodinvocation = (org.eclipse.modisco.java.AbstractMethodInvocation) obj;
			children.addAll(_abstractmethodinvocation.getComments());
			children.addAll(_abstractmethodinvocation.getArguments());
			children.addAll(_abstractmethodinvocation.getTypeArguments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getLabeledStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.LabeledStatement _labeledstatement = (org.eclipse.modisco.java.LabeledStatement) obj;
			children.addAll(_labeledstatement.getComments());
			if(_labeledstatement.getBody() != null)
				children.add(_labeledstatement.getBody());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getVariableDeclarationFragment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.VariableDeclarationFragment _variabledeclarationfragment = (org.eclipse.modisco.java.VariableDeclarationFragment) obj;
			children.addAll(_variabledeclarationfragment.getComments());
			if(_variabledeclarationfragment.getInitializer() != null)
				children.add(_variabledeclarationfragment.getInitializer());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMMethodSignature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MMethodSignature _mmethodsignature = (org.gravity.modisco.MMethodSignature) obj;
			children.addAll(_mmethodsignature.getOwnedFlows());
			children.addAll(_mmethodsignature.getMEntrys());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTextElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.TextElement _textelement = (org.eclipse.modisco.java.TextElement) obj;
			children.addAll(_textelement.getComments());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationTypeInAnonymous__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModifierToAbstractType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMAbstractMethodInvocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MAbstractMethodInvocation _mabstractmethodinvocation = (org.gravity.modisco.MAbstractMethodInvocation) obj;
			children.addAll(_mabstractmethodinvocation.getComments());
			children.addAll(_mabstractmethodinvocation.getArguments());
			children.addAll(_mabstractmethodinvocation.getTypeArguments());
			children.addAll(_mabstractmethodinvocation.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTFlow(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TFlow _tflow = (org.gravity.typegraph.basic.TFlow) obj;
			children.addAll(_tflow.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMFlowToTFlow(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTAnnotationType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.annotations.TAnnotationType _tannotationtype = (org.gravity.typegraph.basic.annotations.TAnnotationType) obj;
			children.addAll(_tannotationtype.getTAnnotation());
			if(_tannotationtype.getTModifier() != null)
				children.add(_tannotationtype.getTModifier());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassExtendsClass__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrefixExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PrefixExpression _prefixexpression = (org.eclipse.modisco.java.PrefixExpression) obj;
			children.addAll(_prefixexpression.getComments());
			if(_prefixexpression.getOperand() != null)
				children.add(_prefixexpression.getOperand());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModelToPg__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTFieldDefinitionContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getNestedEnum__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedInterfaceDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration _unresolvedinterfacedeclaration = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) obj;
			children.addAll(_unresolvedinterfacedeclaration.getComments());
			children.addAll(_unresolvedinterfacedeclaration.getAnnotations());
			if(_unresolvedinterfacedeclaration.getModifier() != null)
				children.add(_unresolvedinterfacedeclaration.getModifier());
			children.addAll(_unresolvedinterfacedeclaration.getBodyDeclarations());
			children.addAll(_unresolvedinterfacedeclaration.getCommentsBeforeBody());
			children.addAll(_unresolvedinterfacedeclaration.getCommentsAfterBody());
			children.addAll(_unresolvedinterfacedeclaration.getSuperInterfaces());
			children.addAll(_unresolvedinterfacedeclaration.getTypeParameters());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getBooleanLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.BooleanLiteral _booleanliteral = (org.eclipse.modisco.java.BooleanLiteral) obj;
			children.addAll(_booleanliteral.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAnnotationTypeDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.AnnotationTypeDeclaration _annotationtypedeclaration = (org.eclipse.modisco.java.AnnotationTypeDeclaration) obj;
			children.addAll(_annotationtypedeclaration.getComments());
			children.addAll(_annotationtypedeclaration.getAnnotations());
			if(_annotationtypedeclaration.getModifier() != null)
				children.add(_annotationtypedeclaration.getModifier());
			children.addAll(_annotationtypedeclaration.getBodyDeclarations());
			children.addAll(_annotationtypedeclaration.getCommentsBeforeBody());
			children.addAll(_annotationtypedeclaration.getCommentsAfterBody());
			children.addAll(_annotationtypedeclaration.getSuperInterfaces());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSwitchCase(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.SwitchCase _switchcase = (org.eclipse.modisco.java.SwitchCase) obj;
			children.addAll(_switchcase.getComments());
			if(_switchcase.getExpression() != null)
				children.add(_switchcase.getExpression());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterface__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTTextNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getBlock(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Block _block = (org.eclipse.modisco.java.Block) obj;
			children.addAll(_block.getComments());
			children.addAll(_block.getStatements());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassInnerAnonClassMember__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSingleVariableDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.SingleVariableDeclaration _singlevariabledeclaration = (org.eclipse.modisco.java.SingleVariableDeclaration) obj;
			children.addAll(_singlevariabledeclaration.getComments());
			if(_singlevariabledeclaration.getInitializer() != null)
				children.add(_singlevariabledeclaration.getInitializer());
			if(_singlevariabledeclaration.getModifier() != null)
				children.add(_singlevariabledeclaration.getModifier());
			if(_singlevariabledeclaration.getType() != null)
				children.add(_singlevariabledeclaration.getType());
			children.addAll(_singlevariabledeclaration.getAnnotations());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMEntryToTParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getArrayTypeToClass__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMConstructorInvocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MConstructorInvocation _mconstructorinvocation = (org.gravity.modisco.MConstructorInvocation) obj;
			children.addAll(_mconstructorinvocation.getComments());
			children.addAll(_mconstructorinvocation.getArguments());
			children.addAll(_mconstructorinvocation.getTypeArguments());
			children.addAll(_mconstructorinvocation.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTMethodDefinitionContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMMethodDefinition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MMethodDefinition _mmethoddefinition = (org.gravity.modisco.MMethodDefinition) obj;
			children.addAll(_mmethoddefinition.getComments());
			children.addAll(_mmethoddefinition.getAnnotations());
			if(_mmethoddefinition.getModifier() != null)
				children.add(_mmethoddefinition.getModifier());
			if(_mmethoddefinition.getBody() != null)
				children.add(_mmethoddefinition.getBody());
			children.addAll(_mmethoddefinition.getParameters());
			children.addAll(_mmethoddefinition.getThrownExceptions());
			children.addAll(_mmethoddefinition.getTypeParameters());
			if(_mmethoddefinition.getReturnType() != null)
				children.add(_mmethoddefinition.getReturnType());
			children.addAll(_mmethoddefinition.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTAccessContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getConstructorDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ConstructorDeclaration _constructordeclaration = (org.eclipse.modisco.java.ConstructorDeclaration) obj;
			children.addAll(_constructordeclaration.getComments());
			children.addAll(_constructordeclaration.getAnnotations());
			if(_constructordeclaration.getModifier() != null)
				children.add(_constructordeclaration.getModifier());
			if(_constructordeclaration.getBody() != null)
				children.add(_constructordeclaration.getBody());
			children.addAll(_constructordeclaration.getParameters());
			children.addAll(_constructordeclaration.getThrownExceptions());
			children.addAll(_constructordeclaration.getTypeParameters());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMEntry(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MEntry _mentry = (org.gravity.modisco.MEntry) obj;
			children.addAll(_mentry.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getStringLiteralToTTextNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueNumber__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeParameterToTClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassTypeInterface__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTSyntethicMethod(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.typegraph.basic.TSyntethicMethod _tsyntethicmethod = (org.gravity.typegraph.basic.TSyntethicMethod) obj;
			children.addAll(_tsyntethicmethod.getTAnnotation());
			children.addAll(_tsyntethicmethod.getOwnedFlows());
			children.addAll(_tsyntethicmethod.getTAccessing());
			if(_tsyntethicmethod.getTModifier() != null)
				children.add(_tsyntethicmethod.getTModifier());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSingleVariableAccessToTAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueString__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getMethodRefParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.MethodRefParameter _methodrefparameter = (org.eclipse.modisco.java.MethodRefParameter) obj;
			children.addAll(_methodrefparameter.getComments());
			if(_methodrefparameter.getType() != null)
				children.add(_methodrefparameter.getType());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAnonymousClassDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.AnonymousClassDeclaration _anonymousclassdeclaration = (org.eclipse.modisco.java.AnonymousClassDeclaration) obj;
			children.addAll(_anonymousclassdeclaration.getComments());
			children.addAll(_anonymousclassdeclaration.getBodyDeclarations());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSingleVariableAccess(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.SingleVariableAccess _singlevariableaccess = (org.eclipse.modisco.java.SingleVariableAccess) obj;
			children.addAll(_singlevariableaccess.getComments());
			if(_singlevariableaccess.getQualifier() != null)
				children.add(_singlevariableaccess.getQualifier());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getEnumConstantDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.EnumConstantDeclaration _enumconstantdeclaration = (org.eclipse.modisco.java.EnumConstantDeclaration) obj;
			children.addAll(_enumconstantdeclaration.getComments());
			children.addAll(_enumconstantdeclaration.getAnnotations());
			if(_enumconstantdeclaration.getModifier() != null)
				children.add(_enumconstantdeclaration.getModifier());
			if(_enumconstantdeclaration.getInitializer() != null)
				children.add(_enumconstantdeclaration.getInitializer());
			if(_enumconstantdeclaration.getAnonymousClassDeclaration() != null)
				children.add(_enumconstantdeclaration.getAnonymousClassDeclaration());
			children.addAll(_enumconstantdeclaration.getArguments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedMethodDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedMethodDeclaration _unresolvedmethoddeclaration = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) obj;
			children.addAll(_unresolvedmethoddeclaration.getComments());
			children.addAll(_unresolvedmethoddeclaration.getAnnotations());
			if(_unresolvedmethoddeclaration.getModifier() != null)
				children.add(_unresolvedmethoddeclaration.getModifier());
			if(_unresolvedmethoddeclaration.getBody() != null)
				children.add(_unresolvedmethoddeclaration.getBody());
			children.addAll(_unresolvedmethoddeclaration.getParameters());
			children.addAll(_unresolvedmethoddeclaration.getThrownExceptions());
			children.addAll(_unresolvedmethoddeclaration.getTypeParameters());
			if(_unresolvedmethoddeclaration.getReturnType() != null)
				children.add(_unresolvedmethoddeclaration.getReturnType());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSuperMethodInvocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.SuperMethodInvocation _supermethodinvocation = (org.eclipse.modisco.java.SuperMethodInvocation) obj;
			children.addAll(_supermethodinvocation.getComments());
			if(_supermethodinvocation.getQualifier() != null)
				children.add(_supermethodinvocation.getQualifier());
			children.addAll(_supermethodinvocation.getArguments());
			children.addAll(_supermethodinvocation.getTypeArguments());
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMAbstractMethodDefinition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MAbstractMethodDefinition _mabstractmethoddefinition = (org.gravity.modisco.MAbstractMethodDefinition) obj;
			children.addAll(_mabstractmethoddefinition.getComments());
			children.addAll(_mabstractmethoddefinition.getAnnotations());
			if(_mabstractmethoddefinition.getModifier() != null)
				children.add(_mabstractmethoddefinition.getModifier());
			children.addAll(_mabstractmethoddefinition.getOwnedFlows());
			if(_mabstractmethoddefinition.getBody() != null)
				children.add(_mabstractmethoddefinition.getBody());
			children.addAll(_mabstractmethoddefinition.getParameters());
			children.addAll(_mabstractmethoddefinition.getThrownExceptions());
			children.addAll(_mabstractmethoddefinition.getTypeParameters());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getConstructorDefinition__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodParameterLink__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMDefinition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.gravity.modisco.MDefinition _mdefinition = (org.gravity.modisco.MDefinition) obj;
			children.addAll(_mdefinition.getComments());
			children.addAll(_mdefinition.getAnnotations());
			if(_mdefinition.getModifier() != null)
				children.add(_mdefinition.getModifier());
			children.addAll(_mdefinition.getOwnedFlows());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getWhileStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.WhileStatement _whilestatement = (org.eclipse.modisco.java.WhileStatement) obj;
			children.addAll(_whilestatement.getComments());
			if(_whilestatement.getExpression() != null)
				children.add(_whilestatement.getExpression());
			if(_whilestatement.getBody() != null)
				children.add(_whilestatement.getBody());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMMethodNameToTMethod(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedLabeledStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedLabeledStatement _unresolvedlabeledstatement = (org.eclipse.modisco.java.UnresolvedLabeledStatement) obj;
			children.addAll(_unresolvedlabeledstatement.getComments());
			if(_unresolvedlabeledstatement.getBody() != null)
				children.add(_unresolvedlabeledstatement.getBody());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodInvocationStaticType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTypeDeclarationStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.TypeDeclarationStatement _typedeclarationstatement = (org.eclipse.modisco.java.TypeDeclarationStatement) obj;
			children.addAll(_typedeclarationstatement.getComments());
			if(_typedeclarationstatement.getDeclaration() != null)
				children.add(_typedeclarationstatement.getDeclaration());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterfaceMember__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getMethodRef(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.MethodRef _methodref = (org.eclipse.modisco.java.MethodRef) obj;
			children.addAll(_methodref.getComments());
			if(_methodref.getQualifier() != null)
				children.add(_methodref.getQualifier());
			children.addAll(_methodref.getParameters());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getFieldDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.FieldDeclaration _fielddeclaration = (org.eclipse.modisco.java.FieldDeclaration) obj;
			children.addAll(_fielddeclaration.getComments());
			children.addAll(_fielddeclaration.getAnnotations());
			if(_fielddeclaration.getModifier() != null)
				children.add(_fielddeclaration.getModifier());
			if(_fielddeclaration.getType() != null)
				children.add(_fielddeclaration.getType());
			children.addAll(_fielddeclaration.getFragments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getVariableDeclarationStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.VariableDeclarationStatement _variabledeclarationstatement = (org.eclipse.modisco.java.VariableDeclarationStatement) obj;
			children.addAll(_variabledeclarationstatement.getComments());
			if(_variabledeclarationstatement.getType() != null)
				children.add(_variabledeclarationstatement.getType());
			children.addAll(_variabledeclarationstatement.getFragments());
			if(_variabledeclarationstatement.getModifier() != null)
				children.add(_variabledeclarationstatement.getModifier());
			children.addAll(_variabledeclarationstatement.getAnnotations());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassDeclarationToTClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getThrowStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ThrowStatement _throwstatement = (org.eclipse.modisco.java.ThrowStatement) obj;
			children.addAll(_throwstatement.getComments());
			if(_throwstatement.getExpression() != null)
				children.add(_throwstatement.getExpression());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAnnotationTypeMemberDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.AnnotationTypeMemberDeclaration _annotationtypememberdeclaration = (org.eclipse.modisco.java.AnnotationTypeMemberDeclaration) obj;
			children.addAll(_annotationtypememberdeclaration.getComments());
			children.addAll(_annotationtypememberdeclaration.getAnnotations());
			if(_annotationtypememberdeclaration.getModifier() != null)
				children.add(_annotationtypememberdeclaration.getModifier());
			if(_annotationtypememberdeclaration.getDefault() != null)
				children.add(_annotationtypememberdeclaration.getDefault());
			if(_annotationtypememberdeclaration.getType() != null)
				children.add(_annotationtypememberdeclaration.getType());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypesVisibility__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getCatchClause(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.CatchClause _catchclause = (org.eclipse.modisco.java.CatchClause) obj;
			children.addAll(_catchclause.getComments());
			if(_catchclause.getException() != null)
				children.add(_catchclause.getException());
			if(_catchclause.getBody() != null)
				children.add(_catchclause.getBody());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.Statement _statement = (org.eclipse.modisco.java.Statement) obj;
			children.addAll(_statement.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTagElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.TagElement _tagelement = (org.eclipse.modisco.java.TagElement) obj;
			children.addAll(_tagelement.getComments());
			children.addAll(_tagelement.getFragments());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassInstanceCreation__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFlow__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassLiteralToClassNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getConditionalExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ConditionalExpression _conditionalexpression = (org.eclipse.modisco.java.ConditionalExpression) obj;
			children.addAll(_conditionalexpression.getComments());
			if(_conditionalexpression.getElseExpression() != null)
				children.add(_conditionalexpression.getElseExpression());
			if(_conditionalexpression.getExpression() != null)
				children.add(_conditionalexpression.getExpression());
			if(_conditionalexpression.getThenExpression() != null)
				children.add(_conditionalexpression.getThenExpression());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassInnerClassMember__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeChar(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.PrimitiveTypeChar _primitivetypechar = (org.eclipse.modisco.java.PrimitiveTypeChar) obj;
			children.addAll(_primitivetypechar.getComments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedSingleVariableDeclaration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.UnresolvedSingleVariableDeclaration _unresolvedsinglevariabledeclaration = (org.eclipse.modisco.java.UnresolvedSingleVariableDeclaration) obj;
			children.addAll(_unresolvedsinglevariabledeclaration.getComments());
			if(_unresolvedsinglevariabledeclaration.getInitializer() != null)
				children.add(_unresolvedsinglevariabledeclaration.getInitializer());
			if(_unresolvedsinglevariabledeclaration.getModifier() != null)
				children.add(_unresolvedsinglevariabledeclaration.getModifier());
			if(_unresolvedsinglevariabledeclaration.getType() != null)
				children.add(_unresolvedsinglevariabledeclaration.getType());
			children.addAll(_unresolvedsinglevariabledeclaration.getAnnotations());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getConstructorInvocation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ConstructorInvocation _constructorinvocation = (org.eclipse.modisco.java.ConstructorInvocation) obj;
			children.addAll(_constructorinvocation.getComments());
			children.addAll(_constructorinvocation.getArguments());
			children.addAll(_constructorinvocation.getTypeArguments());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getExpressionStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.ExpressionStatement _expressionstatement = (org.eclipse.modisco.java.ExpressionStatement) obj;
			children.addAll(_expressionstatement.getComments());
			if(_expressionstatement.getExpression() != null)
				children.add(_expressionstatement.getExpression());
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSwitchStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.SwitchStatement _switchstatement = (org.eclipse.modisco.java.SwitchStatement) obj;
			children.addAll(_switchstatement.getComments());
			if(_switchstatement.getExpression() != null)
				children.add(_switchstatement.getExpression());
			children.addAll(_switchstatement.getStatements());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsDouble__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypesOrphaned__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterfaceExtendsInterface__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getVariableDeclarationExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.modisco.java.VariableDeclarationExpression _variabledeclarationexpression = (org.eclipse.modisco.java.VariableDeclarationExpression) obj;
			children.addAll(_variabledeclarationexpression.getComments());
			if(_variabledeclarationexpression.getType() != null)
				children.add(_variabledeclarationexpression.getType());
			children.addAll(_variabledeclarationexpression.getFragments());
			if(_variabledeclarationexpression.getModifier() != null)
				children.add(_variabledeclarationexpression.getModifier());
			children.addAll(_variabledeclarationexpression.getAnnotations());
			return children;
		});
		explorationConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
	}
	
	@Override
	public void preStart() throws Exception {

		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		if(HiPEConfig.loggingActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("NotificationNode" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(NotificationMessage.class, this::handleNotification) //
				.match(NoMoreInput.class, this::processNotifications) //
				.build();
	}
	
	/**
	 * delegate notifications to dispatcher actor
	 * @param notification
	 */
	public void handleNotification(NotificationMessage notification) {
		long tic = System.nanoTime();
		counter++;
		resolveNotification(notification.notification);
		getSender().tell(true, getSelf());
		time += System.nanoTime() - tic;
	}
	
	public void processNotifications(NoMoreInput msg) {
		long tic = System.nanoTime();
		long tell_tic = System.nanoTime();
		while(!notificationCache.isEmpty()) {
			dispatchActor.tell(notificationCache.poll(), getSelf());
		}
		dispatchActor.tell(msg, getSelf());
	}
	
	private void resolveNotification(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD: {
			if(notification.getNewValue() instanceof Resource) {
				resolveAddResource(notification);
			}else {
				resolveAdd(notification);
			}
			break;
		}
		case Notification.REMOVE: {
			resolveRemove(notification);
			break;
		}
		case Notification.REMOVING_ADAPTER: {
			resolveRemoveAdapter(notification);
			break;
		}
		case Notification.RESOLVE: {
			throw new RuntimeException("Notification type RESOLVE not supported");
		}
		case Notification.SET: {
			resolveSet(notification);
			break;
		}
		case Notification.UNSET: {
			throw new RuntimeException("Notification type UNSET not supported");
		}
		case Notification.MOVE: {
			throw new RuntimeException("Notification type MOVE not supported");
		}
		case Notification.ADD_MANY: {
			resolveAddMany(notification);
			break;
		}
		case Notification.REMOVE_MANY: {
			resolveRemoveMany(notification);
			break;
		}
		default: throw new RuntimeException("Notification type id("+notification.getEventType()+") not supported");
		
		}
	}
	
	private void resolveAddResource(Notification notification) {
		Resource r = (Resource) notification.getNewValue();
		r.getContents().forEach(node -> {
			explore(node);
		});
	}
	
	private void explore(EObject rootObj) {

		if(rootObj == null) 
			return;
		
		Notification rootNotify = new ENotificationImpl(castMaybe(rootObj), Notification.ADD, null, null, rootObj);
		if(!discoveredObjects.contains(rootObj)) {
			notificationCache.add(rootNotify);
			discoveredObjects.add(rootObj);
		}
		
		Queue<EObject> frontier = new LinkedList<>();
		frontier.addAll(explorationConsumer.get(rootObj.eClass()).apply(rootObj));
		while(!frontier.isEmpty()) {
			EObject child = frontier.poll();
			Notification childNotify = new ENotificationImpl(castMaybe(child), Notification.ADD, null, null, child);
			if(!discoveredObjects.contains(child)) {
				notificationCache.add(childNotify);
				discoveredObjects.add(child);
			}
			frontier.addAll(explorationConsumer.get(child.eClass()).apply(child));
		}
	}
	
	private void resolveAdd(Notification notification) {
		EObject node = (EObject) notification.getNewValue();
		if(node == null) {
			return;
		}
		
		notificationCache.add(notification);
		explore(node);
		
	}
	
	private void resolveAddMany(Notification notification) {
		@SuppressWarnings("unchecked")
		List<EObject> addedNodes = (List<EObject>)notification.getNewValue();
		addedNodes.parallelStream().forEach(addedNode -> {
			Notification notify = new ENotificationImpl(castMaybe(notification.getNotifier()), Notification.ADD, (EReference)notification.getFeature(), null, addedNode);
			resolveAdd(notify);
		});
	}
	
	private void resolveRemove(Notification notification) {
		discoveredObjects.remove(notification.getOldValue());
		notificationCache.add(notification);
	}
	
	private void resolveRemoveMany(Notification notification) {
		@SuppressWarnings("unchecked")
		List<EObject> removedNodes = (List<EObject>)notification.getOldValue();
		for(EObject removedNode : removedNodes) {
			Notification notify = new ENotificationImpl(castMaybe(notification.getNotifier()), Notification.REMOVE, (EReference)notification.getFeature(), removedNode, null);
			resolveRemove(notify);
		}
	}
	
	private void resolveRemoveAdapter(Notification notification) {
		EContentAdapter adapter = (EContentAdapter)notification.getOldValue();
		if(adapter == null)
			return;
		notificationCache.add(notification);
	}
	
	private void resolveSet(Notification notification) {
		if(notification.getFeature() != null && notification.getFeature() instanceof EReference) {
			Notification notify = null;
			if(notification.getNewValue() == null) {
				notify = new ENotificationImpl(castMaybe(notification.getNotifier()), Notification.REMOVE, (EReference)notification.getFeature(), notification.getOldValue() , null);
				resolveRemove(notify);
			} else {
				notify = new ENotificationImpl(castMaybe(notification.getNotifier()), Notification.ADD, (EReference)notification.getFeature(), null , notification.getNewValue());
				resolveAdd(notify);
			}
			
		}else {
			notificationCache.add(notification);
		}
		
	}
	
	private static InternalEObject castMaybe(Object o) {
		if(o instanceof InternalEObject) {
			return (InternalEObject)o;
		}else {
			return null;
		}
	}

}

