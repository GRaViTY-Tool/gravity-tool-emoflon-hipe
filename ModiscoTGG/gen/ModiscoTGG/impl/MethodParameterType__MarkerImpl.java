/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement;
import ModiscoTGG.MEntryToTParameter;
import ModiscoTGG.MSignatureToTSignature;
import ModiscoTGG.MethodParameterType__Marker;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MEntry;
import org.gravity.modisco.MMethodSignature;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Parameter Type Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.MethodParameterType__MarkerImpl#getCREATE__SRC__mEntry <em>CREATE SRC mEntry</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterType__MarkerImpl#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterType__MarkerImpl#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterType__MarkerImpl#getCONTEXT__TRG__tAbstractType <em>CONTEXT TRG tAbstract Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterType__MarkerImpl#getCREATE__TRG__tParameter <em>CREATE TRG tParameter</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterType__MarkerImpl#getCONTEXT__TRG__tSiganture <em>CONTEXT TRG tSiganture</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterType__MarkerImpl#getCREATE__CORR__mEntryToTParameter <em>CREATE CORR mEntry To TParameter</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterType__MarkerImpl#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterType__MarkerImpl#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterType__MarkerImpl#getCONTEXT__CORR__mTypeToTAbstractType <em>CONTEXT CORR mType To TAbstract Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodParameterType__MarkerImpl extends TGGRuleApplicationImpl implements MethodParameterType__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__mEntry() <em>CREATE SRC mEntry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mEntry()
	 * @generated
	 * @ordered
	 */
	protected MEntry creatE__SRC__mEntry;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mSignature() <em>CONTEXT SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mSignature()
	 * @generated
	 * @ordered
	 */
	protected MMethodSignature contexT__SRC__mSignature;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mType() <em>CONTEXT SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mType()
	 * @generated
	 * @ordered
	 */
	protected Type contexT__SRC__mType;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tAbstractType() <em>CONTEXT TRG tAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tAbstractType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType contexT__TRG__tAbstractType;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tParameter() <em>CREATE TRG tParameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tParameter()
	 * @generated
	 * @ordered
	 */
	protected TParameter creatE__TRG__tParameter;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tSiganture() <em>CONTEXT TRG tSiganture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tSiganture()
	 * @generated
	 * @ordered
	 */
	protected TMethodSignature contexT__TRG__tSiganture;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mEntryToTParameter() <em>CREATE CORR mEntry To TParameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mEntryToTParameter()
	 * @generated
	 * @ordered
	 */
	protected MEntryToTParameter creatE__CORR__mEntryToTParameter;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__mSignatureToTSignature() <em>CONTEXT CORR mSignature To TSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mSignatureToTSignature()
	 * @generated
	 * @ordered
	 */
	protected MSignatureToTSignature contexT__CORR__mSignatureToTSignature;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mTypeToTAbstractType() <em>CONTEXT CORR mType To TAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mTypeToTAbstractType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__mTypeToTAbstractType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterType__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getMethodParameterType__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEntry getCREATE__SRC__mEntry() {
		if (creatE__SRC__mEntry != null && creatE__SRC__mEntry.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mEntry = (InternalEObject) creatE__SRC__mEntry;
			creatE__SRC__mEntry = (MEntry) eResolveProxy(oldCREATE__SRC__mEntry);
			if (creatE__SRC__mEntry != oldCREATE__SRC__mEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_SRC_MENTRY, oldCREATE__SRC__mEntry,
							creatE__SRC__mEntry));
			}
		}
		return creatE__SRC__mEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntry basicGetCREATE__SRC__mEntry() {
		return creatE__SRC__mEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mEntry(MEntry newCREATE__SRC__mEntry) {
		MEntry oldCREATE__SRC__mEntry = creatE__SRC__mEntry;
		creatE__SRC__mEntry = newCREATE__SRC__mEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_SRC_MENTRY, oldCREATE__SRC__mEntry,
					creatE__SRC__mEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodSignature getCONTEXT__SRC__mSignature() {
		if (contexT__SRC__mSignature != null && contexT__SRC__mSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mSignature = (InternalEObject) contexT__SRC__mSignature;
			contexT__SRC__mSignature = (MMethodSignature) eResolveProxy(oldCONTEXT__SRC__mSignature);
			if (contexT__SRC__mSignature != oldCONTEXT__SRC__mSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE,
							oldCONTEXT__SRC__mSignature, contexT__SRC__mSignature));
			}
		}
		return contexT__SRC__mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodSignature basicGetCONTEXT__SRC__mSignature() {
		return contexT__SRC__mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mSignature(MMethodSignature newCONTEXT__SRC__mSignature) {
		MMethodSignature oldCONTEXT__SRC__mSignature = contexT__SRC__mSignature;
		contexT__SRC__mSignature = newCONTEXT__SRC__mSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE, oldCONTEXT__SRC__mSignature,
					contexT__SRC__mSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getCONTEXT__SRC__mType() {
		if (contexT__SRC__mType != null && contexT__SRC__mType.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mType = (InternalEObject) contexT__SRC__mType;
			contexT__SRC__mType = (Type) eResolveProxy(oldCONTEXT__SRC__mType);
			if (contexT__SRC__mType != oldCONTEXT__SRC__mType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MTYPE, oldCONTEXT__SRC__mType,
							contexT__SRC__mType));
			}
		}
		return contexT__SRC__mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetCONTEXT__SRC__mType() {
		return contexT__SRC__mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mType(Type newCONTEXT__SRC__mType) {
		Type oldCONTEXT__SRC__mType = contexT__SRC__mType;
		contexT__SRC__mType = newCONTEXT__SRC__mType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MTYPE, oldCONTEXT__SRC__mType,
					contexT__SRC__mType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getCONTEXT__TRG__tAbstractType() {
		if (contexT__TRG__tAbstractType != null && contexT__TRG__tAbstractType.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tAbstractType = (InternalEObject) contexT__TRG__tAbstractType;
			contexT__TRG__tAbstractType = (TAbstractType) eResolveProxy(oldCONTEXT__TRG__tAbstractType);
			if (contexT__TRG__tAbstractType != oldCONTEXT__TRG__tAbstractType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE,
							oldCONTEXT__TRG__tAbstractType, contexT__TRG__tAbstractType));
			}
		}
		return contexT__TRG__tAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetCONTEXT__TRG__tAbstractType() {
		return contexT__TRG__tAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tAbstractType(TAbstractType newCONTEXT__TRG__tAbstractType) {
		TAbstractType oldCONTEXT__TRG__tAbstractType = contexT__TRG__tAbstractType;
		contexT__TRG__tAbstractType = newCONTEXT__TRG__tAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE,
					oldCONTEXT__TRG__tAbstractType, contexT__TRG__tAbstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParameter getCREATE__TRG__tParameter() {
		if (creatE__TRG__tParameter != null && creatE__TRG__tParameter.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tParameter = (InternalEObject) creatE__TRG__tParameter;
			creatE__TRG__tParameter = (TParameter) eResolveProxy(oldCREATE__TRG__tParameter);
			if (creatE__TRG__tParameter != oldCREATE__TRG__tParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_TRG_TPARAMETER,
							oldCREATE__TRG__tParameter, creatE__TRG__tParameter));
			}
		}
		return creatE__TRG__tParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter basicGetCREATE__TRG__tParameter() {
		return creatE__TRG__tParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tParameter(TParameter newCREATE__TRG__tParameter) {
		TParameter oldCREATE__TRG__tParameter = creatE__TRG__tParameter;
		creatE__TRG__tParameter = newCREATE__TRG__tParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_TRG_TPARAMETER, oldCREATE__TRG__tParameter,
					creatE__TRG__tParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodSignature getCONTEXT__TRG__tSiganture() {
		if (contexT__TRG__tSiganture != null && contexT__TRG__tSiganture.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tSiganture = (InternalEObject) contexT__TRG__tSiganture;
			contexT__TRG__tSiganture = (TMethodSignature) eResolveProxy(oldCONTEXT__TRG__tSiganture);
			if (contexT__TRG__tSiganture != oldCONTEXT__TRG__tSiganture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TSIGANTURE,
							oldCONTEXT__TRG__tSiganture, contexT__TRG__tSiganture));
			}
		}
		return contexT__TRG__tSiganture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature basicGetCONTEXT__TRG__tSiganture() {
		return contexT__TRG__tSiganture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tSiganture(TMethodSignature newCONTEXT__TRG__tSiganture) {
		TMethodSignature oldCONTEXT__TRG__tSiganture = contexT__TRG__tSiganture;
		contexT__TRG__tSiganture = newCONTEXT__TRG__tSiganture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TSIGANTURE, oldCONTEXT__TRG__tSiganture,
					contexT__TRG__tSiganture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEntryToTParameter getCREATE__CORR__mEntryToTParameter() {
		if (creatE__CORR__mEntryToTParameter != null && creatE__CORR__mEntryToTParameter.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mEntryToTParameter = (InternalEObject) creatE__CORR__mEntryToTParameter;
			creatE__CORR__mEntryToTParameter = (MEntryToTParameter) eResolveProxy(oldCREATE__CORR__mEntryToTParameter);
			if (creatE__CORR__mEntryToTParameter != oldCREATE__CORR__mEntryToTParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MENTRY_TO_TPARAMETER,
							oldCREATE__CORR__mEntryToTParameter, creatE__CORR__mEntryToTParameter));
			}
		}
		return creatE__CORR__mEntryToTParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntryToTParameter basicGetCREATE__CORR__mEntryToTParameter() {
		return creatE__CORR__mEntryToTParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mEntryToTParameter(MEntryToTParameter newCREATE__CORR__mEntryToTParameter) {
		MEntryToTParameter oldCREATE__CORR__mEntryToTParameter = creatE__CORR__mEntryToTParameter;
		creatE__CORR__mEntryToTParameter = newCREATE__CORR__mEntryToTParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MENTRY_TO_TPARAMETER,
					oldCREATE__CORR__mEntryToTParameter, creatE__CORR__mEntryToTParameter));
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
							ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT,
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
					ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT,
					oldCREATE__CORR__mFlowElementToTFlowElement, creatE__CORR__mFlowElementToTFlowElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSignatureToTSignature getCONTEXT__CORR__mSignatureToTSignature() {
		if (contexT__CORR__mSignatureToTSignature != null && contexT__CORR__mSignatureToTSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mSignatureToTSignature = (InternalEObject) contexT__CORR__mSignatureToTSignature;
			contexT__CORR__mSignatureToTSignature = (MSignatureToTSignature) eResolveProxy(
					oldCONTEXT__CORR__mSignatureToTSignature);
			if (contexT__CORR__mSignatureToTSignature != oldCONTEXT__CORR__mSignatureToTSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE,
							oldCONTEXT__CORR__mSignatureToTSignature, contexT__CORR__mSignatureToTSignature));
			}
		}
		return contexT__CORR__mSignatureToTSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSignatureToTSignature basicGetCONTEXT__CORR__mSignatureToTSignature() {
		return contexT__CORR__mSignatureToTSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mSignatureToTSignature(
			MSignatureToTSignature newCONTEXT__CORR__mSignatureToTSignature) {
		MSignatureToTSignature oldCONTEXT__CORR__mSignatureToTSignature = contexT__CORR__mSignatureToTSignature;
		contexT__CORR__mSignatureToTSignature = newCONTEXT__CORR__mSignatureToTSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE,
					oldCONTEXT__CORR__mSignatureToTSignature, contexT__CORR__mSignatureToTSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__mTypeToTAbstractType() {
		if (contexT__CORR__mTypeToTAbstractType != null && contexT__CORR__mTypeToTAbstractType.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mTypeToTAbstractType = (InternalEObject) contexT__CORR__mTypeToTAbstractType;
			contexT__CORR__mTypeToTAbstractType = (TypeToTAbstractType) eResolveProxy(
					oldCONTEXT__CORR__mTypeToTAbstractType);
			if (contexT__CORR__mTypeToTAbstractType != oldCONTEXT__CORR__mTypeToTAbstractType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TABSTRACT_TYPE,
							oldCONTEXT__CORR__mTypeToTAbstractType, contexT__CORR__mTypeToTAbstractType));
			}
		}
		return contexT__CORR__mTypeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__mTypeToTAbstractType() {
		return contexT__CORR__mTypeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mTypeToTAbstractType(TypeToTAbstractType newCONTEXT__CORR__mTypeToTAbstractType) {
		TypeToTAbstractType oldCONTEXT__CORR__mTypeToTAbstractType = contexT__CORR__mTypeToTAbstractType;
		contexT__CORR__mTypeToTAbstractType = newCONTEXT__CORR__mTypeToTAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TABSTRACT_TYPE,
					oldCONTEXT__CORR__mTypeToTAbstractType, contexT__CORR__mTypeToTAbstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_SRC_MENTRY:
			if (resolve)
				return getCREATE__SRC__mEntry();
			return basicGetCREATE__SRC__mEntry();
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE:
			if (resolve)
				return getCONTEXT__SRC__mSignature();
			return basicGetCONTEXT__SRC__mSignature();
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MTYPE:
			if (resolve)
				return getCONTEXT__SRC__mType();
			return basicGetCONTEXT__SRC__mType();
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE:
			if (resolve)
				return getCONTEXT__TRG__tAbstractType();
			return basicGetCONTEXT__TRG__tAbstractType();
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_TRG_TPARAMETER:
			if (resolve)
				return getCREATE__TRG__tParameter();
			return basicGetCREATE__TRG__tParameter();
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TSIGANTURE:
			if (resolve)
				return getCONTEXT__TRG__tSiganture();
			return basicGetCONTEXT__TRG__tSiganture();
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MENTRY_TO_TPARAMETER:
			if (resolve)
				return getCREATE__CORR__mEntryToTParameter();
			return basicGetCREATE__CORR__mEntryToTParameter();
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			if (resolve)
				return getCREATE__CORR__mFlowElementToTFlowElement();
			return basicGetCREATE__CORR__mFlowElementToTFlowElement();
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE:
			if (resolve)
				return getCONTEXT__CORR__mSignatureToTSignature();
			return basicGetCONTEXT__CORR__mSignatureToTSignature();
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TABSTRACT_TYPE:
			if (resolve)
				return getCONTEXT__CORR__mTypeToTAbstractType();
			return basicGetCONTEXT__CORR__mTypeToTAbstractType();
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
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_SRC_MENTRY:
			setCREATE__SRC__mEntry((MEntry) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE:
			setCONTEXT__SRC__mSignature((MMethodSignature) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((Type) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE:
			setCONTEXT__TRG__tAbstractType((TAbstractType) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_TRG_TPARAMETER:
			setCREATE__TRG__tParameter((TParameter) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TSIGANTURE:
			setCONTEXT__TRG__tSiganture((TMethodSignature) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MENTRY_TO_TPARAMETER:
			setCREATE__CORR__mEntryToTParameter((MEntryToTParameter) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			setCREATE__CORR__mFlowElementToTFlowElement((MAbstractFlowElementToTAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE:
			setCONTEXT__CORR__mSignatureToTSignature((MSignatureToTSignature) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TABSTRACT_TYPE:
			setCONTEXT__CORR__mTypeToTAbstractType((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_SRC_MENTRY:
			setCREATE__SRC__mEntry((MEntry) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE:
			setCONTEXT__SRC__mSignature((MMethodSignature) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((Type) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE:
			setCONTEXT__TRG__tAbstractType((TAbstractType) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_TRG_TPARAMETER:
			setCREATE__TRG__tParameter((TParameter) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TSIGANTURE:
			setCONTEXT__TRG__tSiganture((TMethodSignature) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MENTRY_TO_TPARAMETER:
			setCREATE__CORR__mEntryToTParameter((MEntryToTParameter) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			setCREATE__CORR__mFlowElementToTFlowElement((MAbstractFlowElementToTAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE:
			setCONTEXT__CORR__mSignatureToTSignature((MSignatureToTSignature) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TABSTRACT_TYPE:
			setCONTEXT__CORR__mTypeToTAbstractType((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_SRC_MENTRY:
			return creatE__SRC__mEntry != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE:
			return contexT__SRC__mSignature != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_SRC_MTYPE:
			return contexT__SRC__mType != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE:
			return contexT__TRG__tAbstractType != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_TRG_TPARAMETER:
			return creatE__TRG__tParameter != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_TRG_TSIGANTURE:
			return contexT__TRG__tSiganture != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MENTRY_TO_TPARAMETER:
			return creatE__CORR__mEntryToTParameter != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			return creatE__CORR__mFlowElementToTFlowElement != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE:
			return contexT__CORR__mSignatureToTSignature != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TABSTRACT_TYPE:
			return contexT__CORR__mTypeToTAbstractType != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodParameterType__MarkerImpl
