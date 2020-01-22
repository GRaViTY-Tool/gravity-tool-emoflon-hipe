/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MSyntheticMethodDefinition;

import org.gravity.typegraph.basic.TSyntethicMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSyntethic Method To TSyntethic Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MSyntethicMethodToTSyntethicMethod#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.MSyntethicMethodToTSyntethicMethod#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMSyntethicMethodToTSyntethicMethod()
 * @model
 * @generated
 */
public interface MSyntethicMethodToTSyntethicMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MSyntheticMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMSyntethicMethodToTSyntethicMethod_Source()
	 * @model
	 * @generated
	 */
	MSyntheticMethodDefinition getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MSyntethicMethodToTSyntethicMethod#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MSyntheticMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TSyntethicMethod)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMSyntethicMethodToTSyntethicMethod_Target()
	 * @model
	 * @generated
	 */
	TSyntethicMethod getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MSyntethicMethodToTSyntethicMethod#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TSyntethicMethod value);

} // MSyntethicMethodToTSyntethicMethod
