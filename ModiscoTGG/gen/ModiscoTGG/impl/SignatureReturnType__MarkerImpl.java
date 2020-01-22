/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MSignatureToTSignature;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.SignatureReturnType__Marker;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MMethodSignature;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodSignature;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature Return Type Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.SignatureReturnType__MarkerImpl#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SignatureReturnType__MarkerImpl#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SignatureReturnType__MarkerImpl#getCONTEXT__TRG__tSignature <em>CONTEXT TRG tSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SignatureReturnType__MarkerImpl#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SignatureReturnType__MarkerImpl#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SignatureReturnType__MarkerImpl#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureReturnType__MarkerImpl extends TGGRuleApplicationImpl implements SignatureReturnType__Marker {
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
	 * The cached value of the '{@link #getCONTEXT__TRG__tSignature() <em>CONTEXT TRG tSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tSignature()
	 * @generated
	 * @ordered
	 */
	protected TMethodSignature contexT__TRG__tSignature;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tType() <em>CONTEXT TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType contexT__TRG__tType;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__mTypeToTType() <em>CONTEXT CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mTypeToTType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__mTypeToTType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureReturnType__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getSignatureReturnType__Marker();
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
							ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE,
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
					ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE, oldCONTEXT__SRC__mSignature,
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
							ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MTYPE, oldCONTEXT__SRC__mType,
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
					ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MTYPE, oldCONTEXT__SRC__mType,
					contexT__SRC__mType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodSignature getCONTEXT__TRG__tSignature() {
		if (contexT__TRG__tSignature != null && contexT__TRG__tSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tSignature = (InternalEObject) contexT__TRG__tSignature;
			contexT__TRG__tSignature = (TMethodSignature) eResolveProxy(oldCONTEXT__TRG__tSignature);
			if (contexT__TRG__tSignature != oldCONTEXT__TRG__tSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TSIGNATURE,
							oldCONTEXT__TRG__tSignature, contexT__TRG__tSignature));
			}
		}
		return contexT__TRG__tSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature basicGetCONTEXT__TRG__tSignature() {
		return contexT__TRG__tSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tSignature(TMethodSignature newCONTEXT__TRG__tSignature) {
		TMethodSignature oldCONTEXT__TRG__tSignature = contexT__TRG__tSignature;
		contexT__TRG__tSignature = newCONTEXT__TRG__tSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TSIGNATURE, oldCONTEXT__TRG__tSignature,
					contexT__TRG__tSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getCONTEXT__TRG__tType() {
		if (contexT__TRG__tType != null && contexT__TRG__tType.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tType = (InternalEObject) contexT__TRG__tType;
			contexT__TRG__tType = (TAbstractType) eResolveProxy(oldCONTEXT__TRG__tType);
			if (contexT__TRG__tType != oldCONTEXT__TRG__tType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TTYPE, oldCONTEXT__TRG__tType,
							contexT__TRG__tType));
			}
		}
		return contexT__TRG__tType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetCONTEXT__TRG__tType() {
		return contexT__TRG__tType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tType(TAbstractType newCONTEXT__TRG__tType) {
		TAbstractType oldCONTEXT__TRG__tType = contexT__TRG__tType;
		contexT__TRG__tType = newCONTEXT__TRG__tType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TTYPE, oldCONTEXT__TRG__tType,
					contexT__TRG__tType));
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
							ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE,
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
					ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE,
					oldCONTEXT__CORR__mSignatureToTSignature, contexT__CORR__mSignatureToTSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__mTypeToTType() {
		if (contexT__CORR__mTypeToTType != null && contexT__CORR__mTypeToTType.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mTypeToTType = (InternalEObject) contexT__CORR__mTypeToTType;
			contexT__CORR__mTypeToTType = (TypeToTAbstractType) eResolveProxy(oldCONTEXT__CORR__mTypeToTType);
			if (contexT__CORR__mTypeToTType != oldCONTEXT__CORR__mTypeToTType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
							oldCONTEXT__CORR__mTypeToTType, contexT__CORR__mTypeToTType));
			}
		}
		return contexT__CORR__mTypeToTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__mTypeToTType() {
		return contexT__CORR__mTypeToTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mTypeToTType(TypeToTAbstractType newCONTEXT__CORR__mTypeToTType) {
		TypeToTAbstractType oldCONTEXT__CORR__mTypeToTType = contexT__CORR__mTypeToTType;
		contexT__CORR__mTypeToTType = newCONTEXT__CORR__mTypeToTType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
					oldCONTEXT__CORR__mTypeToTType, contexT__CORR__mTypeToTType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE:
			if (resolve)
				return getCONTEXT__SRC__mSignature();
			return basicGetCONTEXT__SRC__mSignature();
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MTYPE:
			if (resolve)
				return getCONTEXT__SRC__mType();
			return basicGetCONTEXT__SRC__mType();
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TSIGNATURE:
			if (resolve)
				return getCONTEXT__TRG__tSignature();
			return basicGetCONTEXT__TRG__tSignature();
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TTYPE:
			if (resolve)
				return getCONTEXT__TRG__tType();
			return basicGetCONTEXT__TRG__tType();
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE:
			if (resolve)
				return getCONTEXT__CORR__mSignatureToTSignature();
			return basicGetCONTEXT__CORR__mSignatureToTSignature();
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			if (resolve)
				return getCONTEXT__CORR__mTypeToTType();
			return basicGetCONTEXT__CORR__mTypeToTType();
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
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE:
			setCONTEXT__SRC__mSignature((MMethodSignature) newValue);
			return;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((Type) newValue);
			return;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TSIGNATURE:
			setCONTEXT__TRG__tSignature((TMethodSignature) newValue);
			return;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TTYPE:
			setCONTEXT__TRG__tType((TAbstractType) newValue);
			return;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE:
			setCONTEXT__CORR__mSignatureToTSignature((MSignatureToTSignature) newValue);
			return;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			setCONTEXT__CORR__mTypeToTType((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE:
			setCONTEXT__SRC__mSignature((MMethodSignature) null);
			return;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((Type) null);
			return;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TSIGNATURE:
			setCONTEXT__TRG__tSignature((TMethodSignature) null);
			return;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TTYPE:
			setCONTEXT__TRG__tType((TAbstractType) null);
			return;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE:
			setCONTEXT__CORR__mSignatureToTSignature((MSignatureToTSignature) null);
			return;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			setCONTEXT__CORR__mTypeToTType((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE:
			return contexT__SRC__mSignature != null;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_SRC_MTYPE:
			return contexT__SRC__mType != null;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TSIGNATURE:
			return contexT__TRG__tSignature != null;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_TRG_TTYPE:
			return contexT__TRG__tType != null;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE:
			return contexT__CORR__mSignatureToTSignature != null;
		case ModiscoTGGPackage.SIGNATURE_RETURN_TYPE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			return contexT__CORR__mTypeToTType != null;
		}
		return super.eIsSet(featureID);
	}

} //SignatureReturnType__MarkerImpl
