/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.UnresolvedTypeDeclaration;

import org.gravity.typegraph.basic.TClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unresolved Type Declaration To TClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.UnresolvedTypeDeclarationToTClass#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.UnresolvedTypeDeclarationToTClass#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getUnresolvedTypeDeclarationToTClass()
 * @model
 * @generated
 */
public interface UnresolvedTypeDeclarationToTClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(UnresolvedTypeDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getUnresolvedTypeDeclarationToTClass_Source()
	 * @model
	 * @generated
	 */
	UnresolvedTypeDeclaration getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.UnresolvedTypeDeclarationToTClass#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(UnresolvedTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getUnresolvedTypeDeclarationToTClass_Target()
	 * @model
	 * @generated
	 */
	TClass getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.UnresolvedTypeDeclarationToTClass#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TClass value);

} // UnresolvedTypeDeclarationToTClass
