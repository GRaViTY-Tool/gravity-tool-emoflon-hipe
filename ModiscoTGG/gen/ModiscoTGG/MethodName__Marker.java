/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodName;

import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Name Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MethodName__Marker#getCONTEXT__SRC__mModel <em>CONTEXT SRC mModel</em>}</li>
 *   <li>{@link ModiscoTGG.MethodName__Marker#getCREATE__SRC__mName <em>CREATE SRC mName</em>}</li>
 *   <li>{@link ModiscoTGG.MethodName__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.MethodName__Marker#getCREATE__TRG__tName <em>CREATE TRG tName</em>}</li>
 *   <li>{@link ModiscoTGG.MethodName__Marker#getCREATE__CORR__mNameToTName <em>CREATE CORR mName To TName</em>}</li>
 *   <li>{@link ModiscoTGG.MethodName__Marker#getCONTEXT__CORR__modelToPg <em>CONTEXT CORR model To Pg</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMethodName__Marker()
 * @model
 * @generated
 */
public interface MethodName__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mModel</em>' reference.
	 * @see #setCONTEXT__SRC__mModel(MGravityModel)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodName__Marker_CONTEXT__SRC__mModel()
	 * @model required="true"
	 * @generated
	 */
	MGravityModel getCONTEXT__SRC__mModel();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodName__Marker#getCONTEXT__SRC__mModel <em>CONTEXT SRC mModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mModel</em>' reference.
	 * @see #getCONTEXT__SRC__mModel()
	 * @generated
	 */
	void setCONTEXT__SRC__mModel(MGravityModel value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mName</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mName</em>' reference.
	 * @see #setCREATE__SRC__mName(MMethodName)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodName__Marker_CREATE__SRC__mName()
	 * @model required="true"
	 * @generated
	 */
	MMethodName getCREATE__SRC__mName();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodName__Marker#getCREATE__SRC__mName <em>CREATE SRC mName</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mName</em>' reference.
	 * @see #getCREATE__SRC__mName()
	 * @generated
	 */
	void setCREATE__SRC__mName(MMethodName value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #setCONTEXT__TRG__pg(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodName__Marker_CONTEXT__TRG__pg()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__pg();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodName__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #getCONTEXT__TRG__pg()
	 * @generated
	 */
	void setCONTEXT__TRG__pg(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tName</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tName</em>' reference.
	 * @see #setCREATE__TRG__tName(TMethod)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodName__Marker_CREATE__TRG__tName()
	 * @model required="true"
	 * @generated
	 */
	TMethod getCREATE__TRG__tName();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodName__Marker#getCREATE__TRG__tName <em>CREATE TRG tName</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tName</em>' reference.
	 * @see #getCREATE__TRG__tName()
	 * @generated
	 */
	void setCREATE__TRG__tName(TMethod value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mName To TName</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mName To TName</em>' reference.
	 * @see #setCREATE__CORR__mNameToTName(MMethodNameToTMethod)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodName__Marker_CREATE__CORR__mNameToTName()
	 * @model required="true"
	 * @generated
	 */
	MMethodNameToTMethod getCREATE__CORR__mNameToTName();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodName__Marker#getCREATE__CORR__mNameToTName <em>CREATE CORR mName To TName</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mName To TName</em>' reference.
	 * @see #getCREATE__CORR__mNameToTName()
	 * @generated
	 */
	void setCREATE__CORR__mNameToTName(MMethodNameToTMethod value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR model To Pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR model To Pg</em>' reference.
	 * @see #setCONTEXT__CORR__modelToPg(ModelToTypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodName__Marker_CONTEXT__CORR__modelToPg()
	 * @model required="true"
	 * @generated
	 */
	ModelToTypeGraph getCONTEXT__CORR__modelToPg();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodName__Marker#getCONTEXT__CORR__modelToPg <em>CONTEXT CORR model To Pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR model To Pg</em>' reference.
	 * @see #getCONTEXT__CORR__modelToPg()
	 * @generated
	 */
	void setCONTEXT__CORR__modelToPg(ModelToTypeGraph value);

} // MethodName__Marker
