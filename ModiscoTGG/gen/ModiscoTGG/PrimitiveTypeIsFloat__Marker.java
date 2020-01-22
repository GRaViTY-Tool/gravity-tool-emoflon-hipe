/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.PrimitiveTypeFloat;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Is Float Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}</li>
 *   <li>{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__SRC__ePrimitiveType <em>CREATE SRC ePrimitive Type</em>}</li>
 *   <li>{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__TRG__tPrimitiveClass <em>CREATE TRG tPrimitive Class</em>}</li>
 *   <li>{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}</li>
 *   <li>{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__CORR__typeToTAbstractType <em>CREATE CORR type To TAbstract Type</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getPrimitiveTypeIsFloat__Marker()
 * @model
 * @generated
 */
public interface PrimitiveTypeIsFloat__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eModel</em>' reference.
	 * @see #setCONTEXT__SRC__eModel(Model)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPrimitiveTypeIsFloat__Marker_CONTEXT__SRC__eModel()
	 * @model required="true"
	 * @generated
	 */
	Model getCONTEXT__SRC__eModel();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eModel</em>' reference.
	 * @see #getCONTEXT__SRC__eModel()
	 * @generated
	 */
	void setCONTEXT__SRC__eModel(Model value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC ePrimitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC ePrimitive Type</em>' reference.
	 * @see #setCREATE__SRC__ePrimitiveType(PrimitiveTypeFloat)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPrimitiveTypeIsFloat__Marker_CREATE__SRC__ePrimitiveType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveTypeFloat getCREATE__SRC__ePrimitiveType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__SRC__ePrimitiveType <em>CREATE SRC ePrimitive Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC ePrimitive Type</em>' reference.
	 * @see #getCREATE__SRC__ePrimitiveType()
	 * @generated
	 */
	void setCREATE__SRC__ePrimitiveType(PrimitiveTypeFloat value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tPrimitive Class</em>' reference.
	 * @see #setCREATE__TRG__tPrimitiveClass(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPrimitiveTypeIsFloat__Marker_CREATE__TRG__tPrimitiveClass()
	 * @model required="true"
	 * @generated
	 */
	TClass getCREATE__TRG__tPrimitiveClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__TRG__tPrimitiveClass <em>CREATE TRG tPrimitive Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tPrimitive Class</em>' reference.
	 * @see #getCREATE__TRG__tPrimitiveClass()
	 * @generated
	 */
	void setCREATE__TRG__tPrimitiveClass(TClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #setCONTEXT__TRG__typeGraph(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPrimitiveTypeIsFloat__Marker_CONTEXT__TRG__typeGraph()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__typeGraph();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #getCONTEXT__TRG__typeGraph()
	 * @generated
	 */
	void setCONTEXT__TRG__typeGraph(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eModel To Type Graph</em>' reference.
	 * @see #setCONTEXT__CORR__eModelToTypeGraph(ModelToTypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPrimitiveTypeIsFloat__Marker_CONTEXT__CORR__eModelToTypeGraph()
	 * @model required="true"
	 * @generated
	 */
	ModelToTypeGraph getCONTEXT__CORR__eModelToTypeGraph();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eModel To Type Graph</em>' reference.
	 * @see #getCONTEXT__CORR__eModelToTypeGraph()
	 * @generated
	 */
	void setCONTEXT__CORR__eModelToTypeGraph(ModelToTypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR ePrimitive Type To TPrimitive Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR ePrimitive Type To TPrimitive Class</em>' reference.
	 * @see #setCREATE__CORR__ePrimitiveTypeToTPrimitiveClass(PrimitiveTypeToTClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPrimitiveTypeIsFloat__Marker_CREATE__CORR__ePrimitiveTypeToTPrimitiveClass()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveTypeToTClass getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR ePrimitive Type To TPrimitive Class</em>' reference.
	 * @see #getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass()
	 * @generated
	 */
	void setCREATE__CORR__ePrimitiveTypeToTPrimitiveClass(PrimitiveTypeToTClass value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR type To TAbstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR type To TAbstract Type</em>' reference.
	 * @see #setCREATE__CORR__typeToTAbstractType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPrimitiveTypeIsFloat__Marker_CREATE__CORR__typeToTAbstractType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCREATE__CORR__typeToTAbstractType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PrimitiveTypeIsFloat__Marker#getCREATE__CORR__typeToTAbstractType <em>CREATE CORR type To TAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR type To TAbstract Type</em>' reference.
	 * @see #getCREATE__CORR__typeToTAbstractType()
	 * @generated
	 */
	void setCREATE__CORR__typeToTAbstractType(TypeToTAbstractType value);

} // PrimitiveTypeIsFloat__Marker
