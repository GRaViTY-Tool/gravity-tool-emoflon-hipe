/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.BodyDeclaration;

import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation On Body Declaration Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCREATE__SRC__Annotation <em>CREATE SRC Annotation</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCONTEXT__SRC__astNode <em>CONTEXT SRC ast Node</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCONTEXT__TRG__tAnnotable <em>CONTEXT TRG tAnnotable</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCREATE__TRG__tAnnotation <em>CREATE TRG tAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCREATE__CORR__AnnotationToTAnnotation <em>CREATE CORR Annotation To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCONTEXT__CORR__aSTNodeToTAnnotable <em>CONTEXT CORR aST Node To TAnnotable</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationOnBodyDeclaration__Marker()
 * @model
 * @generated
 */
public interface AnnotationOnBodyDeclaration__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC Annotation</em>' reference.
	 * @see #setCREATE__SRC__Annotation(Annotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationOnBodyDeclaration__Marker_CREATE__SRC__Annotation()
	 * @model required="true"
	 * @generated
	 */
	Annotation getCREATE__SRC__Annotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCREATE__SRC__Annotation <em>CREATE SRC Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC Annotation</em>' reference.
	 * @see #getCREATE__SRC__Annotation()
	 * @generated
	 */
	void setCREATE__SRC__Annotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC ast Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC ast Node</em>' reference.
	 * @see #setCONTEXT__SRC__astNode(BodyDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationOnBodyDeclaration__Marker_CONTEXT__SRC__astNode()
	 * @model required="true"
	 * @generated
	 */
	BodyDeclaration getCONTEXT__SRC__astNode();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCONTEXT__SRC__astNode <em>CONTEXT SRC ast Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC ast Node</em>' reference.
	 * @see #getCONTEXT__SRC__astNode()
	 * @generated
	 */
	void setCONTEXT__SRC__astNode(BodyDeclaration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tAnnotable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tAnnotable</em>' reference.
	 * @see #setCONTEXT__TRG__tAnnotable(TAnnotatable)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationOnBodyDeclaration__Marker_CONTEXT__TRG__tAnnotable()
	 * @model required="true"
	 * @generated
	 */
	TAnnotatable getCONTEXT__TRG__tAnnotable();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCONTEXT__TRG__tAnnotable <em>CONTEXT TRG tAnnotable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tAnnotable</em>' reference.
	 * @see #getCONTEXT__TRG__tAnnotable()
	 * @generated
	 */
	void setCONTEXT__TRG__tAnnotable(TAnnotatable value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tAnnotation</em>' reference.
	 * @see #setCREATE__TRG__tAnnotation(TAnnotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationOnBodyDeclaration__Marker_CREATE__TRG__tAnnotation()
	 * @model required="true"
	 * @generated
	 */
	TAnnotation getCREATE__TRG__tAnnotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCREATE__TRG__tAnnotation <em>CREATE TRG tAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tAnnotation</em>' reference.
	 * @see #getCREATE__TRG__tAnnotation()
	 * @generated
	 */
	void setCREATE__TRG__tAnnotation(TAnnotation value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR Annotation To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR Annotation To TAnnotation</em>' reference.
	 * @see #setCREATE__CORR__AnnotationToTAnnotation(AnnotationToTAnnotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationOnBodyDeclaration__Marker_CREATE__CORR__AnnotationToTAnnotation()
	 * @model required="true"
	 * @generated
	 */
	AnnotationToTAnnotation getCREATE__CORR__AnnotationToTAnnotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCREATE__CORR__AnnotationToTAnnotation <em>CREATE CORR Annotation To TAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR Annotation To TAnnotation</em>' reference.
	 * @see #getCREATE__CORR__AnnotationToTAnnotation()
	 * @generated
	 */
	void setCREATE__CORR__AnnotationToTAnnotation(AnnotationToTAnnotation value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR aST Node To TAnnotable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR aST Node To TAnnotable</em>' reference.
	 * @see #setCONTEXT__CORR__aSTNodeToTAnnotable(ASTNodeToTAnnotatable)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationOnBodyDeclaration__Marker_CONTEXT__CORR__aSTNodeToTAnnotable()
	 * @model required="true"
	 * @generated
	 */
	ASTNodeToTAnnotatable getCONTEXT__CORR__aSTNodeToTAnnotable();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationOnBodyDeclaration__Marker#getCONTEXT__CORR__aSTNodeToTAnnotable <em>CONTEXT CORR aST Node To TAnnotable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR aST Node To TAnnotable</em>' reference.
	 * @see #getCONTEXT__CORR__aSTNodeToTAnnotable()
	 * @generated
	 */
	void setCONTEXT__CORR__aSTNodeToTAnnotable(ASTNodeToTAnnotatable value);

} // AnnotationOnBodyDeclaration__Marker
