/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MGravityModel;

import org.gravity.typegraph.basic.TypeGraph;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model To Pg Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.ModelToPg__Marker#getCREATE__SRC__mModel <em>CREATE SRC mModel</em>}</li>
 *   <li>{@link ModiscoTGG.ModelToPg__Marker#getCREATE__TRG__tPG <em>CREATE TRG tPG</em>}</li>
 *   <li>{@link ModiscoTGG.ModelToPg__Marker#getCREATE__CORR__mModelToTPG <em>CREATE CORR mModel To TPG</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getModelToPg__Marker()
 * @model
 * @generated
 */
public interface ModelToPg__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC mModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mModel</em>' reference.
	 * @see #setCREATE__SRC__mModel(MGravityModel)
	 * @see ModiscoTGG.ModiscoTGGPackage#getModelToPg__Marker_CREATE__SRC__mModel()
	 * @model required="true"
	 * @generated
	 */
	MGravityModel getCREATE__SRC__mModel();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ModelToPg__Marker#getCREATE__SRC__mModel <em>CREATE SRC mModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mModel</em>' reference.
	 * @see #getCREATE__SRC__mModel()
	 * @generated
	 */
	void setCREATE__SRC__mModel(MGravityModel value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tPG</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tPG</em>' reference.
	 * @see #setCREATE__TRG__tPG(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getModelToPg__Marker_CREATE__TRG__tPG()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCREATE__TRG__tPG();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ModelToPg__Marker#getCREATE__TRG__tPG <em>CREATE TRG tPG</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tPG</em>' reference.
	 * @see #getCREATE__TRG__tPG()
	 * @generated
	 */
	void setCREATE__TRG__tPG(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mModel To TPG</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mModel To TPG</em>' reference.
	 * @see #setCREATE__CORR__mModelToTPG(ModelToTypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getModelToPg__Marker_CREATE__CORR__mModelToTPG()
	 * @model required="true"
	 * @generated
	 */
	ModelToTypeGraph getCREATE__CORR__mModelToTPG();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ModelToPg__Marker#getCREATE__CORR__mModelToTPG <em>CREATE CORR mModel To TPG</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mModel To TPG</em>' reference.
	 * @see #getCREATE__CORR__mModelToTPG()
	 * @generated
	 */
	void setCREATE__CORR__mModelToTPG(ModelToTypeGraph value);

} // ModelToPg__Marker
