/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.AnonymousClassDeclarationToTClass;
import ModiscoTGG.LinkDefinitionToAnonymous__Marker;
import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.MSignatureToTSignature;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MAnonymous;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MSignature;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TSignature;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Definition To Anonymous Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.LinkDefinitionToAnonymous__MarkerImpl#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.LinkDefinitionToAnonymous__MarkerImpl#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.LinkDefinitionToAnonymous__MarkerImpl#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.LinkDefinitionToAnonymous__MarkerImpl#getCONTEXT__TRG__tDefinition <em>CONTEXT TRG tDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.LinkDefinitionToAnonymous__MarkerImpl#getCONTEXT__TRG__tSignature <em>CONTEXT TRG tSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.LinkDefinitionToAnonymous__MarkerImpl#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.LinkDefinitionToAnonymous__MarkerImpl#getCONTEXT__CORR__mDefinitionToTMember <em>CONTEXT CORR mDefinition To TMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.LinkDefinitionToAnonymous__MarkerImpl#getCONTEXT__CORR__mSignatureToTSignature <em>CONTEXT CORR mSignature To TSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.LinkDefinitionToAnonymous__MarkerImpl#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkDefinitionToAnonymous__MarkerImpl extends TGGRuleApplicationImpl
		implements LinkDefinitionToAnonymous__Marker {
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
	 * The cached value of the '{@link #getCONTEXT__SRC__mSignature() <em>CONTEXT SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mSignature()
	 * @generated
	 * @ordered
	 */
	protected MSignature contexT__SRC__mSignature;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mType() <em>CONTEXT SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mType()
	 * @generated
	 * @ordered
	 */
	protected MAnonymous contexT__SRC__mType;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tDefinition() <em>CONTEXT TRG tDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tDefinition()
	 * @generated
	 * @ordered
	 */
	protected TMember contexT__TRG__tDefinition;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tSignature() <em>CONTEXT TRG tSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tSignature()
	 * @generated
	 * @ordered
	 */
	protected TSignature contexT__TRG__tSignature;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tType() <em>CONTEXT TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tType()
	 * @generated
	 * @ordered
	 */
	protected TClass contexT__TRG__tType;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mDefinitionToTMember() <em>CONTEXT CORR mDefinition To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mDefinitionToTMember()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember contexT__CORR__mDefinitionToTMember;

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
	protected AnonymousClassDeclarationToTClass contexT__CORR__mTypeToTType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkDefinitionToAnonymous__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getLinkDefinitionToAnonymous__Marker();
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
							ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MDEFINITION,
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
					ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MDEFINITION,
					oldCONTEXT__SRC__mDefinition, contexT__SRC__mDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSignature getCONTEXT__SRC__mSignature() {
		if (contexT__SRC__mSignature != null && contexT__SRC__mSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mSignature = (InternalEObject) contexT__SRC__mSignature;
			contexT__SRC__mSignature = (MSignature) eResolveProxy(oldCONTEXT__SRC__mSignature);
			if (contexT__SRC__mSignature != oldCONTEXT__SRC__mSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MSIGNATURE,
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
	public MSignature basicGetCONTEXT__SRC__mSignature() {
		return contexT__SRC__mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mSignature(MSignature newCONTEXT__SRC__mSignature) {
		MSignature oldCONTEXT__SRC__mSignature = contexT__SRC__mSignature;
		contexT__SRC__mSignature = newCONTEXT__SRC__mSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MSIGNATURE,
					oldCONTEXT__SRC__mSignature, contexT__SRC__mSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAnonymous getCONTEXT__SRC__mType() {
		if (contexT__SRC__mType != null && contexT__SRC__mType.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mType = (InternalEObject) contexT__SRC__mType;
			contexT__SRC__mType = (MAnonymous) eResolveProxy(oldCONTEXT__SRC__mType);
			if (contexT__SRC__mType != oldCONTEXT__SRC__mType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MTYPE,
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
	public MAnonymous basicGetCONTEXT__SRC__mType() {
		return contexT__SRC__mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mType(MAnonymous newCONTEXT__SRC__mType) {
		MAnonymous oldCONTEXT__SRC__mType = contexT__SRC__mType;
		contexT__SRC__mType = newCONTEXT__SRC__mType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MTYPE, oldCONTEXT__SRC__mType,
					contexT__SRC__mType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMember getCONTEXT__TRG__tDefinition() {
		if (contexT__TRG__tDefinition != null && contexT__TRG__tDefinition.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tDefinition = (InternalEObject) contexT__TRG__tDefinition;
			contexT__TRG__tDefinition = (TMember) eResolveProxy(oldCONTEXT__TRG__tDefinition);
			if (contexT__TRG__tDefinition != oldCONTEXT__TRG__tDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TDEFINITION,
							oldCONTEXT__TRG__tDefinition, contexT__TRG__tDefinition));
			}
		}
		return contexT__TRG__tDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMember basicGetCONTEXT__TRG__tDefinition() {
		return contexT__TRG__tDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tDefinition(TMember newCONTEXT__TRG__tDefinition) {
		TMember oldCONTEXT__TRG__tDefinition = contexT__TRG__tDefinition;
		contexT__TRG__tDefinition = newCONTEXT__TRG__tDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TDEFINITION,
					oldCONTEXT__TRG__tDefinition, contexT__TRG__tDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSignature getCONTEXT__TRG__tSignature() {
		if (contexT__TRG__tSignature != null && contexT__TRG__tSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tSignature = (InternalEObject) contexT__TRG__tSignature;
			contexT__TRG__tSignature = (TSignature) eResolveProxy(oldCONTEXT__TRG__tSignature);
			if (contexT__TRG__tSignature != oldCONTEXT__TRG__tSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TSIGNATURE,
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
	public TSignature basicGetCONTEXT__TRG__tSignature() {
		return contexT__TRG__tSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tSignature(TSignature newCONTEXT__TRG__tSignature) {
		TSignature oldCONTEXT__TRG__tSignature = contexT__TRG__tSignature;
		contexT__TRG__tSignature = newCONTEXT__TRG__tSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TSIGNATURE,
					oldCONTEXT__TRG__tSignature, contexT__TRG__tSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getCONTEXT__TRG__tType() {
		if (contexT__TRG__tType != null && contexT__TRG__tType.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tType = (InternalEObject) contexT__TRG__tType;
			contexT__TRG__tType = (TClass) eResolveProxy(oldCONTEXT__TRG__tType);
			if (contexT__TRG__tType != oldCONTEXT__TRG__tType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TTYPE,
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
	public TClass basicGetCONTEXT__TRG__tType() {
		return contexT__TRG__tType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tType(TClass newCONTEXT__TRG__tType) {
		TClass oldCONTEXT__TRG__tType = contexT__TRG__tType;
		contexT__TRG__tType = newCONTEXT__TRG__tType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TTYPE, oldCONTEXT__TRG__tType,
					contexT__TRG__tType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember getCONTEXT__CORR__mDefinitionToTMember() {
		if (contexT__CORR__mDefinitionToTMember != null && contexT__CORR__mDefinitionToTMember.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mDefinitionToTMember = (InternalEObject) contexT__CORR__mDefinitionToTMember;
			contexT__CORR__mDefinitionToTMember = (MDefinitionToTMember) eResolveProxy(
					oldCONTEXT__CORR__mDefinitionToTMember);
			if (contexT__CORR__mDefinitionToTMember != oldCONTEXT__CORR__mDefinitionToTMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER,
							oldCONTEXT__CORR__mDefinitionToTMember, contexT__CORR__mDefinitionToTMember));
			}
		}
		return contexT__CORR__mDefinitionToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTMember basicGetCONTEXT__CORR__mDefinitionToTMember() {
		return contexT__CORR__mDefinitionToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mDefinitionToTMember(MDefinitionToTMember newCONTEXT__CORR__mDefinitionToTMember) {
		MDefinitionToTMember oldCONTEXT__CORR__mDefinitionToTMember = contexT__CORR__mDefinitionToTMember;
		contexT__CORR__mDefinitionToTMember = newCONTEXT__CORR__mDefinitionToTMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER,
					oldCONTEXT__CORR__mDefinitionToTMember, contexT__CORR__mDefinitionToTMember));
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
							ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE,
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
					ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE,
					oldCONTEXT__CORR__mSignatureToTSignature, contexT__CORR__mSignatureToTSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclarationToTClass getCONTEXT__CORR__mTypeToTType() {
		if (contexT__CORR__mTypeToTType != null && contexT__CORR__mTypeToTType.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mTypeToTType = (InternalEObject) contexT__CORR__mTypeToTType;
			contexT__CORR__mTypeToTType = (AnonymousClassDeclarationToTClass) eResolveProxy(
					oldCONTEXT__CORR__mTypeToTType);
			if (contexT__CORR__mTypeToTType != oldCONTEXT__CORR__mTypeToTType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
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
	public AnonymousClassDeclarationToTClass basicGetCONTEXT__CORR__mTypeToTType() {
		return contexT__CORR__mTypeToTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mTypeToTType(AnonymousClassDeclarationToTClass newCONTEXT__CORR__mTypeToTType) {
		AnonymousClassDeclarationToTClass oldCONTEXT__CORR__mTypeToTType = contexT__CORR__mTypeToTType;
		contexT__CORR__mTypeToTType = newCONTEXT__CORR__mTypeToTType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
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
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MDEFINITION:
			if (resolve)
				return getCONTEXT__SRC__mDefinition();
			return basicGetCONTEXT__SRC__mDefinition();
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MSIGNATURE:
			if (resolve)
				return getCONTEXT__SRC__mSignature();
			return basicGetCONTEXT__SRC__mSignature();
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MTYPE:
			if (resolve)
				return getCONTEXT__SRC__mType();
			return basicGetCONTEXT__SRC__mType();
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TDEFINITION:
			if (resolve)
				return getCONTEXT__TRG__tDefinition();
			return basicGetCONTEXT__TRG__tDefinition();
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TSIGNATURE:
			if (resolve)
				return getCONTEXT__TRG__tSignature();
			return basicGetCONTEXT__TRG__tSignature();
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TTYPE:
			if (resolve)
				return getCONTEXT__TRG__tType();
			return basicGetCONTEXT__TRG__tType();
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER:
			if (resolve)
				return getCONTEXT__CORR__mDefinitionToTMember();
			return basicGetCONTEXT__CORR__mDefinitionToTMember();
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE:
			if (resolve)
				return getCONTEXT__CORR__mSignatureToTSignature();
			return basicGetCONTEXT__CORR__mSignatureToTSignature();
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MDEFINITION:
			setCONTEXT__SRC__mDefinition((MDefinition) newValue);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MSIGNATURE:
			setCONTEXT__SRC__mSignature((MSignature) newValue);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((MAnonymous) newValue);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TDEFINITION:
			setCONTEXT__TRG__tDefinition((TMember) newValue);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TSIGNATURE:
			setCONTEXT__TRG__tSignature((TSignature) newValue);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TTYPE:
			setCONTEXT__TRG__tType((TClass) newValue);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER:
			setCONTEXT__CORR__mDefinitionToTMember((MDefinitionToTMember) newValue);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE:
			setCONTEXT__CORR__mSignatureToTSignature((MSignatureToTSignature) newValue);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			setCONTEXT__CORR__mTypeToTType((AnonymousClassDeclarationToTClass) newValue);
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
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MDEFINITION:
			setCONTEXT__SRC__mDefinition((MDefinition) null);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MSIGNATURE:
			setCONTEXT__SRC__mSignature((MSignature) null);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((MAnonymous) null);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TDEFINITION:
			setCONTEXT__TRG__tDefinition((TMember) null);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TSIGNATURE:
			setCONTEXT__TRG__tSignature((TSignature) null);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TTYPE:
			setCONTEXT__TRG__tType((TClass) null);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER:
			setCONTEXT__CORR__mDefinitionToTMember((MDefinitionToTMember) null);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE:
			setCONTEXT__CORR__mSignatureToTSignature((MSignatureToTSignature) null);
			return;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			setCONTEXT__CORR__mTypeToTType((AnonymousClassDeclarationToTClass) null);
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
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MDEFINITION:
			return contexT__SRC__mDefinition != null;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MSIGNATURE:
			return contexT__SRC__mSignature != null;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_SRC_MTYPE:
			return contexT__SRC__mType != null;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TDEFINITION:
			return contexT__TRG__tDefinition != null;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TSIGNATURE:
			return contexT__TRG__tSignature != null;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_TRG_TTYPE:
			return contexT__TRG__tType != null;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER:
			return contexT__CORR__mDefinitionToTMember != null;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TSIGNATURE:
			return contexT__CORR__mSignatureToTSignature != null;
		case ModiscoTGGPackage.LINK_DEFINITION_TO_ANONYMOUS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			return contexT__CORR__mTypeToTType != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkDefinitionToAnonymous__MarkerImpl
