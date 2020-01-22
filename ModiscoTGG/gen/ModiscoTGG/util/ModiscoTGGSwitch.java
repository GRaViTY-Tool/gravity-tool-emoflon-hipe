/**
 */
package ModiscoTGG.util;

import ModiscoTGG.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ModiscoTGG.ModiscoTGGPackage
 * @generated
 */
public class ModiscoTGGSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModiscoTGGPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoTGGSwitch() {
		if (modelPackage == null) {
			modelPackage = ModiscoTGGPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ModiscoTGGPackage.BOOLEAN_LITERAL_TO_TBOOL_NODE: {
			BooleanLiteralToTBoolNode booleanLiteralToTBoolNode = (BooleanLiteralToTBoolNode) theEObject;
			T result = caseBooleanLiteralToTBoolNode(booleanLiteralToTBoolNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE: {
			NumberLiteralToTNumberNode numberLiteralToTNumberNode = (NumberLiteralToTNumberNode) theEObject;
			T result = caseNumberLiteralToTNumberNode(numberLiteralToTNumberNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.STRING_LITERAL_TO_TTEXT_NODE: {
			StringLiteralToTTextNode stringLiteralToTTextNode = (StringLiteralToTTextNode) theEObject;
			T result = caseStringLiteralToTTextNode(stringLiteralToTTextNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.CLASS_LITERAL_TO_CLASS_NODE: {
			ClassLiteralToClassNode classLiteralToClassNode = (ClassLiteralToClassNode) theEObject;
			T result = caseClassLiteralToClassNode(classLiteralToClassNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS: {
			ClassDeclarationToTClass classDeclarationToTClass = (ClassDeclarationToTClass) theEObject;
			T result = caseClassDeclarationToTClass(classDeclarationToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PACKAGE_TO_TPACKAGE: {
			PackageToTPackage packageToTPackage = (PackageToTPackage) theEObject;
			T result = casePackageToTPackage(packageToTPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MODEL_TO_TYPE_GRAPH: {
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) theEObject;
			T result = caseModelToTypeGraph(modelToTypeGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.INTERFACE_DECLARATION_TO_TINTERFACE: {
			InterfaceDeclarationToTInterface interfaceDeclarationToTInterface = (InterfaceDeclarationToTInterface) theEObject;
			T result = caseInterfaceDeclarationToTInterface(interfaceDeclarationToTInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MDEFINITION_TO_TMEMBER: {
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) theEObject;
			T result = caseMDefinitionToTMember(mDefinitionToTMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.FIELD_ACCESS_TO_TACCESS: {
			FieldAccessToTAccess fieldAccessToTAccess = (FieldAccessToTAccess) theEObject;
			T result = caseFieldAccessToTAccess(fieldAccessToTAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PRIMITIVE_TYPE_TO_TCLASS: {
			PrimitiveTypeToTClass primitiveTypeToTClass = (PrimitiveTypeToTClass) theEObject;
			T result = casePrimitiveTypeToTClass(primitiveTypeToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANONYMOUS_CLASS_DECLARATION_TO_TCLASS: {
			AnonymousClassDeclarationToTClass anonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) theEObject;
			T result = caseAnonymousClassDeclarationToTClass(anonymousClassDeclarationToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MMETHOD_NAME_TO_TMETHOD: {
			MMethodNameToTMethod mMethodNameToTMethod = (MMethodNameToTMethod) theEObject;
			T result = caseMMethodNameToTMethod(mMethodNameToTMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MENTRY_TO_TPARAMETER: {
			MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) theEObject;
			T result = caseMEntryToTParameter(mEntryToTParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MSIGNATURE_TO_TSIGNATURE: {
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) theEObject;
			T result = caseMSignatureToTSignature(mSignatureToTSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.AST_NODE_TO_TANNOTATABLE: {
			ASTNodeToTAnnotatable astNodeToTAnnotatable = (ASTNodeToTAnnotatable) theEObject;
			T result = caseASTNodeToTAnnotatable(astNodeToTAnnotatable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.TYPE_TO_TABSTRACT_TYPE: {
			TypeToTAbstractType typeToTAbstractType = (TypeToTAbstractType) theEObject;
			T result = caseTypeToTAbstractType(typeToTAbstractType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MFIELD_NAME_TO_TFIELD: {
			MFieldNameToTField mFieldNameToTField = (MFieldNameToTField) theEObject;
			T result = caseMFieldNameToTField(mFieldNameToTField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.LINE_COMMENT_TO_TTEXT_ANNOTATION: {
			LineCommentToTTextAnnotation lineCommentToTTextAnnotation = (LineCommentToTTextAnnotation) theEObject;
			T result = caseLineCommentToTTextAnnotation(lineCommentToTTextAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS: {
			MSingleVariableAccessToTAccess mSingleVariableAccessToTAccess = (MSingleVariableAccessToTAccess) theEObject;
			T result = caseMSingleVariableAccessToTAccess(mSingleVariableAccessToTAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_TO_TANNOTATION: {
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) theEObject;
			T result = caseAnnotationToTAnnotation(annotationToTAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.TYPE_PARAMETER_TO_TCLASS: {
			TypeParameterToTClass typeParameterToTClass = (TypeParameterToTClass) theEObject;
			T result = caseTypeParameterToTClass(typeParameterToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS: {
			UnresolvedTypeDeclarationToTClass unresolvedTypeDeclarationToTClass = (UnresolvedTypeDeclarationToTClass) theEObject;
			T result = caseUnresolvedTypeDeclarationToTClass(unresolvedTypeDeclarationToTClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MODIFIER_TO_TCLASS_ENTITY: {
			ModifierToTClassEntity modifierToTClassEntity = (ModifierToTClassEntity) theEObject;
			T result = caseModifierToTClassEntity(modifierToTClassEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MODIFIER_TO_TFIELD_ENTITY: {
			ModifierToTFieldEntity modifierToTFieldEntity = (ModifierToTFieldEntity) theEObject;
			T result = caseModifierToTFieldEntity(modifierToTFieldEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MODIFIER_TO_TMETHOD_ENTITY: {
			ModifierToTMethodEntity modifierToTMethodEntity = (ModifierToTMethodEntity) theEObject;
			T result = caseModifierToTMethodEntity(modifierToTMethodEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MODIFIER_TO_ABSTRACT_TYPE: {
			ModifierToAbstractType modifierToAbstractType = (ModifierToAbstractType) theEObject;
			T result = caseModifierToAbstractType(modifierToAbstractType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MMODIFIER_TO_TMODIFIER: {
			MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) theEObject;
			T result = caseMModifierToTModifier(mModifierToTModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD: {
			MSyntethicMethodToTSyntethicMethod mSyntethicMethodToTSyntethicMethod = (MSyntethicMethodToTSyntethicMethod) theEObject;
			T result = caseMSyntethicMethodToTSyntethicMethod(mSyntethicMethodToTSyntethicMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE: {
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) theEObject;
			T result = caseAnnotationMemberValuePairToTAnnotationValue(annotationMemberValuePairToTAnnotationValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.STATIC_TYPE_TO_ACCESS_STATIC_TYPE: {
			StaticTypeToAccessStaticType staticTypeToAccessStaticType = (StaticTypeToAccessStaticType) theEObject;
			T result = caseStaticTypeToAccessStaticType(staticTypeToAccessStaticType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MFLOW_TO_TFLOW: {
			MFlowToTFlow mFlowToTFlow = (MFlowToTFlow) theEObject;
			T result = caseMFlowToTFlow(mFlowToTFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT: {
			MAbstractFlowElementToTAbstractFlowElement mAbstractFlowElementToTAbstractFlowElement = (MAbstractFlowElementToTAbstractFlowElement) theEObject;
			T result = caseMAbstractFlowElementToTAbstractFlowElement(mAbstractFlowElementToTAbstractFlowElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ABSTRACT_METHOD_INVOCATION_TO_TACCESS: {
			AbstractMethodInvocationToTAccess abstractMethodInvocationToTAccess = (AbstractMethodInvocationToTAccess) theEObject;
			T result = caseAbstractMethodInvocationToTAccess(abstractMethodInvocationToTAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION: {
			VariableDeclarationFragmentToTFieldDefinition variableDeclarationFragmentToTFieldDefinition = (VariableDeclarationFragmentToTFieldDefinition) theEObject;
			T result = caseVariableDeclarationFragmentToTFieldDefinition(variableDeclarationFragmentToTFieldDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER: {
			AnnotationMemberKey__Marker annotationMemberKey__Marker = (AnnotationMemberKey__Marker) theEObject;
			T result = caseAnnotationMemberKey__Marker(annotationMemberKey__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationMemberKey__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_MARKER: {
			AnnotationMemberValueAnnotation__Marker annotationMemberValueAnnotation__Marker = (AnnotationMemberValueAnnotation__Marker) theEObject;
			T result = caseAnnotationMemberValueAnnotation__Marker(annotationMemberValueAnnotation__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationMemberValueAnnotation__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER: {
			AnnotationMemberValueAnnotationArray__Marker annotationMemberValueAnnotationArray__Marker = (AnnotationMemberValueAnnotationArray__Marker) theEObject;
			T result = caseAnnotationMemberValueAnnotationArray__Marker(annotationMemberValueAnnotationArray__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationMemberValueAnnotationArray__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_MARKER: {
			AnnotationMemberValueBoolean__Marker annotationMemberValueBoolean__Marker = (AnnotationMemberValueBoolean__Marker) theEObject;
			T result = caseAnnotationMemberValueBoolean__Marker(annotationMemberValueBoolean__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationMemberValueBoolean__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER: {
			AnnotationMemberValueBooleanArray__Marker annotationMemberValueBooleanArray__Marker = (AnnotationMemberValueBooleanArray__Marker) theEObject;
			T result = caseAnnotationMemberValueBooleanArray__Marker(annotationMemberValueBooleanArray__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationMemberValueBooleanArray__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER: {
			AnnotationMemberValueClass__Marker annotationMemberValueClass__Marker = (AnnotationMemberValueClass__Marker) theEObject;
			T result = caseAnnotationMemberValueClass__Marker(annotationMemberValueClass__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationMemberValueClass__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER: {
			AnnotationMemberValueClassArray__Marker annotationMemberValueClassArray__Marker = (AnnotationMemberValueClassArray__Marker) theEObject;
			T result = caseAnnotationMemberValueClassArray__Marker(annotationMemberValueClassArray__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationMemberValueClassArray__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_NUMBER_MARKER: {
			AnnotationMemberValueNumber__Marker annotationMemberValueNumber__Marker = (AnnotationMemberValueNumber__Marker) theEObject;
			T result = caseAnnotationMemberValueNumber__Marker(annotationMemberValueNumber__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationMemberValueNumber__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER: {
			AnnotationMemberValueNumberArray__Marker annotationMemberValueNumberArray__Marker = (AnnotationMemberValueNumberArray__Marker) theEObject;
			T result = caseAnnotationMemberValueNumberArray__Marker(annotationMemberValueNumberArray__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationMemberValueNumberArray__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_STRING_MARKER: {
			AnnotationMemberValueString__Marker annotationMemberValueString__Marker = (AnnotationMemberValueString__Marker) theEObject;
			T result = caseAnnotationMemberValueString__Marker(annotationMemberValueString__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationMemberValueString__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER: {
			AnnotationMemberValueStringArray__Marker annotationMemberValueStringArray__Marker = (AnnotationMemberValueStringArray__Marker) theEObject;
			T result = caseAnnotationMemberValueStringArray__Marker(annotationMemberValueStringArray__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationMemberValueStringArray__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER: {
			AnnotationOnBodyDeclaration__Marker annotationOnBodyDeclaration__Marker = (AnnotationOnBodyDeclaration__Marker) theEObject;
			T result = caseAnnotationOnBodyDeclaration__Marker(annotationOnBodyDeclaration__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationOnBodyDeclaration__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_TYPE_MARKER: {
			AnnotationType__Marker annotationType__Marker = (AnnotationType__Marker) theEObject;
			T result = caseAnnotationType__Marker(annotationType__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationType__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER: {
			AnnotationTypeAccess__Marker annotationTypeAccess__Marker = (AnnotationTypeAccess__Marker) theEObject;
			T result = caseAnnotationTypeAccess__Marker(annotationTypeAccess__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationTypeAccess__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_TYPE_IN_ANONYMOUS_MARKER: {
			AnnotationTypeInAnonymous__Marker annotationTypeInAnonymous__Marker = (AnnotationTypeInAnonymous__Marker) theEObject;
			T result = caseAnnotationTypeInAnonymous__Marker(annotationTypeInAnonymous__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationTypeInAnonymous__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANNOTATION_TYPE_NESTED_MARKER: {
			AnnotationTypeNested__Marker annotationTypeNested__Marker = (AnnotationTypeNested__Marker) theEObject;
			T result = caseAnnotationTypeNested__Marker(annotationTypeNested__Marker);
			if (result == null)
				result = caseTGGRuleApplication(annotationTypeNested__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER: {
			AnonymousClass__Marker anonymousClass__Marker = (AnonymousClass__Marker) theEObject;
			T result = caseAnonymousClass__Marker(anonymousClass__Marker);
			if (result == null)
				result = caseTGGRuleApplication(anonymousClass__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER: {
			AnonymousClassTypeClass__Marker anonymousClassTypeClass__Marker = (AnonymousClassTypeClass__Marker) theEObject;
			T result = caseAnonymousClassTypeClass__Marker(anonymousClassTypeClass__Marker);
			if (result == null)
				result = caseTGGRuleApplication(anonymousClassTypeClass__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER: {
			AnonymousClassTypeInterface__Marker anonymousClassTypeInterface__Marker = (AnonymousClassTypeInterface__Marker) theEObject;
			T result = caseAnonymousClassTypeInterface__Marker(anonymousClassTypeInterface__Marker);
			if (result == null)
				result = caseTGGRuleApplication(anonymousClassTypeInterface__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER: {
			ArrayInitializerIgnoreExpressionsEdge__Marker arrayInitializerIgnoreExpressionsEdge__Marker = (ArrayInitializerIgnoreExpressionsEdge__Marker) theEObject;
			T result = caseArrayInitializerIgnoreExpressionsEdge__Marker(arrayInitializerIgnoreExpressionsEdge__Marker);
			if (result == null)
				result = caseTGGRuleApplication(arrayInitializerIgnoreExpressionsEdge__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER: {
			ArrayTypeToClass__Marker arrayTypeToClass__Marker = (ArrayTypeToClass__Marker) theEObject;
			T result = caseArrayTypeToClass__Marker(arrayTypeToClass__Marker);
			if (result == null)
				result = caseTGGRuleApplication(arrayTypeToClass__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.CLASS_MARKER: {
			Class__Marker class__Marker = (Class__Marker) theEObject;
			T result = caseClass__Marker(class__Marker);
			if (result == null)
				result = caseTGGRuleApplication(class__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER: {
			ClassExtendsClass__Marker classExtendsClass__Marker = (ClassExtendsClass__Marker) theEObject;
			T result = caseClassExtendsClass__Marker(classExtendsClass__Marker);
			if (result == null)
				result = caseTGGRuleApplication(classExtendsClass__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER: {
			ClassImplementsInterface__Marker classImplementsInterface__Marker = (ClassImplementsInterface__Marker) theEObject;
			T result = caseClassImplementsInterface__Marker(classImplementsInterface__Marker);
			if (result == null)
				result = caseTGGRuleApplication(classImplementsInterface__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.CLASS_IN_ANONYMOUS_MARKER: {
			ClassInAnonymous__Marker classInAnonymous__Marker = (ClassInAnonymous__Marker) theEObject;
			T result = caseClassInAnonymous__Marker(classInAnonymous__Marker);
			if (result == null)
				result = caseTGGRuleApplication(classInAnonymous__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.CLASS_INNER_ANON_CLASS_MEMBER_MARKER: {
			ClassInnerAnonClassMember__Marker classInnerAnonClassMember__Marker = (ClassInnerAnonClassMember__Marker) theEObject;
			T result = caseClassInnerAnonClassMember__Marker(classInnerAnonClassMember__Marker);
			if (result == null)
				result = caseTGGRuleApplication(classInnerAnonClassMember__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER: {
			ClassInnerClassMember__Marker classInnerClassMember__Marker = (ClassInnerClassMember__Marker) theEObject;
			T result = caseClassInnerClassMember__Marker(classInnerClassMember__Marker);
			if (result == null)
				result = caseTGGRuleApplication(classInnerClassMember__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.CLASS_INSTANCE_CREATION_MARKER: {
			ClassInstanceCreation__Marker classInstanceCreation__Marker = (ClassInstanceCreation__Marker) theEObject;
			T result = caseClassInstanceCreation__Marker(classInstanceCreation__Marker);
			if (result == null)
				result = caseTGGRuleApplication(classInstanceCreation__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER: {
			ConstructorDefinition__Marker constructorDefinition__Marker = (ConstructorDefinition__Marker) theEObject;
			T result = caseConstructorDefinition__Marker(constructorDefinition__Marker);
			if (result == null)
				result = caseTGGRuleApplication(constructorDefinition__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER: {
			ConstructorInvocation__Marker constructorInvocation__Marker = (ConstructorInvocation__Marker) theEObject;
			T result = caseConstructorInvocation__Marker(constructorInvocation__Marker);
			if (result == null)
				result = caseTGGRuleApplication(constructorInvocation__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ENUM_MARKER: {
			Enum__Marker enum__Marker = (Enum__Marker) theEObject;
			T result = caseEnum__Marker(enum__Marker);
			if (result == null)
				result = caseTGGRuleApplication(enum__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.ENUM_IN_ANONYMOUS_MARKER: {
			EnumInAnonymous__Marker enumInAnonymous__Marker = (EnumInAnonymous__Marker) theEObject;
			T result = caseEnumInAnonymous__Marker(enumInAnonymous__Marker);
			if (result == null)
				result = caseTGGRuleApplication(enumInAnonymous__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.FIELD_ACCESS_READ_MARKER: {
			FieldAccessRead__Marker fieldAccessRead__Marker = (FieldAccessRead__Marker) theEObject;
			T result = caseFieldAccessRead__Marker(fieldAccessRead__Marker);
			if (result == null)
				result = caseTGGRuleApplication(fieldAccessRead__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.FIELD_ACCESS_READ_WRITE_MARKER: {
			FieldAccessReadWrite__Marker fieldAccessReadWrite__Marker = (FieldAccessReadWrite__Marker) theEObject;
			T result = caseFieldAccessReadWrite__Marker(fieldAccessReadWrite__Marker);
			if (result == null)
				result = caseTGGRuleApplication(fieldAccessReadWrite__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER: {
			FieldAccessWrite__Marker fieldAccessWrite__Marker = (FieldAccessWrite__Marker) theEObject;
			T result = caseFieldAccessWrite__Marker(fieldAccessWrite__Marker);
			if (result == null)
				result = caseTGGRuleApplication(fieldAccessWrite__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER: {
			FieldDefinition__Marker fieldDefinition__Marker = (FieldDefinition__Marker) theEObject;
			T result = caseFieldDefinition__Marker(fieldDefinition__Marker);
			if (result == null)
				result = caseTGGRuleApplication(fieldDefinition__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.FIELD_NAME_MARKER: {
			FieldName__Marker fieldName__Marker = (FieldName__Marker) theEObject;
			T result = caseFieldName__Marker(fieldName__Marker);
			if (result == null)
				result = caseTGGRuleApplication(fieldName__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER: {
			FieldSignature__Marker fieldSignature__Marker = (FieldSignature__Marker) theEObject;
			T result = caseFieldSignature__Marker(fieldSignature__Marker);
			if (result == null)
				result = caseTGGRuleApplication(fieldSignature__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.FIELD_TYPE_MARKER: {
			FieldType__Marker fieldType__Marker = (FieldType__Marker) theEObject;
			T result = caseFieldType__Marker(fieldType__Marker);
			if (result == null)
				result = caseTGGRuleApplication(fieldType__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.FLOW_MARKER: {
			Flow__Marker flow__Marker = (Flow__Marker) theEObject;
			T result = caseFlow__Marker(flow__Marker);
			if (result == null)
				result = caseTGGRuleApplication(flow__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER: {
			IncomingFlow__Marker incomingFlow__Marker = (IncomingFlow__Marker) theEObject;
			T result = caseIncomingFlow__Marker(incomingFlow__Marker);
			if (result == null)
				result = caseTGGRuleApplication(incomingFlow__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.INTERFACE_MARKER: {
			Interface__Marker interface__Marker = (Interface__Marker) theEObject;
			T result = caseInterface__Marker(interface__Marker);
			if (result == null)
				result = caseTGGRuleApplication(interface__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER: {
			InterfaceExtendsInterface__Marker interfaceExtendsInterface__Marker = (InterfaceExtendsInterface__Marker) theEObject;
			T result = caseInterfaceExtendsInterface__Marker(interfaceExtendsInterface__Marker);
			if (result == null)
				result = caseTGGRuleApplication(interfaceExtendsInterface__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER: {
			InterfaceInAnonymous__Marker interfaceInAnonymous__Marker = (InterfaceInAnonymous__Marker) theEObject;
			T result = caseInterfaceInAnonymous__Marker(interfaceInAnonymous__Marker);
			if (result == null)
				result = caseTGGRuleApplication(interfaceInAnonymous__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.INTERFACE_MEMBER_MARKER: {
			InterfaceMember__Marker interfaceMember__Marker = (InterfaceMember__Marker) theEObject;
			T result = caseInterfaceMember__Marker(interfaceMember__Marker);
			if (result == null)
				result = caseTGGRuleApplication(interfaceMember__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER: {
			LinkDefinitionToAnonymous__Marker linkDefinitionToAnonymous__Marker = (LinkDefinitionToAnonymous__Marker) theEObject;
			T result = caseLinkDefinitionToAnonymous__Marker(linkDefinitionToAnonymous__Marker);
			if (result == null)
				result = caseTGGRuleApplication(linkDefinitionToAnonymous__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.LINK_DEFINITION_TO_TYPE_MARKER: {
			LinkDefinitionToType__Marker linkDefinitionToType__Marker = (LinkDefinitionToType__Marker) theEObject;
			T result = caseLinkDefinitionToType__Marker(linkDefinitionToType__Marker);
			if (result == null)
				result = caseTGGRuleApplication(linkDefinitionToType__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER: {
			MemberInAnnotationVisibility__Marker memberInAnnotationVisibility__Marker = (MemberInAnnotationVisibility__Marker) theEObject;
			T result = caseMemberInAnnotationVisibility__Marker(memberInAnnotationVisibility__Marker);
			if (result == null)
				result = caseTGGRuleApplication(memberInAnnotationVisibility__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER: {
			MemberInClassVisibility__Marker memberInClassVisibility__Marker = (MemberInClassVisibility__Marker) theEObject;
			T result = caseMemberInClassVisibility__Marker(memberInClassVisibility__Marker);
			if (result == null)
				result = caseTGGRuleApplication(memberInClassVisibility__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MEMBER_IN_ENUM_VISIBILITY_MARKER: {
			MemberInEnumVisibility__Marker memberInEnumVisibility__Marker = (MemberInEnumVisibility__Marker) theEObject;
			T result = caseMemberInEnumVisibility__Marker(memberInEnumVisibility__Marker);
			if (result == null)
				result = caseTGGRuleApplication(memberInEnumVisibility__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.METHOD_DEFINITION_MARKER: {
			MethodDefinition__Marker methodDefinition__Marker = (MethodDefinition__Marker) theEObject;
			T result = caseMethodDefinition__Marker(methodDefinition__Marker);
			if (result == null)
				result = caseTGGRuleApplication(methodDefinition__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.METHOD_INVOCATION_MARKER: {
			MethodInvocation__Marker methodInvocation__Marker = (MethodInvocation__Marker) theEObject;
			T result = caseMethodInvocation__Marker(methodInvocation__Marker);
			if (result == null)
				result = caseTGGRuleApplication(methodInvocation__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER: {
			MethodInvocationRecursive__Marker methodInvocationRecursive__Marker = (MethodInvocationRecursive__Marker) theEObject;
			T result = caseMethodInvocationRecursive__Marker(methodInvocationRecursive__Marker);
			if (result == null)
				result = caseTGGRuleApplication(methodInvocationRecursive__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER: {
			MethodInvocationStaticType__Marker methodInvocationStaticType__Marker = (MethodInvocationStaticType__Marker) theEObject;
			T result = caseMethodInvocationStaticType__Marker(methodInvocationStaticType__Marker);
			if (result == null)
				result = caseTGGRuleApplication(methodInvocationStaticType__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.METHOD_NAME_MARKER: {
			MethodName__Marker methodName__Marker = (MethodName__Marker) theEObject;
			T result = caseMethodName__Marker(methodName__Marker);
			if (result == null)
				result = caseTGGRuleApplication(methodName__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER: {
			MethodOverriding__Marker methodOverriding__Marker = (MethodOverriding__Marker) theEObject;
			T result = caseMethodOverriding__Marker(methodOverriding__Marker);
			if (result == null)
				result = caseTGGRuleApplication(methodOverriding__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.METHOD_PARAMETER_MARKER: {
			MethodParameter__Marker methodParameter__Marker = (MethodParameter__Marker) theEObject;
			T result = caseMethodParameter__Marker(methodParameter__Marker);
			if (result == null)
				result = caseTGGRuleApplication(methodParameter__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER: {
			MethodParameterLink__Marker methodParameterLink__Marker = (MethodParameterLink__Marker) theEObject;
			T result = caseMethodParameterLink__Marker(methodParameterLink__Marker);
			if (result == null)
				result = caseTGGRuleApplication(methodParameterLink__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_FIRST_MARKER: {
			MethodParameterLinkFirst__Marker methodParameterLinkFirst__Marker = (MethodParameterLinkFirst__Marker) theEObject;
			T result = caseMethodParameterLinkFirst__Marker(methodParameterLinkFirst__Marker);
			if (result == null)
				result = caseTGGRuleApplication(methodParameterLinkFirst__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER: {
			MethodParameterType__Marker methodParameterType__Marker = (MethodParameterType__Marker) theEObject;
			T result = caseMethodParameterType__Marker(methodParameterType__Marker);
			if (result == null)
				result = caseTGGRuleApplication(methodParameterType__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER: {
			MethodSignature__Marker methodSignature__Marker = (MethodSignature__Marker) theEObject;
			T result = caseMethodSignature__Marker(methodSignature__Marker);
			if (result == null)
				result = caseTGGRuleApplication(methodSignature__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER: {
			ModelToPg__Marker modelToPg__Marker = (ModelToPg__Marker) theEObject;
			T result = caseModelToPg__Marker(modelToPg__Marker);
			if (result == null)
				result = caseTGGRuleApplication(modelToPg__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.NESTED_CLASS_IN_TYPE_MARKER: {
			NestedClassInType__Marker nestedClassInType__Marker = (NestedClassInType__Marker) theEObject;
			T result = caseNestedClassInType__Marker(nestedClassInType__Marker);
			if (result == null)
				result = caseTGGRuleApplication(nestedClassInType__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.NESTED_ENUM_MARKER: {
			NestedEnum__Marker nestedEnum__Marker = (NestedEnum__Marker) theEObject;
			T result = caseNestedEnum__Marker(nestedEnum__Marker);
			if (result == null)
				result = caseTGGRuleApplication(nestedEnum__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER: {
			NestedInterfaceInType__Marker nestedInterfaceInType__Marker = (NestedInterfaceInType__Marker) theEObject;
			T result = caseNestedInterfaceInType__Marker(nestedInterfaceInType__Marker);
			if (result == null)
				result = caseTGGRuleApplication(nestedInterfaceInType__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER: {
			OutgoingFlow__Marker outgoingFlow__Marker = (OutgoingFlow__Marker) theEObject;
			T result = caseOutgoingFlow__Marker(outgoingFlow__Marker);
			if (result == null)
				result = caseTGGRuleApplication(outgoingFlow__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER: {
			PackageToPGPackage__Marker packageToPGPackage__Marker = (PackageToPGPackage__Marker) theEObject;
			T result = casePackageToPGPackage__Marker(packageToPGPackage__Marker);
			if (result == null)
				result = caseTGGRuleApplication(packageToPGPackage__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER: {
			ParameterizedTypeToClass__Marker parameterizedTypeToClass__Marker = (ParameterizedTypeToClass__Marker) theEObject;
			T result = caseParameterizedTypeToClass__Marker(parameterizedTypeToClass__Marker);
			if (result == null)
				result = caseTGGRuleApplication(parameterizedTypeToClass__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_BOOLEAN_MARKER: {
			PrimitiveTypeIsBoolean__Marker primitiveTypeIsBoolean__Marker = (PrimitiveTypeIsBoolean__Marker) theEObject;
			T result = casePrimitiveTypeIsBoolean__Marker(primitiveTypeIsBoolean__Marker);
			if (result == null)
				result = caseTGGRuleApplication(primitiveTypeIsBoolean__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_BYTE_MARKER: {
			PrimitiveTypeIsByte__Marker primitiveTypeIsByte__Marker = (PrimitiveTypeIsByte__Marker) theEObject;
			T result = casePrimitiveTypeIsByte__Marker(primitiveTypeIsByte__Marker);
			if (result == null)
				result = caseTGGRuleApplication(primitiveTypeIsByte__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_CHAR_MARKER: {
			PrimitiveTypeIsChar__Marker primitiveTypeIsChar__Marker = (PrimitiveTypeIsChar__Marker) theEObject;
			T result = casePrimitiveTypeIsChar__Marker(primitiveTypeIsChar__Marker);
			if (result == null)
				result = caseTGGRuleApplication(primitiveTypeIsChar__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_DOUBLE_MARKER: {
			PrimitiveTypeIsDouble__Marker primitiveTypeIsDouble__Marker = (PrimitiveTypeIsDouble__Marker) theEObject;
			T result = casePrimitiveTypeIsDouble__Marker(primitiveTypeIsDouble__Marker);
			if (result == null)
				result = caseTGGRuleApplication(primitiveTypeIsDouble__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_FLOAT_MARKER: {
			PrimitiveTypeIsFloat__Marker primitiveTypeIsFloat__Marker = (PrimitiveTypeIsFloat__Marker) theEObject;
			T result = casePrimitiveTypeIsFloat__Marker(primitiveTypeIsFloat__Marker);
			if (result == null)
				result = caseTGGRuleApplication(primitiveTypeIsFloat__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_INT_MARKER: {
			PrimitiveTypeIsInt__Marker primitiveTypeIsInt__Marker = (PrimitiveTypeIsInt__Marker) theEObject;
			T result = casePrimitiveTypeIsInt__Marker(primitiveTypeIsInt__Marker);
			if (result == null)
				result = caseTGGRuleApplication(primitiveTypeIsInt__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER: {
			PrimitiveTypeIsLong__Marker primitiveTypeIsLong__Marker = (PrimitiveTypeIsLong__Marker) theEObject;
			T result = casePrimitiveTypeIsLong__Marker(primitiveTypeIsLong__Marker);
			if (result == null)
				result = caseTGGRuleApplication(primitiveTypeIsLong__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_SHORT_MARKER: {
			PrimitiveTypeIsShort__Marker primitiveTypeIsShort__Marker = (PrimitiveTypeIsShort__Marker) theEObject;
			T result = casePrimitiveTypeIsShort__Marker(primitiveTypeIsShort__Marker);
			if (result == null)
				result = caseTGGRuleApplication(primitiveTypeIsShort__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.PRIMITIVE_TYPES_IS_VOID_MARKER: {
			PrimitiveTypesIsVoid__Marker primitiveTypesIsVoid__Marker = (PrimitiveTypesIsVoid__Marker) theEObject;
			T result = casePrimitiveTypesIsVoid__Marker(primitiveTypesIsVoid__Marker);
			if (result == null)
				result = caseTGGRuleApplication(primitiveTypesIsVoid__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.RETURN_TYPE_MARKER: {
			ReturnType__Marker returnType__Marker = (ReturnType__Marker) theEObject;
			T result = caseReturnType__Marker(returnType__Marker);
			if (result == null)
				result = caseTGGRuleApplication(returnType__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER: {
			SignatureReturnType__Marker signatureReturnType__Marker = (SignatureReturnType__Marker) theEObject;
			T result = caseSignatureReturnType__Marker(signatureReturnType__Marker);
			if (result == null)
				result = caseTGGRuleApplication(signatureReturnType__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER: {
			SubPackageToPGPackage__Marker subPackageToPGPackage__Marker = (SubPackageToPGPackage__Marker) theEObject;
			T result = caseSubPackageToPGPackage__Marker(subPackageToPGPackage__Marker);
			if (result == null)
				result = caseTGGRuleApplication(subPackageToPGPackage__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.SUPER_CONSTRUCTOR_INVOCATION_MARKER: {
			SuperConstructorInvocation__Marker superConstructorInvocation__Marker = (SuperConstructorInvocation__Marker) theEObject;
			T result = caseSuperConstructorInvocation__Marker(superConstructorInvocation__Marker);
			if (result == null)
				result = caseTGGRuleApplication(superConstructorInvocation__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.SUPER_METHOD_INVOCATION_MARKER: {
			SuperMethodInvocation__Marker superMethodInvocation__Marker = (SuperMethodInvocation__Marker) theEObject;
			T result = caseSuperMethodInvocation__Marker(superMethodInvocation__Marker);
			if (result == null)
				result = caseTGGRuleApplication(superMethodInvocation__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER: {
			SyntethicMethod__Marker syntethicMethod__Marker = (SyntethicMethod__Marker) theEObject;
			T result = caseSyntethicMethod__Marker(syntethicMethod__Marker);
			if (result == null)
				result = caseTGGRuleApplication(syntethicMethod__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER: {
			TextAnnotations__Marker textAnnotations__Marker = (TextAnnotations__Marker) theEObject;
			T result = caseTextAnnotations__Marker(textAnnotations__Marker);
			if (result == null)
				result = caseTGGRuleApplication(textAnnotations__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER: {
			TypeParameter__Marker typeParameter__Marker = (TypeParameter__Marker) theEObject;
			T result = caseTypeParameter__Marker(typeParameter__Marker);
			if (result == null)
				result = caseTGGRuleApplication(typeParameter__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER: {
			TypesOrphaned__Marker typesOrphaned__Marker = (TypesOrphaned__Marker) theEObject;
			T result = caseTypesOrphaned__Marker(typesOrphaned__Marker);
			if (result == null)
				result = caseTGGRuleApplication(typesOrphaned__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER: {
			TypesVisibility__Marker typesVisibility__Marker = (TypesVisibility__Marker) theEObject;
			T result = caseTypesVisibility__Marker(typesVisibility__Marker);
			if (result == null)
				result = caseTGGRuleApplication(typesVisibility__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.UNRESOLVED_TYPE_DECLARATION_MARKER: {
			UnresolvedTypeDeclaration__Marker unresolvedTypeDeclaration__Marker = (UnresolvedTypeDeclaration__Marker) theEObject;
			T result = caseUnresolvedTypeDeclaration__Marker(unresolvedTypeDeclaration__Marker);
			if (result == null)
				result = caseTGGRuleApplication(unresolvedTypeDeclaration__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER: {
			VariableDeclarationFragment__Marker variableDeclarationFragment__Marker = (VariableDeclarationFragment__Marker) theEObject;
			T result = caseVariableDeclarationFragment__Marker(variableDeclarationFragment__Marker);
			if (result == null)
				result = caseTGGRuleApplication(variableDeclarationFragment__Marker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal To TBool Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal To TBool Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteralToTBoolNode(BooleanLiteralToTBoolNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal To TNumber Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal To TNumber Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteralToTNumberNode(NumberLiteralToTNumberNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal To TText Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal To TText Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteralToTTextNode(StringLiteralToTTextNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Literal To Class Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Literal To Class Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassLiteralToClassNode(ClassLiteralToClassNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Declaration To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDeclarationToTClass(ClassDeclarationToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package To TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package To TPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageToTPackage(PackageToTPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model To Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model To Type Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelToTypeGraph(ModelToTypeGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Declaration To TInterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Declaration To TInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDeclarationToTInterface(InterfaceDeclarationToTInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDefinition To TMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDefinition To TMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDefinitionToTMember(MDefinitionToTMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access To TAccess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccessToTAccess(FieldAccessToTAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeToTClass(PrimitiveTypeToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Declaration To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMethod Name To TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMethod Name To TMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMethodNameToTMethod(MMethodNameToTMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEntry To TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEntry To TParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEntryToTParameter(MEntryToTParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSignature To TSignature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSignature To TSignature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSignatureToTSignature(MSignatureToTSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AST Node To TAnnotatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AST Node To TAnnotatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTNodeToTAnnotatable(ASTNodeToTAnnotatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type To TAbstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type To TAbstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeToTAbstractType(TypeToTAbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MField Name To TField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MField Name To TField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFieldNameToTField(MFieldNameToTField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Comment To TText Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Comment To TText Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineCommentToTTextAnnotation(LineCommentToTTextAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSingle Variable Access To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSingle Variable Access To TAccess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSingleVariableAccessToTAccess(MSingleVariableAccessToTAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation To TAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation To TAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationToTAnnotation(AnnotationToTAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameterToTClass(TypeParameterToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type Declaration To TClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type Declaration To TClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedTypeDeclarationToTClass(UnresolvedTypeDeclarationToTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier To TClass Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier To TClass Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifierToTClassEntity(ModifierToTClassEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier To TField Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier To TField Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifierToTFieldEntity(ModifierToTFieldEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier To TMethod Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier To TMethod Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifierToTMethodEntity(ModifierToTMethodEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier To Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier To Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifierToAbstractType(ModifierToAbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MModifier To TModifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MModifier To TModifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMModifierToTModifier(MModifierToTModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSyntethic Method To TSyntethic Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSyntethic Method To TSyntethic Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSyntethicMethodToTSyntethicMethod(MSyntethicMethodToTSyntethicMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Pair To TAnnotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValuePairToTAnnotationValue(AnnotationMemberValuePairToTAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Type To Access Static Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Type To Access Static Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticTypeToAccessStaticType(StaticTypeToAccessStaticType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFlow To TFlow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFlow To TFlow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFlowToTFlow(MFlowToTFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAbstract Flow Element To TAbstract Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAbstract Flow Element To TAbstract Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAbstractFlowElementToTAbstractFlowElement(MAbstractFlowElementToTAbstractFlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Invocation To TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Invocation To TAccess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodInvocationToTAccess(AbstractMethodInvocationToTAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationFragmentToTFieldDefinition(VariableDeclarationFragmentToTFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Key Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Key Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberKey__Marker(AnnotationMemberKey__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Annotation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Annotation Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueAnnotation__Marker(AnnotationMemberValueAnnotation__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Annotation Array Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Annotation Array Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueAnnotationArray__Marker(AnnotationMemberValueAnnotationArray__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Boolean Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Boolean Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueBoolean__Marker(AnnotationMemberValueBoolean__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Boolean Array Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Boolean Array Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueBooleanArray__Marker(AnnotationMemberValueBooleanArray__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Class Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueClass__Marker(AnnotationMemberValueClass__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Class Array Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Class Array Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueClassArray__Marker(AnnotationMemberValueClassArray__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Number Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Number Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueNumber__Marker(AnnotationMemberValueNumber__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Number Array Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Number Array Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueNumberArray__Marker(AnnotationMemberValueNumberArray__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value String Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value String Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueString__Marker(AnnotationMemberValueString__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value String Array Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value String Array Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValueStringArray__Marker(AnnotationMemberValueStringArray__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation On Body Declaration Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation On Body Declaration Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationOnBodyDeclaration__Marker(AnnotationOnBodyDeclaration__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationType__Marker(AnnotationType__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Access Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Access Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeAccess__Marker(AnnotationTypeAccess__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type In Anonymous Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type In Anonymous Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeInAnonymous__Marker(AnnotationTypeInAnonymous__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Nested Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Nested Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeNested__Marker(AnnotationTypeNested__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClass__Marker(AnonymousClass__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Type Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Type Class Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassTypeClass__Marker(AnonymousClassTypeClass__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Type Interface Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Type Interface Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassTypeInterface__Marker(AnonymousClassTypeInterface__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Initializer Ignore Expressions Edge Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Initializer Ignore Expressions Edge Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInitializerIgnoreExpressionsEdge__Marker(ArrayInitializerIgnoreExpressionsEdge__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type To Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type To Class Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayTypeToClass__Marker(ArrayTypeToClass__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass__Marker(Class__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Extends Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Extends Class Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassExtendsClass__Marker(ClassExtendsClass__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Implements Interface Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Implements Interface Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassImplementsInterface__Marker(ClassImplementsInterface__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class In Anonymous Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class In Anonymous Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInAnonymous__Marker(ClassInAnonymous__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Inner Anon Class Member Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Inner Anon Class Member Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInnerAnonClassMember__Marker(ClassInnerAnonClassMember__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Inner Class Member Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Inner Class Member Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInnerClassMember__Marker(ClassInnerClassMember__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Instance Creation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Instance Creation Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInstanceCreation__Marker(ClassInstanceCreation__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Definition Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Definition Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorDefinition__Marker(ConstructorDefinition__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Invocation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Invocation Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorInvocation__Marker(ConstructorInvocation__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum__Marker(Enum__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum In Anonymous Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum In Anonymous Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumInAnonymous__Marker(EnumInAnonymous__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access Read Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access Read Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccessRead__Marker(FieldAccessRead__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access Read Write Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access Read Write Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccessReadWrite__Marker(FieldAccessReadWrite__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access Write Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access Write Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccessWrite__Marker(FieldAccessWrite__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Definition Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Definition Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDefinition__Marker(FieldDefinition__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Name Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Name Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldName__Marker(FieldName__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Signature Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Signature Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldSignature__Marker(FieldSignature__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Type Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldType__Marker(FieldType__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow__Marker(Flow__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incoming Flow Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incoming Flow Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomingFlow__Marker(IncomingFlow__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface__Marker(Interface__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Extends Interface Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Extends Interface Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceExtendsInterface__Marker(InterfaceExtendsInterface__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface In Anonymous Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface In Anonymous Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceInAnonymous__Marker(InterfaceInAnonymous__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Member Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Member Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceMember__Marker(InterfaceMember__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Definition To Anonymous Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Definition To Anonymous Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkDefinitionToAnonymous__Marker(LinkDefinitionToAnonymous__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Definition To Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Definition To Type Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkDefinitionToType__Marker(LinkDefinitionToType__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member In Annotation Visibility Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member In Annotation Visibility Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberInAnnotationVisibility__Marker(MemberInAnnotationVisibility__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member In Class Visibility Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member In Class Visibility Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberInClassVisibility__Marker(MemberInClassVisibility__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member In Enum Visibility Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member In Enum Visibility Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberInEnumVisibility__Marker(MemberInEnumVisibility__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Definition Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Definition Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDefinition__Marker(MethodDefinition__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocation__Marker(MethodInvocation__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation Recursive Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation Recursive Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocationRecursive__Marker(MethodInvocationRecursive__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation Static Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation Static Type Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocationStaticType__Marker(MethodInvocationStaticType__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Name Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Name Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodName__Marker(MethodName__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Overriding Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Overriding Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodOverriding__Marker(MethodOverriding__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameter__Marker(MethodParameter__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter Link Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter Link Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameterLink__Marker(MethodParameterLink__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter Link First Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter Link First Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameterLinkFirst__Marker(MethodParameterLinkFirst__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Parameter Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Parameter Type Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodParameterType__Marker(MethodParameterType__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Signature Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Signature Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodSignature__Marker(MethodSignature__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model To Pg Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model To Pg Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelToPg__Marker(ModelToPg__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Class In Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Class In Type Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedClassInType__Marker(NestedClassInType__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Enum Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Enum Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedEnum__Marker(NestedEnum__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Interface In Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Interface In Type Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedInterfaceInType__Marker(NestedInterfaceInType__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outgoing Flow Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outgoing Flow Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutgoingFlow__Marker(OutgoingFlow__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package To PG Package Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package To PG Package Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageToPGPackage__Marker(PackageToPGPackage__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type To Class Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type To Class Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedTypeToClass__Marker(ParameterizedTypeToClass__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Boolean Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Boolean Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsBoolean__Marker(PrimitiveTypeIsBoolean__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Byte Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Byte Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsByte__Marker(PrimitiveTypeIsByte__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Char Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Char Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsChar__Marker(PrimitiveTypeIsChar__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Double Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Double Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsDouble__Marker(PrimitiveTypeIsDouble__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Float Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Float Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsFloat__Marker(PrimitiveTypeIsFloat__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Int Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Int Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsInt__Marker(PrimitiveTypeIsInt__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Long Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Long Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsLong__Marker(PrimitiveTypeIsLong__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Is Short Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Is Short Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeIsShort__Marker(PrimitiveTypeIsShort__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Types Is Void Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Types Is Void Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypesIsVoid__Marker(PrimitiveTypesIsVoid__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType__Marker(ReturnType__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Return Type Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Return Type Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureReturnType__Marker(SignatureReturnType__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Package To PG Package Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Package To PG Package Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPackageToPGPackage__Marker(SubPackageToPGPackage__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Constructor Invocation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Constructor Invocation Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperConstructorInvocation__Marker(SuperConstructorInvocation__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Method Invocation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Method Invocation Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperMethodInvocation__Marker(SuperMethodInvocation__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syntethic Method Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syntethic Method Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyntethicMethod__Marker(SyntethicMethod__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Annotations Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Annotations Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAnnotations__Marker(TextAnnotations__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter__Marker(TypeParameter__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types Orphaned Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types Orphaned Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypesOrphaned__Marker(TypesOrphaned__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types Visibility Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types Visibility Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypesVisibility__Marker(TypesVisibility__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type Declaration Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type Declaration Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedTypeDeclaration__Marker(UnresolvedTypeDeclaration__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Fragment Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Fragment Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationFragment__Marker(VariableDeclarationFragment__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGG Rule Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGG Rule Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGGRuleApplication(TGGRuleApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModiscoTGGSwitch
