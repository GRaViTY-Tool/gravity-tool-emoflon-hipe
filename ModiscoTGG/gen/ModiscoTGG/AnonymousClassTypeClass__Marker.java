/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.modisco.MAnonymous;

import org.gravity.typegraph.basic.TClass;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Class Type Class Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__SRC__mAnonymous <em>CONTEXT SRC mAnonymous</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCREATE__SRC__mCreation <em>CREATE SRC mCreation</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__SRC__mParent <em>CONTEXT SRC mParent</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__TRG__tParent <em>CONTEXT TRG tParent</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__CORR__parentToParent <em>CONTEXT CORR parent To Parent</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClassTypeClass__Marker()
 * @model
 * @generated
 */
public interface AnonymousClassTypeClass__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mAnonymous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mAnonymous</em>' reference.
	 * @see #setCONTEXT__SRC__mAnonymous(MAnonymous)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClassTypeClass__Marker_CONTEXT__SRC__mAnonymous()
	 * @model required="true"
	 * @generated
	 */
	MAnonymous getCONTEXT__SRC__mAnonymous();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__SRC__mAnonymous <em>CONTEXT SRC mAnonymous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mAnonymous</em>' reference.
	 * @see #getCONTEXT__SRC__mAnonymous()
	 * @generated
	 */
	void setCONTEXT__SRC__mAnonymous(MAnonymous value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mCreation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mCreation</em>' reference.
	 * @see #setCREATE__SRC__mCreation(ClassInstanceCreation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClassTypeClass__Marker_CREATE__SRC__mCreation()
	 * @model required="true"
	 * @generated
	 */
	ClassInstanceCreation getCREATE__SRC__mCreation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCREATE__SRC__mCreation <em>CREATE SRC mCreation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mCreation</em>' reference.
	 * @see #getCREATE__SRC__mCreation()
	 * @generated
	 */
	void setCREATE__SRC__mCreation(ClassInstanceCreation value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mParent</em>' reference.
	 * @see #setCONTEXT__SRC__mParent(AbstractTypeDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClassTypeClass__Marker_CONTEXT__SRC__mParent()
	 * @model required="true"
	 * @generated
	 */
	AbstractTypeDeclaration getCONTEXT__SRC__mParent();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__SRC__mParent <em>CONTEXT SRC mParent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mParent</em>' reference.
	 * @see #getCONTEXT__SRC__mParent()
	 * @generated
	 */
	void setCONTEXT__SRC__mParent(AbstractTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mType</em>' reference.
	 * @see #setCREATE__SRC__mType(TypeAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClassTypeClass__Marker_CREATE__SRC__mType()
	 * @model required="true"
	 * @generated
	 */
	TypeAccess getCREATE__SRC__mType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mType</em>' reference.
	 * @see #getCREATE__SRC__mType()
	 * @generated
	 */
	void setCREATE__SRC__mType(TypeAccess value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tClass</em>' reference.
	 * @see #setCONTEXT__TRG__tClass(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClassTypeClass__Marker_CONTEXT__TRG__tClass()
	 * @model required="true"
	 * @generated
	 */
	TClass getCONTEXT__TRG__tClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tClass</em>' reference.
	 * @see #getCONTEXT__TRG__tClass()
	 * @generated
	 */
	void setCONTEXT__TRG__tClass(TClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tParent</em>' reference.
	 * @see #setCONTEXT__TRG__tParent(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClassTypeClass__Marker_CONTEXT__TRG__tParent()
	 * @model required="true"
	 * @generated
	 */
	TClass getCONTEXT__TRG__tParent();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__TRG__tParent <em>CONTEXT TRG tParent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tParent</em>' reference.
	 * @see #getCONTEXT__TRG__tParent()
	 * @generated
	 */
	void setCONTEXT__TRG__tParent(TClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>' reference.
	 * @see #setCONTEXT__CORR__eAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClassTypeClass__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass()
	 * @model required="true"
	 * @generated
	 */
	AnonymousClassDeclarationToTClass getCONTEXT__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>' reference.
	 * @see #getCONTEXT__CORR__eAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	void setCONTEXT__CORR__eAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR parent To Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR parent To Parent</em>' reference.
	 * @see #setCONTEXT__CORR__parentToParent(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClassTypeClass__Marker_CONTEXT__CORR__parentToParent()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__parentToParent();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClassTypeClass__Marker#getCONTEXT__CORR__parentToParent <em>CONTEXT CORR parent To Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR parent To Parent</em>' reference.
	 * @see #getCONTEXT__CORR__parentToParent()
	 * @generated
	 */
	void setCONTEXT__CORR__parentToParent(TypeToTAbstractType value);

} // AnonymousClassTypeClass__Marker
