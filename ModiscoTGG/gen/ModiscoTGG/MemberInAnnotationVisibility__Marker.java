/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.gravity.modisco.MDefinition;

import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;

import org.gravity.typegraph.basic.annotations.TAnnotationType;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member In Annotation Visibility Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__SRC__Annotation <em>CONTEXT SRC Annotation</em>}</li>
 *   <li>{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCREATE__SRC__mModifier <em>CREATE SRC mModifier</em>}</li>
 *   <li>{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__TRG__tAnnotation <em>CONTEXT TRG tAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}</li>
 *   <li>{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCREATE__TRG__tModifier <em>CREATE TRG tModifier</em>}</li>
 *   <li>{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__CORR__defToMember <em>CONTEXT CORR def To Member</em>}</li>
 *   <li>{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCREATE__CORR__mModifierToTModifier <em>CREATE CORR mModifier To TModifier</em>}</li>
 *   <li>{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getMemberInAnnotationVisibility__Marker()
 * @model
 * @generated
 */
public interface MemberInAnnotationVisibility__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC Annotation</em>' reference.
	 * @see #setCONTEXT__SRC__Annotation(AnnotationTypeDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMemberInAnnotationVisibility__Marker_CONTEXT__SRC__Annotation()
	 * @model required="true"
	 * @generated
	 */
	AnnotationTypeDeclaration getCONTEXT__SRC__Annotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__SRC__Annotation <em>CONTEXT SRC Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC Annotation</em>' reference.
	 * @see #getCONTEXT__SRC__Annotation()
	 * @generated
	 */
	void setCONTEXT__SRC__Annotation(AnnotationTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mDefinition</em>' reference.
	 * @see #setCONTEXT__SRC__mDefinition(MDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMemberInAnnotationVisibility__Marker_CONTEXT__SRC__mDefinition()
	 * @model required="true"
	 * @generated
	 */
	MDefinition getCONTEXT__SRC__mDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mDefinition</em>' reference.
	 * @see #getCONTEXT__SRC__mDefinition()
	 * @generated
	 */
	void setCONTEXT__SRC__mDefinition(MDefinition value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mModifier</em>' reference.
	 * @see #setCREATE__SRC__mModifier(Modifier)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMemberInAnnotationVisibility__Marker_CREATE__SRC__mModifier()
	 * @model required="true"
	 * @generated
	 */
	Modifier getCREATE__SRC__mModifier();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCREATE__SRC__mModifier <em>CREATE SRC mModifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mModifier</em>' reference.
	 * @see #getCREATE__SRC__mModifier()
	 * @generated
	 */
	void setCREATE__SRC__mModifier(Modifier value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tAnnotation</em>' reference.
	 * @see #setCONTEXT__TRG__tAnnotation(TAnnotationType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMemberInAnnotationVisibility__Marker_CONTEXT__TRG__tAnnotation()
	 * @model required="true"
	 * @generated
	 */
	TAnnotationType getCONTEXT__TRG__tAnnotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__TRG__tAnnotation <em>CONTEXT TRG tAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tAnnotation</em>' reference.
	 * @see #getCONTEXT__TRG__tAnnotation()
	 * @generated
	 */
	void setCONTEXT__TRG__tAnnotation(TAnnotationType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tMember</em>' reference.
	 * @see #setCONTEXT__TRG__tMember(TMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMemberInAnnotationVisibility__Marker_CONTEXT__TRG__tMember()
	 * @model required="true"
	 * @generated
	 */
	TMember getCONTEXT__TRG__tMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tMember</em>' reference.
	 * @see #getCONTEXT__TRG__tMember()
	 * @generated
	 */
	void setCONTEXT__TRG__tMember(TMember value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tModifier</em>' reference.
	 * @see #setCREATE__TRG__tModifier(TModifier)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMemberInAnnotationVisibility__Marker_CREATE__TRG__tModifier()
	 * @model required="true"
	 * @generated
	 */
	TModifier getCREATE__TRG__tModifier();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCREATE__TRG__tModifier <em>CREATE TRG tModifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tModifier</em>' reference.
	 * @see #getCREATE__TRG__tModifier()
	 * @generated
	 */
	void setCREATE__TRG__tModifier(TModifier value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR def To Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR def To Member</em>' reference.
	 * @see #setCONTEXT__CORR__defToMember(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMemberInAnnotationVisibility__Marker_CONTEXT__CORR__defToMember()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCONTEXT__CORR__defToMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__CORR__defToMember <em>CONTEXT CORR def To Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR def To Member</em>' reference.
	 * @see #getCONTEXT__CORR__defToMember()
	 * @generated
	 */
	void setCONTEXT__CORR__defToMember(MDefinitionToTMember value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mModifier To TModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mModifier To TModifier</em>' reference.
	 * @see #setCREATE__CORR__mModifierToTModifier(MModifierToTModifier)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMemberInAnnotationVisibility__Marker_CREATE__CORR__mModifierToTModifier()
	 * @model required="true"
	 * @generated
	 */
	MModifierToTModifier getCREATE__CORR__mModifierToTModifier();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCREATE__CORR__mModifierToTModifier <em>CREATE CORR mModifier To TModifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mModifier To TModifier</em>' reference.
	 * @see #getCREATE__CORR__mModifierToTModifier()
	 * @generated
	 */
	void setCREATE__CORR__mModifierToTModifier(MModifierToTModifier value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mType To TType</em>' reference.
	 * @see #setCONTEXT__CORR__mTypeToTType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getMemberInAnnotationVisibility__Marker_CONTEXT__CORR__mTypeToTType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__mTypeToTType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.MemberInAnnotationVisibility__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mType To TType</em>' reference.
	 * @see #getCONTEXT__CORR__mTypeToTType()
	 * @generated
	 */
	void setCONTEXT__CORR__mTypeToTType(TypeToTAbstractType value);

} // MemberInAnnotationVisibility__Marker
