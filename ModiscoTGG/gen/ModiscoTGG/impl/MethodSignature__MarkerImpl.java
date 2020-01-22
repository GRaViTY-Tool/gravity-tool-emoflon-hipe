/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement;
import ModiscoTGG.MMethodNameToTMethod;
import ModiscoTGG.MSignatureToTSignature;
import ModiscoTGG.MethodSignature__Marker;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;

import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Signature Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.MethodSignature__MarkerImpl#getCONTEXT__SRC__mName <em>CONTEXT SRC mName</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodSignature__MarkerImpl#getCREATE__SRC__mSignature <em>CREATE SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodSignature__MarkerImpl#getCONTEXT__TRG__tName <em>CONTEXT TRG tName</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodSignature__MarkerImpl#getCREATE__TRG__tSignature <em>CREATE TRG tSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodSignature__MarkerImpl#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodSignature__MarkerImpl#getCONTEXT__CORR__mNameToTName <em>CONTEXT CORR mName To TName</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodSignature__MarkerImpl#getCREATE__CORR__mSignatureToTSignature <em>CREATE CORR mSignature To TSignature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodSignature__MarkerImpl extends TGGRuleApplicationImpl implements MethodSignature__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mName() <em>CONTEXT SRC mName</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mName()
	 * @generated
	 * @ordered
	 */
	protected MMethodName contexT__SRC__mName;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mSignature() <em>CREATE SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mSignature()
	 * @generated
	 * @ordered
	 */
	protected MMethodSignature creatE__SRC__mSignature;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tName() <em>CONTEXT TRG tName</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tName()
	 * @generated
	 * @ordered
	 */
	protected TMethod contexT__TRG__tName;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tSignature() <em>CREATE TRG tSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tSignature()
	 * @generated
	 * @ordered
	 */
	protected TMethodSignature creatE__TRG__tSignature;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__mNameToTName() <em>CONTEXT CORR mName To TName</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mNameToTName()
	 * @generated
	 * @ordered
	 */
	protected MMethodNameToTMethod contexT__CORR__mNameToTName;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mSignatureToTSignature() <em>CREATE CORR mSignature To TSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mSignatureToTSignature()
	 * @generated
	 * @ordered
	 */
	protected MSignatureToTSignature creatE__CORR__mSignatureToTSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodSignature__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getMethodSignature__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodName getCONTEXT__SRC__mName() {
		if (contexT__SRC__mName != null && contexT__SRC__mName.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mName = (InternalEObject) contexT__SRC__mName;
			contexT__SRC__mName = (MMethodName) eResolveProxy(oldCONTEXT__SRC__mName);
			if (contexT__SRC__mName != oldCONTEXT__SRC__mName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_SRC_MNAME, oldCONTEXT__SRC__mName,
							contexT__SRC__mName));
			}
		}
		return contexT__SRC__mName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodName basicGetCONTEXT__SRC__mName() {
		return contexT__SRC__mName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mName(MMethodName newCONTEXT__SRC__mName) {
		MMethodName oldCONTEXT__SRC__mName = contexT__SRC__mName;
		contexT__SRC__mName = newCONTEXT__SRC__mName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_SRC_MNAME, oldCONTEXT__SRC__mName,
					contexT__SRC__mName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodSignature getCREATE__SRC__mSignature() {
		if (creatE__SRC__mSignature != null && creatE__SRC__mSignature.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mSignature = (InternalEObject) creatE__SRC__mSignature;
			creatE__SRC__mSignature = (MMethodSignature) eResolveProxy(oldCREATE__SRC__mSignature);
			if (creatE__SRC__mSignature != oldCREATE__SRC__mSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE,
							oldCREATE__SRC__mSignature, creatE__SRC__mSignature));
			}
		}
		return creatE__SRC__mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodSignature basicGetCREATE__SRC__mSignature() {
		return creatE__SRC__mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mSignature(MMethodSignature newCREATE__SRC__mSignature) {
		MMethodSignature oldCREATE__SRC__mSignature = creatE__SRC__mSignature;
		creatE__SRC__mSignature = newCREATE__SRC__mSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE, oldCREATE__SRC__mSignature,
					creatE__SRC__mSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethod getCONTEXT__TRG__tName() {
		if (contexT__TRG__tName != null && contexT__TRG__tName.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tName = (InternalEObject) contexT__TRG__tName;
			contexT__TRG__tName = (TMethod) eResolveProxy(oldCONTEXT__TRG__tName);
			if (contexT__TRG__tName != oldCONTEXT__TRG__tName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_TRG_TNAME, oldCONTEXT__TRG__tName,
							contexT__TRG__tName));
			}
		}
		return contexT__TRG__tName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethod basicGetCONTEXT__TRG__tName() {
		return contexT__TRG__tName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tName(TMethod newCONTEXT__TRG__tName) {
		TMethod oldCONTEXT__TRG__tName = contexT__TRG__tName;
		contexT__TRG__tName = newCONTEXT__TRG__tName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_TRG_TNAME, oldCONTEXT__TRG__tName,
					contexT__TRG__tName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodSignature getCREATE__TRG__tSignature() {
		if (creatE__TRG__tSignature != null && creatE__TRG__tSignature.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tSignature = (InternalEObject) creatE__TRG__tSignature;
			creatE__TRG__tSignature = (TMethodSignature) eResolveProxy(oldCREATE__TRG__tSignature);
			if (creatE__TRG__tSignature != oldCREATE__TRG__tSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE,
							oldCREATE__TRG__tSignature, creatE__TRG__tSignature));
			}
		}
		return creatE__TRG__tSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature basicGetCREATE__TRG__tSignature() {
		return creatE__TRG__tSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tSignature(TMethodSignature newCREATE__TRG__tSignature) {
		TMethodSignature oldCREATE__TRG__tSignature = creatE__TRG__tSignature;
		creatE__TRG__tSignature = newCREATE__TRG__tSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE, oldCREATE__TRG__tSignature,
					creatE__TRG__tSignature));
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
							ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT,
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
					ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT,
					oldCREATE__CORR__mFlowElementToTFlowElement, creatE__CORR__mFlowElementToTFlowElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodNameToTMethod getCONTEXT__CORR__mNameToTName() {
		if (contexT__CORR__mNameToTName != null && contexT__CORR__mNameToTName.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mNameToTName = (InternalEObject) contexT__CORR__mNameToTName;
			contexT__CORR__mNameToTName = (MMethodNameToTMethod) eResolveProxy(oldCONTEXT__CORR__mNameToTName);
			if (contexT__CORR__mNameToTName != oldCONTEXT__CORR__mNameToTName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_CORR_MNAME_TO_TNAME,
							oldCONTEXT__CORR__mNameToTName, contexT__CORR__mNameToTName));
			}
		}
		return contexT__CORR__mNameToTName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodNameToTMethod basicGetCONTEXT__CORR__mNameToTName() {
		return contexT__CORR__mNameToTName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mNameToTName(MMethodNameToTMethod newCONTEXT__CORR__mNameToTName) {
		MMethodNameToTMethod oldCONTEXT__CORR__mNameToTName = contexT__CORR__mNameToTName;
		contexT__CORR__mNameToTName = newCONTEXT__CORR__mNameToTName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_CORR_MNAME_TO_TNAME,
					oldCONTEXT__CORR__mNameToTName, contexT__CORR__mNameToTName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSignatureToTSignature getCREATE__CORR__mSignatureToTSignature() {
		if (creatE__CORR__mSignatureToTSignature != null && creatE__CORR__mSignatureToTSignature.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mSignatureToTSignature = (InternalEObject) creatE__CORR__mSignatureToTSignature;
			creatE__CORR__mSignatureToTSignature = (MSignatureToTSignature) eResolveProxy(
					oldCREATE__CORR__mSignatureToTSignature);
			if (creatE__CORR__mSignatureToTSignature != oldCREATE__CORR__mSignatureToTSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE,
							oldCREATE__CORR__mSignatureToTSignature, creatE__CORR__mSignatureToTSignature));
			}
		}
		return creatE__CORR__mSignatureToTSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSignatureToTSignature basicGetCREATE__CORR__mSignatureToTSignature() {
		return creatE__CORR__mSignatureToTSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mSignatureToTSignature(
			MSignatureToTSignature newCREATE__CORR__mSignatureToTSignature) {
		MSignatureToTSignature oldCREATE__CORR__mSignatureToTSignature = creatE__CORR__mSignatureToTSignature;
		creatE__CORR__mSignatureToTSignature = newCREATE__CORR__mSignatureToTSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE,
					oldCREATE__CORR__mSignatureToTSignature, creatE__CORR__mSignatureToTSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_SRC_MNAME:
			if (resolve)
				return getCONTEXT__SRC__mName();
			return basicGetCONTEXT__SRC__mName();
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE:
			if (resolve)
				return getCREATE__SRC__mSignature();
			return basicGetCREATE__SRC__mSignature();
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_TRG_TNAME:
			if (resolve)
				return getCONTEXT__TRG__tName();
			return basicGetCONTEXT__TRG__tName();
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE:
			if (resolve)
				return getCREATE__TRG__tSignature();
			return basicGetCREATE__TRG__tSignature();
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			if (resolve)
				return getCREATE__CORR__mFlowElementToTFlowElement();
			return basicGetCREATE__CORR__mFlowElementToTFlowElement();
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_CORR_MNAME_TO_TNAME:
			if (resolve)
				return getCONTEXT__CORR__mNameToTName();
			return basicGetCONTEXT__CORR__mNameToTName();
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE:
			if (resolve)
				return getCREATE__CORR__mSignatureToTSignature();
			return basicGetCREATE__CORR__mSignatureToTSignature();
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
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_SRC_MNAME:
			setCONTEXT__SRC__mName((MMethodName) newValue);
			return;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE:
			setCREATE__SRC__mSignature((MMethodSignature) newValue);
			return;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_TRG_TNAME:
			setCONTEXT__TRG__tName((TMethod) newValue);
			return;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE:
			setCREATE__TRG__tSignature((TMethodSignature) newValue);
			return;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			setCREATE__CORR__mFlowElementToTFlowElement((MAbstractFlowElementToTAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_CORR_MNAME_TO_TNAME:
			setCONTEXT__CORR__mNameToTName((MMethodNameToTMethod) newValue);
			return;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE:
			setCREATE__CORR__mSignatureToTSignature((MSignatureToTSignature) newValue);
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
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_SRC_MNAME:
			setCONTEXT__SRC__mName((MMethodName) null);
			return;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE:
			setCREATE__SRC__mSignature((MMethodSignature) null);
			return;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_TRG_TNAME:
			setCONTEXT__TRG__tName((TMethod) null);
			return;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE:
			setCREATE__TRG__tSignature((TMethodSignature) null);
			return;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			setCREATE__CORR__mFlowElementToTFlowElement((MAbstractFlowElementToTAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_CORR_MNAME_TO_TNAME:
			setCONTEXT__CORR__mNameToTName((MMethodNameToTMethod) null);
			return;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE:
			setCREATE__CORR__mSignatureToTSignature((MSignatureToTSignature) null);
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
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_SRC_MNAME:
			return contexT__SRC__mName != null;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE:
			return creatE__SRC__mSignature != null;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_TRG_TNAME:
			return contexT__TRG__tName != null;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE:
			return creatE__TRG__tSignature != null;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			return creatE__CORR__mFlowElementToTFlowElement != null;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CONTEXT_CORR_MNAME_TO_TNAME:
			return contexT__CORR__mNameToTName != null;
		case ModiscoTGGPackage.METHOD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE:
			return creatE__CORR__mSignatureToTSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodSignature__MarkerImpl
