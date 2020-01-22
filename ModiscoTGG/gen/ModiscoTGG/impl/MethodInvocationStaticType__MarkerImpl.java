/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.AbstractMethodInvocationToTAccess;
import ModiscoTGG.MethodInvocationStaticType__Marker;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MMethodInvocation;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TCall;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Invocation Static Type Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationStaticType__MarkerImpl#getCONTEXT__SRC__invocation <em>CONTEXT SRC invocation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationStaticType__MarkerImpl#getCONTEXT__SRC__mStaticType <em>CONTEXT SRC mStatic Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationStaticType__MarkerImpl#getCONTEXT__TRG__tAccess <em>CONTEXT TRG tAccess</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationStaticType__MarkerImpl#getCONTEXT__TRG__tStaticType <em>CONTEXT TRG tStatic Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationStaticType__MarkerImpl#getCONTEXT__CORR__invocationToTAccess <em>CONTEXT CORR invocation To TAccess</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationStaticType__MarkerImpl#getCONTEXT__CORR__mStaticTypeTotStaticType <em>CONTEXT CORR mStatic Type Tot Static Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodInvocationStaticType__MarkerImpl extends TGGRuleApplicationImpl
		implements MethodInvocationStaticType__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__invocation() <em>CONTEXT SRC invocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__invocation()
	 * @generated
	 * @ordered
	 */
	protected MMethodInvocation contexT__SRC__invocation;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mStaticType() <em>CONTEXT SRC mStatic Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mStaticType()
	 * @generated
	 * @ordered
	 */
	protected Type contexT__SRC__mStaticType;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tAccess() <em>CONTEXT TRG tAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tAccess()
	 * @generated
	 * @ordered
	 */
	protected TCall contexT__TRG__tAccess;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tStaticType() <em>CONTEXT TRG tStatic Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tStaticType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType contexT__TRG__tStaticType;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__invocationToTAccess() <em>CONTEXT CORR invocation To TAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__invocationToTAccess()
	 * @generated
	 * @ordered
	 */
	protected AbstractMethodInvocationToTAccess contexT__CORR__invocationToTAccess;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mStaticTypeTotStaticType() <em>CONTEXT CORR mStatic Type Tot Static Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mStaticTypeTotStaticType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__mStaticTypeTotStaticType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationStaticType__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getMethodInvocationStaticType__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodInvocation getCONTEXT__SRC__invocation() {
		if (contexT__SRC__invocation != null && contexT__SRC__invocation.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__invocation = (InternalEObject) contexT__SRC__invocation;
			contexT__SRC__invocation = (MMethodInvocation) eResolveProxy(oldCONTEXT__SRC__invocation);
			if (contexT__SRC__invocation != oldCONTEXT__SRC__invocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_INVOCATION,
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
	public MMethodInvocation basicGetCONTEXT__SRC__invocation() {
		return contexT__SRC__invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__invocation(MMethodInvocation newCONTEXT__SRC__invocation) {
		MMethodInvocation oldCONTEXT__SRC__invocation = contexT__SRC__invocation;
		contexT__SRC__invocation = newCONTEXT__SRC__invocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_INVOCATION,
					oldCONTEXT__SRC__invocation, contexT__SRC__invocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getCONTEXT__SRC__mStaticType() {
		if (contexT__SRC__mStaticType != null && contexT__SRC__mStaticType.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mStaticType = (InternalEObject) contexT__SRC__mStaticType;
			contexT__SRC__mStaticType = (Type) eResolveProxy(oldCONTEXT__SRC__mStaticType);
			if (contexT__SRC__mStaticType != oldCONTEXT__SRC__mStaticType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_MSTATIC_TYPE,
							oldCONTEXT__SRC__mStaticType, contexT__SRC__mStaticType));
			}
		}
		return contexT__SRC__mStaticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetCONTEXT__SRC__mStaticType() {
		return contexT__SRC__mStaticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mStaticType(Type newCONTEXT__SRC__mStaticType) {
		Type oldCONTEXT__SRC__mStaticType = contexT__SRC__mStaticType;
		contexT__SRC__mStaticType = newCONTEXT__SRC__mStaticType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_MSTATIC_TYPE,
					oldCONTEXT__SRC__mStaticType, contexT__SRC__mStaticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCall getCONTEXT__TRG__tAccess() {
		if (contexT__TRG__tAccess != null && contexT__TRG__tAccess.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tAccess = (InternalEObject) contexT__TRG__tAccess;
			contexT__TRG__tAccess = (TCall) eResolveProxy(oldCONTEXT__TRG__tAccess);
			if (contexT__TRG__tAccess != oldCONTEXT__TRG__tAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TACCESS,
							oldCONTEXT__TRG__tAccess, contexT__TRG__tAccess));
			}
		}
		return contexT__TRG__tAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCall basicGetCONTEXT__TRG__tAccess() {
		return contexT__TRG__tAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tAccess(TCall newCONTEXT__TRG__tAccess) {
		TCall oldCONTEXT__TRG__tAccess = contexT__TRG__tAccess;
		contexT__TRG__tAccess = newCONTEXT__TRG__tAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TACCESS,
					oldCONTEXT__TRG__tAccess, contexT__TRG__tAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getCONTEXT__TRG__tStaticType() {
		if (contexT__TRG__tStaticType != null && contexT__TRG__tStaticType.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tStaticType = (InternalEObject) contexT__TRG__tStaticType;
			contexT__TRG__tStaticType = (TAbstractType) eResolveProxy(oldCONTEXT__TRG__tStaticType);
			if (contexT__TRG__tStaticType != oldCONTEXT__TRG__tStaticType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TSTATIC_TYPE,
							oldCONTEXT__TRG__tStaticType, contexT__TRG__tStaticType));
			}
		}
		return contexT__TRG__tStaticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetCONTEXT__TRG__tStaticType() {
		return contexT__TRG__tStaticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tStaticType(TAbstractType newCONTEXT__TRG__tStaticType) {
		TAbstractType oldCONTEXT__TRG__tStaticType = contexT__TRG__tStaticType;
		contexT__TRG__tStaticType = newCONTEXT__TRG__tStaticType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TSTATIC_TYPE,
					oldCONTEXT__TRG__tStaticType, contexT__TRG__tStaticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodInvocationToTAccess getCONTEXT__CORR__invocationToTAccess() {
		if (contexT__CORR__invocationToTAccess != null && contexT__CORR__invocationToTAccess.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__invocationToTAccess = (InternalEObject) contexT__CORR__invocationToTAccess;
			contexT__CORR__invocationToTAccess = (AbstractMethodInvocationToTAccess) eResolveProxy(
					oldCONTEXT__CORR__invocationToTAccess);
			if (contexT__CORR__invocationToTAccess != oldCONTEXT__CORR__invocationToTAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_INVOCATION_TO_TACCESS,
							oldCONTEXT__CORR__invocationToTAccess, contexT__CORR__invocationToTAccess));
			}
		}
		return contexT__CORR__invocationToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMethodInvocationToTAccess basicGetCONTEXT__CORR__invocationToTAccess() {
		return contexT__CORR__invocationToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__invocationToTAccess(
			AbstractMethodInvocationToTAccess newCONTEXT__CORR__invocationToTAccess) {
		AbstractMethodInvocationToTAccess oldCONTEXT__CORR__invocationToTAccess = contexT__CORR__invocationToTAccess;
		contexT__CORR__invocationToTAccess = newCONTEXT__CORR__invocationToTAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_INVOCATION_TO_TACCESS,
					oldCONTEXT__CORR__invocationToTAccess, contexT__CORR__invocationToTAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__mStaticTypeTotStaticType() {
		if (contexT__CORR__mStaticTypeTotStaticType != null && contexT__CORR__mStaticTypeTotStaticType.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mStaticTypeTotStaticType = (InternalEObject) contexT__CORR__mStaticTypeTotStaticType;
			contexT__CORR__mStaticTypeTotStaticType = (TypeToTAbstractType) eResolveProxy(
					oldCONTEXT__CORR__mStaticTypeTotStaticType);
			if (contexT__CORR__mStaticTypeTotStaticType != oldCONTEXT__CORR__mStaticTypeTotStaticType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_MSTATIC_TYPE_TOT_STATIC_TYPE,
							oldCONTEXT__CORR__mStaticTypeTotStaticType, contexT__CORR__mStaticTypeTotStaticType));
			}
		}
		return contexT__CORR__mStaticTypeTotStaticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__mStaticTypeTotStaticType() {
		return contexT__CORR__mStaticTypeTotStaticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mStaticTypeTotStaticType(
			TypeToTAbstractType newCONTEXT__CORR__mStaticTypeTotStaticType) {
		TypeToTAbstractType oldCONTEXT__CORR__mStaticTypeTotStaticType = contexT__CORR__mStaticTypeTotStaticType;
		contexT__CORR__mStaticTypeTotStaticType = newCONTEXT__CORR__mStaticTypeTotStaticType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_MSTATIC_TYPE_TOT_STATIC_TYPE,
					oldCONTEXT__CORR__mStaticTypeTotStaticType, contexT__CORR__mStaticTypeTotStaticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_INVOCATION:
			if (resolve)
				return getCONTEXT__SRC__invocation();
			return basicGetCONTEXT__SRC__invocation();
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_MSTATIC_TYPE:
			if (resolve)
				return getCONTEXT__SRC__mStaticType();
			return basicGetCONTEXT__SRC__mStaticType();
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TACCESS:
			if (resolve)
				return getCONTEXT__TRG__tAccess();
			return basicGetCONTEXT__TRG__tAccess();
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TSTATIC_TYPE:
			if (resolve)
				return getCONTEXT__TRG__tStaticType();
			return basicGetCONTEXT__TRG__tStaticType();
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_INVOCATION_TO_TACCESS:
			if (resolve)
				return getCONTEXT__CORR__invocationToTAccess();
			return basicGetCONTEXT__CORR__invocationToTAccess();
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_MSTATIC_TYPE_TOT_STATIC_TYPE:
			if (resolve)
				return getCONTEXT__CORR__mStaticTypeTotStaticType();
			return basicGetCONTEXT__CORR__mStaticTypeTotStaticType();
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
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_INVOCATION:
			setCONTEXT__SRC__invocation((MMethodInvocation) newValue);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_MSTATIC_TYPE:
			setCONTEXT__SRC__mStaticType((Type) newValue);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TACCESS:
			setCONTEXT__TRG__tAccess((TCall) newValue);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TSTATIC_TYPE:
			setCONTEXT__TRG__tStaticType((TAbstractType) newValue);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_INVOCATION_TO_TACCESS:
			setCONTEXT__CORR__invocationToTAccess((AbstractMethodInvocationToTAccess) newValue);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_MSTATIC_TYPE_TOT_STATIC_TYPE:
			setCONTEXT__CORR__mStaticTypeTotStaticType((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_INVOCATION:
			setCONTEXT__SRC__invocation((MMethodInvocation) null);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_MSTATIC_TYPE:
			setCONTEXT__SRC__mStaticType((Type) null);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TACCESS:
			setCONTEXT__TRG__tAccess((TCall) null);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TSTATIC_TYPE:
			setCONTEXT__TRG__tStaticType((TAbstractType) null);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_INVOCATION_TO_TACCESS:
			setCONTEXT__CORR__invocationToTAccess((AbstractMethodInvocationToTAccess) null);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_MSTATIC_TYPE_TOT_STATIC_TYPE:
			setCONTEXT__CORR__mStaticTypeTotStaticType((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_INVOCATION:
			return contexT__SRC__invocation != null;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_SRC_MSTATIC_TYPE:
			return contexT__SRC__mStaticType != null;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TACCESS:
			return contexT__TRG__tAccess != null;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_TRG_TSTATIC_TYPE:
			return contexT__TRG__tStaticType != null;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_INVOCATION_TO_TACCESS:
			return contexT__CORR__invocationToTAccess != null;
		case ModiscoTGGPackage.METHOD_INVOCATION_STATIC_TYPE_MARKER__CONTEXT_CORR_MSTATIC_TYPE_TOT_STATIC_TYPE:
			return contexT__CORR__mStaticTypeTotStaticType != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodInvocationStaticType__MarkerImpl
