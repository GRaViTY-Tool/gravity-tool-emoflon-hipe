/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodSignature;

import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Definition Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__SRC__mDefinition <em>CREATE SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.MethodDefinition__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__TRG__tDefinition <em>CREATE TRG tDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.MethodDefinition__Marker#getCONTEXT__TRG__tMethodSignature <em>CONTEXT TRG tMethod Signature</em>}</li>
 *   <li>{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__CORR__mDefinitionToTMember <em>CREATE CORR mDefinition To TMember</em>}</li>
 *   <li>{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}</li>
 *   <li>{@link ModiscoTGG.MethodDefinition__Marker#getCONTEXT__CORR__mSignatureToTMethodSignature <em>CONTEXT CORR mSignature To TMethod Signature</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMethodDefinition__Marker()
 * @model
 * @generated
 */
public interface MethodDefinition__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mDefinition</em>' reference.
	 * @see #setCREATE__SRC__mDefinition(MMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodDefinition__Marker_CREATE__SRC__mDefinition()
	 * @model required="true"
	 * @generated
	 */
	MMethodDefinition getCREATE__SRC__mDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__SRC__mDefinition <em>CREATE SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mDefinition</em>' reference.
	 * @see #getCREATE__SRC__mDefinition()
	 * @generated
	 */
	void setCREATE__SRC__mDefinition(MMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mSignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mSignature</em>' reference.
	 * @see #setCONTEXT__SRC__mSignature(MMethodSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodDefinition__Marker_CONTEXT__SRC__mSignature()
	 * @model required="true"
	 * @generated
	 */
	MMethodSignature getCONTEXT__SRC__mSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodDefinition__Marker#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mSignature</em>' reference.
	 * @see #getCONTEXT__SRC__mSignature()
	 * @generated
	 */
	void setCONTEXT__SRC__mSignature(MMethodSignature value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tDefinition</em>' reference.
	 * @see #setCREATE__TRG__tDefinition(TMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodDefinition__Marker_CREATE__TRG__tDefinition()
	 * @model required="true"
	 * @generated
	 */
	TMethodDefinition getCREATE__TRG__tDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__TRG__tDefinition <em>CREATE TRG tDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tDefinition</em>' reference.
	 * @see #getCREATE__TRG__tDefinition()
	 * @generated
	 */
	void setCREATE__TRG__tDefinition(TMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tMethod Signature</em>' reference.
	 * @see #setCONTEXT__TRG__tMethodSignature(TMethodSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodDefinition__Marker_CONTEXT__TRG__tMethodSignature()
	 * @model required="true"
	 * @generated
	 */
	TMethodSignature getCONTEXT__TRG__tMethodSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodDefinition__Marker#getCONTEXT__TRG__tMethodSignature <em>CONTEXT TRG tMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tMethod Signature</em>' reference.
	 * @see #getCONTEXT__TRG__tMethodSignature()
	 * @generated
	 */
	void setCONTEXT__TRG__tMethodSignature(TMethodSignature value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mBody To TAnnotation</em>' reference.
	 * @see #setCREATE__CORR__mBodyToTAnnotation(ASTNodeToTAnnotatable)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodDefinition__Marker_CREATE__CORR__mBodyToTAnnotation()
	 * @model required="true"
	 * @generated
	 */
	ASTNodeToTAnnotatable getCREATE__CORR__mBodyToTAnnotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mBody To TAnnotation</em>' reference.
	 * @see #getCREATE__CORR__mBodyToTAnnotation()
	 * @generated
	 */
	void setCREATE__CORR__mBodyToTAnnotation(ASTNodeToTAnnotatable value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mDefinition To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mDefinition To TMember</em>' reference.
	 * @see #setCREATE__CORR__mDefinitionToTMember(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodDefinition__Marker_CREATE__CORR__mDefinitionToTMember()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCREATE__CORR__mDefinitionToTMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__CORR__mDefinitionToTMember <em>CREATE CORR mDefinition To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mDefinition To TMember</em>' reference.
	 * @see #getCREATE__CORR__mDefinitionToTMember()
	 * @generated
	 */
	void setCREATE__CORR__mDefinitionToTMember(MDefinitionToTMember value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mFlow Element To TFlow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mFlow Element To TFlow Element</em>' reference.
	 * @see #setCREATE__CORR__mFlowElementToTFlowElement(MAbstractFlowElementToTAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodDefinition__Marker_CREATE__CORR__mFlowElementToTFlowElement()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElementToTAbstractFlowElement getCREATE__CORR__mFlowElementToTFlowElement();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodDefinition__Marker#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mFlow Element To TFlow Element</em>' reference.
	 * @see #getCREATE__CORR__mFlowElementToTFlowElement()
	 * @generated
	 */
	void setCREATE__CORR__mFlowElementToTFlowElement(MAbstractFlowElementToTAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mSignature To TMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mSignature To TMethod Signature</em>' reference.
	 * @see #setCONTEXT__CORR__mSignatureToTMethodSignature(MSignatureToTSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMethodDefinition__Marker_CONTEXT__CORR__mSignatureToTMethodSignature()
	 * @model required="true"
	 * @generated
	 */
	MSignatureToTSignature getCONTEXT__CORR__mSignatureToTMethodSignature();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MethodDefinition__Marker#getCONTEXT__CORR__mSignatureToTMethodSignature <em>CONTEXT CORR mSignature To TMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mSignature To TMethod Signature</em>' reference.
	 * @see #getCONTEXT__CORR__mSignatureToTMethodSignature()
	 * @generated
	 */
	void setCONTEXT__CORR__mSignatureToTMethodSignature(MSignatureToTSignature value);

} // MethodDefinition__Marker
