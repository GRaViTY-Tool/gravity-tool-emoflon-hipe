/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MFieldSignature;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TFieldSignature;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Type Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.FieldType__Marker#getCONTEXT__SRC__ePrimitiveType <em>CONTEXT SRC ePrimitive Type</em>}</li>
 *   <li>{@link ModiscoTGG.FieldType__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.FieldType__Marker#getCONTEXT__TRG__tFieldSignature <em>CONTEXT TRG tField Signature</em>}</li>
 *   <li>{@link ModiscoTGG.FieldType__Marker#getCONTEXT__TRG__tPrimitiv <em>CONTEXT TRG tPrimitiv</em>}</li>
 *   <li>{@link ModiscoTGG.FieldType__Marker#getCONTEXT__CORR__ePrimitiveTypeToTPrimitiv <em>CONTEXT CORR ePrimitive Type To TPrimitiv</em>}</li>
 *   <li>{@link ModiscoTGG.FieldType__Marker#getCONTEXT__CORR__mSignatureToTFieldSignature <em>CONTEXT CORR mSignature To TField Signature</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getFieldType__Marker()
 * @model
 * @generated
 */
public interface FieldType__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC ePrimitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC ePrimitive Type</em>' reference.
	 * @see #setCONTEXT__SRC__ePrimitiveType(Type)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldType__Marker_CONTEXT__SRC__ePrimitiveType()
	 * @model required="true"
	 * @generated
	 */
	Type getCONTEXT__SRC__ePrimitiveType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldType__Marker#getCONTEXT__SRC__ePrimitiveType <em>CONTEXT SRC ePrimitive Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC ePrimitive Type</em>' reference.
	 * @see #getCONTEXT__SRC__ePrimitiveType()
	 * @generated
	 */
	void setCONTEXT__SRC__ePrimitiveType(Type value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mSignature</em>' reference.
	 * @see #setCONTEXT__SRC__mSignature(MFieldSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldType__Marker_CONTEXT__SRC__mSignature()
	 * @model required="true"
	 * @generated
	 */
	MFieldSignature getCONTEXT__SRC__mSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldType__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mSignature</em>' reference.
	 * @see #getCONTEXT__SRC__mSignature()
	 * @generated
	 */
	void setCONTEXT__SRC__mSignature(MFieldSignature value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tField Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tField Signature</em>' reference.
	 * @see #setCONTEXT__TRG__tFieldSignature(TFieldSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldType__Marker_CONTEXT__TRG__tFieldSignature()
	 * @model required="true"
	 * @generated
	 */
	TFieldSignature getCONTEXT__TRG__tFieldSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldType__Marker#getCONTEXT__TRG__tFieldSignature <em>CONTEXT TRG tField Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tField Signature</em>' reference.
	 * @see #getCONTEXT__TRG__tFieldSignature()
	 * @generated
	 */
	void setCONTEXT__TRG__tFieldSignature(TFieldSignature value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tPrimitiv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tPrimitiv</em>' reference.
	 * @see #setCONTEXT__TRG__tPrimitiv(TAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldType__Marker_CONTEXT__TRG__tPrimitiv()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getCONTEXT__TRG__tPrimitiv();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldType__Marker#getCONTEXT__TRG__tPrimitiv <em>CONTEXT TRG tPrimitiv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tPrimitiv</em>' reference.
	 * @see #getCONTEXT__TRG__tPrimitiv()
	 * @generated
	 */
	void setCONTEXT__TRG__tPrimitiv(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR ePrimitive Type To TPrimitiv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR ePrimitive Type To TPrimitiv</em>' reference.
	 * @see #setCONTEXT__CORR__ePrimitiveTypeToTPrimitiv(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldType__Marker_CONTEXT__CORR__ePrimitiveTypeToTPrimitiv()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__ePrimitiveTypeToTPrimitiv();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldType__Marker#getCONTEXT__CORR__ePrimitiveTypeToTPrimitiv <em>CONTEXT CORR ePrimitive Type To TPrimitiv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR ePrimitive Type To TPrimitiv</em>' reference.
	 * @see #getCONTEXT__CORR__ePrimitiveTypeToTPrimitiv()
	 * @generated
	 */
	void setCONTEXT__CORR__ePrimitiveTypeToTPrimitiv(TypeToTAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mSignature To TField Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mSignature To TField Signature</em>' reference.
	 * @see #setCONTEXT__CORR__mSignatureToTFieldSignature(MSignatureToTSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldType__Marker_CONTEXT__CORR__mSignatureToTFieldSignature()
	 * @model required="true"
	 * @generated
	 */
	MSignatureToTSignature getCONTEXT__CORR__mSignatureToTFieldSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldType__Marker#getCONTEXT__CORR__mSignatureToTFieldSignature <em>CONTEXT CORR mSignature To TField Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mSignature To TField Signature</em>' reference.
	 * @see #getCONTEXT__CORR__mSignatureToTFieldSignature()
	 * @generated
	 */
	void setCONTEXT__CORR__mSignatureToTFieldSignature(MSignatureToTSignature value);

} // FieldType__Marker
