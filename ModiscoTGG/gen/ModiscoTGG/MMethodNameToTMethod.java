/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MMethodName;

import org.gravity.typegraph.basic.TMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMethod Name To TMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MMethodNameToTMethod#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.MMethodNameToTMethod#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMMethodNameToTMethod()
 * @model
 * @generated
 */
public interface MMethodNameToTMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MMethodName)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMMethodNameToTMethod_Source()
	 * @model
	 * @generated
	 */
	MMethodName getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MMethodNameToTMethod#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MMethodName value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMethod)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMMethodNameToTMethod_Target()
	 * @model
	 * @generated
	 */
	TMethod getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MMethodNameToTMethod#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMethod value);

} // MMethodNameToTMethod
