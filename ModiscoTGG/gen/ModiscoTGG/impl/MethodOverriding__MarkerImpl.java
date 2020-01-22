/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.MethodOverriding__Marker;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MMethodDefinition;

import org.gravity.typegraph.basic.TMethodDefinition;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Overriding Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.MethodOverriding__MarkerImpl#getCONTEXT__SRC__mMethod <em>CONTEXT SRC mMethod</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodOverriding__MarkerImpl#getCONTEXT__SRC__mOverriding <em>CONTEXT SRC mOverriding</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodOverriding__MarkerImpl#getCONTEXT__TRG__tMethod <em>CONTEXT TRG tMethod</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodOverriding__MarkerImpl#getCONTEXT__TRG__tOverriding <em>CONTEXT TRG tOverriding</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodOverriding__MarkerImpl#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodOverriding__MarkerImpl#getCONTEXT__CORR__mOverridingToTOverriding <em>CONTEXT CORR mOverriding To TOverriding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodOverriding__MarkerImpl extends TGGRuleApplicationImpl implements MethodOverriding__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mMethod() <em>CONTEXT SRC mMethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mMethod()
	 * @generated
	 * @ordered
	 */
	protected MMethodDefinition contexT__SRC__mMethod;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mOverriding() <em>CONTEXT SRC mOverriding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mOverriding()
	 * @generated
	 * @ordered
	 */
	protected MMethodDefinition contexT__SRC__mOverriding;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tMethod() <em>CONTEXT TRG tMethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tMethod()
	 * @generated
	 * @ordered
	 */
	protected TMethodDefinition contexT__TRG__tMethod;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tOverriding() <em>CONTEXT TRG tOverriding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tOverriding()
	 * @generated
	 * @ordered
	 */
	protected TMethodDefinition contexT__TRG__tOverriding;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mMethodToTMethod() <em>CONTEXT CORR mMethod To TMethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mMethodToTMethod()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember contexT__CORR__mMethodToTMethod;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mOverridingToTOverriding() <em>CONTEXT CORR mOverriding To TOverriding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mOverridingToTOverriding()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember contexT__CORR__mOverridingToTOverriding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodOverriding__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getMethodOverriding__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodDefinition getCONTEXT__SRC__mMethod() {
		if (contexT__SRC__mMethod != null && contexT__SRC__mMethod.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mMethod = (InternalEObject) contexT__SRC__mMethod;
			contexT__SRC__mMethod = (MMethodDefinition) eResolveProxy(oldCONTEXT__SRC__mMethod);
			if (contexT__SRC__mMethod != oldCONTEXT__SRC__mMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MMETHOD, oldCONTEXT__SRC__mMethod,
							contexT__SRC__mMethod));
			}
		}
		return contexT__SRC__mMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodDefinition basicGetCONTEXT__SRC__mMethod() {
		return contexT__SRC__mMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mMethod(MMethodDefinition newCONTEXT__SRC__mMethod) {
		MMethodDefinition oldCONTEXT__SRC__mMethod = contexT__SRC__mMethod;
		contexT__SRC__mMethod = newCONTEXT__SRC__mMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MMETHOD, oldCONTEXT__SRC__mMethod,
					contexT__SRC__mMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodDefinition getCONTEXT__SRC__mOverriding() {
		if (contexT__SRC__mOverriding != null && contexT__SRC__mOverriding.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mOverriding = (InternalEObject) contexT__SRC__mOverriding;
			contexT__SRC__mOverriding = (MMethodDefinition) eResolveProxy(oldCONTEXT__SRC__mOverriding);
			if (contexT__SRC__mOverriding != oldCONTEXT__SRC__mOverriding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MOVERRIDING,
							oldCONTEXT__SRC__mOverriding, contexT__SRC__mOverriding));
			}
		}
		return contexT__SRC__mOverriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodDefinition basicGetCONTEXT__SRC__mOverriding() {
		return contexT__SRC__mOverriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mOverriding(MMethodDefinition newCONTEXT__SRC__mOverriding) {
		MMethodDefinition oldCONTEXT__SRC__mOverriding = contexT__SRC__mOverriding;
		contexT__SRC__mOverriding = newCONTEXT__SRC__mOverriding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MOVERRIDING, oldCONTEXT__SRC__mOverriding,
					contexT__SRC__mOverriding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodDefinition getCONTEXT__TRG__tMethod() {
		if (contexT__TRG__tMethod != null && contexT__TRG__tMethod.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tMethod = (InternalEObject) contexT__TRG__tMethod;
			contexT__TRG__tMethod = (TMethodDefinition) eResolveProxy(oldCONTEXT__TRG__tMethod);
			if (contexT__TRG__tMethod != oldCONTEXT__TRG__tMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TMETHOD, oldCONTEXT__TRG__tMethod,
							contexT__TRG__tMethod));
			}
		}
		return contexT__TRG__tMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition basicGetCONTEXT__TRG__tMethod() {
		return contexT__TRG__tMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tMethod(TMethodDefinition newCONTEXT__TRG__tMethod) {
		TMethodDefinition oldCONTEXT__TRG__tMethod = contexT__TRG__tMethod;
		contexT__TRG__tMethod = newCONTEXT__TRG__tMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TMETHOD, oldCONTEXT__TRG__tMethod,
					contexT__TRG__tMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodDefinition getCONTEXT__TRG__tOverriding() {
		if (contexT__TRG__tOverriding != null && contexT__TRG__tOverriding.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tOverriding = (InternalEObject) contexT__TRG__tOverriding;
			contexT__TRG__tOverriding = (TMethodDefinition) eResolveProxy(oldCONTEXT__TRG__tOverriding);
			if (contexT__TRG__tOverriding != oldCONTEXT__TRG__tOverriding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TOVERRIDING,
							oldCONTEXT__TRG__tOverriding, contexT__TRG__tOverriding));
			}
		}
		return contexT__TRG__tOverriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition basicGetCONTEXT__TRG__tOverriding() {
		return contexT__TRG__tOverriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tOverriding(TMethodDefinition newCONTEXT__TRG__tOverriding) {
		TMethodDefinition oldCONTEXT__TRG__tOverriding = contexT__TRG__tOverriding;
		contexT__TRG__tOverriding = newCONTEXT__TRG__tOverriding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TOVERRIDING, oldCONTEXT__TRG__tOverriding,
					contexT__TRG__tOverriding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember getCONTEXT__CORR__mMethodToTMethod() {
		if (contexT__CORR__mMethodToTMethod != null && contexT__CORR__mMethodToTMethod.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mMethodToTMethod = (InternalEObject) contexT__CORR__mMethodToTMethod;
			contexT__CORR__mMethodToTMethod = (MDefinitionToTMember) eResolveProxy(oldCONTEXT__CORR__mMethodToTMethod);
			if (contexT__CORR__mMethodToTMethod != oldCONTEXT__CORR__mMethodToTMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD,
							oldCONTEXT__CORR__mMethodToTMethod, contexT__CORR__mMethodToTMethod));
			}
		}
		return contexT__CORR__mMethodToTMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTMember basicGetCONTEXT__CORR__mMethodToTMethod() {
		return contexT__CORR__mMethodToTMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mMethodToTMethod(MDefinitionToTMember newCONTEXT__CORR__mMethodToTMethod) {
		MDefinitionToTMember oldCONTEXT__CORR__mMethodToTMethod = contexT__CORR__mMethodToTMethod;
		contexT__CORR__mMethodToTMethod = newCONTEXT__CORR__mMethodToTMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD,
					oldCONTEXT__CORR__mMethodToTMethod, contexT__CORR__mMethodToTMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember getCONTEXT__CORR__mOverridingToTOverriding() {
		if (contexT__CORR__mOverridingToTOverriding != null && contexT__CORR__mOverridingToTOverriding.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mOverridingToTOverriding = (InternalEObject) contexT__CORR__mOverridingToTOverriding;
			contexT__CORR__mOverridingToTOverriding = (MDefinitionToTMember) eResolveProxy(
					oldCONTEXT__CORR__mOverridingToTOverriding);
			if (contexT__CORR__mOverridingToTOverriding != oldCONTEXT__CORR__mOverridingToTOverriding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MOVERRIDING_TO_TOVERRIDING,
							oldCONTEXT__CORR__mOverridingToTOverriding, contexT__CORR__mOverridingToTOverriding));
			}
		}
		return contexT__CORR__mOverridingToTOverriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTMember basicGetCONTEXT__CORR__mOverridingToTOverriding() {
		return contexT__CORR__mOverridingToTOverriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mOverridingToTOverriding(
			MDefinitionToTMember newCONTEXT__CORR__mOverridingToTOverriding) {
		MDefinitionToTMember oldCONTEXT__CORR__mOverridingToTOverriding = contexT__CORR__mOverridingToTOverriding;
		contexT__CORR__mOverridingToTOverriding = newCONTEXT__CORR__mOverridingToTOverriding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MOVERRIDING_TO_TOVERRIDING,
					oldCONTEXT__CORR__mOverridingToTOverriding, contexT__CORR__mOverridingToTOverriding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MMETHOD:
			if (resolve)
				return getCONTEXT__SRC__mMethod();
			return basicGetCONTEXT__SRC__mMethod();
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MOVERRIDING:
			if (resolve)
				return getCONTEXT__SRC__mOverriding();
			return basicGetCONTEXT__SRC__mOverriding();
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TMETHOD:
			if (resolve)
				return getCONTEXT__TRG__tMethod();
			return basicGetCONTEXT__TRG__tMethod();
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TOVERRIDING:
			if (resolve)
				return getCONTEXT__TRG__tOverriding();
			return basicGetCONTEXT__TRG__tOverriding();
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD:
			if (resolve)
				return getCONTEXT__CORR__mMethodToTMethod();
			return basicGetCONTEXT__CORR__mMethodToTMethod();
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MOVERRIDING_TO_TOVERRIDING:
			if (resolve)
				return getCONTEXT__CORR__mOverridingToTOverriding();
			return basicGetCONTEXT__CORR__mOverridingToTOverriding();
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
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MMETHOD:
			setCONTEXT__SRC__mMethod((MMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MOVERRIDING:
			setCONTEXT__SRC__mOverriding((MMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TMETHOD:
			setCONTEXT__TRG__tMethod((TMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TOVERRIDING:
			setCONTEXT__TRG__tOverriding((TMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD:
			setCONTEXT__CORR__mMethodToTMethod((MDefinitionToTMember) newValue);
			return;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MOVERRIDING_TO_TOVERRIDING:
			setCONTEXT__CORR__mOverridingToTOverriding((MDefinitionToTMember) newValue);
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
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MMETHOD:
			setCONTEXT__SRC__mMethod((MMethodDefinition) null);
			return;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MOVERRIDING:
			setCONTEXT__SRC__mOverriding((MMethodDefinition) null);
			return;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TMETHOD:
			setCONTEXT__TRG__tMethod((TMethodDefinition) null);
			return;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TOVERRIDING:
			setCONTEXT__TRG__tOverriding((TMethodDefinition) null);
			return;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD:
			setCONTEXT__CORR__mMethodToTMethod((MDefinitionToTMember) null);
			return;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MOVERRIDING_TO_TOVERRIDING:
			setCONTEXT__CORR__mOverridingToTOverriding((MDefinitionToTMember) null);
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
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MMETHOD:
			return contexT__SRC__mMethod != null;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_SRC_MOVERRIDING:
			return contexT__SRC__mOverriding != null;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TMETHOD:
			return contexT__TRG__tMethod != null;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_TRG_TOVERRIDING:
			return contexT__TRG__tOverriding != null;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD:
			return contexT__CORR__mMethodToTMethod != null;
		case ModiscoTGGPackage.METHOD_OVERRIDING_MARKER__CONTEXT_CORR_MOVERRIDING_TO_TOVERRIDING:
			return contexT__CORR__mOverridingToTOverriding != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodOverriding__MarkerImpl
