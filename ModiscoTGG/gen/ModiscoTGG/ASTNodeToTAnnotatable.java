/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.ASTNode;

import org.gravity.typegraph.basic.annotations.TAnnotatable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AST Node To TAnnotatable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.ASTNodeToTAnnotatable#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.ASTNodeToTAnnotatable#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getASTNodeToTAnnotatable()
 * @model
 * @generated
 */
public interface ASTNodeToTAnnotatable extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ASTNode)
	 * @see ModiscoTGG.ModiscoTGGPackage#getASTNodeToTAnnotatable_Source()
	 * @model
	 * @generated
	 */
	ASTNode getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ASTNodeToTAnnotatable#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ASTNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAnnotatable)
	 * @see ModiscoTGG.ModiscoTGGPackage#getASTNodeToTAnnotatable_Target()
	 * @model
	 * @generated
	 */
	TAnnotatable getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ASTNodeToTAnnotatable#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAnnotatable value);

} // ASTNodeToTAnnotatable
