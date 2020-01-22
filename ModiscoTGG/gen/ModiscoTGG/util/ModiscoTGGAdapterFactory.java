/**
 */
package ModiscoTGG.util;

import ModiscoTGG.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ModiscoTGG.ModiscoTGGPackage
 * @generated
 */
public class ModiscoTGGAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModiscoTGGPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoTGGAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModiscoTGGPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModiscoTGGSwitch<Adapter> modelSwitch = new ModiscoTGGSwitch<Adapter>() {
		@Override
		public Adapter caseBooleanLiteralToTBoolNode(BooleanLiteralToTBoolNode object) {
			return createBooleanLiteralToTBoolNodeAdapter();
		}

		@Override
		public Adapter caseNumberLiteralToTNumberNode(NumberLiteralToTNumberNode object) {
			return createNumberLiteralToTNumberNodeAdapter();
		}

		@Override
		public Adapter caseStringLiteralToTTextNode(StringLiteralToTTextNode object) {
			return createStringLiteralToTTextNodeAdapter();
		}

		@Override
		public Adapter caseClassLiteralToClassNode(ClassLiteralToClassNode object) {
			return createClassLiteralToClassNodeAdapter();
		}

		@Override
		public Adapter caseClassDeclarationToTClass(ClassDeclarationToTClass object) {
			return createClassDeclarationToTClassAdapter();
		}

		@Override
		public Adapter casePackageToTPackage(PackageToTPackage object) {
			return createPackageToTPackageAdapter();
		}

		@Override
		public Adapter caseModelToTypeGraph(ModelToTypeGraph object) {
			return createModelToTypeGraphAdapter();
		}

		@Override
		public Adapter caseInterfaceDeclarationToTInterface(InterfaceDeclarationToTInterface object) {
			return createInterfaceDeclarationToTInterfaceAdapter();
		}

		@Override
		public Adapter caseMDefinitionToTMember(MDefinitionToTMember object) {
			return createMDefinitionToTMemberAdapter();
		}

		@Override
		public Adapter caseFieldAccessToTAccess(FieldAccessToTAccess object) {
			return createFieldAccessToTAccessAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeToTClass(PrimitiveTypeToTClass object) {
			return createPrimitiveTypeToTClassAdapter();
		}

		@Override
		public Adapter caseAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass object) {
			return createAnonymousClassDeclarationToTClassAdapter();
		}

		@Override
		public Adapter caseMMethodNameToTMethod(MMethodNameToTMethod object) {
			return createMMethodNameToTMethodAdapter();
		}

		@Override
		public Adapter caseMEntryToTParameter(MEntryToTParameter object) {
			return createMEntryToTParameterAdapter();
		}

		@Override
		public Adapter caseMSignatureToTSignature(MSignatureToTSignature object) {
			return createMSignatureToTSignatureAdapter();
		}

		@Override
		public Adapter caseASTNodeToTAnnotatable(ASTNodeToTAnnotatable object) {
			return createASTNodeToTAnnotatableAdapter();
		}

		@Override
		public Adapter caseTypeToTAbstractType(TypeToTAbstractType object) {
			return createTypeToTAbstractTypeAdapter();
		}

		@Override
		public Adapter caseMFieldNameToTField(MFieldNameToTField object) {
			return createMFieldNameToTFieldAdapter();
		}

		@Override
		public Adapter caseLineCommentToTTextAnnotation(LineCommentToTTextAnnotation object) {
			return createLineCommentToTTextAnnotationAdapter();
		}

		@Override
		public Adapter caseMSingleVariableAccessToTAccess(MSingleVariableAccessToTAccess object) {
			return createMSingleVariableAccessToTAccessAdapter();
		}

		@Override
		public Adapter caseAnnotationToTAnnotation(AnnotationToTAnnotation object) {
			return createAnnotationToTAnnotationAdapter();
		}

		@Override
		public Adapter caseTypeParameterToTClass(TypeParameterToTClass object) {
			return createTypeParameterToTClassAdapter();
		}

		@Override
		public Adapter caseUnresolvedTypeDeclarationToTClass(UnresolvedTypeDeclarationToTClass object) {
			return createUnresolvedTypeDeclarationToTClassAdapter();
		}

		@Override
		public Adapter caseModifierToTClassEntity(ModifierToTClassEntity object) {
			return createModifierToTClassEntityAdapter();
		}

		@Override
		public Adapter caseModifierToTFieldEntity(ModifierToTFieldEntity object) {
			return createModifierToTFieldEntityAdapter();
		}

		@Override
		public Adapter caseModifierToTMethodEntity(ModifierToTMethodEntity object) {
			return createModifierToTMethodEntityAdapter();
		}

		@Override
		public Adapter caseModifierToAbstractType(ModifierToAbstractType object) {
			return createModifierToAbstractTypeAdapter();
		}

		@Override
		public Adapter caseMModifierToTModifier(MModifierToTModifier object) {
			return createMModifierToTModifierAdapter();
		}

		@Override
		public Adapter caseMSyntethicMethodToTSyntethicMethod(MSyntethicMethodToTSyntethicMethod object) {
			return createMSyntethicMethodToTSyntethicMethodAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValuePairToTAnnotationValue(
				AnnotationMemberValuePairToTAnnotationValue object) {
			return createAnnotationMemberValuePairToTAnnotationValueAdapter();
		}

		@Override
		public Adapter caseStaticTypeToAccessStaticType(StaticTypeToAccessStaticType object) {
			return createStaticTypeToAccessStaticTypeAdapter();
		}

		@Override
		public Adapter caseMFlowToTFlow(MFlowToTFlow object) {
			return createMFlowToTFlowAdapter();
		}

		@Override
		public Adapter caseMAbstractFlowElementToTAbstractFlowElement(
				MAbstractFlowElementToTAbstractFlowElement object) {
			return createMAbstractFlowElementToTAbstractFlowElementAdapter();
		}

		@Override
		public Adapter caseAbstractMethodInvocationToTAccess(AbstractMethodInvocationToTAccess object) {
			return createAbstractMethodInvocationToTAccessAdapter();
		}

		@Override
		public Adapter caseVariableDeclarationFragmentToTFieldDefinition(
				VariableDeclarationFragmentToTFieldDefinition object) {
			return createVariableDeclarationFragmentToTFieldDefinitionAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberKey__Marker(AnnotationMemberKey__Marker object) {
			return createAnnotationMemberKey__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueAnnotation__Marker(AnnotationMemberValueAnnotation__Marker object) {
			return createAnnotationMemberValueAnnotation__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueAnnotationArray__Marker(
				AnnotationMemberValueAnnotationArray__Marker object) {
			return createAnnotationMemberValueAnnotationArray__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueBoolean__Marker(AnnotationMemberValueBoolean__Marker object) {
			return createAnnotationMemberValueBoolean__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueBooleanArray__Marker(AnnotationMemberValueBooleanArray__Marker object) {
			return createAnnotationMemberValueBooleanArray__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueClass__Marker(AnnotationMemberValueClass__Marker object) {
			return createAnnotationMemberValueClass__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueClassArray__Marker(AnnotationMemberValueClassArray__Marker object) {
			return createAnnotationMemberValueClassArray__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueNumber__Marker(AnnotationMemberValueNumber__Marker object) {
			return createAnnotationMemberValueNumber__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueNumberArray__Marker(AnnotationMemberValueNumberArray__Marker object) {
			return createAnnotationMemberValueNumberArray__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueString__Marker(AnnotationMemberValueString__Marker object) {
			return createAnnotationMemberValueString__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationMemberValueStringArray__Marker(AnnotationMemberValueStringArray__Marker object) {
			return createAnnotationMemberValueStringArray__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationOnBodyDeclaration__Marker(AnnotationOnBodyDeclaration__Marker object) {
			return createAnnotationOnBodyDeclaration__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationType__Marker(AnnotationType__Marker object) {
			return createAnnotationType__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeAccess__Marker(AnnotationTypeAccess__Marker object) {
			return createAnnotationTypeAccess__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeInAnonymous__Marker(AnnotationTypeInAnonymous__Marker object) {
			return createAnnotationTypeInAnonymous__MarkerAdapter();
		}

		@Override
		public Adapter caseAnnotationTypeNested__Marker(AnnotationTypeNested__Marker object) {
			return createAnnotationTypeNested__MarkerAdapter();
		}

		@Override
		public Adapter caseAnonymousClass__Marker(AnonymousClass__Marker object) {
			return createAnonymousClass__MarkerAdapter();
		}

		@Override
		public Adapter caseAnonymousClassTypeClass__Marker(AnonymousClassTypeClass__Marker object) {
			return createAnonymousClassTypeClass__MarkerAdapter();
		}

		@Override
		public Adapter caseAnonymousClassTypeInterface__Marker(AnonymousClassTypeInterface__Marker object) {
			return createAnonymousClassTypeInterface__MarkerAdapter();
		}

		@Override
		public Adapter caseArrayInitializerIgnoreExpressionsEdge__Marker(
				ArrayInitializerIgnoreExpressionsEdge__Marker object) {
			return createArrayInitializerIgnoreExpressionsEdge__MarkerAdapter();
		}

		@Override
		public Adapter caseArrayTypeToClass__Marker(ArrayTypeToClass__Marker object) {
			return createArrayTypeToClass__MarkerAdapter();
		}

		@Override
		public Adapter caseClass__Marker(Class__Marker object) {
			return createClass__MarkerAdapter();
		}

		@Override
		public Adapter caseClassExtendsClass__Marker(ClassExtendsClass__Marker object) {
			return createClassExtendsClass__MarkerAdapter();
		}

		@Override
		public Adapter caseClassImplementsInterface__Marker(ClassImplementsInterface__Marker object) {
			return createClassImplementsInterface__MarkerAdapter();
		}

		@Override
		public Adapter caseClassInAnonymous__Marker(ClassInAnonymous__Marker object) {
			return createClassInAnonymous__MarkerAdapter();
		}

		@Override
		public Adapter caseClassInnerAnonClassMember__Marker(ClassInnerAnonClassMember__Marker object) {
			return createClassInnerAnonClassMember__MarkerAdapter();
		}

		@Override
		public Adapter caseClassInnerClassMember__Marker(ClassInnerClassMember__Marker object) {
			return createClassInnerClassMember__MarkerAdapter();
		}

		@Override
		public Adapter caseClassInstanceCreation__Marker(ClassInstanceCreation__Marker object) {
			return createClassInstanceCreation__MarkerAdapter();
		}

		@Override
		public Adapter caseConstructorDefinition__Marker(ConstructorDefinition__Marker object) {
			return createConstructorDefinition__MarkerAdapter();
		}

		@Override
		public Adapter caseConstructorInvocation__Marker(ConstructorInvocation__Marker object) {
			return createConstructorInvocation__MarkerAdapter();
		}

		@Override
		public Adapter caseEnum__Marker(Enum__Marker object) {
			return createEnum__MarkerAdapter();
		}

		@Override
		public Adapter caseEnumInAnonymous__Marker(EnumInAnonymous__Marker object) {
			return createEnumInAnonymous__MarkerAdapter();
		}

		@Override
		public Adapter caseFieldAccessRead__Marker(FieldAccessRead__Marker object) {
			return createFieldAccessRead__MarkerAdapter();
		}

		@Override
		public Adapter caseFieldAccessReadWrite__Marker(FieldAccessReadWrite__Marker object) {
			return createFieldAccessReadWrite__MarkerAdapter();
		}

		@Override
		public Adapter caseFieldAccessWrite__Marker(FieldAccessWrite__Marker object) {
			return createFieldAccessWrite__MarkerAdapter();
		}

		@Override
		public Adapter caseFieldDefinition__Marker(FieldDefinition__Marker object) {
			return createFieldDefinition__MarkerAdapter();
		}

		@Override
		public Adapter caseFieldName__Marker(FieldName__Marker object) {
			return createFieldName__MarkerAdapter();
		}

		@Override
		public Adapter caseFieldSignature__Marker(FieldSignature__Marker object) {
			return createFieldSignature__MarkerAdapter();
		}

		@Override
		public Adapter caseFieldType__Marker(FieldType__Marker object) {
			return createFieldType__MarkerAdapter();
		}

		@Override
		public Adapter caseFlow__Marker(Flow__Marker object) {
			return createFlow__MarkerAdapter();
		}

		@Override
		public Adapter caseIncomingFlow__Marker(IncomingFlow__Marker object) {
			return createIncomingFlow__MarkerAdapter();
		}

		@Override
		public Adapter caseInterface__Marker(Interface__Marker object) {
			return createInterface__MarkerAdapter();
		}

		@Override
		public Adapter caseInterfaceExtendsInterface__Marker(InterfaceExtendsInterface__Marker object) {
			return createInterfaceExtendsInterface__MarkerAdapter();
		}

		@Override
		public Adapter caseInterfaceInAnonymous__Marker(InterfaceInAnonymous__Marker object) {
			return createInterfaceInAnonymous__MarkerAdapter();
		}

		@Override
		public Adapter caseInterfaceMember__Marker(InterfaceMember__Marker object) {
			return createInterfaceMember__MarkerAdapter();
		}

		@Override
		public Adapter caseLinkDefinitionToAnonymous__Marker(LinkDefinitionToAnonymous__Marker object) {
			return createLinkDefinitionToAnonymous__MarkerAdapter();
		}

		@Override
		public Adapter caseLinkDefinitionToType__Marker(LinkDefinitionToType__Marker object) {
			return createLinkDefinitionToType__MarkerAdapter();
		}

		@Override
		public Adapter caseMemberInAnnotationVisibility__Marker(MemberInAnnotationVisibility__Marker object) {
			return createMemberInAnnotationVisibility__MarkerAdapter();
		}

		@Override
		public Adapter caseMemberInClassVisibility__Marker(MemberInClassVisibility__Marker object) {
			return createMemberInClassVisibility__MarkerAdapter();
		}

		@Override
		public Adapter caseMemberInEnumVisibility__Marker(MemberInEnumVisibility__Marker object) {
			return createMemberInEnumVisibility__MarkerAdapter();
		}

		@Override
		public Adapter caseMethodDefinition__Marker(MethodDefinition__Marker object) {
			return createMethodDefinition__MarkerAdapter();
		}

		@Override
		public Adapter caseMethodInvocation__Marker(MethodInvocation__Marker object) {
			return createMethodInvocation__MarkerAdapter();
		}

		@Override
		public Adapter caseMethodInvocationRecursive__Marker(MethodInvocationRecursive__Marker object) {
			return createMethodInvocationRecursive__MarkerAdapter();
		}

		@Override
		public Adapter caseMethodInvocationStaticType__Marker(MethodInvocationStaticType__Marker object) {
			return createMethodInvocationStaticType__MarkerAdapter();
		}

		@Override
		public Adapter caseMethodName__Marker(MethodName__Marker object) {
			return createMethodName__MarkerAdapter();
		}

		@Override
		public Adapter caseMethodOverriding__Marker(MethodOverriding__Marker object) {
			return createMethodOverriding__MarkerAdapter();
		}

		@Override
		public Adapter caseMethodParameter__Marker(MethodParameter__Marker object) {
			return createMethodParameter__MarkerAdapter();
		}

		@Override
		public Adapter caseMethodParameterLink__Marker(MethodParameterLink__Marker object) {
			return createMethodParameterLink__MarkerAdapter();
		}

		@Override
		public Adapter caseMethodParameterLinkFirst__Marker(MethodParameterLinkFirst__Marker object) {
			return createMethodParameterLinkFirst__MarkerAdapter();
		}

		@Override
		public Adapter caseMethodParameterType__Marker(MethodParameterType__Marker object) {
			return createMethodParameterType__MarkerAdapter();
		}

		@Override
		public Adapter caseMethodSignature__Marker(MethodSignature__Marker object) {
			return createMethodSignature__MarkerAdapter();
		}

		@Override
		public Adapter caseModelToPg__Marker(ModelToPg__Marker object) {
			return createModelToPg__MarkerAdapter();
		}

		@Override
		public Adapter caseNestedClassInType__Marker(NestedClassInType__Marker object) {
			return createNestedClassInType__MarkerAdapter();
		}

		@Override
		public Adapter caseNestedEnum__Marker(NestedEnum__Marker object) {
			return createNestedEnum__MarkerAdapter();
		}

		@Override
		public Adapter caseNestedInterfaceInType__Marker(NestedInterfaceInType__Marker object) {
			return createNestedInterfaceInType__MarkerAdapter();
		}

		@Override
		public Adapter caseOutgoingFlow__Marker(OutgoingFlow__Marker object) {
			return createOutgoingFlow__MarkerAdapter();
		}

		@Override
		public Adapter casePackageToPGPackage__Marker(PackageToPGPackage__Marker object) {
			return createPackageToPGPackage__MarkerAdapter();
		}

		@Override
		public Adapter caseParameterizedTypeToClass__Marker(ParameterizedTypeToClass__Marker object) {
			return createParameterizedTypeToClass__MarkerAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsBoolean__Marker(PrimitiveTypeIsBoolean__Marker object) {
			return createPrimitiveTypeIsBoolean__MarkerAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsByte__Marker(PrimitiveTypeIsByte__Marker object) {
			return createPrimitiveTypeIsByte__MarkerAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsChar__Marker(PrimitiveTypeIsChar__Marker object) {
			return createPrimitiveTypeIsChar__MarkerAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsDouble__Marker(PrimitiveTypeIsDouble__Marker object) {
			return createPrimitiveTypeIsDouble__MarkerAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsFloat__Marker(PrimitiveTypeIsFloat__Marker object) {
			return createPrimitiveTypeIsFloat__MarkerAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsInt__Marker(PrimitiveTypeIsInt__Marker object) {
			return createPrimitiveTypeIsInt__MarkerAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsLong__Marker(PrimitiveTypeIsLong__Marker object) {
			return createPrimitiveTypeIsLong__MarkerAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeIsShort__Marker(PrimitiveTypeIsShort__Marker object) {
			return createPrimitiveTypeIsShort__MarkerAdapter();
		}

		@Override
		public Adapter casePrimitiveTypesIsVoid__Marker(PrimitiveTypesIsVoid__Marker object) {
			return createPrimitiveTypesIsVoid__MarkerAdapter();
		}

		@Override
		public Adapter caseReturnType__Marker(ReturnType__Marker object) {
			return createReturnType__MarkerAdapter();
		}

		@Override
		public Adapter caseSignatureReturnType__Marker(SignatureReturnType__Marker object) {
			return createSignatureReturnType__MarkerAdapter();
		}

		@Override
		public Adapter caseSubPackageToPGPackage__Marker(SubPackageToPGPackage__Marker object) {
			return createSubPackageToPGPackage__MarkerAdapter();
		}

		@Override
		public Adapter caseSuperConstructorInvocation__Marker(SuperConstructorInvocation__Marker object) {
			return createSuperConstructorInvocation__MarkerAdapter();
		}

		@Override
		public Adapter caseSuperMethodInvocation__Marker(SuperMethodInvocation__Marker object) {
			return createSuperMethodInvocation__MarkerAdapter();
		}

		@Override
		public Adapter caseSyntethicMethod__Marker(SyntethicMethod__Marker object) {
			return createSyntethicMethod__MarkerAdapter();
		}

		@Override
		public Adapter caseTextAnnotations__Marker(TextAnnotations__Marker object) {
			return createTextAnnotations__MarkerAdapter();
		}

		@Override
		public Adapter caseTypeParameter__Marker(TypeParameter__Marker object) {
			return createTypeParameter__MarkerAdapter();
		}

		@Override
		public Adapter caseTypesOrphaned__Marker(TypesOrphaned__Marker object) {
			return createTypesOrphaned__MarkerAdapter();
		}

		@Override
		public Adapter caseTypesVisibility__Marker(TypesVisibility__Marker object) {
			return createTypesVisibility__MarkerAdapter();
		}

		@Override
		public Adapter caseUnresolvedTypeDeclaration__Marker(UnresolvedTypeDeclaration__Marker object) {
			return createUnresolvedTypeDeclaration__MarkerAdapter();
		}

		@Override
		public Adapter caseVariableDeclarationFragment__Marker(VariableDeclarationFragment__Marker object) {
			return createVariableDeclarationFragment__MarkerAdapter();
		}

		@Override
		public Adapter caseTGGRuleApplication(TGGRuleApplication object) {
			return createTGGRuleApplicationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.BooleanLiteralToTBoolNode <em>Boolean Literal To TBool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.BooleanLiteralToTBoolNode
	 * @generated
	 */
	public Adapter createBooleanLiteralToTBoolNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.NumberLiteralToTNumberNode <em>Number Literal To TNumber Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.NumberLiteralToTNumberNode
	 * @generated
	 */
	public Adapter createNumberLiteralToTNumberNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.StringLiteralToTTextNode <em>String Literal To TText Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.StringLiteralToTTextNode
	 * @generated
	 */
	public Adapter createStringLiteralToTTextNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ClassLiteralToClassNode <em>Class Literal To Class Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ClassLiteralToClassNode
	 * @generated
	 */
	public Adapter createClassLiteralToClassNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ClassDeclarationToTClass <em>Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ClassDeclarationToTClass
	 * @generated
	 */
	public Adapter createClassDeclarationToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.PackageToTPackage <em>Package To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.PackageToTPackage
	 * @generated
	 */
	public Adapter createPackageToTPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ModelToTypeGraph <em>Model To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ModelToTypeGraph
	 * @generated
	 */
	public Adapter createModelToTypeGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.InterfaceDeclarationToTInterface <em>Interface Declaration To TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.InterfaceDeclarationToTInterface
	 * @generated
	 */
	public Adapter createInterfaceDeclarationToTInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MDefinitionToTMember <em>MDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MDefinitionToTMember
	 * @generated
	 */
	public Adapter createMDefinitionToTMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.FieldAccessToTAccess <em>Field Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.FieldAccessToTAccess
	 * @generated
	 */
	public Adapter createFieldAccessToTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.PrimitiveTypeToTClass <em>Primitive Type To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.PrimitiveTypeToTClass
	 * @generated
	 */
	public Adapter createPrimitiveTypeToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnonymousClassDeclarationToTClass <em>Anonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnonymousClassDeclarationToTClass
	 * @generated
	 */
	public Adapter createAnonymousClassDeclarationToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MMethodNameToTMethod <em>MMethod Name To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MMethodNameToTMethod
	 * @generated
	 */
	public Adapter createMMethodNameToTMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MEntryToTParameter <em>MEntry To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MEntryToTParameter
	 * @generated
	 */
	public Adapter createMEntryToTParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MSignatureToTSignature <em>MSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MSignatureToTSignature
	 * @generated
	 */
	public Adapter createMSignatureToTSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ASTNodeToTAnnotatable <em>AST Node To TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ASTNodeToTAnnotatable
	 * @generated
	 */
	public Adapter createASTNodeToTAnnotatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.TypeToTAbstractType <em>Type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.TypeToTAbstractType
	 * @generated
	 */
	public Adapter createTypeToTAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MFieldNameToTField <em>MField Name To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MFieldNameToTField
	 * @generated
	 */
	public Adapter createMFieldNameToTFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.LineCommentToTTextAnnotation <em>Line Comment To TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.LineCommentToTTextAnnotation
	 * @generated
	 */
	public Adapter createLineCommentToTTextAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MSingleVariableAccessToTAccess <em>MSingle Variable Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MSingleVariableAccessToTAccess
	 * @generated
	 */
	public Adapter createMSingleVariableAccessToTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationToTAnnotation <em>Annotation To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationToTAnnotation
	 * @generated
	 */
	public Adapter createAnnotationToTAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.TypeParameterToTClass <em>Type Parameter To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.TypeParameterToTClass
	 * @generated
	 */
	public Adapter createTypeParameterToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.UnresolvedTypeDeclarationToTClass <em>Unresolved Type Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.UnresolvedTypeDeclarationToTClass
	 * @generated
	 */
	public Adapter createUnresolvedTypeDeclarationToTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ModifierToTClassEntity <em>Modifier To TClass Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ModifierToTClassEntity
	 * @generated
	 */
	public Adapter createModifierToTClassEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ModifierToTFieldEntity <em>Modifier To TField Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ModifierToTFieldEntity
	 * @generated
	 */
	public Adapter createModifierToTFieldEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ModifierToTMethodEntity <em>Modifier To TMethod Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ModifierToTMethodEntity
	 * @generated
	 */
	public Adapter createModifierToTMethodEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ModifierToAbstractType <em>Modifier To Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ModifierToAbstractType
	 * @generated
	 */
	public Adapter createModifierToAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MModifierToTModifier <em>MModifier To TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MModifierToTModifier
	 * @generated
	 */
	public Adapter createMModifierToTModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MSyntethicMethodToTSyntethicMethod <em>MSyntethic Method To TSyntethic Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MSyntethicMethodToTSyntethicMethod
	 * @generated
	 */
	public Adapter createMSyntethicMethodToTSyntethicMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue <em>Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue
	 * @generated
	 */
	public Adapter createAnnotationMemberValuePairToTAnnotationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.StaticTypeToAccessStaticType <em>Static Type To Access Static Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.StaticTypeToAccessStaticType
	 * @generated
	 */
	public Adapter createStaticTypeToAccessStaticTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MFlowToTFlow <em>MFlow To TFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MFlowToTFlow
	 * @generated
	 */
	public Adapter createMFlowToTFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement <em>MAbstract Flow Element To TAbstract Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement
	 * @generated
	 */
	public Adapter createMAbstractFlowElementToTAbstractFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AbstractMethodInvocationToTAccess <em>Abstract Method Invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AbstractMethodInvocationToTAccess
	 * @generated
	 */
	public Adapter createAbstractMethodInvocationToTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition <em>Variable Declaration Fragment To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition
	 * @generated
	 */
	public Adapter createVariableDeclarationFragmentToTFieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationMemberKey__Marker <em>Annotation Member Key Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationMemberKey__Marker
	 * @generated
	 */
	public Adapter createAnnotationMemberKey__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationMemberValueAnnotation__Marker <em>Annotation Member Value Annotation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotation__Marker
	 * @generated
	 */
	public Adapter createAnnotationMemberValueAnnotation__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker <em>Annotation Member Value Annotation Array Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker
	 * @generated
	 */
	public Adapter createAnnotationMemberValueAnnotationArray__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationMemberValueBoolean__Marker <em>Annotation Member Value Boolean Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationMemberValueBoolean__Marker
	 * @generated
	 */
	public Adapter createAnnotationMemberValueBoolean__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationMemberValueBooleanArray__Marker <em>Annotation Member Value Boolean Array Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationMemberValueBooleanArray__Marker
	 * @generated
	 */
	public Adapter createAnnotationMemberValueBooleanArray__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationMemberValueClass__Marker <em>Annotation Member Value Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationMemberValueClass__Marker
	 * @generated
	 */
	public Adapter createAnnotationMemberValueClass__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker <em>Annotation Member Value Class Array Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker
	 * @generated
	 */
	public Adapter createAnnotationMemberValueClassArray__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationMemberValueNumber__Marker <em>Annotation Member Value Number Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationMemberValueNumber__Marker
	 * @generated
	 */
	public Adapter createAnnotationMemberValueNumber__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationMemberValueNumberArray__Marker <em>Annotation Member Value Number Array Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationMemberValueNumberArray__Marker
	 * @generated
	 */
	public Adapter createAnnotationMemberValueNumberArray__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationMemberValueString__Marker <em>Annotation Member Value String Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationMemberValueString__Marker
	 * @generated
	 */
	public Adapter createAnnotationMemberValueString__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationMemberValueStringArray__Marker <em>Annotation Member Value String Array Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationMemberValueStringArray__Marker
	 * @generated
	 */
	public Adapter createAnnotationMemberValueStringArray__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker <em>Annotation On Body Declaration Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationOnBodyDeclaration__Marker
	 * @generated
	 */
	public Adapter createAnnotationOnBodyDeclaration__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationType__Marker <em>Annotation Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationType__Marker
	 * @generated
	 */
	public Adapter createAnnotationType__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationTypeAccess__Marker <em>Annotation Type Access Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationTypeAccess__Marker
	 * @generated
	 */
	public Adapter createAnnotationTypeAccess__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker <em>Annotation Type In Anonymous Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationTypeInAnonymous__Marker
	 * @generated
	 */
	public Adapter createAnnotationTypeInAnonymous__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnnotationTypeNested__Marker <em>Annotation Type Nested Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnnotationTypeNested__Marker
	 * @generated
	 */
	public Adapter createAnnotationTypeNested__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnonymousClass__Marker <em>Anonymous Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnonymousClass__Marker
	 * @generated
	 */
	public Adapter createAnonymousClass__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnonymousClassTypeClass__Marker <em>Anonymous Class Type Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnonymousClassTypeClass__Marker
	 * @generated
	 */
	public Adapter createAnonymousClassTypeClass__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.AnonymousClassTypeInterface__Marker <em>Anonymous Class Type Interface Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.AnonymousClassTypeInterface__Marker
	 * @generated
	 */
	public Adapter createAnonymousClassTypeInterface__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker <em>Array Initializer Ignore Expressions Edge Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker
	 * @generated
	 */
	public Adapter createArrayInitializerIgnoreExpressionsEdge__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ArrayTypeToClass__Marker <em>Array Type To Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ArrayTypeToClass__Marker
	 * @generated
	 */
	public Adapter createArrayTypeToClass__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.Class__Marker <em>Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.Class__Marker
	 * @generated
	 */
	public Adapter createClass__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ClassExtendsClass__Marker <em>Class Extends Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ClassExtendsClass__Marker
	 * @generated
	 */
	public Adapter createClassExtendsClass__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ClassImplementsInterface__Marker <em>Class Implements Interface Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ClassImplementsInterface__Marker
	 * @generated
	 */
	public Adapter createClassImplementsInterface__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ClassInAnonymous__Marker <em>Class In Anonymous Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ClassInAnonymous__Marker
	 * @generated
	 */
	public Adapter createClassInAnonymous__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker <em>Class Inner Anon Class Member Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker
	 * @generated
	 */
	public Adapter createClassInnerAnonClassMember__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ClassInnerClassMember__Marker <em>Class Inner Class Member Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker
	 * @generated
	 */
	public Adapter createClassInnerClassMember__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ClassInstanceCreation__Marker <em>Class Instance Creation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ClassInstanceCreation__Marker
	 * @generated
	 */
	public Adapter createClassInstanceCreation__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ConstructorDefinition__Marker <em>Constructor Definition Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ConstructorDefinition__Marker
	 * @generated
	 */
	public Adapter createConstructorDefinition__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ConstructorInvocation__Marker <em>Constructor Invocation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ConstructorInvocation__Marker
	 * @generated
	 */
	public Adapter createConstructorInvocation__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.Enum__Marker <em>Enum Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.Enum__Marker
	 * @generated
	 */
	public Adapter createEnum__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.EnumInAnonymous__Marker <em>Enum In Anonymous Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.EnumInAnonymous__Marker
	 * @generated
	 */
	public Adapter createEnumInAnonymous__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.FieldAccessRead__Marker <em>Field Access Read Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.FieldAccessRead__Marker
	 * @generated
	 */
	public Adapter createFieldAccessRead__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.FieldAccessReadWrite__Marker <em>Field Access Read Write Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker
	 * @generated
	 */
	public Adapter createFieldAccessReadWrite__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.FieldAccessWrite__Marker <em>Field Access Write Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.FieldAccessWrite__Marker
	 * @generated
	 */
	public Adapter createFieldAccessWrite__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.FieldDefinition__Marker <em>Field Definition Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.FieldDefinition__Marker
	 * @generated
	 */
	public Adapter createFieldDefinition__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.FieldName__Marker <em>Field Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.FieldName__Marker
	 * @generated
	 */
	public Adapter createFieldName__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.FieldSignature__Marker <em>Field Signature Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.FieldSignature__Marker
	 * @generated
	 */
	public Adapter createFieldSignature__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.FieldType__Marker <em>Field Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.FieldType__Marker
	 * @generated
	 */
	public Adapter createFieldType__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.Flow__Marker <em>Flow Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.Flow__Marker
	 * @generated
	 */
	public Adapter createFlow__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.IncomingFlow__Marker <em>Incoming Flow Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.IncomingFlow__Marker
	 * @generated
	 */
	public Adapter createIncomingFlow__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.Interface__Marker <em>Interface Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.Interface__Marker
	 * @generated
	 */
	public Adapter createInterface__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.InterfaceExtendsInterface__Marker <em>Interface Extends Interface Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.InterfaceExtendsInterface__Marker
	 * @generated
	 */
	public Adapter createInterfaceExtendsInterface__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.InterfaceInAnonymous__Marker <em>Interface In Anonymous Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.InterfaceInAnonymous__Marker
	 * @generated
	 */
	public Adapter createInterfaceInAnonymous__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.InterfaceMember__Marker <em>Interface Member Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.InterfaceMember__Marker
	 * @generated
	 */
	public Adapter createInterfaceMember__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker <em>Link Definition To Anonymous Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.LinkDefinitionToAnonymous__Marker
	 * @generated
	 */
	public Adapter createLinkDefinitionToAnonymous__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.LinkDefinitionToType__Marker <em>Link Definition To Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.LinkDefinitionToType__Marker
	 * @generated
	 */
	public Adapter createLinkDefinitionToType__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker <em>Member In Annotation Visibility Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MemberInAnnotationVisibility__Marker
	 * @generated
	 */
	public Adapter createMemberInAnnotationVisibility__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MemberInClassVisibility__Marker <em>Member In Class Visibility Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MemberInClassVisibility__Marker
	 * @generated
	 */
	public Adapter createMemberInClassVisibility__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MemberInEnumVisibility__Marker <em>Member In Enum Visibility Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MemberInEnumVisibility__Marker
	 * @generated
	 */
	public Adapter createMemberInEnumVisibility__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MethodDefinition__Marker <em>Method Definition Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MethodDefinition__Marker
	 * @generated
	 */
	public Adapter createMethodDefinition__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MethodInvocation__Marker <em>Method Invocation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MethodInvocation__Marker
	 * @generated
	 */
	public Adapter createMethodInvocation__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MethodInvocationRecursive__Marker <em>Method Invocation Recursive Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MethodInvocationRecursive__Marker
	 * @generated
	 */
	public Adapter createMethodInvocationRecursive__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MethodInvocationStaticType__Marker <em>Method Invocation Static Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MethodInvocationStaticType__Marker
	 * @generated
	 */
	public Adapter createMethodInvocationStaticType__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MethodName__Marker <em>Method Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MethodName__Marker
	 * @generated
	 */
	public Adapter createMethodName__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MethodOverriding__Marker <em>Method Overriding Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MethodOverriding__Marker
	 * @generated
	 */
	public Adapter createMethodOverriding__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MethodParameter__Marker <em>Method Parameter Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MethodParameter__Marker
	 * @generated
	 */
	public Adapter createMethodParameter__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MethodParameterLink__Marker <em>Method Parameter Link Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MethodParameterLink__Marker
	 * @generated
	 */
	public Adapter createMethodParameterLink__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MethodParameterLinkFirst__Marker <em>Method Parameter Link First Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MethodParameterLinkFirst__Marker
	 * @generated
	 */
	public Adapter createMethodParameterLinkFirst__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MethodParameterType__Marker <em>Method Parameter Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MethodParameterType__Marker
	 * @generated
	 */
	public Adapter createMethodParameterType__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.MethodSignature__Marker <em>Method Signature Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.MethodSignature__Marker
	 * @generated
	 */
	public Adapter createMethodSignature__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ModelToPg__Marker <em>Model To Pg Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ModelToPg__Marker
	 * @generated
	 */
	public Adapter createModelToPg__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.NestedClassInType__Marker <em>Nested Class In Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.NestedClassInType__Marker
	 * @generated
	 */
	public Adapter createNestedClassInType__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.NestedEnum__Marker <em>Nested Enum Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.NestedEnum__Marker
	 * @generated
	 */
	public Adapter createNestedEnum__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.NestedInterfaceInType__Marker <em>Nested Interface In Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker
	 * @generated
	 */
	public Adapter createNestedInterfaceInType__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.OutgoingFlow__Marker <em>Outgoing Flow Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.OutgoingFlow__Marker
	 * @generated
	 */
	public Adapter createOutgoingFlow__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.PackageToPGPackage__Marker <em>Package To PG Package Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.PackageToPGPackage__Marker
	 * @generated
	 */
	public Adapter createPackageToPGPackage__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ParameterizedTypeToClass__Marker <em>Parameterized Type To Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ParameterizedTypeToClass__Marker
	 * @generated
	 */
	public Adapter createParameterizedTypeToClass__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.PrimitiveTypeIsBoolean__Marker <em>Primitive Type Is Boolean Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.PrimitiveTypeIsBoolean__Marker
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsBoolean__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.PrimitiveTypeIsByte__Marker <em>Primitive Type Is Byte Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.PrimitiveTypeIsByte__Marker
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsByte__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.PrimitiveTypeIsChar__Marker <em>Primitive Type Is Char Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.PrimitiveTypeIsChar__Marker
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsChar__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.PrimitiveTypeIsDouble__Marker <em>Primitive Type Is Double Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.PrimitiveTypeIsDouble__Marker
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsDouble__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker <em>Primitive Type Is Float Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.PrimitiveTypeIsFloat__Marker
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsFloat__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.PrimitiveTypeIsInt__Marker <em>Primitive Type Is Int Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.PrimitiveTypeIsInt__Marker
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsInt__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.PrimitiveTypeIsLong__Marker <em>Primitive Type Is Long Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.PrimitiveTypeIsLong__Marker
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsLong__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.PrimitiveTypeIsShort__Marker <em>Primitive Type Is Short Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.PrimitiveTypeIsShort__Marker
	 * @generated
	 */
	public Adapter createPrimitiveTypeIsShort__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.PrimitiveTypesIsVoid__Marker <em>Primitive Types Is Void Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.PrimitiveTypesIsVoid__Marker
	 * @generated
	 */
	public Adapter createPrimitiveTypesIsVoid__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.ReturnType__Marker <em>Return Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.ReturnType__Marker
	 * @generated
	 */
	public Adapter createReturnType__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.SignatureReturnType__Marker <em>Signature Return Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.SignatureReturnType__Marker
	 * @generated
	 */
	public Adapter createSignatureReturnType__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.SubPackageToPGPackage__Marker <em>Sub Package To PG Package Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.SubPackageToPGPackage__Marker
	 * @generated
	 */
	public Adapter createSubPackageToPGPackage__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.SuperConstructorInvocation__Marker <em>Super Constructor Invocation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.SuperConstructorInvocation__Marker
	 * @generated
	 */
	public Adapter createSuperConstructorInvocation__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.SuperMethodInvocation__Marker <em>Super Method Invocation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.SuperMethodInvocation__Marker
	 * @generated
	 */
	public Adapter createSuperMethodInvocation__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.SyntethicMethod__Marker <em>Syntethic Method Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.SyntethicMethod__Marker
	 * @generated
	 */
	public Adapter createSyntethicMethod__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.TextAnnotations__Marker <em>Text Annotations Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.TextAnnotations__Marker
	 * @generated
	 */
	public Adapter createTextAnnotations__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.TypeParameter__Marker <em>Type Parameter Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.TypeParameter__Marker
	 * @generated
	 */
	public Adapter createTypeParameter__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.TypesOrphaned__Marker <em>Types Orphaned Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.TypesOrphaned__Marker
	 * @generated
	 */
	public Adapter createTypesOrphaned__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.TypesVisibility__Marker <em>Types Visibility Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.TypesVisibility__Marker
	 * @generated
	 */
	public Adapter createTypesVisibility__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker <em>Unresolved Type Declaration Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.UnresolvedTypeDeclaration__Marker
	 * @generated
	 */
	public Adapter createUnresolvedTypeDeclaration__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModiscoTGG.VariableDeclarationFragment__Marker <em>Variable Declaration Fragment Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModiscoTGG.VariableDeclarationFragment__Marker
	 * @generated
	 */
	public Adapter createVariableDeclarationFragment__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link runtime.TGGRuleApplication <em>TGG Rule Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see runtime.TGGRuleApplication
	 * @generated
	 */
	public Adapter createTGGRuleApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModiscoTGGAdapterFactory
