/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MMethodSignature;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodSignature;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature Return Type Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__TRG__tSignature <em>CONTEXT TRG tSignature</em>}</li>
 *   <li>{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}</li>
 *   <li>{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getSignatureReturnType__Marker()
 * @model
 * @generated
 */
public interface SignatureReturnType__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mSignature</em>' reference.
	 * @see #setCONTEXT__SRC__mSignature(MMethodSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSignatureReturnType__Marker_CONTEXT__SRC__mSignature()
	 * @model required="true"
	 * @generated
	 */
	MMethodSignature getCONTEXT__SRC__mSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mSignature</em>' reference.
	 * @see #getCONTEXT__SRC__mSignature()
	 * @generated
	 */
	void setCONTEXT__SRC__mSignature(MMethodSignature value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mType</em>' reference.
	 * @see #setCONTEXT__SRC__mType(Type)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSignatureReturnType__Marker_CONTEXT__SRC__mType()
	 * @model required="true"
	 * @generated
	 */
	Type getCONTEXT__SRC__mType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mType</em>' reference.
	 * @see #getCONTEXT__SRC__mType()
	 * @generated
	 */
	void setCONTEXT__SRC__mType(Type value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tSignature</em>' reference.
	 * @see #setCONTEXT__TRG__tSignature(TMethodSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSignatureReturnType__Marker_CONTEXT__TRG__tSignature()
	 * @model required="true"
	 * @generated
	 */
	TMethodSignature getCONTEXT__TRG__tSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__TRG__tSignature <em>CONTEXT TRG tSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tSignature</em>' reference.
	 * @see #getCONTEXT__TRG__tSignature()
	 * @generated
	 */
	void setCONTEXT__TRG__tSignature(TMethodSignature value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tType</em>' reference.
	 * @see #setCONTEXT__TRG__tType(TAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSignatureReturnType__Marker_CONTEXT__TRG__tType()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getCONTEXT__TRG__tType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tType</em>' reference.
	 * @see #getCONTEXT__TRG__tType()
	 * @generated
	 */
	void setCONTEXT__TRG__tType(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mSignature To TSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mSignature To TSignature</em>' reference.
	 * @see #setCONTEXT__CORR__mSignatureToTSignature(MSignatureToTSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSignatureReturnType__Marker_CONTEXT__CORR__mSignatureToTSignature()
	 * @model required="true"
	 * @generated
	 */
	MSignatureToTSignature getCONTEXT__CORR__mSignatureToTSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}' reference.
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
	 * @see #setCONTEXT__CORR__mTypeToTType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSignatureReturnType__Marker_CONTEXT__CORR__mTypeToTType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__mTypeToTType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SignatureReturnType__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mType To TType</em>' reference.
	 * @see #getCONTEXT__CORR__mTypeToTType()
	 * @generated
	 */
	void setCONTEXT__CORR__mTypeToTType(TypeToTAbstractType value);

} // SignatureReturnType__Marker
