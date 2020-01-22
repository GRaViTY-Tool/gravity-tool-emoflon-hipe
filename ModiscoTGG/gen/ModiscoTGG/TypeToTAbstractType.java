/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Type;

import org.gravity.typegraph.basic.TAbstractType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type To TAbstract Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.TypeToTAbstractType#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.TypeToTAbstractType#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getTypeToTAbstractType()
 * @model
 * @generated
 */
public interface TypeToTAbstractType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Type)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypeToTAbstractType_Source()
	 * @model
	 * @generated
	 */
	Type getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypeToTAbstractType#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Type value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypeToTAbstractType_Target()
	 * @model
	 * @generated
	 */
	TAbstractType getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypeToTAbstractType#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAbstractType value);

} // TypeToTAbstractType
