/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ClassDeclarationToTClass;
import ModiscoTGG.ClassInnerClassMember__Marker;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.ClassDeclaration;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MClass;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Inner Class Member Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl#getCONTEXT__SRC__eOuterClass <em>CONTEXT SRC eOuter Class</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl#getCREATE__SRC__mInnerClass <em>CREATE SRC mInner Class</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl#getCREATE__TRG__tInnerClass <em>CREATE TRG tInner Class</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl#getCREATE__TRG__tInnerPackage <em>CREATE TRG tInner Package</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl#getCONTEXT__TRG__tOuterClass <em>CONTEXT TRG tOuter Class</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl#getCONTEXT__TRG__tOuterPackage <em>CONTEXT TRG tOuter Package</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl#getCONTEXT__CORR__eOuterClassToTOuterClass <em>CONTEXT CORR eOuter Class To TOuter Class</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl#getCREATE__CORR__tInnerClassToTInnerClass <em>CREATE CORR tInner Class To TInner Class</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassInnerClassMember__MarkerImpl#getCREATE__CORR__tInnerTypeToTInnerAbstractType <em>CREATE CORR tInner Type To TInner Abstract Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassInnerClassMember__MarkerImpl extends TGGRuleApplicationImpl implements ClassInnerClassMember__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__eOuterClass() <em>CONTEXT SRC eOuter Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eOuterClass()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclaration contexT__SRC__eOuterClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mDefinition() <em>CONTEXT SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mDefinition()
	 * @generated
	 * @ordered
	 */
	protected MAbstractMethodDefinition contexT__SRC__mDefinition;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mInnerClass() <em>CREATE SRC mInner Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mInnerClass()
	 * @generated
	 * @ordered
	 */
	protected MClass creatE__SRC__mInnerClass;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tInnerClass() <em>CREATE TRG tInner Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tInnerClass()
	 * @generated
	 * @ordered
	 */
	protected TClass creatE__TRG__tInnerClass;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tInnerPackage() <em>CREATE TRG tInner Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tInnerPackage()
	 * @generated
	 * @ordered
	 */
	protected TPackage creatE__TRG__tInnerPackage;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tOuterClass() <em>CONTEXT TRG tOuter Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tOuterClass()
	 * @generated
	 * @ordered
	 */
	protected TClass contexT__TRG__tOuterClass;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__typeGraph() <em>CONTEXT TRG type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__typeGraph()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph contexT__TRG__typeGraph;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eOuterClassToTOuterClass() <em>CONTEXT CORR eOuter Class To TOuter Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eOuterClassToTOuterClass()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__eOuterClassToTOuterClass;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__tInnerClassToTInnerClass() <em>CREATE CORR tInner Class To TInner Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__tInnerClassToTInnerClass()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclarationToTClass creatE__CORR__tInnerClassToTInnerClass;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__tInnerTypeToTInnerAbstractType() <em>CREATE CORR tInner Type To TInner Abstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__tInnerTypeToTInnerAbstractType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType creatE__CORR__tInnerTypeToTInnerAbstractType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassInnerClassMember__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getClassInnerClassMember__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclaration getCONTEXT__SRC__eOuterClass() {
		if (contexT__SRC__eOuterClass != null && contexT__SRC__eOuterClass.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eOuterClass = (InternalEObject) contexT__SRC__eOuterClass;
			contexT__SRC__eOuterClass = (ClassDeclaration) eResolveProxy(oldCONTEXT__SRC__eOuterClass);
			if (contexT__SRC__eOuterClass != oldCONTEXT__SRC__eOuterClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_EOUTER_CLASS,
							oldCONTEXT__SRC__eOuterClass, contexT__SRC__eOuterClass));
			}
		}
		return contexT__SRC__eOuterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration basicGetCONTEXT__SRC__eOuterClass() {
		return contexT__SRC__eOuterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eOuterClass(ClassDeclaration newCONTEXT__SRC__eOuterClass) {
		ClassDeclaration oldCONTEXT__SRC__eOuterClass = contexT__SRC__eOuterClass;
		contexT__SRC__eOuterClass = newCONTEXT__SRC__eOuterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_EOUTER_CLASS,
					oldCONTEXT__SRC__eOuterClass, contexT__SRC__eOuterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractMethodDefinition getCONTEXT__SRC__mDefinition() {
		if (contexT__SRC__mDefinition != null && contexT__SRC__mDefinition.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mDefinition = (InternalEObject) contexT__SRC__mDefinition;
			contexT__SRC__mDefinition = (MAbstractMethodDefinition) eResolveProxy(oldCONTEXT__SRC__mDefinition);
			if (contexT__SRC__mDefinition != oldCONTEXT__SRC__mDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_MDEFINITION,
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
	public MAbstractMethodDefinition basicGetCONTEXT__SRC__mDefinition() {
		return contexT__SRC__mDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mDefinition(MAbstractMethodDefinition newCONTEXT__SRC__mDefinition) {
		MAbstractMethodDefinition oldCONTEXT__SRC__mDefinition = contexT__SRC__mDefinition;
		contexT__SRC__mDefinition = newCONTEXT__SRC__mDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_MDEFINITION,
					oldCONTEXT__SRC__mDefinition, contexT__SRC__mDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MClass getCREATE__SRC__mInnerClass() {
		if (creatE__SRC__mInnerClass != null && creatE__SRC__mInnerClass.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mInnerClass = (InternalEObject) creatE__SRC__mInnerClass;
			creatE__SRC__mInnerClass = (MClass) eResolveProxy(oldCREATE__SRC__mInnerClass);
			if (creatE__SRC__mInnerClass != oldCREATE__SRC__mInnerClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_SRC_MINNER_CLASS,
							oldCREATE__SRC__mInnerClass, creatE__SRC__mInnerClass));
			}
		}
		return creatE__SRC__mInnerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass basicGetCREATE__SRC__mInnerClass() {
		return creatE__SRC__mInnerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mInnerClass(MClass newCREATE__SRC__mInnerClass) {
		MClass oldCREATE__SRC__mInnerClass = creatE__SRC__mInnerClass;
		creatE__SRC__mInnerClass = newCREATE__SRC__mInnerClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_SRC_MINNER_CLASS,
					oldCREATE__SRC__mInnerClass, creatE__SRC__mInnerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getCREATE__TRG__tInnerClass() {
		if (creatE__TRG__tInnerClass != null && creatE__TRG__tInnerClass.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tInnerClass = (InternalEObject) creatE__TRG__tInnerClass;
			creatE__TRG__tInnerClass = (TClass) eResolveProxy(oldCREATE__TRG__tInnerClass);
			if (creatE__TRG__tInnerClass != oldCREATE__TRG__tInnerClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_CLASS,
							oldCREATE__TRG__tInnerClass, creatE__TRG__tInnerClass));
			}
		}
		return creatE__TRG__tInnerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetCREATE__TRG__tInnerClass() {
		return creatE__TRG__tInnerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tInnerClass(TClass newCREATE__TRG__tInnerClass) {
		TClass oldCREATE__TRG__tInnerClass = creatE__TRG__tInnerClass;
		creatE__TRG__tInnerClass = newCREATE__TRG__tInnerClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_CLASS,
					oldCREATE__TRG__tInnerClass, creatE__TRG__tInnerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getCREATE__TRG__tInnerPackage() {
		if (creatE__TRG__tInnerPackage != null && creatE__TRG__tInnerPackage.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tInnerPackage = (InternalEObject) creatE__TRG__tInnerPackage;
			creatE__TRG__tInnerPackage = (TPackage) eResolveProxy(oldCREATE__TRG__tInnerPackage);
			if (creatE__TRG__tInnerPackage != oldCREATE__TRG__tInnerPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_PACKAGE,
							oldCREATE__TRG__tInnerPackage, creatE__TRG__tInnerPackage));
			}
		}
		return creatE__TRG__tInnerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage basicGetCREATE__TRG__tInnerPackage() {
		return creatE__TRG__tInnerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tInnerPackage(TPackage newCREATE__TRG__tInnerPackage) {
		TPackage oldCREATE__TRG__tInnerPackage = creatE__TRG__tInnerPackage;
		creatE__TRG__tInnerPackage = newCREATE__TRG__tInnerPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_PACKAGE,
					oldCREATE__TRG__tInnerPackage, creatE__TRG__tInnerPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getCONTEXT__TRG__tOuterClass() {
		if (contexT__TRG__tOuterClass != null && contexT__TRG__tOuterClass.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tOuterClass = (InternalEObject) contexT__TRG__tOuterClass;
			contexT__TRG__tOuterClass = (TClass) eResolveProxy(oldCONTEXT__TRG__tOuterClass);
			if (contexT__TRG__tOuterClass != oldCONTEXT__TRG__tOuterClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_CLASS,
							oldCONTEXT__TRG__tOuterClass, contexT__TRG__tOuterClass));
			}
		}
		return contexT__TRG__tOuterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetCONTEXT__TRG__tOuterClass() {
		return contexT__TRG__tOuterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tOuterClass(TClass newCONTEXT__TRG__tOuterClass) {
		TClass oldCONTEXT__TRG__tOuterClass = contexT__TRG__tOuterClass;
		contexT__TRG__tOuterClass = newCONTEXT__TRG__tOuterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_CLASS,
					oldCONTEXT__TRG__tOuterClass, contexT__TRG__tOuterClass));
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
							ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_PACKAGE,
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
					ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_PACKAGE,
					oldCONTEXT__TRG__tOuterPackage, contexT__TRG__tOuterPackage));
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
							ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TYPE_GRAPH,
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
					ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TYPE_GRAPH,
					oldCONTEXT__TRG__typeGraph, contexT__TRG__typeGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__eOuterClassToTOuterClass() {
		if (contexT__CORR__eOuterClassToTOuterClass != null && contexT__CORR__eOuterClassToTOuterClass.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eOuterClassToTOuterClass = (InternalEObject) contexT__CORR__eOuterClassToTOuterClass;
			contexT__CORR__eOuterClassToTOuterClass = (TypeToTAbstractType) eResolveProxy(
					oldCONTEXT__CORR__eOuterClassToTOuterClass);
			if (contexT__CORR__eOuterClassToTOuterClass != oldCONTEXT__CORR__eOuterClassToTOuterClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_CORR_EOUTER_CLASS_TO_TOUTER_CLASS,
							oldCONTEXT__CORR__eOuterClassToTOuterClass, contexT__CORR__eOuterClassToTOuterClass));
			}
		}
		return contexT__CORR__eOuterClassToTOuterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__eOuterClassToTOuterClass() {
		return contexT__CORR__eOuterClassToTOuterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eOuterClassToTOuterClass(
			TypeToTAbstractType newCONTEXT__CORR__eOuterClassToTOuterClass) {
		TypeToTAbstractType oldCONTEXT__CORR__eOuterClassToTOuterClass = contexT__CORR__eOuterClassToTOuterClass;
		contexT__CORR__eOuterClassToTOuterClass = newCONTEXT__CORR__eOuterClassToTOuterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_CORR_EOUTER_CLASS_TO_TOUTER_CLASS,
					oldCONTEXT__CORR__eOuterClassToTOuterClass, contexT__CORR__eOuterClassToTOuterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclarationToTClass getCREATE__CORR__tInnerClassToTInnerClass() {
		if (creatE__CORR__tInnerClassToTInnerClass != null && creatE__CORR__tInnerClassToTInnerClass.eIsProxy()) {
			InternalEObject oldCREATE__CORR__tInnerClassToTInnerClass = (InternalEObject) creatE__CORR__tInnerClassToTInnerClass;
			creatE__CORR__tInnerClassToTInnerClass = (ClassDeclarationToTClass) eResolveProxy(
					oldCREATE__CORR__tInnerClassToTInnerClass);
			if (creatE__CORR__tInnerClassToTInnerClass != oldCREATE__CORR__tInnerClassToTInnerClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_CLASS_TO_TINNER_CLASS,
							oldCREATE__CORR__tInnerClassToTInnerClass, creatE__CORR__tInnerClassToTInnerClass));
			}
		}
		return creatE__CORR__tInnerClassToTInnerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclarationToTClass basicGetCREATE__CORR__tInnerClassToTInnerClass() {
		return creatE__CORR__tInnerClassToTInnerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__tInnerClassToTInnerClass(
			ClassDeclarationToTClass newCREATE__CORR__tInnerClassToTInnerClass) {
		ClassDeclarationToTClass oldCREATE__CORR__tInnerClassToTInnerClass = creatE__CORR__tInnerClassToTInnerClass;
		creatE__CORR__tInnerClassToTInnerClass = newCREATE__CORR__tInnerClassToTInnerClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_CLASS_TO_TINNER_CLASS,
					oldCREATE__CORR__tInnerClassToTInnerClass, creatE__CORR__tInnerClassToTInnerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCREATE__CORR__tInnerTypeToTInnerAbstractType() {
		if (creatE__CORR__tInnerTypeToTInnerAbstractType != null
				&& creatE__CORR__tInnerTypeToTInnerAbstractType.eIsProxy()) {
			InternalEObject oldCREATE__CORR__tInnerTypeToTInnerAbstractType = (InternalEObject) creatE__CORR__tInnerTypeToTInnerAbstractType;
			creatE__CORR__tInnerTypeToTInnerAbstractType = (TypeToTAbstractType) eResolveProxy(
					oldCREATE__CORR__tInnerTypeToTInnerAbstractType);
			if (creatE__CORR__tInnerTypeToTInnerAbstractType != oldCREATE__CORR__tInnerTypeToTInnerAbstractType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_TYPE_TO_TINNER_ABSTRACT_TYPE,
							oldCREATE__CORR__tInnerTypeToTInnerAbstractType,
							creatE__CORR__tInnerTypeToTInnerAbstractType));
			}
		}
		return creatE__CORR__tInnerTypeToTInnerAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCREATE__CORR__tInnerTypeToTInnerAbstractType() {
		return creatE__CORR__tInnerTypeToTInnerAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__tInnerTypeToTInnerAbstractType(
			TypeToTAbstractType newCREATE__CORR__tInnerTypeToTInnerAbstractType) {
		TypeToTAbstractType oldCREATE__CORR__tInnerTypeToTInnerAbstractType = creatE__CORR__tInnerTypeToTInnerAbstractType;
		creatE__CORR__tInnerTypeToTInnerAbstractType = newCREATE__CORR__tInnerTypeToTInnerAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_TYPE_TO_TINNER_ABSTRACT_TYPE,
					oldCREATE__CORR__tInnerTypeToTInnerAbstractType, creatE__CORR__tInnerTypeToTInnerAbstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_EOUTER_CLASS:
			if (resolve)
				return getCONTEXT__SRC__eOuterClass();
			return basicGetCONTEXT__SRC__eOuterClass();
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_MDEFINITION:
			if (resolve)
				return getCONTEXT__SRC__mDefinition();
			return basicGetCONTEXT__SRC__mDefinition();
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_SRC_MINNER_CLASS:
			if (resolve)
				return getCREATE__SRC__mInnerClass();
			return basicGetCREATE__SRC__mInnerClass();
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_CLASS:
			if (resolve)
				return getCREATE__TRG__tInnerClass();
			return basicGetCREATE__TRG__tInnerClass();
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_PACKAGE:
			if (resolve)
				return getCREATE__TRG__tInnerPackage();
			return basicGetCREATE__TRG__tInnerPackage();
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_CLASS:
			if (resolve)
				return getCONTEXT__TRG__tOuterClass();
			return basicGetCONTEXT__TRG__tOuterClass();
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_PACKAGE:
			if (resolve)
				return getCONTEXT__TRG__tOuterPackage();
			return basicGetCONTEXT__TRG__tOuterPackage();
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			if (resolve)
				return getCONTEXT__TRG__typeGraph();
			return basicGetCONTEXT__TRG__typeGraph();
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_CORR_EOUTER_CLASS_TO_TOUTER_CLASS:
			if (resolve)
				return getCONTEXT__CORR__eOuterClassToTOuterClass();
			return basicGetCONTEXT__CORR__eOuterClassToTOuterClass();
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_CLASS_TO_TINNER_CLASS:
			if (resolve)
				return getCREATE__CORR__tInnerClassToTInnerClass();
			return basicGetCREATE__CORR__tInnerClassToTInnerClass();
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_TYPE_TO_TINNER_ABSTRACT_TYPE:
			if (resolve)
				return getCREATE__CORR__tInnerTypeToTInnerAbstractType();
			return basicGetCREATE__CORR__tInnerTypeToTInnerAbstractType();
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
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_EOUTER_CLASS:
			setCONTEXT__SRC__eOuterClass((ClassDeclaration) newValue);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_MDEFINITION:
			setCONTEXT__SRC__mDefinition((MAbstractMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_SRC_MINNER_CLASS:
			setCREATE__SRC__mInnerClass((MClass) newValue);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_CLASS:
			setCREATE__TRG__tInnerClass((TClass) newValue);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_PACKAGE:
			setCREATE__TRG__tInnerPackage((TPackage) newValue);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_CLASS:
			setCONTEXT__TRG__tOuterClass((TClass) newValue);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_PACKAGE:
			setCONTEXT__TRG__tOuterPackage((TPackage) newValue);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_CORR_EOUTER_CLASS_TO_TOUTER_CLASS:
			setCONTEXT__CORR__eOuterClassToTOuterClass((TypeToTAbstractType) newValue);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_CLASS_TO_TINNER_CLASS:
			setCREATE__CORR__tInnerClassToTInnerClass((ClassDeclarationToTClass) newValue);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_TYPE_TO_TINNER_ABSTRACT_TYPE:
			setCREATE__CORR__tInnerTypeToTInnerAbstractType((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_EOUTER_CLASS:
			setCONTEXT__SRC__eOuterClass((ClassDeclaration) null);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_MDEFINITION:
			setCONTEXT__SRC__mDefinition((MAbstractMethodDefinition) null);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_SRC_MINNER_CLASS:
			setCREATE__SRC__mInnerClass((MClass) null);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_CLASS:
			setCREATE__TRG__tInnerClass((TClass) null);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_PACKAGE:
			setCREATE__TRG__tInnerPackage((TPackage) null);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_CLASS:
			setCONTEXT__TRG__tOuterClass((TClass) null);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_PACKAGE:
			setCONTEXT__TRG__tOuterPackage((TPackage) null);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) null);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_CORR_EOUTER_CLASS_TO_TOUTER_CLASS:
			setCONTEXT__CORR__eOuterClassToTOuterClass((TypeToTAbstractType) null);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_CLASS_TO_TINNER_CLASS:
			setCREATE__CORR__tInnerClassToTInnerClass((ClassDeclarationToTClass) null);
			return;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_TYPE_TO_TINNER_ABSTRACT_TYPE:
			setCREATE__CORR__tInnerTypeToTInnerAbstractType((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_EOUTER_CLASS:
			return contexT__SRC__eOuterClass != null;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_SRC_MDEFINITION:
			return contexT__SRC__mDefinition != null;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_SRC_MINNER_CLASS:
			return creatE__SRC__mInnerClass != null;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_CLASS:
			return creatE__TRG__tInnerClass != null;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_TRG_TINNER_PACKAGE:
			return creatE__TRG__tInnerPackage != null;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_CLASS:
			return contexT__TRG__tOuterClass != null;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TOUTER_PACKAGE:
			return contexT__TRG__tOuterPackage != null;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			return contexT__TRG__typeGraph != null;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CONTEXT_CORR_EOUTER_CLASS_TO_TOUTER_CLASS:
			return contexT__CORR__eOuterClassToTOuterClass != null;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_CLASS_TO_TINNER_CLASS:
			return creatE__CORR__tInnerClassToTInnerClass != null;
		case ModiscoTGGPackage.CLASS_INNER_CLASS_MEMBER_MARKER__CREATE_CORR_TINNER_TYPE_TO_TINNER_ABSTRACT_TYPE:
			return creatE__CORR__tInnerTypeToTInnerAbstractType != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassInnerClassMember__MarkerImpl
