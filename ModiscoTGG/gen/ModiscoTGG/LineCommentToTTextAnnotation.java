/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.LineComment;

import org.gravity.typegraph.basic.annotations.TTextAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Comment To TText Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.LineCommentToTTextAnnotation#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.LineCommentToTTextAnnotation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getLineCommentToTTextAnnotation()
 * @model
 * @generated
 */
public interface LineCommentToTTextAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(LineComment)
	 * @see ModiscoTGG.ModiscoTGGPackage#getLineCommentToTTextAnnotation_Source()
	 * @model
	 * @generated
	 */
	LineComment getSource();

	/**
	 * Sets the value of the '{@link ModiscoTGG.LineCommentToTTextAnnotation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LineComment value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TTextAnnotation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getLineCommentToTTextAnnotation_Target()
	 * @model
	 * @generated
	 */
	TTextAnnotation getTarget();

	/**
	 * Sets the value of the '{@link ModiscoTGG.LineCommentToTTextAnnotation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TTextAnnotation value);

} // LineCommentToTTextAnnotation
