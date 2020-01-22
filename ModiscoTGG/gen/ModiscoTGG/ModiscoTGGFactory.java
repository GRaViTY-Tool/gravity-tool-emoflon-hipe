/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ModiscoTGG.ModiscoTGGPackage
 * @generated
 */
public interface ModiscoTGGFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModiscoTGGFactory eINSTANCE = ModiscoTGG.impl.ModiscoTGGFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Boolean Literal To TBool Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal To TBool Node</em>'.
	 * @generated
	 */
	BooleanLiteralToTBoolNode createBooleanLiteralToTBoolNode();

	/**
	 * Returns a new object of class '<em>Number Literal To TNumber Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Literal To TNumber Node</em>'.
	 * @generated
	 */
	NumberLiteralToTNumberNode createNumberLiteralToTNumberNode();

	/**
	 * Returns a new object of class '<em>String Literal To TText Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal To TText Node</em>'.
	 * @generated
	 */
	StringLiteralToTTextNode createStringLiteralToTTextNode();

	/**
	 * Returns a new object of class '<em>Class Literal To Class Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Literal To Class Node</em>'.
	 * @generated
	 */
	ClassLiteralToClassNode createClassLiteralToClassNode();

	/**
	 * Returns a new object of class '<em>Class Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Declaration To TClass</em>'.
	 * @generated
	 */
	ClassDeclarationToTClass createClassDeclarationToTClass();

	/**
	 * Returns a new object of class '<em>Package To TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package To TPackage</em>'.
	 * @generated
	 */
	PackageToTPackage createPackageToTPackage();

	/**
	 * Returns a new object of class '<em>Model To Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model To Type Graph</em>'.
	 * @generated
	 */
	ModelToTypeGraph createModelToTypeGraph();

	/**
	 * Returns a new object of class '<em>Interface Declaration To TInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Declaration To TInterface</em>'.
	 * @generated
	 */
	InterfaceDeclarationToTInterface createInterfaceDeclarationToTInterface();

	/**
	 * Returns a new object of class '<em>MDefinition To TMember</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MDefinition To TMember</em>'.
	 * @generated
	 */
	MDefinitionToTMember createMDefinitionToTMember();

	/**
	 * Returns a new object of class '<em>Field Access To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Access To TAccess</em>'.
	 * @generated
	 */
	FieldAccessToTAccess createFieldAccessToTAccess();

	/**
	 * Returns a new object of class '<em>Primitive Type To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type To TClass</em>'.
	 * @generated
	 */
	PrimitiveTypeToTClass createPrimitiveTypeToTClass();

	/**
	 * Returns a new object of class '<em>Anonymous Class Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Class Declaration To TClass</em>'.
	 * @generated
	 */
	AnonymousClassDeclarationToTClass createAnonymousClassDeclarationToTClass();

	/**
	 * Returns a new object of class '<em>MMethod Name To TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MMethod Name To TMethod</em>'.
	 * @generated
	 */
	MMethodNameToTMethod createMMethodNameToTMethod();

	/**
	 * Returns a new object of class '<em>MEntry To TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MEntry To TParameter</em>'.
	 * @generated
	 */
	MEntryToTParameter createMEntryToTParameter();

	/**
	 * Returns a new object of class '<em>MSignature To TSignature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSignature To TSignature</em>'.
	 * @generated
	 */
	MSignatureToTSignature createMSignatureToTSignature();

	/**
	 * Returns a new object of class '<em>AST Node To TAnnotatable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AST Node To TAnnotatable</em>'.
	 * @generated
	 */
	ASTNodeToTAnnotatable createASTNodeToTAnnotatable();

	/**
	 * Returns a new object of class '<em>Type To TAbstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type To TAbstract Type</em>'.
	 * @generated
	 */
	TypeToTAbstractType createTypeToTAbstractType();

	/**
	 * Returns a new object of class '<em>MField Name To TField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MField Name To TField</em>'.
	 * @generated
	 */
	MFieldNameToTField createMFieldNameToTField();

	/**
	 * Returns a new object of class '<em>Line Comment To TText Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Comment To TText Annotation</em>'.
	 * @generated
	 */
	LineCommentToTTextAnnotation createLineCommentToTTextAnnotation();

	/**
	 * Returns a new object of class '<em>MSingle Variable Access To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSingle Variable Access To TAccess</em>'.
	 * @generated
	 */
	MSingleVariableAccessToTAccess createMSingleVariableAccessToTAccess();

	/**
	 * Returns a new object of class '<em>Annotation To TAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation To TAnnotation</em>'.
	 * @generated
	 */
	AnnotationToTAnnotation createAnnotationToTAnnotation();

	/**
	 * Returns a new object of class '<em>Type Parameter To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Parameter To TClass</em>'.
	 * @generated
	 */
	TypeParameterToTClass createTypeParameterToTClass();

	/**
	 * Returns a new object of class '<em>Unresolved Type Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Type Declaration To TClass</em>'.
	 * @generated
	 */
	UnresolvedTypeDeclarationToTClass createUnresolvedTypeDeclarationToTClass();

	/**
	 * Returns a new object of class '<em>Modifier To TClass Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier To TClass Entity</em>'.
	 * @generated
	 */
	ModifierToTClassEntity createModifierToTClassEntity();

	/**
	 * Returns a new object of class '<em>Modifier To TField Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier To TField Entity</em>'.
	 * @generated
	 */
	ModifierToTFieldEntity createModifierToTFieldEntity();

	/**
	 * Returns a new object of class '<em>Modifier To TMethod Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier To TMethod Entity</em>'.
	 * @generated
	 */
	ModifierToTMethodEntity createModifierToTMethodEntity();

	/**
	 * Returns a new object of class '<em>Modifier To Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier To Abstract Type</em>'.
	 * @generated
	 */
	ModifierToAbstractType createModifierToAbstractType();

	/**
	 * Returns a new object of class '<em>MModifier To TModifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MModifier To TModifier</em>'.
	 * @generated
	 */
	MModifierToTModifier createMModifierToTModifier();

	/**
	 * Returns a new object of class '<em>MSyntethic Method To TSyntethic Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSyntethic Method To TSyntethic Method</em>'.
	 * @generated
	 */
	MSyntethicMethodToTSyntethicMethod createMSyntethicMethodToTSyntethicMethod();

	/**
	 * Returns a new object of class '<em>Annotation Member Value Pair To TAnnotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @generated
	 */
	AnnotationMemberValuePairToTAnnotationValue createAnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns a new object of class '<em>Static Type To Access Static Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Type To Access Static Type</em>'.
	 * @generated
	 */
	StaticTypeToAccessStaticType createStaticTypeToAccessStaticType();

	/**
	 * Returns a new object of class '<em>MFlow To TFlow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MFlow To TFlow</em>'.
	 * @generated
	 */
	MFlowToTFlow createMFlowToTFlow();

	/**
	 * Returns a new object of class '<em>MAbstract Flow Element To TAbstract Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MAbstract Flow Element To TAbstract Flow Element</em>'.
	 * @generated
	 */
	MAbstractFlowElementToTAbstractFlowElement createMAbstractFlowElementToTAbstractFlowElement();

	/**
	 * Returns a new object of class '<em>Abstract Method Invocation To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Method Invocation To TAccess</em>'.
	 * @generated
	 */
	AbstractMethodInvocationToTAccess createAbstractMethodInvocationToTAccess();

	/**
	 * Returns a new object of class '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * @generated
	 */
	VariableDeclarationFragmentToTFieldDefinition createVariableDeclarationFragmentToTFieldDefinition();

	/**
	 * Returns a new object of class '<em>Annotation Member Key Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Key Marker</em>'.
	 * @generated
	 */
	AnnotationMemberKey__Marker createAnnotationMemberKey__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Member Value Annotation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value Annotation Marker</em>'.
	 * @generated
	 */
	AnnotationMemberValueAnnotation__Marker createAnnotationMemberValueAnnotation__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Member Value Annotation Array Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value Annotation Array Marker</em>'.
	 * @generated
	 */
	AnnotationMemberValueAnnotationArray__Marker createAnnotationMemberValueAnnotationArray__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Member Value Boolean Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value Boolean Marker</em>'.
	 * @generated
	 */
	AnnotationMemberValueBoolean__Marker createAnnotationMemberValueBoolean__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Member Value Boolean Array Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value Boolean Array Marker</em>'.
	 * @generated
	 */
	AnnotationMemberValueBooleanArray__Marker createAnnotationMemberValueBooleanArray__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Member Value Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value Class Marker</em>'.
	 * @generated
	 */
	AnnotationMemberValueClass__Marker createAnnotationMemberValueClass__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Member Value Class Array Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value Class Array Marker</em>'.
	 * @generated
	 */
	AnnotationMemberValueClassArray__Marker createAnnotationMemberValueClassArray__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Member Value Number Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value Number Marker</em>'.
	 * @generated
	 */
	AnnotationMemberValueNumber__Marker createAnnotationMemberValueNumber__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Member Value Number Array Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value Number Array Marker</em>'.
	 * @generated
	 */
	AnnotationMemberValueNumberArray__Marker createAnnotationMemberValueNumberArray__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Member Value String Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value String Marker</em>'.
	 * @generated
	 */
	AnnotationMemberValueString__Marker createAnnotationMemberValueString__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Member Value String Array Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value String Array Marker</em>'.
	 * @generated
	 */
	AnnotationMemberValueStringArray__Marker createAnnotationMemberValueStringArray__Marker();

	/**
	 * Returns a new object of class '<em>Annotation On Body Declaration Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation On Body Declaration Marker</em>'.
	 * @generated
	 */
	AnnotationOnBodyDeclaration__Marker createAnnotationOnBodyDeclaration__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Type Marker</em>'.
	 * @generated
	 */
	AnnotationType__Marker createAnnotationType__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Type Access Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Type Access Marker</em>'.
	 * @generated
	 */
	AnnotationTypeAccess__Marker createAnnotationTypeAccess__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Type In Anonymous Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Type In Anonymous Marker</em>'.
	 * @generated
	 */
	AnnotationTypeInAnonymous__Marker createAnnotationTypeInAnonymous__Marker();

	/**
	 * Returns a new object of class '<em>Annotation Type Nested Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Type Nested Marker</em>'.
	 * @generated
	 */
	AnnotationTypeNested__Marker createAnnotationTypeNested__Marker();

	/**
	 * Returns a new object of class '<em>Anonymous Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Class Marker</em>'.
	 * @generated
	 */
	AnonymousClass__Marker createAnonymousClass__Marker();

	/**
	 * Returns a new object of class '<em>Anonymous Class Type Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Class Type Class Marker</em>'.
	 * @generated
	 */
	AnonymousClassTypeClass__Marker createAnonymousClassTypeClass__Marker();

	/**
	 * Returns a new object of class '<em>Anonymous Class Type Interface Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Class Type Interface Marker</em>'.
	 * @generated
	 */
	AnonymousClassTypeInterface__Marker createAnonymousClassTypeInterface__Marker();

	/**
	 * Returns a new object of class '<em>Array Initializer Ignore Expressions Edge Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Initializer Ignore Expressions Edge Marker</em>'.
	 * @generated
	 */
	ArrayInitializerIgnoreExpressionsEdge__Marker createArrayInitializerIgnoreExpressionsEdge__Marker();

	/**
	 * Returns a new object of class '<em>Array Type To Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type To Class Marker</em>'.
	 * @generated
	 */
	ArrayTypeToClass__Marker createArrayTypeToClass__Marker();

	/**
	 * Returns a new object of class '<em>Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Marker</em>'.
	 * @generated
	 */
	Class__Marker createClass__Marker();

	/**
	 * Returns a new object of class '<em>Class Extends Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Extends Class Marker</em>'.
	 * @generated
	 */
	ClassExtendsClass__Marker createClassExtendsClass__Marker();

	/**
	 * Returns a new object of class '<em>Class Implements Interface Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Implements Interface Marker</em>'.
	 * @generated
	 */
	ClassImplementsInterface__Marker createClassImplementsInterface__Marker();

	/**
	 * Returns a new object of class '<em>Class In Anonymous Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class In Anonymous Marker</em>'.
	 * @generated
	 */
	ClassInAnonymous__Marker createClassInAnonymous__Marker();

	/**
	 * Returns a new object of class '<em>Class Inner Anon Class Member Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Inner Anon Class Member Marker</em>'.
	 * @generated
	 */
	ClassInnerAnonClassMember__Marker createClassInnerAnonClassMember__Marker();

	/**
	 * Returns a new object of class '<em>Class Inner Class Member Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Inner Class Member Marker</em>'.
	 * @generated
	 */
	ClassInnerClassMember__Marker createClassInnerClassMember__Marker();

	/**
	 * Returns a new object of class '<em>Class Instance Creation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Instance Creation Marker</em>'.
	 * @generated
	 */
	ClassInstanceCreation__Marker createClassInstanceCreation__Marker();

	/**
	 * Returns a new object of class '<em>Constructor Definition Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Definition Marker</em>'.
	 * @generated
	 */
	ConstructorDefinition__Marker createConstructorDefinition__Marker();

	/**
	 * Returns a new object of class '<em>Constructor Invocation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Invocation Marker</em>'.
	 * @generated
	 */
	ConstructorInvocation__Marker createConstructorInvocation__Marker();

	/**
	 * Returns a new object of class '<em>Enum Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Marker</em>'.
	 * @generated
	 */
	Enum__Marker createEnum__Marker();

	/**
	 * Returns a new object of class '<em>Enum In Anonymous Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum In Anonymous Marker</em>'.
	 * @generated
	 */
	EnumInAnonymous__Marker createEnumInAnonymous__Marker();

	/**
	 * Returns a new object of class '<em>Field Access Read Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Access Read Marker</em>'.
	 * @generated
	 */
	FieldAccessRead__Marker createFieldAccessRead__Marker();

	/**
	 * Returns a new object of class '<em>Field Access Read Write Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Access Read Write Marker</em>'.
	 * @generated
	 */
	FieldAccessReadWrite__Marker createFieldAccessReadWrite__Marker();

	/**
	 * Returns a new object of class '<em>Field Access Write Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Access Write Marker</em>'.
	 * @generated
	 */
	FieldAccessWrite__Marker createFieldAccessWrite__Marker();

	/**
	 * Returns a new object of class '<em>Field Definition Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Definition Marker</em>'.
	 * @generated
	 */
	FieldDefinition__Marker createFieldDefinition__Marker();

	/**
	 * Returns a new object of class '<em>Field Name Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Name Marker</em>'.
	 * @generated
	 */
	FieldName__Marker createFieldName__Marker();

	/**
	 * Returns a new object of class '<em>Field Signature Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Signature Marker</em>'.
	 * @generated
	 */
	FieldSignature__Marker createFieldSignature__Marker();

	/**
	 * Returns a new object of class '<em>Field Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Type Marker</em>'.
	 * @generated
	 */
	FieldType__Marker createFieldType__Marker();

	/**
	 * Returns a new object of class '<em>Flow Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Marker</em>'.
	 * @generated
	 */
	Flow__Marker createFlow__Marker();

	/**
	 * Returns a new object of class '<em>Incoming Flow Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incoming Flow Marker</em>'.
	 * @generated
	 */
	IncomingFlow__Marker createIncomingFlow__Marker();

	/**
	 * Returns a new object of class '<em>Interface Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Marker</em>'.
	 * @generated
	 */
	Interface__Marker createInterface__Marker();

	/**
	 * Returns a new object of class '<em>Interface Extends Interface Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Extends Interface Marker</em>'.
	 * @generated
	 */
	InterfaceExtendsInterface__Marker createInterfaceExtendsInterface__Marker();

	/**
	 * Returns a new object of class '<em>Interface In Anonymous Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface In Anonymous Marker</em>'.
	 * @generated
	 */
	InterfaceInAnonymous__Marker createInterfaceInAnonymous__Marker();

	/**
	 * Returns a new object of class '<em>Interface Member Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Member Marker</em>'.
	 * @generated
	 */
	InterfaceMember__Marker createInterfaceMember__Marker();

	/**
	 * Returns a new object of class '<em>Link Definition To Anonymous Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Definition To Anonymous Marker</em>'.
	 * @generated
	 */
	LinkDefinitionToAnonymous__Marker createLinkDefinitionToAnonymous__Marker();

	/**
	 * Returns a new object of class '<em>Link Definition To Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Definition To Type Marker</em>'.
	 * @generated
	 */
	LinkDefinitionToType__Marker createLinkDefinitionToType__Marker();

	/**
	 * Returns a new object of class '<em>Member In Annotation Visibility Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member In Annotation Visibility Marker</em>'.
	 * @generated
	 */
	MemberInAnnotationVisibility__Marker createMemberInAnnotationVisibility__Marker();

	/**
	 * Returns a new object of class '<em>Member In Class Visibility Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member In Class Visibility Marker</em>'.
	 * @generated
	 */
	MemberInClassVisibility__Marker createMemberInClassVisibility__Marker();

	/**
	 * Returns a new object of class '<em>Member In Enum Visibility Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member In Enum Visibility Marker</em>'.
	 * @generated
	 */
	MemberInEnumVisibility__Marker createMemberInEnumVisibility__Marker();

	/**
	 * Returns a new object of class '<em>Method Definition Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Definition Marker</em>'.
	 * @generated
	 */
	MethodDefinition__Marker createMethodDefinition__Marker();

	/**
	 * Returns a new object of class '<em>Method Invocation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Invocation Marker</em>'.
	 * @generated
	 */
	MethodInvocation__Marker createMethodInvocation__Marker();

	/**
	 * Returns a new object of class '<em>Method Invocation Recursive Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Invocation Recursive Marker</em>'.
	 * @generated
	 */
	MethodInvocationRecursive__Marker createMethodInvocationRecursive__Marker();

	/**
	 * Returns a new object of class '<em>Method Invocation Static Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Invocation Static Type Marker</em>'.
	 * @generated
	 */
	MethodInvocationStaticType__Marker createMethodInvocationStaticType__Marker();

	/**
	 * Returns a new object of class '<em>Method Name Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Name Marker</em>'.
	 * @generated
	 */
	MethodName__Marker createMethodName__Marker();

	/**
	 * Returns a new object of class '<em>Method Overriding Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Overriding Marker</em>'.
	 * @generated
	 */
	MethodOverriding__Marker createMethodOverriding__Marker();

	/**
	 * Returns a new object of class '<em>Method Parameter Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Parameter Marker</em>'.
	 * @generated
	 */
	MethodParameter__Marker createMethodParameter__Marker();

	/**
	 * Returns a new object of class '<em>Method Parameter Link Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Parameter Link Marker</em>'.
	 * @generated
	 */
	MethodParameterLink__Marker createMethodParameterLink__Marker();

	/**
	 * Returns a new object of class '<em>Method Parameter Link First Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Parameter Link First Marker</em>'.
	 * @generated
	 */
	MethodParameterLinkFirst__Marker createMethodParameterLinkFirst__Marker();

	/**
	 * Returns a new object of class '<em>Method Parameter Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Parameter Type Marker</em>'.
	 * @generated
	 */
	MethodParameterType__Marker createMethodParameterType__Marker();

	/**
	 * Returns a new object of class '<em>Method Signature Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Signature Marker</em>'.
	 * @generated
	 */
	MethodSignature__Marker createMethodSignature__Marker();

	/**
	 * Returns a new object of class '<em>Model To Pg Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model To Pg Marker</em>'.
	 * @generated
	 */
	ModelToPg__Marker createModelToPg__Marker();

	/**
	 * Returns a new object of class '<em>Nested Class In Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Class In Type Marker</em>'.
	 * @generated
	 */
	NestedClassInType__Marker createNestedClassInType__Marker();

	/**
	 * Returns a new object of class '<em>Nested Enum Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Enum Marker</em>'.
	 * @generated
	 */
	NestedEnum__Marker createNestedEnum__Marker();

	/**
	 * Returns a new object of class '<em>Nested Interface In Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Interface In Type Marker</em>'.
	 * @generated
	 */
	NestedInterfaceInType__Marker createNestedInterfaceInType__Marker();

	/**
	 * Returns a new object of class '<em>Outgoing Flow Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outgoing Flow Marker</em>'.
	 * @generated
	 */
	OutgoingFlow__Marker createOutgoingFlow__Marker();

	/**
	 * Returns a new object of class '<em>Package To PG Package Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package To PG Package Marker</em>'.
	 * @generated
	 */
	PackageToPGPackage__Marker createPackageToPGPackage__Marker();

	/**
	 * Returns a new object of class '<em>Parameterized Type To Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameterized Type To Class Marker</em>'.
	 * @generated
	 */
	ParameterizedTypeToClass__Marker createParameterizedTypeToClass__Marker();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Boolean Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Boolean Marker</em>'.
	 * @generated
	 */
	PrimitiveTypeIsBoolean__Marker createPrimitiveTypeIsBoolean__Marker();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Byte Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Byte Marker</em>'.
	 * @generated
	 */
	PrimitiveTypeIsByte__Marker createPrimitiveTypeIsByte__Marker();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Char Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Char Marker</em>'.
	 * @generated
	 */
	PrimitiveTypeIsChar__Marker createPrimitiveTypeIsChar__Marker();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Double Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Double Marker</em>'.
	 * @generated
	 */
	PrimitiveTypeIsDouble__Marker createPrimitiveTypeIsDouble__Marker();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Float Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Float Marker</em>'.
	 * @generated
	 */
	PrimitiveTypeIsFloat__Marker createPrimitiveTypeIsFloat__Marker();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Int Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Int Marker</em>'.
	 * @generated
	 */
	PrimitiveTypeIsInt__Marker createPrimitiveTypeIsInt__Marker();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Long Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Long Marker</em>'.
	 * @generated
	 */
	PrimitiveTypeIsLong__Marker createPrimitiveTypeIsLong__Marker();

	/**
	 * Returns a new object of class '<em>Primitive Type Is Short Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Is Short Marker</em>'.
	 * @generated
	 */
	PrimitiveTypeIsShort__Marker createPrimitiveTypeIsShort__Marker();

	/**
	 * Returns a new object of class '<em>Primitive Types Is Void Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Types Is Void Marker</em>'.
	 * @generated
	 */
	PrimitiveTypesIsVoid__Marker createPrimitiveTypesIsVoid__Marker();

	/**
	 * Returns a new object of class '<em>Return Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type Marker</em>'.
	 * @generated
	 */
	ReturnType__Marker createReturnType__Marker();

	/**
	 * Returns a new object of class '<em>Signature Return Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature Return Type Marker</em>'.
	 * @generated
	 */
	SignatureReturnType__Marker createSignatureReturnType__Marker();

	/**
	 * Returns a new object of class '<em>Sub Package To PG Package Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Package To PG Package Marker</em>'.
	 * @generated
	 */
	SubPackageToPGPackage__Marker createSubPackageToPGPackage__Marker();

	/**
	 * Returns a new object of class '<em>Super Constructor Invocation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Constructor Invocation Marker</em>'.
	 * @generated
	 */
	SuperConstructorInvocation__Marker createSuperConstructorInvocation__Marker();

	/**
	 * Returns a new object of class '<em>Super Method Invocation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Method Invocation Marker</em>'.
	 * @generated
	 */
	SuperMethodInvocation__Marker createSuperMethodInvocation__Marker();

	/**
	 * Returns a new object of class '<em>Syntethic Method Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syntethic Method Marker</em>'.
	 * @generated
	 */
	SyntethicMethod__Marker createSyntethicMethod__Marker();

	/**
	 * Returns a new object of class '<em>Text Annotations Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Annotations Marker</em>'.
	 * @generated
	 */
	TextAnnotations__Marker createTextAnnotations__Marker();

	/**
	 * Returns a new object of class '<em>Type Parameter Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Parameter Marker</em>'.
	 * @generated
	 */
	TypeParameter__Marker createTypeParameter__Marker();

	/**
	 * Returns a new object of class '<em>Types Orphaned Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Types Orphaned Marker</em>'.
	 * @generated
	 */
	TypesOrphaned__Marker createTypesOrphaned__Marker();

	/**
	 * Returns a new object of class '<em>Types Visibility Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Types Visibility Marker</em>'.
	 * @generated
	 */
	TypesVisibility__Marker createTypesVisibility__Marker();

	/**
	 * Returns a new object of class '<em>Unresolved Type Declaration Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Type Declaration Marker</em>'.
	 * @generated
	 */
	UnresolvedTypeDeclaration__Marker createUnresolvedTypeDeclaration__Marker();

	/**
	 * Returns a new object of class '<em>Variable Declaration Fragment Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration Fragment Marker</em>'.
	 * @generated
	 */
	VariableDeclarationFragment__Marker createVariableDeclarationFragment__Marker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModiscoTGGPackage getModiscoTGGPackage();

} //ModiscoTGGFactory
