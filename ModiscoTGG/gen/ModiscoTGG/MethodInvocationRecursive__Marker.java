/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodInvocation;

import org.gravity.typegraph.basic.TCall;
import org.gravity.typegraph.basic.TMethodDefinition;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Invocation Recursive Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__SRC__invocation <em>CREATE SRC invocation</em>}</li>
 *   <li>{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}</li>
 *   <li>{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}</li>
 *   <li>{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}</li>
 *   <li>{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__CORR__invocationToTAccess <em>CREATE CORR invocation To TAccess</em>}</li>
 *   <li>{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}</li>
 *   <li>{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationRecursive__Marker()
 * @model
 * @generated
 */
public interface MethodInvocationRecursive__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC invocation</em>' reference.
	 * @see #setCREATE__SRC__invocation(MMethodInvocation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationRecursive__Marker_CREATE__SRC__invocation()
	 * @model required="true"
	 * @generated
	 */
	MMethodInvocation getCREATE__SRC__invocation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__SRC__invocation <em>CREATE SRC invocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC invocation</em>' reference.
	 * @see #getCREATE__SRC__invocation()
	 * @generated
	 */
	void setCREATE__SRC__invocation(MMethodInvocation value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mMember</em>' reference.
	 * @see #setCONTEXT__SRC__mMember(MMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationRecursive__Marker_CONTEXT__SRC__mMember()
	 * @model required="true"
	 * @generated
	 */
	MMethodDefinition getCONTEXT__SRC__mMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mMember</em>' reference.
	 * @see #getCONTEXT__SRC__mMember()
	 * @generated
	 */
	void setCONTEXT__SRC__mMember(MMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tAccess</em>' reference.
	 * @see #setCREATE__TRG__tAccess(TCall)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationRecursive__Marker_CREATE__TRG__tAccess()
	 * @model required="true"
	 * @generated
	 */
	TCall getCREATE__TRG__tAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tAccess</em>' reference.
	 * @see #getCREATE__TRG__tAccess()
	 * @generated
	 */
	void setCREATE__TRG__tAccess(TCall value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tMember</em>' reference.
	 * @see #setCONTEXT__TRG__tMember(TMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationRecursive__Marker_CONTEXT__TRG__tMember()
	 * @model required="true"
	 * @generated
	 */
	TMethodDefinition getCONTEXT__TRG__tMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tMember</em>' reference.
	 * @see #getCONTEXT__TRG__tMember()
	 * @generated
	 */
	void setCONTEXT__TRG__tMember(TMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR invocation To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR invocation To TAccess</em>' reference.
	 * @see #setCREATE__CORR__invocationToTAccess(AbstractMethodInvocationToTAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationRecursive__Marker_CREATE__CORR__invocationToTAccess()
	 * @model required="true"
	 * @generated
	 */
	AbstractMethodInvocationToTAccess getCREATE__CORR__invocationToTAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__CORR__invocationToTAccess <em>CREATE CORR invocation To TAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR invocation To TAccess</em>' reference.
	 * @see #getCREATE__CORR__invocationToTAccess()
	 * @generated
	 */
	void setCREATE__CORR__invocationToTAccess(AbstractMethodInvocationToTAccess value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mFlow Element To TFlow Element</em>' reference.
	 * @see #setCREATE__CORR__mFlowElementToTFlowElement(MAbstractFlowElementToTAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationRecursive__Marker_CREATE__CORR__mFlowElementToTFlowElement()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElementToTAbstractFlowElement getCREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mFlow Element To TFlow Element</em>' reference.
	 * @see #getCREATE__CORR__mFlowElementToTFlowElement()
	 * @generated
	 */
	void setCREATE__CORR__mFlowElementToTFlowElement(MAbstractFlowElementToTAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mMember To TMember</em>' reference.
	 * @see #setCONTEXT__CORR__mMemberToTMember(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodInvocationRecursive__Marker_CONTEXT__CORR__mMemberToTMember()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCONTEXT__CORR__mMemberToTMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodInvocationRecursive__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mMember To TMember</em>' reference.
	 * @see #getCONTEXT__CORR__mMemberToTMember()
	 * @generated
	 */
	void setCONTEXT__CORR__mMemberToTMember(MDefinitionToTMember value);

} // MethodInvocationRecursive__Marker
