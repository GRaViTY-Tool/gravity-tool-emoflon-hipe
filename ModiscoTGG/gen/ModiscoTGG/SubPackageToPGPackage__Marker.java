/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Package To PG Package Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCREATE__SRC__mPackage <em>CREATE SRC mPackage</em>}</li>
 *   <li>{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__SRC__mParentPackage <em>CONTEXT SRC mParent Package</em>}</li>
 *   <li>{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__TRG__tParent <em>CONTEXT TRG tParent</em>}</li>
 *   <li>{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCREATE__TRG__tSub <em>CREATE TRG tSub</em>}</li>
 *   <li>{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCREATE__CORR__mPackageToTSub <em>CREATE CORR mPackage To TSub</em>}</li>
 *   <li>{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__CORR__mParentPackageToTParent <em>CONTEXT CORR mParent Package To TParent</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getSubPackageToPGPackage__Marker()
 * @model
 * @generated
 */
public interface SubPackageToPGPackage__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC mPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mPackage</em>' reference.
	 * @see #setCREATE__SRC__mPackage(org.eclipse.modisco.java.Package)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSubPackageToPGPackage__Marker_CREATE__SRC__mPackage()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.modisco.java.Package getCREATE__SRC__mPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCREATE__SRC__mPackage <em>CREATE SRC mPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mPackage</em>' reference.
	 * @see #getCREATE__SRC__mPackage()
	 * @generated
	 */
	void setCREATE__SRC__mPackage(org.eclipse.modisco.java.Package value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mParent Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mParent Package</em>' reference.
	 * @see #setCONTEXT__SRC__mParentPackage(org.eclipse.modisco.java.Package)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSubPackageToPGPackage__Marker_CONTEXT__SRC__mParentPackage()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.modisco.java.Package getCONTEXT__SRC__mParentPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__SRC__mParentPackage <em>CONTEXT SRC mParent Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mParent Package</em>' reference.
	 * @see #getCONTEXT__SRC__mParentPackage()
	 * @generated
	 */
	void setCONTEXT__SRC__mParentPackage(org.eclipse.modisco.java.Package value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tParent</em>' reference.
	 * @see #setCONTEXT__TRG__tParent(TPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSubPackageToPGPackage__Marker_CONTEXT__TRG__tParent()
	 * @model required="true"
	 * @generated
	 */
	TPackage getCONTEXT__TRG__tParent();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__TRG__tParent <em>CONTEXT TRG tParent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tParent</em>' reference.
	 * @see #getCONTEXT__TRG__tParent()
	 * @generated
	 */
	void setCONTEXT__TRG__tParent(TPackage value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tSub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tSub</em>' reference.
	 * @see #setCREATE__TRG__tSub(TPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSubPackageToPGPackage__Marker_CREATE__TRG__tSub()
	 * @model required="true"
	 * @generated
	 */
	TPackage getCREATE__TRG__tSub();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCREATE__TRG__tSub <em>CREATE TRG tSub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tSub</em>' reference.
	 * @see #getCREATE__TRG__tSub()
	 * @generated
	 */
	void setCREATE__TRG__tSub(TPackage value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #setCONTEXT__TRG__typeGraph(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSubPackageToPGPackage__Marker_CONTEXT__TRG__typeGraph()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__typeGraph();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #getCONTEXT__TRG__typeGraph()
	 * @generated
	 */
	void setCONTEXT__TRG__typeGraph(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mPackage To TSub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mPackage To TSub</em>' reference.
	 * @see #setCREATE__CORR__mPackageToTSub(PackageToTPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSubPackageToPGPackage__Marker_CREATE__CORR__mPackageToTSub()
	 * @model required="true"
	 * @generated
	 */
	PackageToTPackage getCREATE__CORR__mPackageToTSub();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCREATE__CORR__mPackageToTSub <em>CREATE CORR mPackage To TSub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mPackage To TSub</em>' reference.
	 * @see #getCREATE__CORR__mPackageToTSub()
	 * @generated
	 */
	void setCREATE__CORR__mPackageToTSub(PackageToTPackage value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mParent Package To TParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mParent Package To TParent</em>' reference.
	 * @see #setCONTEXT__CORR__mParentPackageToTParent(PackageToTPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSubPackageToPGPackage__Marker_CONTEXT__CORR__mParentPackageToTParent()
	 * @model required="true"
	 * @generated
	 */
	PackageToTPackage getCONTEXT__CORR__mParentPackageToTParent();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SubPackageToPGPackage__Marker#getCONTEXT__CORR__mParentPackageToTParent <em>CONTEXT CORR mParent Package To TParent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mParent Package To TParent</em>' reference.
	 * @see #getCONTEXT__CORR__mParentPackageToTParent()
	 * @generated
	 */
	void setCONTEXT__CORR__mParentPackageToTParent(PackageToTPackage value);

} // SubPackageToPGPackage__Marker
