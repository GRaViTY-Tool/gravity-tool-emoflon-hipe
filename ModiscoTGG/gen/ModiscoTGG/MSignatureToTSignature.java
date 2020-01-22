/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MSignature;

import org.gravity.typegraph.basic.TSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSignature To TSignature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MSignatureToTSignature#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.MSignatureToTSignature#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMSignatureToTSignature()
 * @model
 * @generated
 */
public interface MSignatureToTSignature extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMSignatureToTSignature_Source()
	 * @model
	 * @generated
	 */
	MSignature getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MSignatureToTSignature#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MSignature value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMSignatureToTSignature_Target()
	 * @model
	 * @generated
	 */
	TSignature getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MSignatureToTSignature#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TSignature value);

} // MSignatureToTSignature
