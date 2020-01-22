/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package To TPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.PackageToTPackage#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.PackageToTPackage#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getPackageToTPackage()
 * @model
 * @generated
 */
public interface PackageToTPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(org.eclipse.modisco.java.Package)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPackageToTPackage_Source()
	 * @model
	 * @generated
	 */
	org.eclipse.modisco.java.Package getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PackageToTPackage#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(org.eclipse.modisco.java.Package value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPackageToTPackage_Target()
	 * @model
	 * @generated
	 */
	TPackage getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PackageToTPackage#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TPackage value);

} // PackageToTPackage
