/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ArrayInitializerIgnoreExpressionsEdge__Marker;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.MethodInvocation;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Initializer Ignore Expressions Edge Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.ArrayInitializerIgnoreExpressionsEdge__MarkerImpl#getCONTEXT__SRC__array <em>CONTEXT SRC array</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ArrayInitializerIgnoreExpressionsEdge__MarkerImpl#getCONTEXT__SRC__invocation <em>CONTEXT SRC invocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayInitializerIgnoreExpressionsEdge__MarkerImpl extends TGGRuleApplicationImpl
		implements ArrayInitializerIgnoreExpressionsEdge__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__array() <em>CONTEXT SRC array</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__array()
	 * @generated
	 * @ordered
	 */
	protected ArrayInitializer contexT__SRC__array;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__invocation() <em>CONTEXT SRC invocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__invocation()
	 * @generated
	 * @ordered
	 */
	protected MethodInvocation contexT__SRC__invocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayInitializerIgnoreExpressionsEdge__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getArrayInitializerIgnoreExpressionsEdge__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayInitializer getCONTEXT__SRC__array() {
		if (contexT__SRC__array != null && contexT__SRC__array.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__array = (InternalEObject) contexT__SRC__array;
			contexT__SRC__array = (ArrayInitializer) eResolveProxy(oldCONTEXT__SRC__array);
			if (contexT__SRC__array != oldCONTEXT__SRC__array) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_ARRAY,
							oldCONTEXT__SRC__array, contexT__SRC__array));
			}
		}
		return contexT__SRC__array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializer basicGetCONTEXT__SRC__array() {
		return contexT__SRC__array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__array(ArrayInitializer newCONTEXT__SRC__array) {
		ArrayInitializer oldCONTEXT__SRC__array = contexT__SRC__array;
		contexT__SRC__array = newCONTEXT__SRC__array;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_ARRAY,
					oldCONTEXT__SRC__array, contexT__SRC__array));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocation getCONTEXT__SRC__invocation() {
		if (contexT__SRC__invocation != null && contexT__SRC__invocation.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__invocation = (InternalEObject) contexT__SRC__invocation;
			contexT__SRC__invocation = (MethodInvocation) eResolveProxy(oldCONTEXT__SRC__invocation);
			if (contexT__SRC__invocation != oldCONTEXT__SRC__invocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_INVOCATION,
							oldCONTEXT__SRC__invocation, contexT__SRC__invocation));
			}
		}
		return contexT__SRC__invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodInvocation basicGetCONTEXT__SRC__invocation() {
		return contexT__SRC__invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__invocation(MethodInvocation newCONTEXT__SRC__invocation) {
		MethodInvocation oldCONTEXT__SRC__invocation = contexT__SRC__invocation;
		contexT__SRC__invocation = newCONTEXT__SRC__invocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_INVOCATION,
					oldCONTEXT__SRC__invocation, contexT__SRC__invocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_ARRAY:
			if (resolve)
				return getCONTEXT__SRC__array();
			return basicGetCONTEXT__SRC__array();
		case ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_INVOCATION:
			if (resolve)
				return getCONTEXT__SRC__invocation();
			return basicGetCONTEXT__SRC__invocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_ARRAY:
			setCONTEXT__SRC__array((ArrayInitializer) newValue);
			return;
		case ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_INVOCATION:
			setCONTEXT__SRC__invocation((MethodInvocation) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_ARRAY:
			setCONTEXT__SRC__array((ArrayInitializer) null);
			return;
		case ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_INVOCATION:
			setCONTEXT__SRC__invocation((MethodInvocation) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_ARRAY:
			return contexT__SRC__array != null;
		case ModiscoTGGPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE_MARKER__CONTEXT_SRC_INVOCATION:
			return contexT__SRC__invocation != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayInitializerIgnoreExpressionsEdge__MarkerImpl
