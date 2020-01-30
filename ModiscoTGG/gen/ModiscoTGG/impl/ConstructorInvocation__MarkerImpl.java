/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.AbstractMethodInvocationToTAccess;
import ModiscoTGG.ConstructorInvocation__Marker;
import ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement;
import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.ConstructorInvocation;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MDefinition;

import org.gravity.typegraph.basic.TCall;
import org.gravity.typegraph.basic.TMember;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Invocation Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.ConstructorInvocation__MarkerImpl#getCREATE__SRC__invocation <em>CREATE SRC invocation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorInvocation__MarkerImpl#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorInvocation__MarkerImpl#getCONTEXT__SRC__mMethod <em>CONTEXT SRC mMethod</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorInvocation__MarkerImpl#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorInvocation__MarkerImpl#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorInvocation__MarkerImpl#getCONTEXT__TRG__tMethod <em>CONTEXT TRG tMethod</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorInvocation__MarkerImpl#getCREATE__CORR__invocationToTAccess <em>CREATE CORR invocation To TAccess</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorInvocation__MarkerImpl#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorInvocation__MarkerImpl#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorInvocation__MarkerImpl#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorInvocation__MarkerImpl extends TGGRuleApplicationImpl implements ConstructorInvocation__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__invocation() <em>CREATE SRC invocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__invocation()
	 * @generated
	 * @ordered
	 */
	protected ConstructorInvocation creatE__SRC__invocation;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mMember() <em>CONTEXT SRC mMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mMember()
	 * @generated
	 * @ordered
	 */
	protected MDefinition contexT__SRC__mMember;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mMethod() <em>CONTEXT SRC mMethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mMethod()
	 * @generated
	 * @ordered
	 */
	protected MAbstractMethodDefinition contexT__SRC__mMethod;

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
	protected TMember contexT__TRG__tMember;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tMethod() <em>CONTEXT TRG tMethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tMethod()
	 * @generated
	 * @ordered
	 */
	protected TMember contexT__TRG__tMethod;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__mMethodToTMethod() <em>CONTEXT CORR mMethod To TMethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mMethodToTMethod()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember contexT__CORR__mMethodToTMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorInvocation__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getConstructorInvocation__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorInvocation getCREATE__SRC__invocation() {
		if (creatE__SRC__invocation != null && creatE__SRC__invocation.eIsProxy()) {
			InternalEObject oldCREATE__SRC__invocation = (InternalEObject) creatE__SRC__invocation;
			creatE__SRC__invocation = (ConstructorInvocation) eResolveProxy(oldCREATE__SRC__invocation);
			if (creatE__SRC__invocation != oldCREATE__SRC__invocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_SRC_INVOCATION,
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
	public ConstructorInvocation basicGetCREATE__SRC__invocation() {
		return creatE__SRC__invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__invocation(ConstructorInvocation newCREATE__SRC__invocation) {
		ConstructorInvocation oldCREATE__SRC__invocation = creatE__SRC__invocation;
		creatE__SRC__invocation = newCREATE__SRC__invocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_SRC_INVOCATION, oldCREATE__SRC__invocation,
					creatE__SRC__invocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinition getCONTEXT__SRC__mMember() {
		if (contexT__SRC__mMember != null && contexT__SRC__mMember.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mMember = (InternalEObject) contexT__SRC__mMember;
			contexT__SRC__mMember = (MDefinition) eResolveProxy(oldCONTEXT__SRC__mMember);
			if (contexT__SRC__mMember != oldCONTEXT__SRC__mMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMEMBER,
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
	public MDefinition basicGetCONTEXT__SRC__mMember() {
		return contexT__SRC__mMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mMember(MDefinition newCONTEXT__SRC__mMember) {
		MDefinition oldCONTEXT__SRC__mMember = contexT__SRC__mMember;
		contexT__SRC__mMember = newCONTEXT__SRC__mMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMEMBER, oldCONTEXT__SRC__mMember,
					contexT__SRC__mMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractMethodDefinition getCONTEXT__SRC__mMethod() {
		if (contexT__SRC__mMethod != null && contexT__SRC__mMethod.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mMethod = (InternalEObject) contexT__SRC__mMethod;
			contexT__SRC__mMethod = (MAbstractMethodDefinition) eResolveProxy(oldCONTEXT__SRC__mMethod);
			if (contexT__SRC__mMethod != oldCONTEXT__SRC__mMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMETHOD,
							oldCONTEXT__SRC__mMethod, contexT__SRC__mMethod));
			}
		}
		return contexT__SRC__mMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractMethodDefinition basicGetCONTEXT__SRC__mMethod() {
		return contexT__SRC__mMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mMethod(MAbstractMethodDefinition newCONTEXT__SRC__mMethod) {
		MAbstractMethodDefinition oldCONTEXT__SRC__mMethod = contexT__SRC__mMethod;
		contexT__SRC__mMethod = newCONTEXT__SRC__mMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMETHOD, oldCONTEXT__SRC__mMethod,
					contexT__SRC__mMethod));
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
							ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_TRG_TACCESS,
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
					ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_TRG_TACCESS, oldCREATE__TRG__tAccess,
					creatE__TRG__tAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMember getCONTEXT__TRG__tMember() {
		if (contexT__TRG__tMember != null && contexT__TRG__tMember.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tMember = (InternalEObject) contexT__TRG__tMember;
			contexT__TRG__tMember = (TMember) eResolveProxy(oldCONTEXT__TRG__tMember);
			if (contexT__TRG__tMember != oldCONTEXT__TRG__tMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMEMBER,
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
	public TMember basicGetCONTEXT__TRG__tMember() {
		return contexT__TRG__tMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tMember(TMember newCONTEXT__TRG__tMember) {
		TMember oldCONTEXT__TRG__tMember = contexT__TRG__tMember;
		contexT__TRG__tMember = newCONTEXT__TRG__tMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMEMBER, oldCONTEXT__TRG__tMember,
					contexT__TRG__tMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMember getCONTEXT__TRG__tMethod() {
		if (contexT__TRG__tMethod != null && contexT__TRG__tMethod.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tMethod = (InternalEObject) contexT__TRG__tMethod;
			contexT__TRG__tMethod = (TMember) eResolveProxy(oldCONTEXT__TRG__tMethod);
			if (contexT__TRG__tMethod != oldCONTEXT__TRG__tMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMETHOD,
							oldCONTEXT__TRG__tMethod, contexT__TRG__tMethod));
			}
		}
		return contexT__TRG__tMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMember basicGetCONTEXT__TRG__tMethod() {
		return contexT__TRG__tMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tMethod(TMember newCONTEXT__TRG__tMethod) {
		TMember oldCONTEXT__TRG__tMethod = contexT__TRG__tMethod;
		contexT__TRG__tMethod = newCONTEXT__TRG__tMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMETHOD, oldCONTEXT__TRG__tMethod,
					contexT__TRG__tMethod));
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
							ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS,
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
					ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS,
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
							ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT,
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
					ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT,
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
							ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER,
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
					ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER,
					oldCONTEXT__CORR__mMemberToTMember, contexT__CORR__mMemberToTMember));
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
							ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD,
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
					ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD,
					oldCONTEXT__CORR__mMethodToTMethod, contexT__CORR__mMethodToTMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_SRC_INVOCATION:
			if (resolve)
				return getCREATE__SRC__invocation();
			return basicGetCREATE__SRC__invocation();
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMEMBER:
			if (resolve)
				return getCONTEXT__SRC__mMember();
			return basicGetCONTEXT__SRC__mMember();
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMETHOD:
			if (resolve)
				return getCONTEXT__SRC__mMethod();
			return basicGetCONTEXT__SRC__mMethod();
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_TRG_TACCESS:
			if (resolve)
				return getCREATE__TRG__tAccess();
			return basicGetCREATE__TRG__tAccess();
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMEMBER:
			if (resolve)
				return getCONTEXT__TRG__tMember();
			return basicGetCONTEXT__TRG__tMember();
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMETHOD:
			if (resolve)
				return getCONTEXT__TRG__tMethod();
			return basicGetCONTEXT__TRG__tMethod();
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS:
			if (resolve)
				return getCREATE__CORR__invocationToTAccess();
			return basicGetCREATE__CORR__invocationToTAccess();
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			if (resolve)
				return getCREATE__CORR__mFlowElementToTFlowElement();
			return basicGetCREATE__CORR__mFlowElementToTFlowElement();
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			if (resolve)
				return getCONTEXT__CORR__mMemberToTMember();
			return basicGetCONTEXT__CORR__mMemberToTMember();
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD:
			if (resolve)
				return getCONTEXT__CORR__mMethodToTMethod();
			return basicGetCONTEXT__CORR__mMethodToTMethod();
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
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_SRC_INVOCATION:
			setCREATE__SRC__invocation((ConstructorInvocation) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMEMBER:
			setCONTEXT__SRC__mMember((MDefinition) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMETHOD:
			setCONTEXT__SRC__mMethod((MAbstractMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_TRG_TACCESS:
			setCREATE__TRG__tAccess((TCall) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMEMBER:
			setCONTEXT__TRG__tMember((TMember) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMETHOD:
			setCONTEXT__TRG__tMethod((TMember) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS:
			setCREATE__CORR__invocationToTAccess((AbstractMethodInvocationToTAccess) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			setCREATE__CORR__mFlowElementToTFlowElement((MAbstractFlowElementToTAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			setCONTEXT__CORR__mMemberToTMember((MDefinitionToTMember) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD:
			setCONTEXT__CORR__mMethodToTMethod((MDefinitionToTMember) newValue);
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
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_SRC_INVOCATION:
			setCREATE__SRC__invocation((ConstructorInvocation) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMEMBER:
			setCONTEXT__SRC__mMember((MDefinition) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMETHOD:
			setCONTEXT__SRC__mMethod((MAbstractMethodDefinition) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_TRG_TACCESS:
			setCREATE__TRG__tAccess((TCall) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMEMBER:
			setCONTEXT__TRG__tMember((TMember) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMETHOD:
			setCONTEXT__TRG__tMethod((TMember) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS:
			setCREATE__CORR__invocationToTAccess((AbstractMethodInvocationToTAccess) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			setCREATE__CORR__mFlowElementToTFlowElement((MAbstractFlowElementToTAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			setCONTEXT__CORR__mMemberToTMember((MDefinitionToTMember) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD:
			setCONTEXT__CORR__mMethodToTMethod((MDefinitionToTMember) null);
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
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_SRC_INVOCATION:
			return creatE__SRC__invocation != null;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMEMBER:
			return contexT__SRC__mMember != null;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_SRC_MMETHOD:
			return contexT__SRC__mMethod != null;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_TRG_TACCESS:
			return creatE__TRG__tAccess != null;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMEMBER:
			return contexT__TRG__tMember != null;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_TRG_TMETHOD:
			return contexT__TRG__tMethod != null;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_INVOCATION_TO_TACCESS:
			return creatE__CORR__invocationToTAccess != null;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			return creatE__CORR__mFlowElementToTFlowElement != null;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			return contexT__CORR__mMemberToTMember != null;
		case ModiscoTGGPackage.CONSTRUCTOR_INVOCATION_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD:
			return contexT__CORR__mMethodToTMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstructorInvocation__MarkerImpl
