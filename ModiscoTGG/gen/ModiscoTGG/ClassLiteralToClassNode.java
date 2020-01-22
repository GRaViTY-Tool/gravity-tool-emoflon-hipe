/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.TypeLiteral;

import org.gravity.typegraph.basic.annotations.TClassNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Literal To Class Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.ClassLiteralToClassNode#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.ClassLiteralToClassNode#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getClassLiteralToClassNode()
 * @model
 * @generated
 */
public interface ClassLiteralToClassNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TypeLiteral)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassLiteralToClassNode_Source()
	 * @model
	 * @generated
	 */
	TypeLiteral getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassLiteralToClassNode#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TypeLiteral value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TClassNode)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassLiteralToClassNode_Target()
	 * @model
	 * @generated
	 */
	TClassNode getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassLiteralToClassNode#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TClassNode value);

} // ClassLiteralToClassNode
