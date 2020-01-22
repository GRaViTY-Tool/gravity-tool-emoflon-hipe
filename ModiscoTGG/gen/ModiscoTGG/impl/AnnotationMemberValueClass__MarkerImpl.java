/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.AnnotationMemberValueClass__Marker;
import ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue;
import ModiscoTGG.ClassLiteralToClassNode;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.gravity.typegraph.basic.TAbstractType;

import org.gravity.typegraph.basic.annotations.TAnnotationValue;
import org.gravity.typegraph.basic.annotations.TClassNode;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Member Value Class Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueClass__MarkerImpl#getCONTEXT__SRC__AnnotationValue <em>CONTEXT SRC Annotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueClass__MarkerImpl#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueClass__MarkerImpl#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueClass__MarkerImpl#getCREATE__SRC__mValue <em>CREATE SRC mValue</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueClass__MarkerImpl#getCONTEXT__TRG__tAnnotationValue <em>CONTEXT TRG tAnnotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueClass__MarkerImpl#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueClass__MarkerImpl#getCREATE__TRG__tValue <em>CREATE TRG tValue</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueClass__MarkerImpl#getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue <em>CONTEXT CORR Annotation Member Value Pair To TAnnotation Value</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueClass__MarkerImpl#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValueClass__MarkerImpl#getCREATE__CORR__mValueToTValue <em>CREATE CORR mValue To TValue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationMemberValueClass__MarkerImpl extends TGGRuleApplicationImpl
		implements AnnotationMemberValueClass__Marker {
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
	 * The cached value of the '{@link #getCREATE__SRC__mAccess() <em>CREATE SRC mAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mAccess()
	 * @generated
	 * @ordered
	 */
	protected TypeAccess creatE__SRC__mAccess;

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
	 * The cached value of the '{@link #getCREATE__SRC__mValue() <em>CREATE SRC mValue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mValue()
	 * @generated
	 * @ordered
	 */
	protected TypeLiteral creatE__SRC__mValue;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tType() <em>CONTEXT TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType contexT__TRG__tType;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tValue() <em>CREATE TRG tValue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tValue()
	 * @generated
	 * @ordered
	 */
	protected TClassNode creatE__TRG__tValue;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__mTypeToTType() <em>CONTEXT CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mTypeToTType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__mTypeToTType;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mValueToTValue() <em>CREATE CORR mValue To TValue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mValueToTValue()
	 * @generated
	 * @ordered
	 */
	protected ClassLiteralToClassNode creatE__CORR__mValueToTValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberValueClass__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValueClass__Marker();
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
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_ANNOTATION_VALUE,
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
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_ANNOTATION_VALUE,
					oldCONTEXT__SRC__AnnotationValue, contexT__SRC__AnnotationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess getCREATE__SRC__mAccess() {
		if (creatE__SRC__mAccess != null && creatE__SRC__mAccess.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mAccess = (InternalEObject) creatE__SRC__mAccess;
			creatE__SRC__mAccess = (TypeAccess) eResolveProxy(oldCREATE__SRC__mAccess);
			if (creatE__SRC__mAccess != oldCREATE__SRC__mAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MACCESS,
							oldCREATE__SRC__mAccess, creatE__SRC__mAccess));
			}
		}
		return creatE__SRC__mAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess basicGetCREATE__SRC__mAccess() {
		return creatE__SRC__mAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mAccess(TypeAccess newCREATE__SRC__mAccess) {
		TypeAccess oldCREATE__SRC__mAccess = creatE__SRC__mAccess;
		creatE__SRC__mAccess = newCREATE__SRC__mAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MACCESS, oldCREATE__SRC__mAccess,
					creatE__SRC__mAccess));
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
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_MTYPE,
							oldCONTEXT__SRC__mType, contexT__SRC__mType));
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
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_MTYPE, oldCONTEXT__SRC__mType,
					contexT__SRC__mType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeLiteral getCREATE__SRC__mValue() {
		if (creatE__SRC__mValue != null && creatE__SRC__mValue.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mValue = (InternalEObject) creatE__SRC__mValue;
			creatE__SRC__mValue = (TypeLiteral) eResolveProxy(oldCREATE__SRC__mValue);
			if (creatE__SRC__mValue != oldCREATE__SRC__mValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MVALUE,
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
	public TypeLiteral basicGetCREATE__SRC__mValue() {
		return creatE__SRC__mValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mValue(TypeLiteral newCREATE__SRC__mValue) {
		TypeLiteral oldCREATE__SRC__mValue = creatE__SRC__mValue;
		creatE__SRC__mValue = newCREATE__SRC__mValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MVALUE, oldCREATE__SRC__mValue,
					creatE__SRC__mValue));
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
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TANNOTATION_VALUE,
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
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TANNOTATION_VALUE,
					oldCONTEXT__TRG__tAnnotationValue, contexT__TRG__tAnnotationValue));
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
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TTYPE,
							oldCONTEXT__TRG__tType, contexT__TRG__tType));
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
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TTYPE, oldCONTEXT__TRG__tType,
					contexT__TRG__tType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClassNode getCREATE__TRG__tValue() {
		if (creatE__TRG__tValue != null && creatE__TRG__tValue.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tValue = (InternalEObject) creatE__TRG__tValue;
			creatE__TRG__tValue = (TClassNode) eResolveProxy(oldCREATE__TRG__tValue);
			if (creatE__TRG__tValue != oldCREATE__TRG__tValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_TRG_TVALUE,
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
	public TClassNode basicGetCREATE__TRG__tValue() {
		return creatE__TRG__tValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tValue(TClassNode newCREATE__TRG__tValue) {
		TClassNode oldCREATE__TRG__tValue = creatE__TRG__tValue;
		creatE__TRG__tValue = newCREATE__TRG__tValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_TRG_TVALUE, oldCREATE__TRG__tValue,
					creatE__TRG__tValue));
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
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE,
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
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE,
					oldCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue,
					contexT__CORR__AnnotationMemberValuePairToTAnnotationValue));
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
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
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
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
					oldCONTEXT__CORR__mTypeToTType, contexT__CORR__mTypeToTType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassLiteralToClassNode getCREATE__CORR__mValueToTValue() {
		if (creatE__CORR__mValueToTValue != null && creatE__CORR__mValueToTValue.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mValueToTValue = (InternalEObject) creatE__CORR__mValueToTValue;
			creatE__CORR__mValueToTValue = (ClassLiteralToClassNode) eResolveProxy(oldCREATE__CORR__mValueToTValue);
			if (creatE__CORR__mValueToTValue != oldCREATE__CORR__mValueToTValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_CORR_MVALUE_TO_TVALUE,
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
	public ClassLiteralToClassNode basicGetCREATE__CORR__mValueToTValue() {
		return creatE__CORR__mValueToTValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mValueToTValue(ClassLiteralToClassNode newCREATE__CORR__mValueToTValue) {
		ClassLiteralToClassNode oldCREATE__CORR__mValueToTValue = creatE__CORR__mValueToTValue;
		creatE__CORR__mValueToTValue = newCREATE__CORR__mValueToTValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_CORR_MVALUE_TO_TVALUE,
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_ANNOTATION_VALUE:
			if (resolve)
				return getCONTEXT__SRC__AnnotationValue();
			return basicGetCONTEXT__SRC__AnnotationValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MACCESS:
			if (resolve)
				return getCREATE__SRC__mAccess();
			return basicGetCREATE__SRC__mAccess();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_MTYPE:
			if (resolve)
				return getCONTEXT__SRC__mType();
			return basicGetCONTEXT__SRC__mType();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MVALUE:
			if (resolve)
				return getCREATE__SRC__mValue();
			return basicGetCREATE__SRC__mValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TANNOTATION_VALUE:
			if (resolve)
				return getCONTEXT__TRG__tAnnotationValue();
			return basicGetCONTEXT__TRG__tAnnotationValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TTYPE:
			if (resolve)
				return getCONTEXT__TRG__tType();
			return basicGetCONTEXT__TRG__tType();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_TRG_TVALUE:
			if (resolve)
				return getCREATE__TRG__tValue();
			return basicGetCREATE__TRG__tValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			if (resolve)
				return getCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();
			return basicGetCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			if (resolve)
				return getCONTEXT__CORR__mTypeToTType();
			return basicGetCONTEXT__CORR__mTypeToTType();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_CORR_MVALUE_TO_TVALUE:
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_ANNOTATION_VALUE:
			setCONTEXT__SRC__AnnotationValue((AnnotationMemberValuePair) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MACCESS:
			setCREATE__SRC__mAccess((TypeAccess) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((Type) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MVALUE:
			setCREATE__SRC__mValue((TypeLiteral) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TANNOTATION_VALUE:
			setCONTEXT__TRG__tAnnotationValue((TAnnotationValue) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TTYPE:
			setCONTEXT__TRG__tType((TAbstractType) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_TRG_TVALUE:
			setCREATE__TRG__tValue((TClassNode) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			setCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue(
					(AnnotationMemberValuePairToTAnnotationValue) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			setCONTEXT__CORR__mTypeToTType((TypeToTAbstractType) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_CORR_MVALUE_TO_TVALUE:
			setCREATE__CORR__mValueToTValue((ClassLiteralToClassNode) newValue);
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_ANNOTATION_VALUE:
			setCONTEXT__SRC__AnnotationValue((AnnotationMemberValuePair) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MACCESS:
			setCREATE__SRC__mAccess((TypeAccess) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((Type) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MVALUE:
			setCREATE__SRC__mValue((TypeLiteral) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TANNOTATION_VALUE:
			setCONTEXT__TRG__tAnnotationValue((TAnnotationValue) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TTYPE:
			setCONTEXT__TRG__tType((TAbstractType) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_TRG_TVALUE:
			setCREATE__TRG__tValue((TClassNode) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			setCONTEXT__CORR__AnnotationMemberValuePairToTAnnotationValue(
					(AnnotationMemberValuePairToTAnnotationValue) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			setCONTEXT__CORR__mTypeToTType((TypeToTAbstractType) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_CORR_MVALUE_TO_TVALUE:
			setCREATE__CORR__mValueToTValue((ClassLiteralToClassNode) null);
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_ANNOTATION_VALUE:
			return contexT__SRC__AnnotationValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MACCESS:
			return creatE__SRC__mAccess != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_SRC_MTYPE:
			return contexT__SRC__mType != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_SRC_MVALUE:
			return creatE__SRC__mValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TANNOTATION_VALUE:
			return contexT__TRG__tAnnotationValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_TRG_TTYPE:
			return contexT__TRG__tType != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_TRG_TVALUE:
			return creatE__TRG__tValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			return contexT__CORR__AnnotationMemberValuePairToTAnnotationValue != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			return contexT__CORR__mTypeToTType != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_CLASS_MARKER__CREATE_CORR_MVALUE_TO_TVALUE:
			return creatE__CORR__mValueToTValue != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationMemberValueClass__MarkerImpl
