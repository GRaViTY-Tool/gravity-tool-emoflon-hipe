/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.IncomingFlow__Marker;
import ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement;
import ModiscoTGG.MFlowToTFlow;
import ModiscoTGG.ModiscoTGGPackage;

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
 * An implementation of the model object '<em><b>Incoming Flow Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.IncomingFlow__MarkerImpl#getCONTEXT__SRC__mFlow <em>CONTEXT SRC mFlow</em>}</li>
 *   <li>{@link ModiscoTGG.impl.IncomingFlow__MarkerImpl#getCONTEXT__SRC__mSource <em>CONTEXT SRC mSource</em>}</li>
 *   <li>{@link ModiscoTGG.impl.IncomingFlow__MarkerImpl#getCONTEXT__TRG__tFlow <em>CONTEXT TRG tFlow</em>}</li>
 *   <li>{@link ModiscoTGG.impl.IncomingFlow__MarkerImpl#getCONTEXT__TRG__tSource <em>CONTEXT TRG tSource</em>}</li>
 *   <li>{@link ModiscoTGG.impl.IncomingFlow__MarkerImpl#getCONTEXT__CORR__mFlowToTFlow <em>CONTEXT CORR mFlow To TFlow</em>}</li>
 *   <li>{@link ModiscoTGG.impl.IncomingFlow__MarkerImpl#getCONTEXT__CORR__mSourceToTSource <em>CONTEXT CORR mSource To TSource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncomingFlow__MarkerImpl extends TGGRuleApplicationImpl implements IncomingFlow__Marker {
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
	 * The cached value of the '{@link #getCONTEXT__SRC__mSource() <em>CONTEXT SRC mSource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mSource()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElement contexT__SRC__mSource;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tSource() <em>CONTEXT TRG tSource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tSource()
	 * @generated
	 * @ordered
	 */
	protected TAbstractFlowElement contexT__TRG__tSource;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__mSourceToTSource() <em>CONTEXT CORR mSource To TSource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mSourceToTSource()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElementToTAbstractFlowElement contexT__CORR__mSourceToTSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomingFlow__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getIncomingFlow__Marker();
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
							ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_SRC_MFLOW, oldCONTEXT__SRC__mFlow,
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
					ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_SRC_MFLOW, oldCONTEXT__SRC__mFlow,
					contexT__SRC__mFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElement getCONTEXT__SRC__mSource() {
		if (contexT__SRC__mSource != null && contexT__SRC__mSource.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mSource = (InternalEObject) contexT__SRC__mSource;
			contexT__SRC__mSource = (MAbstractFlowElement) eResolveProxy(oldCONTEXT__SRC__mSource);
			if (contexT__SRC__mSource != oldCONTEXT__SRC__mSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_SRC_MSOURCE, oldCONTEXT__SRC__mSource,
							contexT__SRC__mSource));
			}
		}
		return contexT__SRC__mSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElement basicGetCONTEXT__SRC__mSource() {
		return contexT__SRC__mSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mSource(MAbstractFlowElement newCONTEXT__SRC__mSource) {
		MAbstractFlowElement oldCONTEXT__SRC__mSource = contexT__SRC__mSource;
		contexT__SRC__mSource = newCONTEXT__SRC__mSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_SRC_MSOURCE, oldCONTEXT__SRC__mSource,
					contexT__SRC__mSource));
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
							ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_TRG_TFLOW, oldCONTEXT__TRG__tFlow,
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
					ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_TRG_TFLOW, oldCONTEXT__TRG__tFlow,
					contexT__TRG__tFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractFlowElement getCONTEXT__TRG__tSource() {
		if (contexT__TRG__tSource != null && contexT__TRG__tSource.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tSource = (InternalEObject) contexT__TRG__tSource;
			contexT__TRG__tSource = (TAbstractFlowElement) eResolveProxy(oldCONTEXT__TRG__tSource);
			if (contexT__TRG__tSource != oldCONTEXT__TRG__tSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_TRG_TSOURCE, oldCONTEXT__TRG__tSource,
							contexT__TRG__tSource));
			}
		}
		return contexT__TRG__tSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractFlowElement basicGetCONTEXT__TRG__tSource() {
		return contexT__TRG__tSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tSource(TAbstractFlowElement newCONTEXT__TRG__tSource) {
		TAbstractFlowElement oldCONTEXT__TRG__tSource = contexT__TRG__tSource;
		contexT__TRG__tSource = newCONTEXT__TRG__tSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_TRG_TSOURCE, oldCONTEXT__TRG__tSource,
					contexT__TRG__tSource));
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
							ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW,
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
					ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW, oldCONTEXT__CORR__mFlowToTFlow,
					contexT__CORR__mFlowToTFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElementToTAbstractFlowElement getCONTEXT__CORR__mSourceToTSource() {
		if (contexT__CORR__mSourceToTSource != null && contexT__CORR__mSourceToTSource.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mSourceToTSource = (InternalEObject) contexT__CORR__mSourceToTSource;
			contexT__CORR__mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) eResolveProxy(
					oldCONTEXT__CORR__mSourceToTSource);
			if (contexT__CORR__mSourceToTSource != oldCONTEXT__CORR__mSourceToTSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_CORR_MSOURCE_TO_TSOURCE,
							oldCONTEXT__CORR__mSourceToTSource, contexT__CORR__mSourceToTSource));
			}
		}
		return contexT__CORR__mSourceToTSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElementToTAbstractFlowElement basicGetCONTEXT__CORR__mSourceToTSource() {
		return contexT__CORR__mSourceToTSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mSourceToTSource(
			MAbstractFlowElementToTAbstractFlowElement newCONTEXT__CORR__mSourceToTSource) {
		MAbstractFlowElementToTAbstractFlowElement oldCONTEXT__CORR__mSourceToTSource = contexT__CORR__mSourceToTSource;
		contexT__CORR__mSourceToTSource = newCONTEXT__CORR__mSourceToTSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_CORR_MSOURCE_TO_TSOURCE,
					oldCONTEXT__CORR__mSourceToTSource, contexT__CORR__mSourceToTSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_SRC_MFLOW:
			if (resolve)
				return getCONTEXT__SRC__mFlow();
			return basicGetCONTEXT__SRC__mFlow();
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_SRC_MSOURCE:
			if (resolve)
				return getCONTEXT__SRC__mSource();
			return basicGetCONTEXT__SRC__mSource();
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_TRG_TFLOW:
			if (resolve)
				return getCONTEXT__TRG__tFlow();
			return basicGetCONTEXT__TRG__tFlow();
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_TRG_TSOURCE:
			if (resolve)
				return getCONTEXT__TRG__tSource();
			return basicGetCONTEXT__TRG__tSource();
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW:
			if (resolve)
				return getCONTEXT__CORR__mFlowToTFlow();
			return basicGetCONTEXT__CORR__mFlowToTFlow();
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_CORR_MSOURCE_TO_TSOURCE:
			if (resolve)
				return getCONTEXT__CORR__mSourceToTSource();
			return basicGetCONTEXT__CORR__mSourceToTSource();
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
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_SRC_MFLOW:
			setCONTEXT__SRC__mFlow((MFlow) newValue);
			return;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_SRC_MSOURCE:
			setCONTEXT__SRC__mSource((MAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_TRG_TFLOW:
			setCONTEXT__TRG__tFlow((TFlow) newValue);
			return;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_TRG_TSOURCE:
			setCONTEXT__TRG__tSource((TAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW:
			setCONTEXT__CORR__mFlowToTFlow((MFlowToTFlow) newValue);
			return;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_CORR_MSOURCE_TO_TSOURCE:
			setCONTEXT__CORR__mSourceToTSource((MAbstractFlowElementToTAbstractFlowElement) newValue);
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
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_SRC_MFLOW:
			setCONTEXT__SRC__mFlow((MFlow) null);
			return;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_SRC_MSOURCE:
			setCONTEXT__SRC__mSource((MAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_TRG_TFLOW:
			setCONTEXT__TRG__tFlow((TFlow) null);
			return;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_TRG_TSOURCE:
			setCONTEXT__TRG__tSource((TAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW:
			setCONTEXT__CORR__mFlowToTFlow((MFlowToTFlow) null);
			return;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_CORR_MSOURCE_TO_TSOURCE:
			setCONTEXT__CORR__mSourceToTSource((MAbstractFlowElementToTAbstractFlowElement) null);
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
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_SRC_MFLOW:
			return contexT__SRC__mFlow != null;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_SRC_MSOURCE:
			return contexT__SRC__mSource != null;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_TRG_TFLOW:
			return contexT__TRG__tFlow != null;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_TRG_TSOURCE:
			return contexT__TRG__tSource != null;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_CORR_MFLOW_TO_TFLOW:
			return contexT__CORR__mFlowToTFlow != null;
		case ModiscoTGGPackage.INCOMING_FLOW_MARKER__CONTEXT_CORR_MSOURCE_TO_TSOURCE:
			return contexT__CORR__mSourceToTSource != null;
		}
		return super.eIsSet(featureID);
	}

} //IncomingFlow__MarkerImpl
