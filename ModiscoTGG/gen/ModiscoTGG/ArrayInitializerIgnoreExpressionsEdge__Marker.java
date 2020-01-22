/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.MethodInvocation;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Initializer Ignore Expressions Edge Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker#getCONTEXT__SRC__array <em>CONTEXT SRC array</em>}</li>
 *   <li>{@link ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker#getCONTEXT__SRC__invocation <em>CONTEXT SRC invocation</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getArrayInitializerIgnoreExpressionsEdge__Marker()
 * @model
 * @generated
 */
public interface ArrayInitializerIgnoreExpressionsEdge__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC array</em>' reference.
	 * @see #setCONTEXT__SRC__array(ArrayInitializer)
	 * @see ModiscoTGG.ModiscoTGGPackage#getArrayInitializerIgnoreExpressionsEdge__Marker_CONTEXT__SRC__array()
	 * @model required="true"
	 * @generated
	 */
	ArrayInitializer getCONTEXT__SRC__array();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker#getCONTEXT__SRC__array <em>CONTEXT SRC array</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC array</em>' reference.
	 * @see #getCONTEXT__SRC__array()
	 * @generated
	 */
	void setCONTEXT__SRC__array(ArrayInitializer value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC invocation</em>' reference.
	 * @see #setCONTEXT__SRC__invocation(MethodInvocation)
	 * @see ModiscoTGG.ModiscoTGGPackage#getArrayInitializerIgnoreExpressionsEdge__Marker_CONTEXT__SRC__invocation()
	 * @model required="true"
	 * @generated
	 */
	MethodInvocation getCONTEXT__SRC__invocation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker#getCONTEXT__SRC__invocation <em>CONTEXT SRC invocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC invocation</em>' reference.
	 * @see #getCONTEXT__SRC__invocation()
	 * @generated
	 */
	void setCONTEXT__SRC__invocation(MethodInvocation value);

} // ArrayInitializerIgnoreExpressionsEdge__Marker
