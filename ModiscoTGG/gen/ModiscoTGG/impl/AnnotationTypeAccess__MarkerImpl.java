/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.AnnotationToTAnnotation;
import ModiscoTGG.AnnotationTypeAccess__Marker;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Type Access Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.AnnotationTypeAccess__MarkerImpl#getCONTEXT__SRC__Annotation <em>CONTEXT SRC Annotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationTypeAccess__MarkerImpl#getCONTEXT__SRC__AnnotationType <em>CONTEXT SRC Annotation Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationTypeAccess__MarkerImpl#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationTypeAccess__MarkerImpl#getCONTEXT__TRG__tAnnotation <em>CONTEXT TRG tAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationTypeAccess__MarkerImpl#getCONTEXT__TRG__tAnnotationType <em>CONTEXT TRG tAnnotation Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationTypeAccess__MarkerImpl#getCONTEXT__CORR__AnnotationToTAnnotation <em>CONTEXT CORR Annotation To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationTypeAccess__MarkerImpl#getCONTEXT__CORR__AnnotationTypeToTAnnotationType <em>CONTEXT CORR Annotation Type To TAnnotation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationTypeAccess__MarkerImpl extends TGGRuleApplicationImpl implements AnnotationTypeAccess__Marker {
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
	 * The cached value of the '{@link #getCONTEXT__SRC__AnnotationType() <em>CONTEXT SRC Annotation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__AnnotationType()
	 * @generated
	 * @ordered
	 */
	protected AnnotationTypeDeclaration contexT__SRC__AnnotationType;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tAnnotation() <em>CONTEXT TRG tAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tAnnotation()
	 * @generated
	 * @ordered
	 */
	protected TAnnotation contexT__TRG__tAnnotation;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tAnnotationType() <em>CONTEXT TRG tAnnotation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tAnnotationType()
	 * @generated
	 * @ordered
	 */
	protected TAnnotationType contexT__TRG__tAnnotationType;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__AnnotationTypeToTAnnotationType() <em>CONTEXT CORR Annotation Type To TAnnotation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__AnnotationTypeToTAnnotationType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__AnnotationTypeToTAnnotationType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeAccess__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getAnnotationTypeAccess__Marker();
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
							ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION,
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
					ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION,
					oldCONTEXT__SRC__Annotation, contexT__SRC__Annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeDeclaration getCONTEXT__SRC__AnnotationType() {
		if (contexT__SRC__AnnotationType != null && contexT__SRC__AnnotationType.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__AnnotationType = (InternalEObject) contexT__SRC__AnnotationType;
			contexT__SRC__AnnotationType = (AnnotationTypeDeclaration) eResolveProxy(oldCONTEXT__SRC__AnnotationType);
			if (contexT__SRC__AnnotationType != oldCONTEXT__SRC__AnnotationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION_TYPE,
							oldCONTEXT__SRC__AnnotationType, contexT__SRC__AnnotationType));
			}
		}
		return contexT__SRC__AnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTypeDeclaration basicGetCONTEXT__SRC__AnnotationType() {
		return contexT__SRC__AnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__AnnotationType(AnnotationTypeDeclaration newCONTEXT__SRC__AnnotationType) {
		AnnotationTypeDeclaration oldCONTEXT__SRC__AnnotationType = contexT__SRC__AnnotationType;
		contexT__SRC__AnnotationType = newCONTEXT__SRC__AnnotationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION_TYPE,
					oldCONTEXT__SRC__AnnotationType, contexT__SRC__AnnotationType));
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
							ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CREATE_SRC_MACCESS,
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
					ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CREATE_SRC_MACCESS, oldCREATE__SRC__mAccess,
					creatE__SRC__mAccess));
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
							ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION,
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
					ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION,
					oldCONTEXT__TRG__tAnnotation, contexT__TRG__tAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotationType getCONTEXT__TRG__tAnnotationType() {
		if (contexT__TRG__tAnnotationType != null && contexT__TRG__tAnnotationType.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tAnnotationType = (InternalEObject) contexT__TRG__tAnnotationType;
			contexT__TRG__tAnnotationType = (TAnnotationType) eResolveProxy(oldCONTEXT__TRG__tAnnotationType);
			if (contexT__TRG__tAnnotationType != oldCONTEXT__TRG__tAnnotationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION_TYPE,
							oldCONTEXT__TRG__tAnnotationType, contexT__TRG__tAnnotationType));
			}
		}
		return contexT__TRG__tAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAnnotationType basicGetCONTEXT__TRG__tAnnotationType() {
		return contexT__TRG__tAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tAnnotationType(TAnnotationType newCONTEXT__TRG__tAnnotationType) {
		TAnnotationType oldCONTEXT__TRG__tAnnotationType = contexT__TRG__tAnnotationType;
		contexT__TRG__tAnnotationType = newCONTEXT__TRG__tAnnotationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION_TYPE,
					oldCONTEXT__TRG__tAnnotationType, contexT__TRG__tAnnotationType));
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
							ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION,
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
					ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION,
					oldCONTEXT__CORR__AnnotationToTAnnotation, contexT__CORR__AnnotationToTAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__AnnotationTypeToTAnnotationType() {
		if (contexT__CORR__AnnotationTypeToTAnnotationType != null
				&& contexT__CORR__AnnotationTypeToTAnnotationType.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__AnnotationTypeToTAnnotationType = (InternalEObject) contexT__CORR__AnnotationTypeToTAnnotationType;
			contexT__CORR__AnnotationTypeToTAnnotationType = (TypeToTAbstractType) eResolveProxy(
					oldCONTEXT__CORR__AnnotationTypeToTAnnotationType);
			if (contexT__CORR__AnnotationTypeToTAnnotationType != oldCONTEXT__CORR__AnnotationTypeToTAnnotationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TYPE_TO_TANNOTATION_TYPE,
							oldCONTEXT__CORR__AnnotationTypeToTAnnotationType,
							contexT__CORR__AnnotationTypeToTAnnotationType));
			}
		}
		return contexT__CORR__AnnotationTypeToTAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__AnnotationTypeToTAnnotationType() {
		return contexT__CORR__AnnotationTypeToTAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__AnnotationTypeToTAnnotationType(
			TypeToTAbstractType newCONTEXT__CORR__AnnotationTypeToTAnnotationType) {
		TypeToTAbstractType oldCONTEXT__CORR__AnnotationTypeToTAnnotationType = contexT__CORR__AnnotationTypeToTAnnotationType;
		contexT__CORR__AnnotationTypeToTAnnotationType = newCONTEXT__CORR__AnnotationTypeToTAnnotationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TYPE_TO_TANNOTATION_TYPE,
					oldCONTEXT__CORR__AnnotationTypeToTAnnotationType, contexT__CORR__AnnotationTypeToTAnnotationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION:
			if (resolve)
				return getCONTEXT__SRC__Annotation();
			return basicGetCONTEXT__SRC__Annotation();
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION_TYPE:
			if (resolve)
				return getCONTEXT__SRC__AnnotationType();
			return basicGetCONTEXT__SRC__AnnotationType();
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CREATE_SRC_MACCESS:
			if (resolve)
				return getCREATE__SRC__mAccess();
			return basicGetCREATE__SRC__mAccess();
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION:
			if (resolve)
				return getCONTEXT__TRG__tAnnotation();
			return basicGetCONTEXT__TRG__tAnnotation();
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION_TYPE:
			if (resolve)
				return getCONTEXT__TRG__tAnnotationType();
			return basicGetCONTEXT__TRG__tAnnotationType();
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION:
			if (resolve)
				return getCONTEXT__CORR__AnnotationToTAnnotation();
			return basicGetCONTEXT__CORR__AnnotationToTAnnotation();
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TYPE_TO_TANNOTATION_TYPE:
			if (resolve)
				return getCONTEXT__CORR__AnnotationTypeToTAnnotationType();
			return basicGetCONTEXT__CORR__AnnotationTypeToTAnnotationType();
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
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION:
			setCONTEXT__SRC__Annotation((Annotation) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION_TYPE:
			setCONTEXT__SRC__AnnotationType((AnnotationTypeDeclaration) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CREATE_SRC_MACCESS:
			setCREATE__SRC__mAccess((TypeAccess) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION:
			setCONTEXT__TRG__tAnnotation((TAnnotation) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION_TYPE:
			setCONTEXT__TRG__tAnnotationType((TAnnotationType) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION:
			setCONTEXT__CORR__AnnotationToTAnnotation((AnnotationToTAnnotation) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TYPE_TO_TANNOTATION_TYPE:
			setCONTEXT__CORR__AnnotationTypeToTAnnotationType((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION:
			setCONTEXT__SRC__Annotation((Annotation) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION_TYPE:
			setCONTEXT__SRC__AnnotationType((AnnotationTypeDeclaration) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CREATE_SRC_MACCESS:
			setCREATE__SRC__mAccess((TypeAccess) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION:
			setCONTEXT__TRG__tAnnotation((TAnnotation) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION_TYPE:
			setCONTEXT__TRG__tAnnotationType((TAnnotationType) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION:
			setCONTEXT__CORR__AnnotationToTAnnotation((AnnotationToTAnnotation) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TYPE_TO_TANNOTATION_TYPE:
			setCONTEXT__CORR__AnnotationTypeToTAnnotationType((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION:
			return contexT__SRC__Annotation != null;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_SRC_ANNOTATION_TYPE:
			return contexT__SRC__AnnotationType != null;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CREATE_SRC_MACCESS:
			return creatE__SRC__mAccess != null;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION:
			return contexT__TRG__tAnnotation != null;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_TRG_TANNOTATION_TYPE:
			return contexT__TRG__tAnnotationType != null;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TO_TANNOTATION:
			return contexT__CORR__AnnotationToTAnnotation != null;
		case ModiscoTGGPackage.ANNOTATION_TYPE_ACCESS_MARKER__CONTEXT_CORR_ANNOTATION_TYPE_TO_TANNOTATION_TYPE:
			return contexT__CORR__AnnotationTypeToTAnnotationType != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationTypeAccess__MarkerImpl
