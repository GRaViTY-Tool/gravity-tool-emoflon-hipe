/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MEntry;
import org.gravity.modisco.MMethodSignature;

import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Parameter Link First Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__SRC__mEntry <em>CONTEXT SRC mEntry</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__SRC__mParameterList <em>CONTEXT SRC mParameter List</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__TRG__tMethodSignature <em>CONTEXT TRG tMethod Signature</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__TRG__tParameter <em>CONTEXT TRG tParameter</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__CORR__eSingleVariableDeclarationToTParameter <em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__CORR__mmethodSignatureToTMethodSignature <em>CONTEXT CORR mmethod Signature To TMethod Signature</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLinkFirst__Marker()
 * @model
 * @generated
 */
public interface MethodParameterLinkFirst__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mEntry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mEntry</em>' reference.
	 * @see #setCONTEXT__SRC__mEntry(MEntry)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLinkFirst__Marker_CONTEXT__SRC__mEntry()
	 * @model required="true"
	 * @generated
	 */
	MEntry getCONTEXT__SRC__mEntry();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__SRC__mEntry <em>CONTEXT SRC mEntry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mEntry</em>' reference.
	 * @see #getCONTEXT__SRC__mEntry()
	 * @generated
	 */
	void setCONTEXT__SRC__mEntry(MEntry value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mParameter List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mParameter List</em>' reference.
	 * @see #setCONTEXT__SRC__mParameterList(MMethodSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLinkFirst__Marker_CONTEXT__SRC__mParameterList()
	 * @model required="true"
	 * @generated
	 */
	MMethodSignature getCONTEXT__SRC__mParameterList();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__SRC__mParameterList <em>CONTEXT SRC mParameter List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mParameter List</em>' reference.
	 * @see #getCONTEXT__SRC__mParameterList()
	 * @generated
	 */
	void setCONTEXT__SRC__mParameterList(MMethodSignature value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tMethod Signature</em>' reference.
	 * @see #setCONTEXT__TRG__tMethodSignature(TMethodSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLinkFirst__Marker_CONTEXT__TRG__tMethodSignature()
	 * @model required="true"
	 * @generated
	 */
	TMethodSignature getCONTEXT__TRG__tMethodSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__TRG__tMethodSignature <em>CONTEXT TRG tMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tMethod Signature</em>' reference.
	 * @see #getCONTEXT__TRG__tMethodSignature()
	 * @generated
	 */
	void setCONTEXT__TRG__tMethodSignature(TMethodSignature value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tParameter</em>' reference.
	 * @see #setCONTEXT__TRG__tParameter(TParameter)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLinkFirst__Marker_CONTEXT__TRG__tParameter()
	 * @model required="true"
	 * @generated
	 */
	TParameter getCONTEXT__TRG__tParameter();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__TRG__tParameter <em>CONTEXT TRG tParameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tParameter</em>' reference.
	 * @see #getCONTEXT__TRG__tParameter()
	 * @generated
	 */
	void setCONTEXT__TRG__tParameter(TParameter value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eSingle Variable Declaration To TParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>' reference.
	 * @see #setCONTEXT__CORR__eSingleVariableDeclarationToTParameter(MEntryToTParameter)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLinkFirst__Marker_CONTEXT__CORR__eSingleVariableDeclarationToTParameter()
	 * @model required="true"
	 * @generated
	 */
	MEntryToTParameter getCONTEXT__CORR__eSingleVariableDeclarationToTParameter();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__CORR__eSingleVariableDeclarationToTParameter <em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>}' reference.
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
	 * @see #setCONTEXT__CORR__mmethodSignatureToTMethodSignature(MSignatureToTSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameterLinkFirst__Marker_CONTEXT__CORR__mmethodSignatureToTMethodSignature()
	 * @model required="true"
	 * @generated
	 */
	MSignatureToTSignature getCONTEXT__CORR__mmethodSignatureToTMethodSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameterLinkFirst__Marker#getCONTEXT__CORR__mmethodSignatureToTMethodSignature <em>CONTEXT CORR mmethod Signature To TMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mmethod Signature To TMethod Signature</em>' reference.
	 * @see #getCONTEXT__CORR__mmethodSignatureToTMethodSignature()
	 * @generated
	 */
	void setCONTEXT__CORR__mmethodSignatureToTMethodSignature(MSignatureToTSignature value);

} // MethodParameterLinkFirst__Marker
