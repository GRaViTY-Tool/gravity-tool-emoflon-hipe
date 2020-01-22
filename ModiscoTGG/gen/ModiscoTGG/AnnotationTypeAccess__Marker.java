/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Type Access Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__SRC__Annotation <em>CONTEXT SRC Annotation</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__SRC__AnnotationType <em>CONTEXT SRC Annotation Type</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__TRG__tAnnotation <em>CONTEXT TRG tAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__TRG__tAnnotationType <em>CONTEXT TRG tAnnotation Type</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__CORR__AnnotationToTAnnotation <em>CONTEXT CORR Annotation To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__CORR__AnnotationTypeToTAnnotationType <em>CONTEXT CORR Annotation Type To TAnnotation Type</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeAccess__Marker()
 * @model
 * @generated
 */
public interface AnnotationTypeAccess__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC Annotation</em>' reference.
	 * @see #setCONTEXT__SRC__Annotation(Annotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeAccess__Marker_CONTEXT__SRC__Annotation()
	 * @model required="true"
	 * @generated
	 */
	Annotation getCONTEXT__SRC__Annotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__SRC__Annotation <em>CONTEXT SRC Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC Annotation</em>' reference.
	 * @see #getCONTEXT__SRC__Annotation()
	 * @generated
	 */
	void setCONTEXT__SRC__Annotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC Annotation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC Annotation Type</em>' reference.
	 * @see #setCONTEXT__SRC__AnnotationType(AnnotationTypeDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeAccess__Marker_CONTEXT__SRC__AnnotationType()
	 * @model required="true"
	 * @generated
	 */
	AnnotationTypeDeclaration getCONTEXT__SRC__AnnotationType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__SRC__AnnotationType <em>CONTEXT SRC Annotation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC Annotation Type</em>' reference.
	 * @see #getCONTEXT__SRC__AnnotationType()
	 * @generated
	 */
	void setCONTEXT__SRC__AnnotationType(AnnotationTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mAccess</em>' reference.
	 * @see #setCREATE__SRC__mAccess(TypeAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeAccess__Marker_CREATE__SRC__mAccess()
	 * @model required="true"
	 * @generated
	 */
	TypeAccess getCREATE__SRC__mAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mAccess</em>' reference.
	 * @see #getCREATE__SRC__mAccess()
	 * @generated
	 */
	void setCREATE__SRC__mAccess(TypeAccess value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tAnnotation</em>' reference.
	 * @see #setCONTEXT__TRG__tAnnotation(TAnnotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeAccess__Marker_CONTEXT__TRG__tAnnotation()
	 * @model required="true"
	 * @generated
	 */
	TAnnotation getCONTEXT__TRG__tAnnotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__TRG__tAnnotation <em>CONTEXT TRG tAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tAnnotation</em>' reference.
	 * @see #getCONTEXT__TRG__tAnnotation()
	 * @generated
	 */
	void setCONTEXT__TRG__tAnnotation(TAnnotation value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tAnnotation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tAnnotation Type</em>' reference.
	 * @see #setCONTEXT__TRG__tAnnotationType(TAnnotationType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeAccess__Marker_CONTEXT__TRG__tAnnotationType()
	 * @model required="true"
	 * @generated
	 */
	TAnnotationType getCONTEXT__TRG__tAnnotationType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__TRG__tAnnotationType <em>CONTEXT TRG tAnnotation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tAnnotation Type</em>' reference.
	 * @see #getCONTEXT__TRG__tAnnotationType()
	 * @generated
	 */
	void setCONTEXT__TRG__tAnnotationType(TAnnotationType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR Annotation To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR Annotation To TAnnotation</em>' reference.
	 * @see #setCONTEXT__CORR__AnnotationToTAnnotation(AnnotationToTAnnotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeAccess__Marker_CONTEXT__CORR__AnnotationToTAnnotation()
	 * @model required="true"
	 * @generated
	 */
	AnnotationToTAnnotation getCONTEXT__CORR__AnnotationToTAnnotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__CORR__AnnotationToTAnnotation <em>CONTEXT CORR Annotation To TAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR Annotation To TAnnotation</em>' reference.
	 * @see #getCONTEXT__CORR__AnnotationToTAnnotation()
	 * @generated
	 */
	void setCONTEXT__CORR__AnnotationToTAnnotation(AnnotationToTAnnotation value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR Annotation Type To TAnnotation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR Annotation Type To TAnnotation Type</em>' reference.
	 * @see #setCONTEXT__CORR__AnnotationTypeToTAnnotationType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeAccess__Marker_CONTEXT__CORR__AnnotationTypeToTAnnotationType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__AnnotationTypeToTAnnotationType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeAccess__Marker#getCONTEXT__CORR__AnnotationTypeToTAnnotationType <em>CONTEXT CORR Annotation Type To TAnnotation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR Annotation Type To TAnnotation Type</em>' reference.
	 * @see #getCONTEXT__CORR__AnnotationTypeToTAnnotationType()
	 * @generated
	 */
	void setCONTEXT__CORR__AnnotationTypeToTAnnotationType(TypeToTAbstractType value);

} // AnnotationTypeAccess__Marker
