/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MModifierToTModifier;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;
import ModiscoTGG.TypesVisibility__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TModifier;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types Visibility Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.TypesVisibility__MarkerImpl#getCREATE__SRC__mModifier <em>CREATE SRC mModifier</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypesVisibility__MarkerImpl#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypesVisibility__MarkerImpl#getCREATE__TRG__tModifier <em>CREATE TRG tModifier</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypesVisibility__MarkerImpl#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypesVisibility__MarkerImpl#getCREATE__CORR__mModifierToTModifier <em>CREATE CORR mModifier To TModifier</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypesVisibility__MarkerImpl#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypesVisibility__MarkerImpl extends TGGRuleApplicationImpl implements TypesVisibility__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__mModifier() <em>CREATE SRC mModifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mModifier()
	 * @generated
	 * @ordered
	 */
	protected Modifier creatE__SRC__mModifier;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mType() <em>CONTEXT SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mType()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeDeclaration contexT__SRC__mType;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tModifier() <em>CREATE TRG tModifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tModifier()
	 * @generated
	 * @ordered
	 */
	protected TModifier creatE__TRG__tModifier;

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
	 * The cached value of the '{@link #getCREATE__CORR__mModifierToTModifier() <em>CREATE CORR mModifier To TModifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mModifierToTModifier()
	 * @generated
	 * @ordered
	 */
	protected MModifierToTModifier creatE__CORR__mModifierToTModifier;

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
	protected TypesVisibility__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getTypesVisibility__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier getCREATE__SRC__mModifier() {
		if (creatE__SRC__mModifier != null && creatE__SRC__mModifier.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mModifier = (InternalEObject) creatE__SRC__mModifier;
			creatE__SRC__mModifier = (Modifier) eResolveProxy(oldCREATE__SRC__mModifier);
			if (creatE__SRC__mModifier != oldCREATE__SRC__mModifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER, oldCREATE__SRC__mModifier,
							creatE__SRC__mModifier));
			}
		}
		return creatE__SRC__mModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier basicGetCREATE__SRC__mModifier() {
		return creatE__SRC__mModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mModifier(Modifier newCREATE__SRC__mModifier) {
		Modifier oldCREATE__SRC__mModifier = creatE__SRC__mModifier;
		creatE__SRC__mModifier = newCREATE__SRC__mModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER, oldCREATE__SRC__mModifier,
					creatE__SRC__mModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeDeclaration getCONTEXT__SRC__mType() {
		if (contexT__SRC__mType != null && contexT__SRC__mType.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mType = (InternalEObject) contexT__SRC__mType;
			contexT__SRC__mType = (AbstractTypeDeclaration) eResolveProxy(oldCONTEXT__SRC__mType);
			if (contexT__SRC__mType != oldCONTEXT__SRC__mType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_SRC_MTYPE, oldCONTEXT__SRC__mType,
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
	public AbstractTypeDeclaration basicGetCONTEXT__SRC__mType() {
		return contexT__SRC__mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mType(AbstractTypeDeclaration newCONTEXT__SRC__mType) {
		AbstractTypeDeclaration oldCONTEXT__SRC__mType = contexT__SRC__mType;
		contexT__SRC__mType = newCONTEXT__SRC__mType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_SRC_MTYPE, oldCONTEXT__SRC__mType,
					contexT__SRC__mType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TModifier getCREATE__TRG__tModifier() {
		if (creatE__TRG__tModifier != null && creatE__TRG__tModifier.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tModifier = (InternalEObject) creatE__TRG__tModifier;
			creatE__TRG__tModifier = (TModifier) eResolveProxy(oldCREATE__TRG__tModifier);
			if (creatE__TRG__tModifier != oldCREATE__TRG__tModifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER, oldCREATE__TRG__tModifier,
							creatE__TRG__tModifier));
			}
		}
		return creatE__TRG__tModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TModifier basicGetCREATE__TRG__tModifier() {
		return creatE__TRG__tModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tModifier(TModifier newCREATE__TRG__tModifier) {
		TModifier oldCREATE__TRG__tModifier = creatE__TRG__tModifier;
		creatE__TRG__tModifier = newCREATE__TRG__tModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER, oldCREATE__TRG__tModifier,
					creatE__TRG__tModifier));
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
							ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_TRG_TTYPE, oldCONTEXT__TRG__tType,
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
					ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_TRG_TTYPE, oldCONTEXT__TRG__tType,
					contexT__TRG__tType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MModifierToTModifier getCREATE__CORR__mModifierToTModifier() {
		if (creatE__CORR__mModifierToTModifier != null && creatE__CORR__mModifierToTModifier.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mModifierToTModifier = (InternalEObject) creatE__CORR__mModifierToTModifier;
			creatE__CORR__mModifierToTModifier = (MModifierToTModifier) eResolveProxy(
					oldCREATE__CORR__mModifierToTModifier);
			if (creatE__CORR__mModifierToTModifier != oldCREATE__CORR__mModifierToTModifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER,
							oldCREATE__CORR__mModifierToTModifier, creatE__CORR__mModifierToTModifier));
			}
		}
		return creatE__CORR__mModifierToTModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MModifierToTModifier basicGetCREATE__CORR__mModifierToTModifier() {
		return creatE__CORR__mModifierToTModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mModifierToTModifier(MModifierToTModifier newCREATE__CORR__mModifierToTModifier) {
		MModifierToTModifier oldCREATE__CORR__mModifierToTModifier = creatE__CORR__mModifierToTModifier;
		creatE__CORR__mModifierToTModifier = newCREATE__CORR__mModifierToTModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER,
					oldCREATE__CORR__mModifierToTModifier, creatE__CORR__mModifierToTModifier));
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
							ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
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
					ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
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
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER:
			if (resolve)
				return getCREATE__SRC__mModifier();
			return basicGetCREATE__SRC__mModifier();
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_SRC_MTYPE:
			if (resolve)
				return getCONTEXT__SRC__mType();
			return basicGetCONTEXT__SRC__mType();
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER:
			if (resolve)
				return getCREATE__TRG__tModifier();
			return basicGetCREATE__TRG__tModifier();
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_TRG_TTYPE:
			if (resolve)
				return getCONTEXT__TRG__tType();
			return basicGetCONTEXT__TRG__tType();
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER:
			if (resolve)
				return getCREATE__CORR__mModifierToTModifier();
			return basicGetCREATE__CORR__mModifierToTModifier();
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER:
			setCREATE__SRC__mModifier((Modifier) newValue);
			return;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((AbstractTypeDeclaration) newValue);
			return;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER:
			setCREATE__TRG__tModifier((TModifier) newValue);
			return;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_TRG_TTYPE:
			setCONTEXT__TRG__tType((TAbstractType) newValue);
			return;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER:
			setCREATE__CORR__mModifierToTModifier((MModifierToTModifier) newValue);
			return;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER:
			setCREATE__SRC__mModifier((Modifier) null);
			return;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((AbstractTypeDeclaration) null);
			return;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER:
			setCREATE__TRG__tModifier((TModifier) null);
			return;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_TRG_TTYPE:
			setCONTEXT__TRG__tType((TAbstractType) null);
			return;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER:
			setCREATE__CORR__mModifierToTModifier((MModifierToTModifier) null);
			return;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER:
			return creatE__SRC__mModifier != null;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_SRC_MTYPE:
			return contexT__SRC__mType != null;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER:
			return creatE__TRG__tModifier != null;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_TRG_TTYPE:
			return contexT__TRG__tType != null;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER:
			return creatE__CORR__mModifierToTModifier != null;
		case ModiscoTGGPackage.TYPES_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			return contexT__CORR__mTypeToTType != null;
		}
		return super.eIsSet(featureID);
	}

} //TypesVisibility__MarkerImpl
