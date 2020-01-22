/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MDefinition;

import org.gravity.typegraph.basic.TMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MDefinition To TMember</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MDefinitionToTMember#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.MDefinitionToTMember#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMDefinitionToTMember()
 * @model
 * @generated
 */
public interface MDefinitionToTMember extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMDefinitionToTMember_Source()
	 * @model
	 * @generated
	 */
	MDefinition getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MDefinitionToTMember#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MDefinition value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMDefinitionToTMember_Target()
	 * @model
	 * @generated
	 */
	TMember getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MDefinitionToTMember#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMember value);

} // MDefinitionToTMember
