/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.InterfaceDeclaration;

import org.gravity.typegraph.basic.TInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Declaration To TInterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.InterfaceDeclarationToTInterface#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.InterfaceDeclarationToTInterface#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getInterfaceDeclarationToTInterface()
 * @model
 * @generated
 */
public interface InterfaceDeclarationToTInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(InterfaceDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getInterfaceDeclarationToTInterface_Source()
	 * @model
	 * @generated
	 */
	InterfaceDeclaration getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.InterfaceDeclarationToTInterface#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(InterfaceDeclaration value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TInterface)
	 * @see ModiscoTGG.ModiscoTGGPackage#getInterfaceDeclarationToTInterface_Target()
	 * @model
	 * @generated
	 */
	TInterface getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.InterfaceDeclarationToTInterface#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TInterface value);

} // InterfaceDeclarationToTInterface
