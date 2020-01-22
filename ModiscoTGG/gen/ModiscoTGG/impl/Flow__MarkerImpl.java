/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.Flow__Marker;
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
 * An implementation of the model object '<em><b>Flow Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.Flow__MarkerImpl#getCREATE__SRC__mFlow <em>CREATE SRC mFlow</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Flow__MarkerImpl#getCONTEXT__SRC__mOwner <em>CONTEXT SRC mOwner</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Flow__MarkerImpl#getCREATE__TRG__tFlow <em>CREATE TRG tFlow</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Flow__MarkerImpl#getCONTEXT__TRG__tOwner <em>CONTEXT TRG tOwner</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Flow__MarkerImpl#getCREATE__CORR__mFlowToTFlow <em>CREATE CORR mFlow To TFlow</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Flow__MarkerImpl#getCONTEXT__CORR__mOwnerToTOwner <em>CONTEXT CORR mOwner To TOwner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Flow__MarkerImpl extends TGGRuleApplicationImpl implements Flow__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__mFlow() <em>CREATE SRC mFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mFlow()
	 * @generated
	 * @ordered
	 */
	protected MFlow creatE__SRC__mFlow;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mOwner() <em>CONTEXT SRC mOwner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mOwner()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElement contexT__SRC__mOwner;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tFlow() <em>CREATE TRG tFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tFlow()
	 * @generated
	 * @ordered
	 */
	protected TFlow creatE__TRG__tFlow;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tOwner() <em>CONTEXT TRG tOwner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tOwner()
	 * @generated
	 * @ordered
	 */
	protected TAbstractFlowElement contexT__TRG__tOwner;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mFlowToTFlow() <em>CREATE CORR mFlow To TFlow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mFlowToTFlow()
	 * @generated
	 * @ordered
	 */
	protected MFlowToTFlow creatE__CORR__mFlowToTFlow;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mOwnerToTOwner() <em>CONTEXT CORR mOwner To TOwner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mOwnerToTOwner()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElementToTAbstractFlowElement contexT__CORR__mOwnerToTOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Flow__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getFlow__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFlow getCREATE__SRC__mFlow() {
		if (creatE__SRC__mFlow != null && creatE__SRC__mFlow.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mFlow = (InternalEObject) creatE__SRC__mFlow;
			creatE__SRC__mFlow = (MFlow) eResolveProxy(oldCREATE__SRC__mFlow);
			if (creatE__SRC__mFlow != oldCREATE__SRC__mFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FLOW_MARKER__CREATE_SRC_MFLOW, oldCREATE__SRC__mFlow,
							creatE__SRC__mFlow));
			}
		}
		return creatE__SRC__mFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFlow basicGetCREATE__SRC__mFlow() {
		return creatE__SRC__mFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mFlow(MFlow newCREATE__SRC__mFlow) {
		MFlow oldCREATE__SRC__mFlow = creatE__SRC__mFlow;
		creatE__SRC__mFlow = newCREATE__SRC__mFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.FLOW_MARKER__CREATE_SRC_MFLOW,
					oldCREATE__SRC__mFlow, creatE__SRC__mFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElement getCONTEXT__SRC__mOwner() {
		if (contexT__SRC__mOwner != null && contexT__SRC__mOwner.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mOwner = (InternalEObject) contexT__SRC__mOwner;
			contexT__SRC__mOwner = (MAbstractFlowElement) eResolveProxy(oldCONTEXT__SRC__mOwner);
			if (contexT__SRC__mOwner != oldCONTEXT__SRC__mOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FLOW_MARKER__CONTEXT_SRC_MOWNER, oldCONTEXT__SRC__mOwner,
							contexT__SRC__mOwner));
			}
		}
		return contexT__SRC__mOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElement basicGetCONTEXT__SRC__mOwner() {
		return contexT__SRC__mOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mOwner(MAbstractFlowElement newCONTEXT__SRC__mOwner) {
		MAbstractFlowElement oldCONTEXT__SRC__mOwner = contexT__SRC__mOwner;
		contexT__SRC__mOwner = newCONTEXT__SRC__mOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.FLOW_MARKER__CONTEXT_SRC_MOWNER,
					oldCONTEXT__SRC__mOwner, contexT__SRC__mOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFlow getCREATE__TRG__tFlow() {
		if (creatE__TRG__tFlow != null && creatE__TRG__tFlow.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tFlow = (InternalEObject) creatE__TRG__tFlow;
			creatE__TRG__tFlow = (TFlow) eResolveProxy(oldCREATE__TRG__tFlow);
			if (creatE__TRG__tFlow != oldCREATE__TRG__tFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FLOW_MARKER__CREATE_TRG_TFLOW, oldCREATE__TRG__tFlow,
							creatE__TRG__tFlow));
			}
		}
		return creatE__TRG__tFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFlow basicGetCREATE__TRG__tFlow() {
		return creatE__TRG__tFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tFlow(TFlow newCREATE__TRG__tFlow) {
		TFlow oldCREATE__TRG__tFlow = creatE__TRG__tFlow;
		creatE__TRG__tFlow = newCREATE__TRG__tFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.FLOW_MARKER__CREATE_TRG_TFLOW,
					oldCREATE__TRG__tFlow, creatE__TRG__tFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractFlowElement getCONTEXT__TRG__tOwner() {
		if (contexT__TRG__tOwner != null && contexT__TRG__tOwner.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tOwner = (InternalEObject) contexT__TRG__tOwner;
			contexT__TRG__tOwner = (TAbstractFlowElement) eResolveProxy(oldCONTEXT__TRG__tOwner);
			if (contexT__TRG__tOwner != oldCONTEXT__TRG__tOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FLOW_MARKER__CONTEXT_TRG_TOWNER, oldCONTEXT__TRG__tOwner,
							contexT__TRG__tOwner));
			}
		}
		return contexT__TRG__tOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractFlowElement basicGetCONTEXT__TRG__tOwner() {
		return contexT__TRG__tOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tOwner(TAbstractFlowElement newCONTEXT__TRG__tOwner) {
		TAbstractFlowElement oldCONTEXT__TRG__tOwner = contexT__TRG__tOwner;
		contexT__TRG__tOwner = newCONTEXT__TRG__tOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.FLOW_MARKER__CONTEXT_TRG_TOWNER,
					oldCONTEXT__TRG__tOwner, contexT__TRG__tOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFlowToTFlow getCREATE__CORR__mFlowToTFlow() {
		if (creatE__CORR__mFlowToTFlow != null && creatE__CORR__mFlowToTFlow.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mFlowToTFlow = (InternalEObject) creatE__CORR__mFlowToTFlow;
			creatE__CORR__mFlowToTFlow = (MFlowToTFlow) eResolveProxy(oldCREATE__CORR__mFlowToTFlow);
			if (creatE__CORR__mFlowToTFlow != oldCREATE__CORR__mFlowToTFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FLOW_MARKER__CREATE_CORR_MFLOW_TO_TFLOW, oldCREATE__CORR__mFlowToTFlow,
							creatE__CORR__mFlowToTFlow));
			}
		}
		return creatE__CORR__mFlowToTFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFlowToTFlow basicGetCREATE__CORR__mFlowToTFlow() {
		return creatE__CORR__mFlowToTFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mFlowToTFlow(MFlowToTFlow newCREATE__CORR__mFlowToTFlow) {
		MFlowToTFlow oldCREATE__CORR__mFlowToTFlow = creatE__CORR__mFlowToTFlow;
		creatE__CORR__mFlowToTFlow = newCREATE__CORR__mFlowToTFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FLOW_MARKER__CREATE_CORR_MFLOW_TO_TFLOW, oldCREATE__CORR__mFlowToTFlow,
					creatE__CORR__mFlowToTFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElementToTAbstractFlowElement getCONTEXT__CORR__mOwnerToTOwner() {
		if (contexT__CORR__mOwnerToTOwner != null && contexT__CORR__mOwnerToTOwner.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mOwnerToTOwner = (InternalEObject) contexT__CORR__mOwnerToTOwner;
			contexT__CORR__mOwnerToTOwner = (MAbstractFlowElementToTAbstractFlowElement) eResolveProxy(
					oldCONTEXT__CORR__mOwnerToTOwner);
			if (contexT__CORR__mOwnerToTOwner != oldCONTEXT__CORR__mOwnerToTOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FLOW_MARKER__CONTEXT_CORR_MOWNER_TO_TOWNER,
							oldCONTEXT__CORR__mOwnerToTOwner, contexT__CORR__mOwnerToTOwner));
			}
		}
		return contexT__CORR__mOwnerToTOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElementToTAbstractFlowElement basicGetCONTEXT__CORR__mOwnerToTOwner() {
		return contexT__CORR__mOwnerToTOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mOwnerToTOwner(
			MAbstractFlowElementToTAbstractFlowElement newCONTEXT__CORR__mOwnerToTOwner) {
		MAbstractFlowElementToTAbstractFlowElement oldCONTEXT__CORR__mOwnerToTOwner = contexT__CORR__mOwnerToTOwner;
		contexT__CORR__mOwnerToTOwner = newCONTEXT__CORR__mOwnerToTOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FLOW_MARKER__CONTEXT_CORR_MOWNER_TO_TOWNER, oldCONTEXT__CORR__mOwnerToTOwner,
					contexT__CORR__mOwnerToTOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.FLOW_MARKER__CREATE_SRC_MFLOW:
			if (resolve)
				return getCREATE__SRC__mFlow();
			return basicGetCREATE__SRC__mFlow();
		case ModiscoTGGPackage.FLOW_MARKER__CONTEXT_SRC_MOWNER:
			if (resolve)
				return getCONTEXT__SRC__mOwner();
			return basicGetCONTEXT__SRC__mOwner();
		case ModiscoTGGPackage.FLOW_MARKER__CREATE_TRG_TFLOW:
			if (resolve)
				return getCREATE__TRG__tFlow();
			return basicGetCREATE__TRG__tFlow();
		case ModiscoTGGPackage.FLOW_MARKER__CONTEXT_TRG_TOWNER:
			if (resolve)
				return getCONTEXT__TRG__tOwner();
			return basicGetCONTEXT__TRG__tOwner();
		case ModiscoTGGPackage.FLOW_MARKER__CREATE_CORR_MFLOW_TO_TFLOW:
			if (resolve)
				return getCREATE__CORR__mFlowToTFlow();
			return basicGetCREATE__CORR__mFlowToTFlow();
		case ModiscoTGGPackage.FLOW_MARKER__CONTEXT_CORR_MOWNER_TO_TOWNER:
			if (resolve)
				return getCONTEXT__CORR__mOwnerToTOwner();
			return basicGetCONTEXT__CORR__mOwnerToTOwner();
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
		case ModiscoTGGPackage.FLOW_MARKER__CREATE_SRC_MFLOW:
			setCREATE__SRC__mFlow((MFlow) newValue);
			return;
		case ModiscoTGGPackage.FLOW_MARKER__CONTEXT_SRC_MOWNER:
			setCONTEXT__SRC__mOwner((MAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.FLOW_MARKER__CREATE_TRG_TFLOW:
			setCREATE__TRG__tFlow((TFlow) newValue);
			return;
		case ModiscoTGGPackage.FLOW_MARKER__CONTEXT_TRG_TOWNER:
			setCONTEXT__TRG__tOwner((TAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.FLOW_MARKER__CREATE_CORR_MFLOW_TO_TFLOW:
			setCREATE__CORR__mFlowToTFlow((MFlowToTFlow) newValue);
			return;
		case ModiscoTGGPackage.FLOW_MARKER__CONTEXT_CORR_MOWNER_TO_TOWNER:
			setCONTEXT__CORR__mOwnerToTOwner((MAbstractFlowElementToTAbstractFlowElement) newValue);
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
		case ModiscoTGGPackage.FLOW_MARKER__CREATE_SRC_MFLOW:
			setCREATE__SRC__mFlow((MFlow) null);
			return;
		case ModiscoTGGPackage.FLOW_MARKER__CONTEXT_SRC_MOWNER:
			setCONTEXT__SRC__mOwner((MAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.FLOW_MARKER__CREATE_TRG_TFLOW:
			setCREATE__TRG__tFlow((TFlow) null);
			return;
		case ModiscoTGGPackage.FLOW_MARKER__CONTEXT_TRG_TOWNER:
			setCONTEXT__TRG__tOwner((TAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.FLOW_MARKER__CREATE_CORR_MFLOW_TO_TFLOW:
			setCREATE__CORR__mFlowToTFlow((MFlowToTFlow) null);
			return;
		case ModiscoTGGPackage.FLOW_MARKER__CONTEXT_CORR_MOWNER_TO_TOWNER:
			setCONTEXT__CORR__mOwnerToTOwner((MAbstractFlowElementToTAbstractFlowElement) null);
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
		case ModiscoTGGPackage.FLOW_MARKER__CREATE_SRC_MFLOW:
			return creatE__SRC__mFlow != null;
		case ModiscoTGGPackage.FLOW_MARKER__CONTEXT_SRC_MOWNER:
			return contexT__SRC__mOwner != null;
		case ModiscoTGGPackage.FLOW_MARKER__CREATE_TRG_TFLOW:
			return creatE__TRG__tFlow != null;
		case ModiscoTGGPackage.FLOW_MARKER__CONTEXT_TRG_TOWNER:
			return contexT__TRG__tOwner != null;
		case ModiscoTGGPackage.FLOW_MARKER__CREATE_CORR_MFLOW_TO_TFLOW:
			return creatE__CORR__mFlowToTFlow != null;
		case ModiscoTGGPackage.FLOW_MARKER__CONTEXT_CORR_MOWNER_TO_TOWNER:
			return contexT__CORR__mOwnerToTOwner != null;
		}
		return super.eIsSet(featureID);
	}

} //Flow__MarkerImpl
