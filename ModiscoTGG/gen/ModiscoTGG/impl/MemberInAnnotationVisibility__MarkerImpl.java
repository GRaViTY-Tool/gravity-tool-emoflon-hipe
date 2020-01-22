/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.MModifierToTModifier;
import ModiscoTGG.MemberInAnnotationVisibility__Marker;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.gravity.modisco.MDefinition;

import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;

import org.gravity.typegraph.basic.annotations.TAnnotationType;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member In Annotation Visibility Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.MemberInAnnotationVisibility__MarkerImpl#getCONTEXT__SRC__Annotation <em>CONTEXT SRC Annotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInAnnotationVisibility__MarkerImpl#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInAnnotationVisibility__MarkerImpl#getCREATE__SRC__mModifier <em>CREATE SRC mModifier</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInAnnotationVisibility__MarkerImpl#getCONTEXT__TRG__tAnnotation <em>CONTEXT TRG tAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInAnnotationVisibility__MarkerImpl#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInAnnotationVisibility__MarkerImpl#getCREATE__TRG__tModifier <em>CREATE TRG tModifier</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInAnnotationVisibility__MarkerImpl#getCONTEXT__CORR__defToMember <em>CONTEXT CORR def To Member</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInAnnotationVisibility__MarkerImpl#getCREATE__CORR__mModifierToTModifier <em>CREATE CORR mModifier To TModifier</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInAnnotationVisibility__MarkerImpl#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberInAnnotationVisibility__MarkerImpl extends TGGRuleApplicationImpl
		implements MemberInAnnotationVisibility__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__Annotation() <em>CONTEXT SRC Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__Annotation()
	 * @generated
	 * @ordered
	 */
	protected AnnotationTypeDeclaration contexT__SRC__Annotation;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mDefinition() <em>CONTEXT SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mDefinition()
	 * @generated
	 * @ordered
	 */
	protected MDefinition contexT__SRC__mDefinition;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tAnnotation() <em>CONTEXT TRG tAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tAnnotation()
	 * @generated
	 * @ordered
	 */
	protected TAnnotationType contexT__TRG__tAnnotation;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tMember() <em>CONTEXT TRG tMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tMember()
	 * @generated
	 * @ordered
	 */
	protected TMember contexT__TRG__tMember;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__defToMember() <em>CONTEXT CORR def To Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__defToMember()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember contexT__CORR__defToMember;

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
	protected MemberInAnnotationVisibility__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getMemberInAnnotationVisibility__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeDeclaration getCONTEXT__SRC__Annotation() {
		if (contexT__SRC__Annotation != null && contexT__SRC__Annotation.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__Annotation = (InternalEObject) contexT__SRC__Annotation;
			contexT__SRC__Annotation = (AnnotationTypeDeclaration) eResolveProxy(oldCONTEXT__SRC__Annotation);
			if (contexT__SRC__Annotation != oldCONTEXT__SRC__Annotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_ANNOTATION,
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
	public AnnotationTypeDeclaration basicGetCONTEXT__SRC__Annotation() {
		return contexT__SRC__Annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__Annotation(AnnotationTypeDeclaration newCONTEXT__SRC__Annotation) {
		AnnotationTypeDeclaration oldCONTEXT__SRC__Annotation = contexT__SRC__Annotation;
		contexT__SRC__Annotation = newCONTEXT__SRC__Annotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_ANNOTATION,
					oldCONTEXT__SRC__Annotation, contexT__SRC__Annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinition getCONTEXT__SRC__mDefinition() {
		if (contexT__SRC__mDefinition != null && contexT__SRC__mDefinition.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mDefinition = (InternalEObject) contexT__SRC__mDefinition;
			contexT__SRC__mDefinition = (MDefinition) eResolveProxy(oldCONTEXT__SRC__mDefinition);
			if (contexT__SRC__mDefinition != oldCONTEXT__SRC__mDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION,
							oldCONTEXT__SRC__mDefinition, contexT__SRC__mDefinition));
			}
		}
		return contexT__SRC__mDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinition basicGetCONTEXT__SRC__mDefinition() {
		return contexT__SRC__mDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mDefinition(MDefinition newCONTEXT__SRC__mDefinition) {
		MDefinition oldCONTEXT__SRC__mDefinition = contexT__SRC__mDefinition;
		contexT__SRC__mDefinition = newCONTEXT__SRC__mDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION,
					oldCONTEXT__SRC__mDefinition, contexT__SRC__mDefinition));
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
							ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER,
							oldCREATE__SRC__mModifier, creatE__SRC__mModifier));
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
					ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER,
					oldCREATE__SRC__mModifier, creatE__SRC__mModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotationType getCONTEXT__TRG__tAnnotation() {
		if (contexT__TRG__tAnnotation != null && contexT__TRG__tAnnotation.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tAnnotation = (InternalEObject) contexT__TRG__tAnnotation;
			contexT__TRG__tAnnotation = (TAnnotationType) eResolveProxy(oldCONTEXT__TRG__tAnnotation);
			if (contexT__TRG__tAnnotation != oldCONTEXT__TRG__tAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TANNOTATION,
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
	public TAnnotationType basicGetCONTEXT__TRG__tAnnotation() {
		return contexT__TRG__tAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tAnnotation(TAnnotationType newCONTEXT__TRG__tAnnotation) {
		TAnnotationType oldCONTEXT__TRG__tAnnotation = contexT__TRG__tAnnotation;
		contexT__TRG__tAnnotation = newCONTEXT__TRG__tAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TANNOTATION,
					oldCONTEXT__TRG__tAnnotation, contexT__TRG__tAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMember getCONTEXT__TRG__tMember() {
		if (contexT__TRG__tMember != null && contexT__TRG__tMember.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tMember = (InternalEObject) contexT__TRG__tMember;
			contexT__TRG__tMember = (TMember) eResolveProxy(oldCONTEXT__TRG__tMember);
			if (contexT__TRG__tMember != oldCONTEXT__TRG__tMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER,
							oldCONTEXT__TRG__tMember, contexT__TRG__tMember));
			}
		}
		return contexT__TRG__tMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMember basicGetCONTEXT__TRG__tMember() {
		return contexT__TRG__tMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tMember(TMember newCONTEXT__TRG__tMember) {
		TMember oldCONTEXT__TRG__tMember = contexT__TRG__tMember;
		contexT__TRG__tMember = newCONTEXT__TRG__tMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER,
					oldCONTEXT__TRG__tMember, contexT__TRG__tMember));
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
							ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER,
							oldCREATE__TRG__tModifier, creatE__TRG__tModifier));
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
					ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER,
					oldCREATE__TRG__tModifier, creatE__TRG__tModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember getCONTEXT__CORR__defToMember() {
		if (contexT__CORR__defToMember != null && contexT__CORR__defToMember.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__defToMember = (InternalEObject) contexT__CORR__defToMember;
			contexT__CORR__defToMember = (MDefinitionToTMember) eResolveProxy(oldCONTEXT__CORR__defToMember);
			if (contexT__CORR__defToMember != oldCONTEXT__CORR__defToMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER,
							oldCONTEXT__CORR__defToMember, contexT__CORR__defToMember));
			}
		}
		return contexT__CORR__defToMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTMember basicGetCONTEXT__CORR__defToMember() {
		return contexT__CORR__defToMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__defToMember(MDefinitionToTMember newCONTEXT__CORR__defToMember) {
		MDefinitionToTMember oldCONTEXT__CORR__defToMember = contexT__CORR__defToMember;
		contexT__CORR__defToMember = newCONTEXT__CORR__defToMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER,
					oldCONTEXT__CORR__defToMember, contexT__CORR__defToMember));
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
							ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER,
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
					ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER,
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
							ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
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
					ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
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
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_ANNOTATION:
			if (resolve)
				return getCONTEXT__SRC__Annotation();
			return basicGetCONTEXT__SRC__Annotation();
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION:
			if (resolve)
				return getCONTEXT__SRC__mDefinition();
			return basicGetCONTEXT__SRC__mDefinition();
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER:
			if (resolve)
				return getCREATE__SRC__mModifier();
			return basicGetCREATE__SRC__mModifier();
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TANNOTATION:
			if (resolve)
				return getCONTEXT__TRG__tAnnotation();
			return basicGetCONTEXT__TRG__tAnnotation();
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER:
			if (resolve)
				return getCONTEXT__TRG__tMember();
			return basicGetCONTEXT__TRG__tMember();
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER:
			if (resolve)
				return getCREATE__TRG__tModifier();
			return basicGetCREATE__TRG__tModifier();
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER:
			if (resolve)
				return getCONTEXT__CORR__defToMember();
			return basicGetCONTEXT__CORR__defToMember();
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER:
			if (resolve)
				return getCREATE__CORR__mModifierToTModifier();
			return basicGetCREATE__CORR__mModifierToTModifier();
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_ANNOTATION:
			setCONTEXT__SRC__Annotation((AnnotationTypeDeclaration) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION:
			setCONTEXT__SRC__mDefinition((MDefinition) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER:
			setCREATE__SRC__mModifier((Modifier) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TANNOTATION:
			setCONTEXT__TRG__tAnnotation((TAnnotationType) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER:
			setCONTEXT__TRG__tMember((TMember) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER:
			setCREATE__TRG__tModifier((TModifier) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER:
			setCONTEXT__CORR__defToMember((MDefinitionToTMember) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER:
			setCREATE__CORR__mModifierToTModifier((MModifierToTModifier) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_ANNOTATION:
			setCONTEXT__SRC__Annotation((AnnotationTypeDeclaration) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION:
			setCONTEXT__SRC__mDefinition((MDefinition) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER:
			setCREATE__SRC__mModifier((Modifier) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TANNOTATION:
			setCONTEXT__TRG__tAnnotation((TAnnotationType) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER:
			setCONTEXT__TRG__tMember((TMember) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER:
			setCREATE__TRG__tModifier((TModifier) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER:
			setCONTEXT__CORR__defToMember((MDefinitionToTMember) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER:
			setCREATE__CORR__mModifierToTModifier((MModifierToTModifier) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_ANNOTATION:
			return contexT__SRC__Annotation != null;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION:
			return contexT__SRC__mDefinition != null;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER:
			return creatE__SRC__mModifier != null;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TANNOTATION:
			return contexT__TRG__tAnnotation != null;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER:
			return contexT__TRG__tMember != null;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER:
			return creatE__TRG__tModifier != null;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER:
			return contexT__CORR__defToMember != null;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER:
			return creatE__CORR__mModifierToTModifier != null;
		case ModiscoTGGPackage.MEMBER_IN_ANNOTATION_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			return contexT__CORR__mTypeToTType != null;
		}
		return super.eIsSet(featureID);
	}

} //MemberInAnnotationVisibility__MarkerImpl