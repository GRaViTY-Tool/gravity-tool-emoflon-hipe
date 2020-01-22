/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MFlow;

import org.gravity.typegraph.basic.TFlow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFlow To TFlow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MFlowToTFlow#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.MFlowToTFlow#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMFlowToTFlow()
 * @model
 * @generated
 */
public interface MFlowToTFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MFlow)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMFlowToTFlow_Source()
	 * @model
	 * @generated
	 */
	MFlow getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MFlowToTFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MFlow value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TFlow)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMFlowToTFlow_Target()
	 * @model
	 * @generated
	 */
	TFlow getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MFlowToTFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TFlow value);

} // MFlowToTFlow
