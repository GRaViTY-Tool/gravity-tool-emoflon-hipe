/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Annotation;

import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation To TAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.AnnotationToTAnnotation#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationToTAnnotation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationToTAnnotation()
 * @model
 * @generated
 */
public interface AnnotationToTAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Annotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationToTAnnotation_Source()
	 * @model
	 * @generated
	 */
	Annotation getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationToTAnnotation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Annotation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAnnotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationToTAnnotation_Target()
	 * @model
	 * @generated
	 */
	TAnnotation getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationToTAnnotation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAnnotation value);

} // AnnotationToTAnnotation
