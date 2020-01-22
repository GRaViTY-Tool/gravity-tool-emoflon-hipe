/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MMethodInvocation;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TCall;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Invocation Static Type Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__SRC__invocation <em>CONTEXT SRC invocation</em>}</li>
 *   <li>{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__SRC__mStaticType <em>CONTEXT SRC mStatic Type</em>}</li>
 *   <li>{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__TRG__tAccess <em>CONTEXT TRG tAccess</em>}</li>
 *   <li>{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__TRG__tStaticType <em>CONTEXT TRG tStatic Type</em>}</li>
 *   <li>{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__CORR__invocationToTAccess <em>CONTEXT CORR invocation To TAccess</em>}</li>
 *   <li>{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__CORR__mStaticTypeTotStaticType <em>CONTEXT CORR mStatic Type Tot Static Type</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationStaticType__Marker()
 * @model
 * @generated
 */
public interface MethodInvocationStaticType__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC invocation</em>' reference.
	 * @see #setCONTEXT__SRC__invocation(MMethodInvocation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationStaticType__Marker_CONTEXT__SRC__invocation()
	 * @model required="true"
	 * @generated
	 */
	MMethodInvocation getCONTEXT__SRC__invocation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__SRC__invocation <em>CONTEXT SRC invocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC invocation</em>' reference.
	 * @see #getCONTEXT__SRC__invocation()
	 * @generated
	 */
	void setCONTEXT__SRC__invocation(MMethodInvocation value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mStatic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mStatic Type</em>' reference.
	 * @see #setCONTEXT__SRC__mStaticType(Type)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationStaticType__Marker_CONTEXT__SRC__mStaticType()
	 * @model required="true"
	 * @generated
	 */
	Type getCONTEXT__SRC__mStaticType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__SRC__mStaticType <em>CONTEXT SRC mStatic Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mStatic Type</em>' reference.
	 * @see #getCONTEXT__SRC__mStaticType()
	 * @generated
	 */
	void setCONTEXT__SRC__mStaticType(Type value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tAccess</em>' reference.
	 * @see #setCONTEXT__TRG__tAccess(TCall)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationStaticType__Marker_CONTEXT__TRG__tAccess()
	 * @model required="true"
	 * @generated
	 */
	TCall getCONTEXT__TRG__tAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__TRG__tAccess <em>CONTEXT TRG tAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tAccess</em>' reference.
	 * @see #getCONTEXT__TRG__tAccess()
	 * @generated
	 */
	void setCONTEXT__TRG__tAccess(TCall value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tStatic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tStatic Type</em>' reference.
	 * @see #setCONTEXT__TRG__tStaticType(TAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationStaticType__Marker_CONTEXT__TRG__tStaticType()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getCONTEXT__TRG__tStaticType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__TRG__tStaticType <em>CONTEXT TRG tStatic Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tStatic Type</em>' reference.
	 * @see #getCONTEXT__TRG__tStaticType()
	 * @generated
	 */
	void setCONTEXT__TRG__tStaticType(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR invocation To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR invocation To TAccess</em>' reference.
	 * @see #setCONTEXT__CORR__invocationToTAccess(AbstractMethodInvocationToTAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationStaticType__Marker_CONTEXT__CORR__invocationToTAccess()
	 * @model required="true"
	 * @generated
	 */
	AbstractMethodInvocationToTAccess getCONTEXT__CORR__invocationToTAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__CORR__invocationToTAccess <em>CONTEXT CORR invocation To TAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR invocation To TAccess</em>' reference.
	 * @see #getCONTEXT__CORR__invocationToTAccess()
	 * @generated
	 */
	void setCONTEXT__CORR__invocationToTAccess(AbstractMethodInvocationToTAccess value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mStatic Type Tot Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mStatic Type Tot Static Type</em>' reference.
	 * @see #setCONTEXT__CORR__mStaticTypeTotStaticType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationStaticType__Marker_CONTEXT__CORR__mStaticTypeTotStaticType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__mStaticTypeTotStaticType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationStaticType__Marker#getCONTEXT__CORR__mStaticTypeTotStaticType <em>CONTEXT CORR mStatic Type Tot Static Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mStatic Type Tot Static Type</em>' reference.
	 * @see #getCONTEXT__CORR__mStaticTypeTotStaticType()
	 * @generated
	 */
	void setCONTEXT__CORR__mStaticTypeTotStaticType(TypeToTAbstractType value);

} // MethodInvocationStaticType__Marker
