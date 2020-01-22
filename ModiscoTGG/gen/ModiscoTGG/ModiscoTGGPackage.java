/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ModiscoTGG.ModiscoTGGFactory
 * @model kind="package"
 * @generated
 */
public interface ModiscoTGGPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModiscoTGG";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/ModiscoTGG/model/ModiscoTGG.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ModiscoTGG";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModiscoTGGPackage eINSTANCE = ModiscoTGG.impl.ModiscoTGGPackageImpl.init();

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.BooleanLiteralToTBoolNodeImpl <em>Boolean Literal To TBool Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.BooleanLiteralToTBoolNodeImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getBooleanLiteralToTBoolNode()
	 * @generated
	 */
	int BOOLEAN_LITERAL_TO_TBOOL_NODE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_TO_TBOOL_NODE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_TO_TBOOL_NODE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Boolean Literal To TBool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_TO_TBOOL_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Boolean Literal To TBool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_TO_TBOOL_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.NumberLiteralToTNumberNodeImpl <em>Number Literal To TNumber Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.NumberLiteralToTNumberNodeImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getNumberLiteralToTNumberNode()
	 * @generated
	 */
	int NUMBER_LITERAL_TO_TNUMBER_NODE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_TO_TNUMBER_NODE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_TO_TNUMBER_NODE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Number Literal To TNumber Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_TO_TNUMBER_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Number Literal To TNumber Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_TO_TNUMBER_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.StringLiteralToTTextNodeImpl <em>String Literal To TText Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.StringLiteralToTTextNodeImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getStringLiteralToTTextNode()
	 * @generated
	 */
	int STRING_LITERAL_TO_TTEXT_NODE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_TO_TTEXT_NODE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_TO_TTEXT_NODE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>String Literal To TText Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_TO_TTEXT_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String Literal To TText Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_TO_TTEXT_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ClassLiteralToClassNodeImpl <em>Class Literal To Class Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ClassLiteralToClassNodeImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getClassLiteralToClassNode()
	 * @generated
	 */
	int CLASS_LITERAL_TO_CLASS_NODE = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LITERAL_TO_CLASS_NODE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LITERAL_TO_CLASS_NODE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Class Literal To Class Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LITERAL_TO_CLASS_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class Literal To Class Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LITERAL_TO_CLASS_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ClassDeclarationToTClassImpl <em>Class Declaration To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ClassDeclarationToTClassImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getClassDeclarationToTClass()
	 * @generated
	 */
	int CLASS_DECLARATION_TO_TCLASS = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_TO_TCLASS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_TO_TCLASS__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Class Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_TO_TCLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_TO_TCLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.PackageToTPackageImpl <em>Package To TPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.PackageToTPackageImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getPackageToTPackage()
	 * @generated
	 */
	int PACKAGE_TO_TPACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_TPACKAGE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_TPACKAGE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Package To TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_TPACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Package To TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_TPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ModelToTypeGraphImpl <em>Model To Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ModelToTypeGraphImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getModelToTypeGraph()
	 * @generated
	 */
	int MODEL_TO_TYPE_GRAPH = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_TYPE_GRAPH__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_TYPE_GRAPH__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Model To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_TYPE_GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model To Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_TYPE_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.InterfaceDeclarationToTInterfaceImpl <em>Interface Declaration To TInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.InterfaceDeclarationToTInterfaceImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getInterfaceDeclarationToTInterface()
	 * @generated
	 */
	int INTERFACE_DECLARATION_TO_TINTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_TO_TINTERFACE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_TO_TINTERFACE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Interface Declaration To TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_TO_TINTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Declaration To TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_TO_TINTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MDefinitionToTMemberImpl <em>MDefinition To TMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MDefinitionToTMemberImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMDefinitionToTMember()
	 * @generated
	 */
	int MDEFINITION_TO_TMEMBER = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TMEMBER__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TMEMBER__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MDefinition To TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TMEMBER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MDefinition To TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_TO_TMEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.FieldAccessToTAccessImpl <em>Field Access To TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.FieldAccessToTAccessImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getFieldAccessToTAccess()
	 * @generated
	 */
	int FIELD_ACCESS_TO_TACCESS = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_TO_TACCESS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_TO_TACCESS__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Field Access To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_TO_TACCESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field Access To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_TO_TACCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.PrimitiveTypeToTClassImpl <em>Primitive Type To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.PrimitiveTypeToTClassImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getPrimitiveTypeToTClass()
	 * @generated
	 */
	int PRIMITIVE_TYPE_TO_TCLASS = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_TO_TCLASS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_TO_TCLASS__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Primitive Type To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_TO_TCLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Primitive Type To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_TO_TCLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnonymousClassDeclarationToTClassImpl <em>Anonymous Class Declaration To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnonymousClassDeclarationToTClassImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Anonymous Class Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Anonymous Class Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_TO_TCLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MMethodNameToTMethodImpl <em>MMethod Name To TMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MMethodNameToTMethodImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMMethodNameToTMethod()
	 * @generated
	 */
	int MMETHOD_NAME_TO_TMETHOD = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_TO_TMETHOD__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_TO_TMETHOD__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MMethod Name To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_TO_TMETHOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MMethod Name To TMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_TO_TMETHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MEntryToTParameterImpl <em>MEntry To TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MEntryToTParameterImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMEntryToTParameter()
	 * @generated
	 */
	int MENTRY_TO_TPARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_TO_TPARAMETER__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_TO_TPARAMETER__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MEntry To TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_TO_TPARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MEntry To TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_TO_TPARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MSignatureToTSignatureImpl <em>MSignature To TSignature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MSignatureToTSignatureImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMSignatureToTSignature()
	 * @generated
	 */
	int MSIGNATURE_TO_TSIGNATURE = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TSIGNATURE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TSIGNATURE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MSignature To TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TSIGNATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MSignature To TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_TO_TSIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ASTNodeToTAnnotatableImpl <em>AST Node To TAnnotatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ASTNodeToTAnnotatableImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getASTNodeToTAnnotatable()
	 * @generated
	 */
	int AST_NODE_TO_TANNOTATABLE = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_TO_TANNOTATABLE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_TO_TANNOTATABLE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>AST Node To TAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_TO_TANNOTATABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>AST Node To TAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_TO_TANNOTATABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.TypeToTAbstractTypeImpl <em>Type To TAbstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.TypeToTAbstractTypeImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getTypeToTAbstractType()
	 * @generated
	 */
	int TYPE_TO_TABSTRACT_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TABSTRACT_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TABSTRACT_TYPE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Type To TAbstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TABSTRACT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type To TAbstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TO_TABSTRACT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MFieldNameToTFieldImpl <em>MField Name To TField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MFieldNameToTFieldImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMFieldNameToTField()
	 * @generated
	 */
	int MFIELD_NAME_TO_TFIELD = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_TO_TFIELD__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_TO_TFIELD__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MField Name To TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_TO_TFIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MField Name To TField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_TO_TFIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.LineCommentToTTextAnnotationImpl <em>Line Comment To TText Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.LineCommentToTTextAnnotationImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getLineCommentToTTextAnnotation()
	 * @generated
	 */
	int LINE_COMMENT_TO_TTEXT_ANNOTATION = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT_TO_TTEXT_ANNOTATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT_TO_TTEXT_ANNOTATION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Line Comment To TText Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT_TO_TTEXT_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Line Comment To TText Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT_TO_TTEXT_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MSingleVariableAccessToTAccessImpl <em>MSingle Variable Access To TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MSingleVariableAccessToTAccessImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMSingleVariableAccessToTAccess()
	 * @generated
	 */
	int MSINGLE_VARIABLE_ACCESS_TO_TACCESS = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS_TO_TACCESS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS_TO_TACCESS__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MSingle Variable Access To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS_TO_TACCESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MSingle Variable Access To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS_TO_TACCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationToTAnnotationImpl <em>Annotation To TAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationToTAnnotationImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationToTAnnotation()
	 * @generated
	 */
	int ANNOTATION_TO_TANNOTATION = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TO_TANNOTATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TO_TANNOTATION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Annotation To TAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TO_TANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation To TAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TO_TANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.TypeParameterToTClassImpl <em>Type Parameter To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.TypeParameterToTClassImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getTypeParameterToTClass()
	 * @generated
	 */
	int TYPE_PARAMETER_TO_TCLASS = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_TO_TCLASS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_TO_TCLASS__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Type Parameter To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_TO_TCLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type Parameter To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_TO_TCLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.UnresolvedTypeDeclarationToTClassImpl <em>Unresolved Type Declaration To TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.UnresolvedTypeDeclarationToTClassImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getUnresolvedTypeDeclarationToTClass()
	 * @generated
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS = 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Unresolved Type Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unresolved Type Declaration To TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_TO_TCLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ModifierToTClassEntityImpl <em>Modifier To TClass Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ModifierToTClassEntityImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getModifierToTClassEntity()
	 * @generated
	 */
	int MODIFIER_TO_TCLASS_ENTITY = 23;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TCLASS_ENTITY__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TCLASS_ENTITY__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Modifier To TClass Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TCLASS_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modifier To TClass Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TCLASS_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ModifierToTFieldEntityImpl <em>Modifier To TField Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ModifierToTFieldEntityImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getModifierToTFieldEntity()
	 * @generated
	 */
	int MODIFIER_TO_TFIELD_ENTITY = 24;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TFIELD_ENTITY__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TFIELD_ENTITY__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Modifier To TField Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TFIELD_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modifier To TField Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TFIELD_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ModifierToTMethodEntityImpl <em>Modifier To TMethod Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ModifierToTMethodEntityImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getModifierToTMethodEntity()
	 * @generated
	 */
	int MODIFIER_TO_TMETHOD_ENTITY = 25;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TMETHOD_ENTITY__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TMETHOD_ENTITY__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Modifier To TMethod Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TMETHOD_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modifier To TMethod Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_TMETHOD_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ModifierToAbstractTypeImpl <em>Modifier To Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ModifierToAbstractTypeImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getModifierToAbstractType()
	 * @generated
	 */
	int MODIFIER_TO_ABSTRACT_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_ABSTRACT_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_ABSTRACT_TYPE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Modifier To Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_ABSTRACT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modifier To Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_TO_ABSTRACT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MModifierToTModifierImpl <em>MModifier To TModifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MModifierToTModifierImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMModifierToTModifier()
	 * @generated
	 */
	int MMODIFIER_TO_TMODIFIER = 27;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODIFIER_TO_TMODIFIER__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODIFIER_TO_TMODIFIER__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MModifier To TModifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODIFIER_TO_TMODIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MModifier To TModifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMODIFIER_TO_TMODIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MSyntethicMethodToTSyntethicMethodImpl <em>MSyntethic Method To TSyntethic Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MSyntethicMethodToTSyntethicMethodImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMSyntethicMethodToTSyntethicMethod()
	 * @generated
	 */
	int MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD = 28;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MSyntethic Method To TSyntethic Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MSyntethic Method To TSyntethic Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationMemberValuePairToTAnnotationValueImpl <em>Annotation Member Value Pair To TAnnotation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationMemberValuePairToTAnnotationValueImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = 29;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Annotation Member Value Pair To TAnnotation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation Member Value Pair To TAnnotation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.StaticTypeToAccessStaticTypeImpl <em>Static Type To Access Static Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.StaticTypeToAccessStaticTypeImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getStaticTypeToAccessStaticType()
	 * @generated
	 */
	int STATIC_TYPE_TO_ACCESS_STATIC_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TYPE_TO_ACCESS_STATIC_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TYPE_TO_ACCESS_STATIC_TYPE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Static Type To Access Static Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TYPE_TO_ACCESS_STATIC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Static Type To Access Static Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TYPE_TO_ACCESS_STATIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MFlowToTFlowImpl <em>MFlow To TFlow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MFlowToTFlowImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMFlowToTFlow()
	 * @generated
	 */
	int MFLOW_TO_TFLOW = 31;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW_TO_TFLOW__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW_TO_TFLOW__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MFlow To TFlow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW_TO_TFLOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MFlow To TFlow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW_TO_TFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MAbstractFlowElementToTAbstractFlowElementImpl <em>MAbstract Flow Element To TAbstract Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MAbstractFlowElementToTAbstractFlowElementImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMAbstractFlowElementToTAbstractFlowElement()
	 * @generated
	 */
	int MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT = 32;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MAbstract Flow Element To TAbstract Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MAbstract Flow Element To TAbstract Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AbstractMethodInvocationToTAccessImpl <em>Abstract Method Invocation To TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AbstractMethodInvocationToTAccessImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAbstractMethodInvocationToTAccess()
	 * @generated
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS = 33;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Abstract Method Invocation To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Method Invocation To TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_TO_TACCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.VariableDeclarationFragmentToTFieldDefinitionImpl <em>Variable Declaration Fragment To TField Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.VariableDeclarationFragmentToTFieldDefinitionImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getVariableDeclarationFragmentToTFieldDefinition()
	 * @generated
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION = 34;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Variable Declaration Fragment To TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Declaration Fragment To TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationMemberKey__MarkerImpl <em>Annotation Member Key Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationMemberKey__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationMemberKey__Marker()
	 * @generated
	 */
	int ANNOTATION_MEMBER_KEY_MARKER = 35;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_KEY_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_SRC_ANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_KEY_MARKER__CREATE_SRC_MVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_TRG_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_KEY_MARKER__CREATE_TRG_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_KEY_MARKER__CREATE_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Annotation Member Key Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_KEY_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Annotation Member Key Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_KEY_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationMemberValueAnnotation__MarkerImpl <em>Annotation Member Value Annotation Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationMemberValueAnnotation__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationMemberValueAnnotation__Marker()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_MARKER = 36;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_MARKER__CONTEXT_SRC_ANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_MARKER__CREATE_SRC_MVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_MARKER__CONTEXT_TRG_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_MARKER__CREATE_TRG_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_MARKER__CREATE_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Annotation Member Value Annotation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Annotation Member Value Annotation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationMemberValueAnnotationArray__MarkerImpl <em>Annotation Member Value Annotation Array Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationMemberValueAnnotationArray__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationMemberValueAnnotationArray__Marker()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER = 37;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mArray</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MARRAY = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_TRG_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Annotation Member Value Annotation Array Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The number of operations of the '<em>Annotation Member Value Annotation Array Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationMemberValueBoolean__MarkerImpl <em>Annotation Member Value Boolean Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationMemberValueBoolean__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationMemberValueBoolean__Marker()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_MARKER = 38;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_MARKER__CONTEXT_SRC_ANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_MARKER__CREATE_SRC_MVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_MARKER__CONTEXT_TRG_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_MARKER__CREATE_TRG_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mValue To TValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_MARKER__CREATE_CORR_MVALUE_TO_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Annotation Member Value Boolean Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Annotation Member Value Boolean Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationMemberValueBooleanArray__MarkerImpl <em>Annotation Member Value Boolean Array Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationMemberValueBooleanArray__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationMemberValueBooleanArray__Marker()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER = 39;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mArray</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MARRAY = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_TRG_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mValue To TValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_CORR_MVALUE_TO_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Annotation Member Value Boolean Array Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The number of operations of the '<em>Annotation Member Value Boolean Array Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationMemberValueClass__MarkerImpl <em>Annotation Member Value Class Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationMemberValueClass__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationMemberValueClass__Marker()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER = 40;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_ANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE TRG tValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_TRG_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CREATE CORR mValue To TValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_CORR_MVALUE_TO_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The number of structural features of the '<em>Annotation Member Value Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Annotation Member Value Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationMemberValueClassArray__MarkerImpl <em>Annotation Member Value Class Array Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationMemberValueClassArray__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationMemberValueClassArray__Marker()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER = 41;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER__CREATE_SRC_MACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mArray</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER__CREATE_SRC_MARRAY = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER__CONTEXT_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER__CREATE_SRC_MVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER__CONTEXT_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE TRG tValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER__CREATE_TRG_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>CREATE CORR mValue To TValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER__CREATE_CORR_MVALUE_TO_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 10;

	/**
	 * The number of structural features of the '<em>Annotation Member Value Class Array Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 11;

	/**
	 * The number of operations of the '<em>Annotation Member Value Class Array Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_CLASS_ARRAY_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationMemberValueNumber__MarkerImpl <em>Annotation Member Value Number Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationMemberValueNumber__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationMemberValueNumber__Marker()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_MARKER = 42;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_MARKER__CONTEXT_SRC_ANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_MARKER__CREATE_SRC_MVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_MARKER__CONTEXT_TRG_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_MARKER__CREATE_TRG_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_MARKER__CREATE_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Annotation Member Value Number Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Annotation Member Value Number Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationMemberValueNumberArray__MarkerImpl <em>Annotation Member Value Number Array Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationMemberValueNumberArray__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationMemberValueNumberArray__Marker()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER = 43;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mArray</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER__CREATE_SRC_MARRAY = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER__CREATE_SRC_MVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER__CREATE_TRG_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER__CREATE_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Annotation Member Value Number Array Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The number of operations of the '<em>Annotation Member Value Number Array Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationMemberValueString__MarkerImpl <em>Annotation Member Value String Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationMemberValueString__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationMemberValueString__Marker()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_MARKER = 44;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_MARKER__CONTEXT_SRC_ANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_MARKER__CREATE_SRC_MVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_MARKER__CONTEXT_TRG_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_MARKER__CREATE_TRG_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_MARKER__CREATE_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Annotation Member Value String Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Annotation Member Value String Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationMemberValueStringArray__MarkerImpl <em>Annotation Member Value String Array Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationMemberValueStringArray__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationMemberValueStringArray__Marker()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER = 45;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mArray</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER__CREATE_SRC_MARRAY = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER__CREATE_SRC_MVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER__CREATE_TRG_TVALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER__CREATE_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Annotation Member Value String Array Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The number of operations of the '<em>Annotation Member Value String Array Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_STRING_ARRAY_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationOnBodyDeclaration__MarkerImpl <em>Annotation On Body Declaration Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationOnBodyDeclaration__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationOnBodyDeclaration__Marker()
	 * @generated
	 */
	int ANNOTATION_ON_BODY_DECLARATION_MARKER = 46;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ON_BODY_DECLARATION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_SRC_ANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC ast Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_SRC_AST_NODE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_TRG_TANNOTABLE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_TRG_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR Annotation To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_CORR_ANNOTATION_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR aST Node To TAnnotable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_CORR_AST_NODE_TO_TANNOTABLE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Annotation On Body Declaration Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ON_BODY_DECLARATION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Annotation On Body Declaration Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ON_BODY_DECLARATION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationType__MarkerImpl <em>Annotation Type Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationType__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationType__Marker()
	 * @generated
	 */
	int ANNOTATION_TYPE_MARKER = 47;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MARKER__CONTEXT_SRC_MPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MARKER__CREATE_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MARKER__CONTEXT_TRG_TPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MARKER__CREATE_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mPackage To TPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MARKER__CONTEXT_CORR_MPACKAGE_TO_TPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MARKER__CREATE_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Annotation Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Annotation Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationTypeAccess__MarkerImpl <em>Annotation Type Access Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationTypeAccess__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationTypeAccess__Marker()
	 * @generated
	 */
	int ANNOTATION_TYPE_ACCESS_MARKER = 48;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ACCESS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ACCESS_MARKER__CREATE_SRC_MACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR Annotation Type To TAnnotation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TYPE_TO_TANNOTATION_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Annotation Type Access Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ACCESS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Annotation Type Access Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ACCESS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationTypeInAnonymous__MarkerImpl <em>Annotation Type In Anonymous Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationTypeInAnonymous__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationTypeInAnonymous__Marker()
	 * @generated
	 */
	int ANNOTATION_TYPE_IN_ANONYMOUS_MARKER = 49;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_IN_ANONYMOUS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eAnonymous Class Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_IN_ANONYMOUS_MARKER__CONTEXT_SRC_EANONYMOUS_CLASS_DECLARATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_IN_ANONYMOUS_MARKER__CREATE_SRC_MNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_IN_ANONYMOUS_MARKER__CREATE_TRG_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_IN_ANONYMOUS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mNested Type To TNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_IN_ANONYMOUS_MARKER__CREATE_CORR_MNESTED_TYPE_TO_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mbody To TAnnotatable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_IN_ANONYMOUS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATABLE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The number of structural features of the '<em>Annotation Type In Anonymous Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_IN_ANONYMOUS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Annotation Type In Anonymous Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_IN_ANONYMOUS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnnotationTypeNested__MarkerImpl <em>Annotation Type Nested Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnnotationTypeNested__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnnotationTypeNested__Marker()
	 * @generated
	 */
	int ANNOTATION_TYPE_NESTED_MARKER = 50;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC eNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER__CREATE_SRC_ENESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eOuter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER__CONTEXT_SRC_EOUTER_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNested Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER__CREATE_TRG_TNESTED_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER__CREATE_TRG_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOuter Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER__CONTEXT_TRG_TOUTER_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOuter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER__CONTEXT_TRG_TOUTER_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR eNested Type To TNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER__CREATE_CORR_ENESTED_TYPE_TO_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eOuter Type To TOuter Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER__CONTEXT_CORR_EOUTER_TYPE_TO_TOUTER_INTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The number of structural features of the '<em>Annotation Type Nested Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Annotation Type Nested Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_NESTED_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnonymousClass__MarkerImpl <em>Anonymous Class Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnonymousClass__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnonymousClass__Marker()
	 * @generated
	 */
	int ANONYMOUS_CLASS_MARKER = 51;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mAnonymous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_MARKER__CREATE_SRC_MANONYMOUS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_MARKER__CONTEXT_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAnonymous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_MARKER__CREATE_TRG_TANONYMOUS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNew Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_MARKER__CREATE_TRG_TNEW_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Anonymous Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Anonymous Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnonymousClassTypeClass__MarkerImpl <em>Anonymous Class Type Class Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnonymousClassTypeClass__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnonymousClassTypeClass__Marker()
	 * @generated
	 */
	int ANONYMOUS_CLASS_TYPE_CLASS_MARKER = 52;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_CLASS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mAnonymous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MANONYMOUS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mCreation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MCREATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MPARENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TPARENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR parent To Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_PARENT_TO_PARENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The number of structural features of the '<em>Anonymous Class Type Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_CLASS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Anonymous Class Type Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_CLASS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.AnonymousClassTypeInterface__MarkerImpl <em>Anonymous Class Type Interface Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.AnonymousClassTypeInterface__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getAnonymousClassTypeInterface__Marker()
	 * @generated
	 */
	int ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER = 53;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mAnonymous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER__CONTEXT_SRC_MANONYMOUS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mCreation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER__CREATE_SRC_MCREATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER__CONTEXT_SRC_MPARENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CREATE SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER__CREATE_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER__CONTEXT_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER__CONTEXT_TRG_TPARENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR parent To Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER__CONTEXT_CORR_PARENT_TO_PARENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The number of structural features of the '<em>Anonymous Class Type Interface Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Anonymous Class Type Interface Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_TYPE_INTERFACE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ArrayInitializerIgnoreExpressionsEdge__MarkerImpl <em>Array Initializer Ignore Expressions Edge Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ArrayInitializerIgnoreExpressionsEdge__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getArrayInitializerIgnoreExpressionsEdge__Marker()
	 * @generated
	 */
	int ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER = 54;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_ARRAY = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_INVOCATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>Array Initializer Ignore Expressions Edge Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Array Initializer Ignore Expressions Edge Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ArrayTypeToClass__MarkerImpl <em>Array Type To Class Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ArrayTypeToClass__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getArrayTypeToClass__Marker()
	 * @generated
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER = 55;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC eArray Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_EARRAY_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE SRC eType Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tArray Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TARRAY_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR eArray Type To TArray Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER__CREATE_CORR_EARRAY_TYPE_TO_TARRAY_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eType To TArray Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TARRAY_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The number of structural features of the '<em>Array Type To Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Array Type To Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_TO_CLASS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.Class__MarkerImpl <em>Class Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.Class__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getClass__Marker()
	 * @generated
	 */
	int CLASS_MARKER = 56;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MARKER__CONTEXT_SRC_MPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MARKER__CREATE_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MARKER__CONTEXT_TRG_TPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MARKER__CREATE_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mClass Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MARKER__CREATE_CORR_MCLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mPackage To TPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MARKER__CONTEXT_CORR_MPACKAGE_TO_TPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MARKER__CREATE_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ClassExtendsClass__MarkerImpl <em>Class Extends Class Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ClassExtendsClass__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getClassExtendsClass__Marker()
	 * @generated
	 */
	int CLASS_EXTENDS_CLASS_MARKER = 57;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXTENDS_CLASS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eClass Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_ECLASS_DECLARATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eExtended Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_EEXTENDED_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC eType Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXTENDS_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tExtended Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TEXTENDED_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eClass Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eExtended Class To TExtended Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_EEXTENDED_CLASS_TO_TEXTENDED_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Class Extends Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXTENDS_CLASS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Class Extends Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXTENDS_CLASS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ClassImplementsInterface__MarkerImpl <em>Class Implements Interface Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ClassImplementsInterface__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getClassImplementsInterface__Marker()
	 * @generated
	 */
	int CLASS_IMPLEMENTS_INTERFACE_MARKER = 58;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IMPLEMENTS_INTERFACE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eClass Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ECLASS_DECLARATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eSuper Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC eType Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IMPLEMENTS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tSuper Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eClass Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eSuper Interface To TSuper Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Class Implements Interface Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IMPLEMENTS_INTERFACE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Class Implements Interface Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IMPLEMENTS_INTERFACE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ClassInAnonymous__MarkerImpl <em>Class In Anonymous Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ClassInAnonymous__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getClassInAnonymous__Marker()
	 * @generated
	 */
	int CLASS_IN_ANONYMOUS_MARKER = 59;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_ANONYMOUS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eAnonymous Class Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_ANONYMOUS_MARKER__CONTEXT_SRC_EANONYMOUS_CLASS_DECLARATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_ANONYMOUS_MARKER__CREATE_SRC_MNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_ANONYMOUS_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_ANONYMOUS_MARKER__CONTEXT_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_ANONYMOUS_MARKER__CREATE_TRG_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_ANONYMOUS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mClass Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_ANONYMOUS_MARKER__CREATE_CORR_MCLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mNested Type To TNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_ANONYMOUS_MARKER__CREATE_CORR_MNESTED_TYPE_TO_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CREATE CORR mbody To TAnnotatable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_ANONYMOUS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATABLE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The number of structural features of the '<em>Class In Anonymous Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_ANONYMOUS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Class In Anonymous Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IN_ANONYMOUS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ClassInnerAnonClassMember__MarkerImpl <em>Class Inner Anon Class Member Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ClassInnerAnonClassMember__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getClassInnerAnonClassMember__Marker()
	 * @generated
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER = 60;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eOuter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER__CONTEXT_SRC_EOUTER_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER__CONTEXT_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mInner Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER__CREATE_SRC_MINNER_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tInner Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tInner Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOuter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOuter Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eOuter Class To TOuter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER__CONTEXT_CORR_EOUTER_CLASS_TO_TOUTER_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CREATE CORR tInner Class To TInner Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_CLASS_TO_TINNER_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>CREATE CORR tInner Type To TInner Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_TYPE_TO_TINNER_ABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 10;

	/**
	 * The number of structural features of the '<em>Class Inner Anon Class Member Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Class Inner Anon Class Member Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_ANON_CLASS_MEMBER_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl <em>Class Inner Class Member Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getClassInnerClassMember__Marker()
	 * @generated
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER = 61;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eOuter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_EOUTER_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mInner Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_SRC_MINNER_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tInner Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tInner Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOuter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOuter Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eOuter Class To TOuter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_CORR_EOUTER_CLASS_TO_TOUTER_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CREATE CORR tInner Class To TInner Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_CLASS_TO_TINNER_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>CREATE CORR tInner Type To TInner Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_TYPE_TO_TINNER_ABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 10;

	/**
	 * The number of structural features of the '<em>Class Inner Class Member Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Class Inner Class Member Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INNER_CLASS_MEMBER_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ClassInstanceCreation__MarkerImpl <em>Class Instance Creation Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ClassInstanceCreation__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getClassInstanceCreation__Marker()
	 * @generated
	 */
	int CLASS_INSTANCE_CREATION_MARKER = 62;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER__CREATE_SRC_INVOCATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER__CONTEXT_SRC_MMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER__CONTEXT_SRC_MMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER__CREATE_TRG_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER__CONTEXT_TRG_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR invocation To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMethod To TMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The number of structural features of the '<em>Class Instance Creation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Class Instance Creation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ConstructorDefinition__MarkerImpl <em>Constructor Definition Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ConstructorDefinition__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getConstructorDefinition__Marker()
	 * @generated
	 */
	int CONSTRUCTOR_DEFINITION_MARKER = 63;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_MARKER__CREATE_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_TRG_TMETHOD_SIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mDefinition To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mSignature To TMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TMETHOD_SIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The number of structural features of the '<em>Constructor Definition Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Constructor Definition Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ConstructorInvocation__MarkerImpl <em>Constructor Invocation Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ConstructorInvocation__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getConstructorInvocation__Marker()
	 * @generated
	 */
	int CONSTRUCTOR_INVOCATION_MARKER = 64;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER__CREATE_SRC_INVOCATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER__CREATE_TRG_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR invocation To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMethod To TMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The number of structural features of the '<em>Constructor Invocation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Constructor Invocation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.Enum__MarkerImpl <em>Enum Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.Enum__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getEnum__Marker()
	 * @generated
	 */
	int ENUM_MARKER = 65;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MARKER__CONTEXT_SRC_MPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MARKER__CREATE_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MARKER__CREATE_TRG_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MARKER__CONTEXT_TRG_TPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MARKER__CREATE_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mPackage To TPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MARKER__CONTEXT_CORR_MPACKAGE_TO_TPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MARKER__CREATE_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Enum Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Enum Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.EnumInAnonymous__MarkerImpl <em>Enum In Anonymous Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.EnumInAnonymous__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getEnumInAnonymous__Marker()
	 * @generated
	 */
	int ENUM_IN_ANONYMOUS_MARKER = 66;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_IN_ANONYMOUS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eAnonymous Class Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_IN_ANONYMOUS_MARKER__CONTEXT_SRC_EANONYMOUS_CLASS_DECLARATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_IN_ANONYMOUS_MARKER__CREATE_SRC_MNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_IN_ANONYMOUS_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_IN_ANONYMOUS_MARKER__CREATE_TRG_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_IN_ANONYMOUS_MARKER__CONTEXT_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_IN_ANONYMOUS_MARKER__CREATE_TRG_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_IN_ANONYMOUS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mNested Type To TNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_IN_ANONYMOUS_MARKER__CREATE_CORR_MNESTED_TYPE_TO_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CREATE CORR mbody To TAnnotatable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_IN_ANONYMOUS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATABLE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The number of structural features of the '<em>Enum In Anonymous Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_IN_ANONYMOUS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Enum In Anonymous Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_IN_ANONYMOUS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.FieldAccessRead__MarkerImpl <em>Field Access Read Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.FieldAccessRead__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getFieldAccessRead__Marker()
	 * @generated
	 */
	int FIELD_ACCESS_READ_MARKER = 67;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CREATE_SRC_MACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CONTEXT_SRC_MFIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CONTEXT_SRC_MMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CONTEXT_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC var Decl Frag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CONTEXT_SRC_VAR_DECL_FRAG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CREATE_TRG_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CONTEXT_TRG_TFIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CONTEXT_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>CREATE CORR mAccess To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CREATE_CORR_MACCESS_TO_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Owner To TFlow Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CREATE_CORR_MFLOW_OWNER_TO_TFLOW_OWNER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMethod To TMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 12;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Field Access Read Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Field Access Read Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.FieldAccessReadWrite__MarkerImpl <em>Field Access Read Write Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.FieldAccessReadWrite__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER = 68;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CREATE_SRC_MACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CONTEXT_SRC_MFIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CONTEXT_SRC_MMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CONTEXT_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC var Decl Frag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CONTEXT_SRC_VAR_DECL_FRAG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CREATE_TRG_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CONTEXT_TRG_TFIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CONTEXT_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>CREATE CORR mAccess To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CREATE_CORR_MACCESS_TO_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Owner To TFlow Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CREATE_CORR_MFLOW_OWNER_TO_TFLOW_OWNER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMethod To TMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 12;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 13;

	/**
	 * The number of structural features of the '<em>Field Access Read Write Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Field Access Read Write Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_READ_WRITE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl <em>Field Access Write Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.FieldAccessWrite__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getFieldAccessWrite__Marker()
	 * @generated
	 */
	int FIELD_ACCESS_WRITE_MARKER = 69;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CREATE_SRC_MACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MFIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC var Decl Frag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_VAR_DECL_FRAG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CREATE_TRG_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TFIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>CREATE CORR mAccess To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MACCESS_TO_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Owner To TFlow Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MFLOW_OWNER_TO_TFLOW_OWNER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMethod To TMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 12;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Field Access Write Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Field Access Write Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_WRITE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.FieldDefinition__MarkerImpl <em>Field Definition Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.FieldDefinition__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getFieldDefinition__Marker()
	 * @generated
	 */
	int FIELD_DEFINITION_MARKER = 70;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_MARKER__CREATE_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_MARKER__CREATE_TRG_TDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tField Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mDefinition To TDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mDefinition To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mSignature To TField Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The number of structural features of the '<em>Field Definition Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Field Definition Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.FieldName__MarkerImpl <em>Field Name Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.FieldName__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getFieldName__Marker()
	 * @generated
	 */
	int FIELD_NAME_MARKER = 71;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mField Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_MARKER__CREATE_SRC_MFIELD_NAME = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_MARKER__CONTEXT_SRC_MODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_MARKER__CREATE_TRG_TFIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR eField Declaration To TField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_MARKER__CREATE_CORR_EFIELD_DECLARATION_TO_TFIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR model To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Field Name Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Field Name Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_NAME_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.FieldSignature__MarkerImpl <em>Field Signature Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.FieldSignature__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getFieldSignature__Marker()
	 * @generated
	 */
	int FIELD_SIGNATURE_MARKER = 72;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SIGNATURE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mField Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SIGNATURE_MARKER__CONTEXT_SRC_MFIELD_NAME = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SIGNATURE_MARKER__CONTEXT_TRG_TFIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eField Declaration To TField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SIGNATURE_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mSignature To TSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Field Signature Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SIGNATURE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Field Signature Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SIGNATURE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.FieldType__MarkerImpl <em>Field Type Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.FieldType__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getFieldType__Marker()
	 * @generated
	 */
	int FIELD_TYPE_MARKER = 73;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC ePrimitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_MARKER__CONTEXT_SRC_EPRIMITIVE_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tField Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tPrimitiv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_MARKER__CONTEXT_TRG_TPRIMITIV = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR ePrimitive Type To TPrimitiv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_MARKER__CONTEXT_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIV = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mSignature To TField Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Field Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Field Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.Flow__MarkerImpl <em>Flow Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.Flow__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getFlow__Marker()
	 * @generated
	 */
	int FLOW_MARKER = 74;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MARKER__CREATE_SRC_MFLOW = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mOwner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MARKER__CONTEXT_SRC_MOWNER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MARKER__CREATE_TRG_TFLOW = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOwner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MARKER__CONTEXT_TRG_TOWNER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow To TFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MARKER__CREATE_CORR_MFLOW_TO_TFLOW = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mOwner To TOwner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MARKER__CONTEXT_CORR_MOWNER_TO_TOWNER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Flow Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Flow Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.IncomingFlow__MarkerImpl <em>Incoming Flow Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.IncomingFlow__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getIncomingFlow__Marker()
	 * @generated
	 */
	int INCOMING_FLOW_MARKER = 75;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_FLOW_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_FLOW_MARKER__CONTEXT_SRC_MFLOW = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mSource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_FLOW_MARKER__CONTEXT_SRC_MSOURCE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_FLOW_MARKER__CONTEXT_TRG_TFLOW = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tSource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_FLOW_MARKER__CONTEXT_TRG_TSOURCE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mFlow To TFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mSource To TSource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_FLOW_MARKER__CONTEXT_CORR_MSOURCE_TO_TSOURCE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Incoming Flow Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_FLOW_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Incoming Flow Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_FLOW_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.Interface__MarkerImpl <em>Interface Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.Interface__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getInterface__Marker()
	 * @generated
	 */
	int INTERFACE_MARKER = 76;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MARKER__CONTEXT_SRC_MPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MARKER__CREATE_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MARKER__CONTEXT_TRG_TPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MARKER__CREATE_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mInterface Declarationto TInterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mPackage To TPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MARKER__CONTEXT_CORR_MPACKAGE_TO_TPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MARKER__CREATE_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Interface Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Interface Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.InterfaceExtendsInterface__MarkerImpl <em>Interface Extends Interface Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.InterfaceExtendsInterface__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getInterfaceExtendsInterface__Marker()
	 * @generated
	 */
	int INTERFACE_EXTENDS_INTERFACE_MARKER = 77;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EXTENDS_INTERFACE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eInterface Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_EINTERFACE_DECLARATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eSuper Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC eType Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EXTENDS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tInterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TINTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tSuper Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eInterface Declaration To TInterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_EINTERFACE_DECLARATION_TO_TINTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eSuper Interface To TSuper Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Interface Extends Interface Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EXTENDS_INTERFACE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Interface Extends Interface Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EXTENDS_INTERFACE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.InterfaceInAnonymous__MarkerImpl <em>Interface In Anonymous Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.InterfaceInAnonymous__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getInterfaceInAnonymous__Marker()
	 * @generated
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER = 78;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eAnonymous Class Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_SRC_EANONYMOUS_CLASS_DECLARATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER__CREATE_SRC_MNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER__CREATE_TRG_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mInterface Declarationto TInterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mNested Type To TNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MNESTED_TYPE_TO_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CREATE CORR mbody To TAnnotatable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATABLE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The number of structural features of the '<em>Interface In Anonymous Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Interface In Anonymous Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IN_ANONYMOUS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.InterfaceMember__MarkerImpl <em>Interface Member Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.InterfaceMember__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getInterfaceMember__Marker()
	 * @generated
	 */
	int INTERFACE_MEMBER_MARKER = 79;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MEMBER_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MEMBER_MARKER__CONTEXT_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mInterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MEMBER_MARKER__CONTEXT_SRC_MINTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MEMBER_MARKER__CREATE_SRC_MMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tInterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MEMBER_MARKER__CONTEXT_TRG_TINTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MEMBER_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE TRG tModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MEMBER_MARKER__CREATE_TRG_TMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR def To Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MEMBER_MARKER__CONTEXT_CORR_DEF_TO_MEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mModifier To TModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MEMBER_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MEMBER_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Interface Member Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MEMBER_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Interface Member Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MEMBER_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.LinkDefinitionToAnonymous__MarkerImpl <em>Link Definition To Anonymous Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.LinkDefinitionToAnonymous__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getLinkDefinitionToAnonymous__Marker()
	 * @generated
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER = 80;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mDefinition To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mSignature To TSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The number of structural features of the '<em>Link Definition To Anonymous Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Link Definition To Anonymous Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_ANONYMOUS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.LinkDefinitionToType__MarkerImpl <em>Link Definition To Type Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.LinkDefinitionToType__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getLinkDefinitionToType__Marker()
	 * @generated
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER = 81;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER__CONTEXT_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER__CONTEXT_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER__CONTEXT_TRG_TDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER__CONTEXT_TRG_TSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER__CONTEXT_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mDefinition To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mSignature To TSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The number of structural features of the '<em>Link Definition To Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Link Definition To Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DEFINITION_TO_TYPE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MemberInAnnotationVisibility__MarkerImpl <em>Member In Annotation Visibility Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MemberInAnnotationVisibility__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMemberInAnnotationVisibility__Marker()
	 * @generated
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER = 82;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_ANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE TRG tModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR def To Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mModifier To TModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The number of structural features of the '<em>Member In Annotation Visibility Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Member In Annotation Visibility Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ANNOTATION_VISIBILITY_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MemberInClassVisibility__MarkerImpl <em>Member In Class Visibility Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MemberInClassVisibility__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMemberInClassVisibility__Marker()
	 * @generated
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER = 83;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE TRG tModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR def To Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mModifier To TModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The number of structural features of the '<em>Member In Class Visibility Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Member In Class Visibility Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_CLASS_VISIBILITY_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MemberInEnumVisibility__MarkerImpl <em>Member In Enum Visibility Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MemberInEnumVisibility__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMemberInEnumVisibility__Marker()
	 * @generated
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER = 84;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER__CONTEXT_SRC_MCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER__CONTEXT_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE TRG tModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR def To Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mModifier To TModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The number of structural features of the '<em>Member In Enum Visibility Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Member In Enum Visibility Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_IN_ENUM_VISIBILITY_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MethodDefinition__MarkerImpl <em>Method Definition Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MethodDefinition__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMethodDefinition__Marker()
	 * @generated
	 */
	int METHOD_DEFINITION_MARKER = 85;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_MARKER__CREATE_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_MARKER__CREATE_TRG_TDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_MARKER__CONTEXT_TRG_TMETHOD_SIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mDefinition To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mSignature To TMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TMETHOD_SIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The number of structural features of the '<em>Method Definition Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Method Definition Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MethodInvocation__MarkerImpl <em>Method Invocation Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MethodInvocation__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMethodInvocation__Marker()
	 * @generated
	 */
	int METHOD_INVOCATION_MARKER = 86;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER__CREATE_SRC_INVOCATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER__CONTEXT_SRC_MMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER__CONTEXT_SRC_MMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER__CREATE_TRG_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER__CONTEXT_TRG_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR invocation To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMethod To TMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The number of structural features of the '<em>Method Invocation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Method Invocation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MethodInvocationRecursive__MarkerImpl <em>Method Invocation Recursive Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MethodInvocationRecursive__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMethodInvocationRecursive__Marker()
	 * @generated
	 */
	int METHOD_INVOCATION_RECURSIVE_MARKER = 87;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_RECURSIVE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_SRC_INVOCATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_SRC_MMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_TRG_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR invocation To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Method Invocation Recursive Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_RECURSIVE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Method Invocation Recursive Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_RECURSIVE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MethodInvocationStaticType__MarkerImpl <em>Method Invocation Static Type Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MethodInvocationStaticType__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMethodInvocationStaticType__Marker()
	 * @generated
	 */
	int METHOD_INVOCATION_STATIC_TYPE_MARKER = 88;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_STATIC_TYPE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_INVOCATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mStatic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_MSTATIC_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tStatic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TSTATIC_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR invocation To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_INVOCATION_TO_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mStatic Type Tot Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_MSTATIC_TYPE_TOT_STATIC_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Method Invocation Static Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_STATIC_TYPE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Method Invocation Static Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_STATIC_TYPE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MethodName__MarkerImpl <em>Method Name Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MethodName__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMethodName__Marker()
	 * @generated
	 */
	int METHOD_NAME_MARKER = 89;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_MARKER__CONTEXT_SRC_MMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mName</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_MARKER__CREATE_SRC_MNAME = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tName</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_MARKER__CREATE_TRG_TNAME = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR mName To TName</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_MARKER__CREATE_CORR_MNAME_TO_TNAME = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR model To Pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Method Name Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Method Name Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NAME_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MethodOverriding__MarkerImpl <em>Method Overriding Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MethodOverriding__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMethodOverriding__Marker()
	 * @generated
	 */
	int METHOD_OVERRIDING_MARKER = 90;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OVERRIDING_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mOverriding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MOVERRIDING = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOverriding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TOVERRIDING = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMethod To TMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mOverriding To TOverriding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MOVERRIDING_TO_TOVERRIDING = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Method Overriding Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OVERRIDING_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Method Overriding Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OVERRIDING_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MethodParameter__MarkerImpl <em>Method Parameter Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MethodParameter__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMethodParameter__Marker()
	 * @generated
	 */
	int METHOD_PARAMETER_MARKER = 91;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mEntry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_MARKER__CREATE_SRC_MENTRY = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_MARKER__CONTEXT_SRC_MSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_MARKER__CREATE_TRG_TPARAMETER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tSiganture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_MARKER__CONTEXT_TRG_TSIGANTURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR mEntry To TParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_MARKER__CREATE_CORR_MENTRY_TO_TPARAMETER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mSignature To TSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Method Parameter Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Method Parameter Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MethodParameterLink__MarkerImpl <em>Method Parameter Link Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MethodParameterLink__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMethodParameterLink__Marker()
	 * @generated
	 */
	int METHOD_PARAMETER_LINK_MARKER = 92;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mEntry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MENTRY = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mPrev Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MPREV_ENTRY = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPARAMETER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tPrev Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPREV_PARAMETER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eSingle Variable Declaration To TParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_ESINGLE_VARIABLE_DECLARATION_TO_TPARAMETER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mmethod Signature To TMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Method Parameter Link Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Method Parameter Link Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MethodParameterLinkFirst__MarkerImpl <em>Method Parameter Link First Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MethodParameterLinkFirst__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMethodParameterLinkFirst__Marker()
	 * @generated
	 */
	int METHOD_PARAMETER_LINK_FIRST_MARKER = 93;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_FIRST_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mEntry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_FIRST_MARKER__CONTEXT_SRC_MENTRY = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mParameter List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_FIRST_MARKER__CONTEXT_SRC_MPARAMETER_LIST = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_FIRST_MARKER__CONTEXT_TRG_TMETHOD_SIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_FIRST_MARKER__CONTEXT_TRG_TPARAMETER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eSingle Variable Declaration To TParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_FIRST_MARKER__CONTEXT_CORR_ESINGLE_VARIABLE_DECLARATION_TO_TPARAMETER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mmethod Signature To TMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_FIRST_MARKER__CONTEXT_CORR_MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Method Parameter Link First Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_FIRST_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Method Parameter Link First Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_LINK_FIRST_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MethodParameterType__MarkerImpl <em>Method Parameter Type Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MethodParameterType__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMethodParameterType__Marker()
	 * @generated
	 */
	int METHOD_PARAMETER_TYPE_MARKER = 94;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mEntry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER__CREATE_SRC_MENTRY = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER__CREATE_TRG_TPARAMETER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tSiganture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TSIGANTURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mEntry To TParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MENTRY_TO_TPARAMETER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mSignature To TSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The number of structural features of the '<em>Method Parameter Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Method Parameter Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_TYPE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.MethodSignature__MarkerImpl <em>Method Signature Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.MethodSignature__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getMethodSignature__Marker()
	 * @generated
	 */
	int METHOD_SIGNATURE_MARKER = 95;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mName</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_MARKER__CONTEXT_SRC_MNAME = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tName</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_MARKER__CONTEXT_TRG_TNAME = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mName To TName</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_MARKER__CONTEXT_CORR_MNAME_TO_TNAME = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mSignature To TSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Method Signature Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Method Signature Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ModelToPg__MarkerImpl <em>Model To Pg Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ModelToPg__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getModelToPg__Marker()
	 * @generated
	 */
	int MODEL_TO_PG_MARKER = 96;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_PG_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_PG_MARKER__CREATE_SRC_MMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE TRG tPG</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_PG_MARKER__CREATE_TRG_TPG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE CORR mModel To TPG</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_PG_MARKER__CREATE_CORR_MMODEL_TO_TPG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model To Pg Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_PG_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model To Pg Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TO_PG_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.NestedClassInType__MarkerImpl <em>Nested Class In Type Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.NestedClassInType__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getNestedClassInType__Marker()
	 * @generated
	 */
	int NESTED_CLASS_IN_TYPE_MARKER = 97;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC eNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER__CREATE_SRC_ENESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eOuter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER__CONTEXT_SRC_EOUTER_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNested Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER__CREATE_TRG_TNESTED_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER__CREATE_TRG_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOuter Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOuter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR eNested Type To TNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER__CREATE_CORR_ENESTED_TYPE_TO_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eOuter Type To TOuter Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER__CONTEXT_CORR_EOUTER_TYPE_TO_TOUTER_INTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>CREATE CORR mNested Class Declaration To TNested Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER__CREATE_CORR_MNESTED_CLASS_DECLARATION_TO_TNESTED_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 10;

	/**
	 * The number of structural features of the '<em>Nested Class In Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Nested Class In Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CLASS_IN_TYPE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.NestedEnum__MarkerImpl <em>Nested Enum Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.NestedEnum__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getNestedEnum__Marker()
	 * @generated
	 */
	int NESTED_ENUM_MARKER = 98;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC eNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER__CREATE_SRC_ENESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eOuter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER__CONTEXT_SRC_EOUTER_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER__CREATE_TRG_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNested Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER__CREATE_TRG_TNESTED_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER__CREATE_TRG_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOuter Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER__CONTEXT_TRG_TOUTER_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOuter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER__CONTEXT_TRG_TOUTER_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CREATE CORR eNested Type To TNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER__CREATE_CORR_ENESTED_TYPE_TO_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eOuter Type To TOuter Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER__CONTEXT_CORR_EOUTER_TYPE_TO_TOUTER_INTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Nested Enum Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Nested Enum Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ENUM_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl <em>Nested Interface In Type Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getNestedInterfaceInType__Marker()
	 * @generated
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER = 99;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC eNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_SRC_ENESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eOuter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_SRC_EOUTER_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNested Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOuter Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tOuter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR eNested Type To TNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_ENESTED_TYPE_TO_TNESTED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eOuter Type To TOuter Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_CORR_EOUTER_TYPE_TO_TOUTER_INTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>CREATE CORR mInterface Declarationto TInterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 10;

	/**
	 * The number of structural features of the '<em>Nested Interface In Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Nested Interface In Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_INTERFACE_IN_TYPE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.OutgoingFlow__MarkerImpl <em>Outgoing Flow Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.OutgoingFlow__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getOutgoingFlow__Marker()
	 * @generated
	 */
	int OUTGOING_FLOW_MARKER = 100;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_FLOW_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_FLOW_MARKER__CONTEXT_SRC_MFLOW = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_FLOW_MARKER__CONTEXT_SRC_MTARGET = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_FLOW_MARKER__CONTEXT_TRG_TFLOW = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_FLOW_MARKER__CONTEXT_TRG_TTARGET = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mFlow To TFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mTarget To TTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_FLOW_MARKER__CONTEXT_CORR_MTARGET_TO_TTARGET = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Outgoing Flow Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_FLOW_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Outgoing Flow Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_FLOW_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.PackageToPGPackage__MarkerImpl <em>Package To PG Package Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.PackageToPGPackage__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getPackageToPGPackage__Marker()
	 * @generated
	 */
	int PACKAGE_TO_PG_PACKAGE_MARKER = 101;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_PG_PACKAGE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mPackage To TPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Package To PG Package Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_PG_PACKAGE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Package To PG Package Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TO_PG_PACKAGE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ParameterizedTypeToClass__MarkerImpl <em>Parameterized Type To Class Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ParameterizedTypeToClass__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getParameterizedTypeToClass__Marker()
	 * @generated
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER = 102;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC eParameterized Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_EPARAMETERIZED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE SRC eType Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR eParameterized Type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_CORR_EPARAMETERIZED_TYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eType To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The number of structural features of the '<em>Parameterized Type To Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Parameterized Type To Class Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_TO_CLASS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.PrimitiveTypeIsBoolean__MarkerImpl <em>Primitive Type Is Boolean Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.PrimitiveTypeIsBoolean__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getPrimitiveTypeIsBoolean__Marker()
	 * @generated
	 */
	int PRIMITIVE_TYPE_IS_BOOLEAN_MARKER = 103;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BOOLEAN_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BOOLEAN_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC ePrimitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BOOLEAN_MARKER__CREATE_SRC_EPRIMITIVE_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BOOLEAN_MARKER__CREATE_TRG_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BOOLEAN_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BOOLEAN_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR ePrimitive Type To TPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BOOLEAN_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BOOLEAN_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Primitive Type Is Boolean Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BOOLEAN_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Primitive Type Is Boolean Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BOOLEAN_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.PrimitiveTypeIsByte__MarkerImpl <em>Primitive Type Is Byte Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.PrimitiveTypeIsByte__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getPrimitiveTypeIsByte__Marker()
	 * @generated
	 */
	int PRIMITIVE_TYPE_IS_BYTE_MARKER = 104;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BYTE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BYTE_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC ePrimitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BYTE_MARKER__CREATE_SRC_EPRIMITIVE_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BYTE_MARKER__CREATE_TRG_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BYTE_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BYTE_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR ePrimitive Type To TPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BYTE_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BYTE_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Primitive Type Is Byte Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BYTE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Primitive Type Is Byte Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_BYTE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.PrimitiveTypeIsChar__MarkerImpl <em>Primitive Type Is Char Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.PrimitiveTypeIsChar__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getPrimitiveTypeIsChar__Marker()
	 * @generated
	 */
	int PRIMITIVE_TYPE_IS_CHAR_MARKER = 105;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_CHAR_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_CHAR_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC ePrimitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_CHAR_MARKER__CREATE_SRC_EPRIMITIVE_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_CHAR_MARKER__CREATE_TRG_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_CHAR_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_CHAR_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR ePrimitive Type To TPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_CHAR_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_CHAR_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Primitive Type Is Char Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_CHAR_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Primitive Type Is Char Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_CHAR_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.PrimitiveTypeIsDouble__MarkerImpl <em>Primitive Type Is Double Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.PrimitiveTypeIsDouble__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getPrimitiveTypeIsDouble__Marker()
	 * @generated
	 */
	int PRIMITIVE_TYPE_IS_DOUBLE_MARKER = 106;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_DOUBLE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_DOUBLE_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC ePrimitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_DOUBLE_MARKER__CREATE_SRC_EPRIMITIVE_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_DOUBLE_MARKER__CREATE_TRG_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_DOUBLE_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_DOUBLE_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR ePrimitive Type To TPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_DOUBLE_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_DOUBLE_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Primitive Type Is Double Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_DOUBLE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Primitive Type Is Double Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_DOUBLE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.PrimitiveTypeIsFloat__MarkerImpl <em>Primitive Type Is Float Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.PrimitiveTypeIsFloat__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getPrimitiveTypeIsFloat__Marker()
	 * @generated
	 */
	int PRIMITIVE_TYPE_IS_FLOAT_MARKER = 107;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_FLOAT_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_FLOAT_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC ePrimitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_FLOAT_MARKER__CREATE_SRC_EPRIMITIVE_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_FLOAT_MARKER__CREATE_TRG_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_FLOAT_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_FLOAT_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR ePrimitive Type To TPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_FLOAT_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_FLOAT_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Primitive Type Is Float Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_FLOAT_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Primitive Type Is Float Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_FLOAT_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.PrimitiveTypeIsInt__MarkerImpl <em>Primitive Type Is Int Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.PrimitiveTypeIsInt__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getPrimitiveTypeIsInt__Marker()
	 * @generated
	 */
	int PRIMITIVE_TYPE_IS_INT_MARKER = 108;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_INT_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_INT_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC ePrimitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_INT_MARKER__CREATE_SRC_EPRIMITIVE_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_INT_MARKER__CREATE_TRG_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_INT_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_INT_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR ePrimitive Type To TPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_INT_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_INT_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Primitive Type Is Int Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_INT_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Primitive Type Is Int Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_INT_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.PrimitiveTypeIsLong__MarkerImpl <em>Primitive Type Is Long Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.PrimitiveTypeIsLong__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getPrimitiveTypeIsLong__Marker()
	 * @generated
	 */
	int PRIMITIVE_TYPE_IS_LONG_MARKER = 109;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_LONG_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC ePrimitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_SRC_EPRIMITIVE_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_TRG_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR ePrimitive Type To TPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Primitive Type Is Long Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_LONG_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Primitive Type Is Long Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_LONG_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.PrimitiveTypeIsShort__MarkerImpl <em>Primitive Type Is Short Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.PrimitiveTypeIsShort__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getPrimitiveTypeIsShort__Marker()
	 * @generated
	 */
	int PRIMITIVE_TYPE_IS_SHORT_MARKER = 110;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_SHORT_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_SHORT_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC ePrimitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_SHORT_MARKER__CREATE_SRC_EPRIMITIVE_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_SHORT_MARKER__CREATE_TRG_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_SHORT_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_SHORT_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR ePrimitive Type To TPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_SHORT_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_SHORT_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Primitive Type Is Short Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_SHORT_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Primitive Type Is Short Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_IS_SHORT_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.PrimitiveTypesIsVoid__MarkerImpl <em>Primitive Types Is Void Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.PrimitiveTypesIsVoid__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getPrimitiveTypesIsVoid__Marker()
	 * @generated
	 */
	int PRIMITIVE_TYPES_IS_VOID_MARKER = 111;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPES_IS_VOID_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPES_IS_VOID_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC ePrimitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPES_IS_VOID_MARKER__CREATE_SRC_EPRIMITIVE_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPES_IS_VOID_MARKER__CREATE_TRG_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPES_IS_VOID_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPES_IS_VOID_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR ePrimitive Type To TPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPES_IS_VOID_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPES_IS_VOID_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Primitive Types Is Void Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPES_IS_VOID_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Primitive Types Is Void Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPES_IS_VOID_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.ReturnType__MarkerImpl <em>Return Type Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.ReturnType__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getReturnType__Marker()
	 * @generated
	 */
	int RETURN_TYPE_MARKER = 112;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eReturn Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_MARKER__CONTEXT_SRC_ERETURN_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC eType Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_MARKER__CREATE_SRC_ETYPE_ACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_MARKER__CONTEXT_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMethod Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_MARKER__CONTEXT_TRG_TMETHOD_DEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eReturn Type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_MARKER__CONTEXT_CORR_ERETURN_TYPE_TO_TABSTRACT_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMethod Definition To TMethod Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_MARKER__CONTEXT_CORR_MMETHOD_DEFINITION_TO_TMETHOD_DEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Return Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Return Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.SignatureReturnType__MarkerImpl <em>Signature Return Type Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.SignatureReturnType__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getSignatureReturnType__Marker()
	 * @generated
	 */
	int SIGNATURE_RETURN_TYPE_MARKER = 113;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_RETURN_TYPE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mSignature To TSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Signature Return Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_RETURN_TYPE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Signature Return Type Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_RETURN_TYPE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.SubPackageToPGPackage__MarkerImpl <em>Sub Package To PG Package Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.SubPackageToPGPackage__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getSubPackageToPGPackage__Marker()
	 * @generated
	 */
	int SUB_PACKAGE_TO_PG_PACKAGE_MARKER = 114;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PACKAGE_TO_PG_PACKAGE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mParent Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MPARENT_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TPARENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tSub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TSUB = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR mPackage To TSub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TSUB = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mParent Package To TParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MPARENT_PACKAGE_TO_TPARENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>Sub Package To PG Package Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PACKAGE_TO_PG_PACKAGE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Sub Package To PG Package Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PACKAGE_TO_PG_PACKAGE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.SuperConstructorInvocation__MarkerImpl <em>Super Constructor Invocation Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.SuperConstructorInvocation__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getSuperConstructorInvocation__Marker()
	 * @generated
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER = 115;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER__CREATE_SRC_INVOCATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER__CREATE_TRG_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR invocation To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMethod To TMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The number of structural features of the '<em>Super Constructor Invocation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Super Constructor Invocation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.SuperMethodInvocation__MarkerImpl <em>Super Method Invocation Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.SuperMethodInvocation__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getSuperMethodInvocation__Marker()
	 * @generated
	 */
	int SUPER_METHOD_INVOCATION_MARKER = 116;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER__CREATE_SRC_INVOCATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER__CONTEXT_SRC_MMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER__CONTEXT_SRC_MMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER__CREATE_TRG_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER__CONTEXT_TRG_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR invocation To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMethod To TMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 9;

	/**
	 * The number of structural features of the '<em>Super Method Invocation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Super Method Invocation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.SyntethicMethod__MarkerImpl <em>Syntethic Method Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.SyntethicMethod__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getSyntethicMethod__Marker()
	 * @generated
	 */
	int SYNTETHIC_METHOD_MARKER = 117;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mDef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MDEF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC mSyntethic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER__CREATE_SRC_MSYNTETHIC = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tDef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TDEF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tSig</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TSIG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE TRG tSyntethic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER__CREATE_TRG_TSYNTETHIC = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mClass Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MCLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mDefinition To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>CREATE CORR mSynt To TSynt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER__CREATE_CORR_MSYNT_TO_TSYNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Syntethic Method Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Syntethic Method Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTETHIC_METHOD_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.TextAnnotations__MarkerImpl <em>Text Annotations Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.TextAnnotations__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getTextAnnotations__Marker()
	 * @generated
	 */
	int TEXT_ANNOTATIONS_MARKER = 118;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATIONS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mComment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATIONS_MARKER__CREATE_SRC_MCOMMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATIONS_MARKER__CONTEXT_SRC_MMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATIONS_MARKER__CONTEXT_TRG_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tText</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATIONS_MARKER__CREATE_TRG_TTEXT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR mComment To TText</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATIONS_MARKER__CREATE_CORR_MCOMMENT_TO_TTEXT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATIONS_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Text Annotations Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATIONS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Text Annotations Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATIONS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.TypeParameter__MarkerImpl <em>Type Parameter Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.TypeParameter__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getTypeParameter__Marker()
	 * @generated
	 */
	int TYPE_PARAMETER_MARKER = 119;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC type Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_MARKER__CREATE_SRC_TYPE_PARAMETER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_MARKER__CREATE_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_MARKER__CONTEXT_CORR_EMODEL_TO_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Type Parameter Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Type Parameter Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.TypesOrphaned__MarkerImpl <em>Types Orphaned Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.TypesOrphaned__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getTypesOrphaned__Marker()
	 * @generated
	 */
	int TYPES_ORPHANED_MARKER = 120;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ORPHANED_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ORPHANED_MARKER__CONTEXT_SRC_MMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ORPHANED_MARKER__CREATE_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ORPHANED_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ORPHANED_MARKER__CREATE_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ORPHANED_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ORPHANED_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ORPHANED_MARKER__CREATE_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Types Orphaned Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ORPHANED_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Types Orphaned Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ORPHANED_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.TypesVisibility__MarkerImpl <em>Types Visibility Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.TypesVisibility__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getTypesVisibility__Marker()
	 * @generated
	 */
	int TYPES_VISIBILITY_MARKER = 121;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_VISIBILITY_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC mModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_VISIBILITY_MARKER__CONTEXT_SRC_MTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG tModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_VISIBILITY_MARKER__CONTEXT_TRG_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR mModifier To TModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Types Visibility Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_VISIBILITY_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Types Visibility Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_VISIBILITY_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.UnresolvedTypeDeclaration__MarkerImpl <em>Unresolved Type Declaration Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.UnresolvedTypeDeclaration__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getUnresolvedTypeDeclaration__Marker()
	 * @generated
	 */
	int UNRESOLVED_TYPE_DECLARATION_MARKER = 122;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_MARKER__CONTEXT_SRC_EMODEL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC unresolved Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_MARKER__CREATE_SRC_UNRESOLVED_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_MARKER__CONTEXT_TRG_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_MARKER__CREATE_TRG_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eModel To Pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_MARKER__CONTEXT_CORR_EMODEL_TO_PG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 5;

	/**
	 * The number of structural features of the '<em>Unresolved Type Declaration Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Unresolved Type Declaration Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ModiscoTGG.impl.VariableDeclarationFragment__MarkerImpl <em>Variable Declaration Fragment Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModiscoTGG.impl.VariableDeclarationFragment__MarkerImpl
	 * @see ModiscoTGG.impl.ModiscoTGGPackageImpl#getVariableDeclarationFragment__Marker()
	 * @generated
	 */
	int VARIABLE_DECLARATION_FRAGMENT_MARKER = 123;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_SRC_MDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC var Decl Fragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_SRC_VAR_DECL_FRAGMENT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG tDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_TRG_TDEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR eField Declaration To TField Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD_DEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR var Decl Fragment To TField Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_CORR_VAR_DECL_FRAGMENT_TO_TFIELD_DEFINITION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT
			+ 4;

	/**
	 * The number of structural features of the '<em>Variable Declaration Fragment Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Variable Declaration Fragment Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.BooleanLiteralToTBoolNode <em>Boolean Literal To TBool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal To TBool Node</em>'.
	 * @see ModiscoTGG.BooleanLiteralToTBoolNode
	 * @generated
	 */
	EClass getBooleanLiteralToTBoolNode();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.BooleanLiteralToTBoolNode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.BooleanLiteralToTBoolNode#getSource()
	 * @see #getBooleanLiteralToTBoolNode()
	 * @generated
	 */
	EReference getBooleanLiteralToTBoolNode_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.BooleanLiteralToTBoolNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.BooleanLiteralToTBoolNode#getTarget()
	 * @see #getBooleanLiteralToTBoolNode()
	 * @generated
	 */
	EReference getBooleanLiteralToTBoolNode_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.NumberLiteralToTNumberNode <em>Number Literal To TNumber Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal To TNumber Node</em>'.
	 * @see ModiscoTGG.NumberLiteralToTNumberNode
	 * @generated
	 */
	EClass getNumberLiteralToTNumberNode();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NumberLiteralToTNumberNode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.NumberLiteralToTNumberNode#getSource()
	 * @see #getNumberLiteralToTNumberNode()
	 * @generated
	 */
	EReference getNumberLiteralToTNumberNode_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NumberLiteralToTNumberNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.NumberLiteralToTNumberNode#getTarget()
	 * @see #getNumberLiteralToTNumberNode()
	 * @generated
	 */
	EReference getNumberLiteralToTNumberNode_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.StringLiteralToTTextNode <em>String Literal To TText Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal To TText Node</em>'.
	 * @see ModiscoTGG.StringLiteralToTTextNode
	 * @generated
	 */
	EClass getStringLiteralToTTextNode();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.StringLiteralToTTextNode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.StringLiteralToTTextNode#getSource()
	 * @see #getStringLiteralToTTextNode()
	 * @generated
	 */
	EReference getStringLiteralToTTextNode_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.StringLiteralToTTextNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.StringLiteralToTTextNode#getTarget()
	 * @see #getStringLiteralToTTextNode()
	 * @generated
	 */
	EReference getStringLiteralToTTextNode_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ClassLiteralToClassNode <em>Class Literal To Class Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Literal To Class Node</em>'.
	 * @see ModiscoTGG.ClassLiteralToClassNode
	 * @generated
	 */
	EClass getClassLiteralToClassNode();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassLiteralToClassNode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.ClassLiteralToClassNode#getSource()
	 * @see #getClassLiteralToClassNode()
	 * @generated
	 */
	EReference getClassLiteralToClassNode_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassLiteralToClassNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.ClassLiteralToClassNode#getTarget()
	 * @see #getClassLiteralToClassNode()
	 * @generated
	 */
	EReference getClassLiteralToClassNode_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ClassDeclarationToTClass <em>Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Declaration To TClass</em>'.
	 * @see ModiscoTGG.ClassDeclarationToTClass
	 * @generated
	 */
	EClass getClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassDeclarationToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.ClassDeclarationToTClass#getSource()
	 * @see #getClassDeclarationToTClass()
	 * @generated
	 */
	EReference getClassDeclarationToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassDeclarationToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.ClassDeclarationToTClass#getTarget()
	 * @see #getClassDeclarationToTClass()
	 * @generated
	 */
	EReference getClassDeclarationToTClass_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.PackageToTPackage <em>Package To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package To TPackage</em>'.
	 * @see ModiscoTGG.PackageToTPackage
	 * @generated
	 */
	EClass getPackageToTPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PackageToTPackage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.PackageToTPackage#getSource()
	 * @see #getPackageToTPackage()
	 * @generated
	 */
	EReference getPackageToTPackage_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PackageToTPackage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.PackageToTPackage#getTarget()
	 * @see #getPackageToTPackage()
	 * @generated
	 */
	EReference getPackageToTPackage_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ModelToTypeGraph <em>Model To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model To Type Graph</em>'.
	 * @see ModiscoTGG.ModelToTypeGraph
	 * @generated
	 */
	EClass getModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModelToTypeGraph#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.ModelToTypeGraph#getSource()
	 * @see #getModelToTypeGraph()
	 * @generated
	 */
	EReference getModelToTypeGraph_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModelToTypeGraph#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.ModelToTypeGraph#getTarget()
	 * @see #getModelToTypeGraph()
	 * @generated
	 */
	EReference getModelToTypeGraph_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.InterfaceDeclarationToTInterface <em>Interface Declaration To TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Declaration To TInterface</em>'.
	 * @see ModiscoTGG.InterfaceDeclarationToTInterface
	 * @generated
	 */
	EClass getInterfaceDeclarationToTInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceDeclarationToTInterface#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.InterfaceDeclarationToTInterface#getSource()
	 * @see #getInterfaceDeclarationToTInterface()
	 * @generated
	 */
	EReference getInterfaceDeclarationToTInterface_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceDeclarationToTInterface#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.InterfaceDeclarationToTInterface#getTarget()
	 * @see #getInterfaceDeclarationToTInterface()
	 * @generated
	 */
	EReference getInterfaceDeclarationToTInterface_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MDefinitionToTMember <em>MDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MDefinition To TMember</em>'.
	 * @see ModiscoTGG.MDefinitionToTMember
	 * @generated
	 */
	EClass getMDefinitionToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MDefinitionToTMember#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.MDefinitionToTMember#getSource()
	 * @see #getMDefinitionToTMember()
	 * @generated
	 */
	EReference getMDefinitionToTMember_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MDefinitionToTMember#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.MDefinitionToTMember#getTarget()
	 * @see #getMDefinitionToTMember()
	 * @generated
	 */
	EReference getMDefinitionToTMember_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.FieldAccessToTAccess <em>Field Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Access To TAccess</em>'.
	 * @see ModiscoTGG.FieldAccessToTAccess
	 * @generated
	 */
	EClass getFieldAccessToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessToTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.FieldAccessToTAccess#getSource()
	 * @see #getFieldAccessToTAccess()
	 * @generated
	 */
	EReference getFieldAccessToTAccess_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessToTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.FieldAccessToTAccess#getTarget()
	 * @see #getFieldAccessToTAccess()
	 * @generated
	 */
	EReference getFieldAccessToTAccess_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.PrimitiveTypeToTClass <em>Primitive Type To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type To TClass</em>'.
	 * @see ModiscoTGG.PrimitiveTypeToTClass
	 * @generated
	 */
	EClass getPrimitiveTypeToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.PrimitiveTypeToTClass#getSource()
	 * @see #getPrimitiveTypeToTClass()
	 * @generated
	 */
	EReference getPrimitiveTypeToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.PrimitiveTypeToTClass#getTarget()
	 * @see #getPrimitiveTypeToTClass()
	 * @generated
	 */
	EReference getPrimitiveTypeToTClass_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnonymousClassDeclarationToTClass <em>Anonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Class Declaration To TClass</em>'.
	 * @see ModiscoTGG.AnonymousClassDeclarationToTClass
	 * @generated
	 */
	EClass getAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassDeclarationToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.AnonymousClassDeclarationToTClass#getSource()
	 * @see #getAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	EReference getAnonymousClassDeclarationToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassDeclarationToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.AnonymousClassDeclarationToTClass#getTarget()
	 * @see #getAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	EReference getAnonymousClassDeclarationToTClass_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MMethodNameToTMethod <em>MMethod Name To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMethod Name To TMethod</em>'.
	 * @see ModiscoTGG.MMethodNameToTMethod
	 * @generated
	 */
	EClass getMMethodNameToTMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MMethodNameToTMethod#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.MMethodNameToTMethod#getSource()
	 * @see #getMMethodNameToTMethod()
	 * @generated
	 */
	EReference getMMethodNameToTMethod_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MMethodNameToTMethod#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.MMethodNameToTMethod#getTarget()
	 * @see #getMMethodNameToTMethod()
	 * @generated
	 */
	EReference getMMethodNameToTMethod_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MEntryToTParameter <em>MEntry To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MEntry To TParameter</em>'.
	 * @see ModiscoTGG.MEntryToTParameter
	 * @generated
	 */
	EClass getMEntryToTParameter();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MEntryToTParameter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.MEntryToTParameter#getSource()
	 * @see #getMEntryToTParameter()
	 * @generated
	 */
	EReference getMEntryToTParameter_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MEntryToTParameter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.MEntryToTParameter#getTarget()
	 * @see #getMEntryToTParameter()
	 * @generated
	 */
	EReference getMEntryToTParameter_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MSignatureToTSignature <em>MSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSignature To TSignature</em>'.
	 * @see ModiscoTGG.MSignatureToTSignature
	 * @generated
	 */
	EClass getMSignatureToTSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MSignatureToTSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.MSignatureToTSignature#getSource()
	 * @see #getMSignatureToTSignature()
	 * @generated
	 */
	EReference getMSignatureToTSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MSignatureToTSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.MSignatureToTSignature#getTarget()
	 * @see #getMSignatureToTSignature()
	 * @generated
	 */
	EReference getMSignatureToTSignature_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ASTNodeToTAnnotatable <em>AST Node To TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AST Node To TAnnotatable</em>'.
	 * @see ModiscoTGG.ASTNodeToTAnnotatable
	 * @generated
	 */
	EClass getASTNodeToTAnnotatable();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ASTNodeToTAnnotatable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.ASTNodeToTAnnotatable#getSource()
	 * @see #getASTNodeToTAnnotatable()
	 * @generated
	 */
	EReference getASTNodeToTAnnotatable_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ASTNodeToTAnnotatable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.ASTNodeToTAnnotatable#getTarget()
	 * @see #getASTNodeToTAnnotatable()
	 * @generated
	 */
	EReference getASTNodeToTAnnotatable_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.TypeToTAbstractType <em>Type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type To TAbstract Type</em>'.
	 * @see ModiscoTGG.TypeToTAbstractType
	 * @generated
	 */
	EClass getTypeToTAbstractType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypeToTAbstractType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.TypeToTAbstractType#getSource()
	 * @see #getTypeToTAbstractType()
	 * @generated
	 */
	EReference getTypeToTAbstractType_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypeToTAbstractType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.TypeToTAbstractType#getTarget()
	 * @see #getTypeToTAbstractType()
	 * @generated
	 */
	EReference getTypeToTAbstractType_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MFieldNameToTField <em>MField Name To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MField Name To TField</em>'.
	 * @see ModiscoTGG.MFieldNameToTField
	 * @generated
	 */
	EClass getMFieldNameToTField();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MFieldNameToTField#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.MFieldNameToTField#getSource()
	 * @see #getMFieldNameToTField()
	 * @generated
	 */
	EReference getMFieldNameToTField_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MFieldNameToTField#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.MFieldNameToTField#getTarget()
	 * @see #getMFieldNameToTField()
	 * @generated
	 */
	EReference getMFieldNameToTField_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.LineCommentToTTextAnnotation <em>Line Comment To TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Comment To TText Annotation</em>'.
	 * @see ModiscoTGG.LineCommentToTTextAnnotation
	 * @generated
	 */
	EClass getLineCommentToTTextAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LineCommentToTTextAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.LineCommentToTTextAnnotation#getSource()
	 * @see #getLineCommentToTTextAnnotation()
	 * @generated
	 */
	EReference getLineCommentToTTextAnnotation_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LineCommentToTTextAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.LineCommentToTTextAnnotation#getTarget()
	 * @see #getLineCommentToTTextAnnotation()
	 * @generated
	 */
	EReference getLineCommentToTTextAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MSingleVariableAccessToTAccess <em>MSingle Variable Access To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSingle Variable Access To TAccess</em>'.
	 * @see ModiscoTGG.MSingleVariableAccessToTAccess
	 * @generated
	 */
	EClass getMSingleVariableAccessToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MSingleVariableAccessToTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.MSingleVariableAccessToTAccess#getSource()
	 * @see #getMSingleVariableAccessToTAccess()
	 * @generated
	 */
	EReference getMSingleVariableAccessToTAccess_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MSingleVariableAccessToTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.MSingleVariableAccessToTAccess#getTarget()
	 * @see #getMSingleVariableAccessToTAccess()
	 * @generated
	 */
	EReference getMSingleVariableAccessToTAccess_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationToTAnnotation <em>Annotation To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation To TAnnotation</em>'.
	 * @see ModiscoTGG.AnnotationToTAnnotation
	 * @generated
	 */
	EClass getAnnotationToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationToTAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.AnnotationToTAnnotation#getSource()
	 * @see #getAnnotationToTAnnotation()
	 * @generated
	 */
	EReference getAnnotationToTAnnotation_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationToTAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.AnnotationToTAnnotation#getTarget()
	 * @see #getAnnotationToTAnnotation()
	 * @generated
	 */
	EReference getAnnotationToTAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.TypeParameterToTClass <em>Type Parameter To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter To TClass</em>'.
	 * @see ModiscoTGG.TypeParameterToTClass
	 * @generated
	 */
	EClass getTypeParameterToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypeParameterToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.TypeParameterToTClass#getSource()
	 * @see #getTypeParameterToTClass()
	 * @generated
	 */
	EReference getTypeParameterToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypeParameterToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.TypeParameterToTClass#getTarget()
	 * @see #getTypeParameterToTClass()
	 * @generated
	 */
	EReference getTypeParameterToTClass_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.UnresolvedTypeDeclarationToTClass <em>Unresolved Type Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Type Declaration To TClass</em>'.
	 * @see ModiscoTGG.UnresolvedTypeDeclarationToTClass
	 * @generated
	 */
	EClass getUnresolvedTypeDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.UnresolvedTypeDeclarationToTClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.UnresolvedTypeDeclarationToTClass#getSource()
	 * @see #getUnresolvedTypeDeclarationToTClass()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclarationToTClass_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.UnresolvedTypeDeclarationToTClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.UnresolvedTypeDeclarationToTClass#getTarget()
	 * @see #getUnresolvedTypeDeclarationToTClass()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclarationToTClass_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ModifierToTClassEntity <em>Modifier To TClass Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier To TClass Entity</em>'.
	 * @see ModiscoTGG.ModifierToTClassEntity
	 * @generated
	 */
	EClass getModifierToTClassEntity();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModifierToTClassEntity#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.ModifierToTClassEntity#getSource()
	 * @see #getModifierToTClassEntity()
	 * @generated
	 */
	EReference getModifierToTClassEntity_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModifierToTClassEntity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.ModifierToTClassEntity#getTarget()
	 * @see #getModifierToTClassEntity()
	 * @generated
	 */
	EReference getModifierToTClassEntity_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ModifierToTFieldEntity <em>Modifier To TField Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier To TField Entity</em>'.
	 * @see ModiscoTGG.ModifierToTFieldEntity
	 * @generated
	 */
	EClass getModifierToTFieldEntity();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModifierToTFieldEntity#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.ModifierToTFieldEntity#getSource()
	 * @see #getModifierToTFieldEntity()
	 * @generated
	 */
	EReference getModifierToTFieldEntity_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModifierToTFieldEntity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.ModifierToTFieldEntity#getTarget()
	 * @see #getModifierToTFieldEntity()
	 * @generated
	 */
	EReference getModifierToTFieldEntity_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ModifierToTMethodEntity <em>Modifier To TMethod Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier To TMethod Entity</em>'.
	 * @see ModiscoTGG.ModifierToTMethodEntity
	 * @generated
	 */
	EClass getModifierToTMethodEntity();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModifierToTMethodEntity#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.ModifierToTMethodEntity#getSource()
	 * @see #getModifierToTMethodEntity()
	 * @generated
	 */
	EReference getModifierToTMethodEntity_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModifierToTMethodEntity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.ModifierToTMethodEntity#getTarget()
	 * @see #getModifierToTMethodEntity()
	 * @generated
	 */
	EReference getModifierToTMethodEntity_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ModifierToAbstractType <em>Modifier To Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier To Abstract Type</em>'.
	 * @see ModiscoTGG.ModifierToAbstractType
	 * @generated
	 */
	EClass getModifierToAbstractType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModifierToAbstractType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.ModifierToAbstractType#getSource()
	 * @see #getModifierToAbstractType()
	 * @generated
	 */
	EReference getModifierToAbstractType_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModifierToAbstractType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.ModifierToAbstractType#getTarget()
	 * @see #getModifierToAbstractType()
	 * @generated
	 */
	EReference getModifierToAbstractType_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MModifierToTModifier <em>MModifier To TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MModifier To TModifier</em>'.
	 * @see ModiscoTGG.MModifierToTModifier
	 * @generated
	 */
	EClass getMModifierToTModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MModifierToTModifier#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.MModifierToTModifier#getSource()
	 * @see #getMModifierToTModifier()
	 * @generated
	 */
	EReference getMModifierToTModifier_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MModifierToTModifier#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.MModifierToTModifier#getTarget()
	 * @see #getMModifierToTModifier()
	 * @generated
	 */
	EReference getMModifierToTModifier_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MSyntethicMethodToTSyntethicMethod <em>MSyntethic Method To TSyntethic Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSyntethic Method To TSyntethic Method</em>'.
	 * @see ModiscoTGG.MSyntethicMethodToTSyntethicMethod
	 * @generated
	 */
	EClass getMSyntethicMethodToTSyntethicMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MSyntethicMethodToTSyntethicMethod#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.MSyntethicMethodToTSyntethicMethod#getSource()
	 * @see #getMSyntethicMethodToTSyntethicMethod()
	 * @generated
	 */
	EReference getMSyntethicMethodToTSyntethicMethod_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MSyntethicMethodToTSyntethicMethod#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.MSyntethicMethodToTSyntethicMethod#getTarget()
	 * @see #getMSyntethicMethodToTSyntethicMethod()
	 * @generated
	 */
	EReference getMSyntethicMethodToTSyntethicMethod_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue <em>Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue
	 * @generated
	 */
	EClass getAnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue#getSource()
	 * @see #getAnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 */
	EReference getAnnotationMemberValuePairToTAnnotationValue_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue#getTarget()
	 * @see #getAnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 */
	EReference getAnnotationMemberValuePairToTAnnotationValue_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.StaticTypeToAccessStaticType <em>Static Type To Access Static Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Type To Access Static Type</em>'.
	 * @see ModiscoTGG.StaticTypeToAccessStaticType
	 * @generated
	 */
	EClass getStaticTypeToAccessStaticType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.StaticTypeToAccessStaticType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.StaticTypeToAccessStaticType#getSource()
	 * @see #getStaticTypeToAccessStaticType()
	 * @generated
	 */
	EReference getStaticTypeToAccessStaticType_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.StaticTypeToAccessStaticType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.StaticTypeToAccessStaticType#getTarget()
	 * @see #getStaticTypeToAccessStaticType()
	 * @generated
	 */
	EReference getStaticTypeToAccessStaticType_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MFlowToTFlow <em>MFlow To TFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFlow To TFlow</em>'.
	 * @see ModiscoTGG.MFlowToTFlow
	 * @generated
	 */
	EClass getMFlowToTFlow();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MFlowToTFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.MFlowToTFlow#getSource()
	 * @see #getMFlowToTFlow()
	 * @generated
	 */
	EReference getMFlowToTFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MFlowToTFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.MFlowToTFlow#getTarget()
	 * @see #getMFlowToTFlow()
	 * @generated
	 */
	EReference getMFlowToTFlow_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement <em>MAbstract Flow Element To TAbstract Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAbstract Flow Element To TAbstract Flow Element</em>'.
	 * @see ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement
	 * @generated
	 */
	EClass getMAbstractFlowElementToTAbstractFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement#getSource()
	 * @see #getMAbstractFlowElementToTAbstractFlowElement()
	 * @generated
	 */
	EReference getMAbstractFlowElementToTAbstractFlowElement_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement#getTarget()
	 * @see #getMAbstractFlowElementToTAbstractFlowElement()
	 * @generated
	 */
	EReference getMAbstractFlowElementToTAbstractFlowElement_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AbstractMethodInvocationToTAccess <em>Abstract Method Invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Method Invocation To TAccess</em>'.
	 * @see ModiscoTGG.AbstractMethodInvocationToTAccess
	 * @generated
	 */
	EClass getAbstractMethodInvocationToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AbstractMethodInvocationToTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.AbstractMethodInvocationToTAccess#getSource()
	 * @see #getAbstractMethodInvocationToTAccess()
	 * @generated
	 */
	EReference getAbstractMethodInvocationToTAccess_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AbstractMethodInvocationToTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.AbstractMethodInvocationToTAccess#getTarget()
	 * @see #getAbstractMethodInvocationToTAccess()
	 * @generated
	 */
	EReference getAbstractMethodInvocationToTAccess_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition <em>Variable Declaration Fragment To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Fragment To TField Definition</em>'.
	 * @see ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition
	 * @generated
	 */
	EClass getVariableDeclarationFragmentToTFieldDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition#getSource()
	 * @see #getVariableDeclarationFragmentToTFieldDefinition()
	 * @generated
	 */
	EReference getVariableDeclarationFragmentToTFieldDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition#getTarget()
	 * @see #getVariableDeclarationFragmentToTFieldDefinition()
	 * @generated
	 */
	EReference getVariableDeclarationFragmentToTFieldDefinition_Target();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationMemberKey__Marker <em>Annotation Member Key Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Key Marker</em>'.
	 * @see ModiscoTGG.AnnotationMemberKey__Marker
	 * @generated
	 */
	EClass getAnnotationMemberKey__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberKey__Marker#getCONTEXT__SRC__Annotation <em>CONTEXT SRC Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation</em>'.
	 * @see ModiscoTGG.AnnotationMemberKey__Marker#getCONTEXT__SRC__Annotation()
	 * @see #getAnnotationMemberKey__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberKey__Marker_CONTEXT__SRC__Annotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberKey__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberKey__Marker#getCREATE__SRC__mValue()
	 * @see #getAnnotationMemberKey__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberKey__Marker_CREATE__SRC__mValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberKey__Marker#getCONTEXT__TRG__tAnnotation <em>CONTEXT TRG tAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation</em>'.
	 * @see ModiscoTGG.AnnotationMemberKey__Marker#getCONTEXT__TRG__tAnnotation()
	 * @see #getAnnotationMemberKey__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberKey__Marker_CONTEXT__TRG__tAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberKey__Marker#getCREATE__TRG__tAnnotationValue <em>CREATE TRG tAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberKey__Marker#getCREATE__TRG__tAnnotationValue()
	 * @see #getAnnotationMemberKey__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberKey__Marker_CREATE__TRG__tAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberKey__Marker#getCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CREATE CORR Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberKey__Marker#getCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @see #getAnnotationMemberKey__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberKey__Marker_CREATE__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberKey__Marker#getCONTEXT__CORR__AnnotationToTAnnotation <em>CONTEXT CORR Annotation To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation To TAnnotation</em>'.
	 * @see ModiscoTGG.AnnotationMemberKey__Marker#getCONTEXT__CORR__AnnotationToTAnnotation()
	 * @see #getAnnotationMemberKey__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberKey__Marker_CONTEXT__CORR__AnnotationToTAnnotation();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationMemberValueAnnotation__Marker <em>Annotation Member Value Annotation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Annotation Marker</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotation__Marker
	 * @generated
	 */
	EClass getAnnotationMemberValueAnnotation__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotation__Marker#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotation__Marker#getCONTEXT__SRC__AnnotationValue()
	 * @see #getAnnotationMemberValueAnnotation__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotation__Marker_CONTEXT__SRC__AnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotation__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotation__Marker#getCREATE__SRC__mValue()
	 * @see #getAnnotationMemberValueAnnotation__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotation__Marker_CREATE__SRC__mValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotation__Marker#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotation__Marker#getCONTEXT__TRG__tAnnotationValue()
	 * @see #getAnnotationMemberValueAnnotation__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotation__Marker_CONTEXT__TRG__tAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotation__Marker#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotation__Marker#getCREATE__TRG__tValue()
	 * @see #getAnnotationMemberValueAnnotation__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotation__Marker_CREATE__TRG__tValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotation__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotation__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @see #getAnnotationMemberValueAnnotation__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotation__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotation__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mType To TType</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotation__Marker#getCREATE__CORR__mTypeToTType()
	 * @see #getAnnotationMemberValueAnnotation__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotation__Marker_CREATE__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker <em>Annotation Member Value Annotation Array Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Annotation Array Marker</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker
	 * @generated
	 */
	EClass getAnnotationMemberValueAnnotationArray__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCONTEXT__SRC__AnnotationValue()
	 * @see #getAnnotationMemberValueAnnotationArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotationArray__Marker_CONTEXT__SRC__AnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__SRC__mArray <em>CREATE SRC mArray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mArray</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__SRC__mArray()
	 * @see #getAnnotationMemberValueAnnotationArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotationArray__Marker_CREATE__SRC__mArray();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__SRC__mValue()
	 * @see #getAnnotationMemberValueAnnotationArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotationArray__Marker_CREATE__SRC__mValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCONTEXT__TRG__tAnnotationValue()
	 * @see #getAnnotationMemberValueAnnotationArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotationArray__Marker_CONTEXT__TRG__tAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__TRG__tValue()
	 * @see #getAnnotationMemberValueAnnotationArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotationArray__Marker_CREATE__TRG__tValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @see #getAnnotationMemberValueAnnotationArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotationArray__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mType To TType</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__CORR__mTypeToTType()
	 * @see #getAnnotationMemberValueAnnotationArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueAnnotationArray__Marker_CREATE__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationMemberValueBoolean__Marker <em>Annotation Member Value Boolean Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Boolean Marker</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBoolean__Marker
	 * @generated
	 */
	EClass getAnnotationMemberValueBoolean__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBoolean__Marker#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBoolean__Marker#getCONTEXT__SRC__AnnotationValue()
	 * @see #getAnnotationMemberValueBoolean__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBoolean__Marker_CONTEXT__SRC__AnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBoolean__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBoolean__Marker#getCREATE__SRC__mValue()
	 * @see #getAnnotationMemberValueBoolean__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBoolean__Marker_CREATE__SRC__mValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBoolean__Marker#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBoolean__Marker#getCONTEXT__TRG__tAnnotationValue()
	 * @see #getAnnotationMemberValueBoolean__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBoolean__Marker_CONTEXT__TRG__tAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBoolean__Marker#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBoolean__Marker#getCREATE__TRG__tValue()
	 * @see #getAnnotationMemberValueBoolean__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBoolean__Marker_CREATE__TRG__tValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBoolean__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBoolean__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @see #getAnnotationMemberValueBoolean__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBoolean__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBoolean__Marker#getCREATE__CORR__mValueToTValue <em>CREATE CORR mValue To TValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mValue To TValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBoolean__Marker#getCREATE__CORR__mValueToTValue()
	 * @see #getAnnotationMemberValueBoolean__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBoolean__Marker_CREATE__CORR__mValueToTValue();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationMemberValueBooleanArray__Marker <em>Annotation Member Value Boolean Array Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Boolean Array Marker</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBooleanArray__Marker
	 * @generated
	 */
	EClass getAnnotationMemberValueBooleanArray__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCONTEXT__SRC__AnnotationValue()
	 * @see #getAnnotationMemberValueBooleanArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBooleanArray__Marker_CONTEXT__SRC__AnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCREATE__SRC__mArray <em>CREATE SRC mArray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mArray</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCREATE__SRC__mArray()
	 * @see #getAnnotationMemberValueBooleanArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBooleanArray__Marker_CREATE__SRC__mArray();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCREATE__SRC__mValue()
	 * @see #getAnnotationMemberValueBooleanArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBooleanArray__Marker_CREATE__SRC__mValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCONTEXT__TRG__tAnnotationValue()
	 * @see #getAnnotationMemberValueBooleanArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBooleanArray__Marker_CONTEXT__TRG__tAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCREATE__TRG__tValue()
	 * @see #getAnnotationMemberValueBooleanArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBooleanArray__Marker_CREATE__TRG__tValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @see #getAnnotationMemberValueBooleanArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBooleanArray__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCREATE__CORR__mValueToTValue <em>CREATE CORR mValue To TValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mValue To TValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueBooleanArray__Marker#getCREATE__CORR__mValueToTValue()
	 * @see #getAnnotationMemberValueBooleanArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueBooleanArray__Marker_CREATE__CORR__mValueToTValue();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationMemberValueClass__Marker <em>Annotation Member Value Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Class Marker</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClass__Marker
	 * @generated
	 */
	EClass getAnnotationMemberValueClass__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClass__Marker#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClass__Marker#getCONTEXT__SRC__AnnotationValue()
	 * @see #getAnnotationMemberValueClass__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClass__Marker_CONTEXT__SRC__AnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClass__Marker#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mAccess</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClass__Marker#getCREATE__SRC__mAccess()
	 * @see #getAnnotationMemberValueClass__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClass__Marker_CREATE__SRC__mAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClass__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mType</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClass__Marker#getCONTEXT__SRC__mType()
	 * @see #getAnnotationMemberValueClass__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClass__Marker_CONTEXT__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClass__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClass__Marker#getCREATE__SRC__mValue()
	 * @see #getAnnotationMemberValueClass__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClass__Marker_CREATE__SRC__mValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClass__Marker#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClass__Marker#getCONTEXT__TRG__tAnnotationValue()
	 * @see #getAnnotationMemberValueClass__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClass__Marker_CONTEXT__TRG__tAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClass__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tType</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClass__Marker#getCONTEXT__TRG__tType()
	 * @see #getAnnotationMemberValueClass__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClass__Marker_CONTEXT__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClass__Marker#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClass__Marker#getCREATE__TRG__tValue()
	 * @see #getAnnotationMemberValueClass__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClass__Marker_CREATE__TRG__tValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClass__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClass__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @see #getAnnotationMemberValueClass__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClass__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClass__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClass__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getAnnotationMemberValueClass__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClass__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClass__Marker#getCREATE__CORR__mValueToTValue <em>CREATE CORR mValue To TValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mValue To TValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClass__Marker#getCREATE__CORR__mValueToTValue()
	 * @see #getAnnotationMemberValueClass__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClass__Marker_CREATE__CORR__mValueToTValue();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker <em>Annotation Member Value Class Array Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Class Array Marker</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker
	 * @generated
	 */
	EClass getAnnotationMemberValueClassArray__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCONTEXT__SRC__AnnotationValue()
	 * @see #getAnnotationMemberValueClassArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClassArray__Marker_CONTEXT__SRC__AnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mAccess</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCREATE__SRC__mAccess()
	 * @see #getAnnotationMemberValueClassArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClassArray__Marker_CREATE__SRC__mAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCREATE__SRC__mArray <em>CREATE SRC mArray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mArray</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCREATE__SRC__mArray()
	 * @see #getAnnotationMemberValueClassArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClassArray__Marker_CREATE__SRC__mArray();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mType</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCONTEXT__SRC__mType()
	 * @see #getAnnotationMemberValueClassArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClassArray__Marker_CONTEXT__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCREATE__SRC__mValue()
	 * @see #getAnnotationMemberValueClassArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClassArray__Marker_CREATE__SRC__mValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCONTEXT__TRG__tAnnotationValue()
	 * @see #getAnnotationMemberValueClassArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClassArray__Marker_CONTEXT__TRG__tAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tType</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCONTEXT__TRG__tType()
	 * @see #getAnnotationMemberValueClassArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClassArray__Marker_CONTEXT__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCREATE__TRG__tValue()
	 * @see #getAnnotationMemberValueClassArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClassArray__Marker_CREATE__TRG__tValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @see #getAnnotationMemberValueClassArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClassArray__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getAnnotationMemberValueClassArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClassArray__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCREATE__CORR__mValueToTValue <em>CREATE CORR mValue To TValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mValue To TValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueClassArray__Marker#getCREATE__CORR__mValueToTValue()
	 * @see #getAnnotationMemberValueClassArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueClassArray__Marker_CREATE__CORR__mValueToTValue();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationMemberValueNumber__Marker <em>Annotation Member Value Number Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Number Marker</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumber__Marker
	 * @generated
	 */
	EClass getAnnotationMemberValueNumber__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumber__Marker#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumber__Marker#getCONTEXT__SRC__AnnotationValue()
	 * @see #getAnnotationMemberValueNumber__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumber__Marker_CONTEXT__SRC__AnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumber__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumber__Marker#getCREATE__SRC__mValue()
	 * @see #getAnnotationMemberValueNumber__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumber__Marker_CREATE__SRC__mValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumber__Marker#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumber__Marker#getCONTEXT__TRG__tAnnotationValue()
	 * @see #getAnnotationMemberValueNumber__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumber__Marker_CONTEXT__TRG__tAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumber__Marker#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumber__Marker#getCREATE__TRG__tValue()
	 * @see #getAnnotationMemberValueNumber__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumber__Marker_CREATE__TRG__tValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumber__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumber__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @see #getAnnotationMemberValueNumber__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumber__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumber__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mType To TType</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumber__Marker#getCREATE__CORR__mTypeToTType()
	 * @see #getAnnotationMemberValueNumber__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumber__Marker_CREATE__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationMemberValueNumberArray__Marker <em>Annotation Member Value Number Array Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Number Array Marker</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumberArray__Marker
	 * @generated
	 */
	EClass getAnnotationMemberValueNumberArray__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCONTEXT__SRC__AnnotationValue()
	 * @see #getAnnotationMemberValueNumberArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumberArray__Marker_CONTEXT__SRC__AnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCREATE__SRC__mArray <em>CREATE SRC mArray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mArray</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCREATE__SRC__mArray()
	 * @see #getAnnotationMemberValueNumberArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumberArray__Marker_CREATE__SRC__mArray();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCREATE__SRC__mValue()
	 * @see #getAnnotationMemberValueNumberArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumberArray__Marker_CREATE__SRC__mValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCONTEXT__TRG__tAnnotationValue()
	 * @see #getAnnotationMemberValueNumberArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumberArray__Marker_CONTEXT__TRG__tAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCREATE__TRG__tValue()
	 * @see #getAnnotationMemberValueNumberArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumberArray__Marker_CREATE__TRG__tValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @see #getAnnotationMemberValueNumberArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumberArray__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mType To TType</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueNumberArray__Marker#getCREATE__CORR__mTypeToTType()
	 * @see #getAnnotationMemberValueNumberArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueNumberArray__Marker_CREATE__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationMemberValueString__Marker <em>Annotation Member Value String Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value String Marker</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueString__Marker
	 * @generated
	 */
	EClass getAnnotationMemberValueString__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueString__Marker#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueString__Marker#getCONTEXT__SRC__AnnotationValue()
	 * @see #getAnnotationMemberValueString__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueString__Marker_CONTEXT__SRC__AnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueString__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueString__Marker#getCREATE__SRC__mValue()
	 * @see #getAnnotationMemberValueString__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueString__Marker_CREATE__SRC__mValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueString__Marker#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueString__Marker#getCONTEXT__TRG__tAnnotationValue()
	 * @see #getAnnotationMemberValueString__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueString__Marker_CONTEXT__TRG__tAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueString__Marker#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueString__Marker#getCREATE__TRG__tValue()
	 * @see #getAnnotationMemberValueString__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueString__Marker_CREATE__TRG__tValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueString__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueString__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @see #getAnnotationMemberValueString__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueString__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueString__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mType To TType</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueString__Marker#getCREATE__CORR__mTypeToTType()
	 * @see #getAnnotationMemberValueString__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueString__Marker_CREATE__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationMemberValueStringArray__Marker <em>Annotation Member Value String Array Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value String Array Marker</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueStringArray__Marker
	 * @generated
	 */
	EClass getAnnotationMemberValueStringArray__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCONTEXT__SRC__AnnotationValue()
	 * @see #getAnnotationMemberValueStringArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueStringArray__Marker_CONTEXT__SRC__AnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCREATE__SRC__mArray <em>CREATE SRC mArray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mArray</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCREATE__SRC__mArray()
	 * @see #getAnnotationMemberValueStringArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueStringArray__Marker_CREATE__SRC__mArray();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCREATE__SRC__mValue()
	 * @see #getAnnotationMemberValueStringArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueStringArray__Marker_CREATE__SRC__mValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCONTEXT__TRG__tAnnotationValue()
	 * @see #getAnnotationMemberValueStringArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueStringArray__Marker_CONTEXT__TRG__tAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tValue</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCREATE__TRG__tValue()
	 * @see #getAnnotationMemberValueStringArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueStringArray__Marker_CREATE__TRG__tValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @see #getAnnotationMemberValueStringArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueStringArray__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mType To TType</em>'.
	 * @see ModiscoTGG.AnnotationMemberValueStringArray__Marker#getCREATE__CORR__mTypeToTType()
	 * @see #getAnnotationMemberValueStringArray__Marker()
	 * @generated
	 */
	EReference getAnnotationMemberValueStringArray__Marker_CREATE__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker <em>Annotation On Body Declaration Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation On Body Declaration Marker</em>'.
	 * @see ModiscoTGG.AnnotationOnBodyDeclaration__Marker
	 * @generated
	 */
	EClass getAnnotationOnBodyDeclaration__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCREATE__SRC__Annotation <em>CREATE SRC Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC Annotation</em>'.
	 * @see ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCREATE__SRC__Annotation()
	 * @see #getAnnotationOnBodyDeclaration__Marker()
	 * @generated
	 */
	EReference getAnnotationOnBodyDeclaration__Marker_CREATE__SRC__Annotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCONTEXT__SRC__astNode <em>CONTEXT SRC ast Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC ast Node</em>'.
	 * @see ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCONTEXT__SRC__astNode()
	 * @see #getAnnotationOnBodyDeclaration__Marker()
	 * @generated
	 */
	EReference getAnnotationOnBodyDeclaration__Marker_CONTEXT__SRC__astNode();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCONTEXT__TRG__tAnnotable <em>CONTEXT TRG tAnnotable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotable</em>'.
	 * @see ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCONTEXT__TRG__tAnnotable()
	 * @see #getAnnotationOnBodyDeclaration__Marker()
	 * @generated
	 */
	EReference getAnnotationOnBodyDeclaration__Marker_CONTEXT__TRG__tAnnotable();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCREATE__TRG__tAnnotation <em>CREATE TRG tAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAnnotation</em>'.
	 * @see ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCREATE__TRG__tAnnotation()
	 * @see #getAnnotationOnBodyDeclaration__Marker()
	 * @generated
	 */
	EReference getAnnotationOnBodyDeclaration__Marker_CREATE__TRG__tAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCREATE__CORR__AnnotationToTAnnotation <em>CREATE CORR Annotation To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR Annotation To TAnnotation</em>'.
	 * @see ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCREATE__CORR__AnnotationToTAnnotation()
	 * @see #getAnnotationOnBodyDeclaration__Marker()
	 * @generated
	 */
	EReference getAnnotationOnBodyDeclaration__Marker_CREATE__CORR__AnnotationToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCONTEXT__CORR__aSTNodeToTAnnotable <em>CONTEXT CORR aST Node To TAnnotable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR aST Node To TAnnotable</em>'.
	 * @see ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCONTEXT__CORR__aSTNodeToTAnnotable()
	 * @see #getAnnotationOnBodyDeclaration__Marker()
	 * @generated
	 */
	EReference getAnnotationOnBodyDeclaration__Marker_CONTEXT__CORR__aSTNodeToTAnnotable();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationType__Marker <em>Annotation Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type Marker</em>'.
	 * @see ModiscoTGG.AnnotationType__Marker
	 * @generated
	 */
	EClass getAnnotationType__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationType__Marker#getCONTEXT__SRC__mPackage <em>CONTEXT SRC mPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mPackage</em>'.
	 * @see ModiscoTGG.AnnotationType__Marker#getCONTEXT__SRC__mPackage()
	 * @see #getAnnotationType__Marker()
	 * @generated
	 */
	EReference getAnnotationType__Marker_CONTEXT__SRC__mPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationType__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mType</em>'.
	 * @see ModiscoTGG.AnnotationType__Marker#getCREATE__SRC__mType()
	 * @see #getAnnotationType__Marker()
	 * @generated
	 */
	EReference getAnnotationType__Marker_CREATE__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationType__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.AnnotationType__Marker#getCONTEXT__TRG__pg()
	 * @see #getAnnotationType__Marker()
	 * @generated
	 */
	EReference getAnnotationType__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationType__Marker#getCONTEXT__TRG__tPackage <em>CONTEXT TRG tPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tPackage</em>'.
	 * @see ModiscoTGG.AnnotationType__Marker#getCONTEXT__TRG__tPackage()
	 * @see #getAnnotationType__Marker()
	 * @generated
	 */
	EReference getAnnotationType__Marker_CONTEXT__TRG__tPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationType__Marker#getCREATE__TRG__tType <em>CREATE TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tType</em>'.
	 * @see ModiscoTGG.AnnotationType__Marker#getCREATE__TRG__tType()
	 * @see #getAnnotationType__Marker()
	 * @generated
	 */
	EReference getAnnotationType__Marker_CREATE__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationType__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mBody To TAnnotation</em>'.
	 * @see ModiscoTGG.AnnotationType__Marker#getCREATE__CORR__mBodyToTAnnotation()
	 * @see #getAnnotationType__Marker()
	 * @generated
	 */
	EReference getAnnotationType__Marker_CREATE__CORR__mBodyToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationType__Marker#getCONTEXT__CORR__mPackageToTPackage <em>CONTEXT CORR mPackage To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mPackage To TPackage</em>'.
	 * @see ModiscoTGG.AnnotationType__Marker#getCONTEXT__CORR__mPackageToTPackage()
	 * @see #getAnnotationType__Marker()
	 * @generated
	 */
	EReference getAnnotationType__Marker_CONTEXT__CORR__mPackageToTPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationType__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mType To TType</em>'.
	 * @see ModiscoTGG.AnnotationType__Marker#getCREATE__CORR__mTypeToTType()
	 * @see #getAnnotationType__Marker()
	 * @generated
	 */
	EReference getAnnotationType__Marker_CREATE__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationTypeAccess__Marker <em>Annotation Type Access Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type Access Marker</em>'.
	 * @see ModiscoTGG.AnnotationTypeAccess__Marker
	 * @generated
	 */
	EClass getAnnotationTypeAccess__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__SRC__Annotation <em>CONTEXT SRC Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation</em>'.
	 * @see ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__SRC__Annotation()
	 * @see #getAnnotationTypeAccess__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeAccess__Marker_CONTEXT__SRC__Annotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__SRC__AnnotationType <em>CONTEXT SRC Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation Type</em>'.
	 * @see ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__SRC__AnnotationType()
	 * @see #getAnnotationTypeAccess__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeAccess__Marker_CONTEXT__SRC__AnnotationType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mAccess</em>'.
	 * @see ModiscoTGG.AnnotationTypeAccess__Marker#getCREATE__SRC__mAccess()
	 * @see #getAnnotationTypeAccess__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeAccess__Marker_CREATE__SRC__mAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__TRG__tAnnotation <em>CONTEXT TRG tAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation</em>'.
	 * @see ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__TRG__tAnnotation()
	 * @see #getAnnotationTypeAccess__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeAccess__Marker_CONTEXT__TRG__tAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__TRG__tAnnotationType <em>CONTEXT TRG tAnnotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation Type</em>'.
	 * @see ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__TRG__tAnnotationType()
	 * @see #getAnnotationTypeAccess__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeAccess__Marker_CONTEXT__TRG__tAnnotationType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__CORR__AnnotationToTAnnotation <em>CONTEXT CORR Annotation To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation To TAnnotation</em>'.
	 * @see ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__CORR__AnnotationToTAnnotation()
	 * @see #getAnnotationTypeAccess__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeAccess__Marker_CONTEXT__CORR__AnnotationToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__CORR__AnnotationTypeToTAnnotationType <em>CONTEXT CORR Annotation Type To TAnnotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR Annotation Type To TAnnotation Type</em>'.
	 * @see ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__CORR__AnnotationTypeToTAnnotationType()
	 * @see #getAnnotationTypeAccess__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeAccess__Marker_CONTEXT__CORR__AnnotationTypeToTAnnotationType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker <em>Annotation Type In Anonymous Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type In Anonymous Marker</em>'.
	 * @see ModiscoTGG.AnnotationTypeInAnonymous__Marker
	 * @generated
	 */
	EClass getAnnotationTypeInAnonymous__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__SRC__eAnonymousClassDeclaration <em>CONTEXT SRC eAnonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eAnonymous Class Declaration</em>'.
	 * @see ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__SRC__eAnonymousClassDeclaration()
	 * @see #getAnnotationTypeInAnonymous__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeInAnonymous__Marker_CONTEXT__SRC__eAnonymousClassDeclaration();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__SRC__mNestedType <em>CREATE SRC mNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mNested Type</em>'.
	 * @see ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__SRC__mNestedType()
	 * @see #getAnnotationTypeInAnonymous__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeInAnonymous__Marker_CREATE__SRC__mNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__TRG__pg()
	 * @see #getAnnotationTypeInAnonymous__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeInAnonymous__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tClass</em>'.
	 * @see ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__TRG__tClass()
	 * @see #getAnnotationTypeInAnonymous__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeInAnonymous__Marker_CONTEXT__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNested Type</em>'.
	 * @see ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__TRG__tNestedType()
	 * @see #getAnnotationTypeInAnonymous__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeInAnonymous__Marker_CREATE__TRG__tNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>'.
	 * @see ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass()
	 * @see #getAnnotationTypeInAnonymous__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeInAnonymous__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__CORR__mNestedTypeToTNestedType <em>CREATE CORR mNested Type To TNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mNested Type To TNested Type</em>'.
	 * @see ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__CORR__mNestedTypeToTNestedType()
	 * @see #getAnnotationTypeInAnonymous__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeInAnonymous__Marker_CREATE__CORR__mNestedTypeToTNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__CORR__mbodyToTAnnotatable <em>CREATE CORR mbody To TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mbody To TAnnotatable</em>'.
	 * @see ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__CORR__mbodyToTAnnotatable()
	 * @see #getAnnotationTypeInAnonymous__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeInAnonymous__Marker_CREATE__CORR__mbodyToTAnnotatable();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnnotationTypeNested__Marker <em>Annotation Type Nested Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type Nested Marker</em>'.
	 * @see ModiscoTGG.AnnotationTypeNested__Marker
	 * @generated
	 */
	EClass getAnnotationTypeNested__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__SRC__eNestedType <em>CREATE SRC eNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC eNested Type</em>'.
	 * @see ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__SRC__eNestedType()
	 * @see #getAnnotationTypeNested__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeNested__Marker_CREATE__SRC__eNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__SRC__eOuterType <em>CONTEXT SRC eOuter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eOuter Type</em>'.
	 * @see ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__SRC__eOuterType()
	 * @see #getAnnotationTypeNested__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeNested__Marker_CONTEXT__SRC__eOuterType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__TRG__tNestedPackage <em>CREATE TRG tNested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNested Package</em>'.
	 * @see ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__TRG__tNestedPackage()
	 * @see #getAnnotationTypeNested__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeNested__Marker_CREATE__TRG__tNestedPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNested Type</em>'.
	 * @see ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__TRG__tNestedType()
	 * @see #getAnnotationTypeNested__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeNested__Marker_CREATE__TRG__tNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__TRG__tOuterPackage <em>CONTEXT TRG tOuter Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOuter Package</em>'.
	 * @see ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__TRG__tOuterPackage()
	 * @see #getAnnotationTypeNested__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeNested__Marker_CONTEXT__TRG__tOuterPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__TRG__tOuterType <em>CONTEXT TRG tOuter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOuter Type</em>'.
	 * @see ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__TRG__tOuterType()
	 * @see #getAnnotationTypeNested__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeNested__Marker_CONTEXT__TRG__tOuterType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getAnnotationTypeNested__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeNested__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__CORR__eNestedTypeToTNestedType <em>CREATE CORR eNested Type To TNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR eNested Type To TNested Type</em>'.
	 * @see ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__CORR__eNestedTypeToTNestedType()
	 * @see #getAnnotationTypeNested__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeNested__Marker_CREATE__CORR__eNestedTypeToTNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__CORR__eOuterTypeToTOuterInterface <em>CONTEXT CORR eOuter Type To TOuter Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eOuter Type To TOuter Interface</em>'.
	 * @see ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__CORR__eOuterTypeToTOuterInterface()
	 * @see #getAnnotationTypeNested__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeNested__Marker_CONTEXT__CORR__eOuterTypeToTOuterInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mBody To TAnnotation</em>'.
	 * @see ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__CORR__mBodyToTAnnotation()
	 * @see #getAnnotationTypeNested__Marker()
	 * @generated
	 */
	EReference getAnnotationTypeNested__Marker_CREATE__CORR__mBodyToTAnnotation();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnonymousClass__Marker <em>Anonymous Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Class Marker</em>'.
	 * @see ModiscoTGG.AnonymousClass__Marker
	 * @generated
	 */
	EClass getAnonymousClass__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClass__Marker#getCREATE__SRC__mAnonymous <em>CREATE SRC mAnonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mAnonymous</em>'.
	 * @see ModiscoTGG.AnonymousClass__Marker#getCREATE__SRC__mAnonymous()
	 * @see #getAnonymousClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClass__Marker_CREATE__SRC__mAnonymous();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mType</em>'.
	 * @see ModiscoTGG.AnonymousClass__Marker#getCONTEXT__SRC__mType()
	 * @see #getAnonymousClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClass__Marker_CONTEXT__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.AnonymousClass__Marker#getCONTEXT__TRG__pg()
	 * @see #getAnonymousClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClass__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClass__Marker#getCREATE__TRG__tAnonymous <em>CREATE TRG tAnonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAnonymous</em>'.
	 * @see ModiscoTGG.AnonymousClass__Marker#getCREATE__TRG__tAnonymous()
	 * @see #getAnonymousClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClass__Marker_CREATE__TRG__tAnonymous();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClass__Marker#getCREATE__TRG__tNewPackage <em>CREATE TRG tNew Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNew Package</em>'.
	 * @see ModiscoTGG.AnonymousClass__Marker#getCREATE__TRG__tNewPackage()
	 * @see #getAnonymousClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClass__Marker_CREATE__TRG__tNewPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__TRG__tPackage <em>CONTEXT TRG tPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tPackage</em>'.
	 * @see ModiscoTGG.AnonymousClass__Marker#getCONTEXT__TRG__tPackage()
	 * @see #getAnonymousClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClass__Marker_CONTEXT__TRG__tPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tType</em>'.
	 * @see ModiscoTGG.AnonymousClass__Marker#getCONTEXT__TRG__tType()
	 * @see #getAnonymousClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClass__Marker_CONTEXT__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClass__Marker#getCREATE__CORR__eAnonymousClassDeclarationToTClass <em>CREATE CORR eAnonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR eAnonymous Class Declaration To TClass</em>'.
	 * @see ModiscoTGG.AnonymousClass__Marker#getCREATE__CORR__eAnonymousClassDeclarationToTClass()
	 * @see #getAnonymousClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClass__Marker_CREATE__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.AnonymousClass__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getAnonymousClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClass__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnonymousClassTypeClass__Marker <em>Anonymous Class Type Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Class Type Class Marker</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeClass__Marker
	 * @generated
	 */
	EClass getAnonymousClassTypeClass__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__SRC__mAnonymous <em>CONTEXT SRC mAnonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mAnonymous</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__SRC__mAnonymous()
	 * @see #getAnonymousClassTypeClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeClass__Marker_CONTEXT__SRC__mAnonymous();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCREATE__SRC__mCreation <em>CREATE SRC mCreation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mCreation</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeClass__Marker#getCREATE__SRC__mCreation()
	 * @see #getAnonymousClassTypeClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeClass__Marker_CREATE__SRC__mCreation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__SRC__mParent <em>CONTEXT SRC mParent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mParent</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__SRC__mParent()
	 * @see #getAnonymousClassTypeClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeClass__Marker_CONTEXT__SRC__mParent();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mType</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeClass__Marker#getCREATE__SRC__mType()
	 * @see #getAnonymousClassTypeClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeClass__Marker_CREATE__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tClass</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__TRG__tClass()
	 * @see #getAnonymousClassTypeClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeClass__Marker_CONTEXT__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__TRG__tParent <em>CONTEXT TRG tParent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tParent</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__TRG__tParent()
	 * @see #getAnonymousClassTypeClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeClass__Marker_CONTEXT__TRG__tParent();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass()
	 * @see #getAnonymousClassTypeClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeClass__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__CORR__parentToParent <em>CONTEXT CORR parent To Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR parent To Parent</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__CORR__parentToParent()
	 * @see #getAnonymousClassTypeClass__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeClass__Marker_CONTEXT__CORR__parentToParent();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.AnonymousClassTypeInterface__Marker <em>Anonymous Class Type Interface Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Class Type Interface Marker</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeInterface__Marker
	 * @generated
	 */
	EClass getAnonymousClassTypeInterface__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeInterface__Marker#getCONTEXT__SRC__mAnonymous <em>CONTEXT SRC mAnonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mAnonymous</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeInterface__Marker#getCONTEXT__SRC__mAnonymous()
	 * @see #getAnonymousClassTypeInterface__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeInterface__Marker_CONTEXT__SRC__mAnonymous();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeInterface__Marker#getCREATE__SRC__mCreation <em>CREATE SRC mCreation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mCreation</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeInterface__Marker#getCREATE__SRC__mCreation()
	 * @see #getAnonymousClassTypeInterface__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeInterface__Marker_CREATE__SRC__mCreation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeInterface__Marker#getCONTEXT__SRC__mParent <em>CONTEXT SRC mParent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mParent</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeInterface__Marker#getCONTEXT__SRC__mParent()
	 * @see #getAnonymousClassTypeInterface__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeInterface__Marker_CONTEXT__SRC__mParent();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeInterface__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mType</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeInterface__Marker#getCREATE__SRC__mType()
	 * @see #getAnonymousClassTypeInterface__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeInterface__Marker_CREATE__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeInterface__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tClass</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeInterface__Marker#getCONTEXT__TRG__tClass()
	 * @see #getAnonymousClassTypeInterface__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeInterface__Marker_CONTEXT__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeInterface__Marker#getCONTEXT__TRG__tParent <em>CONTEXT TRG tParent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tParent</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeInterface__Marker#getCONTEXT__TRG__tParent()
	 * @see #getAnonymousClassTypeInterface__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeInterface__Marker_CONTEXT__TRG__tParent();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeInterface__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeInterface__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass()
	 * @see #getAnonymousClassTypeInterface__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeInterface__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.AnonymousClassTypeInterface__Marker#getCONTEXT__CORR__parentToParent <em>CONTEXT CORR parent To Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR parent To Parent</em>'.
	 * @see ModiscoTGG.AnonymousClassTypeInterface__Marker#getCONTEXT__CORR__parentToParent()
	 * @see #getAnonymousClassTypeInterface__Marker()
	 * @generated
	 */
	EReference getAnonymousClassTypeInterface__Marker_CONTEXT__CORR__parentToParent();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker <em>Array Initializer Ignore Expressions Edge Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Initializer Ignore Expressions Edge Marker</em>'.
	 * @see ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker
	 * @generated
	 */
	EClass getArrayInitializerIgnoreExpressionsEdge__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker#getCONTEXT__SRC__array <em>CONTEXT SRC array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC array</em>'.
	 * @see ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker#getCONTEXT__SRC__array()
	 * @see #getArrayInitializerIgnoreExpressionsEdge__Marker()
	 * @generated
	 */
	EReference getArrayInitializerIgnoreExpressionsEdge__Marker_CONTEXT__SRC__array();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker#getCONTEXT__SRC__invocation <em>CONTEXT SRC invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC invocation</em>'.
	 * @see ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker#getCONTEXT__SRC__invocation()
	 * @see #getArrayInitializerIgnoreExpressionsEdge__Marker()
	 * @generated
	 */
	EReference getArrayInitializerIgnoreExpressionsEdge__Marker_CONTEXT__SRC__invocation();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ArrayTypeToClass__Marker <em>Array Type To Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type To Class Marker</em>'.
	 * @see ModiscoTGG.ArrayTypeToClass__Marker
	 * @generated
	 */
	EClass getArrayTypeToClass__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCREATE__SRC__eArrayType <em>CREATE SRC eArray Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC eArray Type</em>'.
	 * @see ModiscoTGG.ArrayTypeToClass__Marker#getCREATE__SRC__eArrayType()
	 * @see #getArrayTypeToClass__Marker()
	 * @generated
	 */
	EReference getArrayTypeToClass__Marker_CREATE__SRC__eArrayType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__SRC__eModel()
	 * @see #getArrayTypeToClass__Marker()
	 * @generated
	 */
	EReference getArrayTypeToClass__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__SRC__eType <em>CONTEXT SRC eType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eType</em>'.
	 * @see ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__SRC__eType()
	 * @see #getArrayTypeToClass__Marker()
	 * @generated
	 */
	EReference getArrayTypeToClass__Marker_CONTEXT__SRC__eType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC eType Access</em>'.
	 * @see ModiscoTGG.ArrayTypeToClass__Marker#getCREATE__SRC__eTypeAccess()
	 * @see #getArrayTypeToClass__Marker()
	 * @generated
	 */
	EReference getArrayTypeToClass__Marker_CREATE__SRC__eTypeAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__TRG__tArrayClass <em>CONTEXT TRG tArray Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tArray Class</em>'.
	 * @see ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__TRG__tArrayClass()
	 * @see #getArrayTypeToClass__Marker()
	 * @generated
	 */
	EReference getArrayTypeToClass__Marker_CONTEXT__TRG__tArrayClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getArrayTypeToClass__Marker()
	 * @generated
	 */
	EReference getArrayTypeToClass__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCREATE__CORR__eArrayTypeToTArrayClass <em>CREATE CORR eArray Type To TArray Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR eArray Type To TArray Class</em>'.
	 * @see ModiscoTGG.ArrayTypeToClass__Marker#getCREATE__CORR__eArrayTypeToTArrayClass()
	 * @see #getArrayTypeToClass__Marker()
	 * @generated
	 */
	EReference getArrayTypeToClass__Marker_CREATE__CORR__eArrayTypeToTArrayClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Type Graph</em>'.
	 * @see ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__CORR__eModelToTypeGraph()
	 * @see #getArrayTypeToClass__Marker()
	 * @generated
	 */
	EReference getArrayTypeToClass__Marker_CONTEXT__CORR__eModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__CORR__eTypeToTArrayClass <em>CONTEXT CORR eType To TArray Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eType To TArray Class</em>'.
	 * @see ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__CORR__eTypeToTArrayClass()
	 * @see #getArrayTypeToClass__Marker()
	 * @generated
	 */
	EReference getArrayTypeToClass__Marker_CONTEXT__CORR__eTypeToTArrayClass();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.Class__Marker <em>Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Marker</em>'.
	 * @see ModiscoTGG.Class__Marker
	 * @generated
	 */
	EClass getClass__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Class__Marker#getCONTEXT__SRC__mPackage <em>CONTEXT SRC mPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mPackage</em>'.
	 * @see ModiscoTGG.Class__Marker#getCONTEXT__SRC__mPackage()
	 * @see #getClass__Marker()
	 * @generated
	 */
	EReference getClass__Marker_CONTEXT__SRC__mPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Class__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mType</em>'.
	 * @see ModiscoTGG.Class__Marker#getCREATE__SRC__mType()
	 * @see #getClass__Marker()
	 * @generated
	 */
	EReference getClass__Marker_CREATE__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Class__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.Class__Marker#getCONTEXT__TRG__pg()
	 * @see #getClass__Marker()
	 * @generated
	 */
	EReference getClass__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Class__Marker#getCONTEXT__TRG__tPackage <em>CONTEXT TRG tPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tPackage</em>'.
	 * @see ModiscoTGG.Class__Marker#getCONTEXT__TRG__tPackage()
	 * @see #getClass__Marker()
	 * @generated
	 */
	EReference getClass__Marker_CONTEXT__TRG__tPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Class__Marker#getCREATE__TRG__tType <em>CREATE TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tType</em>'.
	 * @see ModiscoTGG.Class__Marker#getCREATE__TRG__tType()
	 * @see #getClass__Marker()
	 * @generated
	 */
	EReference getClass__Marker_CREATE__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Class__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mBody To TAnnotation</em>'.
	 * @see ModiscoTGG.Class__Marker#getCREATE__CORR__mBodyToTAnnotation()
	 * @see #getClass__Marker()
	 * @generated
	 */
	EReference getClass__Marker_CREATE__CORR__mBodyToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Class__Marker#getCREATE__CORR__mClassDeclarationToTClass <em>CREATE CORR mClass Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mClass Declaration To TClass</em>'.
	 * @see ModiscoTGG.Class__Marker#getCREATE__CORR__mClassDeclarationToTClass()
	 * @see #getClass__Marker()
	 * @generated
	 */
	EReference getClass__Marker_CREATE__CORR__mClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Class__Marker#getCONTEXT__CORR__mPackageToTPackage <em>CONTEXT CORR mPackage To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mPackage To TPackage</em>'.
	 * @see ModiscoTGG.Class__Marker#getCONTEXT__CORR__mPackageToTPackage()
	 * @see #getClass__Marker()
	 * @generated
	 */
	EReference getClass__Marker_CONTEXT__CORR__mPackageToTPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Class__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mType To TType</em>'.
	 * @see ModiscoTGG.Class__Marker#getCREATE__CORR__mTypeToTType()
	 * @see #getClass__Marker()
	 * @generated
	 */
	EReference getClass__Marker_CREATE__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ClassExtendsClass__Marker <em>Class Extends Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Extends Class Marker</em>'.
	 * @see ModiscoTGG.ClassExtendsClass__Marker
	 * @generated
	 */
	EClass getClassExtendsClass__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__SRC__eClassDeclaration <em>CONTEXT SRC eClass Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eClass Declaration</em>'.
	 * @see ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__SRC__eClassDeclaration()
	 * @see #getClassExtendsClass__Marker()
	 * @generated
	 */
	EReference getClassExtendsClass__Marker_CONTEXT__SRC__eClassDeclaration();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__SRC__eExtendedClass <em>CONTEXT SRC eExtended Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eExtended Class</em>'.
	 * @see ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__SRC__eExtendedClass()
	 * @see #getClassExtendsClass__Marker()
	 * @generated
	 */
	EReference getClassExtendsClass__Marker_CONTEXT__SRC__eExtendedClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassExtendsClass__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC eType Access</em>'.
	 * @see ModiscoTGG.ClassExtendsClass__Marker#getCREATE__SRC__eTypeAccess()
	 * @see #getClassExtendsClass__Marker()
	 * @generated
	 */
	EReference getClassExtendsClass__Marker_CREATE__SRC__eTypeAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tClass</em>'.
	 * @see ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__TRG__tClass()
	 * @see #getClassExtendsClass__Marker()
	 * @generated
	 */
	EReference getClassExtendsClass__Marker_CONTEXT__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__TRG__tExtendedClass <em>CONTEXT TRG tExtended Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tExtended Class</em>'.
	 * @see ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__TRG__tExtendedClass()
	 * @see #getClassExtendsClass__Marker()
	 * @generated
	 */
	EReference getClassExtendsClass__Marker_CONTEXT__TRG__tExtendedClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__CORR__eClassDeclarationToTClass <em>CONTEXT CORR eClass Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eClass Declaration To TClass</em>'.
	 * @see ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__CORR__eClassDeclarationToTClass()
	 * @see #getClassExtendsClass__Marker()
	 * @generated
	 */
	EReference getClassExtendsClass__Marker_CONTEXT__CORR__eClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__CORR__eExtendedClassToTExtendedClass <em>CONTEXT CORR eExtended Class To TExtended Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eExtended Class To TExtended Class</em>'.
	 * @see ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__CORR__eExtendedClassToTExtendedClass()
	 * @see #getClassExtendsClass__Marker()
	 * @generated
	 */
	EReference getClassExtendsClass__Marker_CONTEXT__CORR__eExtendedClassToTExtendedClass();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ClassImplementsInterface__Marker <em>Class Implements Interface Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Implements Interface Marker</em>'.
	 * @see ModiscoTGG.ClassImplementsInterface__Marker
	 * @generated
	 */
	EClass getClassImplementsInterface__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__SRC__eClassDeclaration <em>CONTEXT SRC eClass Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eClass Declaration</em>'.
	 * @see ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__SRC__eClassDeclaration()
	 * @see #getClassImplementsInterface__Marker()
	 * @generated
	 */
	EReference getClassImplementsInterface__Marker_CONTEXT__SRC__eClassDeclaration();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__SRC__eSuperInterface <em>CONTEXT SRC eSuper Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eSuper Interface</em>'.
	 * @see ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__SRC__eSuperInterface()
	 * @see #getClassImplementsInterface__Marker()
	 * @generated
	 */
	EReference getClassImplementsInterface__Marker_CONTEXT__SRC__eSuperInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC eType Access</em>'.
	 * @see ModiscoTGG.ClassImplementsInterface__Marker#getCREATE__SRC__eTypeAccess()
	 * @see #getClassImplementsInterface__Marker()
	 * @generated
	 */
	EReference getClassImplementsInterface__Marker_CREATE__SRC__eTypeAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tClass</em>'.
	 * @see ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__TRG__tClass()
	 * @see #getClassImplementsInterface__Marker()
	 * @generated
	 */
	EReference getClassImplementsInterface__Marker_CONTEXT__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__TRG__tSuperInterface <em>CONTEXT TRG tSuper Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tSuper Interface</em>'.
	 * @see ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__TRG__tSuperInterface()
	 * @see #getClassImplementsInterface__Marker()
	 * @generated
	 */
	EReference getClassImplementsInterface__Marker_CONTEXT__TRG__tSuperInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__CORR__eClassDeclarationToTClass <em>CONTEXT CORR eClass Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eClass Declaration To TClass</em>'.
	 * @see ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__CORR__eClassDeclarationToTClass()
	 * @see #getClassImplementsInterface__Marker()
	 * @generated
	 */
	EReference getClassImplementsInterface__Marker_CONTEXT__CORR__eClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__CORR__eSuperInterfaceToTSuperInterface <em>CONTEXT CORR eSuper Interface To TSuper Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eSuper Interface To TSuper Interface</em>'.
	 * @see ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__CORR__eSuperInterfaceToTSuperInterface()
	 * @see #getClassImplementsInterface__Marker()
	 * @generated
	 */
	EReference getClassImplementsInterface__Marker_CONTEXT__CORR__eSuperInterfaceToTSuperInterface();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ClassInAnonymous__Marker <em>Class In Anonymous Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class In Anonymous Marker</em>'.
	 * @see ModiscoTGG.ClassInAnonymous__Marker
	 * @generated
	 */
	EClass getClassInAnonymous__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInAnonymous__Marker#getCONTEXT__SRC__eAnonymousClassDeclaration <em>CONTEXT SRC eAnonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eAnonymous Class Declaration</em>'.
	 * @see ModiscoTGG.ClassInAnonymous__Marker#getCONTEXT__SRC__eAnonymousClassDeclaration()
	 * @see #getClassInAnonymous__Marker()
	 * @generated
	 */
	EReference getClassInAnonymous__Marker_CONTEXT__SRC__eAnonymousClassDeclaration();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInAnonymous__Marker#getCREATE__SRC__mNestedType <em>CREATE SRC mNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mNested Type</em>'.
	 * @see ModiscoTGG.ClassInAnonymous__Marker#getCREATE__SRC__mNestedType()
	 * @see #getClassInAnonymous__Marker()
	 * @generated
	 */
	EReference getClassInAnonymous__Marker_CREATE__SRC__mNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInAnonymous__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.ClassInAnonymous__Marker#getCONTEXT__TRG__pg()
	 * @see #getClassInAnonymous__Marker()
	 * @generated
	 */
	EReference getClassInAnonymous__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInAnonymous__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tClass</em>'.
	 * @see ModiscoTGG.ClassInAnonymous__Marker#getCONTEXT__TRG__tClass()
	 * @see #getClassInAnonymous__Marker()
	 * @generated
	 */
	EReference getClassInAnonymous__Marker_CONTEXT__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInAnonymous__Marker#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNested Type</em>'.
	 * @see ModiscoTGG.ClassInAnonymous__Marker#getCREATE__TRG__tNestedType()
	 * @see #getClassInAnonymous__Marker()
	 * @generated
	 */
	EReference getClassInAnonymous__Marker_CREATE__TRG__tNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInAnonymous__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>'.
	 * @see ModiscoTGG.ClassInAnonymous__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass()
	 * @see #getClassInAnonymous__Marker()
	 * @generated
	 */
	EReference getClassInAnonymous__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInAnonymous__Marker#getCREATE__CORR__mClassDeclarationToTClass <em>CREATE CORR mClass Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mClass Declaration To TClass</em>'.
	 * @see ModiscoTGG.ClassInAnonymous__Marker#getCREATE__CORR__mClassDeclarationToTClass()
	 * @see #getClassInAnonymous__Marker()
	 * @generated
	 */
	EReference getClassInAnonymous__Marker_CREATE__CORR__mClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInAnonymous__Marker#getCREATE__CORR__mNestedTypeToTNestedType <em>CREATE CORR mNested Type To TNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mNested Type To TNested Type</em>'.
	 * @see ModiscoTGG.ClassInAnonymous__Marker#getCREATE__CORR__mNestedTypeToTNestedType()
	 * @see #getClassInAnonymous__Marker()
	 * @generated
	 */
	EReference getClassInAnonymous__Marker_CREATE__CORR__mNestedTypeToTNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInAnonymous__Marker#getCREATE__CORR__mbodyToTAnnotatable <em>CREATE CORR mbody To TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mbody To TAnnotatable</em>'.
	 * @see ModiscoTGG.ClassInAnonymous__Marker#getCREATE__CORR__mbodyToTAnnotatable()
	 * @see #getClassInAnonymous__Marker()
	 * @generated
	 */
	EReference getClassInAnonymous__Marker_CREATE__CORR__mbodyToTAnnotatable();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker <em>Class Inner Anon Class Member Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Inner Anon Class Member Marker</em>'.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker
	 * @generated
	 */
	EClass getClassInnerAnonClassMember__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__SRC__eOuterClass <em>CONTEXT SRC eOuter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eOuter Class</em>'.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__SRC__eOuterClass()
	 * @see #getClassInnerAnonClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerAnonClassMember__Marker_CONTEXT__SRC__eOuterClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mDefinition</em>'.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__SRC__mDefinition()
	 * @see #getClassInnerAnonClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerAnonClassMember__Marker_CONTEXT__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__SRC__mInnerClass <em>CREATE SRC mInner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mInner Class</em>'.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__SRC__mInnerClass()
	 * @see #getClassInnerAnonClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerAnonClassMember__Marker_CREATE__SRC__mInnerClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__TRG__tInnerClass <em>CREATE TRG tInner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tInner Class</em>'.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__TRG__tInnerClass()
	 * @see #getClassInnerAnonClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerAnonClassMember__Marker_CREATE__TRG__tInnerClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__TRG__tInnerPackage <em>CREATE TRG tInner Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tInner Package</em>'.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__TRG__tInnerPackage()
	 * @see #getClassInnerAnonClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerAnonClassMember__Marker_CREATE__TRG__tInnerPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__TRG__tOuterClass <em>CONTEXT TRG tOuter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOuter Class</em>'.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__TRG__tOuterClass()
	 * @see #getClassInnerAnonClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerAnonClassMember__Marker_CONTEXT__TRG__tOuterClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__TRG__tOuterPackage <em>CONTEXT TRG tOuter Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOuter Package</em>'.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__TRG__tOuterPackage()
	 * @see #getClassInnerAnonClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerAnonClassMember__Marker_CONTEXT__TRG__tOuterPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getClassInnerAnonClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerAnonClassMember__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__CORR__eOuterClassToTOuterClass <em>CONTEXT CORR eOuter Class To TOuter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eOuter Class To TOuter Class</em>'.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__CORR__eOuterClassToTOuterClass()
	 * @see #getClassInnerAnonClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerAnonClassMember__Marker_CONTEXT__CORR__eOuterClassToTOuterClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__CORR__tInnerClassToTInnerClass <em>CREATE CORR tInner Class To TInner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR tInner Class To TInner Class</em>'.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__CORR__tInnerClassToTInnerClass()
	 * @see #getClassInnerAnonClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerAnonClassMember__Marker_CREATE__CORR__tInnerClassToTInnerClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__CORR__tInnerTypeToTInnerAbstractType <em>CREATE CORR tInner Type To TInner Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR tInner Type To TInner Abstract Type</em>'.
	 * @see ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__CORR__tInnerTypeToTInnerAbstractType()
	 * @see #getClassInnerAnonClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerAnonClassMember__Marker_CREATE__CORR__tInnerTypeToTInnerAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ClassInnerClassMember__Marker <em>Class Inner Class Member Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Inner Class Member Marker</em>'.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker
	 * @generated
	 */
	EClass getClassInnerClassMember__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerClassMember__Marker#getCONTEXT__SRC__eOuterClass <em>CONTEXT SRC eOuter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eOuter Class</em>'.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker#getCONTEXT__SRC__eOuterClass()
	 * @see #getClassInnerClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerClassMember__Marker_CONTEXT__SRC__eOuterClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerClassMember__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mDefinition</em>'.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker#getCONTEXT__SRC__mDefinition()
	 * @see #getClassInnerClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerClassMember__Marker_CONTEXT__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerClassMember__Marker#getCREATE__SRC__mInnerClass <em>CREATE SRC mInner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mInner Class</em>'.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker#getCREATE__SRC__mInnerClass()
	 * @see #getClassInnerClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerClassMember__Marker_CREATE__SRC__mInnerClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerClassMember__Marker#getCREATE__TRG__tInnerClass <em>CREATE TRG tInner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tInner Class</em>'.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker#getCREATE__TRG__tInnerClass()
	 * @see #getClassInnerClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerClassMember__Marker_CREATE__TRG__tInnerClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerClassMember__Marker#getCREATE__TRG__tInnerPackage <em>CREATE TRG tInner Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tInner Package</em>'.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker#getCREATE__TRG__tInnerPackage()
	 * @see #getClassInnerClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerClassMember__Marker_CREATE__TRG__tInnerPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerClassMember__Marker#getCONTEXT__TRG__tOuterClass <em>CONTEXT TRG tOuter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOuter Class</em>'.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker#getCONTEXT__TRG__tOuterClass()
	 * @see #getClassInnerClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerClassMember__Marker_CONTEXT__TRG__tOuterClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerClassMember__Marker#getCONTEXT__TRG__tOuterPackage <em>CONTEXT TRG tOuter Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOuter Package</em>'.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker#getCONTEXT__TRG__tOuterPackage()
	 * @see #getClassInnerClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerClassMember__Marker_CONTEXT__TRG__tOuterPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerClassMember__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getClassInnerClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerClassMember__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerClassMember__Marker#getCONTEXT__CORR__eOuterClassToTOuterClass <em>CONTEXT CORR eOuter Class To TOuter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eOuter Class To TOuter Class</em>'.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker#getCONTEXT__CORR__eOuterClassToTOuterClass()
	 * @see #getClassInnerClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerClassMember__Marker_CONTEXT__CORR__eOuterClassToTOuterClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerClassMember__Marker#getCREATE__CORR__tInnerClassToTInnerClass <em>CREATE CORR tInner Class To TInner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR tInner Class To TInner Class</em>'.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker#getCREATE__CORR__tInnerClassToTInnerClass()
	 * @see #getClassInnerClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerClassMember__Marker_CREATE__CORR__tInnerClassToTInnerClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInnerClassMember__Marker#getCREATE__CORR__tInnerTypeToTInnerAbstractType <em>CREATE CORR tInner Type To TInner Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR tInner Type To TInner Abstract Type</em>'.
	 * @see ModiscoTGG.ClassInnerClassMember__Marker#getCREATE__CORR__tInnerTypeToTInnerAbstractType()
	 * @see #getClassInnerClassMember__Marker()
	 * @generated
	 */
	EReference getClassInnerClassMember__Marker_CREATE__CORR__tInnerTypeToTInnerAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ClassInstanceCreation__Marker <em>Class Instance Creation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Instance Creation Marker</em>'.
	 * @see ModiscoTGG.ClassInstanceCreation__Marker
	 * @generated
	 */
	EClass getClassInstanceCreation__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInstanceCreation__Marker#getCREATE__SRC__invocation <em>CREATE SRC invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC invocation</em>'.
	 * @see ModiscoTGG.ClassInstanceCreation__Marker#getCREATE__SRC__invocation()
	 * @see #getClassInstanceCreation__Marker()
	 * @generated
	 */
	EReference getClassInstanceCreation__Marker_CREATE__SRC__invocation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInstanceCreation__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMember</em>'.
	 * @see ModiscoTGG.ClassInstanceCreation__Marker#getCONTEXT__SRC__mMember()
	 * @see #getClassInstanceCreation__Marker()
	 * @generated
	 */
	EReference getClassInstanceCreation__Marker_CONTEXT__SRC__mMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInstanceCreation__Marker#getCONTEXT__SRC__mMethod <em>CONTEXT SRC mMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMethod</em>'.
	 * @see ModiscoTGG.ClassInstanceCreation__Marker#getCONTEXT__SRC__mMethod()
	 * @see #getClassInstanceCreation__Marker()
	 * @generated
	 */
	EReference getClassInstanceCreation__Marker_CONTEXT__SRC__mMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInstanceCreation__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAccess</em>'.
	 * @see ModiscoTGG.ClassInstanceCreation__Marker#getCREATE__TRG__tAccess()
	 * @see #getClassInstanceCreation__Marker()
	 * @generated
	 */
	EReference getClassInstanceCreation__Marker_CREATE__TRG__tAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInstanceCreation__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.ClassInstanceCreation__Marker#getCONTEXT__TRG__tMember()
	 * @see #getClassInstanceCreation__Marker()
	 * @generated
	 */
	EReference getClassInstanceCreation__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInstanceCreation__Marker#getCONTEXT__TRG__tMethod <em>CONTEXT TRG tMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMethod</em>'.
	 * @see ModiscoTGG.ClassInstanceCreation__Marker#getCONTEXT__TRG__tMethod()
	 * @see #getClassInstanceCreation__Marker()
	 * @generated
	 */
	EReference getClassInstanceCreation__Marker_CONTEXT__TRG__tMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInstanceCreation__Marker#getCREATE__CORR__invocationToTAccess <em>CREATE CORR invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR invocation To TAccess</em>'.
	 * @see ModiscoTGG.ClassInstanceCreation__Marker#getCREATE__CORR__invocationToTAccess()
	 * @see #getClassInstanceCreation__Marker()
	 * @generated
	 */
	EReference getClassInstanceCreation__Marker_CREATE__CORR__invocationToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInstanceCreation__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Element To TFlow Element</em>'.
	 * @see ModiscoTGG.ClassInstanceCreation__Marker#getCREATE__CORR__mFlowElementToTFlowElement()
	 * @see #getClassInstanceCreation__Marker()
	 * @generated
	 */
	EReference getClassInstanceCreation__Marker_CREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInstanceCreation__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMember To TMember</em>'.
	 * @see ModiscoTGG.ClassInstanceCreation__Marker#getCONTEXT__CORR__mMemberToTMember()
	 * @see #getClassInstanceCreation__Marker()
	 * @generated
	 */
	EReference getClassInstanceCreation__Marker_CONTEXT__CORR__mMemberToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ClassInstanceCreation__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMethod To TMethod</em>'.
	 * @see ModiscoTGG.ClassInstanceCreation__Marker#getCONTEXT__CORR__mMethodToTMethod()
	 * @see #getClassInstanceCreation__Marker()
	 * @generated
	 */
	EReference getClassInstanceCreation__Marker_CONTEXT__CORR__mMethodToTMethod();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ConstructorDefinition__Marker <em>Constructor Definition Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Definition Marker</em>'.
	 * @see ModiscoTGG.ConstructorDefinition__Marker
	 * @generated
	 */
	EClass getConstructorDefinition__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorDefinition__Marker#getCREATE__SRC__mDefinition <em>CREATE SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mDefinition</em>'.
	 * @see ModiscoTGG.ConstructorDefinition__Marker#getCREATE__SRC__mDefinition()
	 * @see #getConstructorDefinition__Marker()
	 * @generated
	 */
	EReference getConstructorDefinition__Marker_CREATE__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorDefinition__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mSignature</em>'.
	 * @see ModiscoTGG.ConstructorDefinition__Marker#getCONTEXT__SRC__mSignature()
	 * @see #getConstructorDefinition__Marker()
	 * @generated
	 */
	EReference getConstructorDefinition__Marker_CONTEXT__SRC__mSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorDefinition__Marker#getCREATE__TRG__tAnnotation <em>CREATE TRG tAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAnnotation</em>'.
	 * @see ModiscoTGG.ConstructorDefinition__Marker#getCREATE__TRG__tAnnotation()
	 * @see #getConstructorDefinition__Marker()
	 * @generated
	 */
	EReference getConstructorDefinition__Marker_CREATE__TRG__tAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorDefinition__Marker#getCREATE__TRG__tDefinition <em>CREATE TRG tDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tDefinition</em>'.
	 * @see ModiscoTGG.ConstructorDefinition__Marker#getCREATE__TRG__tDefinition()
	 * @see #getConstructorDefinition__Marker()
	 * @generated
	 */
	EReference getConstructorDefinition__Marker_CREATE__TRG__tDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorDefinition__Marker#getCONTEXT__TRG__tMethodSignature <em>CONTEXT TRG tMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMethod Signature</em>'.
	 * @see ModiscoTGG.ConstructorDefinition__Marker#getCONTEXT__TRG__tMethodSignature()
	 * @see #getConstructorDefinition__Marker()
	 * @generated
	 */
	EReference getConstructorDefinition__Marker_CONTEXT__TRG__tMethodSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorDefinition__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mBody To TAnnotation</em>'.
	 * @see ModiscoTGG.ConstructorDefinition__Marker#getCREATE__CORR__mBodyToTAnnotation()
	 * @see #getConstructorDefinition__Marker()
	 * @generated
	 */
	EReference getConstructorDefinition__Marker_CREATE__CORR__mBodyToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorDefinition__Marker#getCREATE__CORR__mDefinitionToTMember <em>CREATE CORR mDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mDefinition To TMember</em>'.
	 * @see ModiscoTGG.ConstructorDefinition__Marker#getCREATE__CORR__mDefinitionToTMember()
	 * @see #getConstructorDefinition__Marker()
	 * @generated
	 */
	EReference getConstructorDefinition__Marker_CREATE__CORR__mDefinitionToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorDefinition__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Element To TFlow Element</em>'.
	 * @see ModiscoTGG.ConstructorDefinition__Marker#getCREATE__CORR__mFlowElementToTFlowElement()
	 * @see #getConstructorDefinition__Marker()
	 * @generated
	 */
	EReference getConstructorDefinition__Marker_CREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorDefinition__Marker#getCONTEXT__CORR__mSignatureToTMethodSignature <em>CONTEXT CORR mSignature To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mSignature To TMethod Signature</em>'.
	 * @see ModiscoTGG.ConstructorDefinition__Marker#getCONTEXT__CORR__mSignatureToTMethodSignature()
	 * @see #getConstructorDefinition__Marker()
	 * @generated
	 */
	EReference getConstructorDefinition__Marker_CONTEXT__CORR__mSignatureToTMethodSignature();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ConstructorInvocation__Marker <em>Constructor Invocation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Invocation Marker</em>'.
	 * @see ModiscoTGG.ConstructorInvocation__Marker
	 * @generated
	 */
	EClass getConstructorInvocation__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorInvocation__Marker#getCREATE__SRC__invocation <em>CREATE SRC invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC invocation</em>'.
	 * @see ModiscoTGG.ConstructorInvocation__Marker#getCREATE__SRC__invocation()
	 * @see #getConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getConstructorInvocation__Marker_CREATE__SRC__invocation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorInvocation__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMember</em>'.
	 * @see ModiscoTGG.ConstructorInvocation__Marker#getCONTEXT__SRC__mMember()
	 * @see #getConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getConstructorInvocation__Marker_CONTEXT__SRC__mMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorInvocation__Marker#getCONTEXT__SRC__mMethod <em>CONTEXT SRC mMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMethod</em>'.
	 * @see ModiscoTGG.ConstructorInvocation__Marker#getCONTEXT__SRC__mMethod()
	 * @see #getConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getConstructorInvocation__Marker_CONTEXT__SRC__mMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorInvocation__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAccess</em>'.
	 * @see ModiscoTGG.ConstructorInvocation__Marker#getCREATE__TRG__tAccess()
	 * @see #getConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getConstructorInvocation__Marker_CREATE__TRG__tAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorInvocation__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.ConstructorInvocation__Marker#getCONTEXT__TRG__tMember()
	 * @see #getConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getConstructorInvocation__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorInvocation__Marker#getCONTEXT__TRG__tMethod <em>CONTEXT TRG tMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMethod</em>'.
	 * @see ModiscoTGG.ConstructorInvocation__Marker#getCONTEXT__TRG__tMethod()
	 * @see #getConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getConstructorInvocation__Marker_CONTEXT__TRG__tMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorInvocation__Marker#getCREATE__CORR__invocationToTAccess <em>CREATE CORR invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR invocation To TAccess</em>'.
	 * @see ModiscoTGG.ConstructorInvocation__Marker#getCREATE__CORR__invocationToTAccess()
	 * @see #getConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getConstructorInvocation__Marker_CREATE__CORR__invocationToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorInvocation__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Element To TFlow Element</em>'.
	 * @see ModiscoTGG.ConstructorInvocation__Marker#getCREATE__CORR__mFlowElementToTFlowElement()
	 * @see #getConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getConstructorInvocation__Marker_CREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorInvocation__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMember To TMember</em>'.
	 * @see ModiscoTGG.ConstructorInvocation__Marker#getCONTEXT__CORR__mMemberToTMember()
	 * @see #getConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getConstructorInvocation__Marker_CONTEXT__CORR__mMemberToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ConstructorInvocation__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMethod To TMethod</em>'.
	 * @see ModiscoTGG.ConstructorInvocation__Marker#getCONTEXT__CORR__mMethodToTMethod()
	 * @see #getConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getConstructorInvocation__Marker_CONTEXT__CORR__mMethodToTMethod();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.Enum__Marker <em>Enum Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Marker</em>'.
	 * @see ModiscoTGG.Enum__Marker
	 * @generated
	 */
	EClass getEnum__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Enum__Marker#getCONTEXT__SRC__mPackage <em>CONTEXT SRC mPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mPackage</em>'.
	 * @see ModiscoTGG.Enum__Marker#getCONTEXT__SRC__mPackage()
	 * @see #getEnum__Marker()
	 * @generated
	 */
	EReference getEnum__Marker_CONTEXT__SRC__mPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Enum__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mType</em>'.
	 * @see ModiscoTGG.Enum__Marker#getCREATE__SRC__mType()
	 * @see #getEnum__Marker()
	 * @generated
	 */
	EReference getEnum__Marker_CREATE__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Enum__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.Enum__Marker#getCONTEXT__TRG__pg()
	 * @see #getEnum__Marker()
	 * @generated
	 */
	EReference getEnum__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Enum__Marker#getCREATE__TRG__tAnnotation <em>CREATE TRG tAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAnnotation</em>'.
	 * @see ModiscoTGG.Enum__Marker#getCREATE__TRG__tAnnotation()
	 * @see #getEnum__Marker()
	 * @generated
	 */
	EReference getEnum__Marker_CREATE__TRG__tAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Enum__Marker#getCONTEXT__TRG__tPackage <em>CONTEXT TRG tPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tPackage</em>'.
	 * @see ModiscoTGG.Enum__Marker#getCONTEXT__TRG__tPackage()
	 * @see #getEnum__Marker()
	 * @generated
	 */
	EReference getEnum__Marker_CONTEXT__TRG__tPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Enum__Marker#getCREATE__TRG__tType <em>CREATE TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tType</em>'.
	 * @see ModiscoTGG.Enum__Marker#getCREATE__TRG__tType()
	 * @see #getEnum__Marker()
	 * @generated
	 */
	EReference getEnum__Marker_CREATE__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Enum__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mBody To TAnnotation</em>'.
	 * @see ModiscoTGG.Enum__Marker#getCREATE__CORR__mBodyToTAnnotation()
	 * @see #getEnum__Marker()
	 * @generated
	 */
	EReference getEnum__Marker_CREATE__CORR__mBodyToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Enum__Marker#getCONTEXT__CORR__mPackageToTPackage <em>CONTEXT CORR mPackage To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mPackage To TPackage</em>'.
	 * @see ModiscoTGG.Enum__Marker#getCONTEXT__CORR__mPackageToTPackage()
	 * @see #getEnum__Marker()
	 * @generated
	 */
	EReference getEnum__Marker_CONTEXT__CORR__mPackageToTPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Enum__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mType To TType</em>'.
	 * @see ModiscoTGG.Enum__Marker#getCREATE__CORR__mTypeToTType()
	 * @see #getEnum__Marker()
	 * @generated
	 */
	EReference getEnum__Marker_CREATE__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.EnumInAnonymous__Marker <em>Enum In Anonymous Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum In Anonymous Marker</em>'.
	 * @see ModiscoTGG.EnumInAnonymous__Marker
	 * @generated
	 */
	EClass getEnumInAnonymous__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.EnumInAnonymous__Marker#getCONTEXT__SRC__eAnonymousClassDeclaration <em>CONTEXT SRC eAnonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eAnonymous Class Declaration</em>'.
	 * @see ModiscoTGG.EnumInAnonymous__Marker#getCONTEXT__SRC__eAnonymousClassDeclaration()
	 * @see #getEnumInAnonymous__Marker()
	 * @generated
	 */
	EReference getEnumInAnonymous__Marker_CONTEXT__SRC__eAnonymousClassDeclaration();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.EnumInAnonymous__Marker#getCREATE__SRC__mNestedType <em>CREATE SRC mNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mNested Type</em>'.
	 * @see ModiscoTGG.EnumInAnonymous__Marker#getCREATE__SRC__mNestedType()
	 * @see #getEnumInAnonymous__Marker()
	 * @generated
	 */
	EReference getEnumInAnonymous__Marker_CREATE__SRC__mNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.EnumInAnonymous__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.EnumInAnonymous__Marker#getCONTEXT__TRG__pg()
	 * @see #getEnumInAnonymous__Marker()
	 * @generated
	 */
	EReference getEnumInAnonymous__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.EnumInAnonymous__Marker#getCREATE__TRG__tAnnotation <em>CREATE TRG tAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAnnotation</em>'.
	 * @see ModiscoTGG.EnumInAnonymous__Marker#getCREATE__TRG__tAnnotation()
	 * @see #getEnumInAnonymous__Marker()
	 * @generated
	 */
	EReference getEnumInAnonymous__Marker_CREATE__TRG__tAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.EnumInAnonymous__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tClass</em>'.
	 * @see ModiscoTGG.EnumInAnonymous__Marker#getCONTEXT__TRG__tClass()
	 * @see #getEnumInAnonymous__Marker()
	 * @generated
	 */
	EReference getEnumInAnonymous__Marker_CONTEXT__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.EnumInAnonymous__Marker#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNested Type</em>'.
	 * @see ModiscoTGG.EnumInAnonymous__Marker#getCREATE__TRG__tNestedType()
	 * @see #getEnumInAnonymous__Marker()
	 * @generated
	 */
	EReference getEnumInAnonymous__Marker_CREATE__TRG__tNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.EnumInAnonymous__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>'.
	 * @see ModiscoTGG.EnumInAnonymous__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass()
	 * @see #getEnumInAnonymous__Marker()
	 * @generated
	 */
	EReference getEnumInAnonymous__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.EnumInAnonymous__Marker#getCREATE__CORR__mNestedTypeToTNestedType <em>CREATE CORR mNested Type To TNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mNested Type To TNested Type</em>'.
	 * @see ModiscoTGG.EnumInAnonymous__Marker#getCREATE__CORR__mNestedTypeToTNestedType()
	 * @see #getEnumInAnonymous__Marker()
	 * @generated
	 */
	EReference getEnumInAnonymous__Marker_CREATE__CORR__mNestedTypeToTNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.EnumInAnonymous__Marker#getCREATE__CORR__mbodyToTAnnotatable <em>CREATE CORR mbody To TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mbody To TAnnotatable</em>'.
	 * @see ModiscoTGG.EnumInAnonymous__Marker#getCREATE__CORR__mbodyToTAnnotatable()
	 * @see #getEnumInAnonymous__Marker()
	 * @generated
	 */
	EReference getEnumInAnonymous__Marker_CREATE__CORR__mbodyToTAnnotatable();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.FieldAccessRead__Marker <em>Field Access Read Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Access Read Marker</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker
	 * @generated
	 */
	EClass getFieldAccessRead__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mAccess</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCREATE__SRC__mAccess()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CREATE__SRC__mAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__SRC__mField <em>CONTEXT SRC mField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mField</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__SRC__mField()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CONTEXT__SRC__mField();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMember</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__SRC__mMember()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CONTEXT__SRC__mMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mType</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__SRC__mType()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CONTEXT__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__SRC__varDeclFrag <em>CONTEXT SRC var Decl Frag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC var Decl Frag</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__SRC__varDeclFrag()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CONTEXT__SRC__varDeclFrag();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAccess</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCREATE__TRG__tAccess()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CREATE__TRG__tAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__TRG__tField <em>CONTEXT TRG tField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tField</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__TRG__tField()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CONTEXT__TRG__tField();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__TRG__tMember()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tType</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__TRG__tType()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CONTEXT__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCREATE__CORR__mAccessToTAccess <em>CREATE CORR mAccess To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mAccess To TAccess</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCREATE__CORR__mAccessToTAccess()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CREATE__CORR__mAccessToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCREATE__CORR__mFlowOwnerToTFlowOwner <em>CREATE CORR mFlow Owner To TFlow Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Owner To TFlow Owner</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCREATE__CORR__mFlowOwnerToTFlowOwner()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CREATE__CORR__mFlowOwnerToTFlowOwner();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMember To TMember</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__CORR__mMemberToTMember()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CONTEXT__CORR__mMemberToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMethod To TMethod</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__CORR__mMethodToTMethod()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CONTEXT__CORR__mMethodToTMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.FieldAccessRead__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getFieldAccessRead__Marker()
	 * @generated
	 */
	EReference getFieldAccessRead__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.FieldAccessReadWrite__Marker <em>Field Access Read Write Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Access Read Write Marker</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker
	 * @generated
	 */
	EClass getFieldAccessReadWrite__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mAccess</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__SRC__mAccess()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CREATE__SRC__mAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__mField <em>CONTEXT SRC mField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mField</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__mField()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CONTEXT__SRC__mField();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMember</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__mMember()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CONTEXT__SRC__mMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mType</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__mType()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CONTEXT__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__varDeclFrag <em>CONTEXT SRC var Decl Frag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC var Decl Frag</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__varDeclFrag()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CONTEXT__SRC__varDeclFrag();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAccess</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__TRG__tAccess()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CREATE__TRG__tAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__TRG__tField <em>CONTEXT TRG tField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tField</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__TRG__tField()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CONTEXT__TRG__tField();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__TRG__tMember()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tType</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__TRG__tType()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CONTEXT__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__CORR__mAccessToTAccess <em>CREATE CORR mAccess To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mAccess To TAccess</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__CORR__mAccessToTAccess()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CREATE__CORR__mAccessToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__CORR__mFlowOwnerToTFlowOwner <em>CREATE CORR mFlow Owner To TFlow Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Owner To TFlow Owner</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__CORR__mFlowOwnerToTFlowOwner()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CREATE__CORR__mFlowOwnerToTFlowOwner();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMember To TMember</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__CORR__mMemberToTMember()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CONTEXT__CORR__mMemberToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMethod To TMethod</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__CORR__mMethodToTMethod()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CONTEXT__CORR__mMethodToTMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getFieldAccessReadWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessReadWrite__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.FieldAccessWrite__Marker <em>Field Access Write Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Access Write Marker</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker
	 * @generated
	 */
	EClass getFieldAccessWrite__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mAccess</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCREATE__SRC__mAccess()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CREATE__SRC__mAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__SRC__mField <em>CONTEXT SRC mField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mField</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__SRC__mField()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CONTEXT__SRC__mField();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMember</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__SRC__mMember()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CONTEXT__SRC__mMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mType</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__SRC__mType()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CONTEXT__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__SRC__varDeclFrag <em>CONTEXT SRC var Decl Frag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC var Decl Frag</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__SRC__varDeclFrag()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CONTEXT__SRC__varDeclFrag();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAccess</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCREATE__TRG__tAccess()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CREATE__TRG__tAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__TRG__tField <em>CONTEXT TRG tField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tField</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__TRG__tField()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CONTEXT__TRG__tField();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__TRG__tMember()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tType</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__TRG__tType()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CONTEXT__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCREATE__CORR__mAccessToTAccess <em>CREATE CORR mAccess To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mAccess To TAccess</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCREATE__CORR__mAccessToTAccess()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CREATE__CORR__mAccessToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCREATE__CORR__mFlowOwnerToTFlowOwner <em>CREATE CORR mFlow Owner To TFlow Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Owner To TFlow Owner</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCREATE__CORR__mFlowOwnerToTFlowOwner()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CREATE__CORR__mFlowOwnerToTFlowOwner();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMember To TMember</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__CORR__mMemberToTMember()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CONTEXT__CORR__mMemberToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMethod To TMethod</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__CORR__mMethodToTMethod()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CONTEXT__CORR__mMethodToTMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.FieldAccessWrite__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getFieldAccessWrite__Marker()
	 * @generated
	 */
	EReference getFieldAccessWrite__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.FieldDefinition__Marker <em>Field Definition Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Definition Marker</em>'.
	 * @see ModiscoTGG.FieldDefinition__Marker
	 * @generated
	 */
	EClass getFieldDefinition__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__SRC__mDefinition <em>CREATE SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mDefinition</em>'.
	 * @see ModiscoTGG.FieldDefinition__Marker#getCREATE__SRC__mDefinition()
	 * @see #getFieldDefinition__Marker()
	 * @generated
	 */
	EReference getFieldDefinition__Marker_CREATE__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldDefinition__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mSignature</em>'.
	 * @see ModiscoTGG.FieldDefinition__Marker#getCONTEXT__SRC__mSignature()
	 * @see #getFieldDefinition__Marker()
	 * @generated
	 */
	EReference getFieldDefinition__Marker_CONTEXT__SRC__mSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__TRG__tDefinition <em>CREATE TRG tDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tDefinition</em>'.
	 * @see ModiscoTGG.FieldDefinition__Marker#getCREATE__TRG__tDefinition()
	 * @see #getFieldDefinition__Marker()
	 * @generated
	 */
	EReference getFieldDefinition__Marker_CREATE__TRG__tDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldDefinition__Marker#getCONTEXT__TRG__tFieldSignature <em>CONTEXT TRG tField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tField Signature</em>'.
	 * @see ModiscoTGG.FieldDefinition__Marker#getCONTEXT__TRG__tFieldSignature()
	 * @see #getFieldDefinition__Marker()
	 * @generated
	 */
	EReference getFieldDefinition__Marker_CONTEXT__TRG__tFieldSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mBody To TAnnotation</em>'.
	 * @see ModiscoTGG.FieldDefinition__Marker#getCREATE__CORR__mBodyToTAnnotation()
	 * @see #getFieldDefinition__Marker()
	 * @generated
	 */
	EReference getFieldDefinition__Marker_CREATE__CORR__mBodyToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__CORR__mDefinitionToTDefinition <em>CREATE CORR mDefinition To TDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mDefinition To TDefinition</em>'.
	 * @see ModiscoTGG.FieldDefinition__Marker#getCREATE__CORR__mDefinitionToTDefinition()
	 * @see #getFieldDefinition__Marker()
	 * @generated
	 */
	EReference getFieldDefinition__Marker_CREATE__CORR__mDefinitionToTDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__CORR__mDefinitionToTMember <em>CREATE CORR mDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mDefinition To TMember</em>'.
	 * @see ModiscoTGG.FieldDefinition__Marker#getCREATE__CORR__mDefinitionToTMember()
	 * @see #getFieldDefinition__Marker()
	 * @generated
	 */
	EReference getFieldDefinition__Marker_CREATE__CORR__mDefinitionToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldDefinition__Marker#getCONTEXT__CORR__mSignatureToTFieldSignature <em>CONTEXT CORR mSignature To TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mSignature To TField Signature</em>'.
	 * @see ModiscoTGG.FieldDefinition__Marker#getCONTEXT__CORR__mSignatureToTFieldSignature()
	 * @see #getFieldDefinition__Marker()
	 * @generated
	 */
	EReference getFieldDefinition__Marker_CONTEXT__CORR__mSignatureToTFieldSignature();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.FieldName__Marker <em>Field Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Name Marker</em>'.
	 * @see ModiscoTGG.FieldName__Marker
	 * @generated
	 */
	EClass getFieldName__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldName__Marker#getCREATE__SRC__mFieldName <em>CREATE SRC mField Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mField Name</em>'.
	 * @see ModiscoTGG.FieldName__Marker#getCREATE__SRC__mFieldName()
	 * @see #getFieldName__Marker()
	 * @generated
	 */
	EReference getFieldName__Marker_CREATE__SRC__mFieldName();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldName__Marker#getCONTEXT__SRC__model <em>CONTEXT SRC model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC model</em>'.
	 * @see ModiscoTGG.FieldName__Marker#getCONTEXT__SRC__model()
	 * @see #getFieldName__Marker()
	 * @generated
	 */
	EReference getFieldName__Marker_CONTEXT__SRC__model();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldName__Marker#getCREATE__TRG__tField <em>CREATE TRG tField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tField</em>'.
	 * @see ModiscoTGG.FieldName__Marker#getCREATE__TRG__tField()
	 * @see #getFieldName__Marker()
	 * @generated
	 */
	EReference getFieldName__Marker_CREATE__TRG__tField();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldName__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.FieldName__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getFieldName__Marker()
	 * @generated
	 */
	EReference getFieldName__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldName__Marker#getCREATE__CORR__eFieldDeclarationToTField <em>CREATE CORR eField Declaration To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR eField Declaration To TField</em>'.
	 * @see ModiscoTGG.FieldName__Marker#getCREATE__CORR__eFieldDeclarationToTField()
	 * @see #getFieldName__Marker()
	 * @generated
	 */
	EReference getFieldName__Marker_CREATE__CORR__eFieldDeclarationToTField();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldName__Marker#getCONTEXT__CORR__modelToTypeGraph <em>CONTEXT CORR model To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR model To Type Graph</em>'.
	 * @see ModiscoTGG.FieldName__Marker#getCONTEXT__CORR__modelToTypeGraph()
	 * @see #getFieldName__Marker()
	 * @generated
	 */
	EReference getFieldName__Marker_CONTEXT__CORR__modelToTypeGraph();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.FieldSignature__Marker <em>Field Signature Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Signature Marker</em>'.
	 * @see ModiscoTGG.FieldSignature__Marker
	 * @generated
	 */
	EClass getFieldSignature__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldSignature__Marker#getCONTEXT__SRC__mFieldName <em>CONTEXT SRC mField Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mField Name</em>'.
	 * @see ModiscoTGG.FieldSignature__Marker#getCONTEXT__SRC__mFieldName()
	 * @see #getFieldSignature__Marker()
	 * @generated
	 */
	EReference getFieldSignature__Marker_CONTEXT__SRC__mFieldName();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldSignature__Marker#getCREATE__SRC__mSignature <em>CREATE SRC mSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mSignature</em>'.
	 * @see ModiscoTGG.FieldSignature__Marker#getCREATE__SRC__mSignature()
	 * @see #getFieldSignature__Marker()
	 * @generated
	 */
	EReference getFieldSignature__Marker_CREATE__SRC__mSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldSignature__Marker#getCONTEXT__TRG__tField <em>CONTEXT TRG tField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tField</em>'.
	 * @see ModiscoTGG.FieldSignature__Marker#getCONTEXT__TRG__tField()
	 * @see #getFieldSignature__Marker()
	 * @generated
	 */
	EReference getFieldSignature__Marker_CONTEXT__TRG__tField();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldSignature__Marker#getCREATE__TRG__tSignature <em>CREATE TRG tSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tSignature</em>'.
	 * @see ModiscoTGG.FieldSignature__Marker#getCREATE__TRG__tSignature()
	 * @see #getFieldSignature__Marker()
	 * @generated
	 */
	EReference getFieldSignature__Marker_CREATE__TRG__tSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldSignature__Marker#getCONTEXT__CORR__eFieldDeclarationToTField <em>CONTEXT CORR eField Declaration To TField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eField Declaration To TField</em>'.
	 * @see ModiscoTGG.FieldSignature__Marker#getCONTEXT__CORR__eFieldDeclarationToTField()
	 * @see #getFieldSignature__Marker()
	 * @generated
	 */
	EReference getFieldSignature__Marker_CONTEXT__CORR__eFieldDeclarationToTField();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldSignature__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Element To TFlow Element</em>'.
	 * @see ModiscoTGG.FieldSignature__Marker#getCREATE__CORR__mFlowElementToTFlowElement()
	 * @see #getFieldSignature__Marker()
	 * @generated
	 */
	EReference getFieldSignature__Marker_CREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldSignature__Marker#getCREATE__CORR__mSignatureToTSignature <em>CREATE CORR mSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mSignature To TSignature</em>'.
	 * @see ModiscoTGG.FieldSignature__Marker#getCREATE__CORR__mSignatureToTSignature()
	 * @see #getFieldSignature__Marker()
	 * @generated
	 */
	EReference getFieldSignature__Marker_CREATE__CORR__mSignatureToTSignature();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.FieldType__Marker <em>Field Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Type Marker</em>'.
	 * @see ModiscoTGG.FieldType__Marker
	 * @generated
	 */
	EClass getFieldType__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldType__Marker#getCONTEXT__SRC__ePrimitiveType <em>CONTEXT SRC ePrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC ePrimitive Type</em>'.
	 * @see ModiscoTGG.FieldType__Marker#getCONTEXT__SRC__ePrimitiveType()
	 * @see #getFieldType__Marker()
	 * @generated
	 */
	EReference getFieldType__Marker_CONTEXT__SRC__ePrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldType__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mSignature</em>'.
	 * @see ModiscoTGG.FieldType__Marker#getCONTEXT__SRC__mSignature()
	 * @see #getFieldType__Marker()
	 * @generated
	 */
	EReference getFieldType__Marker_CONTEXT__SRC__mSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldType__Marker#getCONTEXT__TRG__tFieldSignature <em>CONTEXT TRG tField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tField Signature</em>'.
	 * @see ModiscoTGG.FieldType__Marker#getCONTEXT__TRG__tFieldSignature()
	 * @see #getFieldType__Marker()
	 * @generated
	 */
	EReference getFieldType__Marker_CONTEXT__TRG__tFieldSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldType__Marker#getCONTEXT__TRG__tPrimitiv <em>CONTEXT TRG tPrimitiv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tPrimitiv</em>'.
	 * @see ModiscoTGG.FieldType__Marker#getCONTEXT__TRG__tPrimitiv()
	 * @see #getFieldType__Marker()
	 * @generated
	 */
	EReference getFieldType__Marker_CONTEXT__TRG__tPrimitiv();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldType__Marker#getCONTEXT__CORR__ePrimitiveTypeToTPrimitiv <em>CONTEXT CORR ePrimitive Type To TPrimitiv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR ePrimitive Type To TPrimitiv</em>'.
	 * @see ModiscoTGG.FieldType__Marker#getCONTEXT__CORR__ePrimitiveTypeToTPrimitiv()
	 * @see #getFieldType__Marker()
	 * @generated
	 */
	EReference getFieldType__Marker_CONTEXT__CORR__ePrimitiveTypeToTPrimitiv();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.FieldType__Marker#getCONTEXT__CORR__mSignatureToTFieldSignature <em>CONTEXT CORR mSignature To TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mSignature To TField Signature</em>'.
	 * @see ModiscoTGG.FieldType__Marker#getCONTEXT__CORR__mSignatureToTFieldSignature()
	 * @see #getFieldType__Marker()
	 * @generated
	 */
	EReference getFieldType__Marker_CONTEXT__CORR__mSignatureToTFieldSignature();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.Flow__Marker <em>Flow Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Marker</em>'.
	 * @see ModiscoTGG.Flow__Marker
	 * @generated
	 */
	EClass getFlow__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Flow__Marker#getCREATE__SRC__mFlow <em>CREATE SRC mFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mFlow</em>'.
	 * @see ModiscoTGG.Flow__Marker#getCREATE__SRC__mFlow()
	 * @see #getFlow__Marker()
	 * @generated
	 */
	EReference getFlow__Marker_CREATE__SRC__mFlow();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Flow__Marker#getCONTEXT__SRC__mOwner <em>CONTEXT SRC mOwner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mOwner</em>'.
	 * @see ModiscoTGG.Flow__Marker#getCONTEXT__SRC__mOwner()
	 * @see #getFlow__Marker()
	 * @generated
	 */
	EReference getFlow__Marker_CONTEXT__SRC__mOwner();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Flow__Marker#getCREATE__TRG__tFlow <em>CREATE TRG tFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tFlow</em>'.
	 * @see ModiscoTGG.Flow__Marker#getCREATE__TRG__tFlow()
	 * @see #getFlow__Marker()
	 * @generated
	 */
	EReference getFlow__Marker_CREATE__TRG__tFlow();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Flow__Marker#getCONTEXT__TRG__tOwner <em>CONTEXT TRG tOwner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOwner</em>'.
	 * @see ModiscoTGG.Flow__Marker#getCONTEXT__TRG__tOwner()
	 * @see #getFlow__Marker()
	 * @generated
	 */
	EReference getFlow__Marker_CONTEXT__TRG__tOwner();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Flow__Marker#getCREATE__CORR__mFlowToTFlow <em>CREATE CORR mFlow To TFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow To TFlow</em>'.
	 * @see ModiscoTGG.Flow__Marker#getCREATE__CORR__mFlowToTFlow()
	 * @see #getFlow__Marker()
	 * @generated
	 */
	EReference getFlow__Marker_CREATE__CORR__mFlowToTFlow();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Flow__Marker#getCONTEXT__CORR__mOwnerToTOwner <em>CONTEXT CORR mOwner To TOwner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mOwner To TOwner</em>'.
	 * @see ModiscoTGG.Flow__Marker#getCONTEXT__CORR__mOwnerToTOwner()
	 * @see #getFlow__Marker()
	 * @generated
	 */
	EReference getFlow__Marker_CONTEXT__CORR__mOwnerToTOwner();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.IncomingFlow__Marker <em>Incoming Flow Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Flow Marker</em>'.
	 * @see ModiscoTGG.IncomingFlow__Marker
	 * @generated
	 */
	EClass getIncomingFlow__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__SRC__mFlow <em>CONTEXT SRC mFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mFlow</em>'.
	 * @see ModiscoTGG.IncomingFlow__Marker#getCONTEXT__SRC__mFlow()
	 * @see #getIncomingFlow__Marker()
	 * @generated
	 */
	EReference getIncomingFlow__Marker_CONTEXT__SRC__mFlow();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__SRC__mSource <em>CONTEXT SRC mSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mSource</em>'.
	 * @see ModiscoTGG.IncomingFlow__Marker#getCONTEXT__SRC__mSource()
	 * @see #getIncomingFlow__Marker()
	 * @generated
	 */
	EReference getIncomingFlow__Marker_CONTEXT__SRC__mSource();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__TRG__tFlow <em>CONTEXT TRG tFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tFlow</em>'.
	 * @see ModiscoTGG.IncomingFlow__Marker#getCONTEXT__TRG__tFlow()
	 * @see #getIncomingFlow__Marker()
	 * @generated
	 */
	EReference getIncomingFlow__Marker_CONTEXT__TRG__tFlow();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__TRG__tSource <em>CONTEXT TRG tSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tSource</em>'.
	 * @see ModiscoTGG.IncomingFlow__Marker#getCONTEXT__TRG__tSource()
	 * @see #getIncomingFlow__Marker()
	 * @generated
	 */
	EReference getIncomingFlow__Marker_CONTEXT__TRG__tSource();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__CORR__mFlowToTFlow <em>CONTEXT CORR mFlow To TFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mFlow To TFlow</em>'.
	 * @see ModiscoTGG.IncomingFlow__Marker#getCONTEXT__CORR__mFlowToTFlow()
	 * @see #getIncomingFlow__Marker()
	 * @generated
	 */
	EReference getIncomingFlow__Marker_CONTEXT__CORR__mFlowToTFlow();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__CORR__mSourceToTSource <em>CONTEXT CORR mSource To TSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mSource To TSource</em>'.
	 * @see ModiscoTGG.IncomingFlow__Marker#getCONTEXT__CORR__mSourceToTSource()
	 * @see #getIncomingFlow__Marker()
	 * @generated
	 */
	EReference getIncomingFlow__Marker_CONTEXT__CORR__mSourceToTSource();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.Interface__Marker <em>Interface Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Marker</em>'.
	 * @see ModiscoTGG.Interface__Marker
	 * @generated
	 */
	EClass getInterface__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Interface__Marker#getCONTEXT__SRC__mPackage <em>CONTEXT SRC mPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mPackage</em>'.
	 * @see ModiscoTGG.Interface__Marker#getCONTEXT__SRC__mPackage()
	 * @see #getInterface__Marker()
	 * @generated
	 */
	EReference getInterface__Marker_CONTEXT__SRC__mPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Interface__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mType</em>'.
	 * @see ModiscoTGG.Interface__Marker#getCREATE__SRC__mType()
	 * @see #getInterface__Marker()
	 * @generated
	 */
	EReference getInterface__Marker_CREATE__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Interface__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.Interface__Marker#getCONTEXT__TRG__pg()
	 * @see #getInterface__Marker()
	 * @generated
	 */
	EReference getInterface__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Interface__Marker#getCONTEXT__TRG__tPackage <em>CONTEXT TRG tPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tPackage</em>'.
	 * @see ModiscoTGG.Interface__Marker#getCONTEXT__TRG__tPackage()
	 * @see #getInterface__Marker()
	 * @generated
	 */
	EReference getInterface__Marker_CONTEXT__TRG__tPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Interface__Marker#getCREATE__TRG__tType <em>CREATE TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tType</em>'.
	 * @see ModiscoTGG.Interface__Marker#getCREATE__TRG__tType()
	 * @see #getInterface__Marker()
	 * @generated
	 */
	EReference getInterface__Marker_CREATE__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Interface__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mBody To TAnnotation</em>'.
	 * @see ModiscoTGG.Interface__Marker#getCREATE__CORR__mBodyToTAnnotation()
	 * @see #getInterface__Marker()
	 * @generated
	 */
	EReference getInterface__Marker_CREATE__CORR__mBodyToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Interface__Marker#getCREATE__CORR__mInterfaceDeclarationtoTInterface <em>CREATE CORR mInterface Declarationto TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mInterface Declarationto TInterface</em>'.
	 * @see ModiscoTGG.Interface__Marker#getCREATE__CORR__mInterfaceDeclarationtoTInterface()
	 * @see #getInterface__Marker()
	 * @generated
	 */
	EReference getInterface__Marker_CREATE__CORR__mInterfaceDeclarationtoTInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Interface__Marker#getCONTEXT__CORR__mPackageToTPackage <em>CONTEXT CORR mPackage To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mPackage To TPackage</em>'.
	 * @see ModiscoTGG.Interface__Marker#getCONTEXT__CORR__mPackageToTPackage()
	 * @see #getInterface__Marker()
	 * @generated
	 */
	EReference getInterface__Marker_CONTEXT__CORR__mPackageToTPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.Interface__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mType To TType</em>'.
	 * @see ModiscoTGG.Interface__Marker#getCREATE__CORR__mTypeToTType()
	 * @see #getInterface__Marker()
	 * @generated
	 */
	EReference getInterface__Marker_CREATE__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.InterfaceExtendsInterface__Marker <em>Interface Extends Interface Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Extends Interface Marker</em>'.
	 * @see ModiscoTGG.InterfaceExtendsInterface__Marker
	 * @generated
	 */
	EClass getInterfaceExtendsInterface__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceExtendsInterface__Marker#getCONTEXT__SRC__eInterfaceDeclaration <em>CONTEXT SRC eInterface Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eInterface Declaration</em>'.
	 * @see ModiscoTGG.InterfaceExtendsInterface__Marker#getCONTEXT__SRC__eInterfaceDeclaration()
	 * @see #getInterfaceExtendsInterface__Marker()
	 * @generated
	 */
	EReference getInterfaceExtendsInterface__Marker_CONTEXT__SRC__eInterfaceDeclaration();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceExtendsInterface__Marker#getCONTEXT__SRC__eSuperInterface <em>CONTEXT SRC eSuper Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eSuper Interface</em>'.
	 * @see ModiscoTGG.InterfaceExtendsInterface__Marker#getCONTEXT__SRC__eSuperInterface()
	 * @see #getInterfaceExtendsInterface__Marker()
	 * @generated
	 */
	EReference getInterfaceExtendsInterface__Marker_CONTEXT__SRC__eSuperInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceExtendsInterface__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC eType Access</em>'.
	 * @see ModiscoTGG.InterfaceExtendsInterface__Marker#getCREATE__SRC__eTypeAccess()
	 * @see #getInterfaceExtendsInterface__Marker()
	 * @generated
	 */
	EReference getInterfaceExtendsInterface__Marker_CREATE__SRC__eTypeAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceExtendsInterface__Marker#getCONTEXT__TRG__tInterface <em>CONTEXT TRG tInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tInterface</em>'.
	 * @see ModiscoTGG.InterfaceExtendsInterface__Marker#getCONTEXT__TRG__tInterface()
	 * @see #getInterfaceExtendsInterface__Marker()
	 * @generated
	 */
	EReference getInterfaceExtendsInterface__Marker_CONTEXT__TRG__tInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceExtendsInterface__Marker#getCONTEXT__TRG__tSuperInterface <em>CONTEXT TRG tSuper Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tSuper Interface</em>'.
	 * @see ModiscoTGG.InterfaceExtendsInterface__Marker#getCONTEXT__TRG__tSuperInterface()
	 * @see #getInterfaceExtendsInterface__Marker()
	 * @generated
	 */
	EReference getInterfaceExtendsInterface__Marker_CONTEXT__TRG__tSuperInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceExtendsInterface__Marker#getCONTEXT__CORR__eInterfaceDeclarationToTInterface <em>CONTEXT CORR eInterface Declaration To TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eInterface Declaration To TInterface</em>'.
	 * @see ModiscoTGG.InterfaceExtendsInterface__Marker#getCONTEXT__CORR__eInterfaceDeclarationToTInterface()
	 * @see #getInterfaceExtendsInterface__Marker()
	 * @generated
	 */
	EReference getInterfaceExtendsInterface__Marker_CONTEXT__CORR__eInterfaceDeclarationToTInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceExtendsInterface__Marker#getCONTEXT__CORR__eSuperInterfaceToTSuperInterface <em>CONTEXT CORR eSuper Interface To TSuper Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eSuper Interface To TSuper Interface</em>'.
	 * @see ModiscoTGG.InterfaceExtendsInterface__Marker#getCONTEXT__CORR__eSuperInterfaceToTSuperInterface()
	 * @see #getInterfaceExtendsInterface__Marker()
	 * @generated
	 */
	EReference getInterfaceExtendsInterface__Marker_CONTEXT__CORR__eSuperInterfaceToTSuperInterface();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.InterfaceInAnonymous__Marker <em>Interface In Anonymous Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface In Anonymous Marker</em>'.
	 * @see ModiscoTGG.InterfaceInAnonymous__Marker
	 * @generated
	 */
	EClass getInterfaceInAnonymous__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceInAnonymous__Marker#getCONTEXT__SRC__eAnonymousClassDeclaration <em>CONTEXT SRC eAnonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eAnonymous Class Declaration</em>'.
	 * @see ModiscoTGG.InterfaceInAnonymous__Marker#getCONTEXT__SRC__eAnonymousClassDeclaration()
	 * @see #getInterfaceInAnonymous__Marker()
	 * @generated
	 */
	EReference getInterfaceInAnonymous__Marker_CONTEXT__SRC__eAnonymousClassDeclaration();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceInAnonymous__Marker#getCREATE__SRC__mNestedType <em>CREATE SRC mNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mNested Type</em>'.
	 * @see ModiscoTGG.InterfaceInAnonymous__Marker#getCREATE__SRC__mNestedType()
	 * @see #getInterfaceInAnonymous__Marker()
	 * @generated
	 */
	EReference getInterfaceInAnonymous__Marker_CREATE__SRC__mNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceInAnonymous__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.InterfaceInAnonymous__Marker#getCONTEXT__TRG__pg()
	 * @see #getInterfaceInAnonymous__Marker()
	 * @generated
	 */
	EReference getInterfaceInAnonymous__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceInAnonymous__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tClass</em>'.
	 * @see ModiscoTGG.InterfaceInAnonymous__Marker#getCONTEXT__TRG__tClass()
	 * @see #getInterfaceInAnonymous__Marker()
	 * @generated
	 */
	EReference getInterfaceInAnonymous__Marker_CONTEXT__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceInAnonymous__Marker#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNested Type</em>'.
	 * @see ModiscoTGG.InterfaceInAnonymous__Marker#getCREATE__TRG__tNestedType()
	 * @see #getInterfaceInAnonymous__Marker()
	 * @generated
	 */
	EReference getInterfaceInAnonymous__Marker_CREATE__TRG__tNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceInAnonymous__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>'.
	 * @see ModiscoTGG.InterfaceInAnonymous__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass()
	 * @see #getInterfaceInAnonymous__Marker()
	 * @generated
	 */
	EReference getInterfaceInAnonymous__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceInAnonymous__Marker#getCREATE__CORR__mInterfaceDeclarationtoTInterface <em>CREATE CORR mInterface Declarationto TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mInterface Declarationto TInterface</em>'.
	 * @see ModiscoTGG.InterfaceInAnonymous__Marker#getCREATE__CORR__mInterfaceDeclarationtoTInterface()
	 * @see #getInterfaceInAnonymous__Marker()
	 * @generated
	 */
	EReference getInterfaceInAnonymous__Marker_CREATE__CORR__mInterfaceDeclarationtoTInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceInAnonymous__Marker#getCREATE__CORR__mNestedTypeToTNestedType <em>CREATE CORR mNested Type To TNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mNested Type To TNested Type</em>'.
	 * @see ModiscoTGG.InterfaceInAnonymous__Marker#getCREATE__CORR__mNestedTypeToTNestedType()
	 * @see #getInterfaceInAnonymous__Marker()
	 * @generated
	 */
	EReference getInterfaceInAnonymous__Marker_CREATE__CORR__mNestedTypeToTNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceInAnonymous__Marker#getCREATE__CORR__mbodyToTAnnotatable <em>CREATE CORR mbody To TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mbody To TAnnotatable</em>'.
	 * @see ModiscoTGG.InterfaceInAnonymous__Marker#getCREATE__CORR__mbodyToTAnnotatable()
	 * @see #getInterfaceInAnonymous__Marker()
	 * @generated
	 */
	EReference getInterfaceInAnonymous__Marker_CREATE__CORR__mbodyToTAnnotatable();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.InterfaceMember__Marker <em>Interface Member Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Member Marker</em>'.
	 * @see ModiscoTGG.InterfaceMember__Marker
	 * @generated
	 */
	EClass getInterfaceMember__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceMember__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mDefinition</em>'.
	 * @see ModiscoTGG.InterfaceMember__Marker#getCONTEXT__SRC__mDefinition()
	 * @see #getInterfaceMember__Marker()
	 * @generated
	 */
	EReference getInterfaceMember__Marker_CONTEXT__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceMember__Marker#getCONTEXT__SRC__mInterface <em>CONTEXT SRC mInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mInterface</em>'.
	 * @see ModiscoTGG.InterfaceMember__Marker#getCONTEXT__SRC__mInterface()
	 * @see #getInterfaceMember__Marker()
	 * @generated
	 */
	EReference getInterfaceMember__Marker_CONTEXT__SRC__mInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceMember__Marker#getCREATE__SRC__mModifier <em>CREATE SRC mModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mModifier</em>'.
	 * @see ModiscoTGG.InterfaceMember__Marker#getCREATE__SRC__mModifier()
	 * @see #getInterfaceMember__Marker()
	 * @generated
	 */
	EReference getInterfaceMember__Marker_CREATE__SRC__mModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceMember__Marker#getCONTEXT__TRG__tInterface <em>CONTEXT TRG tInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tInterface</em>'.
	 * @see ModiscoTGG.InterfaceMember__Marker#getCONTEXT__TRG__tInterface()
	 * @see #getInterfaceMember__Marker()
	 * @generated
	 */
	EReference getInterfaceMember__Marker_CONTEXT__TRG__tInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceMember__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.InterfaceMember__Marker#getCONTEXT__TRG__tMember()
	 * @see #getInterfaceMember__Marker()
	 * @generated
	 */
	EReference getInterfaceMember__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceMember__Marker#getCREATE__TRG__tModifier <em>CREATE TRG tModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tModifier</em>'.
	 * @see ModiscoTGG.InterfaceMember__Marker#getCREATE__TRG__tModifier()
	 * @see #getInterfaceMember__Marker()
	 * @generated
	 */
	EReference getInterfaceMember__Marker_CREATE__TRG__tModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceMember__Marker#getCONTEXT__CORR__defToMember <em>CONTEXT CORR def To Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR def To Member</em>'.
	 * @see ModiscoTGG.InterfaceMember__Marker#getCONTEXT__CORR__defToMember()
	 * @see #getInterfaceMember__Marker()
	 * @generated
	 */
	EReference getInterfaceMember__Marker_CONTEXT__CORR__defToMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceMember__Marker#getCREATE__CORR__mModifierToTModifier <em>CREATE CORR mModifier To TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mModifier To TModifier</em>'.
	 * @see ModiscoTGG.InterfaceMember__Marker#getCREATE__CORR__mModifierToTModifier()
	 * @see #getInterfaceMember__Marker()
	 * @generated
	 */
	EReference getInterfaceMember__Marker_CREATE__CORR__mModifierToTModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.InterfaceMember__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.InterfaceMember__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getInterfaceMember__Marker()
	 * @generated
	 */
	EReference getInterfaceMember__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker <em>Link Definition To Anonymous Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Definition To Anonymous Marker</em>'.
	 * @see ModiscoTGG.LinkDefinitionToAnonymous__Marker
	 * @generated
	 */
	EClass getLinkDefinitionToAnonymous__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mDefinition</em>'.
	 * @see ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__SRC__mDefinition()
	 * @see #getLinkDefinitionToAnonymous__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mSignature</em>'.
	 * @see ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__SRC__mSignature()
	 * @see #getLinkDefinitionToAnonymous__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__SRC__mSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mType</em>'.
	 * @see ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__SRC__mType()
	 * @see #getLinkDefinitionToAnonymous__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__TRG__tDefinition <em>CONTEXT TRG tDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tDefinition</em>'.
	 * @see ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__TRG__tDefinition()
	 * @see #getLinkDefinitionToAnonymous__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__TRG__tDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__TRG__tSignature <em>CONTEXT TRG tSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tSignature</em>'.
	 * @see ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__TRG__tSignature()
	 * @see #getLinkDefinitionToAnonymous__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__TRG__tSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tType</em>'.
	 * @see ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__TRG__tType()
	 * @see #getLinkDefinitionToAnonymous__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__CORR__mDefinitionToTMember <em>CONTEXT CORR mDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mDefinition To TMember</em>'.
	 * @see ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__CORR__mDefinitionToTMember()
	 * @see #getLinkDefinitionToAnonymous__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__CORR__mDefinitionToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mSignature To TSignature</em>'.
	 * @see ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__CORR__mSignatureToTSignature()
	 * @see #getLinkDefinitionToAnonymous__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__CORR__mSignatureToTSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getLinkDefinitionToAnonymous__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToAnonymous__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.LinkDefinitionToType__Marker <em>Link Definition To Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Definition To Type Marker</em>'.
	 * @see ModiscoTGG.LinkDefinitionToType__Marker
	 * @generated
	 */
	EClass getLinkDefinitionToType__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mDefinition</em>'.
	 * @see ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__SRC__mDefinition()
	 * @see #getLinkDefinitionToType__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToType__Marker_CONTEXT__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mSignature</em>'.
	 * @see ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__SRC__mSignature()
	 * @see #getLinkDefinitionToType__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToType__Marker_CONTEXT__SRC__mSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mType</em>'.
	 * @see ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__SRC__mType()
	 * @see #getLinkDefinitionToType__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToType__Marker_CONTEXT__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__TRG__tDefinition <em>CONTEXT TRG tDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tDefinition</em>'.
	 * @see ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__TRG__tDefinition()
	 * @see #getLinkDefinitionToType__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToType__Marker_CONTEXT__TRG__tDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__TRG__tSignature <em>CONTEXT TRG tSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tSignature</em>'.
	 * @see ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__TRG__tSignature()
	 * @see #getLinkDefinitionToType__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToType__Marker_CONTEXT__TRG__tSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tType</em>'.
	 * @see ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__TRG__tType()
	 * @see #getLinkDefinitionToType__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToType__Marker_CONTEXT__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__CORR__mDefinitionToTMember <em>CONTEXT CORR mDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mDefinition To TMember</em>'.
	 * @see ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__CORR__mDefinitionToTMember()
	 * @see #getLinkDefinitionToType__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToType__Marker_CONTEXT__CORR__mDefinitionToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mSignature To TSignature</em>'.
	 * @see ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__CORR__mSignatureToTSignature()
	 * @see #getLinkDefinitionToType__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToType__Marker_CONTEXT__CORR__mSignatureToTSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.LinkDefinitionToType__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getLinkDefinitionToType__Marker()
	 * @generated
	 */
	EReference getLinkDefinitionToType__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker <em>Member In Annotation Visibility Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member In Annotation Visibility Marker</em>'.
	 * @see ModiscoTGG.MemberInAnnotationVisibility__Marker
	 * @generated
	 */
	EClass getMemberInAnnotationVisibility__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__SRC__Annotation <em>CONTEXT SRC Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC Annotation</em>'.
	 * @see ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__SRC__Annotation()
	 * @see #getMemberInAnnotationVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInAnnotationVisibility__Marker_CONTEXT__SRC__Annotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mDefinition</em>'.
	 * @see ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__SRC__mDefinition()
	 * @see #getMemberInAnnotationVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInAnnotationVisibility__Marker_CONTEXT__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCREATE__SRC__mModifier <em>CREATE SRC mModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mModifier</em>'.
	 * @see ModiscoTGG.MemberInAnnotationVisibility__Marker#getCREATE__SRC__mModifier()
	 * @see #getMemberInAnnotationVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInAnnotationVisibility__Marker_CREATE__SRC__mModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__TRG__tAnnotation <em>CONTEXT TRG tAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAnnotation</em>'.
	 * @see ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__TRG__tAnnotation()
	 * @see #getMemberInAnnotationVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInAnnotationVisibility__Marker_CONTEXT__TRG__tAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__TRG__tMember()
	 * @see #getMemberInAnnotationVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInAnnotationVisibility__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCREATE__TRG__tModifier <em>CREATE TRG tModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tModifier</em>'.
	 * @see ModiscoTGG.MemberInAnnotationVisibility__Marker#getCREATE__TRG__tModifier()
	 * @see #getMemberInAnnotationVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInAnnotationVisibility__Marker_CREATE__TRG__tModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__CORR__defToMember <em>CONTEXT CORR def To Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR def To Member</em>'.
	 * @see ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__CORR__defToMember()
	 * @see #getMemberInAnnotationVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInAnnotationVisibility__Marker_CONTEXT__CORR__defToMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCREATE__CORR__mModifierToTModifier <em>CREATE CORR mModifier To TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mModifier To TModifier</em>'.
	 * @see ModiscoTGG.MemberInAnnotationVisibility__Marker#getCREATE__CORR__mModifierToTModifier()
	 * @see #getMemberInAnnotationVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInAnnotationVisibility__Marker_CREATE__CORR__mModifierToTModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getMemberInAnnotationVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInAnnotationVisibility__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MemberInClassVisibility__Marker <em>Member In Class Visibility Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member In Class Visibility Marker</em>'.
	 * @see ModiscoTGG.MemberInClassVisibility__Marker
	 * @generated
	 */
	EClass getMemberInClassVisibility__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInClassVisibility__Marker#getCONTEXT__SRC__mClass <em>CONTEXT SRC mClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mClass</em>'.
	 * @see ModiscoTGG.MemberInClassVisibility__Marker#getCONTEXT__SRC__mClass()
	 * @see #getMemberInClassVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInClassVisibility__Marker_CONTEXT__SRC__mClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInClassVisibility__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mDefinition</em>'.
	 * @see ModiscoTGG.MemberInClassVisibility__Marker#getCONTEXT__SRC__mDefinition()
	 * @see #getMemberInClassVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInClassVisibility__Marker_CONTEXT__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInClassVisibility__Marker#getCREATE__SRC__mModifier <em>CREATE SRC mModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mModifier</em>'.
	 * @see ModiscoTGG.MemberInClassVisibility__Marker#getCREATE__SRC__mModifier()
	 * @see #getMemberInClassVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInClassVisibility__Marker_CREATE__SRC__mModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInClassVisibility__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tClass</em>'.
	 * @see ModiscoTGG.MemberInClassVisibility__Marker#getCONTEXT__TRG__tClass()
	 * @see #getMemberInClassVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInClassVisibility__Marker_CONTEXT__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInClassVisibility__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.MemberInClassVisibility__Marker#getCONTEXT__TRG__tMember()
	 * @see #getMemberInClassVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInClassVisibility__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInClassVisibility__Marker#getCREATE__TRG__tModifier <em>CREATE TRG tModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tModifier</em>'.
	 * @see ModiscoTGG.MemberInClassVisibility__Marker#getCREATE__TRG__tModifier()
	 * @see #getMemberInClassVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInClassVisibility__Marker_CREATE__TRG__tModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInClassVisibility__Marker#getCONTEXT__CORR__defToMember <em>CONTEXT CORR def To Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR def To Member</em>'.
	 * @see ModiscoTGG.MemberInClassVisibility__Marker#getCONTEXT__CORR__defToMember()
	 * @see #getMemberInClassVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInClassVisibility__Marker_CONTEXT__CORR__defToMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInClassVisibility__Marker#getCREATE__CORR__mModifierToTModifier <em>CREATE CORR mModifier To TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mModifier To TModifier</em>'.
	 * @see ModiscoTGG.MemberInClassVisibility__Marker#getCREATE__CORR__mModifierToTModifier()
	 * @see #getMemberInClassVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInClassVisibility__Marker_CREATE__CORR__mModifierToTModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInClassVisibility__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.MemberInClassVisibility__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getMemberInClassVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInClassVisibility__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MemberInEnumVisibility__Marker <em>Member In Enum Visibility Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member In Enum Visibility Marker</em>'.
	 * @see ModiscoTGG.MemberInEnumVisibility__Marker
	 * @generated
	 */
	EClass getMemberInEnumVisibility__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInEnumVisibility__Marker#getCONTEXT__SRC__mClass <em>CONTEXT SRC mClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mClass</em>'.
	 * @see ModiscoTGG.MemberInEnumVisibility__Marker#getCONTEXT__SRC__mClass()
	 * @see #getMemberInEnumVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInEnumVisibility__Marker_CONTEXT__SRC__mClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInEnumVisibility__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mDefinition</em>'.
	 * @see ModiscoTGG.MemberInEnumVisibility__Marker#getCONTEXT__SRC__mDefinition()
	 * @see #getMemberInEnumVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInEnumVisibility__Marker_CONTEXT__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInEnumVisibility__Marker#getCREATE__SRC__mModifier <em>CREATE SRC mModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mModifier</em>'.
	 * @see ModiscoTGG.MemberInEnumVisibility__Marker#getCREATE__SRC__mModifier()
	 * @see #getMemberInEnumVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInEnumVisibility__Marker_CREATE__SRC__mModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInEnumVisibility__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tClass</em>'.
	 * @see ModiscoTGG.MemberInEnumVisibility__Marker#getCONTEXT__TRG__tClass()
	 * @see #getMemberInEnumVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInEnumVisibility__Marker_CONTEXT__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInEnumVisibility__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.MemberInEnumVisibility__Marker#getCONTEXT__TRG__tMember()
	 * @see #getMemberInEnumVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInEnumVisibility__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInEnumVisibility__Marker#getCREATE__TRG__tModifier <em>CREATE TRG tModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tModifier</em>'.
	 * @see ModiscoTGG.MemberInEnumVisibility__Marker#getCREATE__TRG__tModifier()
	 * @see #getMemberInEnumVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInEnumVisibility__Marker_CREATE__TRG__tModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInEnumVisibility__Marker#getCONTEXT__CORR__defToMember <em>CONTEXT CORR def To Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR def To Member</em>'.
	 * @see ModiscoTGG.MemberInEnumVisibility__Marker#getCONTEXT__CORR__defToMember()
	 * @see #getMemberInEnumVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInEnumVisibility__Marker_CONTEXT__CORR__defToMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInEnumVisibility__Marker#getCREATE__CORR__mModifierToTModifier <em>CREATE CORR mModifier To TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mModifier To TModifier</em>'.
	 * @see ModiscoTGG.MemberInEnumVisibility__Marker#getCREATE__CORR__mModifierToTModifier()
	 * @see #getMemberInEnumVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInEnumVisibility__Marker_CREATE__CORR__mModifierToTModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MemberInEnumVisibility__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.MemberInEnumVisibility__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getMemberInEnumVisibility__Marker()
	 * @generated
	 */
	EReference getMemberInEnumVisibility__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MethodDefinition__Marker <em>Method Definition Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Definition Marker</em>'.
	 * @see ModiscoTGG.MethodDefinition__Marker
	 * @generated
	 */
	EClass getMethodDefinition__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__SRC__mDefinition <em>CREATE SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mDefinition</em>'.
	 * @see ModiscoTGG.MethodDefinition__Marker#getCREATE__SRC__mDefinition()
	 * @see #getMethodDefinition__Marker()
	 * @generated
	 */
	EReference getMethodDefinition__Marker_CREATE__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodDefinition__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mSignature</em>'.
	 * @see ModiscoTGG.MethodDefinition__Marker#getCONTEXT__SRC__mSignature()
	 * @see #getMethodDefinition__Marker()
	 * @generated
	 */
	EReference getMethodDefinition__Marker_CONTEXT__SRC__mSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__TRG__tDefinition <em>CREATE TRG tDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tDefinition</em>'.
	 * @see ModiscoTGG.MethodDefinition__Marker#getCREATE__TRG__tDefinition()
	 * @see #getMethodDefinition__Marker()
	 * @generated
	 */
	EReference getMethodDefinition__Marker_CREATE__TRG__tDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodDefinition__Marker#getCONTEXT__TRG__tMethodSignature <em>CONTEXT TRG tMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMethod Signature</em>'.
	 * @see ModiscoTGG.MethodDefinition__Marker#getCONTEXT__TRG__tMethodSignature()
	 * @see #getMethodDefinition__Marker()
	 * @generated
	 */
	EReference getMethodDefinition__Marker_CONTEXT__TRG__tMethodSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mBody To TAnnotation</em>'.
	 * @see ModiscoTGG.MethodDefinition__Marker#getCREATE__CORR__mBodyToTAnnotation()
	 * @see #getMethodDefinition__Marker()
	 * @generated
	 */
	EReference getMethodDefinition__Marker_CREATE__CORR__mBodyToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__CORR__mDefinitionToTMember <em>CREATE CORR mDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mDefinition To TMember</em>'.
	 * @see ModiscoTGG.MethodDefinition__Marker#getCREATE__CORR__mDefinitionToTMember()
	 * @see #getMethodDefinition__Marker()
	 * @generated
	 */
	EReference getMethodDefinition__Marker_CREATE__CORR__mDefinitionToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Element To TFlow Element</em>'.
	 * @see ModiscoTGG.MethodDefinition__Marker#getCREATE__CORR__mFlowElementToTFlowElement()
	 * @see #getMethodDefinition__Marker()
	 * @generated
	 */
	EReference getMethodDefinition__Marker_CREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodDefinition__Marker#getCONTEXT__CORR__mSignatureToTMethodSignature <em>CONTEXT CORR mSignature To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mSignature To TMethod Signature</em>'.
	 * @see ModiscoTGG.MethodDefinition__Marker#getCONTEXT__CORR__mSignatureToTMethodSignature()
	 * @see #getMethodDefinition__Marker()
	 * @generated
	 */
	EReference getMethodDefinition__Marker_CONTEXT__CORR__mSignatureToTMethodSignature();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MethodInvocation__Marker <em>Method Invocation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Invocation Marker</em>'.
	 * @see ModiscoTGG.MethodInvocation__Marker
	 * @generated
	 */
	EClass getMethodInvocation__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocation__Marker#getCREATE__SRC__invocation <em>CREATE SRC invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC invocation</em>'.
	 * @see ModiscoTGG.MethodInvocation__Marker#getCREATE__SRC__invocation()
	 * @see #getMethodInvocation__Marker()
	 * @generated
	 */
	EReference getMethodInvocation__Marker_CREATE__SRC__invocation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocation__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMember</em>'.
	 * @see ModiscoTGG.MethodInvocation__Marker#getCONTEXT__SRC__mMember()
	 * @see #getMethodInvocation__Marker()
	 * @generated
	 */
	EReference getMethodInvocation__Marker_CONTEXT__SRC__mMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocation__Marker#getCONTEXT__SRC__mMethod <em>CONTEXT SRC mMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMethod</em>'.
	 * @see ModiscoTGG.MethodInvocation__Marker#getCONTEXT__SRC__mMethod()
	 * @see #getMethodInvocation__Marker()
	 * @generated
	 */
	EReference getMethodInvocation__Marker_CONTEXT__SRC__mMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocation__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAccess</em>'.
	 * @see ModiscoTGG.MethodInvocation__Marker#getCREATE__TRG__tAccess()
	 * @see #getMethodInvocation__Marker()
	 * @generated
	 */
	EReference getMethodInvocation__Marker_CREATE__TRG__tAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocation__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.MethodInvocation__Marker#getCONTEXT__TRG__tMember()
	 * @see #getMethodInvocation__Marker()
	 * @generated
	 */
	EReference getMethodInvocation__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocation__Marker#getCONTEXT__TRG__tMethod <em>CONTEXT TRG tMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMethod</em>'.
	 * @see ModiscoTGG.MethodInvocation__Marker#getCONTEXT__TRG__tMethod()
	 * @see #getMethodInvocation__Marker()
	 * @generated
	 */
	EReference getMethodInvocation__Marker_CONTEXT__TRG__tMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocation__Marker#getCREATE__CORR__invocationToTAccess <em>CREATE CORR invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR invocation To TAccess</em>'.
	 * @see ModiscoTGG.MethodInvocation__Marker#getCREATE__CORR__invocationToTAccess()
	 * @see #getMethodInvocation__Marker()
	 * @generated
	 */
	EReference getMethodInvocation__Marker_CREATE__CORR__invocationToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocation__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Element To TFlow Element</em>'.
	 * @see ModiscoTGG.MethodInvocation__Marker#getCREATE__CORR__mFlowElementToTFlowElement()
	 * @see #getMethodInvocation__Marker()
	 * @generated
	 */
	EReference getMethodInvocation__Marker_CREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocation__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMember To TMember</em>'.
	 * @see ModiscoTGG.MethodInvocation__Marker#getCONTEXT__CORR__mMemberToTMember()
	 * @see #getMethodInvocation__Marker()
	 * @generated
	 */
	EReference getMethodInvocation__Marker_CONTEXT__CORR__mMemberToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocation__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMethod To TMethod</em>'.
	 * @see ModiscoTGG.MethodInvocation__Marker#getCONTEXT__CORR__mMethodToTMethod()
	 * @see #getMethodInvocation__Marker()
	 * @generated
	 */
	EReference getMethodInvocation__Marker_CONTEXT__CORR__mMethodToTMethod();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MethodInvocationRecursive__Marker <em>Method Invocation Recursive Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Invocation Recursive Marker</em>'.
	 * @see ModiscoTGG.MethodInvocationRecursive__Marker
	 * @generated
	 */
	EClass getMethodInvocationRecursive__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__SRC__invocation <em>CREATE SRC invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC invocation</em>'.
	 * @see ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__SRC__invocation()
	 * @see #getMethodInvocationRecursive__Marker()
	 * @generated
	 */
	EReference getMethodInvocationRecursive__Marker_CREATE__SRC__invocation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMember</em>'.
	 * @see ModiscoTGG.MethodInvocationRecursive__Marker#getCONTEXT__SRC__mMember()
	 * @see #getMethodInvocationRecursive__Marker()
	 * @generated
	 */
	EReference getMethodInvocationRecursive__Marker_CONTEXT__SRC__mMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAccess</em>'.
	 * @see ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__TRG__tAccess()
	 * @see #getMethodInvocationRecursive__Marker()
	 * @generated
	 */
	EReference getMethodInvocationRecursive__Marker_CREATE__TRG__tAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.MethodInvocationRecursive__Marker#getCONTEXT__TRG__tMember()
	 * @see #getMethodInvocationRecursive__Marker()
	 * @generated
	 */
	EReference getMethodInvocationRecursive__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__CORR__invocationToTAccess <em>CREATE CORR invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR invocation To TAccess</em>'.
	 * @see ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__CORR__invocationToTAccess()
	 * @see #getMethodInvocationRecursive__Marker()
	 * @generated
	 */
	EReference getMethodInvocationRecursive__Marker_CREATE__CORR__invocationToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Element To TFlow Element</em>'.
	 * @see ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__CORR__mFlowElementToTFlowElement()
	 * @see #getMethodInvocationRecursive__Marker()
	 * @generated
	 */
	EReference getMethodInvocationRecursive__Marker_CREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMember To TMember</em>'.
	 * @see ModiscoTGG.MethodInvocationRecursive__Marker#getCONTEXT__CORR__mMemberToTMember()
	 * @see #getMethodInvocationRecursive__Marker()
	 * @generated
	 */
	EReference getMethodInvocationRecursive__Marker_CONTEXT__CORR__mMemberToTMember();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MethodInvocationStaticType__Marker <em>Method Invocation Static Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Invocation Static Type Marker</em>'.
	 * @see ModiscoTGG.MethodInvocationStaticType__Marker
	 * @generated
	 */
	EClass getMethodInvocationStaticType__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__SRC__invocation <em>CONTEXT SRC invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC invocation</em>'.
	 * @see ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__SRC__invocation()
	 * @see #getMethodInvocationStaticType__Marker()
	 * @generated
	 */
	EReference getMethodInvocationStaticType__Marker_CONTEXT__SRC__invocation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__SRC__mStaticType <em>CONTEXT SRC mStatic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mStatic Type</em>'.
	 * @see ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__SRC__mStaticType()
	 * @see #getMethodInvocationStaticType__Marker()
	 * @generated
	 */
	EReference getMethodInvocationStaticType__Marker_CONTEXT__SRC__mStaticType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__TRG__tAccess <em>CONTEXT TRG tAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAccess</em>'.
	 * @see ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__TRG__tAccess()
	 * @see #getMethodInvocationStaticType__Marker()
	 * @generated
	 */
	EReference getMethodInvocationStaticType__Marker_CONTEXT__TRG__tAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__TRG__tStaticType <em>CONTEXT TRG tStatic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tStatic Type</em>'.
	 * @see ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__TRG__tStaticType()
	 * @see #getMethodInvocationStaticType__Marker()
	 * @generated
	 */
	EReference getMethodInvocationStaticType__Marker_CONTEXT__TRG__tStaticType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__CORR__invocationToTAccess <em>CONTEXT CORR invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR invocation To TAccess</em>'.
	 * @see ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__CORR__invocationToTAccess()
	 * @see #getMethodInvocationStaticType__Marker()
	 * @generated
	 */
	EReference getMethodInvocationStaticType__Marker_CONTEXT__CORR__invocationToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__CORR__mStaticTypeTotStaticType <em>CONTEXT CORR mStatic Type Tot Static Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mStatic Type Tot Static Type</em>'.
	 * @see ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__CORR__mStaticTypeTotStaticType()
	 * @see #getMethodInvocationStaticType__Marker()
	 * @generated
	 */
	EReference getMethodInvocationStaticType__Marker_CONTEXT__CORR__mStaticTypeTotStaticType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MethodName__Marker <em>Method Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Name Marker</em>'.
	 * @see ModiscoTGG.MethodName__Marker
	 * @generated
	 */
	EClass getMethodName__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodName__Marker#getCONTEXT__SRC__mModel <em>CONTEXT SRC mModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mModel</em>'.
	 * @see ModiscoTGG.MethodName__Marker#getCONTEXT__SRC__mModel()
	 * @see #getMethodName__Marker()
	 * @generated
	 */
	EReference getMethodName__Marker_CONTEXT__SRC__mModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodName__Marker#getCREATE__SRC__mName <em>CREATE SRC mName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mName</em>'.
	 * @see ModiscoTGG.MethodName__Marker#getCREATE__SRC__mName()
	 * @see #getMethodName__Marker()
	 * @generated
	 */
	EReference getMethodName__Marker_CREATE__SRC__mName();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodName__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.MethodName__Marker#getCONTEXT__TRG__pg()
	 * @see #getMethodName__Marker()
	 * @generated
	 */
	EReference getMethodName__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodName__Marker#getCREATE__TRG__tName <em>CREATE TRG tName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tName</em>'.
	 * @see ModiscoTGG.MethodName__Marker#getCREATE__TRG__tName()
	 * @see #getMethodName__Marker()
	 * @generated
	 */
	EReference getMethodName__Marker_CREATE__TRG__tName();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodName__Marker#getCREATE__CORR__mNameToTName <em>CREATE CORR mName To TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mName To TName</em>'.
	 * @see ModiscoTGG.MethodName__Marker#getCREATE__CORR__mNameToTName()
	 * @see #getMethodName__Marker()
	 * @generated
	 */
	EReference getMethodName__Marker_CREATE__CORR__mNameToTName();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodName__Marker#getCONTEXT__CORR__modelToPg <em>CONTEXT CORR model To Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR model To Pg</em>'.
	 * @see ModiscoTGG.MethodName__Marker#getCONTEXT__CORR__modelToPg()
	 * @see #getMethodName__Marker()
	 * @generated
	 */
	EReference getMethodName__Marker_CONTEXT__CORR__modelToPg();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MethodOverriding__Marker <em>Method Overriding Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Overriding Marker</em>'.
	 * @see ModiscoTGG.MethodOverriding__Marker
	 * @generated
	 */
	EClass getMethodOverriding__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__SRC__mMethod <em>CONTEXT SRC mMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMethod</em>'.
	 * @see ModiscoTGG.MethodOverriding__Marker#getCONTEXT__SRC__mMethod()
	 * @see #getMethodOverriding__Marker()
	 * @generated
	 */
	EReference getMethodOverriding__Marker_CONTEXT__SRC__mMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__SRC__mOverriding <em>CONTEXT SRC mOverriding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mOverriding</em>'.
	 * @see ModiscoTGG.MethodOverriding__Marker#getCONTEXT__SRC__mOverriding()
	 * @see #getMethodOverriding__Marker()
	 * @generated
	 */
	EReference getMethodOverriding__Marker_CONTEXT__SRC__mOverriding();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__TRG__tMethod <em>CONTEXT TRG tMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMethod</em>'.
	 * @see ModiscoTGG.MethodOverriding__Marker#getCONTEXT__TRG__tMethod()
	 * @see #getMethodOverriding__Marker()
	 * @generated
	 */
	EReference getMethodOverriding__Marker_CONTEXT__TRG__tMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__TRG__tOverriding <em>CONTEXT TRG tOverriding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOverriding</em>'.
	 * @see ModiscoTGG.MethodOverriding__Marker#getCONTEXT__TRG__tOverriding()
	 * @see #getMethodOverriding__Marker()
	 * @generated
	 */
	EReference getMethodOverriding__Marker_CONTEXT__TRG__tOverriding();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMethod To TMethod</em>'.
	 * @see ModiscoTGG.MethodOverriding__Marker#getCONTEXT__CORR__mMethodToTMethod()
	 * @see #getMethodOverriding__Marker()
	 * @generated
	 */
	EReference getMethodOverriding__Marker_CONTEXT__CORR__mMethodToTMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__CORR__mOverridingToTOverriding <em>CONTEXT CORR mOverriding To TOverriding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mOverriding To TOverriding</em>'.
	 * @see ModiscoTGG.MethodOverriding__Marker#getCONTEXT__CORR__mOverridingToTOverriding()
	 * @see #getMethodOverriding__Marker()
	 * @generated
	 */
	EReference getMethodOverriding__Marker_CONTEXT__CORR__mOverridingToTOverriding();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MethodParameter__Marker <em>Method Parameter Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Parameter Marker</em>'.
	 * @see ModiscoTGG.MethodParameter__Marker
	 * @generated
	 */
	EClass getMethodParameter__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameter__Marker#getCREATE__SRC__mEntry <em>CREATE SRC mEntry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mEntry</em>'.
	 * @see ModiscoTGG.MethodParameter__Marker#getCREATE__SRC__mEntry()
	 * @see #getMethodParameter__Marker()
	 * @generated
	 */
	EReference getMethodParameter__Marker_CREATE__SRC__mEntry();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameter__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mSignature</em>'.
	 * @see ModiscoTGG.MethodParameter__Marker#getCONTEXT__SRC__mSignature()
	 * @see #getMethodParameter__Marker()
	 * @generated
	 */
	EReference getMethodParameter__Marker_CONTEXT__SRC__mSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameter__Marker#getCREATE__TRG__tParameter <em>CREATE TRG tParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tParameter</em>'.
	 * @see ModiscoTGG.MethodParameter__Marker#getCREATE__TRG__tParameter()
	 * @see #getMethodParameter__Marker()
	 * @generated
	 */
	EReference getMethodParameter__Marker_CREATE__TRG__tParameter();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameter__Marker#getCONTEXT__TRG__tSiganture <em>CONTEXT TRG tSiganture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tSiganture</em>'.
	 * @see ModiscoTGG.MethodParameter__Marker#getCONTEXT__TRG__tSiganture()
	 * @see #getMethodParameter__Marker()
	 * @generated
	 */
	EReference getMethodParameter__Marker_CONTEXT__TRG__tSiganture();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameter__Marker#getCREATE__CORR__mEntryToTParameter <em>CREATE CORR mEntry To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mEntry To TParameter</em>'.
	 * @see ModiscoTGG.MethodParameter__Marker#getCREATE__CORR__mEntryToTParameter()
	 * @see #getMethodParameter__Marker()
	 * @generated
	 */
	EReference getMethodParameter__Marker_CREATE__CORR__mEntryToTParameter();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameter__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Element To TFlow Element</em>'.
	 * @see ModiscoTGG.MethodParameter__Marker#getCREATE__CORR__mFlowElementToTFlowElement()
	 * @see #getMethodParameter__Marker()
	 * @generated
	 */
	EReference getMethodParameter__Marker_CREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameter__Marker#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mSignature To TSignature</em>'.
	 * @see ModiscoTGG.MethodParameter__Marker#getCONTEXT__CORR__mSignatureToTSignature()
	 * @see #getMethodParameter__Marker()
	 * @generated
	 */
	EReference getMethodParameter__Marker_CONTEXT__CORR__mSignatureToTSignature();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MethodParameterLink__Marker <em>Method Parameter Link Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Parameter Link Marker</em>'.
	 * @see ModiscoTGG.MethodParameterLink__Marker
	 * @generated
	 */
	EClass getMethodParameterLink__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__SRC__mEntry <em>CONTEXT SRC mEntry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mEntry</em>'.
	 * @see ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__SRC__mEntry()
	 * @see #getMethodParameterLink__Marker()
	 * @generated
	 */
	EReference getMethodParameterLink__Marker_CONTEXT__SRC__mEntry();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__SRC__mPrevEntry <em>CONTEXT SRC mPrev Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mPrev Entry</em>'.
	 * @see ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__SRC__mPrevEntry()
	 * @see #getMethodParameterLink__Marker()
	 * @generated
	 */
	EReference getMethodParameterLink__Marker_CONTEXT__SRC__mPrevEntry();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__TRG__tParameter <em>CONTEXT TRG tParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tParameter</em>'.
	 * @see ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__TRG__tParameter()
	 * @see #getMethodParameterLink__Marker()
	 * @generated
	 */
	EReference getMethodParameterLink__Marker_CONTEXT__TRG__tParameter();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__TRG__tPrevParameter <em>CONTEXT TRG tPrev Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tPrev Parameter</em>'.
	 * @see ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__TRG__tPrevParameter()
	 * @see #getMethodParameterLink__Marker()
	 * @generated
	 */
	EReference getMethodParameterLink__Marker_CONTEXT__TRG__tPrevParameter();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__CORR__eSingleVariableDeclarationToTParameter <em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>'.
	 * @see ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__CORR__eSingleVariableDeclarationToTParameter()
	 * @see #getMethodParameterLink__Marker()
	 * @generated
	 */
	EReference getMethodParameterLink__Marker_CONTEXT__CORR__eSingleVariableDeclarationToTParameter();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__CORR__mmethodSignatureToTMethodSignature <em>CONTEXT CORR mmethod Signature To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mmethod Signature To TMethod Signature</em>'.
	 * @see ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__CORR__mmethodSignatureToTMethodSignature()
	 * @see #getMethodParameterLink__Marker()
	 * @generated
	 */
	EReference getMethodParameterLink__Marker_CONTEXT__CORR__mmethodSignatureToTMethodSignature();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MethodParameterLinkFirst__Marker <em>Method Parameter Link First Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Parameter Link First Marker</em>'.
	 * @see ModiscoTGG.MethodParameterLinkFirst__Marker
	 * @generated
	 */
	EClass getMethodParameterLinkFirst__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__SRC__mEntry <em>CONTEXT SRC mEntry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mEntry</em>'.
	 * @see ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__SRC__mEntry()
	 * @see #getMethodParameterLinkFirst__Marker()
	 * @generated
	 */
	EReference getMethodParameterLinkFirst__Marker_CONTEXT__SRC__mEntry();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__SRC__mParameterList <em>CONTEXT SRC mParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mParameter List</em>'.
	 * @see ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__SRC__mParameterList()
	 * @see #getMethodParameterLinkFirst__Marker()
	 * @generated
	 */
	EReference getMethodParameterLinkFirst__Marker_CONTEXT__SRC__mParameterList();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__TRG__tMethodSignature <em>CONTEXT TRG tMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMethod Signature</em>'.
	 * @see ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__TRG__tMethodSignature()
	 * @see #getMethodParameterLinkFirst__Marker()
	 * @generated
	 */
	EReference getMethodParameterLinkFirst__Marker_CONTEXT__TRG__tMethodSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__TRG__tParameter <em>CONTEXT TRG tParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tParameter</em>'.
	 * @see ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__TRG__tParameter()
	 * @see #getMethodParameterLinkFirst__Marker()
	 * @generated
	 */
	EReference getMethodParameterLinkFirst__Marker_CONTEXT__TRG__tParameter();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__CORR__eSingleVariableDeclarationToTParameter <em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>'.
	 * @see ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__CORR__eSingleVariableDeclarationToTParameter()
	 * @see #getMethodParameterLinkFirst__Marker()
	 * @generated
	 */
	EReference getMethodParameterLinkFirst__Marker_CONTEXT__CORR__eSingleVariableDeclarationToTParameter();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__CORR__mmethodSignatureToTMethodSignature <em>CONTEXT CORR mmethod Signature To TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mmethod Signature To TMethod Signature</em>'.
	 * @see ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__CORR__mmethodSignatureToTMethodSignature()
	 * @see #getMethodParameterLinkFirst__Marker()
	 * @generated
	 */
	EReference getMethodParameterLinkFirst__Marker_CONTEXT__CORR__mmethodSignatureToTMethodSignature();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MethodParameterType__Marker <em>Method Parameter Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Parameter Type Marker</em>'.
	 * @see ModiscoTGG.MethodParameterType__Marker
	 * @generated
	 */
	EClass getMethodParameterType__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterType__Marker#getCREATE__SRC__mEntry <em>CREATE SRC mEntry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mEntry</em>'.
	 * @see ModiscoTGG.MethodParameterType__Marker#getCREATE__SRC__mEntry()
	 * @see #getMethodParameterType__Marker()
	 * @generated
	 */
	EReference getMethodParameterType__Marker_CREATE__SRC__mEntry();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterType__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mSignature</em>'.
	 * @see ModiscoTGG.MethodParameterType__Marker#getCONTEXT__SRC__mSignature()
	 * @see #getMethodParameterType__Marker()
	 * @generated
	 */
	EReference getMethodParameterType__Marker_CONTEXT__SRC__mSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterType__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mType</em>'.
	 * @see ModiscoTGG.MethodParameterType__Marker#getCONTEXT__SRC__mType()
	 * @see #getMethodParameterType__Marker()
	 * @generated
	 */
	EReference getMethodParameterType__Marker_CONTEXT__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterType__Marker#getCONTEXT__TRG__tAbstractType <em>CONTEXT TRG tAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAbstract Type</em>'.
	 * @see ModiscoTGG.MethodParameterType__Marker#getCONTEXT__TRG__tAbstractType()
	 * @see #getMethodParameterType__Marker()
	 * @generated
	 */
	EReference getMethodParameterType__Marker_CONTEXT__TRG__tAbstractType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterType__Marker#getCREATE__TRG__tParameter <em>CREATE TRG tParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tParameter</em>'.
	 * @see ModiscoTGG.MethodParameterType__Marker#getCREATE__TRG__tParameter()
	 * @see #getMethodParameterType__Marker()
	 * @generated
	 */
	EReference getMethodParameterType__Marker_CREATE__TRG__tParameter();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterType__Marker#getCONTEXT__TRG__tSiganture <em>CONTEXT TRG tSiganture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tSiganture</em>'.
	 * @see ModiscoTGG.MethodParameterType__Marker#getCONTEXT__TRG__tSiganture()
	 * @see #getMethodParameterType__Marker()
	 * @generated
	 */
	EReference getMethodParameterType__Marker_CONTEXT__TRG__tSiganture();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterType__Marker#getCREATE__CORR__mEntryToTParameter <em>CREATE CORR mEntry To TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mEntry To TParameter</em>'.
	 * @see ModiscoTGG.MethodParameterType__Marker#getCREATE__CORR__mEntryToTParameter()
	 * @see #getMethodParameterType__Marker()
	 * @generated
	 */
	EReference getMethodParameterType__Marker_CREATE__CORR__mEntryToTParameter();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterType__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Element To TFlow Element</em>'.
	 * @see ModiscoTGG.MethodParameterType__Marker#getCREATE__CORR__mFlowElementToTFlowElement()
	 * @see #getMethodParameterType__Marker()
	 * @generated
	 */
	EReference getMethodParameterType__Marker_CREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterType__Marker#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mSignature To TSignature</em>'.
	 * @see ModiscoTGG.MethodParameterType__Marker#getCONTEXT__CORR__mSignatureToTSignature()
	 * @see #getMethodParameterType__Marker()
	 * @generated
	 */
	EReference getMethodParameterType__Marker_CONTEXT__CORR__mSignatureToTSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodParameterType__Marker#getCONTEXT__CORR__mTypeToTAbstractType <em>CONTEXT CORR mType To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TAbstract Type</em>'.
	 * @see ModiscoTGG.MethodParameterType__Marker#getCONTEXT__CORR__mTypeToTAbstractType()
	 * @see #getMethodParameterType__Marker()
	 * @generated
	 */
	EReference getMethodParameterType__Marker_CONTEXT__CORR__mTypeToTAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.MethodSignature__Marker <em>Method Signature Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Signature Marker</em>'.
	 * @see ModiscoTGG.MethodSignature__Marker
	 * @generated
	 */
	EClass getMethodSignature__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodSignature__Marker#getCONTEXT__SRC__mName <em>CONTEXT SRC mName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mName</em>'.
	 * @see ModiscoTGG.MethodSignature__Marker#getCONTEXT__SRC__mName()
	 * @see #getMethodSignature__Marker()
	 * @generated
	 */
	EReference getMethodSignature__Marker_CONTEXT__SRC__mName();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodSignature__Marker#getCREATE__SRC__mSignature <em>CREATE SRC mSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mSignature</em>'.
	 * @see ModiscoTGG.MethodSignature__Marker#getCREATE__SRC__mSignature()
	 * @see #getMethodSignature__Marker()
	 * @generated
	 */
	EReference getMethodSignature__Marker_CREATE__SRC__mSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodSignature__Marker#getCONTEXT__TRG__tName <em>CONTEXT TRG tName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tName</em>'.
	 * @see ModiscoTGG.MethodSignature__Marker#getCONTEXT__TRG__tName()
	 * @see #getMethodSignature__Marker()
	 * @generated
	 */
	EReference getMethodSignature__Marker_CONTEXT__TRG__tName();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodSignature__Marker#getCREATE__TRG__tSignature <em>CREATE TRG tSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tSignature</em>'.
	 * @see ModiscoTGG.MethodSignature__Marker#getCREATE__TRG__tSignature()
	 * @see #getMethodSignature__Marker()
	 * @generated
	 */
	EReference getMethodSignature__Marker_CREATE__TRG__tSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodSignature__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Element To TFlow Element</em>'.
	 * @see ModiscoTGG.MethodSignature__Marker#getCREATE__CORR__mFlowElementToTFlowElement()
	 * @see #getMethodSignature__Marker()
	 * @generated
	 */
	EReference getMethodSignature__Marker_CREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodSignature__Marker#getCONTEXT__CORR__mNameToTName <em>CONTEXT CORR mName To TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mName To TName</em>'.
	 * @see ModiscoTGG.MethodSignature__Marker#getCONTEXT__CORR__mNameToTName()
	 * @see #getMethodSignature__Marker()
	 * @generated
	 */
	EReference getMethodSignature__Marker_CONTEXT__CORR__mNameToTName();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.MethodSignature__Marker#getCREATE__CORR__mSignatureToTSignature <em>CREATE CORR mSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mSignature To TSignature</em>'.
	 * @see ModiscoTGG.MethodSignature__Marker#getCREATE__CORR__mSignatureToTSignature()
	 * @see #getMethodSignature__Marker()
	 * @generated
	 */
	EReference getMethodSignature__Marker_CREATE__CORR__mSignatureToTSignature();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ModelToPg__Marker <em>Model To Pg Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model To Pg Marker</em>'.
	 * @see ModiscoTGG.ModelToPg__Marker
	 * @generated
	 */
	EClass getModelToPg__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModelToPg__Marker#getCREATE__SRC__mModel <em>CREATE SRC mModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mModel</em>'.
	 * @see ModiscoTGG.ModelToPg__Marker#getCREATE__SRC__mModel()
	 * @see #getModelToPg__Marker()
	 * @generated
	 */
	EReference getModelToPg__Marker_CREATE__SRC__mModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModelToPg__Marker#getCREATE__TRG__tPG <em>CREATE TRG tPG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tPG</em>'.
	 * @see ModiscoTGG.ModelToPg__Marker#getCREATE__TRG__tPG()
	 * @see #getModelToPg__Marker()
	 * @generated
	 */
	EReference getModelToPg__Marker_CREATE__TRG__tPG();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ModelToPg__Marker#getCREATE__CORR__mModelToTPG <em>CREATE CORR mModel To TPG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mModel To TPG</em>'.
	 * @see ModiscoTGG.ModelToPg__Marker#getCREATE__CORR__mModelToTPG()
	 * @see #getModelToPg__Marker()
	 * @generated
	 */
	EReference getModelToPg__Marker_CREATE__CORR__mModelToTPG();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.NestedClassInType__Marker <em>Nested Class In Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Class In Type Marker</em>'.
	 * @see ModiscoTGG.NestedClassInType__Marker
	 * @generated
	 */
	EClass getNestedClassInType__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedClassInType__Marker#getCREATE__SRC__eNestedType <em>CREATE SRC eNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC eNested Type</em>'.
	 * @see ModiscoTGG.NestedClassInType__Marker#getCREATE__SRC__eNestedType()
	 * @see #getNestedClassInType__Marker()
	 * @generated
	 */
	EReference getNestedClassInType__Marker_CREATE__SRC__eNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedClassInType__Marker#getCONTEXT__SRC__eOuterType <em>CONTEXT SRC eOuter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eOuter Type</em>'.
	 * @see ModiscoTGG.NestedClassInType__Marker#getCONTEXT__SRC__eOuterType()
	 * @see #getNestedClassInType__Marker()
	 * @generated
	 */
	EReference getNestedClassInType__Marker_CONTEXT__SRC__eOuterType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedClassInType__Marker#getCREATE__TRG__tNestedPackage <em>CREATE TRG tNested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNested Package</em>'.
	 * @see ModiscoTGG.NestedClassInType__Marker#getCREATE__TRG__tNestedPackage()
	 * @see #getNestedClassInType__Marker()
	 * @generated
	 */
	EReference getNestedClassInType__Marker_CREATE__TRG__tNestedPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedClassInType__Marker#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNested Type</em>'.
	 * @see ModiscoTGG.NestedClassInType__Marker#getCREATE__TRG__tNestedType()
	 * @see #getNestedClassInType__Marker()
	 * @generated
	 */
	EReference getNestedClassInType__Marker_CREATE__TRG__tNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedClassInType__Marker#getCONTEXT__TRG__tOuterPackage <em>CONTEXT TRG tOuter Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOuter Package</em>'.
	 * @see ModiscoTGG.NestedClassInType__Marker#getCONTEXT__TRG__tOuterPackage()
	 * @see #getNestedClassInType__Marker()
	 * @generated
	 */
	EReference getNestedClassInType__Marker_CONTEXT__TRG__tOuterPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedClassInType__Marker#getCONTEXT__TRG__tOuterType <em>CONTEXT TRG tOuter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOuter Type</em>'.
	 * @see ModiscoTGG.NestedClassInType__Marker#getCONTEXT__TRG__tOuterType()
	 * @see #getNestedClassInType__Marker()
	 * @generated
	 */
	EReference getNestedClassInType__Marker_CONTEXT__TRG__tOuterType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedClassInType__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.NestedClassInType__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getNestedClassInType__Marker()
	 * @generated
	 */
	EReference getNestedClassInType__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedClassInType__Marker#getCREATE__CORR__eNestedTypeToTNestedType <em>CREATE CORR eNested Type To TNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR eNested Type To TNested Type</em>'.
	 * @see ModiscoTGG.NestedClassInType__Marker#getCREATE__CORR__eNestedTypeToTNestedType()
	 * @see #getNestedClassInType__Marker()
	 * @generated
	 */
	EReference getNestedClassInType__Marker_CREATE__CORR__eNestedTypeToTNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedClassInType__Marker#getCONTEXT__CORR__eOuterTypeToTOuterInterface <em>CONTEXT CORR eOuter Type To TOuter Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eOuter Type To TOuter Interface</em>'.
	 * @see ModiscoTGG.NestedClassInType__Marker#getCONTEXT__CORR__eOuterTypeToTOuterInterface()
	 * @see #getNestedClassInType__Marker()
	 * @generated
	 */
	EReference getNestedClassInType__Marker_CONTEXT__CORR__eOuterTypeToTOuterInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedClassInType__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mBody To TAnnotation</em>'.
	 * @see ModiscoTGG.NestedClassInType__Marker#getCREATE__CORR__mBodyToTAnnotation()
	 * @see #getNestedClassInType__Marker()
	 * @generated
	 */
	EReference getNestedClassInType__Marker_CREATE__CORR__mBodyToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedClassInType__Marker#getCREATE__CORR__mNestedClassDeclarationToTNestedClass <em>CREATE CORR mNested Class Declaration To TNested Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mNested Class Declaration To TNested Class</em>'.
	 * @see ModiscoTGG.NestedClassInType__Marker#getCREATE__CORR__mNestedClassDeclarationToTNestedClass()
	 * @see #getNestedClassInType__Marker()
	 * @generated
	 */
	EReference getNestedClassInType__Marker_CREATE__CORR__mNestedClassDeclarationToTNestedClass();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.NestedEnum__Marker <em>Nested Enum Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Enum Marker</em>'.
	 * @see ModiscoTGG.NestedEnum__Marker
	 * @generated
	 */
	EClass getNestedEnum__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedEnum__Marker#getCREATE__SRC__eNestedType <em>CREATE SRC eNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC eNested Type</em>'.
	 * @see ModiscoTGG.NestedEnum__Marker#getCREATE__SRC__eNestedType()
	 * @see #getNestedEnum__Marker()
	 * @generated
	 */
	EReference getNestedEnum__Marker_CREATE__SRC__eNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedEnum__Marker#getCONTEXT__SRC__eOuterType <em>CONTEXT SRC eOuter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eOuter Type</em>'.
	 * @see ModiscoTGG.NestedEnum__Marker#getCONTEXT__SRC__eOuterType()
	 * @see #getNestedEnum__Marker()
	 * @generated
	 */
	EReference getNestedEnum__Marker_CONTEXT__SRC__eOuterType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedEnum__Marker#getCREATE__TRG__tAnnotation <em>CREATE TRG tAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAnnotation</em>'.
	 * @see ModiscoTGG.NestedEnum__Marker#getCREATE__TRG__tAnnotation()
	 * @see #getNestedEnum__Marker()
	 * @generated
	 */
	EReference getNestedEnum__Marker_CREATE__TRG__tAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedEnum__Marker#getCREATE__TRG__tNestedPackage <em>CREATE TRG tNested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNested Package</em>'.
	 * @see ModiscoTGG.NestedEnum__Marker#getCREATE__TRG__tNestedPackage()
	 * @see #getNestedEnum__Marker()
	 * @generated
	 */
	EReference getNestedEnum__Marker_CREATE__TRG__tNestedPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedEnum__Marker#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNested Type</em>'.
	 * @see ModiscoTGG.NestedEnum__Marker#getCREATE__TRG__tNestedType()
	 * @see #getNestedEnum__Marker()
	 * @generated
	 */
	EReference getNestedEnum__Marker_CREATE__TRG__tNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedEnum__Marker#getCONTEXT__TRG__tOuterPackage <em>CONTEXT TRG tOuter Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOuter Package</em>'.
	 * @see ModiscoTGG.NestedEnum__Marker#getCONTEXT__TRG__tOuterPackage()
	 * @see #getNestedEnum__Marker()
	 * @generated
	 */
	EReference getNestedEnum__Marker_CONTEXT__TRG__tOuterPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedEnum__Marker#getCONTEXT__TRG__tOuterType <em>CONTEXT TRG tOuter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOuter Type</em>'.
	 * @see ModiscoTGG.NestedEnum__Marker#getCONTEXT__TRG__tOuterType()
	 * @see #getNestedEnum__Marker()
	 * @generated
	 */
	EReference getNestedEnum__Marker_CONTEXT__TRG__tOuterType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedEnum__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.NestedEnum__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getNestedEnum__Marker()
	 * @generated
	 */
	EReference getNestedEnum__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedEnum__Marker#getCREATE__CORR__eNestedTypeToTNestedType <em>CREATE CORR eNested Type To TNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR eNested Type To TNested Type</em>'.
	 * @see ModiscoTGG.NestedEnum__Marker#getCREATE__CORR__eNestedTypeToTNestedType()
	 * @see #getNestedEnum__Marker()
	 * @generated
	 */
	EReference getNestedEnum__Marker_CREATE__CORR__eNestedTypeToTNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedEnum__Marker#getCONTEXT__CORR__eOuterTypeToTOuterInterface <em>CONTEXT CORR eOuter Type To TOuter Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eOuter Type To TOuter Interface</em>'.
	 * @see ModiscoTGG.NestedEnum__Marker#getCONTEXT__CORR__eOuterTypeToTOuterInterface()
	 * @see #getNestedEnum__Marker()
	 * @generated
	 */
	EReference getNestedEnum__Marker_CONTEXT__CORR__eOuterTypeToTOuterInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedEnum__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mBody To TAnnotation</em>'.
	 * @see ModiscoTGG.NestedEnum__Marker#getCREATE__CORR__mBodyToTAnnotation()
	 * @see #getNestedEnum__Marker()
	 * @generated
	 */
	EReference getNestedEnum__Marker_CREATE__CORR__mBodyToTAnnotation();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.NestedInterfaceInType__Marker <em>Nested Interface In Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Interface In Type Marker</em>'.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker
	 * @generated
	 */
	EClass getNestedInterfaceInType__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedInterfaceInType__Marker#getCREATE__SRC__eNestedType <em>CREATE SRC eNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC eNested Type</em>'.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker#getCREATE__SRC__eNestedType()
	 * @see #getNestedInterfaceInType__Marker()
	 * @generated
	 */
	EReference getNestedInterfaceInType__Marker_CREATE__SRC__eNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedInterfaceInType__Marker#getCONTEXT__SRC__eOuterType <em>CONTEXT SRC eOuter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eOuter Type</em>'.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker#getCONTEXT__SRC__eOuterType()
	 * @see #getNestedInterfaceInType__Marker()
	 * @generated
	 */
	EReference getNestedInterfaceInType__Marker_CONTEXT__SRC__eOuterType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedInterfaceInType__Marker#getCREATE__TRG__tNestedPackage <em>CREATE TRG tNested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNested Package</em>'.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker#getCREATE__TRG__tNestedPackage()
	 * @see #getNestedInterfaceInType__Marker()
	 * @generated
	 */
	EReference getNestedInterfaceInType__Marker_CREATE__TRG__tNestedPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedInterfaceInType__Marker#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tNested Type</em>'.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker#getCREATE__TRG__tNestedType()
	 * @see #getNestedInterfaceInType__Marker()
	 * @generated
	 */
	EReference getNestedInterfaceInType__Marker_CREATE__TRG__tNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedInterfaceInType__Marker#getCONTEXT__TRG__tOuterPackage <em>CONTEXT TRG tOuter Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOuter Package</em>'.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker#getCONTEXT__TRG__tOuterPackage()
	 * @see #getNestedInterfaceInType__Marker()
	 * @generated
	 */
	EReference getNestedInterfaceInType__Marker_CONTEXT__TRG__tOuterPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedInterfaceInType__Marker#getCONTEXT__TRG__tOuterType <em>CONTEXT TRG tOuter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tOuter Type</em>'.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker#getCONTEXT__TRG__tOuterType()
	 * @see #getNestedInterfaceInType__Marker()
	 * @generated
	 */
	EReference getNestedInterfaceInType__Marker_CONTEXT__TRG__tOuterType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedInterfaceInType__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getNestedInterfaceInType__Marker()
	 * @generated
	 */
	EReference getNestedInterfaceInType__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedInterfaceInType__Marker#getCREATE__CORR__eNestedTypeToTNestedType <em>CREATE CORR eNested Type To TNested Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR eNested Type To TNested Type</em>'.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker#getCREATE__CORR__eNestedTypeToTNestedType()
	 * @see #getNestedInterfaceInType__Marker()
	 * @generated
	 */
	EReference getNestedInterfaceInType__Marker_CREATE__CORR__eNestedTypeToTNestedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedInterfaceInType__Marker#getCONTEXT__CORR__eOuterTypeToTOuterInterface <em>CONTEXT CORR eOuter Type To TOuter Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eOuter Type To TOuter Interface</em>'.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker#getCONTEXT__CORR__eOuterTypeToTOuterInterface()
	 * @see #getNestedInterfaceInType__Marker()
	 * @generated
	 */
	EReference getNestedInterfaceInType__Marker_CONTEXT__CORR__eOuterTypeToTOuterInterface();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedInterfaceInType__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mBody To TAnnotation</em>'.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker#getCREATE__CORR__mBodyToTAnnotation()
	 * @see #getNestedInterfaceInType__Marker()
	 * @generated
	 */
	EReference getNestedInterfaceInType__Marker_CREATE__CORR__mBodyToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.NestedInterfaceInType__Marker#getCREATE__CORR__mInterfaceDeclarationtoTInterface <em>CREATE CORR mInterface Declarationto TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mInterface Declarationto TInterface</em>'.
	 * @see ModiscoTGG.NestedInterfaceInType__Marker#getCREATE__CORR__mInterfaceDeclarationtoTInterface()
	 * @see #getNestedInterfaceInType__Marker()
	 * @generated
	 */
	EReference getNestedInterfaceInType__Marker_CREATE__CORR__mInterfaceDeclarationtoTInterface();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.OutgoingFlow__Marker <em>Outgoing Flow Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Flow Marker</em>'.
	 * @see ModiscoTGG.OutgoingFlow__Marker
	 * @generated
	 */
	EClass getOutgoingFlow__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__SRC__mFlow <em>CONTEXT SRC mFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mFlow</em>'.
	 * @see ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__SRC__mFlow()
	 * @see #getOutgoingFlow__Marker()
	 * @generated
	 */
	EReference getOutgoingFlow__Marker_CONTEXT__SRC__mFlow();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__SRC__mTarget <em>CONTEXT SRC mTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mTarget</em>'.
	 * @see ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__SRC__mTarget()
	 * @see #getOutgoingFlow__Marker()
	 * @generated
	 */
	EReference getOutgoingFlow__Marker_CONTEXT__SRC__mTarget();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__TRG__tFlow <em>CONTEXT TRG tFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tFlow</em>'.
	 * @see ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__TRG__tFlow()
	 * @see #getOutgoingFlow__Marker()
	 * @generated
	 */
	EReference getOutgoingFlow__Marker_CONTEXT__TRG__tFlow();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__TRG__tTarget <em>CONTEXT TRG tTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tTarget</em>'.
	 * @see ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__TRG__tTarget()
	 * @see #getOutgoingFlow__Marker()
	 * @generated
	 */
	EReference getOutgoingFlow__Marker_CONTEXT__TRG__tTarget();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__CORR__mFlowToTFlow <em>CONTEXT CORR mFlow To TFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mFlow To TFlow</em>'.
	 * @see ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__CORR__mFlowToTFlow()
	 * @see #getOutgoingFlow__Marker()
	 * @generated
	 */
	EReference getOutgoingFlow__Marker_CONTEXT__CORR__mFlowToTFlow();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__CORR__mTargetToTTarget <em>CONTEXT CORR mTarget To TTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mTarget To TTarget</em>'.
	 * @see ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__CORR__mTargetToTTarget()
	 * @see #getOutgoingFlow__Marker()
	 * @generated
	 */
	EReference getOutgoingFlow__Marker_CONTEXT__CORR__mTargetToTTarget();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.PackageToPGPackage__Marker <em>Package To PG Package Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package To PG Package Marker</em>'.
	 * @see ModiscoTGG.PackageToPGPackage__Marker
	 * @generated
	 */
	EClass getPackageToPGPackage__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PackageToPGPackage__Marker#getCONTEXT__SRC__mModel <em>CONTEXT SRC mModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mModel</em>'.
	 * @see ModiscoTGG.PackageToPGPackage__Marker#getCONTEXT__SRC__mModel()
	 * @see #getPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getPackageToPGPackage__Marker_CONTEXT__SRC__mModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PackageToPGPackage__Marker#getCREATE__SRC__mPackage <em>CREATE SRC mPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mPackage</em>'.
	 * @see ModiscoTGG.PackageToPGPackage__Marker#getCREATE__SRC__mPackage()
	 * @see #getPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getPackageToPGPackage__Marker_CREATE__SRC__mPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PackageToPGPackage__Marker#getCREATE__TRG__tPackage <em>CREATE TRG tPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tPackage</em>'.
	 * @see ModiscoTGG.PackageToPGPackage__Marker#getCREATE__TRG__tPackage()
	 * @see #getPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getPackageToPGPackage__Marker_CREATE__TRG__tPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PackageToPGPackage__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.PackageToPGPackage__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getPackageToPGPackage__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PackageToPGPackage__Marker#getCONTEXT__CORR__mModelToTypeGraph <em>CONTEXT CORR mModel To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mModel To Type Graph</em>'.
	 * @see ModiscoTGG.PackageToPGPackage__Marker#getCONTEXT__CORR__mModelToTypeGraph()
	 * @see #getPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getPackageToPGPackage__Marker_CONTEXT__CORR__mModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PackageToPGPackage__Marker#getCREATE__CORR__mPackageToTPackage <em>CREATE CORR mPackage To TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mPackage To TPackage</em>'.
	 * @see ModiscoTGG.PackageToPGPackage__Marker#getCREATE__CORR__mPackageToTPackage()
	 * @see #getPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getPackageToPGPackage__Marker_CREATE__CORR__mPackageToTPackage();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ParameterizedTypeToClass__Marker <em>Parameterized Type To Class Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Type To Class Marker</em>'.
	 * @see ModiscoTGG.ParameterizedTypeToClass__Marker
	 * @generated
	 */
	EClass getParameterizedTypeToClass__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__SRC__eModel()
	 * @see #getParameterizedTypeToClass__Marker()
	 * @generated
	 */
	EReference getParameterizedTypeToClass__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCREATE__SRC__eParameterizedType <em>CREATE SRC eParameterized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC eParameterized Type</em>'.
	 * @see ModiscoTGG.ParameterizedTypeToClass__Marker#getCREATE__SRC__eParameterizedType()
	 * @see #getParameterizedTypeToClass__Marker()
	 * @generated
	 */
	EReference getParameterizedTypeToClass__Marker_CREATE__SRC__eParameterizedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__SRC__eType <em>CONTEXT SRC eType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eType</em>'.
	 * @see ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__SRC__eType()
	 * @see #getParameterizedTypeToClass__Marker()
	 * @generated
	 */
	EReference getParameterizedTypeToClass__Marker_CONTEXT__SRC__eType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC eType Access</em>'.
	 * @see ModiscoTGG.ParameterizedTypeToClass__Marker#getCREATE__SRC__eTypeAccess()
	 * @see #getParameterizedTypeToClass__Marker()
	 * @generated
	 */
	EReference getParameterizedTypeToClass__Marker_CREATE__SRC__eTypeAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__TRG__pg()
	 * @see #getParameterizedTypeToClass__Marker()
	 * @generated
	 */
	EReference getParameterizedTypeToClass__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__TRG__tAbstractType <em>CONTEXT TRG tAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAbstract Type</em>'.
	 * @see ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__TRG__tAbstractType()
	 * @see #getParameterizedTypeToClass__Marker()
	 * @generated
	 */
	EReference getParameterizedTypeToClass__Marker_CONTEXT__TRG__tAbstractType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__CORR__eModelToPg <em>CONTEXT CORR eModel To Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Pg</em>'.
	 * @see ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__CORR__eModelToPg()
	 * @see #getParameterizedTypeToClass__Marker()
	 * @generated
	 */
	EReference getParameterizedTypeToClass__Marker_CONTEXT__CORR__eModelToPg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCREATE__CORR__eParameterizedTypeToTAbstractType <em>CREATE CORR eParameterized Type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR eParameterized Type To TAbstract Type</em>'.
	 * @see ModiscoTGG.ParameterizedTypeToClass__Marker#getCREATE__CORR__eParameterizedTypeToTAbstractType()
	 * @see #getParameterizedTypeToClass__Marker()
	 * @generated
	 */
	EReference getParameterizedTypeToClass__Marker_CREATE__CORR__eParameterizedTypeToTAbstractType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__CORR__eTypeToTAbstractType <em>CONTEXT CORR eType To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eType To TAbstract Type</em>'.
	 * @see ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__CORR__eTypeToTAbstractType()
	 * @see #getParameterizedTypeToClass__Marker()
	 * @generated
	 */
	EReference getParameterizedTypeToClass__Marker_CONTEXT__CORR__eTypeToTAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.PrimitiveTypeIsBoolean__Marker <em>Primitive Type Is Boolean Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Is Boolean Marker</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsBoolean__Marker
	 * @generated
	 */
	EClass getPrimitiveTypeIsBoolean__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCONTEXT__SRC__eModel()
	 * @see #getPrimitiveTypeIsBoolean__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsBoolean__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCREATE__SRC__ePrimitiveType <em>CREATE SRC ePrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC ePrimitive Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCREATE__SRC__ePrimitiveType()
	 * @see #getPrimitiveTypeIsBoolean__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsBoolean__Marker_CREATE__SRC__ePrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCREATE__TRG__tPrimitiveClass <em>CREATE TRG tPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCREATE__TRG__tPrimitiveClass()
	 * @see #getPrimitiveTypeIsBoolean__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsBoolean__Marker_CREATE__TRG__tPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getPrimitiveTypeIsBoolean__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsBoolean__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCONTEXT__CORR__eModelToTypeGraph()
	 * @see #getPrimitiveTypeIsBoolean__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsBoolean__Marker_CONTEXT__CORR__eModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR ePrimitive Type To TPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass()
	 * @see #getPrimitiveTypeIsBoolean__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsBoolean__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCREATE__CORR__typeToTAbstractType <em>CREATE CORR type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR type To TAbstract Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsBoolean__Marker#getCREATE__CORR__typeToTAbstractType()
	 * @see #getPrimitiveTypeIsBoolean__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsBoolean__Marker_CREATE__CORR__typeToTAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.PrimitiveTypeIsByte__Marker <em>Primitive Type Is Byte Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Is Byte Marker</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsByte__Marker
	 * @generated
	 */
	EClass getPrimitiveTypeIsByte__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsByte__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsByte__Marker#getCONTEXT__SRC__eModel()
	 * @see #getPrimitiveTypeIsByte__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsByte__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsByte__Marker#getCREATE__SRC__ePrimitiveType <em>CREATE SRC ePrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC ePrimitive Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsByte__Marker#getCREATE__SRC__ePrimitiveType()
	 * @see #getPrimitiveTypeIsByte__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsByte__Marker_CREATE__SRC__ePrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsByte__Marker#getCREATE__TRG__tPrimitiveClass <em>CREATE TRG tPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsByte__Marker#getCREATE__TRG__tPrimitiveClass()
	 * @see #getPrimitiveTypeIsByte__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsByte__Marker_CREATE__TRG__tPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsByte__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsByte__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getPrimitiveTypeIsByte__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsByte__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsByte__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsByte__Marker#getCONTEXT__CORR__eModelToTypeGraph()
	 * @see #getPrimitiveTypeIsByte__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsByte__Marker_CONTEXT__CORR__eModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsByte__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR ePrimitive Type To TPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsByte__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass()
	 * @see #getPrimitiveTypeIsByte__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsByte__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsByte__Marker#getCREATE__CORR__typeToTAbstractType <em>CREATE CORR type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR type To TAbstract Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsByte__Marker#getCREATE__CORR__typeToTAbstractType()
	 * @see #getPrimitiveTypeIsByte__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsByte__Marker_CREATE__CORR__typeToTAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.PrimitiveTypeIsChar__Marker <em>Primitive Type Is Char Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Is Char Marker</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsChar__Marker
	 * @generated
	 */
	EClass getPrimitiveTypeIsChar__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsChar__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsChar__Marker#getCONTEXT__SRC__eModel()
	 * @see #getPrimitiveTypeIsChar__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsChar__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsChar__Marker#getCREATE__SRC__ePrimitiveType <em>CREATE SRC ePrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC ePrimitive Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsChar__Marker#getCREATE__SRC__ePrimitiveType()
	 * @see #getPrimitiveTypeIsChar__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsChar__Marker_CREATE__SRC__ePrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsChar__Marker#getCREATE__TRG__tPrimitiveClass <em>CREATE TRG tPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsChar__Marker#getCREATE__TRG__tPrimitiveClass()
	 * @see #getPrimitiveTypeIsChar__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsChar__Marker_CREATE__TRG__tPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsChar__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsChar__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getPrimitiveTypeIsChar__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsChar__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsChar__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsChar__Marker#getCONTEXT__CORR__eModelToTypeGraph()
	 * @see #getPrimitiveTypeIsChar__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsChar__Marker_CONTEXT__CORR__eModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsChar__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR ePrimitive Type To TPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsChar__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass()
	 * @see #getPrimitiveTypeIsChar__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsChar__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsChar__Marker#getCREATE__CORR__typeToTAbstractType <em>CREATE CORR type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR type To TAbstract Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsChar__Marker#getCREATE__CORR__typeToTAbstractType()
	 * @see #getPrimitiveTypeIsChar__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsChar__Marker_CREATE__CORR__typeToTAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.PrimitiveTypeIsDouble__Marker <em>Primitive Type Is Double Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Is Double Marker</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsDouble__Marker
	 * @generated
	 */
	EClass getPrimitiveTypeIsDouble__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCONTEXT__SRC__eModel()
	 * @see #getPrimitiveTypeIsDouble__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsDouble__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCREATE__SRC__ePrimitiveType <em>CREATE SRC ePrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC ePrimitive Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCREATE__SRC__ePrimitiveType()
	 * @see #getPrimitiveTypeIsDouble__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsDouble__Marker_CREATE__SRC__ePrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCREATE__TRG__tPrimitiveClass <em>CREATE TRG tPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCREATE__TRG__tPrimitiveClass()
	 * @see #getPrimitiveTypeIsDouble__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsDouble__Marker_CREATE__TRG__tPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getPrimitiveTypeIsDouble__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsDouble__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCONTEXT__CORR__eModelToTypeGraph()
	 * @see #getPrimitiveTypeIsDouble__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsDouble__Marker_CONTEXT__CORR__eModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR ePrimitive Type To TPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass()
	 * @see #getPrimitiveTypeIsDouble__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsDouble__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCREATE__CORR__typeToTAbstractType <em>CREATE CORR type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR type To TAbstract Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsDouble__Marker#getCREATE__CORR__typeToTAbstractType()
	 * @see #getPrimitiveTypeIsDouble__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsDouble__Marker_CREATE__CORR__typeToTAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker <em>Primitive Type Is Float Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Is Float Marker</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsFloat__Marker
	 * @generated
	 */
	EClass getPrimitiveTypeIsFloat__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCONTEXT__SRC__eModel()
	 * @see #getPrimitiveTypeIsFloat__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsFloat__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__SRC__ePrimitiveType <em>CREATE SRC ePrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC ePrimitive Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__SRC__ePrimitiveType()
	 * @see #getPrimitiveTypeIsFloat__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsFloat__Marker_CREATE__SRC__ePrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__TRG__tPrimitiveClass <em>CREATE TRG tPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__TRG__tPrimitiveClass()
	 * @see #getPrimitiveTypeIsFloat__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsFloat__Marker_CREATE__TRG__tPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getPrimitiveTypeIsFloat__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsFloat__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCONTEXT__CORR__eModelToTypeGraph()
	 * @see #getPrimitiveTypeIsFloat__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsFloat__Marker_CONTEXT__CORR__eModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR ePrimitive Type To TPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass()
	 * @see #getPrimitiveTypeIsFloat__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsFloat__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__CORR__typeToTAbstractType <em>CREATE CORR type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR type To TAbstract Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__CORR__typeToTAbstractType()
	 * @see #getPrimitiveTypeIsFloat__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsFloat__Marker_CREATE__CORR__typeToTAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.PrimitiveTypeIsInt__Marker <em>Primitive Type Is Int Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Is Int Marker</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsInt__Marker
	 * @generated
	 */
	EClass getPrimitiveTypeIsInt__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsInt__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsInt__Marker#getCONTEXT__SRC__eModel()
	 * @see #getPrimitiveTypeIsInt__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsInt__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsInt__Marker#getCREATE__SRC__ePrimitiveType <em>CREATE SRC ePrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC ePrimitive Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsInt__Marker#getCREATE__SRC__ePrimitiveType()
	 * @see #getPrimitiveTypeIsInt__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsInt__Marker_CREATE__SRC__ePrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsInt__Marker#getCREATE__TRG__tPrimitiveClass <em>CREATE TRG tPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsInt__Marker#getCREATE__TRG__tPrimitiveClass()
	 * @see #getPrimitiveTypeIsInt__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsInt__Marker_CREATE__TRG__tPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsInt__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsInt__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getPrimitiveTypeIsInt__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsInt__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsInt__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsInt__Marker#getCONTEXT__CORR__eModelToTypeGraph()
	 * @see #getPrimitiveTypeIsInt__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsInt__Marker_CONTEXT__CORR__eModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsInt__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR ePrimitive Type To TPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsInt__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass()
	 * @see #getPrimitiveTypeIsInt__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsInt__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsInt__Marker#getCREATE__CORR__typeToTAbstractType <em>CREATE CORR type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR type To TAbstract Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsInt__Marker#getCREATE__CORR__typeToTAbstractType()
	 * @see #getPrimitiveTypeIsInt__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsInt__Marker_CREATE__CORR__typeToTAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.PrimitiveTypeIsLong__Marker <em>Primitive Type Is Long Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Is Long Marker</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsLong__Marker
	 * @generated
	 */
	EClass getPrimitiveTypeIsLong__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsLong__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsLong__Marker#getCONTEXT__SRC__eModel()
	 * @see #getPrimitiveTypeIsLong__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsLong__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsLong__Marker#getCREATE__SRC__ePrimitiveType <em>CREATE SRC ePrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC ePrimitive Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsLong__Marker#getCREATE__SRC__ePrimitiveType()
	 * @see #getPrimitiveTypeIsLong__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsLong__Marker_CREATE__SRC__ePrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsLong__Marker#getCREATE__TRG__tPrimitiveClass <em>CREATE TRG tPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsLong__Marker#getCREATE__TRG__tPrimitiveClass()
	 * @see #getPrimitiveTypeIsLong__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsLong__Marker_CREATE__TRG__tPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsLong__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsLong__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getPrimitiveTypeIsLong__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsLong__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsLong__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsLong__Marker#getCONTEXT__CORR__eModelToTypeGraph()
	 * @see #getPrimitiveTypeIsLong__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsLong__Marker_CONTEXT__CORR__eModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsLong__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR ePrimitive Type To TPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsLong__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass()
	 * @see #getPrimitiveTypeIsLong__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsLong__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsLong__Marker#getCREATE__CORR__typeToTAbstractType <em>CREATE CORR type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR type To TAbstract Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsLong__Marker#getCREATE__CORR__typeToTAbstractType()
	 * @see #getPrimitiveTypeIsLong__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsLong__Marker_CREATE__CORR__typeToTAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.PrimitiveTypeIsShort__Marker <em>Primitive Type Is Short Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Is Short Marker</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsShort__Marker
	 * @generated
	 */
	EClass getPrimitiveTypeIsShort__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsShort__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsShort__Marker#getCONTEXT__SRC__eModel()
	 * @see #getPrimitiveTypeIsShort__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsShort__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsShort__Marker#getCREATE__SRC__ePrimitiveType <em>CREATE SRC ePrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC ePrimitive Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsShort__Marker#getCREATE__SRC__ePrimitiveType()
	 * @see #getPrimitiveTypeIsShort__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsShort__Marker_CREATE__SRC__ePrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsShort__Marker#getCREATE__TRG__tPrimitiveClass <em>CREATE TRG tPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsShort__Marker#getCREATE__TRG__tPrimitiveClass()
	 * @see #getPrimitiveTypeIsShort__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsShort__Marker_CREATE__TRG__tPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsShort__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsShort__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getPrimitiveTypeIsShort__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsShort__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsShort__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsShort__Marker#getCONTEXT__CORR__eModelToTypeGraph()
	 * @see #getPrimitiveTypeIsShort__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsShort__Marker_CONTEXT__CORR__eModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsShort__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR ePrimitive Type To TPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsShort__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass()
	 * @see #getPrimitiveTypeIsShort__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsShort__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypeIsShort__Marker#getCREATE__CORR__typeToTAbstractType <em>CREATE CORR type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR type To TAbstract Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypeIsShort__Marker#getCREATE__CORR__typeToTAbstractType()
	 * @see #getPrimitiveTypeIsShort__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypeIsShort__Marker_CREATE__CORR__typeToTAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.PrimitiveTypesIsVoid__Marker <em>Primitive Types Is Void Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Types Is Void Marker</em>'.
	 * @see ModiscoTGG.PrimitiveTypesIsVoid__Marker
	 * @generated
	 */
	EClass getPrimitiveTypesIsVoid__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCONTEXT__SRC__eModel()
	 * @see #getPrimitiveTypesIsVoid__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypesIsVoid__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCREATE__SRC__ePrimitiveType <em>CREATE SRC ePrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC ePrimitive Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCREATE__SRC__ePrimitiveType()
	 * @see #getPrimitiveTypesIsVoid__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypesIsVoid__Marker_CREATE__SRC__ePrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCREATE__TRG__tPrimitiveClass <em>CREATE TRG tPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCREATE__TRG__tPrimitiveClass()
	 * @see #getPrimitiveTypesIsVoid__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypesIsVoid__Marker_CREATE__TRG__tPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getPrimitiveTypesIsVoid__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypesIsVoid__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Type Graph</em>'.
	 * @see ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCONTEXT__CORR__eModelToTypeGraph()
	 * @see #getPrimitiveTypesIsVoid__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypesIsVoid__Marker_CONTEXT__CORR__eModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR ePrimitive Type To TPrimitive Class</em>'.
	 * @see ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass()
	 * @see #getPrimitiveTypesIsVoid__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypesIsVoid__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCREATE__CORR__typeToTAbstractType <em>CREATE CORR type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR type To TAbstract Type</em>'.
	 * @see ModiscoTGG.PrimitiveTypesIsVoid__Marker#getCREATE__CORR__typeToTAbstractType()
	 * @see #getPrimitiveTypesIsVoid__Marker()
	 * @generated
	 */
	EReference getPrimitiveTypesIsVoid__Marker_CREATE__CORR__typeToTAbstractType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.ReturnType__Marker <em>Return Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type Marker</em>'.
	 * @see ModiscoTGG.ReturnType__Marker
	 * @generated
	 */
	EClass getReturnType__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__SRC__eReturnType <em>CONTEXT SRC eReturn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eReturn Type</em>'.
	 * @see ModiscoTGG.ReturnType__Marker#getCONTEXT__SRC__eReturnType()
	 * @see #getReturnType__Marker()
	 * @generated
	 */
	EReference getReturnType__Marker_CONTEXT__SRC__eReturnType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ReturnType__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC eType Access</em>'.
	 * @see ModiscoTGG.ReturnType__Marker#getCREATE__SRC__eTypeAccess()
	 * @see #getReturnType__Marker()
	 * @generated
	 */
	EReference getReturnType__Marker_CREATE__SRC__eTypeAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mDefinition</em>'.
	 * @see ModiscoTGG.ReturnType__Marker#getCONTEXT__SRC__mDefinition()
	 * @see #getReturnType__Marker()
	 * @generated
	 */
	EReference getReturnType__Marker_CONTEXT__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__TRG__tAbstractType <em>CONTEXT TRG tAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tAbstract Type</em>'.
	 * @see ModiscoTGG.ReturnType__Marker#getCONTEXT__TRG__tAbstractType()
	 * @see #getReturnType__Marker()
	 * @generated
	 */
	EReference getReturnType__Marker_CONTEXT__TRG__tAbstractType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__TRG__tMethodDefinition <em>CONTEXT TRG tMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMethod Definition</em>'.
	 * @see ModiscoTGG.ReturnType__Marker#getCONTEXT__TRG__tMethodDefinition()
	 * @see #getReturnType__Marker()
	 * @generated
	 */
	EReference getReturnType__Marker_CONTEXT__TRG__tMethodDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__CORR__eReturnTypeToTAbstractType <em>CONTEXT CORR eReturn Type To TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eReturn Type To TAbstract Type</em>'.
	 * @see ModiscoTGG.ReturnType__Marker#getCONTEXT__CORR__eReturnTypeToTAbstractType()
	 * @see #getReturnType__Marker()
	 * @generated
	 */
	EReference getReturnType__Marker_CONTEXT__CORR__eReturnTypeToTAbstractType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__CORR__mMethodDefinitionToTMethodDefinition <em>CONTEXT CORR mMethod Definition To TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMethod Definition To TMethod Definition</em>'.
	 * @see ModiscoTGG.ReturnType__Marker#getCONTEXT__CORR__mMethodDefinitionToTMethodDefinition()
	 * @see #getReturnType__Marker()
	 * @generated
	 */
	EReference getReturnType__Marker_CONTEXT__CORR__mMethodDefinitionToTMethodDefinition();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.SignatureReturnType__Marker <em>Signature Return Type Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Return Type Marker</em>'.
	 * @see ModiscoTGG.SignatureReturnType__Marker
	 * @generated
	 */
	EClass getSignatureReturnType__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mSignature</em>'.
	 * @see ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__SRC__mSignature()
	 * @see #getSignatureReturnType__Marker()
	 * @generated
	 */
	EReference getSignatureReturnType__Marker_CONTEXT__SRC__mSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mType</em>'.
	 * @see ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__SRC__mType()
	 * @see #getSignatureReturnType__Marker()
	 * @generated
	 */
	EReference getSignatureReturnType__Marker_CONTEXT__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__TRG__tSignature <em>CONTEXT TRG tSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tSignature</em>'.
	 * @see ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__TRG__tSignature()
	 * @see #getSignatureReturnType__Marker()
	 * @generated
	 */
	EReference getSignatureReturnType__Marker_CONTEXT__TRG__tSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tType</em>'.
	 * @see ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__TRG__tType()
	 * @see #getSignatureReturnType__Marker()
	 * @generated
	 */
	EReference getSignatureReturnType__Marker_CONTEXT__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mSignature To TSignature</em>'.
	 * @see ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__CORR__mSignatureToTSignature()
	 * @see #getSignatureReturnType__Marker()
	 * @generated
	 */
	EReference getSignatureReturnType__Marker_CONTEXT__CORR__mSignatureToTSignature();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getSignatureReturnType__Marker()
	 * @generated
	 */
	EReference getSignatureReturnType__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.SubPackageToPGPackage__Marker <em>Sub Package To PG Package Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Package To PG Package Marker</em>'.
	 * @see ModiscoTGG.SubPackageToPGPackage__Marker
	 * @generated
	 */
	EClass getSubPackageToPGPackage__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCREATE__SRC__mPackage <em>CREATE SRC mPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mPackage</em>'.
	 * @see ModiscoTGG.SubPackageToPGPackage__Marker#getCREATE__SRC__mPackage()
	 * @see #getSubPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getSubPackageToPGPackage__Marker_CREATE__SRC__mPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__SRC__mParentPackage <em>CONTEXT SRC mParent Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mParent Package</em>'.
	 * @see ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__SRC__mParentPackage()
	 * @see #getSubPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getSubPackageToPGPackage__Marker_CONTEXT__SRC__mParentPackage();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__TRG__tParent <em>CONTEXT TRG tParent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tParent</em>'.
	 * @see ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__TRG__tParent()
	 * @see #getSubPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getSubPackageToPGPackage__Marker_CONTEXT__TRG__tParent();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCREATE__TRG__tSub <em>CREATE TRG tSub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tSub</em>'.
	 * @see ModiscoTGG.SubPackageToPGPackage__Marker#getCREATE__TRG__tSub()
	 * @see #getSubPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getSubPackageToPGPackage__Marker_CREATE__TRG__tSub();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG type Graph</em>'.
	 * @see ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__TRG__typeGraph()
	 * @see #getSubPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getSubPackageToPGPackage__Marker_CONTEXT__TRG__typeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCREATE__CORR__mPackageToTSub <em>CREATE CORR mPackage To TSub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mPackage To TSub</em>'.
	 * @see ModiscoTGG.SubPackageToPGPackage__Marker#getCREATE__CORR__mPackageToTSub()
	 * @see #getSubPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getSubPackageToPGPackage__Marker_CREATE__CORR__mPackageToTSub();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__CORR__mParentPackageToTParent <em>CONTEXT CORR mParent Package To TParent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mParent Package To TParent</em>'.
	 * @see ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__CORR__mParentPackageToTParent()
	 * @see #getSubPackageToPGPackage__Marker()
	 * @generated
	 */
	EReference getSubPackageToPGPackage__Marker_CONTEXT__CORR__mParentPackageToTParent();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.SuperConstructorInvocation__Marker <em>Super Constructor Invocation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Constructor Invocation Marker</em>'.
	 * @see ModiscoTGG.SuperConstructorInvocation__Marker
	 * @generated
	 */
	EClass getSuperConstructorInvocation__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperConstructorInvocation__Marker#getCREATE__SRC__invocation <em>CREATE SRC invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC invocation</em>'.
	 * @see ModiscoTGG.SuperConstructorInvocation__Marker#getCREATE__SRC__invocation()
	 * @see #getSuperConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getSuperConstructorInvocation__Marker_CREATE__SRC__invocation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperConstructorInvocation__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMember</em>'.
	 * @see ModiscoTGG.SuperConstructorInvocation__Marker#getCONTEXT__SRC__mMember()
	 * @see #getSuperConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getSuperConstructorInvocation__Marker_CONTEXT__SRC__mMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperConstructorInvocation__Marker#getCONTEXT__SRC__mMethod <em>CONTEXT SRC mMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMethod</em>'.
	 * @see ModiscoTGG.SuperConstructorInvocation__Marker#getCONTEXT__SRC__mMethod()
	 * @see #getSuperConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getSuperConstructorInvocation__Marker_CONTEXT__SRC__mMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperConstructorInvocation__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAccess</em>'.
	 * @see ModiscoTGG.SuperConstructorInvocation__Marker#getCREATE__TRG__tAccess()
	 * @see #getSuperConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getSuperConstructorInvocation__Marker_CREATE__TRG__tAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperConstructorInvocation__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.SuperConstructorInvocation__Marker#getCONTEXT__TRG__tMember()
	 * @see #getSuperConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getSuperConstructorInvocation__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperConstructorInvocation__Marker#getCONTEXT__TRG__tMethod <em>CONTEXT TRG tMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMethod</em>'.
	 * @see ModiscoTGG.SuperConstructorInvocation__Marker#getCONTEXT__TRG__tMethod()
	 * @see #getSuperConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getSuperConstructorInvocation__Marker_CONTEXT__TRG__tMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperConstructorInvocation__Marker#getCREATE__CORR__invocationToTAccess <em>CREATE CORR invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR invocation To TAccess</em>'.
	 * @see ModiscoTGG.SuperConstructorInvocation__Marker#getCREATE__CORR__invocationToTAccess()
	 * @see #getSuperConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getSuperConstructorInvocation__Marker_CREATE__CORR__invocationToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperConstructorInvocation__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Element To TFlow Element</em>'.
	 * @see ModiscoTGG.SuperConstructorInvocation__Marker#getCREATE__CORR__mFlowElementToTFlowElement()
	 * @see #getSuperConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getSuperConstructorInvocation__Marker_CREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperConstructorInvocation__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMember To TMember</em>'.
	 * @see ModiscoTGG.SuperConstructorInvocation__Marker#getCONTEXT__CORR__mMemberToTMember()
	 * @see #getSuperConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getSuperConstructorInvocation__Marker_CONTEXT__CORR__mMemberToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperConstructorInvocation__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMethod To TMethod</em>'.
	 * @see ModiscoTGG.SuperConstructorInvocation__Marker#getCONTEXT__CORR__mMethodToTMethod()
	 * @see #getSuperConstructorInvocation__Marker()
	 * @generated
	 */
	EReference getSuperConstructorInvocation__Marker_CONTEXT__CORR__mMethodToTMethod();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.SuperMethodInvocation__Marker <em>Super Method Invocation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Method Invocation Marker</em>'.
	 * @see ModiscoTGG.SuperMethodInvocation__Marker
	 * @generated
	 */
	EClass getSuperMethodInvocation__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperMethodInvocation__Marker#getCREATE__SRC__invocation <em>CREATE SRC invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC invocation</em>'.
	 * @see ModiscoTGG.SuperMethodInvocation__Marker#getCREATE__SRC__invocation()
	 * @see #getSuperMethodInvocation__Marker()
	 * @generated
	 */
	EReference getSuperMethodInvocation__Marker_CREATE__SRC__invocation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperMethodInvocation__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMember</em>'.
	 * @see ModiscoTGG.SuperMethodInvocation__Marker#getCONTEXT__SRC__mMember()
	 * @see #getSuperMethodInvocation__Marker()
	 * @generated
	 */
	EReference getSuperMethodInvocation__Marker_CONTEXT__SRC__mMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperMethodInvocation__Marker#getCONTEXT__SRC__mMethod <em>CONTEXT SRC mMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMethod</em>'.
	 * @see ModiscoTGG.SuperMethodInvocation__Marker#getCONTEXT__SRC__mMethod()
	 * @see #getSuperMethodInvocation__Marker()
	 * @generated
	 */
	EReference getSuperMethodInvocation__Marker_CONTEXT__SRC__mMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperMethodInvocation__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tAccess</em>'.
	 * @see ModiscoTGG.SuperMethodInvocation__Marker#getCREATE__TRG__tAccess()
	 * @see #getSuperMethodInvocation__Marker()
	 * @generated
	 */
	EReference getSuperMethodInvocation__Marker_CREATE__TRG__tAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperMethodInvocation__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.SuperMethodInvocation__Marker#getCONTEXT__TRG__tMember()
	 * @see #getSuperMethodInvocation__Marker()
	 * @generated
	 */
	EReference getSuperMethodInvocation__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperMethodInvocation__Marker#getCONTEXT__TRG__tMethod <em>CONTEXT TRG tMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMethod</em>'.
	 * @see ModiscoTGG.SuperMethodInvocation__Marker#getCONTEXT__TRG__tMethod()
	 * @see #getSuperMethodInvocation__Marker()
	 * @generated
	 */
	EReference getSuperMethodInvocation__Marker_CONTEXT__TRG__tMethod();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperMethodInvocation__Marker#getCREATE__CORR__invocationToTAccess <em>CREATE CORR invocation To TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR invocation To TAccess</em>'.
	 * @see ModiscoTGG.SuperMethodInvocation__Marker#getCREATE__CORR__invocationToTAccess()
	 * @see #getSuperMethodInvocation__Marker()
	 * @generated
	 */
	EReference getSuperMethodInvocation__Marker_CREATE__CORR__invocationToTAccess();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperMethodInvocation__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mFlow Element To TFlow Element</em>'.
	 * @see ModiscoTGG.SuperMethodInvocation__Marker#getCREATE__CORR__mFlowElementToTFlowElement()
	 * @see #getSuperMethodInvocation__Marker()
	 * @generated
	 */
	EReference getSuperMethodInvocation__Marker_CREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperMethodInvocation__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMember To TMember</em>'.
	 * @see ModiscoTGG.SuperMethodInvocation__Marker#getCONTEXT__CORR__mMemberToTMember()
	 * @see #getSuperMethodInvocation__Marker()
	 * @generated
	 */
	EReference getSuperMethodInvocation__Marker_CONTEXT__CORR__mMemberToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SuperMethodInvocation__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMethod To TMethod</em>'.
	 * @see ModiscoTGG.SuperMethodInvocation__Marker#getCONTEXT__CORR__mMethodToTMethod()
	 * @see #getSuperMethodInvocation__Marker()
	 * @generated
	 */
	EReference getSuperMethodInvocation__Marker_CONTEXT__CORR__mMethodToTMethod();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.SyntethicMethod__Marker <em>Syntethic Method Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syntethic Method Marker</em>'.
	 * @see ModiscoTGG.SyntethicMethod__Marker
	 * @generated
	 */
	EClass getSyntethicMethod__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__SRC__mClass <em>CONTEXT SRC mClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mClass</em>'.
	 * @see ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__SRC__mClass()
	 * @see #getSyntethicMethod__Marker()
	 * @generated
	 */
	EReference getSyntethicMethod__Marker_CONTEXT__SRC__mClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__SRC__mDef <em>CONTEXT SRC mDef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mDef</em>'.
	 * @see ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__SRC__mDef()
	 * @see #getSyntethicMethod__Marker()
	 * @generated
	 */
	EReference getSyntethicMethod__Marker_CONTEXT__SRC__mDef();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SyntethicMethod__Marker#getCREATE__SRC__mSyntethic <em>CREATE SRC mSyntethic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mSyntethic</em>'.
	 * @see ModiscoTGG.SyntethicMethod__Marker#getCREATE__SRC__mSyntethic()
	 * @see #getSyntethicMethod__Marker()
	 * @generated
	 */
	EReference getSyntethicMethod__Marker_CREATE__SRC__mSyntethic();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tClass</em>'.
	 * @see ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__TRG__tClass()
	 * @see #getSyntethicMethod__Marker()
	 * @generated
	 */
	EReference getSyntethicMethod__Marker_CONTEXT__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__TRG__tDef <em>CONTEXT TRG tDef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tDef</em>'.
	 * @see ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__TRG__tDef()
	 * @see #getSyntethicMethod__Marker()
	 * @generated
	 */
	EReference getSyntethicMethod__Marker_CONTEXT__TRG__tDef();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__TRG__tSig <em>CONTEXT TRG tSig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tSig</em>'.
	 * @see ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__TRG__tSig()
	 * @see #getSyntethicMethod__Marker()
	 * @generated
	 */
	EReference getSyntethicMethod__Marker_CONTEXT__TRG__tSig();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SyntethicMethod__Marker#getCREATE__TRG__tSyntethic <em>CREATE TRG tSyntethic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tSyntethic</em>'.
	 * @see ModiscoTGG.SyntethicMethod__Marker#getCREATE__TRG__tSyntethic()
	 * @see #getSyntethicMethod__Marker()
	 * @generated
	 */
	EReference getSyntethicMethod__Marker_CREATE__TRG__tSyntethic();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__CORR__mClassDeclarationToTClass <em>CONTEXT CORR mClass Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mClass Declaration To TClass</em>'.
	 * @see ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__CORR__mClassDeclarationToTClass()
	 * @see #getSyntethicMethod__Marker()
	 * @generated
	 */
	EReference getSyntethicMethod__Marker_CONTEXT__CORR__mClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__CORR__mDefinitionToTMember <em>CONTEXT CORR mDefinition To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mDefinition To TMember</em>'.
	 * @see ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__CORR__mDefinitionToTMember()
	 * @see #getSyntethicMethod__Marker()
	 * @generated
	 */
	EReference getSyntethicMethod__Marker_CONTEXT__CORR__mDefinitionToTMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.SyntethicMethod__Marker#getCREATE__CORR__mSyntToTSynt <em>CREATE CORR mSynt To TSynt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mSynt To TSynt</em>'.
	 * @see ModiscoTGG.SyntethicMethod__Marker#getCREATE__CORR__mSyntToTSynt()
	 * @see #getSyntethicMethod__Marker()
	 * @generated
	 */
	EReference getSyntethicMethod__Marker_CREATE__CORR__mSyntToTSynt();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.TextAnnotations__Marker <em>Text Annotations Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Annotations Marker</em>'.
	 * @see ModiscoTGG.TextAnnotations__Marker
	 * @generated
	 */
	EClass getTextAnnotations__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TextAnnotations__Marker#getCREATE__SRC__mComment <em>CREATE SRC mComment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mComment</em>'.
	 * @see ModiscoTGG.TextAnnotations__Marker#getCREATE__SRC__mComment()
	 * @see #getTextAnnotations__Marker()
	 * @generated
	 */
	EReference getTextAnnotations__Marker_CREATE__SRC__mComment();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TextAnnotations__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mMember</em>'.
	 * @see ModiscoTGG.TextAnnotations__Marker#getCONTEXT__SRC__mMember()
	 * @see #getTextAnnotations__Marker()
	 * @generated
	 */
	EReference getTextAnnotations__Marker_CONTEXT__SRC__mMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TextAnnotations__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tMember</em>'.
	 * @see ModiscoTGG.TextAnnotations__Marker#getCONTEXT__TRG__tMember()
	 * @see #getTextAnnotations__Marker()
	 * @generated
	 */
	EReference getTextAnnotations__Marker_CONTEXT__TRG__tMember();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TextAnnotations__Marker#getCREATE__TRG__tText <em>CREATE TRG tText</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tText</em>'.
	 * @see ModiscoTGG.TextAnnotations__Marker#getCREATE__TRG__tText()
	 * @see #getTextAnnotations__Marker()
	 * @generated
	 */
	EReference getTextAnnotations__Marker_CREATE__TRG__tText();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TextAnnotations__Marker#getCREATE__CORR__mCommentToTText <em>CREATE CORR mComment To TText</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mComment To TText</em>'.
	 * @see ModiscoTGG.TextAnnotations__Marker#getCREATE__CORR__mCommentToTText()
	 * @see #getTextAnnotations__Marker()
	 * @generated
	 */
	EReference getTextAnnotations__Marker_CREATE__CORR__mCommentToTText();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TextAnnotations__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mMember To TMember</em>'.
	 * @see ModiscoTGG.TextAnnotations__Marker#getCONTEXT__CORR__mMemberToTMember()
	 * @see #getTextAnnotations__Marker()
	 * @generated
	 */
	EReference getTextAnnotations__Marker_CONTEXT__CORR__mMemberToTMember();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.TypeParameter__Marker <em>Type Parameter Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter Marker</em>'.
	 * @see ModiscoTGG.TypeParameter__Marker
	 * @generated
	 */
	EClass getTypeParameter__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypeParameter__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.TypeParameter__Marker#getCONTEXT__SRC__eModel()
	 * @see #getTypeParameter__Marker()
	 * @generated
	 */
	EReference getTypeParameter__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypeParameter__Marker#getCREATE__SRC__typeParameter <em>CREATE SRC type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC type Parameter</em>'.
	 * @see ModiscoTGG.TypeParameter__Marker#getCREATE__SRC__typeParameter()
	 * @see #getTypeParameter__Marker()
	 * @generated
	 */
	EReference getTypeParameter__Marker_CREATE__SRC__typeParameter();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypeParameter__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.TypeParameter__Marker#getCONTEXT__TRG__pg()
	 * @see #getTypeParameter__Marker()
	 * @generated
	 */
	EReference getTypeParameter__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypeParameter__Marker#getCREATE__TRG__tClass <em>CREATE TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tClass</em>'.
	 * @see ModiscoTGG.TypeParameter__Marker#getCREATE__TRG__tClass()
	 * @see #getTypeParameter__Marker()
	 * @generated
	 */
	EReference getTypeParameter__Marker_CREATE__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypeParameter__Marker#getCREATE__CORR__eAnonymousClassDeclarationToTClass <em>CREATE CORR eAnonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR eAnonymous Class Declaration To TClass</em>'.
	 * @see ModiscoTGG.TypeParameter__Marker#getCREATE__CORR__eAnonymousClassDeclarationToTClass()
	 * @see #getTypeParameter__Marker()
	 * @generated
	 */
	EReference getTypeParameter__Marker_CREATE__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypeParameter__Marker#getCONTEXT__CORR__eModelToPg <em>CONTEXT CORR eModel To Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Pg</em>'.
	 * @see ModiscoTGG.TypeParameter__Marker#getCONTEXT__CORR__eModelToPg()
	 * @see #getTypeParameter__Marker()
	 * @generated
	 */
	EReference getTypeParameter__Marker_CONTEXT__CORR__eModelToPg();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.TypesOrphaned__Marker <em>Types Orphaned Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Orphaned Marker</em>'.
	 * @see ModiscoTGG.TypesOrphaned__Marker
	 * @generated
	 */
	EClass getTypesOrphaned__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesOrphaned__Marker#getCONTEXT__SRC__mModel <em>CONTEXT SRC mModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mModel</em>'.
	 * @see ModiscoTGG.TypesOrphaned__Marker#getCONTEXT__SRC__mModel()
	 * @see #getTypesOrphaned__Marker()
	 * @generated
	 */
	EReference getTypesOrphaned__Marker_CONTEXT__SRC__mModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesOrphaned__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mType</em>'.
	 * @see ModiscoTGG.TypesOrphaned__Marker#getCREATE__SRC__mType()
	 * @see #getTypesOrphaned__Marker()
	 * @generated
	 */
	EReference getTypesOrphaned__Marker_CREATE__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesOrphaned__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.TypesOrphaned__Marker#getCONTEXT__TRG__pg()
	 * @see #getTypesOrphaned__Marker()
	 * @generated
	 */
	EReference getTypesOrphaned__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesOrphaned__Marker#getCREATE__TRG__tType <em>CREATE TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tType</em>'.
	 * @see ModiscoTGG.TypesOrphaned__Marker#getCREATE__TRG__tType()
	 * @see #getTypesOrphaned__Marker()
	 * @generated
	 */
	EReference getTypesOrphaned__Marker_CREATE__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesOrphaned__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mBody To TAnnotation</em>'.
	 * @see ModiscoTGG.TypesOrphaned__Marker#getCREATE__CORR__mBodyToTAnnotation()
	 * @see #getTypesOrphaned__Marker()
	 * @generated
	 */
	EReference getTypesOrphaned__Marker_CREATE__CORR__mBodyToTAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesOrphaned__Marker#getCONTEXT__CORR__mModelToTypeGraph <em>CONTEXT CORR mModel To Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mModel To Type Graph</em>'.
	 * @see ModiscoTGG.TypesOrphaned__Marker#getCONTEXT__CORR__mModelToTypeGraph()
	 * @see #getTypesOrphaned__Marker()
	 * @generated
	 */
	EReference getTypesOrphaned__Marker_CONTEXT__CORR__mModelToTypeGraph();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesOrphaned__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mType To TType</em>'.
	 * @see ModiscoTGG.TypesOrphaned__Marker#getCREATE__CORR__mTypeToTType()
	 * @see #getTypesOrphaned__Marker()
	 * @generated
	 */
	EReference getTypesOrphaned__Marker_CREATE__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.TypesVisibility__Marker <em>Types Visibility Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Visibility Marker</em>'.
	 * @see ModiscoTGG.TypesVisibility__Marker
	 * @generated
	 */
	EClass getTypesVisibility__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesVisibility__Marker#getCREATE__SRC__mModifier <em>CREATE SRC mModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC mModifier</em>'.
	 * @see ModiscoTGG.TypesVisibility__Marker#getCREATE__SRC__mModifier()
	 * @see #getTypesVisibility__Marker()
	 * @generated
	 */
	EReference getTypesVisibility__Marker_CREATE__SRC__mModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesVisibility__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mType</em>'.
	 * @see ModiscoTGG.TypesVisibility__Marker#getCONTEXT__SRC__mType()
	 * @see #getTypesVisibility__Marker()
	 * @generated
	 */
	EReference getTypesVisibility__Marker_CONTEXT__SRC__mType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesVisibility__Marker#getCREATE__TRG__tModifier <em>CREATE TRG tModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tModifier</em>'.
	 * @see ModiscoTGG.TypesVisibility__Marker#getCREATE__TRG__tModifier()
	 * @see #getTypesVisibility__Marker()
	 * @generated
	 */
	EReference getTypesVisibility__Marker_CREATE__TRG__tModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesVisibility__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tType</em>'.
	 * @see ModiscoTGG.TypesVisibility__Marker#getCONTEXT__TRG__tType()
	 * @see #getTypesVisibility__Marker()
	 * @generated
	 */
	EReference getTypesVisibility__Marker_CONTEXT__TRG__tType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesVisibility__Marker#getCREATE__CORR__mModifierToTModifier <em>CREATE CORR mModifier To TModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR mModifier To TModifier</em>'.
	 * @see ModiscoTGG.TypesVisibility__Marker#getCREATE__CORR__mModifierToTModifier()
	 * @see #getTypesVisibility__Marker()
	 * @generated
	 */
	EReference getTypesVisibility__Marker_CREATE__CORR__mModifierToTModifier();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.TypesVisibility__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR mType To TType</em>'.
	 * @see ModiscoTGG.TypesVisibility__Marker#getCONTEXT__CORR__mTypeToTType()
	 * @see #getTypesVisibility__Marker()
	 * @generated
	 */
	EReference getTypesVisibility__Marker_CONTEXT__CORR__mTypeToTType();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker <em>Unresolved Type Declaration Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Type Declaration Marker</em>'.
	 * @see ModiscoTGG.UnresolvedTypeDeclaration__Marker
	 * @generated
	 */
	EClass getUnresolvedTypeDeclaration__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC eModel</em>'.
	 * @see ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCONTEXT__SRC__eModel()
	 * @see #getUnresolvedTypeDeclaration__Marker()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclaration__Marker_CONTEXT__SRC__eModel();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCREATE__SRC__unresolvedType <em>CREATE SRC unresolved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC unresolved Type</em>'.
	 * @see ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCREATE__SRC__unresolvedType()
	 * @see #getUnresolvedTypeDeclaration__Marker()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclaration__Marker_CREATE__SRC__unresolvedType();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG pg</em>'.
	 * @see ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCONTEXT__TRG__pg()
	 * @see #getUnresolvedTypeDeclaration__Marker()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclaration__Marker_CONTEXT__TRG__pg();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCREATE__TRG__tClass <em>CREATE TRG tClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG tClass</em>'.
	 * @see ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCREATE__TRG__tClass()
	 * @see #getUnresolvedTypeDeclaration__Marker()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclaration__Marker_CREATE__TRG__tClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCREATE__CORR__eAnonymousClassDeclarationToTClass <em>CREATE CORR eAnonymous Class Declaration To TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR eAnonymous Class Declaration To TClass</em>'.
	 * @see ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCREATE__CORR__eAnonymousClassDeclarationToTClass()
	 * @see #getUnresolvedTypeDeclaration__Marker()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclaration__Marker_CREATE__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCONTEXT__CORR__eModelToPg <em>CONTEXT CORR eModel To Pg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eModel To Pg</em>'.
	 * @see ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCONTEXT__CORR__eModelToPg()
	 * @see #getUnresolvedTypeDeclaration__Marker()
	 * @generated
	 */
	EReference getUnresolvedTypeDeclaration__Marker_CONTEXT__CORR__eModelToPg();

	/**
	 * Returns the meta object for class '{@link ModiscoTGG.VariableDeclarationFragment__Marker <em>Variable Declaration Fragment Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Fragment Marker</em>'.
	 * @see ModiscoTGG.VariableDeclarationFragment__Marker
	 * @generated
	 */
	EClass getVariableDeclarationFragment__Marker();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC mDefinition</em>'.
	 * @see ModiscoTGG.VariableDeclarationFragment__Marker#getCONTEXT__SRC__mDefinition()
	 * @see #getVariableDeclarationFragment__Marker()
	 * @generated
	 */
	EReference getVariableDeclarationFragment__Marker_CONTEXT__SRC__mDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCREATE__SRC__varDeclFragment <em>CREATE SRC var Decl Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC var Decl Fragment</em>'.
	 * @see ModiscoTGG.VariableDeclarationFragment__Marker#getCREATE__SRC__varDeclFragment()
	 * @see #getVariableDeclarationFragment__Marker()
	 * @generated
	 */
	EReference getVariableDeclarationFragment__Marker_CREATE__SRC__varDeclFragment();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCONTEXT__TRG__tDefinition <em>CONTEXT TRG tDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG tDefinition</em>'.
	 * @see ModiscoTGG.VariableDeclarationFragment__Marker#getCONTEXT__TRG__tDefinition()
	 * @see #getVariableDeclarationFragment__Marker()
	 * @generated
	 */
	EReference getVariableDeclarationFragment__Marker_CONTEXT__TRG__tDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCONTEXT__CORR__eFieldDeclarationToTFieldDefinition <em>CONTEXT CORR eField Declaration To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR eField Declaration To TField Definition</em>'.
	 * @see ModiscoTGG.VariableDeclarationFragment__Marker#getCONTEXT__CORR__eFieldDeclarationToTFieldDefinition()
	 * @see #getVariableDeclarationFragment__Marker()
	 * @generated
	 */
	EReference getVariableDeclarationFragment__Marker_CONTEXT__CORR__eFieldDeclarationToTFieldDefinition();

	/**
	 * Returns the meta object for the reference '{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCREATE__CORR__varDeclFragmentToTFieldDefinition <em>CREATE CORR var Decl Fragment To TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR var Decl Fragment To TField Definition</em>'.
	 * @see ModiscoTGG.VariableDeclarationFragment__Marker#getCREATE__CORR__varDeclFragmentToTFieldDefinition()
	 * @see #getVariableDeclarationFragment__Marker()
	 * @generated
	 */
	EReference getVariableDeclarationFragment__Marker_CREATE__CORR__varDeclFragmentToTFieldDefinition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModiscoTGGFactory getModiscoTGGFactory();

} //ModiscoTGGPackage
