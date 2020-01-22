/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;

import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Member Key Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.AnnotationMemberKey__Marker#getCONTEXT__SRC__Annotation <em>CONTEXT SRC Annotation</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationMemberKey__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationMemberKey__Marker#getCONTEXT__TRG__tAnnotation <em>CONTEXT TRG tAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationMemberKey__Marker#getCREATE__TRG__tAnnotationValue <em>CREATE TRG tAnnotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationMemberKey__Marker#getCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CREATE CORR Annotation Member Value Pair To TAnnotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationMemberKey__Marker#getCONTEXT__CORR__AnnotationToTAnnotation <em>CONTEXT CORR Annotation To TAnnotation</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberKey__Marker()
 * @model
 * @generated
 */
public interface AnnotationMemberKey__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC Annotation</em>' reference.
	 * @see #setCONTEXT__SRC__Annotation(Annotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberKey__Marker_CONTEXT__SRC__Annotation()
	 * @model required="true"
	 * @generated
	 */
	Annotation getCONTEXT__SRC__Annotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberKey__Marker#getCONTEXT__SRC__Annotation <em>CONTEXT SRC Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC Annotation</em>' reference.
	 * @see #getCONTEXT__SRC__Annotation()
	 * @generated
	 */
	void setCONTEXT__SRC__Annotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mValue</em>' reference.
	 * @see #setCREATE__SRC__mValue(AnnotationMemberValuePair)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberKey__Marker_CREATE__SRC__mValue()
	 * @model required="true"
	 * @generated
	 */
	AnnotationMemberValuePair getCREATE__SRC__mValue();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberKey__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mValue</em>' reference.
	 * @see #getCREATE__SRC__mValue()
	 * @generated
	 */
	void setCREATE__SRC__mValue(AnnotationMemberValuePair value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tAnnotation</em>' reference.
	 * @see #setCONTEXT__TRG__tAnnotation(TAnnotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberKey__Marker_CONTEXT__TRG__tAnnotation()
	 * @model required="true"
	 * @generated
	 */
	TAnnotation getCONTEXT__TRG__tAnnotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberKey__Marker#getCONTEXT__TRG__tAnnotation <em>CONTEXT TRG tAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tAnnotation</em>' reference.
	 * @see #getCONTEXT__TRG__tAnnotation()
	 * @generated
	 */
	void setCONTEXT__TRG__tAnnotation(TAnnotation value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tAnnotation Value</em>' reference.
	 * @see #setCREATE__TRG__tAnnotationValue(TAnnotationValue)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberKey__Marker_CREATE__TRG__tAnnotationValue()
	 * @model required="true"
	 * @generated
	 */
	TAnnotationValue getCREATE__TRG__tAnnotationValue();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberKey__Marker#getCREATE__TRG__tAnnotationValue <em>CREATE TRG tAnnotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tAnnotation Value</em>' reference.
	 * @see #getCREATE__TRG__tAnnotationValue()
	 * @generated
	 */
	void setCREATE__TRG__tAnnotationValue(TAnnotationValue value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR Annotation Member Value Pair To TAnnotation Value</em>' reference.
	 * @see #setCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue(AnnotationMemberValuePairToTAnnotationValue)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberKey__Marker_CREATE__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @model required="true"
	 * @generated
	 */
	AnnotationMemberValuePairToTAnnotationValue getCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberKey__Marker#getCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CREATE CORR Annotation Member Value Pair To TAnnotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR Annotation Member Value Pair To TAnnotation Value</em>' reference.
	 * @see #getCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 */
	void setCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue(
			AnnotationMemberValuePairToTAnnotationValue value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR Annotation To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR Annotation To TAnnotation</em>' reference.
	 * @see #setCONTEXT__CORR__AnnotationToTAnnotation(AnnotationToTAnnotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberKey__Marker_CONTEXT__CORR__AnnotationToTAnnotation()
	 * @model required="true"
	 * @generated
	 */
	AnnotationToTAnnotation getCONTEXT__CORR__AnnotationToTAnnotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberKey__Marker#getCONTEXT__CORR__AnnotationToTAnnotation <em>CONTEXT CORR Annotation To TAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR Annotation To TAnnotation</em>' reference.
	 * @see #getCONTEXT__CORR__AnnotationToTAnnotation()
	 * @generated
	 */
	void setCONTEXT__CORR__AnnotationToTAnnotation(AnnotationToTAnnotation value);

} // AnnotationMemberKey__Marker
