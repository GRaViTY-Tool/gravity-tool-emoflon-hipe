/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.AnonymousClassDeclarationToTClass;
import ModiscoTGG.AnonymousClassTypeClass__Marker;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.modisco.MAnonymous;

import org.gravity.typegraph.basic.TClass;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Class Type Class Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.AnonymousClassTypeClass__MarkerImpl#getCONTEXT__SRC__mAnonymous <em>CONTEXT SRC mAnonymous</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClassTypeClass__MarkerImpl#getCREATE__SRC__mCreation <em>CREATE SRC mCreation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClassTypeClass__MarkerImpl#getCONTEXT__SRC__mParent <em>CONTEXT SRC mParent</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClassTypeClass__MarkerImpl#getCREATE__SRC__mType <em>CREATE SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClassTypeClass__MarkerImpl#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClassTypeClass__MarkerImpl#getCONTEXT__TRG__tParent <em>CONTEXT TRG tParent</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClassTypeClass__MarkerImpl#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnonymousClassTypeClass__MarkerImpl#getCONTEXT__CORR__parentToParent <em>CONTEXT CORR parent To Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousClassTypeClass__MarkerImpl extends TGGRuleApplicationImpl
		implements AnonymousClassTypeClass__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mAnonymous() <em>CONTEXT SRC mAnonymous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mAnonymous()
	 * @generated
	 * @ordered
	 */
	protected MAnonymous contexT__SRC__mAnonymous;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mCreation() <em>CREATE SRC mCreation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mCreation()
	 * @generated
	 * @ordered
	 */
	protected ClassInstanceCreation creatE__SRC__mCreation;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mParent() <em>CONTEXT SRC mParent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mParent()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeDeclaration contexT__SRC__mParent;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mType() <em>CREATE SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mType()
	 * @generated
	 * @ordered
	 */
	protected TypeAccess creatE__SRC__mType;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tParent() <em>CONTEXT TRG tParent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tParent()
	 * @generated
	 * @ordered
	 */
	protected TClass contexT__TRG__tParent;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eAnonymousClassDeclarationToTClass() <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eAnonymousClassDeclarationToTClass()
	 * @generated
	 * @ordered
	 */
	protected AnonymousClassDeclarationToTClass contexT__CORR__eAnonymousClassDeclarationToTClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__parentToParent() <em>CONTEXT CORR parent To Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__parentToParent()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__parentToParent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClassTypeClass__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getAnonymousClassTypeClass__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAnonymous getCONTEXT__SRC__mAnonymous() {
		if (contexT__SRC__mAnonymous != null && contexT__SRC__mAnonymous.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mAnonymous = (InternalEObject) contexT__SRC__mAnonymous;
			contexT__SRC__mAnonymous = (MAnonymous) eResolveProxy(oldCONTEXT__SRC__mAnonymous);
			if (contexT__SRC__mAnonymous != oldCONTEXT__SRC__mAnonymous) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MANONYMOUS,
							oldCONTEXT__SRC__mAnonymous, contexT__SRC__mAnonymous));
			}
		}
		return contexT__SRC__mAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAnonymous basicGetCONTEXT__SRC__mAnonymous() {
		return contexT__SRC__mAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mAnonymous(MAnonymous newCONTEXT__SRC__mAnonymous) {
		MAnonymous oldCONTEXT__SRC__mAnonymous = contexT__SRC__mAnonymous;
		contexT__SRC__mAnonymous = newCONTEXT__SRC__mAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MANONYMOUS,
					oldCONTEXT__SRC__mAnonymous, contexT__SRC__mAnonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInstanceCreation getCREATE__SRC__mCreation() {
		if (creatE__SRC__mCreation != null && creatE__SRC__mCreation.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mCreation = (InternalEObject) creatE__SRC__mCreation;
			creatE__SRC__mCreation = (ClassInstanceCreation) eResolveProxy(oldCREATE__SRC__mCreation);
			if (creatE__SRC__mCreation != oldCREATE__SRC__mCreation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MCREATION,
							oldCREATE__SRC__mCreation, creatE__SRC__mCreation));
			}
		}
		return creatE__SRC__mCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassInstanceCreation basicGetCREATE__SRC__mCreation() {
		return creatE__SRC__mCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mCreation(ClassInstanceCreation newCREATE__SRC__mCreation) {
		ClassInstanceCreation oldCREATE__SRC__mCreation = creatE__SRC__mCreation;
		creatE__SRC__mCreation = newCREATE__SRC__mCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MCREATION,
					oldCREATE__SRC__mCreation, creatE__SRC__mCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeDeclaration getCONTEXT__SRC__mParent() {
		if (contexT__SRC__mParent != null && contexT__SRC__mParent.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mParent = (InternalEObject) contexT__SRC__mParent;
			contexT__SRC__mParent = (AbstractTypeDeclaration) eResolveProxy(oldCONTEXT__SRC__mParent);
			if (contexT__SRC__mParent != oldCONTEXT__SRC__mParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MPARENT,
							oldCONTEXT__SRC__mParent, contexT__SRC__mParent));
			}
		}
		return contexT__SRC__mParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration basicGetCONTEXT__SRC__mParent() {
		return contexT__SRC__mParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mParent(AbstractTypeDeclaration newCONTEXT__SRC__mParent) {
		AbstractTypeDeclaration oldCONTEXT__SRC__mParent = contexT__SRC__mParent;
		contexT__SRC__mParent = newCONTEXT__SRC__mParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MPARENT, oldCONTEXT__SRC__mParent,
					contexT__SRC__mParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess getCREATE__SRC__mType() {
		if (creatE__SRC__mType != null && creatE__SRC__mType.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mType = (InternalEObject) creatE__SRC__mType;
			creatE__SRC__mType = (TypeAccess) eResolveProxy(oldCREATE__SRC__mType);
			if (creatE__SRC__mType != oldCREATE__SRC__mType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MTYPE,
							oldCREATE__SRC__mType, creatE__SRC__mType));
			}
		}
		return creatE__SRC__mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess basicGetCREATE__SRC__mType() {
		return creatE__SRC__mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mType(TypeAccess newCREATE__SRC__mType) {
		TypeAccess oldCREATE__SRC__mType = creatE__SRC__mType;
		creatE__SRC__mType = newCREATE__SRC__mType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MTYPE, oldCREATE__SRC__mType,
					creatE__SRC__mType));
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
							ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TCLASS,
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
					ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TCLASS, oldCONTEXT__TRG__tClass,
					contexT__TRG__tClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getCONTEXT__TRG__tParent() {
		if (contexT__TRG__tParent != null && contexT__TRG__tParent.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tParent = (InternalEObject) contexT__TRG__tParent;
			contexT__TRG__tParent = (TClass) eResolveProxy(oldCONTEXT__TRG__tParent);
			if (contexT__TRG__tParent != oldCONTEXT__TRG__tParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TPARENT,
							oldCONTEXT__TRG__tParent, contexT__TRG__tParent));
			}
		}
		return contexT__TRG__tParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetCONTEXT__TRG__tParent() {
		return contexT__TRG__tParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tParent(TClass newCONTEXT__TRG__tParent) {
		TClass oldCONTEXT__TRG__tParent = contexT__TRG__tParent;
		contexT__TRG__tParent = newCONTEXT__TRG__tParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TPARENT, oldCONTEXT__TRG__tParent,
					contexT__TRG__tParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclarationToTClass getCONTEXT__CORR__eAnonymousClassDeclarationToTClass() {
		if (contexT__CORR__eAnonymousClassDeclarationToTClass != null
				&& contexT__CORR__eAnonymousClassDeclarationToTClass.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eAnonymousClassDeclarationToTClass = (InternalEObject) contexT__CORR__eAnonymousClassDeclarationToTClass;
			contexT__CORR__eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) eResolveProxy(
					oldCONTEXT__CORR__eAnonymousClassDeclarationToTClass);
			if (contexT__CORR__eAnonymousClassDeclarationToTClass != oldCONTEXT__CORR__eAnonymousClassDeclarationToTClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS,
							oldCONTEXT__CORR__eAnonymousClassDeclarationToTClass,
							contexT__CORR__eAnonymousClassDeclarationToTClass));
			}
		}
		return contexT__CORR__eAnonymousClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclarationToTClass basicGetCONTEXT__CORR__eAnonymousClassDeclarationToTClass() {
		return contexT__CORR__eAnonymousClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eAnonymousClassDeclarationToTClass(
			AnonymousClassDeclarationToTClass newCONTEXT__CORR__eAnonymousClassDeclarationToTClass) {
		AnonymousClassDeclarationToTClass oldCONTEXT__CORR__eAnonymousClassDeclarationToTClass = contexT__CORR__eAnonymousClassDeclarationToTClass;
		contexT__CORR__eAnonymousClassDeclarationToTClass = newCONTEXT__CORR__eAnonymousClassDeclarationToTClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS,
					oldCONTEXT__CORR__eAnonymousClassDeclarationToTClass,
					contexT__CORR__eAnonymousClassDeclarationToTClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__parentToParent() {
		if (contexT__CORR__parentToParent != null && contexT__CORR__parentToParent.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__parentToParent = (InternalEObject) contexT__CORR__parentToParent;
			contexT__CORR__parentToParent = (TypeToTAbstractType) eResolveProxy(oldCONTEXT__CORR__parentToParent);
			if (contexT__CORR__parentToParent != oldCONTEXT__CORR__parentToParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_PARENT_TO_PARENT,
							oldCONTEXT__CORR__parentToParent, contexT__CORR__parentToParent));
			}
		}
		return contexT__CORR__parentToParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__parentToParent() {
		return contexT__CORR__parentToParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__parentToParent(TypeToTAbstractType newCONTEXT__CORR__parentToParent) {
		TypeToTAbstractType oldCONTEXT__CORR__parentToParent = contexT__CORR__parentToParent;
		contexT__CORR__parentToParent = newCONTEXT__CORR__parentToParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_PARENT_TO_PARENT,
					oldCONTEXT__CORR__parentToParent, contexT__CORR__parentToParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MANONYMOUS:
			if (resolve)
				return getCONTEXT__SRC__mAnonymous();
			return basicGetCONTEXT__SRC__mAnonymous();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MCREATION:
			if (resolve)
				return getCREATE__SRC__mCreation();
			return basicGetCREATE__SRC__mCreation();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MPARENT:
			if (resolve)
				return getCONTEXT__SRC__mParent();
			return basicGetCONTEXT__SRC__mParent();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MTYPE:
			if (resolve)
				return getCREATE__SRC__mType();
			return basicGetCREATE__SRC__mType();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TCLASS:
			if (resolve)
				return getCONTEXT__TRG__tClass();
			return basicGetCONTEXT__TRG__tClass();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TPARENT:
			if (resolve)
				return getCONTEXT__TRG__tParent();
			return basicGetCONTEXT__TRG__tParent();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			if (resolve)
				return getCONTEXT__CORR__eAnonymousClassDeclarationToTClass();
			return basicGetCONTEXT__CORR__eAnonymousClassDeclarationToTClass();
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_PARENT_TO_PARENT:
			if (resolve)
				return getCONTEXT__CORR__parentToParent();
			return basicGetCONTEXT__CORR__parentToParent();
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
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MANONYMOUS:
			setCONTEXT__SRC__mAnonymous((MAnonymous) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MCREATION:
			setCREATE__SRC__mCreation((ClassInstanceCreation) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MPARENT:
			setCONTEXT__SRC__mParent((AbstractTypeDeclaration) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MTYPE:
			setCREATE__SRC__mType((TypeAccess) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TCLASS:
			setCONTEXT__TRG__tClass((TClass) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TPARENT:
			setCONTEXT__TRG__tParent((TClass) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			setCONTEXT__CORR__eAnonymousClassDeclarationToTClass((AnonymousClassDeclarationToTClass) newValue);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_PARENT_TO_PARENT:
			setCONTEXT__CORR__parentToParent((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MANONYMOUS:
			setCONTEXT__SRC__mAnonymous((MAnonymous) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MCREATION:
			setCREATE__SRC__mCreation((ClassInstanceCreation) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MPARENT:
			setCONTEXT__SRC__mParent((AbstractTypeDeclaration) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MTYPE:
			setCREATE__SRC__mType((TypeAccess) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TCLASS:
			setCONTEXT__TRG__tClass((TClass) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TPARENT:
			setCONTEXT__TRG__tParent((TClass) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			setCONTEXT__CORR__eAnonymousClassDeclarationToTClass((AnonymousClassDeclarationToTClass) null);
			return;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_PARENT_TO_PARENT:
			setCONTEXT__CORR__parentToParent((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MANONYMOUS:
			return contexT__SRC__mAnonymous != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MCREATION:
			return creatE__SRC__mCreation != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_SRC_MPARENT:
			return contexT__SRC__mParent != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CREATE_SRC_MTYPE:
			return creatE__SRC__mType != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TCLASS:
			return contexT__TRG__tClass != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_TRG_TPARENT:
			return contexT__TRG__tParent != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			return contexT__CORR__eAnonymousClassDeclarationToTClass != null;
		case ModiscoTGGPackage.ANONYMOUS_CLASS_TYPE_CLASS_MARKER__CONTEXT_CORR_PARENT_TO_PARENT:
			return contexT__CORR__parentToParent != null;
		}
		return super.eIsSet(featureID);
	}

} //AnonymousClassTypeClass__MarkerImpl
