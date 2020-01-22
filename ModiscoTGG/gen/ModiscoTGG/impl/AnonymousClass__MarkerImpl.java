/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.AnonymousClassDeclarationToTClass;
import ModiscoTGG.AnonymousClass__Marker;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.AbstractTypeDeclaration;

import org.gravity.modisco.MAnonymous;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Class Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.AnonymousClass__MarkerImpl#getCREATE__SRC__mAnonymous <em>CREATE SRC mAnonymous</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClass__MarkerImpl#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClass__MarkerImpl#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClass__MarkerImpl#getCREATE__TRG__tAnonymous <em>CREATE TRG tAnonymous</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClass__MarkerImpl#getCREATE__TRG__tNewPackage <em>CREATE TRG tNew Package</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClass__MarkerImpl#getCONTEXT__TRG__tPackage <em>CONTEXT TRG tPackage</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClass__MarkerImpl#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClass__MarkerImpl#getCREATE__CORR__eAnonymousClassDeclarationToTClass <em>CREATE CORR eAnonymous Class Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClass__MarkerImpl#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousClass__MarkerImpl extends TGGRuleApplicationImpl implements AnonymousClass__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__mAnonymous() <em>CREATE SRC mAnonymous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mAnonymous()
	 * @generated
	 * @ordered
	 */
	protected MAnonymous creatE__SRC__mAnonymous;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__pg() <em>CONTEXT TRG pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__pg()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph contexT__TRG__pg;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tAnonymous() <em>CREATE TRG tAnonymous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tAnonymous()
	 * @generated
	 * @ordered
	 */
	protected TClass creatE__TRG__tAnonymous;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tNewPackage() <em>CREATE TRG tNew Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tNewPackage()
	 * @generated
	 * @ordered
	 */
	protected TPackage creatE__TRG__tNewPackage;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tPackage() <em>CONTEXT TRG tPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tPackage()
	 * @generated
	 * @ordered
	 */
	protected TPackage contexT__TRG__tPackage;

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
	 * The cached value of the '{@link #getCREATE__CORR__eAnonymousClassDeclarationToTClass() <em>CREATE CORR eAnonymous Class Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__eAnonymousClassDeclarationToTClass()
	 * @generated
	 * @ordered
	 */
	protected AnonymousClassDeclarationToTClass creatE__CORR__eAnonymousClassDeclarationToTClass;

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
	protected AnonymousClass__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getAnonymousClass__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAnonymous getCREATE__SRC__mAnonymous() {
		if (creatE__SRC__mAnonymous != null && creatE__SRC__mAnonymous.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mAnonymous = (InternalEObject) creatE__SRC__mAnonymous;
			creatE__SRC__mAnonymous = (MAnonymous) eResolveProxy(oldCREATE__SRC__mAnonymous);
			if (creatE__SRC__mAnonymous != oldCREATE__SRC__mAnonymous) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_SRC_MANONYMOUS, oldCREATE__SRC__mAnonymous,
							creatE__SRC__mAnonymous));
			}
		}
		return creatE__SRC__mAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAnonymous basicGetCREATE__SRC__mAnonymous() {
		return creatE__SRC__mAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mAnonymous(MAnonymous newCREATE__SRC__mAnonymous) {
		MAnonymous oldCREATE__SRC__mAnonymous = creatE__SRC__mAnonymous;
		creatE__SRC__mAnonymous = newCREATE__SRC__mAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_SRC_MANONYMOUS, oldCREATE__SRC__mAnonymous,
					creatE__SRC__mAnonymous));
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
							ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_SRC_MTYPE, oldCONTEXT__SRC__mType,
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
					ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_SRC_MTYPE, oldCONTEXT__SRC__mType,
					contexT__SRC__mType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getCONTEXT__TRG__pg() {
		if (contexT__TRG__pg != null && contexT__TRG__pg.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__pg = (InternalEObject) contexT__TRG__pg;
			contexT__TRG__pg = (TypeGraph) eResolveProxy(oldCONTEXT__TRG__pg);
			if (contexT__TRG__pg != oldCONTEXT__TRG__pg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_PG, oldCONTEXT__TRG__pg,
							contexT__TRG__pg));
			}
		}
		return contexT__TRG__pg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph basicGetCONTEXT__TRG__pg() {
		return contexT__TRG__pg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__pg(TypeGraph newCONTEXT__TRG__pg) {
		TypeGraph oldCONTEXT__TRG__pg = contexT__TRG__pg;
		contexT__TRG__pg = newCONTEXT__TRG__pg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_PG, oldCONTEXT__TRG__pg, contexT__TRG__pg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getCREATE__TRG__tAnonymous() {
		if (creatE__TRG__tAnonymous != null && creatE__TRG__tAnonymous.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tAnonymous = (InternalEObject) creatE__TRG__tAnonymous;
			creatE__TRG__tAnonymous = (TClass) eResolveProxy(oldCREATE__TRG__tAnonymous);
			if (creatE__TRG__tAnonymous != oldCREATE__TRG__tAnonymous) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_TRG_TANONYMOUS, oldCREATE__TRG__tAnonymous,
							creatE__TRG__tAnonymous));
			}
		}
		return creatE__TRG__tAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetCREATE__TRG__tAnonymous() {
		return creatE__TRG__tAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tAnonymous(TClass newCREATE__TRG__tAnonymous) {
		TClass oldCREATE__TRG__tAnonymous = creatE__TRG__tAnonymous;
		creatE__TRG__tAnonymous = newCREATE__TRG__tAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_TRG_TANONYMOUS, oldCREATE__TRG__tAnonymous,
					creatE__TRG__tAnonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getCREATE__TRG__tNewPackage() {
		if (creatE__TRG__tNewPackage != null && creatE__TRG__tNewPackage.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tNewPackage = (InternalEObject) creatE__TRG__tNewPackage;
			creatE__TRG__tNewPackage = (TPackage) eResolveProxy(oldCREATE__TRG__tNewPackage);
			if (creatE__TRG__tNewPackage != oldCREATE__TRG__tNewPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_TRG_TNEW_PACKAGE,
							oldCREATE__TRG__tNewPackage, creatE__TRG__tNewPackage));
			}
		}
		return creatE__TRG__tNewPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage basicGetCREATE__TRG__tNewPackage() {
		return creatE__TRG__tNewPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tNewPackage(TPackage newCREATE__TRG__tNewPackage) {
		TPackage oldCREATE__TRG__tNewPackage = creatE__TRG__tNewPackage;
		creatE__TRG__tNewPackage = newCREATE__TRG__tNewPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_TRG_TNEW_PACKAGE, oldCREATE__TRG__tNewPackage,
					creatE__TRG__tNewPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getCONTEXT__TRG__tPackage() {
		if (contexT__TRG__tPackage != null && contexT__TRG__tPackage.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tPackage = (InternalEObject) contexT__TRG__tPackage;
			contexT__TRG__tPackage = (TPackage) eResolveProxy(oldCONTEXT__TRG__tPackage);
			if (contexT__TRG__tPackage != oldCONTEXT__TRG__tPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TPACKAGE, oldCONTEXT__TRG__tPackage,
							contexT__TRG__tPackage));
			}
		}
		return contexT__TRG__tPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage basicGetCONTEXT__TRG__tPackage() {
		return contexT__TRG__tPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tPackage(TPackage newCONTEXT__TRG__tPackage) {
		TPackage oldCONTEXT__TRG__tPackage = contexT__TRG__tPackage;
		contexT__TRG__tPackage = newCONTEXT__TRG__tPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TPACKAGE, oldCONTEXT__TRG__tPackage,
					contexT__TRG__tPackage));
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
							ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TTYPE, oldCONTEXT__TRG__tType,
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
					ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TTYPE, oldCONTEXT__TRG__tType,
					contexT__TRG__tType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclarationToTClass getCREATE__CORR__eAnonymousClassDeclarationToTClass() {
		if (creatE__CORR__eAnonymousClassDeclarationToTClass != null
				&& creatE__CORR__eAnonymousClassDeclarationToTClass.eIsProxy()) {
			InternalEObject oldCREATE__CORR__eAnonymousClassDeclarationToTClass = (InternalEObject) creatE__CORR__eAnonymousClassDeclarationToTClass;
			creatE__CORR__eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) eResolveProxy(
					oldCREATE__CORR__eAnonymousClassDeclarationToTClass);
			if (creatE__CORR__eAnonymousClassDeclarationToTClass != oldCREATE__CORR__eAnonymousClassDeclarationToTClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS,
							oldCREATE__CORR__eAnonymousClassDeclarationToTClass,
							creatE__CORR__eAnonymousClassDeclarationToTClass));
			}
		}
		return creatE__CORR__eAnonymousClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclarationToTClass basicGetCREATE__CORR__eAnonymousClassDeclarationToTClass() {
		return creatE__CORR__eAnonymousClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__eAnonymousClassDeclarationToTClass(
			AnonymousClassDeclarationToTClass newCREATE__CORR__eAnonymousClassDeclarationToTClass) {
		AnonymousClassDeclarationToTClass oldCREATE__CORR__eAnonymousClassDeclarationToTClass = creatE__CORR__eAnonymousClassDeclarationToTClass;
		creatE__CORR__eAnonymousClassDeclarationToTClass = newCREATE__CORR__eAnonymousClassDeclarationToTClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS,
					oldCREATE__CORR__eAnonymousClassDeclarationToTClass,
					creatE__CORR__eAnonymousClassDeclarationToTClass));
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
							ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
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
					ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
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
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_SRC_MANONYMOUS:
			if (resolve)
				return getCREATE__SRC__mAnonymous();
			return basicGetCREATE__SRC__mAnonymous();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_SRC_MTYPE:
			if (resolve)
				return getCONTEXT__SRC__mType();
			return basicGetCONTEXT__SRC__mType();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_PG:
			if (resolve)
				return getCONTEXT__TRG__pg();
			return basicGetCONTEXT__TRG__pg();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_TRG_TANONYMOUS:
			if (resolve)
				return getCREATE__TRG__tAnonymous();
			return basicGetCREATE__TRG__tAnonymous();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_TRG_TNEW_PACKAGE:
			if (resolve)
				return getCREATE__TRG__tNewPackage();
			return basicGetCREATE__TRG__tNewPackage();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TPACKAGE:
			if (resolve)
				return getCONTEXT__TRG__tPackage();
			return basicGetCONTEXT__TRG__tPackage();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TTYPE:
			if (resolve)
				return getCONTEXT__TRG__tType();
			return basicGetCONTEXT__TRG__tType();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			if (resolve)
				return getCREATE__CORR__eAnonymousClassDeclarationToTClass();
			return basicGetCREATE__CORR__eAnonymousClassDeclarationToTClass();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_SRC_MANONYMOUS:
			setCREATE__SRC__mAnonymous((MAnonymous) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((AbstractTypeDeclaration) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_TRG_TANONYMOUS:
			setCREATE__TRG__tAnonymous((TClass) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_TRG_TNEW_PACKAGE:
			setCREATE__TRG__tNewPackage((TPackage) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TPACKAGE:
			setCONTEXT__TRG__tPackage((TPackage) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TTYPE:
			setCONTEXT__TRG__tType((TAbstractType) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			setCREATE__CORR__eAnonymousClassDeclarationToTClass((AnonymousClassDeclarationToTClass) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_SRC_MANONYMOUS:
			setCREATE__SRC__mAnonymous((MAnonymous) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((AbstractTypeDeclaration) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_TRG_TANONYMOUS:
			setCREATE__TRG__tAnonymous((TClass) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_TRG_TNEW_PACKAGE:
			setCREATE__TRG__tNewPackage((TPackage) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TPACKAGE:
			setCONTEXT__TRG__tPackage((TPackage) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TTYPE:
			setCONTEXT__TRG__tType((TAbstractType) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			setCREATE__CORR__eAnonymousClassDeclarationToTClass((AnonymousClassDeclarationToTClass) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
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
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_SRC_MANONYMOUS:
			return creatE__SRC__mAnonymous != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_SRC_MTYPE:
			return contexT__SRC__mType != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_PG:
			return contexT__TRG__pg != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_TRG_TANONYMOUS:
			return creatE__TRG__tAnonymous != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_TRG_TNEW_PACKAGE:
			return creatE__TRG__tNewPackage != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TPACKAGE:
			return contexT__TRG__tPackage != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_TRG_TTYPE:
			return contexT__TRG__tType != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			return creatE__CORR__eAnonymousClassDeclarationToTClass != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			return contexT__CORR__mTypeToTType != null;
		}
		return super.eIsSet(featureID);
	}

} //AnonymousClass__MarkerImpl
