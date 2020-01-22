/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;

import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldSignature;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Signature Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.FieldSignature__Marker#getCONTEXT__SRC__mFieldName <em>CONTEXT SRC mField Name</em>}</li>
 *   <li>{@link ModiscoTGG.FieldSignature__Marker#getCREATE__SRC__mSignature <em>CREATE SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.FieldSignature__Marker#getCONTEXT__TRG__tField <em>CONTEXT TRG tField</em>}</li>
 *   <li>{@link ModiscoTGG.FieldSignature__Marker#getCREATE__TRG__tSignature <em>CREATE TRG tSignature</em>}</li>
 *   <li>{@link ModiscoTGG.FieldSignature__Marker#getCONTEXT__CORR__eFieldDeclarationToTField <em>CONTEXT CORR eField Declaration To TField</em>}</li>
 *   <li>{@link ModiscoTGG.FieldSignature__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}</li>
 *   <li>{@link ModiscoTGG.FieldSignature__Marker#getCREATE__CORR__mSignatureToTSignature <em>CREATE CORR mSignature To TSignature</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getFieldSignature__Marker()
 * @model
 * @generated
 */
public interface FieldSignature__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mField Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mField Name</em>' reference.
	 * @see #setCONTEXT__SRC__mFieldName(MFieldName)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldSignature__Marker_CONTEXT__SRC__mFieldName()
	 * @model required="true"
	 * @generated
	 */
	MFieldName getCONTEXT__SRC__mFieldName();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldSignature__Marker#getCONTEXT__SRC__mFieldName <em>CONTEXT SRC mField Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mField Name</em>' reference.
	 * @see #getCONTEXT__SRC__mFieldName()
	 * @generated
	 */
	void setCONTEXT__SRC__mFieldName(MFieldName value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mSignature</em>' reference.
	 * @see #setCREATE__SRC__mSignature(MFieldSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldSignature__Marker_CREATE__SRC__mSignature()
	 * @model required="true"
	 * @generated
	 */
	MFieldSignature getCREATE__SRC__mSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldSignature__Marker#getCREATE__SRC__mSignature <em>CREATE SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mSignature</em>' reference.
	 * @see #getCREATE__SRC__mSignature()
	 * @generated
	 */
	void setCREATE__SRC__mSignature(MFieldSignature value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tField</em>' reference.
	 * @see #setCONTEXT__TRG__tField(TField)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldSignature__Marker_CONTEXT__TRG__tField()
	 * @model required="true"
	 * @generated
	 */
	TField getCONTEXT__TRG__tField();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldSignature__Marker#getCONTEXT__TRG__tField <em>CONTEXT TRG tField</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tField</em>' reference.
	 * @see #getCONTEXT__TRG__tField()
	 * @generated
	 */
	void setCONTEXT__TRG__tField(TField value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tSignature</em>' reference.
	 * @see #setCREATE__TRG__tSignature(TFieldSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldSignature__Marker_CREATE__TRG__tSignature()
	 * @model required="true"
	 * @generated
	 */
	TFieldSignature getCREATE__TRG__tSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldSignature__Marker#getCREATE__TRG__tSignature <em>CREATE TRG tSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tSignature</em>' reference.
	 * @see #getCREATE__TRG__tSignature()
	 * @generated
	 */
	void setCREATE__TRG__tSignature(TFieldSignature value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eField Declaration To TField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eField Declaration To TField</em>' reference.
	 * @see #setCONTEXT__CORR__eFieldDeclarationToTField(MFieldNameToTField)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldSignature__Marker_CONTEXT__CORR__eFieldDeclarationToTField()
	 * @model required="true"
	 * @generated
	 */
	MFieldNameToTField getCONTEXT__CORR__eFieldDeclarationToTField();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldSignature__Marker#getCONTEXT__CORR__eFieldDeclarationToTField <em>CONTEXT CORR eField Declaration To TField</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eField Declaration To TField</em>' reference.
	 * @see #getCONTEXT__CORR__eFieldDeclarationToTField()
	 * @generated
	 */
	void setCONTEXT__CORR__eFieldDeclarationToTField(MFieldNameToTField value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mFlow Element To TFlow Element</em>' reference.
	 * @see #setCREATE__CORR__mFlowElementToTFlowElement(MAbstractFlowElementToTAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldSignature__Marker_CREATE__CORR__mFlowElementToTFlowElement()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElementToTAbstractFlowElement getCREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldSignature__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mFlow Element To TFlow Element</em>' reference.
	 * @see #getCREATE__CORR__mFlowElementToTFlowElement()
	 * @generated
	 */
	void setCREATE__CORR__mFlowElementToTFlowElement(MAbstractFlowElementToTAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mSignature To TSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mSignature To TSignature</em>' reference.
	 * @see #setCREATE__CORR__mSignatureToTSignature(MSignatureToTSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldSignature__Marker_CREATE__CORR__mSignatureToTSignature()
	 * @model required="true"
	 * @generated
	 */
	MSignatureToTSignature getCREATE__CORR__mSignatureToTSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldSignature__Marker#getCREATE__CORR__mSignatureToTSignature <em>CREATE CORR mSignature To TSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mSignature To TSignature</em>' reference.
	 * @see #getCREATE__CORR__mSignatureToTSignature()
	 * @generated
	 */
	void setCREATE__CORR__mSignatureToTSignature(MSignatureToTSignature value);

} // FieldSignature__Marker
