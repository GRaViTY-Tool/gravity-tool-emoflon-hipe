/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;

import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Signature Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MethodSignature__Marker#getCONTEXT__SRC__mName <em>CONTEXT SRC mName</em>}</li>
 *   <li>{@link ModiscoTGG.MethodSignature__Marker#getCREATE__SRC__mSignature <em>CREATE SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.MethodSignature__Marker#getCONTEXT__TRG__tName <em>CONTEXT TRG tName</em>}</li>
 *   <li>{@link ModiscoTGG.MethodSignature__Marker#getCREATE__TRG__tSignature <em>CREATE TRG tSignature</em>}</li>
 *   <li>{@link ModiscoTGG.MethodSignature__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}</li>
 *   <li>{@link ModiscoTGG.MethodSignature__Marker#getCONTEXT__CORR__mNameToTName <em>CONTEXT CORR mName To TName</em>}</li>
 *   <li>{@link ModiscoTGG.MethodSignature__Marker#getCREATE__CORR__mSignatureToTSignature <em>CREATE CORR mSignature To TSignature</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMethodSignature__Marker()
 * @model
 * @generated
 */
public interface MethodSignature__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mName</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mName</em>' reference.
	 * @see #setCONTEXT__SRC__mName(MMethodName)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodSignature__Marker_CONTEXT__SRC__mName()
	 * @model required="true"
	 * @generated
	 */
	MMethodName getCONTEXT__SRC__mName();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodSignature__Marker#getCONTEXT__SRC__mName <em>CONTEXT SRC mName</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mName</em>' reference.
	 * @see #getCONTEXT__SRC__mName()
	 * @generated
	 */
	void setCONTEXT__SRC__mName(MMethodName value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mSignature</em>' reference.
	 * @see #setCREATE__SRC__mSignature(MMethodSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodSignature__Marker_CREATE__SRC__mSignature()
	 * @model required="true"
	 * @generated
	 */
	MMethodSignature getCREATE__SRC__mSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodSignature__Marker#getCREATE__SRC__mSignature <em>CREATE SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mSignature</em>' reference.
	 * @see #getCREATE__SRC__mSignature()
	 * @generated
	 */
	void setCREATE__SRC__mSignature(MMethodSignature value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tName</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tName</em>' reference.
	 * @see #setCONTEXT__TRG__tName(TMethod)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodSignature__Marker_CONTEXT__TRG__tName()
	 * @model required="true"
	 * @generated
	 */
	TMethod getCONTEXT__TRG__tName();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodSignature__Marker#getCONTEXT__TRG__tName <em>CONTEXT TRG tName</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tName</em>' reference.
	 * @see #getCONTEXT__TRG__tName()
	 * @generated
	 */
	void setCONTEXT__TRG__tName(TMethod value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tSignature</em>' reference.
	 * @see #setCREATE__TRG__tSignature(TMethodSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodSignature__Marker_CREATE__TRG__tSignature()
	 * @model required="true"
	 * @generated
	 */
	TMethodSignature getCREATE__TRG__tSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodSignature__Marker#getCREATE__TRG__tSignature <em>CREATE TRG tSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tSignature</em>' reference.
	 * @see #getCREATE__TRG__tSignature()
	 * @generated
	 */
	void setCREATE__TRG__tSignature(TMethodSignature value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mFlow Element To TFlow Element</em>' reference.
	 * @see #setCREATE__CORR__mFlowElementToTFlowElement(MAbstractFlowElementToTAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodSignature__Marker_CREATE__CORR__mFlowElementToTFlowElement()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElementToTAbstractFlowElement getCREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodSignature__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mFlow Element To TFlow Element</em>' reference.
	 * @see #getCREATE__CORR__mFlowElementToTFlowElement()
	 * @generated
	 */
	void setCREATE__CORR__mFlowElementToTFlowElement(MAbstractFlowElementToTAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mName To TName</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mName To TName</em>' reference.
	 * @see #setCONTEXT__CORR__mNameToTName(MMethodNameToTMethod)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodSignature__Marker_CONTEXT__CORR__mNameToTName()
	 * @model required="true"
	 * @generated
	 */
	MMethodNameToTMethod getCONTEXT__CORR__mNameToTName();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodSignature__Marker#getCONTEXT__CORR__mNameToTName <em>CONTEXT CORR mName To TName</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mName To TName</em>' reference.
	 * @see #getCONTEXT__CORR__mNameToTName()
	 * @generated
	 */
	void setCONTEXT__CORR__mNameToTName(MMethodNameToTMethod value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mSignature To TSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mSignature To TSignature</em>' reference.
	 * @see #setCREATE__CORR__mSignatureToTSignature(MSignatureToTSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodSignature__Marker_CREATE__CORR__mSignatureToTSignature()
	 * @model required="true"
	 * @generated
	 */
	MSignatureToTSignature getCREATE__CORR__mSignatureToTSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodSignature__Marker#getCREATE__CORR__mSignatureToTSignature <em>CREATE CORR mSignature To TSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mSignature To TSignature</em>' reference.
	 * @see #getCREATE__CORR__mSignatureToTSignature()
	 * @generated
	 */
	void setCREATE__CORR__mSignatureToTSignature(MSignatureToTSignature value);

} // MethodSignature__Marker
