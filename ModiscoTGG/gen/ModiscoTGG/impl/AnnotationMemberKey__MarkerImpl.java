/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.AnnotationMemberKey__Marker;
import ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue;
import ModiscoTGG.AnnotationToTAnnotation;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;

import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Member Key Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberKey__MarkerImpl#getCONTEXT__SRC__Annotation <em>CONTEXT SRC Annotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberKey__MarkerImpl#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberKey__MarkerImpl#getCONTEXT__TRG__tAnnotation <em>CONTEXT TRG tAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberKey__MarkerImpl#getCREATE__TRG__tAnnotationValue <em>CREATE TRG tAnnotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberKey__MarkerImpl#getCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CREATE CORR Annotation Member Value Pair To TAnnotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberKey__MarkerImpl#getCONTEXT__CORR__AnnotationToTAnnotation <em>CONTEXT CORR Annotation To TAnnotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationMemberKey__MarkerImpl extends TGGRuleApplicationImpl implements AnnotationMemberKey__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__Annotation() <em>CONTEXT SRC Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__Annotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation contexT__SRC__Annotation;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mValue() <em>CREATE SRC mValue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mValue()
	 * @generated
	 * @ordered
	 */
	protected AnnotationMemberValuePair creatE__SRC__mValue;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tAnnotation() <em>CONTEXT TRG tAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tAnnotation()
	 * @generated
	 * @ordered
	 */
	protected TAnnotation contexT__TRG__tAnnotation;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tAnnotationValue() <em>CREATE TRG tAnnotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tAnnotationValue()
	 * @generated
	 * @ordered
	 */
	protected TAnnotationValue creatE__TRG__tAnnotationValue;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue() <em>CREATE CORR Annotation Member Value Pair To TAnnotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue()
	 * @generated
	 * @ordered
	 */
	protected AnnotationMemberValuePairToTAnnotationValue creatE__CORR__AnnotationMemberValuePairToTAnnotationValue;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__AnnotationToTAnnotation() <em>CONTEXT CORR Annotation To TAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__AnnotationToTAnnotation()
	 * @generated
	 * @ordered
	 */
	protected AnnotationToTAnnotation contexT__CORR__AnnotationToTAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberKey__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getAnnotationMemberKey__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getCONTEXT__SRC__Annotation() {
		if (contexT__SRC__Annotation != null && contexT__SRC__Annotation.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__Annotation = (InternalEObject) contexT__SRC__Annotation;
			contexT__SRC__Annotation = (Annotation) eResolveProxy(oldCONTEXT__SRC__Annotation);
			if (contexT__SRC__Annotation != oldCONTEXT__SRC__Annotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_SRC_ANNOTATION,
							oldCONTEXT__SRC__Annotation, contexT__SRC__Annotation));
			}
		}
		return contexT__SRC__Annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetCONTEXT__SRC__Annotation() {
		return contexT__SRC__Annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__Annotation(Annotation newCONTEXT__SRC__Annotation) {
		Annotation oldCONTEXT__SRC__Annotation = contexT__SRC__Annotation;
		contexT__SRC__Annotation = newCONTEXT__SRC__Annotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_SRC_ANNOTATION, oldCONTEXT__SRC__Annotation,
					contexT__SRC__Annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePair getCREATE__SRC__mValue() {
		if (creatE__SRC__mValue != null && creatE__SRC__mValue.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mValue = (InternalEObject) creatE__SRC__mValue;
			creatE__SRC__mValue = (AnnotationMemberValuePair) eResolveProxy(oldCREATE__SRC__mValue);
			if (creatE__SRC__mValue != oldCREATE__SRC__mValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_SRC_MVALUE, oldCREATE__SRC__mValue,
							creatE__SRC__mValue));
			}
		}
		return creatE__SRC__mValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationMemberValuePair basicGetCREATE__SRC__mValue() {
		return creatE__SRC__mValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mValue(AnnotationMemberValuePair newCREATE__SRC__mValue) {
		AnnotationMemberValuePair oldCREATE__SRC__mValue = creatE__SRC__mValue;
		creatE__SRC__mValue = newCREATE__SRC__mValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_SRC_MVALUE, oldCREATE__SRC__mValue,
					creatE__SRC__mValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotation getCONTEXT__TRG__tAnnotation() {
		if (contexT__TRG__tAnnotation != null && contexT__TRG__tAnnotation.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tAnnotation = (InternalEObject) contexT__TRG__tAnnotation;
			contexT__TRG__tAnnotation = (TAnnotation) eResolveProxy(oldCONTEXT__TRG__tAnnotation);
			if (contexT__TRG__tAnnotation != oldCONTEXT__TRG__tAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_TRG_TANNOTATION,
							oldCONTEXT__TRG__tAnnotation, contexT__TRG__tAnnotation));
			}
		}
		return contexT__TRG__tAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAnnotation basicGetCONTEXT__TRG__tAnnotation() {
		return contexT__TRG__tAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tAnnotation(TAnnotation newCONTEXT__TRG__tAnnotation) {
		TAnnotation oldCONTEXT__TRG__tAnnotation = contexT__TRG__tAnnotation;
		contexT__TRG__tAnnotation = newCONTEXT__TRG__tAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_TRG_TANNOTATION,
					oldCONTEXT__TRG__tAnnotation, contexT__TRG__tAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotationValue getCREATE__TRG__tAnnotationValue() {
		if (creatE__TRG__tAnnotationValue != null && creatE__TRG__tAnnotationValue.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tAnnotationValue = (InternalEObject) creatE__TRG__tAnnotationValue;
			creatE__TRG__tAnnotationValue = (TAnnotationValue) eResolveProxy(oldCREATE__TRG__tAnnotationValue);
			if (creatE__TRG__tAnnotationValue != oldCREATE__TRG__tAnnotationValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_TRG_TANNOTATION_VALUE,
							oldCREATE__TRG__tAnnotationValue, creatE__TRG__tAnnotationValue));
			}
		}
		return creatE__TRG__tAnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAnnotationValue basicGetCREATE__TRG__tAnnotationValue() {
		return creatE__TRG__tAnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tAnnotationValue(TAnnotationValue newCREATE__TRG__tAnnotationValue) {
		TAnnotationValue oldCREATE__TRG__tAnnotationValue = creatE__TRG__tAnnotationValue;
		creatE__TRG__tAnnotationValue = newCREATE__TRG__tAnnotationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_TRG_TANNOTATION_VALUE,
					oldCREATE__TRG__tAnnotationValue, creatE__TRG__tAnnotationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePairToTAnnotationValue getCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		if (creatE__CORR__AnnotationMemberValuePairToTAnnotationValue != null
				&& creatE__CORR__AnnotationMemberValuePairToTAnnotationValue.eIsProxy()) {
			InternalEObject oldCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue = (InternalEObject) creatE__CORR__AnnotationMemberValuePairToTAnnotationValue;
			creatE__CORR__AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) eResolveProxy(
					oldCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue);
			if (creatE__CORR__AnnotationMemberValuePairToTAnnotationValue != oldCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE,
							oldCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue,
							creatE__CORR__AnnotationMemberValuePairToTAnnotationValue));
			}
		}
		return creatE__CORR__AnnotationMemberValuePairToTAnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationMemberValuePairToTAnnotationValue basicGetCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue() {
		return creatE__CORR__AnnotationMemberValuePairToTAnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue(
			AnnotationMemberValuePairToTAnnotationValue newCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue) {
		AnnotationMemberValuePairToTAnnotationValue oldCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue = creatE__CORR__AnnotationMemberValuePairToTAnnotationValue;
		creatE__CORR__AnnotationMemberValuePairToTAnnotationValue = newCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE,
					oldCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue,
					creatE__CORR__AnnotationMemberValuePairToTAnnotationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationToTAnnotation getCONTEXT__CORR__AnnotationToTAnnotation() {
		if (contexT__CORR__AnnotationToTAnnotation != null && contexT__CORR__AnnotationToTAnnotation.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__AnnotationToTAnnotation = (InternalEObject) contexT__CORR__AnnotationToTAnnotation;
			contexT__CORR__AnnotationToTAnnotation = (AnnotationToTAnnotation) eResolveProxy(
					oldCONTEXT__CORR__AnnotationToTAnnotation);
			if (contexT__CORR__AnnotationToTAnnotation != oldCONTEXT__CORR__AnnotationToTAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION,
							oldCONTEXT__CORR__AnnotationToTAnnotation, contexT__CORR__AnnotationToTAnnotation));
			}
		}
		return contexT__CORR__AnnotationToTAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationToTAnnotation basicGetCONTEXT__CORR__AnnotationToTAnnotation() {
		return contexT__CORR__AnnotationToTAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__AnnotationToTAnnotation(
			AnnotationToTAnnotation newCONTEXT__CORR__AnnotationToTAnnotation) {
		AnnotationToTAnnotation oldCONTEXT__CORR__AnnotationToTAnnotation = contexT__CORR__AnnotationToTAnnotation;
		contexT__CORR__AnnotationToTAnnotation = newCONTEXT__CORR__AnnotationToTAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION,
					oldCONTEXT__CORR__AnnotationToTAnnotation, contexT__CORR__AnnotationToTAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_SRC_ANNOTATION:
			if (resolve)
				return getCONTEXT__SRC__Annotation();
			return basicGetCONTEXT__SRC__Annotation();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_SRC_MVALUE:
			if (resolve)
				return getCREATE__SRC__mValue();
			return basicGetCREATE__SRC__mValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_TRG_TANNOTATION:
			if (resolve)
				return getCONTEXT__TRG__tAnnotation();
			return basicGetCONTEXT__TRG__tAnnotation();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_TRG_TANNOTATION_VALUE:
			if (resolve)
				return getCREATE__TRG__tAnnotationValue();
			return basicGetCREATE__TRG__tAnnotationValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			if (resolve)
				return getCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue();
			return basicGetCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION:
			if (resolve)
				return getCONTEXT__CORR__AnnotationToTAnnotation();
			return basicGetCONTEXT__CORR__AnnotationToTAnnotation();
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_SRC_ANNOTATION:
			setCONTEXT__SRC__Annotation((Annotation) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_SRC_MVALUE:
			setCREATE__SRC__mValue((AnnotationMemberValuePair) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_TRG_TANNOTATION:
			setCONTEXT__TRG__tAnnotation((TAnnotation) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_TRG_TANNOTATION_VALUE:
			setCREATE__TRG__tAnnotationValue((TAnnotationValue) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			setCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue(
					(AnnotationMemberValuePairToTAnnotationValue) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION:
			setCONTEXT__CORR__AnnotationToTAnnotation((AnnotationToTAnnotation) newValue);
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_SRC_ANNOTATION:
			setCONTEXT__SRC__Annotation((Annotation) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_SRC_MVALUE:
			setCREATE__SRC__mValue((AnnotationMemberValuePair) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_TRG_TANNOTATION:
			setCONTEXT__TRG__tAnnotation((TAnnotation) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_TRG_TANNOTATION_VALUE:
			setCREATE__TRG__tAnnotationValue((TAnnotationValue) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			setCREATE__CORR__AnnotationMemberValuePairToTAnnotationValue(
					(AnnotationMemberValuePairToTAnnotationValue) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION:
			setCONTEXT__CORR__AnnotationToTAnnotation((AnnotationToTAnnotation) null);
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_SRC_ANNOTATION:
			return contexT__SRC__Annotation != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_SRC_MVALUE:
			return creatE__SRC__mValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_TRG_TANNOTATION:
			return contexT__TRG__tAnnotation != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_TRG_TANNOTATION_VALUE:
			return creatE__TRG__tAnnotationValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CREATE_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			return creatE__CORR__AnnotationMemberValuePairToTAnnotationValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_KEY_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION:
			return contexT__CORR__AnnotationToTAnnotation != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationMemberKey__MarkerImpl
