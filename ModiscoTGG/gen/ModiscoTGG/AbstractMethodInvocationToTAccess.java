/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AbstractMethodInvocation;

import org.gravity.typegraph.basic.TAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Method Invocation To TAccess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.AbstractMethodInvocationToTAccess#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.AbstractMethodInvocationToTAccess#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getAbstractMethodInvocationToTAccess()
 * @model
 * @generated
 */
public interface AbstractMethodInvocationToTAccess extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractMethodInvocation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAbstractMethodInvocationToTAccess_Source()
	 * @model
	 * @generated
	 */
	AbstractMethodInvocation getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AbstractMethodInvocationToTAccess#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractMethodInvocation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAbstractMethodInvocationToTAccess_Target()
	 * @model
	 * @generated
	 */
	TAccess getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AbstractMethodInvocationToTAccess#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAccess value);

} // AbstractMethodInvocationToTAccess
