/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayInitializer;

import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Member Value Annotation Array Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__SRC__mArray <em>CREATE SRC mArray</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberValueAnnotationArray__Marker()
 * @model
 * @generated
 */
public interface AnnotationMemberValueAnnotationArray__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC Annotation Value</em>' reference.
	 * @see #setCONTEXT__SRC__AnnotationValue(AnnotationMemberValuePair)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberValueAnnotationArray__Marker_CONTEXT__SRC__AnnotationValue()
	 * @model required="true"
	 * @generated
	 */
	AnnotationMemberValuePair getCONTEXT__SRC__AnnotationValue();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC Annotation Value</em>' reference.
	 * @see #getCONTEXT__SRC__AnnotationValue()
	 * @generated
	 */
	void setCONTEXT__SRC__AnnotationValue(AnnotationMemberValuePair value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mArray</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mArray</em>' reference.
	 * @see #setCREATE__SRC__mArray(ArrayInitializer)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberValueAnnotationArray__Marker_CREATE__SRC__mArray()
	 * @model required="true"
	 * @generated
	 */
	ArrayInitializer getCREATE__SRC__mArray();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__SRC__mArray <em>CREATE SRC mArray</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mArray</em>' reference.
	 * @see #getCREATE__SRC__mArray()
	 * @generated
	 */
	void setCREATE__SRC__mArray(ArrayInitializer value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mValue</em>' reference.
	 * @see #setCREATE__SRC__mValue(Annotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberValueAnnotationArray__Marker_CREATE__SRC__mValue()
	 * @model required="true"
	 * @generated
	 */
	Annotation getCREATE__SRC__mValue();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mValue</em>' reference.
	 * @see #getCREATE__SRC__mValue()
	 * @generated
	 */
	void setCREATE__SRC__mValue(Annotation value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tAnnotation Value</em>' reference.
	 * @see #setCONTEXT__TRG__tAnnotationValue(TAnnotationValue)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberValueAnnotationArray__Marker_CONTEXT__TRG__tAnnotationValue()
	 * @model required="true"
	 * @generated
	 */
	TAnnotationValue getCONTEXT__TRG__tAnnotationValue();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tAnnotation Value</em>' reference.
	 * @see #getCONTEXT__TRG__tAnnotationValue()
	 * @generated
	 */
	void setCONTEXT__TRG__tAnnotationValue(TAnnotationValue value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tValue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tValue</em>' reference.
	 * @see #setCREATE__TRG__tValue(TAnnotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberValueAnnotationArray__Marker_CREATE__TRG__tValue()
	 * @model required="true"
	 * @generated
	 */
	TAnnotation getCREATE__TRG__tValue();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tValue</em>' reference.
	 * @see #getCREATE__TRG__tValue()
	 * @generated
	 */
	void setCREATE__TRG__tValue(TAnnotation value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>' reference.
	 * @see #setCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue(AnnotationMemberValuePairToTAnnotationValue)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberValueAnnotationArray__Marker_CONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @model required="true"
	 * @generated
	 */
	AnnotationMemberValuePairToTAnnotationValue getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>' reference.
	 * @see #getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 */
	void setCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue(
			AnnotationMemberValuePairToTAnnotationValue value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mType To TType</em>' reference.
	 * @see #setCREATE__CORR__mTypeToTType(AnnotationToTAnnotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberValueAnnotationArray__Marker_CREATE__CORR__mTypeToTType()
	 * @model required="true"
	 * @generated
	 */
	AnnotationToTAnnotation getCREATE__CORR__mTypeToTType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mType To TType</em>' reference.
	 * @see #getCREATE__CORR__mTypeToTType()
	 * @generated
	 */
	void setCREATE__CORR__mTypeToTType(AnnotationToTAnnotation value);

} // AnnotationMemberValueAnnotationArray__Marker
