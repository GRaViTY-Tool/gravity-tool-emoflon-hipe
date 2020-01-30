/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ModiscoTGGFactory;
import ModiscoTGG.ModiscoTGGPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.eclipse.modisco.java.emf.impl.JavaPackageImpl;
import org.gravity.modisco.ModiscoPackage;
import org.gravity.modisco.impl.ModiscoPackageImpl;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.annotations.AnnotationsPackage;
import org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl;
import org.gravity.typegraph.basic.containers.ContainersPackage;
import org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl;
import org.gravity.typegraph.basic.impl.BasicPackageImpl;

import runtime.RuntimePackage;

import runtime.impl.RuntimePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModiscoTGGPackageImpl extends EPackageImpl implements ModiscoTGGPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "ModiscoTGG.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralToTBoolNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberLiteralToTNumberNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralToTTextNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classLiteralToClassNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDeclarationToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageToTPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelToTypeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDeclarationToTInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mDefinitionToTMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessToTAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassDeclarationToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMethodNameToTMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEntryToTParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSignatureToTSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astNodeToTAnnotatableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeToTAbstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFieldNameToTFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineCommentToTTextAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSingleVariableAccessToTAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationToTAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedTypeDeclarationToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierToTClassEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierToTFieldEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierToTMethodEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierToAbstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mModifierToTModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSyntethicMethodToTSyntethicMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValuePairToTAnnotationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticTypeToAccessStaticTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFlowToTFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mAbstractFlowElementToTAbstractFlowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodInvocationToTAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationFragmentToTFieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberKey__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueAnnotation__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueAnnotationArray__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueBoolean__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueBooleanArray__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueClass__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueClassArray__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueNumber__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueNumberArray__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueString__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueStringArray__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationOnBodyDeclaration__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationType__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeAccess__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeInAnonymous__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeNested__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClass__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassTypeClass__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassTypeInterface__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitializerIgnoreExpressionsEdge__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeToClass__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classExtendsClass__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classImplementsInterface__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInAnonymous__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInnerAnonClassMember__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInnerClassMember__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInstanceCreation__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorDefinition__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorInvocation__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enum__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumInAnonymous__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessRead__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessReadWrite__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessWrite__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDefinition__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldName__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldSignature__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldType__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flow__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingFlow__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceExtendsInterface__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceInAnonymous__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceMember__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkDefinitionToAnonymous__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkDefinitionToType__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberInAnnotationVisibility__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberInClassVisibility__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberInEnumVisibility__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDefinition__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocation__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocationRecursive__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocationStaticType__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodName__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodOverriding__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameter__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterLink__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterLinkFirst__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterType__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodSignature__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelToPg__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedClassInType__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedEnum__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedInterfaceInType__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingFlow__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageToPGPackage__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedTypeToClass__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsBoolean__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsByte__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsChar__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsDouble__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsFloat__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsInt__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsLong__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsShort__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypesIsVoid__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnType__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureReturnType__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPackageToPGPackage__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superConstructorInvocation__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superMethodInvocation__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntethicMethod__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAnnotations__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameter__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesOrphaned__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesVisibility__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedTypeDeclaration__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationFragment__MarkerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ModiscoTGG.ModiscoTGGPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModiscoTGGPackageImpl() {
		super(eNS_URI, ModiscoTGGFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModiscoTGGPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated NOT
	 */
	public static ModiscoTGGPackage init() {
		if (isInited)
			return (ModiscoTGGPackage) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModiscoTGGPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModiscoTGGPackageImpl theModiscoTGGPackage = registeredModiscoTGGPackage instanceof ModiscoTGGPackageImpl
				? (ModiscoTGGPackageImpl) registeredModiscoTGGPackage
				: new ModiscoTGGPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl) (registeredPackage instanceof JavaPackageImpl
				? registeredPackage
				: JavaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl) (registeredPackage instanceof AnnotationsPackageImpl
				? registeredPackage
				: AnnotationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl) (registeredPackage instanceof BasicPackageImpl
				? registeredPackage
				: BasicPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI);
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl) (registeredPackage instanceof ContainersPackageImpl
				? registeredPackage
				: ContainersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		AnnotationsPackageImpl theAnnotationsPackage_1 = (AnnotationsPackageImpl) (registeredPackage instanceof AnnotationsPackageImpl
				? registeredPackage
				: AnnotationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI);
		ModiscoPackageImpl theModiscoPackage = (ModiscoPackageImpl) (registeredPackage instanceof ModiscoPackageImpl
				? registeredPackage
				: ModiscoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl) (registeredPackage instanceof RuntimePackageImpl
				? registeredPackage
				: RuntimePackage.eINSTANCE);

		// Load packages
		theModiscoTGGPackage.loadPackage();

		// Create package meta-data objects
		//		theJavaPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theContainersPackage.createPackageContents();
		theAnnotationsPackage_1.createPackageContents();
		theModiscoPackage.createPackageContents();
		theRuntimePackage.createPackageContents();

		// Initialize created meta-data
		//		theJavaPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();
		theAnnotationsPackage_1.initializePackageContents();
		theModiscoPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();

		// Fix loaded packages
		theModiscoTGGPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theModiscoTGGPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModiscoTGGPackage.eNS_URI, theModiscoTGGPackage);
		return theModiscoTGGPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanLiteralToTBoolNode() {
		if (booleanLiteralToTBoolNodeEClass == null) {
			booleanLiteralToTBoolNodeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return booleanLiteralToTBoolNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanLiteralToTBoolNode_Source() {
		return (EReference) getBooleanLiteralToTBoolNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanLiteralToTBoolNode_Target() {
		return (EReference) getBooleanLiteralToTBoolNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberLiteralToTNumberNode() {
		if (numberLiteralToTNumberNodeEClass == null) {
			numberLiteralToTNumberNodeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(1);
		}
		return numberLiteralToTNumberNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumberLiteralToTNumberNode_Source() {
		return (EReference) getNumberLiteralToTNumberNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumberLiteralToTNumberNode_Target() {
		return (EReference) getNumberLiteralToTNumberNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringLiteralToTTextNode() {
		if (stringLiteralToTTextNodeEClass == null) {
			stringLiteralToTTextNodeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return stringLiteralToTTextNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStringLiteralToTTextNode_Source() {
		return (EReference) getStringLiteralToTTextNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStringLiteralToTTextNode_Target() {
		return (EReference) getStringLiteralToTTextNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassLiteralToClassNode() {
		if (classLiteralToClassNodeEClass == null) {
			classLiteralToClassNodeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return classLiteralToClassNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassLiteralToClassNode_Source() {
		return (EReference) getClassLiteralToClassNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassLiteralToClassNode_Target() {
		return (EReference) getClassLiteralToClassNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassDeclarationToTClass() {
		if (classDeclarationToTClassEClass == null) {
			classDeclarationToTClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return classDeclarationToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDeclarationToTClass_Source() {
		return (EReference) getClassDeclarationToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDeclarationToTClass_Target() {
		return (EReference) getClassDeclarationToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageToTPackage() {
		if (packageToTPackageEClass == null) {
			packageToTPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return packageToTPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageToTPackage_Source() {
		return (EReference) getPackageToTPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageToTPackage_Target() {
		return (EReference) getPackageToTPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelToTypeGraph() {
		if (modelToTypeGraphEClass == null) {
			modelToTypeGraphEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return modelToTypeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelToTypeGraph_Source() {
		return (EReference) getModelToTypeGraph().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelToTypeGraph_Target() {
		return (EReference) getModelToTypeGraph().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceDeclarationToTInterface() {
		if (interfaceDeclarationToTInterfaceEClass == null) {
			interfaceDeclarationToTInterfaceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(7);
		}
		return interfaceDeclarationToTInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceDeclarationToTInterface_Source() {
		return (EReference) getInterfaceDeclarationToTInterface().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceDeclarationToTInterface_Target() {
		return (EReference) getInterfaceDeclarationToTInterface().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDefinitionToTMember() {
		if (mDefinitionToTMemberEClass == null) {
			mDefinitionToTMemberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return mDefinitionToTMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDefinitionToTMember_Source() {
		return (EReference) getMDefinitionToTMember().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDefinitionToTMember_Target() {
		return (EReference) getMDefinitionToTMember().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldAccessToTAccess() {
		if (fieldAccessToTAccessEClass == null) {
			fieldAccessToTAccessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return fieldAccessToTAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessToTAccess_Source() {
		return (EReference) getFieldAccessToTAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessToTAccess_Target() {
		return (EReference) getFieldAccessToTAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeToTClass() {
		if (primitiveTypeToTClassEClass == null) {
			primitiveTypeToTClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return primitiveTypeToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeToTClass_Source() {
		return (EReference) getPrimitiveTypeToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeToTClass_Target() {
		return (EReference) getPrimitiveTypeToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClassDeclarationToTClass() {
		if (anonymousClassDeclarationToTClassEClass == null) {
			anonymousClassDeclarationToTClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(11);
		}
		return anonymousClassDeclarationToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassDeclarationToTClass_Source() {
		return (EReference) getAnonymousClassDeclarationToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassDeclarationToTClass_Target() {
		return (EReference) getAnonymousClassDeclarationToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMMethodNameToTMethod() {
		if (mMethodNameToTMethodEClass == null) {
			mMethodNameToTMethodEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(12);
		}
		return mMethodNameToTMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMMethodNameToTMethod_Source() {
		return (EReference) getMMethodNameToTMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMMethodNameToTMethod_Target() {
		return (EReference) getMMethodNameToTMethod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMEntryToTParameter() {
		if (mEntryToTParameterEClass == null) {
			mEntryToTParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(13);
		}
		return mEntryToTParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMEntryToTParameter_Source() {
		return (EReference) getMEntryToTParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMEntryToTParameter_Target() {
		return (EReference) getMEntryToTParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMSignatureToTSignature() {
		if (mSignatureToTSignatureEClass == null) {
			mSignatureToTSignatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(14);
		}
		return mSignatureToTSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMSignatureToTSignature_Source() {
		return (EReference) getMSignatureToTSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMSignatureToTSignature_Target() {
		return (EReference) getMSignatureToTSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getASTNodeToTAnnotatable() {
		if (astNodeToTAnnotatableEClass == null) {
			astNodeToTAnnotatableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(15);
		}
		return astNodeToTAnnotatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getASTNodeToTAnnotatable_Source() {
		return (EReference) getASTNodeToTAnnotatable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getASTNodeToTAnnotatable_Target() {
		return (EReference) getASTNodeToTAnnotatable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeToTAbstractType() {
		if (typeToTAbstractTypeEClass == null) {
			typeToTAbstractTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(16);
		}
		return typeToTAbstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeToTAbstractType_Source() {
		return (EReference) getTypeToTAbstractType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeToTAbstractType_Target() {
		return (EReference) getTypeToTAbstractType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMFieldNameToTField() {
		if (mFieldNameToTFieldEClass == null) {
			mFieldNameToTFieldEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(17);
		}
		return mFieldNameToTFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMFieldNameToTField_Source() {
		return (EReference) getMFieldNameToTField().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMFieldNameToTField_Target() {
		return (EReference) getMFieldNameToTField().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineCommentToTTextAnnotation() {
		if (lineCommentToTTextAnnotationEClass == null) {
			lineCommentToTTextAnnotationEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(18);
		}
		return lineCommentToTTextAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineCommentToTTextAnnotation_Source() {
		return (EReference) getLineCommentToTTextAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineCommentToTTextAnnotation_Target() {
		return (EReference) getLineCommentToTTextAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMSingleVariableAccessToTAccess() {
		if (mSingleVariableAccessToTAccessEClass == null) {
			mSingleVariableAccessToTAccessEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(19);
		}
		return mSingleVariableAccessToTAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMSingleVariableAccessToTAccess_Source() {
		return (EReference) getMSingleVariableAccessToTAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMSingleVariableAccessToTAccess_Target() {
		return (EReference) getMSingleVariableAccessToTAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationToTAnnotation() {
		if (annotationToTAnnotationEClass == null) {
			annotationToTAnnotationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(20);
		}
		return annotationToTAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationToTAnnotation_Source() {
		return (EReference) getAnnotationToTAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationToTAnnotation_Target() {
		return (EReference) getAnnotationToTAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameterToTClass() {
		if (typeParameterToTClassEClass == null) {
			typeParameterToTClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(21);
		}
		return typeParameterToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameterToTClass_Source() {
		return (EReference) getTypeParameterToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameterToTClass_Target() {
		return (EReference) getTypeParameterToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedTypeDeclarationToTClass() {
		if (unresolvedTypeDeclarationToTClassEClass == null) {
			unresolvedTypeDeclarationToTClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(22);
		}
		return unresolvedTypeDeclarationToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedTypeDeclarationToTClass_Source() {
		return (EReference) getUnresolvedTypeDeclarationToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedTypeDeclarationToTClass_Target() {
		return (EReference) getUnresolvedTypeDeclarationToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifierToTClassEntity() {
		if (modifierToTClassEntityEClass == null) {
			modifierToTClassEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(23);
		}
		return modifierToTClassEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToTClassEntity_Source() {
		return (EReference) getModifierToTClassEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToTClassEntity_Target() {
		return (EReference) getModifierToTClassEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifierToTFieldEntity() {
		if (modifierToTFieldEntityEClass == null) {
			modifierToTFieldEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(24);
		}
		return modifierToTFieldEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToTFieldEntity_Source() {
		return (EReference) getModifierToTFieldEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToTFieldEntity_Target() {
		return (EReference) getModifierToTFieldEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifierToTMethodEntity() {
		if (modifierToTMethodEntityEClass == null) {
			modifierToTMethodEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(25);
		}
		return modifierToTMethodEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToTMethodEntity_Source() {
		return (EReference) getModifierToTMethodEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToTMethodEntity_Target() {
		return (EReference) getModifierToTMethodEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifierToAbstractType() {
		if (modifierToAbstractTypeEClass == null) {
			modifierToAbstractTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(26);
		}
		return modifierToAbstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToAbstractType_Source() {
		return (EReference) getModifierToAbstractType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToAbstractType_Target() {
		return (EReference) getModifierToAbstractType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMModifierToTModifier() {
		if (mModifierToTModifierEClass == null) {
			mModifierToTModifierEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(27);
		}
		return mModifierToTModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMModifierToTModifier_Source() {
		return (EReference) getMModifierToTModifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMModifierToTModifier_Target() {
		return (EReference) getMModifierToTModifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMSyntethicMethodToTSyntethicMethod() {
		if (mSyntethicMethodToTSyntethicMethodEClass == null) {
			mSyntethicMethodToTSyntethicMethodEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(28);
		}
		return mSyntethicMethodToTSyntethicMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMSyntethicMethodToTSyntethicMethod_Source() {
		return (EReference) getMSyntethicMethodToTSyntethicMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMSyntethicMethodToTSyntethicMethod_Target() {
		return (EReference) getMSyntethicMethodToTSyntethicMethod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValuePairToTAnnotationValue() {
		if (annotationMemberValuePairToTAnnotationValueEClass == null) {
			annotationMemberValuePairToTAnnotationValueEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(29);
		}
		return annotationMemberValuePairToTAnnotationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValuePairToTAnnotationValue_Source() {
		return (EReference) getAnnotationMemberValuePairToTAnnotationValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValuePairToTAnnotationValue_Target() {
		return (EReference) getAnnotationMemberValuePairToTAnnotationValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaticTypeToAccessStaticType() {
		if (staticTypeToAccessStaticTypeEClass == null) {
			staticTypeToAccessStaticTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(30);
		}
		return staticTypeToAccessStaticTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaticTypeToAccessStaticType_Source() {
		return (EReference) getStaticTypeToAccessStaticType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaticTypeToAccessStaticType_Target() {
		return (EReference) getStaticTypeToAccessStaticType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMFlowToTFlow() {
		if (mFlowToTFlowEClass == null) {
			mFlowToTFlowEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(31);
		}
		return mFlowToTFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMFlowToTFlow_Source() {
		return (EReference) getMFlowToTFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMFlowToTFlow_Target() {
		return (EReference) getMFlowToTFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMAbstractFlowElementToTAbstractFlowElement() {
		if (mAbstractFlowElementToTAbstractFlowElementEClass == null) {
			mAbstractFlowElementToTAbstractFlowElementEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(32);
		}
		return mAbstractFlowElementToTAbstractFlowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMAbstractFlowElementToTAbstractFlowElement_Source() {
		return (EReference) getMAbstractFlowElementToTAbstractFlowElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMAbstractFlowElementToTAbstractFlowElement_Target() {
		return (EReference) getMAbstractFlowElementToTAbstractFlowElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodInvocationToTAccess() {
		if (abstractMethodInvocationToTAccessEClass == null) {
			abstractMethodInvocationToTAccessEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(33);
		}
		return abstractMethodInvocationToTAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodInvocationToTAccess_Source() {
		return (EReference) getAbstractMethodInvocationToTAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodInvocationToTAccess_Target() {
		return (EReference) getAbstractMethodInvocationToTAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationFragmentToTFieldDefinition() {
		if (variableDeclarationFragmentToTFieldDefinitionEClass == null) {
			variableDeclarationFragmentToTFieldDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(34);
		}
		return variableDeclarationFragmentToTFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationFragmentToTFieldDefinition_Source() {
		return (EReference) getVariableDeclarationFragmentToTFieldDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationFragmentToTFieldDefinition_Target() {
		return (EReference) getVariableDeclarationFragmentToTFieldDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberKey__Marker() {
		if (annotationMemberKey__MarkerEClass == null) {
			annotationMemberKey__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(35);
		}
		return annotationMemberKey__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberKey__Marker_CONTEXT__SRC__Annotation() {
		return (EReference) getAnnotationMemberKey__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberKey__Marker_CREATE__SRC__mValue() {
		return (EReference) getAnnotationMemberKey__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberKey__Marker_CONTEXT__TRG__tAnnotation() {
		return (EReference) getAnnotationMemberKey__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberKey__Marker_CREATE__TRG__tAnnotationValue() {
		return (EReference) getAnnotationMemberKey__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberKey__Marker_CREATE__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return (EReference) getAnnotationMemberKey__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberKey__Marker_CONTEXT__CORR__AnnotationToTAnnotation() {
		return (EReference) getAnnotationMemberKey__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueAnnotation__Marker() {
		if (annotationMemberValueAnnotation__MarkerEClass == null) {
			annotationMemberValueAnnotation__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(36);
		}
		return annotationMemberValueAnnotation__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotation__Marker_CONTEXT__SRC__AnnotationValue() {
		return (EReference) getAnnotationMemberValueAnnotation__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotation__Marker_CREATE__SRC__mValue() {
		return (EReference) getAnnotationMemberValueAnnotation__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotation__Marker_CONTEXT__TRG__tAnnotationValue() {
		return (EReference) getAnnotationMemberValueAnnotation__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotation__Marker_CREATE__TRG__tValue() {
		return (EReference) getAnnotationMemberValueAnnotation__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotation__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return (EReference) getAnnotationMemberValueAnnotation__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotation__Marker_CREATE__CORR__mTypeToTType() {
		return (EReference) getAnnotationMemberValueAnnotation__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueAnnotationArray__Marker() {
		if (annotationMemberValueAnnotationArray__MarkerEClass == null) {
			annotationMemberValueAnnotationArray__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(37);
		}
		return annotationMemberValueAnnotationArray__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotationArray__Marker_CONTEXT__SRC__AnnotationValue() {
		return (EReference) getAnnotationMemberValueAnnotationArray__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotationArray__Marker_CREATE__SRC__mArray() {
		return (EReference) getAnnotationMemberValueAnnotationArray__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotationArray__Marker_CREATE__SRC__mValue() {
		return (EReference) getAnnotationMemberValueAnnotationArray__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotationArray__Marker_CONTEXT__TRG__tAnnotationValue() {
		return (EReference) getAnnotationMemberValueAnnotationArray__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotationArray__Marker_CREATE__TRG__tValue() {
		return (EReference) getAnnotationMemberValueAnnotationArray__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotationArray__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return (EReference) getAnnotationMemberValueAnnotationArray__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueAnnotationArray__Marker_CREATE__CORR__mTypeToTType() {
		return (EReference) getAnnotationMemberValueAnnotationArray__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueBoolean__Marker() {
		if (annotationMemberValueBoolean__MarkerEClass == null) {
			annotationMemberValueBoolean__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(38);
		}
		return annotationMemberValueBoolean__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBoolean__Marker_CONTEXT__SRC__AnnotationValue() {
		return (EReference) getAnnotationMemberValueBoolean__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBoolean__Marker_CREATE__SRC__mValue() {
		return (EReference) getAnnotationMemberValueBoolean__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBoolean__Marker_CONTEXT__TRG__tAnnotationValue() {
		return (EReference) getAnnotationMemberValueBoolean__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBoolean__Marker_CREATE__TRG__tValue() {
		return (EReference) getAnnotationMemberValueBoolean__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBoolean__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return (EReference) getAnnotationMemberValueBoolean__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBoolean__Marker_CREATE__CORR__mValueToTValue() {
		return (EReference) getAnnotationMemberValueBoolean__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueBooleanArray__Marker() {
		if (annotationMemberValueBooleanArray__MarkerEClass == null) {
			annotationMemberValueBooleanArray__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(39);
		}
		return annotationMemberValueBooleanArray__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBooleanArray__Marker_CONTEXT__SRC__AnnotationValue() {
		return (EReference) getAnnotationMemberValueBooleanArray__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBooleanArray__Marker_CREATE__SRC__mArray() {
		return (EReference) getAnnotationMemberValueBooleanArray__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBooleanArray__Marker_CREATE__SRC__mValue() {
		return (EReference) getAnnotationMemberValueBooleanArray__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBooleanArray__Marker_CONTEXT__TRG__tAnnotationValue() {
		return (EReference) getAnnotationMemberValueBooleanArray__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBooleanArray__Marker_CREATE__TRG__tValue() {
		return (EReference) getAnnotationMemberValueBooleanArray__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBooleanArray__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return (EReference) getAnnotationMemberValueBooleanArray__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueBooleanArray__Marker_CREATE__CORR__mValueToTValue() {
		return (EReference) getAnnotationMemberValueBooleanArray__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueClass__Marker() {
		if (annotationMemberValueClass__MarkerEClass == null) {
			annotationMemberValueClass__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(40);
		}
		return annotationMemberValueClass__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClass__Marker_CONTEXT__SRC__AnnotationValue() {
		return (EReference) getAnnotationMemberValueClass__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClass__Marker_CREATE__SRC__mAccess() {
		return (EReference) getAnnotationMemberValueClass__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClass__Marker_CONTEXT__SRC__mType() {
		return (EReference) getAnnotationMemberValueClass__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClass__Marker_CREATE__SRC__mValue() {
		return (EReference) getAnnotationMemberValueClass__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClass__Marker_CONTEXT__TRG__tAnnotationValue() {
		return (EReference) getAnnotationMemberValueClass__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClass__Marker_CONTEXT__TRG__tType() {
		return (EReference) getAnnotationMemberValueClass__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClass__Marker_CREATE__TRG__tValue() {
		return (EReference) getAnnotationMemberValueClass__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClass__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return (EReference) getAnnotationMemberValueClass__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClass__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getAnnotationMemberValueClass__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClass__Marker_CREATE__CORR__mValueToTValue() {
		return (EReference) getAnnotationMemberValueClass__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueClassArray__Marker() {
		if (annotationMemberValueClassArray__MarkerEClass == null) {
			annotationMemberValueClassArray__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(41);
		}
		return annotationMemberValueClassArray__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClassArray__Marker_CONTEXT__SRC__AnnotationValue() {
		return (EReference) getAnnotationMemberValueClassArray__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClassArray__Marker_CREATE__SRC__mAccess() {
		return (EReference) getAnnotationMemberValueClassArray__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClassArray__Marker_CREATE__SRC__mArray() {
		return (EReference) getAnnotationMemberValueClassArray__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClassArray__Marker_CONTEXT__SRC__mType() {
		return (EReference) getAnnotationMemberValueClassArray__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClassArray__Marker_CREATE__SRC__mValue() {
		return (EReference) getAnnotationMemberValueClassArray__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClassArray__Marker_CONTEXT__TRG__tAnnotationValue() {
		return (EReference) getAnnotationMemberValueClassArray__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClassArray__Marker_CONTEXT__TRG__tType() {
		return (EReference) getAnnotationMemberValueClassArray__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClassArray__Marker_CREATE__TRG__tValue() {
		return (EReference) getAnnotationMemberValueClassArray__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClassArray__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return (EReference) getAnnotationMemberValueClassArray__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClassArray__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getAnnotationMemberValueClassArray__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueClassArray__Marker_CREATE__CORR__mValueToTValue() {
		return (EReference) getAnnotationMemberValueClassArray__Marker().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueNumber__Marker() {
		if (annotationMemberValueNumber__MarkerEClass == null) {
			annotationMemberValueNumber__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(42);
		}
		return annotationMemberValueNumber__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumber__Marker_CONTEXT__SRC__AnnotationValue() {
		return (EReference) getAnnotationMemberValueNumber__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumber__Marker_CREATE__SRC__mValue() {
		return (EReference) getAnnotationMemberValueNumber__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumber__Marker_CONTEXT__TRG__tAnnotationValue() {
		return (EReference) getAnnotationMemberValueNumber__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumber__Marker_CREATE__TRG__tValue() {
		return (EReference) getAnnotationMemberValueNumber__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumber__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return (EReference) getAnnotationMemberValueNumber__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumber__Marker_CREATE__CORR__mTypeToTType() {
		return (EReference) getAnnotationMemberValueNumber__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueNumberArray__Marker() {
		if (annotationMemberValueNumberArray__MarkerEClass == null) {
			annotationMemberValueNumberArray__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(43);
		}
		return annotationMemberValueNumberArray__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumberArray__Marker_CONTEXT__SRC__AnnotationValue() {
		return (EReference) getAnnotationMemberValueNumberArray__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumberArray__Marker_CREATE__SRC__mArray() {
		return (EReference) getAnnotationMemberValueNumberArray__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumberArray__Marker_CREATE__SRC__mValue() {
		return (EReference) getAnnotationMemberValueNumberArray__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumberArray__Marker_CONTEXT__TRG__tAnnotationValue() {
		return (EReference) getAnnotationMemberValueNumberArray__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumberArray__Marker_CREATE__TRG__tValue() {
		return (EReference) getAnnotationMemberValueNumberArray__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumberArray__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return (EReference) getAnnotationMemberValueNumberArray__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueNumberArray__Marker_CREATE__CORR__mTypeToTType() {
		return (EReference) getAnnotationMemberValueNumberArray__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueString__Marker() {
		if (annotationMemberValueString__MarkerEClass == null) {
			annotationMemberValueString__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(44);
		}
		return annotationMemberValueString__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueString__Marker_CONTEXT__SRC__AnnotationValue() {
		return (EReference) getAnnotationMemberValueString__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueString__Marker_CREATE__SRC__mValue() {
		return (EReference) getAnnotationMemberValueString__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueString__Marker_CONTEXT__TRG__tAnnotationValue() {
		return (EReference) getAnnotationMemberValueString__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueString__Marker_CREATE__TRG__tValue() {
		return (EReference) getAnnotationMemberValueString__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueString__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return (EReference) getAnnotationMemberValueString__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueString__Marker_CREATE__CORR__mTypeToTType() {
		return (EReference) getAnnotationMemberValueString__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueStringArray__Marker() {
		if (annotationMemberValueStringArray__MarkerEClass == null) {
			annotationMemberValueStringArray__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(45);
		}
		return annotationMemberValueStringArray__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueStringArray__Marker_CONTEXT__SRC__AnnotationValue() {
		return (EReference) getAnnotationMemberValueStringArray__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueStringArray__Marker_CREATE__SRC__mArray() {
		return (EReference) getAnnotationMemberValueStringArray__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueStringArray__Marker_CREATE__SRC__mValue() {
		return (EReference) getAnnotationMemberValueStringArray__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueStringArray__Marker_CONTEXT__TRG__tAnnotationValue() {
		return (EReference) getAnnotationMemberValueStringArray__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueStringArray__Marker_CREATE__TRG__tValue() {
		return (EReference) getAnnotationMemberValueStringArray__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueStringArray__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return (EReference) getAnnotationMemberValueStringArray__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValueStringArray__Marker_CREATE__CORR__mTypeToTType() {
		return (EReference) getAnnotationMemberValueStringArray__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationOnBodyDeclaration__Marker() {
		if (annotationOnBodyDeclaration__MarkerEClass == null) {
			annotationOnBodyDeclaration__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(46);
		}
		return annotationOnBodyDeclaration__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationOnBodyDeclaration__Marker_CREATE__SRC__Annotation() {
		return (EReference) getAnnotationOnBodyDeclaration__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationOnBodyDeclaration__Marker_CONTEXT__SRC__astNode() {
		return (EReference) getAnnotationOnBodyDeclaration__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationOnBodyDeclaration__Marker_CONTEXT__TRG__tAnnotable() {
		return (EReference) getAnnotationOnBodyDeclaration__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationOnBodyDeclaration__Marker_CREATE__TRG__tAnnotation() {
		return (EReference) getAnnotationOnBodyDeclaration__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationOnBodyDeclaration__Marker_CREATE__CORR__AnnotationToTAnnotation() {
		return (EReference) getAnnotationOnBodyDeclaration__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationOnBodyDeclaration__Marker_CONTEXT__CORR__aSTNodeToTAnnotable() {
		return (EReference) getAnnotationOnBodyDeclaration__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationType__Marker() {
		if (annotationType__MarkerEClass == null) {
			annotationType__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(47);
		}
		return annotationType__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType__Marker_CONTEXT__SRC__mPackage() {
		return (EReference) getAnnotationType__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType__Marker_CREATE__SRC__mType() {
		return (EReference) getAnnotationType__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType__Marker_CONTEXT__TRG__pg() {
		return (EReference) getAnnotationType__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType__Marker_CONTEXT__TRG__tPackage() {
		return (EReference) getAnnotationType__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType__Marker_CREATE__TRG__tType() {
		return (EReference) getAnnotationType__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType__Marker_CREATE__CORR__mBodyToTAnnotation() {
		return (EReference) getAnnotationType__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType__Marker_CONTEXT__CORR__mPackageToTPackage() {
		return (EReference) getAnnotationType__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType__Marker_CREATE__CORR__mTypeToTType() {
		return (EReference) getAnnotationType__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeAccess__Marker() {
		if (annotationTypeAccess__MarkerEClass == null) {
			annotationTypeAccess__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(48);
		}
		return annotationTypeAccess__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeAccess__Marker_CONTEXT__SRC__Annotation() {
		return (EReference) getAnnotationTypeAccess__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeAccess__Marker_CONTEXT__SRC__AnnotationType() {
		return (EReference) getAnnotationTypeAccess__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeAccess__Marker_CREATE__SRC__mAccess() {
		return (EReference) getAnnotationTypeAccess__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeAccess__Marker_CONTEXT__TRG__tAnnotation() {
		return (EReference) getAnnotationTypeAccess__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeAccess__Marker_CONTEXT__TRG__tAnnotationType() {
		return (EReference) getAnnotationTypeAccess__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeAccess__Marker_CONTEXT__CORR__AnnotationToTAnnotation() {
		return (EReference) getAnnotationTypeAccess__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeAccess__Marker_CONTEXT__CORR__AnnotationTypeToTAnnotationType() {
		return (EReference) getAnnotationTypeAccess__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeInAnonymous__Marker() {
		if (annotationTypeInAnonymous__MarkerEClass == null) {
			annotationTypeInAnonymous__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(49);
		}
		return annotationTypeInAnonymous__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeInAnonymous__Marker_CONTEXT__SRC__eAnonymousClassDeclaration() {
		return (EReference) getAnnotationTypeInAnonymous__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeInAnonymous__Marker_CREATE__SRC__mNestedType() {
		return (EReference) getAnnotationTypeInAnonymous__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeInAnonymous__Marker_CONTEXT__TRG__pg() {
		return (EReference) getAnnotationTypeInAnonymous__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeInAnonymous__Marker_CONTEXT__TRG__tClass() {
		return (EReference) getAnnotationTypeInAnonymous__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeInAnonymous__Marker_CREATE__TRG__tNestedType() {
		return (EReference) getAnnotationTypeInAnonymous__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeInAnonymous__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass() {
		return (EReference) getAnnotationTypeInAnonymous__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeInAnonymous__Marker_CREATE__CORR__mNestedTypeToTNestedType() {
		return (EReference) getAnnotationTypeInAnonymous__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeInAnonymous__Marker_CREATE__CORR__mbodyToTAnnotatable() {
		return (EReference) getAnnotationTypeInAnonymous__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeNested__Marker() {
		if (annotationTypeNested__MarkerEClass == null) {
			annotationTypeNested__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(50);
		}
		return annotationTypeNested__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeNested__Marker_CREATE__SRC__eNestedType() {
		return (EReference) getAnnotationTypeNested__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeNested__Marker_CONTEXT__SRC__eOuterType() {
		return (EReference) getAnnotationTypeNested__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeNested__Marker_CREATE__TRG__tNestedPackage() {
		return (EReference) getAnnotationTypeNested__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeNested__Marker_CREATE__TRG__tNestedType() {
		return (EReference) getAnnotationTypeNested__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeNested__Marker_CONTEXT__TRG__tOuterPackage() {
		return (EReference) getAnnotationTypeNested__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeNested__Marker_CONTEXT__TRG__tOuterType() {
		return (EReference) getAnnotationTypeNested__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeNested__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getAnnotationTypeNested__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeNested__Marker_CREATE__CORR__eNestedTypeToTNestedType() {
		return (EReference) getAnnotationTypeNested__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeNested__Marker_CONTEXT__CORR__eOuterTypeToTOuterInterface() {
		return (EReference) getAnnotationTypeNested__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeNested__Marker_CREATE__CORR__mBodyToTAnnotation() {
		return (EReference) getAnnotationTypeNested__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClass__Marker() {
		if (anonymousClass__MarkerEClass == null) {
			anonymousClass__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(51);
		}
		return anonymousClass__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClass__Marker_CREATE__SRC__mAnonymous() {
		return (EReference) getAnonymousClass__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClass__Marker_CONTEXT__SRC__mType() {
		return (EReference) getAnonymousClass__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClass__Marker_CONTEXT__TRG__pg() {
		return (EReference) getAnonymousClass__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClass__Marker_CREATE__TRG__tAnonymous() {
		return (EReference) getAnonymousClass__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClass__Marker_CREATE__TRG__tNewPackage() {
		return (EReference) getAnonymousClass__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClass__Marker_CONTEXT__TRG__tPackage() {
		return (EReference) getAnonymousClass__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClass__Marker_CONTEXT__TRG__tType() {
		return (EReference) getAnonymousClass__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClass__Marker_CREATE__CORR__eAnonymousClassDeclarationToTClass() {
		return (EReference) getAnonymousClass__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClass__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getAnonymousClass__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClassTypeClass__Marker() {
		if (anonymousClassTypeClass__MarkerEClass == null) {
			anonymousClassTypeClass__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(52);
		}
		return anonymousClassTypeClass__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeClass__Marker_CONTEXT__SRC__mAnonymous() {
		return (EReference) getAnonymousClassTypeClass__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeClass__Marker_CREATE__SRC__mCreation() {
		return (EReference) getAnonymousClassTypeClass__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeClass__Marker_CONTEXT__SRC__mParent() {
		return (EReference) getAnonymousClassTypeClass__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeClass__Marker_CREATE__SRC__mType() {
		return (EReference) getAnonymousClassTypeClass__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeClass__Marker_CONTEXT__TRG__tClass() {
		return (EReference) getAnonymousClassTypeClass__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeClass__Marker_CONTEXT__TRG__tParent() {
		return (EReference) getAnonymousClassTypeClass__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeClass__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass() {
		return (EReference) getAnonymousClassTypeClass__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeClass__Marker_CONTEXT__CORR__parentToParent() {
		return (EReference) getAnonymousClassTypeClass__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClassTypeInterface__Marker() {
		if (anonymousClassTypeInterface__MarkerEClass == null) {
			anonymousClassTypeInterface__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(53);
		}
		return anonymousClassTypeInterface__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeInterface__Marker_CONTEXT__SRC__mAnonymous() {
		return (EReference) getAnonymousClassTypeInterface__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeInterface__Marker_CREATE__SRC__mCreation() {
		return (EReference) getAnonymousClassTypeInterface__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeInterface__Marker_CONTEXT__SRC__mParent() {
		return (EReference) getAnonymousClassTypeInterface__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeInterface__Marker_CREATE__SRC__mType() {
		return (EReference) getAnonymousClassTypeInterface__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeInterface__Marker_CONTEXT__TRG__tClass() {
		return (EReference) getAnonymousClassTypeInterface__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeInterface__Marker_CONTEXT__TRG__tParent() {
		return (EReference) getAnonymousClassTypeInterface__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeInterface__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass() {
		return (EReference) getAnonymousClassTypeInterface__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassTypeInterface__Marker_CONTEXT__CORR__parentToParent() {
		return (EReference) getAnonymousClassTypeInterface__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayInitializerIgnoreExpressionsEdge__Marker() {
		if (arrayInitializerIgnoreExpressionsEdge__MarkerEClass == null) {
			arrayInitializerIgnoreExpressionsEdge__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(54);
		}
		return arrayInitializerIgnoreExpressionsEdge__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayInitializerIgnoreExpressionsEdge__Marker_CONTEXT__SRC__array() {
		return (EReference) getArrayInitializerIgnoreExpressionsEdge__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayInitializerIgnoreExpressionsEdge__Marker_CONTEXT__SRC__invocation() {
		return (EReference) getArrayInitializerIgnoreExpressionsEdge__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayTypeToClass__Marker() {
		if (arrayTypeToClass__MarkerEClass == null) {
			arrayTypeToClass__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(55);
		}
		return arrayTypeToClass__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayTypeToClass__Marker_CREATE__SRC__eArrayType() {
		return (EReference) getArrayTypeToClass__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayTypeToClass__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getArrayTypeToClass__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayTypeToClass__Marker_CONTEXT__SRC__eType() {
		return (EReference) getArrayTypeToClass__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayTypeToClass__Marker_CREATE__SRC__eTypeAccess() {
		return (EReference) getArrayTypeToClass__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayTypeToClass__Marker_CONTEXT__TRG__tArrayClass() {
		return (EReference) getArrayTypeToClass__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayTypeToClass__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getArrayTypeToClass__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayTypeToClass__Marker_CREATE__CORR__eArrayTypeToTArrayClass() {
		return (EReference) getArrayTypeToClass__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayTypeToClass__Marker_CONTEXT__CORR__eModelToTypeGraph() {
		return (EReference) getArrayTypeToClass__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayTypeToClass__Marker_CONTEXT__CORR__eTypeToTArrayClass() {
		return (EReference) getArrayTypeToClass__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass__Marker() {
		if (class__MarkerEClass == null) {
			class__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(56);
		}
		return class__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass__Marker_CONTEXT__SRC__mPackage() {
		return (EReference) getClass__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass__Marker_CREATE__SRC__mType() {
		return (EReference) getClass__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass__Marker_CONTEXT__TRG__pg() {
		return (EReference) getClass__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass__Marker_CONTEXT__TRG__tPackage() {
		return (EReference) getClass__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass__Marker_CREATE__TRG__tType() {
		return (EReference) getClass__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass__Marker_CREATE__CORR__mBodyToTAnnotation() {
		return (EReference) getClass__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass__Marker_CREATE__CORR__mClassDeclarationToTClass() {
		return (EReference) getClass__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass__Marker_CONTEXT__CORR__mPackageToTPackage() {
		return (EReference) getClass__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass__Marker_CREATE__CORR__mTypeToTType() {
		return (EReference) getClass__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassExtendsClass__Marker() {
		if (classExtendsClass__MarkerEClass == null) {
			classExtendsClass__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(57);
		}
		return classExtendsClass__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassExtendsClass__Marker_CONTEXT__SRC__eClassDeclaration() {
		return (EReference) getClassExtendsClass__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassExtendsClass__Marker_CONTEXT__SRC__eExtendedClass() {
		return (EReference) getClassExtendsClass__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassExtendsClass__Marker_CREATE__SRC__eTypeAccess() {
		return (EReference) getClassExtendsClass__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassExtendsClass__Marker_CONTEXT__TRG__tClass() {
		return (EReference) getClassExtendsClass__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassExtendsClass__Marker_CONTEXT__TRG__tExtendedClass() {
		return (EReference) getClassExtendsClass__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassExtendsClass__Marker_CONTEXT__CORR__eClassDeclarationToTClass() {
		return (EReference) getClassExtendsClass__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassExtendsClass__Marker_CONTEXT__CORR__eExtendedClassToTExtendedClass() {
		return (EReference) getClassExtendsClass__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassImplementsInterface__Marker() {
		if (classImplementsInterface__MarkerEClass == null) {
			classImplementsInterface__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(58);
		}
		return classImplementsInterface__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassImplementsInterface__Marker_CONTEXT__SRC__eClassDeclaration() {
		return (EReference) getClassImplementsInterface__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassImplementsInterface__Marker_CONTEXT__SRC__eSuperInterface() {
		return (EReference) getClassImplementsInterface__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassImplementsInterface__Marker_CREATE__SRC__eTypeAccess() {
		return (EReference) getClassImplementsInterface__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassImplementsInterface__Marker_CONTEXT__TRG__tClass() {
		return (EReference) getClassImplementsInterface__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassImplementsInterface__Marker_CONTEXT__TRG__tSuperInterface() {
		return (EReference) getClassImplementsInterface__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassImplementsInterface__Marker_CONTEXT__CORR__eClassDeclarationToTClass() {
		return (EReference) getClassImplementsInterface__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassImplementsInterface__Marker_CONTEXT__CORR__eSuperInterfaceToTSuperInterface() {
		return (EReference) getClassImplementsInterface__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInAnonymous__Marker() {
		if (classInAnonymous__MarkerEClass == null) {
			classInAnonymous__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(59);
		}
		return classInAnonymous__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInAnonymous__Marker_CONTEXT__SRC__eAnonymousClassDeclaration() {
		return (EReference) getClassInAnonymous__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInAnonymous__Marker_CREATE__SRC__mNestedType() {
		return (EReference) getClassInAnonymous__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInAnonymous__Marker_CONTEXT__TRG__pg() {
		return (EReference) getClassInAnonymous__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInAnonymous__Marker_CONTEXT__TRG__tClass() {
		return (EReference) getClassInAnonymous__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInAnonymous__Marker_CREATE__TRG__tNestedType() {
		return (EReference) getClassInAnonymous__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInAnonymous__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass() {
		return (EReference) getClassInAnonymous__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInAnonymous__Marker_CREATE__CORR__mClassDeclarationToTClass() {
		return (EReference) getClassInAnonymous__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInAnonymous__Marker_CREATE__CORR__mNestedTypeToTNestedType() {
		return (EReference) getClassInAnonymous__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInAnonymous__Marker_CREATE__CORR__mbodyToTAnnotatable() {
		return (EReference) getClassInAnonymous__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInnerAnonClassMember__Marker() {
		if (classInnerAnonClassMember__MarkerEClass == null) {
			classInnerAnonClassMember__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(60);
		}
		return classInnerAnonClassMember__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerAnonClassMember__Marker_CONTEXT__SRC__eOuterClass() {
		return (EReference) getClassInnerAnonClassMember__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerAnonClassMember__Marker_CONTEXT__SRC__mDefinition() {
		return (EReference) getClassInnerAnonClassMember__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerAnonClassMember__Marker_CREATE__SRC__mInnerClass() {
		return (EReference) getClassInnerAnonClassMember__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerAnonClassMember__Marker_CREATE__TRG__tInnerClass() {
		return (EReference) getClassInnerAnonClassMember__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerAnonClassMember__Marker_CREATE__TRG__tInnerPackage() {
		return (EReference) getClassInnerAnonClassMember__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerAnonClassMember__Marker_CONTEXT__TRG__tOuterClass() {
		return (EReference) getClassInnerAnonClassMember__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerAnonClassMember__Marker_CONTEXT__TRG__tOuterPackage() {
		return (EReference) getClassInnerAnonClassMember__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerAnonClassMember__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getClassInnerAnonClassMember__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerAnonClassMember__Marker_CONTEXT__CORR__eOuterClassToTOuterClass() {
		return (EReference) getClassInnerAnonClassMember__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerAnonClassMember__Marker_CREATE__CORR__tInnerClassToTInnerClass() {
		return (EReference) getClassInnerAnonClassMember__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerAnonClassMember__Marker_CREATE__CORR__tInnerTypeToTInnerAbstractType() {
		return (EReference) getClassInnerAnonClassMember__Marker().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInnerClassMember__Marker() {
		if (classInnerClassMember__MarkerEClass == null) {
			classInnerClassMember__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(61);
		}
		return classInnerClassMember__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerClassMember__Marker_CONTEXT__SRC__eOuterClass() {
		return (EReference) getClassInnerClassMember__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerClassMember__Marker_CONTEXT__SRC__mDefinition() {
		return (EReference) getClassInnerClassMember__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerClassMember__Marker_CREATE__SRC__mInnerClass() {
		return (EReference) getClassInnerClassMember__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerClassMember__Marker_CREATE__TRG__tInnerClass() {
		return (EReference) getClassInnerClassMember__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerClassMember__Marker_CREATE__TRG__tInnerPackage() {
		return (EReference) getClassInnerClassMember__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerClassMember__Marker_CONTEXT__TRG__tOuterClass() {
		return (EReference) getClassInnerClassMember__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerClassMember__Marker_CONTEXT__TRG__tOuterPackage() {
		return (EReference) getClassInnerClassMember__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerClassMember__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getClassInnerClassMember__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerClassMember__Marker_CONTEXT__CORR__eOuterClassToTOuterClass() {
		return (EReference) getClassInnerClassMember__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerClassMember__Marker_CREATE__CORR__tInnerClassToTInnerClass() {
		return (EReference) getClassInnerClassMember__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInnerClassMember__Marker_CREATE__CORR__tInnerTypeToTInnerAbstractType() {
		return (EReference) getClassInnerClassMember__Marker().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInstanceCreation__Marker() {
		if (classInstanceCreation__MarkerEClass == null) {
			classInstanceCreation__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(62);
		}
		return classInstanceCreation__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation__Marker_CREATE__SRC__invocation() {
		return (EReference) getClassInstanceCreation__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation__Marker_CONTEXT__SRC__mMember() {
		return (EReference) getClassInstanceCreation__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation__Marker_CONTEXT__SRC__mMethod() {
		return (EReference) getClassInstanceCreation__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation__Marker_CREATE__TRG__tAccess() {
		return (EReference) getClassInstanceCreation__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getClassInstanceCreation__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation__Marker_CONTEXT__TRG__tMethod() {
		return (EReference) getClassInstanceCreation__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation__Marker_CREATE__CORR__invocationToTAccess() {
		return (EReference) getClassInstanceCreation__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation__Marker_CREATE__CORR__mFlowElementToTFlowElement() {
		return (EReference) getClassInstanceCreation__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation__Marker_CONTEXT__CORR__mMemberToTMember() {
		return (EReference) getClassInstanceCreation__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation__Marker_CONTEXT__CORR__mMethodToTMethod() {
		return (EReference) getClassInstanceCreation__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructorDefinition__Marker() {
		if (constructorDefinition__MarkerEClass == null) {
			constructorDefinition__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(63);
		}
		return constructorDefinition__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorDefinition__Marker_CREATE__SRC__mDefinition() {
		return (EReference) getConstructorDefinition__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorDefinition__Marker_CONTEXT__SRC__mSignature() {
		return (EReference) getConstructorDefinition__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorDefinition__Marker_CREATE__TRG__tAnnotation() {
		return (EReference) getConstructorDefinition__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorDefinition__Marker_CREATE__TRG__tDefinition() {
		return (EReference) getConstructorDefinition__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorDefinition__Marker_CONTEXT__TRG__tMethodSignature() {
		return (EReference) getConstructorDefinition__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorDefinition__Marker_CREATE__CORR__mBodyToTAnnotation() {
		return (EReference) getConstructorDefinition__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorDefinition__Marker_CREATE__CORR__mDefinitionToTMember() {
		return (EReference) getConstructorDefinition__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorDefinition__Marker_CREATE__CORR__mFlowElementToTFlowElement() {
		return (EReference) getConstructorDefinition__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorDefinition__Marker_CONTEXT__CORR__mSignatureToTMethodSignature() {
		return (EReference) getConstructorDefinition__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructorInvocation__Marker() {
		if (constructorInvocation__MarkerEClass == null) {
			constructorInvocation__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(64);
		}
		return constructorInvocation__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorInvocation__Marker_CREATE__SRC__invocation() {
		return (EReference) getConstructorInvocation__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorInvocation__Marker_CONTEXT__SRC__mMember() {
		return (EReference) getConstructorInvocation__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorInvocation__Marker_CONTEXT__SRC__mMethod() {
		return (EReference) getConstructorInvocation__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorInvocation__Marker_CREATE__TRG__tAccess() {
		return (EReference) getConstructorInvocation__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorInvocation__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getConstructorInvocation__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorInvocation__Marker_CONTEXT__TRG__tMethod() {
		return (EReference) getConstructorInvocation__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorInvocation__Marker_CREATE__CORR__invocationToTAccess() {
		return (EReference) getConstructorInvocation__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorInvocation__Marker_CREATE__CORR__mFlowElementToTFlowElement() {
		return (EReference) getConstructorInvocation__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorInvocation__Marker_CONTEXT__CORR__mMemberToTMember() {
		return (EReference) getConstructorInvocation__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorInvocation__Marker_CONTEXT__CORR__mMethodToTMethod() {
		return (EReference) getConstructorInvocation__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnum__Marker() {
		if (enum__MarkerEClass == null) {
			enum__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(65);
		}
		return enum__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum__Marker_CONTEXT__SRC__mPackage() {
		return (EReference) getEnum__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum__Marker_CREATE__SRC__mType() {
		return (EReference) getEnum__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum__Marker_CONTEXT__TRG__pg() {
		return (EReference) getEnum__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum__Marker_CREATE__TRG__tAnnotation() {
		return (EReference) getEnum__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum__Marker_CONTEXT__TRG__tPackage() {
		return (EReference) getEnum__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum__Marker_CREATE__TRG__tType() {
		return (EReference) getEnum__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum__Marker_CREATE__CORR__mBodyToTAnnotation() {
		return (EReference) getEnum__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum__Marker_CONTEXT__CORR__mPackageToTPackage() {
		return (EReference) getEnum__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum__Marker_CREATE__CORR__mTypeToTType() {
		return (EReference) getEnum__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumInAnonymous__Marker() {
		if (enumInAnonymous__MarkerEClass == null) {
			enumInAnonymous__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(66);
		}
		return enumInAnonymous__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumInAnonymous__Marker_CONTEXT__SRC__eAnonymousClassDeclaration() {
		return (EReference) getEnumInAnonymous__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumInAnonymous__Marker_CREATE__SRC__mNestedType() {
		return (EReference) getEnumInAnonymous__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumInAnonymous__Marker_CONTEXT__TRG__pg() {
		return (EReference) getEnumInAnonymous__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumInAnonymous__Marker_CREATE__TRG__tAnnotation() {
		return (EReference) getEnumInAnonymous__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumInAnonymous__Marker_CONTEXT__TRG__tClass() {
		return (EReference) getEnumInAnonymous__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumInAnonymous__Marker_CREATE__TRG__tNestedType() {
		return (EReference) getEnumInAnonymous__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumInAnonymous__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass() {
		return (EReference) getEnumInAnonymous__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumInAnonymous__Marker_CREATE__CORR__mNestedTypeToTNestedType() {
		return (EReference) getEnumInAnonymous__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumInAnonymous__Marker_CREATE__CORR__mbodyToTAnnotatable() {
		return (EReference) getEnumInAnonymous__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldAccessRead__Marker() {
		if (fieldAccessRead__MarkerEClass == null) {
			fieldAccessRead__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(67);
		}
		return fieldAccessRead__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CREATE__SRC__mAccess() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CONTEXT__SRC__mField() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CONTEXT__SRC__mMember() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CONTEXT__SRC__mType() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CONTEXT__SRC__varDeclFrag() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CREATE__TRG__tAccess() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CONTEXT__TRG__tField() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CONTEXT__TRG__tType() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CREATE__CORR__mAccessToTAccess() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CREATE__CORR__mFlowOwnerToTFlowOwner() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CONTEXT__CORR__mMemberToTMember() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CONTEXT__CORR__mMethodToTMethod() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessRead__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getFieldAccessRead__Marker().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldAccessReadWrite__Marker() {
		if (fieldAccessReadWrite__MarkerEClass == null) {
			fieldAccessReadWrite__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(68);
		}
		return fieldAccessReadWrite__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CREATE__SRC__mAccess() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CONTEXT__SRC__mField() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CONTEXT__SRC__mMember() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CONTEXT__SRC__mType() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CONTEXT__SRC__varDeclFrag() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CREATE__TRG__tAccess() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CONTEXT__TRG__tField() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CONTEXT__TRG__tType() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CREATE__CORR__mAccessToTAccess() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CREATE__CORR__mFlowOwnerToTFlowOwner() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CONTEXT__CORR__mMemberToTMember() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CONTEXT__CORR__mMethodToTMethod() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessReadWrite__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getFieldAccessReadWrite__Marker().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldAccessWrite__Marker() {
		if (fieldAccessWrite__MarkerEClass == null) {
			fieldAccessWrite__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(69);
		}
		return fieldAccessWrite__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CREATE__SRC__mAccess() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CONTEXT__SRC__mField() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CONTEXT__SRC__mMember() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CONTEXT__SRC__mType() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CONTEXT__SRC__varDeclFrag() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CREATE__TRG__tAccess() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CONTEXT__TRG__tField() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CONTEXT__TRG__tType() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CREATE__CORR__mAccessToTAccess() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CREATE__CORR__mFlowOwnerToTFlowOwner() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CONTEXT__CORR__mMemberToTMember() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CONTEXT__CORR__mMethodToTMethod() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessWrite__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getFieldAccessWrite__Marker().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldDefinition__Marker() {
		if (fieldDefinition__MarkerEClass == null) {
			fieldDefinition__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(70);
		}
		return fieldDefinition__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldDefinition__Marker_CREATE__SRC__mDefinition() {
		return (EReference) getFieldDefinition__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldDefinition__Marker_CONTEXT__SRC__mSignature() {
		return (EReference) getFieldDefinition__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldDefinition__Marker_CREATE__TRG__tDefinition() {
		return (EReference) getFieldDefinition__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldDefinition__Marker_CONTEXT__TRG__tFieldSignature() {
		return (EReference) getFieldDefinition__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldDefinition__Marker_CREATE__CORR__mBodyToTAnnotation() {
		return (EReference) getFieldDefinition__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldDefinition__Marker_CREATE__CORR__mDefinitionToTDefinition() {
		return (EReference) getFieldDefinition__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldDefinition__Marker_CREATE__CORR__mDefinitionToTMember() {
		return (EReference) getFieldDefinition__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldDefinition__Marker_CONTEXT__CORR__mSignatureToTFieldSignature() {
		return (EReference) getFieldDefinition__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldName__Marker() {
		if (fieldName__MarkerEClass == null) {
			fieldName__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(71);
		}
		return fieldName__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldName__Marker_CREATE__SRC__mFieldName() {
		return (EReference) getFieldName__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldName__Marker_CONTEXT__SRC__model() {
		return (EReference) getFieldName__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldName__Marker_CREATE__TRG__tField() {
		return (EReference) getFieldName__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldName__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getFieldName__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldName__Marker_CREATE__CORR__eFieldDeclarationToTField() {
		return (EReference) getFieldName__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldName__Marker_CONTEXT__CORR__modelToTypeGraph() {
		return (EReference) getFieldName__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldSignature__Marker() {
		if (fieldSignature__MarkerEClass == null) {
			fieldSignature__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(72);
		}
		return fieldSignature__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldSignature__Marker_CONTEXT__SRC__mFieldName() {
		return (EReference) getFieldSignature__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldSignature__Marker_CREATE__SRC__mSignature() {
		return (EReference) getFieldSignature__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldSignature__Marker_CONTEXT__TRG__tField() {
		return (EReference) getFieldSignature__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldSignature__Marker_CREATE__TRG__tSignature() {
		return (EReference) getFieldSignature__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldSignature__Marker_CONTEXT__CORR__eFieldDeclarationToTField() {
		return (EReference) getFieldSignature__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldSignature__Marker_CREATE__CORR__mFlowElementToTFlowElement() {
		return (EReference) getFieldSignature__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldSignature__Marker_CREATE__CORR__mSignatureToTSignature() {
		return (EReference) getFieldSignature__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldType__Marker() {
		if (fieldType__MarkerEClass == null) {
			fieldType__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(73);
		}
		return fieldType__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldType__Marker_CONTEXT__SRC__ePrimitiveType() {
		return (EReference) getFieldType__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldType__Marker_CONTEXT__SRC__mSignature() {
		return (EReference) getFieldType__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldType__Marker_CONTEXT__TRG__tFieldSignature() {
		return (EReference) getFieldType__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldType__Marker_CONTEXT__TRG__tPrimitiv() {
		return (EReference) getFieldType__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldType__Marker_CONTEXT__CORR__ePrimitiveTypeToTPrimitiv() {
		return (EReference) getFieldType__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldType__Marker_CONTEXT__CORR__mSignatureToTFieldSignature() {
		return (EReference) getFieldType__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlow__Marker() {
		if (flow__MarkerEClass == null) {
			flow__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(74);
		}
		return flow__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow__Marker_CREATE__SRC__mFlow() {
		return (EReference) getFlow__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow__Marker_CONTEXT__SRC__mOwner() {
		return (EReference) getFlow__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow__Marker_CREATE__TRG__tFlow() {
		return (EReference) getFlow__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow__Marker_CONTEXT__TRG__tOwner() {
		return (EReference) getFlow__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow__Marker_CREATE__CORR__mFlowToTFlow() {
		return (EReference) getFlow__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow__Marker_CONTEXT__CORR__mOwnerToTOwner() {
		return (EReference) getFlow__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncomingFlow__Marker() {
		if (incomingFlow__MarkerEClass == null) {
			incomingFlow__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(75);
		}
		return incomingFlow__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncomingFlow__Marker_CONTEXT__SRC__mFlow() {
		return (EReference) getIncomingFlow__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncomingFlow__Marker_CONTEXT__SRC__mSource() {
		return (EReference) getIncomingFlow__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncomingFlow__Marker_CONTEXT__TRG__tFlow() {
		return (EReference) getIncomingFlow__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncomingFlow__Marker_CONTEXT__TRG__tSource() {
		return (EReference) getIncomingFlow__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncomingFlow__Marker_CONTEXT__CORR__mFlowToTFlow() {
		return (EReference) getIncomingFlow__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncomingFlow__Marker_CONTEXT__CORR__mSourceToTSource() {
		return (EReference) getIncomingFlow__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface__Marker() {
		if (interface__MarkerEClass == null) {
			interface__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(76);
		}
		return interface__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface__Marker_CONTEXT__SRC__mPackage() {
		return (EReference) getInterface__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface__Marker_CREATE__SRC__mType() {
		return (EReference) getInterface__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface__Marker_CONTEXT__TRG__pg() {
		return (EReference) getInterface__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface__Marker_CONTEXT__TRG__tPackage() {
		return (EReference) getInterface__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface__Marker_CREATE__TRG__tType() {
		return (EReference) getInterface__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface__Marker_CREATE__CORR__mBodyToTAnnotation() {
		return (EReference) getInterface__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface__Marker_CREATE__CORR__mInterfaceDeclarationtoTInterface() {
		return (EReference) getInterface__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface__Marker_CONTEXT__CORR__mPackageToTPackage() {
		return (EReference) getInterface__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface__Marker_CREATE__CORR__mTypeToTType() {
		return (EReference) getInterface__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceExtendsInterface__Marker() {
		if (interfaceExtendsInterface__MarkerEClass == null) {
			interfaceExtendsInterface__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(77);
		}
		return interfaceExtendsInterface__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceExtendsInterface__Marker_CONTEXT__SRC__eInterfaceDeclaration() {
		return (EReference) getInterfaceExtendsInterface__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceExtendsInterface__Marker_CONTEXT__SRC__eSuperInterface() {
		return (EReference) getInterfaceExtendsInterface__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceExtendsInterface__Marker_CREATE__SRC__eTypeAccess() {
		return (EReference) getInterfaceExtendsInterface__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceExtendsInterface__Marker_CONTEXT__TRG__tInterface() {
		return (EReference) getInterfaceExtendsInterface__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceExtendsInterface__Marker_CONTEXT__TRG__tSuperInterface() {
		return (EReference) getInterfaceExtendsInterface__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceExtendsInterface__Marker_CONTEXT__CORR__eInterfaceDeclarationToTInterface() {
		return (EReference) getInterfaceExtendsInterface__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceExtendsInterface__Marker_CONTEXT__CORR__eSuperInterfaceToTSuperInterface() {
		return (EReference) getInterfaceExtendsInterface__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceInAnonymous__Marker() {
		if (interfaceInAnonymous__MarkerEClass == null) {
			interfaceInAnonymous__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(78);
		}
		return interfaceInAnonymous__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceInAnonymous__Marker_CONTEXT__SRC__eAnonymousClassDeclaration() {
		return (EReference) getInterfaceInAnonymous__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceInAnonymous__Marker_CREATE__SRC__mNestedType() {
		return (EReference) getInterfaceInAnonymous__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceInAnonymous__Marker_CONTEXT__TRG__pg() {
		return (EReference) getInterfaceInAnonymous__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceInAnonymous__Marker_CONTEXT__TRG__tClass() {
		return (EReference) getInterfaceInAnonymous__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceInAnonymous__Marker_CREATE__TRG__tNestedType() {
		return (EReference) getInterfaceInAnonymous__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceInAnonymous__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass() {
		return (EReference) getInterfaceInAnonymous__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceInAnonymous__Marker_CREATE__CORR__mInterfaceDeclarationtoTInterface() {
		return (EReference) getInterfaceInAnonymous__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceInAnonymous__Marker_CREATE__CORR__mNestedTypeToTNestedType() {
		return (EReference) getInterfaceInAnonymous__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceInAnonymous__Marker_CREATE__CORR__mbodyToTAnnotatable() {
		return (EReference) getInterfaceInAnonymous__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceMember__Marker() {
		if (interfaceMember__MarkerEClass == null) {
			interfaceMember__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(79);
		}
		return interfaceMember__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceMember__Marker_CONTEXT__SRC__mDefinition() {
		return (EReference) getInterfaceMember__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceMember__Marker_CONTEXT__SRC__mInterface() {
		return (EReference) getInterfaceMember__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceMember__Marker_CREATE__SRC__mModifier() {
		return (EReference) getInterfaceMember__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceMember__Marker_CONTEXT__TRG__tInterface() {
		return (EReference) getInterfaceMember__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceMember__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getInterfaceMember__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceMember__Marker_CREATE__TRG__tModifier() {
		return (EReference) getInterfaceMember__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceMember__Marker_CONTEXT__CORR__defToMember() {
		return (EReference) getInterfaceMember__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceMember__Marker_CREATE__CORR__mModifierToTModifier() {
		return (EReference) getInterfaceMember__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceMember__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getInterfaceMember__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkDefinitionToAnonymous__Marker() {
		if (linkDefinitionToAnonymous__MarkerEClass == null) {
			linkDefinitionToAnonymous__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(80);
		}
		return linkDefinitionToAnonymous__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__SRC__mDefinition() {
		return (EReference) getLinkDefinitionToAnonymous__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__SRC__mSignature() {
		return (EReference) getLinkDefinitionToAnonymous__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__SRC__mType() {
		return (EReference) getLinkDefinitionToAnonymous__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__TRG__tDefinition() {
		return (EReference) getLinkDefinitionToAnonymous__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__TRG__tSignature() {
		return (EReference) getLinkDefinitionToAnonymous__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__TRG__tType() {
		return (EReference) getLinkDefinitionToAnonymous__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__CORR__mDefinitionToTMember() {
		return (EReference) getLinkDefinitionToAnonymous__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__CORR__mSignatureToTSignature() {
		return (EReference) getLinkDefinitionToAnonymous__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getLinkDefinitionToAnonymous__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkDefinitionToType__Marker() {
		if (linkDefinitionToType__MarkerEClass == null) {
			linkDefinitionToType__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(81);
		}
		return linkDefinitionToType__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToType__Marker_CONTEXT__SRC__mDefinition() {
		return (EReference) getLinkDefinitionToType__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToType__Marker_CONTEXT__SRC__mSignature() {
		return (EReference) getLinkDefinitionToType__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToType__Marker_CONTEXT__SRC__mType() {
		return (EReference) getLinkDefinitionToType__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToType__Marker_CONTEXT__TRG__tDefinition() {
		return (EReference) getLinkDefinitionToType__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToType__Marker_CONTEXT__TRG__tSignature() {
		return (EReference) getLinkDefinitionToType__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToType__Marker_CONTEXT__TRG__tType() {
		return (EReference) getLinkDefinitionToType__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToType__Marker_CONTEXT__CORR__mDefinitionToTMember() {
		return (EReference) getLinkDefinitionToType__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToType__Marker_CONTEXT__CORR__mSignatureToTSignature() {
		return (EReference) getLinkDefinitionToType__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkDefinitionToType__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getLinkDefinitionToType__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberInAnnotationVisibility__Marker() {
		if (memberInAnnotationVisibility__MarkerEClass == null) {
			memberInAnnotationVisibility__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(82);
		}
		return memberInAnnotationVisibility__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInAnnotationVisibility__Marker_CONTEXT__SRC__Annotation() {
		return (EReference) getMemberInAnnotationVisibility__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInAnnotationVisibility__Marker_CONTEXT__SRC__mDefinition() {
		return (EReference) getMemberInAnnotationVisibility__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInAnnotationVisibility__Marker_CREATE__SRC__mModifier() {
		return (EReference) getMemberInAnnotationVisibility__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInAnnotationVisibility__Marker_CONTEXT__TRG__tAnnotation() {
		return (EReference) getMemberInAnnotationVisibility__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInAnnotationVisibility__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getMemberInAnnotationVisibility__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInAnnotationVisibility__Marker_CREATE__TRG__tModifier() {
		return (EReference) getMemberInAnnotationVisibility__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInAnnotationVisibility__Marker_CONTEXT__CORR__defToMember() {
		return (EReference) getMemberInAnnotationVisibility__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInAnnotationVisibility__Marker_CREATE__CORR__mModifierToTModifier() {
		return (EReference) getMemberInAnnotationVisibility__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInAnnotationVisibility__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getMemberInAnnotationVisibility__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberInClassVisibility__Marker() {
		if (memberInClassVisibility__MarkerEClass == null) {
			memberInClassVisibility__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(83);
		}
		return memberInClassVisibility__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInClassVisibility__Marker_CONTEXT__SRC__mClass() {
		return (EReference) getMemberInClassVisibility__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInClassVisibility__Marker_CONTEXT__SRC__mDefinition() {
		return (EReference) getMemberInClassVisibility__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInClassVisibility__Marker_CREATE__SRC__mModifier() {
		return (EReference) getMemberInClassVisibility__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInClassVisibility__Marker_CONTEXT__TRG__tClass() {
		return (EReference) getMemberInClassVisibility__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInClassVisibility__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getMemberInClassVisibility__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInClassVisibility__Marker_CREATE__TRG__tModifier() {
		return (EReference) getMemberInClassVisibility__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInClassVisibility__Marker_CONTEXT__CORR__defToMember() {
		return (EReference) getMemberInClassVisibility__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInClassVisibility__Marker_CREATE__CORR__mModifierToTModifier() {
		return (EReference) getMemberInClassVisibility__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInClassVisibility__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getMemberInClassVisibility__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberInEnumVisibility__Marker() {
		if (memberInEnumVisibility__MarkerEClass == null) {
			memberInEnumVisibility__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(84);
		}
		return memberInEnumVisibility__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInEnumVisibility__Marker_CONTEXT__SRC__mClass() {
		return (EReference) getMemberInEnumVisibility__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInEnumVisibility__Marker_CONTEXT__SRC__mDefinition() {
		return (EReference) getMemberInEnumVisibility__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInEnumVisibility__Marker_CREATE__SRC__mModifier() {
		return (EReference) getMemberInEnumVisibility__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInEnumVisibility__Marker_CONTEXT__TRG__tClass() {
		return (EReference) getMemberInEnumVisibility__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInEnumVisibility__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getMemberInEnumVisibility__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInEnumVisibility__Marker_CREATE__TRG__tModifier() {
		return (EReference) getMemberInEnumVisibility__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInEnumVisibility__Marker_CONTEXT__CORR__defToMember() {
		return (EReference) getMemberInEnumVisibility__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInEnumVisibility__Marker_CREATE__CORR__mModifierToTModifier() {
		return (EReference) getMemberInEnumVisibility__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberInEnumVisibility__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getMemberInEnumVisibility__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodDefinition__Marker() {
		if (methodDefinition__MarkerEClass == null) {
			methodDefinition__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(85);
		}
		return methodDefinition__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDefinition__Marker_CREATE__SRC__mDefinition() {
		return (EReference) getMethodDefinition__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDefinition__Marker_CONTEXT__SRC__mSignature() {
		return (EReference) getMethodDefinition__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDefinition__Marker_CREATE__TRG__tDefinition() {
		return (EReference) getMethodDefinition__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDefinition__Marker_CONTEXT__TRG__tMethodSignature() {
		return (EReference) getMethodDefinition__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDefinition__Marker_CREATE__CORR__mBodyToTAnnotation() {
		return (EReference) getMethodDefinition__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDefinition__Marker_CREATE__CORR__mDefinitionToTMember() {
		return (EReference) getMethodDefinition__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDefinition__Marker_CREATE__CORR__mFlowElementToTFlowElement() {
		return (EReference) getMethodDefinition__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDefinition__Marker_CONTEXT__CORR__mSignatureToTMethodSignature() {
		return (EReference) getMethodDefinition__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodInvocation__Marker() {
		if (methodInvocation__MarkerEClass == null) {
			methodInvocation__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(86);
		}
		return methodInvocation__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocation__Marker_CREATE__SRC__invocation() {
		return (EReference) getMethodInvocation__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocation__Marker_CONTEXT__SRC__mMember() {
		return (EReference) getMethodInvocation__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocation__Marker_CONTEXT__SRC__mMethod() {
		return (EReference) getMethodInvocation__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocation__Marker_CREATE__TRG__tAccess() {
		return (EReference) getMethodInvocation__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocation__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getMethodInvocation__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocation__Marker_CONTEXT__TRG__tMethod() {
		return (EReference) getMethodInvocation__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocation__Marker_CREATE__CORR__invocationToTAccess() {
		return (EReference) getMethodInvocation__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocation__Marker_CREATE__CORR__mFlowElementToTFlowElement() {
		return (EReference) getMethodInvocation__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocation__Marker_CONTEXT__CORR__mMemberToTMember() {
		return (EReference) getMethodInvocation__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocation__Marker_CONTEXT__CORR__mMethodToTMethod() {
		return (EReference) getMethodInvocation__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodInvocationRecursive__Marker() {
		if (methodInvocationRecursive__MarkerEClass == null) {
			methodInvocationRecursive__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(87);
		}
		return methodInvocationRecursive__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationRecursive__Marker_CREATE__SRC__invocation() {
		return (EReference) getMethodInvocationRecursive__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationRecursive__Marker_CONTEXT__SRC__mMember() {
		return (EReference) getMethodInvocationRecursive__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationRecursive__Marker_CREATE__TRG__tAccess() {
		return (EReference) getMethodInvocationRecursive__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationRecursive__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getMethodInvocationRecursive__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationRecursive__Marker_CREATE__CORR__invocationToTAccess() {
		return (EReference) getMethodInvocationRecursive__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationRecursive__Marker_CREATE__CORR__mFlowElementToTFlowElement() {
		return (EReference) getMethodInvocationRecursive__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationRecursive__Marker_CONTEXT__CORR__mMemberToTMember() {
		return (EReference) getMethodInvocationRecursive__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodInvocationStaticType__Marker() {
		if (methodInvocationStaticType__MarkerEClass == null) {
			methodInvocationStaticType__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(88);
		}
		return methodInvocationStaticType__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationStaticType__Marker_CONTEXT__SRC__invocation() {
		return (EReference) getMethodInvocationStaticType__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationStaticType__Marker_CONTEXT__SRC__mStaticType() {
		return (EReference) getMethodInvocationStaticType__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationStaticType__Marker_CONTEXT__TRG__tAccess() {
		return (EReference) getMethodInvocationStaticType__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationStaticType__Marker_CONTEXT__TRG__tStaticType() {
		return (EReference) getMethodInvocationStaticType__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationStaticType__Marker_CONTEXT__CORR__invocationToTAccess() {
		return (EReference) getMethodInvocationStaticType__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocationStaticType__Marker_CONTEXT__CORR__mStaticTypeTotStaticType() {
		return (EReference) getMethodInvocationStaticType__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodName__Marker() {
		if (methodName__MarkerEClass == null) {
			methodName__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(89);
		}
		return methodName__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodName__Marker_CONTEXT__SRC__mModel() {
		return (EReference) getMethodName__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodName__Marker_CREATE__SRC__mName() {
		return (EReference) getMethodName__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodName__Marker_CONTEXT__TRG__pg() {
		return (EReference) getMethodName__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodName__Marker_CREATE__TRG__tName() {
		return (EReference) getMethodName__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodName__Marker_CREATE__CORR__mNameToTName() {
		return (EReference) getMethodName__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodName__Marker_CONTEXT__CORR__modelToPg() {
		return (EReference) getMethodName__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodOverriding__Marker() {
		if (methodOverriding__MarkerEClass == null) {
			methodOverriding__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(90);
		}
		return methodOverriding__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodOverriding__Marker_CONTEXT__SRC__mMethod() {
		return (EReference) getMethodOverriding__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodOverriding__Marker_CONTEXT__SRC__mOverriding() {
		return (EReference) getMethodOverriding__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodOverriding__Marker_CONTEXT__TRG__tMethod() {
		return (EReference) getMethodOverriding__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodOverriding__Marker_CONTEXT__TRG__tOverriding() {
		return (EReference) getMethodOverriding__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodOverriding__Marker_CONTEXT__CORR__mMethodToTMethod() {
		return (EReference) getMethodOverriding__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodOverriding__Marker_CONTEXT__CORR__mOverridingToTOverriding() {
		return (EReference) getMethodOverriding__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodParameter__Marker() {
		if (methodParameter__MarkerEClass == null) {
			methodParameter__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(91);
		}
		return methodParameter__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameter__Marker_CREATE__SRC__mEntry() {
		return (EReference) getMethodParameter__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameter__Marker_CONTEXT__SRC__mSignature() {
		return (EReference) getMethodParameter__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameter__Marker_CREATE__TRG__tParameter() {
		return (EReference) getMethodParameter__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameter__Marker_CONTEXT__TRG__tSiganture() {
		return (EReference) getMethodParameter__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameter__Marker_CREATE__CORR__mEntryToTParameter() {
		return (EReference) getMethodParameter__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameter__Marker_CREATE__CORR__mFlowElementToTFlowElement() {
		return (EReference) getMethodParameter__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameter__Marker_CONTEXT__CORR__mSignatureToTSignature() {
		return (EReference) getMethodParameter__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodParameterLink__Marker() {
		if (methodParameterLink__MarkerEClass == null) {
			methodParameterLink__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(92);
		}
		return methodParameterLink__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterLink__Marker_CONTEXT__SRC__mEntry() {
		return (EReference) getMethodParameterLink__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterLink__Marker_CONTEXT__SRC__mPrevEntry() {
		return (EReference) getMethodParameterLink__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterLink__Marker_CONTEXT__TRG__tParameter() {
		return (EReference) getMethodParameterLink__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterLink__Marker_CONTEXT__TRG__tPrevParameter() {
		return (EReference) getMethodParameterLink__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterLink__Marker_CONTEXT__CORR__eSingleVariableDeclarationToTParameter() {
		return (EReference) getMethodParameterLink__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterLink__Marker_CONTEXT__CORR__mmethodSignatureToTMethodSignature() {
		return (EReference) getMethodParameterLink__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodParameterLinkFirst__Marker() {
		if (methodParameterLinkFirst__MarkerEClass == null) {
			methodParameterLinkFirst__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(93);
		}
		return methodParameterLinkFirst__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterLinkFirst__Marker_CONTEXT__SRC__mEntry() {
		return (EReference) getMethodParameterLinkFirst__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterLinkFirst__Marker_CONTEXT__SRC__mParameterList() {
		return (EReference) getMethodParameterLinkFirst__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterLinkFirst__Marker_CONTEXT__TRG__tMethodSignature() {
		return (EReference) getMethodParameterLinkFirst__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterLinkFirst__Marker_CONTEXT__TRG__tParameter() {
		return (EReference) getMethodParameterLinkFirst__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterLinkFirst__Marker_CONTEXT__CORR__eSingleVariableDeclarationToTParameter() {
		return (EReference) getMethodParameterLinkFirst__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterLinkFirst__Marker_CONTEXT__CORR__mmethodSignatureToTMethodSignature() {
		return (EReference) getMethodParameterLinkFirst__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodParameterType__Marker() {
		if (methodParameterType__MarkerEClass == null) {
			methodParameterType__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(94);
		}
		return methodParameterType__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterType__Marker_CREATE__SRC__mEntry() {
		return (EReference) getMethodParameterType__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterType__Marker_CONTEXT__SRC__mSignature() {
		return (EReference) getMethodParameterType__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterType__Marker_CONTEXT__SRC__mType() {
		return (EReference) getMethodParameterType__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterType__Marker_CONTEXT__TRG__tAbstractType() {
		return (EReference) getMethodParameterType__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterType__Marker_CREATE__TRG__tParameter() {
		return (EReference) getMethodParameterType__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterType__Marker_CONTEXT__TRG__tSiganture() {
		return (EReference) getMethodParameterType__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterType__Marker_CREATE__CORR__mEntryToTParameter() {
		return (EReference) getMethodParameterType__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterType__Marker_CREATE__CORR__mFlowElementToTFlowElement() {
		return (EReference) getMethodParameterType__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterType__Marker_CONTEXT__CORR__mSignatureToTSignature() {
		return (EReference) getMethodParameterType__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodParameterType__Marker_CONTEXT__CORR__mTypeToTAbstractType() {
		return (EReference) getMethodParameterType__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodSignature__Marker() {
		if (methodSignature__MarkerEClass == null) {
			methodSignature__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(95);
		}
		return methodSignature__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodSignature__Marker_CONTEXT__SRC__mName() {
		return (EReference) getMethodSignature__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodSignature__Marker_CREATE__SRC__mSignature() {
		return (EReference) getMethodSignature__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodSignature__Marker_CONTEXT__TRG__tName() {
		return (EReference) getMethodSignature__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodSignature__Marker_CREATE__TRG__tSignature() {
		return (EReference) getMethodSignature__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodSignature__Marker_CREATE__CORR__mFlowElementToTFlowElement() {
		return (EReference) getMethodSignature__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodSignature__Marker_CONTEXT__CORR__mNameToTName() {
		return (EReference) getMethodSignature__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodSignature__Marker_CREATE__CORR__mSignatureToTSignature() {
		return (EReference) getMethodSignature__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelToPg__Marker() {
		if (modelToPg__MarkerEClass == null) {
			modelToPg__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(96);
		}
		return modelToPg__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelToPg__Marker_CREATE__SRC__mModel() {
		return (EReference) getModelToPg__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelToPg__Marker_CREATE__TRG__tPG() {
		return (EReference) getModelToPg__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelToPg__Marker_CREATE__CORR__mModelToTPG() {
		return (EReference) getModelToPg__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedClassInType__Marker() {
		if (nestedClassInType__MarkerEClass == null) {
			nestedClassInType__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(97);
		}
		return nestedClassInType__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedClassInType__Marker_CREATE__SRC__eNestedType() {
		return (EReference) getNestedClassInType__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedClassInType__Marker_CONTEXT__SRC__eOuterType() {
		return (EReference) getNestedClassInType__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedClassInType__Marker_CREATE__TRG__tNestedPackage() {
		return (EReference) getNestedClassInType__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedClassInType__Marker_CREATE__TRG__tNestedType() {
		return (EReference) getNestedClassInType__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedClassInType__Marker_CONTEXT__TRG__tOuterPackage() {
		return (EReference) getNestedClassInType__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedClassInType__Marker_CONTEXT__TRG__tOuterType() {
		return (EReference) getNestedClassInType__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedClassInType__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getNestedClassInType__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedClassInType__Marker_CREATE__CORR__eNestedTypeToTNestedType() {
		return (EReference) getNestedClassInType__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedClassInType__Marker_CONTEXT__CORR__eOuterTypeToTOuterInterface() {
		return (EReference) getNestedClassInType__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedClassInType__Marker_CREATE__CORR__mBodyToTAnnotation() {
		return (EReference) getNestedClassInType__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedClassInType__Marker_CREATE__CORR__mNestedClassDeclarationToTNestedClass() {
		return (EReference) getNestedClassInType__Marker().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedEnum__Marker() {
		if (nestedEnum__MarkerEClass == null) {
			nestedEnum__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(98);
		}
		return nestedEnum__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedEnum__Marker_CREATE__SRC__eNestedType() {
		return (EReference) getNestedEnum__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedEnum__Marker_CONTEXT__SRC__eOuterType() {
		return (EReference) getNestedEnum__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedEnum__Marker_CREATE__TRG__tAnnotation() {
		return (EReference) getNestedEnum__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedEnum__Marker_CREATE__TRG__tNestedPackage() {
		return (EReference) getNestedEnum__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedEnum__Marker_CREATE__TRG__tNestedType() {
		return (EReference) getNestedEnum__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedEnum__Marker_CONTEXT__TRG__tOuterPackage() {
		return (EReference) getNestedEnum__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedEnum__Marker_CONTEXT__TRG__tOuterType() {
		return (EReference) getNestedEnum__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedEnum__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getNestedEnum__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedEnum__Marker_CREATE__CORR__eNestedTypeToTNestedType() {
		return (EReference) getNestedEnum__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedEnum__Marker_CONTEXT__CORR__eOuterTypeToTOuterInterface() {
		return (EReference) getNestedEnum__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedEnum__Marker_CREATE__CORR__mBodyToTAnnotation() {
		return (EReference) getNestedEnum__Marker().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedInterfaceInType__Marker() {
		if (nestedInterfaceInType__MarkerEClass == null) {
			nestedInterfaceInType__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(99);
		}
		return nestedInterfaceInType__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedInterfaceInType__Marker_CREATE__SRC__eNestedType() {
		return (EReference) getNestedInterfaceInType__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedInterfaceInType__Marker_CONTEXT__SRC__eOuterType() {
		return (EReference) getNestedInterfaceInType__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedInterfaceInType__Marker_CREATE__TRG__tNestedPackage() {
		return (EReference) getNestedInterfaceInType__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedInterfaceInType__Marker_CREATE__TRG__tNestedType() {
		return (EReference) getNestedInterfaceInType__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedInterfaceInType__Marker_CONTEXT__TRG__tOuterPackage() {
		return (EReference) getNestedInterfaceInType__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedInterfaceInType__Marker_CONTEXT__TRG__tOuterType() {
		return (EReference) getNestedInterfaceInType__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedInterfaceInType__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getNestedInterfaceInType__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedInterfaceInType__Marker_CREATE__CORR__eNestedTypeToTNestedType() {
		return (EReference) getNestedInterfaceInType__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedInterfaceInType__Marker_CONTEXT__CORR__eOuterTypeToTOuterInterface() {
		return (EReference) getNestedInterfaceInType__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedInterfaceInType__Marker_CREATE__CORR__mBodyToTAnnotation() {
		return (EReference) getNestedInterfaceInType__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedInterfaceInType__Marker_CREATE__CORR__mInterfaceDeclarationtoTInterface() {
		return (EReference) getNestedInterfaceInType__Marker().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutgoingFlow__Marker() {
		if (outgoingFlow__MarkerEClass == null) {
			outgoingFlow__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(100);
		}
		return outgoingFlow__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutgoingFlow__Marker_CONTEXT__SRC__mFlow() {
		return (EReference) getOutgoingFlow__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutgoingFlow__Marker_CONTEXT__SRC__mTarget() {
		return (EReference) getOutgoingFlow__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutgoingFlow__Marker_CONTEXT__TRG__tFlow() {
		return (EReference) getOutgoingFlow__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutgoingFlow__Marker_CONTEXT__TRG__tTarget() {
		return (EReference) getOutgoingFlow__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutgoingFlow__Marker_CONTEXT__CORR__mFlowToTFlow() {
		return (EReference) getOutgoingFlow__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutgoingFlow__Marker_CONTEXT__CORR__mTargetToTTarget() {
		return (EReference) getOutgoingFlow__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageToPGPackage__Marker() {
		if (packageToPGPackage__MarkerEClass == null) {
			packageToPGPackage__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(101);
		}
		return packageToPGPackage__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageToPGPackage__Marker_CONTEXT__SRC__mModel() {
		return (EReference) getPackageToPGPackage__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageToPGPackage__Marker_CREATE__SRC__mPackage() {
		return (EReference) getPackageToPGPackage__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageToPGPackage__Marker_CREATE__TRG__tPackage() {
		return (EReference) getPackageToPGPackage__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageToPGPackage__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getPackageToPGPackage__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageToPGPackage__Marker_CONTEXT__CORR__mModelToTypeGraph() {
		return (EReference) getPackageToPGPackage__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageToPGPackage__Marker_CREATE__CORR__mPackageToTPackage() {
		return (EReference) getPackageToPGPackage__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedTypeToClass__Marker() {
		if (parameterizedTypeToClass__MarkerEClass == null) {
			parameterizedTypeToClass__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(102);
		}
		return parameterizedTypeToClass__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedTypeToClass__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getParameterizedTypeToClass__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedTypeToClass__Marker_CREATE__SRC__eParameterizedType() {
		return (EReference) getParameterizedTypeToClass__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedTypeToClass__Marker_CONTEXT__SRC__eType() {
		return (EReference) getParameterizedTypeToClass__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedTypeToClass__Marker_CREATE__SRC__eTypeAccess() {
		return (EReference) getParameterizedTypeToClass__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedTypeToClass__Marker_CONTEXT__TRG__pg() {
		return (EReference) getParameterizedTypeToClass__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedTypeToClass__Marker_CONTEXT__TRG__tAbstractType() {
		return (EReference) getParameterizedTypeToClass__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedTypeToClass__Marker_CONTEXT__CORR__eModelToPg() {
		return (EReference) getParameterizedTypeToClass__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedTypeToClass__Marker_CREATE__CORR__eParameterizedTypeToTAbstractType() {
		return (EReference) getParameterizedTypeToClass__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedTypeToClass__Marker_CONTEXT__CORR__eTypeToTAbstractType() {
		return (EReference) getParameterizedTypeToClass__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsBoolean__Marker() {
		if (primitiveTypeIsBoolean__MarkerEClass == null) {
			primitiveTypeIsBoolean__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(103);
		}
		return primitiveTypeIsBoolean__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsBoolean__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getPrimitiveTypeIsBoolean__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsBoolean__Marker_CREATE__SRC__ePrimitiveType() {
		return (EReference) getPrimitiveTypeIsBoolean__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsBoolean__Marker_CREATE__TRG__tPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsBoolean__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsBoolean__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getPrimitiveTypeIsBoolean__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsBoolean__Marker_CONTEXT__CORR__eModelToTypeGraph() {
		return (EReference) getPrimitiveTypeIsBoolean__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsBoolean__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsBoolean__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsBoolean__Marker_CREATE__CORR__typeToTAbstractType() {
		return (EReference) getPrimitiveTypeIsBoolean__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsByte__Marker() {
		if (primitiveTypeIsByte__MarkerEClass == null) {
			primitiveTypeIsByte__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(104);
		}
		return primitiveTypeIsByte__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsByte__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getPrimitiveTypeIsByte__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsByte__Marker_CREATE__SRC__ePrimitiveType() {
		return (EReference) getPrimitiveTypeIsByte__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsByte__Marker_CREATE__TRG__tPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsByte__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsByte__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getPrimitiveTypeIsByte__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsByte__Marker_CONTEXT__CORR__eModelToTypeGraph() {
		return (EReference) getPrimitiveTypeIsByte__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsByte__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsByte__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsByte__Marker_CREATE__CORR__typeToTAbstractType() {
		return (EReference) getPrimitiveTypeIsByte__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsChar__Marker() {
		if (primitiveTypeIsChar__MarkerEClass == null) {
			primitiveTypeIsChar__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(105);
		}
		return primitiveTypeIsChar__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsChar__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getPrimitiveTypeIsChar__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsChar__Marker_CREATE__SRC__ePrimitiveType() {
		return (EReference) getPrimitiveTypeIsChar__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsChar__Marker_CREATE__TRG__tPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsChar__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsChar__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getPrimitiveTypeIsChar__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsChar__Marker_CONTEXT__CORR__eModelToTypeGraph() {
		return (EReference) getPrimitiveTypeIsChar__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsChar__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsChar__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsChar__Marker_CREATE__CORR__typeToTAbstractType() {
		return (EReference) getPrimitiveTypeIsChar__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsDouble__Marker() {
		if (primitiveTypeIsDouble__MarkerEClass == null) {
			primitiveTypeIsDouble__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(106);
		}
		return primitiveTypeIsDouble__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsDouble__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getPrimitiveTypeIsDouble__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsDouble__Marker_CREATE__SRC__ePrimitiveType() {
		return (EReference) getPrimitiveTypeIsDouble__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsDouble__Marker_CREATE__TRG__tPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsDouble__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsDouble__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getPrimitiveTypeIsDouble__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsDouble__Marker_CONTEXT__CORR__eModelToTypeGraph() {
		return (EReference) getPrimitiveTypeIsDouble__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsDouble__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsDouble__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsDouble__Marker_CREATE__CORR__typeToTAbstractType() {
		return (EReference) getPrimitiveTypeIsDouble__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsFloat__Marker() {
		if (primitiveTypeIsFloat__MarkerEClass == null) {
			primitiveTypeIsFloat__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(107);
		}
		return primitiveTypeIsFloat__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsFloat__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getPrimitiveTypeIsFloat__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsFloat__Marker_CREATE__SRC__ePrimitiveType() {
		return (EReference) getPrimitiveTypeIsFloat__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsFloat__Marker_CREATE__TRG__tPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsFloat__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsFloat__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getPrimitiveTypeIsFloat__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsFloat__Marker_CONTEXT__CORR__eModelToTypeGraph() {
		return (EReference) getPrimitiveTypeIsFloat__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsFloat__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsFloat__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsFloat__Marker_CREATE__CORR__typeToTAbstractType() {
		return (EReference) getPrimitiveTypeIsFloat__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsInt__Marker() {
		if (primitiveTypeIsInt__MarkerEClass == null) {
			primitiveTypeIsInt__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(108);
		}
		return primitiveTypeIsInt__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsInt__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getPrimitiveTypeIsInt__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsInt__Marker_CREATE__SRC__ePrimitiveType() {
		return (EReference) getPrimitiveTypeIsInt__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsInt__Marker_CREATE__TRG__tPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsInt__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsInt__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getPrimitiveTypeIsInt__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsInt__Marker_CONTEXT__CORR__eModelToTypeGraph() {
		return (EReference) getPrimitiveTypeIsInt__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsInt__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsInt__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsInt__Marker_CREATE__CORR__typeToTAbstractType() {
		return (EReference) getPrimitiveTypeIsInt__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsLong__Marker() {
		if (primitiveTypeIsLong__MarkerEClass == null) {
			primitiveTypeIsLong__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(109);
		}
		return primitiveTypeIsLong__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsLong__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getPrimitiveTypeIsLong__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsLong__Marker_CREATE__SRC__ePrimitiveType() {
		return (EReference) getPrimitiveTypeIsLong__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsLong__Marker_CREATE__TRG__tPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsLong__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsLong__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getPrimitiveTypeIsLong__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsLong__Marker_CONTEXT__CORR__eModelToTypeGraph() {
		return (EReference) getPrimitiveTypeIsLong__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsLong__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsLong__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsLong__Marker_CREATE__CORR__typeToTAbstractType() {
		return (EReference) getPrimitiveTypeIsLong__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsShort__Marker() {
		if (primitiveTypeIsShort__MarkerEClass == null) {
			primitiveTypeIsShort__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(110);
		}
		return primitiveTypeIsShort__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsShort__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getPrimitiveTypeIsShort__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsShort__Marker_CREATE__SRC__ePrimitiveType() {
		return (EReference) getPrimitiveTypeIsShort__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsShort__Marker_CREATE__TRG__tPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsShort__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsShort__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getPrimitiveTypeIsShort__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsShort__Marker_CONTEXT__CORR__eModelToTypeGraph() {
		return (EReference) getPrimitiveTypeIsShort__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsShort__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass() {
		return (EReference) getPrimitiveTypeIsShort__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypeIsShort__Marker_CREATE__CORR__typeToTAbstractType() {
		return (EReference) getPrimitiveTypeIsShort__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypesIsVoid__Marker() {
		if (primitiveTypesIsVoid__MarkerEClass == null) {
			primitiveTypesIsVoid__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(111);
		}
		return primitiveTypesIsVoid__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypesIsVoid__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getPrimitiveTypesIsVoid__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypesIsVoid__Marker_CREATE__SRC__ePrimitiveType() {
		return (EReference) getPrimitiveTypesIsVoid__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypesIsVoid__Marker_CREATE__TRG__tPrimitiveClass() {
		return (EReference) getPrimitiveTypesIsVoid__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypesIsVoid__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getPrimitiveTypesIsVoid__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypesIsVoid__Marker_CONTEXT__CORR__eModelToTypeGraph() {
		return (EReference) getPrimitiveTypesIsVoid__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypesIsVoid__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass() {
		return (EReference) getPrimitiveTypesIsVoid__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypesIsVoid__Marker_CREATE__CORR__typeToTAbstractType() {
		return (EReference) getPrimitiveTypesIsVoid__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType__Marker() {
		if (returnType__MarkerEClass == null) {
			returnType__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(112);
		}
		return returnType__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType__Marker_CONTEXT__SRC__eReturnType() {
		return (EReference) getReturnType__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType__Marker_CREATE__SRC__eTypeAccess() {
		return (EReference) getReturnType__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType__Marker_CONTEXT__SRC__mDefinition() {
		return (EReference) getReturnType__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType__Marker_CONTEXT__TRG__tAbstractType() {
		return (EReference) getReturnType__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType__Marker_CONTEXT__TRG__tMethodDefinition() {
		return (EReference) getReturnType__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType__Marker_CONTEXT__CORR__eReturnTypeToTAbstractType() {
		return (EReference) getReturnType__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType__Marker_CONTEXT__CORR__mMethodDefinitionToTMethodDefinition() {
		return (EReference) getReturnType__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignatureReturnType__Marker() {
		if (signatureReturnType__MarkerEClass == null) {
			signatureReturnType__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(113);
		}
		return signatureReturnType__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignatureReturnType__Marker_CONTEXT__SRC__mSignature() {
		return (EReference) getSignatureReturnType__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignatureReturnType__Marker_CONTEXT__SRC__mType() {
		return (EReference) getSignatureReturnType__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignatureReturnType__Marker_CONTEXT__TRG__tSignature() {
		return (EReference) getSignatureReturnType__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignatureReturnType__Marker_CONTEXT__TRG__tType() {
		return (EReference) getSignatureReturnType__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignatureReturnType__Marker_CONTEXT__CORR__mSignatureToTSignature() {
		return (EReference) getSignatureReturnType__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignatureReturnType__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getSignatureReturnType__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubPackageToPGPackage__Marker() {
		if (subPackageToPGPackage__MarkerEClass == null) {
			subPackageToPGPackage__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(114);
		}
		return subPackageToPGPackage__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubPackageToPGPackage__Marker_CREATE__SRC__mPackage() {
		return (EReference) getSubPackageToPGPackage__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubPackageToPGPackage__Marker_CONTEXT__SRC__mParentPackage() {
		return (EReference) getSubPackageToPGPackage__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubPackageToPGPackage__Marker_CONTEXT__TRG__tParent() {
		return (EReference) getSubPackageToPGPackage__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubPackageToPGPackage__Marker_CREATE__TRG__tSub() {
		return (EReference) getSubPackageToPGPackage__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubPackageToPGPackage__Marker_CONTEXT__TRG__typeGraph() {
		return (EReference) getSubPackageToPGPackage__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubPackageToPGPackage__Marker_CREATE__CORR__mPackageToTSub() {
		return (EReference) getSubPackageToPGPackage__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubPackageToPGPackage__Marker_CONTEXT__CORR__mParentPackageToTParent() {
		return (EReference) getSubPackageToPGPackage__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperConstructorInvocation__Marker() {
		if (superConstructorInvocation__MarkerEClass == null) {
			superConstructorInvocation__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(115);
		}
		return superConstructorInvocation__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperConstructorInvocation__Marker_CREATE__SRC__invocation() {
		return (EReference) getSuperConstructorInvocation__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperConstructorInvocation__Marker_CONTEXT__SRC__mMember() {
		return (EReference) getSuperConstructorInvocation__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperConstructorInvocation__Marker_CONTEXT__SRC__mMethod() {
		return (EReference) getSuperConstructorInvocation__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperConstructorInvocation__Marker_CREATE__TRG__tAccess() {
		return (EReference) getSuperConstructorInvocation__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperConstructorInvocation__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getSuperConstructorInvocation__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperConstructorInvocation__Marker_CONTEXT__TRG__tMethod() {
		return (EReference) getSuperConstructorInvocation__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperConstructorInvocation__Marker_CREATE__CORR__invocationToTAccess() {
		return (EReference) getSuperConstructorInvocation__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperConstructorInvocation__Marker_CREATE__CORR__mFlowElementToTFlowElement() {
		return (EReference) getSuperConstructorInvocation__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperConstructorInvocation__Marker_CONTEXT__CORR__mMemberToTMember() {
		return (EReference) getSuperConstructorInvocation__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperConstructorInvocation__Marker_CONTEXT__CORR__mMethodToTMethod() {
		return (EReference) getSuperConstructorInvocation__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperMethodInvocation__Marker() {
		if (superMethodInvocation__MarkerEClass == null) {
			superMethodInvocation__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(116);
		}
		return superMethodInvocation__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperMethodInvocation__Marker_CREATE__SRC__invocation() {
		return (EReference) getSuperMethodInvocation__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperMethodInvocation__Marker_CONTEXT__SRC__mMember() {
		return (EReference) getSuperMethodInvocation__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperMethodInvocation__Marker_CONTEXT__SRC__mMethod() {
		return (EReference) getSuperMethodInvocation__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperMethodInvocation__Marker_CREATE__TRG__tAccess() {
		return (EReference) getSuperMethodInvocation__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperMethodInvocation__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getSuperMethodInvocation__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperMethodInvocation__Marker_CONTEXT__TRG__tMethod() {
		return (EReference) getSuperMethodInvocation__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperMethodInvocation__Marker_CREATE__CORR__invocationToTAccess() {
		return (EReference) getSuperMethodInvocation__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperMethodInvocation__Marker_CREATE__CORR__mFlowElementToTFlowElement() {
		return (EReference) getSuperMethodInvocation__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperMethodInvocation__Marker_CONTEXT__CORR__mMemberToTMember() {
		return (EReference) getSuperMethodInvocation__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperMethodInvocation__Marker_CONTEXT__CORR__mMethodToTMethod() {
		return (EReference) getSuperMethodInvocation__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSyntethicMethod__Marker() {
		if (syntethicMethod__MarkerEClass == null) {
			syntethicMethod__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(117);
		}
		return syntethicMethod__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSyntethicMethod__Marker_CONTEXT__SRC__mClass() {
		return (EReference) getSyntethicMethod__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSyntethicMethod__Marker_CONTEXT__SRC__mDef() {
		return (EReference) getSyntethicMethod__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSyntethicMethod__Marker_CREATE__SRC__mSyntethic() {
		return (EReference) getSyntethicMethod__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSyntethicMethod__Marker_CONTEXT__TRG__tClass() {
		return (EReference) getSyntethicMethod__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSyntethicMethod__Marker_CONTEXT__TRG__tDef() {
		return (EReference) getSyntethicMethod__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSyntethicMethod__Marker_CONTEXT__TRG__tSig() {
		return (EReference) getSyntethicMethod__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSyntethicMethod__Marker_CREATE__TRG__tSyntethic() {
		return (EReference) getSyntethicMethod__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSyntethicMethod__Marker_CONTEXT__CORR__mClassDeclarationToTClass() {
		return (EReference) getSyntethicMethod__Marker().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSyntethicMethod__Marker_CONTEXT__CORR__mDefinitionToTMember() {
		return (EReference) getSyntethicMethod__Marker().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSyntethicMethod__Marker_CREATE__CORR__mSyntToTSynt() {
		return (EReference) getSyntethicMethod__Marker().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextAnnotations__Marker() {
		if (textAnnotations__MarkerEClass == null) {
			textAnnotations__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(118);
		}
		return textAnnotations__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextAnnotations__Marker_CREATE__SRC__mComment() {
		return (EReference) getTextAnnotations__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextAnnotations__Marker_CONTEXT__SRC__mMember() {
		return (EReference) getTextAnnotations__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextAnnotations__Marker_CONTEXT__TRG__tMember() {
		return (EReference) getTextAnnotations__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextAnnotations__Marker_CREATE__TRG__tText() {
		return (EReference) getTextAnnotations__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextAnnotations__Marker_CREATE__CORR__mCommentToTText() {
		return (EReference) getTextAnnotations__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextAnnotations__Marker_CONTEXT__CORR__mMemberToTMember() {
		return (EReference) getTextAnnotations__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameter__Marker() {
		if (typeParameter__MarkerEClass == null) {
			typeParameter__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(119);
		}
		return typeParameter__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameter__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getTypeParameter__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameter__Marker_CREATE__SRC__typeParameter() {
		return (EReference) getTypeParameter__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameter__Marker_CONTEXT__TRG__pg() {
		return (EReference) getTypeParameter__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameter__Marker_CREATE__TRG__tClass() {
		return (EReference) getTypeParameter__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameter__Marker_CREATE__CORR__eAnonymousClassDeclarationToTClass() {
		return (EReference) getTypeParameter__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameter__Marker_CONTEXT__CORR__eModelToPg() {
		return (EReference) getTypeParameter__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypesOrphaned__Marker() {
		if (typesOrphaned__MarkerEClass == null) {
			typesOrphaned__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(120);
		}
		return typesOrphaned__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesOrphaned__Marker_CONTEXT__SRC__mModel() {
		return (EReference) getTypesOrphaned__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesOrphaned__Marker_CREATE__SRC__mType() {
		return (EReference) getTypesOrphaned__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesOrphaned__Marker_CONTEXT__TRG__pg() {
		return (EReference) getTypesOrphaned__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesOrphaned__Marker_CREATE__TRG__tType() {
		return (EReference) getTypesOrphaned__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesOrphaned__Marker_CREATE__CORR__mBodyToTAnnotation() {
		return (EReference) getTypesOrphaned__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesOrphaned__Marker_CONTEXT__CORR__mModelToTypeGraph() {
		return (EReference) getTypesOrphaned__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesOrphaned__Marker_CREATE__CORR__mTypeToTType() {
		return (EReference) getTypesOrphaned__Marker().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypesVisibility__Marker() {
		if (typesVisibility__MarkerEClass == null) {
			typesVisibility__MarkerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(ModiscoTGGPackage.eNS_URI)
					.getEClassifiers().get(121);
		}
		return typesVisibility__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesVisibility__Marker_CREATE__SRC__mModifier() {
		return (EReference) getTypesVisibility__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesVisibility__Marker_CONTEXT__SRC__mType() {
		return (EReference) getTypesVisibility__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesVisibility__Marker_CREATE__TRG__tModifier() {
		return (EReference) getTypesVisibility__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesVisibility__Marker_CONTEXT__TRG__tType() {
		return (EReference) getTypesVisibility__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesVisibility__Marker_CREATE__CORR__mModifierToTModifier() {
		return (EReference) getTypesVisibility__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesVisibility__Marker_CONTEXT__CORR__mTypeToTType() {
		return (EReference) getTypesVisibility__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedTypeDeclaration__Marker() {
		if (unresolvedTypeDeclaration__MarkerEClass == null) {
			unresolvedTypeDeclaration__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(122);
		}
		return unresolvedTypeDeclaration__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedTypeDeclaration__Marker_CONTEXT__SRC__eModel() {
		return (EReference) getUnresolvedTypeDeclaration__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedTypeDeclaration__Marker_CREATE__SRC__unresolvedType() {
		return (EReference) getUnresolvedTypeDeclaration__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedTypeDeclaration__Marker_CONTEXT__TRG__pg() {
		return (EReference) getUnresolvedTypeDeclaration__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedTypeDeclaration__Marker_CREATE__TRG__tClass() {
		return (EReference) getUnresolvedTypeDeclaration__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedTypeDeclaration__Marker_CREATE__CORR__eAnonymousClassDeclarationToTClass() {
		return (EReference) getUnresolvedTypeDeclaration__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedTypeDeclaration__Marker_CONTEXT__CORR__eModelToPg() {
		return (EReference) getUnresolvedTypeDeclaration__Marker().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationFragment__Marker() {
		if (variableDeclarationFragment__MarkerEClass == null) {
			variableDeclarationFragment__MarkerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ModiscoTGGPackage.eNS_URI).getEClassifiers().get(123);
		}
		return variableDeclarationFragment__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationFragment__Marker_CONTEXT__SRC__mDefinition() {
		return (EReference) getVariableDeclarationFragment__Marker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationFragment__Marker_CREATE__SRC__varDeclFragment() {
		return (EReference) getVariableDeclarationFragment__Marker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationFragment__Marker_CONTEXT__TRG__tDefinition() {
		return (EReference) getVariableDeclarationFragment__Marker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationFragment__Marker_CONTEXT__CORR__eFieldDeclarationToTFieldDefinition() {
		return (EReference) getVariableDeclarationFragment__Marker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationFragment__Marker_CREATE__CORR__varDeclFragmentToTFieldDefinition() {
		return (EReference) getVariableDeclarationFragment__Marker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModiscoTGGFactory getModiscoTGGFactory() {
		return (ModiscoTGGFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("ModiscoTGG." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ModiscoTGGPackageImpl
