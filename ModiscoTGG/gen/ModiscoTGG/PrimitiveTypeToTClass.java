/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.PrimitiveType;

import org.gravity.typegraph.basic.TClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type To TClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.PrimitiveTypeToTClass#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.PrimitiveTypeToTClass#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getPrimitiveTypeToTClass()
 * @model
 * @generated
 */
public interface PrimitiveTypeToTClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PrimitiveType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPrimitiveTypeToTClass_Source()
	 * @model
	 * @generated
	 */
	PrimitiveType getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PrimitiveTypeToTClass#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPrimitiveTypeToTClass_Target()
	 * @model
	 * @generated
	 */
	TClass getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PrimitiveTypeToTClass#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TClass value);

} // PrimitiveTypeToTClass
