/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Type;

import org.gravity.typegraph.basic.TCall;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Type To Access Static Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.StaticTypeToAccessStaticType#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.StaticTypeToAccessStaticType#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getStaticTypeToAccessStaticType()
 * @model
 * @generated
 */
public interface StaticTypeToAccessStaticType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Type)
	 * @see ModiscoTGG.ModiscoTGGPackage#getStaticTypeToAccessStaticType_Source()
	 * @model
	 * @generated
	 */
	Type getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.StaticTypeToAccessStaticType#getSource <em>Source</em>}' reference.
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
	 * @see #setTarget(TCall)
	 * @see ModiscoTGG.ModiscoTGGPackage#getStaticTypeToAccessStaticType_Target()
	 * @model
	 * @generated
	 */
	TCall getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.StaticTypeToAccessStaticType#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TCall value);

} // StaticTypeToAccessStaticType
