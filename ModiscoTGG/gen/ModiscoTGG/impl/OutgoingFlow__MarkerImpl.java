/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement;
import ModiscoTGG.MFlowToTFlow;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.OutgoingFlow__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MFlow;

import org.gravity.typegraph.basic.TAbstractFlowElement;
import org.gravity.typegraph.basic.TFlow;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outgoing Flow Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.OutgoingFlow__MarkerImpl#getCONTEXT__SRC__mFlow <em>CONTEXT SRC mFlow</em>}</li>
 *   <li>{@link ModiscoTGG.impl.OutgoingFlow__MarkerImpl#getCONTEXT__SRC__mTarget <em>CONTEXT SRC mTarget</em>}</li>
 *   <li>{@link ModiscoTGG.impl.OutgoingFlow__MarkerImpl#getCONTEXT__TRG__tFlow <em>CONTEXT TRG tFlow</em>}</li>
 *   <li>{@link ModiscoTGG.impl.OutgoingFlow__MarkerImpl#getCONTEXT__TRG__tTarget <em>CONTEXT TRG tTarget</em>}</li>
 *   <li>{@link ModiscoTGG.impl.OutgoingFlow__MarkerImpl#getCONTEXT__CORR__mFlowToTFlow <em>CONTEXT CORR mFlow To TFlow</em>}</li>
 *   <li>{@link ModiscoTGG.impl.OutgoingFlow__MarkerImpl#getCONTEXT__CORR__mTargetToTTarget <em>CONTEXT CORR mTarget To TTarget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutgoingFlow__MarkerImpl extends TGGRuleApplicationImpl implements OutgoingFlow__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mFlow() <em>CONTEXT SRC mFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mFlow()
	 * @generated
	 * @ordered
	 */
	protected MFlow contexT__SRC__mFlow;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mTarget() <em>CONTEXT SRC mTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mTarget()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElement contexT__SRC__mTarget;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tFlow() <em>CONTEXT TRG tFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tFlow()
	 * @generated
	 * @ordered
	 */
	protected TFlow contexT__TRG__tFlow;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tTarget() <em>CONTEXT TRG tTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tTarget()
	 * @generated
	 * @ordered
	 */
	protected TAbstractFlowElement contexT__TRG__tTarget;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mFlowToTFlow() <em>CONTEXT CORR mFlow To TFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mFlowToTFlow()
	 * @generated
	 * @ordered
	 */
	protected MFlowToTFlow contexT__CORR__mFlowToTFlow;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mTargetToTTarget() <em>CONTEXT CORR mTarget To TTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mTargetToTTarget()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElementToTAbstractFlowElement contexT__CORR__mTargetToTTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutgoingFlow__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getOutgoingFlow__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFlow getCONTEXT__SRC__mFlow() {
		if (contexT__SRC__mFlow != null && contexT__SRC__mFlow.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mFlow = (InternalEObject) contexT__SRC__mFlow;
			contexT__SRC__mFlow = (MFlow) eResolveProxy(oldCONTEXT__SRC__mFlow);
			if (contexT__SRC__mFlow != oldCONTEXT__SRC__mFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_SRC_MFLOW, oldCONTEXT__SRC__mFlow,
							contexT__SRC__mFlow));
			}
		}
		return contexT__SRC__mFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFlow basicGetCONTEXT__SRC__mFlow() {
		return contexT__SRC__mFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mFlow(MFlow newCONTEXT__SRC__mFlow) {
		MFlow oldCONTEXT__SRC__mFlow = contexT__SRC__mFlow;
		contexT__SRC__mFlow = newCONTEXT__SRC__mFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_SRC_MFLOW, oldCONTEXT__SRC__mFlow,
					contexT__SRC__mFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElement getCONTEXT__SRC__mTarget() {
		if (contexT__SRC__mTarget != null && contexT__SRC__mTarget.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mTarget = (InternalEObject) contexT__SRC__mTarget;
			contexT__SRC__mTarget = (MAbstractFlowElement) eResolveProxy(oldCONTEXT__SRC__mTarget);
			if (contexT__SRC__mTarget != oldCONTEXT__SRC__mTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_SRC_MTARGET, oldCONTEXT__SRC__mTarget,
							contexT__SRC__mTarget));
			}
		}
		return contexT__SRC__mTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElement basicGetCONTEXT__SRC__mTarget() {
		return contexT__SRC__mTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mTarget(MAbstractFlowElement newCONTEXT__SRC__mTarget) {
		MAbstractFlowElement oldCONTEXT__SRC__mTarget = contexT__SRC__mTarget;
		contexT__SRC__mTarget = newCONTEXT__SRC__mTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_SRC_MTARGET, oldCONTEXT__SRC__mTarget,
					contexT__SRC__mTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFlow getCONTEXT__TRG__tFlow() {
		if (contexT__TRG__tFlow != null && contexT__TRG__tFlow.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tFlow = (InternalEObject) contexT__TRG__tFlow;
			contexT__TRG__tFlow = (TFlow) eResolveProxy(oldCONTEXT__TRG__tFlow);
			if (contexT__TRG__tFlow != oldCONTEXT__TRG__tFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_TRG_TFLOW, oldCONTEXT__TRG__tFlow,
							contexT__TRG__tFlow));
			}
		}
		return contexT__TRG__tFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFlow basicGetCONTEXT__TRG__tFlow() {
		return contexT__TRG__tFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tFlow(TFlow newCONTEXT__TRG__tFlow) {
		TFlow oldCONTEXT__TRG__tFlow = contexT__TRG__tFlow;
		contexT__TRG__tFlow = newCONTEXT__TRG__tFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_TRG_TFLOW, oldCONTEXT__TRG__tFlow,
					contexT__TRG__tFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractFlowElement getCONTEXT__TRG__tTarget() {
		if (contexT__TRG__tTarget != null && contexT__TRG__tTarget.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tTarget = (InternalEObject) contexT__TRG__tTarget;
			contexT__TRG__tTarget = (TAbstractFlowElement) eResolveProxy(oldCONTEXT__TRG__tTarget);
			if (contexT__TRG__tTarget != oldCONTEXT__TRG__tTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_TRG_TTARGET, oldCONTEXT__TRG__tTarget,
							contexT__TRG__tTarget));
			}
		}
		return contexT__TRG__tTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractFlowElement basicGetCONTEXT__TRG__tTarget() {
		return contexT__TRG__tTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tTarget(TAbstractFlowElement newCONTEXT__TRG__tTarget) {
		TAbstractFlowElement oldCONTEXT__TRG__tTarget = contexT__TRG__tTarget;
		contexT__TRG__tTarget = newCONTEXT__TRG__tTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_TRG_TTARGET, oldCONTEXT__TRG__tTarget,
					contexT__TRG__tTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFlowToTFlow getCONTEXT__CORR__mFlowToTFlow() {
		if (contexT__CORR__mFlowToTFlow != null && contexT__CORR__mFlowToTFlow.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mFlowToTFlow = (InternalEObject) contexT__CORR__mFlowToTFlow;
			contexT__CORR__mFlowToTFlow = (MFlowToTFlow) eResolveProxy(oldCONTEXT__CORR__mFlowToTFlow);
			if (contexT__CORR__mFlowToTFlow != oldCONTEXT__CORR__mFlowToTFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW,
							oldCONTEXT__CORR__mFlowToTFlow, contexT__CORR__mFlowToTFlow));
			}
		}
		return contexT__CORR__mFlowToTFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFlowToTFlow basicGetCONTEXT__CORR__mFlowToTFlow() {
		return contexT__CORR__mFlowToTFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mFlowToTFlow(MFlowToTFlow newCONTEXT__CORR__mFlowToTFlow) {
		MFlowToTFlow oldCONTEXT__CORR__mFlowToTFlow = contexT__CORR__mFlowToTFlow;
		contexT__CORR__mFlowToTFlow = newCONTEXT__CORR__mFlowToTFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW, oldCONTEXT__CORR__mFlowToTFlow,
					contexT__CORR__mFlowToTFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElementToTAbstractFlowElement getCONTEXT__CORR__mTargetToTTarget() {
		if (contexT__CORR__mTargetToTTarget != null && contexT__CORR__mTargetToTTarget.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mTargetToTTarget = (InternalEObject) contexT__CORR__mTargetToTTarget;
			contexT__CORR__mTargetToTTarget = (MAbstractFlowElementToTAbstractFlowElement) eResolveProxy(
					oldCONTEXT__CORR__mTargetToTTarget);
			if (contexT__CORR__mTargetToTTarget != oldCONTEXT__CORR__mTargetToTTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_CORR_MTARGET_TO_TTARGET,
							oldCONTEXT__CORR__mTargetToTTarget, contexT__CORR__mTargetToTTarget));
			}
		}
		return contexT__CORR__mTargetToTTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElementToTAbstractFlowElement basicGetCONTEXT__CORR__mTargetToTTarget() {
		return contexT__CORR__mTargetToTTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mTargetToTTarget(
			MAbstractFlowElementToTAbstractFlowElement newCONTEXT__CORR__mTargetToTTarget) {
		MAbstractFlowElementToTAbstractFlowElement oldCONTEXT__CORR__mTargetToTTarget = contexT__CORR__mTargetToTTarget;
		contexT__CORR__mTargetToTTarget = newCONTEXT__CORR__mTargetToTTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_CORR_MTARGET_TO_TTARGET,
					oldCONTEXT__CORR__mTargetToTTarget, contexT__CORR__mTargetToTTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_SRC_MFLOW:
			if (resolve)
				return getCONTEXT__SRC__mFlow();
			return basicGetCONTEXT__SRC__mFlow();
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_SRC_MTARGET:
			if (resolve)
				return getCONTEXT__SRC__mTarget();
			return basicGetCONTEXT__SRC__mTarget();
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_TRG_TFLOW:
			if (resolve)
				return getCONTEXT__TRG__tFlow();
			return basicGetCONTEXT__TRG__tFlow();
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_TRG_TTARGET:
			if (resolve)
				return getCONTEXT__TRG__tTarget();
			return basicGetCONTEXT__TRG__tTarget();
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW:
			if (resolve)
				return getCONTEXT__CORR__mFlowToTFlow();
			return basicGetCONTEXT__CORR__mFlowToTFlow();
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_CORR_MTARGET_TO_TTARGET:
			if (resolve)
				return getCONTEXT__CORR__mTargetToTTarget();
			return basicGetCONTEXT__CORR__mTargetToTTarget();
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
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_SRC_MFLOW:
			setCONTEXT__SRC__mFlow((MFlow) newValue);
			return;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_SRC_MTARGET:
			setCONTEXT__SRC__mTarget((MAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_TRG_TFLOW:
			setCONTEXT__TRG__tFlow((TFlow) newValue);
			return;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_TRG_TTARGET:
			setCONTEXT__TRG__tTarget((TAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW:
			setCONTEXT__CORR__mFlowToTFlow((MFlowToTFlow) newValue);
			return;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_CORR_MTARGET_TO_TTARGET:
			setCONTEXT__CORR__mTargetToTTarget((MAbstractFlowElementToTAbstractFlowElement) newValue);
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
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_SRC_MFLOW:
			setCONTEXT__SRC__mFlow((MFlow) null);
			return;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_SRC_MTARGET:
			setCONTEXT__SRC__mTarget((MAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_TRG_TFLOW:
			setCONTEXT__TRG__tFlow((TFlow) null);
			return;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_TRG_TTARGET:
			setCONTEXT__TRG__tTarget((TAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW:
			setCONTEXT__CORR__mFlowToTFlow((MFlowToTFlow) null);
			return;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_CORR_MTARGET_TO_TTARGET:
			setCONTEXT__CORR__mTargetToTTarget((MAbstractFlowElementToTAbstractFlowElement) null);
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
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_SRC_MFLOW:
			return contexT__SRC__mFlow != null;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_SRC_MTARGET:
			return contexT__SRC__mTarget != null;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_TRG_TFLOW:
			return contexT__TRG__tFlow != null;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_TRG_TTARGET:
			return contexT__TRG__tTarget != null;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW:
			return contexT__CORR__mFlowToTFlow != null;
		case ModiscoTGGPackage.OUTGOING_FLOW_MARKER__CONTEXT_CORR_MTARGET_TO_TTARGET:
			return contexT__CORR__mTargetToTTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //OutgoingFlow__MarkerImpl
