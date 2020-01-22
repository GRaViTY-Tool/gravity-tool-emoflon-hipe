/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.StringLiteral;

import org.gravity.typegraph.basic.annotations.TTextNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal To TText Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.StringLiteralToTTextNode#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.StringLiteralToTTextNode#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getStringLiteralToTTextNode()
 * @model
 * @generated
 */
public interface StringLiteralToTTextNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(StringLiteral)
	 * @see ModiscoTGG.ModiscoTGGPackage#getStringLiteralToTTextNode_Source()
	 * @model
	 * @generated
	 */
	StringLiteral getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.StringLiteralToTTextNode#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StringLiteral value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TTextNode)
	 * @see ModiscoTGG.ModiscoTGGPackage#getStringLiteralToTTextNode_Target()
	 * @model
	 * @generated
	 */
	TTextNode getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.StringLiteralToTTextNode#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TTextNode value);

} // StringLiteralToTTextNode
