/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MFlow;

import org.gravity.typegraph.basic.TAbstractFlowElement;
import org.gravity.typegraph.basic.TFlow;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outgoing Flow Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__SRC__mFlow <em>CONTEXT SRC mFlow</em>}</li>
 *   <li>{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__SRC__mTarget <em>CONTEXT SRC mTarget</em>}</li>
 *   <li>{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__TRG__tFlow <em>CONTEXT TRG tFlow</em>}</li>
 *   <li>{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__TRG__tTarget <em>CONTEXT TRG tTarget</em>}</li>
 *   <li>{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__CORR__mFlowToTFlow <em>CONTEXT CORR mFlow To TFlow</em>}</li>
 *   <li>{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__CORR__mTargetToTTarget <em>CONTEXT CORR mTarget To TTarget</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getOutgoingFlow__Marker()
 * @model
 * @generated
 */
public interface OutgoingFlow__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mFlow</em>' reference.
	 * @see #setCONTEXT__SRC__mFlow(MFlow)
	 * @see ModiscoTGG.ModiscoTGGPackage#getOutgoingFlow__Marker_CONTEXT__SRC__mFlow()
	 * @model required="true"
	 * @generated
	 */
	MFlow getCONTEXT__SRC__mFlow();

	/**
	 * Sets the value of the '{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__SRC__mFlow <em>CONTEXT SRC mFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mFlow</em>' reference.
	 * @see #getCONTEXT__SRC__mFlow()
	 * @generated
	 */
	void setCONTEXT__SRC__mFlow(MFlow value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mTarget</em>' reference.
	 * @see #setCONTEXT__SRC__mTarget(MAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getOutgoingFlow__Marker_CONTEXT__SRC__mTarget()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElement getCONTEXT__SRC__mTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__SRC__mTarget <em>CONTEXT SRC mTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mTarget</em>' reference.
	 * @see #getCONTEXT__SRC__mTarget()
	 * @generated
	 */
	void setCONTEXT__SRC__mTarget(MAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tFlow</em>' reference.
	 * @see #setCONTEXT__TRG__tFlow(TFlow)
	 * @see ModiscoTGG.ModiscoTGGPackage#getOutgoingFlow__Marker_CONTEXT__TRG__tFlow()
	 * @model required="true"
	 * @generated
	 */
	TFlow getCONTEXT__TRG__tFlow();

	/**
	 * Sets the value of the '{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__TRG__tFlow <em>CONTEXT TRG tFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tFlow</em>' reference.
	 * @see #getCONTEXT__TRG__tFlow()
	 * @generated
	 */
	void setCONTEXT__TRG__tFlow(TFlow value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tTarget</em>' reference.
	 * @see #setCONTEXT__TRG__tTarget(TAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getOutgoingFlow__Marker_CONTEXT__TRG__tTarget()
	 * @model required="true"
	 * @generated
	 */
	TAbstractFlowElement getCONTEXT__TRG__tTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__TRG__tTarget <em>CONTEXT TRG tTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tTarget</em>' reference.
	 * @see #getCONTEXT__TRG__tTarget()
	 * @generated
	 */
	void setCONTEXT__TRG__tTarget(TAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mFlow To TFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mFlow To TFlow</em>' reference.
	 * @see #setCONTEXT__CORR__mFlowToTFlow(MFlowToTFlow)
	 * @see ModiscoTGG.ModiscoTGGPackage#getOutgoingFlow__Marker_CONTEXT__CORR__mFlowToTFlow()
	 * @model required="true"
	 * @generated
	 */
	MFlowToTFlow getCONTEXT__CORR__mFlowToTFlow();

	/**
	 * Sets the value of the '{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__CORR__mFlowToTFlow <em>CONTEXT CORR mFlow To TFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mFlow To TFlow</em>' reference.
	 * @see #getCONTEXT__CORR__mFlowToTFlow()
	 * @generated
	 */
	void setCONTEXT__CORR__mFlowToTFlow(MFlowToTFlow value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mTarget To TTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mTarget To TTarget</em>' reference.
	 * @see #setCONTEXT__CORR__mTargetToTTarget(MAbstractFlowElementToTAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getOutgoingFlow__Marker_CONTEXT__CORR__mTargetToTTarget()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElementToTAbstractFlowElement getCONTEXT__CORR__mTargetToTTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.OutgoingFlow__Marker#getCONTEXT__CORR__mTargetToTTarget <em>CONTEXT CORR mTarget To TTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mTarget To TTarget</em>' reference.
	 * @see #getCONTEXT__CORR__mTargetToTTarget()
	 * @generated
	 */
	void setCONTEXT__CORR__mTargetToTTarget(MAbstractFlowElementToTAbstractFlowElement value);

} // OutgoingFlow__Marker
