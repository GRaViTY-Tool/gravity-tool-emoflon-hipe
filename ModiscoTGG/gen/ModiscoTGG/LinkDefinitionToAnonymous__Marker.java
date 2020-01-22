/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MAnonymous;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MSignature;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TSignature;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Definition To Anonymous Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__TRG__tDefinition <em>CONTEXT TRG tDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__TRG__tSignature <em>CONTEXT TRG tSignature</em>}</li>
 *   <li>{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__CORR__mDefinitionToTMember <em>CONTEXT CORR mDefinition To TMember</em>}</li>
 *   <li>{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}</li>
 *   <li>{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getLinkDefinitionToAnonymous__Marker()
 * @model
 * @generated
 */
public interface LinkDefinitionToAnonymous__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mDefinition</em>' reference.
	 * @see #setCONTEXT__SRC__mDefinition(MDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getLinkDefinitionToAnonymous__Marker_CONTEXT__SRC__mDefinition()
	 * @model required="true"
	 * @generated
	 */
	MDefinition getCONTEXT__SRC__mDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mDefinition</em>' reference.
	 * @see #getCONTEXT__SRC__mDefinition()
	 * @generated
	 */
	void setCONTEXT__SRC__mDefinition(MDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mSignature</em>' reference.
	 * @see #setCONTEXT__SRC__mSignature(MSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getLinkDefinitionToAnonymous__Marker_CONTEXT__SRC__mSignature()
	 * @model required="true"
	 * @generated
	 */
	MSignature getCONTEXT__SRC__mSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mSignature</em>' reference.
	 * @see #getCONTEXT__SRC__mSignature()
	 * @generated
	 */
	void setCONTEXT__SRC__mSignature(MSignature value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mType</em>' reference.
	 * @see #setCONTEXT__SRC__mType(MAnonymous)
	 * @see ModiscoTGG.ModiscoTGGPackage#getLinkDefinitionToAnonymous__Marker_CONTEXT__SRC__mType()
	 * @model required="true"
	 * @generated
	 */
	MAnonymous getCONTEXT__SRC__mType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mType</em>' reference.
	 * @see #getCONTEXT__SRC__mType()
	 * @generated
	 */
	void setCONTEXT__SRC__mType(MAnonymous value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tDefinition</em>' reference.
	 * @see #setCONTEXT__TRG__tDefinition(TMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getLinkDefinitionToAnonymous__Marker_CONTEXT__TRG__tDefinition()
	 * @model required="true"
	 * @generated
	 */
	TMember getCONTEXT__TRG__tDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__TRG__tDefinition <em>CONTEXT TRG tDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tDefinition</em>' reference.
	 * @see #getCONTEXT__TRG__tDefinition()
	 * @generated
	 */
	void setCONTEXT__TRG__tDefinition(TMember value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tSignature</em>' reference.
	 * @see #setCONTEXT__TRG__tSignature(TSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getLinkDefinitionToAnonymous__Marker_CONTEXT__TRG__tSignature()
	 * @model required="true"
	 * @generated
	 */
	TSignature getCONTEXT__TRG__tSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__TRG__tSignature <em>CONTEXT TRG tSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tSignature</em>' reference.
	 * @see #getCONTEXT__TRG__tSignature()
	 * @generated
	 */
	void setCONTEXT__TRG__tSignature(TSignature value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tType</em>' reference.
	 * @see #setCONTEXT__TRG__tType(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getLinkDefinitionToAnonymous__Marker_CONTEXT__TRG__tType()
	 * @model required="true"
	 * @generated
	 */
	TClass getCONTEXT__TRG__tType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tType</em>' reference.
	 * @see #getCONTEXT__TRG__tType()
	 * @generated
	 */
	void setCONTEXT__TRG__tType(TClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mDefinition To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mDefinition To TMember</em>' reference.
	 * @see #setCONTEXT__CORR__mDefinitionToTMember(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getLinkDefinitionToAnonymous__Marker_CONTEXT__CORR__mDefinitionToTMember()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCONTEXT__CORR__mDefinitionToTMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__CORR__mDefinitionToTMember <em>CONTEXT CORR mDefinition To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mDefinition To TMember</em>' reference.
	 * @see #getCONTEXT__CORR__mDefinitionToTMember()
	 * @generated
	 */
	void setCONTEXT__CORR__mDefinitionToTMember(MDefinitionToTMember value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mSignature To TSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mSignature To TSignature</em>' reference.
	 * @see #setCONTEXT__CORR__mSignatureToTSignature(MSignatureToTSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getLinkDefinitionToAnonymous__Marker_CONTEXT__CORR__mSignatureToTSignature()
	 * @model required="true"
	 * @generated
	 */
	MSignatureToTSignature getCONTEXT__CORR__mSignatureToTSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mSignature To TSignature</em>' reference.
	 * @see #getCONTEXT__CORR__mSignatureToTSignature()
	 * @generated
	 */
	void setCONTEXT__CORR__mSignatureToTSignature(MSignatureToTSignature value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mType To TType</em>' reference.
	 * @see #setCONTEXT__CORR__mTypeToTType(AnonymousClassDeclarationToTClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getLinkDefinitionToAnonymous__Marker_CONTEXT__CORR__mTypeToTType()
	 * @model required="true"
	 * @generated
	 */
	AnonymousClassDeclarationToTClass getCONTEXT__CORR__mTypeToTType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.LinkDefinitionToAnonymous__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mType To TType</em>' reference.
	 * @see #getCONTEXT__CORR__mTypeToTType()
	 * @generated
	 */
	void setCONTEXT__CORR__mTypeToTType(AnonymousClassDeclarationToTClass value);

} // LinkDefinitionToAnonymous__Marker
