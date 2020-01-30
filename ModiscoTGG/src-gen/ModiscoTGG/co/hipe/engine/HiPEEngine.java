package ModiscoTGG.co.hipe.engine;

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

import ModiscoTGG.co.hipe.engine.actor.NotificationActor;
import ModiscoTGG.co.hipe.engine.actor.DispatchActor;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationMemberKey__CO_7_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationMemberValueBooleanArray__CO_73_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationMemberValueBoolean__CO_87_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationMemberValueClassArray_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_153_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationMemberValueClass_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_205_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationMemberValueNumberArray__CO_217_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationMemberValueNumber__CO_231_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationMemberValueStringArray__CO_254_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationMemberValueString__CO_268_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationTypeAccess_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_337_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationTypeInAnonymous__CO_343_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationTypeNested__CO_380_junction;
import ModiscoTGG.co.hipe.engine.actor.edge.TPackage_subpackage_0_reference;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationTypeNested__CO_371_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationType__CO_414_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnnotationType__CO_426_junction;
import ModiscoTGG.co.hipe.engine.actor.edge.TClass_parentClass_0_reference;
import ModiscoTGG.co.hipe.engine.actor.junction.AnonymousClassTypeClass_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC_477_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnonymousClassTypeInterface_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC_521_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.AnonymousClass__CO_541_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ArrayTypeToClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_610_junction;
import ModiscoTGG.co.hipe.engine.actor.edge.TClass_parentClass_1_reference;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassExtendsClass__CO_622_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassExtendsClass__CO_616_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassExtendsClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_648_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassImplementsInterface__CO_660_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassImplementsInterface_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_686_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInAnonymous__CO_693_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInAnonymous__CO_694_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInnerAnonClassMember__CO_737_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInnerAnonClassMember__CO_740_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInnerAnonClassMember__CO_742_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInnerAnonClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_770_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInnerClassMember__CO_790_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInnerClassMember__CO_793_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInnerClassMember__CO_795_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInnerClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_823_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInstanceCreation__CO_847_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInstanceCreation__CO_849_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ClassInstanceCreation__CO_837_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.Class__CO_871_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.Class__CO_879_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.Class__CO_880_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.Class_tType_classes_incoming_TRG__FILTER_NAC_902_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ConstructorInvocation__CO_950_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ConstructorInvocation__CO_952_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ConstructorInvocation__CO_940_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.EnumInAnonymous__CO_971_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.Enum__CO_1009_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.Enum__CO_1018_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.Enum_tType_classes_incoming_TRG__FILTER_NAC_1038_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.FieldAccessReadWrite__CO_1044_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.FieldAccessReadWrite_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_1091_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.FieldAccessRead__CO_1097_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.FieldAccessRead_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_1144_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.FieldAccessWrite__CO_1150_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.FieldAccessWrite_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_1197_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.FieldName__CO_1236_junction;
import ModiscoTGG.co.hipe.engine.actor.edge.MAbstractFlowElement_outgoingFlows_0_reference;
import ModiscoTGG.co.hipe.engine.actor.edge.TFlow_incomingFlows_0_reference;
import ModiscoTGG.co.hipe.engine.actor.edge.TInterface_parentInterfaces_0_reference;
import ModiscoTGG.co.hipe.engine.actor.junction.InterfaceExtendsInterface__CO_1326_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.InterfaceExtendsInterface__CO_1320_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.InterfaceExtendsInterface_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_1352_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.InterfaceInAnonymous__CO_1359_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.InterfaceInAnonymous__CO_1360_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.InterfaceMember__CO_1395_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.Interface__CO_1429_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.Interface__CO_1437_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.Interface__CO_1438_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.Interface_tType_interfaces_incoming_TRG__FILTER_NAC_1460_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.MemberInAnnotationVisibility__CO_1525_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.MemberInClassVisibility__CO_1555_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.MemberInEnumVisibility__CO_1586_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.MethodInvocation__CO_1699_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.MethodInvocation__CO_1701_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.MethodInvocation__CO_1689_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.MethodName__CO_1720_junction;
import ModiscoTGG.co.hipe.engine.actor.edge.MMethodDefinition_redefinitions_0_reference;
import ModiscoTGG.co.hipe.engine.actor.edge.TMethodDefinition_overriding_0_reference;
import ModiscoTGG.co.hipe.engine.actor.junction.MethodOverriding__CO_1737_junction;
import ModiscoTGG.co.hipe.engine.actor.edge.MEntry_mPrevious_0_reference;
import ModiscoTGG.co.hipe.engine.actor.edge.TParameter_previous_0_reference;
import ModiscoTGG.co.hipe.engine.actor.junction.MethodParameterLink__CO_1771_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ModelToPg__CO_1871_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.NestedClassInType__CO_1885_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.NestedClassInType__CO_1877_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.NestedClassInType_tNestedType_classes_incoming_TRG__FILTER_NAC_1924_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.NestedEnum__CO_1940_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.NestedEnum__CO_1932_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.NestedEnum_tNestedType_classes_incoming_TRG__FILTER_NAC_1975_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.NestedInterfaceInType__CO_1989_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.NestedInterfaceInType__CO_1981_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.NestedInterfaceInType_tNestedType_interfaces_incoming_TRG__FILTER_NAC_2028_junction;
import ModiscoTGG.co.hipe.engine.actor.edge.MAbstractFlowElement_incomingFlows_0_reference;
import ModiscoTGG.co.hipe.engine.actor.edge.TFlow_outgoingFlows_0_reference;
import ModiscoTGG.co.hipe.engine.actor.junction.PackageToPGPackage__CO_2053_junction;
import ModiscoTGG.co.hipe.engine.actor.edge.Package_package_0_reference;
import ModiscoTGG.co.hipe.engine.actor.junction.ParameterizedTypeToClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_2119_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.ReturnType_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_2400_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.SubPackageToPGPackage__CO_2428_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.SuperConstructorInvocation__CO_2462_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.SuperConstructorInvocation__CO_2464_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.SuperConstructorInvocation__CO_2452_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.SuperMethodInvocation__CO_2495_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.SuperMethodInvocation__CO_2497_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.SuperMethodInvocation__CO_2485_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.SyntethicMethod_mSyntethic_syntheticMethodDefinitions_incoming_SRC__FILTER_NAC_2548_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.SyntethicMethod_tSyntethic_syntethicMethods_incoming_TRG__FILTER_NAC_2554_junction;
import ModiscoTGG.co.hipe.engine.actor.node.LineComment_object;
import ModiscoTGG.co.hipe.engine.actor.junction.TextAnnotations__CO_2566_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.TypesOrphaned__CO_2604_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.TypesVisibility__CO_2630_junction;
import ModiscoTGG.co.hipe.engine.actor.junction.UnresolvedTypeDeclaration__CO_2650_junction;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP0;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP1;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP2;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP3;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP4;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP5;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP6;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP7;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP8;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP9;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP10;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP11;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP12;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP13;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP14;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP15;
import ModiscoTGG.co.hipe.engine.actor.node.TClass_object_SP16;
import ModiscoTGG.co.hipe.engine.actor.node.MSingleVariableAccess_object_SP0;
import ModiscoTGG.co.hipe.engine.actor.node.MSingleVariableAccess_object_SP1;
import ModiscoTGG.co.hipe.engine.actor.node.MSingleVariableAccess_object_SP2;
import ModiscoTGG.co.hipe.engine.actor.node.MSingleVariableAccess_object_SP3;

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
		classes.put("AnnotationMemberKey__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberKey__CO_production", "AnnotationMemberKey__CO");
		classes.put("AnnotationMemberValueAnnotationArray__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueAnnotationArray__CO_production", "AnnotationMemberValueAnnotationArray__CO");
		classes.put("AnnotationMemberValueAnnotationArray_mValue_annotations_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueAnnotationArray_mValue_annotations_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueAnnotationArray_mValue_annotations_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueAnnotationArray_tValue_tAnnotation_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueAnnotationArray_tValue_tAnnotation_incoming_TRG__FILTER_NAC_production", "AnnotationMemberValueAnnotationArray_tValue_tAnnotation_incoming_TRG__FILTER_NAC");
		classes.put("AnnotationMemberValueAnnotation__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueAnnotation__CO_production", "AnnotationMemberValueAnnotation__CO");
		classes.put("AnnotationMemberValueAnnotation_mValue_annotations_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueAnnotation_mValue_annotations_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueAnnotation_mValue_annotations_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueAnnotation_tValue_tAnnotation_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueAnnotation_tValue_tAnnotation_incoming_TRG__FILTER_NAC_production", "AnnotationMemberValueAnnotation_tValue_tAnnotation_incoming_TRG__FILTER_NAC");
		classes.put("AnnotationMemberValueBooleanArray__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueBooleanArray__CO_production", "AnnotationMemberValueBooleanArray__CO");
		classes.put("AnnotationMemberValueBoolean__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueBoolean__CO_production", "AnnotationMemberValueBoolean__CO");
		classes.put("AnnotationMemberValueClassArray__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClassArray__CO_production", "AnnotationMemberValueClassArray__CO");
		classes.put("AnnotationMemberValueClassArray_mAccess_elementType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClassArray_mAccess_elementType_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueClassArray_mAccess_elementType_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueClassArray_mAccess_returnType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClassArray_mAccess_returnType_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueClassArray_mAccess_returnType_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueClassArray_mAccess_superClass_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClassArray_mAccess_superClass_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueClassArray_mAccess_superClass_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueClassArray_mAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClassArray_mAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueClassArray_mAccess_superInterfaces_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueClassArray_mAccess_type_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClassArray_mAccess_type_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueClassArray_mAccess_type_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueClassArray_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClassArray_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueClassArray_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueClass__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClass__CO_production", "AnnotationMemberValueClass__CO");
		classes.put("AnnotationMemberValueClass_mAccess_elementType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClass_mAccess_elementType_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueClass_mAccess_elementType_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueClass_mAccess_returnType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClass_mAccess_returnType_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueClass_mAccess_returnType_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueClass_mAccess_superClass_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClass_mAccess_superClass_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueClass_mAccess_superClass_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueClass_mAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClass_mAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueClass_mAccess_superInterfaces_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueClass_mAccess_type_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClass_mAccess_type_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueClass_mAccess_type_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueClass_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueClass_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", "AnnotationMemberValueClass_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationMemberValueNumberArray__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueNumberArray__CO_production", "AnnotationMemberValueNumberArray__CO");
		classes.put("AnnotationMemberValueNumber__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueNumber__CO_production", "AnnotationMemberValueNumber__CO");
		classes.put("AnnotationMemberValueStringArray__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueStringArray__CO_production", "AnnotationMemberValueStringArray__CO");
		classes.put("AnnotationMemberValueString__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationMemberValueString__CO_production", "AnnotationMemberValueString__CO");
		classes.put("AnnotationOnBodyDeclaration__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationOnBodyDeclaration__CO_production", "AnnotationOnBodyDeclaration__CO");
		classes.put("AnnotationTypeAccess__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeAccess__CO_production", "AnnotationTypeAccess__CO");
		classes.put("AnnotationTypeAccess_mAccess_elementType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeAccess_mAccess_elementType_incoming_SRC__FILTER_NAC_production", "AnnotationTypeAccess_mAccess_elementType_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationTypeAccess_mAccess_returnType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeAccess_mAccess_returnType_incoming_SRC__FILTER_NAC_production", "AnnotationTypeAccess_mAccess_returnType_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationTypeAccess_mAccess_superClass_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeAccess_mAccess_superClass_incoming_SRC__FILTER_NAC_production", "AnnotationTypeAccess_mAccess_superClass_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationTypeAccess_mAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeAccess_mAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", "AnnotationTypeAccess_mAccess_superInterfaces_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationTypeAccess_mAccess_type_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeAccess_mAccess_type_incoming_SRC__FILTER_NAC_production", "AnnotationTypeAccess_mAccess_type_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationTypeAccess_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeAccess_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", "AnnotationTypeAccess_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC");
		classes.put("AnnotationTypeInAnonymous__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeInAnonymous__CO_production", "AnnotationTypeInAnonymous__CO");
		classes.put("AnnotationTypeNested__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeNested__CO_production", "AnnotationTypeNested__CO");
		classes.put("AnnotationTypeNested_tNestedPackage_pg_outgoing_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationTypeNested_tNestedPackage_pg_outgoing_TRG__FILTER_NAC_production", "AnnotationTypeNested_tNestedPackage_pg_outgoing_TRG__FILTER_NAC");
		classes.put("AnnotationType__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnnotationType__CO_production", "AnnotationType__CO");
		classes.put("AnonymousClassTypeClass__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeClass__CO_production", "AnonymousClassTypeClass__CO");
		classes.put("AnonymousClassTypeClass_mType_elementType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeClass_mType_elementType_incoming_SRC__FILTER_NAC_production", "AnonymousClassTypeClass_mType_elementType_incoming_SRC__FILTER_NAC");
		classes.put("AnonymousClassTypeClass_mType_returnType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeClass_mType_returnType_incoming_SRC__FILTER_NAC_production", "AnonymousClassTypeClass_mType_returnType_incoming_SRC__FILTER_NAC");
		classes.put("AnonymousClassTypeClass_mType_superClass_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeClass_mType_superClass_incoming_SRC__FILTER_NAC_production", "AnonymousClassTypeClass_mType_superClass_incoming_SRC__FILTER_NAC");
		classes.put("AnonymousClassTypeClass_mType_superInterfaces_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeClass_mType_superInterfaces_incoming_SRC__FILTER_NAC_production", "AnonymousClassTypeClass_mType_superInterfaces_incoming_SRC__FILTER_NAC");
		classes.put("AnonymousClassTypeClass_mType_type_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeClass_mType_type_incoming_SRC__FILTER_NAC_production", "AnonymousClassTypeClass_mType_type_incoming_SRC__FILTER_NAC");
		classes.put("AnonymousClassTypeClass_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeClass_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", "AnonymousClassTypeClass_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC");
		classes.put("AnonymousClassTypeInterface__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeInterface__CO_production", "AnonymousClassTypeInterface__CO");
		classes.put("AnonymousClassTypeInterface_mType_elementType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeInterface_mType_elementType_incoming_SRC__FILTER_NAC_production", "AnonymousClassTypeInterface_mType_elementType_incoming_SRC__FILTER_NAC");
		classes.put("AnonymousClassTypeInterface_mType_returnType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeInterface_mType_returnType_incoming_SRC__FILTER_NAC_production", "AnonymousClassTypeInterface_mType_returnType_incoming_SRC__FILTER_NAC");
		classes.put("AnonymousClassTypeInterface_mType_superClass_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeInterface_mType_superClass_incoming_SRC__FILTER_NAC_production", "AnonymousClassTypeInterface_mType_superClass_incoming_SRC__FILTER_NAC");
		classes.put("AnonymousClassTypeInterface_mType_superInterfaces_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeInterface_mType_superInterfaces_incoming_SRC__FILTER_NAC_production", "AnonymousClassTypeInterface_mType_superInterfaces_incoming_SRC__FILTER_NAC");
		classes.put("AnonymousClassTypeInterface_mType_type_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeInterface_mType_type_incoming_SRC__FILTER_NAC_production", "AnonymousClassTypeInterface_mType_type_incoming_SRC__FILTER_NAC");
		classes.put("AnonymousClassTypeInterface_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClassTypeInterface_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", "AnonymousClassTypeInterface_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC");
		classes.put("AnonymousClass__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClass__CO_production", "AnonymousClass__CO");
		classes.put("AnonymousClass_tAnonymous_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClass_tAnonymous_classes_incoming_TRG__FILTER_NAC_production", "AnonymousClass_tAnonymous_classes_incoming_TRG__FILTER_NAC");
		classes.put("AnonymousClass_tNewPackage_pg_outgoing_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClass_tNewPackage_pg_outgoing_TRG__FILTER_NAC_production", "AnonymousClass_tNewPackage_pg_outgoing_TRG__FILTER_NAC");
		classes.put("AnonymousClass_tNewPackage_typeGraph_outgoing_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("AnonymousClass_tNewPackage_typeGraph_outgoing_TRG__FILTER_NAC_production", "AnonymousClass_tNewPackage_typeGraph_outgoing_TRG__FILTER_NAC");
		classes.put("ArrayInitializerIgnoreExpressionsEdge__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ArrayInitializerIgnoreExpressionsEdge__CO_production", "ArrayInitializerIgnoreExpressionsEdge__CO");
		classes.put("ArrayTypeToClass__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ArrayTypeToClass__CO_production", "ArrayTypeToClass__CO");
		classes.put("ArrayTypeToClass_eTypeAccess_returnType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ArrayTypeToClass_eTypeAccess_returnType_incoming_SRC__FILTER_NAC_production", "ArrayTypeToClass_eTypeAccess_returnType_incoming_SRC__FILTER_NAC");
		classes.put("ArrayTypeToClass_eTypeAccess_superClass_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ArrayTypeToClass_eTypeAccess_superClass_incoming_SRC__FILTER_NAC_production", "ArrayTypeToClass_eTypeAccess_superClass_incoming_SRC__FILTER_NAC");
		classes.put("ArrayTypeToClass_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ArrayTypeToClass_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", "ArrayTypeToClass_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC");
		classes.put("ArrayTypeToClass_eTypeAccess_type_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ArrayTypeToClass_eTypeAccess_type_incoming_SRC__FILTER_NAC_production", "ArrayTypeToClass_eTypeAccess_type_incoming_SRC__FILTER_NAC");
		classes.put("ArrayTypeToClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ArrayTypeToClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", "ArrayTypeToClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC");
		classes.put("ClassExtendsClass__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassExtendsClass__CO_production", "ClassExtendsClass__CO");
		classes.put("ClassExtendsClass_eTypeAccess_elementType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassExtendsClass_eTypeAccess_elementType_incoming_SRC__FILTER_NAC_production", "ClassExtendsClass_eTypeAccess_elementType_incoming_SRC__FILTER_NAC");
		classes.put("ClassExtendsClass_eTypeAccess_returnType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassExtendsClass_eTypeAccess_returnType_incoming_SRC__FILTER_NAC_production", "ClassExtendsClass_eTypeAccess_returnType_incoming_SRC__FILTER_NAC");
		classes.put("ClassExtendsClass_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassExtendsClass_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", "ClassExtendsClass_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC");
		classes.put("ClassExtendsClass_eTypeAccess_type_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassExtendsClass_eTypeAccess_type_incoming_SRC__FILTER_NAC_production", "ClassExtendsClass_eTypeAccess_type_incoming_SRC__FILTER_NAC");
		classes.put("ClassExtendsClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassExtendsClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", "ClassExtendsClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC");
		classes.put("ClassImplementsInterface__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassImplementsInterface__CO_production", "ClassImplementsInterface__CO");
		classes.put("ClassImplementsInterface_eTypeAccess_elementType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassImplementsInterface_eTypeAccess_elementType_incoming_SRC__FILTER_NAC_production", "ClassImplementsInterface_eTypeAccess_elementType_incoming_SRC__FILTER_NAC");
		classes.put("ClassImplementsInterface_eTypeAccess_returnType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassImplementsInterface_eTypeAccess_returnType_incoming_SRC__FILTER_NAC_production", "ClassImplementsInterface_eTypeAccess_returnType_incoming_SRC__FILTER_NAC");
		classes.put("ClassImplementsInterface_eTypeAccess_superClass_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassImplementsInterface_eTypeAccess_superClass_incoming_SRC__FILTER_NAC_production", "ClassImplementsInterface_eTypeAccess_superClass_incoming_SRC__FILTER_NAC");
		classes.put("ClassImplementsInterface_eTypeAccess_type_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassImplementsInterface_eTypeAccess_type_incoming_SRC__FILTER_NAC_production", "ClassImplementsInterface_eTypeAccess_type_incoming_SRC__FILTER_NAC");
		classes.put("ClassImplementsInterface_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassImplementsInterface_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", "ClassImplementsInterface_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC");
		classes.put("ClassInAnonymous__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInAnonymous__CO_production", "ClassInAnonymous__CO");
		classes.put("ClassInAnonymous_tNestedType_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInAnonymous_tNestedType_classes_incoming_TRG__FILTER_NAC_production", "ClassInAnonymous_tNestedType_classes_incoming_TRG__FILTER_NAC");
		classes.put("ClassInnerAnonClassMember__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInnerAnonClassMember__CO_production", "ClassInnerAnonClassMember__CO");
		classes.put("ClassInnerAnonClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInnerAnonClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_production", "ClassInnerAnonClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC");
		classes.put("ClassInnerAnonClassMember_tInnerPackage_pg_outgoing_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInnerAnonClassMember_tInnerPackage_pg_outgoing_TRG__FILTER_NAC_production", "ClassInnerAnonClassMember_tInnerPackage_pg_outgoing_TRG__FILTER_NAC");
		classes.put("ClassInnerAnonClassMember_tInnerPackage_typeGraph_outgoing_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInnerAnonClassMember_tInnerPackage_typeGraph_outgoing_TRG__FILTER_NAC_production", "ClassInnerAnonClassMember_tInnerPackage_typeGraph_outgoing_TRG__FILTER_NAC");
		classes.put("ClassInnerClassMember__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInnerClassMember__CO_production", "ClassInnerClassMember__CO");
		classes.put("ClassInnerClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInnerClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_production", "ClassInnerClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC");
		classes.put("ClassInnerClassMember_tInnerPackage_pg_outgoing_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInnerClassMember_tInnerPackage_pg_outgoing_TRG__FILTER_NAC_production", "ClassInnerClassMember_tInnerPackage_pg_outgoing_TRG__FILTER_NAC");
		classes.put("ClassInnerClassMember_tInnerPackage_typeGraph_outgoing_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInnerClassMember_tInnerPackage_typeGraph_outgoing_TRG__FILTER_NAC_production", "ClassInnerClassMember_tInnerPackage_typeGraph_outgoing_TRG__FILTER_NAC");
		classes.put("ClassInstanceCreation__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassInstanceCreation__CO_production", "ClassInstanceCreation__CO");
		classes.put("Class__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("Class__CO_production", "Class__CO");
		classes.put("Class_tType_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Class_tType_classes_incoming_TRG__FILTER_NAC_production", "Class_tType_classes_incoming_TRG__FILTER_NAC");
		classes.put("ConstructorDefinition__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ConstructorDefinition__CO_production", "ConstructorDefinition__CO");
		classes.put("ConstructorInvocation__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ConstructorInvocation__CO_production", "ConstructorInvocation__CO");
		classes.put("EnumInAnonymous__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("EnumInAnonymous__CO_production", "EnumInAnonymous__CO");
		classes.put("EnumInAnonymous_tNestedType_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("EnumInAnonymous_tNestedType_classes_incoming_TRG__FILTER_NAC_production", "EnumInAnonymous_tNestedType_classes_incoming_TRG__FILTER_NAC");
		classes.put("Enum__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("Enum__CO_production", "Enum__CO");
		classes.put("Enum_tType_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Enum_tType_classes_incoming_TRG__FILTER_NAC_production", "Enum_tType_classes_incoming_TRG__FILTER_NAC");
		classes.put("FieldAccessReadWrite__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldAccessReadWrite__CO_production", "FieldAccessReadWrite__CO");
		classes.put("FieldAccessReadWrite_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldAccessReadWrite_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_production", "FieldAccessReadWrite_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC");
		classes.put("FieldAccessRead__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldAccessRead__CO_production", "FieldAccessRead__CO");
		classes.put("FieldAccessRead_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldAccessRead_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_production", "FieldAccessRead_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC");
		classes.put("FieldAccessWrite__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldAccessWrite__CO_production", "FieldAccessWrite__CO");
		classes.put("FieldAccessWrite_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldAccessWrite_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_production", "FieldAccessWrite_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC");
		classes.put("FieldDefinition__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldDefinition__CO_production", "FieldDefinition__CO");
		classes.put("FieldName__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldName__CO_production", "FieldName__CO");
		classes.put("FieldSignature__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldSignature__CO_production", "FieldSignature__CO");
		classes.put("FieldType__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldType__CO_production", "FieldType__CO");
		classes.put("Flow__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("Flow__CO_production", "Flow__CO");
		classes.put("IncomingFlow__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("IncomingFlow__CO_production", "IncomingFlow__CO");
		classes.put("InterfaceExtendsInterface__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceExtendsInterface__CO_production", "InterfaceExtendsInterface__CO");
		classes.put("InterfaceExtendsInterface_eTypeAccess_elementType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceExtendsInterface_eTypeAccess_elementType_incoming_SRC__FILTER_NAC_production", "InterfaceExtendsInterface_eTypeAccess_elementType_incoming_SRC__FILTER_NAC");
		classes.put("InterfaceExtendsInterface_eTypeAccess_returnType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceExtendsInterface_eTypeAccess_returnType_incoming_SRC__FILTER_NAC_production", "InterfaceExtendsInterface_eTypeAccess_returnType_incoming_SRC__FILTER_NAC");
		classes.put("InterfaceExtendsInterface_eTypeAccess_superClass_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceExtendsInterface_eTypeAccess_superClass_incoming_SRC__FILTER_NAC_production", "InterfaceExtendsInterface_eTypeAccess_superClass_incoming_SRC__FILTER_NAC");
		classes.put("InterfaceExtendsInterface_eTypeAccess_type_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceExtendsInterface_eTypeAccess_type_incoming_SRC__FILTER_NAC_production", "InterfaceExtendsInterface_eTypeAccess_type_incoming_SRC__FILTER_NAC");
		classes.put("InterfaceExtendsInterface_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceExtendsInterface_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", "InterfaceExtendsInterface_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC");
		classes.put("InterfaceInAnonymous__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceInAnonymous__CO_production", "InterfaceInAnonymous__CO");
		classes.put("InterfaceInAnonymous_tNestedType_interfaces_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceInAnonymous_tNestedType_interfaces_incoming_TRG__FILTER_NAC_production", "InterfaceInAnonymous_tNestedType_interfaces_incoming_TRG__FILTER_NAC");
		classes.put("InterfaceMember__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceMember__CO_production", "InterfaceMember__CO");
		classes.put("InterfaceMember_tModifier_tModifier_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceMember_tModifier_tModifier_incoming_TRG__FILTER_NAC_production", "InterfaceMember_tModifier_tModifier_incoming_TRG__FILTER_NAC");
		classes.put("Interface__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("Interface__CO_production", "Interface__CO");
		classes.put("Interface_tType_interfaces_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Interface_tType_interfaces_incoming_TRG__FILTER_NAC_production", "Interface_tType_interfaces_incoming_TRG__FILTER_NAC");
		classes.put("LinkDefinitionToAnonymous__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkDefinitionToAnonymous__CO_production", "LinkDefinitionToAnonymous__CO");
		classes.put("LinkDefinitionToType__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkDefinitionToType__CO_production", "LinkDefinitionToType__CO");
		classes.put("MemberInAnnotationVisibility__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MemberInAnnotationVisibility__CO_production", "MemberInAnnotationVisibility__CO");
		classes.put("MemberInAnnotationVisibility_tModifier_tModifier_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MemberInAnnotationVisibility_tModifier_tModifier_incoming_TRG__FILTER_NAC_production", "MemberInAnnotationVisibility_tModifier_tModifier_incoming_TRG__FILTER_NAC");
		classes.put("MemberInClassVisibility__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MemberInClassVisibility__CO_production", "MemberInClassVisibility__CO");
		classes.put("MemberInClassVisibility_tModifier_tModifier_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MemberInClassVisibility_tModifier_tModifier_incoming_TRG__FILTER_NAC_production", "MemberInClassVisibility_tModifier_tModifier_incoming_TRG__FILTER_NAC");
		classes.put("MemberInEnumVisibility__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MemberInEnumVisibility__CO_production", "MemberInEnumVisibility__CO");
		classes.put("MemberInEnumVisibility_tModifier_tModifier_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MemberInEnumVisibility_tModifier_tModifier_incoming_TRG__FILTER_NAC_production", "MemberInEnumVisibility_tModifier_tModifier_incoming_TRG__FILTER_NAC");
		classes.put("MethodDefinition__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodDefinition__CO_production", "MethodDefinition__CO");
		classes.put("MethodInvocationRecursive__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodInvocationRecursive__CO_production", "MethodInvocationRecursive__CO");
		classes.put("MethodInvocationStaticType__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodInvocationStaticType__CO_production", "MethodInvocationStaticType__CO");
		classes.put("MethodInvocation__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodInvocation__CO_production", "MethodInvocation__CO");
		classes.put("MethodName__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodName__CO_production", "MethodName__CO");
		classes.put("MethodOverriding__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodOverriding__CO_production", "MethodOverriding__CO");
		classes.put("MethodParameterLinkFirst__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodParameterLinkFirst__CO_production", "MethodParameterLinkFirst__CO");
		classes.put("MethodParameterLink__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodParameterLink__CO_production", "MethodParameterLink__CO");
		classes.put("MethodParameterType__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodParameterType__CO_production", "MethodParameterType__CO");
		classes.put("MethodParameter__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodParameter__CO_production", "MethodParameter__CO");
		classes.put("MethodParameter_mEntry_type_outgoing_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodParameter_mEntry_type_outgoing_SRC__FILTER_NAC_production", "MethodParameter_mEntry_type_outgoing_SRC__FILTER_NAC");
		classes.put("MethodParameter_tParameter_type_outgoing_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodParameter_tParameter_type_outgoing_TRG__FILTER_NAC_production", "MethodParameter_tParameter_type_outgoing_TRG__FILTER_NAC");
		classes.put("MethodSignature__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodSignature__CO_production", "MethodSignature__CO");
		classes.put("ModelToPg__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ModelToPg__CO_production", "ModelToPg__CO");
		classes.put("NestedClassInType__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("NestedClassInType__CO_production", "NestedClassInType__CO");
		classes.put("NestedClassInType_tNestedPackage_pg_outgoing_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NestedClassInType_tNestedPackage_pg_outgoing_TRG__FILTER_NAC_production", "NestedClassInType_tNestedPackage_pg_outgoing_TRG__FILTER_NAC");
		classes.put("NestedClassInType_tNestedType_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NestedClassInType_tNestedType_classes_incoming_TRG__FILTER_NAC_production", "NestedClassInType_tNestedType_classes_incoming_TRG__FILTER_NAC");
		classes.put("NestedEnum__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("NestedEnum__CO_production", "NestedEnum__CO");
		classes.put("NestedEnum_tNestedPackage_pg_outgoing_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NestedEnum_tNestedPackage_pg_outgoing_TRG__FILTER_NAC_production", "NestedEnum_tNestedPackage_pg_outgoing_TRG__FILTER_NAC");
		classes.put("NestedEnum_tNestedType_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NestedEnum_tNestedType_classes_incoming_TRG__FILTER_NAC_production", "NestedEnum_tNestedType_classes_incoming_TRG__FILTER_NAC");
		classes.put("NestedInterfaceInType__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("NestedInterfaceInType__CO_production", "NestedInterfaceInType__CO");
		classes.put("NestedInterfaceInType_tNestedPackage_pg_outgoing_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NestedInterfaceInType_tNestedPackage_pg_outgoing_TRG__FILTER_NAC_production", "NestedInterfaceInType_tNestedPackage_pg_outgoing_TRG__FILTER_NAC");
		classes.put("NestedInterfaceInType_tNestedType_interfaces_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NestedInterfaceInType_tNestedType_interfaces_incoming_TRG__FILTER_NAC_production", "NestedInterfaceInType_tNestedType_interfaces_incoming_TRG__FILTER_NAC");
		classes.put("OutgoingFlow__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("OutgoingFlow__CO_production", "OutgoingFlow__CO");
		classes.put("PackageToPGPackage__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PackageToPGPackage__CO_production", "PackageToPGPackage__CO");
		classes.put("PackageToPGPackage_mPackage_package_outgoing_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PackageToPGPackage_mPackage_package_outgoing_SRC__FILTER_NAC_production", "PackageToPGPackage_mPackage_package_outgoing_SRC__FILTER_NAC");
		classes.put("PackageToPGPackage_tPackage_subpackage_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PackageToPGPackage_tPackage_subpackage_incoming_TRG__FILTER_NAC_production", "PackageToPGPackage_tPackage_subpackage_incoming_TRG__FILTER_NAC");
		classes.put("ParameterizedTypeToClass__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParameterizedTypeToClass__CO_production", "ParameterizedTypeToClass__CO");
		classes.put("ParameterizedTypeToClass_eTypeAccess_elementType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParameterizedTypeToClass_eTypeAccess_elementType_incoming_SRC__FILTER_NAC_production", "ParameterizedTypeToClass_eTypeAccess_elementType_incoming_SRC__FILTER_NAC");
		classes.put("ParameterizedTypeToClass_eTypeAccess_returnType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParameterizedTypeToClass_eTypeAccess_returnType_incoming_SRC__FILTER_NAC_production", "ParameterizedTypeToClass_eTypeAccess_returnType_incoming_SRC__FILTER_NAC");
		classes.put("ParameterizedTypeToClass_eTypeAccess_superClass_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParameterizedTypeToClass_eTypeAccess_superClass_incoming_SRC__FILTER_NAC_production", "ParameterizedTypeToClass_eTypeAccess_superClass_incoming_SRC__FILTER_NAC");
		classes.put("ParameterizedTypeToClass_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParameterizedTypeToClass_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", "ParameterizedTypeToClass_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC");
		classes.put("ParameterizedTypeToClass_eTypeAccess_type_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParameterizedTypeToClass_eTypeAccess_type_incoming_SRC__FILTER_NAC_production", "ParameterizedTypeToClass_eTypeAccess_type_incoming_SRC__FILTER_NAC");
		classes.put("ParameterizedTypeToClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParameterizedTypeToClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", "ParameterizedTypeToClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC");
		classes.put("PrimitiveTypeIsBoolean__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsBoolean__CO_production", "PrimitiveTypeIsBoolean__CO");
		classes.put("PrimitiveTypeIsBoolean_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsBoolean_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", "PrimitiveTypeIsBoolean_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC");
		classes.put("PrimitiveTypeIsByte__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsByte__CO_production", "PrimitiveTypeIsByte__CO");
		classes.put("PrimitiveTypeIsByte_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsByte_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", "PrimitiveTypeIsByte_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC");
		classes.put("PrimitiveTypeIsChar__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsChar__CO_production", "PrimitiveTypeIsChar__CO");
		classes.put("PrimitiveTypeIsChar_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsChar_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", "PrimitiveTypeIsChar_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC");
		classes.put("PrimitiveTypeIsDouble__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsDouble__CO_production", "PrimitiveTypeIsDouble__CO");
		classes.put("PrimitiveTypeIsDouble_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsDouble_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", "PrimitiveTypeIsDouble_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC");
		classes.put("PrimitiveTypeIsFloat__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsFloat__CO_production", "PrimitiveTypeIsFloat__CO");
		classes.put("PrimitiveTypeIsFloat_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsFloat_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", "PrimitiveTypeIsFloat_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC");
		classes.put("PrimitiveTypeIsInt__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsInt__CO_production", "PrimitiveTypeIsInt__CO");
		classes.put("PrimitiveTypeIsInt_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsInt_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", "PrimitiveTypeIsInt_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC");
		classes.put("PrimitiveTypeIsLong__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsLong__CO_production", "PrimitiveTypeIsLong__CO");
		classes.put("PrimitiveTypeIsLong_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsLong_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", "PrimitiveTypeIsLong_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC");
		classes.put("PrimitiveTypeIsShort__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsShort__CO_production", "PrimitiveTypeIsShort__CO");
		classes.put("PrimitiveTypeIsShort_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypeIsShort_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", "PrimitiveTypeIsShort_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC");
		classes.put("PrimitiveTypesIsVoid__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypesIsVoid__CO_production", "PrimitiveTypesIsVoid__CO");
		classes.put("PrimitiveTypesIsVoid_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveTypesIsVoid_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC_production", "PrimitiveTypesIsVoid_tPrimitiveClass_classes_incoming_TRG__FILTER_NAC");
		classes.put("ReturnType__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ReturnType__CO_production", "ReturnType__CO");
		classes.put("ReturnType_eTypeAccess_elementType_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ReturnType_eTypeAccess_elementType_incoming_SRC__FILTER_NAC_production", "ReturnType_eTypeAccess_elementType_incoming_SRC__FILTER_NAC");
		classes.put("ReturnType_eTypeAccess_superClass_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ReturnType_eTypeAccess_superClass_incoming_SRC__FILTER_NAC_production", "ReturnType_eTypeAccess_superClass_incoming_SRC__FILTER_NAC");
		classes.put("ReturnType_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ReturnType_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC_production", "ReturnType_eTypeAccess_superInterfaces_incoming_SRC__FILTER_NAC");
		classes.put("ReturnType_eTypeAccess_type_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ReturnType_eTypeAccess_type_incoming_SRC__FILTER_NAC_production", "ReturnType_eTypeAccess_type_incoming_SRC__FILTER_NAC");
		classes.put("ReturnType_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ReturnType_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_production", "ReturnType_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC");
		classes.put("SignatureReturnType__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("SignatureReturnType__CO_production", "SignatureReturnType__CO");
		classes.put("SubPackageToPGPackage__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("SubPackageToPGPackage__CO_production", "SubPackageToPGPackage__CO");
		classes.put("SubPackageToPGPackage_mPackage_ownedElements_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SubPackageToPGPackage_mPackage_ownedElements_incoming_SRC__FILTER_NAC_production", "SubPackageToPGPackage_mPackage_ownedElements_incoming_SRC__FILTER_NAC");
		classes.put("SubPackageToPGPackage_tSub_pg_outgoing_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SubPackageToPGPackage_tSub_pg_outgoing_TRG__FILTER_NAC_production", "SubPackageToPGPackage_tSub_pg_outgoing_TRG__FILTER_NAC");
		classes.put("SuperConstructorInvocation__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("SuperConstructorInvocation__CO_production", "SuperConstructorInvocation__CO");
		classes.put("SuperMethodInvocation__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("SuperMethodInvocation__CO_production", "SuperMethodInvocation__CO");
		classes.put("SyntethicMethod__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("SyntethicMethod__CO_production", "SyntethicMethod__CO");
		classes.put("SyntethicMethod_mSyntethic_syntheticMethodDefinitions_incoming_SRC__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SyntethicMethod_mSyntethic_syntheticMethodDefinitions_incoming_SRC__FILTER_NAC_production", "SyntethicMethod_mSyntethic_syntheticMethodDefinitions_incoming_SRC__FILTER_NAC");
		classes.put("SyntethicMethod_tSyntethic_syntethicMethods_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SyntethicMethod_tSyntethic_syntethicMethods_incoming_TRG__FILTER_NAC_production", "SyntethicMethod_tSyntethic_syntethicMethods_incoming_TRG__FILTER_NAC");
		classes.put("TextAnnotations__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("TextAnnotations__CO_production", "TextAnnotations__CO");
		classes.put("TypeParameter__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("TypeParameter__CO_production", "TypeParameter__CO");
		classes.put("TypeParameter_tClass_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("TypeParameter_tClass_classes_incoming_TRG__FILTER_NAC_production", "TypeParameter_tClass_classes_incoming_TRG__FILTER_NAC");
		classes.put("TypesOrphaned__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("TypesOrphaned__CO_production", "TypesOrphaned__CO");
		classes.put("TypesOrphaned_tType_classes_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("TypesOrphaned_tType_classes_incoming_TRG__FILTER_NAC_production", "TypesOrphaned_tType_classes_incoming_TRG__FILTER_NAC");
		classes.put("TypesVisibility__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("TypesVisibility__CO_production", "TypesVisibility__CO");
		classes.put("TypesVisibility_tModifier_tModifier_incoming_TRG__FILTER_NAC_production", GenericProductionActor.class);
		productionNodes2pattern.put("TypesVisibility_tModifier_tModifier_incoming_TRG__FILTER_NAC_production", "TypesVisibility_tModifier_tModifier_incoming_TRG__FILTER_NAC");
		classes.put("UnresolvedTypeDeclaration__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("UnresolvedTypeDeclaration__CO_production", "UnresolvedTypeDeclaration__CO");
		classes.put("VariableDeclarationFragment__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("VariableDeclarationFragment__CO_production", "VariableDeclarationFragment__CO");
		
	}
	
	public void createJunctionNodes() {
		classes.put("AnnotationMemberKey__CO_5_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberKey__CO_2_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberKey__CO_7_junction", AnnotationMemberKey__CO_7_junction.class);
		classes.put("AnnotationMemberKey__CO_3_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberKey__CO_1_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotationArray__CO_22_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotationArray__CO_19_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotationArray__CO_23_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotationArray__CO_24_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotationArray__CO_20_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotationArray__CO_18_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotationArray__CO_2675_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotationArray__CO_2676_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotation__CO_45_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotation__CO_49_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotation__CO_50_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotation__CO_46_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotation__CO_44_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotation__CO_2677_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueAnnotation__CO_2678_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueBooleanArray__CO_71_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueBooleanArray__CO_68_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueBooleanArray__CO_72_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueBooleanArray__CO_73_junction", AnnotationMemberValueBooleanArray__CO_73_junction.class);
		classes.put("AnnotationMemberValueBooleanArray__CO_69_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueBooleanArray__CO_67_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueBoolean__CO_88_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueBoolean__CO_92_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueBoolean__CO_93_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueBoolean__CO_89_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueBoolean__CO_87_junction", AnnotationMemberValueBoolean__CO_87_junction.class);
		classes.put("AnnotationMemberValueClassArray__CO_107_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_108_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_105_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_115_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_116_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_109_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_117_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_118_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_110_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_106_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_104_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_2679_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_2680_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_2681_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_2682_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_2683_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_2684_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray__CO_2685_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClassArray_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_153_junction", AnnotationMemberValueClassArray_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_153_junction.class);
		classes.put("AnnotationMemberValueClassArray__CO_2686_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_162_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_169_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_163_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_160_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_164_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_172_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_173_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_165_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_161_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_159_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_2687_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_2688_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_2689_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_2690_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_2691_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_2692_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClass__CO_2693_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueClass_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_205_junction", AnnotationMemberValueClass_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_205_junction.class);
		classes.put("AnnotationMemberValueClass__CO_2694_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationMemberValueNumberArray__CO_215_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueNumberArray__CO_212_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueNumberArray__CO_216_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueNumberArray__CO_217_junction", AnnotationMemberValueNumberArray__CO_217_junction.class);
		classes.put("AnnotationMemberValueNumberArray__CO_213_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueNumberArray__CO_211_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueNumber__CO_232_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueNumber__CO_236_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueNumber__CO_237_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueNumber__CO_233_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueNumber__CO_231_junction", AnnotationMemberValueNumber__CO_231_junction.class);
		classes.put("AnnotationMemberValueStringArray__CO_252_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueStringArray__CO_249_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueStringArray__CO_253_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueStringArray__CO_254_junction", AnnotationMemberValueStringArray__CO_254_junction.class);
		classes.put("AnnotationMemberValueStringArray__CO_250_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueStringArray__CO_248_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueString__CO_269_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueString__CO_273_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueString__CO_274_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueString__CO_270_junction", GenericJunctionActor.class);
		classes.put("AnnotationMemberValueString__CO_268_junction", AnnotationMemberValueString__CO_268_junction.class);
		classes.put("AnnotationOnBodyDeclaration__CO_289_junction", GenericJunctionActor.class);
		classes.put("AnnotationOnBodyDeclaration__CO_286_junction", GenericJunctionActor.class);
		classes.put("AnnotationOnBodyDeclaration__CO_291_junction", GenericJunctionActor.class);
		classes.put("AnnotationOnBodyDeclaration__CO_287_junction", GenericJunctionActor.class);
		classes.put("AnnotationOnBodyDeclaration__CO_285_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeAccess__CO_306_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeAccess__CO_303_junction", GenericJunctionActor.class);
		createJunctionNodes_1();
			}	
		
			private void createJunctionNodes_1() {
		classes.put("AnnotationTypeAccess__CO_307_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeAccess__CO_308_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeAccess__CO_304_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeAccess__CO_302_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeAccess__CO_2695_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationTypeAccess__CO_2696_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationTypeAccess__CO_2697_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationTypeAccess__CO_2698_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationTypeAccess__CO_2699_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationTypeAccess__CO_2700_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationTypeAccess_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_337_junction", AnnotationTypeAccess_mAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_337_junction.class);
		classes.put("AnnotationTypeAccess__CO_2701_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationTypeAccess__CO_2702_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationTypeInAnonymous__CO_346_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeInAnonymous__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("AnnotationTypeInAnonymous__CO_344_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeInAnonymous__CO_356_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeInAnonymous__CO_348_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeInAnonymous__CO_358_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeInAnonymous__CO_349_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeInAnonymous__CO_345_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeInAnonymous__CO_343_junction", AnnotationTypeInAnonymous__CO_343_junction.class);
		classes.put("AnnotationTypeNested__CO_380_junction", AnnotationTypeNested__CO_380_junction.class);
		classes.put("AnnotationTypeNested__CO_374_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeNested__CO_381_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeNested__CO_382_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeNested__CO_375_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeNested__CO_372_junction", GenericJunctionActor.class);
		classes.put("AnnotationTypeNested__CO_triangle_1_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("AnnotationTypeNested__CO_triangle_3_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("AnnotationTypeNested__CO_triangle_2_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("AnnotationTypeNested__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("AnnotationTypeNested__CO_371_junction", AnnotationTypeNested__CO_371_junction.class);
		classes.put("AnnotationTypeNested__CO_2703_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnnotationType__CO_414_junction", AnnotationType__CO_414_junction.class);
		classes.put("AnnotationType__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("AnnotationType__CO_412_junction", GenericJunctionActor.class);
		classes.put("AnnotationType__CO_424_junction", GenericJunctionActor.class);
		classes.put("AnnotationType__CO_416_junction", GenericJunctionActor.class);
		classes.put("AnnotationType__CO_426_junction", AnnotationType__CO_426_junction.class);
		classes.put("AnnotationType__CO_417_junction", GenericJunctionActor.class);
		classes.put("AnnotationType__CO_413_junction", GenericJunctionActor.class);
		classes.put("AnnotationType__CO_411_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_443_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_440_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_444_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_453_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_445_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_441_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_439_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_2704_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_2705_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_2706_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_2707_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_2708_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_2709_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeClass_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC_477_junction", AnonymousClassTypeClass_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC_477_junction.class);
		classes.put("AnonymousClassTypeClass__CO_2710_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeClass__CO_2711_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_487_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_484_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_488_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_497_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_489_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_485_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_483_junction", GenericJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_2712_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_2713_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_2714_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_2715_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_2716_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_2717_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeInterface_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC_521_junction", AnonymousClassTypeInterface_mType_usagesInTypeAccess_incoming_SRC__FILTER_NAC_521_junction.class);
		classes.put("AnonymousClassTypeInterface__CO_2718_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClassTypeInterface__CO_2719_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClass__CO_530_junction", GenericJunctionActor.class);
		classes.put("AnonymousClass__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("AnonymousClass__CO_528_junction", GenericJunctionActor.class);
		classes.put("AnonymousClass__CO_540_junction", GenericJunctionActor.class);
		classes.put("AnonymousClass__CO_532_junction", GenericJunctionActor.class);
		classes.put("AnonymousClass__CO_541_junction", AnonymousClass__CO_541_junction.class);
		classes.put("AnonymousClass__CO_542_junction", GenericJunctionActor.class);
		classes.put("AnonymousClass__CO_533_junction", GenericJunctionActor.class);
		classes.put("AnonymousClass__CO_529_junction", GenericJunctionActor.class);
		classes.put("AnonymousClass__CO_527_junction", GenericJunctionActor.class);
		classes.put("AnonymousClass__CO_2720_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClass__CO_2721_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClass__CO_2722_nacjunction", GenericNACJunctionActor.class);
		classes.put("AnonymousClass__CO_2723_nacjunction", GenericNACJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_574_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_571_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_582_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_575_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_583_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_584_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_576_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_572_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_570_junction", GenericJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_2724_nacjunction", GenericNACJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_2725_nacjunction", GenericNACJunctionActor.class);
		createJunctionNodes_2();
			}	
		
			private void createJunctionNodes_2() {
		classes.put("ArrayTypeToClass__CO_2726_nacjunction", GenericNACJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_2727_nacjunction", GenericNACJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_2728_nacjunction", GenericNACJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_2729_nacjunction", GenericNACJunctionActor.class);
		classes.put("ArrayTypeToClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_610_junction", ArrayTypeToClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_610_junction.class);
		classes.put("ArrayTypeToClass__CO_2730_nacjunction", GenericNACJunctionActor.class);
		classes.put("ArrayTypeToClass__CO_2731_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassExtendsClass__CO_620_junction", GenericJunctionActor.class);
		classes.put("ClassExtendsClass__CO_617_junction", GenericJunctionActor.class);
		classes.put("ClassExtendsClass__CO_621_junction", GenericJunctionActor.class);
		classes.put("ClassExtendsClass__CO_622_junction", ClassExtendsClass__CO_622_junction.class);
		classes.put("ClassExtendsClass__CO_618_junction", GenericJunctionActor.class);
		classes.put("ClassExtendsClass__CO_616_junction", ClassExtendsClass__CO_616_junction.class);
		classes.put("ClassExtendsClass__CO_2732_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassExtendsClass__CO_2733_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassExtendsClass__CO_2734_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassExtendsClass__CO_2735_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassExtendsClass__CO_2736_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassExtendsClass__CO_2737_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassExtendsClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_648_junction", ClassExtendsClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_648_junction.class);
		classes.put("ClassExtendsClass__CO_2738_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassExtendsClass__CO_2739_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassImplementsInterface__CO_658_junction", GenericJunctionActor.class);
		classes.put("ClassImplementsInterface__CO_655_junction", GenericJunctionActor.class);
		classes.put("ClassImplementsInterface__CO_659_junction", GenericJunctionActor.class);
		classes.put("ClassImplementsInterface__CO_660_junction", ClassImplementsInterface__CO_660_junction.class);
		classes.put("ClassImplementsInterface__CO_656_junction", GenericJunctionActor.class);
		classes.put("ClassImplementsInterface__CO_654_junction", GenericJunctionActor.class);
		classes.put("ClassImplementsInterface__CO_2740_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassImplementsInterface__CO_2741_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassImplementsInterface__CO_2742_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassImplementsInterface__CO_2743_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassImplementsInterface__CO_2744_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassImplementsInterface__CO_2745_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassImplementsInterface_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_686_junction", ClassImplementsInterface_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_686_junction.class);
		classes.put("ClassImplementsInterface__CO_2746_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassImplementsInterface__CO_2747_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassInAnonymous__CO_695_junction", GenericJunctionActor.class);
		classes.put("ClassInAnonymous__CO_702_junction", GenericJunctionActor.class);
		classes.put("ClassInAnonymous__CO_696_junction", GenericJunctionActor.class);
		classes.put("ClassInAnonymous__CO_693_junction", ClassInAnonymous__CO_693_junction.class);
		classes.put("ClassInAnonymous__CO_703_junction", GenericJunctionActor.class);
		classes.put("ClassInAnonymous__CO_704_junction", GenericJunctionActor.class);
		classes.put("ClassInAnonymous__CO_697_junction", GenericJunctionActor.class);
		classes.put("ClassInAnonymous__CO_triangle_1_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("ClassInAnonymous__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("ClassInAnonymous__CO_694_junction", ClassInAnonymous__CO_694_junction.class);
		classes.put("ClassInAnonymous__CO_692_junction", GenericJunctionActor.class);
		classes.put("ClassInAnonymous__CO_2748_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassInAnonymous__CO_2749_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_737_junction", ClassInnerAnonClassMember__CO_737_junction.class);
		classes.put("ClassInnerAnonClassMember__CO_732_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_738_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_739_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_733_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_730_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_740_junction", ClassInnerAnonClassMember__CO_740_junction.class);
		classes.put("ClassInnerAnonClassMember__CO_741_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_734_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_742_junction", ClassInnerAnonClassMember__CO_742_junction.class);
		classes.put("ClassInnerAnonClassMember__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_735_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_731_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_729_junction", GenericJunctionActor.class);
		classes.put("ClassInnerAnonClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_770_junction", ClassInnerAnonClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_770_junction.class);
		classes.put("ClassInnerAnonClassMember__CO_2750_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_2751_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_2752_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassInnerAnonClassMember__CO_2753_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_790_junction", ClassInnerClassMember__CO_790_junction.class);
		classes.put("ClassInnerClassMember__CO_785_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_791_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_792_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_786_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_783_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_793_junction", ClassInnerClassMember__CO_793_junction.class);
		classes.put("ClassInnerClassMember__CO_794_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_787_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_795_junction", ClassInnerClassMember__CO_795_junction.class);
		classes.put("ClassInnerClassMember__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_788_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_784_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_782_junction", GenericJunctionActor.class);
		classes.put("ClassInnerClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_823_junction", ClassInnerClassMember_tInnerClass_classes_incoming_TRG__FILTER_NAC_823_junction.class);
		classes.put("ClassInnerClassMember__CO_2754_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_2755_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_2756_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassInnerClassMember__CO_2757_nacjunction", GenericNACJunctionActor.class);
		classes.put("ClassInstanceCreation__CO_838_junction", GenericJunctionActor.class);
		classes.put("ClassInstanceCreation__CO_839_junction", GenericJunctionActor.class);
		classes.put("ClassInstanceCreation__CO_836_junction", GenericJunctionActor.class);
		classes.put("ClassInstanceCreation__CO_846_junction", GenericJunctionActor.class);
		classes.put("ClassInstanceCreation__CO_847_junction", ClassInstanceCreation__CO_847_junction.class);
		classes.put("ClassInstanceCreation__CO_840_junction", GenericJunctionActor.class);
		classes.put("ClassInstanceCreation__CO_848_junction", GenericJunctionActor.class);
		classes.put("ClassInstanceCreation__CO_849_junction", ClassInstanceCreation__CO_849_junction.class);
		classes.put("ClassInstanceCreation__CO_841_junction", GenericJunctionActor.class);
		classes.put("ClassInstanceCreation__CO_837_junction", ClassInstanceCreation__CO_837_junction.class);
		classes.put("ClassInstanceCreation__CO_835_junction", GenericJunctionActor.class);
		classes.put("Class__CO_871_junction", Class__CO_871_junction.class);
		createJunctionNodes_3();
			}	
		
			private void createJunctionNodes_3() {
		classes.put("Class__CO_878_junction", GenericJunctionActor.class);
		classes.put("Class__CO_872_junction", GenericJunctionActor.class);
		classes.put("Class__CO_869_junction", GenericJunctionActor.class);
		classes.put("Class__CO_879_junction", Class__CO_879_junction.class);
		classes.put("Class__CO_880_junction", Class__CO_880_junction.class);
		classes.put("Class__CO_873_junction", GenericJunctionActor.class);
		classes.put("Class__CO_triangle_1_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("Class__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("Class__CO_870_junction", GenericJunctionActor.class);
		classes.put("Class__CO_868_junction", GenericJunctionActor.class);
		classes.put("Class_tType_classes_incoming_TRG__FILTER_NAC_902_junction", Class_tType_classes_incoming_TRG__FILTER_NAC_902_junction.class);
		classes.put("Class__CO_2758_nacjunction", GenericNACJunctionActor.class);
		classes.put("Class__CO_2759_nacjunction", GenericNACJunctionActor.class);
		classes.put("ConstructorDefinition__CO_911_junction", GenericJunctionActor.class);
		classes.put("ConstructorDefinition__CO_912_junction", GenericJunctionActor.class);
		classes.put("ConstructorDefinition__CO_909_junction", GenericJunctionActor.class);
		classes.put("ConstructorDefinition__CO_920_junction", GenericJunctionActor.class);
		classes.put("ConstructorDefinition__CO_913_junction", GenericJunctionActor.class);
		classes.put("ConstructorDefinition__CO_921_junction", GenericJunctionActor.class);
		classes.put("ConstructorDefinition__CO_922_junction", GenericJunctionActor.class);
		classes.put("ConstructorDefinition__CO_914_junction", GenericJunctionActor.class);
		classes.put("ConstructorDefinition__CO_910_junction", GenericJunctionActor.class);
		classes.put("ConstructorDefinition__CO_908_junction", GenericJunctionActor.class);
		classes.put("ConstructorInvocation__CO_941_junction", GenericJunctionActor.class);
		classes.put("ConstructorInvocation__CO_942_junction", GenericJunctionActor.class);
		classes.put("ConstructorInvocation__CO_939_junction", GenericJunctionActor.class);
		classes.put("ConstructorInvocation__CO_949_junction", GenericJunctionActor.class);
		classes.put("ConstructorInvocation__CO_950_junction", ConstructorInvocation__CO_950_junction.class);
		classes.put("ConstructorInvocation__CO_943_junction", GenericJunctionActor.class);
		classes.put("ConstructorInvocation__CO_951_junction", GenericJunctionActor.class);
		classes.put("ConstructorInvocation__CO_952_junction", ConstructorInvocation__CO_952_junction.class);
		classes.put("ConstructorInvocation__CO_944_junction", GenericJunctionActor.class);
		classes.put("ConstructorInvocation__CO_940_junction", ConstructorInvocation__CO_940_junction.class);
		classes.put("ConstructorInvocation__CO_938_junction", GenericJunctionActor.class);
		classes.put("EnumInAnonymous__CO_974_junction", GenericJunctionActor.class);
		classes.put("EnumInAnonymous__CO_981_junction", GenericJunctionActor.class);
		classes.put("EnumInAnonymous__CO_975_junction", GenericJunctionActor.class);
		classes.put("EnumInAnonymous__CO_972_junction", GenericJunctionActor.class);
		classes.put("EnumInAnonymous__CO_983_junction", GenericJunctionActor.class);
		classes.put("EnumInAnonymous__CO_976_junction", GenericJunctionActor.class);
		classes.put("EnumInAnonymous__CO_triangle_1_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("EnumInAnonymous__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("EnumInAnonymous__CO_973_junction", GenericJunctionActor.class);
		classes.put("EnumInAnonymous__CO_971_junction", EnumInAnonymous__CO_971_junction.class);
		classes.put("EnumInAnonymous__CO_2760_nacjunction", GenericNACJunctionActor.class);
		classes.put("EnumInAnonymous__CO_2761_nacjunction", GenericNACJunctionActor.class);
		classes.put("Enum__CO_1009_junction", Enum__CO_1009_junction.class);
		classes.put("Enum__CO_1016_junction", GenericJunctionActor.class);
		classes.put("Enum__CO_1010_junction", GenericJunctionActor.class);
		classes.put("Enum__CO_1007_junction", GenericJunctionActor.class);
		classes.put("Enum__CO_1018_junction", Enum__CO_1018_junction.class);
		classes.put("Enum__CO_1011_junction", GenericJunctionActor.class);
		classes.put("Enum__CO_triangle_1_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("Enum__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("Enum__CO_1008_junction", GenericJunctionActor.class);
		classes.put("Enum__CO_1006_junction", GenericJunctionActor.class);
		classes.put("Enum_tType_classes_incoming_TRG__FILTER_NAC_1038_junction", Enum_tType_classes_incoming_TRG__FILTER_NAC_1038_junction.class);
		classes.put("Enum__CO_2762_nacjunction", GenericNACJunctionActor.class);
		classes.put("Enum__CO_2763_nacjunction", GenericNACJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1051_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1052_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1047_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1053_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1054_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1048_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1045_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1055_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1056_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1049_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1057_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1074_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1058_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1050_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1046_junction", GenericJunctionActor.class);
		classes.put("FieldAccessReadWrite__CO_1044_junction", FieldAccessReadWrite__CO_1044_junction.class);
		classes.put("FieldAccessReadWrite_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_1091_junction", FieldAccessReadWrite_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_1091_junction.class);
		classes.put("FieldAccessReadWrite__CO_2764_nacjunction", GenericNACJunctionActor.class);
		classes.put("FieldAccessRead__CO_1104_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1105_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1100_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1106_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1107_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1101_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1098_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1108_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1109_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1102_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1110_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1127_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1111_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1103_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1099_junction", GenericJunctionActor.class);
		classes.put("FieldAccessRead__CO_1097_junction", FieldAccessRead__CO_1097_junction.class);
		classes.put("FieldAccessRead_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_1144_junction", FieldAccessRead_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_1144_junction.class);
		classes.put("FieldAccessRead__CO_2765_nacjunction", GenericNACJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1157_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1158_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1153_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1159_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1160_junction", GenericJunctionActor.class);
		createJunctionNodes_4();
			}	
		
			private void createJunctionNodes_4() {
		classes.put("FieldAccessWrite__CO_1154_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1151_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1161_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1162_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1155_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1163_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1180_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1164_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1156_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1152_junction", GenericJunctionActor.class);
		classes.put("FieldAccessWrite__CO_1150_junction", FieldAccessWrite__CO_1150_junction.class);
		classes.put("FieldAccessWrite_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_1197_junction", FieldAccessWrite_mAccess_mAbstractFieldAccess_incoming_SRC__FILTER_NAC_1197_junction.class);
		classes.put("FieldAccessWrite__CO_2766_nacjunction", GenericNACJunctionActor.class);
		classes.put("FieldDefinition__CO_1206_junction", GenericJunctionActor.class);
		classes.put("FieldDefinition__CO_1207_junction", GenericJunctionActor.class);
		classes.put("FieldDefinition__CO_1204_junction", GenericJunctionActor.class);
		classes.put("FieldDefinition__CO_1215_junction", GenericJunctionActor.class);
		classes.put("FieldDefinition__CO_1208_junction", GenericJunctionActor.class);
		classes.put("FieldDefinition__CO_1217_junction", GenericJunctionActor.class);
		classes.put("FieldDefinition__CO_1209_junction", GenericJunctionActor.class);
		classes.put("FieldDefinition__CO_1205_junction", GenericJunctionActor.class);
		classes.put("FieldDefinition__CO_1203_junction", GenericJunctionActor.class);
		classes.put("FieldName__CO_1234_junction", GenericJunctionActor.class);
		classes.put("FieldName__CO_1231_junction", GenericJunctionActor.class);
		classes.put("FieldName__CO_1236_junction", FieldName__CO_1236_junction.class);
		classes.put("FieldName__CO_1232_junction", GenericJunctionActor.class);
		classes.put("FieldName__CO_1230_junction", GenericJunctionActor.class);
		classes.put("FieldSignature__CO_1251_junction", GenericJunctionActor.class);
		classes.put("FieldSignature__CO_1248_junction", GenericJunctionActor.class);
		classes.put("FieldSignature__CO_1252_junction", GenericJunctionActor.class);
		classes.put("FieldSignature__CO_1261_junction", GenericJunctionActor.class);
		classes.put("FieldSignature__CO_1253_junction", GenericJunctionActor.class);
		classes.put("FieldSignature__CO_1249_junction", GenericJunctionActor.class);
		classes.put("FieldSignature__CO_1247_junction", GenericJunctionActor.class);
		classes.put("FieldType__CO_1273_junction", GenericJunctionActor.class);
		classes.put("FieldType__CO_1270_junction", GenericJunctionActor.class);
		classes.put("FieldType__CO_1275_junction", GenericJunctionActor.class);
		classes.put("FieldType__CO_1271_junction", GenericJunctionActor.class);
		classes.put("FieldType__CO_1269_junction", GenericJunctionActor.class);
		classes.put("Flow__CO_1290_junction", GenericJunctionActor.class);
		classes.put("Flow__CO_1287_junction", GenericJunctionActor.class);
		classes.put("Flow__CO_1292_junction", GenericJunctionActor.class);
		classes.put("Flow__CO_1288_junction", GenericJunctionActor.class);
		classes.put("Flow__CO_1286_junction", GenericJunctionActor.class);
		classes.put("IncomingFlow__CO_1307_junction", GenericJunctionActor.class);
		classes.put("IncomingFlow__CO_1304_junction", GenericJunctionActor.class);
		classes.put("IncomingFlow__CO_1309_junction", GenericJunctionActor.class);
		classes.put("IncomingFlow__CO_1305_junction", GenericJunctionActor.class);
		classes.put("IncomingFlow__CO_1303_junction", GenericJunctionActor.class);
		classes.put("InterfaceExtendsInterface__CO_1324_junction", GenericJunctionActor.class);
		classes.put("InterfaceExtendsInterface__CO_1321_junction", GenericJunctionActor.class);
		classes.put("InterfaceExtendsInterface__CO_1325_junction", GenericJunctionActor.class);
		classes.put("InterfaceExtendsInterface__CO_1326_junction", InterfaceExtendsInterface__CO_1326_junction.class);
		classes.put("InterfaceExtendsInterface__CO_1322_junction", GenericJunctionActor.class);
		classes.put("InterfaceExtendsInterface__CO_1320_junction", InterfaceExtendsInterface__CO_1320_junction.class);
		classes.put("InterfaceExtendsInterface__CO_2767_nacjunction", GenericNACJunctionActor.class);
		classes.put("InterfaceExtendsInterface__CO_2768_nacjunction", GenericNACJunctionActor.class);
		classes.put("InterfaceExtendsInterface__CO_2769_nacjunction", GenericNACJunctionActor.class);
		classes.put("InterfaceExtendsInterface__CO_2770_nacjunction", GenericNACJunctionActor.class);
		classes.put("InterfaceExtendsInterface__CO_2771_nacjunction", GenericNACJunctionActor.class);
		classes.put("InterfaceExtendsInterface__CO_2772_nacjunction", GenericNACJunctionActor.class);
		classes.put("InterfaceExtendsInterface_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_1352_junction", InterfaceExtendsInterface_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_1352_junction.class);
		classes.put("InterfaceExtendsInterface__CO_2773_nacjunction", GenericNACJunctionActor.class);
		classes.put("InterfaceExtendsInterface__CO_2774_nacjunction", GenericNACJunctionActor.class);
		classes.put("InterfaceInAnonymous__CO_1361_junction", GenericJunctionActor.class);
		classes.put("InterfaceInAnonymous__CO_1368_junction", GenericJunctionActor.class);
		classes.put("InterfaceInAnonymous__CO_1362_junction", GenericJunctionActor.class);
		classes.put("InterfaceInAnonymous__CO_1359_junction", InterfaceInAnonymous__CO_1359_junction.class);
		classes.put("InterfaceInAnonymous__CO_1369_junction", GenericJunctionActor.class);
		classes.put("InterfaceInAnonymous__CO_1370_junction", GenericJunctionActor.class);
		classes.put("InterfaceInAnonymous__CO_1363_junction", GenericJunctionActor.class);
		classes.put("InterfaceInAnonymous__CO_triangle_1_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("InterfaceInAnonymous__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("InterfaceInAnonymous__CO_1360_junction", InterfaceInAnonymous__CO_1360_junction.class);
		classes.put("InterfaceInAnonymous__CO_1358_junction", GenericJunctionActor.class);
		classes.put("InterfaceInAnonymous__CO_2775_nacjunction", GenericNACJunctionActor.class);
		classes.put("InterfaceInAnonymous__CO_2776_nacjunction", GenericNACJunctionActor.class);
		classes.put("InterfaceMember__CO_1398_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__CO_1399_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__CO_1396_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__CO_1400_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__CO_1408_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__CO_1409_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__CO_1401_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__CO_1397_junction", GenericJunctionActor.class);
		classes.put("InterfaceMember__CO_1395_junction", InterfaceMember__CO_1395_junction.class);
		classes.put("InterfaceMember__CO_2777_nacjunction", GenericNACJunctionActor.class);
		classes.put("Interface__CO_1429_junction", Interface__CO_1429_junction.class);
		classes.put("Interface__CO_1436_junction", GenericJunctionActor.class);
		classes.put("Interface__CO_1430_junction", GenericJunctionActor.class);
		classes.put("Interface__CO_1427_junction", GenericJunctionActor.class);
		classes.put("Interface__CO_1437_junction", Interface__CO_1437_junction.class);
		classes.put("Interface__CO_1438_junction", Interface__CO_1438_junction.class);
		classes.put("Interface__CO_1431_junction", GenericJunctionActor.class);
		classes.put("Interface__CO_triangle_1_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("Interface__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("Interface__CO_1428_junction", GenericJunctionActor.class);
		classes.put("Interface__CO_1426_junction", GenericJunctionActor.class);
		classes.put("Interface_tType_interfaces_incoming_TRG__FILTER_NAC_1460_junction", Interface_tType_interfaces_incoming_TRG__FILTER_NAC_1460_junction.class);
		classes.put("Interface__CO_2778_nacjunction", GenericNACJunctionActor.class);
		createJunctionNodes_5();
			}	
		
			private void createJunctionNodes_5() {
		classes.put("Interface__CO_2779_nacjunction", GenericNACJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__CO_1469_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__CO_1467_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__CO_1479_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__CO_1471_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__CO_1481_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__CO_1472_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__CO_1468_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToAnonymous__CO_1466_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__CO_1498_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("LinkDefinitionToType__CO_1496_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__CO_1508_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__CO_1500_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__CO_1510_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__CO_1501_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__CO_1497_junction", GenericJunctionActor.class);
		classes.put("LinkDefinitionToType__CO_1495_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__CO_1527_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__CO_1528_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__CO_1525_junction", MemberInAnnotationVisibility__CO_1525_junction.class);
		classes.put("MemberInAnnotationVisibility__CO_1529_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__CO_1537_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__CO_1538_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__CO_1530_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__CO_1526_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__CO_1524_junction", GenericJunctionActor.class);
		classes.put("MemberInAnnotationVisibility__CO_2780_nacjunction", GenericNACJunctionActor.class);
		classes.put("MemberInClassVisibility__CO_1558_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__CO_1559_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__CO_1556_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__CO_1560_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__CO_1568_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__CO_1569_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__CO_1561_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__CO_1557_junction", GenericJunctionActor.class);
		classes.put("MemberInClassVisibility__CO_1555_junction", MemberInClassVisibility__CO_1555_junction.class);
		classes.put("MemberInClassVisibility__CO_2781_nacjunction", GenericNACJunctionActor.class);
		classes.put("MemberInEnumVisibility__CO_1589_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__CO_1590_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__CO_1587_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__CO_1591_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__CO_1599_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__CO_1600_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__CO_1592_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__CO_1588_junction", GenericJunctionActor.class);
		classes.put("MemberInEnumVisibility__CO_1586_junction", MemberInEnumVisibility__CO_1586_junction.class);
		classes.put("MemberInEnumVisibility__CO_2782_nacjunction", GenericNACJunctionActor.class);
		classes.put("MethodDefinition__CO_1620_junction", GenericJunctionActor.class);
		classes.put("MethodDefinition__CO_1621_junction", GenericJunctionActor.class);
		classes.put("MethodDefinition__CO_1618_junction", GenericJunctionActor.class);
		classes.put("MethodDefinition__CO_1622_junction", GenericJunctionActor.class);
		classes.put("MethodDefinition__CO_1630_junction", GenericJunctionActor.class);
		classes.put("MethodDefinition__CO_1631_junction", GenericJunctionActor.class);
		classes.put("MethodDefinition__CO_1623_junction", GenericJunctionActor.class);
		classes.put("MethodDefinition__CO_1619_junction", GenericJunctionActor.class);
		classes.put("MethodDefinition__CO_1617_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationRecursive__CO_1647_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationRecursive__CO_1648_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationRecursive__CO_1645_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationRecursive__CO_1649_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationRecursive__CO_1657_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationRecursive__CO_1658_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationRecursive__CO_1650_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationRecursive__CO_1646_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationRecursive__CO_1644_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationStaticType__CO_1674_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationStaticType__CO_1671_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationStaticType__CO_1676_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationStaticType__CO_1672_junction", GenericJunctionActor.class);
		classes.put("MethodInvocationStaticType__CO_1670_junction", GenericJunctionActor.class);
		classes.put("MethodInvocation__CO_1690_junction", GenericJunctionActor.class);
		classes.put("MethodInvocation__CO_1691_junction", GenericJunctionActor.class);
		classes.put("MethodInvocation__CO_1688_junction", GenericJunctionActor.class);
		classes.put("MethodInvocation__CO_1698_junction", GenericJunctionActor.class);
		classes.put("MethodInvocation__CO_1699_junction", MethodInvocation__CO_1699_junction.class);
		classes.put("MethodInvocation__CO_1692_junction", GenericJunctionActor.class);
		classes.put("MethodInvocation__CO_1700_junction", GenericJunctionActor.class);
		classes.put("MethodInvocation__CO_1701_junction", MethodInvocation__CO_1701_junction.class);
		classes.put("MethodInvocation__CO_1693_junction", GenericJunctionActor.class);
		classes.put("MethodInvocation__CO_1689_junction", MethodInvocation__CO_1689_junction.class);
		classes.put("MethodInvocation__CO_1687_junction", GenericJunctionActor.class);
		classes.put("MethodName__CO_1721_junction", GenericJunctionActor.class);
		classes.put("MethodName__CO_1725_junction", GenericJunctionActor.class);
		classes.put("MethodName__CO_1726_junction", GenericJunctionActor.class);
		classes.put("MethodName__CO_1722_junction", GenericJunctionActor.class);
		classes.put("MethodName__CO_1720_junction", MethodName__CO_1720_junction.class);
		classes.put("MethodOverriding__CO_1741_junction", GenericJunctionActor.class);
		classes.put("MethodOverriding__CO_1738_junction", GenericJunctionActor.class);
		classes.put("MethodOverriding__CO_1743_junction", GenericJunctionActor.class);
		classes.put("MethodOverriding__CO_1739_junction", GenericJunctionActor.class);
		classes.put("MethodOverriding__CO_1737_junction", MethodOverriding__CO_1737_junction.class);
		classes.put("MethodParameterLinkFirst__CO_1758_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLinkFirst__CO_1755_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLinkFirst__CO_1760_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLinkFirst__CO_1756_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLinkFirst__CO_1754_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLink__CO_1775_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLink__CO_1772_junction", GenericJunctionActor.class);
		createJunctionNodes_6();
			}	
		
			private void createJunctionNodes_6() {
		classes.put("MethodParameterLink__CO_1777_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLink__CO_1773_junction", GenericJunctionActor.class);
		classes.put("MethodParameterLink__CO_1771_junction", MethodParameterLink__CO_1771_junction.class);
		classes.put("MethodParameterType__CO_1791_junction", GenericJunctionActor.class);
		classes.put("MethodParameterType__CO_1798_junction", GenericJunctionActor.class);
		classes.put("MethodParameterType__CO_1792_junction", GenericJunctionActor.class);
		classes.put("MethodParameterType__CO_1789_junction", GenericJunctionActor.class);
		classes.put("MethodParameterType__CO_1800_junction", GenericJunctionActor.class);
		classes.put("MethodParameterType__CO_1793_junction", GenericJunctionActor.class);
		classes.put("MethodParameterType__CO_1801_junction", GenericJunctionActor.class);
		classes.put("MethodParameterType__CO_1802_junction", GenericJunctionActor.class);
		classes.put("MethodParameterType__CO_1794_junction", GenericJunctionActor.class);
		classes.put("MethodParameterType__CO_1790_junction", GenericJunctionActor.class);
		classes.put("MethodParameterType__CO_1788_junction", GenericJunctionActor.class);
		classes.put("MethodParameter__CO_1825_junction", GenericJunctionActor.class);
		classes.put("MethodParameter__CO_1822_junction", GenericJunctionActor.class);
		classes.put("MethodParameter__CO_1826_junction", GenericJunctionActor.class);
		classes.put("MethodParameter__CO_1835_junction", GenericJunctionActor.class);
		classes.put("MethodParameter__CO_1827_junction", GenericJunctionActor.class);
		classes.put("MethodParameter__CO_1823_junction", GenericJunctionActor.class);
		classes.put("MethodParameter__CO_1821_junction", GenericJunctionActor.class);
		classes.put("MethodParameter__CO_2783_nacjunction", GenericNACJunctionActor.class);
		classes.put("MethodParameter__CO_2784_nacjunction", GenericNACJunctionActor.class);
		classes.put("MethodSignature__CO_1852_junction", GenericJunctionActor.class);
		classes.put("MethodSignature__CO_1853_junction", GenericJunctionActor.class);
		classes.put("MethodSignature__CO_1850_junction", GenericJunctionActor.class);
		classes.put("MethodSignature__CO_1854_junction", GenericJunctionActor.class);
		classes.put("MethodSignature__CO_1855_junction", GenericJunctionActor.class);
		classes.put("MethodSignature__CO_1851_junction", GenericJunctionActor.class);
		classes.put("MethodSignature__CO_1849_junction", GenericJunctionActor.class);
		classes.put("ModelToPg__CO_1871_junction", ModelToPg__CO_1871_junction.class);
		classes.put("NestedClassInType__CO_1885_junction", NestedClassInType__CO_1885_junction.class);
		classes.put("NestedClassInType__CO_1880_junction", GenericJunctionActor.class);
		classes.put("NestedClassInType__CO_1886_junction", GenericJunctionActor.class);
		classes.put("NestedClassInType__CO_1887_junction", GenericJunctionActor.class);
		classes.put("NestedClassInType__CO_1881_junction", GenericJunctionActor.class);
		classes.put("NestedClassInType__CO_1878_junction", GenericJunctionActor.class);
		classes.put("NestedClassInType__CO_1888_junction", GenericJunctionActor.class);
		classes.put("NestedClassInType__CO_triangle_1_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedClassInType__CO_1882_junction", GenericJunctionActor.class);
		classes.put("NestedClassInType__CO_triangle_3_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedClassInType__CO_triangle_2_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedClassInType__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedClassInType__CO_1879_junction", GenericJunctionActor.class);
		classes.put("NestedClassInType__CO_1877_junction", NestedClassInType__CO_1877_junction.class);
		classes.put("NestedClassInType__CO_2785_nacjunction", GenericNACJunctionActor.class);
		classes.put("NestedClassInType_tNestedType_classes_incoming_TRG__FILTER_NAC_1924_junction", NestedClassInType_tNestedType_classes_incoming_TRG__FILTER_NAC_1924_junction.class);
		classes.put("NestedClassInType__CO_2786_nacjunction", GenericNACJunctionActor.class);
		classes.put("NestedClassInType__CO_2787_nacjunction", GenericNACJunctionActor.class);
		classes.put("NestedEnum__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedEnum__CO_1940_junction", NestedEnum__CO_1940_junction.class);
		classes.put("NestedEnum__CO_1941_junction", GenericJunctionActor.class);
		classes.put("NestedEnum__CO_1934_junction", GenericJunctionActor.class);
		classes.put("NestedEnum__CO_1931_junction", GenericJunctionActor.class);
		classes.put("NestedEnum__CO_1942_junction", GenericJunctionActor.class);
		classes.put("NestedEnum__CO_1943_junction", GenericJunctionActor.class);
		classes.put("NestedEnum__CO_1935_junction", GenericJunctionActor.class);
		classes.put("NestedEnum__CO_triangle_3_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedEnum__CO_triangle_2_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedEnum__CO_triangle_1_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedEnum__CO_1932_junction", NestedEnum__CO_1932_junction.class);
		classes.put("NestedEnum__CO_1930_junction", GenericJunctionActor.class);
		classes.put("NestedEnum__CO_2788_nacjunction", GenericNACJunctionActor.class);
		classes.put("NestedEnum_tNestedType_classes_incoming_TRG__FILTER_NAC_1975_junction", NestedEnum_tNestedType_classes_incoming_TRG__FILTER_NAC_1975_junction.class);
		classes.put("NestedEnum__CO_2789_nacjunction", GenericNACJunctionActor.class);
		classes.put("NestedEnum__CO_2790_nacjunction", GenericNACJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_1989_junction", NestedInterfaceInType__CO_1989_junction.class);
		classes.put("NestedInterfaceInType__CO_1984_junction", GenericJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_1990_junction", GenericJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_1991_junction", GenericJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_1985_junction", GenericJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_1982_junction", GenericJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_1992_junction", GenericJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_triangle_1_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_1986_junction", GenericJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_triangle_3_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_triangle_2_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_1983_junction", GenericJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_1981_junction", NestedInterfaceInType__CO_1981_junction.class);
		classes.put("NestedInterfaceInType__CO_2791_nacjunction", GenericNACJunctionActor.class);
		classes.put("NestedInterfaceInType_tNestedType_interfaces_incoming_TRG__FILTER_NAC_2028_junction", NestedInterfaceInType_tNestedType_interfaces_incoming_TRG__FILTER_NAC_2028_junction.class);
		classes.put("NestedInterfaceInType__CO_2792_nacjunction", GenericNACJunctionActor.class);
		classes.put("NestedInterfaceInType__CO_2793_nacjunction", GenericNACJunctionActor.class);
		classes.put("OutgoingFlow__CO_2038_junction", GenericJunctionActor.class);
		classes.put("OutgoingFlow__CO_2035_junction", GenericJunctionActor.class);
		classes.put("OutgoingFlow__CO_2040_junction", GenericJunctionActor.class);
		classes.put("OutgoingFlow__CO_2036_junction", GenericJunctionActor.class);
		classes.put("OutgoingFlow__CO_2034_junction", GenericJunctionActor.class);
		classes.put("PackageToPGPackage__CO_2055_junction", GenericJunctionActor.class);
		classes.put("PackageToPGPackage__CO_2052_junction", GenericJunctionActor.class);
		classes.put("PackageToPGPackage__CO_2056_junction", GenericJunctionActor.class);
		classes.put("PackageToPGPackage__CO_2057_junction", GenericJunctionActor.class);
		classes.put("PackageToPGPackage__CO_2053_junction", PackageToPGPackage__CO_2053_junction.class);
		classes.put("PackageToPGPackage__CO_2051_junction", GenericJunctionActor.class);
		classes.put("PackageToPGPackage__CO_2794_nacjunction", GenericNACJunctionActor.class);
		classes.put("PackageToPGPackage__CO_2795_nacjunction", GenericNACJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2079_junction", GenericJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2080_junction", GenericJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2077_junction", GenericJunctionActor.class);
		createJunctionNodes_7();
			}	
		
			private void createJunctionNodes_7() {
		classes.put("ParameterizedTypeToClass__CO_2081_junction", GenericJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2089_junction", GenericJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2090_junction", GenericJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2082_junction", GenericJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2078_junction", GenericJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2076_junction", GenericJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2796_nacjunction", GenericNACJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2797_nacjunction", GenericNACJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2798_nacjunction", GenericNACJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2799_nacjunction", GenericNACJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2800_nacjunction", GenericNACJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2801_nacjunction", GenericNACJunctionActor.class);
		classes.put("ParameterizedTypeToClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_2119_junction", ParameterizedTypeToClass_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_2119_junction.class);
		classes.put("ParameterizedTypeToClass__CO_2802_nacjunction", GenericNACJunctionActor.class);
		classes.put("ParameterizedTypeToClass__CO_2803_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsBoolean__CO_2128_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsBoolean__CO_2129_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsBoolean__CO_2126_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsBoolean__CO_2130_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsBoolean__CO_2139_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsBoolean__CO_2131_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsBoolean__CO_2127_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsBoolean__CO_2125_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsBoolean__CO_2804_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsBoolean__CO_2805_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsByte__CO_2155_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsByte__CO_2156_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsByte__CO_2153_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsByte__CO_2157_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsByte__CO_2166_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsByte__CO_2158_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsByte__CO_2154_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsByte__CO_2152_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsByte__CO_2806_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsByte__CO_2807_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsChar__CO_2182_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsChar__CO_2183_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsChar__CO_2180_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsChar__CO_2184_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsChar__CO_2193_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsChar__CO_2185_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsChar__CO_2181_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsChar__CO_2179_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsChar__CO_2808_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsChar__CO_2809_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsDouble__CO_2209_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsDouble__CO_2210_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsDouble__CO_2207_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsDouble__CO_2211_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsDouble__CO_2220_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsDouble__CO_2212_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsDouble__CO_2208_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsDouble__CO_2206_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsDouble__CO_2810_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsDouble__CO_2811_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsFloat__CO_2236_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsFloat__CO_2237_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsFloat__CO_2234_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsFloat__CO_2238_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsFloat__CO_2247_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsFloat__CO_2239_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsFloat__CO_2235_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsFloat__CO_2233_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsFloat__CO_2812_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsFloat__CO_2813_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsInt__CO_2263_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsInt__CO_2264_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsInt__CO_2261_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsInt__CO_2265_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsInt__CO_2274_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsInt__CO_2266_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsInt__CO_2262_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsInt__CO_2260_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsInt__CO_2814_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsInt__CO_2815_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsLong__CO_2290_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsLong__CO_2291_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsLong__CO_2288_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsLong__CO_2292_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsLong__CO_2301_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsLong__CO_2293_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsLong__CO_2289_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsLong__CO_2287_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsLong__CO_2816_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsLong__CO_2817_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsShort__CO_2317_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsShort__CO_2318_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsShort__CO_2315_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsShort__CO_2319_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsShort__CO_2328_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsShort__CO_2320_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsShort__CO_2316_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsShort__CO_2314_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypeIsShort__CO_2818_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypeIsShort__CO_2819_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypesIsVoid__CO_2344_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypesIsVoid__CO_2345_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypesIsVoid__CO_2342_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypesIsVoid__CO_2346_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypesIsVoid__CO_2355_junction", GenericJunctionActor.class);
		createJunctionNodes_8();
			}	
		
			private void createJunctionNodes_8() {
		classes.put("PrimitiveTypesIsVoid__CO_2347_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypesIsVoid__CO_2343_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypesIsVoid__CO_2341_junction", GenericJunctionActor.class);
		classes.put("PrimitiveTypesIsVoid__CO_2820_nacjunction", GenericNACJunctionActor.class);
		classes.put("PrimitiveTypesIsVoid__CO_2821_nacjunction", GenericNACJunctionActor.class);
		classes.put("ReturnType__CO_2372_junction", GenericJunctionActor.class);
		classes.put("ReturnType__CO_2369_junction", GenericJunctionActor.class);
		classes.put("ReturnType__CO_2373_junction", GenericJunctionActor.class);
		classes.put("ReturnType__CO_2374_junction", GenericJunctionActor.class);
		classes.put("ReturnType__CO_2370_junction", GenericJunctionActor.class);
		classes.put("ReturnType__CO_2368_junction", GenericJunctionActor.class);
		classes.put("ReturnType__CO_2822_nacjunction", GenericNACJunctionActor.class);
		classes.put("ReturnType__CO_2823_nacjunction", GenericNACJunctionActor.class);
		classes.put("ReturnType__CO_2824_nacjunction", GenericNACJunctionActor.class);
		classes.put("ReturnType__CO_2825_nacjunction", GenericNACJunctionActor.class);
		classes.put("ReturnType__CO_2826_nacjunction", GenericNACJunctionActor.class);
		classes.put("ReturnType__CO_2827_nacjunction", GenericNACJunctionActor.class);
		classes.put("ReturnType_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_2400_junction", ReturnType_eTypeAccess_usagesInTypeAccess_incoming_SRC__FILTER_NAC_2400_junction.class);
		classes.put("ReturnType__CO_2828_nacjunction", GenericNACJunctionActor.class);
		classes.put("ReturnType__CO_2829_nacjunction", GenericNACJunctionActor.class);
		classes.put("SignatureReturnType__CO_2410_junction", GenericJunctionActor.class);
		classes.put("SignatureReturnType__CO_2407_junction", GenericJunctionActor.class);
		classes.put("SignatureReturnType__CO_2412_junction", GenericJunctionActor.class);
		classes.put("SignatureReturnType__CO_2408_junction", GenericJunctionActor.class);
		classes.put("SignatureReturnType__CO_2406_junction", GenericJunctionActor.class);
		classes.put("SubPackageToPGPackage__CO_2427_junction", GenericJunctionActor.class);
		classes.put("SubPackageToPGPackage__CO_2424_junction", GenericJunctionActor.class);
		classes.put("SubPackageToPGPackage__CO_2428_junction", SubPackageToPGPackage__CO_2428_junction.class);
		classes.put("SubPackageToPGPackage__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("SubPackageToPGPackage__CO_2425_junction", GenericJunctionActor.class);
		classes.put("SubPackageToPGPackage__CO_2423_junction", GenericJunctionActor.class);
		classes.put("SubPackageToPGPackage__CO_2830_nacjunction", GenericNACJunctionActor.class);
		classes.put("SubPackageToPGPackage__CO_2831_nacjunction", GenericNACJunctionActor.class);
		classes.put("SuperConstructorInvocation__CO_2453_junction", GenericJunctionActor.class);
		classes.put("SuperConstructorInvocation__CO_2454_junction", GenericJunctionActor.class);
		classes.put("SuperConstructorInvocation__CO_2451_junction", GenericJunctionActor.class);
		classes.put("SuperConstructorInvocation__CO_2461_junction", GenericJunctionActor.class);
		classes.put("SuperConstructorInvocation__CO_2462_junction", SuperConstructorInvocation__CO_2462_junction.class);
		classes.put("SuperConstructorInvocation__CO_2455_junction", GenericJunctionActor.class);
		classes.put("SuperConstructorInvocation__CO_2463_junction", GenericJunctionActor.class);
		classes.put("SuperConstructorInvocation__CO_2464_junction", SuperConstructorInvocation__CO_2464_junction.class);
		classes.put("SuperConstructorInvocation__CO_2456_junction", GenericJunctionActor.class);
		classes.put("SuperConstructorInvocation__CO_2452_junction", SuperConstructorInvocation__CO_2452_junction.class);
		classes.put("SuperConstructorInvocation__CO_2450_junction", GenericJunctionActor.class);
		classes.put("SuperMethodInvocation__CO_2486_junction", GenericJunctionActor.class);
		classes.put("SuperMethodInvocation__CO_2487_junction", GenericJunctionActor.class);
		classes.put("SuperMethodInvocation__CO_2484_junction", GenericJunctionActor.class);
		classes.put("SuperMethodInvocation__CO_2494_junction", GenericJunctionActor.class);
		classes.put("SuperMethodInvocation__CO_2495_junction", SuperMethodInvocation__CO_2495_junction.class);
		classes.put("SuperMethodInvocation__CO_2488_junction", GenericJunctionActor.class);
		classes.put("SuperMethodInvocation__CO_2496_junction", GenericJunctionActor.class);
		classes.put("SuperMethodInvocation__CO_2497_junction", SuperMethodInvocation__CO_2497_junction.class);
		classes.put("SuperMethodInvocation__CO_2489_junction", GenericJunctionActor.class);
		classes.put("SuperMethodInvocation__CO_2485_junction", SuperMethodInvocation__CO_2485_junction.class);
		classes.put("SuperMethodInvocation__CO_2483_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod__CO_2519_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod__CO_triangle_0_triangleJunction", GenericTriangleJunctionActor.class);
		classes.put("SyntethicMethod__CO_2517_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod__CO_2529_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod__CO_2521_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod__CO_2530_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod__CO_2531_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod__CO_2522_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod__CO_2518_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod__CO_2516_junction", GenericJunctionActor.class);
		classes.put("SyntethicMethod_mSyntethic_syntheticMethodDefinitions_incoming_SRC__FILTER_NAC_2548_junction", SyntethicMethod_mSyntethic_syntheticMethodDefinitions_incoming_SRC__FILTER_NAC_2548_junction.class);
		classes.put("SyntethicMethod__CO_2832_nacjunction", GenericNACJunctionActor.class);
		classes.put("SyntethicMethod_tSyntethic_syntethicMethods_incoming_TRG__FILTER_NAC_2554_junction", SyntethicMethod_tSyntethic_syntethicMethods_incoming_TRG__FILTER_NAC_2554_junction.class);
		classes.put("SyntethicMethod__CO_2833_nacjunction", GenericNACJunctionActor.class);
		classes.put("TextAnnotations__CO_2564_junction", GenericJunctionActor.class);
		classes.put("TextAnnotations__CO_2561_junction", GenericJunctionActor.class);
		classes.put("TextAnnotations__CO_2566_junction", TextAnnotations__CO_2566_junction.class);
		classes.put("TextAnnotations__CO_2562_junction", GenericJunctionActor.class);
		classes.put("TextAnnotations__CO_2560_junction", GenericJunctionActor.class);
		classes.put("TypeParameter__CO_2581_junction", GenericJunctionActor.class);
		classes.put("TypeParameter__CO_2578_junction", GenericJunctionActor.class);
		classes.put("TypeParameter__CO_2582_junction", GenericJunctionActor.class);
		classes.put("TypeParameter__CO_2583_junction", GenericJunctionActor.class);
		classes.put("TypeParameter__CO_2579_junction", GenericJunctionActor.class);
		classes.put("TypeParameter__CO_2577_junction", GenericJunctionActor.class);
		classes.put("TypeParameter__CO_2834_nacjunction", GenericNACJunctionActor.class);
		classes.put("TypeParameter__CO_2835_nacjunction", GenericNACJunctionActor.class);
		classes.put("TypesOrphaned__CO_2602_junction", GenericJunctionActor.class);
		classes.put("TypesOrphaned__CO_2603_junction", GenericJunctionActor.class);
		classes.put("TypesOrphaned__CO_2600_junction", GenericJunctionActor.class);
		classes.put("TypesOrphaned__CO_2604_junction", TypesOrphaned__CO_2604_junction.class);
		classes.put("TypesOrphaned__CO_2605_junction", GenericJunctionActor.class);
		classes.put("TypesOrphaned__CO_2601_junction", GenericJunctionActor.class);
		classes.put("TypesOrphaned__CO_2599_junction", GenericJunctionActor.class);
		classes.put("TypesOrphaned__CO_2836_nacjunction", GenericNACJunctionActor.class);
		classes.put("TypesOrphaned__CO_2837_nacjunction", GenericNACJunctionActor.class);
		classes.put("TypesVisibility__CO_2628_junction", GenericJunctionActor.class);
		classes.put("TypesVisibility__CO_2625_junction", GenericJunctionActor.class);
		classes.put("TypesVisibility__CO_2630_junction", TypesVisibility__CO_2630_junction.class);
		classes.put("TypesVisibility__CO_2626_junction", GenericJunctionActor.class);
		classes.put("TypesVisibility__CO_2624_junction", GenericJunctionActor.class);
		classes.put("TypesVisibility__CO_2838_nacjunction", GenericNACJunctionActor.class);
		classes.put("UnresolvedTypeDeclaration__CO_2648_junction", GenericJunctionActor.class);
		classes.put("UnresolvedTypeDeclaration__CO_2645_junction", GenericJunctionActor.class);
		classes.put("UnresolvedTypeDeclaration__CO_2650_junction", UnresolvedTypeDeclaration__CO_2650_junction.class);
		createJunctionNodes_9();
			}	
		
			private void createJunctionNodes_9() {
		classes.put("UnresolvedTypeDeclaration__CO_2646_junction", GenericJunctionActor.class);
		classes.put("UnresolvedTypeDeclaration__CO_2644_junction", GenericJunctionActor.class);
		classes.put("VariableDeclarationFragment__CO_2662_junction", GenericJunctionActor.class);
		classes.put("VariableDeclarationFragment__CO_2667_junction", GenericJunctionActor.class);
		classes.put("VariableDeclarationFragment__CO_2663_junction", GenericJunctionActor.class);
		classes.put("VariableDeclarationFragment__CO_2661_junction", GenericJunctionActor.class);
	}
	
	public void createReferenceNodes() {
		classes.put("Annotation_values_0_reference",Annotation_values_0_reference.class);
		classes.put("AnnotationToTAnnotation_source_0_reference",AnnotationToTAnnotation_source_0_reference.class);
		classes.put("AnnotationToTAnnotation_target_0_reference",AnnotationToTAnnotation_target_0_reference.class);
		classes.put("TAnnotation_tValues_0_reference",TAnnotation_tValues_0_reference.class);
		classes.put("AnnotationMemberValuePairToTAnnotationValue_source_0_reference",AnnotationMemberValuePairToTAnnotationValue_source_0_reference.class);
		classes.put("AnnotationMemberValuePairToTAnnotationValue_target_0_reference",AnnotationMemberValuePairToTAnnotationValue_target_0_reference.class);
		classes.put("TAnnotationValue_tValue_0_reference",TAnnotationValue_tValue_0_reference.class);
		classes.put("AnnotationMemberValuePair_value_0_reference",AnnotationMemberValuePair_value_0_reference.class);
		classes.put("ArrayInitializer_expressions_0_reference",ArrayInitializer_expressions_0_reference.class);
		classes.put("BodyDeclaration_annotations_0_reference",BodyDeclaration_annotations_0_reference.class);
		classes.put("TAnnotatable_tAnnotation_0_reference",TAnnotatable_tAnnotation_0_reference.class);
		classes.put("AnnotationMemberValuePair_value_1_reference",AnnotationMemberValuePair_value_1_reference.class);
		classes.put("TAnnotationValue_tValue_1_reference",TAnnotationValue_tValue_1_reference.class);
		classes.put("ArrayInitializer_expressions_1_reference",ArrayInitializer_expressions_1_reference.class);
		classes.put("BooleanLiteralToTBoolNode_source_0_reference",BooleanLiteralToTBoolNode_source_0_reference.class);
		classes.put("BooleanLiteralToTBoolNode_target_0_reference",BooleanLiteralToTBoolNode_target_0_reference.class);
		classes.put("AnnotationMemberValuePair_value_2_reference",AnnotationMemberValuePair_value_2_reference.class);
		classes.put("ClassLiteralToClassNode_source_0_reference",ClassLiteralToClassNode_source_0_reference.class);
		classes.put("ClassLiteralToClassNode_target_0_reference",ClassLiteralToClassNode_target_0_reference.class);
		classes.put("TAnnotationValue_tValue_2_reference",TAnnotationValue_tValue_2_reference.class);
		classes.put("TClassNode_tClass_0_reference",TClassNode_tClass_0_reference.class);
		classes.put("ArrayInitializer_expressions_2_reference",ArrayInitializer_expressions_2_reference.class);
		classes.put("TypeToTAbstractType_source_0_reference",TypeToTAbstractType_source_0_reference.class);
		classes.put("TypeToTAbstractType_target_0_reference",TypeToTAbstractType_target_0_reference.class);
		classes.put("Type_usagesInTypeAccess_0_reference",Type_usagesInTypeAccess_0_reference.class);
		classes.put("TypeLiteral_type_0_reference",TypeLiteral_type_0_reference.class);
		classes.put("AbstractTypeDeclaration_superInterfaces_0_reference",AbstractTypeDeclaration_superInterfaces_0_reference.class);
		classes.put("Annotation_type_0_reference",Annotation_type_0_reference.class);
		classes.put("ArrayType_elementType_0_reference",ArrayType_elementType_0_reference.class);
		classes.put("ClassDeclaration_superClass_0_reference",ClassDeclaration_superClass_0_reference.class);
		classes.put("MethodDeclaration_returnType_0_reference",MethodDeclaration_returnType_0_reference.class);
		classes.put("AnnotationMemberValuePair_value_3_reference",AnnotationMemberValuePair_value_3_reference.class);
		classes.put("TAnnotationValue_tValue_3_reference",TAnnotationValue_tValue_3_reference.class);
		classes.put("ArrayInitializer_expressions_3_reference",ArrayInitializer_expressions_3_reference.class);
		classes.put("NumberLiteralToTNumberNode_source_0_reference",NumberLiteralToTNumberNode_source_0_reference.class);
		classes.put("NumberLiteralToTNumberNode_target_0_reference",NumberLiteralToTNumberNode_target_0_reference.class);
		classes.put("AnnotationMemberValuePair_value_4_reference",AnnotationMemberValuePair_value_4_reference.class);
		classes.put("TAnnotationValue_tValue_4_reference",TAnnotationValue_tValue_4_reference.class);
		classes.put("ArrayInitializer_expressions_4_reference",ArrayInitializer_expressions_4_reference.class);
		classes.put("StringLiteralToTTextNode_source_0_reference",StringLiteralToTTextNode_source_0_reference.class);
		classes.put("StringLiteralToTTextNode_target_0_reference",StringLiteralToTTextNode_target_0_reference.class);
		classes.put("AnnotationMemberValuePair_value_5_reference",AnnotationMemberValuePair_value_5_reference.class);
		classes.put("ASTNodeToTAnnotatable_source_0_reference",ASTNodeToTAnnotatable_source_0_reference.class);
		classes.put("ASTNodeToTAnnotatable_target_0_reference",ASTNodeToTAnnotatable_target_0_reference.class);
		classes.put("TAnnotation_type_0_reference",TAnnotation_type_0_reference.class);
		classes.put("TypeToTAbstractType_source_1_reference",TypeToTAbstractType_source_1_reference.class);
		classes.put("TypeToTAbstractType_target_1_reference",TypeToTAbstractType_target_1_reference.class);
		classes.put("AnnotationTypeDeclaration_usagesInTypeAccess_1_reference",AnnotationTypeDeclaration_usagesInTypeAccess_1_reference.class);
		classes.put("ClassInstanceCreation_type_0_reference",ClassInstanceCreation_type_0_reference.class);
		classes.put("ASTNodeToTAnnotatable_target_1_reference",ASTNodeToTAnnotatable_target_1_reference.class);
		classes.put("TypeGraph_classes_0_reference",TypeGraph_classes_0_reference.class);
		classes.put("TAnnotationType_outerType_0_reference",TAnnotationType_outerType_0_reference.class);
		classes.put("TAnnotationType_pg_0_reference",TAnnotationType_pg_0_reference.class);
		classes.put("TClass_pg_1_reference",TClass_pg_1_reference.class);
		classes.put("AnonymousClassDeclarationToTClass_source_0_reference",AnonymousClassDeclarationToTClass_source_0_reference.class);
		classes.put("AnonymousClassDeclarationToTClass_target_0_reference",AnonymousClassDeclarationToTClass_target_0_reference.class);
		classes.put("ASTNodeToTAnnotatable_source_1_reference",ASTNodeToTAnnotatable_source_1_reference.class);
		classes.put("AnonymousClassDeclaration_bodyDeclarations_0_reference",AnonymousClassDeclaration_bodyDeclarations_0_reference.class);
		classes.put("TypeToTAbstractType_source_2_reference",TypeToTAbstractType_source_2_reference.class);
		classes.put("AbstractTypeDeclaration_bodyDeclarations_0_reference",AbstractTypeDeclaration_bodyDeclarations_0_reference.class);
		classes.put("TPackage_subpackage_0_reference",TPackage_subpackage_0_reference.class);
		classes.put("TPackage_typeGraph_0_reference",TPackage_typeGraph_0_reference.class);
		classes.put("TAnnotationType_package_0_reference",TAnnotationType_package_0_reference.class);
		classes.put("TAnnotationType_outerType_1_reference",TAnnotationType_outerType_1_reference.class);
		classes.put("TypeGraph_tAnnotationTypes_0_reference",TypeGraph_tAnnotationTypes_0_reference.class);
		classes.put("TAbstractType_package_1_reference",TAbstractType_package_1_reference.class);
		classes.put("TAbstractType_pg_2_reference",TAbstractType_pg_2_reference.class);
		classes.put("TPackage_pg_0_reference",TPackage_pg_0_reference.class);
		classes.put("AnnotationTypeDeclaration_package_0_reference",AnnotationTypeDeclaration_package_0_reference.class);
		classes.put("PackageToTPackage_source_0_reference",PackageToTPackage_source_0_reference.class);
		classes.put("PackageToTPackage_target_0_reference",PackageToTPackage_target_0_reference.class);
		classes.put("TClass_parentClass_0_reference",TClass_parentClass_0_reference.class);
		classes.put("AnonymousClassDeclarationToTClass_source_1_reference",AnonymousClassDeclarationToTClass_source_1_reference.class);
		classes.put("AnonymousClassDeclarationToTClass_target_1_reference",AnonymousClassDeclarationToTClass_target_1_reference.class);
		classes.put("MAnonymous_classInstanceCreation_0_reference",MAnonymous_classInstanceCreation_0_reference.class);
		classes.put("AbstractTypeDeclaration_usagesInTypeAccess_2_reference",AbstractTypeDeclaration_usagesInTypeAccess_2_reference.class);
		classes.put("TypeToTAbstractType_target_2_reference",TypeToTAbstractType_target_2_reference.class);
		classes.put("TClass_implements_0_reference",TClass_implements_0_reference.class);
		classes.put("TypeToTAbstractType_target_3_reference",TypeToTAbstractType_target_3_reference.class);
		classes.put("AnonymousClassDeclarationToTClass_target_2_reference",AnonymousClassDeclarationToTClass_target_2_reference.class);
		classes.put("TypeGraph_classes_1_reference",TypeGraph_classes_1_reference.class);
		classes.put("TClass_outerType_2_reference",TClass_outerType_2_reference.class);
		classes.put("MAnonymous_mSourroundingType_0_reference",MAnonymous_mSourroundingType_0_reference.class);
		classes.put("TClass_package_2_reference",TClass_package_2_reference.class);
		classes.put("TClass_pg_3_reference",TClass_pg_3_reference.class);
		classes.put("TPackage_classes_0_reference",TPackage_classes_0_reference.class);
		classes.put("ArrayInitializer_expressions_5_reference",ArrayInitializer_expressions_5_reference.class);
		classes.put("Model_orphanTypes_0_reference",Model_orphanTypes_0_reference.class);
		classes.put("ModelToTypeGraph_source_0_reference",ModelToTypeGraph_source_0_reference.class);
		classes.put("ModelToTypeGraph_target_0_reference",ModelToTypeGraph_target_0_reference.class);
		classes.put("TypeToTAbstractType_source_3_reference",TypeToTAbstractType_source_3_reference.class);
		classes.put("TClass_parentClass_1_reference",TClass_parentClass_1_reference.class);
		classes.put("ClassDeclarationToTClass_source_0_reference",ClassDeclarationToTClass_source_0_reference.class);
		classes.put("ClassDeclarationToTClass_target_0_reference",ClassDeclarationToTClass_target_0_reference.class);
		classes.put("ClassDeclaration_usagesInTypeAccess_3_reference",ClassDeclaration_usagesInTypeAccess_3_reference.class);
		classes.put("TClass_implements_1_reference",TClass_implements_1_reference.class);
		classes.put("ClassDeclaration_superInterfaces_1_reference",ClassDeclaration_superInterfaces_1_reference.class);
		classes.put("TypeToTAbstractType_source_4_reference",TypeToTAbstractType_source_4_reference.class);
		classes.put("ASTNodeToTAnnotatable_source_2_reference",ASTNodeToTAnnotatable_source_2_reference.class);
		classes.put("ASTNodeToTAnnotatable_target_2_reference",ASTNodeToTAnnotatable_target_2_reference.class);
		classes.put("AnonymousClassDeclaration_bodyDeclarations_1_reference",AnonymousClassDeclaration_bodyDeclarations_1_reference.class);
		classes.put("ClassDeclarationToTClass_source_1_reference",ClassDeclarationToTClass_source_1_reference.class);
		classes.put("TClass_outerType_3_reference",TClass_outerType_3_reference.class);
		classes.put("AnonymousClassDeclaration_bodyDeclarations_2_reference",AnonymousClassDeclaration_bodyDeclarations_2_reference.class);
		classes.put("MAbstractMethodDefinition_mInnerTypes_0_reference",MAbstractMethodDefinition_mInnerTypes_0_reference.class);
		classes.put("TClass_package_3_reference",TClass_package_3_reference.class);
		classes.put("TypeToTAbstractType_source_5_reference",TypeToTAbstractType_source_5_reference.class);
		classes.put("ClassDeclaration_bodyDeclarations_1_reference",ClassDeclaration_bodyDeclarations_1_reference.class);
		classes.put("AbstractMethodInvocationToTAccess_source_0_reference",AbstractMethodInvocationToTAccess_source_0_reference.class);
		classes.put("AbstractMethodInvocationToTAccess_target_0_reference",AbstractMethodInvocationToTAccess_target_0_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_0_reference",MAbstractFlowElementToTAbstractFlowElement_source_0_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_target_0_reference",MAbstractFlowElementToTAbstractFlowElement_target_0_reference.class);
		classes.put("MDefinitionToTMember_source_0_reference",MDefinitionToTMember_source_0_reference.class);
		classes.put("MDefinitionToTMember_target_0_reference",MDefinitionToTMember_target_0_reference.class);
		classes.put("MDefinition_mMethodInvocations_0_reference",MDefinition_mMethodInvocations_0_reference.class);
		classes.put("MAbstractMethodDefinition_usages_0_reference",MAbstractMethodDefinition_usages_0_reference.class);
		classes.put("MDefinitionToTMember_source_1_reference",MDefinitionToTMember_source_1_reference.class);
		classes.put("TCall_tSource_0_reference",TCall_tSource_0_reference.class);
		classes.put("TCall_tTarget_0_reference",TCall_tTarget_0_reference.class);
		classes.put("MClass_package_1_reference",MClass_package_1_reference.class);
		classes.put("MDefinitionToTMember_source_2_reference",MDefinitionToTMember_source_2_reference.class);
		classes.put("MDefinitionToTMember_target_1_reference",MDefinitionToTMember_target_1_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_target_1_reference",MAbstractFlowElementToTAbstractFlowElement_target_1_reference.class);
		classes.put("TMethodDefinition_signature_0_reference",TMethodDefinition_signature_0_reference.class);
		classes.put("TMethodDefinition_tAnnotation_1_reference",TMethodDefinition_tAnnotation_1_reference.class);
		classes.put("ASTNodeToTAnnotatable_source_3_reference",ASTNodeToTAnnotatable_source_3_reference.class);
		classes.put("ASTNodeToTAnnotatable_target_3_reference",ASTNodeToTAnnotatable_target_3_reference.class);
		classes.put("MSignatureToTSignature_source_0_reference",MSignatureToTSignature_source_0_reference.class);
		classes.put("MSignatureToTSignature_target_0_reference",MSignatureToTSignature_target_0_reference.class);
		classes.put("MConstructorDefinition_mSignature_0_reference",MConstructorDefinition_mSignature_0_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_1_reference",MAbstractFlowElementToTAbstractFlowElement_source_1_reference.class);
		classes.put("AbstractMethodInvocationToTAccess_source_1_reference",AbstractMethodInvocationToTAccess_source_1_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_2_reference",MAbstractFlowElementToTAbstractFlowElement_source_2_reference.class);
		classes.put("MDefinition_mMethodInvocations_1_reference",MDefinition_mMethodInvocations_1_reference.class);
		classes.put("MAbstractMethodDefinition_usages_1_reference",MAbstractMethodDefinition_usages_1_reference.class);
		classes.put("ASTNodeToTAnnotatable_source_4_reference",ASTNodeToTAnnotatable_source_4_reference.class);
		classes.put("AnonymousClassDeclaration_bodyDeclarations_3_reference",AnonymousClassDeclaration_bodyDeclarations_3_reference.class);
		classes.put("TypeToTAbstractType_source_6_reference",TypeToTAbstractType_source_6_reference.class);
		classes.put("TClass_tAnnotation_2_reference",TClass_tAnnotation_2_reference.class);
		classes.put("EnumDeclaration_package_2_reference",EnumDeclaration_package_2_reference.class);
		classes.put("MDefinitionToTMember_source_3_reference",MDefinitionToTMember_source_3_reference.class);
		classes.put("MDefinitionToTMember_target_2_reference",MDefinitionToTMember_target_2_reference.class);
		classes.put("AbstractTypeDeclaration_bodyDeclarations_2_reference",AbstractTypeDeclaration_bodyDeclarations_2_reference.class);
		classes.put("VariableDeclarationFragment_variablesContainer_0_reference",VariableDeclarationFragment_variablesContainer_0_reference.class);
		classes.put("TAbstractType_defines_0_reference",TAbstractType_defines_0_reference.class);
		classes.put("TReadWrite_tTarget_1_reference",TReadWrite_tTarget_1_reference.class);
		classes.put("MSingleVariableAccessToTAccess_source_0_reference",MSingleVariableAccessToTAccess_source_0_reference.class);
		classes.put("MSingleVariableAccessToTAccess_target_0_reference",MSingleVariableAccessToTAccess_target_0_reference.class);
		classes.put("MSingleVariableAccess_variable_0_reference",MSingleVariableAccess_variable_0_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_3_reference",MAbstractFlowElementToTAbstractFlowElement_source_3_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_target_2_reference",MAbstractFlowElementToTAbstractFlowElement_target_2_reference.class);
		classes.put("TReadWrite_tSource_1_reference",TReadWrite_tSource_1_reference.class);
		classes.put("MDefinition_mAbstractFieldAccess_0_reference",MDefinition_mAbstractFieldAccess_0_reference.class);
		classes.put("MDefinition_mAbstractFieldAccess_1_reference",MDefinition_mAbstractFieldAccess_1_reference.class);
		classes.put("TRead_tTarget_2_reference",TRead_tTarget_2_reference.class);
		classes.put("MSingleVariableAccessToTAccess_source_1_reference",MSingleVariableAccessToTAccess_source_1_reference.class);
		classes.put("MSingleVariableAccessToTAccess_target_1_reference",MSingleVariableAccessToTAccess_target_1_reference.class);
		classes.put("MSingleVariableAccess_variable_1_reference",MSingleVariableAccess_variable_1_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_4_reference",MAbstractFlowElementToTAbstractFlowElement_source_4_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_target_3_reference",MAbstractFlowElementToTAbstractFlowElement_target_3_reference.class);
		classes.put("TRead_tSource_2_reference",TRead_tSource_2_reference.class);
		classes.put("MDefinition_mAbstractFieldAccess_2_reference",MDefinition_mAbstractFieldAccess_2_reference.class);
		classes.put("TWrite_tTarget_3_reference",TWrite_tTarget_3_reference.class);
		classes.put("MSingleVariableAccessToTAccess_source_2_reference",MSingleVariableAccessToTAccess_source_2_reference.class);
		classes.put("MSingleVariableAccessToTAccess_target_2_reference",MSingleVariableAccessToTAccess_target_2_reference.class);
		classes.put("MSingleVariableAccess_variable_2_reference",MSingleVariableAccess_variable_2_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_5_reference",MAbstractFlowElementToTAbstractFlowElement_source_5_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_target_4_reference",MAbstractFlowElementToTAbstractFlowElement_target_4_reference.class);
		classes.put("TWrite_tSource_3_reference",TWrite_tSource_3_reference.class);
		classes.put("MDefinition_mAbstractFieldAccess_3_reference",MDefinition_mAbstractFieldAccess_3_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_6_reference",MAbstractFlowElementToTAbstractFlowElement_source_6_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_target_5_reference",MAbstractFlowElementToTAbstractFlowElement_target_5_reference.class);
		classes.put("MFieldDefinition_mSignature_1_reference",MFieldDefinition_mSignature_1_reference.class);
		classes.put("MSignatureToTSignature_source_1_reference",MSignatureToTSignature_source_1_reference.class);
		classes.put("MSignatureToTSignature_target_1_reference",MSignatureToTSignature_target_1_reference.class);
		classes.put("TFieldDefinition_signature_1_reference",TFieldDefinition_signature_1_reference.class);
		classes.put("ASTNodeToTAnnotatable_source_5_reference",ASTNodeToTAnnotatable_source_5_reference.class);
		classes.put("ASTNodeToTAnnotatable_target_4_reference",ASTNodeToTAnnotatable_target_4_reference.class);
		classes.put("MGravityModel_mFieldNames_0_reference",MGravityModel_mFieldNames_0_reference.class);
		classes.put("ModelToTypeGraph_source_1_reference",ModelToTypeGraph_source_1_reference.class);
		classes.put("TField_pg_0_reference",TField_pg_0_reference.class);
		classes.put("MFieldNameToTField_source_0_reference",MFieldNameToTField_source_0_reference.class);
		classes.put("MFieldNameToTField_target_0_reference",MFieldNameToTField_target_0_reference.class);
		classes.put("TField_signatures_0_reference",TField_signatures_0_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_target_6_reference",MAbstractFlowElementToTAbstractFlowElement_target_6_reference.class);
		classes.put("MFieldName_mSignatures_0_reference",MFieldName_mSignatures_0_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_7_reference",MAbstractFlowElementToTAbstractFlowElement_source_7_reference.class);
		classes.put("MFieldSignature_type_0_reference",MFieldSignature_type_0_reference.class);
		classes.put("TFieldSignature_type_0_reference",TFieldSignature_type_0_reference.class);
		classes.put("MAbstractFlowElement_ownedFlows_0_reference",MAbstractFlowElement_ownedFlows_0_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_8_reference",MAbstractFlowElementToTAbstractFlowElement_source_8_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_target_7_reference",MAbstractFlowElementToTAbstractFlowElement_target_7_reference.class);
		classes.put("TAbstractFlowElement_ownedFlows_0_reference",TAbstractFlowElement_ownedFlows_0_reference.class);
		classes.put("MFlowToTFlow_source_0_reference",MFlowToTFlow_source_0_reference.class);
		classes.put("MFlowToTFlow_target_0_reference",MFlowToTFlow_target_0_reference.class);
		classes.put("MAbstractFlowElement_outgoingFlows_0_reference",MAbstractFlowElement_outgoingFlows_0_reference.class);
		classes.put("TFlow_incomingFlows_0_reference",TFlow_incomingFlows_0_reference.class);
		classes.put("TInterface_parentInterfaces_0_reference",TInterface_parentInterfaces_0_reference.class);
		classes.put("InterfaceDeclarationToTInterface_source_0_reference",InterfaceDeclarationToTInterface_source_0_reference.class);
		classes.put("InterfaceDeclarationToTInterface_target_0_reference",InterfaceDeclarationToTInterface_target_0_reference.class);
		classes.put("InterfaceDeclaration_superInterfaces_2_reference",InterfaceDeclaration_superInterfaces_2_reference.class);
		classes.put("InterfaceDeclaration_usagesInTypeAccess_4_reference",InterfaceDeclaration_usagesInTypeAccess_4_reference.class);
		classes.put("TypeToTAbstractType_source_7_reference",TypeToTAbstractType_source_7_reference.class);
		classes.put("ASTNodeToTAnnotatable_source_6_reference",ASTNodeToTAnnotatable_source_6_reference.class);
		classes.put("ASTNodeToTAnnotatable_target_5_reference",ASTNodeToTAnnotatable_target_5_reference.class);
		classes.put("AnonymousClassDeclaration_bodyDeclarations_4_reference",AnonymousClassDeclaration_bodyDeclarations_4_reference.class);
		classes.put("TInterface_pg_4_reference",TInterface_pg_4_reference.class);
		classes.put("TypeGraph_interfaces_0_reference",TypeGraph_interfaces_0_reference.class);
		classes.put("TInterface_outerType_4_reference",TInterface_outerType_4_reference.class);
		classes.put("TPackage_interfaces_0_reference",TPackage_interfaces_0_reference.class);
		classes.put("TInterface_defines_1_reference",TInterface_defines_1_reference.class);
		classes.put("MModifierToTModifier_target_0_reference",MModifierToTModifier_target_0_reference.class);
		classes.put("TMember_tModifier_0_reference",TMember_tModifier_0_reference.class);
		classes.put("MDefinition_modifier_0_reference",MDefinition_modifier_0_reference.class);
		classes.put("MModifierToTModifier_source_0_reference",MModifierToTModifier_source_0_reference.class);
		classes.put("InterfaceDeclaration_bodyDeclarations_3_reference",InterfaceDeclaration_bodyDeclarations_3_reference.class);
		classes.put("TAbstractType_tModifier_0_reference",TAbstractType_tModifier_0_reference.class);
		classes.put("InterfaceDeclaration_package_3_reference",InterfaceDeclaration_package_3_reference.class);
		classes.put("TInterface_package_4_reference",TInterface_package_4_reference.class);
		classes.put("TMember_signature_2_reference",TMember_signature_2_reference.class);
		classes.put("TClass_defines_2_reference",TClass_defines_2_reference.class);
		classes.put("TClass_signature_0_reference",TClass_signature_0_reference.class);
		classes.put("MSignatureToTSignature_target_2_reference",MSignatureToTSignature_target_2_reference.class);
		classes.put("MDefinition_mSignature_2_reference",MDefinition_mSignature_2_reference.class);
		classes.put("MSignatureToTSignature_source_2_reference",MSignatureToTSignature_source_2_reference.class);
		classes.put("MAnonymous_bodyDeclarations_5_reference",MAnonymous_bodyDeclarations_5_reference.class);
		classes.put("TAbstractType_defines_3_reference",TAbstractType_defines_3_reference.class);
		classes.put("TAbstractType_signature_1_reference",TAbstractType_signature_1_reference.class);
		classes.put("AbstractTypeDeclaration_bodyDeclarations_4_reference",AbstractTypeDeclaration_bodyDeclarations_4_reference.class);
		classes.put("AnnotationTypeDeclaration_bodyDeclarations_5_reference",AnnotationTypeDeclaration_bodyDeclarations_5_reference.class);
		classes.put("TAnnotationType_defines_4_reference",TAnnotationType_defines_4_reference.class);
		classes.put("ClassDeclaration_bodyDeclarations_6_reference",ClassDeclaration_bodyDeclarations_6_reference.class);
		classes.put("EnumDeclaration_bodyDeclarations_7_reference",EnumDeclaration_bodyDeclarations_7_reference.class);
		classes.put("ASTNodeToTAnnotatable_source_7_reference",ASTNodeToTAnnotatable_source_7_reference.class);
		classes.put("MDefinitionToTMember_source_4_reference",MDefinitionToTMember_source_4_reference.class);
		classes.put("MMethodDefinition_mSignature_3_reference",MMethodDefinition_mSignature_3_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_9_reference",MAbstractFlowElementToTAbstractFlowElement_source_9_reference.class);
		classes.put("AbstractMethodInvocationToTAccess_source_2_reference",AbstractMethodInvocationToTAccess_source_2_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_10_reference",MAbstractFlowElementToTAbstractFlowElement_source_10_reference.class);
		classes.put("TCall_tSource_4_reference",TCall_tSource_4_reference.class);
		classes.put("TCall_tTarget_4_reference",TCall_tTarget_4_reference.class);
		classes.put("MMethodDefinition_mMethodInvocations_2_reference",MMethodDefinition_mMethodInvocations_2_reference.class);
		classes.put("MMethodDefinition_usages_2_reference",MMethodDefinition_usages_2_reference.class);
		classes.put("MMethodInvocation_mStaticType_0_reference",MMethodInvocation_mStaticType_0_reference.class);
		classes.put("TCall_staticType_0_reference",TCall_staticType_0_reference.class);
		classes.put("MDefinition_mMethodInvocations_3_reference",MDefinition_mMethodInvocations_3_reference.class);
		classes.put("MAbstractMethodDefinition_usages_3_reference",MAbstractMethodDefinition_usages_3_reference.class);
		classes.put("MMethodNameToTMethod_target_0_reference",MMethodNameToTMethod_target_0_reference.class);
		classes.put("TMethod_pg_0_reference",TMethod_pg_0_reference.class);
		classes.put("MGravityModel_mMethodNames_0_reference",MGravityModel_mMethodNames_0_reference.class);
		classes.put("MMethodNameToTMethod_source_0_reference",MMethodNameToTMethod_source_0_reference.class);
		classes.put("MMethodDefinition_redefinitions_0_reference",MMethodDefinition_redefinitions_0_reference.class);
		classes.put("TMethodDefinition_overriding_0_reference",TMethodDefinition_overriding_0_reference.class);
		classes.put("MMethodSignature_mFirstEntry_0_reference",MMethodSignature_mFirstEntry_0_reference.class);
		classes.put("MEntryToTParameter_source_0_reference",MEntryToTParameter_source_0_reference.class);
		classes.put("MEntryToTParameter_target_0_reference",MEntryToTParameter_target_0_reference.class);
		classes.put("TMethodSignature_firstParameter_0_reference",TMethodSignature_firstParameter_0_reference.class);
		classes.put("MEntry_mPrevious_0_reference",MEntry_mPrevious_0_reference.class);
		classes.put("TParameter_previous_0_reference",TParameter_previous_0_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_target_8_reference",MAbstractFlowElementToTAbstractFlowElement_target_8_reference.class);
		classes.put("TParameter_type_0_reference",TParameter_type_0_reference.class);
		classes.put("TMethodSignature_parameters_0_reference",TMethodSignature_parameters_0_reference.class);
		classes.put("MMethodSignature_mEntrys_0_reference",MMethodSignature_mEntrys_0_reference.class);
		classes.put("MEntry_type_0_reference",MEntry_type_0_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_11_reference",MAbstractFlowElementToTAbstractFlowElement_source_11_reference.class);
		classes.put("MMethodName_mSignatures_1_reference",MMethodName_mSignatures_1_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_12_reference",MAbstractFlowElementToTAbstractFlowElement_source_12_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_target_9_reference",MAbstractFlowElementToTAbstractFlowElement_target_9_reference.class);
		classes.put("TMethod_signatures_0_reference",TMethod_signatures_0_reference.class);
		classes.put("AbstractTypeDeclaration_bodyDeclarations_8_reference",AbstractTypeDeclaration_bodyDeclarations_8_reference.class);
		classes.put("TClass_outerType_5_reference",TClass_outerType_5_reference.class);
		classes.put("AbstractTypeDeclaration_bodyDeclarations_9_reference",AbstractTypeDeclaration_bodyDeclarations_9_reference.class);
		classes.put("AbstractTypeDeclaration_bodyDeclarations_10_reference",AbstractTypeDeclaration_bodyDeclarations_10_reference.class);
		classes.put("TInterface_outerType_6_reference",TInterface_outerType_6_reference.class);
		classes.put("MAbstractFlowElement_incomingFlows_0_reference",MAbstractFlowElement_incomingFlows_0_reference.class);
		classes.put("TFlow_outgoingFlows_0_reference",TFlow_outgoingFlows_0_reference.class);
		classes.put("Model_ownedElements_0_reference",Model_ownedElements_0_reference.class);
		classes.put("Package_package_0_reference",Package_package_0_reference.class);
		classes.put("ParameterizedType_type_0_reference",ParameterizedType_type_0_reference.class);
		classes.put("Model_orphanTypes_1_reference",Model_orphanTypes_1_reference.class);
		classes.put("TypeToTAbstractType_source_8_reference",TypeToTAbstractType_source_8_reference.class);
		classes.put("PrimitiveTypeToTClass_target_0_reference",PrimitiveTypeToTClass_target_0_reference.class);
		classes.put("TClass_pg_5_reference",TClass_pg_5_reference.class);
		classes.put("TypeGraph_classes_2_reference",TypeGraph_classes_2_reference.class);
		classes.put("TypeToTAbstractType_target_4_reference",TypeToTAbstractType_target_4_reference.class);
		classes.put("TypeToTAbstractType_source_9_reference",TypeToTAbstractType_source_9_reference.class);
		classes.put("Model_orphanTypes_2_reference",Model_orphanTypes_2_reference.class);
		classes.put("PrimitiveTypeToTClass_source_0_reference",PrimitiveTypeToTClass_source_0_reference.class);
		classes.put("PrimitiveTypeToTClass_target_1_reference",PrimitiveTypeToTClass_target_1_reference.class);
		classes.put("TClass_pg_6_reference",TClass_pg_6_reference.class);
		classes.put("TypeGraph_classes_3_reference",TypeGraph_classes_3_reference.class);
		classes.put("TypeToTAbstractType_target_5_reference",TypeToTAbstractType_target_5_reference.class);
		classes.put("TypeToTAbstractType_source_10_reference",TypeToTAbstractType_source_10_reference.class);
		classes.put("Model_orphanTypes_3_reference",Model_orphanTypes_3_reference.class);
		classes.put("PrimitiveTypeToTClass_source_1_reference",PrimitiveTypeToTClass_source_1_reference.class);
		classes.put("PrimitiveTypeToTClass_target_2_reference",PrimitiveTypeToTClass_target_2_reference.class);
		classes.put("TClass_pg_7_reference",TClass_pg_7_reference.class);
		classes.put("TypeGraph_classes_4_reference",TypeGraph_classes_4_reference.class);
		classes.put("TypeToTAbstractType_target_6_reference",TypeToTAbstractType_target_6_reference.class);
		classes.put("TypeToTAbstractType_source_11_reference",TypeToTAbstractType_source_11_reference.class);
		classes.put("Model_orphanTypes_4_reference",Model_orphanTypes_4_reference.class);
		classes.put("PrimitiveTypeToTClass_source_2_reference",PrimitiveTypeToTClass_source_2_reference.class);
		classes.put("PrimitiveTypeToTClass_target_3_reference",PrimitiveTypeToTClass_target_3_reference.class);
		classes.put("TClass_pg_8_reference",TClass_pg_8_reference.class);
		classes.put("TypeGraph_classes_5_reference",TypeGraph_classes_5_reference.class);
		classes.put("TypeToTAbstractType_target_7_reference",TypeToTAbstractType_target_7_reference.class);
		classes.put("TypeToTAbstractType_source_12_reference",TypeToTAbstractType_source_12_reference.class);
		classes.put("Model_orphanTypes_5_reference",Model_orphanTypes_5_reference.class);
		classes.put("PrimitiveTypeToTClass_source_3_reference",PrimitiveTypeToTClass_source_3_reference.class);
		classes.put("PrimitiveTypeToTClass_target_4_reference",PrimitiveTypeToTClass_target_4_reference.class);
		classes.put("TClass_pg_9_reference",TClass_pg_9_reference.class);
		classes.put("TypeGraph_classes_6_reference",TypeGraph_classes_6_reference.class);
		classes.put("TypeToTAbstractType_target_8_reference",TypeToTAbstractType_target_8_reference.class);
		classes.put("TypeToTAbstractType_source_13_reference",TypeToTAbstractType_source_13_reference.class);
		classes.put("Model_orphanTypes_6_reference",Model_orphanTypes_6_reference.class);
		classes.put("PrimitiveTypeToTClass_source_4_reference",PrimitiveTypeToTClass_source_4_reference.class);
		classes.put("PrimitiveTypeToTClass_target_5_reference",PrimitiveTypeToTClass_target_5_reference.class);
		classes.put("TClass_pg_10_reference",TClass_pg_10_reference.class);
		classes.put("TypeGraph_classes_7_reference",TypeGraph_classes_7_reference.class);
		classes.put("TypeToTAbstractType_target_9_reference",TypeToTAbstractType_target_9_reference.class);
		classes.put("TypeToTAbstractType_source_14_reference",TypeToTAbstractType_source_14_reference.class);
		classes.put("Model_orphanTypes_7_reference",Model_orphanTypes_7_reference.class);
		classes.put("PrimitiveTypeToTClass_source_5_reference",PrimitiveTypeToTClass_source_5_reference.class);
		classes.put("PrimitiveTypeToTClass_target_6_reference",PrimitiveTypeToTClass_target_6_reference.class);
		classes.put("TClass_pg_11_reference",TClass_pg_11_reference.class);
		classes.put("TypeGraph_classes_8_reference",TypeGraph_classes_8_reference.class);
		classes.put("TypeToTAbstractType_target_10_reference",TypeToTAbstractType_target_10_reference.class);
		classes.put("TypeToTAbstractType_source_15_reference",TypeToTAbstractType_source_15_reference.class);
		classes.put("Model_orphanTypes_8_reference",Model_orphanTypes_8_reference.class);
		classes.put("PrimitiveTypeToTClass_source_6_reference",PrimitiveTypeToTClass_source_6_reference.class);
		classes.put("PrimitiveTypeToTClass_target_7_reference",PrimitiveTypeToTClass_target_7_reference.class);
		classes.put("TClass_pg_12_reference",TClass_pg_12_reference.class);
		classes.put("TypeGraph_classes_9_reference",TypeGraph_classes_9_reference.class);
		classes.put("TypeToTAbstractType_target_11_reference",TypeToTAbstractType_target_11_reference.class);
		classes.put("TypeToTAbstractType_source_16_reference",TypeToTAbstractType_source_16_reference.class);
		classes.put("Model_orphanTypes_9_reference",Model_orphanTypes_9_reference.class);
		classes.put("PrimitiveTypeToTClass_source_7_reference",PrimitiveTypeToTClass_source_7_reference.class);
		classes.put("PrimitiveTypeToTClass_target_8_reference",PrimitiveTypeToTClass_target_8_reference.class);
		classes.put("TClass_pg_13_reference",TClass_pg_13_reference.class);
		classes.put("TypeGraph_classes_10_reference",TypeGraph_classes_10_reference.class);
		classes.put("TypeToTAbstractType_target_12_reference",TypeToTAbstractType_target_12_reference.class);
		classes.put("TypeToTAbstractType_source_17_reference",TypeToTAbstractType_source_17_reference.class);
		classes.put("Model_orphanTypes_10_reference",Model_orphanTypes_10_reference.class);
		classes.put("PrimitiveTypeToTClass_source_8_reference",PrimitiveTypeToTClass_source_8_reference.class);
		classes.put("TMethodDefinition_returnType_0_reference",TMethodDefinition_returnType_0_reference.class);
		classes.put("MMethodDefinition_returnType_1_reference",MMethodDefinition_returnType_1_reference.class);
		classes.put("MMethodSignature_returnType_0_reference",MMethodSignature_returnType_0_reference.class);
		classes.put("TMethodSignature_returnType_0_reference",TMethodSignature_returnType_0_reference.class);
		classes.put("AbstractMethodInvocationToTAccess_source_3_reference",AbstractMethodInvocationToTAccess_source_3_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_13_reference",MAbstractFlowElementToTAbstractFlowElement_source_13_reference.class);
		classes.put("MDefinition_mMethodInvocations_4_reference",MDefinition_mMethodInvocations_4_reference.class);
		classes.put("MAbstractMethodDefinition_usages_4_reference",MAbstractMethodDefinition_usages_4_reference.class);
		classes.put("AbstractMethodInvocationToTAccess_source_4_reference",AbstractMethodInvocationToTAccess_source_4_reference.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_source_14_reference",MAbstractFlowElementToTAbstractFlowElement_source_14_reference.class);
		classes.put("MDefinition_mMethodInvocations_5_reference",MDefinition_mMethodInvocations_5_reference.class);
		classes.put("MAbstractMethodDefinition_usages_5_reference",MAbstractMethodDefinition_usages_5_reference.class);
		classes.put("MSyntethicMethodToTSyntethicMethod_source_0_reference",MSyntethicMethodToTSyntethicMethod_source_0_reference.class);
		classes.put("MSyntethicMethodToTSyntethicMethod_target_0_reference",MSyntethicMethodToTSyntethicMethod_target_0_reference.class);
		classes.put("TMethodDefinition_syntethicMethods_0_reference",TMethodDefinition_syntethicMethods_0_reference.class);
		classes.put("TSyntethicMethod_signature_3_reference",TSyntethicMethod_signature_3_reference.class);
		classes.put("TClass_defines_5_reference",TClass_defines_5_reference.class);
		classes.put("ClassDeclaration_bodyDeclarations_11_reference",ClassDeclaration_bodyDeclarations_11_reference.class);
		classes.put("MMethodDefinition_syntheticMethodDefinitions_0_reference",MMethodDefinition_syntheticMethodDefinitions_0_reference.class);
		classes.put("MDefinition_comments_0_reference",MDefinition_comments_0_reference.class);
		classes.put("TMember_tAnnotation_3_reference",TMember_tAnnotation_3_reference.class);
		classes.put("LineCommentToTTextAnnotation_source_0_reference",LineCommentToTTextAnnotation_source_0_reference.class);
		classes.put("LineCommentToTTextAnnotation_target_0_reference",LineCommentToTTextAnnotation_target_0_reference.class);
		classes.put("MGravityModel_typeParameters_0_reference",MGravityModel_typeParameters_0_reference.class);
		classes.put("TypeToTAbstractType_source_18_reference",TypeToTAbstractType_source_18_reference.class);
		classes.put("TypeToTAbstractType_target_13_reference",TypeToTAbstractType_target_13_reference.class);
		classes.put("TypeGraph_classes_11_reference",TypeGraph_classes_11_reference.class);
		classes.put("TClass_pg_14_reference",TClass_pg_14_reference.class);
		classes.put("Model_orphanTypes_11_reference",Model_orphanTypes_11_reference.class);
		classes.put("AbstractTypeDeclaration_modifier_1_reference",AbstractTypeDeclaration_modifier_1_reference.class);
		classes.put("MGravityModel_unresolvedItems_0_reference",MGravityModel_unresolvedItems_0_reference.class);
		classes.put("TUnresolvedType_pg_15_reference",TUnresolvedType_pg_15_reference.class);
		classes.put("TypeToTAbstractType_source_19_reference",TypeToTAbstractType_source_19_reference.class);
		classes.put("TypeToTAbstractType_target_14_reference",TypeToTAbstractType_target_14_reference.class);
		classes.put("VariableDeclarationFragmentToTFieldDefinition_source_0_reference",VariableDeclarationFragmentToTFieldDefinition_source_0_reference.class);
		classes.put("VariableDeclarationFragmentToTFieldDefinition_target_0_reference",VariableDeclarationFragmentToTFieldDefinition_target_0_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("AnnotationToTAnnotation_object",AnnotationToTAnnotation_object.class);
		classes.put("AnnotationMemberValuePairToTAnnotationValue_object",AnnotationMemberValuePairToTAnnotationValue_object.class);
		classes.put("BodyDeclaration_object",BodyDeclaration_object.class);
		classes.put("TAnnotatable_object",TAnnotatable_object.class);
		classes.put("TBoolNode_object",TBoolNode_object.class);
		classes.put("BooleanLiteral_object",BooleanLiteral_object.class);
		classes.put("BooleanLiteralToTBoolNode_object",BooleanLiteralToTBoolNode_object.class);
		classes.put("ClassLiteralToClassNode_object",ClassLiteralToClassNode_object.class);
		classes.put("TypeLiteral_object",TypeLiteral_object.class);
		classes.put("TClassNode_object",TClassNode_object.class);
		classes.put("ArrayType_object",ArrayType_object.class);
		classes.put("MethodDeclaration_object",MethodDeclaration_object.class);
		classes.put("TNumberNode_object",TNumberNode_object.class);
		classes.put("NumberLiteral_object",NumberLiteral_object.class);
		classes.put("NumberLiteralToTNumberNode_object",NumberLiteralToTNumberNode_object.class);
		classes.put("TTextNode_object",TTextNode_object.class);
		classes.put("StringLiteral_object",StringLiteral_object.class);
		classes.put("StringLiteralToTTextNode_object",StringLiteralToTTextNode_object.class);
		classes.put("ClassInstanceCreation_object",ClassInstanceCreation_object.class);
		classes.put("PackageToTPackage_object",PackageToTPackage_object.class);
		classes.put("MAnonymous_object",MAnonymous_object.class);
		classes.put("MethodInvocation_object",MethodInvocation_object.class);
		classes.put("ModelToTypeGraph_object",ModelToTypeGraph_object.class);
		classes.put("ClassDeclarationToTClass_object",ClassDeclarationToTClass_object.class);
		classes.put("MClassInstanceCreation_object",MClassInstanceCreation_object.class);
		classes.put("MConstructorDefinition_object",MConstructorDefinition_object.class);
		classes.put("TConstructor_object",TConstructor_object.class);
		classes.put("ConstructorInvocation_object",ConstructorInvocation_object.class);
		classes.put("TEnum_object",TEnum_object.class);
		classes.put("TReadWrite_object",TReadWrite_object.class);
		classes.put("TRead_object",TRead_object.class);
		classes.put("TWrite_object",TWrite_object.class);
		classes.put("MFieldName_object",MFieldName_object.class);
		classes.put("TField_object",TField_object.class);
		classes.put("MFieldNameToTField_object",MFieldNameToTField_object.class);
		classes.put("MAbstractFlowElement_object",MAbstractFlowElement_object.class);
		classes.put("MFlow_object",MFlow_object.class);
		classes.put("TAbstractFlowElement_object",TAbstractFlowElement_object.class);
		classes.put("TFlow_object",TFlow_object.class);
		classes.put("MFlowToTFlow_object",MFlowToTFlow_object.class);
		classes.put("InterfaceDeclarationToTInterface_object",InterfaceDeclarationToTInterface_object.class);
		classes.put("MModifierToTModifier_object",MModifierToTModifier_object.class);
		classes.put("TModifier_object",TModifier_object.class);
		classes.put("Modifier_object",Modifier_object.class);
		classes.put("TSignature_object",TSignature_object.class);
		classes.put("MSignature_object",MSignature_object.class);
		classes.put("MMethodNameToTMethod_object",MMethodNameToTMethod_object.class);
		classes.put("TMethod_object",TMethod_object.class);
		classes.put("MMethodName_object",MMethodName_object.class);
		classes.put("MEntryToTParameter_object",MEntryToTParameter_object.class);
		classes.put("ParameterizedType_object",ParameterizedType_object.class);
		classes.put("PrimitiveTypeBoolean_object",PrimitiveTypeBoolean_object.class);
		classes.put("PrimitiveTypeByte_object",PrimitiveTypeByte_object.class);
		classes.put("PrimitiveTypeChar_object",PrimitiveTypeChar_object.class);
		classes.put("PrimitiveTypeDouble_object",PrimitiveTypeDouble_object.class);
		classes.put("PrimitiveTypeFloat_object",PrimitiveTypeFloat_object.class);
		classes.put("PrimitiveTypeInt_object",PrimitiveTypeInt_object.class);
		classes.put("PrimitiveTypeLong_object",PrimitiveTypeLong_object.class);
		classes.put("PrimitiveTypeShort_object",PrimitiveTypeShort_object.class);
		classes.put("PrimitiveTypeVoid_object",PrimitiveTypeVoid_object.class);
		classes.put("SuperConstructorInvocation_object",SuperConstructorInvocation_object.class);
		classes.put("MSuperMethodInvocation_object",MSuperMethodInvocation_object.class);
		classes.put("MSyntethicMethodToTSyntethicMethod_object",MSyntethicMethodToTSyntethicMethod_object.class);
		classes.put("MSyntheticMethodDefinition_object",MSyntheticMethodDefinition_object.class);
		classes.put("TSyntethicMethod_object",TSyntethicMethod_object.class);
		classes.put("LineComment_object",LineComment_object.class);
		classes.put("TTextAnnotation_object",TTextAnnotation_object.class);
		classes.put("LineCommentToTTextAnnotation_object",LineCommentToTTextAnnotation_object.class);
		classes.put("TypeParameter_object",TypeParameter_object.class);
		classes.put("UnresolvedTypeDeclaration_object",UnresolvedTypeDeclaration_object.class);
		classes.put("TUnresolvedType_object",TUnresolvedType_object.class);
		classes.put("VariableDeclarationFragmentToTFieldDefinition_object",VariableDeclarationFragmentToTFieldDefinition_object.class);
		classes.put("Annotation_object_SP0",Annotation_object_SP0.class);
		classes.put("Annotation_object_SP1",Annotation_object_SP1.class);
		classes.put("AnnotationMemberValuePair_object_SP0",AnnotationMemberValuePair_object_SP0.class);
		classes.put("AnnotationMemberValuePair_object_SP1",AnnotationMemberValuePair_object_SP1.class);
		classes.put("TAnnotation_object_SP0",TAnnotation_object_SP0.class);
		classes.put("TAnnotation_object_SP1",TAnnotation_object_SP1.class);
		classes.put("TAnnotationValue_object_SP0",TAnnotationValue_object_SP0.class);
		classes.put("TAnnotationValue_object_SP1",TAnnotationValue_object_SP1.class);
		classes.put("ArrayInitializer_object_SP0",ArrayInitializer_object_SP0.class);
		classes.put("ArrayInitializer_object_SP1",ArrayInitializer_object_SP1.class);
		classes.put("TAbstractType_object_SP0",TAbstractType_object_SP0.class);
		classes.put("TAbstractType_object_SP1",TAbstractType_object_SP1.class);
		classes.put("TAbstractType_object_SP2",TAbstractType_object_SP2.class);
		classes.put("TAbstractType_object_SP3",TAbstractType_object_SP3.class);
		classes.put("TAbstractType_object_SP4",TAbstractType_object_SP4.class);
		classes.put("TypeToTAbstractType_object_SP0",TypeToTAbstractType_object_SP0.class);
		classes.put("TypeToTAbstractType_object_SP1",TypeToTAbstractType_object_SP1.class);
		classes.put("TypeToTAbstractType_object_SP2",TypeToTAbstractType_object_SP2.class);
		classes.put("TypeToTAbstractType_object_SP3",TypeToTAbstractType_object_SP3.class);
		classes.put("TypeToTAbstractType_object_SP4",TypeToTAbstractType_object_SP4.class);
		classes.put("TypeToTAbstractType_object_SP5",TypeToTAbstractType_object_SP5.class);
		classes.put("TypeToTAbstractType_object_SP6",TypeToTAbstractType_object_SP6.class);
		classes.put("TypeToTAbstractType_object_SP7",TypeToTAbstractType_object_SP7.class);
		classes.put("TypeToTAbstractType_object_SP8",TypeToTAbstractType_object_SP8.class);
		classes.put("Type_object_SP0",Type_object_SP0.class);
		classes.put("Type_object_SP1",Type_object_SP1.class);
		classes.put("TypeAccess_object_SP0",TypeAccess_object_SP0.class);
		classes.put("TypeAccess_object_SP1",TypeAccess_object_SP1.class);
		classes.put("TypeAccess_object_SP2",TypeAccess_object_SP2.class);
		classes.put("TypeAccess_object_SP3",TypeAccess_object_SP3.class);
		classes.put("AbstractTypeDeclaration_object_SP0",AbstractTypeDeclaration_object_SP0.class);
		classes.put("AbstractTypeDeclaration_object_SP1",AbstractTypeDeclaration_object_SP1.class);
		classes.put("AbstractTypeDeclaration_object_SP2",AbstractTypeDeclaration_object_SP2.class);
		classes.put("ClassDeclaration_object_SP0",ClassDeclaration_object_SP0.class);
		classes.put("ClassDeclaration_object_SP1",ClassDeclaration_object_SP1.class);
		classes.put("ASTNodeToTAnnotatable_object_SP0",ASTNodeToTAnnotatable_object_SP0.class);
		classes.put("ASTNodeToTAnnotatable_object_SP1",ASTNodeToTAnnotatable_object_SP1.class);
		classes.put("ASTNodeToTAnnotatable_object_SP2",ASTNodeToTAnnotatable_object_SP2.class);
		classes.put("ASTNodeToTAnnotatable_object_SP3",ASTNodeToTAnnotatable_object_SP3.class);
		classes.put("TAnnotationType_object_SP0",TAnnotationType_object_SP0.class);
		classes.put("TAnnotationType_object_SP1",TAnnotationType_object_SP1.class);
		classes.put("TAnnotationType_object_SP2",TAnnotationType_object_SP2.class);
		classes.put("AnnotationTypeDeclaration_object_SP0",AnnotationTypeDeclaration_object_SP0.class);
		classes.put("AnnotationTypeDeclaration_object_SP1",AnnotationTypeDeclaration_object_SP1.class);
		classes.put("TypeGraph_object_SP0",TypeGraph_object_SP0.class);
		classes.put("TypeGraph_object_SP1",TypeGraph_object_SP1.class);
		classes.put("TypeGraph_object_SP2",TypeGraph_object_SP2.class);
		classes.put("TypeGraph_object_SP3",TypeGraph_object_SP3.class);
		classes.put("TypeGraph_object_SP4",TypeGraph_object_SP4.class);
		classes.put("TypeGraph_object_SP5",TypeGraph_object_SP5.class);
		classes.put("TypeGraph_object_SP6",TypeGraph_object_SP6.class);
		classes.put("TypeGraph_object_SP7",TypeGraph_object_SP7.class);
		classes.put("TypeGraph_object_SP8",TypeGraph_object_SP8.class);
		classes.put("TClass_object_SP0",TClass_object_SP0.class);
		classes.put("TClass_object_SP1",TClass_object_SP1.class);
		classes.put("TClass_object_SP2",TClass_object_SP2.class);
		classes.put("TClass_object_SP3",TClass_object_SP3.class);
		classes.put("TClass_object_SP4",TClass_object_SP4.class);
		classes.put("TClass_object_SP5",TClass_object_SP5.class);
		classes.put("TClass_object_SP6",TClass_object_SP6.class);
		classes.put("TClass_object_SP7",TClass_object_SP7.class);
		classes.put("TClass_object_SP8",TClass_object_SP8.class);
		classes.put("TClass_object_SP9",TClass_object_SP9.class);
		classes.put("TClass_object_SP10",TClass_object_SP10.class);
		classes.put("TClass_object_SP11",TClass_object_SP11.class);
		classes.put("TClass_object_SP12",TClass_object_SP12.class);
		classes.put("TClass_object_SP13",TClass_object_SP13.class);
		classes.put("TClass_object_SP14",TClass_object_SP14.class);
		classes.put("TClass_object_SP15",TClass_object_SP15.class);
		classes.put("TClass_object_SP16",TClass_object_SP16.class);
		classes.put("AnonymousClassDeclarationToTClass_object_SP0",AnonymousClassDeclarationToTClass_object_SP0.class);
		classes.put("AnonymousClassDeclarationToTClass_object_SP1",AnonymousClassDeclarationToTClass_object_SP1.class);
		classes.put("AnonymousClassDeclaration_object_SP0",AnonymousClassDeclaration_object_SP0.class);
		classes.put("AnonymousClassDeclaration_object_SP1",AnonymousClassDeclaration_object_SP1.class);
		classes.put("TPackage_object_SP0",TPackage_object_SP0.class);
		classes.put("TPackage_object_SP1",TPackage_object_SP1.class);
		classes.put("TPackage_object_SP2",TPackage_object_SP2.class);
		classes.put("Package_object_SP0",Package_object_SP0.class);
		classes.put("Package_object_SP1",Package_object_SP1.class);
		classes.put("TInterface_object_SP0",TInterface_object_SP0.class);
		classes.put("TInterface_object_SP1",TInterface_object_SP1.class);
		classes.put("TInterface_object_SP2",TInterface_object_SP2.class);
		classes.put("TInterface_object_SP3",TInterface_object_SP3.class);
		classes.put("Model_object_SP0",Model_object_SP0.class);
		classes.put("Model_object_SP1",Model_object_SP1.class);
		classes.put("Model_object_SP2",Model_object_SP2.class);
		classes.put("Model_object_SP3",Model_object_SP3.class);
		classes.put("MClass_object_SP0",MClass_object_SP0.class);
		classes.put("MClass_object_SP1",MClass_object_SP1.class);
		classes.put("MAbstractMethodDefinition_object_SP0",MAbstractMethodDefinition_object_SP0.class);
		classes.put("MAbstractMethodDefinition_object_SP1",MAbstractMethodDefinition_object_SP1.class);
		classes.put("MAbstractMethodDefinition_object_SP2",MAbstractMethodDefinition_object_SP2.class);
		classes.put("AbstractMethodInvocationToTAccess_object_SP0",AbstractMethodInvocationToTAccess_object_SP0.class);
		classes.put("AbstractMethodInvocationToTAccess_object_SP1",AbstractMethodInvocationToTAccess_object_SP1.class);
		classes.put("TCall_object_SP0",TCall_object_SP0.class);
		classes.put("TCall_object_SP1",TCall_object_SP1.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_object_SP0",MAbstractFlowElementToTAbstractFlowElement_object_SP0.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_object_SP1",MAbstractFlowElementToTAbstractFlowElement_object_SP1.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_object_SP2",MAbstractFlowElementToTAbstractFlowElement_object_SP2.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_object_SP3",MAbstractFlowElementToTAbstractFlowElement_object_SP3.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_object_SP4",MAbstractFlowElementToTAbstractFlowElement_object_SP4.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_object_SP5",MAbstractFlowElementToTAbstractFlowElement_object_SP5.class);
		classes.put("MAbstractFlowElementToTAbstractFlowElement_object_SP6",MAbstractFlowElementToTAbstractFlowElement_object_SP6.class);
		classes.put("MDefinitionToTMember_object_SP0",MDefinitionToTMember_object_SP0.class);
		classes.put("MDefinitionToTMember_object_SP1",MDefinitionToTMember_object_SP1.class);
		classes.put("MDefinition_object_SP0",MDefinition_object_SP0.class);
		classes.put("MDefinition_object_SP1",MDefinition_object_SP1.class);
		classes.put("MDefinition_object_SP2",MDefinition_object_SP2.class);
		classes.put("MDefinition_object_SP3",MDefinition_object_SP3.class);
		classes.put("MDefinition_object_SP4",MDefinition_object_SP4.class);
		classes.put("TMember_object_SP0",TMember_object_SP0.class);
		classes.put("TMember_object_SP1",TMember_object_SP1.class);
		classes.put("TMember_object_SP2",TMember_object_SP2.class);
		classes.put("TMember_object_SP3",TMember_object_SP3.class);
		classes.put("TMethodDefinition_object_SP0",TMethodDefinition_object_SP0.class);
		classes.put("TMethodDefinition_object_SP1",TMethodDefinition_object_SP1.class);
		classes.put("TMethodDefinition_object_SP2",TMethodDefinition_object_SP2.class);
		classes.put("TMethodSignature_object_SP0",TMethodSignature_object_SP0.class);
		classes.put("TMethodSignature_object_SP1",TMethodSignature_object_SP1.class);
		classes.put("MSignatureToTSignature_object_SP0",MSignatureToTSignature_object_SP0.class);
		classes.put("MSignatureToTSignature_object_SP1",MSignatureToTSignature_object_SP1.class);
		classes.put("MMethodSignature_object_SP0",MMethodSignature_object_SP0.class);
		classes.put("MMethodSignature_object_SP1",MMethodSignature_object_SP1.class);
		classes.put("EnumDeclaration_object_SP0",EnumDeclaration_object_SP0.class);
		classes.put("EnumDeclaration_object_SP1",EnumDeclaration_object_SP1.class);
		classes.put("MFieldDefinition_object_SP0",MFieldDefinition_object_SP0.class);
		classes.put("MFieldDefinition_object_SP1",MFieldDefinition_object_SP1.class);
		classes.put("TFieldDefinition_object_SP0",TFieldDefinition_object_SP0.class);
		classes.put("TFieldDefinition_object_SP1",TFieldDefinition_object_SP1.class);
		classes.put("TFieldDefinition_object_SP2",TFieldDefinition_object_SP2.class);
		classes.put("VariableDeclarationFragment_object_SP0",VariableDeclarationFragment_object_SP0.class);
		classes.put("VariableDeclarationFragment_object_SP1",VariableDeclarationFragment_object_SP1.class);
		classes.put("MSingleVariableAccessToTAccess_object_SP0",MSingleVariableAccessToTAccess_object_SP0.class);
		classes.put("MSingleVariableAccessToTAccess_object_SP1",MSingleVariableAccessToTAccess_object_SP1.class);
		classes.put("MSingleVariableAccess_object_SP0",MSingleVariableAccess_object_SP0.class);
		classes.put("MSingleVariableAccess_object_SP1",MSingleVariableAccess_object_SP1.class);
		classes.put("MSingleVariableAccess_object_SP2",MSingleVariableAccess_object_SP2.class);
		classes.put("MSingleVariableAccess_object_SP3",MSingleVariableAccess_object_SP3.class);
		classes.put("MFieldSignature_object_SP0",MFieldSignature_object_SP0.class);
		classes.put("MFieldSignature_object_SP1",MFieldSignature_object_SP1.class);
		classes.put("TFieldSignature_object_SP0",TFieldSignature_object_SP0.class);
		classes.put("TFieldSignature_object_SP1",TFieldSignature_object_SP1.class);
		classes.put("MGravityModel_object_SP0",MGravityModel_object_SP0.class);
		classes.put("MGravityModel_object_SP1",MGravityModel_object_SP1.class);
		classes.put("InterfaceDeclaration_object_SP0",InterfaceDeclaration_object_SP0.class);
		classes.put("InterfaceDeclaration_object_SP1",InterfaceDeclaration_object_SP1.class);
		classes.put("InterfaceDeclaration_object_SP2",InterfaceDeclaration_object_SP2.class);
		classes.put("MMethodDefinition_object_SP0",MMethodDefinition_object_SP0.class);
		classes.put("MMethodDefinition_object_SP1",MMethodDefinition_object_SP1.class);
		classes.put("MMethodDefinition_object_SP2",MMethodDefinition_object_SP2.class);
		classes.put("MMethodInvocation_object_SP0",MMethodInvocation_object_SP0.class);
		classes.put("MMethodInvocation_object_SP1",MMethodInvocation_object_SP1.class);
		classes.put("MEntry_object_SP0",MEntry_object_SP0.class);
		classes.put("MEntry_object_SP1",MEntry_object_SP1.class);
		classes.put("TParameter_object_SP0",TParameter_object_SP0.class);
		classes.put("TParameter_object_SP1",TParameter_object_SP1.class);
		classes.put("PrimitiveTypeToTClass_object_SP0",PrimitiveTypeToTClass_object_SP0.class);
		classes.put("PrimitiveTypeToTClass_object_SP1",PrimitiveTypeToTClass_object_SP1.class);
		classes.put("PrimitiveTypeToTClass_object_SP2",PrimitiveTypeToTClass_object_SP2.class);
		classes.put("PrimitiveTypeToTClass_object_SP3",PrimitiveTypeToTClass_object_SP3.class);
		classes.put("PrimitiveTypeToTClass_object_SP4",PrimitiveTypeToTClass_object_SP4.class);
		
	}
	
	public void initializeReferenceNodes() {
		name2initRefGen.put("Annotation_values_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Annotation,org.eclipse.modisco.java.AnnotationMemberValuePair>(name2actor, name2node.get("Annotation_values_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.Annotation, null, (o) -> o.getValues(), false));
		name2initRefGen.put("AnnotationToTAnnotation_source_0_reference", new InitGenReferenceActor<ModiscoTGG.AnnotationToTAnnotation,org.eclipse.modisco.java.Annotation>(name2actor, name2node.get("AnnotationToTAnnotation_source_0_reference"), (o) -> o instanceof ModiscoTGG.AnnotationToTAnnotation, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AnnotationToTAnnotation_target_0_reference", new InitGenReferenceActor<ModiscoTGG.AnnotationToTAnnotation,org.gravity.typegraph.basic.annotations.TAnnotation>(name2actor, name2node.get("AnnotationToTAnnotation_target_0_reference"), (o) -> o instanceof ModiscoTGG.AnnotationToTAnnotation, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TAnnotation_tValues_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotation,org.gravity.typegraph.basic.annotations.TAnnotationValue>(name2actor, name2node.get("TAnnotation_tValues_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.annotations.TAnnotation, null, (o) -> o.getTValues(), false));
		name2initRefGen.put("AnnotationMemberValuePairToTAnnotationValue_source_0_reference", new InitGenReferenceActor<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue,org.eclipse.modisco.java.AnnotationMemberValuePair>(name2actor, name2node.get("AnnotationMemberValuePairToTAnnotationValue_source_0_reference"), (o) -> o instanceof ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AnnotationMemberValuePairToTAnnotationValue_target_0_reference", new InitGenReferenceActor<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue,org.gravity.typegraph.basic.annotations.TAnnotationValue>(name2actor, name2node.get("AnnotationMemberValuePairToTAnnotationValue_target_0_reference"), (o) -> o instanceof ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TAnnotationValue_tValue_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotationValue,org.eclipse.emf.ecore.EObject>(name2actor, name2node.get("TAnnotationValue_tValue_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.annotations.TAnnotationValue, null, (o) -> o.getTValue(), false));
		name2initRefGen.put("AnnotationMemberValuePair_value_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnnotationMemberValuePair,org.eclipse.modisco.java.Expression>(name2actor, name2node.get("AnnotationMemberValuePair_value_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnnotationMemberValuePair, (o) -> o.getValue(), null, false));
		name2initRefGen.put("ArrayInitializer_expressions_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.ArrayInitializer,org.eclipse.modisco.java.Expression>(name2actor, name2node.get("ArrayInitializer_expressions_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.ArrayInitializer, null, (o) -> o.getExpressions(), false));
		name2initRefGen.put("BodyDeclaration_annotations_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.BodyDeclaration,org.eclipse.modisco.java.Annotation>(name2actor, name2node.get("BodyDeclaration_annotations_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.BodyDeclaration, null, (o) -> o.getAnnotations(), false));
		name2initRefGen.put("TAnnotatable_tAnnotation_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotatable,org.gravity.typegraph.basic.annotations.TAnnotation>(name2actor, name2node.get("TAnnotatable_tAnnotation_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.annotations.TAnnotatable, null, (o) -> o.getTAnnotation(), false));
		name2initRefGen.put("AnnotationMemberValuePair_value_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnnotationMemberValuePair,org.eclipse.modisco.java.Expression>(name2actor, name2node.get("AnnotationMemberValuePair_value_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnnotationMemberValuePair, (o) -> o.getValue(), null, false));
		name2initRefGen.put("TAnnotationValue_tValue_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotationValue,org.eclipse.emf.ecore.EObject>(name2actor, name2node.get("TAnnotationValue_tValue_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.annotations.TAnnotationValue, null, (o) -> o.getTValue(), false));
		name2initRefGen.put("ArrayInitializer_expressions_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.ArrayInitializer,org.eclipse.modisco.java.Expression>(name2actor, name2node.get("ArrayInitializer_expressions_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.ArrayInitializer, null, (o) -> o.getExpressions(), false));
		name2initRefGen.put("BooleanLiteralToTBoolNode_source_0_reference", new InitGenReferenceActor<ModiscoTGG.BooleanLiteralToTBoolNode,org.eclipse.modisco.java.BooleanLiteral>(name2actor, name2node.get("BooleanLiteralToTBoolNode_source_0_reference"), (o) -> o instanceof ModiscoTGG.BooleanLiteralToTBoolNode, (o) -> o.getSource(), null, false));
		name2initRefGen.put("BooleanLiteralToTBoolNode_target_0_reference", new InitGenReferenceActor<ModiscoTGG.BooleanLiteralToTBoolNode,org.gravity.typegraph.basic.annotations.TBoolNode>(name2actor, name2node.get("BooleanLiteralToTBoolNode_target_0_reference"), (o) -> o instanceof ModiscoTGG.BooleanLiteralToTBoolNode, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AnnotationMemberValuePair_value_2_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnnotationMemberValuePair,org.eclipse.modisco.java.Expression>(name2actor, name2node.get("AnnotationMemberValuePair_value_2_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnnotationMemberValuePair, (o) -> o.getValue(), null, false));
		name2initRefGen.put("ClassLiteralToClassNode_source_0_reference", new InitGenReferenceActor<ModiscoTGG.ClassLiteralToClassNode,org.eclipse.modisco.java.TypeLiteral>(name2actor, name2node.get("ClassLiteralToClassNode_source_0_reference"), (o) -> o instanceof ModiscoTGG.ClassLiteralToClassNode, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ClassLiteralToClassNode_target_0_reference", new InitGenReferenceActor<ModiscoTGG.ClassLiteralToClassNode,org.gravity.typegraph.basic.annotations.TClassNode>(name2actor, name2node.get("ClassLiteralToClassNode_target_0_reference"), (o) -> o instanceof ModiscoTGG.ClassLiteralToClassNode, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TAnnotationValue_tValue_2_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotationValue,org.eclipse.emf.ecore.EObject>(name2actor, name2node.get("TAnnotationValue_tValue_2_reference"), (o) -> o instanceof org.gravity.typegraph.basic.annotations.TAnnotationValue, null, (o) -> o.getTValue(), false));
		name2initRefGen.put("TClassNode_tClass_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.annotations.TClassNode,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TClassNode_tClass_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.annotations.TClassNode, (o) -> o.getTClass(), null, false));
		name2initRefGen.put("ArrayInitializer_expressions_2_reference", new InitGenReferenceActor<org.eclipse.modisco.java.ArrayInitializer,org.eclipse.modisco.java.Expression>(name2actor, name2node.get("ArrayInitializer_expressions_2_reference"), (o) -> o instanceof org.eclipse.modisco.java.ArrayInitializer, null, (o) -> o.getExpressions(), false));
		name2initRefGen.put("TypeToTAbstractType_source_0_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_0_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TypeToTAbstractType_target_0_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_0_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("Type_usagesInTypeAccess_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Type,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("Type_usagesInTypeAccess_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.Type, null, (o) -> o.getUsagesInTypeAccess(), false));
		name2initRefGen.put("TypeLiteral_type_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.TypeLiteral,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("TypeLiteral_type_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.TypeLiteral, (o) -> o.getType(), null, false));
		name2initRefGen.put("AbstractTypeDeclaration_superInterfaces_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("AbstractTypeDeclaration_superInterfaces_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getSuperInterfaces(), false));
		name2initRefGen.put("Annotation_type_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Annotation,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("Annotation_type_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.Annotation, (o) -> o.getType(), null, false));
		name2initRefGen.put("ArrayType_elementType_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.ArrayType,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("ArrayType_elementType_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.ArrayType, (o) -> o.getElementType(), null, false));
		name2initRefGen.put("ClassDeclaration_superClass_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.ClassDeclaration,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("ClassDeclaration_superClass_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.ClassDeclaration, (o) -> o.getSuperClass(), null, false));
		name2initRefGen.put("MethodDeclaration_returnType_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.MethodDeclaration,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("MethodDeclaration_returnType_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.MethodDeclaration, (o) -> o.getReturnType(), null, false));
		name2initRefGen.put("AnnotationMemberValuePair_value_3_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnnotationMemberValuePair,org.eclipse.modisco.java.Expression>(name2actor, name2node.get("AnnotationMemberValuePair_value_3_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnnotationMemberValuePair, (o) -> o.getValue(), null, false));
		name2initRefGen.put("TAnnotationValue_tValue_3_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotationValue,org.eclipse.emf.ecore.EObject>(name2actor, name2node.get("TAnnotationValue_tValue_3_reference"), (o) -> o instanceof org.gravity.typegraph.basic.annotations.TAnnotationValue, null, (o) -> o.getTValue(), false));
		name2initRefGen.put("ArrayInitializer_expressions_3_reference", new InitGenReferenceActor<org.eclipse.modisco.java.ArrayInitializer,org.eclipse.modisco.java.Expression>(name2actor, name2node.get("ArrayInitializer_expressions_3_reference"), (o) -> o instanceof org.eclipse.modisco.java.ArrayInitializer, null, (o) -> o.getExpressions(), false));
		name2initRefGen.put("NumberLiteralToTNumberNode_source_0_reference", new InitGenReferenceActor<ModiscoTGG.NumberLiteralToTNumberNode,org.eclipse.modisco.java.NumberLiteral>(name2actor, name2node.get("NumberLiteralToTNumberNode_source_0_reference"), (o) -> o instanceof ModiscoTGG.NumberLiteralToTNumberNode, (o) -> o.getSource(), null, false));
		name2initRefGen.put("NumberLiteralToTNumberNode_target_0_reference", new InitGenReferenceActor<ModiscoTGG.NumberLiteralToTNumberNode,org.gravity.typegraph.basic.annotations.TNumberNode>(name2actor, name2node.get("NumberLiteralToTNumberNode_target_0_reference"), (o) -> o instanceof ModiscoTGG.NumberLiteralToTNumberNode, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AnnotationMemberValuePair_value_4_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnnotationMemberValuePair,org.eclipse.modisco.java.Expression>(name2actor, name2node.get("AnnotationMemberValuePair_value_4_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnnotationMemberValuePair, (o) -> o.getValue(), null, false));
		name2initRefGen.put("TAnnotationValue_tValue_4_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotationValue,org.eclipse.emf.ecore.EObject>(name2actor, name2node.get("TAnnotationValue_tValue_4_reference"), (o) -> o instanceof org.gravity.typegraph.basic.annotations.TAnnotationValue, null, (o) -> o.getTValue(), false));
		name2initRefGen.put("ArrayInitializer_expressions_4_reference", new InitGenReferenceActor<org.eclipse.modisco.java.ArrayInitializer,org.eclipse.modisco.java.Expression>(name2actor, name2node.get("ArrayInitializer_expressions_4_reference"), (o) -> o instanceof org.eclipse.modisco.java.ArrayInitializer, null, (o) -> o.getExpressions(), false));
		name2initRefGen.put("StringLiteralToTTextNode_source_0_reference", new InitGenReferenceActor<ModiscoTGG.StringLiteralToTTextNode,org.eclipse.modisco.java.StringLiteral>(name2actor, name2node.get("StringLiteralToTTextNode_source_0_reference"), (o) -> o instanceof ModiscoTGG.StringLiteralToTTextNode, (o) -> o.getSource(), null, false));
		name2initRefGen.put("StringLiteralToTTextNode_target_0_reference", new InitGenReferenceActor<ModiscoTGG.StringLiteralToTTextNode,org.gravity.typegraph.basic.annotations.TTextNode>(name2actor, name2node.get("StringLiteralToTTextNode_target_0_reference"), (o) -> o instanceof ModiscoTGG.StringLiteralToTTextNode, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AnnotationMemberValuePair_value_5_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnnotationMemberValuePair,org.eclipse.modisco.java.Expression>(name2actor, name2node.get("AnnotationMemberValuePair_value_5_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnnotationMemberValuePair, (o) -> o.getValue(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_source_0_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.eclipse.modisco.java.ASTNode>(name2actor, name2node.get("ASTNodeToTAnnotatable_source_0_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_target_0_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.gravity.typegraph.basic.annotations.TAnnotatable>(name2actor, name2node.get("ASTNodeToTAnnotatable_target_0_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TAnnotation_type_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotation,org.gravity.typegraph.basic.annotations.TAnnotationType>(name2actor, name2node.get("TAnnotation_type_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.annotations.TAnnotation, (o) -> o.getType(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_1_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_1_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TypeToTAbstractType_target_1_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_1_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AnnotationTypeDeclaration_usagesInTypeAccess_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Type,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("AnnotationTypeDeclaration_usagesInTypeAccess_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.Type, null, (o) -> o.getUsagesInTypeAccess(), false));
		name2initRefGen.put("ClassInstanceCreation_type_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.ClassInstanceCreation,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("ClassInstanceCreation_type_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.ClassInstanceCreation, (o) -> o.getType(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_target_1_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.gravity.typegraph.basic.annotations.TAnnotatable>(name2actor, name2node.get("ASTNodeToTAnnotatable_target_1_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeGraph_classes_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TAnnotationType_outerType_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TAnnotationType_outerType_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getOuterType(), null, true));
		name2initRefGen.put("TAnnotationType_pg_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TAnnotationType_pg_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TClass_pg_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("AnonymousClassDeclarationToTClass_source_0_reference", new InitGenReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass,org.eclipse.modisco.java.AnonymousClassDeclaration>(name2actor, name2node.get("AnonymousClassDeclarationToTClass_source_0_reference"), (o) -> o instanceof ModiscoTGG.AnonymousClassDeclarationToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AnonymousClassDeclarationToTClass_target_0_reference", new InitGenReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("AnonymousClassDeclarationToTClass_target_0_reference"), (o) -> o instanceof ModiscoTGG.AnonymousClassDeclarationToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_source_1_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.eclipse.modisco.java.ASTNode>(name2actor, name2node.get("ASTNodeToTAnnotatable_source_1_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AnonymousClassDeclaration_bodyDeclarations_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AnonymousClassDeclaration_bodyDeclarations_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnonymousClassDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TypeToTAbstractType_source_2_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_2_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AbstractTypeDeclaration_bodyDeclarations_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AbstractTypeDeclaration_bodyDeclarations_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TPackage_subpackage_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TPackage,org.gravity.typegraph.basic.TPackage>(name2actor, name2node.get("TPackage_subpackage_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TPackage, null, (o) -> o.getSubpackage(), true));
		name2initRefGen.put("TPackage_typeGraph_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TPackage,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TPackage_typeGraph_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TPackage, (o) -> o.getTypeGraph(), null, false));
		name2initRefGen.put("TAnnotationType_package_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TPackage>(name2actor, name2node.get("TAnnotationType_package_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPackage(), null, false));
		name2initRefGen.put("TAnnotationType_outerType_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TAnnotationType_outerType_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getOuterType(), null, true));
		name2initRefGen.put("TypeGraph_tAnnotationTypes_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.annotations.TAnnotationType>(name2actor, name2node.get("TypeGraph_tAnnotationTypes_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getTAnnotationTypes(), false));
		name2initRefGen.put("TAbstractType_package_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TPackage>(name2actor, name2node.get("TAbstractType_package_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPackage(), null, false));
		name2initRefGen.put("TAbstractType_pg_2_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TAbstractType_pg_2_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TPackage_pg_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TPackage,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TPackage_pg_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TPackage, (o) -> o.getPg(), null, false));
		name2initRefGen.put("AnnotationTypeDeclaration_package_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.Package>(name2actor, name2node.get("AnnotationTypeDeclaration_package_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, (o) -> o.getPackage(), null, false));
		name2initRefGen.put("PackageToTPackage_source_0_reference", new InitGenReferenceActor<ModiscoTGG.PackageToTPackage,org.eclipse.modisco.java.Package>(name2actor, name2node.get("PackageToTPackage_source_0_reference"), (o) -> o instanceof ModiscoTGG.PackageToTPackage, (o) -> o.getSource(), null, false));
		name2initRefGen.put("PackageToTPackage_target_0_reference", new InitGenReferenceActor<ModiscoTGG.PackageToTPackage,org.gravity.typegraph.basic.TPackage>(name2actor, name2node.get("PackageToTPackage_target_0_reference"), (o) -> o instanceof ModiscoTGG.PackageToTPackage, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TClass_parentClass_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TClass_parentClass_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TClass, (o) -> o.getParentClass(), null, true));
		name2initRefGen.put("AnonymousClassDeclarationToTClass_source_1_reference", new InitGenReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass,org.eclipse.modisco.java.AnonymousClassDeclaration>(name2actor, name2node.get("AnonymousClassDeclarationToTClass_source_1_reference"), (o) -> o instanceof ModiscoTGG.AnonymousClassDeclarationToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AnonymousClassDeclarationToTClass_target_1_reference", new InitGenReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("AnonymousClassDeclarationToTClass_target_1_reference"), (o) -> o instanceof ModiscoTGG.AnonymousClassDeclarationToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MAnonymous_classInstanceCreation_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration,org.eclipse.modisco.java.ClassInstanceCreation>(name2actor, name2node.get("MAnonymous_classInstanceCreation_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnonymousClassDeclaration, (o) -> o.getClassInstanceCreation(), null, false));
		name2initRefGen.put("AbstractTypeDeclaration_usagesInTypeAccess_2_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Type,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("AbstractTypeDeclaration_usagesInTypeAccess_2_reference"), (o) -> o instanceof org.eclipse.modisco.java.Type, null, (o) -> o.getUsagesInTypeAccess(), false));
		name2initRefGen.put("TypeToTAbstractType_target_2_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_2_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TClass_implements_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TClass,org.gravity.typegraph.basic.TInterface>(name2actor, name2node.get("TClass_implements_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TClass, null, (o) -> o.getImplements(), false));
		name2initRefGen.put("TypeToTAbstractType_target_3_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_3_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AnonymousClassDeclarationToTClass_target_2_reference", new InitGenReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("AnonymousClassDeclarationToTClass_target_2_reference"), (o) -> o instanceof ModiscoTGG.AnonymousClassDeclarationToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeGraph_classes_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TClass_outerType_2_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TClass_outerType_2_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getOuterType(), null, true));
		name2initRefGen.put("MAnonymous_mSourroundingType_0_reference", new InitGenReferenceActor<org.gravity.modisco.MAnonymous,org.eclipse.modisco.java.AbstractTypeDeclaration>(name2actor, name2node.get("MAnonymous_mSourroundingType_0_reference"), (o) -> o instanceof org.gravity.modisco.MAnonymous, (o) -> o.getMSourroundingType(), null, false));
		name2initRefGen.put("TClass_package_2_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TPackage>(name2actor, name2node.get("TClass_package_2_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPackage(), null, false));
		name2initRefGen.put("TClass_pg_3_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_3_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TPackage_classes_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TPackage,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TPackage_classes_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TPackage, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("ArrayInitializer_expressions_5_reference", new InitGenReferenceActor<org.eclipse.modisco.java.ArrayInitializer,org.eclipse.modisco.java.Expression>(name2actor, name2node.get("ArrayInitializer_expressions_5_reference"), (o) -> o instanceof org.eclipse.modisco.java.ArrayInitializer, null, (o) -> o.getExpressions(), false));
		name2initRefGen.put("Model_orphanTypes_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Type>(name2actor, name2node.get("Model_orphanTypes_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOrphanTypes(), false));
		name2initRefGen.put("ModelToTypeGraph_source_0_reference", new InitGenReferenceActor<ModiscoTGG.ModelToTypeGraph,org.eclipse.modisco.java.Model>(name2actor, name2node.get("ModelToTypeGraph_source_0_reference"), (o) -> o instanceof ModiscoTGG.ModelToTypeGraph, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ModelToTypeGraph_target_0_reference", new InitGenReferenceActor<ModiscoTGG.ModelToTypeGraph,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("ModelToTypeGraph_target_0_reference"), (o) -> o instanceof ModiscoTGG.ModelToTypeGraph, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_3_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_3_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TClass_parentClass_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TClass_parentClass_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TClass, (o) -> o.getParentClass(), null, true));
		name2initRefGen.put("ClassDeclarationToTClass_source_0_reference", new InitGenReferenceActor<ModiscoTGG.ClassDeclarationToTClass,org.eclipse.modisco.java.ClassDeclaration>(name2actor, name2node.get("ClassDeclarationToTClass_source_0_reference"), (o) -> o instanceof ModiscoTGG.ClassDeclarationToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ClassDeclarationToTClass_target_0_reference", new InitGenReferenceActor<ModiscoTGG.ClassDeclarationToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("ClassDeclarationToTClass_target_0_reference"), (o) -> o instanceof ModiscoTGG.ClassDeclarationToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("ClassDeclaration_usagesInTypeAccess_3_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Type,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("ClassDeclaration_usagesInTypeAccess_3_reference"), (o) -> o instanceof org.eclipse.modisco.java.Type, null, (o) -> o.getUsagesInTypeAccess(), false));
		name2initRefGen.put("TClass_implements_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TClass,org.gravity.typegraph.basic.TInterface>(name2actor, name2node.get("TClass_implements_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TClass, null, (o) -> o.getImplements(), false));
		name2initRefGen.put("ClassDeclaration_superInterfaces_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("ClassDeclaration_superInterfaces_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getSuperInterfaces(), false));
		name2initRefGen.put("TypeToTAbstractType_source_4_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_4_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_source_2_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.eclipse.modisco.java.ASTNode>(name2actor, name2node.get("ASTNodeToTAnnotatable_source_2_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_target_2_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.gravity.typegraph.basic.annotations.TAnnotatable>(name2actor, name2node.get("ASTNodeToTAnnotatable_target_2_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AnonymousClassDeclaration_bodyDeclarations_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AnonymousClassDeclaration_bodyDeclarations_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnonymousClassDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("ClassDeclarationToTClass_source_1_reference", new InitGenReferenceActor<ModiscoTGG.ClassDeclarationToTClass,org.eclipse.modisco.java.ClassDeclaration>(name2actor, name2node.get("ClassDeclarationToTClass_source_1_reference"), (o) -> o instanceof ModiscoTGG.ClassDeclarationToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TClass_outerType_3_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TClass_outerType_3_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getOuterType(), null, true));
		name2initRefGen.put("AnonymousClassDeclaration_bodyDeclarations_2_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AnonymousClassDeclaration_bodyDeclarations_2_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnonymousClassDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("MAbstractMethodDefinition_mInnerTypes_0_reference", new InitGenReferenceActor<org.gravity.modisco.MAbstractMethodDefinition,org.eclipse.modisco.java.AbstractTypeDeclaration>(name2actor, name2node.get("MAbstractMethodDefinition_mInnerTypes_0_reference"), (o) -> o instanceof org.gravity.modisco.MAbstractMethodDefinition, null, (o) -> o.getMInnerTypes(), false));
		name2initRefGen.put("TClass_package_3_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TPackage>(name2actor, name2node.get("TClass_package_3_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPackage(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_5_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_5_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ClassDeclaration_bodyDeclarations_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("ClassDeclaration_bodyDeclarations_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("AbstractMethodInvocationToTAccess_source_0_reference", new InitGenReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("AbstractMethodInvocationToTAccess_source_0_reference"), (o) -> o instanceof ModiscoTGG.AbstractMethodInvocationToTAccess, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AbstractMethodInvocationToTAccess_target_0_reference", new InitGenReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess,org.gravity.typegraph.basic.TAccess>(name2actor, name2node.get("AbstractMethodInvocationToTAccess_target_0_reference"), (o) -> o instanceof ModiscoTGG.AbstractMethodInvocationToTAccess, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_0_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_target_0_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MDefinitionToTMember_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.modisco.MDefinition>(name2actor, name2node.get("MDefinitionToTMember_source_0_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MDefinitionToTMember_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("MDefinitionToTMember_target_0_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MDefinition_mMethodInvocations_0_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("MDefinition_mMethodInvocations_0_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, null, (o) -> o.getMMethodInvocations(), false));
		name2initRefGen.put("MAbstractMethodDefinition_usages_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractMethodDeclaration,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("MAbstractMethodDefinition_usages_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractMethodDeclaration, null, (o) -> o.getUsages(), false));
		name2initRefGen.put("MDefinitionToTMember_source_1_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.modisco.MDefinition>(name2actor, name2node.get("MDefinitionToTMember_source_1_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TCall_tSource_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAccess,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TCall_tSource_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAccess, (o) -> o.getTSource(), null, false));
		name2initRefGen.put("TCall_tTarget_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAccess,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TCall_tTarget_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAccess, (o) -> o.getTTarget(), null, false));
		name2initRefGen.put("MClass_package_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.Package>(name2actor, name2node.get("MClass_package_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, (o) -> o.getPackage(), null, false));
		name2initRefGen.put("MDefinitionToTMember_source_2_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.modisco.MDefinition>(name2actor, name2node.get("MDefinitionToTMember_source_2_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MDefinitionToTMember_target_1_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("MDefinitionToTMember_target_1_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_target_1_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_target_1_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TMethodDefinition_signature_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMember,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("TMethodDefinition_signature_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMember, (o) -> o.getSignature(), null, false));
		name2initRefGen.put("TMethodDefinition_tAnnotation_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotatable,org.gravity.typegraph.basic.annotations.TAnnotation>(name2actor, name2node.get("TMethodDefinition_tAnnotation_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.annotations.TAnnotatable, null, (o) -> o.getTAnnotation(), false));
		name2initRefGen.put("ASTNodeToTAnnotatable_source_3_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.eclipse.modisco.java.ASTNode>(name2actor, name2node.get("ASTNodeToTAnnotatable_source_3_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_target_3_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.gravity.typegraph.basic.annotations.TAnnotatable>(name2actor, name2node.get("ASTNodeToTAnnotatable_target_3_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MSignatureToTSignature_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MSignatureToTSignature,org.gravity.modisco.MSignature>(name2actor, name2node.get("MSignatureToTSignature_source_0_reference"), (o) -> o instanceof ModiscoTGG.MSignatureToTSignature, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MSignatureToTSignature_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MSignatureToTSignature,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("MSignatureToTSignature_target_0_reference"), (o) -> o instanceof ModiscoTGG.MSignatureToTSignature, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MConstructorDefinition_mSignature_0_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.gravity.modisco.MSignature>(name2actor, name2node.get("MConstructorDefinition_mSignature_0_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, (o) -> o.getMSignature(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_1_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_1_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AbstractMethodInvocationToTAccess_source_1_reference", new InitGenReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("AbstractMethodInvocationToTAccess_source_1_reference"), (o) -> o instanceof ModiscoTGG.AbstractMethodInvocationToTAccess, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_2_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_2_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MDefinition_mMethodInvocations_1_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("MDefinition_mMethodInvocations_1_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, null, (o) -> o.getMMethodInvocations(), false));
		name2initRefGen.put("MAbstractMethodDefinition_usages_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractMethodDeclaration,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("MAbstractMethodDefinition_usages_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractMethodDeclaration, null, (o) -> o.getUsages(), false));
		name2initRefGen.put("ASTNodeToTAnnotatable_source_4_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.eclipse.modisco.java.ASTNode>(name2actor, name2node.get("ASTNodeToTAnnotatable_source_4_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AnonymousClassDeclaration_bodyDeclarations_3_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AnonymousClassDeclaration_bodyDeclarations_3_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnonymousClassDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TypeToTAbstractType_source_6_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_6_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TClass_tAnnotation_2_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotatable,org.gravity.typegraph.basic.annotations.TAnnotation>(name2actor, name2node.get("TClass_tAnnotation_2_reference"), (o) -> o instanceof org.gravity.typegraph.basic.annotations.TAnnotatable, null, (o) -> o.getTAnnotation(), false));
		name2initRefGen.put("EnumDeclaration_package_2_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.Package>(name2actor, name2node.get("EnumDeclaration_package_2_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, (o) -> o.getPackage(), null, false));
		name2initRefGen.put("MDefinitionToTMember_source_3_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.modisco.MDefinition>(name2actor, name2node.get("MDefinitionToTMember_source_3_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MDefinitionToTMember_target_2_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("MDefinitionToTMember_target_2_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AbstractTypeDeclaration_bodyDeclarations_2_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AbstractTypeDeclaration_bodyDeclarations_2_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("VariableDeclarationFragment_variablesContainer_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.VariableDeclarationFragment,org.eclipse.modisco.java.AbstractVariablesContainer>(name2actor, name2node.get("VariableDeclarationFragment_variablesContainer_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.VariableDeclarationFragment, (o) -> o.getVariablesContainer(), null, false));
		name2initRefGen.put("TAbstractType_defines_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TAbstractType_defines_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, null, (o) -> o.getDefines(), false));
		name2initRefGen.put("TReadWrite_tTarget_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAccess,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TReadWrite_tTarget_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAccess, (o) -> o.getTTarget(), null, false));
		name2initRefGen.put("MSingleVariableAccessToTAccess_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MSingleVariableAccessToTAccess,org.gravity.modisco.MSingleVariableAccess>(name2actor, name2node.get("MSingleVariableAccessToTAccess_source_0_reference"), (o) -> o instanceof ModiscoTGG.MSingleVariableAccessToTAccess, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MSingleVariableAccessToTAccess_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MSingleVariableAccessToTAccess,org.gravity.typegraph.basic.TAccess>(name2actor, name2node.get("MSingleVariableAccessToTAccess_target_0_reference"), (o) -> o instanceof ModiscoTGG.MSingleVariableAccessToTAccess, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MSingleVariableAccess_variable_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.SingleVariableAccess,org.eclipse.modisco.java.VariableDeclaration>(name2actor, name2node.get("MSingleVariableAccess_variable_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.SingleVariableAccess, (o) -> o.getVariable(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_3_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_3_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_target_2_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_target_2_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TReadWrite_tSource_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAccess,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TReadWrite_tSource_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAccess, (o) -> o.getTSource(), null, false));
		name2initRefGen.put("MDefinition_mAbstractFieldAccess_0_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.gravity.modisco.MSingleVariableAccess>(name2actor, name2node.get("MDefinition_mAbstractFieldAccess_0_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, null, (o) -> o.getMAbstractFieldAccess(), false));
		name2initRefGen.put("MDefinition_mAbstractFieldAccess_1_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.gravity.modisco.MSingleVariableAccess>(name2actor, name2node.get("MDefinition_mAbstractFieldAccess_1_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, null, (o) -> o.getMAbstractFieldAccess(), false));
		name2initRefGen.put("TRead_tTarget_2_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAccess,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TRead_tTarget_2_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAccess, (o) -> o.getTTarget(), null, false));
		name2initRefGen.put("MSingleVariableAccessToTAccess_source_1_reference", new InitGenReferenceActor<ModiscoTGG.MSingleVariableAccessToTAccess,org.gravity.modisco.MSingleVariableAccess>(name2actor, name2node.get("MSingleVariableAccessToTAccess_source_1_reference"), (o) -> o instanceof ModiscoTGG.MSingleVariableAccessToTAccess, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MSingleVariableAccessToTAccess_target_1_reference", new InitGenReferenceActor<ModiscoTGG.MSingleVariableAccessToTAccess,org.gravity.typegraph.basic.TAccess>(name2actor, name2node.get("MSingleVariableAccessToTAccess_target_1_reference"), (o) -> o instanceof ModiscoTGG.MSingleVariableAccessToTAccess, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MSingleVariableAccess_variable_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.SingleVariableAccess,org.eclipse.modisco.java.VariableDeclaration>(name2actor, name2node.get("MSingleVariableAccess_variable_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.SingleVariableAccess, (o) -> o.getVariable(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_4_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_4_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_target_3_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_target_3_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TRead_tSource_2_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAccess,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TRead_tSource_2_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAccess, (o) -> o.getTSource(), null, false));
		name2initRefGen.put("MDefinition_mAbstractFieldAccess_2_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.gravity.modisco.MSingleVariableAccess>(name2actor, name2node.get("MDefinition_mAbstractFieldAccess_2_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, null, (o) -> o.getMAbstractFieldAccess(), false));
		name2initRefGen.put("TWrite_tTarget_3_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAccess,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TWrite_tTarget_3_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAccess, (o) -> o.getTTarget(), null, false));
		name2initRefGen.put("MSingleVariableAccessToTAccess_source_2_reference", new InitGenReferenceActor<ModiscoTGG.MSingleVariableAccessToTAccess,org.gravity.modisco.MSingleVariableAccess>(name2actor, name2node.get("MSingleVariableAccessToTAccess_source_2_reference"), (o) -> o instanceof ModiscoTGG.MSingleVariableAccessToTAccess, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MSingleVariableAccessToTAccess_target_2_reference", new InitGenReferenceActor<ModiscoTGG.MSingleVariableAccessToTAccess,org.gravity.typegraph.basic.TAccess>(name2actor, name2node.get("MSingleVariableAccessToTAccess_target_2_reference"), (o) -> o instanceof ModiscoTGG.MSingleVariableAccessToTAccess, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MSingleVariableAccess_variable_2_reference", new InitGenReferenceActor<org.eclipse.modisco.java.SingleVariableAccess,org.eclipse.modisco.java.VariableDeclaration>(name2actor, name2node.get("MSingleVariableAccess_variable_2_reference"), (o) -> o instanceof org.eclipse.modisco.java.SingleVariableAccess, (o) -> o.getVariable(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_5_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_5_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_target_4_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_target_4_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TWrite_tSource_3_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAccess,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TWrite_tSource_3_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAccess, (o) -> o.getTSource(), null, false));
		name2initRefGen.put("MDefinition_mAbstractFieldAccess_3_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.gravity.modisco.MSingleVariableAccess>(name2actor, name2node.get("MDefinition_mAbstractFieldAccess_3_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, null, (o) -> o.getMAbstractFieldAccess(), false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_6_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_6_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_target_5_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_target_5_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MFieldDefinition_mSignature_1_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.gravity.modisco.MSignature>(name2actor, name2node.get("MFieldDefinition_mSignature_1_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, (o) -> o.getMSignature(), null, false));
		name2initRefGen.put("MSignatureToTSignature_source_1_reference", new InitGenReferenceActor<ModiscoTGG.MSignatureToTSignature,org.gravity.modisco.MSignature>(name2actor, name2node.get("MSignatureToTSignature_source_1_reference"), (o) -> o instanceof ModiscoTGG.MSignatureToTSignature, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MSignatureToTSignature_target_1_reference", new InitGenReferenceActor<ModiscoTGG.MSignatureToTSignature,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("MSignatureToTSignature_target_1_reference"), (o) -> o instanceof ModiscoTGG.MSignatureToTSignature, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TFieldDefinition_signature_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMember,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("TFieldDefinition_signature_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMember, (o) -> o.getSignature(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_source_5_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.eclipse.modisco.java.ASTNode>(name2actor, name2node.get("ASTNodeToTAnnotatable_source_5_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_target_4_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.gravity.typegraph.basic.annotations.TAnnotatable>(name2actor, name2node.get("ASTNodeToTAnnotatable_target_4_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MGravityModel_mFieldNames_0_reference", new InitGenReferenceActor<org.gravity.modisco.MGravityModel,org.gravity.modisco.MFieldName>(name2actor, name2node.get("MGravityModel_mFieldNames_0_reference"), (o) -> o instanceof org.gravity.modisco.MGravityModel, null, (o) -> o.getMFieldNames(), false));
		name2initRefGen.put("ModelToTypeGraph_source_1_reference", new InitGenReferenceActor<ModiscoTGG.ModelToTypeGraph,org.eclipse.modisco.java.Model>(name2actor, name2node.get("ModelToTypeGraph_source_1_reference"), (o) -> o instanceof ModiscoTGG.ModelToTypeGraph, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TField_pg_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TField,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TField_pg_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TField, (o) -> o.getPg(), null, false));
		name2initRefGen.put("MFieldNameToTField_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MFieldNameToTField,org.gravity.modisco.MFieldName>(name2actor, name2node.get("MFieldNameToTField_source_0_reference"), (o) -> o instanceof ModiscoTGG.MFieldNameToTField, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MFieldNameToTField_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MFieldNameToTField,org.gravity.typegraph.basic.TField>(name2actor, name2node.get("MFieldNameToTField_target_0_reference"), (o) -> o instanceof ModiscoTGG.MFieldNameToTField, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TField_signatures_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TField,org.gravity.typegraph.basic.TFieldSignature>(name2actor, name2node.get("TField_signatures_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TField, null, (o) -> o.getSignatures(), false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_target_6_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_target_6_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MFieldName_mSignatures_0_reference", new InitGenReferenceActor<org.gravity.modisco.MName,org.gravity.modisco.MSignature>(name2actor, name2node.get("MFieldName_mSignatures_0_reference"), (o) -> o instanceof org.gravity.modisco.MName, null, (o) -> o.getMSignatures(), false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_7_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_7_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MFieldSignature_type_0_reference", new InitGenReferenceActor<org.gravity.modisco.MFieldSignature,org.eclipse.modisco.java.Type>(name2actor, name2node.get("MFieldSignature_type_0_reference"), (o) -> o instanceof org.gravity.modisco.MFieldSignature, (o) -> o.getType(), null, false));
		name2initRefGen.put("TFieldSignature_type_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TFieldSignature,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TFieldSignature_type_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TFieldSignature, (o) -> o.getType(), null, false));
		name2initRefGen.put("MAbstractFlowElement_ownedFlows_0_reference", new InitGenReferenceActor<org.gravity.modisco.MAbstractFlowElement,org.gravity.modisco.MFlow>(name2actor, name2node.get("MAbstractFlowElement_ownedFlows_0_reference"), (o) -> o instanceof org.gravity.modisco.MAbstractFlowElement, null, (o) -> o.getOwnedFlows(), false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_8_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_8_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_target_7_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_target_7_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TAbstractFlowElement_ownedFlows_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractFlowElement,org.gravity.typegraph.basic.TFlow>(name2actor, name2node.get("TAbstractFlowElement_ownedFlows_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractFlowElement, null, (o) -> o.getOwnedFlows(), false));
		name2initRefGen.put("MFlowToTFlow_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MFlowToTFlow,org.gravity.modisco.MFlow>(name2actor, name2node.get("MFlowToTFlow_source_0_reference"), (o) -> o instanceof ModiscoTGG.MFlowToTFlow, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MFlowToTFlow_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MFlowToTFlow,org.gravity.typegraph.basic.TFlow>(name2actor, name2node.get("MFlowToTFlow_target_0_reference"), (o) -> o instanceof ModiscoTGG.MFlowToTFlow, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MAbstractFlowElement_outgoingFlows_0_reference", new InitGenReferenceActor<org.gravity.modisco.MAbstractFlowElement,org.gravity.modisco.MFlow>(name2actor, name2node.get("MAbstractFlowElement_outgoingFlows_0_reference"), (o) -> o instanceof org.gravity.modisco.MAbstractFlowElement, null, (o) -> o.getOutgoingFlows(), false));
		name2initRefGen.put("TFlow_incomingFlows_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("TFlow_incomingFlows_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractFlowElement, null, (o) -> o.getIncomingFlows(), true));
		name2initRefGen.put("TInterface_parentInterfaces_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TInterface,org.gravity.typegraph.basic.TInterface>(name2actor, name2node.get("TInterface_parentInterfaces_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TInterface, null, (o) -> o.getParentInterfaces(), true));
		name2initRefGen.put("InterfaceDeclarationToTInterface_source_0_reference", new InitGenReferenceActor<ModiscoTGG.InterfaceDeclarationToTInterface,org.eclipse.modisco.java.InterfaceDeclaration>(name2actor, name2node.get("InterfaceDeclarationToTInterface_source_0_reference"), (o) -> o instanceof ModiscoTGG.InterfaceDeclarationToTInterface, (o) -> o.getSource(), null, false));
		name2initRefGen.put("InterfaceDeclarationToTInterface_target_0_reference", new InitGenReferenceActor<ModiscoTGG.InterfaceDeclarationToTInterface,org.gravity.typegraph.basic.TInterface>(name2actor, name2node.get("InterfaceDeclarationToTInterface_target_0_reference"), (o) -> o instanceof ModiscoTGG.InterfaceDeclarationToTInterface, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("InterfaceDeclaration_superInterfaces_2_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("InterfaceDeclaration_superInterfaces_2_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getSuperInterfaces(), false));
		name2initRefGen.put("InterfaceDeclaration_usagesInTypeAccess_4_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Type,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("InterfaceDeclaration_usagesInTypeAccess_4_reference"), (o) -> o instanceof org.eclipse.modisco.java.Type, null, (o) -> o.getUsagesInTypeAccess(), false));
		name2initRefGen.put("TypeToTAbstractType_source_7_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_7_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_source_6_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.eclipse.modisco.java.ASTNode>(name2actor, name2node.get("ASTNodeToTAnnotatable_source_6_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getSource(), null, false));
		name2initRefGen.put("ASTNodeToTAnnotatable_target_5_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.gravity.typegraph.basic.annotations.TAnnotatable>(name2actor, name2node.get("ASTNodeToTAnnotatable_target_5_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("AnonymousClassDeclaration_bodyDeclarations_4_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AnonymousClassDeclaration_bodyDeclarations_4_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnonymousClassDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TInterface_pg_4_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TInterface_pg_4_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TypeGraph_interfaces_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TInterface>(name2actor, name2node.get("TypeGraph_interfaces_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getInterfaces(), false));
		name2initRefGen.put("TInterface_outerType_4_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TInterface_outerType_4_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getOuterType(), null, true));
		name2initRefGen.put("TPackage_interfaces_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TPackage,org.gravity.typegraph.basic.TInterface>(name2actor, name2node.get("TPackage_interfaces_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TPackage, null, (o) -> o.getInterfaces(), false));
		name2initRefGen.put("TInterface_defines_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TInterface_defines_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, null, (o) -> o.getDefines(), false));
		name2initRefGen.put("MModifierToTModifier_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MModifierToTModifier,org.gravity.typegraph.basic.TModifier>(name2actor, name2node.get("MModifierToTModifier_target_0_reference"), (o) -> o instanceof ModiscoTGG.MModifierToTModifier, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TMember_tModifier_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMember,org.gravity.typegraph.basic.TModifier>(name2actor, name2node.get("TMember_tModifier_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMember, (o) -> o.getTModifier(), null, false));
		name2initRefGen.put("MDefinition_modifier_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.BodyDeclaration,org.eclipse.modisco.java.Modifier>(name2actor, name2node.get("MDefinition_modifier_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.BodyDeclaration, (o) -> o.getModifier(), null, false));
		name2initRefGen.put("MModifierToTModifier_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MModifierToTModifier,org.eclipse.modisco.java.Modifier>(name2actor, name2node.get("MModifierToTModifier_source_0_reference"), (o) -> o instanceof ModiscoTGG.MModifierToTModifier, (o) -> o.getSource(), null, false));
		name2initRefGen.put("InterfaceDeclaration_bodyDeclarations_3_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("InterfaceDeclaration_bodyDeclarations_3_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TAbstractType_tModifier_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TModifier>(name2actor, name2node.get("TAbstractType_tModifier_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getTModifier(), null, false));
		name2initRefGen.put("InterfaceDeclaration_package_3_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.Package>(name2actor, name2node.get("InterfaceDeclaration_package_3_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, (o) -> o.getPackage(), null, false));
		name2initRefGen.put("TInterface_package_4_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TPackage>(name2actor, name2node.get("TInterface_package_4_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPackage(), null, false));
		name2initRefGen.put("TMember_signature_2_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMember,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("TMember_signature_2_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMember, (o) -> o.getSignature(), null, false));
		name2initRefGen.put("TClass_defines_2_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TClass_defines_2_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, null, (o) -> o.getDefines(), false));
		name2initRefGen.put("TClass_signature_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("TClass_signature_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, null, (o) -> o.getSignature(), false));
		name2initRefGen.put("MSignatureToTSignature_target_2_reference", new InitGenReferenceActor<ModiscoTGG.MSignatureToTSignature,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("MSignatureToTSignature_target_2_reference"), (o) -> o instanceof ModiscoTGG.MSignatureToTSignature, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MDefinition_mSignature_2_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.gravity.modisco.MSignature>(name2actor, name2node.get("MDefinition_mSignature_2_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, (o) -> o.getMSignature(), null, false));
		name2initRefGen.put("MSignatureToTSignature_source_2_reference", new InitGenReferenceActor<ModiscoTGG.MSignatureToTSignature,org.gravity.modisco.MSignature>(name2actor, name2node.get("MSignatureToTSignature_source_2_reference"), (o) -> o instanceof ModiscoTGG.MSignatureToTSignature, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAnonymous_bodyDeclarations_5_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("MAnonymous_bodyDeclarations_5_reference"), (o) -> o instanceof org.eclipse.modisco.java.AnonymousClassDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TAbstractType_defines_3_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TAbstractType_defines_3_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, null, (o) -> o.getDefines(), false));
		name2initRefGen.put("TAbstractType_signature_1_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("TAbstractType_signature_1_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, null, (o) -> o.getSignature(), false));
		name2initRefGen.put("AbstractTypeDeclaration_bodyDeclarations_4_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AbstractTypeDeclaration_bodyDeclarations_4_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("AnnotationTypeDeclaration_bodyDeclarations_5_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AnnotationTypeDeclaration_bodyDeclarations_5_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TAnnotationType_defines_4_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TAnnotationType_defines_4_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, null, (o) -> o.getDefines(), false));
		name2initRefGen.put("ClassDeclaration_bodyDeclarations_6_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("ClassDeclaration_bodyDeclarations_6_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("EnumDeclaration_bodyDeclarations_7_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("EnumDeclaration_bodyDeclarations_7_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("ASTNodeToTAnnotatable_source_7_reference", new InitGenReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable,org.eclipse.modisco.java.ASTNode>(name2actor, name2node.get("ASTNodeToTAnnotatable_source_7_reference"), (o) -> o instanceof ModiscoTGG.ASTNodeToTAnnotatable, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MDefinitionToTMember_source_4_reference", new InitGenReferenceActor<ModiscoTGG.MDefinitionToTMember,org.gravity.modisco.MDefinition>(name2actor, name2node.get("MDefinitionToTMember_source_4_reference"), (o) -> o instanceof ModiscoTGG.MDefinitionToTMember, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MMethodDefinition_mSignature_3_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.gravity.modisco.MSignature>(name2actor, name2node.get("MMethodDefinition_mSignature_3_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, (o) -> o.getMSignature(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_9_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_9_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("AbstractMethodInvocationToTAccess_source_2_reference", new InitGenReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("AbstractMethodInvocationToTAccess_source_2_reference"), (o) -> o instanceof ModiscoTGG.AbstractMethodInvocationToTAccess, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_10_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_10_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TCall_tSource_4_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAccess,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TCall_tSource_4_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAccess, (o) -> o.getTSource(), null, false));
		name2initRefGen.put("TCall_tTarget_4_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAccess,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TCall_tTarget_4_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAccess, (o) -> o.getTTarget(), null, false));
		name2initRefGen.put("MMethodDefinition_mMethodInvocations_2_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("MMethodDefinition_mMethodInvocations_2_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, null, (o) -> o.getMMethodInvocations(), false));
		name2initRefGen.put("MMethodDefinition_usages_2_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractMethodDeclaration,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("MMethodDefinition_usages_2_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractMethodDeclaration, null, (o) -> o.getUsages(), false));
		name2initRefGen.put("MMethodInvocation_mStaticType_0_reference", new InitGenReferenceActor<org.gravity.modisco.MMethodInvocation,org.eclipse.modisco.java.Type>(name2actor, name2node.get("MMethodInvocation_mStaticType_0_reference"), (o) -> o instanceof org.gravity.modisco.MMethodInvocation, (o) -> o.getMStaticType(), null, false));
		name2initRefGen.put("TCall_staticType_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAccess,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TCall_staticType_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAccess, (o) -> o.getStaticType(), null, false));
		name2initRefGen.put("MDefinition_mMethodInvocations_3_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("MDefinition_mMethodInvocations_3_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, null, (o) -> o.getMMethodInvocations(), false));
		name2initRefGen.put("MAbstractMethodDefinition_usages_3_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractMethodDeclaration,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("MAbstractMethodDefinition_usages_3_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractMethodDeclaration, null, (o) -> o.getUsages(), false));
		name2initRefGen.put("MMethodNameToTMethod_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MMethodNameToTMethod,org.gravity.typegraph.basic.TMethod>(name2actor, name2node.get("MMethodNameToTMethod_target_0_reference"), (o) -> o instanceof ModiscoTGG.MMethodNameToTMethod, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TMethod_pg_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMethod,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TMethod_pg_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMethod, (o) -> o.getPg(), null, false));
		name2initRefGen.put("MGravityModel_mMethodNames_0_reference", new InitGenReferenceActor<org.gravity.modisco.MGravityModel,org.gravity.modisco.MMethodName>(name2actor, name2node.get("MGravityModel_mMethodNames_0_reference"), (o) -> o instanceof org.gravity.modisco.MGravityModel, null, (o) -> o.getMMethodNames(), false));
		name2initRefGen.put("MMethodNameToTMethod_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MMethodNameToTMethod,org.gravity.modisco.MMethodName>(name2actor, name2node.get("MMethodNameToTMethod_source_0_reference"), (o) -> o instanceof ModiscoTGG.MMethodNameToTMethod, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MMethodDefinition_redefinitions_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.MethodDeclaration,org.eclipse.modisco.java.MethodDeclaration>(name2actor, name2node.get("MMethodDefinition_redefinitions_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.MethodDeclaration, null, (o) -> o.getRedefinitions(), true));
		name2initRefGen.put("TMethodDefinition_overriding_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMethodDefinition,org.gravity.typegraph.basic.TMethodDefinition>(name2actor, name2node.get("TMethodDefinition_overriding_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMethodDefinition, (o) -> o.getOverriding(), null, true));
		name2initRefGen.put("MMethodSignature_mFirstEntry_0_reference", new InitGenReferenceActor<org.gravity.modisco.MParameterList,org.gravity.modisco.MEntry>(name2actor, name2node.get("MMethodSignature_mFirstEntry_0_reference"), (o) -> o instanceof org.gravity.modisco.MParameterList, (o) -> o.getMFirstEntry(), null, false));
		name2initRefGen.put("MEntryToTParameter_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MEntryToTParameter,org.gravity.modisco.MEntry>(name2actor, name2node.get("MEntryToTParameter_source_0_reference"), (o) -> o instanceof ModiscoTGG.MEntryToTParameter, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MEntryToTParameter_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MEntryToTParameter,org.gravity.typegraph.basic.TParameter>(name2actor, name2node.get("MEntryToTParameter_target_0_reference"), (o) -> o instanceof ModiscoTGG.MEntryToTParameter, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TMethodSignature_firstParameter_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMethodSignature,org.gravity.typegraph.basic.TParameter>(name2actor, name2node.get("TMethodSignature_firstParameter_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMethodSignature, (o) -> o.getFirstParameter(), null, false));
		name2initRefGen.put("MEntry_mPrevious_0_reference", new InitGenReferenceActor<org.gravity.modisco.MEntry,org.gravity.modisco.MEntry>(name2actor, name2node.get("MEntry_mPrevious_0_reference"), (o) -> o instanceof org.gravity.modisco.MEntry, (o) -> o.getMPrevious(), null, true));
		name2initRefGen.put("TParameter_previous_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TParameter,org.gravity.typegraph.basic.TParameter>(name2actor, name2node.get("TParameter_previous_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TParameter, (o) -> o.getPrevious(), null, true));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_target_8_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_target_8_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TParameter_type_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TParameter,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TParameter_type_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TParameter, (o) -> o.getType(), null, false));
		name2initRefGen.put("TMethodSignature_parameters_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMethodSignature,org.gravity.typegraph.basic.TParameter>(name2actor, name2node.get("TMethodSignature_parameters_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMethodSignature, null, (o) -> o.getParameters(), false));
		name2initRefGen.put("MMethodSignature_mEntrys_0_reference", new InitGenReferenceActor<org.gravity.modisco.MParameterList,org.gravity.modisco.MEntry>(name2actor, name2node.get("MMethodSignature_mEntrys_0_reference"), (o) -> o instanceof org.gravity.modisco.MParameterList, null, (o) -> o.getMEntrys(), false));
		name2initRefGen.put("MEntry_type_0_reference", new InitGenReferenceActor<org.gravity.modisco.MEntry,org.eclipse.modisco.java.Type>(name2actor, name2node.get("MEntry_type_0_reference"), (o) -> o instanceof org.gravity.modisco.MEntry, (o) -> o.getType(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_11_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_11_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MMethodName_mSignatures_1_reference", new InitGenReferenceActor<org.gravity.modisco.MName,org.gravity.modisco.MSignature>(name2actor, name2node.get("MMethodName_mSignatures_1_reference"), (o) -> o instanceof org.gravity.modisco.MName, null, (o) -> o.getMSignatures(), false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_12_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_12_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_target_9_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_target_9_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TMethod_signatures_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMethod,org.gravity.typegraph.basic.TMethodSignature>(name2actor, name2node.get("TMethod_signatures_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMethod, null, (o) -> o.getSignatures(), false));
		name2initRefGen.put("AbstractTypeDeclaration_bodyDeclarations_8_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AbstractTypeDeclaration_bodyDeclarations_8_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TClass_outerType_5_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TClass_outerType_5_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getOuterType(), null, true));
		name2initRefGen.put("AbstractTypeDeclaration_bodyDeclarations_9_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AbstractTypeDeclaration_bodyDeclarations_9_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("AbstractTypeDeclaration_bodyDeclarations_10_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("AbstractTypeDeclaration_bodyDeclarations_10_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("TInterface_outerType_6_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TInterface_outerType_6_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getOuterType(), null, true));
		name2initRefGen.put("MAbstractFlowElement_incomingFlows_0_reference", new InitGenReferenceActor<org.gravity.modisco.MAbstractFlowElement,org.gravity.modisco.MFlow>(name2actor, name2node.get("MAbstractFlowElement_incomingFlows_0_reference"), (o) -> o instanceof org.gravity.modisco.MAbstractFlowElement, null, (o) -> o.getIncomingFlows(), false));
		name2initRefGen.put("TFlow_outgoingFlows_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractFlowElement,org.gravity.typegraph.basic.TAbstractFlowElement>(name2actor, name2node.get("TFlow_outgoingFlows_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractFlowElement, null, (o) -> o.getOutgoingFlows(), true));
		name2initRefGen.put("Model_ownedElements_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Package>(name2actor, name2node.get("Model_ownedElements_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOwnedElements(), false));
		name2initRefGen.put("Package_package_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Package,org.eclipse.modisco.java.Package>(name2actor, name2node.get("Package_package_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.Package, (o) -> o.getPackage(), null, true));
		name2initRefGen.put("ParameterizedType_type_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.ParameterizedType,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("ParameterizedType_type_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.ParameterizedType, (o) -> o.getType(), null, false));
		name2initRefGen.put("Model_orphanTypes_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Type>(name2actor, name2node.get("Model_orphanTypes_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOrphanTypes(), false));
		name2initRefGen.put("TypeToTAbstractType_source_8_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_8_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("PrimitiveTypeToTClass_target_0_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("PrimitiveTypeToTClass_target_0_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TClass_pg_5_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_5_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TypeGraph_classes_2_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_2_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TypeToTAbstractType_target_4_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_4_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_9_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_9_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("Model_orphanTypes_2_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Type>(name2actor, name2node.get("Model_orphanTypes_2_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOrphanTypes(), false));
		name2initRefGen.put("PrimitiveTypeToTClass_source_0_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.eclipse.modisco.java.PrimitiveType>(name2actor, name2node.get("PrimitiveTypeToTClass_source_0_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("PrimitiveTypeToTClass_target_1_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("PrimitiveTypeToTClass_target_1_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TClass_pg_6_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_6_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TypeGraph_classes_3_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_3_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TypeToTAbstractType_target_5_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_5_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_10_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_10_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("Model_orphanTypes_3_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Type>(name2actor, name2node.get("Model_orphanTypes_3_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOrphanTypes(), false));
		name2initRefGen.put("PrimitiveTypeToTClass_source_1_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.eclipse.modisco.java.PrimitiveType>(name2actor, name2node.get("PrimitiveTypeToTClass_source_1_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("PrimitiveTypeToTClass_target_2_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("PrimitiveTypeToTClass_target_2_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TClass_pg_7_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_7_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TypeGraph_classes_4_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_4_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TypeToTAbstractType_target_6_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_6_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_11_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_11_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("Model_orphanTypes_4_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Type>(name2actor, name2node.get("Model_orphanTypes_4_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOrphanTypes(), false));
		name2initRefGen.put("PrimitiveTypeToTClass_source_2_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.eclipse.modisco.java.PrimitiveType>(name2actor, name2node.get("PrimitiveTypeToTClass_source_2_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("PrimitiveTypeToTClass_target_3_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("PrimitiveTypeToTClass_target_3_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TClass_pg_8_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_8_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TypeGraph_classes_5_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_5_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TypeToTAbstractType_target_7_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_7_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_12_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_12_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("Model_orphanTypes_5_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Type>(name2actor, name2node.get("Model_orphanTypes_5_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOrphanTypes(), false));
		name2initRefGen.put("PrimitiveTypeToTClass_source_3_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.eclipse.modisco.java.PrimitiveType>(name2actor, name2node.get("PrimitiveTypeToTClass_source_3_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("PrimitiveTypeToTClass_target_4_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("PrimitiveTypeToTClass_target_4_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TClass_pg_9_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_9_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TypeGraph_classes_6_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_6_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TypeToTAbstractType_target_8_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_8_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_13_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_13_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("Model_orphanTypes_6_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Type>(name2actor, name2node.get("Model_orphanTypes_6_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOrphanTypes(), false));
		name2initRefGen.put("PrimitiveTypeToTClass_source_4_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.eclipse.modisco.java.PrimitiveType>(name2actor, name2node.get("PrimitiveTypeToTClass_source_4_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("PrimitiveTypeToTClass_target_5_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("PrimitiveTypeToTClass_target_5_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TClass_pg_10_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_10_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TypeGraph_classes_7_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_7_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TypeToTAbstractType_target_9_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_9_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_14_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_14_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("Model_orphanTypes_7_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Type>(name2actor, name2node.get("Model_orphanTypes_7_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOrphanTypes(), false));
		name2initRefGen.put("PrimitiveTypeToTClass_source_5_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.eclipse.modisco.java.PrimitiveType>(name2actor, name2node.get("PrimitiveTypeToTClass_source_5_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("PrimitiveTypeToTClass_target_6_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("PrimitiveTypeToTClass_target_6_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TClass_pg_11_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_11_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TypeGraph_classes_8_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_8_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TypeToTAbstractType_target_10_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_10_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_15_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_15_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("Model_orphanTypes_8_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Type>(name2actor, name2node.get("Model_orphanTypes_8_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOrphanTypes(), false));
		name2initRefGen.put("PrimitiveTypeToTClass_source_6_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.eclipse.modisco.java.PrimitiveType>(name2actor, name2node.get("PrimitiveTypeToTClass_source_6_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("PrimitiveTypeToTClass_target_7_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("PrimitiveTypeToTClass_target_7_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TClass_pg_12_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_12_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TypeGraph_classes_9_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_9_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TypeToTAbstractType_target_11_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_11_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_16_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_16_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("Model_orphanTypes_9_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Type>(name2actor, name2node.get("Model_orphanTypes_9_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOrphanTypes(), false));
		name2initRefGen.put("PrimitiveTypeToTClass_source_7_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.eclipse.modisco.java.PrimitiveType>(name2actor, name2node.get("PrimitiveTypeToTClass_source_7_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("PrimitiveTypeToTClass_target_8_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("PrimitiveTypeToTClass_target_8_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TClass_pg_13_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_13_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TypeGraph_classes_10_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_10_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TypeToTAbstractType_target_12_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_12_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_17_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_17_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("Model_orphanTypes_10_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Type>(name2actor, name2node.get("Model_orphanTypes_10_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOrphanTypes(), false));
		name2initRefGen.put("PrimitiveTypeToTClass_source_8_reference", new InitGenReferenceActor<ModiscoTGG.PrimitiveTypeToTClass,org.eclipse.modisco.java.PrimitiveType>(name2actor, name2node.get("PrimitiveTypeToTClass_source_8_reference"), (o) -> o instanceof ModiscoTGG.PrimitiveTypeToTClass, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TMethodDefinition_returnType_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMethodDefinition,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TMethodDefinition_returnType_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMethodDefinition, (o) -> o.getReturnType(), null, false));
		name2initRefGen.put("MMethodDefinition_returnType_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.MethodDeclaration,org.eclipse.modisco.java.TypeAccess>(name2actor, name2node.get("MMethodDefinition_returnType_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.MethodDeclaration, (o) -> o.getReturnType(), null, false));
		name2initRefGen.put("MMethodSignature_returnType_0_reference", new InitGenReferenceActor<org.gravity.modisco.MMethodSignature,org.eclipse.modisco.java.Type>(name2actor, name2node.get("MMethodSignature_returnType_0_reference"), (o) -> o instanceof org.gravity.modisco.MMethodSignature, (o) -> o.getReturnType(), null, false));
		name2initRefGen.put("TMethodSignature_returnType_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMethodSignature,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TMethodSignature_returnType_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMethodSignature, (o) -> o.getReturnType(), null, false));
		name2initRefGen.put("AbstractMethodInvocationToTAccess_source_3_reference", new InitGenReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("AbstractMethodInvocationToTAccess_source_3_reference"), (o) -> o instanceof ModiscoTGG.AbstractMethodInvocationToTAccess, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_13_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_13_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MDefinition_mMethodInvocations_4_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("MDefinition_mMethodInvocations_4_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, null, (o) -> o.getMMethodInvocations(), false));
		name2initRefGen.put("MAbstractMethodDefinition_usages_4_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractMethodDeclaration,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("MAbstractMethodDefinition_usages_4_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractMethodDeclaration, null, (o) -> o.getUsages(), false));
		name2initRefGen.put("AbstractMethodInvocationToTAccess_source_4_reference", new InitGenReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("AbstractMethodInvocationToTAccess_source_4_reference"), (o) -> o instanceof ModiscoTGG.AbstractMethodInvocationToTAccess, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MAbstractFlowElementToTAbstractFlowElement_source_14_reference", new InitGenReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement,org.gravity.modisco.MAbstractFlowElement>(name2actor, name2node.get("MAbstractFlowElementToTAbstractFlowElement_source_14_reference"), (o) -> o instanceof ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MDefinition_mMethodInvocations_5_reference", new InitGenReferenceActor<org.gravity.modisco.MDefinition,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("MDefinition_mMethodInvocations_5_reference"), (o) -> o instanceof org.gravity.modisco.MDefinition, null, (o) -> o.getMMethodInvocations(), false));
		name2initRefGen.put("MAbstractMethodDefinition_usages_5_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractMethodDeclaration,org.eclipse.modisco.java.AbstractMethodInvocation>(name2actor, name2node.get("MAbstractMethodDefinition_usages_5_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractMethodDeclaration, null, (o) -> o.getUsages(), false));
		name2initRefGen.put("MSyntethicMethodToTSyntethicMethod_source_0_reference", new InitGenReferenceActor<ModiscoTGG.MSyntethicMethodToTSyntethicMethod,org.gravity.modisco.MSyntheticMethodDefinition>(name2actor, name2node.get("MSyntethicMethodToTSyntethicMethod_source_0_reference"), (o) -> o instanceof ModiscoTGG.MSyntethicMethodToTSyntethicMethod, (o) -> o.getSource(), null, false));
		name2initRefGen.put("MSyntethicMethodToTSyntethicMethod_target_0_reference", new InitGenReferenceActor<ModiscoTGG.MSyntethicMethodToTSyntethicMethod,org.gravity.typegraph.basic.TSyntethicMethod>(name2actor, name2node.get("MSyntethicMethodToTSyntethicMethod_target_0_reference"), (o) -> o instanceof ModiscoTGG.MSyntethicMethodToTSyntethicMethod, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TMethodDefinition_syntethicMethods_0_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMethodDefinition,org.gravity.typegraph.basic.TSyntethicMethod>(name2actor, name2node.get("TMethodDefinition_syntethicMethods_0_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMethodDefinition, null, (o) -> o.getSyntethicMethods(), false));
		name2initRefGen.put("TSyntethicMethod_signature_3_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TMember,org.gravity.typegraph.basic.TSignature>(name2actor, name2node.get("TSyntethicMethod_signature_3_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TMember, (o) -> o.getSignature(), null, false));
		name2initRefGen.put("TClass_defines_5_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TMember>(name2actor, name2node.get("TClass_defines_5_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, null, (o) -> o.getDefines(), false));
		name2initRefGen.put("ClassDeclaration_bodyDeclarations_11_reference", new InitGenReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration,org.eclipse.modisco.java.BodyDeclaration>(name2actor, name2node.get("ClassDeclaration_bodyDeclarations_11_reference"), (o) -> o instanceof org.eclipse.modisco.java.AbstractTypeDeclaration, null, (o) -> o.getBodyDeclarations(), false));
		name2initRefGen.put("MMethodDefinition_syntheticMethodDefinitions_0_reference", new InitGenReferenceActor<org.gravity.modisco.MMethodDefinition,org.gravity.modisco.MSyntheticMethodDefinition>(name2actor, name2node.get("MMethodDefinition_syntheticMethodDefinitions_0_reference"), (o) -> o instanceof org.gravity.modisco.MMethodDefinition, null, (o) -> o.getSyntheticMethodDefinitions(), false));
		name2initRefGen.put("MDefinition_comments_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.ASTNode,org.eclipse.modisco.java.Comment>(name2actor, name2node.get("MDefinition_comments_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.ASTNode, null, (o) -> o.getComments(), false));
		name2initRefGen.put("TMember_tAnnotation_3_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotatable,org.gravity.typegraph.basic.annotations.TAnnotation>(name2actor, name2node.get("TMember_tAnnotation_3_reference"), (o) -> o instanceof org.gravity.typegraph.basic.annotations.TAnnotatable, null, (o) -> o.getTAnnotation(), false));
		name2initRefGen.put("LineCommentToTTextAnnotation_source_0_reference", new InitGenReferenceActor<ModiscoTGG.LineCommentToTTextAnnotation,org.eclipse.modisco.java.LineComment>(name2actor, name2node.get("LineCommentToTTextAnnotation_source_0_reference"), (o) -> o instanceof ModiscoTGG.LineCommentToTTextAnnotation, (o) -> o.getSource(), null, false));
		name2initRefGen.put("LineCommentToTTextAnnotation_target_0_reference", new InitGenReferenceActor<ModiscoTGG.LineCommentToTTextAnnotation,org.gravity.typegraph.basic.annotations.TTextAnnotation>(name2actor, name2node.get("LineCommentToTTextAnnotation_target_0_reference"), (o) -> o instanceof ModiscoTGG.LineCommentToTTextAnnotation, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("MGravityModel_typeParameters_0_reference", new InitGenReferenceActor<org.gravity.modisco.MGravityModel,org.eclipse.modisco.java.TypeParameter>(name2actor, name2node.get("MGravityModel_typeParameters_0_reference"), (o) -> o instanceof org.gravity.modisco.MGravityModel, null, (o) -> o.getTypeParameters(), false));
		name2initRefGen.put("TypeToTAbstractType_source_18_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_18_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TypeToTAbstractType_target_13_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_13_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("TypeGraph_classes_11_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TypeGraph,org.gravity.typegraph.basic.TClass>(name2actor, name2node.get("TypeGraph_classes_11_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TypeGraph, null, (o) -> o.getClasses(), false));
		name2initRefGen.put("TClass_pg_14_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TClass_pg_14_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("Model_orphanTypes_11_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.Type>(name2actor, name2node.get("Model_orphanTypes_11_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getOrphanTypes(), false));
		name2initRefGen.put("AbstractTypeDeclaration_modifier_1_reference", new InitGenReferenceActor<org.eclipse.modisco.java.BodyDeclaration,org.eclipse.modisco.java.Modifier>(name2actor, name2node.get("AbstractTypeDeclaration_modifier_1_reference"), (o) -> o instanceof org.eclipse.modisco.java.BodyDeclaration, (o) -> o.getModifier(), null, false));
		name2initRefGen.put("MGravityModel_unresolvedItems_0_reference", new InitGenReferenceActor<org.eclipse.modisco.java.Model,org.eclipse.modisco.java.UnresolvedItem>(name2actor, name2node.get("MGravityModel_unresolvedItems_0_reference"), (o) -> o instanceof org.eclipse.modisco.java.Model, null, (o) -> o.getUnresolvedItems(), false));
		name2initRefGen.put("TUnresolvedType_pg_15_reference", new InitGenReferenceActor<org.gravity.typegraph.basic.TAbstractType,org.gravity.typegraph.basic.TypeGraph>(name2actor, name2node.get("TUnresolvedType_pg_15_reference"), (o) -> o instanceof org.gravity.typegraph.basic.TAbstractType, (o) -> o.getPg(), null, false));
		name2initRefGen.put("TypeToTAbstractType_source_19_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.eclipse.modisco.java.Type>(name2actor, name2node.get("TypeToTAbstractType_source_19_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getSource(), null, false));
		name2initRefGen.put("TypeToTAbstractType_target_14_reference", new InitGenReferenceActor<ModiscoTGG.TypeToTAbstractType,org.gravity.typegraph.basic.TAbstractType>(name2actor, name2node.get("TypeToTAbstractType_target_14_reference"), (o) -> o instanceof ModiscoTGG.TypeToTAbstractType, (o) -> o.getTarget(), null, false));
		name2initRefGen.put("VariableDeclarationFragmentToTFieldDefinition_source_0_reference", new InitGenReferenceActor<ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition,org.eclipse.modisco.java.VariableDeclarationFragment>(name2actor, name2node.get("VariableDeclarationFragmentToTFieldDefinition_source_0_reference"), (o) -> o instanceof ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition, (o) -> o.getSource(), null, false));
		name2initRefGen.put("VariableDeclarationFragmentToTFieldDefinition_target_0_reference", new InitGenReferenceActor<ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition,org.gravity.typegraph.basic.TFieldDefinition>(name2actor, name2node.get("VariableDeclarationFragmentToTFieldDefinition_target_0_reference"), (o) -> o instanceof ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition, (o) -> o.getTarget(), null, false));
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
class AnnotationMemberValuePairToTAnnotationValue_object extends GenericObjectActor<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue> { }
class BodyDeclaration_object extends GenericObjectActor<org.eclipse.modisco.java.BodyDeclaration> { }
class TAnnotatable_object extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TAnnotatable> { }
class TBoolNode_object extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TBoolNode> { }
class BooleanLiteral_object extends GenericObjectActor<org.eclipse.modisco.java.BooleanLiteral> { }
class BooleanLiteralToTBoolNode_object extends GenericObjectActor<ModiscoTGG.BooleanLiteralToTBoolNode> { }
class ClassLiteralToClassNode_object extends GenericObjectActor<ModiscoTGG.ClassLiteralToClassNode> { }
class TypeLiteral_object extends GenericObjectActor<org.eclipse.modisco.java.TypeLiteral> { }
class TClassNode_object extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TClassNode> { }
class ArrayType_object extends GenericObjectActor<org.eclipse.modisco.java.ArrayType> { }
class MethodDeclaration_object extends GenericObjectActor<org.eclipse.modisco.java.MethodDeclaration> { }
class TNumberNode_object extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TNumberNode> { }
class NumberLiteral_object extends GenericObjectActor<org.eclipse.modisco.java.NumberLiteral> { }
class NumberLiteralToTNumberNode_object extends GenericObjectActor<ModiscoTGG.NumberLiteralToTNumberNode> { }
class TTextNode_object extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TTextNode> { }
class StringLiteral_object extends GenericObjectActor<org.eclipse.modisco.java.StringLiteral> { }
class StringLiteralToTTextNode_object extends GenericObjectActor<ModiscoTGG.StringLiteralToTTextNode> { }
class ClassInstanceCreation_object extends GenericObjectActor<org.eclipse.modisco.java.ClassInstanceCreation> { }
class PackageToTPackage_object extends GenericObjectActor<ModiscoTGG.PackageToTPackage> { }
class MAnonymous_object extends GenericObjectActor<org.gravity.modisco.MAnonymous> { }
class MethodInvocation_object extends GenericObjectActor<org.eclipse.modisco.java.MethodInvocation> { }
class ModelToTypeGraph_object extends GenericObjectActor<ModiscoTGG.ModelToTypeGraph> { }
class ClassDeclarationToTClass_object extends GenericObjectActor<ModiscoTGG.ClassDeclarationToTClass> { }
class MClassInstanceCreation_object extends GenericObjectActor<org.gravity.modisco.MClassInstanceCreation> { }
class MConstructorDefinition_object extends GenericObjectActor<org.gravity.modisco.MConstructorDefinition> { }
class TConstructor_object extends GenericObjectActor<org.gravity.typegraph.basic.TConstructor> { }
class ConstructorInvocation_object extends GenericObjectActor<org.eclipse.modisco.java.ConstructorInvocation> { }
class TEnum_object extends GenericObjectActor<org.gravity.typegraph.basic.TEnum> { }
class TReadWrite_object extends GenericObjectActor<org.gravity.typegraph.basic.TReadWrite> { }
class TRead_object extends GenericObjectActor<org.gravity.typegraph.basic.TRead> { }
class TWrite_object extends GenericObjectActor<org.gravity.typegraph.basic.TWrite> { }
class MFieldName_object extends GenericObjectActor<org.gravity.modisco.MFieldName> { }
class TField_object extends GenericObjectActor<org.gravity.typegraph.basic.TField> { }
class MFieldNameToTField_object extends GenericObjectActor<ModiscoTGG.MFieldNameToTField> { }
class MAbstractFlowElement_object extends GenericObjectActor<org.gravity.modisco.MAbstractFlowElement> { }
class MFlow_object extends GenericObjectActor<org.gravity.modisco.MFlow> { }
class TAbstractFlowElement_object extends GenericObjectActor<org.gravity.typegraph.basic.TAbstractFlowElement> { }
class TFlow_object extends GenericObjectActor<org.gravity.typegraph.basic.TFlow> { }
class MFlowToTFlow_object extends GenericObjectActor<ModiscoTGG.MFlowToTFlow> { }
class InterfaceDeclarationToTInterface_object extends GenericObjectActor<ModiscoTGG.InterfaceDeclarationToTInterface> { }
class MModifierToTModifier_object extends GenericObjectActor<ModiscoTGG.MModifierToTModifier> { }
class TModifier_object extends GenericObjectActor<org.gravity.typegraph.basic.TModifier> { }
class Modifier_object extends GenericObjectActor<org.eclipse.modisco.java.Modifier> { }
class TSignature_object extends GenericObjectActor<org.gravity.typegraph.basic.TSignature> { }
class MSignature_object extends GenericObjectActor<org.gravity.modisco.MSignature> { }
class MMethodNameToTMethod_object extends GenericObjectActor<ModiscoTGG.MMethodNameToTMethod> { }
class TMethod_object extends GenericObjectActor<org.gravity.typegraph.basic.TMethod> { }
class MMethodName_object extends GenericObjectActor<org.gravity.modisco.MMethodName> { }
class MEntryToTParameter_object extends GenericObjectActor<ModiscoTGG.MEntryToTParameter> { }
class ParameterizedType_object extends GenericObjectActor<org.eclipse.modisco.java.ParameterizedType> { }
class PrimitiveTypeBoolean_object extends GenericObjectActor<org.eclipse.modisco.java.PrimitiveTypeBoolean> { }
class PrimitiveTypeByte_object extends GenericObjectActor<org.eclipse.modisco.java.PrimitiveTypeByte> { }
class PrimitiveTypeChar_object extends GenericObjectActor<org.eclipse.modisco.java.PrimitiveTypeChar> { }
class PrimitiveTypeDouble_object extends GenericObjectActor<org.eclipse.modisco.java.PrimitiveTypeDouble> { }
class PrimitiveTypeFloat_object extends GenericObjectActor<org.eclipse.modisco.java.PrimitiveTypeFloat> { }
class PrimitiveTypeInt_object extends GenericObjectActor<org.eclipse.modisco.java.PrimitiveTypeInt> { }
class PrimitiveTypeLong_object extends GenericObjectActor<org.eclipse.modisco.java.PrimitiveTypeLong> { }
class PrimitiveTypeShort_object extends GenericObjectActor<org.eclipse.modisco.java.PrimitiveTypeShort> { }
class PrimitiveTypeVoid_object extends GenericObjectActor<org.eclipse.modisco.java.PrimitiveTypeVoid> { }
class SuperConstructorInvocation_object extends GenericObjectActor<org.eclipse.modisco.java.SuperConstructorInvocation> { }
class MSuperMethodInvocation_object extends GenericObjectActor<org.gravity.modisco.MSuperMethodInvocation> { }
class MSyntethicMethodToTSyntethicMethod_object extends GenericObjectActor<ModiscoTGG.MSyntethicMethodToTSyntethicMethod> { }
class MSyntheticMethodDefinition_object extends GenericObjectActor<org.gravity.modisco.MSyntheticMethodDefinition> { }
class TSyntethicMethod_object extends GenericObjectActor<org.gravity.typegraph.basic.TSyntethicMethod> { }
class TTextAnnotation_object extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TTextAnnotation> { }
class LineCommentToTTextAnnotation_object extends GenericObjectActor<ModiscoTGG.LineCommentToTTextAnnotation> { }
class TypeParameter_object extends GenericObjectActor<org.eclipse.modisco.java.TypeParameter> { }
class UnresolvedTypeDeclaration_object extends GenericObjectActor<org.eclipse.modisco.java.UnresolvedTypeDeclaration> { }
class TUnresolvedType_object extends GenericObjectActor<org.gravity.typegraph.basic.TUnresolvedType> { }
class VariableDeclarationFragmentToTFieldDefinition_object extends GenericObjectActor<ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition> { }
class Annotation_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.Annotation> { }
class Annotation_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.Annotation> { }
class AnnotationMemberValuePair_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.AnnotationMemberValuePair> { }
class AnnotationMemberValuePair_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.AnnotationMemberValuePair> { }
class TAnnotation_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TAnnotation> { }
class TAnnotation_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TAnnotation> { }
class TAnnotationValue_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TAnnotationValue> { }
class TAnnotationValue_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TAnnotationValue> { }
class ArrayInitializer_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.ArrayInitializer> { }
class ArrayInitializer_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.ArrayInitializer> { }
class TAbstractType_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TAbstractType> { }
class TAbstractType_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TAbstractType> { }
class TAbstractType_object_SP2 extends GenericObjectActor<org.gravity.typegraph.basic.TAbstractType> { }
class TAbstractType_object_SP3 extends GenericObjectActor<org.gravity.typegraph.basic.TAbstractType> { }
class TAbstractType_object_SP4 extends GenericObjectActor<org.gravity.typegraph.basic.TAbstractType> { }
class TypeToTAbstractType_object_SP0 extends GenericObjectActor<ModiscoTGG.TypeToTAbstractType> { }
class TypeToTAbstractType_object_SP1 extends GenericObjectActor<ModiscoTGG.TypeToTAbstractType> { }
class TypeToTAbstractType_object_SP2 extends GenericObjectActor<ModiscoTGG.TypeToTAbstractType> { }
class TypeToTAbstractType_object_SP3 extends GenericObjectActor<ModiscoTGG.TypeToTAbstractType> { }
class TypeToTAbstractType_object_SP4 extends GenericObjectActor<ModiscoTGG.TypeToTAbstractType> { }
class TypeToTAbstractType_object_SP5 extends GenericObjectActor<ModiscoTGG.TypeToTAbstractType> { }
class TypeToTAbstractType_object_SP6 extends GenericObjectActor<ModiscoTGG.TypeToTAbstractType> { }
class TypeToTAbstractType_object_SP7 extends GenericObjectActor<ModiscoTGG.TypeToTAbstractType> { }
class TypeToTAbstractType_object_SP8 extends GenericObjectActor<ModiscoTGG.TypeToTAbstractType> { }
class Type_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.Type> { }
class Type_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.Type> { }
class TypeAccess_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.TypeAccess> { }
class TypeAccess_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.TypeAccess> { }
class TypeAccess_object_SP2 extends GenericObjectActor<org.eclipse.modisco.java.TypeAccess> { }
class TypeAccess_object_SP3 extends GenericObjectActor<org.eclipse.modisco.java.TypeAccess> { }
class AbstractTypeDeclaration_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.AbstractTypeDeclaration> { }
class AbstractTypeDeclaration_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.AbstractTypeDeclaration> { }
class AbstractTypeDeclaration_object_SP2 extends GenericObjectActor<org.eclipse.modisco.java.AbstractTypeDeclaration> { }
class ClassDeclaration_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.ClassDeclaration> { }
class ClassDeclaration_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.ClassDeclaration> { }
class ASTNodeToTAnnotatable_object_SP0 extends GenericObjectActor<ModiscoTGG.ASTNodeToTAnnotatable> { }
class ASTNodeToTAnnotatable_object_SP1 extends GenericObjectActor<ModiscoTGG.ASTNodeToTAnnotatable> { }
class ASTNodeToTAnnotatable_object_SP2 extends GenericObjectActor<ModiscoTGG.ASTNodeToTAnnotatable> { }
class ASTNodeToTAnnotatable_object_SP3 extends GenericObjectActor<ModiscoTGG.ASTNodeToTAnnotatable> { }
class TAnnotationType_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TAnnotationType> { }
class TAnnotationType_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TAnnotationType> { }
class TAnnotationType_object_SP2 extends GenericObjectActor<org.gravity.typegraph.basic.annotations.TAnnotationType> { }
class AnnotationTypeDeclaration_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.AnnotationTypeDeclaration> { }
class AnnotationTypeDeclaration_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.AnnotationTypeDeclaration> { }
class TypeGraph_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_object_SP2 extends GenericObjectActor<org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_object_SP3 extends GenericObjectActor<org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_object_SP4 extends GenericObjectActor<org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_object_SP5 extends GenericObjectActor<org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_object_SP6 extends GenericObjectActor<org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_object_SP7 extends GenericObjectActor<org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_object_SP8 extends GenericObjectActor<org.gravity.typegraph.basic.TypeGraph> { }
class AnonymousClassDeclarationToTClass_object_SP0 extends GenericObjectActor<ModiscoTGG.AnonymousClassDeclarationToTClass> { }
class AnonymousClassDeclarationToTClass_object_SP1 extends GenericObjectActor<ModiscoTGG.AnonymousClassDeclarationToTClass> { }
class AnonymousClassDeclaration_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.AnonymousClassDeclaration> { }
class AnonymousClassDeclaration_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.AnonymousClassDeclaration> { }
class TPackage_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TPackage> { }
class TPackage_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TPackage> { }
class TPackage_object_SP2 extends GenericObjectActor<org.gravity.typegraph.basic.TPackage> { }
class Package_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.Package> { }
class Package_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.Package> { }
class TInterface_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TInterface> { }
class TInterface_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TInterface> { }
class TInterface_object_SP2 extends GenericObjectActor<org.gravity.typegraph.basic.TInterface> { }
class TInterface_object_SP3 extends GenericObjectActor<org.gravity.typegraph.basic.TInterface> { }
class Model_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.Model> { }
class Model_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.Model> { }
class Model_object_SP2 extends GenericObjectActor<org.eclipse.modisco.java.Model> { }
class Model_object_SP3 extends GenericObjectActor<org.eclipse.modisco.java.Model> { }
class MClass_object_SP0 extends GenericObjectActor<org.gravity.modisco.MClass> { }
class MClass_object_SP1 extends GenericObjectActor<org.gravity.modisco.MClass> { }
class MAbstractMethodDefinition_object_SP0 extends GenericObjectActor<org.gravity.modisco.MAbstractMethodDefinition> { }
class MAbstractMethodDefinition_object_SP1 extends GenericObjectActor<org.gravity.modisco.MAbstractMethodDefinition> { }
class MAbstractMethodDefinition_object_SP2 extends GenericObjectActor<org.gravity.modisco.MAbstractMethodDefinition> { }
class AbstractMethodInvocationToTAccess_object_SP0 extends GenericObjectActor<ModiscoTGG.AbstractMethodInvocationToTAccess> { }
class AbstractMethodInvocationToTAccess_object_SP1 extends GenericObjectActor<ModiscoTGG.AbstractMethodInvocationToTAccess> { }
class TCall_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TCall> { }
class TCall_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TCall> { }
class MAbstractFlowElementToTAbstractFlowElement_object_SP0 extends GenericObjectActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_object_SP1 extends GenericObjectActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_object_SP2 extends GenericObjectActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_object_SP3 extends GenericObjectActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_object_SP4 extends GenericObjectActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_object_SP5 extends GenericObjectActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_object_SP6 extends GenericObjectActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement> { }
class MDefinitionToTMember_object_SP0 extends GenericObjectActor<ModiscoTGG.MDefinitionToTMember> { }
class MDefinitionToTMember_object_SP1 extends GenericObjectActor<ModiscoTGG.MDefinitionToTMember> { }
class MDefinition_object_SP0 extends GenericObjectActor<org.gravity.modisco.MDefinition> { }
class MDefinition_object_SP1 extends GenericObjectActor<org.gravity.modisco.MDefinition> { }
class MDefinition_object_SP2 extends GenericObjectActor<org.gravity.modisco.MDefinition> { }
class MDefinition_object_SP3 extends GenericObjectActor<org.gravity.modisco.MDefinition> { }
class MDefinition_object_SP4 extends GenericObjectActor<org.gravity.modisco.MDefinition> { }
class TMember_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TMember> { }
class TMember_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TMember> { }
class TMember_object_SP2 extends GenericObjectActor<org.gravity.typegraph.basic.TMember> { }
class TMember_object_SP3 extends GenericObjectActor<org.gravity.typegraph.basic.TMember> { }
class TMethodDefinition_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TMethodDefinition> { }
class TMethodDefinition_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TMethodDefinition> { }
class TMethodDefinition_object_SP2 extends GenericObjectActor<org.gravity.typegraph.basic.TMethodDefinition> { }
class TMethodSignature_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TMethodSignature> { }
class TMethodSignature_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TMethodSignature> { }
class MSignatureToTSignature_object_SP0 extends GenericObjectActor<ModiscoTGG.MSignatureToTSignature> { }
class MSignatureToTSignature_object_SP1 extends GenericObjectActor<ModiscoTGG.MSignatureToTSignature> { }
class MMethodSignature_object_SP0 extends GenericObjectActor<org.gravity.modisco.MMethodSignature> { }
class MMethodSignature_object_SP1 extends GenericObjectActor<org.gravity.modisco.MMethodSignature> { }
class EnumDeclaration_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.EnumDeclaration> { }
class EnumDeclaration_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.EnumDeclaration> { }
class MFieldDefinition_object_SP0 extends GenericObjectActor<org.gravity.modisco.MFieldDefinition> { }
class MFieldDefinition_object_SP1 extends GenericObjectActor<org.gravity.modisco.MFieldDefinition> { }
class TFieldDefinition_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TFieldDefinition> { }
class TFieldDefinition_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TFieldDefinition> { }
class TFieldDefinition_object_SP2 extends GenericObjectActor<org.gravity.typegraph.basic.TFieldDefinition> { }
class VariableDeclarationFragment_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.VariableDeclarationFragment> { }
class VariableDeclarationFragment_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.VariableDeclarationFragment> { }
class MSingleVariableAccessToTAccess_object_SP0 extends GenericObjectActor<ModiscoTGG.MSingleVariableAccessToTAccess> { }
class MSingleVariableAccessToTAccess_object_SP1 extends GenericObjectActor<ModiscoTGG.MSingleVariableAccessToTAccess> { }
class MFieldSignature_object_SP0 extends GenericObjectActor<org.gravity.modisco.MFieldSignature> { }
class MFieldSignature_object_SP1 extends GenericObjectActor<org.gravity.modisco.MFieldSignature> { }
class TFieldSignature_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TFieldSignature> { }
class TFieldSignature_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TFieldSignature> { }
class MGravityModel_object_SP0 extends GenericObjectActor<org.gravity.modisco.MGravityModel> { }
class MGravityModel_object_SP1 extends GenericObjectActor<org.gravity.modisco.MGravityModel> { }
class InterfaceDeclaration_object_SP0 extends GenericObjectActor<org.eclipse.modisco.java.InterfaceDeclaration> { }
class InterfaceDeclaration_object_SP1 extends GenericObjectActor<org.eclipse.modisco.java.InterfaceDeclaration> { }
class InterfaceDeclaration_object_SP2 extends GenericObjectActor<org.eclipse.modisco.java.InterfaceDeclaration> { }
class MMethodDefinition_object_SP0 extends GenericObjectActor<org.gravity.modisco.MMethodDefinition> { }
class MMethodDefinition_object_SP1 extends GenericObjectActor<org.gravity.modisco.MMethodDefinition> { }
class MMethodDefinition_object_SP2 extends GenericObjectActor<org.gravity.modisco.MMethodDefinition> { }
class MMethodInvocation_object_SP0 extends GenericObjectActor<org.gravity.modisco.MMethodInvocation> { }
class MMethodInvocation_object_SP1 extends GenericObjectActor<org.gravity.modisco.MMethodInvocation> { }
class MEntry_object_SP0 extends GenericObjectActor<org.gravity.modisco.MEntry> { }
class MEntry_object_SP1 extends GenericObjectActor<org.gravity.modisco.MEntry> { }
class TParameter_object_SP0 extends GenericObjectActor<org.gravity.typegraph.basic.TParameter> { }
class TParameter_object_SP1 extends GenericObjectActor<org.gravity.typegraph.basic.TParameter> { }
class PrimitiveTypeToTClass_object_SP0 extends GenericObjectActor<ModiscoTGG.PrimitiveTypeToTClass> { }
class PrimitiveTypeToTClass_object_SP1 extends GenericObjectActor<ModiscoTGG.PrimitiveTypeToTClass> { }
class PrimitiveTypeToTClass_object_SP2 extends GenericObjectActor<ModiscoTGG.PrimitiveTypeToTClass> { }
class PrimitiveTypeToTClass_object_SP3 extends GenericObjectActor<ModiscoTGG.PrimitiveTypeToTClass> { }
class PrimitiveTypeToTClass_object_SP4 extends GenericObjectActor<ModiscoTGG.PrimitiveTypeToTClass> { }

class Annotation_values_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.Annotation, org.eclipse.modisco.java.AnnotationMemberValuePair> { }
class AnnotationToTAnnotation_source_0_reference extends GenericReferenceActor<ModiscoTGG.AnnotationToTAnnotation, org.eclipse.modisco.java.Annotation> { }
class AnnotationToTAnnotation_target_0_reference extends GenericReferenceActor<ModiscoTGG.AnnotationToTAnnotation, org.gravity.typegraph.basic.annotations.TAnnotation> { }
class TAnnotation_tValues_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotation, org.gravity.typegraph.basic.annotations.TAnnotationValue> { }
class AnnotationMemberValuePairToTAnnotationValue_source_0_reference extends GenericReferenceActor<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, org.eclipse.modisco.java.AnnotationMemberValuePair> { }
class AnnotationMemberValuePairToTAnnotationValue_target_0_reference extends GenericReferenceActor<ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue, org.gravity.typegraph.basic.annotations.TAnnotationValue> { }
class TAnnotationValue_tValue_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotationValue, org.eclipse.emf.ecore.EObject> { }
class AnnotationMemberValuePair_value_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnnotationMemberValuePair, org.eclipse.modisco.java.Expression> { }
class ArrayInitializer_expressions_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.ArrayInitializer, org.eclipse.modisco.java.Expression> { }
class BodyDeclaration_annotations_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.BodyDeclaration, org.eclipse.modisco.java.Annotation> { }
class TAnnotatable_tAnnotation_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotation> { }
class AnnotationMemberValuePair_value_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnnotationMemberValuePair, org.eclipse.modisco.java.Expression> { }
class TAnnotationValue_tValue_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotationValue, org.eclipse.emf.ecore.EObject> { }
class ArrayInitializer_expressions_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.ArrayInitializer, org.eclipse.modisco.java.Expression> { }
class BooleanLiteralToTBoolNode_source_0_reference extends GenericReferenceActor<ModiscoTGG.BooleanLiteralToTBoolNode, org.eclipse.modisco.java.BooleanLiteral> { }
class BooleanLiteralToTBoolNode_target_0_reference extends GenericReferenceActor<ModiscoTGG.BooleanLiteralToTBoolNode, org.gravity.typegraph.basic.annotations.TBoolNode> { }
class AnnotationMemberValuePair_value_2_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnnotationMemberValuePair, org.eclipse.modisco.java.Expression> { }
class ClassLiteralToClassNode_source_0_reference extends GenericReferenceActor<ModiscoTGG.ClassLiteralToClassNode, org.eclipse.modisco.java.TypeLiteral> { }
class ClassLiteralToClassNode_target_0_reference extends GenericReferenceActor<ModiscoTGG.ClassLiteralToClassNode, org.gravity.typegraph.basic.annotations.TClassNode> { }
class TAnnotationValue_tValue_2_reference extends GenericReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotationValue, org.eclipse.emf.ecore.EObject> { }
class TClassNode_tClass_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.annotations.TClassNode, org.gravity.typegraph.basic.TAbstractType> { }
class ArrayInitializer_expressions_2_reference extends GenericReferenceActor<org.eclipse.modisco.java.ArrayInitializer, org.eclipse.modisco.java.Expression> { }
class TypeToTAbstractType_source_0_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class TypeToTAbstractType_target_0_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class Type_usagesInTypeAccess_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.Type, org.eclipse.modisco.java.TypeAccess> { }
class TypeLiteral_type_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.TypeLiteral, org.eclipse.modisco.java.TypeAccess> { }
class AbstractTypeDeclaration_superInterfaces_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.TypeAccess> { }
class Annotation_type_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.Annotation, org.eclipse.modisco.java.TypeAccess> { }
class ArrayType_elementType_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.ArrayType, org.eclipse.modisco.java.TypeAccess> { }
class ClassDeclaration_superClass_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.ClassDeclaration, org.eclipse.modisco.java.TypeAccess> { }
class MethodDeclaration_returnType_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.MethodDeclaration, org.eclipse.modisco.java.TypeAccess> { }
class AnnotationMemberValuePair_value_3_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnnotationMemberValuePair, org.eclipse.modisco.java.Expression> { }
class TAnnotationValue_tValue_3_reference extends GenericReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotationValue, org.eclipse.emf.ecore.EObject> { }
class ArrayInitializer_expressions_3_reference extends GenericReferenceActor<org.eclipse.modisco.java.ArrayInitializer, org.eclipse.modisco.java.Expression> { }
class NumberLiteralToTNumberNode_source_0_reference extends GenericReferenceActor<ModiscoTGG.NumberLiteralToTNumberNode, org.eclipse.modisco.java.NumberLiteral> { }
class NumberLiteralToTNumberNode_target_0_reference extends GenericReferenceActor<ModiscoTGG.NumberLiteralToTNumberNode, org.gravity.typegraph.basic.annotations.TNumberNode> { }
class AnnotationMemberValuePair_value_4_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnnotationMemberValuePair, org.eclipse.modisco.java.Expression> { }
class TAnnotationValue_tValue_4_reference extends GenericReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotationValue, org.eclipse.emf.ecore.EObject> { }
class ArrayInitializer_expressions_4_reference extends GenericReferenceActor<org.eclipse.modisco.java.ArrayInitializer, org.eclipse.modisco.java.Expression> { }
class StringLiteralToTTextNode_source_0_reference extends GenericReferenceActor<ModiscoTGG.StringLiteralToTTextNode, org.eclipse.modisco.java.StringLiteral> { }
class StringLiteralToTTextNode_target_0_reference extends GenericReferenceActor<ModiscoTGG.StringLiteralToTTextNode, org.gravity.typegraph.basic.annotations.TTextNode> { }
class AnnotationMemberValuePair_value_5_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnnotationMemberValuePair, org.eclipse.modisco.java.Expression> { }
class ASTNodeToTAnnotatable_source_0_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.eclipse.modisco.java.ASTNode> { }
class ASTNodeToTAnnotatable_target_0_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotatable> { }
class TAnnotation_type_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotation, org.gravity.typegraph.basic.annotations.TAnnotationType> { }
class TypeToTAbstractType_source_1_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class TypeToTAbstractType_target_1_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class AnnotationTypeDeclaration_usagesInTypeAccess_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.Type, org.eclipse.modisco.java.TypeAccess> { }
class ClassInstanceCreation_type_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.ClassInstanceCreation, org.eclipse.modisco.java.TypeAccess> { }
class ASTNodeToTAnnotatable_target_1_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotatable> { }
class TypeGraph_classes_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TAnnotationType_outerType_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TAnnotationType_pg_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TClass_pg_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class AnonymousClassDeclarationToTClass_source_0_reference extends GenericReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass, org.eclipse.modisco.java.AnonymousClassDeclaration> { }
class AnonymousClassDeclarationToTClass_target_0_reference extends GenericReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass> { }
class ASTNodeToTAnnotatable_source_1_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.eclipse.modisco.java.ASTNode> { }
class AnonymousClassDeclaration_bodyDeclarations_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TypeToTAbstractType_source_2_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class AbstractTypeDeclaration_bodyDeclarations_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TPackage_typeGraph_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TPackage, org.gravity.typegraph.basic.TypeGraph> { }
class TAnnotationType_package_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage> { }
class TAnnotationType_outerType_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TypeGraph_tAnnotationTypes_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.annotations.TAnnotationType> { }
class TAbstractType_package_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage> { }
class TAbstractType_pg_2_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TPackage_pg_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TPackage, org.gravity.typegraph.basic.TypeGraph> { }
class AnnotationTypeDeclaration_package_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.Package> { }
class PackageToTPackage_source_0_reference extends GenericReferenceActor<ModiscoTGG.PackageToTPackage, org.eclipse.modisco.java.Package> { }
class PackageToTPackage_target_0_reference extends GenericReferenceActor<ModiscoTGG.PackageToTPackage, org.gravity.typegraph.basic.TPackage> { }
class AnonymousClassDeclarationToTClass_source_1_reference extends GenericReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass, org.eclipse.modisco.java.AnonymousClassDeclaration> { }
class AnonymousClassDeclarationToTClass_target_1_reference extends GenericReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass> { }
class MAnonymous_classInstanceCreation_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration, org.eclipse.modisco.java.ClassInstanceCreation> { }
class AbstractTypeDeclaration_usagesInTypeAccess_2_reference extends GenericReferenceActor<org.eclipse.modisco.java.Type, org.eclipse.modisco.java.TypeAccess> { }
class TypeToTAbstractType_target_2_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TClass_implements_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TClass, org.gravity.typegraph.basic.TInterface> { }
class TypeToTAbstractType_target_3_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class AnonymousClassDeclarationToTClass_target_2_reference extends GenericReferenceActor<ModiscoTGG.AnonymousClassDeclarationToTClass, org.gravity.typegraph.basic.TClass> { }
class TypeGraph_classes_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TClass_outerType_2_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class MAnonymous_mSourroundingType_0_reference extends GenericReferenceActor<org.gravity.modisco.MAnonymous, org.eclipse.modisco.java.AbstractTypeDeclaration> { }
class TClass_package_2_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage> { }
class TClass_pg_3_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TPackage_classes_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TPackage, org.gravity.typegraph.basic.TClass> { }
class ArrayInitializer_expressions_5_reference extends GenericReferenceActor<org.eclipse.modisco.java.ArrayInitializer, org.eclipse.modisco.java.Expression> { }
class Model_orphanTypes_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Type> { }
class ModelToTypeGraph_source_0_reference extends GenericReferenceActor<ModiscoTGG.ModelToTypeGraph, org.eclipse.modisco.java.Model> { }
class ModelToTypeGraph_target_0_reference extends GenericReferenceActor<ModiscoTGG.ModelToTypeGraph, org.gravity.typegraph.basic.TypeGraph> { }
class TypeToTAbstractType_source_3_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class ClassDeclarationToTClass_source_0_reference extends GenericReferenceActor<ModiscoTGG.ClassDeclarationToTClass, org.eclipse.modisco.java.ClassDeclaration> { }
class ClassDeclarationToTClass_target_0_reference extends GenericReferenceActor<ModiscoTGG.ClassDeclarationToTClass, org.gravity.typegraph.basic.TClass> { }
class ClassDeclaration_usagesInTypeAccess_3_reference extends GenericReferenceActor<org.eclipse.modisco.java.Type, org.eclipse.modisco.java.TypeAccess> { }
class TClass_implements_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TClass, org.gravity.typegraph.basic.TInterface> { }
class ClassDeclaration_superInterfaces_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.TypeAccess> { }
class TypeToTAbstractType_source_4_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class ASTNodeToTAnnotatable_source_2_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.eclipse.modisco.java.ASTNode> { }
class ASTNodeToTAnnotatable_target_2_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotatable> { }
class AnonymousClassDeclaration_bodyDeclarations_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class ClassDeclarationToTClass_source_1_reference extends GenericReferenceActor<ModiscoTGG.ClassDeclarationToTClass, org.eclipse.modisco.java.ClassDeclaration> { }
class TClass_outerType_3_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class AnonymousClassDeclaration_bodyDeclarations_2_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class MAbstractMethodDefinition_mInnerTypes_0_reference extends GenericReferenceActor<org.gravity.modisco.MAbstractMethodDefinition, org.eclipse.modisco.java.AbstractTypeDeclaration> { }
class TClass_package_3_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage> { }
class TypeToTAbstractType_source_5_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class ClassDeclaration_bodyDeclarations_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class AbstractMethodInvocationToTAccess_source_0_reference extends GenericReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class AbstractMethodInvocationToTAccess_target_0_reference extends GenericReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess, org.gravity.typegraph.basic.TAccess> { }
class MAbstractFlowElementToTAbstractFlowElement_source_0_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_target_0_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement> { }
class MDefinitionToTMember_source_0_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition> { }
class MDefinitionToTMember_target_0_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember> { }
class MDefinition_mMethodInvocations_0_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MAbstractMethodDefinition_usages_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractMethodDeclaration, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MDefinitionToTMember_source_1_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition> { }
class TCall_tSource_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAccess, org.gravity.typegraph.basic.TMember> { }
class TCall_tTarget_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAccess, org.gravity.typegraph.basic.TMember> { }
class MClass_package_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.Package> { }
class MDefinitionToTMember_source_2_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition> { }
class MDefinitionToTMember_target_1_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember> { }
class MAbstractFlowElementToTAbstractFlowElement_target_1_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement> { }
class TMethodDefinition_signature_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature> { }
class TMethodDefinition_tAnnotation_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotation> { }
class ASTNodeToTAnnotatable_source_3_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.eclipse.modisco.java.ASTNode> { }
class ASTNodeToTAnnotatable_target_3_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotatable> { }
class MSignatureToTSignature_source_0_reference extends GenericReferenceActor<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature> { }
class MSignatureToTSignature_target_0_reference extends GenericReferenceActor<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature> { }
class MConstructorDefinition_mSignature_0_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.gravity.modisco.MSignature> { }
class MAbstractFlowElementToTAbstractFlowElement_source_1_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class AbstractMethodInvocationToTAccess_source_1_reference extends GenericReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MAbstractFlowElementToTAbstractFlowElement_source_2_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MDefinition_mMethodInvocations_1_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MAbstractMethodDefinition_usages_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractMethodDeclaration, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class ASTNodeToTAnnotatable_source_4_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.eclipse.modisco.java.ASTNode> { }
class AnonymousClassDeclaration_bodyDeclarations_3_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TypeToTAbstractType_source_6_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class TClass_tAnnotation_2_reference extends GenericReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotation> { }
class EnumDeclaration_package_2_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.Package> { }
class MDefinitionToTMember_source_3_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition> { }
class MDefinitionToTMember_target_2_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.typegraph.basic.TMember> { }
class AbstractTypeDeclaration_bodyDeclarations_2_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class VariableDeclarationFragment_variablesContainer_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.VariableDeclarationFragment, org.eclipse.modisco.java.AbstractVariablesContainer> { }
class TAbstractType_defines_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember> { }
class TReadWrite_tTarget_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAccess, org.gravity.typegraph.basic.TMember> { }
class MSingleVariableAccessToTAccess_source_0_reference extends GenericReferenceActor<ModiscoTGG.MSingleVariableAccessToTAccess, org.gravity.modisco.MSingleVariableAccess> { }
class MSingleVariableAccessToTAccess_target_0_reference extends GenericReferenceActor<ModiscoTGG.MSingleVariableAccessToTAccess, org.gravity.typegraph.basic.TAccess> { }
class MSingleVariableAccess_variable_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.SingleVariableAccess, org.eclipse.modisco.java.VariableDeclaration> { }
class MAbstractFlowElementToTAbstractFlowElement_source_3_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_target_2_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement> { }
class TReadWrite_tSource_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAccess, org.gravity.typegraph.basic.TMember> { }
class MDefinition_mAbstractFieldAccess_0_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.gravity.modisco.MSingleVariableAccess> { }
class MDefinition_mAbstractFieldAccess_1_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.gravity.modisco.MSingleVariableAccess> { }
class TRead_tTarget_2_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAccess, org.gravity.typegraph.basic.TMember> { }
class MSingleVariableAccessToTAccess_source_1_reference extends GenericReferenceActor<ModiscoTGG.MSingleVariableAccessToTAccess, org.gravity.modisco.MSingleVariableAccess> { }
class MSingleVariableAccessToTAccess_target_1_reference extends GenericReferenceActor<ModiscoTGG.MSingleVariableAccessToTAccess, org.gravity.typegraph.basic.TAccess> { }
class MSingleVariableAccess_variable_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.SingleVariableAccess, org.eclipse.modisco.java.VariableDeclaration> { }
class MAbstractFlowElementToTAbstractFlowElement_source_4_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_target_3_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement> { }
class TRead_tSource_2_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAccess, org.gravity.typegraph.basic.TMember> { }
class MDefinition_mAbstractFieldAccess_2_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.gravity.modisco.MSingleVariableAccess> { }
class TWrite_tTarget_3_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAccess, org.gravity.typegraph.basic.TMember> { }
class MSingleVariableAccessToTAccess_source_2_reference extends GenericReferenceActor<ModiscoTGG.MSingleVariableAccessToTAccess, org.gravity.modisco.MSingleVariableAccess> { }
class MSingleVariableAccessToTAccess_target_2_reference extends GenericReferenceActor<ModiscoTGG.MSingleVariableAccessToTAccess, org.gravity.typegraph.basic.TAccess> { }
class MSingleVariableAccess_variable_2_reference extends GenericReferenceActor<org.eclipse.modisco.java.SingleVariableAccess, org.eclipse.modisco.java.VariableDeclaration> { }
class MAbstractFlowElementToTAbstractFlowElement_source_5_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_target_4_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement> { }
class TWrite_tSource_3_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAccess, org.gravity.typegraph.basic.TMember> { }
class MDefinition_mAbstractFieldAccess_3_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.gravity.modisco.MSingleVariableAccess> { }
class MAbstractFlowElementToTAbstractFlowElement_source_6_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_target_5_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement> { }
class MFieldDefinition_mSignature_1_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.gravity.modisco.MSignature> { }
class MSignatureToTSignature_source_1_reference extends GenericReferenceActor<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature> { }
class MSignatureToTSignature_target_1_reference extends GenericReferenceActor<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature> { }
class TFieldDefinition_signature_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature> { }
class ASTNodeToTAnnotatable_source_5_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.eclipse.modisco.java.ASTNode> { }
class ASTNodeToTAnnotatable_target_4_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotatable> { }
class MGravityModel_mFieldNames_0_reference extends GenericReferenceActor<org.gravity.modisco.MGravityModel, org.gravity.modisco.MFieldName> { }
class ModelToTypeGraph_source_1_reference extends GenericReferenceActor<ModiscoTGG.ModelToTypeGraph, org.eclipse.modisco.java.Model> { }
class TField_pg_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TField, org.gravity.typegraph.basic.TypeGraph> { }
class MFieldNameToTField_source_0_reference extends GenericReferenceActor<ModiscoTGG.MFieldNameToTField, org.gravity.modisco.MFieldName> { }
class MFieldNameToTField_target_0_reference extends GenericReferenceActor<ModiscoTGG.MFieldNameToTField, org.gravity.typegraph.basic.TField> { }
class TField_signatures_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TField, org.gravity.typegraph.basic.TFieldSignature> { }
class MAbstractFlowElementToTAbstractFlowElement_target_6_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement> { }
class MFieldName_mSignatures_0_reference extends GenericReferenceActor<org.gravity.modisco.MName, org.gravity.modisco.MSignature> { }
class MAbstractFlowElementToTAbstractFlowElement_source_7_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MFieldSignature_type_0_reference extends GenericReferenceActor<org.gravity.modisco.MFieldSignature, org.eclipse.modisco.java.Type> { }
class TFieldSignature_type_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TFieldSignature, org.gravity.typegraph.basic.TAbstractType> { }
class MAbstractFlowElement_ownedFlows_0_reference extends GenericReferenceActor<org.gravity.modisco.MAbstractFlowElement, org.gravity.modisco.MFlow> { }
class MAbstractFlowElementToTAbstractFlowElement_source_8_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_target_7_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement> { }
class TAbstractFlowElement_ownedFlows_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractFlowElement, org.gravity.typegraph.basic.TFlow> { }
class MFlowToTFlow_source_0_reference extends GenericReferenceActor<ModiscoTGG.MFlowToTFlow, org.gravity.modisco.MFlow> { }
class MFlowToTFlow_target_0_reference extends GenericReferenceActor<ModiscoTGG.MFlowToTFlow, org.gravity.typegraph.basic.TFlow> { }
class InterfaceDeclarationToTInterface_source_0_reference extends GenericReferenceActor<ModiscoTGG.InterfaceDeclarationToTInterface, org.eclipse.modisco.java.InterfaceDeclaration> { }
class InterfaceDeclarationToTInterface_target_0_reference extends GenericReferenceActor<ModiscoTGG.InterfaceDeclarationToTInterface, org.gravity.typegraph.basic.TInterface> { }
class InterfaceDeclaration_superInterfaces_2_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.TypeAccess> { }
class InterfaceDeclaration_usagesInTypeAccess_4_reference extends GenericReferenceActor<org.eclipse.modisco.java.Type, org.eclipse.modisco.java.TypeAccess> { }
class TypeToTAbstractType_source_7_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class ASTNodeToTAnnotatable_source_6_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.eclipse.modisco.java.ASTNode> { }
class ASTNodeToTAnnotatable_target_5_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotatable> { }
class AnonymousClassDeclaration_bodyDeclarations_4_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TInterface_pg_4_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_interfaces_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TInterface> { }
class TInterface_outerType_4_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TPackage_interfaces_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TPackage, org.gravity.typegraph.basic.TInterface> { }
class TInterface_defines_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember> { }
class MModifierToTModifier_target_0_reference extends GenericReferenceActor<ModiscoTGG.MModifierToTModifier, org.gravity.typegraph.basic.TModifier> { }
class TMember_tModifier_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TModifier> { }
class MDefinition_modifier_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.BodyDeclaration, org.eclipse.modisco.java.Modifier> { }
class MModifierToTModifier_source_0_reference extends GenericReferenceActor<ModiscoTGG.MModifierToTModifier, org.eclipse.modisco.java.Modifier> { }
class InterfaceDeclaration_bodyDeclarations_3_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TAbstractType_tModifier_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TModifier> { }
class InterfaceDeclaration_package_3_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.Package> { }
class TInterface_package_4_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TPackage> { }
class TMember_signature_2_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature> { }
class TClass_defines_2_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember> { }
class TClass_signature_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TSignature> { }
class MSignatureToTSignature_target_2_reference extends GenericReferenceActor<ModiscoTGG.MSignatureToTSignature, org.gravity.typegraph.basic.TSignature> { }
class MDefinition_mSignature_2_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.gravity.modisco.MSignature> { }
class MSignatureToTSignature_source_2_reference extends GenericReferenceActor<ModiscoTGG.MSignatureToTSignature, org.gravity.modisco.MSignature> { }
class MAnonymous_bodyDeclarations_5_reference extends GenericReferenceActor<org.eclipse.modisco.java.AnonymousClassDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TAbstractType_defines_3_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember> { }
class TAbstractType_signature_1_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TSignature> { }
class AbstractTypeDeclaration_bodyDeclarations_4_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class AnnotationTypeDeclaration_bodyDeclarations_5_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TAnnotationType_defines_4_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember> { }
class ClassDeclaration_bodyDeclarations_6_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class EnumDeclaration_bodyDeclarations_7_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class ASTNodeToTAnnotatable_source_7_reference extends GenericReferenceActor<ModiscoTGG.ASTNodeToTAnnotatable, org.eclipse.modisco.java.ASTNode> { }
class MDefinitionToTMember_source_4_reference extends GenericReferenceActor<ModiscoTGG.MDefinitionToTMember, org.gravity.modisco.MDefinition> { }
class MMethodDefinition_mSignature_3_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.gravity.modisco.MSignature> { }
class MAbstractFlowElementToTAbstractFlowElement_source_9_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class AbstractMethodInvocationToTAccess_source_2_reference extends GenericReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MAbstractFlowElementToTAbstractFlowElement_source_10_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class TCall_tSource_4_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAccess, org.gravity.typegraph.basic.TMember> { }
class TCall_tTarget_4_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAccess, org.gravity.typegraph.basic.TMember> { }
class MMethodDefinition_mMethodInvocations_2_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MMethodDefinition_usages_2_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractMethodDeclaration, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MMethodInvocation_mStaticType_0_reference extends GenericReferenceActor<org.gravity.modisco.MMethodInvocation, org.eclipse.modisco.java.Type> { }
class TCall_staticType_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAccess, org.gravity.typegraph.basic.TAbstractType> { }
class MDefinition_mMethodInvocations_3_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MAbstractMethodDefinition_usages_3_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractMethodDeclaration, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MMethodNameToTMethod_target_0_reference extends GenericReferenceActor<ModiscoTGG.MMethodNameToTMethod, org.gravity.typegraph.basic.TMethod> { }
class TMethod_pg_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMethod, org.gravity.typegraph.basic.TypeGraph> { }
class MGravityModel_mMethodNames_0_reference extends GenericReferenceActor<org.gravity.modisco.MGravityModel, org.gravity.modisco.MMethodName> { }
class MMethodNameToTMethod_source_0_reference extends GenericReferenceActor<ModiscoTGG.MMethodNameToTMethod, org.gravity.modisco.MMethodName> { }
class MMethodSignature_mFirstEntry_0_reference extends GenericReferenceActor<org.gravity.modisco.MParameterList, org.gravity.modisco.MEntry> { }
class MEntryToTParameter_source_0_reference extends GenericReferenceActor<ModiscoTGG.MEntryToTParameter, org.gravity.modisco.MEntry> { }
class MEntryToTParameter_target_0_reference extends GenericReferenceActor<ModiscoTGG.MEntryToTParameter, org.gravity.typegraph.basic.TParameter> { }
class TMethodSignature_firstParameter_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMethodSignature, org.gravity.typegraph.basic.TParameter> { }
class MAbstractFlowElementToTAbstractFlowElement_target_8_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement> { }
class TParameter_type_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TParameter, org.gravity.typegraph.basic.TAbstractType> { }
class TMethodSignature_parameters_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMethodSignature, org.gravity.typegraph.basic.TParameter> { }
class MMethodSignature_mEntrys_0_reference extends GenericReferenceActor<org.gravity.modisco.MParameterList, org.gravity.modisco.MEntry> { }
class MEntry_type_0_reference extends GenericReferenceActor<org.gravity.modisco.MEntry, org.eclipse.modisco.java.Type> { }
class MAbstractFlowElementToTAbstractFlowElement_source_11_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MMethodName_mSignatures_1_reference extends GenericReferenceActor<org.gravity.modisco.MName, org.gravity.modisco.MSignature> { }
class MAbstractFlowElementToTAbstractFlowElement_source_12_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MAbstractFlowElementToTAbstractFlowElement_target_9_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.typegraph.basic.TAbstractFlowElement> { }
class TMethod_signatures_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMethod, org.gravity.typegraph.basic.TMethodSignature> { }
class AbstractTypeDeclaration_bodyDeclarations_8_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TClass_outerType_5_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class AbstractTypeDeclaration_bodyDeclarations_9_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class AbstractTypeDeclaration_bodyDeclarations_10_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class TInterface_outerType_6_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class Model_ownedElements_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Package> { }
class ParameterizedType_type_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.ParameterizedType, org.eclipse.modisco.java.TypeAccess> { }
class Model_orphanTypes_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Type> { }
class TypeToTAbstractType_source_8_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class PrimitiveTypeToTClass_target_0_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.gravity.typegraph.basic.TClass> { }
class TClass_pg_5_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_classes_2_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TypeToTAbstractType_target_4_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TypeToTAbstractType_source_9_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class Model_orphanTypes_2_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Type> { }
class PrimitiveTypeToTClass_source_0_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.eclipse.modisco.java.PrimitiveType> { }
class PrimitiveTypeToTClass_target_1_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.gravity.typegraph.basic.TClass> { }
class TClass_pg_6_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_classes_3_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TypeToTAbstractType_target_5_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TypeToTAbstractType_source_10_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class Model_orphanTypes_3_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Type> { }
class PrimitiveTypeToTClass_source_1_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.eclipse.modisco.java.PrimitiveType> { }
class PrimitiveTypeToTClass_target_2_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.gravity.typegraph.basic.TClass> { }
class TClass_pg_7_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_classes_4_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TypeToTAbstractType_target_6_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TypeToTAbstractType_source_11_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class Model_orphanTypes_4_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Type> { }
class PrimitiveTypeToTClass_source_2_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.eclipse.modisco.java.PrimitiveType> { }
class PrimitiveTypeToTClass_target_3_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.gravity.typegraph.basic.TClass> { }
class TClass_pg_8_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_classes_5_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TypeToTAbstractType_target_7_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TypeToTAbstractType_source_12_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class Model_orphanTypes_5_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Type> { }
class PrimitiveTypeToTClass_source_3_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.eclipse.modisco.java.PrimitiveType> { }
class PrimitiveTypeToTClass_target_4_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.gravity.typegraph.basic.TClass> { }
class TClass_pg_9_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_classes_6_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TypeToTAbstractType_target_8_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TypeToTAbstractType_source_13_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class Model_orphanTypes_6_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Type> { }
class PrimitiveTypeToTClass_source_4_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.eclipse.modisco.java.PrimitiveType> { }
class PrimitiveTypeToTClass_target_5_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.gravity.typegraph.basic.TClass> { }
class TClass_pg_10_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_classes_7_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TypeToTAbstractType_target_9_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TypeToTAbstractType_source_14_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class Model_orphanTypes_7_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Type> { }
class PrimitiveTypeToTClass_source_5_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.eclipse.modisco.java.PrimitiveType> { }
class PrimitiveTypeToTClass_target_6_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.gravity.typegraph.basic.TClass> { }
class TClass_pg_11_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_classes_8_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TypeToTAbstractType_target_10_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TypeToTAbstractType_source_15_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class Model_orphanTypes_8_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Type> { }
class PrimitiveTypeToTClass_source_6_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.eclipse.modisco.java.PrimitiveType> { }
class PrimitiveTypeToTClass_target_7_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.gravity.typegraph.basic.TClass> { }
class TClass_pg_12_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_classes_9_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TypeToTAbstractType_target_11_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TypeToTAbstractType_source_16_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class Model_orphanTypes_9_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Type> { }
class PrimitiveTypeToTClass_source_7_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.eclipse.modisco.java.PrimitiveType> { }
class PrimitiveTypeToTClass_target_8_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.gravity.typegraph.basic.TClass> { }
class TClass_pg_13_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TypeGraph_classes_10_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TypeToTAbstractType_target_12_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TypeToTAbstractType_source_17_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class Model_orphanTypes_10_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Type> { }
class PrimitiveTypeToTClass_source_8_reference extends GenericReferenceActor<ModiscoTGG.PrimitiveTypeToTClass, org.eclipse.modisco.java.PrimitiveType> { }
class TMethodDefinition_returnType_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMethodDefinition, org.gravity.typegraph.basic.TAbstractType> { }
class MMethodDefinition_returnType_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.MethodDeclaration, org.eclipse.modisco.java.TypeAccess> { }
class MMethodSignature_returnType_0_reference extends GenericReferenceActor<org.gravity.modisco.MMethodSignature, org.eclipse.modisco.java.Type> { }
class TMethodSignature_returnType_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMethodSignature, org.gravity.typegraph.basic.TAbstractType> { }
class AbstractMethodInvocationToTAccess_source_3_reference extends GenericReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MAbstractFlowElementToTAbstractFlowElement_source_13_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MDefinition_mMethodInvocations_4_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MAbstractMethodDefinition_usages_4_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractMethodDeclaration, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class AbstractMethodInvocationToTAccess_source_4_reference extends GenericReferenceActor<ModiscoTGG.AbstractMethodInvocationToTAccess, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MAbstractFlowElementToTAbstractFlowElement_source_14_reference extends GenericReferenceActor<ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement, org.gravity.modisco.MAbstractFlowElement> { }
class MDefinition_mMethodInvocations_5_reference extends GenericReferenceActor<org.gravity.modisco.MDefinition, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MAbstractMethodDefinition_usages_5_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractMethodDeclaration, org.eclipse.modisco.java.AbstractMethodInvocation> { }
class MSyntethicMethodToTSyntethicMethod_source_0_reference extends GenericReferenceActor<ModiscoTGG.MSyntethicMethodToTSyntethicMethod, org.gravity.modisco.MSyntheticMethodDefinition> { }
class MSyntethicMethodToTSyntethicMethod_target_0_reference extends GenericReferenceActor<ModiscoTGG.MSyntethicMethodToTSyntethicMethod, org.gravity.typegraph.basic.TSyntethicMethod> { }
class TMethodDefinition_syntethicMethods_0_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMethodDefinition, org.gravity.typegraph.basic.TSyntethicMethod> { }
class TSyntethicMethod_signature_3_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TMember, org.gravity.typegraph.basic.TSignature> { }
class TClass_defines_5_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TMember> { }
class ClassDeclaration_bodyDeclarations_11_reference extends GenericReferenceActor<org.eclipse.modisco.java.AbstractTypeDeclaration, org.eclipse.modisco.java.BodyDeclaration> { }
class MMethodDefinition_syntheticMethodDefinitions_0_reference extends GenericReferenceActor<org.gravity.modisco.MMethodDefinition, org.gravity.modisco.MSyntheticMethodDefinition> { }
class MDefinition_comments_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.ASTNode, org.eclipse.modisco.java.Comment> { }
class TMember_tAnnotation_3_reference extends GenericReferenceActor<org.gravity.typegraph.basic.annotations.TAnnotatable, org.gravity.typegraph.basic.annotations.TAnnotation> { }
class LineCommentToTTextAnnotation_source_0_reference extends GenericReferenceActor<ModiscoTGG.LineCommentToTTextAnnotation, org.eclipse.modisco.java.LineComment> { }
class LineCommentToTTextAnnotation_target_0_reference extends GenericReferenceActor<ModiscoTGG.LineCommentToTTextAnnotation, org.gravity.typegraph.basic.annotations.TTextAnnotation> { }
class MGravityModel_typeParameters_0_reference extends GenericReferenceActor<org.gravity.modisco.MGravityModel, org.eclipse.modisco.java.TypeParameter> { }
class TypeToTAbstractType_source_18_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class TypeToTAbstractType_target_13_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class TypeGraph_classes_11_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TypeGraph, org.gravity.typegraph.basic.TClass> { }
class TClass_pg_14_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class Model_orphanTypes_11_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.Type> { }
class AbstractTypeDeclaration_modifier_1_reference extends GenericReferenceActor<org.eclipse.modisco.java.BodyDeclaration, org.eclipse.modisco.java.Modifier> { }
class MGravityModel_unresolvedItems_0_reference extends GenericReferenceActor<org.eclipse.modisco.java.Model, org.eclipse.modisco.java.UnresolvedItem> { }
class TUnresolvedType_pg_15_reference extends GenericReferenceActor<org.gravity.typegraph.basic.TAbstractType, org.gravity.typegraph.basic.TypeGraph> { }
class TypeToTAbstractType_source_19_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.eclipse.modisco.java.Type> { }
class TypeToTAbstractType_target_14_reference extends GenericReferenceActor<ModiscoTGG.TypeToTAbstractType, org.gravity.typegraph.basic.TAbstractType> { }
class VariableDeclarationFragmentToTFieldDefinition_source_0_reference extends GenericReferenceActor<ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition, org.eclipse.modisco.java.VariableDeclarationFragment> { }
class VariableDeclarationFragmentToTFieldDefinition_target_0_reference extends GenericReferenceActor<ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition, org.gravity.typegraph.basic.TFieldDefinition> { }

