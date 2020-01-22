/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MEntry;

import org.gravity.typegraph.basic.TParameter;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Parameter Link Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__SRC__mEntry <em>CONTEXT SRC mEntry</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__SRC__mPrevEntry <em>CONTEXT SRC mPrev Entry</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__TRG__tParameter <em>CONTEXT TRG tParameter</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__TRG__tPrevParameter <em>CONTEXT TRG tPrev Parameter</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__CORR__eSingleVariableDeclarationToTParameter <em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__CORR__mmethodSignatureToTMethodSignature <em>CONTEXT CORR mmethod Signature To TMethod Signature</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLink__Marker()
 * @model
 * @generated
 */
public interface MethodParameterLink__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mEntry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mEntry</em>' reference.
	 * @see #setCONTEXT__SRC__mEntry(MEntry)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLink__Marker_CONTEXT__SRC__mEntry()
	 * @model required="true"
	 * @generated
	 */
	MEntry getCONTEXT__SRC__mEntry();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__SRC__mEntry <em>CONTEXT SRC mEntry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mEntry</em>' reference.
	 * @see #getCONTEXT__SRC__mEntry()
	 * @generated
	 */
	void setCONTEXT__SRC__mEntry(MEntry value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mPrev Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mPrev Entry</em>' reference.
	 * @see #setCONTEXT__SRC__mPrevEntry(MEntry)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLink__Marker_CONTEXT__SRC__mPrevEntry()
	 * @model required="true"
	 * @generated
	 */
	MEntry getCONTEXT__SRC__mPrevEntry();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__SRC__mPrevEntry <em>CONTEXT SRC mPrev Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mPrev Entry</em>' reference.
	 * @see #getCONTEXT__SRC__mPrevEntry()
	 * @generated
	 */
	void setCONTEXT__SRC__mPrevEntry(MEntry value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tParameter</em>' reference.
	 * @see #setCONTEXT__TRG__tParameter(TParameter)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLink__Marker_CONTEXT__TRG__tParameter()
	 * @model required="true"
	 * @generated
	 */
	TParameter getCONTEXT__TRG__tParameter();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__TRG__tParameter <em>CONTEXT TRG tParameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tParameter</em>' reference.
	 * @see #getCONTEXT__TRG__tParameter()
	 * @generated
	 */
	void setCONTEXT__TRG__tParameter(TParameter value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tPrev Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tPrev Parameter</em>' reference.
	 * @see #setCONTEXT__TRG__tPrevParameter(TParameter)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLink__Marker_CONTEXT__TRG__tPrevParameter()
	 * @model required="true"
	 * @generated
	 */
	TParameter getCONTEXT__TRG__tPrevParameter();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__TRG__tPrevParameter <em>CONTEXT TRG tPrev Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tPrev Parameter</em>' reference.
	 * @see #getCONTEXT__TRG__tPrevParameter()
	 * @generated
	 */
	void setCONTEXT__TRG__tPrevParameter(TParameter value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eSingle Variable Declaration To TParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>' reference.
	 * @see #setCONTEXT__CORR__eSingleVariableDeclarationToTParameter(MEntryToTParameter)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLink__Marker_CONTEXT__CORR__eSingleVariableDeclarationToTParameter()
	 * @model required="true"
	 * @generated
	 */
	MEntryToTParameter getCONTEXT__CORR__eSingleVariableDeclarationToTParameter();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__CORR__eSingleVariableDeclarationToTParameter <em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>' reference.
	 * @see #getCONTEXT__CORR__eSingleVariableDeclarationToTParameter()
	 * @generated
	 */
	void setCONTEXT__CORR__eSingleVariableDeclarationToTParameter(MEntryToTParameter value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mmethod Signature To TMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mmethod Signature To TMethod Signature</em>' reference.
	 * @see #setCONTEXT__CORR__mmethodSignatureToTMethodSignature(MEntryToTParameter)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLink__Marker_CONTEXT__CORR__mmethodSignatureToTMethodSignature()
	 * @model required="true"
	 * @generated
	 */
	MEntryToTParameter getCONTEXT__CORR__mmethodSignatureToTMethodSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameterLink__Marker#getCONTEXT__CORR__mmethodSignatureToTMethodSignature <em>CONTEXT CORR mmethod Signature To TMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mmethod Signature To TMethod Signature</em>' reference.
	 * @see #getCONTEXT__CORR__mmethodSignatureToTMethodSignature()
	 * @generated
	 */
	void setCONTEXT__CORR__mmethodSignatureToTMethodSignature(MEntryToTParameter value);

} // MethodParameterLink__Marker
