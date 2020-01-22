/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ASTNodeToTAnnotatable;
import ModiscoTGG.InterfaceDeclarationToTInterface;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.NestedInterfaceInType__Marker;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.InterfaceDeclaration;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Interface In Type Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl#getCREATE__SRC__eNestedType <em>CREATE SRC eNested Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl#getCONTEXT__SRC__eOuterType <em>CONTEXT SRC eOuter Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl#getCREATE__TRG__tNestedPackage <em>CREATE TRG tNested Package</em>}</li>
 *   <li>{@link ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl#getCONTEXT__TRG__tOuterPackage <em>CONTEXT TRG tOuter Package</em>}</li>
 *   <li>{@link ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl#getCONTEXT__TRG__tOuterType <em>CONTEXT TRG tOuter Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl#getCREATE__CORR__eNestedTypeToTNestedType <em>CREATE CORR eNested Type To TNested Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl#getCONTEXT__CORR__eOuterTypeToTOuterInterface <em>CONTEXT CORR eOuter Type To TOuter Interface</em>}</li>
 *   <li>{@link ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.NestedInterfaceInType__MarkerImpl#getCREATE__CORR__mInterfaceDeclarationtoTInterface <em>CREATE CORR mInterface Declarationto TInterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedInterfaceInType__MarkerImpl extends TGGRuleApplicationImpl implements NestedInterfaceInType__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__eNestedType() <em>CREATE SRC eNested Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__eNestedType()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDeclaration creatE__SRC__eNestedType;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__eOuterType() <em>CONTEXT SRC eOuter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eOuterType()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeDeclaration contexT__SRC__eOuterType;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tNestedPackage() <em>CREATE TRG tNested Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tNestedPackage()
	 * @generated
	 * @ordered
	 */
	protected TPackage creatE__TRG__tNestedPackage;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tOuterPackage() <em>CONTEXT TRG tOuter Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tOuterPackage()
	 * @generated
	 * @ordered
	 */
	protected TPackage contexT__TRG__tOuterPackage;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tOuterType() <em>CONTEXT TRG tOuter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tOuterType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType contexT__TRG__tOuterType;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__typeGraph() <em>CONTEXT TRG type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__typeGraph()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph contexT__TRG__typeGraph;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__eNestedTypeToTNestedType() <em>CREATE CORR eNested Type To TNested Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__eNestedTypeToTNestedType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType creatE__CORR__eNestedTypeToTNestedType;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eOuterTypeToTOuterInterface() <em>CONTEXT CORR eOuter Type To TOuter Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eOuterTypeToTOuterInterface()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__eOuterTypeToTOuterInterface;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mBodyToTAnnotation() <em>CREATE CORR mBody To TAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mBodyToTAnnotation()
	 * @generated
	 * @ordered
	 */
	protected ASTNodeToTAnnotatable creatE__CORR__mBodyToTAnnotation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedInterfaceInType__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getNestedInterfaceInType__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDeclaration getCREATE__SRC__eNestedType() {
		if (creatE__SRC__eNestedType != null && creatE__SRC__eNestedType.eIsProxy()) {
			InternalEObject oldCREATE__SRC__eNestedType = (InternalEObject) creatE__SRC__eNestedType;
			creatE__SRC__eNestedType = (InterfaceDeclaration) eResolveProxy(oldCREATE__SRC__eNestedType);
			if (creatE__SRC__eNestedType != oldCREATE__SRC__eNestedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_SRC_ENESTED_TYPE,
							oldCREATE__SRC__eNestedType, creatE__SRC__eNestedType));
			}
		}
		return creatE__SRC__eNestedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDeclaration basicGetCREATE__SRC__eNestedType() {
		return creatE__SRC__eNestedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__eNestedType(InterfaceDeclaration newCREATE__SRC__eNestedType) {
		InterfaceDeclaration oldCREATE__SRC__eNestedType = creatE__SRC__eNestedType;
		creatE__SRC__eNestedType = newCREATE__SRC__eNestedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_SRC_ENESTED_TYPE,
					oldCREATE__SRC__eNestedType, creatE__SRC__eNestedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeDeclaration getCONTEXT__SRC__eOuterType() {
		if (contexT__SRC__eOuterType != null && contexT__SRC__eOuterType.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eOuterType = (InternalEObject) contexT__SRC__eOuterType;
			contexT__SRC__eOuterType = (AbstractTypeDeclaration) eResolveProxy(oldCONTEXT__SRC__eOuterType);
			if (contexT__SRC__eOuterType != oldCONTEXT__SRC__eOuterType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_SRC_EOUTER_TYPE,
							oldCONTEXT__SRC__eOuterType, contexT__SRC__eOuterType));
			}
		}
		return contexT__SRC__eOuterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration basicGetCONTEXT__SRC__eOuterType() {
		return contexT__SRC__eOuterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eOuterType(AbstractTypeDeclaration newCONTEXT__SRC__eOuterType) {
		AbstractTypeDeclaration oldCONTEXT__SRC__eOuterType = contexT__SRC__eOuterType;
		contexT__SRC__eOuterType = newCONTEXT__SRC__eOuterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_SRC_EOUTER_TYPE,
					oldCONTEXT__SRC__eOuterType, contexT__SRC__eOuterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getCREATE__TRG__tNestedPackage() {
		if (creatE__TRG__tNestedPackage != null && creatE__TRG__tNestedPackage.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tNestedPackage = (InternalEObject) creatE__TRG__tNestedPackage;
			creatE__TRG__tNestedPackage = (TPackage) eResolveProxy(oldCREATE__TRG__tNestedPackage);
			if (creatE__TRG__tNestedPackage != oldCREATE__TRG__tNestedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_PACKAGE,
							oldCREATE__TRG__tNestedPackage, creatE__TRG__tNestedPackage));
			}
		}
		return creatE__TRG__tNestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage basicGetCREATE__TRG__tNestedPackage() {
		return creatE__TRG__tNestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tNestedPackage(TPackage newCREATE__TRG__tNestedPackage) {
		TPackage oldCREATE__TRG__tNestedPackage = creatE__TRG__tNestedPackage;
		creatE__TRG__tNestedPackage = newCREATE__TRG__tNestedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_PACKAGE,
					oldCREATE__TRG__tNestedPackage, creatE__TRG__tNestedPackage));
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
							ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_TYPE,
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
					ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_TYPE,
					oldCREATE__TRG__tNestedType, creatE__TRG__tNestedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getCONTEXT__TRG__tOuterPackage() {
		if (contexT__TRG__tOuterPackage != null && contexT__TRG__tOuterPackage.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tOuterPackage = (InternalEObject) contexT__TRG__tOuterPackage;
			contexT__TRG__tOuterPackage = (TPackage) eResolveProxy(oldCONTEXT__TRG__tOuterPackage);
			if (contexT__TRG__tOuterPackage != oldCONTEXT__TRG__tOuterPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_PACKAGE,
							oldCONTEXT__TRG__tOuterPackage, contexT__TRG__tOuterPackage));
			}
		}
		return contexT__TRG__tOuterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage basicGetCONTEXT__TRG__tOuterPackage() {
		return contexT__TRG__tOuterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tOuterPackage(TPackage newCONTEXT__TRG__tOuterPackage) {
		TPackage oldCONTEXT__TRG__tOuterPackage = contexT__TRG__tOuterPackage;
		contexT__TRG__tOuterPackage = newCONTEXT__TRG__tOuterPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_PACKAGE,
					oldCONTEXT__TRG__tOuterPackage, contexT__TRG__tOuterPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getCONTEXT__TRG__tOuterType() {
		if (contexT__TRG__tOuterType != null && contexT__TRG__tOuterType.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tOuterType = (InternalEObject) contexT__TRG__tOuterType;
			contexT__TRG__tOuterType = (TAbstractType) eResolveProxy(oldCONTEXT__TRG__tOuterType);
			if (contexT__TRG__tOuterType != oldCONTEXT__TRG__tOuterType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_TYPE,
							oldCONTEXT__TRG__tOuterType, contexT__TRG__tOuterType));
			}
		}
		return contexT__TRG__tOuterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetCONTEXT__TRG__tOuterType() {
		return contexT__TRG__tOuterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tOuterType(TAbstractType newCONTEXT__TRG__tOuterType) {
		TAbstractType oldCONTEXT__TRG__tOuterType = contexT__TRG__tOuterType;
		contexT__TRG__tOuterType = newCONTEXT__TRG__tOuterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_TYPE,
					oldCONTEXT__TRG__tOuterType, contexT__TRG__tOuterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getCONTEXT__TRG__typeGraph() {
		if (contexT__TRG__typeGraph != null && contexT__TRG__typeGraph.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__typeGraph = (InternalEObject) contexT__TRG__typeGraph;
			contexT__TRG__typeGraph = (TypeGraph) eResolveProxy(oldCONTEXT__TRG__typeGraph);
			if (contexT__TRG__typeGraph != oldCONTEXT__TRG__typeGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TYPE_GRAPH,
							oldCONTEXT__TRG__typeGraph, contexT__TRG__typeGraph));
			}
		}
		return contexT__TRG__typeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph basicGetCONTEXT__TRG__typeGraph() {
		return contexT__TRG__typeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__typeGraph(TypeGraph newCONTEXT__TRG__typeGraph) {
		TypeGraph oldCONTEXT__TRG__typeGraph = contexT__TRG__typeGraph;
		contexT__TRG__typeGraph = newCONTEXT__TRG__typeGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TYPE_GRAPH,
					oldCONTEXT__TRG__typeGraph, contexT__TRG__typeGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCREATE__CORR__eNestedTypeToTNestedType() {
		if (creatE__CORR__eNestedTypeToTNestedType != null && creatE__CORR__eNestedTypeToTNestedType.eIsProxy()) {
			InternalEObject oldCREATE__CORR__eNestedTypeToTNestedType = (InternalEObject) creatE__CORR__eNestedTypeToTNestedType;
			creatE__CORR__eNestedTypeToTNestedType = (TypeToTAbstractType) eResolveProxy(
					oldCREATE__CORR__eNestedTypeToTNestedType);
			if (creatE__CORR__eNestedTypeToTNestedType != oldCREATE__CORR__eNestedTypeToTNestedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_ENESTED_TYPE_TO_TNESTED_TYPE,
							oldCREATE__CORR__eNestedTypeToTNestedType, creatE__CORR__eNestedTypeToTNestedType));
			}
		}
		return creatE__CORR__eNestedTypeToTNestedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCREATE__CORR__eNestedTypeToTNestedType() {
		return creatE__CORR__eNestedTypeToTNestedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__eNestedTypeToTNestedType(
			TypeToTAbstractType newCREATE__CORR__eNestedTypeToTNestedType) {
		TypeToTAbstractType oldCREATE__CORR__eNestedTypeToTNestedType = creatE__CORR__eNestedTypeToTNestedType;
		creatE__CORR__eNestedTypeToTNestedType = newCREATE__CORR__eNestedTypeToTNestedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_ENESTED_TYPE_TO_TNESTED_TYPE,
					oldCREATE__CORR__eNestedTypeToTNestedType, creatE__CORR__eNestedTypeToTNestedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__eOuterTypeToTOuterInterface() {
		if (contexT__CORR__eOuterTypeToTOuterInterface != null
				&& contexT__CORR__eOuterTypeToTOuterInterface.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eOuterTypeToTOuterInterface = (InternalEObject) contexT__CORR__eOuterTypeToTOuterInterface;
			contexT__CORR__eOuterTypeToTOuterInterface = (TypeToTAbstractType) eResolveProxy(
					oldCONTEXT__CORR__eOuterTypeToTOuterInterface);
			if (contexT__CORR__eOuterTypeToTOuterInterface != oldCONTEXT__CORR__eOuterTypeToTOuterInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_CORR_EOUTER_TYPE_TO_TOUTER_INTERFACE,
							oldCONTEXT__CORR__eOuterTypeToTOuterInterface, contexT__CORR__eOuterTypeToTOuterInterface));
			}
		}
		return contexT__CORR__eOuterTypeToTOuterInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__eOuterTypeToTOuterInterface() {
		return contexT__CORR__eOuterTypeToTOuterInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eOuterTypeToTOuterInterface(
			TypeToTAbstractType newCONTEXT__CORR__eOuterTypeToTOuterInterface) {
		TypeToTAbstractType oldCONTEXT__CORR__eOuterTypeToTOuterInterface = contexT__CORR__eOuterTypeToTOuterInterface;
		contexT__CORR__eOuterTypeToTOuterInterface = newCONTEXT__CORR__eOuterTypeToTOuterInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_CORR_EOUTER_TYPE_TO_TOUTER_INTERFACE,
					oldCONTEXT__CORR__eOuterTypeToTOuterInterface, contexT__CORR__eOuterTypeToTOuterInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASTNodeToTAnnotatable getCREATE__CORR__mBodyToTAnnotation() {
		if (creatE__CORR__mBodyToTAnnotation != null && creatE__CORR__mBodyToTAnnotation.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mBodyToTAnnotation = (InternalEObject) creatE__CORR__mBodyToTAnnotation;
			creatE__CORR__mBodyToTAnnotation = (ASTNodeToTAnnotatable) eResolveProxy(
					oldCREATE__CORR__mBodyToTAnnotation);
			if (creatE__CORR__mBodyToTAnnotation != oldCREATE__CORR__mBodyToTAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION,
							oldCREATE__CORR__mBodyToTAnnotation, creatE__CORR__mBodyToTAnnotation));
			}
		}
		return creatE__CORR__mBodyToTAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTNodeToTAnnotatable basicGetCREATE__CORR__mBodyToTAnnotation() {
		return creatE__CORR__mBodyToTAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mBodyToTAnnotation(ASTNodeToTAnnotatable newCREATE__CORR__mBodyToTAnnotation) {
		ASTNodeToTAnnotatable oldCREATE__CORR__mBodyToTAnnotation = creatE__CORR__mBodyToTAnnotation;
		creatE__CORR__mBodyToTAnnotation = newCREATE__CORR__mBodyToTAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION,
					oldCREATE__CORR__mBodyToTAnnotation, creatE__CORR__mBodyToTAnnotation));
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
							ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE,
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
					ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE,
					oldCREATE__CORR__mInterfaceDeclarationtoTInterface,
					creatE__CORR__mInterfaceDeclarationtoTInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_SRC_ENESTED_TYPE:
			if (resolve)
				return getCREATE__SRC__eNestedType();
			return basicGetCREATE__SRC__eNestedType();
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_SRC_EOUTER_TYPE:
			if (resolve)
				return getCONTEXT__SRC__eOuterType();
			return basicGetCONTEXT__SRC__eOuterType();
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_PACKAGE:
			if (resolve)
				return getCREATE__TRG__tNestedPackage();
			return basicGetCREATE__TRG__tNestedPackage();
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_TYPE:
			if (resolve)
				return getCREATE__TRG__tNestedType();
			return basicGetCREATE__TRG__tNestedType();
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_PACKAGE:
			if (resolve)
				return getCONTEXT__TRG__tOuterPackage();
			return basicGetCONTEXT__TRG__tOuterPackage();
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_TYPE:
			if (resolve)
				return getCONTEXT__TRG__tOuterType();
			return basicGetCONTEXT__TRG__tOuterType();
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			if (resolve)
				return getCONTEXT__TRG__typeGraph();
			return basicGetCONTEXT__TRG__typeGraph();
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_ENESTED_TYPE_TO_TNESTED_TYPE:
			if (resolve)
				return getCREATE__CORR__eNestedTypeToTNestedType();
			return basicGetCREATE__CORR__eNestedTypeToTNestedType();
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_CORR_EOUTER_TYPE_TO_TOUTER_INTERFACE:
			if (resolve)
				return getCONTEXT__CORR__eOuterTypeToTOuterInterface();
			return basicGetCONTEXT__CORR__eOuterTypeToTOuterInterface();
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			if (resolve)
				return getCREATE__CORR__mBodyToTAnnotation();
			return basicGetCREATE__CORR__mBodyToTAnnotation();
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE:
			if (resolve)
				return getCREATE__CORR__mInterfaceDeclarationtoTInterface();
			return basicGetCREATE__CORR__mInterfaceDeclarationtoTInterface();
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
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_SRC_ENESTED_TYPE:
			setCREATE__SRC__eNestedType((InterfaceDeclaration) newValue);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_SRC_EOUTER_TYPE:
			setCONTEXT__SRC__eOuterType((AbstractTypeDeclaration) newValue);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_PACKAGE:
			setCREATE__TRG__tNestedPackage((TPackage) newValue);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_TYPE:
			setCREATE__TRG__tNestedType((TInterface) newValue);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_PACKAGE:
			setCONTEXT__TRG__tOuterPackage((TPackage) newValue);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_TYPE:
			setCONTEXT__TRG__tOuterType((TAbstractType) newValue);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_ENESTED_TYPE_TO_TNESTED_TYPE:
			setCREATE__CORR__eNestedTypeToTNestedType((TypeToTAbstractType) newValue);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_CORR_EOUTER_TYPE_TO_TOUTER_INTERFACE:
			setCONTEXT__CORR__eOuterTypeToTOuterInterface((TypeToTAbstractType) newValue);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			setCREATE__CORR__mBodyToTAnnotation((ASTNodeToTAnnotatable) newValue);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE:
			setCREATE__CORR__mInterfaceDeclarationtoTInterface((InterfaceDeclarationToTInterface) newValue);
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
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_SRC_ENESTED_TYPE:
			setCREATE__SRC__eNestedType((InterfaceDeclaration) null);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_SRC_EOUTER_TYPE:
			setCONTEXT__SRC__eOuterType((AbstractTypeDeclaration) null);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_PACKAGE:
			setCREATE__TRG__tNestedPackage((TPackage) null);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_TYPE:
			setCREATE__TRG__tNestedType((TInterface) null);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_PACKAGE:
			setCONTEXT__TRG__tOuterPackage((TPackage) null);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_TYPE:
			setCONTEXT__TRG__tOuterType((TAbstractType) null);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) null);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_ENESTED_TYPE_TO_TNESTED_TYPE:
			setCREATE__CORR__eNestedTypeToTNestedType((TypeToTAbstractType) null);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_CORR_EOUTER_TYPE_TO_TOUTER_INTERFACE:
			setCONTEXT__CORR__eOuterTypeToTOuterInterface((TypeToTAbstractType) null);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			setCREATE__CORR__mBodyToTAnnotation((ASTNodeToTAnnotatable) null);
			return;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE:
			setCREATE__CORR__mInterfaceDeclarationtoTInterface((InterfaceDeclarationToTInterface) null);
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
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_SRC_ENESTED_TYPE:
			return creatE__SRC__eNestedType != null;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_SRC_EOUTER_TYPE:
			return contexT__SRC__eOuterType != null;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_PACKAGE:
			return creatE__TRG__tNestedPackage != null;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_TRG_TNESTED_TYPE:
			return creatE__TRG__tNestedType != null;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_PACKAGE:
			return contexT__TRG__tOuterPackage != null;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TOUTER_TYPE:
			return contexT__TRG__tOuterType != null;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			return contexT__TRG__typeGraph != null;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_ENESTED_TYPE_TO_TNESTED_TYPE:
			return creatE__CORR__eNestedTypeToTNestedType != null;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CONTEXT_CORR_EOUTER_TYPE_TO_TOUTER_INTERFACE:
			return contexT__CORR__eOuterTypeToTOuterInterface != null;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			return creatE__CORR__mBodyToTAnnotation != null;
		case ModiscoTGGPackage.NESTED_INTERFACE_IN_TYPE_MARKER__CREATE_CORR_MINTERFACE_DECLARATIONTO_TINTERFACE:
			return creatE__CORR__mInterfaceDeclarationtoTInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //NestedInterfaceInType__MarkerImpl
