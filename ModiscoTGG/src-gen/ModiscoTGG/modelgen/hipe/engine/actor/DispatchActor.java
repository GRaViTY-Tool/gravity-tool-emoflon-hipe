package ModiscoTGG.modelgen.hipe.engine.actor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import static akka.pattern.Patterns.ask;

import hipe.engine.util.IncUtil;
import hipe.engine.message.NewInput;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.input.InputContainer;
import hipe.engine.message.input.ObjectAdded;
import hipe.engine.message.input.ObjectDeleted;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;		
import hipe.engine.message.input.AttributeChanged;

public class DispatchActor extends AbstractActor {
	
	private Map<String, ActorRef> name2actor;
	
	private Map<Object, Consumer<Object>> type2addConsumer = new HashMap<>();
	private Map<Object, Consumer<Notification>> feature2setConsumer = new HashMap<>();
	private Map<Object, Consumer<Notification>> feature2addEdgeConsumer = new HashMap<>();
	private Map<Object, Consumer<Notification>> feature2removeEdgeConsumer = new HashMap<>();
	
	private IncUtil util = IncUtil.getUtil();
	
	public DispatchActor(Map<String, ActorRef> name2actor) {
		this.name2actor = name2actor;
		
		initializeAdd();
		initializeSet();
		initializeAddEdge();
		initializeRemoveEdge();
	}
	
	private void initializeAdd() {
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTFieldDefinition(), obj -> {
			org.gravity.typegraph.basic.TFieldDefinition _tfielddefinition = (org.gravity.typegraph.basic.TFieldDefinition) obj;
			util.newMessage();
			name2actor.get("TFieldDefinition_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TFieldDefinition>(_tfielddefinition), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tfielddefinition), getSelf());
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_tfielddefinition), getSelf());
			util.newMessage();
			name2actor.get("TMember_object_SP0").tell(new ObjectAdded<org.gravity.typegraph.basic.TMember>(_tfielddefinition), getSelf());
			util.newMessage();
			name2actor.get("TMember_object_SP1").tell(new ObjectAdded<org.gravity.typegraph.basic.TMember>(_tfielddefinition), getSelf());
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMMethodName(), obj -> {
			org.gravity.modisco.MMethodName _mmethodname = (org.gravity.modisco.MMethodName) obj;
			util.newMessage();
			name2actor.get("MMethodName_object").tell(new ObjectAdded<org.gravity.modisco.MMethodName>(_mmethodname), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getBlock(), obj -> {
			org.eclipse.modisco.java.Block _block = (org.eclipse.modisco.java.Block) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSingleVariableAccess(), obj -> {
			org.eclipse.modisco.java.SingleVariableAccess _singlevariableaccess = (org.eclipse.modisco.java.SingleVariableAccess) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsBoolean__Marker(), obj -> {
			ModiscoTGG.PrimitiveTypeIsBoolean__Marker _primitivetypeisboolean__marker = (ModiscoTGG.PrimitiveTypeIsBoolean__Marker) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTPackage(), obj -> {
			org.gravity.typegraph.basic.TPackage _tpackage = (org.gravity.typegraph.basic.TPackage) obj;
			util.newMessage();
			name2actor.get("TPackage_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TPackage>(_tpackage), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tpackage), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getArchive(), obj -> {
			org.eclipse.modisco.java.Archive _archive = (org.eclipse.modisco.java.Archive) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getNestedClassInType__Marker(), obj -> {
			ModiscoTGG.NestedClassInType__Marker _nestedclassintype__marker = (ModiscoTGG.NestedClassInType__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getInfixExpression(), obj -> {
			org.eclipse.modisco.java.InfixExpression _infixexpression = (org.eclipse.modisco.java.InfixExpression) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTypeParameter(), obj -> {
			org.eclipse.modisco.java.TypeParameter _typeparameter = (org.eclipse.modisco.java.TypeParameter) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_typeparameter), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueBooleanArray__Marker(), obj -> {
			ModiscoTGG.AnnotationMemberValueBooleanArray__Marker _annotationmembervaluebooleanarray__marker = (ModiscoTGG.AnnotationMemberValueBooleanArray__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueNumber__Marker(), obj -> {
			ModiscoTGG.AnnotationMemberValueNumber__Marker _annotationmembervaluenumber__marker = (ModiscoTGG.AnnotationMemberValueNumber__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClass__Marker(), obj -> {
			ModiscoTGG.AnonymousClass__Marker _anonymousclass__marker = (ModiscoTGG.AnonymousClass__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModelToTypeGraph(), obj -> {
			ModiscoTGG.ModelToTypeGraph _modeltotypegraph = (ModiscoTGG.ModelToTypeGraph) obj;
			util.newMessage();
			name2actor.get("ModelToTypeGraph_object").tell(new ObjectAdded<ModiscoTGG.ModelToTypeGraph>(_modeltotypegraph), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getLinkDefinitionToType__Marker(), obj -> {
			ModiscoTGG.LinkDefinitionToType__Marker _linkdefinitiontotype__marker = (ModiscoTGG.LinkDefinitionToType__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getWildCardType(), obj -> {
			org.eclipse.modisco.java.WildCardType _wildcardtype = (org.eclipse.modisco.java.WildCardType) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_wildcardtype), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getStringLiteral(), obj -> {
			org.eclipse.modisco.java.StringLiteral _stringliteral = (org.eclipse.modisco.java.StringLiteral) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSuperMethodInvocation(), obj -> {
			org.eclipse.modisco.java.SuperMethodInvocation _supermethodinvocation = (org.eclipse.modisco.java.SuperMethodInvocation) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodParameterLinkFirst__Marker(), obj -> {
			ModiscoTGG.MethodParameterLinkFirst__Marker _methodparameterlinkfirst__marker = (ModiscoTGG.MethodParameterLinkFirst__Marker) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTConstructor(), obj -> {
			org.gravity.typegraph.basic.TConstructor _tconstructor = (org.gravity.typegraph.basic.TConstructor) obj;
			util.newMessage();
			name2actor.get("TAnnotation_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotation>(_tconstructor), getSelf());
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMParameterList(), obj -> {
			org.gravity.modisco.MParameterList _mparameterlist = (org.gravity.modisco.MParameterList) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMSingleVariableDeclaration(), obj -> {
			org.gravity.modisco.MSingleVariableDeclaration _msinglevariabledeclaration = (org.gravity.modisco.MSingleVariableDeclaration) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getNumberLiteral(), obj -> {
			org.eclipse.modisco.java.NumberLiteral _numberliteral = (org.eclipse.modisco.java.NumberLiteral) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSwitchStatement(), obj -> {
			org.eclipse.modisco.java.SwitchStatement _switchstatement = (org.eclipse.modisco.java.SwitchStatement) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getLinkDefinitionToAnonymous__Marker(), obj -> {
			ModiscoTGG.LinkDefinitionToAnonymous__Marker _linkdefinitiontoanonymous__marker = (ModiscoTGG.LinkDefinitionToAnonymous__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassDeclarationToTClass(), obj -> {
			ModiscoTGG.AnonymousClassDeclarationToTClass _anonymousclassdeclarationtotclass = (ModiscoTGG.AnonymousClassDeclarationToTClass) obj;
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ObjectAdded<ModiscoTGG.AnonymousClassDeclarationToTClass>(_anonymousclassdeclarationtotclass), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getVariableDeclarationFragmentToTFieldDefinition(), obj -> {
			ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition _variabledeclarationfragmenttotfielddefinition = (ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueString__Marker(), obj -> {
			ModiscoTGG.AnnotationMemberValueString__Marker _annotationmembervaluestring__marker = (ModiscoTGG.AnnotationMemberValueString__Marker) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMConstructorInvocation(), obj -> {
			org.gravity.modisco.MConstructorInvocation _mconstructorinvocation = (org.gravity.modisco.MConstructorInvocation) obj;
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mconstructorinvocation), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember(), obj -> {
			ModiscoTGG.MDefinitionToTMember _mdefinitiontotmember = (ModiscoTGG.MDefinitionToTMember) obj;
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ObjectAdded<ModiscoTGG.MDefinitionToTMember>(_mdefinitiontotmember), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ObjectAdded<ModiscoTGG.MDefinitionToTMember>(_mdefinitiontotmember), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueClassArray__Marker(), obj -> {
			ModiscoTGG.AnnotationMemberValueClassArray__Marker _annotationmembervalueclassarray__marker = (ModiscoTGG.AnnotationMemberValueClassArray__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTypeDeclarationStatement(), obj -> {
			org.eclipse.modisco.java.TypeDeclarationStatement _typedeclarationstatement = (org.eclipse.modisco.java.TypeDeclarationStatement) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMFieldNameToTField(), obj -> {
			ModiscoTGG.MFieldNameToTField _mfieldnametotfield = (ModiscoTGG.MFieldNameToTField) obj;
			util.newMessage();
			name2actor.get("MFieldNameToTField_object").tell(new ObjectAdded<ModiscoTGG.MFieldNameToTField>(_mfieldnametotfield), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getInitializer(), obj -> {
			org.eclipse.modisco.java.Initializer _initializer = (org.eclipse.modisco.java.Initializer) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_initializer), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPackage(), obj -> {
			org.eclipse.modisco.java.Package _package = (org.eclipse.modisco.java.Package) obj;
			util.newMessage();
			name2actor.get("Package_object").tell(new ObjectAdded<org.eclipse.modisco.java.Package>(_package), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTagElement(), obj -> {
			org.eclipse.modisco.java.TagElement _tagelement = (org.eclipse.modisco.java.TagElement) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTField(), obj -> {
			org.gravity.typegraph.basic.TField _tfield = (org.gravity.typegraph.basic.TField) obj;
			util.newMessage();
			name2actor.get("TField_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TField>(_tfield), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getNullLiteral(), obj -> {
			org.eclipse.modisco.java.NullLiteral _nullliteral = (org.eclipse.modisco.java.NullLiteral) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getModifier(), obj -> {
			org.eclipse.modisco.java.Modifier _modifier = (org.eclipse.modisco.java.Modifier) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getNamedElement(), obj -> {
			org.eclipse.modisco.java.NamedElement _namedelement = (org.eclipse.modisco.java.NamedElement) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedType(), obj -> {
			org.eclipse.modisco.java.UnresolvedType _unresolvedtype = (org.eclipse.modisco.java.UnresolvedType) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_unresolvedtype), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTFlow(), obj -> {
			org.gravity.typegraph.basic.TFlow _tflow = (org.gravity.typegraph.basic.TFlow) obj;
			util.newMessage();
			name2actor.get("TFlow_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TFlow>(_tflow), getSelf());
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_tflow), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMEntryToTParameter(), obj -> {
			ModiscoTGG.MEntryToTParameter _mentrytotparameter = (ModiscoTGG.MEntryToTParameter) obj;
			util.newMessage();
			name2actor.get("MEntryToTParameter_object").tell(new ObjectAdded<ModiscoTGG.MEntryToTParameter>(_mentrytotparameter), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAnonymousClassDeclaration(), obj -> {
			org.eclipse.modisco.java.AnonymousClassDeclaration _anonymousclassdeclaration = (org.eclipse.modisco.java.AnonymousClassDeclaration) obj;
			util.newMessage();
			name2actor.get("AnonymousClassDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AnonymousClassDeclaration>(_anonymousclassdeclaration), getSelf());
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMAbstractFlowElement(), obj -> {
			org.gravity.modisco.MAbstractFlowElement _mabstractflowelement = (org.gravity.modisco.MAbstractFlowElement) obj;
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mabstractflowelement), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getModel(), obj -> {
			org.eclipse.modisco.java.Model _model = (org.eclipse.modisco.java.Model) obj;
			util.newMessage();
			name2actor.get("Model_object").tell(new ObjectAdded<org.eclipse.modisco.java.Model>(_model), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMAbstractFlowElementToTAbstractFlowElement(), obj -> {
			ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement _mabstractflowelementtotabstractflowelement = (ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement) obj;
			util.newMessage();
			name2actor.get("MAbstractFlowElementToTAbstractFlowElement_object").tell(new ObjectAdded<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement>(_mabstractflowelementtotabstractflowelement), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsChar__Marker(), obj -> {
			ModiscoTGG.PrimitiveTypeIsChar__Marker _primitivetypeischar__marker = (ModiscoTGG.PrimitiveTypeIsChar__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldSignature__Marker(), obj -> {
			ModiscoTGG.FieldSignature__Marker _fieldsignature__marker = (ModiscoTGG.FieldSignature__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedInterfaceDeclaration(), obj -> {
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration _unresolvedinterfacedeclaration = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_unresolvedinterfacedeclaration), getSelf());
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_unresolvedinterfacedeclaration), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AbstractTypeDeclaration>(_unresolvedinterfacedeclaration), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.InterfaceDeclaration>(_unresolvedinterfacedeclaration), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeFloat(), obj -> {
			org.eclipse.modisco.java.PrimitiveTypeFloat _primitivetypefloat = (org.eclipse.modisco.java.PrimitiveTypeFloat) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_primitivetypefloat), getSelf());
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMethodInvocationStaticType(), obj -> {
			org.gravity.modisco.MethodInvocationStaticType _methodinvocationstatictype = (org.gravity.modisco.MethodInvocationStaticType) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getClassDeclaration(), obj -> {
			org.eclipse.modisco.java.ClassDeclaration _classdeclaration = (org.eclipse.modisco.java.ClassDeclaration) obj;
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.ClassDeclaration>(_classdeclaration), getSelf());
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_classdeclaration), getSelf());
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_classdeclaration), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AbstractTypeDeclaration>(_classdeclaration), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedSingleVariableDeclaration(), obj -> {
			org.eclipse.modisco.java.UnresolvedSingleVariableDeclaration _unresolvedsinglevariabledeclaration = (org.eclipse.modisco.java.UnresolvedSingleVariableDeclaration) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTFieldSignatureContainer(), obj -> {
			org.gravity.typegraph.basic.containers.TFieldSignatureContainer _tfieldsignaturecontainer = (org.gravity.typegraph.basic.containers.TFieldSignatureContainer) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMSignature(), obj -> {
			org.gravity.modisco.MSignature _msignature = (org.gravity.modisco.MSignature) obj;
			util.newMessage();
			name2actor.get("MSignature_object").tell(new ObjectAdded<org.gravity.modisco.MSignature>(_msignature), getSelf());
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_msignature), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getThrowStatement(), obj -> {
			org.eclipse.modisco.java.ThrowStatement _throwstatement = (org.eclipse.modisco.java.ThrowStatement) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getSyntethicMethod__Marker(), obj -> {
			ModiscoTGG.SyntethicMethod__Marker _syntethicmethod__marker = (ModiscoTGG.SyntethicMethod__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getBreakStatement(), obj -> {
			org.eclipse.modisco.java.BreakStatement _breakstatement = (org.eclipse.modisco.java.BreakStatement) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getLabeledStatement(), obj -> {
			org.eclipse.modisco.java.LabeledStatement _labeledstatement = (org.eclipse.modisco.java.LabeledStatement) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getInstanceofExpression(), obj -> {
			org.eclipse.modisco.java.InstanceofExpression _instanceofexpression = (org.eclipse.modisco.java.InstanceofExpression) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldType__Marker(), obj -> {
			ModiscoTGG.FieldType__Marker _fieldtype__marker = (ModiscoTGG.FieldType__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getClassInstanceCreation(), obj -> {
			org.eclipse.modisco.java.ClassInstanceCreation _classinstancecreation = (org.eclipse.modisco.java.ClassInstanceCreation) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getLineComment(), obj -> {
			org.eclipse.modisco.java.LineComment _linecomment = (org.eclipse.modisco.java.LineComment) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTTextNode(), obj -> {
			org.gravity.typegraph.basic.annotations.TTextNode _ttextnode = (org.gravity.typegraph.basic.annotations.TTextNode) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodParameterLink__Marker(), obj -> {
			ModiscoTGG.MethodParameterLink__Marker _methodparameterlink__marker = (ModiscoTGG.MethodParameterLink__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMemberInEnumVisibility__Marker(), obj -> {
			ModiscoTGG.MemberInEnumVisibility__Marker _memberinenumvisibility__marker = (ModiscoTGG.MemberInEnumVisibility__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassInstanceCreation__Marker(), obj -> {
			ModiscoTGG.ClassInstanceCreation__Marker _classinstancecreation__marker = (ModiscoTGG.ClassInstanceCreation__Marker) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTAnnotatable(), obj -> {
			org.gravity.typegraph.basic.annotations.TAnnotatable _tannotatable = (org.gravity.typegraph.basic.annotations.TAnnotatable) obj;
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tannotatable), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getFieldDeclaration(), obj -> {
			org.eclipse.modisco.java.FieldDeclaration _fielddeclaration = (org.eclipse.modisco.java.FieldDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_fielddeclaration), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAssignment(), obj -> {
			org.eclipse.modisco.java.Assignment _assignment = (org.eclipse.modisco.java.Assignment) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMAbstractMethodDefinition(), obj -> {
			org.gravity.modisco.MAbstractMethodDefinition _mabstractmethoddefinition = (org.gravity.modisco.MAbstractMethodDefinition) obj;
			util.newMessage();
			name2actor.get("MAbstractMethodDefinition_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractMethodDefinition>(_mabstractmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_mabstractmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mabstractmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("MDefinition_object_SP0").tell(new ObjectAdded<org.gravity.modisco.MDefinition>(_mabstractmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("MDefinition_object_SP1").tell(new ObjectAdded<org.gravity.modisco.MDefinition>(_mabstractmethoddefinition), getSelf());
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMGravityModel(), obj -> {
			org.gravity.modisco.MGravityModel _mgravitymodel = (org.gravity.modisco.MGravityModel) obj;
			util.newMessage();
			name2actor.get("MGravityModel_object").tell(new ObjectAdded<org.gravity.modisco.MGravityModel>(_mgravitymodel), getSelf());
			util.newMessage();
			name2actor.get("Model_object").tell(new ObjectAdded<org.eclipse.modisco.java.Model>(_mgravitymodel), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPackageToTPackage(), obj -> {
			ModiscoTGG.PackageToTPackage _packagetotpackage = (ModiscoTGG.PackageToTPackage) obj;
			util.newMessage();
			name2actor.get("PackageToTPackage_object").tell(new ObjectAdded<ModiscoTGG.PackageToTPackage>(_packagetotpackage), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getVariableDeclarationStatement(), obj -> {
			org.eclipse.modisco.java.VariableDeclarationStatement _variabledeclarationstatement = (org.eclipse.modisco.java.VariableDeclarationStatement) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getNumberLiteralToTNumberNode(), obj -> {
			ModiscoTGG.NumberLiteralToTNumberNode _numberliteraltotnumbernode = (ModiscoTGG.NumberLiteralToTNumberNode) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getArrayLengthAccess(), obj -> {
			org.eclipse.modisco.java.ArrayLengthAccess _arraylengthaccess = (org.eclipse.modisco.java.ArrayLengthAccess) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTAnnotation(), obj -> {
			org.gravity.typegraph.basic.annotations.TAnnotation _tannotation = (org.gravity.typegraph.basic.annotations.TAnnotation) obj;
			util.newMessage();
			name2actor.get("TAnnotation_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotation>(_tannotation), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getArrayAccess(), obj -> {
			org.eclipse.modisco.java.ArrayAccess _arrayaccess = (org.eclipse.modisco.java.ArrayAccess) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeToTClass(), obj -> {
			ModiscoTGG.PrimitiveTypeToTClass _primitivetypetotclass = (ModiscoTGG.PrimitiveTypeToTClass) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeDouble(), obj -> {
			org.eclipse.modisco.java.PrimitiveTypeDouble _primitivetypedouble = (org.eclipse.modisco.java.PrimitiveTypeDouble) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_primitivetypedouble), getSelf());
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMMethodDefinition(), obj -> {
			org.gravity.modisco.MMethodDefinition _mmethoddefinition = (org.gravity.modisco.MMethodDefinition) obj;
			util.newMessage();
			name2actor.get("MMethodDefinition_object").tell(new ObjectAdded<org.gravity.modisco.MMethodDefinition>(_mmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_mmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("MDefinition_object_SP0").tell(new ObjectAdded<org.gravity.modisco.MDefinition>(_mmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("MDefinition_object_SP1").tell(new ObjectAdded<org.gravity.modisco.MDefinition>(_mmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("MAbstractMethodDefinition_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractMethodDefinition>(_mmethoddefinition), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTMemberContainer(), obj -> {
			org.gravity.typegraph.basic.containers.TMemberContainer _tmembercontainer = (org.gravity.typegraph.basic.containers.TMemberContainer) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMClassInstanceCreation(), obj -> {
			org.gravity.modisco.MClassInstanceCreation _mclassinstancecreation = (org.gravity.modisco.MClassInstanceCreation) obj;
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mclassinstancecreation), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getConditionalExpression(), obj -> {
			org.eclipse.modisco.java.ConditionalExpression _conditionalexpression = (org.eclipse.modisco.java.ConditionalExpression) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMSyntheticMethodDefinition(), obj -> {
			org.gravity.modisco.MSyntheticMethodDefinition _msyntheticmethoddefinition = (org.gravity.modisco.MSyntheticMethodDefinition) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_msyntheticmethoddefinition), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getParameterizedTypeToClass__Marker(), obj -> {
			ModiscoTGG.ParameterizedTypeToClass__Marker _parameterizedtypetoclass__marker = (ModiscoTGG.ParameterizedTypeToClass__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMMethodNameToTMethod(), obj -> {
			ModiscoTGG.MMethodNameToTMethod _mmethodnametotmethod = (ModiscoTGG.MMethodNameToTMethod) obj;
			util.newMessage();
			name2actor.get("MMethodNameToTMethod_object").tell(new ObjectAdded<ModiscoTGG.MMethodNameToTMethod>(_mmethodnametotmethod), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsByte__Marker(), obj -> {
			ModiscoTGG.PrimitiveTypeIsByte__Marker _primitivetypeisbyte__marker = (ModiscoTGG.PrimitiveTypeIsByte__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getNestedInterfaceInType__Marker(), obj -> {
			ModiscoTGG.NestedInterfaceInType__Marker _nestedinterfaceintype__marker = (ModiscoTGG.NestedInterfaceInType__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMFlowToTFlow(), obj -> {
			ModiscoTGG.MFlowToTFlow _mflowtotflow = (ModiscoTGG.MFlowToTFlow) obj;
			util.newMessage();
			name2actor.get("MFlowToTFlow_object").tell(new ObjectAdded<ModiscoTGG.MFlowToTFlow>(_mflowtotflow), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationToTAnnotation(), obj -> {
			ModiscoTGG.AnnotationToTAnnotation _annotationtotannotation = (ModiscoTGG.AnnotationToTAnnotation) obj;
			util.newMessage();
			name2actor.get("AnnotationToTAnnotation_object").tell(new ObjectAdded<ModiscoTGG.AnnotationToTAnnotation>(_annotationtotannotation), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration(), obj -> {
			org.eclipse.modisco.java.AbstractTypeDeclaration _abstracttypedeclaration = (org.eclipse.modisco.java.AbstractTypeDeclaration) obj;
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AbstractTypeDeclaration>(_abstracttypedeclaration), getSelf());
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_abstracttypedeclaration), getSelf());
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_abstracttypedeclaration), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getConstructorInvocation(), obj -> {
			org.eclipse.modisco.java.ConstructorInvocation _constructorinvocation = (org.eclipse.modisco.java.ConstructorInvocation) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAnnotation(), obj -> {
			org.eclipse.modisco.java.Annotation _annotation = (org.eclipse.modisco.java.Annotation) obj;
			util.newMessage();
			name2actor.get("Annotation_object").tell(new ObjectAdded<org.eclipse.modisco.java.Annotation>(_annotation), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldName__Marker(), obj -> {
			ModiscoTGG.FieldName__Marker _fieldname__marker = (ModiscoTGG.FieldName__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedAnnotationTypeMemberDeclaration(), obj -> {
			org.eclipse.modisco.java.UnresolvedAnnotationTypeMemberDeclaration _unresolvedannotationtypememberdeclaration = (org.eclipse.modisco.java.UnresolvedAnnotationTypeMemberDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_unresolvedannotationtypememberdeclaration), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTSyntethicMethod(), obj -> {
			org.gravity.typegraph.basic.TSyntethicMethod _tsyntethicmethod = (org.gravity.typegraph.basic.TSyntethicMethod) obj;
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tsyntethicmethod), getSelf());
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_tsyntethicmethod), getSelf());
			util.newMessage();
			name2actor.get("TMember_object_SP0").tell(new ObjectAdded<org.gravity.typegraph.basic.TMember>(_tsyntethicmethod), getSelf());
			util.newMessage();
			name2actor.get("TMember_object_SP1").tell(new ObjectAdded<org.gravity.typegraph.basic.TMember>(_tsyntethicmethod), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getFieldAccess(), obj -> {
			org.eclipse.modisco.java.FieldAccess _fieldaccess = (org.eclipse.modisco.java.FieldAccess) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractVariablesContainer(), obj -> {
			org.eclipse.modisco.java.AbstractVariablesContainer _abstractvariablescontainer = (org.eclipse.modisco.java.AbstractVariablesContainer) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrefixExpression(), obj -> {
			org.eclipse.modisco.java.PrefixExpression _prefixexpression = (org.eclipse.modisco.java.PrefixExpression) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getUnresolvedTypeDeclaration__Marker(), obj -> {
			ModiscoTGG.UnresolvedTypeDeclaration__Marker _unresolvedtypedeclaration__marker = (ModiscoTGG.UnresolvedTypeDeclaration__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getEmptyStatement(), obj -> {
			org.eclipse.modisco.java.EmptyStatement _emptystatement = (org.eclipse.modisco.java.EmptyStatement) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMSuperMethodInvocation(), obj -> {
			org.gravity.modisco.MSuperMethodInvocation _msupermethodinvocation = (org.gravity.modisco.MSuperMethodInvocation) obj;
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_msupermethodinvocation), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassTypeInterface__Marker(), obj -> {
			ModiscoTGG.AnonymousClassTypeInterface__Marker _anonymousclasstypeinterface__marker = (ModiscoTGG.AnonymousClassTypeInterface__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldAccessRead__Marker(), obj -> {
			ModiscoTGG.FieldAccessRead__Marker _fieldaccessread__marker = (ModiscoTGG.FieldAccessRead__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldAccessWrite__Marker(), obj -> {
			ModiscoTGG.FieldAccessWrite__Marker _fieldaccesswrite__marker = (ModiscoTGG.FieldAccessWrite__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getParameterizedType(), obj -> {
			org.eclipse.modisco.java.ParameterizedType _parameterizedtype = (org.eclipse.modisco.java.ParameterizedType) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_parameterizedtype), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationTypeInAnonymous__Marker(), obj -> {
			ModiscoTGG.AnnotationTypeInAnonymous__Marker _annotationtypeinanonymous__marker = (ModiscoTGG.AnnotationTypeInAnonymous__Marker) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTFieldDefinitionContainer(), obj -> {
			org.gravity.typegraph.basic.containers.TFieldDefinitionContainer _tfielddefinitioncontainer = (org.gravity.typegraph.basic.containers.TFieldDefinitionContainer) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getEnumDeclaration(), obj -> {
			org.eclipse.modisco.java.EnumDeclaration _enumdeclaration = (org.eclipse.modisco.java.EnumDeclaration) obj;
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.EnumDeclaration>(_enumdeclaration), getSelf());
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_enumdeclaration), getSelf());
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_enumdeclaration), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AbstractTypeDeclaration>(_enumdeclaration), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPostfixExpression(), obj -> {
			org.eclipse.modisco.java.PostfixExpression _postfixexpression = (org.eclipse.modisco.java.PostfixExpression) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassExtendsClass__Marker(), obj -> {
			ModiscoTGG.ClassExtendsClass__Marker _classextendsclass__marker = (ModiscoTGG.ClassExtendsClass__Marker) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTMethodSignature(), obj -> {
			org.gravity.typegraph.basic.TMethodSignature _tmethodsignature = (org.gravity.typegraph.basic.TMethodSignature) obj;
			util.newMessage();
			name2actor.get("TMethodSignature_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TMethodSignature>(_tmethodsignature), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tmethodsignature), getSelf());
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_tmethodsignature), getSelf());
			util.newMessage();
			name2actor.get("TSignature_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TSignature>(_tmethodsignature), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedClassDeclaration(), obj -> {
			org.eclipse.modisco.java.UnresolvedClassDeclaration _unresolvedclassdeclaration = (org.eclipse.modisco.java.UnresolvedClassDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_unresolvedclassdeclaration), getSelf());
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_unresolvedclassdeclaration), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AbstractTypeDeclaration>(_unresolvedclassdeclaration), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.ClassDeclaration>(_unresolvedclassdeclaration), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTAnnotationValue(), obj -> {
			org.gravity.typegraph.basic.annotations.TAnnotationValue _tannotationvalue = (org.gravity.typegraph.basic.annotations.TAnnotationValue) obj;
			util.newMessage();
			name2actor.get("TAnnotationValue_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotationValue>(_tannotationvalue), getSelf());
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMName(), obj -> {
			org.gravity.modisco.MName _mname = (org.gravity.modisco.MName) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypesOrphaned__Marker(), obj -> {
			ModiscoTGG.TypesOrphaned__Marker _typesorphaned__marker = (ModiscoTGG.TypesOrphaned__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature(), obj -> {
			ModiscoTGG.MSignatureToTSignature _msignaturetotsignature = (ModiscoTGG.MSignatureToTSignature) obj;
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ObjectAdded<ModiscoTGG.MSignatureToTSignature>(_msignaturetotsignature), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ObjectAdded<ModiscoTGG.MSignatureToTSignature>(_msignaturetotsignature), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTMember(), obj -> {
			org.gravity.typegraph.basic.TMember _tmember = (org.gravity.typegraph.basic.TMember) obj;
			util.newMessage();
			name2actor.get("TMember_object_SP0").tell(new ObjectAdded<org.gravity.typegraph.basic.TMember>(_tmember), getSelf());
			util.newMessage();
			name2actor.get("TMember_object_SP1").tell(new ObjectAdded<org.gravity.typegraph.basic.TMember>(_tmember), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tmember), getSelf());
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_tmember), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getForStatement(), obj -> {
			org.eclipse.modisco.java.ForStatement _forstatement = (org.eclipse.modisco.java.ForStatement) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAccess(), obj -> {
			org.gravity.typegraph.basic.TAccess _taccess = (org.gravity.typegraph.basic.TAccess) obj;
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_taccess), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPackageAccess(), obj -> {
			org.eclipse.modisco.java.PackageAccess _packageaccess = (org.eclipse.modisco.java.PackageAccess) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getExpressionStatement(), obj -> {
			org.eclipse.modisco.java.ExpressionStatement _expressionstatement = (org.eclipse.modisco.java.ExpressionStatement) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getOutgoingFlow__Marker(), obj -> {
			ModiscoTGG.OutgoingFlow__Marker _outgoingflow__marker = (ModiscoTGG.OutgoingFlow__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeLong(), obj -> {
			org.eclipse.modisco.java.PrimitiveTypeLong _primitivetypelong = (org.eclipse.modisco.java.PrimitiveTypeLong) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_primitivetypelong), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedAnnotationDeclaration(), obj -> {
			org.eclipse.modisco.java.UnresolvedAnnotationDeclaration _unresolvedannotationdeclaration = (org.eclipse.modisco.java.UnresolvedAnnotationDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_unresolvedannotationdeclaration), getSelf());
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_unresolvedannotationdeclaration), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AbstractTypeDeclaration>(_unresolvedannotationdeclaration), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AnnotationTypeDeclaration>(_unresolvedannotationdeclaration), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getCharacterLiteral(), obj -> {
			org.eclipse.modisco.java.CharacterLiteral _characterliteral = (org.eclipse.modisco.java.CharacterLiteral) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getMethodRef(), obj -> {
			org.eclipse.modisco.java.MethodRef _methodref = (org.eclipse.modisco.java.MethodRef) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTNumberNode(), obj -> {
			org.gravity.typegraph.basic.annotations.TNumberNode _tnumbernode = (org.gravity.typegraph.basic.annotations.TNumberNode) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodSignature__Marker(), obj -> {
			ModiscoTGG.MethodSignature__Marker _methodsignature__marker = (ModiscoTGG.MethodSignature__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveType(), obj -> {
			org.eclipse.modisco.java.PrimitiveType _primitivetype = (org.eclipse.modisco.java.PrimitiveType) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_primitivetype), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypesIsVoid__Marker(), obj -> {
			ModiscoTGG.PrimitiveTypesIsVoid__Marker _primitivetypesisvoid__marker = (ModiscoTGG.PrimitiveTypesIsVoid__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSyntethicMethodToTSyntethicMethod(), obj -> {
			ModiscoTGG.MSyntethicMethodToTSyntethicMethod _msyntethicmethodtotsyntethicmethod = (ModiscoTGG.MSyntethicMethodToTSyntethicMethod) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModelToPg__Marker(), obj -> {
			ModiscoTGG.ModelToPg__Marker _modeltopg__marker = (ModiscoTGG.ModelToPg__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getNestedEnum__Marker(), obj -> {
			ModiscoTGG.NestedEnum__Marker _nestedenum__marker = (ModiscoTGG.NestedEnum__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSingleVariableDeclaration(), obj -> {
			org.eclipse.modisco.java.SingleVariableDeclaration _singlevariabledeclaration = (org.eclipse.modisco.java.SingleVariableDeclaration) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTMethod(), obj -> {
			org.gravity.typegraph.basic.TMethod _tmethod = (org.gravity.typegraph.basic.TMethod) obj;
			util.newMessage();
			name2actor.get("TMethod_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TMethod>(_tmethod), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTCall(), obj -> {
			org.gravity.typegraph.basic.TCall _tcall = (org.gravity.typegraph.basic.TCall) obj;
			util.newMessage();
			name2actor.get("TCall_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TCall>(_tcall), getSelf());
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_tcall), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTRead(), obj -> {
			org.gravity.typegraph.basic.TRead _tread = (org.gravity.typegraph.basic.TRead) obj;
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_tread), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassImplementsInterface__Marker(), obj -> {
			ModiscoTGG.ClassImplementsInterface__Marker _classimplementsinterface__marker = (ModiscoTGG.ClassImplementsInterface__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAssertStatement(), obj -> {
			org.eclipse.modisco.java.AssertStatement _assertstatement = (org.eclipse.modisco.java.AssertStatement) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTryStatement(), obj -> {
			org.eclipse.modisco.java.TryStatement _trystatement = (org.eclipse.modisco.java.TryStatement) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getEnhancedForStatement(), obj -> {
			org.eclipse.modisco.java.EnhancedForStatement _enhancedforstatement = (org.eclipse.modisco.java.EnhancedForStatement) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTypeGraph(), obj -> {
			org.gravity.typegraph.basic.TypeGraph _typegraph = (org.gravity.typegraph.basic.TypeGraph) obj;
			util.newMessage();
			name2actor.get("TypeGraph_object_SP0").tell(new ObjectAdded<org.gravity.typegraph.basic.TypeGraph>(_typegraph), getSelf());
			util.newMessage();
			name2actor.get("TypeGraph_object_SP1").tell(new ObjectAdded<org.gravity.typegraph.basic.TypeGraph>(_typegraph), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_typegraph), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationOnBodyDeclaration__Marker(), obj -> {
			ModiscoTGG.AnnotationOnBodyDeclaration__Marker _annotationonbodydeclaration__marker = (ModiscoTGG.AnnotationOnBodyDeclaration__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAbstractMethodInvocationToTAccess(), obj -> {
			ModiscoTGG.AbstractMethodInvocationToTAccess _abstractmethodinvocationtotaccess = (ModiscoTGG.AbstractMethodInvocationToTAccess) obj;
			util.newMessage();
			name2actor.get("AbstractMethodInvocationToTAccess_object").tell(new ObjectAdded<ModiscoTGG.AbstractMethodInvocationToTAccess>(_abstractmethodinvocationtotaccess), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getCastExpression(), obj -> {
			org.eclipse.modisco.java.CastExpression _castexpression = (org.eclipse.modisco.java.CastExpression) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getManifestEntry(), obj -> {
			org.eclipse.modisco.java.ManifestEntry _manifestentry = (org.eclipse.modisco.java.ManifestEntry) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMMethodInvocation(), obj -> {
			org.gravity.modisco.MMethodInvocation _mmethodinvocation = (org.gravity.modisco.MMethodInvocation) obj;
			util.newMessage();
			name2actor.get("MMethodInvocation_object").tell(new ObjectAdded<org.gravity.modisco.MMethodInvocation>(_mmethodinvocation), getSelf());
			util.newMessage();
			name2actor.get("MethodInvocation_object").tell(new ObjectAdded<org.eclipse.modisco.java.MethodInvocation>(_mmethodinvocation), getSelf());
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mmethodinvocation), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAnnotationTypeDeclaration(), obj -> {
			org.eclipse.modisco.java.AnnotationTypeDeclaration _annotationtypedeclaration = (org.eclipse.modisco.java.AnnotationTypeDeclaration) obj;
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AnnotationTypeDeclaration>(_annotationtypedeclaration), getSelf());
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_annotationtypedeclaration), getSelf());
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_annotationtypedeclaration), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AbstractTypeDeclaration>(_annotationtypedeclaration), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getArrayTypeToClass__Marker(), obj -> {
			ModiscoTGG.ArrayTypeToClass__Marker _arraytypetoclass__marker = (ModiscoTGG.ArrayTypeToClass__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getSubPackageToPGPackage__Marker(), obj -> {
			ModiscoTGG.SubPackageToPGPackage__Marker _subpackagetopgpackage__marker = (ModiscoTGG.SubPackageToPGPackage__Marker) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMMethodSignature(), obj -> {
			org.gravity.modisco.MMethodSignature _mmethodsignature = (org.gravity.modisco.MMethodSignature) obj;
			util.newMessage();
			name2actor.get("MMethodSignature_object").tell(new ObjectAdded<org.gravity.modisco.MMethodSignature>(_mmethodsignature), getSelf());
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mmethodsignature), getSelf());
			util.newMessage();
			name2actor.get("MSignature_object").tell(new ObjectAdded<org.gravity.modisco.MSignature>(_mmethodsignature), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getEnumInAnonymous__Marker(), obj -> {
			ModiscoTGG.EnumInAnonymous__Marker _enuminanonymous__marker = (ModiscoTGG.EnumInAnonymous__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getParenthesizedExpression(), obj -> {
			org.eclipse.modisco.java.ParenthesizedExpression _parenthesizedexpression = (org.eclipse.modisco.java.ParenthesizedExpression) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getMethodInvocation(), obj -> {
			org.eclipse.modisco.java.MethodInvocation _methodinvocation = (org.eclipse.modisco.java.MethodInvocation) obj;
			util.newMessage();
			name2actor.get("MethodInvocation_object").tell(new ObjectAdded<org.eclipse.modisco.java.MethodInvocation>(_methodinvocation), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTextAnnotations__Marker(), obj -> {
			ModiscoTGG.TextAnnotations__Marker _textannotations__marker = (ModiscoTGG.TextAnnotations__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeParameter__Marker(), obj -> {
			ModiscoTGG.TypeParameter__Marker _typeparameter__marker = (ModiscoTGG.TypeParameter__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getCatchClause(), obj -> {
			org.eclipse.modisco.java.CatchClause _catchclause = (org.eclipse.modisco.java.CatchClause) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTClassNode(), obj -> {
			org.gravity.typegraph.basic.annotations.TClassNode _tclassnode = (org.gravity.typegraph.basic.annotations.TClassNode) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getCompilationUnit(), obj -> {
			org.eclipse.modisco.java.CompilationUnit _compilationunit = (org.eclipse.modisco.java.CompilationUnit) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFlow__Marker(), obj -> {
			ModiscoTGG.Flow__Marker _flow__marker = (ModiscoTGG.Flow__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodDefinition__Marker(), obj -> {
			ModiscoTGG.MethodDefinition__Marker _methoddefinition__marker = (ModiscoTGG.MethodDefinition__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getManifestAttribute(), obj -> {
			org.eclipse.modisco.java.ManifestAttribute _manifestattribute = (org.eclipse.modisco.java.ManifestAttribute) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPackageToPGPackage__Marker(), obj -> {
			ModiscoTGG.PackageToPGPackage__Marker _packagetopgpackage__marker = (ModiscoTGG.PackageToPGPackage__Marker) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTName(), obj -> {
			org.gravity.typegraph.basic.TName _tname = (org.gravity.typegraph.basic.TName) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMAccess(), obj -> {
			org.gravity.modisco.MAccess _maccess = (org.gravity.modisco.MAccess) obj;
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_maccess), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassInnerAnonClassMember__Marker(), obj -> {
			ModiscoTGG.ClassInnerAnonClassMember__Marker _classinneranonclassmember__marker = (ModiscoTGG.ClassInnerAnonClassMember__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getConstructorDefinition__Marker(), obj -> {
			ModiscoTGG.ConstructorDefinition__Marker _constructordefinition__marker = (ModiscoTGG.ConstructorDefinition__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedItem(), obj -> {
			org.eclipse.modisco.java.UnresolvedItem _unresolveditem = (org.eclipse.modisco.java.UnresolvedItem) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTAnnotationType(), obj -> {
			org.gravity.typegraph.basic.annotations.TAnnotationType _tannotationtype = (org.gravity.typegraph.basic.annotations.TAnnotationType) obj;
			util.newMessage();
			name2actor.get("TAnnotationType_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotationType>(_tannotationtype), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tannotationtype), getSelf());
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractType>(_tannotationtype), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSuperConstructorInvocation(), obj -> {
			org.eclipse.modisco.java.SuperConstructorInvocation _superconstructorinvocation = (org.eclipse.modisco.java.SuperConstructorInvocation) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterfaceExtendsInterface__Marker(), obj -> {
			ModiscoTGG.InterfaceExtendsInterface__Marker _interfaceextendsinterface__marker = (ModiscoTGG.InterfaceExtendsInterface__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterfaceMember__Marker(), obj -> {
			ModiscoTGG.InterfaceMember__Marker _interfacemember__marker = (ModiscoTGG.InterfaceMember__Marker) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTAccessContainer(), obj -> {
			org.gravity.typegraph.basic.containers.TAccessContainer _taccesscontainer = (org.gravity.typegraph.basic.containers.TAccessContainer) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModifierToTClassEntity(), obj -> {
			ModiscoTGG.ModifierToTClassEntity _modifiertotclassentity = (ModiscoTGG.ModifierToTClassEntity) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMClass(), obj -> {
			org.gravity.modisco.MClass _mclass = (org.gravity.modisco.MClass) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_mclass), getSelf());
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_mclass), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AbstractTypeDeclaration>(_mclass), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.ClassDeclaration>(_mclass), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTParameter(), obj -> {
			org.gravity.typegraph.basic.TParameter _tparameter = (org.gravity.typegraph.basic.TParameter) obj;
			util.newMessage();
			name2actor.get("TParameter_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TParameter>(_tparameter), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tparameter), getSelf());
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_tparameter), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModifierToTFieldEntity(), obj -> {
			ModiscoTGG.ModifierToTFieldEntity _modifiertotfieldentity = (ModiscoTGG.ModifierToTFieldEntity) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getVariableDeclarationFragment__Marker(), obj -> {
			ModiscoTGG.VariableDeclarationFragment__Marker _variabledeclarationfragment__marker = (ModiscoTGG.VariableDeclarationFragment__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getBlockComment(), obj -> {
			org.eclipse.modisco.java.BlockComment _blockcomment = (org.eclipse.modisco.java.BlockComment) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getNamespaceAccess(), obj -> {
			org.eclipse.modisco.java.NamespaceAccess _namespaceaccess = (org.eclipse.modisco.java.NamespaceAccess) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClass__Marker(), obj -> {
			ModiscoTGG.Class__Marker _class__marker = (ModiscoTGG.Class__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getWhileStatement(), obj -> {
			org.eclipse.modisco.java.WhileStatement _whilestatement = (org.eclipse.modisco.java.WhileStatement) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModifierToAbstractType(), obj -> {
			ModiscoTGG.ModifierToAbstractType _modifiertoabstracttype = (ModiscoTGG.ModifierToAbstractType) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getType(), obj -> {
			org.eclipse.modisco.java.Type _type = (org.eclipse.modisco.java.Type) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_type), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassLiteralToClassNode(), obj -> {
			ModiscoTGG.ClassLiteralToClassNode _classliteraltoclassnode = (ModiscoTGG.ClassLiteralToClassNode) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getLineCommentToTTextAnnotation(), obj -> {
			ModiscoTGG.LineCommentToTTextAnnotation _linecommenttottextannotation = (ModiscoTGG.LineCommentToTTextAnnotation) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTTypeContainer(), obj -> {
			org.gravity.typegraph.basic.containers.TTypeContainer _ttypecontainer = (org.gravity.typegraph.basic.containers.TTypeContainer) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAnnotationTypeMemberDeclaration(), obj -> {
			org.eclipse.modisco.java.AnnotationTypeMemberDeclaration _annotationtypememberdeclaration = (org.eclipse.modisco.java.AnnotationTypeMemberDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_annotationtypememberdeclaration), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType(), obj -> {
			ModiscoTGG.TypeToTAbstractType _typetotabstracttype = (ModiscoTGG.TypeToTAbstractType) obj;
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ObjectAdded<ModiscoTGG.TypeToTAbstractType>(_typetotabstracttype), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ObjectAdded<ModiscoTGG.TypeToTAbstractType>(_typetotabstracttype), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ObjectAdded<ModiscoTGG.TypeToTAbstractType>(_typetotabstracttype), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedMethodDeclaration(), obj -> {
			org.eclipse.modisco.java.UnresolvedMethodDeclaration _unresolvedmethoddeclaration = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_unresolvedmethoddeclaration), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTTextAnnotation(), obj -> {
			org.gravity.typegraph.basic.annotations.TTextAnnotation _ttextannotation = (org.gravity.typegraph.basic.annotations.TTextAnnotation) obj;
			util.newMessage();
			name2actor.get("TAnnotation_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotation>(_ttextannotation), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getJavadoc(), obj -> {
			org.eclipse.modisco.java.Javadoc _javadoc = (org.eclipse.modisco.java.Javadoc) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassDeclarationToTClass(), obj -> {
			ModiscoTGG.ClassDeclarationToTClass _classdeclarationtotclass = (ModiscoTGG.ClassDeclarationToTClass) obj;
			util.newMessage();
			name2actor.get("ClassDeclarationToTClass_object").tell(new ObjectAdded<ModiscoTGG.ClassDeclarationToTClass>(_classdeclarationtotclass), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTUnresolvedType(), obj -> {
			org.gravity.typegraph.basic.TUnresolvedType _tunresolvedtype = (org.gravity.typegraph.basic.TUnresolvedType) obj;
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tunresolvedtype), getSelf());
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractType>(_tunresolvedtype), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP0").tell(new ObjectAdded<org.gravity.typegraph.basic.TClass>(_tunresolvedtype), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP1").tell(new ObjectAdded<org.gravity.typegraph.basic.TClass>(_tunresolvedtype), getSelf());
			util.newMessage();
			name2actor.get("TInterface_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TInterface>(_tunresolvedtype), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSwitchCase(), obj -> {
			org.eclipse.modisco.java.SwitchCase _switchcase = (org.eclipse.modisco.java.SwitchCase) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTReadWrite(), obj -> {
			org.gravity.typegraph.basic.TReadWrite _treadwrite = (org.gravity.typegraph.basic.TReadWrite) obj;
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_treadwrite), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTClassContainer(), obj -> {
			org.gravity.typegraph.basic.containers.TClassContainer _tclasscontainer = (org.gravity.typegraph.basic.containers.TClassContainer) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationTypeAccess__Marker(), obj -> {
			ModiscoTGG.AnnotationTypeAccess__Marker _annotationtypeaccess__marker = (ModiscoTGG.AnnotationTypeAccess__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getConstructorInvocation__Marker(), obj -> {
			ModiscoTGG.ConstructorInvocation__Marker _constructorinvocation__marker = (ModiscoTGG.ConstructorInvocation__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodOverriding__Marker(), obj -> {
			ModiscoTGG.MethodOverriding__Marker _methodoverriding__marker = (ModiscoTGG.MethodOverriding__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedTypeDeclaration(), obj -> {
			org.eclipse.modisco.java.UnresolvedTypeDeclaration _unresolvedtypedeclaration = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_unresolvedtypedeclaration), getSelf());
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_unresolvedtypedeclaration), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AbstractTypeDeclaration>(_unresolvedtypedeclaration), getSelf());
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMAnonymous(), obj -> {
			org.gravity.modisco.MAnonymous _manonymous = (org.gravity.modisco.MAnonymous) obj;
			util.newMessage();
			name2actor.get("MAnonymous_object").tell(new ObjectAdded<org.gravity.modisco.MAnonymous>(_manonymous), getSelf());
			util.newMessage();
			name2actor.get("AnonymousClassDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AnonymousClassDeclaration>(_manonymous), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodParameter__Marker(), obj -> {
			ModiscoTGG.MethodParameter__Marker _methodparameter__marker = (ModiscoTGG.MethodParameter__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getArrayType(), obj -> {
			org.eclipse.modisco.java.ArrayType _arraytype = (org.eclipse.modisco.java.ArrayType) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_arraytype), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsFloat__Marker(), obj -> {
			ModiscoTGG.PrimitiveTypeIsFloat__Marker _primitivetypeisfloat__marker = (ModiscoTGG.PrimitiveTypeIsFloat__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTypeAccess(), obj -> {
			org.eclipse.modisco.java.TypeAccess _typeaccess = (org.eclipse.modisco.java.TypeAccess) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getVariableDeclaration(), obj -> {
			org.eclipse.modisco.java.VariableDeclaration _variabledeclaration = (org.eclipse.modisco.java.VariableDeclaration) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getSuperMethodInvocation__Marker(), obj -> {
			ModiscoTGG.SuperMethodInvocation__Marker _supermethodinvocation__marker = (ModiscoTGG.SuperMethodInvocation__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeChar(), obj -> {
			org.eclipse.modisco.java.PrimitiveTypeChar _primitivetypechar = (org.eclipse.modisco.java.PrimitiveTypeChar) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_primitivetypechar), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getStringLiteralToTTextNode(), obj -> {
			ModiscoTGG.StringLiteralToTTextNode _stringliteraltottextnode = (ModiscoTGG.StringLiteralToTTextNode) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsShort__Marker(), obj -> {
			ModiscoTGG.PrimitiveTypeIsShort__Marker _primitivetypeisshort__marker = (ModiscoTGG.PrimitiveTypeIsShort__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeParameterToTClass(), obj -> {
			ModiscoTGG.TypeParameterToTClass _typeparametertotclass = (ModiscoTGG.TypeParameterToTClass) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTSignature(), obj -> {
			org.gravity.typegraph.basic.TSignature _tsignature = (org.gravity.typegraph.basic.TSignature) obj;
			util.newMessage();
			name2actor.get("TSignature_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TSignature>(_tsignature), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tsignature), getSelf());
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_tsignature), getSelf());
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMEntry(), obj -> {
			org.gravity.modisco.MEntry _mentry = (org.gravity.modisco.MEntry) obj;
			util.newMessage();
			name2actor.get("MEntry_object").tell(new ObjectAdded<org.gravity.modisco.MEntry>(_mentry), getSelf());
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mentry), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsInt__Marker(), obj -> {
			ModiscoTGG.PrimitiveTypeIsInt__Marker _primitivetypeisint__marker = (ModiscoTGG.PrimitiveTypeIsInt__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getThisExpression(), obj -> {
			org.eclipse.modisco.java.ThisExpression _thisexpression = (org.eclipse.modisco.java.ThisExpression) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getComment(), obj -> {
			org.eclipse.modisco.java.Comment _comment = (org.eclipse.modisco.java.Comment) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getBodyDeclaration(), obj -> {
			org.eclipse.modisco.java.BodyDeclaration _bodydeclaration = (org.eclipse.modisco.java.BodyDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_bodydeclaration), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.annotations.AnnotationsPackage.eINSTANCE.getTBoolNode(), obj -> {
			org.gravity.typegraph.basic.annotations.TBoolNode _tboolnode = (org.gravity.typegraph.basic.annotations.TBoolNode) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMemberInAnnotationVisibility__Marker(), obj -> {
			ModiscoTGG.MemberInAnnotationVisibility__Marker _memberinannotationvisibility__marker = (ModiscoTGG.MemberInAnnotationVisibility__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodParameterType__Marker(), obj -> {
			ModiscoTGG.MethodParameterType__Marker _methodparametertype__marker = (ModiscoTGG.MethodParameterType__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeInt(), obj -> {
			org.eclipse.modisco.java.PrimitiveTypeInt _primitivetypeint = (org.eclipse.modisco.java.PrimitiveTypeInt) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_primitivetypeint), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueAnnotation__Marker(), obj -> {
			ModiscoTGG.AnnotationMemberValueAnnotation__Marker _annotationmembervalueannotation__marker = (ModiscoTGG.AnnotationMemberValueAnnotation__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getExpression(), obj -> {
			org.eclipse.modisco.java.Expression _expression = (org.eclipse.modisco.java.Expression) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getClassFile(), obj -> {
			org.eclipse.modisco.java.ClassFile _classfile = (org.eclipse.modisco.java.ClassFile) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSynchronizedStatement(), obj -> {
			org.eclipse.modisco.java.SynchronizedStatement _synchronizedstatement = (org.eclipse.modisco.java.SynchronizedStatement) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTMethodDefinition(), obj -> {
			org.gravity.typegraph.basic.TMethodDefinition _tmethoddefinition = (org.gravity.typegraph.basic.TMethodDefinition) obj;
			util.newMessage();
			name2actor.get("TMethodDefinition_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TMethodDefinition>(_tmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_tmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("TMember_object_SP0").tell(new ObjectAdded<org.gravity.typegraph.basic.TMember>(_tmethoddefinition), getSelf());
			util.newMessage();
			name2actor.get("TMember_object_SP1").tell(new ObjectAdded<org.gravity.typegraph.basic.TMember>(_tmethoddefinition), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractFlowElement(), obj -> {
			org.gravity.typegraph.basic.TAbstractFlowElement _tabstractflowelement = (org.gravity.typegraph.basic.TAbstractFlowElement) obj;
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_tabstractflowelement), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getSuperConstructorInvocation__Marker(), obj -> {
			ModiscoTGG.SuperConstructorInvocation__Marker _superconstructorinvocation__marker = (ModiscoTGG.SuperConstructorInvocation__Marker) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMSingleVariableAccess(), obj -> {
			org.gravity.modisco.MSingleVariableAccess _msinglevariableaccess = (org.gravity.modisco.MSingleVariableAccess) obj;
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_msinglevariableaccess), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTypeLiteral(), obj -> {
			org.eclipse.modisco.java.TypeLiteral _typeliteral = (org.eclipse.modisco.java.TypeLiteral) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTextElement(), obj -> {
			org.eclipse.modisco.java.TextElement _textelement = (org.eclipse.modisco.java.TextElement) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTInterface(), obj -> {
			org.gravity.typegraph.basic.TInterface _tinterface = (org.gravity.typegraph.basic.TInterface) obj;
			util.newMessage();
			name2actor.get("TInterface_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TInterface>(_tinterface), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tinterface), getSelf());
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractType>(_tinterface), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAnnotationMemberValuePair(), obj -> {
			org.eclipse.modisco.java.AnnotationMemberValuePair _annotationmembervaluepair = (org.eclipse.modisco.java.AnnotationMemberValuePair) obj;
			util.newMessage();
			name2actor.get("AnnotationMemberValuePair_object").tell(new ObjectAdded<org.eclipse.modisco.java.AnnotationMemberValuePair>(_annotationmembervaluepair), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldDefinition__Marker(), obj -> {
			ModiscoTGG.FieldDefinition__Marker _fielddefinition__marker = (ModiscoTGG.FieldDefinition__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getUnresolvedTypeDeclarationToTClass(), obj -> {
			ModiscoTGG.UnresolvedTypeDeclarationToTClass _unresolvedtypedeclarationtotclass = (ModiscoTGG.UnresolvedTypeDeclarationToTClass) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractMethodDeclaration(), obj -> {
			org.eclipse.modisco.java.AbstractMethodDeclaration _abstractmethoddeclaration = (org.eclipse.modisco.java.AbstractMethodDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_abstractmethoddeclaration), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getConstructorDeclaration(), obj -> {
			org.eclipse.modisco.java.ConstructorDeclaration _constructordeclaration = (org.eclipse.modisco.java.ConstructorDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_constructordeclaration), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getInterfaceDeclaration(), obj -> {
			org.eclipse.modisco.java.InterfaceDeclaration _interfacedeclaration = (org.eclipse.modisco.java.InterfaceDeclaration) obj;
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.InterfaceDeclaration>(_interfacedeclaration), getSelf());
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_interfacedeclaration), getSelf());
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_interfacedeclaration), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AbstractTypeDeclaration>(_interfacedeclaration), getSelf());
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMFieldDefinition(), obj -> {
			org.gravity.modisco.MFieldDefinition _mfielddefinition = (org.gravity.modisco.MFieldDefinition) obj;
			util.newMessage();
			name2actor.get("MFieldDefinition_object").tell(new ObjectAdded<org.gravity.modisco.MFieldDefinition>(_mfielddefinition), getSelf());
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_mfielddefinition), getSelf());
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mfielddefinition), getSelf());
			util.newMessage();
			name2actor.get("MDefinition_object_SP0").tell(new ObjectAdded<org.gravity.modisco.MDefinition>(_mfielddefinition), getSelf());
			util.newMessage();
			name2actor.get("MDefinition_object_SP1").tell(new ObjectAdded<org.gravity.modisco.MDefinition>(_mfielddefinition), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getReturnStatement(), obj -> {
			org.eclipse.modisco.java.ReturnStatement _returnstatement = (org.eclipse.modisco.java.ReturnStatement) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTModifier(), obj -> {
			org.gravity.typegraph.basic.TModifier _tmodifier = (org.gravity.typegraph.basic.TModifier) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTFieldContainer(), obj -> {
			org.gravity.typegraph.basic.containers.TFieldContainer _tfieldcontainer = (org.gravity.typegraph.basic.containers.TFieldContainer) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueAnnotationArray__Marker(), obj -> {
			ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker _annotationmembervalueannotationarray__marker = (ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedItemAccess(), obj -> {
			org.eclipse.modisco.java.UnresolvedItemAccess _unresolveditemaccess = (org.eclipse.modisco.java.UnresolvedItemAccess) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberKey__Marker(), obj -> {
			ModiscoTGG.AnnotationMemberKey__Marker _annotationmemberkey__marker = (ModiscoTGG.AnnotationMemberKey__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getArrayCreation(), obj -> {
			org.eclipse.modisco.java.ArrayCreation _arraycreation = (org.eclipse.modisco.java.ArrayCreation) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterfaceInAnonymous__Marker(), obj -> {
			ModiscoTGG.InterfaceInAnonymous__Marker _interfaceinanonymous__marker = (ModiscoTGG.InterfaceInAnonymous__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getArrayInitializer(), obj -> {
			org.eclipse.modisco.java.ArrayInitializer _arrayinitializer = (org.eclipse.modisco.java.ArrayInitializer) obj;
			util.newMessage();
			name2actor.get("ArrayInitializer_object").tell(new ObjectAdded<org.eclipse.modisco.java.ArrayInitializer>(_arrayinitializer), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterface__Marker(), obj -> {
			ModiscoTGG.Interface__Marker _interface__marker = (ModiscoTGG.Interface__Marker) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMFieldName(), obj -> {
			org.gravity.modisco.MFieldName _mfieldname = (org.gravity.modisco.MFieldName) obj;
			util.newMessage();
			name2actor.get("MFieldName_object").tell(new ObjectAdded<org.gravity.modisco.MFieldName>(_mfieldname), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getBooleanLiteralToTBoolNode(), obj -> {
			ModiscoTGG.BooleanLiteralToTBoolNode _booleanliteraltotboolnode = (ModiscoTGG.BooleanLiteralToTBoolNode) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModifierToTMethodEntity(), obj -> {
			ModiscoTGG.ModifierToTMethodEntity _modifiertotmethodentity = (ModiscoTGG.ModifierToTMethodEntity) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsLong__Marker(), obj -> {
			ModiscoTGG.PrimitiveTypeIsLong__Marker _primitivetypeislong__marker = (ModiscoTGG.PrimitiveTypeIsLong__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMModifierToTModifier(), obj -> {
			ModiscoTGG.MModifierToTModifier _mmodifiertotmodifier = (ModiscoTGG.MModifierToTModifier) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMSuperConstructorInvocation(), obj -> {
			org.gravity.modisco.MSuperConstructorInvocation _msuperconstructorinvocation = (org.gravity.modisco.MSuperConstructorInvocation) obj;
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_msuperconstructorinvocation), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getReturnType__Marker(), obj -> {
			ModiscoTGG.ReturnType__Marker _returntype__marker = (ModiscoTGG.ReturnType__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getASTNodeToTAnnotatable(), obj -> {
			ModiscoTGG.ASTNodeToTAnnotatable _astnodetotannotatable = (ModiscoTGG.ASTNodeToTAnnotatable) obj;
			util.newMessage();
			name2actor.get("ASTNodeToTAnnotatable_object").tell(new ObjectAdded<ModiscoTGG.ASTNodeToTAnnotatable>(_astnodetotannotatable), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueNumberArray__Marker(), obj -> {
			ModiscoTGG.AnnotationMemberValueNumberArray__Marker _annotationmembervaluenumberarray__marker = (ModiscoTGG.AnnotationMemberValueNumberArray__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedLabeledStatement(), obj -> {
			org.eclipse.modisco.java.UnresolvedLabeledStatement _unresolvedlabeledstatement = (org.eclipse.modisco.java.UnresolvedLabeledStatement) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodInvocationStaticType__Marker(), obj -> {
			ModiscoTGG.MethodInvocationStaticType__Marker _methodinvocationstatictype__marker = (ModiscoTGG.MethodInvocationStaticType__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getImportDeclaration(), obj -> {
			org.eclipse.modisco.java.ImportDeclaration _importdeclaration = (org.eclipse.modisco.java.ImportDeclaration) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractMethodInvocation(), obj -> {
			org.eclipse.modisco.java.AbstractMethodInvocation _abstractmethodinvocation = (org.eclipse.modisco.java.AbstractMethodInvocation) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMFieldSignature(), obj -> {
			org.gravity.modisco.MFieldSignature _mfieldsignature = (org.gravity.modisco.MFieldSignature) obj;
			util.newMessage();
			name2actor.get("MFieldSignature_object").tell(new ObjectAdded<org.gravity.modisco.MFieldSignature>(_mfieldsignature), getSelf());
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mfieldsignature), getSelf());
			util.newMessage();
			name2actor.get("MSignature_object").tell(new ObjectAdded<org.gravity.modisco.MSignature>(_mfieldsignature), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getContinueStatement(), obj -> {
			org.eclipse.modisco.java.ContinueStatement _continuestatement = (org.eclipse.modisco.java.ContinueStatement) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getMethodRefParameter(), obj -> {
			org.eclipse.modisco.java.MethodRefParameter _methodrefparameter = (org.eclipse.modisco.java.MethodRefParameter) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTMethodDefinitionContainer(), obj -> {
			org.gravity.typegraph.basic.containers.TMethodDefinitionContainer _tmethoddefinitioncontainer = (org.gravity.typegraph.basic.containers.TMethodDefinitionContainer) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType(), obj -> {
			org.gravity.typegraph.basic.TAbstractType _tabstracttype = (org.gravity.typegraph.basic.TAbstractType) obj;
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractType>(_tabstracttype), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tabstracttype), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationType__Marker(), obj -> {
			ModiscoTGG.AnnotationType__Marker _annotationtype__marker = (ModiscoTGG.AnnotationType__Marker) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTFieldSignature(), obj -> {
			org.gravity.typegraph.basic.TFieldSignature _tfieldsignature = (org.gravity.typegraph.basic.TFieldSignature) obj;
			util.newMessage();
			name2actor.get("TFieldSignature_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TFieldSignature>(_tfieldsignature), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tfieldsignature), getSelf());
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_tfieldsignature), getSelf());
			util.newMessage();
			name2actor.get("TSignature_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TSignature>(_tfieldsignature), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getEnumConstantDeclaration(), obj -> {
			org.eclipse.modisco.java.EnumConstantDeclaration _enumconstantdeclaration = (org.eclipse.modisco.java.EnumConstantDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_enumconstantdeclaration), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getMemberRef(), obj -> {
			org.eclipse.modisco.java.MemberRef _memberref = (org.eclipse.modisco.java.MemberRef) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodName__Marker(), obj -> {
			ModiscoTGG.MethodName__Marker _methodname__marker = (ModiscoTGG.MethodName__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getArrayInitializerIgnoreExpressionsEdge__Marker(), obj -> {
			ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker _arrayinitializerignoreexpressionsedge__marker = (ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationTypeNested__Marker(), obj -> {
			ModiscoTGG.AnnotationTypeNested__Marker _annotationtypenested__marker = (ModiscoTGG.AnnotationTypeNested__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getASTNode(), obj -> {
			org.eclipse.modisco.java.ASTNode _astnode = (org.eclipse.modisco.java.ASTNode) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getManifest(), obj -> {
			org.eclipse.modisco.java.Manifest _manifest = (org.eclipse.modisco.java.Manifest) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getStaticTypeToAccessStaticType(), obj -> {
			ModiscoTGG.StaticTypeToAccessStaticType _statictypetoaccessstatictype = (ModiscoTGG.StaticTypeToAccessStaticType) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueBoolean__Marker(), obj -> {
			ModiscoTGG.AnnotationMemberValueBoolean__Marker _annotationmembervalueboolean__marker = (ModiscoTGG.AnnotationMemberValueBoolean__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueClass__Marker(), obj -> {
			ModiscoTGG.AnnotationMemberValueClass__Marker _annotationmembervalueclass__marker = (ModiscoTGG.AnnotationMemberValueClass__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getMethodDeclaration(), obj -> {
			org.eclipse.modisco.java.MethodDeclaration _methoddeclaration = (org.eclipse.modisco.java.MethodDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_methoddeclaration), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodInvocationRecursive__Marker(), obj -> {
			ModiscoTGG.MethodInvocationRecursive__Marker _methodinvocationrecursive__marker = (ModiscoTGG.MethodInvocationRecursive__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeByte(), obj -> {
			org.eclipse.modisco.java.PrimitiveTypeByte _primitivetypebyte = (org.eclipse.modisco.java.PrimitiveTypeByte) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_primitivetypebyte), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getEnum__Marker(), obj -> {
			ModiscoTGG.Enum__Marker _enum__marker = (ModiscoTGG.Enum__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedEnumDeclaration(), obj -> {
			org.eclipse.modisco.java.UnresolvedEnumDeclaration _unresolvedenumdeclaration = (org.eclipse.modisco.java.UnresolvedEnumDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_unresolvedenumdeclaration), getSelf());
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_unresolvedenumdeclaration), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AbstractTypeDeclaration>(_unresolvedenumdeclaration), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.EnumDeclaration>(_unresolvedenumdeclaration), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTClass(), obj -> {
			org.gravity.typegraph.basic.TClass _tclass = (org.gravity.typegraph.basic.TClass) obj;
			util.newMessage();
			name2actor.get("TClass_object_SP0").tell(new ObjectAdded<org.gravity.typegraph.basic.TClass>(_tclass), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP1").tell(new ObjectAdded<org.gravity.typegraph.basic.TClass>(_tclass), getSelf());
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tclass), getSelf());
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractType>(_tclass), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterfaceDeclarationToTInterface(), obj -> {
			ModiscoTGG.InterfaceDeclarationToTInterface _interfacedeclarationtotinterface = (ModiscoTGG.InterfaceDeclarationToTInterface) obj;
			util.newMessage();
			name2actor.get("InterfaceDeclarationToTInterface_object").tell(new ObjectAdded<ModiscoTGG.InterfaceDeclarationToTInterface>(_interfacedeclarationtotinterface), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldAccessToTAccess(), obj -> {
			ModiscoTGG.FieldAccessToTAccess _fieldaccesstotaccess = (ModiscoTGG.FieldAccessToTAccess) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getFieldAccessReadWrite__Marker(), obj -> {
			ModiscoTGG.FieldAccessReadWrite__Marker _fieldaccessreadwrite__marker = (ModiscoTGG.FieldAccessReadWrite__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getVariableDeclarationFragment(), obj -> {
			org.eclipse.modisco.java.VariableDeclarationFragment _variabledeclarationfragment = (org.eclipse.modisco.java.VariableDeclarationFragment) obj;
			util.newMessage();
			name2actor.get("VariableDeclarationFragment_object").tell(new ObjectAdded<org.eclipse.modisco.java.VariableDeclarationFragment>(_variabledeclarationfragment), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueStringArray__Marker(), obj -> {
			ModiscoTGG.AnnotationMemberValueStringArray__Marker _annotationmembervaluestringarray__marker = (ModiscoTGG.AnnotationMemberValueStringArray__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getIncomingFlow__Marker(), obj -> {
			ModiscoTGG.IncomingFlow__Marker _incomingflow__marker = (ModiscoTGG.IncomingFlow__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getTypeDeclaration(), obj -> {
			org.eclipse.modisco.java.TypeDeclaration _typedeclaration = (org.eclipse.modisco.java.TypeDeclaration) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_typedeclaration), getSelf());
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_typedeclaration), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.AbstractTypeDeclaration>(_typedeclaration), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassInAnonymous__Marker(), obj -> {
			ModiscoTGG.ClassInAnonymous__Marker _classinanonymous__marker = (ModiscoTGG.ClassInAnonymous__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getStatement(), obj -> {
			org.eclipse.modisco.java.Statement _statement = (org.eclipse.modisco.java.Statement) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMFlow(), obj -> {
			org.gravity.modisco.MFlow _mflow = (org.gravity.modisco.MFlow) obj;
			util.newMessage();
			name2actor.get("MFlow_object").tell(new ObjectAdded<org.gravity.modisco.MFlow>(_mflow), getSelf());
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mflow), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeBoolean(), obj -> {
			org.eclipse.modisco.java.PrimitiveTypeBoolean _primitivetypeboolean = (org.eclipse.modisco.java.PrimitiveTypeBoolean) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_primitivetypeboolean), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getUnresolvedVariableDeclarationFragment(), obj -> {
			org.eclipse.modisco.java.UnresolvedVariableDeclarationFragment _unresolvedvariabledeclarationfragment = (org.eclipse.modisco.java.UnresolvedVariableDeclarationFragment) obj;
			util.newMessage();
			name2actor.get("VariableDeclarationFragment_object").tell(new ObjectAdded<org.eclipse.modisco.java.VariableDeclarationFragment>(_unresolvedvariabledeclarationfragment), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeVoid(), obj -> {
			org.eclipse.modisco.java.PrimitiveTypeVoid _primitivetypevoid = (org.eclipse.modisco.java.PrimitiveTypeVoid) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_primitivetypevoid), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMemberInClassVisibility__Marker(), obj -> {
			ModiscoTGG.MemberInClassVisibility__Marker _memberinclassvisibility__marker = (ModiscoTGG.MemberInClassVisibility__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getSignatureReturnType__Marker(), obj -> {
			ModiscoTGG.SignatureReturnType__Marker _signaturereturntype__marker = (ModiscoTGG.SignatureReturnType__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getBooleanLiteral(), obj -> {
			org.eclipse.modisco.java.BooleanLiteral _booleanliteral = (org.eclipse.modisco.java.BooleanLiteral) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getSuperFieldAccess(), obj -> {
			org.eclipse.modisco.java.SuperFieldAccess _superfieldaccess = (org.eclipse.modisco.java.SuperFieldAccess) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMDefinition(), obj -> {
			org.gravity.modisco.MDefinition _mdefinition = (org.gravity.modisco.MDefinition) obj;
			util.newMessage();
			name2actor.get("MDefinition_object_SP0").tell(new ObjectAdded<org.gravity.modisco.MDefinition>(_mdefinition), getSelf());
			util.newMessage();
			name2actor.get("MDefinition_object_SP1").tell(new ObjectAdded<org.gravity.modisco.MDefinition>(_mdefinition), getSelf());
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_mdefinition), getSelf());
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mdefinition), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getPrimitiveTypeShort(), obj -> {
			org.eclipse.modisco.java.PrimitiveTypeShort _primitivetypeshort = (org.eclipse.modisco.java.PrimitiveTypeShort) obj;
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectAdded<org.eclipse.modisco.java.Type>(_primitivetypeshort), getSelf());
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMConstructorDefinition(), obj -> {
			org.gravity.modisco.MConstructorDefinition _mconstructordefinition = (org.gravity.modisco.MConstructorDefinition) obj;
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectAdded<org.eclipse.modisco.java.BodyDeclaration>(_mconstructordefinition), getSelf());
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mconstructordefinition), getSelf());
			util.newMessage();
			name2actor.get("MDefinition_object_SP0").tell(new ObjectAdded<org.gravity.modisco.MDefinition>(_mconstructordefinition), getSelf());
			util.newMessage();
			name2actor.get("MDefinition_object_SP1").tell(new ObjectAdded<org.gravity.modisco.MDefinition>(_mconstructordefinition), getSelf());
			util.newMessage();
			name2actor.get("MAbstractMethodDefinition_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractMethodDefinition>(_mconstructordefinition), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMethodInvocation__Marker(), obj -> {
			ModiscoTGG.MethodInvocation__Marker _methodinvocation__marker = (ModiscoTGG.MethodInvocation__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassTypeClass__Marker(), obj -> {
			ModiscoTGG.AnonymousClassTypeClass__Marker _anonymousclasstypeclass__marker = (ModiscoTGG.AnonymousClassTypeClass__Marker) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypesVisibility__Marker(), obj -> {
			ModiscoTGG.TypesVisibility__Marker _typesvisibility__marker = (ModiscoTGG.TypesVisibility__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getVariableDeclarationExpression(), obj -> {
			org.eclipse.modisco.java.VariableDeclarationExpression _variabledeclarationexpression = (org.eclipse.modisco.java.VariableDeclarationExpression) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValuePairToTAnnotationValue(), obj -> {
			ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue _annotationmembervaluepairtotannotationvalue = (ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue) obj;
			util.newMessage();
			name2actor.get("AnnotationMemberValuePairToTAnnotationValue_object").tell(new ObjectAdded<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue>(_annotationmembervaluepairtotannotationvalue), getSelf());
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getIfStatement(), obj -> {
			org.eclipse.modisco.java.IfStatement _ifstatement = (org.eclipse.modisco.java.IfStatement) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSingleVariableAccessToTAccess(), obj -> {
			ModiscoTGG.MSingleVariableAccessToTAccess _msinglevariableaccesstotaccess = (ModiscoTGG.MSingleVariableAccessToTAccess) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTEnum(), obj -> {
			org.gravity.typegraph.basic.TEnum _tenum = (org.gravity.typegraph.basic.TEnum) obj;
			util.newMessage();
			name2actor.get("TAnnotation_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotation>(_tenum), getSelf());
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMAbstractMethodInvocation(), obj -> {
			org.gravity.modisco.MAbstractMethodInvocation _mabstractmethodinvocation = (org.gravity.modisco.MAbstractMethodInvocation) obj;
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.modisco.MAbstractFlowElement>(_mabstractmethodinvocation), getSelf());
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassInnerClassMember__Marker(), obj -> {
			ModiscoTGG.ClassInnerClassMember__Marker _classinnerclassmember__marker = (ModiscoTGG.ClassInnerClassMember__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getDoStatement(), obj -> {
			org.eclipse.modisco.java.DoStatement _dostatement = (org.eclipse.modisco.java.DoStatement) obj;
		});
		type2addConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMExtension(), obj -> {
			org.gravity.modisco.MExtension _mextension = (org.gravity.modisco.MExtension) obj;
		});
		type2addConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsDouble__Marker(), obj -> {
			ModiscoTGG.PrimitiveTypeIsDouble__Marker _primitivetypeisdouble__marker = (ModiscoTGG.PrimitiveTypeIsDouble__Marker) obj;
		});
		type2addConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeQualifiedExpression(), obj -> {
			org.eclipse.modisco.java.AbstractTypeQualifiedExpression _abstracttypequalifiedexpression = (org.eclipse.modisco.java.AbstractTypeQualifiedExpression) obj;
		});
		type2addConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTWrite(), obj -> {
			org.gravity.typegraph.basic.TWrite _twrite = (org.gravity.typegraph.basic.TWrite) obj;
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectAdded<org.gravity.typegraph.basic.TAbstractFlowElement>(_twrite), getSelf());
		});
		type2addConsumer.put(org.gravity.typegraph.basic.containers.ContainersPackage.eINSTANCE.getTSignatureContainer(), obj -> {
			org.gravity.typegraph.basic.containers.TSignatureContainer _tsignaturecontainer = (org.gravity.typegraph.basic.containers.TSignatureContainer) obj;
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_TName(), notification -> {
			if(notification.getNotifier() instanceof org.gravity.typegraph.basic.annotations.TAnnotationType) {
				util.newMessage();
				name2actor.get("TAnnotationType_object").tell(new AttributeChanged<org.gravity.typegraph.basic.TAbstractType>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier()), getSelf());
			}
			if(notification.getNotifier() instanceof org.gravity.typegraph.basic.TAbstractType) {
				util.newMessage();
				name2actor.get("TAbstractType_object").tell(new AttributeChanged<org.gravity.typegraph.basic.TAbstractType>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier()), getSelf());
			}
			if(notification.getNotifier() instanceof org.gravity.typegraph.basic.TInterface) {
				util.newMessage();
				name2actor.get("TInterface_object").tell(new AttributeChanged<org.gravity.typegraph.basic.TAbstractType>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier()), getSelf());
			}
			if(notification.getNotifier() instanceof org.gravity.typegraph.basic.TClass) {
				util.newMessage();
				name2actor.get("TClass_object_SP1").tell(new AttributeChanged<org.gravity.typegraph.basic.TAbstractType>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier()), getSelf());
			}
			if(notification.getNotifier() instanceof org.gravity.typegraph.basic.TClass) {
				util.newMessage();
				name2actor.get("TClass_object_SP0").tell(new AttributeChanged<org.gravity.typegraph.basic.TAbstractType>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier()), getSelf());
			}
		});
		
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationToTAnnotation_Source(), notification -> {
			util.newMessage();
			name2actor.get("AnnotationToTAnnotation_object").tell(new ReferenceAdded<ModiscoTGG.AnnotationToTAnnotation, org.eclipse.modisco.java.Annotation>((ModiscoTGG.AnnotationToTAnnotation) notification.getNotifier(), (org.eclipse.modisco.java.Annotation) notification.getNewValue(), name2actor.get("AnnotationToTAnnotation_source_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationToTAnnotation_Target(), notification -> {
			util.newMessage();
			name2actor.get("AnnotationToTAnnotation_object").tell(new ReferenceAdded<ModiscoTGG.AnnotationToTAnnotation, org.gravity.typegraph.basic.annotations.TAnnotation>((ModiscoTGG.AnnotationToTAnnotation) notification.getNotifier(), (org.gravity.typegraph.basic.annotations.TAnnotation) notification.getNewValue(), name2actor.get("AnnotationToTAnnotation_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValuePairToTAnnotationValue_Source(), notification -> {
			util.newMessage();
			name2actor.get("AnnotationMemberValuePairToTAnnotationValue_object").tell(new ReferenceAdded<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, org.eclipse.modisco.java.AnnotationMemberValuePair>((ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue) notification.getNotifier(), (org.eclipse.modisco.java.AnnotationMemberValuePair) notification.getNewValue(), name2actor.get("AnnotationMemberValuePairToTAnnotationValue_source_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValuePairToTAnnotationValue_Target(), notification -> {
			util.newMessage();
			name2actor.get("AnnotationMemberValuePairToTAnnotationValue_object").tell(new ReferenceAdded<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, org.gravity.typegraph.basic.annotations.TAnnotationValue>((ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue) notification.getNotifier(), (org.gravity.typegraph.basic.annotations.TAnnotationValue) notification.getNewValue(), name2actor.get("AnnotationMemberValuePairToTAnnotationValue_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Source(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_5_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Target(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_3_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getASTNodeToTAnnotatable_Source(), notification -> {
			util.newMessage();
			name2actor.get("ASTNodeToTAnnotatable_object").tell(new ReferenceAdded<ModiscoTGG.ASTNodeToTAnnotatable, org.eclipse.modisco.java.ASTNode>((ModiscoTGG.ASTNodeToTAnnotatable) notification.getNotifier(), (org.eclipse.modisco.java.ASTNode) notification.getNewValue(), name2actor.get("ASTNodeToTAnnotatable_source_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getASTNodeToTAnnotatable_Target(), notification -> {
			util.newMessage();
			name2actor.get("ASTNodeToTAnnotatable_object").tell(new ReferenceAdded<ModiscoTGG.ASTNodeToTAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotatable>((ModiscoTGG.ASTNodeToTAnnotatable) notification.getNotifier(), (org.gravity.typegraph.basic.annotations.TAnnotatable) notification.getNewValue(), name2actor.get("ASTNodeToTAnnotatable_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Source(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_5_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Target(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_3_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassDeclarationToTClass_Source(), notification -> {
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceAdded<ModiscoTGG.AnonymousClassDeclarationToTClass, org.eclipse.modisco.java.AnonymousClassDeclaration>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.eclipse.modisco.java.AnonymousClassDeclaration) notification.getNewValue(), name2actor.get("AnonymousClassDeclarationToTClass_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceAdded<ModiscoTGG.AnonymousClassDeclarationToTClass, org.eclipse.modisco.java.AnonymousClassDeclaration>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.eclipse.modisco.java.AnonymousClassDeclaration) notification.getNewValue(), name2actor.get("AnonymousClassDeclarationToTClass_source_1_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassDeclarationToTClass_Target(), notification -> {
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceAdded<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.gravity.typegraph.basic.TClass) notification.getNewValue(), name2actor.get("AnonymousClassDeclarationToTClass_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceAdded<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.gravity.typegraph.basic.TClass) notification.getNewValue(), name2actor.get("AnonymousClassDeclarationToTClass_target_1_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTypeGraph_Classes(), notification -> {
			util.newMessage();
			name2actor.get("TypeGraph_object_SP0").tell(new ReferenceAdded<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass>((org.gravity.typegraph.basic.TypeGraph) notification.getNotifier(), (org.gravity.typegraph.basic.TClass) notification.getNewValue(), name2actor.get("TypeGraph_classes_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Pg(), notification -> {
			util.newMessage();
			name2actor.get("TClass_object_SP0").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TypeGraph) notification.getNewValue(), name2actor.get("TClass_pg_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TypeGraph) notification.getNewValue(), name2actor.get("TAbstractType_pg_1_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Source(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_5_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTPackage_TypeGraph(), notification -> {
			util.newMessage();
			name2actor.get("TPackage_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TPackage, org.gravity.typegraph.basic.TypeGraph>((org.gravity.typegraph.basic.TPackage) notification.getNotifier(), (org.gravity.typegraph.basic.TypeGraph) notification.getNewValue(), name2actor.get("TPackage_typeGraph_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Package(), notification -> {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TPackage) notification.getNewValue(), name2actor.get("TAbstractType_package_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP0").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TPackage) notification.getNewValue(), name2actor.get("TClass_package_1_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Pg(), notification -> {
			util.newMessage();
			name2actor.get("TClass_object_SP0").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TypeGraph) notification.getNewValue(), name2actor.get("TClass_pg_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TypeGraph) notification.getNewValue(), name2actor.get("TAbstractType_pg_1_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPackageToTPackage_Source(), notification -> {
			util.newMessage();
			name2actor.get("PackageToTPackage_object").tell(new ReferenceAdded<ModiscoTGG.PackageToTPackage, org.eclipse.modisco.java.Package>((ModiscoTGG.PackageToTPackage) notification.getNotifier(), (org.eclipse.modisco.java.Package) notification.getNewValue(), name2actor.get("PackageToTPackage_source_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPackageToTPackage_Target(), notification -> {
			util.newMessage();
			name2actor.get("PackageToTPackage_object").tell(new ReferenceAdded<ModiscoTGG.PackageToTPackage, org.gravity.typegraph.basic.TPackage>((ModiscoTGG.PackageToTPackage) notification.getNotifier(), (org.gravity.typegraph.basic.TPackage) notification.getNewValue(), name2actor.get("PackageToTPackage_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassDeclarationToTClass_Source(), notification -> {
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceAdded<ModiscoTGG.AnonymousClassDeclarationToTClass, org.eclipse.modisco.java.AnonymousClassDeclaration>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.eclipse.modisco.java.AnonymousClassDeclaration) notification.getNewValue(), name2actor.get("AnonymousClassDeclarationToTClass_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceAdded<ModiscoTGG.AnonymousClassDeclarationToTClass, org.eclipse.modisco.java.AnonymousClassDeclaration>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.eclipse.modisco.java.AnonymousClassDeclaration) notification.getNewValue(), name2actor.get("AnonymousClassDeclarationToTClass_source_1_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassDeclarationToTClass_Target(), notification -> {
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceAdded<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.gravity.typegraph.basic.TClass) notification.getNewValue(), name2actor.get("AnonymousClassDeclarationToTClass_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceAdded<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.gravity.typegraph.basic.TClass) notification.getNewValue(), name2actor.get("AnonymousClassDeclarationToTClass_target_1_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Target(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_3_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Target(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getNewValue(), name2actor.get("TypeToTAbstractType_target_3_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModelToTypeGraph_Source(), notification -> {
			util.newMessage();
			name2actor.get("ModelToTypeGraph_object").tell(new ReferenceAdded<ModiscoTGG.ModelToTypeGraph, org.eclipse.modisco.java.Model>((ModiscoTGG.ModelToTypeGraph) notification.getNotifier(), (org.eclipse.modisco.java.Model) notification.getNewValue(), name2actor.get("ModelToTypeGraph_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("ModelToTypeGraph_object").tell(new ReferenceAdded<ModiscoTGG.ModelToTypeGraph, org.eclipse.modisco.java.Model>((ModiscoTGG.ModelToTypeGraph) notification.getNotifier(), (org.eclipse.modisco.java.Model) notification.getNewValue(), name2actor.get("ModelToTypeGraph_source_1_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModelToTypeGraph_Target(), notification -> {
			util.newMessage();
			name2actor.get("ModelToTypeGraph_object").tell(new ReferenceAdded<ModiscoTGG.ModelToTypeGraph, org.gravity.typegraph.basic.TypeGraph>((ModiscoTGG.ModelToTypeGraph) notification.getNotifier(), (org.gravity.typegraph.basic.TypeGraph) notification.getNewValue(), name2actor.get("ModelToTypeGraph_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassDeclarationToTClass_Source(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclarationToTClass_object").tell(new ReferenceAdded<ModiscoTGG.ClassDeclarationToTClass, org.eclipse.modisco.java.ClassDeclaration>((ModiscoTGG.ClassDeclarationToTClass) notification.getNotifier(), (org.eclipse.modisco.java.ClassDeclaration) notification.getNewValue(), name2actor.get("ClassDeclarationToTClass_source_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassDeclarationToTClass_Target(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclarationToTClass_object").tell(new ReferenceAdded<ModiscoTGG.ClassDeclarationToTClass, org.gravity.typegraph.basic.TClass>((ModiscoTGG.ClassDeclarationToTClass) notification.getNotifier(), (org.gravity.typegraph.basic.TClass) notification.getNewValue(), name2actor.get("ClassDeclarationToTClass_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Package(), notification -> {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TPackage) notification.getNewValue(), name2actor.get("TAbstractType_package_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP0").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TPackage) notification.getNewValue(), name2actor.get("TClass_package_1_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAnonymousClassDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("AnonymousClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AnonymousClassDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AnonymousClassDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AnonymousClassDeclaration_bodyDeclarations_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("ClassDeclaration_bodyDeclarations_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AbstractTypeDeclaration_bodyDeclarations_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("InterfaceDeclaration_bodyDeclarations_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("ClassDeclaration_bodyDeclarations_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("EnumDeclaration_bodyDeclarations_5_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Source(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_5_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Source(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_3_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Target(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("MDefinitionToTMember_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("MDefinitionToTMember_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("MDefinitionToTMember_target_2_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Source(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_3_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature_Source(), notification -> {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_source_2_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature_Target(), notification -> {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_target_2_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Defines(), notification -> {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TAbstractType_defines_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TInterface_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TInterface_defines_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TAnnotationType_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TAnnotationType_defines_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP1").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TClass_defines_3_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Source(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_3_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Target(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("MDefinitionToTMember_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("MDefinitionToTMember_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("MDefinitionToTMember_target_2_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("ClassDeclaration_bodyDeclarations_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AbstractTypeDeclaration_bodyDeclarations_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("InterfaceDeclaration_bodyDeclarations_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("ClassDeclaration_bodyDeclarations_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("EnumDeclaration_bodyDeclarations_5_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getVariableDeclarationFragment_VariablesContainer(), notification -> {
			util.newMessage();
			name2actor.get("VariableDeclarationFragment_object").tell(new ReferenceAdded<org.eclipse.modisco.java.VariableDeclarationFragment, org.eclipse.modisco.java.AbstractVariablesContainer>((org.eclipse.modisco.java.VariableDeclarationFragment) notification.getNotifier(), (org.eclipse.modisco.java.AbstractVariablesContainer) notification.getNewValue(), name2actor.get("VariableDeclarationFragment_variablesContainer_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature_Source(), notification -> {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_source_2_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature_Target(), notification -> {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_target_2_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModelToTypeGraph_Source(), notification -> {
			util.newMessage();
			name2actor.get("ModelToTypeGraph_object").tell(new ReferenceAdded<ModiscoTGG.ModelToTypeGraph, org.eclipse.modisco.java.Model>((ModiscoTGG.ModelToTypeGraph) notification.getNotifier(), (org.eclipse.modisco.java.Model) notification.getNewValue(), name2actor.get("ModelToTypeGraph_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("ModelToTypeGraph_object").tell(new ReferenceAdded<ModiscoTGG.ModelToTypeGraph, org.eclipse.modisco.java.Model>((ModiscoTGG.ModelToTypeGraph) notification.getNotifier(), (org.eclipse.modisco.java.Model) notification.getNewValue(), name2actor.get("ModelToTypeGraph_source_1_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMFieldNameToTField_Source(), notification -> {
			util.newMessage();
			name2actor.get("MFieldNameToTField_object").tell(new ReferenceAdded<ModiscoTGG.MFieldNameToTField, org.gravity.modisco.MFieldName>((ModiscoTGG.MFieldNameToTField) notification.getNotifier(), (org.gravity.modisco.MFieldName) notification.getNewValue(), name2actor.get("MFieldNameToTField_source_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMFieldNameToTField_Target(), notification -> {
			util.newMessage();
			name2actor.get("MFieldNameToTField_object").tell(new ReferenceAdded<ModiscoTGG.MFieldNameToTField, org.gravity.typegraph.basic.TField>((ModiscoTGG.MFieldNameToTField) notification.getNotifier(), (org.gravity.typegraph.basic.TField) notification.getNewValue(), name2actor.get("MFieldNameToTField_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMAbstractFlowElementToTAbstractFlowElement_Source(), notification -> {
			util.newMessage();
			name2actor.get("MAbstractFlowElementToTAbstractFlowElement_object").tell(new ReferenceAdded<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement>((ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement) notification.getNotifier(), (org.gravity.modisco.MAbstractFlowElement) notification.getNewValue(), name2actor.get("MAbstractFlowElementToTAbstractFlowElement_source_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMAbstractFlowElementToTAbstractFlowElement_Target(), notification -> {
			util.newMessage();
			name2actor.get("MAbstractFlowElementToTAbstractFlowElement_object").tell(new ReferenceAdded<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement>((ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractFlowElement) notification.getNewValue(), name2actor.get("MAbstractFlowElementToTAbstractFlowElement_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMFlowToTFlow_Source(), notification -> {
			util.newMessage();
			name2actor.get("MFlowToTFlow_object").tell(new ReferenceAdded<ModiscoTGG.MFlowToTFlow, org.gravity.modisco.MFlow>((ModiscoTGG.MFlowToTFlow) notification.getNotifier(), (org.gravity.modisco.MFlow) notification.getNewValue(), name2actor.get("MFlowToTFlow_source_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMFlowToTFlow_Target(), notification -> {
			util.newMessage();
			name2actor.get("MFlowToTFlow_object").tell(new ReferenceAdded<ModiscoTGG.MFlowToTFlow, org.gravity.typegraph.basic.TFlow>((ModiscoTGG.MFlowToTFlow) notification.getNotifier(), (org.gravity.typegraph.basic.TFlow) notification.getNewValue(), name2actor.get("MFlowToTFlow_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterfaceDeclarationToTInterface_Source(), notification -> {
			util.newMessage();
			name2actor.get("InterfaceDeclarationToTInterface_object").tell(new ReferenceAdded<ModiscoTGG.InterfaceDeclarationToTInterface, org.eclipse.modisco.java.InterfaceDeclaration>((ModiscoTGG.InterfaceDeclarationToTInterface) notification.getNotifier(), (org.eclipse.modisco.java.InterfaceDeclaration) notification.getNewValue(), name2actor.get("InterfaceDeclarationToTInterface_source_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterfaceDeclarationToTInterface_Target(), notification -> {
			util.newMessage();
			name2actor.get("InterfaceDeclarationToTInterface_object").tell(new ReferenceAdded<ModiscoTGG.InterfaceDeclarationToTInterface, org.gravity.typegraph.basic.TInterface>((ModiscoTGG.InterfaceDeclarationToTInterface) notification.getNotifier(), (org.gravity.typegraph.basic.TInterface) notification.getNewValue(), name2actor.get("InterfaceDeclarationToTInterface_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Defines(), notification -> {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TAbstractType_defines_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TInterface_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TInterface_defines_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TAnnotationType_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TAnnotationType_defines_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP1").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TClass_defines_3_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("ClassDeclaration_bodyDeclarations_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AbstractTypeDeclaration_bodyDeclarations_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("InterfaceDeclaration_bodyDeclarations_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("ClassDeclaration_bodyDeclarations_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("EnumDeclaration_bodyDeclarations_5_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Source(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_5_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature_Target(), notification -> {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_target_2_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTMember_Signature(), notification -> {
			util.newMessage();
			name2actor.get("TMember_object_SP0").tell(new ReferenceAdded<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature>((org.gravity.typegraph.basic.TMember) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("TMember_signature_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TMethodDefinition_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature>((org.gravity.typegraph.basic.TMember) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("TMethodDefinition_signature_1_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMDefinition_MSignature(), notification -> {
			util.newMessage();
			name2actor.get("MDefinition_object_SP0").tell(new ReferenceAdded<org.gravity.modisco.MDefinition, org.gravity.modisco.MSignature>((org.gravity.modisco.MDefinition) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getNewValue(), name2actor.get("MDefinition_mSignature_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature_Source(), notification -> {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getNewValue(), name2actor.get("MSignatureToTSignature_source_2_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("ClassDeclaration_bodyDeclarations_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AbstractTypeDeclaration_bodyDeclarations_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("InterfaceDeclaration_bodyDeclarations_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("ClassDeclaration_bodyDeclarations_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("EnumDeclaration_bodyDeclarations_5_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Defines(), notification -> {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TAbstractType_defines_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TInterface_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TInterface_defines_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TAnnotationType_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TAnnotationType_defines_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP1").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TClass_defines_3_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Defines(), notification -> {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TAbstractType_defines_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TInterface_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TInterface_defines_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TAnnotationType_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TAnnotationType_defines_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP1").tell(new ReferenceAdded<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("TClass_defines_3_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("ClassDeclaration_bodyDeclarations_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AbstractTypeDeclaration_bodyDeclarations_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("InterfaceDeclaration_bodyDeclarations_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("ClassDeclaration_bodyDeclarations_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("EnumDeclaration_bodyDeclarations_5_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("ClassDeclaration_bodyDeclarations_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AbstractTypeDeclaration_bodyDeclarations_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("InterfaceDeclaration_bodyDeclarations_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("ClassDeclaration_bodyDeclarations_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ReferenceAdded<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getNewValue(), name2actor.get("EnumDeclaration_bodyDeclarations_5_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Source(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceAdded<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getNewValue(), name2actor.get("TypeToTAbstractType_source_5_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Source(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getNewValue(), name2actor.get("MDefinitionToTMember_source_3_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Target(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("MDefinitionToTMember_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("MDefinitionToTMember_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceAdded<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getNewValue(), name2actor.get("MDefinitionToTMember_target_2_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAbstractMethodInvocationToTAccess_Source(), notification -> {
			util.newMessage();
			name2actor.get("AbstractMethodInvocationToTAccess_object").tell(new ReferenceAdded<ModiscoTGG.AbstractMethodInvocationToTAccess, org.eclipse.modisco.java.AbstractMethodInvocation>((ModiscoTGG.AbstractMethodInvocationToTAccess) notification.getNotifier(), (org.eclipse.modisco.java.AbstractMethodInvocation) notification.getNewValue(), name2actor.get("AbstractMethodInvocationToTAccess_source_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAbstractMethodInvocationToTAccess_Target(), notification -> {
			util.newMessage();
			name2actor.get("AbstractMethodInvocationToTAccess_object").tell(new ReferenceAdded<ModiscoTGG.AbstractMethodInvocationToTAccess, org.gravity.typegraph.basic.TAccess>((ModiscoTGG.AbstractMethodInvocationToTAccess) notification.getNotifier(), (org.gravity.typegraph.basic.TAccess) notification.getNewValue(), name2actor.get("AbstractMethodInvocationToTAccess_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMEntryToTParameter_Source(), notification -> {
			util.newMessage();
			name2actor.get("MEntryToTParameter_object").tell(new ReferenceAdded<ModiscoTGG.MEntryToTParameter, org.gravity.modisco.MEntry>((ModiscoTGG.MEntryToTParameter) notification.getNotifier(), (org.gravity.modisco.MEntry) notification.getNewValue(), name2actor.get("MEntryToTParameter_source_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMEntryToTParameter_Target(), notification -> {
			util.newMessage();
			name2actor.get("MEntryToTParameter_object").tell(new ReferenceAdded<ModiscoTGG.MEntryToTParameter, org.gravity.typegraph.basic.TParameter>((ModiscoTGG.MEntryToTParameter) notification.getNotifier(), (org.gravity.typegraph.basic.TParameter) notification.getNewValue(), name2actor.get("MEntryToTParameter_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMMethodNameToTMethod_Source(), notification -> {
			util.newMessage();
			name2actor.get("MMethodNameToTMethod_object").tell(new ReferenceAdded<ModiscoTGG.MMethodNameToTMethod, org.gravity.modisco.MMethodName>((ModiscoTGG.MMethodNameToTMethod) notification.getNotifier(), (org.gravity.modisco.MMethodName) notification.getNewValue(), name2actor.get("MMethodNameToTMethod_source_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMMethodNameToTMethod_Target(), notification -> {
			util.newMessage();
			name2actor.get("MMethodNameToTMethod_object").tell(new ReferenceAdded<ModiscoTGG.MMethodNameToTMethod, org.gravity.typegraph.basic.TMethod>((ModiscoTGG.MMethodNameToTMethod) notification.getNotifier(), (org.gravity.typegraph.basic.TMethod) notification.getNewValue(), name2actor.get("MMethodNameToTMethod_target_0_reference")), getSelf());
		});
		feature2addEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTMember_Signature(), notification -> {
			util.newMessage();
			name2actor.get("TMember_object_SP0").tell(new ReferenceAdded<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature>((org.gravity.typegraph.basic.TMember) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("TMember_signature_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TMethodDefinition_object").tell(new ReferenceAdded<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature>((org.gravity.typegraph.basic.TMember) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getNewValue(), name2actor.get("TMethodDefinition_signature_1_reference")), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationToTAnnotation_Source(), notification -> {
			util.newMessage();
			name2actor.get("AnnotationToTAnnotation_object").tell(new ReferenceDeleted<ModiscoTGG.AnnotationToTAnnotation, org.eclipse.modisco.java.Annotation>((ModiscoTGG.AnnotationToTAnnotation) notification.getNotifier(), (org.eclipse.modisco.java.Annotation) notification.getOldValue(), name2actor.get("AnnotationToTAnnotation_source_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationToTAnnotation_Target(), notification -> {
			util.newMessage();
			name2actor.get("AnnotationToTAnnotation_object").tell(new ReferenceDeleted<ModiscoTGG.AnnotationToTAnnotation, org.gravity.typegraph.basic.annotations.TAnnotation>((ModiscoTGG.AnnotationToTAnnotation) notification.getNotifier(), (org.gravity.typegraph.basic.annotations.TAnnotation) notification.getOldValue(), name2actor.get("AnnotationToTAnnotation_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValuePairToTAnnotationValue_Source(), notification -> {
			util.newMessage();
			name2actor.get("AnnotationMemberValuePairToTAnnotationValue_object").tell(new ReferenceDeleted<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, org.eclipse.modisco.java.AnnotationMemberValuePair>((ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue) notification.getNotifier(), (org.eclipse.modisco.java.AnnotationMemberValuePair) notification.getOldValue(), name2actor.get("AnnotationMemberValuePairToTAnnotationValue_source_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValuePairToTAnnotationValue_Target(), notification -> {
			util.newMessage();
			name2actor.get("AnnotationMemberValuePairToTAnnotationValue_object").tell(new ReferenceDeleted<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, org.gravity.typegraph.basic.annotations.TAnnotationValue>((ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue) notification.getNotifier(), (org.gravity.typegraph.basic.annotations.TAnnotationValue) notification.getOldValue(), name2actor.get("AnnotationMemberValuePairToTAnnotationValue_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Source(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_5_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Target(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_3_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getASTNodeToTAnnotatable_Source(), notification -> {
			util.newMessage();
			name2actor.get("ASTNodeToTAnnotatable_object").tell(new ReferenceDeleted<ModiscoTGG.ASTNodeToTAnnotatable, org.eclipse.modisco.java.ASTNode>((ModiscoTGG.ASTNodeToTAnnotatable) notification.getNotifier(), (org.eclipse.modisco.java.ASTNode) notification.getOldValue(), name2actor.get("ASTNodeToTAnnotatable_source_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getASTNodeToTAnnotatable_Target(), notification -> {
			util.newMessage();
			name2actor.get("ASTNodeToTAnnotatable_object").tell(new ReferenceDeleted<ModiscoTGG.ASTNodeToTAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotatable>((ModiscoTGG.ASTNodeToTAnnotatable) notification.getNotifier(), (org.gravity.typegraph.basic.annotations.TAnnotatable) notification.getOldValue(), name2actor.get("ASTNodeToTAnnotatable_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Source(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_5_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Target(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_3_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassDeclarationToTClass_Source(), notification -> {
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceDeleted<ModiscoTGG.AnonymousClassDeclarationToTClass, org.eclipse.modisco.java.AnonymousClassDeclaration>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.eclipse.modisco.java.AnonymousClassDeclaration) notification.getOldValue(), name2actor.get("AnonymousClassDeclarationToTClass_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceDeleted<ModiscoTGG.AnonymousClassDeclarationToTClass, org.eclipse.modisco.java.AnonymousClassDeclaration>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.eclipse.modisco.java.AnonymousClassDeclaration) notification.getOldValue(), name2actor.get("AnonymousClassDeclarationToTClass_source_1_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassDeclarationToTClass_Target(), notification -> {
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceDeleted<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.gravity.typegraph.basic.TClass) notification.getOldValue(), name2actor.get("AnonymousClassDeclarationToTClass_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceDeleted<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.gravity.typegraph.basic.TClass) notification.getOldValue(), name2actor.get("AnonymousClassDeclarationToTClass_target_1_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTypeGraph_Classes(), notification -> {
			util.newMessage();
			name2actor.get("TypeGraph_object_SP0").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass>((org.gravity.typegraph.basic.TypeGraph) notification.getNotifier(), (org.gravity.typegraph.basic.TClass) notification.getOldValue(), name2actor.get("TypeGraph_classes_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Pg(), notification -> {
			util.newMessage();
			name2actor.get("TClass_object_SP0").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TypeGraph) notification.getOldValue(), name2actor.get("TClass_pg_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TypeGraph) notification.getOldValue(), name2actor.get("TAbstractType_pg_1_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Source(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_5_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTPackage_TypeGraph(), notification -> {
			util.newMessage();
			name2actor.get("TPackage_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TPackage, org.gravity.typegraph.basic.TypeGraph>((org.gravity.typegraph.basic.TPackage) notification.getNotifier(), (org.gravity.typegraph.basic.TypeGraph) notification.getOldValue(), name2actor.get("TPackage_typeGraph_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Package(), notification -> {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TPackage) notification.getOldValue(), name2actor.get("TAbstractType_package_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP0").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TPackage) notification.getOldValue(), name2actor.get("TClass_package_1_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Pg(), notification -> {
			util.newMessage();
			name2actor.get("TClass_object_SP0").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TypeGraph) notification.getOldValue(), name2actor.get("TClass_pg_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TypeGraph) notification.getOldValue(), name2actor.get("TAbstractType_pg_1_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPackageToTPackage_Source(), notification -> {
			util.newMessage();
			name2actor.get("PackageToTPackage_object").tell(new ReferenceDeleted<ModiscoTGG.PackageToTPackage, org.eclipse.modisco.java.Package>((ModiscoTGG.PackageToTPackage) notification.getNotifier(), (org.eclipse.modisco.java.Package) notification.getOldValue(), name2actor.get("PackageToTPackage_source_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getPackageToTPackage_Target(), notification -> {
			util.newMessage();
			name2actor.get("PackageToTPackage_object").tell(new ReferenceDeleted<ModiscoTGG.PackageToTPackage, org.gravity.typegraph.basic.TPackage>((ModiscoTGG.PackageToTPackage) notification.getNotifier(), (org.gravity.typegraph.basic.TPackage) notification.getOldValue(), name2actor.get("PackageToTPackage_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassDeclarationToTClass_Source(), notification -> {
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceDeleted<ModiscoTGG.AnonymousClassDeclarationToTClass, org.eclipse.modisco.java.AnonymousClassDeclaration>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.eclipse.modisco.java.AnonymousClassDeclaration) notification.getOldValue(), name2actor.get("AnonymousClassDeclarationToTClass_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceDeleted<ModiscoTGG.AnonymousClassDeclarationToTClass, org.eclipse.modisco.java.AnonymousClassDeclaration>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.eclipse.modisco.java.AnonymousClassDeclaration) notification.getOldValue(), name2actor.get("AnonymousClassDeclarationToTClass_source_1_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAnonymousClassDeclarationToTClass_Target(), notification -> {
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceDeleted<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.gravity.typegraph.basic.TClass) notification.getOldValue(), name2actor.get("AnonymousClassDeclarationToTClass_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ReferenceDeleted<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass>((ModiscoTGG.AnonymousClassDeclarationToTClass) notification.getNotifier(), (org.gravity.typegraph.basic.TClass) notification.getOldValue(), name2actor.get("AnonymousClassDeclarationToTClass_target_1_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Target(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_3_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Target(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractType) notification.getOldValue(), name2actor.get("TypeToTAbstractType_target_3_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModelToTypeGraph_Source(), notification -> {
			util.newMessage();
			name2actor.get("ModelToTypeGraph_object").tell(new ReferenceDeleted<ModiscoTGG.ModelToTypeGraph, org.eclipse.modisco.java.Model>((ModiscoTGG.ModelToTypeGraph) notification.getNotifier(), (org.eclipse.modisco.java.Model) notification.getOldValue(), name2actor.get("ModelToTypeGraph_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("ModelToTypeGraph_object").tell(new ReferenceDeleted<ModiscoTGG.ModelToTypeGraph, org.eclipse.modisco.java.Model>((ModiscoTGG.ModelToTypeGraph) notification.getNotifier(), (org.eclipse.modisco.java.Model) notification.getOldValue(), name2actor.get("ModelToTypeGraph_source_1_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModelToTypeGraph_Target(), notification -> {
			util.newMessage();
			name2actor.get("ModelToTypeGraph_object").tell(new ReferenceDeleted<ModiscoTGG.ModelToTypeGraph, org.gravity.typegraph.basic.TypeGraph>((ModiscoTGG.ModelToTypeGraph) notification.getNotifier(), (org.gravity.typegraph.basic.TypeGraph) notification.getOldValue(), name2actor.get("ModelToTypeGraph_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassDeclarationToTClass_Source(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclarationToTClass_object").tell(new ReferenceDeleted<ModiscoTGG.ClassDeclarationToTClass, org.eclipse.modisco.java.ClassDeclaration>((ModiscoTGG.ClassDeclarationToTClass) notification.getNotifier(), (org.eclipse.modisco.java.ClassDeclaration) notification.getOldValue(), name2actor.get("ClassDeclarationToTClass_source_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getClassDeclarationToTClass_Target(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclarationToTClass_object").tell(new ReferenceDeleted<ModiscoTGG.ClassDeclarationToTClass, org.gravity.typegraph.basic.TClass>((ModiscoTGG.ClassDeclarationToTClass) notification.getNotifier(), (org.gravity.typegraph.basic.TClass) notification.getOldValue(), name2actor.get("ClassDeclarationToTClass_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Package(), notification -> {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TPackage) notification.getOldValue(), name2actor.get("TAbstractType_package_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP0").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TPackage) notification.getOldValue(), name2actor.get("TClass_package_1_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAnonymousClassDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("AnonymousClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AnonymousClassDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AnonymousClassDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AnonymousClassDeclaration_bodyDeclarations_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("ClassDeclaration_bodyDeclarations_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AbstractTypeDeclaration_bodyDeclarations_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("InterfaceDeclaration_bodyDeclarations_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("ClassDeclaration_bodyDeclarations_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("EnumDeclaration_bodyDeclarations_5_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Source(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_5_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Source(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_3_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Target(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("MDefinitionToTMember_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("MDefinitionToTMember_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("MDefinitionToTMember_target_2_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Source(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_3_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature_Source(), notification -> {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_source_2_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature_Target(), notification -> {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_target_2_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Defines(), notification -> {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TAbstractType_defines_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TInterface_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TInterface_defines_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TAnnotationType_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TAnnotationType_defines_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP1").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TClass_defines_3_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Source(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_3_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Target(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("MDefinitionToTMember_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("MDefinitionToTMember_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("MDefinitionToTMember_target_2_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("ClassDeclaration_bodyDeclarations_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AbstractTypeDeclaration_bodyDeclarations_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("InterfaceDeclaration_bodyDeclarations_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("ClassDeclaration_bodyDeclarations_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("EnumDeclaration_bodyDeclarations_5_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getVariableDeclarationFragment_VariablesContainer(), notification -> {
			util.newMessage();
			name2actor.get("VariableDeclarationFragment_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.VariableDeclarationFragment, org.eclipse.modisco.java.AbstractVariablesContainer>((org.eclipse.modisco.java.VariableDeclarationFragment) notification.getNotifier(), (org.eclipse.modisco.java.AbstractVariablesContainer) notification.getOldValue(), name2actor.get("VariableDeclarationFragment_variablesContainer_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature_Source(), notification -> {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_source_2_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature_Target(), notification -> {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_target_2_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getModelToTypeGraph_Source(), notification -> {
			util.newMessage();
			name2actor.get("ModelToTypeGraph_object").tell(new ReferenceDeleted<ModiscoTGG.ModelToTypeGraph, org.eclipse.modisco.java.Model>((ModiscoTGG.ModelToTypeGraph) notification.getNotifier(), (org.eclipse.modisco.java.Model) notification.getOldValue(), name2actor.get("ModelToTypeGraph_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("ModelToTypeGraph_object").tell(new ReferenceDeleted<ModiscoTGG.ModelToTypeGraph, org.eclipse.modisco.java.Model>((ModiscoTGG.ModelToTypeGraph) notification.getNotifier(), (org.eclipse.modisco.java.Model) notification.getOldValue(), name2actor.get("ModelToTypeGraph_source_1_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMFieldNameToTField_Source(), notification -> {
			util.newMessage();
			name2actor.get("MFieldNameToTField_object").tell(new ReferenceDeleted<ModiscoTGG.MFieldNameToTField, org.gravity.modisco.MFieldName>((ModiscoTGG.MFieldNameToTField) notification.getNotifier(), (org.gravity.modisco.MFieldName) notification.getOldValue(), name2actor.get("MFieldNameToTField_source_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMFieldNameToTField_Target(), notification -> {
			util.newMessage();
			name2actor.get("MFieldNameToTField_object").tell(new ReferenceDeleted<ModiscoTGG.MFieldNameToTField, org.gravity.typegraph.basic.TField>((ModiscoTGG.MFieldNameToTField) notification.getNotifier(), (org.gravity.typegraph.basic.TField) notification.getOldValue(), name2actor.get("MFieldNameToTField_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMAbstractFlowElementToTAbstractFlowElement_Source(), notification -> {
			util.newMessage();
			name2actor.get("MAbstractFlowElementToTAbstractFlowElement_object").tell(new ReferenceDeleted<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement>((ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement) notification.getNotifier(), (org.gravity.modisco.MAbstractFlowElement) notification.getOldValue(), name2actor.get("MAbstractFlowElementToTAbstractFlowElement_source_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMAbstractFlowElementToTAbstractFlowElement_Target(), notification -> {
			util.newMessage();
			name2actor.get("MAbstractFlowElementToTAbstractFlowElement_object").tell(new ReferenceDeleted<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement>((ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement) notification.getNotifier(), (org.gravity.typegraph.basic.TAbstractFlowElement) notification.getOldValue(), name2actor.get("MAbstractFlowElementToTAbstractFlowElement_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMFlowToTFlow_Source(), notification -> {
			util.newMessage();
			name2actor.get("MFlowToTFlow_object").tell(new ReferenceDeleted<ModiscoTGG.MFlowToTFlow, org.gravity.modisco.MFlow>((ModiscoTGG.MFlowToTFlow) notification.getNotifier(), (org.gravity.modisco.MFlow) notification.getOldValue(), name2actor.get("MFlowToTFlow_source_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMFlowToTFlow_Target(), notification -> {
			util.newMessage();
			name2actor.get("MFlowToTFlow_object").tell(new ReferenceDeleted<ModiscoTGG.MFlowToTFlow, org.gravity.typegraph.basic.TFlow>((ModiscoTGG.MFlowToTFlow) notification.getNotifier(), (org.gravity.typegraph.basic.TFlow) notification.getOldValue(), name2actor.get("MFlowToTFlow_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterfaceDeclarationToTInterface_Source(), notification -> {
			util.newMessage();
			name2actor.get("InterfaceDeclarationToTInterface_object").tell(new ReferenceDeleted<ModiscoTGG.InterfaceDeclarationToTInterface, org.eclipse.modisco.java.InterfaceDeclaration>((ModiscoTGG.InterfaceDeclarationToTInterface) notification.getNotifier(), (org.eclipse.modisco.java.InterfaceDeclaration) notification.getOldValue(), name2actor.get("InterfaceDeclarationToTInterface_source_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getInterfaceDeclarationToTInterface_Target(), notification -> {
			util.newMessage();
			name2actor.get("InterfaceDeclarationToTInterface_object").tell(new ReferenceDeleted<ModiscoTGG.InterfaceDeclarationToTInterface, org.gravity.typegraph.basic.TInterface>((ModiscoTGG.InterfaceDeclarationToTInterface) notification.getNotifier(), (org.gravity.typegraph.basic.TInterface) notification.getOldValue(), name2actor.get("InterfaceDeclarationToTInterface_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Defines(), notification -> {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TAbstractType_defines_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TInterface_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TInterface_defines_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TAnnotationType_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TAnnotationType_defines_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP1").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TClass_defines_3_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("ClassDeclaration_bodyDeclarations_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AbstractTypeDeclaration_bodyDeclarations_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("InterfaceDeclaration_bodyDeclarations_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("ClassDeclaration_bodyDeclarations_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("EnumDeclaration_bodyDeclarations_5_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Source(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_5_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature_Target(), notification -> {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_target_2_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTMember_Signature(), notification -> {
			util.newMessage();
			name2actor.get("TMember_object_SP0").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature>((org.gravity.typegraph.basic.TMember) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("TMember_signature_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TMethodDefinition_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature>((org.gravity.typegraph.basic.TMember) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("TMethodDefinition_signature_1_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.modisco.ModiscoPackage.eINSTANCE.getMDefinition_MSignature(), notification -> {
			util.newMessage();
			name2actor.get("MDefinition_object_SP0").tell(new ReferenceDeleted<org.gravity.modisco.MDefinition, org.gravity.modisco.MSignature>((org.gravity.modisco.MDefinition) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getOldValue(), name2actor.get("MDefinition_mSignature_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMSignatureToTSignature_Source(), notification -> {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature>((ModiscoTGG.MSignatureToTSignature) notification.getNotifier(), (org.gravity.modisco.MSignature) notification.getOldValue(), name2actor.get("MSignatureToTSignature_source_2_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("ClassDeclaration_bodyDeclarations_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AbstractTypeDeclaration_bodyDeclarations_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("InterfaceDeclaration_bodyDeclarations_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("ClassDeclaration_bodyDeclarations_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("EnumDeclaration_bodyDeclarations_5_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Defines(), notification -> {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TAbstractType_defines_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TInterface_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TInterface_defines_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TAnnotationType_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TAnnotationType_defines_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP1").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TClass_defines_3_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTAbstractType_Defines(), notification -> {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TAbstractType_defines_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TInterface_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TInterface_defines_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TAnnotationType_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TAnnotationType_defines_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TClass_object_SP1").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TAbstractType) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("TClass_defines_3_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("ClassDeclaration_bodyDeclarations_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AbstractTypeDeclaration_bodyDeclarations_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("InterfaceDeclaration_bodyDeclarations_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("ClassDeclaration_bodyDeclarations_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("EnumDeclaration_bodyDeclarations_5_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.eclipse.modisco.java.emf.JavaPackage.eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations(), notification -> {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("ClassDeclaration_bodyDeclarations_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AbstractTypeDeclaration_bodyDeclarations_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("InterfaceDeclaration_bodyDeclarations_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("ClassDeclaration_bodyDeclarations_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ReferenceDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) notification.getNotifier(), (org.eclipse.modisco.java.BodyDeclaration) notification.getOldValue(), name2actor.get("EnumDeclaration_bodyDeclarations_5_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getTypeToTAbstractType_Source(), notification -> {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_3_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_4_reference")), getSelf());
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type>((ModiscoTGG.TypeToTAbstractType) notification.getNotifier(), (org.eclipse.modisco.java.Type) notification.getOldValue(), name2actor.get("TypeToTAbstractType_source_5_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Source(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_2_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.modisco.MDefinition) notification.getOldValue(), name2actor.get("MDefinitionToTMember_source_3_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMDefinitionToTMember_Target(), notification -> {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("MDefinitionToTMember_target_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("MDefinitionToTMember_target_1_reference")), getSelf());
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ReferenceDeleted<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember>((ModiscoTGG.MDefinitionToTMember) notification.getNotifier(), (org.gravity.typegraph.basic.TMember) notification.getOldValue(), name2actor.get("MDefinitionToTMember_target_2_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAbstractMethodInvocationToTAccess_Source(), notification -> {
			util.newMessage();
			name2actor.get("AbstractMethodInvocationToTAccess_object").tell(new ReferenceDeleted<ModiscoTGG.AbstractMethodInvocationToTAccess, org.eclipse.modisco.java.AbstractMethodInvocation>((ModiscoTGG.AbstractMethodInvocationToTAccess) notification.getNotifier(), (org.eclipse.modisco.java.AbstractMethodInvocation) notification.getOldValue(), name2actor.get("AbstractMethodInvocationToTAccess_source_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getAbstractMethodInvocationToTAccess_Target(), notification -> {
			util.newMessage();
			name2actor.get("AbstractMethodInvocationToTAccess_object").tell(new ReferenceDeleted<ModiscoTGG.AbstractMethodInvocationToTAccess, org.gravity.typegraph.basic.TAccess>((ModiscoTGG.AbstractMethodInvocationToTAccess) notification.getNotifier(), (org.gravity.typegraph.basic.TAccess) notification.getOldValue(), name2actor.get("AbstractMethodInvocationToTAccess_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMEntryToTParameter_Source(), notification -> {
			util.newMessage();
			name2actor.get("MEntryToTParameter_object").tell(new ReferenceDeleted<ModiscoTGG.MEntryToTParameter, org.gravity.modisco.MEntry>((ModiscoTGG.MEntryToTParameter) notification.getNotifier(), (org.gravity.modisco.MEntry) notification.getOldValue(), name2actor.get("MEntryToTParameter_source_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMEntryToTParameter_Target(), notification -> {
			util.newMessage();
			name2actor.get("MEntryToTParameter_object").tell(new ReferenceDeleted<ModiscoTGG.MEntryToTParameter, org.gravity.typegraph.basic.TParameter>((ModiscoTGG.MEntryToTParameter) notification.getNotifier(), (org.gravity.typegraph.basic.TParameter) notification.getOldValue(), name2actor.get("MEntryToTParameter_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMMethodNameToTMethod_Source(), notification -> {
			util.newMessage();
			name2actor.get("MMethodNameToTMethod_object").tell(new ReferenceDeleted<ModiscoTGG.MMethodNameToTMethod, org.gravity.modisco.MMethodName>((ModiscoTGG.MMethodNameToTMethod) notification.getNotifier(), (org.gravity.modisco.MMethodName) notification.getOldValue(), name2actor.get("MMethodNameToTMethod_source_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(ModiscoTGG.ModiscoTGGPackage.eINSTANCE.getMMethodNameToTMethod_Target(), notification -> {
			util.newMessage();
			name2actor.get("MMethodNameToTMethod_object").tell(new ReferenceDeleted<ModiscoTGG.MMethodNameToTMethod, org.gravity.typegraph.basic.TMethod>((ModiscoTGG.MMethodNameToTMethod) notification.getNotifier(), (org.gravity.typegraph.basic.TMethod) notification.getOldValue(), name2actor.get("MMethodNameToTMethod_target_0_reference")), getSelf());
		});
		feature2removeEdgeConsumer.put(org.gravity.typegraph.basic.BasicPackage.eINSTANCE.getTMember_Signature(), notification -> {
			util.newMessage();
			name2actor.get("TMember_object_SP0").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature>((org.gravity.typegraph.basic.TMember) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("TMember_signature_0_reference")), getSelf());
			util.newMessage();
			name2actor.get("TMethodDefinition_object").tell(new ReferenceDeleted<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature>((org.gravity.typegraph.basic.TMember) notification.getNotifier(), (org.gravity.typegraph.basic.TSignature) notification.getOldValue(), name2actor.get("TMethodDefinition_signature_1_reference")), getSelf());
		});
	}

	@Override
	public void preStart() throws Exception {
		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		super.postStop();
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(Notification.class, this::handleNotification) //
				.match(NoMoreInput.class, this::sendFinished) //
				.build();
	}

	private void sendFinished(NoMoreInput m) {
		util.allMessagesInserted();
	}
	
	private void handleNotification(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			handleAdd(notification);
			return;
		case Notification.REMOVE:
			handleRemove(notification);
			return;
		case Notification.REMOVING_ADAPTER:
			handleRemoveAdapter(notification);
			return;	
		case Notification.SET:
			handleSet(notification);
		}
	}

	private void handleAdd(Notification notification) {
		handleAddedNode(notification.getNewValue());
		handleAddedEdge(notification);
	}

	private void handleAddedNode(Object node) {
		if(node == null) 
			return;
			
		EObject obj = (EObject) node;
		if(type2addConsumer.containsKey(obj.eClass())) {
			type2addConsumer.get(obj.eClass()).accept(node);
		}
	}
	
	private void handleSet(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2setConsumer.containsKey(feature)) {
			feature2setConsumer.get(feature).accept(notification);
		}
	}

	private void handleAddedEdge(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2addEdgeConsumer.containsKey(feature)) {
			feature2addEdgeConsumer.get(feature).accept(notification);
		}
	}

	private void handleRemove(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2removeEdgeConsumer.containsKey(feature)) {
			feature2removeEdgeConsumer.get(feature).accept(notification);
		}
	}
	
	private void handleRemoveAdapter(Notification notification) {
		Object node = notification.getNotifier();
		if (node instanceof org.eclipse.modisco.java.Annotation) {
			util.newMessage();
			name2actor.get("Annotation_object").tell(new ObjectDeleted<org.eclipse.modisco.java.Annotation>((org.eclipse.modisco.java.Annotation) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.AnnotationMemberValuePair) {
			util.newMessage();
			name2actor.get("AnnotationMemberValuePair_object").tell(new ObjectDeleted<org.eclipse.modisco.java.AnnotationMemberValuePair>((org.eclipse.modisco.java.AnnotationMemberValuePair) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.Type) {
			util.newMessage();
			name2actor.get("Type_object").tell(new ObjectDeleted<org.eclipse.modisco.java.Type>((org.eclipse.modisco.java.Type) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.BodyDeclaration) {
			util.newMessage();
			name2actor.get("BodyDeclaration_object").tell(new ObjectDeleted<org.eclipse.modisco.java.BodyDeclaration>((org.eclipse.modisco.java.BodyDeclaration) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.AnnotationTypeDeclaration) {
			util.newMessage();
			name2actor.get("AnnotationTypeDeclaration_object").tell(new ObjectDeleted<org.eclipse.modisco.java.AnnotationTypeDeclaration>((org.eclipse.modisco.java.AnnotationTypeDeclaration) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.AnonymousClassDeclaration) {
			util.newMessage();
			name2actor.get("AnonymousClassDeclaration_object").tell(new ObjectDeleted<org.eclipse.modisco.java.AnonymousClassDeclaration>((org.eclipse.modisco.java.AnonymousClassDeclaration) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.AbstractTypeDeclaration) {
			util.newMessage();
			name2actor.get("AbstractTypeDeclaration_object").tell(new ObjectDeleted<org.eclipse.modisco.java.AbstractTypeDeclaration>((org.eclipse.modisco.java.AbstractTypeDeclaration) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.Package) {
			util.newMessage();
			name2actor.get("Package_object").tell(new ObjectDeleted<org.eclipse.modisco.java.Package>((org.eclipse.modisco.java.Package) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.ArrayInitializer) {
			util.newMessage();
			name2actor.get("ArrayInitializer_object").tell(new ObjectDeleted<org.eclipse.modisco.java.ArrayInitializer>((org.eclipse.modisco.java.ArrayInitializer) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.MethodInvocation) {
			util.newMessage();
			name2actor.get("MethodInvocation_object").tell(new ObjectDeleted<org.eclipse.modisco.java.MethodInvocation>((org.eclipse.modisco.java.MethodInvocation) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.Model) {
			util.newMessage();
			name2actor.get("Model_object").tell(new ObjectDeleted<org.eclipse.modisco.java.Model>((org.eclipse.modisco.java.Model) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.ClassDeclaration) {
			util.newMessage();
			name2actor.get("ClassDeclaration_object").tell(new ObjectDeleted<org.eclipse.modisco.java.ClassDeclaration>((org.eclipse.modisco.java.ClassDeclaration) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.VariableDeclarationFragment) {
			util.newMessage();
			name2actor.get("VariableDeclarationFragment_object").tell(new ObjectDeleted<org.eclipse.modisco.java.VariableDeclarationFragment>((org.eclipse.modisco.java.VariableDeclarationFragment) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.InterfaceDeclaration) {
			util.newMessage();
			name2actor.get("InterfaceDeclaration_object").tell(new ObjectDeleted<org.eclipse.modisco.java.InterfaceDeclaration>((org.eclipse.modisco.java.InterfaceDeclaration) node), getSelf());
		}
		if (node instanceof org.eclipse.modisco.java.EnumDeclaration) {
			util.newMessage();
			name2actor.get("EnumDeclaration_object").tell(new ObjectDeleted<org.eclipse.modisco.java.EnumDeclaration>((org.eclipse.modisco.java.EnumDeclaration) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TAbstractType) {
			util.newMessage();
			name2actor.get("TAbstractType_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TAbstractType>((org.gravity.typegraph.basic.TAbstractType) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TPackage) {
			util.newMessage();
			name2actor.get("TPackage_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TPackage>((org.gravity.typegraph.basic.TPackage) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TInterface) {
			util.newMessage();
			name2actor.get("TInterface_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TInterface>((org.gravity.typegraph.basic.TInterface) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TMethodSignature) {
			util.newMessage();
			name2actor.get("TMethodSignature_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TMethodSignature>((org.gravity.typegraph.basic.TMethodSignature) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TFieldDefinition) {
			util.newMessage();
			name2actor.get("TFieldDefinition_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TFieldDefinition>((org.gravity.typegraph.basic.TFieldDefinition) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TFieldSignature) {
			util.newMessage();
			name2actor.get("TFieldSignature_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TFieldSignature>((org.gravity.typegraph.basic.TFieldSignature) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TField) {
			util.newMessage();
			name2actor.get("TField_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TField>((org.gravity.typegraph.basic.TField) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TAbstractFlowElement) {
			util.newMessage();
			name2actor.get("TAbstractFlowElement_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TAbstractFlowElement>((org.gravity.typegraph.basic.TAbstractFlowElement) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TFlow) {
			util.newMessage();
			name2actor.get("TFlow_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TFlow>((org.gravity.typegraph.basic.TFlow) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TSignature) {
			util.newMessage();
			name2actor.get("TSignature_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TSignature>((org.gravity.typegraph.basic.TSignature) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TMethodDefinition) {
			util.newMessage();
			name2actor.get("TMethodDefinition_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TMethodDefinition>((org.gravity.typegraph.basic.TMethodDefinition) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TCall) {
			util.newMessage();
			name2actor.get("TCall_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TCall>((org.gravity.typegraph.basic.TCall) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TParameter) {
			util.newMessage();
			name2actor.get("TParameter_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TParameter>((org.gravity.typegraph.basic.TParameter) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TMethod) {
			util.newMessage();
			name2actor.get("TMethod_object").tell(new ObjectDeleted<org.gravity.typegraph.basic.TMethod>((org.gravity.typegraph.basic.TMethod) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TClass) {
			util.newMessage();
			name2actor.get("TClass_object_SP0").tell(new ObjectDeleted<org.gravity.typegraph.basic.TClass>((org.gravity.typegraph.basic.TClass) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TClass) {
			util.newMessage();
			name2actor.get("TClass_object_SP1").tell(new ObjectDeleted<org.gravity.typegraph.basic.TClass>((org.gravity.typegraph.basic.TClass) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TypeGraph) {
			util.newMessage();
			name2actor.get("TypeGraph_object_SP0").tell(new ObjectDeleted<org.gravity.typegraph.basic.TypeGraph>((org.gravity.typegraph.basic.TypeGraph) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TypeGraph) {
			util.newMessage();
			name2actor.get("TypeGraph_object_SP1").tell(new ObjectDeleted<org.gravity.typegraph.basic.TypeGraph>((org.gravity.typegraph.basic.TypeGraph) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TMember) {
			util.newMessage();
			name2actor.get("TMember_object_SP0").tell(new ObjectDeleted<org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TMember) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.TMember) {
			util.newMessage();
			name2actor.get("TMember_object_SP1").tell(new ObjectDeleted<org.gravity.typegraph.basic.TMember>((org.gravity.typegraph.basic.TMember) node), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.annotations.TAnnotationValue) {
			org.gravity.typegraph.basic.annotations.TAnnotationValue _tannotationvalue = (org.gravity.typegraph.basic.annotations.TAnnotationValue) node;
			util.newMessage();
			name2actor.get("TAnnotationValue_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotationValue>(_tannotationvalue), getSelf());
			_tannotationvalue.getTValue().forEach(this::handleAddedNode);
		}
		if (node instanceof org.gravity.typegraph.basic.annotations.TTextAnnotation) {
			org.gravity.typegraph.basic.annotations.TTextAnnotation _ttextannotation = (org.gravity.typegraph.basic.annotations.TTextAnnotation) node;
		}
		if (node instanceof org.gravity.typegraph.basic.annotations.TAnnotation) {
			org.gravity.typegraph.basic.annotations.TAnnotation _tannotation = (org.gravity.typegraph.basic.annotations.TAnnotation) node;
			util.newMessage();
			name2actor.get("TAnnotation_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotation>(_tannotation), getSelf());
			_tannotation.getTValues().forEach(this::handleAddedNode);
		}
		if (node instanceof org.gravity.typegraph.basic.annotations.TAnnotationType) {
			org.gravity.typegraph.basic.annotations.TAnnotationType _tannotationtype = (org.gravity.typegraph.basic.annotations.TAnnotationType) node;
			util.newMessage();
			name2actor.get("TAnnotationType_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotationType>(_tannotationtype), getSelf());
		}
		if (node instanceof org.gravity.typegraph.basic.annotations.TAnnotatable) {
			org.gravity.typegraph.basic.annotations.TAnnotatable _tannotatable = (org.gravity.typegraph.basic.annotations.TAnnotatable) node;
			util.newMessage();
			name2actor.get("TAnnotatable_object").tell(new ObjectAdded<org.gravity.typegraph.basic.annotations.TAnnotatable>(_tannotatable), getSelf());
			_tannotatable.getTAnnotation().forEach(this::handleAddedNode);
		}
		if (node instanceof org.gravity.modisco.MAnonymous) {
			util.newMessage();
			name2actor.get("MAnonymous_object").tell(new ObjectDeleted<org.gravity.modisco.MAnonymous>((org.gravity.modisco.MAnonymous) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MAbstractMethodDefinition) {
			util.newMessage();
			name2actor.get("MAbstractMethodDefinition_object").tell(new ObjectDeleted<org.gravity.modisco.MAbstractMethodDefinition>((org.gravity.modisco.MAbstractMethodDefinition) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MMethodSignature) {
			util.newMessage();
			name2actor.get("MMethodSignature_object").tell(new ObjectDeleted<org.gravity.modisco.MMethodSignature>((org.gravity.modisco.MMethodSignature) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MFieldDefinition) {
			util.newMessage();
			name2actor.get("MFieldDefinition_object").tell(new ObjectDeleted<org.gravity.modisco.MFieldDefinition>((org.gravity.modisco.MFieldDefinition) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MFieldSignature) {
			util.newMessage();
			name2actor.get("MFieldSignature_object").tell(new ObjectDeleted<org.gravity.modisco.MFieldSignature>((org.gravity.modisco.MFieldSignature) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MGravityModel) {
			util.newMessage();
			name2actor.get("MGravityModel_object").tell(new ObjectDeleted<org.gravity.modisco.MGravityModel>((org.gravity.modisco.MGravityModel) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MFieldName) {
			util.newMessage();
			name2actor.get("MFieldName_object").tell(new ObjectDeleted<org.gravity.modisco.MFieldName>((org.gravity.modisco.MFieldName) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MAbstractFlowElement) {
			util.newMessage();
			name2actor.get("MAbstractFlowElement_object").tell(new ObjectDeleted<org.gravity.modisco.MAbstractFlowElement>((org.gravity.modisco.MAbstractFlowElement) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MFlow) {
			util.newMessage();
			name2actor.get("MFlow_object").tell(new ObjectDeleted<org.gravity.modisco.MFlow>((org.gravity.modisco.MFlow) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MSignature) {
			util.newMessage();
			name2actor.get("MSignature_object").tell(new ObjectDeleted<org.gravity.modisco.MSignature>((org.gravity.modisco.MSignature) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MMethodDefinition) {
			util.newMessage();
			name2actor.get("MMethodDefinition_object").tell(new ObjectDeleted<org.gravity.modisco.MMethodDefinition>((org.gravity.modisco.MMethodDefinition) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MMethodInvocation) {
			util.newMessage();
			name2actor.get("MMethodInvocation_object").tell(new ObjectDeleted<org.gravity.modisco.MMethodInvocation>((org.gravity.modisco.MMethodInvocation) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MEntry) {
			util.newMessage();
			name2actor.get("MEntry_object").tell(new ObjectDeleted<org.gravity.modisco.MEntry>((org.gravity.modisco.MEntry) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MMethodName) {
			util.newMessage();
			name2actor.get("MMethodName_object").tell(new ObjectDeleted<org.gravity.modisco.MMethodName>((org.gravity.modisco.MMethodName) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MDefinition) {
			util.newMessage();
			name2actor.get("MDefinition_object_SP0").tell(new ObjectDeleted<org.gravity.modisco.MDefinition>((org.gravity.modisco.MDefinition) node), getSelf());
		}
		if (node instanceof org.gravity.modisco.MDefinition) {
			util.newMessage();
			name2actor.get("MDefinition_object_SP1").tell(new ObjectDeleted<org.gravity.modisco.MDefinition>((org.gravity.modisco.MDefinition) node), getSelf());
		}
		if (node instanceof ModiscoTGG.AnnotationToTAnnotation) {
			util.newMessage();
			name2actor.get("AnnotationToTAnnotation_object").tell(new ObjectDeleted<ModiscoTGG.AnnotationToTAnnotation>((ModiscoTGG.AnnotationToTAnnotation) node), getSelf());
		}
		if (node instanceof ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue) {
			util.newMessage();
			name2actor.get("AnnotationMemberValuePairToTAnnotationValue_object").tell(new ObjectDeleted<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue>((ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue) node), getSelf());
		}
		if (node instanceof ModiscoTGG.ASTNodeToTAnnotatable) {
			util.newMessage();
			name2actor.get("ASTNodeToTAnnotatable_object").tell(new ObjectDeleted<ModiscoTGG.ASTNodeToTAnnotatable>((ModiscoTGG.ASTNodeToTAnnotatable) node), getSelf());
		}
		if (node instanceof ModiscoTGG.AnonymousClassDeclarationToTClass) {
			util.newMessage();
			name2actor.get("AnonymousClassDeclarationToTClass_object").tell(new ObjectDeleted<ModiscoTGG.AnonymousClassDeclarationToTClass>((ModiscoTGG.AnonymousClassDeclarationToTClass) node), getSelf());
		}
		if (node instanceof ModiscoTGG.PackageToTPackage) {
			util.newMessage();
			name2actor.get("PackageToTPackage_object").tell(new ObjectDeleted<ModiscoTGG.PackageToTPackage>((ModiscoTGG.PackageToTPackage) node), getSelf());
		}
		if (node instanceof ModiscoTGG.ModelToTypeGraph) {
			util.newMessage();
			name2actor.get("ModelToTypeGraph_object").tell(new ObjectDeleted<ModiscoTGG.ModelToTypeGraph>((ModiscoTGG.ModelToTypeGraph) node), getSelf());
		}
		if (node instanceof ModiscoTGG.ClassDeclarationToTClass) {
			util.newMessage();
			name2actor.get("ClassDeclarationToTClass_object").tell(new ObjectDeleted<ModiscoTGG.ClassDeclarationToTClass>((ModiscoTGG.ClassDeclarationToTClass) node), getSelf());
		}
		if (node instanceof ModiscoTGG.MFieldNameToTField) {
			util.newMessage();
			name2actor.get("MFieldNameToTField_object").tell(new ObjectDeleted<ModiscoTGG.MFieldNameToTField>((ModiscoTGG.MFieldNameToTField) node), getSelf());
		}
		if (node instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement) {
			util.newMessage();
			name2actor.get("MAbstractFlowElementToTAbstractFlowElement_object").tell(new ObjectDeleted<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement>((ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement) node), getSelf());
		}
		if (node instanceof ModiscoTGG.MFlowToTFlow) {
			util.newMessage();
			name2actor.get("MFlowToTFlow_object").tell(new ObjectDeleted<ModiscoTGG.MFlowToTFlow>((ModiscoTGG.MFlowToTFlow) node), getSelf());
		}
		if (node instanceof ModiscoTGG.InterfaceDeclarationToTInterface) {
			util.newMessage();
			name2actor.get("InterfaceDeclarationToTInterface_object").tell(new ObjectDeleted<ModiscoTGG.InterfaceDeclarationToTInterface>((ModiscoTGG.InterfaceDeclarationToTInterface) node), getSelf());
		}
		if (node instanceof ModiscoTGG.AbstractMethodInvocationToTAccess) {
			util.newMessage();
			name2actor.get("AbstractMethodInvocationToTAccess_object").tell(new ObjectDeleted<ModiscoTGG.AbstractMethodInvocationToTAccess>((ModiscoTGG.AbstractMethodInvocationToTAccess) node), getSelf());
		}
		if (node instanceof ModiscoTGG.MEntryToTParameter) {
			util.newMessage();
			name2actor.get("MEntryToTParameter_object").tell(new ObjectDeleted<ModiscoTGG.MEntryToTParameter>((ModiscoTGG.MEntryToTParameter) node), getSelf());
		}
		if (node instanceof ModiscoTGG.MMethodNameToTMethod) {
			util.newMessage();
			name2actor.get("MMethodNameToTMethod_object").tell(new ObjectDeleted<ModiscoTGG.MMethodNameToTMethod>((ModiscoTGG.MMethodNameToTMethod) node), getSelf());
		}
		if (node instanceof ModiscoTGG.TypeToTAbstractType) {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP0").tell(new ObjectDeleted<ModiscoTGG.TypeToTAbstractType>((ModiscoTGG.TypeToTAbstractType) node), getSelf());
		}
		if (node instanceof ModiscoTGG.TypeToTAbstractType) {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP1").tell(new ObjectDeleted<ModiscoTGG.TypeToTAbstractType>((ModiscoTGG.TypeToTAbstractType) node), getSelf());
		}
		if (node instanceof ModiscoTGG.TypeToTAbstractType) {
			util.newMessage();
			name2actor.get("TypeToTAbstractType_object_SP2").tell(new ObjectDeleted<ModiscoTGG.TypeToTAbstractType>((ModiscoTGG.TypeToTAbstractType) node), getSelf());
		}
		if (node instanceof ModiscoTGG.MDefinitionToTMember) {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP0").tell(new ObjectDeleted<ModiscoTGG.MDefinitionToTMember>((ModiscoTGG.MDefinitionToTMember) node), getSelf());
		}
		if (node instanceof ModiscoTGG.MDefinitionToTMember) {
			util.newMessage();
			name2actor.get("MDefinitionToTMember_object_SP1").tell(new ObjectDeleted<ModiscoTGG.MDefinitionToTMember>((ModiscoTGG.MDefinitionToTMember) node), getSelf());
		}
		if (node instanceof ModiscoTGG.MSignatureToTSignature) {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP0").tell(new ObjectDeleted<ModiscoTGG.MSignatureToTSignature>((ModiscoTGG.MSignatureToTSignature) node), getSelf());
		}
		if (node instanceof ModiscoTGG.MSignatureToTSignature) {
			util.newMessage();
			name2actor.get("MSignatureToTSignature_object_SP1").tell(new ObjectDeleted<ModiscoTGG.MSignatureToTSignature>((ModiscoTGG.MSignatureToTSignature) node), getSelf());
		}
	}
}

