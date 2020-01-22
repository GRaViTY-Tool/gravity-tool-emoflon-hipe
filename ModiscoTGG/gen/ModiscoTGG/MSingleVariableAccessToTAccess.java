/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MSingleVariableAccess;

import org.gravity.typegraph.basic.TAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSingle Variable Access To TAccess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MSingleVariableAccessToTAccess#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.MSingleVariableAccessToTAccess#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMSingleVariableAccessToTAccess()
 * @model
 * @generated
 */
public interface MSingleVariableAccessToTAccess extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MSingleVariableAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMSingleVariableAccessToTAccess_Source()
	 * @model
	 * @generated
	 */
	MSingleVariableAccess getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MSingleVariableAccessToTAccess#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MSingleVariableAccess value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMSingleVariableAccessToTAccess_Target()
	 * @model
	 * @generated
	 */
	TAccess getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MSingleVariableAccessToTAccess#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAccess value);

} // MSingleVariableAccessToTAccess
