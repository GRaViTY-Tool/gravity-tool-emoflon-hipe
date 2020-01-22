/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ASTNodeToTAnnotatable;
import ModiscoTGG.AnonymousClassDeclarationToTClass;
import ModiscoTGG.InterfaceDeclarationToTInterface;
import ModiscoTGG.InterfaceInAnonymous__Marker;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.InterfaceDeclaration;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface In Anonymous Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.InterfaceInAnonymous__MarkerImpl#getCONTEXT__SRC__eAnonymousClassDeclaration <em>CONTEXT SRC eAnonymous Class Declaration</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceInAnonymous__MarkerImpl#getCREATE__SRC__mNestedType <em>CREATE SRC mNested Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceInAnonymous__MarkerImpl#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceInAnonymous__MarkerImpl#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceInAnonymous__MarkerImpl#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceInAnonymous__MarkerImpl#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceInAnonymous__MarkerImpl#getCREATE__CORR__mInterfaceDeclarationtoTInterface <em>CREATE CORR mInterface Declarationto TInterface</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceInAnonymous__MarkerImpl#getCREATE__CORR__mNestedTypeToTNestedType <em>CREATE CORR mNested Type To TNested Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.InterfaceInAnonymous__MarkerImpl#getCREATE__CORR__mbodyToTAnnotatable <em>CREATE CORR mbody To TAnnotatable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceInAnonymous__MarkerImpl extends TGGRuleApplicationImpl implements InterfaceInAnonymous__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__eAnonymousClassDeclaration() <em>CONTEXT SRC eAnonymous Class Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eAnonymousClassDeclaration()
	 * @generated
	 * @ordered
	 */
	protected AnonymousClassDeclaration contexT__SRC__eAnonymousClassDeclaration;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mNestedType() <em>CREATE SRC mNested Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mNestedType()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDeclaration creatE__SRC__mNestedType;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tClass() <em>CONTEXT TRG tClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tClass()
	 * @generated
	 * @ordered
	 */
	protected TClass contexT__TRG__tClass;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tNestedType() <em>CREATE TRG tNested Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tNestedType()
	 * @generated
	 * @ordered
	 */
	protected TInterface creatE__TRG__tNestedType;

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
	 * The cached value of the '{@link #getCREATE__CORR__mInterfaceDeclarationtoTInterface() <em>CREATE CORR mInterface Declarationto TInterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mInterfaceDeclarationtoTInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDeclarationToTInterface creatE__CORR__mInterfaceDeclarationtoTInterface;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mNestedTypeToTNestedType() <em>CREATE CORR mNested Type To TNested Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mNestedTypeToTNestedType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType creatE__CORR__mNestedTypeToTNestedType;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mbodyToTAnnotatable() <em>CREATE CORR mbody To TAnnotatable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mbodyToTAnnotatable()
	 * @generated
	 * @ordered
	 */
	protected ASTNodeToTAnnotatable creatE__CORR__mbodyToTAnnotatable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceInAnonymous__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getInterfaceInAnonymous__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclaration getCONTEXT__SRC__eAnonymousClassDeclaration() {
		if (contexT__SRC__eAnonymousClassDeclaration != null && contexT__SRC__eAnonymousClassDeclaration.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eAnonymousClassDeclaration = (InternalEObject) contexT__SRC__eAnonymousClassDeclaration;
			contexT__SRC__eAnonymousClassDeclaration = (AnonymousClassDeclaration) eResolveProxy(
					oldCONTEXT__SRC__eAnonymousClassDeclaration);
			if (contexT__SRC__eAnonymousClassDeclaration != oldCONTEXT__SRC__eAnonymousClassDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_SRC_EANONYMOUS_CLASS_DECLARATION,
							oldCONTEXT__SRC__eAnonymousClassDeclaration, contexT__SRC__eAnonymousClassDeclaration));
			}
		}
		return contexT__SRC__eAnonymousClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclaration basicGetCONTEXT__SRC__eAnonymousClassDeclaration() {
		return contexT__SRC__eAnonymousClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eAnonymousClassDeclaration(
			AnonymousClassDeclaration newCONTEXT__SRC__eAnonymousClassDeclaration) {
		AnonymousClassDeclaration oldCONTEXT__SRC__eAnonymousClassDeclaration = contexT__SRC__eAnonymousClassDeclaration;
		contexT__SRC__eAnonymousClassDeclaration = newCONTEXT__SRC__eAnonymousClassDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_SRC_EANONYMOUS_CLASS_DECLARATION,
					oldCONTEXT__SRC__eAnonymousClassDeclaration, contexT__SRC__eAnonymousClassDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDeclaration getCREATE__SRC__mNestedType() {
		if (creatE__SRC__mNestedType != null && creatE__SRC__mNestedType.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mNestedType = (InternalEObject) creatE__SRC__mNestedType;
			creatE__SRC__mNestedType = (InterfaceDeclaration) eResolveProxy(oldCREATE__SRC__mNestedType);
			if (creatE__SRC__mNestedType != oldCREATE__SRC__mNestedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_SRC_MNESTED_TYPE,
							oldCREATE__SRC__mNestedType, creatE__SRC__mNestedType));
			}
		}
		return creatE__SRC__mNestedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDeclaration basicGetCREATE__SRC__mNestedType() {
		return creatE__SRC__mNestedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mNestedType(InterfaceDeclaration newCREATE__SRC__mNestedType) {
		InterfaceDeclaration oldCREATE__SRC__mNestedType = creatE__SRC__mNestedType;
		creatE__SRC__mNestedType = newCREATE__SRC__mNestedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_SRC_MNESTED_TYPE,
					oldCREATE__SRC__mNestedType, creatE__SRC__mNestedType));
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
							ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_PG, oldCONTEXT__TRG__pg,
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
					ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_PG, oldCONTEXT__TRG__pg,
					contexT__TRG__pg));
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
							ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_TCLASS,
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
					ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_TCLASS, oldCONTEXT__TRG__tClass,
					contexT__TRG__tClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInterface getCREATE__TRG__tNestedType() {
		if (creatE__TRG__tNestedType != null && creatE__TRG__tNestedType.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tNestedType = (InternalEObject) creatE__TRG__tNestedType;
			creatE__TRG__tNestedType = (TInterface) eResolveProxy(oldCREATE__TRG__tNestedType);
			if (creatE__TRG__tNestedType != oldCREATE__TRG__tNestedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_TRG_TNESTED_TYPE,
							oldCREATE__TRG__tNestedType, creatE__TRG__tNestedType));
			}
		}
		return creatE__TRG__tNestedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInterface basicGetCREATE__TRG__tNestedType() {
		return creatE__TRG__tNestedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tNestedType(TInterface newCREATE__TRG__tNestedType) {
		TInterface oldCREATE__TRG__tNestedType = creatE__TRG__tNestedType;
		creatE__TRG__tNestedType = newCREATE__TRG__tNestedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_TRG_TNESTED_TYPE,
					oldCREATE__TRG__tNestedType, creatE__TRG__tNestedType));
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
							ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS,
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
					ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS,
					oldCONTEXT__CORR__eAnonymousClassDeclarationToTClass,
					contexT__CORR__eAnonymousClassDeclarationToTClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDeclarationToTInterface getCREATE__CORR__mInterfaceDeclarationtoTInterface() {
		if (creatE__CORR__mInterfaceDeclarationtoTInterface != null
				&& creatE__CORR__mInterfaceDeclarationtoTInterface.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mInterfaceDeclarationtoTInterface = (InternalEObject) creatE__CORR__mInterfaceDeclarationtoTInterface;
			creatE__CORR__mInterfaceDeclarationtoTInterface = (InterfaceDeclarationToTInterface) eResolveProxy(
					oldCREATE__CORR__mInterfaceDeclarationtoTInterface);
			if (creatE__CORR__mInterfaceDeclarationtoTInterface != oldCREATE__CORR__mInterfaceDeclarationtoTInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE,
							oldCREATE__CORR__mInterfaceDeclarationtoTInterface,
							creatE__CORR__mInterfaceDeclarationtoTInterface));
			}
		}
		return creatE__CORR__mInterfaceDeclarationtoTInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDeclarationToTInterface basicGetCREATE__CORR__mInterfaceDeclarationtoTInterface() {
		return creatE__CORR__mInterfaceDeclarationtoTInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mInterfaceDeclarationtoTInterface(
			InterfaceDeclarationToTInterface newCREATE__CORR__mInterfaceDeclarationtoTInterface) {
		InterfaceDeclarationToTInterface oldCREATE__CORR__mInterfaceDeclarationtoTInterface = creatE__CORR__mInterfaceDeclarationtoTInterface;
		creatE__CORR__mInterfaceDeclarationtoTInterface = newCREATE__CORR__mInterfaceDeclarationtoTInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE,
					oldCREATE__CORR__mInterfaceDeclarationtoTInterface,
					creatE__CORR__mInterfaceDeclarationtoTInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCREATE__CORR__mNestedTypeToTNestedType() {
		if (creatE__CORR__mNestedTypeToTNestedType != null && creatE__CORR__mNestedTypeToTNestedType.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mNestedTypeToTNestedType = (InternalEObject) creatE__CORR__mNestedTypeToTNestedType;
			creatE__CORR__mNestedTypeToTNestedType = (TypeToTAbstractType) eResolveProxy(
					oldCREATE__CORR__mNestedTypeToTNestedType);
			if (creatE__CORR__mNestedTypeToTNestedType != oldCREATE__CORR__mNestedTypeToTNestedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MNESTED_TYPE_TO_TNESTED_TYPE,
							oldCREATE__CORR__mNestedTypeToTNestedType, creatE__CORR__mNestedTypeToTNestedType));
			}
		}
		return creatE__CORR__mNestedTypeToTNestedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCREATE__CORR__mNestedTypeToTNestedType() {
		return creatE__CORR__mNestedTypeToTNestedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mNestedTypeToTNestedType(
			TypeToTAbstractType newCREATE__CORR__mNestedTypeToTNestedType) {
		TypeToTAbstractType oldCREATE__CORR__mNestedTypeToTNestedType = creatE__CORR__mNestedTypeToTNestedType;
		creatE__CORR__mNestedTypeToTNestedType = newCREATE__CORR__mNestedTypeToTNestedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MNESTED_TYPE_TO_TNESTED_TYPE,
					oldCREATE__CORR__mNestedTypeToTNestedType, creatE__CORR__mNestedTypeToTNestedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASTNodeToTAnnotatable getCREATE__CORR__mbodyToTAnnotatable() {
		if (creatE__CORR__mbodyToTAnnotatable != null && creatE__CORR__mbodyToTAnnotatable.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mbodyToTAnnotatable = (InternalEObject) creatE__CORR__mbodyToTAnnotatable;
			creatE__CORR__mbodyToTAnnotatable = (ASTNodeToTAnnotatable) eResolveProxy(
					oldCREATE__CORR__mbodyToTAnnotatable);
			if (creatE__CORR__mbodyToTAnnotatable != oldCREATE__CORR__mbodyToTAnnotatable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATABLE,
							oldCREATE__CORR__mbodyToTAnnotatable, creatE__CORR__mbodyToTAnnotatable));
			}
		}
		return creatE__CORR__mbodyToTAnnotatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTNodeToTAnnotatable basicGetCREATE__CORR__mbodyToTAnnotatable() {
		return creatE__CORR__mbodyToTAnnotatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mbodyToTAnnotatable(ASTNodeToTAnnotatable newCREATE__CORR__mbodyToTAnnotatable) {
		ASTNodeToTAnnotatable oldCREATE__CORR__mbodyToTAnnotatable = creatE__CORR__mbodyToTAnnotatable;
		creatE__CORR__mbodyToTAnnotatable = newCREATE__CORR__mbodyToTAnnotatable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATABLE,
					oldCREATE__CORR__mbodyToTAnnotatable, creatE__CORR__mbodyToTAnnotatable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_SRC_EANONYMOUS_CLASS_DECLARATION:
			if (resolve)
				return getCONTEXT__SRC__eAnonymousClassDeclaration();
			return basicGetCONTEXT__SRC__eAnonymousClassDeclaration();
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_SRC_MNESTED_TYPE:
			if (resolve)
				return getCREATE__SRC__mNestedType();
			return basicGetCREATE__SRC__mNestedType();
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_PG:
			if (resolve)
				return getCONTEXT__TRG__pg();
			return basicGetCONTEXT__TRG__pg();
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_TCLASS:
			if (resolve)
				return getCONTEXT__TRG__tClass();
			return basicGetCONTEXT__TRG__tClass();
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_TRG_TNESTED_TYPE:
			if (resolve)
				return getCREATE__TRG__tNestedType();
			return basicGetCREATE__TRG__tNestedType();
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			if (resolve)
				return getCONTEXT__CORR__eAnonymousClassDeclarationToTClass();
			return basicGetCONTEXT__CORR__eAnonymousClassDeclarationToTClass();
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE:
			if (resolve)
				return getCREATE__CORR__mInterfaceDeclarationtoTInterface();
			return basicGetCREATE__CORR__mInterfaceDeclarationtoTInterface();
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MNESTED_TYPE_TO_TNESTED_TYPE:
			if (resolve)
				return getCREATE__CORR__mNestedTypeToTNestedType();
			return basicGetCREATE__CORR__mNestedTypeToTNestedType();
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATABLE:
			if (resolve)
				return getCREATE__CORR__mbodyToTAnnotatable();
			return basicGetCREATE__CORR__mbodyToTAnnotatable();
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
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_SRC_EANONYMOUS_CLASS_DECLARATION:
			setCONTEXT__SRC__eAnonymousClassDeclaration((AnonymousClassDeclaration) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_SRC_MNESTED_TYPE:
			setCREATE__SRC__mNestedType((InterfaceDeclaration) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_TCLASS:
			setCONTEXT__TRG__tClass((TClass) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_TRG_TNESTED_TYPE:
			setCREATE__TRG__tNestedType((TInterface) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			setCONTEXT__CORR__eAnonymousClassDeclarationToTClass((AnonymousClassDeclarationToTClass) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE:
			setCREATE__CORR__mInterfaceDeclarationtoTInterface((InterfaceDeclarationToTInterface) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MNESTED_TYPE_TO_TNESTED_TYPE:
			setCREATE__CORR__mNestedTypeToTNestedType((TypeToTAbstractType) newValue);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATABLE:
			setCREATE__CORR__mbodyToTAnnotatable((ASTNodeToTAnnotatable) newValue);
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
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_SRC_EANONYMOUS_CLASS_DECLARATION:
			setCONTEXT__SRC__eAnonymousClassDeclaration((AnonymousClassDeclaration) null);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_SRC_MNESTED_TYPE:
			setCREATE__SRC__mNestedType((InterfaceDeclaration) null);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) null);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_TCLASS:
			setCONTEXT__TRG__tClass((TClass) null);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_TRG_TNESTED_TYPE:
			setCREATE__TRG__tNestedType((TInterface) null);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			setCONTEXT__CORR__eAnonymousClassDeclarationToTClass((AnonymousClassDeclarationToTClass) null);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE:
			setCREATE__CORR__mInterfaceDeclarationtoTInterface((InterfaceDeclarationToTInterface) null);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MNESTED_TYPE_TO_TNESTED_TYPE:
			setCREATE__CORR__mNestedTypeToTNestedType((TypeToTAbstractType) null);
			return;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATABLE:
			setCREATE__CORR__mbodyToTAnnotatable((ASTNodeToTAnnotatable) null);
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
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_SRC_EANONYMOUS_CLASS_DECLARATION:
			return contexT__SRC__eAnonymousClassDeclaration != null;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_SRC_MNESTED_TYPE:
			return creatE__SRC__mNestedType != null;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_PG:
			return contexT__TRG__pg != null;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_TRG_TCLASS:
			return contexT__TRG__tClass != null;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_TRG_TNESTED_TYPE:
			return creatE__TRG__tNestedType != null;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CONTEXT_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			return contexT__CORR__eAnonymousClassDeclarationToTClass != null;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE:
			return creatE__CORR__mInterfaceDeclarationtoTInterface != null;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MNESTED_TYPE_TO_TNESTED_TYPE:
			return creatE__CORR__mNestedTypeToTNestedType != null;
		case ModiscoTGGPackage.INTERFACE_IN_ANONYMOUS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATABLE:
			return creatE__CORR__mbodyToTAnnotatable != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceInAnonymous__MarkerImpl
