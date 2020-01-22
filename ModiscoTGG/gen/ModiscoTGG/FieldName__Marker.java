/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MGravityModel;

import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Name Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.FieldName__Marker#getCREATE__SRC__mFieldName <em>CREATE SRC mField Name</em>}</li>
 *   <li>{@link ModiscoTGG.FieldName__Marker#getCONTEXT__SRC__model <em>CONTEXT SRC model</em>}</li>
 *   <li>{@link ModiscoTGG.FieldName__Marker#getCREATE__TRG__tField <em>CREATE TRG tField</em>}</li>
 *   <li>{@link ModiscoTGG.FieldName__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.FieldName__Marker#getCREATE__CORR__eFieldDeclarationToTField <em>CREATE CORR eField Declaration To TField</em>}</li>
 *   <li>{@link ModiscoTGG.FieldName__Marker#getCONTEXT__CORR__modelToTypeGraph <em>CONTEXT CORR model To Type Graph</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getFieldName__Marker()
 * @model
 * @generated
 */
public interface FieldName__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC mField Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mField Name</em>' reference.
	 * @see #setCREATE__SRC__mFieldName(MFieldName)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldName__Marker_CREATE__SRC__mFieldName()
	 * @model required="true"
	 * @generated
	 */
	MFieldName getCREATE__SRC__mFieldName();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldName__Marker#getCREATE__SRC__mFieldName <em>CREATE SRC mField Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mField Name</em>' reference.
	 * @see #getCREATE__SRC__mFieldName()
	 * @generated
	 */
	void setCREATE__SRC__mFieldName(MFieldName value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC model</em>' reference.
	 * @see #setCONTEXT__SRC__model(MGravityModel)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldName__Marker_CONTEXT__SRC__model()
	 * @model required="true"
	 * @generated
	 */
	MGravityModel getCONTEXT__SRC__model();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldName__Marker#getCONTEXT__SRC__model <em>CONTEXT SRC model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC model</em>' reference.
	 * @see #getCONTEXT__SRC__model()
	 * @generated
	 */
	void setCONTEXT__SRC__model(MGravityModel value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tField</em>' reference.
	 * @see #setCREATE__TRG__tField(TField)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldName__Marker_CREATE__TRG__tField()
	 * @model required="true"
	 * @generated
	 */
	TField getCREATE__TRG__tField();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldName__Marker#getCREATE__TRG__tField <em>CREATE TRG tField</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tField</em>' reference.
	 * @see #getCREATE__TRG__tField()
	 * @generated
	 */
	void setCREATE__TRG__tField(TField value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #setCONTEXT__TRG__typeGraph(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldName__Marker_CONTEXT__TRG__typeGraph()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__typeGraph();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldName__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #getCONTEXT__TRG__typeGraph()
	 * @generated
	 */
	void setCONTEXT__TRG__typeGraph(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR eField Declaration To TField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR eField Declaration To TField</em>' reference.
	 * @see #setCREATE__CORR__eFieldDeclarationToTField(MFieldNameToTField)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldName__Marker_CREATE__CORR__eFieldDeclarationToTField()
	 * @model required="true"
	 * @generated
	 */
	MFieldNameToTField getCREATE__CORR__eFieldDeclarationToTField();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldName__Marker#getCREATE__CORR__eFieldDeclarationToTField <em>CREATE CORR eField Declaration To TField</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR eField Declaration To TField</em>' reference.
	 * @see #getCREATE__CORR__eFieldDeclarationToTField()
	 * @generated
	 */
	void setCREATE__CORR__eFieldDeclarationToTField(MFieldNameToTField value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR model To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR model To Type Graph</em>' reference.
	 * @see #setCONTEXT__CORR__modelToTypeGraph(ModelToTypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldName__Marker_CONTEXT__CORR__modelToTypeGraph()
	 * @model required="true"
	 * @generated
	 */
	ModelToTypeGraph getCONTEXT__CORR__modelToTypeGraph();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldName__Marker#getCONTEXT__CORR__modelToTypeGraph <em>CONTEXT CORR model To Type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR model To Type Graph</em>' reference.
	 * @see #getCONTEXT__CORR__modelToTypeGraph()
	 * @generated
	 */
	void setCONTEXT__CORR__modelToTypeGraph(ModelToTypeGraph value);

} // FieldName__Marker
