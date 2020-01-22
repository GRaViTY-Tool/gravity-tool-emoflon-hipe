/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MFieldName;

import org.gravity.typegraph.basic.TField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MField Name To TField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MFieldNameToTField#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.MFieldNameToTField#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMFieldNameToTField()
 * @model
 * @generated
 */
public interface MFieldNameToTField extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MFieldName)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMFieldNameToTField_Source()
	 * @model
	 * @generated
	 */
	MFieldName getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MFieldNameToTField#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MFieldName value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TField)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMFieldNameToTField_Target()
	 * @model
	 * @generated
	 */
	TField getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MFieldNameToTField#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TField value);

} // MFieldNameToTField
