/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.BooleanLiteral;

import org.gravity.typegraph.basic.annotations.TBoolNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal To TBool Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.BooleanLiteralToTBoolNode#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.BooleanLiteralToTBoolNode#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getBooleanLiteralToTBoolNode()
 * @model
 * @generated
 */
public interface BooleanLiteralToTBoolNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(BooleanLiteral)
	 * @see ModiscoTGG.ModiscoTGGPackage#getBooleanLiteralToTBoolNode_Source()
	 * @model
	 * @generated
	 */
	BooleanLiteral getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.BooleanLiteralToTBoolNode#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(BooleanLiteral value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TBoolNode)
	 * @see ModiscoTGG.ModiscoTGGPackage#getBooleanLiteralToTBoolNode_Target()
	 * @model
	 * @generated
	 */
	TBoolNode getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.BooleanLiteralToTBoolNode#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TBoolNode value);

} // BooleanLiteralToTBoolNode
