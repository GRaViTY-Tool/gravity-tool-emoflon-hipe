/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Type To Class Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}</li>
 *   <li>{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCREATE__SRC__eParameterizedType <em>CREATE SRC eParameterized Type</em>}</li>
 *   <li>{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__SRC__eType <em>CONTEXT SRC eType</em>}</li>
 *   <li>{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}</li>
 *   <li>{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__TRG__tAbstractType <em>CONTEXT TRG tAbstract Type</em>}</li>
 *   <li>{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__CORR__eModelToPg <em>CONTEXT CORR eModel To Pg</em>}</li>
 *   <li>{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCREATE__CORR__eParameterizedTypeToTAbstractType <em>CREATE CORR eParameterized Type To TAbstract Type</em>}</li>
 *   <li>{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__CORR__eTypeToTAbstractType <em>CONTEXT CORR eType To TAbstract Type</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getParameterizedTypeToClass__Marker()
 * @model
 * @generated
 */
public interface ParameterizedTypeToClass__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eModel</em>' reference.
	 * @see #setCONTEXT__SRC__eModel(Model)
	 * @see ModiscoTGG.ModiscoTGGPackage#getParameterizedTypeToClass__Marker_CONTEXT__SRC__eModel()
	 * @model required="true"
	 * @generated
	 */
	Model getCONTEXT__SRC__eModel();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eModel</em>' reference.
	 * @see #getCONTEXT__SRC__eModel()
	 * @generated
	 */
	void setCONTEXT__SRC__eModel(Model value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC eParameterized Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC eParameterized Type</em>' reference.
	 * @see #setCREATE__SRC__eParameterizedType(ParameterizedType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getParameterizedTypeToClass__Marker_CREATE__SRC__eParameterizedType()
	 * @model required="true"
	 * @generated
	 */
	ParameterizedType getCREATE__SRC__eParameterizedType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCREATE__SRC__eParameterizedType <em>CREATE SRC eParameterized Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC eParameterized Type</em>' reference.
	 * @see #getCREATE__SRC__eParameterizedType()
	 * @generated
	 */
	void setCREATE__SRC__eParameterizedType(ParameterizedType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eType</em>' reference.
	 * @see #setCONTEXT__SRC__eType(Type)
	 * @see ModiscoTGG.ModiscoTGGPackage#getParameterizedTypeToClass__Marker_CONTEXT__SRC__eType()
	 * @model required="true"
	 * @generated
	 */
	Type getCONTEXT__SRC__eType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__SRC__eType <em>CONTEXT SRC eType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eType</em>' reference.
	 * @see #getCONTEXT__SRC__eType()
	 * @generated
	 */
	void setCONTEXT__SRC__eType(Type value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC eType Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC eType Access</em>' reference.
	 * @see #setCREATE__SRC__eTypeAccess(TypeAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getParameterizedTypeToClass__Marker_CREATE__SRC__eTypeAccess()
	 * @model required="true"
	 * @generated
	 */
	TypeAccess getCREATE__SRC__eTypeAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC eType Access</em>' reference.
	 * @see #getCREATE__SRC__eTypeAccess()
	 * @generated
	 */
	void setCREATE__SRC__eTypeAccess(TypeAccess value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #setCONTEXT__TRG__pg(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getParameterizedTypeToClass__Marker_CONTEXT__TRG__pg()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__pg();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #getCONTEXT__TRG__pg()
	 * @generated
	 */
	void setCONTEXT__TRG__pg(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tAbstract Type</em>' reference.
	 * @see #setCONTEXT__TRG__tAbstractType(TAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getParameterizedTypeToClass__Marker_CONTEXT__TRG__tAbstractType()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getCONTEXT__TRG__tAbstractType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__TRG__tAbstractType <em>CONTEXT TRG tAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tAbstract Type</em>' reference.
	 * @see #getCONTEXT__TRG__tAbstractType()
	 * @generated
	 */
	void setCONTEXT__TRG__tAbstractType(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eModel To Pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eModel To Pg</em>' reference.
	 * @see #setCONTEXT__CORR__eModelToPg(ModelToTypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getParameterizedTypeToClass__Marker_CONTEXT__CORR__eModelToPg()
	 * @model required="true"
	 * @generated
	 */
	ModelToTypeGraph getCONTEXT__CORR__eModelToPg();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__CORR__eModelToPg <em>CONTEXT CORR eModel To Pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eModel To Pg</em>' reference.
	 * @see #getCONTEXT__CORR__eModelToPg()
	 * @generated
	 */
	void setCONTEXT__CORR__eModelToPg(ModelToTypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR eParameterized Type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR eParameterized Type To TAbstract Type</em>' reference.
	 * @see #setCREATE__CORR__eParameterizedTypeToTAbstractType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getParameterizedTypeToClass__Marker_CREATE__CORR__eParameterizedTypeToTAbstractType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCREATE__CORR__eParameterizedTypeToTAbstractType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCREATE__CORR__eParameterizedTypeToTAbstractType <em>CREATE CORR eParameterized Type To TAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR eParameterized Type To TAbstract Type</em>' reference.
	 * @see #getCREATE__CORR__eParameterizedTypeToTAbstractType()
	 * @generated
	 */
	void setCREATE__CORR__eParameterizedTypeToTAbstractType(TypeToTAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eType To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eType To TAbstract Type</em>' reference.
	 * @see #setCONTEXT__CORR__eTypeToTAbstractType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getParameterizedTypeToClass__Marker_CONTEXT__CORR__eTypeToTAbstractType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__eTypeToTAbstractType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ParameterizedTypeToClass__Marker#getCONTEXT__CORR__eTypeToTAbstractType <em>CONTEXT CORR eType To TAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eType To TAbstract Type</em>' reference.
	 * @see #getCONTEXT__CORR__eTypeToTAbstractType()
	 * @generated
	 */
	void setCONTEXT__CORR__eTypeToTAbstractType(TypeToTAbstractType value);

} // ParameterizedTypeToClass__Marker
