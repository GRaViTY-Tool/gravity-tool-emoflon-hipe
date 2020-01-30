package ModiscoTGG.modelgen.hipe.engine;

import org.eclipse.emf.common.notify.Notification;


import java.lang.Thread;
import java.time.Duration;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import static akka.pattern.Patterns.ask;

import ModiscoTGG.modelgen.hipe.engine.actor.NotificationActor;
import ModiscoTGG.modelgen.hipe.engine.actor.DispatchActor;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.AnonymousClassTypeClass__GEN_133_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.ClassExtendsClass__GEN_189_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.ClassImplementsInterface__GEN_202_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.ClassInstanceCreation__GEN_256_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.ConstructorInvocation__GEN_284_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.FieldAccessReadWrite__GEN_317_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.FieldAccessRead__GEN_344_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.FieldAccessWrite__GEN_371_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.IncomingFlow__GEN_435_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.InterfaceExtendsInterface__GEN_448_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.MethodInvocation__GEN_622_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.MethodOverriding__GEN_641_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.MethodParameterLink__GEN_667_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.OutgoingFlow__GEN_744_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.SuperConstructorInvocation__GEN_867_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.junction.SuperMethodInvocation__GEN_880_junction;
import ModiscoTGG.modelgen.hipe.engine.actor.node.TClass_object_SP1;

import hipe.engine.IHiPEEngine;
import hipe.engine.message.InitActor;
import hipe.engine.message.InitGenActor;
import hipe.engine.message.InitGenReferenceActor;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NotificationMessage;
import hipe.engine.message.ExtractData;
import hipe.engine.message.production.ProductionResult;

import hipe.engine.util.IncUtil;
import hipe.engine.util.ProductionUtil;
import hipe.generic.actor.GenericObjectActor;
import hipe.generic.actor.GenericReferenceActor;
import hipe.generic.actor.GenericProductionActor;
import hipe.generic.actor.junction.*;

import hipe.network.*;

public class HiPEEngine implements IHiPEEngine{

	private final ActorSystem system = ActorSystem.create("HiPE-Engine");
	private ActorRef dispatcher;
	private ActorRef notificationActor;

	private Map<String, NetworkNode> name2node = new HashMap<>();
	
	private Map<String, ActorRef> name2actor = new ConcurrentHashMap<>();
	private Map<String, InitGenReferenceActor<?,?>> name2initRefGen = new ConcurrentHashMap<>();
	private Map<String, Class<?>> classes = new ConcurrentHashMap<>();
	private Map<String, String> productionNodes2pattern = new ConcurrentHashMap<>();
	private boolean dirty = false;
	private HiPENetwork network;
	
	private IncUtil iUtil = IncUtil.getUtil();
	private ProductionUtil pUtil = ProductionUtil.getUtil();
	
	private Thread thread;
	
	public HiPEEngine(HiPENetwork network) {
		thread = Thread.currentThread();
		iUtil.registerWakeUpCall(this::wakeUp);
		
		this.network = network;
	}
	
	public boolean wakeUp() {
		thread.interrupt();
		return true;
	}
	
	public void initialize() throws InterruptedException {
		network.getNetworknode().stream().forEach(n -> name2node.put(n.getName(), n));
		
		createProductionNodes();
		createJunctionNodes();
		createReferenceNodes();
		createObjectNodes();

		initializeReferenceNodes();

		classes.keySet().parallelStream().forEach(name -> {
			name2actor.put(name, system.actorOf(Props.create(classes.get(name))));			
		});
		
		dispatcher = system.actorOf(
				Props.create(DispatchActor.class, () -> new DispatchActor(name2actor)),
				"DispatchActor");
		
		notificationActor = system.actorOf(Props.create(NotificationActor.class, () -> new NotificationActor(dispatcher)), "NotificationActor");
		
		name2actor.values().forEach(actor -> actor.tell(new InitActor(name2actor), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ObjectNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ReferenceNode).forEach(n -> name2actor.get(n.getName()).tell(name2initRefGen.get(n.getName()), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof AbstractJunctionNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ProductionNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n), notificationActor));
		}
	
	public void createProductionNodes() {
		classes.put("AnnotationMemberKey__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberKey__GEN_production", "AnnotationMemberKey__GEN");
		classes.put("AnnotationMemberValueAnnotationArray__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueAnnotationArray__GEN_production", "AnnotationMemberValueAnnotationArray__GEN");
		classes.put("AnnotationMemberValueAnnotation__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueAnnotation__GEN_production", "AnnotationMemberValueAnnotation__GEN");
		classes.put("AnnotationMemberValueBooleanArray__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueBooleanArray__GEN_production", "AnnotationMemberValueBooleanArray__GEN");
		classes.put("AnnotationMemberValueBoolean__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueBoolean__GEN_production", "AnnotationMemberValueBoolean__GEN");
		classes.put("AnnotationMemberValueClassArray__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClassArray__GEN_production", "AnnotationMemberValueClassArray__GEN");
		classes.put("AnnotationMemberValueClass__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClass__GEN_production", "AnnotationMemberValueClass__GEN");
		classes.put("AnnotationMemberValueNumberArray__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueNumberArray__GEN_production", "AnnotationMemberValueNumberArray__GEN");
		classes.put("AnnotationMemberValueNumber__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueNumber__GEN_production", "AnnotationMemberValueNumber__GEN");
		classes.put("AnnotationMemberValueStringArray__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueStringArray__GEN_production", "AnnotationMemberValueStringArray__GEN");
		classes.put("AnnotationMemberValueString__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueString__GEN_production", "AnnotationMemberValueString__GEN");
		classes.put("AnnotationOnBodyDeclaration__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationOnBodyDeclaration__GEN_production", "AnnotationOnBodyDeclaration__GEN");
		classes.put("AnnotationTypeAccess__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeAccess__GEN_production", "AnnotationTypeAccess__GEN");
		classes.put("AnnotationTypeInAnonymous__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeInAnonymous__GEN_production", "AnnotationTypeInAnonymous__GEN");
		classes.put("AnnotationTypeNested__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeNested__GEN_production", "AnnotationTypeNested__GEN");
		classes.put("AnnotationType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationType__GEN_production", "AnnotationType__GEN");
		classes.put("AnonymousClassTypeClass__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeClass__GEN_production", "AnonymousClassTypeClass__GEN");
		classes.put("AnonymousClassTypeInterface__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeInterface__GEN_production", "AnonymousClassTypeInterface__GEN");
		classes.put("AnonymousClass__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClass__GEN_production", "AnonymousClass__GEN");
		classes.put("ArrayInitializerIgnoreExpressionsEdge__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ArrayInitializerIgnoreExpressionsEdge__GEN_production", "ArrayInitializerIgnoreExpressionsEdge__GEN");
		classes.put("ArrayTypeToClass__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ArrayTypeToClass__GEN_production", "ArrayTypeToClass__GEN");
		classes.put("ClassExtendsClass__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassExtendsClass__GEN_production", "ClassExtendsClass__GEN");
		classes.put("ClassImplementsInterface__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassImplementsInterface__GEN_production", "ClassImplementsInterface__GEN");
		classes.put("ClassInAnonymous__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInAnonymous__GEN_production", "ClassInAnonymous__GEN");
		classes.put("ClassInnerAnonClassMember__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInnerAnonClassMember__GEN_production", "ClassInnerAnonClassMember__GEN");
		classes.put("ClassInnerClassMember__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInnerClassMember__GEN_production", "ClassInnerClassMember__GEN");
		classes.put("ClassInstanceCreation__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInstanceCreation__GEN_production", "ClassInstanceCreation__GEN");
		classes.put("Class__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("Class__GEN_production", "Class__GEN");
		classes.put("ConstructorDefinition__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ConstructorDefinition__GEN_production", "ConstructorDefinition__GEN");
		classes.put("ConstructorInvocation__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ConstructorInvocation__GEN_production", "ConstructorInvocation__GEN");
		classes.put("EnumInAnonymous__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("EnumInAnonymous__GEN_production", "EnumInAnonymous__GEN");
		classes.put("Enum__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("Enum__GEN_production", "Enum__GEN");
		classes.put("FieldAccessReadWrite__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldAccessReadWrite__GEN_production", "FieldAccessReadWrite__GEN");
		classes.put("FieldAccessRead__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldAccessRead__GEN_production", "FieldAccessRead__GEN");
		classes.put("FieldAccessWrite__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldAccessWrite__GEN_production", "FieldAccessWrite__GEN");
		classes.put("FieldDefinition__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldDefinition__GEN_production", "FieldDefinition__GEN");
		classes.put("FieldName__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldName__GEN_production", "FieldName__GEN");
		classes.put("FieldSignature__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldSignature__GEN_production", "FieldSignature__GEN");
		classes.put("FieldType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldType__GEN_production", "FieldType__GEN");
		classes.put("Flow__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("Flow__GEN_production", "Flow__GEN");
		classes.put("IncomingFlow__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("IncomingFlow__GEN_production", "IncomingFlow__GEN");
		classes.put("InterfaceExtendsInterface__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceExtendsInterface__GEN_production", "InterfaceExtendsInterface__GEN");
		classes.put("InterfaceInAnonymous__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceInAnonymous__GEN_production", "InterfaceInAnonymous__GEN");
		classes.put("InterfaceMember__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceMember__GEN_production", "InterfaceMember__GEN");
		classes.put("Interface__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("Interface__GEN_production", "Interface__GEN");
		classes.put("LinkDefinitionToAnonymous__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkDefinitionToAnonymous__GEN_production", "LinkDefinitionToAnonymous__GEN");
		classes.put("LinkDefinitionToType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkDefinitionToType__GEN_production", "LinkDefinitionToType__GEN");
		classes.put("MemberInAnnotationVisibility__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MemberInAnnotationVisibility__GEN_production", "MemberInAnnotationVisibility__GEN");
		classes.put("MemberInClassVisibility__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MemberInClassVisibility__GEN_production", "MemberInClassVisibility__GEN");
		classes.put("MemberInEnumVisibility__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MemberInEnumVisibility__GEN_production", "MemberInEnumVisibility__GEN");
		classes.put("MethodDefinition__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodDefinition__GEN_production", "MethodDefinition__GEN");
		classes.put("MethodInvocationRecursive__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodInvocationRecursive__GEN_production", "MethodInvocationRecursive__GEN");
		classes.put("MethodInvocationStaticType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodInvocationStaticType__GEN_production", "MethodInvocationStaticType__GEN");
		classes.put("MethodInvocation__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodInvocation__GEN_production", "MethodInvocation__GEN");
		classes.put("MethodName__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodName__GEN_production", "MethodName__GEN");
		classes.put("MethodOverriding__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodOverriding__GEN_production", "MethodOverriding__GEN");
		classes.put("MethodParameterLinkFirst__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodParameterLinkFirst__GEN_production", "MethodParameterLinkFirst__GEN");
		classes.put("MethodParameterLink__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodParameterLink__GEN_production", "MethodParameterLink__GEN");
		classes.put("MethodParameterType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodParameterType__GEN_production", "MethodParameterType__GEN");
		classes.put("MethodParameter__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodParameter__GEN_production", "MethodParameter__GEN");
		classes.put("MethodSignature__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodSignature__GEN_production", "MethodSignature__GEN");
		classes.put("NestedClassInType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("NestedClassInType__GEN_production", "NestedClassInType__GEN");
		classes.put("NestedEnum__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("NestedEnum__GEN_production", "NestedEnum__GEN");
		classes.put("NestedInterfaceInType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("NestedInterfaceInType__GEN_production", "NestedInterfaceInType__GEN");
		classes.put("OutgoingFlow__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("OutgoingFlow__GEN_production", "OutgoingFlow__GEN");
		classes.put("PackageToPGPackage__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PackageToPGPackage__GEN_production", "PackageToPGPackage__GEN");
		classes.put("ParameterizedTypeToClass__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParameterizedTypeToClass__GEN_production", "ParameterizedTypeToClass__GEN");
		classes.put("PrimitiveTypeIsBoolean__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsBoolean__GEN_production", "PrimitiveTypeIsBoolean__GEN");
		classes.put("PrimitiveTypeIsByte__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsByte__GEN_production", "PrimitiveTypeIsByte__GEN");
		classes.put("PrimitiveTypeIsChar__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsChar__GEN_production", "PrimitiveTypeIsChar__GEN");
		classes.put("PrimitiveTypeIsDouble__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsDouble__GEN_production", "PrimitiveTypeIsDouble__GEN");
		classes.put("PrimitiveTypeIsFloat__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsFloat__GEN_production", "PrimitiveTypeIsFloat__GEN");
		classes.put("PrimitiveTypeIsInt__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsInt__GEN_production", "PrimitiveTypeIsInt__GEN");
		classes.put("PrimitiveTypeIsLong__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsLong__GEN_production", "PrimitiveTypeIsLong__GEN");
		classes.put("PrimitiveTypeIsShort__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsShort__GEN_production", "PrimitiveTypeIsShort__GEN");
		classes.put("PrimitiveTypesIsVoid__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypesIsVoid__GEN_production", "PrimitiveTypesIsVoid__GEN");
		classes.put("ReturnType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ReturnType__GEN_production", "ReturnType__GEN");
		classes.put("SignatureReturnType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("SignatureReturnType__GEN_production", "SignatureReturnType__GEN");
		classes.put("SubPackageToPGPackage__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("SubPackageToPGPackage__GEN_production", "SubPackageToPGPackage__GEN");
		classes.put("SuperConstructorInvocation__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("SuperConstructorInvocation__GEN_production", "SuperConstructorInvocation__GEN");
		classes.put("SuperMethodInvocation__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("SuperMethodInvocation__GEN_production", "SuperMethodInvocation__GEN");
		classes.put("SyntethicMethod__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("SyntethicMethod__GEN_production", "SyntethicMethod__GEN");
		classes.put("TextAnnotations__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("TextAnnotations__GEN_production", "TextAnnotations__GEN");
		classes.put("TypeParameter__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("TypeParameter__GEN_production", "TypeParameter__GEN");
		classes.put("TypesOrphaned__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("TypesOrphaned__GEN_production", "TypesOrphaned__GEN");
		classes.put("TypesVisibility__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("TypesVisibility__GEN_production", "TypesVisibility__GEN");
		classes.put("UnresolvedTypeDeclaration__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("UnresolvedTypeDeclaration__GEN_production", "UnresolvedTypeDeclaration__GEN");
		classes.put("VariableDeclarationFragment__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("VariableDeclarationFragment__GEN_production", "VariableDeclarationFragment__GEN");
		
	}
	
	public void createJunctionNodes() {
		classes.put("AnnotationMemberKey__GEN_1_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotationArray__GEN_7_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotation__GEN_13_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueBooleanArray__GEN_19_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueBoolean__GEN_25_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__GEN_32_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__GEN_33_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__GEN_31_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__GEN_45_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__GEN_46_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__GEN_44_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueNumberArray__GEN_57_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueNumber__GEN_63_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueStringArray__GEN_69_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueString__GEN_75_junction", GenericJunctionActor.class);
		classes.put("AnnotationOnBodyDeclaration__GEN_81_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeAccess__GEN_88_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeAccess__GEN_89_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeAccess__GEN_87_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeInAnonymous__GEN_101_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeInAnonymous__GEN_102_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeInAnonymous__GEN_100_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeNested__GEN_112_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeNested__GEN_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("AnnotationTypeNested__GEN_111_junction", GenericJunctionActor.class);
		classes.put("AnnotationType__GEN_126_junction", GenericJunctionActor.class);
		classes.put("AnnotationType__GEN_124_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeClass__GEN_134_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeClass__GEN_135_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeClass__GEN_133_junction", AnonymousClassTypeClass__GEN_133_junction.class);
		classes.put("AnonymousClassTypeInterface__GEN_147_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__GEN_148_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__GEN_146_junction", GenericJunctionActor.class);
		classes.put("AnonymousClass__GEN_160_junction", GenericJunctionActor.class);
		classes.put("AnonymousClass__GEN_161_junction", GenericJunctionActor.class);
		classes.put("AnonymousClass__GEN_159_junction", GenericJunctionActor.class);
		classes.put("ArrayInitializerIgnoreExpressionsEdge__GEN_171_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__GEN_175_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__GEN_180_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__GEN_176_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__GEN_174_junction", GenericJunctionActor.class);
		classes.put("ClassExtendsClass__GEN_190_junction", GenericJunctionActor.class);
		classes.put("ClassExtendsClass__GEN_191_junction", GenericJunctionActor.class);
		classes.put("ClassExtendsClass__GEN_189_junction", ClassExtendsClass__GEN_189_junction.class);
		classes.put("ClassImplementsInterface__GEN_203_junction", GenericJunctionActor.class);
		classes.put("ClassImplementsInterface__GEN_204_junction", GenericJunctionActor.class);
		classes.put("ClassImplementsInterface__GEN_202_junction", ClassImplementsInterface__GEN_202_junction.class);
		classes.put("ClassInAnonymous__GEN_216_junction", GenericJunctionActor.class);
		classes.put("ClassInAnonymous__GEN_217_junction", GenericJunctionActor.class);
		classes.put("ClassInAnonymous__GEN_215_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__GEN_227_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__GEN_232_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__GEN_228_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__GEN_226_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__GEN_242_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__GEN_247_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__GEN_243_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__GEN_241_junction", GenericJunctionActor.class);
		classes.put("ClassInstanceCreation__GEN_257_junction", GenericJunctionActor.class);
		classes.put("ClassInstanceCreation__GEN_258_junction", GenericJunctionActor.class);
		classes.put("ClassInstanceCreation__GEN_256_junction", ClassInstanceCreation__GEN_256_junction.class);
		classes.put("Class__GEN_271_junction", GenericJunctionActor.class);
		classes.put("Class__GEN_269_junction", GenericJunctionActor.class);
		classes.put("ConstructorDefinition__GEN_278_junction", GenericJunctionActor.class);
		classes.put("ConstructorInvocation__GEN_285_junction", GenericJunctionActor.class);
		classes.put("ConstructorInvocation__GEN_286_junction", GenericJunctionActor.class);
		classes.put("ConstructorInvocation__GEN_284_junction", ConstructorInvocation__GEN_284_junction.class);
		classes.put("EnumInAnonymous__GEN_298_junction", GenericJunctionActor.class);
		classes.put("EnumInAnonymous__GEN_299_junction", GenericJunctionActor.class);
		classes.put("EnumInAnonymous__GEN_297_junction", GenericJunctionActor.class);
		classes.put("Enum__GEN_310_junction", GenericJunctionActor.class);
		classes.put("Enum__GEN_308_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__GEN_318_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__GEN_328_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__GEN_322_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__GEN_329_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__GEN_330_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__GEN_323_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__GEN_319_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__GEN_317_junction", FieldAccessReadWrite__GEN_317_junction.class);
		classes.put("FieldAccessRead__GEN_345_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__GEN_355_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__GEN_349_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__GEN_356_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__GEN_357_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__GEN_350_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__GEN_346_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__GEN_344_junction", FieldAccessRead__GEN_344_junction.class);
		classes.put("FieldAccessWrite__GEN_372_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__GEN_382_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__GEN_376_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__GEN_383_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__GEN_384_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__GEN_377_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__GEN_373_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__GEN_371_junction", FieldAccessWrite__GEN_371_junction.class);
		classes.put("FieldDefinition__GEN_398_junction", GenericJunctionActor.class);
		classes.put("FieldName__GEN_404_junction", GenericJunctionActor.class);
		classes.put("FieldSignature__GEN_410_junction", GenericJunctionActor.class);
		createJunctionNodes_1();
			}	
		
			private void createJunctionNodes_1() {
		classes.put("FieldType__GEN_417_junction", GenericJunctionActor.class);
		classes.put("FieldType__GEN_418_junction", GenericJunctionActor.class);
		classes.put("FieldType__GEN_416_junction", GenericJunctionActor.class);
		classes.put("Flow__GEN_429_junction", GenericJunctionActor.class);
		classes.put("IncomingFlow__GEN_436_junction", GenericJunctionActor.class);
		classes.put("IncomingFlow__GEN_437_junction", GenericJunctionActor.class);
		classes.put("IncomingFlow__GEN_435_junction", IncomingFlow__GEN_435_junction.class);
		classes.put("InterfaceExtendsInterface__GEN_449_junction", GenericJunctionActor.class);
		classes.put("InterfaceExtendsInterface__GEN_450_junction", GenericJunctionActor.class);
		classes.put("InterfaceExtendsInterface__GEN_448_junction", InterfaceExtendsInterface__GEN_448_junction.class);
		classes.put("InterfaceInAnonymous__GEN_462_junction", GenericJunctionActor.class);
		classes.put("InterfaceInAnonymous__GEN_463_junction", GenericJunctionActor.class);
		classes.put("InterfaceInAnonymous__GEN_461_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__GEN_473_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__GEN_477_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__GEN_478_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__GEN_474_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__GEN_472_junction", GenericJunctionActor.class);
		classes.put("Interface__GEN_491_junction", GenericJunctionActor.class);
		classes.put("Interface__GEN_489_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__GEN_499_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__GEN_503_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__GEN_510_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__GEN_511_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__GEN_504_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__GEN_500_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__GEN_498_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__GEN_523_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__GEN_527_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__GEN_534_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__GEN_535_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__GEN_528_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__GEN_524_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__GEN_522_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__GEN_547_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__GEN_551_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__GEN_552_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__GEN_548_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__GEN_546_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__GEN_564_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__GEN_568_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__GEN_569_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__GEN_565_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__GEN_563_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__GEN_581_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__GEN_585_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__GEN_586_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__GEN_582_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__GEN_580_junction", GenericJunctionActor.class);
		classes.put("MethodDefinition__GEN_597_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationRecursive__GEN_603_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationStaticType__GEN_610_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationStaticType__GEN_611_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationStaticType__GEN_609_junction", GenericJunctionActor.class);
		classes.put("MethodInvocation__GEN_623_junction", GenericJunctionActor.class);
		classes.put("MethodInvocation__GEN_624_junction", GenericJunctionActor.class);
		classes.put("MethodInvocation__GEN_622_junction", MethodInvocation__GEN_622_junction.class);
		classes.put("MethodName__GEN_635_junction", GenericJunctionActor.class);
		classes.put("MethodOverriding__GEN_642_junction", GenericJunctionActor.class);
		classes.put("MethodOverriding__GEN_643_junction", GenericJunctionActor.class);
		classes.put("MethodOverriding__GEN_641_junction", MethodOverriding__GEN_641_junction.class);
		classes.put("MethodParameterLinkFirst__GEN_655_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLinkFirst__GEN_656_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLinkFirst__GEN_654_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLink__GEN_668_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLink__GEN_669_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLink__GEN_667_junction", MethodParameterLink__GEN_667_junction.class);
		classes.put("MethodParameterType__GEN_681_junction", GenericJunctionActor.class);
		classes.put("MethodParameterType__GEN_682_junction", GenericJunctionActor.class);
		classes.put("MethodParameterType__GEN_680_junction", GenericJunctionActor.class);
		classes.put("MethodParameter__GEN_693_junction", GenericJunctionActor.class);
		classes.put("MethodSignature__GEN_699_junction", GenericJunctionActor.class);
		classes.put("NestedClassInType__GEN_706_junction", GenericJunctionActor.class);
		classes.put("NestedClassInType__GEN_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedClassInType__GEN_705_junction", GenericJunctionActor.class);
		classes.put("NestedEnum__GEN_719_junction", GenericJunctionActor.class);
		classes.put("NestedEnum__GEN_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedEnum__GEN_718_junction", GenericJunctionActor.class);
		classes.put("NestedInterfaceInType__GEN_732_junction", GenericJunctionActor.class);
		classes.put("NestedInterfaceInType__GEN_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedInterfaceInType__GEN_731_junction", GenericJunctionActor.class);
		classes.put("OutgoingFlow__GEN_745_junction", GenericJunctionActor.class);
		classes.put("OutgoingFlow__GEN_746_junction", GenericJunctionActor.class);
		classes.put("OutgoingFlow__GEN_744_junction", OutgoingFlow__GEN_744_junction.class);
		classes.put("PackageToPGPackage__GEN_757_junction", GenericJunctionActor.class);
		classes.put("ParameterizedTypeToClass__GEN_764_junction", GenericJunctionActor.class);
		classes.put("ParameterizedTypeToClass__GEN_769_junction", GenericJunctionActor.class);
		classes.put("ParameterizedTypeToClass__GEN_765_junction", GenericJunctionActor.class);
		classes.put("ParameterizedTypeToClass__GEN_763_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsBoolean__GEN_778_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsByte__GEN_784_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsChar__GEN_790_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsDouble__GEN_796_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsFloat__GEN_802_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsInt__GEN_808_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsLong__GEN_814_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsShort__GEN_820_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypesIsVoid__GEN_826_junction", GenericJunctionActor.class);
		classes.put("ReturnType__GEN_833_junction", GenericJunctionActor.class);
		classes.put("ReturnType__GEN_834_junction", GenericJunctionActor.class);
		createJunctionNodes_2();
			}	
		
			private void createJunctionNodes_2() {
		classes.put("ReturnType__GEN_832_junction", GenericJunctionActor.class);
		classes.put("SignatureReturnType__GEN_846_junction", GenericJunctionActor.class);
		classes.put("SignatureReturnType__GEN_847_junction", GenericJunctionActor.class);
		classes.put("SignatureReturnType__GEN_845_junction", GenericJunctionActor.class);
		classes.put("SubPackageToPGPackage__GEN_860_junction", GenericJunctionActor.class);
		classes.put("SubPackageToPGPackage__GEN_858_junction", GenericJunctionActor.class);
		classes.put("SuperConstructorInvocation__GEN_868_junction", GenericJunctionActor.class);
		classes.put("SuperConstructorInvocation__GEN_869_junction", GenericJunctionActor.class);
		classes.put("SuperConstructorInvocation__GEN_867_junction", SuperConstructorInvocation__GEN_867_junction.class);
		classes.put("SuperMethodInvocation__GEN_881_junction", GenericJunctionActor.class);
		classes.put("SuperMethodInvocation__GEN_882_junction", GenericJunctionActor.class);
		classes.put("SuperMethodInvocation__GEN_880_junction", SuperMethodInvocation__GEN_880_junction.class);
		classes.put("SyntethicMethod__GEN_894_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod__GEN_899_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod__GEN_895_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod__GEN_893_junction", GenericJunctionActor.class);
		classes.put("TextAnnotations__GEN_909_junction", GenericJunctionActor.class);
		classes.put("TypeParameter__GEN_915_junction", GenericJunctionActor.class);
		classes.put("TypesOrphaned__GEN_921_junction", GenericJunctionActor.class);
		classes.put("TypesVisibility__GEN_927_junction", GenericJunctionActor.class);
		classes.put("UnresolvedTypeDeclaration__GEN_933_junction", GenericJunctionActor.class);
		classes.put("VariableDeclarationFragment__GEN_939_junction", GenericJunctionActor.class);
	}
	
	public void createReferenceNodes() {
		classes.put("AnnotationToTAnnotation_source_0_reference",AnnotationToTAnnotation_source_0_reference.class);
		classes.put("AnnotationToTAnnotation_target_0_reference",AnnotationToTAnnotation_target_0_reference.class);
		classes.put("AnnotationMemberValuePairToTAnnotationValue_source_0_reference",AnnotationMemberValuePairToTAnnotationValue_source_0_reference.class);
		classes.put("AnnotationMemberValuePairToTAnnotationValue_target_0_reference",AnnotationMemberValuePairToTAnnotationValue_target_0_reference.class);
		classes.put("TypeToTAbstractType_source_0_reference",TypeToTAbstractType_source_0_reference.class);
		classes.put("TypeToTAbstractType_target_0_reference",TypeToTAbstractType_target_0_reference.class);
		classes.put("ASTNodeToTAnnotatable_source_0_reference",ASTNodeToTAnnotatable_source_0_reference.class);
		classes.put("ASTNodeToTAnnotatable_target_0_reference",ASTNodeToTAnnotatable_target_0_reference.class);
		classes.put("TypeToTAbstractType_source_1_reference",TypeToTAbstractType_source_1_reference.class);
		classes.put("TypeToTAbstractType_target_1_reference",TypeToTAbstractType_target_1_reference.class);
		classes.put("AnonymousClassDeclarationToTClass_source_0_reference",AnonymousClassDeclarationToTClass_source_0_reference.class);
		classes.put("AnonymousClassDeclarationToTClass_target_0_reference",AnonymousClassDeclarationToTClass_target_0_reference.class);
		classes.put("TypeGraph_classes_0_reference",TypeGraph_classes_0_reference.class);
		classes.put("TClass_pg_0_reference",TClass_pg_0_reference.class);
		classes.put("TypeToTAbstractType_source_2_reference",TypeToTAbstractType_source_2_reference.class);
		classes.put("TPackage_typeGraph_0_reference",TPackage_typeGraph_0_reference.class);
		classes.put("TAbstractType_package_0_reference",TAbstractType_package_0_reference.class);
		classes.put("TAbstractType_pg_1_reference",TAbstractType_pg_1_reference.class);
		classes.put("PackageToTPackage_source_0_reference",PackageToTPackage_source_0_reference.class);
		classes.put("PackageToTPackage_target_0_reference",PackageToTPackage_target_0_reference.class);
		classes.put("AnonymousClassDeclarationToTClass_source_1_reference",AnonymousClassDeclarationToTClass_source_1_reference.class);
		classes.put("AnonymousClassDeclarationToTClass_target_1_reference",AnonymousClassDeclarationToTClass_target_1_reference.class);
		classes.put("TypeToTAbstractType_target_2_reference",TypeToTAbstractType_target_2_reference.class);
		classes.put("TypeToTAbstractType_target_3_reference",TypeToTAbstractType_target_3_reference.class);
		classes.put("ModelToTypeGraph_source_0_reference",ModelToTypeGraph_source_0_reference.class);
		classes.put("ModelToTypeGraph_target_0_reference",ModelToTypeGraph_target_0_reference.class);
		classes.put("ClassDeclarationToTClass_source_0_reference",ClassDeclarationToTClass_source_0_reference.class);
		classes.put("ClassDeclarationToTClass_target_0_reference",ClassDeclarationToTClass_target_0_reference.class);
		classes.put("TClass_package_1_reference",TClass_package_1_reference.class);
		classes.put("AnonymousClassDeclaration_bodyDeclarations_0_reference",AnonymousClassDeclaration_bodyDeclarations_0_reference.class);
		classes.put("ClassDeclaration_bodyDeclarations_0_reference",ClassDeclaration_bodyDeclarations_0_reference.class);
		classes.put("TypeToTAbstractType_source_3_reference",TypeToTAbstractType_source_3_reference.class);
		classes.put("MDefinitionToTMember_source_0_reference",MDefinitionToTMember_source_0_reference.class);
		classes.put("MDefinitionToTMember_target_0_reference",MDefinitionToTMember_target_0_reference.class);
		classes.put("MDefinitionToTMember_source_1_reference",MDefinitionToTMember_source_1_reference.class);
		classes.put("MSignatureToTSignature_source_0_reference",MSignatureToTSignature_source_0_reference.class);
		classes.put("MSignatureToTSignature_target_0_reference",MSignatureToTSignature_target_0_reference.class);
		classes.put("TAbstractType_defines_0_reference",TAbstractType_defines_0_reference.class);
		classes.put("MDefinitionToTMember_source_2_reference",MDefinitionToTMember_source_2_reference.class);
		classes.put("MDefinitionToTMember_target_1_reference",MDefinitionToTMember_target_1_reference.class);
		classes.put("AbstractTypeDeclaration_bodyDeclarations_1_reference",AbstractTypeDeclaration_bodyDeclarations_1_reference.class);
		classes.put("VariableDeclarationFragment_variablesContainer_0_reference",VariableDeclarationFragment_variablesContainer_0_reference.class);
		classes.put("MSignatureToTSignature_source_1_reference",MSignatureToTSignature_source_1_reference.class);
		classes.put("MSignatureToTSignature_target_1_reference",MSignatureToTSignature_target_1_reference.class);
		classes.put("ModelToTypeGraph_source_1_reference",ModelToTypeGraph_source_1_reference.class);
		classes.put("MFieldNameToTField_source_0_reference",MFieldNameToTField_source_0_reference.class);
		classes.put("MFieldNameToTField_target_0_reference",MFieldNameToTField_target_0_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_0_reference",MAbstractFlowElementToTAbstractFlowElement_source_0_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_target_0_reference",MAbstractFlowElementToTAbstractFlowElement_target_0_reference.class);
		classes.put("MFlowToTFlow_source_0_reference",MFlowToTFlow_source_0_reference.class);
		classes.put("MFlowToTFlow_target_0_reference",MFlowToTFlow_target_0_reference.class);
		classes.put("InterfaceDeclarationToTInterface_source_0_reference",InterfaceDeclarationToTInterface_source_0_reference.class);
		classes.put("InterfaceDeclarationToTInterface_target_0_reference",InterfaceDeclarationToTInterface_target_0_reference.class);
		classes.put("TInterface_defines_1_reference",TInterface_defines_1_reference.class);
		classes.put("InterfaceDeclaration_bodyDeclarations_2_reference",InterfaceDeclaration_bodyDeclarations_2_reference.class);
		classes.put("TypeToTAbstractType_source_4_reference",TypeToTAbstractType_source_4_reference.class);
		classes.put("MSignatureToTSignature_target_2_reference",MSignatureToTSignature_target_2_reference.class);
		classes.put("TMember_signature_0_reference",TMember_signature_0_reference.class);
		classes.put("MDefinition_mSignature_0_reference",MDefinition_mSignature_0_reference.class);
		classes.put("MSignatureToTSignature_source_2_reference",MSignatureToTSignature_source_2_reference.class);
		classes.put("AnnotationTypeDeclaration_bodyDeclarations_3_reference",AnnotationTypeDeclaration_bodyDeclarations_3_reference.class);
		classes.put("TAnnotationType_defines_2_reference",TAnnotationType_defines_2_reference.class);
		classes.put("TClass_defines_3_reference",TClass_defines_3_reference.class);
		classes.put("ClassDeclaration_bodyDeclarations_4_reference",ClassDeclaration_bodyDeclarations_4_reference.class);
		classes.put("EnumDeclaration_bodyDeclarations_5_reference",EnumDeclaration_bodyDeclarations_5_reference.class);
		classes.put("TypeToTAbstractType_source_5_reference",TypeToTAbstractType_source_5_reference.class);
		classes.put("MDefinitionToTMember_source_3_reference",MDefinitionToTMember_source_3_reference.class);
		classes.put("MDefinitionToTMember_target_2_reference",MDefinitionToTMember_target_2_reference.class);
		classes.put("AbstractMethodInvocationToTAccess_source_0_reference",AbstractMethodInvocationToTAccess_source_0_reference.class);
		classes.put("AbstractMethodInvocationToTAccess_target_0_reference",AbstractMethodInvocationToTAccess_target_0_reference.class);
		classes.put("MEntryToTParameter_source_0_reference",MEntryToTParameter_source_0_reference.class);
		classes.put("MEntryToTParameter_target_0_reference",MEntryToTParameter_target_0_reference.class);
		classes.put("MMethodNameToTMethod_source_0_reference",MMethodNameToTMethod_source_0_reference.class);
		classes.put("MMethodNameToTMethod_target_0_reference",MMethodNameToTMethod_target_0_reference.class);
		classes.put("TMethodDefinition_signature_1_reference",TMethodDefinition_signature_1_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("AnnotationToTAnnotation_object",AnnotationToTAnnotation_object.class);
		classes.put("Annotation_object",Annotation_object.class);
		classes.put("TAnnotation_object",TAnnotation_object.class);
		classes.put("AnnotationMemberValuePairToTAnnotationValue_object",AnnotationMemberValuePairToTAnnotationValue_object.class);
		classes.put("AnnotationMemberValuePair_object",AnnotationMemberValuePair_object.class);
		classes.put("TAnnotationValue_object",TAnnotationValue_object.class);
		classes.put("Type_object",Type_object.class);
		classes.put("TAbstractType_object",TAbstractType_object.class);
		classes.put("ASTNodeToTAnnotatable_object",ASTNodeToTAnnotatable_object.class);
		classes.put("BodyDeclaration_object",BodyDeclaration_object.class);
		classes.put("TAnnotatable_object",TAnnotatable_object.class);
		classes.put("AnnotationTypeDeclaration_object",AnnotationTypeDeclaration_object.class);
		classes.put("TAnnotationType_object",TAnnotationType_object.class);
		classes.put("AnonymousClassDeclarationToTClass_object",AnonymousClassDeclarationToTClass_object.class);
		classes.put("AnonymousClassDeclaration_object",AnonymousClassDeclaration_object.class);
		classes.put("AbstractTypeDeclaration_object",AbstractTypeDeclaration_object.class);
		classes.put("TPackage_object",TPackage_object.class);
		classes.put("PackageToTPackage_object",PackageToTPackage_object.class);
		classes.put("Package_object",Package_object.class);
		classes.put("MAnonymous_object",MAnonymous_object.class);
		classes.put("TInterface_object",TInterface_object.class);
		classes.put("MethodInvocation_object",MethodInvocation_object.class);
		classes.put("ArrayInitializer_object",ArrayInitializer_object.class);
		classes.put("ModelToTypeGraph_object",ModelToTypeGraph_object.class);
		classes.put("Model_object",Model_object.class);
		classes.put("ClassDeclarationToTClass_object",ClassDeclarationToTClass_object.class);
		classes.put("ClassDeclaration_object",ClassDeclaration_object.class);
		classes.put("MAbstractMethodDefinition_object",MAbstractMethodDefinition_object.class);
		classes.put("MMethodSignature_object",MMethodSignature_object.class);
		classes.put("TMethodSignature_object",TMethodSignature_object.class);
		classes.put("TFieldDefinition_object",TFieldDefinition_object.class);
		classes.put("MFieldDefinition_object",MFieldDefinition_object.class);
		classes.put("VariableDeclarationFragment_object",VariableDeclarationFragment_object.class);
		classes.put("MFieldSignature_object",MFieldSignature_object.class);
		classes.put("TFieldSignature_object",TFieldSignature_object.class);
		classes.put("MGravityModel_object",MGravityModel_object.class);
		classes.put("MFieldNameToTField_object",MFieldNameToTField_object.class);
		classes.put("MFieldName_object",MFieldName_object.class);
		classes.put("TField_object",TField_object.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_object",MAbstractFlowElementToTAbstractFlowElement_object.class);
		classes.put("MAbstractFlowElement_object",MAbstractFlowElement_object.class);
		classes.put("TAbstractFlowElement_object",TAbstractFlowElement_object.class);
		classes.put("MFlowToTFlow_object",MFlowToTFlow_object.class);
		classes.put("MFlow_object",MFlow_object.class);
		classes.put("TFlow_object",TFlow_object.class);
		classes.put("InterfaceDeclarationToTInterface_object",InterfaceDeclarationToTInterface_object.class);
		classes.put("InterfaceDeclaration_object",InterfaceDeclaration_object.class);
		classes.put("TSignature_object",TSignature_object.class);
		classes.put("MSignature_object",MSignature_object.class);
		classes.put("EnumDeclaration_object",EnumDeclaration_object.class);
		classes.put("MMethodDefinition_object",MMethodDefinition_object.class);
		classes.put("TMethodDefinition_object",TMethodDefinition_object.class);
		classes.put("AbstractMethodInvocationToTAccess_object",AbstractMethodInvocationToTAccess_object.class);
		classes.put("MMethodInvocation_object",MMethodInvocation_object.class);
		classes.put("TCall_object",TCall_object.class);
		classes.put("MEntryToTParameter_object",MEntryToTParameter_object.class);
		classes.put("MEntry_object",MEntry_object.class);
		classes.put("TParameter_object",TParameter_object.class);
		classes.put("MMethodNameToTMethod_object",MMethodNameToTMethod_object.class);
		classes.put("MMethodName_object",MMethodName_object.class);
		classes.put("TMethod_object",TMethod_object.class);
		classes.put("TypeToTAbstractType_object_SP0",TypeToTAbstractType_object_SP0.class);
		classes.put("TypeToTAbstractType_object_SP1",TypeToTAbstractType_object_SP1.class);
		classes.put("TypeToTAbstractType_object_SP2",TypeToTAbstractType_object_SP2.class);
		classes.put("TClass_object_SP0",TClass_object_SP0.class);
		classes.put("TClass_object_SP1",TClass_object_SP1.class);
		classes.put("TypeGraph_object_SP0",TypeGraph_object_SP0.class);
		classes.put("TypeGraph_object_SP1",TypeGraph_object_SP1.class);
		classes.put("MDefinitionToTMember_object_SP0",MDefinitionToTMember_object_SP0.class);
		classes.put("MDefinitionToTMember_object_SP1",MDefinitionToTMember_object_SP1.class);
		classes.put("MDefinition_object_SP0",MDefinition_object_SP0.class);
		classes.put("MDefinition_object_SP1",MDefinition_object_SP1.class);
		classes.put("TMember_object_SP0",TMember_object_SP0.class);
		classes.put("TMember_object_SP1",TMember_object_SP1.class);
		classes.put("MSignatureToTSignature_object_SP0",MSignatureToTSignature_object_SP0.class);
		classes.put("MSignatureToTSignature_object_SP1",MSignatureToTSignature_object_SP1.class);
		
	}
	
	public void initializeReferenceNodes() {
		name2initRefGen.put("AnnotationToTAnnotation_source_0_reference", new InitGenReferenceActor<ModiscoTGG.AnnotationToTAnnotation,org.eclipse.modisco.java.Annotation>(name2actor, name2node.get("AnnotationToTAnnotation_source_0_reference"), (o) -> o instanceof ModiscoTGG.AnnotationToTAnnotation, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AnnotationToTAnnotation_target_0_reference", new InitGenReferenceActor<ModiscoTGG.AnnotationToTAnnotation,org.gravity.typegraph.basic.annotations.TAnnotation>(name2actor, name2node.get("AnnotationToTAnnotation_target_0_reference"), (o) -> o instanceof ModiscoTGG.AnnotationToTAnnotation, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AnnotationMemberValuePairToTAnnotationValue_source_0_reference", new InitGenReferenceActor<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue,org.eclipse.modisco.java.AnnotationMemberValuePair>(name2actor, name2node.get("AnnotationMemberValuePairToTAnnotationValue_source_0_reference"), (o) -> o instanceof ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AnnotationMemberValuePairToTAnnotationValue_target_0_reference", new InitGenReferenceActor<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue,org.gravity.typegraph.basic.annotations.TAnnotationValue>(name2actor, name2node.get("AnnotationMemberValuePairToTAnnotationValue_target_0_reference"), (o) -> o instanceof ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_0_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_0_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TypeToTAbstractType_target_0_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_0_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_source_0_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.eclipse.modisco.java.ASTNode>(name2actor, name2node.get("ASTNodeToTAnnotatable_source_0_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_target_0_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.gravity.typegraph.basic.annotations.TAnnotatable>(name2actor, name2node.get("ASTNodeToTAnnotatable_target_0_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_1_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_1_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TypeToTAbstractType_target_1_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_1_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AnonymousClassDeclarationToTClass_source_0_reference", new InitGenReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass,org.eclipse.modisco.java.AnonymousClassDeclaration>(name2actor, name2node.get("AnonymousClassDeclarationToTClass_source_0_reference"), (o) -> o instanceof ModiscoTGG.AnonymousClassDeclarationToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AnonymousClassDeclarationToTClass_target_0_reference", new InitGenReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("AnonymousClassDeclarationToTClass_target_0_reference"), (o) -> o instanceof ModiscoTGG.AnonymousClassDeclarationToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeGraph_classes_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TClass_pg_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_2_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_2_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TPackage_typeGraph_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TPackage,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TPackage_typeGraph_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TPackage, (o) -> o.getTypeGraph(), null, false));
		name2initRefGen.put("TAbstractType_package_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TPackage>(name2actor, name2node.get("TAbstractType_package_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPackage(), null, false));
		name2initRefGen.put("TAbstractType_pg_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TAbstractType_pg_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("PackageToTPackage_source_0_reference", new InitGenReferenceActor<ModiscoTGG.PackageToTPackage,org.eclipse.modisco.java.Package>(name2actor, name2node.get("PackageToTPackage_source_0_reference"), (o) -> o instanceof ModiscoTGG.PackageToTPackage, (o) -> o.getSource(), null, false));
		name2initRefGen.put("PackageToTPackage_target_0_reference", new InitGenReferenceActor<ModiscoTGG.PackageToTPackage,org.gravity.typegraph.basic.TPackage>(name2actor, name2node.get("PackageToTPackage_target_0_reference"), (o) -> o instanceof ModiscoTGG.PackageToTPackage, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AnonymousClassDeclarationToTClass_source_1_reference", new InitGenReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass,org.eclipse.modisco.java.AnonymousClassDeclaration>(name2actor, name2node.get("AnonymousClassDeclarationToTClass_source_1_reference"), (o) -> o instanceof ModiscoTGG.AnonymousClassDeclarationToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AnonymousClassDeclarationToTClass_target_1_reference", new InitGenReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("AnonymousClassDeclarationToTClass_target_1_reference"), (o) -> o instanceof ModiscoTGG.AnonymousClassDeclarationToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_target_2_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_2_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_target_3_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_3_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("ModelToTypeGraph_source_0_reference", new InitGenReferenceActor<ModiscoTGG.ModelToTypeGraph,org.eclipse.modisco.java.Model>(name2actor, name2node.get("ModelToTypeGraph_source_0_reference"), (o) -> o instanceof ModiscoTGG.ModelToTypeGraph, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ModelToTypeGraph_target_0_reference", new InitGenReferenceActor<ModiscoTGG.ModelToTypeGraph,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("ModelToTypeGraph_target_0_reference"), (o) -> o instanceof ModiscoTGG.ModelToTypeGraph, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("ClassDeclarationToTClass_source_0_reference", new InitGenReferenceActor<ModiscoTGG.ClassDeclarationToTClass,org.eclipse.modisco.java.ClassDeclaration>(name2actor, name2node.get("ClassDeclarationToTClass_source_0_reference"), (o) -> o instanceof ModiscoTGG.ClassDeclarationToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ClassDeclarationToTClass_target_0_reference", new InitGenReferenceActor<ModiscoTGG.ClassDeclarationToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("ClassDeclarationToTClass_target_0_reference"), (o) -> o instanceof ModiscoTGG.ClassDeclarationToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TClass_package_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TPackage>(name2actor, name2node.get("TClass_package_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPackage(), null, false));
		name2initRefGen.put("AnonymousClassDeclaration_bodyDeclarations_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AnonymousClassDeclaration_bodyDeclarations_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnonymousClassDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("ClassDeclaration_bodyDeclarations_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("ClassDeclaration_bodyDeclarations_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TypeToTAbstractType_source_3_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_3_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MDefinitionToTMember_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.modisco.MDefinition>(name2actor, name2node.get("MDefinitionToTMember_source_0_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MDefinitionToTMember_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("MDefinitionToTMember_target_0_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MDefinitionToTMember_source_1_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.modisco.MDefinition>(name2actor, name2node.get("MDefinitionToTMember_source_1_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MSignatureToTSignature_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MSignatureToTSignature,org.gravity.modisco.MSignature>(name2actor, name2node.get("MSignatureToTSignature_source_0_reference"), (o) -> o instanceof ModiscoTGG.MSignatureToTSignature, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MSignatureToTSignature_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MSignatureToTSignature,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("MSignatureToTSignature_target_0_reference"), (o) -> o instanceof ModiscoTGG.MSignatureToTSignature, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TAbstractType_defines_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TAbstractType_defines_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, null, (o) -> o.getDefines(), false));
		name2initRefGen.put("MDefinitionToTMember_source_2_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.modisco.MDefinition>(name2actor, name2node.get("MDefinitionToTMember_source_2_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MDefinitionToTMember_target_1_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("MDefinitionToTMember_target_1_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AbstractTypeDeclaration_bodyDeclarations_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AbstractTypeDeclaration_bodyDeclarations_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("VariableDeclarationFragment_variablesContainer_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.VariableDeclarationFragment,org.eclipse.modisco.java.AbstractVariablesContainer>(name2actor, name2node.get("VariableDeclarationFragment_variablesContainer_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.VariableDeclarationFragment, (o) -> o.getVariablesContainer(), null, false));
		name2initRefGen.put("MSignatureToTSignature_source_1_reference", new InitGenReferenceActor<ModiscoTGG.MSignatureToTSignature,org.gravity.modisco.MSignature>(name2actor, name2node.get("MSignatureToTSignature_source_1_reference"), (o) -> o instanceof ModiscoTGG.MSignatureToTSignature, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MSignatureToTSignature_target_1_reference", new InitGenReferenceActor<ModiscoTGG.MSignatureToTSignature,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("MSignatureToTSignature_target_1_reference"), (o) -> o instanceof ModiscoTGG.MSignatureToTSignature, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("ModelToTypeGraph_source_1_reference", new InitGenReferenceActor<ModiscoTGG.ModelToTypeGraph,org.eclipse.modisco.java.Model>(name2actor, name2node.get("ModelToTypeGraph_source_1_reference"), (o) -> o instanceof ModiscoTGG.ModelToTypeGraph, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MFieldNameToTField_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MFieldNameToTField,org.gravity.modisco.MFieldName>(name2actor, name2node.get("MFieldNameToTField_source_0_reference"), (o) -> o instanceof ModiscoTGG.MFieldNameToTField, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MFieldNameToTField_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MFieldNameToTField,org.gravity.typegraph.basic.TField>(name2actor, name2node.get("MFieldNameToTField_target_0_reference"), (o) -> o instanceof ModiscoTGG.MFieldNameToTField, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_0_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_target_0_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MFlowToTFlow_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MFlowToTFlow,org.gravity.modisco.MFlow>(name2actor, name2node.get("MFlowToTFlow_source_0_reference"), (o) -> o instanceof ModiscoTGG.MFlowToTFlow, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MFlowToTFlow_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MFlowToTFlow,org.gravity.typegraph.basic.TFlow>(name2actor, name2node.get("MFlowToTFlow_target_0_reference"), (o) -> o instanceof ModiscoTGG.MFlowToTFlow, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("InterfaceDeclarationToTInterface_source_0_reference", new InitGenReferenceActor<ModiscoTGG.InterfaceDeclarationToTInterface,org.eclipse.modisco.java.InterfaceDeclaration>(name2actor, name2node.get("InterfaceDeclarationToTInterface_source_0_reference"), (o) -> o instanceof ModiscoTGG.InterfaceDeclarationToTInterface, (o) -> o.getSource(), null, false));
		name2initRefGen.put("InterfaceDeclarationToTInterface_target_0_reference", new InitGenReferenceActor<ModiscoTGG.InterfaceDeclarationToTInterface,org.gravity.typegraph.basic.TInterface>(name2actor, name2node.get("InterfaceDeclarationToTInterface_target_0_reference"), (o) -> o instanceof ModiscoTGG.InterfaceDeclarationToTInterface, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TInterface_defines_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TInterface_defines_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, null, (o) -> o.getDefines(), false));
		name2initRefGen.put("InterfaceDeclaration_bodyDeclarations_2_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("InterfaceDeclaration_bodyDeclarations_2_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TypeToTAbstractType_source_4_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_4_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MSignatureToTSignature_target_2_reference", new InitGenReferenceActor<ModiscoTGG.MSignatureToTSignature,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("MSignatureToTSignature_target_2_reference"), (o) -> o instanceof ModiscoTGG.MSignatureToTSignature, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TMember_signature_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMember,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("TMember_signature_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMember, (o) -> o.getSignature(), null, false));
		name2initRefGen.put("MDefinition_mSignature_0_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.gravity.modisco.MSignature>(name2actor, name2node.get("MDefinition_mSignature_0_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, (o) -> o.getMSignature(), null, false));
		name2initRefGen.put("MSignatureToTSignature_source_2_reference", new InitGenReferenceActor<ModiscoTGG.MSignatureToTSignature,org.gravity.modisco.MSignature>(name2actor, name2node.get("MSignatureToTSignature_source_2_reference"), (o) -> o instanceof ModiscoTGG.MSignatureToTSignature, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AnnotationTypeDeclaration_bodyDeclarations_3_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AnnotationTypeDeclaration_bodyDeclarations_3_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TAnnotationType_defines_2_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TAnnotationType_defines_2_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, null, (o) -> o.getDefines(), false));
		name2initRefGen.put("TClass_defines_3_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TClass_defines_3_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, null, (o) -> o.getDefines(), false));
		name2initRefGen.put("ClassDeclaration_bodyDeclarations_4_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("ClassDeclaration_bodyDeclarations_4_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("EnumDeclaration_bodyDeclarations_5_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("EnumDeclaration_bodyDeclarations_5_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TypeToTAbstractType_source_5_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_5_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MDefinitionToTMember_source_3_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.modisco.MDefinition>(name2actor, name2node.get("MDefinitionToTMember_source_3_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MDefinitionToTMember_target_2_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("MDefinitionToTMember_target_2_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AbstractMethodInvocationToTAccess_source_0_reference", new InitGenReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("AbstractMethodInvocationToTAccess_source_0_reference"), (o) -> o instanceof ModiscoTGG.AbstractMethodInvocationToTAccess, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AbstractMethodInvocationToTAccess_target_0_reference", new InitGenReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess,org.gravity.typegraph.basic.TAccess>(name2actor, name2node.get("AbstractMethodInvocationToTAccess_target_0_reference"), (o) -> o instanceof ModiscoTGG.AbstractMethodInvocationToTAccess, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MEntryToTParameter_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MEntryToTParameter,org.gravity.modisco.MEntry>(name2actor, name2node.get("MEntryToTParameter_source_0_reference"), (o) -> o instanceof ModiscoTGG.MEntryToTParameter, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MEntryToTParameter_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MEntryToTParameter,org.gravity.typegraph.basic.TParameter>(name2actor, name2node.get("MEntryToTParameter_target_0_reference"), (o) -> o instanceof ModiscoTGG.MEntryToTParameter, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MMethodNameToTMethod_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MMethodNameToTMethod,org.gravity.modisco.MMethodName>(name2actor, name2node.get("MMethodNameToTMethod_source_0_reference"), (o) -> o instanceof ModiscoTGG.MMethodNameToTMethod, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MMethodNameToTMethod_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MMethodNameToTMethod,org.gravity.typegraph.basic.TMethod>(name2actor, name2node.get("MMethodNameToTMethod_target_0_reference"), (o) -> o instanceof ModiscoTGG.MMethodNameToTMethod, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TMethodDefinition_signature_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMember,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("TMethodDefinition_signature_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMember, (o) -> o.getSignature(), null, false));
	}
	
	/**
	 * delegate notifications to dispatcher actor
	 * @param notification
	 */			
	public void handleNotification(Notification notification) {
		try {
			dirty = true;
			ask(notificationActor, new NotificationMessage(notification), Duration.ofHours(24)).toCompletableFuture().get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}			
	}
	
	public Map<String, ProductionResult> extractData() throws InterruptedException {
		if(!dirty) {
			return java.util.Collections.synchronizedMap(new HashMap<>());
		}	
		dirty = false;
		
		iUtil.clean();
		pUtil.clean();
			
		notificationActor.tell(new NoMoreInput(), notificationActor);
		
		try {
			Thread.sleep(100000000);
		} catch(Exception e) {
		}
		
		return pUtil.getProductionResults();
	}
	
	public void terminate() {
		system.terminate();	
	}
	
}

class AnnotationToTAnnotation_object extends GenericObjectActor<ModiscoTGG.AnnotationToTAnnotation> { }
class Annotation_object extends GenericObjectActor<org.eclipse.modisco.java.Annotation> { }
class TAnnotation_object extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TAnnotation> { }
class AnnotationMemberValuePairToTAnnotationValue_object extends GenericObjectActor<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue> { }
class AnnotationMemberValuePair_object extends GenericObjectActor<org.eclipse.modisco.java.AnnotationMemberValuePair> { }
class TAnnotationValue_object extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TAnnotationValue> { }
class Type_object extends GenericObjectActor<org.eclipse.modisco.java.Type> { }
class TAbstractType_object extends GenericObjectActor<org.gravity.typegraph.basic.TAbstractType> { }
class ASTNodeToTAnnotatable_object extends GenericObjectActor<ModiscoTGG.ASTNodeToTAnnotatable> { }
class BodyDeclaration_object extends GenericObjectActor<org.eclipse.modisco.java.BodyDeclaration> { }
class TAnnotatable_object extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TAnnotatable> { }
class AnnotationTypeDeclaration_object extends GenericObjectActor<org.eclipse.modisco.java.AnnotationTypeDeclaration> { }
class TAnnotationType_object extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TAnnotationType> { }
class AnonymousClassDeclarationToTClass_object extends GenericObjectActor<ModiscoTGG.AnonymousClassDeclarationToTClass> { }
class AnonymousClassDeclaration_object extends GenericObjectActor<org.eclipse.modisco.java.AnonymousClassDeclaration> { }
class AbstractTypeDeclaration_object extends GenericObjectActor<org.eclipse.modisco.java.AbstractTypeDeclaration> { }
class TPackage_object extends GenericObjectActor<org.gravity.typegraph.basic.TPackage> { }
class PackageToTPackage_object extends GenericObjectActor<ModiscoTGG.PackageToTPackage> { }
class Package_object extends GenericObjectActor<org.eclipse.modisco.java.Package> { }
class MAnonymous_object extends GenericObjectActor<org.gravity.modisco.MAnonymous> { }
class TInterface_object extends GenericObjectActor<org.gravity.typegraph.basic.TInterface> { }
class MethodInvocation_object extends GenericObjectActor<org.eclipse.modisco.java.MethodInvocation> { }
class ArrayInitializer_object extends GenericObjectActor<org.eclipse.modisco.java.ArrayInitializer> { }
class ModelToTypeGraph_object extends GenericObjectActor<ModiscoTGG.ModelToTypeGraph> { }
class Model_object extends GenericObjectActor<org.eclipse.modisco.java.Model> { }
class ClassDeclarationToTClass_object extends GenericObjectActor<ModiscoTGG.ClassDeclarationToTClass> { }
class ClassDeclaration_object extends GenericObjectActor<org.eclipse.modisco.java.ClassDeclaration> { }
class MAbstractMethodDefinition_object extends GenericObjectActor<org.gravity.modisco.MAbstractMethodDefinition> { }
class MMethodSignature_object extends GenericObjectActor<org.gravity.modisco.MMethodSignature> { }
class TMethodSignature_object extends GenericObjectActor<org.gravity.typegraph.basic.TMethodSignature> { }
class TFieldDefinition_object extends GenericObjectActor<org.gravity.typegraph.basic.TFieldDefinition> { }
class MFieldDefinition_object extends GenericObjectActor<org.gravity.modisco.MFieldDefinition> { }
class VariableDeclarationFragment_object extends GenericObjectActor<org.eclipse.modisco.java.VariableDeclarationFragment> { }
class MFieldSignature_object extends GenericObjectActor<org.gravity.modisco.MFieldSignature> { }
class TFieldSignature_object extends GenericObjectActor<org.gravity.typegraph.basic.TFieldSignature> { }
class MGravityModel_object extends GenericObjectActor<org.gravity.modisco.MGravityModel> { }
class MFieldNameToTField_object extends GenericObjectActor<ModiscoTGG.MFieldNameToTField> { }
class MFieldName_object extends GenericObjectActor<org.gravity.modisco.MFieldName> { }
class TField_object extends GenericObjectActor<org.gravity.typegraph.basic.TField> { }
class MAbstractFlowElementToTAbstractFlowElement_object extends GenericObjectActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement> { }
class MAbstractFlowElement_object extends GenericObjectActor<org.gravity.modisco.MAbstractFlowElement> { }
class TAbstractFlowElement_object extends GenericObjectActor<org.gravity.typegraph.basic.TAbstractFlowElement> { }
class MFlowToTFlow_object extends GenericObjectActor<ModiscoTGG.MFlowToTFlow> { }
class MFlow_object extends GenericObjectActor<org.gravity.modisco.MFlow> { }
class TFlow_object extends GenericObjectActor<org.gravity.typegraph.basic.TFlow> { }
class InterfaceDeclarationToTInterface_object extends GenericObjectActor<ModiscoTGG.InterfaceDeclarationToTInterface> { }
class InterfaceDeclaration_object extends GenericObjectActor<org.eclipse.modisco.java.InterfaceDeclaration> { }
class TSignature_object extends GenericObjectActor<org.gravity.typegraph.basic.TSignature> { }
class MSignature_object extends GenericObjectActor<org.gravity.modisco.MSignature> { }
class EnumDeclaration_object extends GenericObjectActor<org.eclipse.modisco.java.EnumDeclaration> { }
class MMethodDefinition_object extends GenericObjectActor<org.gravity.modisco.MMethodDefinition> { }
class TMethodDefinition_object extends GenericObjectActor<org.gravity.typegraph.basic.TMethodDefinition> { }
class AbstractMethodInvocationToTAccess_object extends GenericObjectActor<ModiscoTGG.AbstractMethodInvocationToTAccess> { }
class MMethodInvocation_object extends GenericObjectActor<org.gravity.modisco.MMethodInvocation> { }
class TCall_object extends GenericObjectActor<org.gravity.typegraph.basic.TCall> { }
class MEntryToTParameter_object extends GenericObjectActor<ModiscoTGG.MEntryToTParameter> { }
class MEntry_object extends GenericObjectActor<org.gravity.modisco.MEntry> { }
class TParameter_object extends GenericObjectActor<org.gravity.typegraph.basic.TParameter> { }
class MMethodNameToTMethod_object extends GenericObjectActor<ModiscoTGG.MMethodNameToTMethod> { }
class MMethodName_object extends GenericObjectActor<org.gravity.modisco.MMethodName> { }
class TMethod_object extends GenericObjectActor<org.gravity.typegraph.basic.TMethod> { }
class TypeToTAbstractType_object_SP0 extends GenericObjectActor<ModiscoTGG.TypeToTAbstractType> { }
class TypeToTAbstractType_object_SP1 extends GenericObjectActor<ModiscoTGG.TypeToTAbstractType> { }
class TypeToTAbstractType_object_SP2 extends GenericObjectActor<ModiscoTGG.TypeToTAbstractType> { }
class TClass_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TClass> { }
class TypeGraph_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TypeGraph> { }
class MDefinitionToTMember_object_SP0 extends GenericObjectActor<ModiscoTGG.MDefinitionToTMember> { }
class MDefinitionToTMember_object_SP1 extends GenericObjectActor<ModiscoTGG.MDefinitionToTMember> { }
class MDefinition_object_SP0 extends GenericObjectActor<org.gravity.modisco.MDefinition> { }
class MDefinition_object_SP1 extends GenericObjectActor<org.gravity.modisco.MDefinition> { }
class TMember_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TMember> { }
class TMember_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TMember> { }
class MSignatureToTSignature_object_SP0 extends GenericObjectActor<ModiscoTGG.MSignatureToTSignature> { }
class MSignatureToTSignature_object_SP1 extends GenericObjectActor<ModiscoTGG.MSignatureToTSignature> { }

class AnnotationToTAnnotation_source_0_reference extends GenericReferenceActor<ModiscoTGG.AnnotationToTAnnotation, org.eclipse.modisco.java.Annotation> { }
class AnnotationToTAnnotation_target_0_reference extends GenericReferenceActor<ModiscoTGG.AnnotationToTAnnotation, org.gravity.typegraph.basic.annotations.TAnnotation> { }
class AnnotationMemberValuePairToTAnnotationValue_source_0_reference extends GenericReferenceActor<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, org.eclipse.modisco.java.AnnotationMemberValuePair> { }
class AnnotationMemberValuePairToTAnnotationValue_target_0_reference extends GenericReferenceActor<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, org.gravity.typegraph.basic.annotations.TAnnotationValue> { }
class TypeToTAbstractType_source_0_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class TypeToTAbstractType_target_0_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class ASTNodeToTAnnotatable_source_0_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.eclipse.modisco.java.ASTNode> { }
class ASTNodeToTAnnotatable_target_0_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotatable> { }
class TypeToTAbstractType_source_1_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class TypeToTAbstractType_target_1_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class AnonymousClassDeclarationToTClass_source_0_reference extends GenericReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass, org.eclipse.modisco.java.AnonymousClassDeclaration> { }
class AnonymousClassDeclarationToTClass_target_0_reference extends GenericReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass> { }
class TypeGraph_classes_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TClass_pg_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TypeToTAbstractType_source_2_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class TPackage_typeGraph_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TPackage, org.gravity.typegraph.basic.TypeGraph> { }
class TAbstractType_package_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage> { }
class TAbstractType_pg_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class PackageToTPackage_source_0_reference extends GenericReferenceActor<ModiscoTGG.PackageToTPackage, org.eclipse.modisco.java.Package> { }
class PackageToTPackage_target_0_reference extends GenericReferenceActor<ModiscoTGG.PackageToTPackage, org.gravity.typegraph.basic.TPackage> { }
class AnonymousClassDeclarationToTClass_source_1_reference extends GenericReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass, org.eclipse.modisco.java.AnonymousClassDeclaration> { }
class AnonymousClassDeclarationToTClass_target_1_reference extends GenericReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass> { }
class TypeToTAbstractType_target_2_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TypeToTAbstractType_target_3_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class ModelToTypeGraph_source_0_reference extends GenericReferenceActor<ModiscoTGG.ModelToTypeGraph, org.eclipse.modisco.java.Model> { }
class ModelToTypeGraph_target_0_reference extends GenericReferenceActor<ModiscoTGG.ModelToTypeGraph, org.gravity.typegraph.basic.TypeGraph> { }
class ClassDeclarationToTClass_source_0_reference extends GenericReferenceActor<ModiscoTGG.ClassDeclarationToTClass, org.eclipse.modisco.java.ClassDeclaration> { }
class ClassDeclarationToTClass_target_0_reference extends GenericReferenceActor<ModiscoTGG.ClassDeclarationToTClass, org.gravity.typegraph.basic.TClass> { }
class TClass_package_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage> { }
class AnonymousClassDeclaration_bodyDeclarations_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class ClassDeclaration_bodyDeclarations_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TypeToTAbstractType_source_3_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class MDefinitionToTMember_source_0_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition> { }
class MDefinitionToTMember_target_0_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember> { }
class MDefinitionToTMember_source_1_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition> { }
class MSignatureToTSignature_source_0_reference extends GenericReferenceActor<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature> { }
class MSignatureToTSignature_target_0_reference extends GenericReferenceActor<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature> { }
class TAbstractType_defines_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember> { }
class MDefinitionToTMember_source_2_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition> { }
class MDefinitionToTMember_target_1_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember> { }
class AbstractTypeDeclaration_bodyDeclarations_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class VariableDeclarationFragment_variablesContainer_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.VariableDeclarationFragment, org.eclipse.modisco.java.AbstractVariablesContainer> { }
class MSignatureToTSignature_source_1_reference extends GenericReferenceActor<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature> { }
class MSignatureToTSignature_target_1_reference extends GenericReferenceActor<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature> { }
class ModelToTypeGraph_source_1_reference extends GenericReferenceActor<ModiscoTGG.ModelToTypeGraph, org.eclipse.modisco.java.Model> { }
class MFieldNameToTField_source_0_reference extends GenericReferenceActor<ModiscoTGG.MFieldNameToTField, org.gravity.modisco.MFieldName> { }
class MFieldNameToTField_target_0_reference extends GenericReferenceActor<ModiscoTGG.MFieldNameToTField, org.gravity.typegraph.basic.TField> { }
class MAbstractFlowElementToTAbstractFlowElement_source_0_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_target_0_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement> { }
class MFlowToTFlow_source_0_reference extends GenericReferenceActor<ModiscoTGG.MFlowToTFlow, org.gravity.modisco.MFlow> { }
class MFlowToTFlow_target_0_reference extends GenericReferenceActor<ModiscoTGG.MFlowToTFlow, org.gravity.typegraph.basic.TFlow> { }
class InterfaceDeclarationToTInterface_source_0_reference extends GenericReferenceActor<ModiscoTGG.InterfaceDeclarationToTInterface, org.eclipse.modisco.java.InterfaceDeclaration> { }
class InterfaceDeclarationToTInterface_target_0_reference extends GenericReferenceActor<ModiscoTGG.InterfaceDeclarationToTInterface, org.gravity.typegraph.basic.TInterface> { }
class TInterface_defines_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember> { }
class InterfaceDeclaration_bodyDeclarations_2_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TypeToTAbstractType_source_4_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class MSignatureToTSignature_target_2_reference extends GenericReferenceActor<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature> { }
class TMember_signature_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature> { }
class MDefinition_mSignature_0_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.gravity.modisco.MSignature> { }
class MSignatureToTSignature_source_2_reference extends GenericReferenceActor<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature> { }
class AnnotationTypeDeclaration_bodyDeclarations_3_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TAnnotationType_defines_2_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember> { }
class TClass_defines_3_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember> { }
class ClassDeclaration_bodyDeclarations_4_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class EnumDeclaration_bodyDeclarations_5_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TypeToTAbstractType_source_5_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class MDefinitionToTMember_source_3_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition> { }
class MDefinitionToTMember_target_2_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember> { }
class AbstractMethodInvocationToTAccess_source_0_reference extends GenericReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class AbstractMethodInvocationToTAccess_target_0_reference extends GenericReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess, org.gravity.typegraph.basic.TAccess> { }
class MEntryToTParameter_source_0_reference extends GenericReferenceActor<ModiscoTGG.MEntryToTParameter, org.gravity.modisco.MEntry> { }
class MEntryToTParameter_target_0_reference extends GenericReferenceActor<ModiscoTGG.MEntryToTParameter, org.gravity.typegraph.basic.TParameter> { }
class MMethodNameToTMethod_source_0_reference extends GenericReferenceActor<ModiscoTGG.MMethodNameToTMethod, org.gravity.modisco.MMethodName> { }
class MMethodNameToTMethod_target_0_reference extends GenericReferenceActor<ModiscoTGG.MMethodNameToTMethod, org.gravity.typegraph.basic.TMethod> { }
class TMethodDefinition_signature_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature> { }

