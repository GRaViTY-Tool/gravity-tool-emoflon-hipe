/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Model;

import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package To PG Package Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.PackageToPGPackage__Marker#getCONTEXT__SRC__mModel <em>CONTEXT SRC mModel</em>}</li>
 *   <li>{@link ModiscoTGG.PackageToPGPackage__Marker#getCREATE__SRC__mPackage <em>CREATE SRC mPackage</em>}</li>
 *   <li>{@link ModiscoTGG.PackageToPGPackage__Marker#getCREATE__TRG__tPackage <em>CREATE TRG tPackage</em>}</li>
 *   <li>{@link ModiscoTGG.PackageToPGPackage__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.PackageToPGPackage__Marker#getCONTEXT__CORR__mModelToTypeGraph <em>CONTEXT CORR mModel To Type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.PackageToPGPackage__Marker#getCREATE__CORR__mPackageToTPackage <em>CREATE CORR mPackage To TPackage</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getPackageToPGPackage__Marker()
 * @model
 * @generated
 */
public interface PackageToPGPackage__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mModel</em>' reference.
	 * @see #setCONTEXT__SRC__mModel(Model)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPackageToPGPackage__Marker_CONTEXT__SRC__mModel()
	 * @model required="true"
	 * @generated
	 */
	Model getCONTEXT__SRC__mModel();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PackageToPGPackage__Marker#getCONTEXT__SRC__mModel <em>CONTEXT SRC mModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mModel</em>' reference.
	 * @see #getCONTEXT__SRC__mModel()
	 * @generated
	 */
	void setCONTEXT__SRC__mModel(Model value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mPackage</em>' reference.
	 * @see #setCREATE__SRC__mPackage(org.eclipse.modisco.java.Package)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPackageToPGPackage__Marker_CREATE__SRC__mPackage()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.modisco.java.Package getCREATE__SRC__mPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PackageToPGPackage__Marker#getCREATE__SRC__mPackage <em>CREATE SRC mPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mPackage</em>' reference.
	 * @see #getCREATE__SRC__mPackage()
	 * @generated
	 */
	void setCREATE__SRC__mPackage(org.eclipse.modisco.java.Package value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tPackage</em>' reference.
	 * @see #setCREATE__TRG__tPackage(TPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPackageToPGPackage__Marker_CREATE__TRG__tPackage()
	 * @model required="true"
	 * @generated
	 */
	TPackage getCREATE__TRG__tPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PackageToPGPackage__Marker#getCREATE__TRG__tPackage <em>CREATE TRG tPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tPackage</em>' reference.
	 * @see #getCREATE__TRG__tPackage()
	 * @generated
	 */
	void setCREATE__TRG__tPackage(TPackage value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #setCONTEXT__TRG__typeGraph(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPackageToPGPackage__Marker_CONTEXT__TRG__typeGraph()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__typeGraph();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PackageToPGPackage__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #getCONTEXT__TRG__typeGraph()
	 * @generated
	 */
	void setCONTEXT__TRG__typeGraph(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mModel To Type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mModel To Type Graph</em>' reference.
	 * @see #setCONTEXT__CORR__mModelToTypeGraph(ModelToTypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPackageToPGPackage__Marker_CONTEXT__CORR__mModelToTypeGraph()
	 * @model required="true"
	 * @generated
	 */
	ModelToTypeGraph getCONTEXT__CORR__mModelToTypeGraph();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PackageToPGPackage__Marker#getCONTEXT__CORR__mModelToTypeGraph <em>CONTEXT CORR mModel To Type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mModel To Type Graph</em>' reference.
	 * @see #getCONTEXT__CORR__mModelToTypeGraph()
	 * @generated
	 */
	void setCONTEXT__CORR__mModelToTypeGraph(ModelToTypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mPackage To TPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mPackage To TPackage</em>' reference.
	 * @see #setCREATE__CORR__mPackageToTPackage(PackageToTPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getPackageToPGPackage__Marker_CREATE__CORR__mPackageToTPackage()
	 * @model required="true"
	 * @generated
	 */
	PackageToTPackage getCREATE__CORR__mPackageToTPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.PackageToPGPackage__Marker#getCREATE__CORR__mPackageToTPackage <em>CREATE CORR mPackage To TPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mPackage To TPackage</em>' reference.
	 * @see #getCREATE__CORR__mPackageToTPackage()
	 * @generated
	 */
	void setCREATE__CORR__mPackageToTPackage(PackageToTPackage value);

} // PackageToPGPackage__Marker
