/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Modifier;

import org.gravity.typegraph.basic.TModifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MModifier To TModifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MModifierToTModifier#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.MModifierToTModifier#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMModifierToTModifier()
 * @model
 * @generated
 */
public interface MModifierToTModifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Modifier)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMModifierToTModifier_Source()
	 * @model
	 * @generated
	 */
	Modifier getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MModifierToTModifier#getSource <em>Source</em>}' reference.
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
	 * @see #setTarget(TModifier)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMModifierToTModifier_Target()
	 * @model
	 * @generated
	 */
	TModifier getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MModifierToTModifier#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TModifier value);

} // MModifierToTModifier
