/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.typegraph.basic.TClass;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Extends Class Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__SRC__eClassDeclaration <em>CONTEXT SRC eClass Declaration</em>}</li>
 *   <li>{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__SRC__eExtendedClass <em>CONTEXT SRC eExtended Class</em>}</li>
 *   <li>{@link ModiscoTGG.ClassExtendsClass__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}</li>
 *   <li>{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__TRG__tExtendedClass <em>CONTEXT TRG tExtended Class</em>}</li>
 *   <li>{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__CORR__eClassDeclarationToTClass <em>CONTEXT CORR eClass Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__CORR__eExtendedClassToTExtendedClass <em>CONTEXT CORR eExtended Class To TExtended Class</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getClassExtendsClass__Marker()
 * @model
 * @generated
 */
public interface ClassExtendsClass__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eClass Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eClass Declaration</em>' reference.
	 * @see #setCONTEXT__SRC__eClassDeclaration(ClassDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassExtendsClass__Marker_CONTEXT__SRC__eClassDeclaration()
	 * @model required="true"
	 * @generated
	 */
	ClassDeclaration getCONTEXT__SRC__eClassDeclaration();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__SRC__eClassDeclaration <em>CONTEXT SRC eClass Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eClass Declaration</em>' reference.
	 * @see #getCONTEXT__SRC__eClassDeclaration()
	 * @generated
	 */
	void setCONTEXT__SRC__eClassDeclaration(ClassDeclaration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eExtended Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eExtended Class</em>' reference.
	 * @see #setCONTEXT__SRC__eExtendedClass(ClassDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassExtendsClass__Marker_CONTEXT__SRC__eExtendedClass()
	 * @model required="true"
	 * @generated
	 */
	ClassDeclaration getCONTEXT__SRC__eExtendedClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__SRC__eExtendedClass <em>CONTEXT SRC eExtended Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eExtended Class</em>' reference.
	 * @see #getCONTEXT__SRC__eExtendedClass()
	 * @generated
	 */
	void setCONTEXT__SRC__eExtendedClass(ClassDeclaration value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC eType Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC eType Access</em>' reference.
	 * @see #setCREATE__SRC__eTypeAccess(TypeAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassExtendsClass__Marker_CREATE__SRC__eTypeAccess()
	 * @model required="true"
	 * @generated
	 */
	TypeAccess getCREATE__SRC__eTypeAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassExtendsClass__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}' reference.
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
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassExtendsClass__Marker_CONTEXT__TRG__tClass()
	 * @model required="true"
	 * @generated
	 */
	TClass getCONTEXT__TRG__tClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tClass</em>' reference.
	 * @see #getCONTEXT__TRG__tClass()
	 * @generated
	 */
	void setCONTEXT__TRG__tClass(TClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tExtended Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tExtended Class</em>' reference.
	 * @see #setCONTEXT__TRG__tExtendedClass(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassExtendsClass__Marker_CONTEXT__TRG__tExtendedClass()
	 * @model required="true"
	 * @generated
	 */
	TClass getCONTEXT__TRG__tExtendedClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__TRG__tExtendedClass <em>CONTEXT TRG tExtended Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tExtended Class</em>' reference.
	 * @see #getCONTEXT__TRG__tExtendedClass()
	 * @generated
	 */
	void setCONTEXT__TRG__tExtendedClass(TClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eClass Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eClass Declaration To TClass</em>' reference.
	 * @see #setCONTEXT__CORR__eClassDeclarationToTClass(ClassDeclarationToTClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassExtendsClass__Marker_CONTEXT__CORR__eClassDeclarationToTClass()
	 * @model required="true"
	 * @generated
	 */
	ClassDeclarationToTClass getCONTEXT__CORR__eClassDeclarationToTClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__CORR__eClassDeclarationToTClass <em>CONTEXT CORR eClass Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eClass Declaration To TClass</em>' reference.
	 * @see #getCONTEXT__CORR__eClassDeclarationToTClass()
	 * @generated
	 */
	void setCONTEXT__CORR__eClassDeclarationToTClass(ClassDeclarationToTClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eExtended Class To TExtended Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eExtended Class To TExtended Class</em>' reference.
	 * @see #setCONTEXT__CORR__eExtendedClassToTExtendedClass(ClassDeclarationToTClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassExtendsClass__Marker_CONTEXT__CORR__eExtendedClassToTExtendedClass()
	 * @model required="true"
	 * @generated
	 */
	ClassDeclarationToTClass getCONTEXT__CORR__eExtendedClassToTExtendedClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassExtendsClass__Marker#getCONTEXT__CORR__eExtendedClassToTExtendedClass <em>CONTEXT CORR eExtended Class To TExtended Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eExtended Class To TExtended Class</em>' reference.
	 * @see #getCONTEXT__CORR__eExtendedClassToTExtendedClass()
	 * @generated
	 */
	void setCONTEXT__CORR__eExtendedClassToTExtendedClass(ClassDeclarationToTClass value);

} // ClassExtendsClass__Marker
