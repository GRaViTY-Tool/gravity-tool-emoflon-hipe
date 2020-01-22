/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.AnnotationMemberValueAnnotationArray__Marker;
import ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue;
import ModiscoTGG.AnnotationToTAnnotation;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayInitializer;

import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Member Value Annotation Array Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueAnnotationArray__MarkerImpl#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueAnnotationArray__MarkerImpl#getCREATE__SRC__mArray <em>CREATE SRC mArray</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueAnnotationArray__MarkerImpl#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueAnnotationArray__MarkerImpl#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueAnnotationArray__MarkerImpl#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueAnnotationArray__MarkerImpl#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueAnnotationArray__MarkerImpl#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationMemberValueAnnotationArray__MarkerImpl extends TGGRuleApplicationImpl
		implements AnnotationMemberValueAnnotationArray__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__AnnotationValue() <em>CONTEXT SRC Annotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__AnnotationValue()
	 * @generated
	 * @ordered
	 */
	protected AnnotationMemberValuePair contexT__SRC__AnnotationValue;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mArray() <em>CREATE SRC mArray</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mArray()
	 * @generated
	 * @ordered
	 */
	protected ArrayInitializer creatE__SRC__mArray;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mValue() <em>CREATE SRC mValue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mValue()
	 * @generated
	 * @ordered
	 */
	protected Annotation creatE__SRC__mValue;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tAnnotationValue() <em>CONTEXT TRG tAnnotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tAnnotationValue()
	 * @generated
	 * @ordered
	 */
	protected TAnnotationValue contexT__TRG__tAnnotationValue;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tValue() <em>CREATE TRG tValue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tValue()
	 * @generated
	 * @ordered
	 */
	protected TAnnotation creatE__TRG__tValue;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 * @ordered
	 */
	protected AnnotationMemberValuePairToTAnnotationValue contexT__CORR__AnnotationMemberValuePairToTAnnotationValue;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mTypeToTType() <em>CREATE CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mTypeToTType()
	 * @generated
	 * @ordered
	 */
	protected AnnotationToTAnnotation creatE__CORR__mTypeToTType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberValueAnnotationArray__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueAnnotationArray__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePair getCONTEXT__SRC__AnnotationValue() {
		if (contexT__SRC__AnnotationValue != null && contexT__SRC__AnnotationValue.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__AnnotationValue = (InternalEObject) contexT__SRC__AnnotationValue;
			contexT__SRC__AnnotationValue = (AnnotationMemberValuePair) eResolveProxy(oldCONTEXT__SRC__AnnotationValue);
			if (contexT__SRC__AnnotationValue != oldCONTEXT__SRC__AnnotationValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE,
							oldCONTEXT__SRC__AnnotationValue, contexT__SRC__AnnotationValue));
			}
		}
		return contexT__SRC__AnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationMemberValuePair basicGetCONTEXT__SRC__AnnotationValue() {
		return contexT__SRC__AnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__AnnotationValue(AnnotationMemberValuePair newCONTEXT__SRC__AnnotationValue) {
		AnnotationMemberValuePair oldCONTEXT__SRC__AnnotationValue = contexT__SRC__AnnotationValue;
		contexT__SRC__AnnotationValue = newCONTEXT__SRC__AnnotationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE,
					oldCONTEXT__SRC__AnnotationValue, contexT__SRC__AnnotationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayInitializer getCREATE__SRC__mArray() {
		if (creatE__SRC__mArray != null && creatE__SRC__mArray.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mArray = (InternalEObject) creatE__SRC__mArray;
			creatE__SRC__mArray = (ArrayInitializer) eResolveProxy(oldCREATE__SRC__mArray);
			if (creatE__SRC__mArray != oldCREATE__SRC__mArray) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MARRAY,
							oldCREATE__SRC__mArray, creatE__SRC__mArray));
			}
		}
		return creatE__SRC__mArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializer basicGetCREATE__SRC__mArray() {
		return creatE__SRC__mArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mArray(ArrayInitializer newCREATE__SRC__mArray) {
		ArrayInitializer oldCREATE__SRC__mArray = creatE__SRC__mArray;
		creatE__SRC__mArray = newCREATE__SRC__mArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MARRAY,
					oldCREATE__SRC__mArray, creatE__SRC__mArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getCREATE__SRC__mValue() {
		if (creatE__SRC__mValue != null && creatE__SRC__mValue.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mValue = (InternalEObject) creatE__SRC__mValue;
			creatE__SRC__mValue = (Annotation) eResolveProxy(oldCREATE__SRC__mValue);
			if (creatE__SRC__mValue != oldCREATE__SRC__mValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MVALUE,
							oldCREATE__SRC__mValue, creatE__SRC__mValue));
			}
		}
		return creatE__SRC__mValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetCREATE__SRC__mValue() {
		return creatE__SRC__mValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mValue(Annotation newCREATE__SRC__mValue) {
		Annotation oldCREATE__SRC__mValue = creatE__SRC__mValue;
		creatE__SRC__mValue = newCREATE__SRC__mValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MVALUE,
					oldCREATE__SRC__mValue, creatE__SRC__mValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotationValue getCONTEXT__TRG__tAnnotationValue() {
		if (contexT__TRG__tAnnotationValue != null && contexT__TRG__tAnnotationValue.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tAnnotationValue = (InternalEObject) contexT__TRG__tAnnotationValue;
			contexT__TRG__tAnnotationValue = (TAnnotationValue) eResolveProxy(oldCONTEXT__TRG__tAnnotationValue);
			if (contexT__TRG__tAnnotationValue != oldCONTEXT__TRG__tAnnotationValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE,
							oldCONTEXT__TRG__tAnnotationValue, contexT__TRG__tAnnotationValue));
			}
		}
		return contexT__TRG__tAnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAnnotationValue basicGetCONTEXT__TRG__tAnnotationValue() {
		return contexT__TRG__tAnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tAnnotationValue(TAnnotationValue newCONTEXT__TRG__tAnnotationValue) {
		TAnnotationValue oldCONTEXT__TRG__tAnnotationValue = contexT__TRG__tAnnotationValue;
		contexT__TRG__tAnnotationValue = newCONTEXT__TRG__tAnnotationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE,
					oldCONTEXT__TRG__tAnnotationValue, contexT__TRG__tAnnotationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotation getCREATE__TRG__tValue() {
		if (creatE__TRG__tValue != null && creatE__TRG__tValue.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tValue = (InternalEObject) creatE__TRG__tValue;
			creatE__TRG__tValue = (TAnnotation) eResolveProxy(oldCREATE__TRG__tValue);
			if (creatE__TRG__tValue != oldCREATE__TRG__tValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_TRG_TVALUE,
							oldCREATE__TRG__tValue, creatE__TRG__tValue));
			}
		}
		return creatE__TRG__tValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAnnotation basicGetCREATE__TRG__tValue() {
		return creatE__TRG__tValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tValue(TAnnotation newCREATE__TRG__tValue) {
		TAnnotation oldCREATE__TRG__tValue = creatE__TRG__tValue;
		creatE__TRG__tValue = newCREATE__TRG__tValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_TRG_TVALUE,
					oldCREATE__TRG__tValue, creatE__TRG__tValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePairToTAnnotationValue getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		if (contexT__CORR__AnnotationMemberValuePairToTAnnotationValue != null
				&& contexT__CORR__AnnotationMemberValuePairToTAnnotationValue.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue = (InternalEObject) contexT__CORR__AnnotationMemberValuePairToTAnnotationValue;
			contexT__CORR__AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) eResolveProxy(
					oldCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue);
			if (contexT__CORR__AnnotationMemberValuePairToTAnnotationValue != oldCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE,
							oldCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue,
							contexT__CORR__AnnotationMemberValuePairToTAnnotationValue));
			}
		}
		return contexT__CORR__AnnotationMemberValuePairToTAnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationMemberValuePairToTAnnotationValue basicGetCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return contexT__CORR__AnnotationMemberValuePairToTAnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue(
			AnnotationMemberValuePairToTAnnotationValue newCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue) {
		AnnotationMemberValuePairToTAnnotationValue oldCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue = contexT__CORR__AnnotationMemberValuePairToTAnnotationValue;
		contexT__CORR__AnnotationMemberValuePairToTAnnotationValue = newCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE,
					oldCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue,
					contexT__CORR__AnnotationMemberValuePairToTAnnotationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationToTAnnotation getCREATE__CORR__mTypeToTType() {
		if (creatE__CORR__mTypeToTType != null && creatE__CORR__mTypeToTType.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mTypeToTType = (InternalEObject) creatE__CORR__mTypeToTType;
			creatE__CORR__mTypeToTType = (AnnotationToTAnnotation) eResolveProxy(oldCREATE__CORR__mTypeToTType);
			if (creatE__CORR__mTypeToTType != oldCREATE__CORR__mTypeToTType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_CORR_MTYPE_TO_TTYPE,
							oldCREATE__CORR__mTypeToTType, creatE__CORR__mTypeToTType));
			}
		}
		return creatE__CORR__mTypeToTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationToTAnnotation basicGetCREATE__CORR__mTypeToTType() {
		return creatE__CORR__mTypeToTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mTypeToTType(AnnotationToTAnnotation newCREATE__CORR__mTypeToTType) {
		AnnotationToTAnnotation oldCREATE__CORR__mTypeToTType = creatE__CORR__mTypeToTType;
		creatE__CORR__mTypeToTType = newCREATE__CORR__mTypeToTType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_CORR_MTYPE_TO_TTYPE,
					oldCREATE__CORR__mTypeToTType, creatE__CORR__mTypeToTType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE:
			if (resolve)
				return getCONTEXT__SRC__AnnotationValue();
			return basicGetCONTEXT__SRC__AnnotationValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MARRAY:
			if (resolve)
				return getCREATE__SRC__mArray();
			return basicGetCREATE__SRC__mArray();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MVALUE:
			if (resolve)
				return getCREATE__SRC__mValue();
			return basicGetCREATE__SRC__mValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE:
			if (resolve)
				return getCONTEXT__TRG__tAnnotationValue();
			return basicGetCONTEXT__TRG__tAnnotationValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_TRG_TVALUE:
			if (resolve)
				return getCREATE__TRG__tValue();
			return basicGetCREATE__TRG__tValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			if (resolve)
				return getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();
			return basicGetCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_CORR_MTYPE_TO_TTYPE:
			if (resolve)
				return getCREATE__CORR__mTypeToTType();
			return basicGetCREATE__CORR__mTypeToTType();
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE:
			setCONTEXT__SRC__AnnotationValue((AnnotationMemberValuePair) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MARRAY:
			setCREATE__SRC__mArray((ArrayInitializer) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MVALUE:
			setCREATE__SRC__mValue((Annotation) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE:
			setCONTEXT__TRG__tAnnotationValue((TAnnotationValue) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_TRG_TVALUE:
			setCREATE__TRG__tValue((TAnnotation) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			setCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue(
					(AnnotationMemberValuePairToTAnnotationValue) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_CORR_MTYPE_TO_TTYPE:
			setCREATE__CORR__mTypeToTType((AnnotationToTAnnotation) newValue);
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE:
			setCONTEXT__SRC__AnnotationValue((AnnotationMemberValuePair) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MARRAY:
			setCREATE__SRC__mArray((ArrayInitializer) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MVALUE:
			setCREATE__SRC__mValue((Annotation) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE:
			setCONTEXT__TRG__tAnnotationValue((TAnnotationValue) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_TRG_TVALUE:
			setCREATE__TRG__tValue((TAnnotation) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			setCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue(
					(AnnotationMemberValuePairToTAnnotationValue) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_CORR_MTYPE_TO_TTYPE:
			setCREATE__CORR__mTypeToTType((AnnotationToTAnnotation) null);
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE:
			return contexT__SRC__AnnotationValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MARRAY:
			return creatE__SRC__mArray != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_SRC_MVALUE:
			return creatE__SRC__mValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE:
			return contexT__TRG__tAnnotationValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_TRG_TVALUE:
			return creatE__TRG__tValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			return contexT__CORR__AnnotationMemberValuePairToTAnnotationValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY_MARKER__CREATE_CORR_MTYPE_TO_TTYPE:
			return creatE__CORR__mTypeToTType != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationMemberValueAnnotationArray__MarkerImpl
