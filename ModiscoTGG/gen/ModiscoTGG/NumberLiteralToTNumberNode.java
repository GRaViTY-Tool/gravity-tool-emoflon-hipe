/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.NumberLiteral;

import org.gravity.typegraph.basic.annotations.TNumberNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Literal To TNumber Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.NumberLiteralToTNumberNode#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.NumberLiteralToTNumberNode#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getNumberLiteralToTNumberNode()
 * @model
 * @generated
 */
public interface NumberLiteralToTNumberNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NumberLiteral)
	 * @see ModiscoTGG.ModiscoTGGPackage#getNumberLiteralToTNumberNode_Source()
	 * @model
	 * @generated
	 */
	NumberLiteral getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.NumberLiteralToTNumberNode#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NumberLiteral value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TNumberNode)
	 * @see ModiscoTGG.ModiscoTGGPackage#getNumberLiteralToTNumberNode_Target()
	 * @model
	 * @generated
	 */
	TNumberNode getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.NumberLiteralToTNumberNode#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TNumberNode value);

} // NumberLiteralToTNumberNode
