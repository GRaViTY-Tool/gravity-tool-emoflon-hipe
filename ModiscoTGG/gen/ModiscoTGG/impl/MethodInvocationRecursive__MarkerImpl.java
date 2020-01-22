/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.AbstractMethodInvocationToTAccess;
import ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement;
import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.MethodInvocationRecursive__Marker;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodInvocation;

import org.gravity.typegraph.basic.TCall;
import org.gravity.typegraph.basic.TMethodDefinition;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Invocation Recursive Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationRecursive__MarkerImpl#getCREATE__SRC__invocation <em>CREATE SRC invocation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationRecursive__MarkerImpl#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationRecursive__MarkerImpl#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationRecursive__MarkerImpl#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationRecursive__MarkerImpl#getCREATE__CORR__invocationToTAccess <em>CREATE CORR invocation To TAccess</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationRecursive__MarkerImpl#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodInvocationRecursive__MarkerImpl#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodInvocationRecursive__MarkerImpl extends TGGRuleApplicationImpl
		implements MethodInvocationRecursive__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__invocation() <em>CREATE SRC invocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__invocation()
	 * @generated
	 * @ordered
	 */
	protected MMethodInvocation creatE__SRC__invocation;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mMember() <em>CONTEXT SRC mMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mMember()
	 * @generated
	 * @ordered
	 */
	protected MMethodDefinition contexT__SRC__mMember;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tAccess() <em>CREATE TRG tAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tAccess()
	 * @generated
	 * @ordered
	 */
	protected TCall creatE__TRG__tAccess;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tMember() <em>CONTEXT TRG tMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tMember()
	 * @generated
	 * @ordered
	 */
	protected TMethodDefinition contexT__TRG__tMember;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__invocationToTAccess() <em>CREATE CORR invocation To TAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__invocationToTAccess()
	 * @generated
	 * @ordered
	 */
	protected AbstractMethodInvocationToTAccess creatE__CORR__invocationToTAccess;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mFlowElementToTFlowElement() <em>CREATE CORR mFlow Element To TFlow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mFlowElementToTFlowElement()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElementToTAbstractFlowElement creatE__CORR__mFlowElementToTFlowElement;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mMemberToTMember() <em>CONTEXT CORR mMember To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mMemberToTMember()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember contexT__CORR__mMemberToTMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationRecursive__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getMethodInvocationRecursive__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodInvocation getCREATE__SRC__invocation() {
		if (creatE__SRC__invocation != null && creatE__SRC__invocation.eIsProxy()) {
			InternalEObject oldCREATE__SRC__invocation = (InternalEObject) creatE__SRC__invocation;
			creatE__SRC__invocation = (MMethodInvocation) eResolveProxy(oldCREATE__SRC__invocation);
			if (creatE__SRC__invocation != oldCREATE__SRC__invocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_SRC_INVOCATION,
							oldCREATE__SRC__invocation, creatE__SRC__invocation));
			}
		}
		return creatE__SRC__invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodInvocation basicGetCREATE__SRC__invocation() {
		return creatE__SRC__invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__invocation(MMethodInvocation newCREATE__SRC__invocation) {
		MMethodInvocation oldCREATE__SRC__invocation = creatE__SRC__invocation;
		creatE__SRC__invocation = newCREATE__SRC__invocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_SRC_INVOCATION,
					oldCREATE__SRC__invocation, creatE__SRC__invocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodDefinition getCONTEXT__SRC__mMember() {
		if (contexT__SRC__mMember != null && contexT__SRC__mMember.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mMember = (InternalEObject) contexT__SRC__mMember;
			contexT__SRC__mMember = (MMethodDefinition) eResolveProxy(oldCONTEXT__SRC__mMember);
			if (contexT__SRC__mMember != oldCONTEXT__SRC__mMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_SRC_MMEMBER,
							oldCONTEXT__SRC__mMember, contexT__SRC__mMember));
			}
		}
		return contexT__SRC__mMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodDefinition basicGetCONTEXT__SRC__mMember() {
		return contexT__SRC__mMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mMember(MMethodDefinition newCONTEXT__SRC__mMember) {
		MMethodDefinition oldCONTEXT__SRC__mMember = contexT__SRC__mMember;
		contexT__SRC__mMember = newCONTEXT__SRC__mMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_SRC_MMEMBER, oldCONTEXT__SRC__mMember,
					contexT__SRC__mMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCall getCREATE__TRG__tAccess() {
		if (creatE__TRG__tAccess != null && creatE__TRG__tAccess.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tAccess = (InternalEObject) creatE__TRG__tAccess;
			creatE__TRG__tAccess = (TCall) eResolveProxy(oldCREATE__TRG__tAccess);
			if (creatE__TRG__tAccess != oldCREATE__TRG__tAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_TRG_TACCESS,
							oldCREATE__TRG__tAccess, creatE__TRG__tAccess));
			}
		}
		return creatE__TRG__tAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCall basicGetCREATE__TRG__tAccess() {
		return creatE__TRG__tAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tAccess(TCall newCREATE__TRG__tAccess) {
		TCall oldCREATE__TRG__tAccess = creatE__TRG__tAccess;
		creatE__TRG__tAccess = newCREATE__TRG__tAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_TRG_TACCESS, oldCREATE__TRG__tAccess,
					creatE__TRG__tAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodDefinition getCONTEXT__TRG__tMember() {
		if (contexT__TRG__tMember != null && contexT__TRG__tMember.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tMember = (InternalEObject) contexT__TRG__tMember;
			contexT__TRG__tMember = (TMethodDefinition) eResolveProxy(oldCONTEXT__TRG__tMember);
			if (contexT__TRG__tMember != oldCONTEXT__TRG__tMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_TRG_TMEMBER,
							oldCONTEXT__TRG__tMember, contexT__TRG__tMember));
			}
		}
		return contexT__TRG__tMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition basicGetCONTEXT__TRG__tMember() {
		return contexT__TRG__tMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tMember(TMethodDefinition newCONTEXT__TRG__tMember) {
		TMethodDefinition oldCONTEXT__TRG__tMember = contexT__TRG__tMember;
		contexT__TRG__tMember = newCONTEXT__TRG__tMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_TRG_TMEMBER, oldCONTEXT__TRG__tMember,
					contexT__TRG__tMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodInvocationToTAccess getCREATE__CORR__invocationToTAccess() {
		if (creatE__CORR__invocationToTAccess != null && creatE__CORR__invocationToTAccess.eIsProxy()) {
			InternalEObject oldCREATE__CORR__invocationToTAccess = (InternalEObject) creatE__CORR__invocationToTAccess;
			creatE__CORR__invocationToTAccess = (AbstractMethodInvocationToTAccess) eResolveProxy(
					oldCREATE__CORR__invocationToTAccess);
			if (creatE__CORR__invocationToTAccess != oldCREATE__CORR__invocationToTAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS,
							oldCREATE__CORR__invocationToTAccess, creatE__CORR__invocationToTAccess));
			}
		}
		return creatE__CORR__invocationToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMethodInvocationToTAccess basicGetCREATE__CORR__invocationToTAccess() {
		return creatE__CORR__invocationToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__invocationToTAccess(
			AbstractMethodInvocationToTAccess newCREATE__CORR__invocationToTAccess) {
		AbstractMethodInvocationToTAccess oldCREATE__CORR__invocationToTAccess = creatE__CORR__invocationToTAccess;
		creatE__CORR__invocationToTAccess = newCREATE__CORR__invocationToTAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS,
					oldCREATE__CORR__invocationToTAccess, creatE__CORR__invocationToTAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElementToTAbstractFlowElement getCREATE__CORR__mFlowElementToTFlowElement() {
		if (creatE__CORR__mFlowElementToTFlowElement != null && creatE__CORR__mFlowElementToTFlowElement.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mFlowElementToTFlowElement = (InternalEObject) creatE__CORR__mFlowElementToTFlowElement;
			creatE__CORR__mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) eResolveProxy(
					oldCREATE__CORR__mFlowElementToTFlowElement);
			if (creatE__CORR__mFlowElementToTFlowElement != oldCREATE__CORR__mFlowElementToTFlowElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT,
							oldCREATE__CORR__mFlowElementToTFlowElement, creatE__CORR__mFlowElementToTFlowElement));
			}
		}
		return creatE__CORR__mFlowElementToTFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElementToTAbstractFlowElement basicGetCREATE__CORR__mFlowElementToTFlowElement() {
		return creatE__CORR__mFlowElementToTFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mFlowElementToTFlowElement(
			MAbstractFlowElementToTAbstractFlowElement newCREATE__CORR__mFlowElementToTFlowElement) {
		MAbstractFlowElementToTAbstractFlowElement oldCREATE__CORR__mFlowElementToTFlowElement = creatE__CORR__mFlowElementToTFlowElement;
		creatE__CORR__mFlowElementToTFlowElement = newCREATE__CORR__mFlowElementToTFlowElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT,
					oldCREATE__CORR__mFlowElementToTFlowElement, creatE__CORR__mFlowElementToTFlowElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember getCONTEXT__CORR__mMemberToTMember() {
		if (contexT__CORR__mMemberToTMember != null && contexT__CORR__mMemberToTMember.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mMemberToTMember = (InternalEObject) contexT__CORR__mMemberToTMember;
			contexT__CORR__mMemberToTMember = (MDefinitionToTMember) eResolveProxy(oldCONTEXT__CORR__mMemberToTMember);
			if (contexT__CORR__mMemberToTMember != oldCONTEXT__CORR__mMemberToTMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER,
							oldCONTEXT__CORR__mMemberToTMember, contexT__CORR__mMemberToTMember));
			}
		}
		return contexT__CORR__mMemberToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTMember basicGetCONTEXT__CORR__mMemberToTMember() {
		return contexT__CORR__mMemberToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mMemberToTMember(MDefinitionToTMember newCONTEXT__CORR__mMemberToTMember) {
		MDefinitionToTMember oldCONTEXT__CORR__mMemberToTMember = contexT__CORR__mMemberToTMember;
		contexT__CORR__mMemberToTMember = newCONTEXT__CORR__mMemberToTMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER,
					oldCONTEXT__CORR__mMemberToTMember, contexT__CORR__mMemberToTMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_SRC_INVOCATION:
			if (resolve)
				return getCREATE__SRC__invocation();
			return basicGetCREATE__SRC__invocation();
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_SRC_MMEMBER:
			if (resolve)
				return getCONTEXT__SRC__mMember();
			return basicGetCONTEXT__SRC__mMember();
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_TRG_TACCESS:
			if (resolve)
				return getCREATE__TRG__tAccess();
			return basicGetCREATE__TRG__tAccess();
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_TRG_TMEMBER:
			if (resolve)
				return getCONTEXT__TRG__tMember();
			return basicGetCONTEXT__TRG__tMember();
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS:
			if (resolve)
				return getCREATE__CORR__invocationToTAccess();
			return basicGetCREATE__CORR__invocationToTAccess();
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			if (resolve)
				return getCREATE__CORR__mFlowElementToTFlowElement();
			return basicGetCREATE__CORR__mFlowElementToTFlowElement();
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			if (resolve)
				return getCONTEXT__CORR__mMemberToTMember();
			return basicGetCONTEXT__CORR__mMemberToTMember();
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
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_SRC_INVOCATION:
			setCREATE__SRC__invocation((MMethodInvocation) newValue);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_SRC_MMEMBER:
			setCONTEXT__SRC__mMember((MMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_TRG_TACCESS:
			setCREATE__TRG__tAccess((TCall) newValue);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_TRG_TMEMBER:
			setCONTEXT__TRG__tMember((TMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS:
			setCREATE__CORR__invocationToTAccess((AbstractMethodInvocationToTAccess) newValue);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			setCREATE__CORR__mFlowElementToTFlowElement((MAbstractFlowElementToTAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			setCONTEXT__CORR__mMemberToTMember((MDefinitionToTMember) newValue);
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
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_SRC_INVOCATION:
			setCREATE__SRC__invocation((MMethodInvocation) null);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_SRC_MMEMBER:
			setCONTEXT__SRC__mMember((MMethodDefinition) null);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_TRG_TACCESS:
			setCREATE__TRG__tAccess((TCall) null);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_TRG_TMEMBER:
			setCONTEXT__TRG__tMember((TMethodDefinition) null);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS:
			setCREATE__CORR__invocationToTAccess((AbstractMethodInvocationToTAccess) null);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			setCREATE__CORR__mFlowElementToTFlowElement((MAbstractFlowElementToTAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			setCONTEXT__CORR__mMemberToTMember((MDefinitionToTMember) null);
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
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_SRC_INVOCATION:
			return creatE__SRC__invocation != null;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_SRC_MMEMBER:
			return contexT__SRC__mMember != null;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_TRG_TACCESS:
			return creatE__TRG__tAccess != null;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_TRG_TMEMBER:
			return contexT__TRG__tMember != null;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS:
			return creatE__CORR__invocationToTAccess != null;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			return creatE__CORR__mFlowElementToTFlowElement != null;
		case ModiscoTGGPackage.METHOD_INVOCATION_RECURSIVE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			return contexT__CORR__mMemberToTMember != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodInvocationRecursive__MarkerImpl
