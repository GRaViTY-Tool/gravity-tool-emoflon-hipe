/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Modifier;

import org.gravity.typegraph.basic.TMethodDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier To TMethod Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.ModifierToTMethodEntity#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.ModifierToTMethodEntity#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getModifierToTMethodEntity()
 * @model
 * @generated
 */
public interface ModifierToTMethodEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Modifier)
	 * @see ModiscoTGG.ModiscoTGGPackage#getModifierToTMethodEntity_Source()
	 * @model
	 * @generated
	 */
	Modifier getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ModifierToTMethodEntity#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Modifier value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getModifierToTMethodEntity_Target()
	 * @model
	 * @generated
	 */
	TMethodDefinition getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ModifierToTMethodEntity#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMethodDefinition value);

} // ModifierToTMethodEntity
