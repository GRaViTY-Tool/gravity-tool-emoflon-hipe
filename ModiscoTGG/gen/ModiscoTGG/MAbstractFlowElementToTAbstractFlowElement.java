/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MAbstractFlowElement;

import org.gravity.typegraph.basic.TAbstractFlowElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAbstract Flow Element To TAbstract Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMAbstractFlowElementToTAbstractFlowElement()
 * @model
 * @generated
 */
public interface MAbstractFlowElementToTAbstractFlowElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMAbstractFlowElementToTAbstractFlowElement_Source()
	 * @model
	 * @generated
	 */
	MAbstractFlowElement getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMAbstractFlowElementToTAbstractFlowElement_Target()
	 * @model
	 * @generated
	 */
	TAbstractFlowElement getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAbstractFlowElement value);

} // MAbstractFlowElementToTAbstractFlowElement
