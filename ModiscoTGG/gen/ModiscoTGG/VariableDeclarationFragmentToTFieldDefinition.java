/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.VariableDeclarationFragment;

import org.gravity.typegraph.basic.TFieldDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Fragment To TField Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getVariableDeclarationFragmentToTFieldDefinition()
 * @model
 * @generated
 */
public interface VariableDeclarationFragmentToTFieldDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(VariableDeclarationFragment)
	 * @see ModiscoTGG.ModiscoTGGPackage#getVariableDeclarationFragmentToTFieldDefinition_Source()
	 * @model
	 * @generated
	 */
	VariableDeclarationFragment getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(VariableDeclarationFragment value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TFieldDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getVariableDeclarationFragmentToTFieldDefinition_Target()
	 * @model
	 * @generated
	 */
	TFieldDefinition getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TFieldDefinition value);

} // VariableDeclarationFragmentToTFieldDefinition
