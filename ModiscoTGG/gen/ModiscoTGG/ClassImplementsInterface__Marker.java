/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Implements Interface Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__SRC__eClassDeclaration <em>CONTEXT SRC eClass Declaration</em>}</li>
 *   <li>{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__SRC__eSuperInterface <em>CONTEXT SRC eSuper Interface</em>}</li>
 *   <li>{@link ModiscoTGG.ClassImplementsInterface__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}</li>
 *   <li>{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__TRG__tSuperInterface <em>CONTEXT TRG tSuper Interface</em>}</li>
 *   <li>{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__CORR__eClassDeclarationToTClass <em>CONTEXT CORR eClass Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__CORR__eSuperInterfaceToTSuperInterface <em>CONTEXT CORR eSuper Interface To TSuper Interface</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getClassImplementsInterface__Marker()
 * @model
 * @generated
 */
public interface ClassImplementsInterface__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eClass Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eClass Declaration</em>' reference.
	 * @see #setCONTEXT__SRC__eClassDeclaration(ClassDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassImplementsInterface__Marker_CONTEXT__SRC__eClassDeclaration()
	 * @model required="true"
	 * @generated
	 */
	ClassDeclaration getCONTEXT__SRC__eClassDeclaration();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__SRC__eClassDeclaration <em>CONTEXT SRC eClass Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eClass Declaration</em>' reference.
	 * @see #getCONTEXT__SRC__eClassDeclaration()
	 * @generated
	 */
	void setCONTEXT__SRC__eClassDeclaration(ClassDeclaration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eSuper Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eSuper Interface</em>' reference.
	 * @see #setCONTEXT__SRC__eSuperInterface(Type)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassImplementsInterface__Marker_CONTEXT__SRC__eSuperInterface()
	 * @model required="true"
	 * @generated
	 */
	Type getCONTEXT__SRC__eSuperInterface();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__SRC__eSuperInterface <em>CONTEXT SRC eSuper Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eSuper Interface</em>' reference.
	 * @see #getCONTEXT__SRC__eSuperInterface()
	 * @generated
	 */
	void setCONTEXT__SRC__eSuperInterface(Type value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC eType Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC eType Access</em>' reference.
	 * @see #setCREATE__SRC__eTypeAccess(TypeAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassImplementsInterface__Marker_CREATE__SRC__eTypeAccess()
	 * @model required="true"
	 * @generated
	 */
	TypeAccess getCREATE__SRC__eTypeAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC eType Access</em>' reference.
	 * @see #getCREATE__SRC__eTypeAccess()
	 * @generated
	 */
	void setCREATE__SRC__eTypeAccess(TypeAccess value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tClass</em>' reference.
	 * @see #setCONTEXT__TRG__tClass(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassImplementsInterface__Marker_CONTEXT__TRG__tClass()
	 * @model required="true"
	 * @generated
	 */
	TClass getCONTEXT__TRG__tClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tClass</em>' reference.
	 * @see #getCONTEXT__TRG__tClass()
	 * @generated
	 */
	void setCONTEXT__TRG__tClass(TClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tSuper Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tSuper Interface</em>' reference.
	 * @see #setCONTEXT__TRG__tSuperInterface(TInterface)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassImplementsInterface__Marker_CONTEXT__TRG__tSuperInterface()
	 * @model required="true"
	 * @generated
	 */
	TInterface getCONTEXT__TRG__tSuperInterface();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__TRG__tSuperInterface <em>CONTEXT TRG tSuper Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tSuper Interface</em>' reference.
	 * @see #getCONTEXT__TRG__tSuperInterface()
	 * @generated
	 */
	void setCONTEXT__TRG__tSuperInterface(TInterface value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eClass Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eClass Declaration To TClass</em>' reference.
	 * @see #setCONTEXT__CORR__eClassDeclarationToTClass(ClassDeclarationToTClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassImplementsInterface__Marker_CONTEXT__CORR__eClassDeclarationToTClass()
	 * @model required="true"
	 * @generated
	 */
	ClassDeclarationToTClass getCONTEXT__CORR__eClassDeclarationToTClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__CORR__eClassDeclarationToTClass <em>CONTEXT CORR eClass Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eClass Declaration To TClass</em>' reference.
	 * @see #getCONTEXT__CORR__eClassDeclarationToTClass()
	 * @generated
	 */
	void setCONTEXT__CORR__eClassDeclarationToTClass(ClassDeclarationToTClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eSuper Interface To TSuper Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eSuper Interface To TSuper Interface</em>' reference.
	 * @see #setCONTEXT__CORR__eSuperInterfaceToTSuperInterface(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassImplementsInterface__Marker_CONTEXT__CORR__eSuperInterfaceToTSuperInterface()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__eSuperInterfaceToTSuperInterface();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassImplementsInterface__Marker#getCONTEXT__CORR__eSuperInterfaceToTSuperInterface <em>CONTEXT CORR eSuper Interface To TSuper Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eSuper Interface To TSuper Interface</em>' reference.
	 * @see #getCONTEXT__CORR__eSuperInterfaceToTSuperInterface()
	 * @generated
	 */
	void setCONTEXT__CORR__eSuperInterfaceToTSuperInterface(TypeToTAbstractType value);

} // ClassImplementsInterface__Marker
