/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.FieldType__Marker;
import ModiscoTGG.MSignatureToTSignature;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MFieldSignature;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TFieldSignature;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Type Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.FieldType__MarkerImpl#getCONTEXT__SRC__ePrimitiveType <em>CONTEXT SRC ePrimitive Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldType__MarkerImpl#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldType__MarkerImpl#getCONTEXT__TRG__tFieldSignature <em>CONTEXT TRG tField Signature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldType__MarkerImpl#getCONTEXT__TRG__tPrimitiv <em>CONTEXT TRG tPrimitiv</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldType__MarkerImpl#getCONTEXT__CORR__ePrimitiveTypeToTPrimitiv <em>CONTEXT CORR ePrimitive Type To TPrimitiv</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldType__MarkerImpl#getCONTEXT__CORR__mSignatureToTFieldSignature <em>CONTEXT CORR mSignature To TField Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldType__MarkerImpl extends TGGRuleApplicationImpl implements FieldType__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__ePrimitiveType() <em>CONTEXT SRC ePrimitive Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__ePrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected Type contexT__SRC__ePrimitiveType;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mSignature() <em>CONTEXT SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mSignature()
	 * @generated
	 * @ordered
	 */
	protected MFieldSignature contexT__SRC__mSignature;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tFieldSignature() <em>CONTEXT TRG tField Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tFieldSignature()
	 * @generated
	 * @ordered
	 */
	protected TFieldSignature contexT__TRG__tFieldSignature;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tPrimitiv() <em>CONTEXT TRG tPrimitiv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tPrimitiv()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType contexT__TRG__tPrimitiv;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__ePrimitiveTypeToTPrimitiv() <em>CONTEXT CORR ePrimitive Type To TPrimitiv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__ePrimitiveTypeToTPrimitiv()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__ePrimitiveTypeToTPrimitiv;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mSignatureToTFieldSignature() <em>CONTEXT CORR mSignature To TField Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mSignatureToTFieldSignature()
	 * @generated
	 * @ordered
	 */
	protected MSignatureToTSignature contexT__CORR__mSignatureToTFieldSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldType__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getFieldType__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getCONTEXT__SRC__ePrimitiveType() {
		if (contexT__SRC__ePrimitiveType != null && contexT__SRC__ePrimitiveType.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__ePrimitiveType = (InternalEObject) contexT__SRC__ePrimitiveType;
			contexT__SRC__ePrimitiveType = (Type) eResolveProxy(oldCONTEXT__SRC__ePrimitiveType);
			if (contexT__SRC__ePrimitiveType != oldCONTEXT__SRC__ePrimitiveType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_SRC_EPRIMITIVE_TYPE,
							oldCONTEXT__SRC__ePrimitiveType, contexT__SRC__ePrimitiveType));
			}
		}
		return contexT__SRC__ePrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetCONTEXT__SRC__ePrimitiveType() {
		return contexT__SRC__ePrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__ePrimitiveType(Type newCONTEXT__SRC__ePrimitiveType) {
		Type oldCONTEXT__SRC__ePrimitiveType = contexT__SRC__ePrimitiveType;
		contexT__SRC__ePrimitiveType = newCONTEXT__SRC__ePrimitiveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_SRC_EPRIMITIVE_TYPE, oldCONTEXT__SRC__ePrimitiveType,
					contexT__SRC__ePrimitiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFieldSignature getCONTEXT__SRC__mSignature() {
		if (contexT__SRC__mSignature != null && contexT__SRC__mSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mSignature = (InternalEObject) contexT__SRC__mSignature;
			contexT__SRC__mSignature = (MFieldSignature) eResolveProxy(oldCONTEXT__SRC__mSignature);
			if (contexT__SRC__mSignature != oldCONTEXT__SRC__mSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE, oldCONTEXT__SRC__mSignature,
							contexT__SRC__mSignature));
			}
		}
		return contexT__SRC__mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldSignature basicGetCONTEXT__SRC__mSignature() {
		return contexT__SRC__mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mSignature(MFieldSignature newCONTEXT__SRC__mSignature) {
		MFieldSignature oldCONTEXT__SRC__mSignature = contexT__SRC__mSignature;
		contexT__SRC__mSignature = newCONTEXT__SRC__mSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE, oldCONTEXT__SRC__mSignature,
					contexT__SRC__mSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldSignature getCONTEXT__TRG__tFieldSignature() {
		if (contexT__TRG__tFieldSignature != null && contexT__TRG__tFieldSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tFieldSignature = (InternalEObject) contexT__TRG__tFieldSignature;
			contexT__TRG__tFieldSignature = (TFieldSignature) eResolveProxy(oldCONTEXT__TRG__tFieldSignature);
			if (contexT__TRG__tFieldSignature != oldCONTEXT__TRG__tFieldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE,
							oldCONTEXT__TRG__tFieldSignature, contexT__TRG__tFieldSignature));
			}
		}
		return contexT__TRG__tFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldSignature basicGetCONTEXT__TRG__tFieldSignature() {
		return contexT__TRG__tFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tFieldSignature(TFieldSignature newCONTEXT__TRG__tFieldSignature) {
		TFieldSignature oldCONTEXT__TRG__tFieldSignature = contexT__TRG__tFieldSignature;
		contexT__TRG__tFieldSignature = newCONTEXT__TRG__tFieldSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE, oldCONTEXT__TRG__tFieldSignature,
					contexT__TRG__tFieldSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getCONTEXT__TRG__tPrimitiv() {
		if (contexT__TRG__tPrimitiv != null && contexT__TRG__tPrimitiv.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tPrimitiv = (InternalEObject) contexT__TRG__tPrimitiv;
			contexT__TRG__tPrimitiv = (TAbstractType) eResolveProxy(oldCONTEXT__TRG__tPrimitiv);
			if (contexT__TRG__tPrimitiv != oldCONTEXT__TRG__tPrimitiv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_TRG_TPRIMITIV, oldCONTEXT__TRG__tPrimitiv,
							contexT__TRG__tPrimitiv));
			}
		}
		return contexT__TRG__tPrimitiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetCONTEXT__TRG__tPrimitiv() {
		return contexT__TRG__tPrimitiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tPrimitiv(TAbstractType newCONTEXT__TRG__tPrimitiv) {
		TAbstractType oldCONTEXT__TRG__tPrimitiv = contexT__TRG__tPrimitiv;
		contexT__TRG__tPrimitiv = newCONTEXT__TRG__tPrimitiv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_TRG_TPRIMITIV, oldCONTEXT__TRG__tPrimitiv,
					contexT__TRG__tPrimitiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__ePrimitiveTypeToTPrimitiv() {
		if (contexT__CORR__ePrimitiveTypeToTPrimitiv != null && contexT__CORR__ePrimitiveTypeToTPrimitiv.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__ePrimitiveTypeToTPrimitiv = (InternalEObject) contexT__CORR__ePrimitiveTypeToTPrimitiv;
			contexT__CORR__ePrimitiveTypeToTPrimitiv = (TypeToTAbstractType) eResolveProxy(
					oldCONTEXT__CORR__ePrimitiveTypeToTPrimitiv);
			if (contexT__CORR__ePrimitiveTypeToTPrimitiv != oldCONTEXT__CORR__ePrimitiveTypeToTPrimitiv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIV,
							oldCONTEXT__CORR__ePrimitiveTypeToTPrimitiv, contexT__CORR__ePrimitiveTypeToTPrimitiv));
			}
		}
		return contexT__CORR__ePrimitiveTypeToTPrimitiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__ePrimitiveTypeToTPrimitiv() {
		return contexT__CORR__ePrimitiveTypeToTPrimitiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__ePrimitiveTypeToTPrimitiv(
			TypeToTAbstractType newCONTEXT__CORR__ePrimitiveTypeToTPrimitiv) {
		TypeToTAbstractType oldCONTEXT__CORR__ePrimitiveTypeToTPrimitiv = contexT__CORR__ePrimitiveTypeToTPrimitiv;
		contexT__CORR__ePrimitiveTypeToTPrimitiv = newCONTEXT__CORR__ePrimitiveTypeToTPrimitiv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIV,
					oldCONTEXT__CORR__ePrimitiveTypeToTPrimitiv, contexT__CORR__ePrimitiveTypeToTPrimitiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSignatureToTSignature getCONTEXT__CORR__mSignatureToTFieldSignature() {
		if (contexT__CORR__mSignatureToTFieldSignature != null
				&& contexT__CORR__mSignatureToTFieldSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mSignatureToTFieldSignature = (InternalEObject) contexT__CORR__mSignatureToTFieldSignature;
			contexT__CORR__mSignatureToTFieldSignature = (MSignatureToTSignature) eResolveProxy(
					oldCONTEXT__CORR__mSignatureToTFieldSignature);
			if (contexT__CORR__mSignatureToTFieldSignature != oldCONTEXT__CORR__mSignatureToTFieldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE,
							oldCONTEXT__CORR__mSignatureToTFieldSignature, contexT__CORR__mSignatureToTFieldSignature));
			}
		}
		return contexT__CORR__mSignatureToTFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSignatureToTSignature basicGetCONTEXT__CORR__mSignatureToTFieldSignature() {
		return contexT__CORR__mSignatureToTFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mSignatureToTFieldSignature(
			MSignatureToTSignature newCONTEXT__CORR__mSignatureToTFieldSignature) {
		MSignatureToTSignature oldCONTEXT__CORR__mSignatureToTFieldSignature = contexT__CORR__mSignatureToTFieldSignature;
		contexT__CORR__mSignatureToTFieldSignature = newCONTEXT__CORR__mSignatureToTFieldSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE,
					oldCONTEXT__CORR__mSignatureToTFieldSignature, contexT__CORR__mSignatureToTFieldSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_SRC_EPRIMITIVE_TYPE:
			if (resolve)
				return getCONTEXT__SRC__ePrimitiveType();
			return basicGetCONTEXT__SRC__ePrimitiveType();
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE:
			if (resolve)
				return getCONTEXT__SRC__mSignature();
			return basicGetCONTEXT__SRC__mSignature();
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE:
			if (resolve)
				return getCONTEXT__TRG__tFieldSignature();
			return basicGetCONTEXT__TRG__tFieldSignature();
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_TRG_TPRIMITIV:
			if (resolve)
				return getCONTEXT__TRG__tPrimitiv();
			return basicGetCONTEXT__TRG__tPrimitiv();
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIV:
			if (resolve)
				return getCONTEXT__CORR__ePrimitiveTypeToTPrimitiv();
			return basicGetCONTEXT__CORR__ePrimitiveTypeToTPrimitiv();
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE:
			if (resolve)
				return getCONTEXT__CORR__mSignatureToTFieldSignature();
			return basicGetCONTEXT__CORR__mSignatureToTFieldSignature();
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
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_SRC_EPRIMITIVE_TYPE:
			setCONTEXT__SRC__ePrimitiveType((Type) newValue);
			return;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE:
			setCONTEXT__SRC__mSignature((MFieldSignature) newValue);
			return;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE:
			setCONTEXT__TRG__tFieldSignature((TFieldSignature) newValue);
			return;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_TRG_TPRIMITIV:
			setCONTEXT__TRG__tPrimitiv((TAbstractType) newValue);
			return;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIV:
			setCONTEXT__CORR__ePrimitiveTypeToTPrimitiv((TypeToTAbstractType) newValue);
			return;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE:
			setCONTEXT__CORR__mSignatureToTFieldSignature((MSignatureToTSignature) newValue);
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
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_SRC_EPRIMITIVE_TYPE:
			setCONTEXT__SRC__ePrimitiveType((Type) null);
			return;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE:
			setCONTEXT__SRC__mSignature((MFieldSignature) null);
			return;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE:
			setCONTEXT__TRG__tFieldSignature((TFieldSignature) null);
			return;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_TRG_TPRIMITIV:
			setCONTEXT__TRG__tPrimitiv((TAbstractType) null);
			return;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIV:
			setCONTEXT__CORR__ePrimitiveTypeToTPrimitiv((TypeToTAbstractType) null);
			return;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE:
			setCONTEXT__CORR__mSignatureToTFieldSignature((MSignatureToTSignature) null);
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
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_SRC_EPRIMITIVE_TYPE:
			return contexT__SRC__ePrimitiveType != null;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_SRC_MSIGNATURE:
			return contexT__SRC__mSignature != null;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE:
			return contexT__TRG__tFieldSignature != null;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_TRG_TPRIMITIV:
			return contexT__TRG__tPrimitiv != null;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIV:
			return contexT__CORR__ePrimitiveTypeToTPrimitiv != null;
		case ModiscoTGGPackage.FIELD_TYPE_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE:
			return contexT__CORR__mSignatureToTFieldSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldType__MarkerImpl
