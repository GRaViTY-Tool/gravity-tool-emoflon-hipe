/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.AnnotationMemberValueBooleanArray__Marker;
import ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue;
import ModiscoTGG.BooleanLiteralToTBoolNode;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.BooleanLiteral;

import org.gravity.typegraph.basic.annotations.TAnnotationValue;
import org.gravity.typegraph.basic.annotations.TBoolNode;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Member Value Boolean Array Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueBooleanArray__MarkerImpl#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueBooleanArray__MarkerImpl#getCREATE__SRC__mArray <em>CREATE SRC mArray</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueBooleanArray__MarkerImpl#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueBooleanArray__MarkerImpl#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueBooleanArray__MarkerImpl#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueBooleanArray__MarkerImpl#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueBooleanArray__MarkerImpl#getCREATE__CORR__mValueToTValue <em>CREATE CORR mValue To TValue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationMemberValueBooleanArray__MarkerImpl extends TGGRuleApplicationImpl
		implements AnnotationMemberValueBooleanArray__Marker {
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
	protected BooleanLiteral creatE__SRC__mValue;

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
	protected TBoolNode creatE__TRG__tValue;

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
	 * The cached value of the '{@link #getCREATE__CORR__mValueToTValue() <em>CREATE CORR mValue To TValue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mValueToTValue()
	 * @generated
	 * @ordered
	 */
	protected BooleanLiteralToTBoolNode creatE__CORR__mValueToTValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberValueBooleanArray__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueBooleanArray__Marker();
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
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE,
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
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE,
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
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MARRAY,
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
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MARRAY,
					oldCREATE__SRC__mArray, creatE__SRC__mArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteral getCREATE__SRC__mValue() {
		if (creatE__SRC__mValue != null && creatE__SRC__mValue.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mValue = (InternalEObject) creatE__SRC__mValue;
			creatE__SRC__mValue = (BooleanLiteral) eResolveProxy(oldCREATE__SRC__mValue);
			if (creatE__SRC__mValue != oldCREATE__SRC__mValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MVALUE,
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
	public BooleanLiteral basicGetCREATE__SRC__mValue() {
		return creatE__SRC__mValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mValue(BooleanLiteral newCREATE__SRC__mValue) {
		BooleanLiteral oldCREATE__SRC__mValue = creatE__SRC__mValue;
		creatE__SRC__mValue = newCREATE__SRC__mValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MVALUE,
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
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE,
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
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE,
					oldCONTEXT__TRG__tAnnotationValue, contexT__TRG__tAnnotationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBoolNode getCREATE__TRG__tValue() {
		if (creatE__TRG__tValue != null && creatE__TRG__tValue.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tValue = (InternalEObject) creatE__TRG__tValue;
			creatE__TRG__tValue = (TBoolNode) eResolveProxy(oldCREATE__TRG__tValue);
			if (creatE__TRG__tValue != oldCREATE__TRG__tValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_TRG_TVALUE,
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
	public TBoolNode basicGetCREATE__TRG__tValue() {
		return creatE__TRG__tValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tValue(TBoolNode newCREATE__TRG__tValue) {
		TBoolNode oldCREATE__TRG__tValue = creatE__TRG__tValue;
		creatE__TRG__tValue = newCREATE__TRG__tValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_TRG_TVALUE,
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
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE,
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
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE,
					oldCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue,
					contexT__CORR__AnnotationMemberValuePairToTAnnotationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteralToTBoolNode getCREATE__CORR__mValueToTValue() {
		if (creatE__CORR__mValueToTValue != null && creatE__CORR__mValueToTValue.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mValueToTValue = (InternalEObject) creatE__CORR__mValueToTValue;
			creatE__CORR__mValueToTValue = (BooleanLiteralToTBoolNode) eResolveProxy(oldCREATE__CORR__mValueToTValue);
			if (creatE__CORR__mValueToTValue != oldCREATE__CORR__mValueToTValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_CORR_MVALUE_TO_TVALUE,
							oldCREATE__CORR__mValueToTValue, creatE__CORR__mValueToTValue));
			}
		}
		return creatE__CORR__mValueToTValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteralToTBoolNode basicGetCREATE__CORR__mValueToTValue() {
		return creatE__CORR__mValueToTValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mValueToTValue(BooleanLiteralToTBoolNode newCREATE__CORR__mValueToTValue) {
		BooleanLiteralToTBoolNode oldCREATE__CORR__mValueToTValue = creatE__CORR__mValueToTValue;
		creatE__CORR__mValueToTValue = newCREATE__CORR__mValueToTValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_CORR_MVALUE_TO_TVALUE,
					oldCREATE__CORR__mValueToTValue, creatE__CORR__mValueToTValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE:
			if (resolve)
				return getCONTEXT__SRC__AnnotationValue();
			return basicGetCONTEXT__SRC__AnnotationValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MARRAY:
			if (resolve)
				return getCREATE__SRC__mArray();
			return basicGetCREATE__SRC__mArray();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MVALUE:
			if (resolve)
				return getCREATE__SRC__mValue();
			return basicGetCREATE__SRC__mValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE:
			if (resolve)
				return getCONTEXT__TRG__tAnnotationValue();
			return basicGetCONTEXT__TRG__tAnnotationValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_TRG_TVALUE:
			if (resolve)
				return getCREATE__TRG__tValue();
			return basicGetCREATE__TRG__tValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			if (resolve)
				return getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();
			return basicGetCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_CORR_MVALUE_TO_TVALUE:
			if (resolve)
				return getCREATE__CORR__mValueToTValue();
			return basicGetCREATE__CORR__mValueToTValue();
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE:
			setCONTEXT__SRC__AnnotationValue((AnnotationMemberValuePair) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MARRAY:
			setCREATE__SRC__mArray((ArrayInitializer) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MVALUE:
			setCREATE__SRC__mValue((BooleanLiteral) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE:
			setCONTEXT__TRG__tAnnotationValue((TAnnotationValue) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_TRG_TVALUE:
			setCREATE__TRG__tValue((TBoolNode) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			setCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue(
					(AnnotationMemberValuePairToTAnnotationValue) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_CORR_MVALUE_TO_TVALUE:
			setCREATE__CORR__mValueToTValue((BooleanLiteralToTBoolNode) newValue);
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE:
			setCONTEXT__SRC__AnnotationValue((AnnotationMemberValuePair) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MARRAY:
			setCREATE__SRC__mArray((ArrayInitializer) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MVALUE:
			setCREATE__SRC__mValue((BooleanLiteral) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE:
			setCONTEXT__TRG__tAnnotationValue((TAnnotationValue) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_TRG_TVALUE:
			setCREATE__TRG__tValue((TBoolNode) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			setCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue(
					(AnnotationMemberValuePairToTAnnotationValue) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_CORR_MVALUE_TO_TVALUE:
			setCREATE__CORR__mValueToTValue((BooleanLiteralToTBoolNode) null);
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_SRC_ANNOTATION_VALUE:
			return contexT__SRC__AnnotationValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MARRAY:
			return creatE__SRC__mArray != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_SRC_MVALUE:
			return creatE__SRC__mValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_TRG_TANNOTATION_VALUE:
			return contexT__TRG__tAnnotationValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_TRG_TVALUE:
			return creatE__TRG__tValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			return contexT__CORR__AnnotationMemberValuePairToTAnnotationValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY_MARKER__CREATE_CORR_MVALUE_TO_TVALUE:
			return creatE__CORR__mValueToTValue != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationMemberValueBooleanArray__MarkerImpl
