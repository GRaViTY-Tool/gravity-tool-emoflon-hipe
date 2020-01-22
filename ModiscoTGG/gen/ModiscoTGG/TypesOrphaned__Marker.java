/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Model;

import org.gravity.modisco.MClass;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Orphaned Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.TypesOrphaned__Marker#getCONTEXT__SRC__mModel <em>CONTEXT SRC mModel</em>}</li>
 *   <li>{@link ModiscoTGG.TypesOrphaned__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.TypesOrphaned__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.TypesOrphaned__Marker#getCREATE__TRG__tType <em>CREATE TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.TypesOrphaned__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.TypesOrphaned__Marker#getCONTEXT__CORR__mModelToTypeGraph <em>CONTEXT CORR mModel To Type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.TypesOrphaned__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getTypesOrphaned__Marker()
 * @model
 * @generated
 */
public interface TypesOrphaned__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mModel</em>' reference.
	 * @see #setCONTEXT__SRC__mModel(Model)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesOrphaned__Marker_CONTEXT__SRC__mModel()
	 * @model required="true"
	 * @generated
	 */
	Model getCONTEXT__SRC__mModel();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesOrphaned__Marker#getCONTEXT__SRC__mModel <em>CONTEXT SRC mModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mModel</em>' reference.
	 * @see #getCONTEXT__SRC__mModel()
	 * @generated
	 */
	void setCONTEXT__SRC__mModel(Model value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mType</em>' reference.
	 * @see #setCREATE__SRC__mType(MClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesOrphaned__Marker_CREATE__SRC__mType()
	 * @model required="true"
	 * @generated
	 */
	MClass getCREATE__SRC__mType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesOrphaned__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mType</em>' reference.
	 * @see #getCREATE__SRC__mType()
	 * @generated
	 */
	void setCREATE__SRC__mType(MClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #setCONTEXT__TRG__pg(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesOrphaned__Marker_CONTEXT__TRG__pg()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__pg();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesOrphaned__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #getCONTEXT__TRG__pg()
	 * @generated
	 */
	void setCONTEXT__TRG__pg(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tType</em>' reference.
	 * @see #setCREATE__TRG__tType(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesOrphaned__Marker_CREATE__TRG__tType()
	 * @model required="true"
	 * @generated
	 */
	TClass getCREATE__TRG__tType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesOrphaned__Marker#getCREATE__TRG__tType <em>CREATE TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tType</em>' reference.
	 * @see #getCREATE__TRG__tType()
	 * @generated
	 */
	void setCREATE__TRG__tType(TClass value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mBody To TAnnotation</em>' reference.
	 * @see #setCREATE__CORR__mBodyToTAnnotation(ASTNodeToTAnnotatable)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesOrphaned__Marker_CREATE__CORR__mBodyToTAnnotation()
	 * @model required="true"
	 * @generated
	 */
	ASTNodeToTAnnotatable getCREATE__CORR__mBodyToTAnnotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesOrphaned__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mBody To TAnnotation</em>' reference.
	 * @see #getCREATE__CORR__mBodyToTAnnotation()
	 * @generated
	 */
	void setCREATE__CORR__mBodyToTAnnotation(ASTNodeToTAnnotatable value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mModel To Type Graph</em>' reference.
	 * @see #setCONTEXT__CORR__mModelToTypeGraph(ModelToTypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesOrphaned__Marker_CONTEXT__CORR__mModelToTypeGraph()
	 * @model required="true"
	 * @generated
	 */
	ModelToTypeGraph getCONTEXT__CORR__mModelToTypeGraph();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesOrphaned__Marker#getCONTEXT__CORR__mModelToTypeGraph <em>CONTEXT CORR mModel To Type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mModel To Type Graph</em>' reference.
	 * @see #getCONTEXT__CORR__mModelToTypeGraph()
	 * @generated
	 */
	void setCONTEXT__CORR__mModelToTypeGraph(ModelToTypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mType To TType</em>' reference.
	 * @see #setCREATE__CORR__mTypeToTType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesOrphaned__Marker_CREATE__CORR__mTypeToTType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCREATE__CORR__mTypeToTType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesOrphaned__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mType To TType</em>' reference.
	 * @see #getCREATE__CORR__mTypeToTType()
	 * @generated
	 */
	void setCREATE__CORR__mTypeToTType(TypeToTAbstractType value);

} // TypesOrphaned__Marker
