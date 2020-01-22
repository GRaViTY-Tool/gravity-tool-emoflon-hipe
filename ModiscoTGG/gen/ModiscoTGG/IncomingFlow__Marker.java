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
 * A representation of the model object '<em><b>Incoming Flow Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__SRC__mFlow <em>CONTEXT SRC mFlow</em>}</li>
 *   <li>{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__SRC__mSource <em>CONTEXT SRC mSource</em>}</li>
 *   <li>{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__TRG__tFlow <em>CONTEXT TRG tFlow</em>}</li>
 *   <li>{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__TRG__tSource <em>CONTEXT TRG tSource</em>}</li>
 *   <li>{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__CORR__mFlowToTFlow <em>CONTEXT CORR mFlow To TFlow</em>}</li>
 *   <li>{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__CORR__mSourceToTSource <em>CONTEXT CORR mSource To TSource</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getIncomingFlow__Marker()
 * @model
 * @generated
 */
public interface IncomingFlow__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mFlow</em>' reference.
	 * @see #setCONTEXT__SRC__mFlow(MFlow)
	 * @see ModiscoTGG.ModiscoTGGPackage#getIncomingFlow__Marker_CONTEXT__SRC__mFlow()
	 * @model required="true"
	 * @generated
	 */
	MFlow getCONTEXT__SRC__mFlow();

	/**
	 * Sets the value of the '{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__SRC__mFlow <em>CONTEXT SRC mFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mFlow</em>' reference.
	 * @see #getCONTEXT__SRC__mFlow()
	 * @generated
	 */
	void setCONTEXT__SRC__mFlow(MFlow value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mSource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mSource</em>' reference.
	 * @see #setCONTEXT__SRC__mSource(MAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getIncomingFlow__Marker_CONTEXT__SRC__mSource()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElement getCONTEXT__SRC__mSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__SRC__mSource <em>CONTEXT SRC mSource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mSource</em>' reference.
	 * @see #getCONTEXT__SRC__mSource()
	 * @generated
	 */
	void setCONTEXT__SRC__mSource(MAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tFlow</em>' reference.
	 * @see #setCONTEXT__TRG__tFlow(TFlow)
	 * @see ModiscoTGG.ModiscoTGGPackage#getIncomingFlow__Marker_CONTEXT__TRG__tFlow()
	 * @model required="true"
	 * @generated
	 */
	TFlow getCONTEXT__TRG__tFlow();

	/**
	 * Sets the value of the '{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__TRG__tFlow <em>CONTEXT TRG tFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tFlow</em>' reference.
	 * @see #getCONTEXT__TRG__tFlow()
	 * @generated
	 */
	void setCONTEXT__TRG__tFlow(TFlow value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tSource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tSource</em>' reference.
	 * @see #setCONTEXT__TRG__tSource(TAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getIncomingFlow__Marker_CONTEXT__TRG__tSource()
	 * @model required="true"
	 * @generated
	 */
	TAbstractFlowElement getCONTEXT__TRG__tSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__TRG__tSource <em>CONTEXT TRG tSource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tSource</em>' reference.
	 * @see #getCONTEXT__TRG__tSource()
	 * @generated
	 */
	void setCONTEXT__TRG__tSource(TAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mFlow To TFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mFlow To TFlow</em>' reference.
	 * @see #setCONTEXT__CORR__mFlowToTFlow(MFlowToTFlow)
	 * @see ModiscoTGG.ModiscoTGGPackage#getIncomingFlow__Marker_CONTEXT__CORR__mFlowToTFlow()
	 * @model required="true"
	 * @generated
	 */
	MFlowToTFlow getCONTEXT__CORR__mFlowToTFlow();

	/**
	 * Sets the value of the '{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__CORR__mFlowToTFlow <em>CONTEXT CORR mFlow To TFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mFlow To TFlow</em>' reference.
	 * @see #getCONTEXT__CORR__mFlowToTFlow()
	 * @generated
	 */
	void setCONTEXT__CORR__mFlowToTFlow(MFlowToTFlow value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mSource To TSource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mSource To TSource</em>' reference.
	 * @see #setCONTEXT__CORR__mSourceToTSource(MAbstractFlowElementToTAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getIncomingFlow__Marker_CONTEXT__CORR__mSourceToTSource()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElementToTAbstractFlowElement getCONTEXT__CORR__mSourceToTSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.IncomingFlow__Marker#getCONTEXT__CORR__mSourceToTSource <em>CONTEXT CORR mSource To TSource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mSource To TSource</em>' reference.
	 * @see #getCONTEXT__CORR__mSourceToTSource()
	 * @generated
	 */
	void setCONTEXT__CORR__mSourceToTSource(MAbstractFlowElementToTAbstractFlowElement value);

} // IncomingFlow__Marker
