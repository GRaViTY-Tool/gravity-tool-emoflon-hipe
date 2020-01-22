/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Model;

import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model To Type Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.ModelToTypeGraph#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.ModelToTypeGraph#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getModelToTypeGraph()
 * @model
 * @generated
 */
public interface ModelToTypeGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Model)
	 * @see ModiscoTGG.ModiscoTGGPackage#getModelToTypeGraph_Source()
	 * @model
	 * @generated
	 */
	Model getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ModelToTypeGraph#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Model value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getModelToTypeGraph_Target()
	 * @model
	 * @generated
	 */
	TypeGraph getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ModelToTypeGraph#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TypeGraph value);

} // ModelToTypeGraph
