/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AnnotationMemberValuePair;

import org.gravity.typegraph.basic.annotations.TAnnotationValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Member Value Pair To TAnnotation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberValuePairToTAnnotationValue()
 * @model
 * @generated
 */
public interface AnnotationMemberValuePairToTAnnotationValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AnnotationMemberValuePair)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberValuePairToTAnnotationValue_Source()
	 * @model
	 * @generated
	 */
	AnnotationMemberValuePair getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AnnotationMemberValuePair value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAnnotationValue)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationMemberValuePairToTAnnotationValue_Target()
	 * @model
	 * @generated
	 */
	TAnnotationValue getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAnnotationValue value);

} // AnnotationMemberValuePairToTAnnotationValue
