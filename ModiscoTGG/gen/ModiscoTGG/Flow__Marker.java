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
 * A representation of the model object '<em><b>Flow Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.Flow__Marker#getCREATE__SRC__mFlow <em>CREATE SRC mFlow</em>}</li>
 *   <li>{@link ModiscoTGG.Flow__Marker#getCONTEXT__SRC__mOwner <em>CONTEXT SRC mOwner</em>}</li>
 *   <li>{@link ModiscoTGG.Flow__Marker#getCREATE__TRG__tFlow <em>CREATE TRG tFlow</em>}</li>
 *   <li>{@link ModiscoTGG.Flow__Marker#getCONTEXT__TRG__tOwner <em>CONTEXT TRG tOwner</em>}</li>
 *   <li>{@link ModiscoTGG.Flow__Marker#getCREATE__CORR__mFlowToTFlow <em>CREATE CORR mFlow To TFlow</em>}</li>
 *   <li>{@link ModiscoTGG.Flow__Marker#getCONTEXT__CORR__mOwnerToTOwner <em>CONTEXT CORR mOwner To TOwner</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getFlow__Marker()
 * @model
 * @generated
 */
public interface Flow__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC mFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mFlow</em>' reference.
	 * @see #setCREATE__SRC__mFlow(MFlow)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFlow__Marker_CREATE__SRC__mFlow()
	 * @model required="true"
	 * @generated
	 */
	MFlow getCREATE__SRC__mFlow();

	/**
	 * Sets the value of the '{@link ModiscoTGG.Flow__Marker#getCREATE__SRC__mFlow <em>CREATE SRC mFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mFlow</em>' reference.
	 * @see #getCREATE__SRC__mFlow()
	 * @generated
	 */
	void setCREATE__SRC__mFlow(MFlow value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mOwner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mOwner</em>' reference.
	 * @see #setCONTEXT__SRC__mOwner(MAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFlow__Marker_CONTEXT__SRC__mOwner()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElement getCONTEXT__SRC__mOwner();

	/**
	 * Sets the value of the '{@link ModiscoTGG.Flow__Marker#getCONTEXT__SRC__mOwner <em>CONTEXT SRC mOwner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mOwner</em>' reference.
	 * @see #getCONTEXT__SRC__mOwner()
	 * @generated
	 */
	void setCONTEXT__SRC__mOwner(MAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tFlow</em>' reference.
	 * @see #setCREATE__TRG__tFlow(TFlow)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFlow__Marker_CREATE__TRG__tFlow()
	 * @model required="true"
	 * @generated
	 */
	TFlow getCREATE__TRG__tFlow();

	/**
	 * Sets the value of the '{@link ModiscoTGG.Flow__Marker#getCREATE__TRG__tFlow <em>CREATE TRG tFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tFlow</em>' reference.
	 * @see #getCREATE__TRG__tFlow()
	 * @generated
	 */
	void setCREATE__TRG__tFlow(TFlow value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tOwner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tOwner</em>' reference.
	 * @see #setCONTEXT__TRG__tOwner(TAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFlow__Marker_CONTEXT__TRG__tOwner()
	 * @model required="true"
	 * @generated
	 */
	TAbstractFlowElement getCONTEXT__TRG__tOwner();

	/**
	 * Sets the value of the '{@link ModiscoTGG.Flow__Marker#getCONTEXT__TRG__tOwner <em>CONTEXT TRG tOwner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tOwner</em>' reference.
	 * @see #getCONTEXT__TRG__tOwner()
	 * @generated
	 */
	void setCONTEXT__TRG__tOwner(TAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mFlow To TFlow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mFlow To TFlow</em>' reference.
	 * @see #setCREATE__CORR__mFlowToTFlow(MFlowToTFlow)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFlow__Marker_CREATE__CORR__mFlowToTFlow()
	 * @model required="true"
	 * @generated
	 */
	MFlowToTFlow getCREATE__CORR__mFlowToTFlow();

	/**
	 * Sets the value of the '{@link ModiscoTGG.Flow__Marker#getCREATE__CORR__mFlowToTFlow <em>CREATE CORR mFlow To TFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mFlow To TFlow</em>' reference.
	 * @see #getCREATE__CORR__mFlowToTFlow()
	 * @generated
	 */
	void setCREATE__CORR__mFlowToTFlow(MFlowToTFlow value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mOwner To TOwner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mOwner To TOwner</em>' reference.
	 * @see #setCONTEXT__CORR__mOwnerToTOwner(MAbstractFlowElementToTAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFlow__Marker_CONTEXT__CORR__mOwnerToTOwner()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElementToTAbstractFlowElement getCONTEXT__CORR__mOwnerToTOwner();

	/**
	 * Sets the value of the '{@link ModiscoTGG.Flow__Marker#getCONTEXT__CORR__mOwnerToTOwner <em>CONTEXT CORR mOwner To TOwner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mOwner To TOwner</em>' reference.
	 * @see #getCONTEXT__CORR__mOwnerToTOwner()
	 * @generated
	 */
	void setCONTEXT__CORR__mOwnerToTOwner(MAbstractFlowElementToTAbstractFlowElement value);

} // Flow__Marker
