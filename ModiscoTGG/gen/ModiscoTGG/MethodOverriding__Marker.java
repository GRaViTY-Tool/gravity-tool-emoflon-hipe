/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MMethodDefinition;

import org.gravity.typegraph.basic.TMethodDefinition;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Overriding Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__SRC__mMethod <em>CONTEXT SRC mMethod</em>}</li>
 *   <li>{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__SRC__mOverriding <em>CONTEXT SRC mOverriding</em>}</li>
 *   <li>{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__TRG__tMethod <em>CONTEXT TRG tMethod</em>}</li>
 *   <li>{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__TRG__tOverriding <em>CONTEXT TRG tOverriding</em>}</li>
 *   <li>{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}</li>
 *   <li>{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__CORR__mOverridingToTOverriding <em>CONTEXT CORR mOverriding To TOverriding</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMethodOverriding__Marker()
 * @model
 * @generated
 */
public interface MethodOverriding__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mMethod</em>' reference.
	 * @see #setCONTEXT__SRC__mMethod(MMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodOverriding__Marker_CONTEXT__SRC__mMethod()
	 * @model required="true"
	 * @generated
	 */
	MMethodDefinition getCONTEXT__SRC__mMethod();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__SRC__mMethod <em>CONTEXT SRC mMethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mMethod</em>' reference.
	 * @see #getCONTEXT__SRC__mMethod()
	 * @generated
	 */
	void setCONTEXT__SRC__mMethod(MMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mOverriding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mOverriding</em>' reference.
	 * @see #setCONTEXT__SRC__mOverriding(MMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodOverriding__Marker_CONTEXT__SRC__mOverriding()
	 * @model required="true"
	 * @generated
	 */
	MMethodDefinition getCONTEXT__SRC__mOverriding();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__SRC__mOverriding <em>CONTEXT SRC mOverriding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mOverriding</em>' reference.
	 * @see #getCONTEXT__SRC__mOverriding()
	 * @generated
	 */
	void setCONTEXT__SRC__mOverriding(MMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tMethod</em>' reference.
	 * @see #setCONTEXT__TRG__tMethod(TMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodOverriding__Marker_CONTEXT__TRG__tMethod()
	 * @model required="true"
	 * @generated
	 */
	TMethodDefinition getCONTEXT__TRG__tMethod();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__TRG__tMethod <em>CONTEXT TRG tMethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tMethod</em>' reference.
	 * @see #getCONTEXT__TRG__tMethod()
	 * @generated
	 */
	void setCONTEXT__TRG__tMethod(TMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tOverriding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tOverriding</em>' reference.
	 * @see #setCONTEXT__TRG__tOverriding(TMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodOverriding__Marker_CONTEXT__TRG__tOverriding()
	 * @model required="true"
	 * @generated
	 */
	TMethodDefinition getCONTEXT__TRG__tOverriding();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__TRG__tOverriding <em>CONTEXT TRG tOverriding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tOverriding</em>' reference.
	 * @see #getCONTEXT__TRG__tOverriding()
	 * @generated
	 */
	void setCONTEXT__TRG__tOverriding(TMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mMethod To TMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mMethod To TMethod</em>' reference.
	 * @see #setCONTEXT__CORR__mMethodToTMethod(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodOverriding__Marker_CONTEXT__CORR__mMethodToTMethod()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCONTEXT__CORR__mMethodToTMethod();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mMethod To TMethod</em>' reference.
	 * @see #getCONTEXT__CORR__mMethodToTMethod()
	 * @generated
	 */
	void setCONTEXT__CORR__mMethodToTMethod(MDefinitionToTMember value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mOverriding To TOverriding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mOverriding To TOverriding</em>' reference.
	 * @see #setCONTEXT__CORR__mOverridingToTOverriding(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodOverriding__Marker_CONTEXT__CORR__mOverridingToTOverriding()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCONTEXT__CORR__mOverridingToTOverriding();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodOverriding__Marker#getCONTEXT__CORR__mOverridingToTOverriding <em>CONTEXT CORR mOverriding To TOverriding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mOverriding To TOverriding</em>' reference.
	 * @see #getCONTEXT__CORR__mOverridingToTOverriding()
	 * @generated
	 */
	void setCONTEXT__CORR__mOverridingToTOverriding(MDefinitionToTMember value);

} // MethodOverriding__Marker
