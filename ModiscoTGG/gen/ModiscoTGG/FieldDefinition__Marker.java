/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldSignature;

import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Definition Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__SRC__mDefinition <em>CREATE SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.FieldDefinition__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__TRG__tDefinition <em>CREATE TRG tDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.FieldDefinition__Marker#getCONTEXT__TRG__tFieldSignature <em>CONTEXT TRG tField Signature</em>}</li>
 *   <li>{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__CORR__mDefinitionToTDefinition <em>CREATE CORR mDefinition To TDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__CORR__mDefinitionToTMember <em>CREATE CORR mDefinition To TMember</em>}</li>
 *   <li>{@link ModiscoTGG.FieldDefinition__Marker#getCONTEXT__CORR__mSignatureToTFieldSignature <em>CONTEXT CORR mSignature To TField Signature</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getFieldDefinition__Marker()
 * @model
 * @generated
 */
public interface FieldDefinition__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mDefinition</em>' reference.
	 * @see #setCREATE__SRC__mDefinition(MFieldDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldDefinition__Marker_CREATE__SRC__mDefinition()
	 * @model required="true"
	 * @generated
	 */
	MFieldDefinition getCREATE__SRC__mDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__SRC__mDefinition <em>CREATE SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mDefinition</em>' reference.
	 * @see #getCREATE__SRC__mDefinition()
	 * @generated
	 */
	void setCREATE__SRC__mDefinition(MFieldDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mSignature</em>' reference.
	 * @see #setCONTEXT__SRC__mSignature(MFieldSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldDefinition__Marker_CONTEXT__SRC__mSignature()
	 * @model required="true"
	 * @generated
	 */
	MFieldSignature getCONTEXT__SRC__mSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldDefinition__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mSignature</em>' reference.
	 * @see #getCONTEXT__SRC__mSignature()
	 * @generated
	 */
	void setCONTEXT__SRC__mSignature(MFieldSignature value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tDefinition</em>' reference.
	 * @see #setCREATE__TRG__tDefinition(TFieldDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldDefinition__Marker_CREATE__TRG__tDefinition()
	 * @model required="true"
	 * @generated
	 */
	TFieldDefinition getCREATE__TRG__tDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__TRG__tDefinition <em>CREATE TRG tDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tDefinition</em>' reference.
	 * @see #getCREATE__TRG__tDefinition()
	 * @generated
	 */
	void setCREATE__TRG__tDefinition(TFieldDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tField Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tField Signature</em>' reference.
	 * @see #setCONTEXT__TRG__tFieldSignature(TFieldSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldDefinition__Marker_CONTEXT__TRG__tFieldSignature()
	 * @model required="true"
	 * @generated
	 */
	TFieldSignature getCONTEXT__TRG__tFieldSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldDefinition__Marker#getCONTEXT__TRG__tFieldSignature <em>CONTEXT TRG tField Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tField Signature</em>' reference.
	 * @see #getCONTEXT__TRG__tFieldSignature()
	 * @generated
	 */
	void setCONTEXT__TRG__tFieldSignature(TFieldSignature value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mBody To TAnnotation</em>' reference.
	 * @see #setCREATE__CORR__mBodyToTAnnotation(ASTNodeToTAnnotatable)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldDefinition__Marker_CREATE__CORR__mBodyToTAnnotation()
	 * @model required="true"
	 * @generated
	 */
	ASTNodeToTAnnotatable getCREATE__CORR__mBodyToTAnnotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mBody To TAnnotation</em>' reference.
	 * @see #getCREATE__CORR__mBodyToTAnnotation()
	 * @generated
	 */
	void setCREATE__CORR__mBodyToTAnnotation(ASTNodeToTAnnotatable value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mDefinition To TDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mDefinition To TDefinition</em>' reference.
	 * @see #setCREATE__CORR__mDefinitionToTDefinition(MAbstractFlowElementToTAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldDefinition__Marker_CREATE__CORR__mDefinitionToTDefinition()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElementToTAbstractFlowElement getCREATE__CORR__mDefinitionToTDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__CORR__mDefinitionToTDefinition <em>CREATE CORR mDefinition To TDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mDefinition To TDefinition</em>' reference.
	 * @see #getCREATE__CORR__mDefinitionToTDefinition()
	 * @generated
	 */
	void setCREATE__CORR__mDefinitionToTDefinition(MAbstractFlowElementToTAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mDefinition To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mDefinition To TMember</em>' reference.
	 * @see #setCREATE__CORR__mDefinitionToTMember(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldDefinition__Marker_CREATE__CORR__mDefinitionToTMember()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCREATE__CORR__mDefinitionToTMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldDefinition__Marker#getCREATE__CORR__mDefinitionToTMember <em>CREATE CORR mDefinition To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mDefinition To TMember</em>' reference.
	 * @see #getCREATE__CORR__mDefinitionToTMember()
	 * @generated
	 */
	void setCREATE__CORR__mDefinitionToTMember(MDefinitionToTMember value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mSignature To TField Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mSignature To TField Signature</em>' reference.
	 * @see #setCONTEXT__CORR__mSignatureToTFieldSignature(MSignatureToTSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldDefinition__Marker_CONTEXT__CORR__mSignatureToTFieldSignature()
	 * @model required="true"
	 * @generated
	 */
	MSignatureToTSignature getCONTEXT__CORR__mSignatureToTFieldSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldDefinition__Marker#getCONTEXT__CORR__mSignatureToTFieldSignature <em>CONTEXT CORR mSignature To TField Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mSignature To TField Signature</em>' reference.
	 * @see #getCONTEXT__CORR__mSignatureToTFieldSignature()
	 * @generated
	 */
	void setCONTEXT__CORR__mSignatureToTFieldSignature(MSignatureToTSignature value);

} // FieldDefinition__Marker
