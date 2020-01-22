/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.InterfaceDeclarationToTInterface;
import ModiscoTGG.InterfaceExtendsInterface__Marker;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.typegraph.basic.TInterface;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Extends Interface Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.InterfaceExtendsInterface__MarkerImpl#getCONTEXT__SRC__eInterfaceDeclaration <em>CONTEXT SRC eInterface Declaration</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceExtendsInterface__MarkerImpl#getCONTEXT__SRC__eSuperInterface <em>CONTEXT SRC eSuper Interface</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceExtendsInterface__MarkerImpl#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceExtendsInterface__MarkerImpl#getCONTEXT__TRG__tInterface <em>CONTEXT TRG tInterface</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceExtendsInterface__MarkerImpl#getCONTEXT__TRG__tSuperInterface <em>CONTEXT TRG tSuper Interface</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceExtendsInterface__MarkerImpl#getCONTEXT__CORR__eInterfaceDeclarationToTInterface <em>CONTEXT CORR eInterface Declaration To TInterface</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceExtendsInterface__MarkerImpl#getCONTEXT__CORR__eSuperInterfaceToTSuperInterface <em>CONTEXT CORR eSuper Interface To TSuper Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceExtendsInterface__MarkerImpl extends TGGRuleApplicationImpl
		implements InterfaceExtendsInterface__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__eInterfaceDeclaration() <em>CONTEXT SRC eInterface Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eInterfaceDeclaration()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDeclaration contexT__SRC__eInterfaceDeclaration;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__eSuperInterface() <em>CONTEXT SRC eSuper Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eSuperInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDeclaration contexT__SRC__eSuperInterface;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tInterface() <em>CONTEXT TRG tInterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tInterface()
	 * @generated
	 * @ordered
	 */
	protected TInterface contexT__TRG__tInterface;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__eInterfaceDeclarationToTInterface() <em>CONTEXT CORR eInterface Declaration To TInterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eInterfaceDeclarationToTInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDeclarationToTInterface contexT__CORR__eInterfaceDeclarationToTInterface;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eSuperInterfaceToTSuperInterface() <em>CONTEXT CORR eSuper Interface To TSuper Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eSuperInterfaceToTSuperInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDeclarationToTInterface contexT__CORR__eSuperInterfaceToTSuperInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceExtendsInterface__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getInterfaceExtendsInterface__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDeclaration getCONTEXT__SRC__eInterfaceDeclaration() {
		if (contexT__SRC__eInterfaceDeclaration != null && contexT__SRC__eInterfaceDeclaration.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eInterfaceDeclaration = (InternalEObject) contexT__SRC__eInterfaceDeclaration;
			contexT__SRC__eInterfaceDeclaration = (InterfaceDeclaration) eResolveProxy(
					oldCONTEXT__SRC__eInterfaceDeclaration);
			if (contexT__SRC__eInterfaceDeclaration != oldCONTEXT__SRC__eInterfaceDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_EINTERFACE_DECLARATION,
							oldCONTEXT__SRC__eInterfaceDeclaration, contexT__SRC__eInterfaceDeclaration));
			}
		}
		return contexT__SRC__eInterfaceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDeclaration basicGetCONTEXT__SRC__eInterfaceDeclaration() {
		return contexT__SRC__eInterfaceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eInterfaceDeclaration(InterfaceDeclaration newCONTEXT__SRC__eInterfaceDeclaration) {
		InterfaceDeclaration oldCONTEXT__SRC__eInterfaceDeclaration = contexT__SRC__eInterfaceDeclaration;
		contexT__SRC__eInterfaceDeclaration = newCONTEXT__SRC__eInterfaceDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_EINTERFACE_DECLARATION,
					oldCONTEXT__SRC__eInterfaceDeclaration, contexT__SRC__eInterfaceDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDeclaration getCONTEXT__SRC__eSuperInterface() {
		if (contexT__SRC__eSuperInterface != null && contexT__SRC__eSuperInterface.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eSuperInterface = (InternalEObject) contexT__SRC__eSuperInterface;
			contexT__SRC__eSuperInterface = (InterfaceDeclaration) eResolveProxy(oldCONTEXT__SRC__eSuperInterface);
			if (contexT__SRC__eSuperInterface != oldCONTEXT__SRC__eSuperInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE,
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
	public InterfaceDeclaration basicGetCONTEXT__SRC__eSuperInterface() {
		return contexT__SRC__eSuperInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eSuperInterface(InterfaceDeclaration newCONTEXT__SRC__eSuperInterface) {
		InterfaceDeclaration oldCONTEXT__SRC__eSuperInterface = contexT__SRC__eSuperInterface;
		contexT__SRC__eSuperInterface = newCONTEXT__SRC__eSuperInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE,
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
							ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS,
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
					ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS,
					oldCREATE__SRC__eTypeAccess, creatE__SRC__eTypeAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInterface getCONTEXT__TRG__tInterface() {
		if (contexT__TRG__tInterface != null && contexT__TRG__tInterface.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tInterface = (InternalEObject) contexT__TRG__tInterface;
			contexT__TRG__tInterface = (TInterface) eResolveProxy(oldCONTEXT__TRG__tInterface);
			if (contexT__TRG__tInterface != oldCONTEXT__TRG__tInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TINTERFACE,
							oldCONTEXT__TRG__tInterface, contexT__TRG__tInterface));
			}
		}
		return contexT__TRG__tInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInterface basicGetCONTEXT__TRG__tInterface() {
		return contexT__TRG__tInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tInterface(TInterface newCONTEXT__TRG__tInterface) {
		TInterface oldCONTEXT__TRG__tInterface = contexT__TRG__tInterface;
		contexT__TRG__tInterface = newCONTEXT__TRG__tInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TINTERFACE,
					oldCONTEXT__TRG__tInterface, contexT__TRG__tInterface));
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
							ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE,
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
					ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE,
					oldCONTEXT__TRG__tSuperInterface, contexT__TRG__tSuperInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDeclarationToTInterface getCONTEXT__CORR__eInterfaceDeclarationToTInterface() {
		if (contexT__CORR__eInterfaceDeclarationToTInterface != null
				&& contexT__CORR__eInterfaceDeclarationToTInterface.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eInterfaceDeclarationToTInterface = (InternalEObject) contexT__CORR__eInterfaceDeclarationToTInterface;
			contexT__CORR__eInterfaceDeclarationToTInterface = (InterfaceDeclarationToTInterface) eResolveProxy(
					oldCONTEXT__CORR__eInterfaceDeclarationToTInterface);
			if (contexT__CORR__eInterfaceDeclarationToTInterface != oldCONTEXT__CORR__eInterfaceDeclarationToTInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_EINTERFACE_DECLARATION_TO_TINTERFACE,
							oldCONTEXT__CORR__eInterfaceDeclarationToTInterface,
							contexT__CORR__eInterfaceDeclarationToTInterface));
			}
		}
		return contexT__CORR__eInterfaceDeclarationToTInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDeclarationToTInterface basicGetCONTEXT__CORR__eInterfaceDeclarationToTInterface() {
		return contexT__CORR__eInterfaceDeclarationToTInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eInterfaceDeclarationToTInterface(
			InterfaceDeclarationToTInterface newCONTEXT__CORR__eInterfaceDeclarationToTInterface) {
		InterfaceDeclarationToTInterface oldCONTEXT__CORR__eInterfaceDeclarationToTInterface = contexT__CORR__eInterfaceDeclarationToTInterface;
		contexT__CORR__eInterfaceDeclarationToTInterface = newCONTEXT__CORR__eInterfaceDeclarationToTInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_EINTERFACE_DECLARATION_TO_TINTERFACE,
					oldCONTEXT__CORR__eInterfaceDeclarationToTInterface,
					contexT__CORR__eInterfaceDeclarationToTInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDeclarationToTInterface getCONTEXT__CORR__eSuperInterfaceToTSuperInterface() {
		if (contexT__CORR__eSuperInterfaceToTSuperInterface != null
				&& contexT__CORR__eSuperInterfaceToTSuperInterface.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eSuperInterfaceToTSuperInterface = (InternalEObject) contexT__CORR__eSuperInterfaceToTSuperInterface;
			contexT__CORR__eSuperInterfaceToTSuperInterface = (InterfaceDeclarationToTInterface) eResolveProxy(
					oldCONTEXT__CORR__eSuperInterfaceToTSuperInterface);
			if (contexT__CORR__eSuperInterfaceToTSuperInterface != oldCONTEXT__CORR__eSuperInterfaceToTSuperInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE,
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
	public InterfaceDeclarationToTInterface basicGetCONTEXT__CORR__eSuperInterfaceToTSuperInterface() {
		return contexT__CORR__eSuperInterfaceToTSuperInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eSuperInterfaceToTSuperInterface(
			InterfaceDeclarationToTInterface newCONTEXT__CORR__eSuperInterfaceToTSuperInterface) {
		InterfaceDeclarationToTInterface oldCONTEXT__CORR__eSuperInterfaceToTSuperInterface = contexT__CORR__eSuperInterfaceToTSuperInterface;
		contexT__CORR__eSuperInterfaceToTSuperInterface = newCONTEXT__CORR__eSuperInterfaceToTSuperInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE,
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
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_EINTERFACE_DECLARATION:
			if (resolve)
				return getCONTEXT__SRC__eInterfaceDeclaration();
			return basicGetCONTEXT__SRC__eInterfaceDeclaration();
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE:
			if (resolve)
				return getCONTEXT__SRC__eSuperInterface();
			return basicGetCONTEXT__SRC__eSuperInterface();
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS:
			if (resolve)
				return getCREATE__SRC__eTypeAccess();
			return basicGetCREATE__SRC__eTypeAccess();
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TINTERFACE:
			if (resolve)
				return getCONTEXT__TRG__tInterface();
			return basicGetCONTEXT__TRG__tInterface();
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE:
			if (resolve)
				return getCONTEXT__TRG__tSuperInterface();
			return basicGetCONTEXT__TRG__tSuperInterface();
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_EINTERFACE_DECLARATION_TO_TINTERFACE:
			if (resolve)
				return getCONTEXT__CORR__eInterfaceDeclarationToTInterface();
			return basicGetCONTEXT__CORR__eInterfaceDeclarationToTInterface();
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE:
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
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_EINTERFACE_DECLARATION:
			setCONTEXT__SRC__eInterfaceDeclaration((InterfaceDeclaration) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE:
			setCONTEXT__SRC__eSuperInterface((InterfaceDeclaration) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS:
			setCREATE__SRC__eTypeAccess((TypeAccess) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TINTERFACE:
			setCONTEXT__TRG__tInterface((TInterface) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE:
			setCONTEXT__TRG__tSuperInterface((TInterface) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_EINTERFACE_DECLARATION_TO_TINTERFACE:
			setCONTEXT__CORR__eInterfaceDeclarationToTInterface((InterfaceDeclarationToTInterface) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE:
			setCONTEXT__CORR__eSuperInterfaceToTSuperInterface((InterfaceDeclarationToTInterface) newValue);
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
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_EINTERFACE_DECLARATION:
			setCONTEXT__SRC__eInterfaceDeclaration((InterfaceDeclaration) null);
			return;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE:
			setCONTEXT__SRC__eSuperInterface((InterfaceDeclaration) null);
			return;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS:
			setCREATE__SRC__eTypeAccess((TypeAccess) null);
			return;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TINTERFACE:
			setCONTEXT__TRG__tInterface((TInterface) null);
			return;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE:
			setCONTEXT__TRG__tSuperInterface((TInterface) null);
			return;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_EINTERFACE_DECLARATION_TO_TINTERFACE:
			setCONTEXT__CORR__eInterfaceDeclarationToTInterface((InterfaceDeclarationToTInterface) null);
			return;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE:
			setCONTEXT__CORR__eSuperInterfaceToTSuperInterface((InterfaceDeclarationToTInterface) null);
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
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_EINTERFACE_DECLARATION:
			return contexT__SRC__eInterfaceDeclaration != null;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_SRC_ESUPER_INTERFACE:
			return contexT__SRC__eSuperInterface != null;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CREATE_SRC_ETYPE_ACCESS:
			return creatE__SRC__eTypeAccess != null;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TINTERFACE:
			return contexT__TRG__tInterface != null;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_TRG_TSUPER_INTERFACE:
			return contexT__TRG__tSuperInterface != null;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_EINTERFACE_DECLARATION_TO_TINTERFACE:
			return contexT__CORR__eInterfaceDeclarationToTInterface != null;
		case ModiscoTGGPackage.INTERFACE_EXTENDS_INTERFACE_MARKER__CONTEXT_CORR_ESUPER_INTERFACE_TO_TSUPER_INTERFACE:
			return contexT__CORR__eSuperInterfaceToTSuperInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceExtendsInterface__MarkerImpl
