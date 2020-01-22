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
 * A representation of the model object '<em><b>Method Parameter Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MethodParameter__Marker#getCREATE__SRC__mEntry <em>CREATE SRC mEntry</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameter__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameter__Marker#getCREATE__TRG__tParameter <em>CREATE TRG tParameter</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameter__Marker#getCONTEXT__TRG__tSiganture <em>CONTEXT TRG tSiganture</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameter__Marker#getCREATE__CORR__mEntryToTParameter <em>CREATE CORR mEntry To TParameter</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameter__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}</li>
 *   <li>{@link ModiscoTGG.MethodParameter__Marker#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameter__Marker()
 * @model
 * @generated
 */
public interface MethodParameter__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC mEntry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mEntry</em>' reference.
	 * @see #setCREATE__SRC__mEntry(MEntry)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameter__Marker_CREATE__SRC__mEntry()
	 * @model required="true"
	 * @generated
	 */
	MEntry getCREATE__SRC__mEntry();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameter__Marker#getCREATE__SRC__mEntry <em>CREATE SRC mEntry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mEntry</em>' reference.
	 * @see #getCREATE__SRC__mEntry()
	 * @generated
	 */
	void setCREATE__SRC__mEntry(MEntry value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mSignature</em>' reference.
	 * @see #setCONTEXT__SRC__mSignature(MMethodSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameter__Marker_CONTEXT__SRC__mSignature()
	 * @model required="true"
	 * @generated
	 */
	MMethodSignature getCONTEXT__SRC__mSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameter__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mSignature</em>' reference.
	 * @see #getCONTEXT__SRC__mSignature()
	 * @generated
	 */
	void setCONTEXT__SRC__mSignature(MMethodSignature value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tParameter</em>' reference.
	 * @see #setCREATE__TRG__tParameter(TParameter)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameter__Marker_CREATE__TRG__tParameter()
	 * @model required="true"
	 * @generated
	 */
	TParameter getCREATE__TRG__tParameter();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameter__Marker#getCREATE__TRG__tParameter <em>CREATE TRG tParameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tParameter</em>' reference.
	 * @see #getCREATE__TRG__tParameter()
	 * @generated
	 */
	void setCREATE__TRG__tParameter(TParameter value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tSiganture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tSiganture</em>' reference.
	 * @see #setCONTEXT__TRG__tSiganture(TMethodSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameter__Marker_CONTEXT__TRG__tSiganture()
	 * @model required="true"
	 * @generated
	 */
	TMethodSignature getCONTEXT__TRG__tSiganture();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameter__Marker#getCONTEXT__TRG__tSiganture <em>CONTEXT TRG tSiganture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tSiganture</em>' reference.
	 * @see #getCONTEXT__TRG__tSiganture()
	 * @generated
	 */
	void setCONTEXT__TRG__tSiganture(TMethodSignature value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mEntry To TParameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mEntry To TParameter</em>' reference.
	 * @see #setCREATE__CORR__mEntryToTParameter(MEntryToTParameter)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameter__Marker_CREATE__CORR__mEntryToTParameter()
	 * @model required="true"
	 * @generated
	 */
	MEntryToTParameter getCREATE__CORR__mEntryToTParameter();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameter__Marker#getCREATE__CORR__mEntryToTParameter <em>CREATE CORR mEntry To TParameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mEntry To TParameter</em>' reference.
	 * @see #getCREATE__CORR__mEntryToTParameter()
	 * @generated
	 */
	void setCREATE__CORR__mEntryToTParameter(MEntryToTParameter value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mFlow Element To TFlow Element</em>' reference.
	 * @see #setCREATE__CORR__mFlowElementToTFlowElement(MAbstractFlowElementToTAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameter__Marker_CREATE__CORR__mFlowElementToTFlowElement()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElementToTAbstractFlowElement getCREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameter__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mFlow Element To TFlow Element</em>' reference.
	 * @see #getCREATE__CORR__mFlowElementToTFlowElement()
	 * @generated
	 */
	void setCREATE__CORR__mFlowElementToTFlowElement(MAbstractFlowElementToTAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mSignature To TSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mSignature To TSignature</em>' reference.
	 * @see #setCONTEXT__CORR__mSignatureToTSignature(MSignatureToTSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodParameter__Marker_CONTEXT__CORR__mSignatureToTSignature()
	 * @model required="true"
	 * @generated
	 */
	MSignatureToTSignature getCONTEXT__CORR__mSignatureToTSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodParameter__Marker#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mSignature To TSignature</em>' reference.
	 * @see #getCONTEXT__CORR__mSignatureToTSignature()
	 * @generated
	 */
	void setCONTEXT__CORR__mSignatureToTSignature(MSignatureToTSignature value);

} // MethodParameter__Marker
