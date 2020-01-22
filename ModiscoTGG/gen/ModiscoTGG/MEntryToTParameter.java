/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MEntry;

import org.gravity.typegraph.basic.TParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEntry To TParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MEntryToTParameter#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.MEntryToTParameter#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMEntryToTParameter()
 * @model
 * @generated
 */
public interface MEntryToTParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MEntry)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMEntryToTParameter_Source()
	 * @model
	 * @generated
	 */
	MEntry getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MEntryToTParameter#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MEntry value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TParameter)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMEntryToTParameter_Target()
	 * @model
	 * @generated
	 */
	TParameter getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MEntryToTParameter#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TParameter value);

} // MEntryToTParameter
