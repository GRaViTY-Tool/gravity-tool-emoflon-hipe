/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AbstractTypeDeclaration;

import org.gravity.modisco.MAnonymous;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Class Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.AnonymousClass__Marker#getCREATE__SRC__mAnonymous <em>CREATE SRC mAnonymous</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClass__Marker#getCREATE__TRG__tAnonymous <em>CREATE TRG tAnonymous</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClass__Marker#getCREATE__TRG__tNewPackage <em>CREATE TRG tNew Package</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__TRG__tPackage <em>CONTEXT TRG tPackage</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClass__Marker#getCREATE__CORR__eAnonymousClassDeclarationToTClass <em>CREATE CORR eAnonymous Class Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClass__Marker()
 * @model
 * @generated
 */
public interface AnonymousClass__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC mAnonymous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mAnonymous</em>' reference.
	 * @see #setCREATE__SRC__mAnonymous(MAnonymous)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClass__Marker_CREATE__SRC__mAnonymous()
	 * @model required="true"
	 * @generated
	 */
	MAnonymous getCREATE__SRC__mAnonymous();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClass__Marker#getCREATE__SRC__mAnonymous <em>CREATE SRC mAnonymous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mAnonymous</em>' reference.
	 * @see #getCREATE__SRC__mAnonymous()
	 * @generated
	 */
	void setCREATE__SRC__mAnonymous(MAnonymous value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mType</em>' reference.
	 * @see #setCONTEXT__SRC__mType(AbstractTypeDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClass__Marker_CONTEXT__SRC__mType()
	 * @model required="true"
	 * @generated
	 */
	AbstractTypeDeclaration getCONTEXT__SRC__mType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mType</em>' reference.
	 * @see #getCONTEXT__SRC__mType()
	 * @generated
	 */
	void setCONTEXT__SRC__mType(AbstractTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #setCONTEXT__TRG__pg(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClass__Marker_CONTEXT__TRG__pg()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__pg();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #getCONTEXT__TRG__pg()
	 * @generated
	 */
	void setCONTEXT__TRG__pg(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tAnonymous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tAnonymous</em>' reference.
	 * @see #setCREATE__TRG__tAnonymous(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClass__Marker_CREATE__TRG__tAnonymous()
	 * @model required="true"
	 * @generated
	 */
	TClass getCREATE__TRG__tAnonymous();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClass__Marker#getCREATE__TRG__tAnonymous <em>CREATE TRG tAnonymous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tAnonymous</em>' reference.
	 * @see #getCREATE__TRG__tAnonymous()
	 * @generated
	 */
	void setCREATE__TRG__tAnonymous(TClass value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tNew Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tNew Package</em>' reference.
	 * @see #setCREATE__TRG__tNewPackage(TPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClass__Marker_CREATE__TRG__tNewPackage()
	 * @model required="true"
	 * @generated
	 */
	TPackage getCREATE__TRG__tNewPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClass__Marker#getCREATE__TRG__tNewPackage <em>CREATE TRG tNew Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tNew Package</em>' reference.
	 * @see #getCREATE__TRG__tNewPackage()
	 * @generated
	 */
	void setCREATE__TRG__tNewPackage(TPackage value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tPackage</em>' reference.
	 * @see #setCONTEXT__TRG__tPackage(TPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClass__Marker_CONTEXT__TRG__tPackage()
	 * @model required="true"
	 * @generated
	 */
	TPackage getCONTEXT__TRG__tPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__TRG__tPackage <em>CONTEXT TRG tPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tPackage</em>' reference.
	 * @see #getCONTEXT__TRG__tPackage()
	 * @generated
	 */
	void setCONTEXT__TRG__tPackage(TPackage value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tType</em>' reference.
	 * @see #setCONTEXT__TRG__tType(TAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClass__Marker_CONTEXT__TRG__tType()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getCONTEXT__TRG__tType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tType</em>' reference.
	 * @see #getCONTEXT__TRG__tType()
	 * @generated
	 */
	void setCONTEXT__TRG__tType(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR eAnonymous Class Declaration To TClass</em>' reference.
	 * @see #setCREATE__CORR__eAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClass__Marker_CREATE__CORR__eAnonymousClassDeclarationToTClass()
	 * @model required="true"
	 * @generated
	 */
	AnonymousClassDeclarationToTClass getCREATE__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClass__Marker#getCREATE__CORR__eAnonymousClassDeclarationToTClass <em>CREATE CORR eAnonymous Class Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR eAnonymous Class Declaration To TClass</em>' reference.
	 * @see #getCREATE__CORR__eAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	void setCREATE__CORR__eAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mType To TType</em>' reference.
	 * @see #setCONTEXT__CORR__mTypeToTType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnonymousClass__Marker_CONTEXT__CORR__mTypeToTType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__mTypeToTType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnonymousClass__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mType To TType</em>' reference.
	 * @see #getCONTEXT__CORR__mTypeToTType()
	 * @generated
	 */
	void setCONTEXT__CORR__mTypeToTType(TypeToTAbstractType value);

} // AnonymousClass__Marker
