/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ClassDeclarationToTClass;
import ModiscoTGG.ClassImplementsInterface__Marker;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Implements Interface Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.ClassImplementsInterface__MarkerImpl#getCONTEXT__SRC__eClassDeclaration <em>CONTEXT SRC eClass Declaration</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassImplementsInterface__MarkerImpl#getCONTEXT__SRC__eSuperInterface <em>CONTEXT SRC eSuper Interface</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassImplementsInterface__MarkerImpl#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassImplementsInterface__MarkerImpl#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassImplementsInterface__MarkerImpl#getCONTEXT__TRG__tSuperInterface <em>CONTEXT TRG tSuper Interface</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassImplementsInterface__MarkerImpl#getCONTEXT__CORR__eClassDeclarationToTClass <em>CONTEXT CORR eClass Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassImplementsInterface__MarkerImpl#getCONTEXT__CORR__eSuperInterfaceToTSuperInterface <em>CONTEXT CORR eSuper Interface To TSuper Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImplementsInterface__MarkerImpl extends TGGRuleApplicationImpl
		implements ClassImplementsInterface__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__eClassDeclaration() <em>CONTEXT SRC eClass Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eClassDeclaration()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclaration contexT__SRC__eClassDeclaration;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__eSuperInterface() <em>CONTEXT SRC eSuper Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eSuperInterface()
	 * @generated
	 * @ordered
	 */
	protected Type contexT__SRC__eSuperInterface;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__eTypeAccess() <em>CREATE SRC eType Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__eTypeAccess()
	 * @generated
	 * @ordered
	 */
	protected TypeAccess creatE__SRC__eTypeAccess;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tSuperInterface() <em>CONTEXT TRG tSuper Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tSuperInterface()
	 * @generated
	 * @ordered
	 */
	protected TInterface contexT__TRG__tSuperInterface;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eClassDeclarationToTClass() <em>CONTEXT CORR eClass Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eClassDeclarationToTClass()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclarationToTClass contexT__CORR__eClassDeclarationToTClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eSuperInterfaceToTSuperInterface() <em>CONTEXT CORR eSuper Interface To TSuper Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eSuperInterfaceToTSuperInterface()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__eSuperInterfaceToTSuperInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImplementsInterface__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getClassImplementsInterface__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclaration getCONTEXT__SRC__eClassDeclaration() {
		if (contexT__SRC__eClassDeclaration != null && contexT__SRC__eClassDeclaration.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eClassDeclaration = (InternalEObject) contexT__SRC__eClassDeclaration;
			contexT__SRC__eClassDeclaration = (ClassDeclaration) eResolveProxy(oldCONTEXT__SRC__eClassDeclaration);
			if (contexT__SRC__eClassDeclaration != oldCONTEXT__SRC__eClassDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ECLASS_DECLARATION,
							oldCONTEXT__SRC__eClassDeclaration, contexT__SRC__eClassDeclaration));
			}
		}
		return contexT__SRC__eClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration basicGetCONTEXT__SRC__eClassDeclaration() {
		return contexT__SRC__eClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eClassDeclaration(ClassDeclaration newCONTEXT__SRC__eClassDeclaration) {
		ClassDeclaration oldCONTEXT__SRC__eClassDeclaration = contexT__SRC__eClassDeclaration;
		contexT__SRC__eClassDeclaration = newCONTEXT__SRC__eClassDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ECLASS_DECLARATION,
					oldCONTEXT__SRC__eClassDeclaration, contexT__SRC__eClassDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getCONTEXT__SRC__eSuperInterface() {
		if (contexT__SRC__eSuperInterface != null && contexT__SRC__eSuperInterface.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eSuperInterface = (InternalEObject) contexT__SRC__eSuperInterface;
			contexT__SRC__eSuperInterface = (Type) eResolveProxy(oldCONTEXT__SRC__eSuperInterface);
			if (contexT__SRC__eSuperInterface != oldCONTEXT__SRC__eSuperInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE,
							oldCONTEXT__SRC__eSuperInterface, contexT__SRC__eSuperInterface));
			}
		}
		return contexT__SRC__eSuperInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetCONTEXT__SRC__eSuperInterface() {
		return contexT__SRC__eSuperInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eSuperInterface(Type newCONTEXT__SRC__eSuperInterface) {
		Type oldCONTEXT__SRC__eSuperInterface = contexT__SRC__eSuperInterface;
		contexT__SRC__eSuperInterface = newCONTEXT__SRC__eSuperInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE,
					oldCONTEXT__SRC__eSuperInterface, contexT__SRC__eSuperInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess getCREATE__SRC__eTypeAccess() {
		if (creatE__SRC__eTypeAccess != null && creatE__SRC__eTypeAccess.eIsProxy()) {
			InternalEObject oldCREATE__SRC__eTypeAccess = (InternalEObject) creatE__SRC__eTypeAccess;
			creatE__SRC__eTypeAccess = (TypeAccess) eResolveProxy(oldCREATE__SRC__eTypeAccess);
			if (creatE__SRC__eTypeAccess != oldCREATE__SRC__eTypeAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS,
							oldCREATE__SRC__eTypeAccess, creatE__SRC__eTypeAccess));
			}
		}
		return creatE__SRC__eTypeAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess basicGetCREATE__SRC__eTypeAccess() {
		return creatE__SRC__eTypeAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__eTypeAccess(TypeAccess newCREATE__SRC__eTypeAccess) {
		TypeAccess oldCREATE__SRC__eTypeAccess = creatE__SRC__eTypeAccess;
		creatE__SRC__eTypeAccess = newCREATE__SRC__eTypeAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS,
					oldCREATE__SRC__eTypeAccess, creatE__SRC__eTypeAccess));
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
							ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TCLASS,
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
					ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TCLASS, oldCONTEXT__TRG__tClass,
					contexT__TRG__tClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInterface getCONTEXT__TRG__tSuperInterface() {
		if (contexT__TRG__tSuperInterface != null && contexT__TRG__tSuperInterface.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tSuperInterface = (InternalEObject) contexT__TRG__tSuperInterface;
			contexT__TRG__tSuperInterface = (TInterface) eResolveProxy(oldCONTEXT__TRG__tSuperInterface);
			if (contexT__TRG__tSuperInterface != oldCONTEXT__TRG__tSuperInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE,
							oldCONTEXT__TRG__tSuperInterface, contexT__TRG__tSuperInterface));
			}
		}
		return contexT__TRG__tSuperInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInterface basicGetCONTEXT__TRG__tSuperInterface() {
		return contexT__TRG__tSuperInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tSuperInterface(TInterface newCONTEXT__TRG__tSuperInterface) {
		TInterface oldCONTEXT__TRG__tSuperInterface = contexT__TRG__tSuperInterface;
		contexT__TRG__tSuperInterface = newCONTEXT__TRG__tSuperInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE,
					oldCONTEXT__TRG__tSuperInterface, contexT__TRG__tSuperInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclarationToTClass getCONTEXT__CORR__eClassDeclarationToTClass() {
		if (contexT__CORR__eClassDeclarationToTClass != null && contexT__CORR__eClassDeclarationToTClass.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eClassDeclarationToTClass = (InternalEObject) contexT__CORR__eClassDeclarationToTClass;
			contexT__CORR__eClassDeclarationToTClass = (ClassDeclarationToTClass) eResolveProxy(
					oldCONTEXT__CORR__eClassDeclarationToTClass);
			if (contexT__CORR__eClassDeclarationToTClass != oldCONTEXT__CORR__eClassDeclarationToTClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS,
							oldCONTEXT__CORR__eClassDeclarationToTClass, contexT__CORR__eClassDeclarationToTClass));
			}
		}
		return contexT__CORR__eClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclarationToTClass basicGetCONTEXT__CORR__eClassDeclarationToTClass() {
		return contexT__CORR__eClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eClassDeclarationToTClass(
			ClassDeclarationToTClass newCONTEXT__CORR__eClassDeclarationToTClass) {
		ClassDeclarationToTClass oldCONTEXT__CORR__eClassDeclarationToTClass = contexT__CORR__eClassDeclarationToTClass;
		contexT__CORR__eClassDeclarationToTClass = newCONTEXT__CORR__eClassDeclarationToTClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS,
					oldCONTEXT__CORR__eClassDeclarationToTClass, contexT__CORR__eClassDeclarationToTClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__eSuperInterfaceToTSuperInterface() {
		if (contexT__CORR__eSuperInterfaceToTSuperInterface != null
				&& contexT__CORR__eSuperInterfaceToTSuperInterface.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eSuperInterfaceToTSuperInterface = (InternalEObject) contexT__CORR__eSuperInterfaceToTSuperInterface;
			contexT__CORR__eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) eResolveProxy(
					oldCONTEXT__CORR__eSuperInterfaceToTSuperInterface);
			if (contexT__CORR__eSuperInterfaceToTSuperInterface != oldCONTEXT__CORR__eSuperInterfaceToTSuperInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE,
							oldCONTEXT__CORR__eSuperInterfaceToTSuperInterface,
							contexT__CORR__eSuperInterfaceToTSuperInterface));
			}
		}
		return contexT__CORR__eSuperInterfaceToTSuperInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__eSuperInterfaceToTSuperInterface() {
		return contexT__CORR__eSuperInterfaceToTSuperInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eSuperInterfaceToTSuperInterface(
			TypeToTAbstractType newCONTEXT__CORR__eSuperInterfaceToTSuperInterface) {
		TypeToTAbstractType oldCONTEXT__CORR__eSuperInterfaceToTSuperInterface = contexT__CORR__eSuperInterfaceToTSuperInterface;
		contexT__CORR__eSuperInterfaceToTSuperInterface = newCONTEXT__CORR__eSuperInterfaceToTSuperInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE,
					oldCONTEXT__CORR__eSuperInterfaceToTSuperInterface,
					contexT__CORR__eSuperInterfaceToTSuperInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ECLASS_DECLARATION:
			if (resolve)
				return getCONTEXT__SRC__eClassDeclaration();
			return basicGetCONTEXT__SRC__eClassDeclaration();
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE:
			if (resolve)
				return getCONTEXT__SRC__eSuperInterface();
			return basicGetCONTEXT__SRC__eSuperInterface();
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS:
			if (resolve)
				return getCREATE__SRC__eTypeAccess();
			return basicGetCREATE__SRC__eTypeAccess();
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TCLASS:
			if (resolve)
				return getCONTEXT__TRG__tClass();
			return basicGetCONTEXT__TRG__tClass();
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE:
			if (resolve)
				return getCONTEXT__TRG__tSuperInterface();
			return basicGetCONTEXT__TRG__tSuperInterface();
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS:
			if (resolve)
				return getCONTEXT__CORR__eClassDeclarationToTClass();
			return basicGetCONTEXT__CORR__eClassDeclarationToTClass();
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE:
			if (resolve)
				return getCONTEXT__CORR__eSuperInterfaceToTSuperInterface();
			return basicGetCONTEXT__CORR__eSuperInterfaceToTSuperInterface();
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
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ECLASS_DECLARATION:
			setCONTEXT__SRC__eClassDeclaration((ClassDeclaration) newValue);
			return;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE:
			setCONTEXT__SRC__eSuperInterface((Type) newValue);
			return;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS:
			setCREATE__SRC__eTypeAccess((TypeAccess) newValue);
			return;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TCLASS:
			setCONTEXT__TRG__tClass((TClass) newValue);
			return;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE:
			setCONTEXT__TRG__tSuperInterface((TInterface) newValue);
			return;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS:
			setCONTEXT__CORR__eClassDeclarationToTClass((ClassDeclarationToTClass) newValue);
			return;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE:
			setCONTEXT__CORR__eSuperInterfaceToTSuperInterface((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ECLASS_DECLARATION:
			setCONTEXT__SRC__eClassDeclaration((ClassDeclaration) null);
			return;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE:
			setCONTEXT__SRC__eSuperInterface((Type) null);
			return;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS:
			setCREATE__SRC__eTypeAccess((TypeAccess) null);
			return;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TCLASS:
			setCONTEXT__TRG__tClass((TClass) null);
			return;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE:
			setCONTEXT__TRG__tSuperInterface((TInterface) null);
			return;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS:
			setCONTEXT__CORR__eClassDeclarationToTClass((ClassDeclarationToTClass) null);
			return;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE:
			setCONTEXT__CORR__eSuperInterfaceToTSuperInterface((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ECLASS_DECLARATION:
			return contexT__SRC__eClassDeclaration != null;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE:
			return contexT__SRC__eSuperInterface != null;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS:
			return creatE__SRC__eTypeAccess != null;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TCLASS:
			return contexT__TRG__tClass != null;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE:
			return contexT__TRG__tSuperInterface != null;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS:
			return contexT__CORR__eClassDeclarationToTClass != null;
		case ModiscoTGGPackage.CLASS_IMPLEMENTS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE:
			return contexT__CORR__eSuperInterfaceToTSuperInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassImplementsInterface__MarkerImpl
