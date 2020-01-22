/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.modisco.MMethodDefinition;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodDefinition;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Type Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__SRC__eReturnType <em>CONTEXT SRC eReturn Type</em>}</li>
 *   <li>{@link ModiscoTGG.ReturnType__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}</li>
 *   <li>{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__TRG__tAbstractType <em>CONTEXT TRG tAbstract Type</em>}</li>
 *   <li>{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__TRG__tMethodDefinition <em>CONTEXT TRG tMethod Definition</em>}</li>
 *   <li>{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__CORR__eReturnTypeToTAbstractType <em>CONTEXT CORR eReturn Type To TAbstract Type</em>}</li>
 *   <li>{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__CORR__mMethodDefinitionToTMethodDefinition <em>CONTEXT CORR mMethod Definition To TMethod Definition</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getReturnType__Marker()
 * @model
 * @generated
 */
public interface ReturnType__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eReturn Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eReturn Type</em>' reference.
	 * @see #setCONTEXT__SRC__eReturnType(Type)
	 * @see ModiscoTGG.ModiscoTGGPackage#getReturnType__Marker_CONTEXT__SRC__eReturnType()
	 * @model required="true"
	 * @generated
	 */
	Type getCONTEXT__SRC__eReturnType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__SRC__eReturnType <em>CONTEXT SRC eReturn Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eReturn Type</em>' reference.
	 * @see #getCONTEXT__SRC__eReturnType()
	 * @generated
	 */
	void setCONTEXT__SRC__eReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC eType Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC eType Access</em>' reference.
	 * @see #setCREATE__SRC__eTypeAccess(TypeAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getReturnType__Marker_CREATE__SRC__eTypeAccess()
	 * @model required="true"
	 * @generated
	 */
	TypeAccess getCREATE__SRC__eTypeAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ReturnType__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC eType Access</em>' reference.
	 * @see #getCREATE__SRC__eTypeAccess()
	 * @generated
	 */
	void setCREATE__SRC__eTypeAccess(TypeAccess value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mDefinition</em>' reference.
	 * @see #setCONTEXT__SRC__mDefinition(MMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getReturnType__Marker_CONTEXT__SRC__mDefinition()
	 * @model required="true"
	 * @generated
	 */
	MMethodDefinition getCONTEXT__SRC__mDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mDefinition</em>' reference.
	 * @see #getCONTEXT__SRC__mDefinition()
	 * @generated
	 */
	void setCONTEXT__SRC__mDefinition(MMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tAbstract Type</em>' reference.
	 * @see #setCONTEXT__TRG__tAbstractType(TAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getReturnType__Marker_CONTEXT__TRG__tAbstractType()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getCONTEXT__TRG__tAbstractType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__TRG__tAbstractType <em>CONTEXT TRG tAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tAbstract Type</em>' reference.
	 * @see #getCONTEXT__TRG__tAbstractType()
	 * @generated
	 */
	void setCONTEXT__TRG__tAbstractType(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tMethod Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tMethod Definition</em>' reference.
	 * @see #setCONTEXT__TRG__tMethodDefinition(TMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getReturnType__Marker_CONTEXT__TRG__tMethodDefinition()
	 * @model required="true"
	 * @generated
	 */
	TMethodDefinition getCONTEXT__TRG__tMethodDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__TRG__tMethodDefinition <em>CONTEXT TRG tMethod Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tMethod Definition</em>' reference.
	 * @see #getCONTEXT__TRG__tMethodDefinition()
	 * @generated
	 */
	void setCONTEXT__TRG__tMethodDefinition(TMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eReturn Type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eReturn Type To TAbstract Type</em>' reference.
	 * @see #setCONTEXT__CORR__eReturnTypeToTAbstractType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getReturnType__Marker_CONTEXT__CORR__eReturnTypeToTAbstractType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__eReturnTypeToTAbstractType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__CORR__eReturnTypeToTAbstractType <em>CONTEXT CORR eReturn Type To TAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eReturn Type To TAbstract Type</em>' reference.
	 * @see #getCONTEXT__CORR__eReturnTypeToTAbstractType()
	 * @generated
	 */
	void setCONTEXT__CORR__eReturnTypeToTAbstractType(TypeToTAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mMethod Definition To TMethod Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mMethod Definition To TMethod Definition</em>' reference.
	 * @see #setCONTEXT__CORR__mMethodDefinitionToTMethodDefinition(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getReturnType__Marker_CONTEXT__CORR__mMethodDefinitionToTMethodDefinition()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCONTEXT__CORR__mMethodDefinitionToTMethodDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ReturnType__Marker#getCONTEXT__CORR__mMethodDefinitionToTMethodDefinition <em>CONTEXT CORR mMethod Definition To TMethod Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mMethod Definition To TMethod Definition</em>' reference.
	 * @see #getCONTEXT__CORR__mMethodDefinitionToTMethodDefinition()
	 * @generated
	 */
	void setCONTEXT__CORR__mMethodDefinitionToTMethodDefinition(MDefinitionToTMember value);

} // ReturnType__Marker
