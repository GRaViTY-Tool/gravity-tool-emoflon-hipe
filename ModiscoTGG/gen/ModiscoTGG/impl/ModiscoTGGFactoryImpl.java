/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModiscoTGGFactoryImpl extends EFactoryImpl implements ModiscoTGGFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModiscoTGGFactory init() {
		try {
			ModiscoTGGFactory theModiscoTGGFactory = (ModiscoTGGFactory) EPackage.Registry.INSTANCE
					.getEFactory(ModiscoTGGPackage.eNS_URI);
			if (theModiscoTGGFactory != null) {
				return theModiscoTGGFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModiscoTGGFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoTGGFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModiscoTGGPackage.BOOLEAN_LITERAL_TO_TBOOL_NODE:
			return createBooleanLiteralToTBoolNode();
		case ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE:
			return createNumberLiteralToTNumberNode();
		case ModiscoTGGPackage.STRING_LITERAL_TO_TTEXT_NODE:
			return createStringLiteralToTTextNode();
		case ModiscoTGGPackage.CLASS_LITERAL_TO_CLASS_NODE:
			return createClassLiteralToClassNode();
		case ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS:
			return createClassDeclarationToTClass();
		case ModiscoTGGPackage.PACKAGE_TO_TPACKAGE:
			return createPackageToTPackage();
		case ModiscoTGGPackage.MODEL_TO_TYPE_GRAPH:
			return createModelToTypeGraph();
		case ModiscoTGGPackage.INTERFACE_DECLARATION_TO_TINTERFACE:
			return createInterfaceDeclarationToTInterface();
		case ModiscoTGGPackage.MDEFINITION_TO_TMEMBER:
			return createMDefinitionToTMember();
		case ModiscoTGGPackage.FIELD_ACCESS_TO_TACCESS:
			return createFieldAccessToTAccess();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_TO_TCLASS:
			return createPrimitiveTypeToTClass();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			return createAnonymousClassDeclarationToTClass();
		case ModiscoTGGPackage.MMETHOD_NAME_TO_TMETHOD:
			return createMMethodNameToTMethod();
		case ModiscoTGGPackage.MENTRY_TO_TPARAMETER:
			return createMEntryToTParameter();
		case ModiscoTGGPackage.MSIGNATURE_TO_TSIGNATURE:
			return createMSignatureToTSignature();
		case ModiscoTGGPackage.AST_NODE_TO_TANNOTATABLE:
			return createASTNodeToTAnnotatable();
		case ModiscoTGGPackage.TYPE_TO_TABSTRACT_TYPE:
			return createTypeToTAbstractType();
		case ModiscoTGGPackage.MFIELD_NAME_TO_TFIELD:
			return createMFieldNameToTField();
		case ModiscoTGGPackage.LINE_COMMENT_TO_TTEXT_ANNOTATION:
			return createLineCommentToTTextAnnotation();
		case ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS:
			return createMSingleVariableAccessToTAccess();
		case ModiscoTGGPackage.ANNOTATION_TO_TANNOTATION:
			return createAnnotationToTAnnotation();
		case ModiscoTGGPackage.TYPE_PARAMETER_TO_TCLASS:
			return createTypeParameterToTClass();
		case ModiscoTGGPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS:
			return createUnresolvedTypeDeclarationToTClass();
		case ModiscoTGGPackage.MODIFIER_TO_TCLASS_ENTITY:
			return createModifierToTClassEntity();
		case ModiscoTGGPackage.MODIFIER_TO_TFIELD_ENTITY:
			return createModifierToTFieldEntity();
		case ModiscoTGGPackage.MODIFIER_TO_TMETHOD_ENTITY:
			return createModifierToTMethodEntity();
		case ModiscoTGGPackage.MODIFIER_TO_ABSTRACT_TYPE:
			return createModifierToAbstractType();
		case ModiscoTGGPackage.MMODIFIER_TO_TMODIFIER:
			return createMModifierToTModifier();
		case ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD:
			return createMSyntethicMethodToTSyntethicMethod();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			return createAnnotationMemberValuePairToTAnnotationValue();
		case ModiscoTGGPackage.STATIC_TYPE_TO_ACCESS_STATIC_TYPE:
			return createStaticTypeToAccessStaticType();
		case ModiscoTGGPackage.MFLOW_TO_TFLOW:
			return createMFlowToTFlow();
		case ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT:
			return createMAbstractFlowElementToTAbstractFlowElement();
		case ModiscoTGGPackage.ABSTRACT_METHOD_INVOCATION_TO_TACCESS:
			return createAbstractMethodInvocationToTAccess();
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION:
			return createVariableDeclarationFragmentToTFieldDefinition();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER:
			return createAnnotationMemberKey__Marker();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_MARKER:
			return createAnnotationMemberValueAnnotation__Marker();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER:
			return createAnnotationMemberValueAnnotationArray__Marker();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_MARKER:
			return createAnnotationMemberValueBoolean__Marker();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER:
			return createAnnotationMemberValueBooleanArray__Marker();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER:
			return createAnnotationMemberValueClass__Marker();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER:
			return createAnnotationMemberValueClassArray__Marker();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_NUMBER_MARKER:
			return createAnnotationMemberValueNumber__Marker();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER:
			return createAnnotationMemberValueNumberArray__Marker();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_STRING_MARKER:
			return createAnnotationMemberValueString__Marker();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER:
			return createAnnotationMemberValueStringArray__Marker();
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER:
			return createAnnotationOnBodyDeclaration__Marker();
		case ModiscoTGGPackage.ANNOTATION_TYPE_MARKER:
			return createAnnotationType__Marker();
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER:
			return createAnnotationTypeAccess__Marker();
		case ModiscoTGGPackage.ANNOTATION_TYPE_IN_ANONYMOUS_MARKER:
			return createAnnotationTypeInAnonymous__Marker();
		case ModiscoTGGPackage.ANNOTATION_TYPE_NESTED_MARKER:
			return createAnnotationTypeNested__Marker();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER:
			return createAnonymousClass__Marker();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER:
			return createAnonymousClassTypeClass__Marker();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER:
			return createAnonymousClassTypeInterface__Marker();
		case ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER:
			return createArrayInitializerIgnoreExpressionsEdge__Marker();
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER:
			return createArrayTypeToClass__Marker();
		case ModiscoTGGPackage.CLASS_MARKER:
			return createClass__Marker();
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER:
			return createClassExtendsClass__Marker();
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER:
			return createClassImplementsInterface__Marker();
		case ModiscoTGGPackage.CLASS_IN_ANONYMOUS_MARKER:
			return createClassInAnonymous__Marker();
		case ModiscoTGGPackage.CLASS_INNER_ANON_CLASS_MEMBER_MARKER:
			return createClassInnerAnonClassMember__Marker();
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER:
			return createClassInnerClassMember__Marker();
		case ModiscoTGGPackage.CLASS_INSTANCE_CREATION_MARKER:
			return createClassInstanceCreation__Marker();
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER:
			return createConstructorDefinition__Marker();
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER:
			return createConstructorInvocation__Marker();
		case ModiscoTGGPackage.ENUM_MARKER:
			return createEnum__Marker();
		case ModiscoTGGPackage.ENUM_IN_ANONYMOUS_MARKER:
			return createEnumInAnonymous__Marker();
		case ModiscoTGGPackage.FIELD_ACCESS_READ_MARKER:
			return createFieldAccessRead__Marker();
		case ModiscoTGGPackage.FIELD_ACCESS_READ_WRITE_MARKER:
			return createFieldAccessReadWrite__Marker();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER:
			return createFieldAccessWrite__Marker();
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER:
			return createFieldDefinition__Marker();
		case ModiscoTGGPackage.FIELD_NAME_MARKER:
			return createFieldName__Marker();
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER:
			return createFieldSignature__Marker();
		case ModiscoTGGPackage.FIELD_TYPE_MARKER:
			return createFieldType__Marker();
		case ModiscoTGGPackage.FLOW_MARKER:
			return createFlow__Marker();
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER:
			return createIncomingFlow__Marker();
		case ModiscoTGGPackage.INTERFACE_MARKER:
			return createInterface__Marker();
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER:
			return createInterfaceExtendsInterface__Marker();
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER:
			return createInterfaceInAnonymous__Marker();
		case ModiscoTGGPackage.INTERFACE_MEMBER_MARKER:
			return createInterfaceMember__Marker();
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER:
			return createLinkDefinitionToAnonymous__Marker();
		case ModiscoTGGPackage.LINK_DEFINITION_TO_TYPE_MARKER:
			return createLinkDefinitionToType__Marker();
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER:
			return createMemberInAnnotationVisibility__Marker();
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER:
			return createMemberInClassVisibility__Marker();
		case ModiscoTGGPackage.MEMBER_IN_ENUM_VISIBILITY_MARKER:
			return createMemberInEnumVisibility__Marker();
		case ModiscoTGGPackage.METHOD_DEFINITION_MARKER:
			return createMethodDefinition__Marker();
		case ModiscoTGGPackage.METHOD_INVOCATION_MARKER:
			return createMethodInvocation__Marker();
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER:
			return createMethodInvocationRecursive__Marker();
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER:
			return createMethodInvocationStaticType__Marker();
		case ModiscoTGGPackage.METHOD_NAME_MARKER:
			return createMethodName__Marker();
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER:
			return createMethodOverriding__Marker();
		case ModiscoTGGPackage.METHOD_PARAMETER_MARKER:
			return createMethodParameter__Marker();
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER:
			return createMethodParameterLink__Marker();
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_FIRST_MARKER:
			return createMethodParameterLinkFirst__Marker();
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER:
			return createMethodParameterType__Marker();
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER:
			return createMethodSignature__Marker();
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER:
			return createModelToPg__Marker();
		case ModiscoTGGPackage.NESTED_CLASS_IN_TYPE_MARKER:
			return createNestedClassInType__Marker();
		case ModiscoTGGPackage.NESTED_ENUM_MARKER:
			return createNestedEnum__Marker();
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER:
			return createNestedInterfaceInType__Marker();
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER:
			return createOutgoingFlow__Marker();
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER:
			return createPackageToPGPackage__Marker();
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER:
			return createParameterizedTypeToClass__Marker();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_BOOLEAN_MARKER:
			return createPrimitiveTypeIsBoolean__Marker();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_BYTE_MARKER:
			return createPrimitiveTypeIsByte__Marker();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_CHAR_MARKER:
			return createPrimitiveTypeIsChar__Marker();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_DOUBLE_MARKER:
			return createPrimitiveTypeIsDouble__Marker();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_FLOAT_MARKER:
			return createPrimitiveTypeIsFloat__Marker();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_INT_MARKER:
			return createPrimitiveTypeIsInt__Marker();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER:
			return createPrimitiveTypeIsLong__Marker();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_SHORT_MARKER:
			return createPrimitiveTypeIsShort__Marker();
		case ModiscoTGGPackage.PRIMITIVE_TYPES_IS_VOID_MARKER:
			return createPrimitiveTypesIsVoid__Marker();
		case ModiscoTGGPackage.RETURN_TYPE_MARKER:
			return createReturnType__Marker();
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER:
			return createSignatureReturnType__Marker();
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER:
			return createSubPackageToPGPackage__Marker();
		case ModiscoTGGPackage.SUPER_CONSTRUCTOR_INVOCATION_MARKER:
			return createSuperConstructorInvocation__Marker();
		case ModiscoTGGPackage.SUPER_METHOD_INVOCATION_MARKER:
			return createSuperMethodInvocation__Marker();
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER:
			return createSyntethicMethod__Marker();
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER:
			return createTextAnnotations__Marker();
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER:
			return createTypeParameter__Marker();
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER:
			return createTypesOrphaned__Marker();
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER:
			return createTypesVisibility__Marker();
		case ModiscoTGGPackage.UNRESOLVED_TYPE_DECLARATION_MARKER:
			return createUnresolvedTypeDeclaration__Marker();
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER:
			return createVariableDeclarationFragment__Marker();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteralToTBoolNode createBooleanLiteralToTBoolNode() {
		BooleanLiteralToTBoolNodeImpl booleanLiteralToTBoolNode = new BooleanLiteralToTBoolNodeImpl();
		return booleanLiteralToTBoolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberLiteralToTNumberNode createNumberLiteralToTNumberNode() {
		NumberLiteralToTNumberNodeImpl numberLiteralToTNumberNode = new NumberLiteralToTNumberNodeImpl();
		return numberLiteralToTNumberNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteralToTTextNode createStringLiteralToTTextNode() {
		StringLiteralToTTextNodeImpl stringLiteralToTTextNode = new StringLiteralToTTextNodeImpl();
		return stringLiteralToTTextNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassLiteralToClassNode createClassLiteralToClassNode() {
		ClassLiteralToClassNodeImpl classLiteralToClassNode = new ClassLiteralToClassNodeImpl();
		return classLiteralToClassNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclarationToTClass createClassDeclarationToTClass() {
		ClassDeclarationToTClassImpl classDeclarationToTClass = new ClassDeclarationToTClassImpl();
		return classDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageToTPackage createPackageToTPackage() {
		PackageToTPackageImpl packageToTPackage = new PackageToTPackageImpl();
		return packageToTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelToTypeGraph createModelToTypeGraph() {
		ModelToTypeGraphImpl modelToTypeGraph = new ModelToTypeGraphImpl();
		return modelToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDeclarationToTInterface createInterfaceDeclarationToTInterface() {
		InterfaceDeclarationToTInterfaceImpl interfaceDeclarationToTInterface = new InterfaceDeclarationToTInterfaceImpl();
		return interfaceDeclarationToTInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember createMDefinitionToTMember() {
		MDefinitionToTMemberImpl mDefinitionToTMember = new MDefinitionToTMemberImpl();
		return mDefinitionToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccessToTAccess createFieldAccessToTAccess() {
		FieldAccessToTAccessImpl fieldAccessToTAccess = new FieldAccessToTAccessImpl();
		return fieldAccessToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeToTClass createPrimitiveTypeToTClass() {
		PrimitiveTypeToTClassImpl primitiveTypeToTClass = new PrimitiveTypeToTClassImpl();
		return primitiveTypeToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclarationToTClass createAnonymousClassDeclarationToTClass() {
		AnonymousClassDeclarationToTClassImpl anonymousClassDeclarationToTClass = new AnonymousClassDeclarationToTClassImpl();
		return anonymousClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodNameToTMethod createMMethodNameToTMethod() {
		MMethodNameToTMethodImpl mMethodNameToTMethod = new MMethodNameToTMethodImpl();
		return mMethodNameToTMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEntryToTParameter createMEntryToTParameter() {
		MEntryToTParameterImpl mEntryToTParameter = new MEntryToTParameterImpl();
		return mEntryToTParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSignatureToTSignature createMSignatureToTSignature() {
		MSignatureToTSignatureImpl mSignatureToTSignature = new MSignatureToTSignatureImpl();
		return mSignatureToTSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASTNodeToTAnnotatable createASTNodeToTAnnotatable() {
		ASTNodeToTAnnotatableImpl astNodeToTAnnotatable = new ASTNodeToTAnnotatableImpl();
		return astNodeToTAnnotatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType createTypeToTAbstractType() {
		TypeToTAbstractTypeImpl typeToTAbstractType = new TypeToTAbstractTypeImpl();
		return typeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFieldNameToTField createMFieldNameToTField() {
		MFieldNameToTFieldImpl mFieldNameToTField = new MFieldNameToTFieldImpl();
		return mFieldNameToTField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineCommentToTTextAnnotation createLineCommentToTTextAnnotation() {
		LineCommentToTTextAnnotationImpl lineCommentToTTextAnnotation = new LineCommentToTTextAnnotationImpl();
		return lineCommentToTTextAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSingleVariableAccessToTAccess createMSingleVariableAccessToTAccess() {
		MSingleVariableAccessToTAccessImpl mSingleVariableAccessToTAccess = new MSingleVariableAccessToTAccessImpl();
		return mSingleVariableAccessToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationToTAnnotation createAnnotationToTAnnotation() {
		AnnotationToTAnnotationImpl annotationToTAnnotation = new AnnotationToTAnnotationImpl();
		return annotationToTAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameterToTClass createTypeParameterToTClass() {
		TypeParameterToTClassImpl typeParameterToTClass = new TypeParameterToTClassImpl();
		return typeParameterToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedTypeDeclarationToTClass createUnresolvedTypeDeclarationToTClass() {
		UnresolvedTypeDeclarationToTClassImpl unresolvedTypeDeclarationToTClass = new UnresolvedTypeDeclarationToTClassImpl();
		return unresolvedTypeDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifierToTClassEntity createModifierToTClassEntity() {
		ModifierToTClassEntityImpl modifierToTClassEntity = new ModifierToTClassEntityImpl();
		return modifierToTClassEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifierToTFieldEntity createModifierToTFieldEntity() {
		ModifierToTFieldEntityImpl modifierToTFieldEntity = new ModifierToTFieldEntityImpl();
		return modifierToTFieldEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifierToTMethodEntity createModifierToTMethodEntity() {
		ModifierToTMethodEntityImpl modifierToTMethodEntity = new ModifierToTMethodEntityImpl();
		return modifierToTMethodEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifierToAbstractType createModifierToAbstractType() {
		ModifierToAbstractTypeImpl modifierToAbstractType = new ModifierToAbstractTypeImpl();
		return modifierToAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MModifierToTModifier createMModifierToTModifier() {
		MModifierToTModifierImpl mModifierToTModifier = new MModifierToTModifierImpl();
		return mModifierToTModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSyntethicMethodToTSyntethicMethod createMSyntethicMethodToTSyntethicMethod() {
		MSyntethicMethodToTSyntethicMethodImpl mSyntethicMethodToTSyntethicMethod = new MSyntethicMethodToTSyntethicMethodImpl();
		return mSyntethicMethodToTSyntethicMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePairToTAnnotationValue createAnnotationMemberValuePairToTAnnotationValue() {
		AnnotationMemberValuePairToTAnnotationValueImpl annotationMemberValuePairToTAnnotationValue = new AnnotationMemberValuePairToTAnnotationValueImpl();
		return annotationMemberValuePairToTAnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticTypeToAccessStaticType createStaticTypeToAccessStaticType() {
		StaticTypeToAccessStaticTypeImpl staticTypeToAccessStaticType = new StaticTypeToAccessStaticTypeImpl();
		return staticTypeToAccessStaticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFlowToTFlow createMFlowToTFlow() {
		MFlowToTFlowImpl mFlowToTFlow = new MFlowToTFlowImpl();
		return mFlowToTFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElementToTAbstractFlowElement createMAbstractFlowElementToTAbstractFlowElement() {
		MAbstractFlowElementToTAbstractFlowElementImpl mAbstractFlowElementToTAbstractFlowElement = new MAbstractFlowElementToTAbstractFlowElementImpl();
		return mAbstractFlowElementToTAbstractFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodInvocationToTAccess createAbstractMethodInvocationToTAccess() {
		AbstractMethodInvocationToTAccessImpl abstractMethodInvocationToTAccess = new AbstractMethodInvocationToTAccessImpl();
		return abstractMethodInvocationToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragmentToTFieldDefinition createVariableDeclarationFragmentToTFieldDefinition() {
		VariableDeclarationFragmentToTFieldDefinitionImpl variableDeclarationFragmentToTFieldDefinition = new VariableDeclarationFragmentToTFieldDefinitionImpl();
		return variableDeclarationFragmentToTFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberKey__Marker createAnnotationMemberKey__Marker() {
		AnnotationMemberKey__MarkerImpl annotationMemberKey__Marker = new AnnotationMemberKey__MarkerImpl();
		return annotationMemberKey__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueAnnotation__Marker createAnnotationMemberValueAnnotation__Marker() {
		AnnotationMemberValueAnnotation__MarkerImpl annotationMemberValueAnnotation__Marker = new AnnotationMemberValueAnnotation__MarkerImpl();
		return annotationMemberValueAnnotation__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueAnnotationArray__Marker createAnnotationMemberValueAnnotationArray__Marker() {
		AnnotationMemberValueAnnotationArray__MarkerImpl annotationMemberValueAnnotationArray__Marker = new AnnotationMemberValueAnnotationArray__MarkerImpl();
		return annotationMemberValueAnnotationArray__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueBoolean__Marker createAnnotationMemberValueBoolean__Marker() {
		AnnotationMemberValueBoolean__MarkerImpl annotationMemberValueBoolean__Marker = new AnnotationMemberValueBoolean__MarkerImpl();
		return annotationMemberValueBoolean__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueBooleanArray__Marker createAnnotationMemberValueBooleanArray__Marker() {
		AnnotationMemberValueBooleanArray__MarkerImpl annotationMemberValueBooleanArray__Marker = new AnnotationMemberValueBooleanArray__MarkerImpl();
		return annotationMemberValueBooleanArray__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueClass__Marker createAnnotationMemberValueClass__Marker() {
		AnnotationMemberValueClass__MarkerImpl annotationMemberValueClass__Marker = new AnnotationMemberValueClass__MarkerImpl();
		return annotationMemberValueClass__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueClassArray__Marker createAnnotationMemberValueClassArray__Marker() {
		AnnotationMemberValueClassArray__MarkerImpl annotationMemberValueClassArray__Marker = new AnnotationMemberValueClassArray__MarkerImpl();
		return annotationMemberValueClassArray__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueNumber__Marker createAnnotationMemberValueNumber__Marker() {
		AnnotationMemberValueNumber__MarkerImpl annotationMemberValueNumber__Marker = new AnnotationMemberValueNumber__MarkerImpl();
		return annotationMemberValueNumber__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueNumberArray__Marker createAnnotationMemberValueNumberArray__Marker() {
		AnnotationMemberValueNumberArray__MarkerImpl annotationMemberValueNumberArray__Marker = new AnnotationMemberValueNumberArray__MarkerImpl();
		return annotationMemberValueNumberArray__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueString__Marker createAnnotationMemberValueString__Marker() {
		AnnotationMemberValueString__MarkerImpl annotationMemberValueString__Marker = new AnnotationMemberValueString__MarkerImpl();
		return annotationMemberValueString__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueStringArray__Marker createAnnotationMemberValueStringArray__Marker() {
		AnnotationMemberValueStringArray__MarkerImpl annotationMemberValueStringArray__Marker = new AnnotationMemberValueStringArray__MarkerImpl();
		return annotationMemberValueStringArray__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationOnBodyDeclaration__Marker createAnnotationOnBodyDeclaration__Marker() {
		AnnotationOnBodyDeclaration__MarkerImpl annotationOnBodyDeclaration__Marker = new AnnotationOnBodyDeclaration__MarkerImpl();
		return annotationOnBodyDeclaration__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationType__Marker createAnnotationType__Marker() {
		AnnotationType__MarkerImpl annotationType__Marker = new AnnotationType__MarkerImpl();
		return annotationType__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeAccess__Marker createAnnotationTypeAccess__Marker() {
		AnnotationTypeAccess__MarkerImpl annotationTypeAccess__Marker = new AnnotationTypeAccess__MarkerImpl();
		return annotationTypeAccess__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeInAnonymous__Marker createAnnotationTypeInAnonymous__Marker() {
		AnnotationTypeInAnonymous__MarkerImpl annotationTypeInAnonymous__Marker = new AnnotationTypeInAnonymous__MarkerImpl();
		return annotationTypeInAnonymous__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeNested__Marker createAnnotationTypeNested__Marker() {
		AnnotationTypeNested__MarkerImpl annotationTypeNested__Marker = new AnnotationTypeNested__MarkerImpl();
		return annotationTypeNested__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClass__Marker createAnonymousClass__Marker() {
		AnonymousClass__MarkerImpl anonymousClass__Marker = new AnonymousClass__MarkerImpl();
		return anonymousClass__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassTypeClass__Marker createAnonymousClassTypeClass__Marker() {
		AnonymousClassTypeClass__MarkerImpl anonymousClassTypeClass__Marker = new AnonymousClassTypeClass__MarkerImpl();
		return anonymousClassTypeClass__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassTypeInterface__Marker createAnonymousClassTypeInterface__Marker() {
		AnonymousClassTypeInterface__MarkerImpl anonymousClassTypeInterface__Marker = new AnonymousClassTypeInterface__MarkerImpl();
		return anonymousClassTypeInterface__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayInitializerIgnoreExpressionsEdge__Marker createArrayInitializerIgnoreExpressionsEdge__Marker() {
		ArrayInitializerIgnoreExpressionsEdge__MarkerImpl arrayInitializerIgnoreExpressionsEdge__Marker = new ArrayInitializerIgnoreExpressionsEdge__MarkerImpl();
		return arrayInitializerIgnoreExpressionsEdge__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayTypeToClass__Marker createArrayTypeToClass__Marker() {
		ArrayTypeToClass__MarkerImpl arrayTypeToClass__Marker = new ArrayTypeToClass__MarkerImpl();
		return arrayTypeToClass__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class__Marker createClass__Marker() {
		Class__MarkerImpl class__Marker = new Class__MarkerImpl();
		return class__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassExtendsClass__Marker createClassExtendsClass__Marker() {
		ClassExtendsClass__MarkerImpl classExtendsClass__Marker = new ClassExtendsClass__MarkerImpl();
		return classExtendsClass__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassImplementsInterface__Marker createClassImplementsInterface__Marker() {
		ClassImplementsInterface__MarkerImpl classImplementsInterface__Marker = new ClassImplementsInterface__MarkerImpl();
		return classImplementsInterface__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInAnonymous__Marker createClassInAnonymous__Marker() {
		ClassInAnonymous__MarkerImpl classInAnonymous__Marker = new ClassInAnonymous__MarkerImpl();
		return classInAnonymous__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInnerAnonClassMember__Marker createClassInnerAnonClassMember__Marker() {
		ClassInnerAnonClassMember__MarkerImpl classInnerAnonClassMember__Marker = new ClassInnerAnonClassMember__MarkerImpl();
		return classInnerAnonClassMember__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInnerClassMember__Marker createClassInnerClassMember__Marker() {
		ClassInnerClassMember__MarkerImpl classInnerClassMember__Marker = new ClassInnerClassMember__MarkerImpl();
		return classInnerClassMember__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInstanceCreation__Marker createClassInstanceCreation__Marker() {
		ClassInstanceCreation__MarkerImpl classInstanceCreation__Marker = new ClassInstanceCreation__MarkerImpl();
		return classInstanceCreation__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorDefinition__Marker createConstructorDefinition__Marker() {
		ConstructorDefinition__MarkerImpl constructorDefinition__Marker = new ConstructorDefinition__MarkerImpl();
		return constructorDefinition__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorInvocation__Marker createConstructorInvocation__Marker() {
		ConstructorInvocation__MarkerImpl constructorInvocation__Marker = new ConstructorInvocation__MarkerImpl();
		return constructorInvocation__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enum__Marker createEnum__Marker() {
		Enum__MarkerImpl enum__Marker = new Enum__MarkerImpl();
		return enum__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumInAnonymous__Marker createEnumInAnonymous__Marker() {
		EnumInAnonymous__MarkerImpl enumInAnonymous__Marker = new EnumInAnonymous__MarkerImpl();
		return enumInAnonymous__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccessRead__Marker createFieldAccessRead__Marker() {
		FieldAccessRead__MarkerImpl fieldAccessRead__Marker = new FieldAccessRead__MarkerImpl();
		return fieldAccessRead__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccessReadWrite__Marker createFieldAccessReadWrite__Marker() {
		FieldAccessReadWrite__MarkerImpl fieldAccessReadWrite__Marker = new FieldAccessReadWrite__MarkerImpl();
		return fieldAccessReadWrite__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccessWrite__Marker createFieldAccessWrite__Marker() {
		FieldAccessWrite__MarkerImpl fieldAccessWrite__Marker = new FieldAccessWrite__MarkerImpl();
		return fieldAccessWrite__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDefinition__Marker createFieldDefinition__Marker() {
		FieldDefinition__MarkerImpl fieldDefinition__Marker = new FieldDefinition__MarkerImpl();
		return fieldDefinition__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldName__Marker createFieldName__Marker() {
		FieldName__MarkerImpl fieldName__Marker = new FieldName__MarkerImpl();
		return fieldName__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldSignature__Marker createFieldSignature__Marker() {
		FieldSignature__MarkerImpl fieldSignature__Marker = new FieldSignature__MarkerImpl();
		return fieldSignature__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldType__Marker createFieldType__Marker() {
		FieldType__MarkerImpl fieldType__Marker = new FieldType__MarkerImpl();
		return fieldType__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flow__Marker createFlow__Marker() {
		Flow__MarkerImpl flow__Marker = new Flow__MarkerImpl();
		return flow__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncomingFlow__Marker createIncomingFlow__Marker() {
		IncomingFlow__MarkerImpl incomingFlow__Marker = new IncomingFlow__MarkerImpl();
		return incomingFlow__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface__Marker createInterface__Marker() {
		Interface__MarkerImpl interface__Marker = new Interface__MarkerImpl();
		return interface__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceExtendsInterface__Marker createInterfaceExtendsInterface__Marker() {
		InterfaceExtendsInterface__MarkerImpl interfaceExtendsInterface__Marker = new InterfaceExtendsInterface__MarkerImpl();
		return interfaceExtendsInterface__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceInAnonymous__Marker createInterfaceInAnonymous__Marker() {
		InterfaceInAnonymous__MarkerImpl interfaceInAnonymous__Marker = new InterfaceInAnonymous__MarkerImpl();
		return interfaceInAnonymous__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceMember__Marker createInterfaceMember__Marker() {
		InterfaceMember__MarkerImpl interfaceMember__Marker = new InterfaceMember__MarkerImpl();
		return interfaceMember__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkDefinitionToAnonymous__Marker createLinkDefinitionToAnonymous__Marker() {
		LinkDefinitionToAnonymous__MarkerImpl linkDefinitionToAnonymous__Marker = new LinkDefinitionToAnonymous__MarkerImpl();
		return linkDefinitionToAnonymous__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkDefinitionToType__Marker createLinkDefinitionToType__Marker() {
		LinkDefinitionToType__MarkerImpl linkDefinitionToType__Marker = new LinkDefinitionToType__MarkerImpl();
		return linkDefinitionToType__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberInAnnotationVisibility__Marker createMemberInAnnotationVisibility__Marker() {
		MemberInAnnotationVisibility__MarkerImpl memberInAnnotationVisibility__Marker = new MemberInAnnotationVisibility__MarkerImpl();
		return memberInAnnotationVisibility__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberInClassVisibility__Marker createMemberInClassVisibility__Marker() {
		MemberInClassVisibility__MarkerImpl memberInClassVisibility__Marker = new MemberInClassVisibility__MarkerImpl();
		return memberInClassVisibility__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberInEnumVisibility__Marker createMemberInEnumVisibility__Marker() {
		MemberInEnumVisibility__MarkerImpl memberInEnumVisibility__Marker = new MemberInEnumVisibility__MarkerImpl();
		return memberInEnumVisibility__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDefinition__Marker createMethodDefinition__Marker() {
		MethodDefinition__MarkerImpl methodDefinition__Marker = new MethodDefinition__MarkerImpl();
		return methodDefinition__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocation__Marker createMethodInvocation__Marker() {
		MethodInvocation__MarkerImpl methodInvocation__Marker = new MethodInvocation__MarkerImpl();
		return methodInvocation__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocationRecursive__Marker createMethodInvocationRecursive__Marker() {
		MethodInvocationRecursive__MarkerImpl methodInvocationRecursive__Marker = new MethodInvocationRecursive__MarkerImpl();
		return methodInvocationRecursive__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocationStaticType__Marker createMethodInvocationStaticType__Marker() {
		MethodInvocationStaticType__MarkerImpl methodInvocationStaticType__Marker = new MethodInvocationStaticType__MarkerImpl();
		return methodInvocationStaticType__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodName__Marker createMethodName__Marker() {
		MethodName__MarkerImpl methodName__Marker = new MethodName__MarkerImpl();
		return methodName__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodOverriding__Marker createMethodOverriding__Marker() {
		MethodOverriding__MarkerImpl methodOverriding__Marker = new MethodOverriding__MarkerImpl();
		return methodOverriding__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodParameter__Marker createMethodParameter__Marker() {
		MethodParameter__MarkerImpl methodParameter__Marker = new MethodParameter__MarkerImpl();
		return methodParameter__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodParameterLink__Marker createMethodParameterLink__Marker() {
		MethodParameterLink__MarkerImpl methodParameterLink__Marker = new MethodParameterLink__MarkerImpl();
		return methodParameterLink__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodParameterLinkFirst__Marker createMethodParameterLinkFirst__Marker() {
		MethodParameterLinkFirst__MarkerImpl methodParameterLinkFirst__Marker = new MethodParameterLinkFirst__MarkerImpl();
		return methodParameterLinkFirst__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodParameterType__Marker createMethodParameterType__Marker() {
		MethodParameterType__MarkerImpl methodParameterType__Marker = new MethodParameterType__MarkerImpl();
		return methodParameterType__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodSignature__Marker createMethodSignature__Marker() {
		MethodSignature__MarkerImpl methodSignature__Marker = new MethodSignature__MarkerImpl();
		return methodSignature__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelToPg__Marker createModelToPg__Marker() {
		ModelToPg__MarkerImpl modelToPg__Marker = new ModelToPg__MarkerImpl();
		return modelToPg__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedClassInType__Marker createNestedClassInType__Marker() {
		NestedClassInType__MarkerImpl nestedClassInType__Marker = new NestedClassInType__MarkerImpl();
		return nestedClassInType__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedEnum__Marker createNestedEnum__Marker() {
		NestedEnum__MarkerImpl nestedEnum__Marker = new NestedEnum__MarkerImpl();
		return nestedEnum__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedInterfaceInType__Marker createNestedInterfaceInType__Marker() {
		NestedInterfaceInType__MarkerImpl nestedInterfaceInType__Marker = new NestedInterfaceInType__MarkerImpl();
		return nestedInterfaceInType__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutgoingFlow__Marker createOutgoingFlow__Marker() {
		OutgoingFlow__MarkerImpl outgoingFlow__Marker = new OutgoingFlow__MarkerImpl();
		return outgoingFlow__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageToPGPackage__Marker createPackageToPGPackage__Marker() {
		PackageToPGPackage__MarkerImpl packageToPGPackage__Marker = new PackageToPGPackage__MarkerImpl();
		return packageToPGPackage__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedTypeToClass__Marker createParameterizedTypeToClass__Marker() {
		ParameterizedTypeToClass__MarkerImpl parameterizedTypeToClass__Marker = new ParameterizedTypeToClass__MarkerImpl();
		return parameterizedTypeToClass__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsBoolean__Marker createPrimitiveTypeIsBoolean__Marker() {
		PrimitiveTypeIsBoolean__MarkerImpl primitiveTypeIsBoolean__Marker = new PrimitiveTypeIsBoolean__MarkerImpl();
		return primitiveTypeIsBoolean__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsByte__Marker createPrimitiveTypeIsByte__Marker() {
		PrimitiveTypeIsByte__MarkerImpl primitiveTypeIsByte__Marker = new PrimitiveTypeIsByte__MarkerImpl();
		return primitiveTypeIsByte__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsChar__Marker createPrimitiveTypeIsChar__Marker() {
		PrimitiveTypeIsChar__MarkerImpl primitiveTypeIsChar__Marker = new PrimitiveTypeIsChar__MarkerImpl();
		return primitiveTypeIsChar__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsDouble__Marker createPrimitiveTypeIsDouble__Marker() {
		PrimitiveTypeIsDouble__MarkerImpl primitiveTypeIsDouble__Marker = new PrimitiveTypeIsDouble__MarkerImpl();
		return primitiveTypeIsDouble__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsFloat__Marker createPrimitiveTypeIsFloat__Marker() {
		PrimitiveTypeIsFloat__MarkerImpl primitiveTypeIsFloat__Marker = new PrimitiveTypeIsFloat__MarkerImpl();
		return primitiveTypeIsFloat__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsInt__Marker createPrimitiveTypeIsInt__Marker() {
		PrimitiveTypeIsInt__MarkerImpl primitiveTypeIsInt__Marker = new PrimitiveTypeIsInt__MarkerImpl();
		return primitiveTypeIsInt__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsLong__Marker createPrimitiveTypeIsLong__Marker() {
		PrimitiveTypeIsLong__MarkerImpl primitiveTypeIsLong__Marker = new PrimitiveTypeIsLong__MarkerImpl();
		return primitiveTypeIsLong__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsShort__Marker createPrimitiveTypeIsShort__Marker() {
		PrimitiveTypeIsShort__MarkerImpl primitiveTypeIsShort__Marker = new PrimitiveTypeIsShort__MarkerImpl();
		return primitiveTypeIsShort__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypesIsVoid__Marker createPrimitiveTypesIsVoid__Marker() {
		PrimitiveTypesIsVoid__MarkerImpl primitiveTypesIsVoid__Marker = new PrimitiveTypesIsVoid__MarkerImpl();
		return primitiveTypesIsVoid__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType__Marker createReturnType__Marker() {
		ReturnType__MarkerImpl returnType__Marker = new ReturnType__MarkerImpl();
		return returnType__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignatureReturnType__Marker createSignatureReturnType__Marker() {
		SignatureReturnType__MarkerImpl signatureReturnType__Marker = new SignatureReturnType__MarkerImpl();
		return signatureReturnType__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubPackageToPGPackage__Marker createSubPackageToPGPackage__Marker() {
		SubPackageToPGPackage__MarkerImpl subPackageToPGPackage__Marker = new SubPackageToPGPackage__MarkerImpl();
		return subPackageToPGPackage__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperConstructorInvocation__Marker createSuperConstructorInvocation__Marker() {
		SuperConstructorInvocation__MarkerImpl superConstructorInvocation__Marker = new SuperConstructorInvocation__MarkerImpl();
		return superConstructorInvocation__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperMethodInvocation__Marker createSuperMethodInvocation__Marker() {
		SuperMethodInvocation__MarkerImpl superMethodInvocation__Marker = new SuperMethodInvocation__MarkerImpl();
		return superMethodInvocation__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SyntethicMethod__Marker createSyntethicMethod__Marker() {
		SyntethicMethod__MarkerImpl syntethicMethod__Marker = new SyntethicMethod__MarkerImpl();
		return syntethicMethod__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextAnnotations__Marker createTextAnnotations__Marker() {
		TextAnnotations__MarkerImpl textAnnotations__Marker = new TextAnnotations__MarkerImpl();
		return textAnnotations__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter__Marker createTypeParameter__Marker() {
		TypeParameter__MarkerImpl typeParameter__Marker = new TypeParameter__MarkerImpl();
		return typeParameter__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypesOrphaned__Marker createTypesOrphaned__Marker() {
		TypesOrphaned__MarkerImpl typesOrphaned__Marker = new TypesOrphaned__MarkerImpl();
		return typesOrphaned__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypesVisibility__Marker createTypesVisibility__Marker() {
		TypesVisibility__MarkerImpl typesVisibility__Marker = new TypesVisibility__MarkerImpl();
		return typesVisibility__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedTypeDeclaration__Marker createUnresolvedTypeDeclaration__Marker() {
		UnresolvedTypeDeclaration__MarkerImpl unresolvedTypeDeclaration__Marker = new UnresolvedTypeDeclaration__MarkerImpl();
		return unresolvedTypeDeclaration__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragment__Marker createVariableDeclarationFragment__Marker() {
		VariableDeclarationFragment__MarkerImpl variableDeclarationFragment__Marker = new VariableDeclarationFragment__MarkerImpl();
		return variableDeclarationFragment__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModiscoTGGPackage getModiscoTGGPackage() {
		return (ModiscoTGGPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModiscoTGGPackage getPackage() {
		return ModiscoTGGPackage.eINSTANCE;
	}

} //ModiscoTGGFactoryImpl
