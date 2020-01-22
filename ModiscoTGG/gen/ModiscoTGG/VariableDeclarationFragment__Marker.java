/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.VariableDeclarationFragment;

import org.gravity.modisco.MFieldDefinition;

import org.gravity.typegraph.basic.TFieldDefinition;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Fragment Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCREATE__SRC__varDeclFragment <em>CREATE SRC var Decl Fragment</em>}</li>
 *   <li>{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCONTEXT__TRG__tDefinition <em>CONTEXT TRG tDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCONTEXT__CORR__eFieldDeclarationToTFieldDefinition <em>CONTEXT CORR eField Declaration To TField Definition</em>}</li>
 *   <li>{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCREATE__CORR__varDeclFragmentToTFieldDefinition <em>CREATE CORR var Decl Fragment To TField Definition</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getVariableDeclarationFragment__Marker()
 * @model
 * @generated
 */
public interface VariableDeclarationFragment__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mDefinition</em>' reference.
	 * @see #setCONTEXT__SRC__mDefinition(MFieldDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getVariableDeclarationFragment__Marker_CONTEXT__SRC__mDefinition()
	 * @model required="true"
	 * @generated
	 */
	MFieldDefinition getCONTEXT__SRC__mDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mDefinition</em>' reference.
	 * @see #getCONTEXT__SRC__mDefinition()
	 * @generated
	 */
	void setCONTEXT__SRC__mDefinition(MFieldDefinition value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC var Decl Fragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC var Decl Fragment</em>' reference.
	 * @see #setCREATE__SRC__varDeclFragment(VariableDeclarationFragment)
	 * @see ModiscoTGG.ModiscoTGGPackage#getVariableDeclarationFragment__Marker_CREATE__SRC__varDeclFragment()
	 * @model required="true"
	 * @generated
	 */
	VariableDeclarationFragment getCREATE__SRC__varDeclFragment();

	/**
	 * Sets the value of the '{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCREATE__SRC__varDeclFragment <em>CREATE SRC var Decl Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC var Decl Fragment</em>' reference.
	 * @see #getCREATE__SRC__varDeclFragment()
	 * @generated
	 */
	void setCREATE__SRC__varDeclFragment(VariableDeclarationFragment value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tDefinition</em>' reference.
	 * @see #setCONTEXT__TRG__tDefinition(TFieldDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getVariableDeclarationFragment__Marker_CONTEXT__TRG__tDefinition()
	 * @model required="true"
	 * @generated
	 */
	TFieldDefinition getCONTEXT__TRG__tDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCONTEXT__TRG__tDefinition <em>CONTEXT TRG tDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tDefinition</em>' reference.
	 * @see #getCONTEXT__TRG__tDefinition()
	 * @generated
	 */
	void setCONTEXT__TRG__tDefinition(TFieldDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eField Declaration To TField Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eField Declaration To TField Definition</em>' reference.
	 * @see #setCONTEXT__CORR__eFieldDeclarationToTFieldDefinition(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getVariableDeclarationFragment__Marker_CONTEXT__CORR__eFieldDeclarationToTFieldDefinition()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCONTEXT__CORR__eFieldDeclarationToTFieldDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCONTEXT__CORR__eFieldDeclarationToTFieldDefinition <em>CONTEXT CORR eField Declaration To TField Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eField Declaration To TField Definition</em>' reference.
	 * @see #getCONTEXT__CORR__eFieldDeclarationToTFieldDefinition()
	 * @generated
	 */
	void setCONTEXT__CORR__eFieldDeclarationToTFieldDefinition(MDefinitionToTMember value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR var Decl Fragment To TField Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR var Decl Fragment To TField Definition</em>' reference.
	 * @see #setCREATE__CORR__varDeclFragmentToTFieldDefinition(VariableDeclarationFragmentToTFieldDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getVariableDeclarationFragment__Marker_CREATE__CORR__varDeclFragmentToTFieldDefinition()
	 * @model required="true"
	 * @generated
	 */
	VariableDeclarationFragmentToTFieldDefinition getCREATE__CORR__varDeclFragmentToTFieldDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.VariableDeclarationFragment__Marker#getCREATE__CORR__varDeclFragmentToTFieldDefinition <em>CREATE CORR var Decl Fragment To TField Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR var Decl Fragment To TField Definition</em>' reference.
	 * @see #getCREATE__CORR__varDeclFragmentToTFieldDefinition()
	 * @generated
	 */
	void setCREATE__CORR__varDeclFragmentToTFieldDefinition(VariableDeclarationFragmentToTFieldDefinition value);

} // VariableDeclarationFragment__Marker
