/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type To Class Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.ArrayTypeToClass__Marker#getCREATE__SRC__eArrayType <em>CREATE SRC eArray Type</em>}</li>
 *   <li>{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}</li>
 *   <li>{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__SRC__eType <em>CONTEXT SRC eType</em>}</li>
 *   <li>{@link ModiscoTGG.ArrayTypeToClass__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}</li>
 *   <li>{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__TRG__tArrayClass <em>CONTEXT TRG tArray Class</em>}</li>
 *   <li>{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.ArrayTypeToClass__Marker#getCREATE__CORR__eArrayTypeToTArrayClass <em>CREATE CORR eArray Type To TArray Class</em>}</li>
 *   <li>{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__CORR__eTypeToTArrayClass <em>CONTEXT CORR eType To TArray Class</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getArrayTypeToClass__Marker()
 * @model
 * @generated
 */
public interface ArrayTypeToClass__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC eArray Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC eArray Type</em>' reference.
	 * @see #setCREATE__SRC__eArrayType(ArrayType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getArrayTypeToClass__Marker_CREATE__SRC__eArrayType()
	 * @model required="true"
	 * @generated
	 */
	ArrayType getCREATE__SRC__eArrayType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCREATE__SRC__eArrayType <em>CREATE SRC eArray Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC eArray Type</em>' reference.
	 * @see #getCREATE__SRC__eArrayType()
	 * @generated
	 */
	void setCREATE__SRC__eArrayType(ArrayType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eModel</em>' reference.
	 * @see #setCONTEXT__SRC__eModel(Model)
	 * @see ModiscoTGG.ModiscoTGGPackage#getArrayTypeToClass__Marker_CONTEXT__SRC__eModel()
	 * @model required="true"
	 * @generated
	 */
	Model getCONTEXT__SRC__eModel();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eModel</em>' reference.
	 * @see #getCONTEXT__SRC__eModel()
	 * @generated
	 */
	void setCONTEXT__SRC__eModel(Model value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eType</em>' reference.
	 * @see #setCONTEXT__SRC__eType(Type)
	 * @see ModiscoTGG.ModiscoTGGPackage#getArrayTypeToClass__Marker_CONTEXT__SRC__eType()
	 * @model required="true"
	 * @generated
	 */
	Type getCONTEXT__SRC__eType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__SRC__eType <em>CONTEXT SRC eType</em>}' reference.
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
	 * @see ModiscoTGG.ModiscoTGGPackage#getArrayTypeToClass__Marker_CREATE__SRC__eTypeAccess()
	 * @model required="true"
	 * @generated
	 */
	TypeAccess getCREATE__SRC__eTypeAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC eType Access</em>' reference.
	 * @see #getCREATE__SRC__eTypeAccess()
	 * @generated
	 */
	void setCREATE__SRC__eTypeAccess(TypeAccess value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tArray Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tArray Class</em>' reference.
	 * @see #setCONTEXT__TRG__tArrayClass(TAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getArrayTypeToClass__Marker_CONTEXT__TRG__tArrayClass()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getCONTEXT__TRG__tArrayClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__TRG__tArrayClass <em>CONTEXT TRG tArray Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tArray Class</em>' reference.
	 * @see #getCONTEXT__TRG__tArrayClass()
	 * @generated
	 */
	void setCONTEXT__TRG__tArrayClass(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #setCONTEXT__TRG__typeGraph(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getArrayTypeToClass__Marker_CONTEXT__TRG__typeGraph()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__typeGraph();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #getCONTEXT__TRG__typeGraph()
	 * @generated
	 */
	void setCONTEXT__TRG__typeGraph(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR eArray Type To TArray Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR eArray Type To TArray Class</em>' reference.
	 * @see #setCREATE__CORR__eArrayTypeToTArrayClass(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getArrayTypeToClass__Marker_CREATE__CORR__eArrayTypeToTArrayClass()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCREATE__CORR__eArrayTypeToTArrayClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCREATE__CORR__eArrayTypeToTArrayClass <em>CREATE CORR eArray Type To TArray Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR eArray Type To TArray Class</em>' reference.
	 * @see #getCREATE__CORR__eArrayTypeToTArrayClass()
	 * @generated
	 */
	void setCREATE__CORR__eArrayTypeToTArrayClass(TypeToTAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eModel To Type Graph</em>' reference.
	 * @see #setCONTEXT__CORR__eModelToTypeGraph(ModelToTypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getArrayTypeToClass__Marker_CONTEXT__CORR__eModelToTypeGraph()
	 * @model required="true"
	 * @generated
	 */
	ModelToTypeGraph getCONTEXT__CORR__eModelToTypeGraph();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eModel To Type Graph</em>' reference.
	 * @see #getCONTEXT__CORR__eModelToTypeGraph()
	 * @generated
	 */
	void setCONTEXT__CORR__eModelToTypeGraph(ModelToTypeGraph value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eType To TArray Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eType To TArray Class</em>' reference.
	 * @see #setCONTEXT__CORR__eTypeToTArrayClass(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getArrayTypeToClass__Marker_CONTEXT__CORR__eTypeToTArrayClass()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__eTypeToTArrayClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ArrayTypeToClass__Marker#getCONTEXT__CORR__eTypeToTArrayClass <em>CONTEXT CORR eType To TArray Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eType To TArray Class</em>' reference.
	 * @see #getCONTEXT__CORR__eTypeToTArrayClass()
	 * @generated
	 */
	void setCONTEXT__CORR__eTypeToTArrayClass(TypeToTAbstractType value);

} // ArrayTypeToClass__Marker
