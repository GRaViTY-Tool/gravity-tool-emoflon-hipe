/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.MModifierToTModifier;
import ModiscoTGG.MemberInClassVisibility__Marker;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.gravity.modisco.MDefinition;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member In Class Visibility Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.MemberInClassVisibility__MarkerImpl#getCONTEXT__SRC__mClass <em>CONTEXT SRC mClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInClassVisibility__MarkerImpl#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInClassVisibility__MarkerImpl#getCREATE__SRC__mModifier <em>CREATE SRC mModifier</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInClassVisibility__MarkerImpl#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInClassVisibility__MarkerImpl#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInClassVisibility__MarkerImpl#getCREATE__TRG__tModifier <em>CREATE TRG tModifier</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInClassVisibility__MarkerImpl#getCONTEXT__CORR__defToMember <em>CONTEXT CORR def To Member</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInClassVisibility__MarkerImpl#getCREATE__CORR__mModifierToTModifier <em>CREATE CORR mModifier To TModifier</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MemberInClassVisibility__MarkerImpl#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberInClassVisibility__MarkerImpl extends TGGRuleApplicationImpl
		implements MemberInClassVisibility__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mClass() <em>CONTEXT SRC mClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mClass()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclaration contexT__SRC__mClass;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tClass() <em>CONTEXT TRG tClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tClass()
	 * @generated
	 * @ordered
	 */
	protected TClass contexT__TRG__tClass;

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
	protected MemberInClassVisibility__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getMemberInClassVisibility__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclaration getCONTEXT__SRC__mClass() {
		if (contexT__SRC__mClass != null && contexT__SRC__mClass.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mClass = (InternalEObject) contexT__SRC__mClass;
			contexT__SRC__mClass = (ClassDeclaration) eResolveProxy(oldCONTEXT__SRC__mClass);
			if (contexT__SRC__mClass != oldCONTEXT__SRC__mClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MCLASS,
							oldCONTEXT__SRC__mClass, contexT__SRC__mClass));
			}
		}
		return contexT__SRC__mClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration basicGetCONTEXT__SRC__mClass() {
		return contexT__SRC__mClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mClass(ClassDeclaration newCONTEXT__SRC__mClass) {
		ClassDeclaration oldCONTEXT__SRC__mClass = contexT__SRC__mClass;
		contexT__SRC__mClass = newCONTEXT__SRC__mClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MCLASS, oldCONTEXT__SRC__mClass,
					contexT__SRC__mClass));
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
							ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION,
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
					ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION,
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
							ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER,
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
					ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER,
					oldCREATE__SRC__mModifier, creatE__SRC__mModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getCONTEXT__TRG__tClass() {
		if (contexT__TRG__tClass != null && contexT__TRG__tClass.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tClass = (InternalEObject) contexT__TRG__tClass;
			contexT__TRG__tClass = (TClass) eResolveProxy(oldCONTEXT__TRG__tClass);
			if (contexT__TRG__tClass != oldCONTEXT__TRG__tClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TCLASS,
							oldCONTEXT__TRG__tClass, contexT__TRG__tClass));
			}
		}
		return contexT__TRG__tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetCONTEXT__TRG__tClass() {
		return contexT__TRG__tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tClass(TClass newCONTEXT__TRG__tClass) {
		TClass oldCONTEXT__TRG__tClass = contexT__TRG__tClass;
		contexT__TRG__tClass = newCONTEXT__TRG__tClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TCLASS, oldCONTEXT__TRG__tClass,
					contexT__TRG__tClass));
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
							ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER,
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
					ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER, oldCONTEXT__TRG__tMember,
					contexT__TRG__tMember));
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
							ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER,
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
					ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER,
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
							ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER,
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
					ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER,
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
							ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER,
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
					ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER,
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
							ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
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
					ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
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
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MCLASS:
			if (resolve)
				return getCONTEXT__SRC__mClass();
			return basicGetCONTEXT__SRC__mClass();
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION:
			if (resolve)
				return getCONTEXT__SRC__mDefinition();
			return basicGetCONTEXT__SRC__mDefinition();
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER:
			if (resolve)
				return getCREATE__SRC__mModifier();
			return basicGetCREATE__SRC__mModifier();
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TCLASS:
			if (resolve)
				return getCONTEXT__TRG__tClass();
			return basicGetCONTEXT__TRG__tClass();
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER:
			if (resolve)
				return getCONTEXT__TRG__tMember();
			return basicGetCONTEXT__TRG__tMember();
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER:
			if (resolve)
				return getCREATE__TRG__tModifier();
			return basicGetCREATE__TRG__tModifier();
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER:
			if (resolve)
				return getCONTEXT__CORR__defToMember();
			return basicGetCONTEXT__CORR__defToMember();
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER:
			if (resolve)
				return getCREATE__CORR__mModifierToTModifier();
			return basicGetCREATE__CORR__mModifierToTModifier();
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MCLASS:
			setCONTEXT__SRC__mClass((ClassDeclaration) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION:
			setCONTEXT__SRC__mDefinition((MDefinition) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER:
			setCREATE__SRC__mModifier((Modifier) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TCLASS:
			setCONTEXT__TRG__tClass((TClass) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER:
			setCONTEXT__TRG__tMember((TMember) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER:
			setCREATE__TRG__tModifier((TModifier) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER:
			setCONTEXT__CORR__defToMember((MDefinitionToTMember) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER:
			setCREATE__CORR__mModifierToTModifier((MModifierToTModifier) newValue);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MCLASS:
			setCONTEXT__SRC__mClass((ClassDeclaration) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION:
			setCONTEXT__SRC__mDefinition((MDefinition) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER:
			setCREATE__SRC__mModifier((Modifier) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TCLASS:
			setCONTEXT__TRG__tClass((TClass) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER:
			setCONTEXT__TRG__tMember((TMember) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER:
			setCREATE__TRG__tModifier((TModifier) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER:
			setCONTEXT__CORR__defToMember((MDefinitionToTMember) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER:
			setCREATE__CORR__mModifierToTModifier((MModifierToTModifier) null);
			return;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MCLASS:
			return contexT__SRC__mClass != null;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_SRC_MDEFINITION:
			return contexT__SRC__mDefinition != null;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_SRC_MMODIFIER:
			return creatE__SRC__mModifier != null;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TCLASS:
			return contexT__TRG__tClass != null;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_TRG_TMEMBER:
			return contexT__TRG__tMember != null;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_TRG_TMODIFIER:
			return creatE__TRG__tModifier != null;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_DEF_TO_MEMBER:
			return contexT__CORR__defToMember != null;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CREATE_CORR_MMODIFIER_TO_TMODIFIER:
			return creatE__CORR__mModifierToTModifier != null;
		case ModiscoTGGPackage.MEMBER_IN_CLASS_VISIBILITY_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			return contexT__CORR__mTypeToTType != null;
		}
		return super.eIsSet(featureID);
	}

} //MemberInClassVisibility__MarkerImpl
