/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.LineComment;

import org.gravity.modisco.MDefinition;

import org.gravity.typegraph.basic.TMember;

import org.gravity.typegraph.basic.annotations.TTextAnnotation;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Annotations Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.TextAnnotations__Marker#getCREATE__SRC__mComment <em>CREATE SRC mComment</em>}</li>
 *   <li>{@link ModiscoTGG.TextAnnotations__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}</li>
 *   <li>{@link ModiscoTGG.TextAnnotations__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}</li>
 *   <li>{@link ModiscoTGG.TextAnnotations__Marker#getCREATE__TRG__tText <em>CREATE TRG tText</em>}</li>
 *   <li>{@link ModiscoTGG.TextAnnotations__Marker#getCREATE__CORR__mCommentToTText <em>CREATE CORR mComment To TText</em>}</li>
 *   <li>{@link ModiscoTGG.TextAnnotations__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getTextAnnotations__Marker()
 * @model
 * @generated
 */
public interface TextAnnotations__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC mComment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mComment</em>' reference.
	 * @see #setCREATE__SRC__mComment(LineComment)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTextAnnotations__Marker_CREATE__SRC__mComment()
	 * @model required="true"
	 * @generated
	 */
	LineComment getCREATE__SRC__mComment();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TextAnnotations__Marker#getCREATE__SRC__mComment <em>CREATE SRC mComment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mComment</em>' reference.
	 * @see #getCREATE__SRC__mComment()
	 * @generated
	 */
	void setCREATE__SRC__mComment(LineComment value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mMember</em>' reference.
	 * @see #setCONTEXT__SRC__mMember(MDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTextAnnotations__Marker_CONTEXT__SRC__mMember()
	 * @model required="true"
	 * @generated
	 */
	MDefinition getCONTEXT__SRC__mMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TextAnnotations__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mMember</em>' reference.
	 * @see #getCONTEXT__SRC__mMember()
	 * @generated
	 */
	void setCONTEXT__SRC__mMember(MDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tMember</em>' reference.
	 * @see #setCONTEXT__TRG__tMember(TMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTextAnnotations__Marker_CONTEXT__TRG__tMember()
	 * @model required="true"
	 * @generated
	 */
	TMember getCONTEXT__TRG__tMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TextAnnotations__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tMember</em>' reference.
	 * @see #getCONTEXT__TRG__tMember()
	 * @generated
	 */
	void setCONTEXT__TRG__tMember(TMember value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tText</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tText</em>' reference.
	 * @see #setCREATE__TRG__tText(TTextAnnotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTextAnnotations__Marker_CREATE__TRG__tText()
	 * @model required="true"
	 * @generated
	 */
	TTextAnnotation getCREATE__TRG__tText();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TextAnnotations__Marker#getCREATE__TRG__tText <em>CREATE TRG tText</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tText</em>' reference.
	 * @see #getCREATE__TRG__tText()
	 * @generated
	 */
	void setCREATE__TRG__tText(TTextAnnotation value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mComment To TText</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mComment To TText</em>' reference.
	 * @see #setCREATE__CORR__mCommentToTText(LineCommentToTTextAnnotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTextAnnotations__Marker_CREATE__CORR__mCommentToTText()
	 * @model required="true"
	 * @generated
	 */
	LineCommentToTTextAnnotation getCREATE__CORR__mCommentToTText();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TextAnnotations__Marker#getCREATE__CORR__mCommentToTText <em>CREATE CORR mComment To TText</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mComment To TText</em>' reference.
	 * @see #getCREATE__CORR__mCommentToTText()
	 * @generated
	 */
	void setCREATE__CORR__mCommentToTText(LineCommentToTTextAnnotation value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mMember To TMember</em>' reference.
	 * @see #setCONTEXT__CORR__mMemberToTMember(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTextAnnotations__Marker_CONTEXT__CORR__mMemberToTMember()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCONTEXT__CORR__mMemberToTMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TextAnnotations__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mMember To TMember</em>' reference.
	 * @see #getCONTEXT__CORR__mMemberToTMember()
	 * @generated
	 */
	void setCONTEXT__CORR__mMemberToTMember(MDefinitionToTMember value);

} // TextAnnotations__Marker
