/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ModelToTypeGraph;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.PrimitiveTypeIsLong__Marker;
import ModiscoTGG.PrimitiveTypeToTClass;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.PrimitiveTypeLong;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type Is Long Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.PrimitiveTypeIsLong__MarkerImpl#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}</li>
 *   <li>{@link ModiscoTGG.impl.PrimitiveTypeIsLong__MarkerImpl#getCREATE__SRC__ePrimitiveType <em>CREATE SRC ePrimitive Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.PrimitiveTypeIsLong__MarkerImpl#getCREATE__TRG__tPrimitiveClass <em>CREATE TRG tPrimitive Class</em>}</li>
 *   <li>{@link ModiscoTGG.impl.PrimitiveTypeIsLong__MarkerImpl#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.impl.PrimitiveTypeIsLong__MarkerImpl#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.impl.PrimitiveTypeIsLong__MarkerImpl#getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}</li>
 *   <li>{@link ModiscoTGG.impl.PrimitiveTypeIsLong__MarkerImpl#getCREATE__CORR__typeToTAbstractType <em>CREATE CORR type To TAbstract Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveTypeIsLong__MarkerImpl extends TGGRuleApplicationImpl implements PrimitiveTypeIsLong__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__eModel() <em>CONTEXT SRC eModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eModel()
	 * @generated
	 * @ordered
	 */
	protected Model contexT__SRC__eModel;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__ePrimitiveType() <em>CREATE SRC ePrimitive Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__ePrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveTypeLong creatE__SRC__ePrimitiveType;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tPrimitiveClass() <em>CREATE TRG tPrimitive Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tPrimitiveClass()
	 * @generated
	 * @ordered
	 */
	protected TClass creatE__TRG__tPrimitiveClass;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__eModelToTypeGraph() <em>CONTEXT CORR eModel To Type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eModelToTypeGraph()
	 * @generated
	 * @ordered
	 */
	protected ModelToTypeGraph contexT__CORR__eModelToTypeGraph;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass() <em>CREATE CORR ePrimitive Type To TPrimitive Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveTypeToTClass creatE__CORR__ePrimitiveTypeToTPrimitiveClass;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__typeToTAbstractType() <em>CREATE CORR type To TAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__typeToTAbstractType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType creatE__CORR__typeToTAbstractType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeIsLong__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getPrimitiveTypeIsLong__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getCONTEXT__SRC__eModel() {
		if (contexT__SRC__eModel != null && contexT__SRC__eModel.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eModel = (InternalEObject) contexT__SRC__eModel;
			contexT__SRC__eModel = (Model) eResolveProxy(oldCONTEXT__SRC__eModel);
			if (contexT__SRC__eModel != oldCONTEXT__SRC__eModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_SRC_EMODEL,
							oldCONTEXT__SRC__eModel, contexT__SRC__eModel));
			}
		}
		return contexT__SRC__eModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetCONTEXT__SRC__eModel() {
		return contexT__SRC__eModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eModel(Model newCONTEXT__SRC__eModel) {
		Model oldCONTEXT__SRC__eModel = contexT__SRC__eModel;
		contexT__SRC__eModel = newCONTEXT__SRC__eModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_SRC_EMODEL, oldCONTEXT__SRC__eModel,
					contexT__SRC__eModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeLong getCREATE__SRC__ePrimitiveType() {
		if (creatE__SRC__ePrimitiveType != null && creatE__SRC__ePrimitiveType.eIsProxy()) {
			InternalEObject oldCREATE__SRC__ePrimitiveType = (InternalEObject) creatE__SRC__ePrimitiveType;
			creatE__SRC__ePrimitiveType = (PrimitiveTypeLong) eResolveProxy(oldCREATE__SRC__ePrimitiveType);
			if (creatE__SRC__ePrimitiveType != oldCREATE__SRC__ePrimitiveType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_SRC_EPRIMITIVE_TYPE,
							oldCREATE__SRC__ePrimitiveType, creatE__SRC__ePrimitiveType));
			}
		}
		return creatE__SRC__ePrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeLong basicGetCREATE__SRC__ePrimitiveType() {
		return creatE__SRC__ePrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__ePrimitiveType(PrimitiveTypeLong newCREATE__SRC__ePrimitiveType) {
		PrimitiveTypeLong oldCREATE__SRC__ePrimitiveType = creatE__SRC__ePrimitiveType;
		creatE__SRC__ePrimitiveType = newCREATE__SRC__ePrimitiveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_SRC_EPRIMITIVE_TYPE,
					oldCREATE__SRC__ePrimitiveType, creatE__SRC__ePrimitiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getCREATE__TRG__tPrimitiveClass() {
		if (creatE__TRG__tPrimitiveClass != null && creatE__TRG__tPrimitiveClass.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tPrimitiveClass = (InternalEObject) creatE__TRG__tPrimitiveClass;
			creatE__TRG__tPrimitiveClass = (TClass) eResolveProxy(oldCREATE__TRG__tPrimitiveClass);
			if (creatE__TRG__tPrimitiveClass != oldCREATE__TRG__tPrimitiveClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_TRG_TPRIMITIVE_CLASS,
							oldCREATE__TRG__tPrimitiveClass, creatE__TRG__tPrimitiveClass));
			}
		}
		return creatE__TRG__tPrimitiveClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetCREATE__TRG__tPrimitiveClass() {
		return creatE__TRG__tPrimitiveClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tPrimitiveClass(TClass newCREATE__TRG__tPrimitiveClass) {
		TClass oldCREATE__TRG__tPrimitiveClass = creatE__TRG__tPrimitiveClass;
		creatE__TRG__tPrimitiveClass = newCREATE__TRG__tPrimitiveClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_TRG_TPRIMITIVE_CLASS,
					oldCREATE__TRG__tPrimitiveClass, creatE__TRG__tPrimitiveClass));
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
							ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_TRG_TYPE_GRAPH,
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
					ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_TRG_TYPE_GRAPH, oldCONTEXT__TRG__typeGraph,
					contexT__TRG__typeGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelToTypeGraph getCONTEXT__CORR__eModelToTypeGraph() {
		if (contexT__CORR__eModelToTypeGraph != null && contexT__CORR__eModelToTypeGraph.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eModelToTypeGraph = (InternalEObject) contexT__CORR__eModelToTypeGraph;
			contexT__CORR__eModelToTypeGraph = (ModelToTypeGraph) eResolveProxy(oldCONTEXT__CORR__eModelToTypeGraph);
			if (contexT__CORR__eModelToTypeGraph != oldCONTEXT__CORR__eModelToTypeGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH,
							oldCONTEXT__CORR__eModelToTypeGraph, contexT__CORR__eModelToTypeGraph));
			}
		}
		return contexT__CORR__eModelToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelToTypeGraph basicGetCONTEXT__CORR__eModelToTypeGraph() {
		return contexT__CORR__eModelToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eModelToTypeGraph(ModelToTypeGraph newCONTEXT__CORR__eModelToTypeGraph) {
		ModelToTypeGraph oldCONTEXT__CORR__eModelToTypeGraph = contexT__CORR__eModelToTypeGraph;
		contexT__CORR__eModelToTypeGraph = newCONTEXT__CORR__eModelToTypeGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH,
					oldCONTEXT__CORR__eModelToTypeGraph, contexT__CORR__eModelToTypeGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeToTClass getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass() {
		if (creatE__CORR__ePrimitiveTypeToTPrimitiveClass != null
				&& creatE__CORR__ePrimitiveTypeToTPrimitiveClass.eIsProxy()) {
			InternalEObject oldCREATE__CORR__ePrimitiveTypeToTPrimitiveClass = (InternalEObject) creatE__CORR__ePrimitiveTypeToTPrimitiveClass;
			creatE__CORR__ePrimitiveTypeToTPrimitiveClass = (PrimitiveTypeToTClass) eResolveProxy(
					oldCREATE__CORR__ePrimitiveTypeToTPrimitiveClass);
			if (creatE__CORR__ePrimitiveTypeToTPrimitiveClass != oldCREATE__CORR__ePrimitiveTypeToTPrimitiveClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS,
							oldCREATE__CORR__ePrimitiveTypeToTPrimitiveClass,
							creatE__CORR__ePrimitiveTypeToTPrimitiveClass));
			}
		}
		return creatE__CORR__ePrimitiveTypeToTPrimitiveClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeToTClass basicGetCREATE__CORR__ePrimitiveTypeToTPrimitiveClass() {
		return creatE__CORR__ePrimitiveTypeToTPrimitiveClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__ePrimitiveTypeToTPrimitiveClass(
			PrimitiveTypeToTClass newCREATE__CORR__ePrimitiveTypeToTPrimitiveClass) {
		PrimitiveTypeToTClass oldCREATE__CORR__ePrimitiveTypeToTPrimitiveClass = creatE__CORR__ePrimitiveTypeToTPrimitiveClass;
		creatE__CORR__ePrimitiveTypeToTPrimitiveClass = newCREATE__CORR__ePrimitiveTypeToTPrimitiveClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS,
					oldCREATE__CORR__ePrimitiveTypeToTPrimitiveClass, creatE__CORR__ePrimitiveTypeToTPrimitiveClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCREATE__CORR__typeToTAbstractType() {
		if (creatE__CORR__typeToTAbstractType != null && creatE__CORR__typeToTAbstractType.eIsProxy()) {
			InternalEObject oldCREATE__CORR__typeToTAbstractType = (InternalEObject) creatE__CORR__typeToTAbstractType;
			creatE__CORR__typeToTAbstractType = (TypeToTAbstractType) eResolveProxy(
					oldCREATE__CORR__typeToTAbstractType);
			if (creatE__CORR__typeToTAbstractType != oldCREATE__CORR__typeToTAbstractType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE,
							oldCREATE__CORR__typeToTAbstractType, creatE__CORR__typeToTAbstractType));
			}
		}
		return creatE__CORR__typeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCREATE__CORR__typeToTAbstractType() {
		return creatE__CORR__typeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__typeToTAbstractType(TypeToTAbstractType newCREATE__CORR__typeToTAbstractType) {
		TypeToTAbstractType oldCREATE__CORR__typeToTAbstractType = creatE__CORR__typeToTAbstractType;
		creatE__CORR__typeToTAbstractType = newCREATE__CORR__typeToTAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE,
					oldCREATE__CORR__typeToTAbstractType, creatE__CORR__typeToTAbstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_SRC_EMODEL:
			if (resolve)
				return getCONTEXT__SRC__eModel();
			return basicGetCONTEXT__SRC__eModel();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_SRC_EPRIMITIVE_TYPE:
			if (resolve)
				return getCREATE__SRC__ePrimitiveType();
			return basicGetCREATE__SRC__ePrimitiveType();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_TRG_TPRIMITIVE_CLASS:
			if (resolve)
				return getCREATE__TRG__tPrimitiveClass();
			return basicGetCREATE__TRG__tPrimitiveClass();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			if (resolve)
				return getCONTEXT__TRG__typeGraph();
			return basicGetCONTEXT__TRG__typeGraph();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH:
			if (resolve)
				return getCONTEXT__CORR__eModelToTypeGraph();
			return basicGetCONTEXT__CORR__eModelToTypeGraph();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS:
			if (resolve)
				return getCREATE__CORR__ePrimitiveTypeToTPrimitiveClass();
			return basicGetCREATE__CORR__ePrimitiveTypeToTPrimitiveClass();
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE:
			if (resolve)
				return getCREATE__CORR__typeToTAbstractType();
			return basicGetCREATE__CORR__typeToTAbstractType();
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
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_SRC_EMODEL:
			setCONTEXT__SRC__eModel((Model) newValue);
			return;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_SRC_EPRIMITIVE_TYPE:
			setCREATE__SRC__ePrimitiveType((PrimitiveTypeLong) newValue);
			return;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_TRG_TPRIMITIVE_CLASS:
			setCREATE__TRG__tPrimitiveClass((TClass) newValue);
			return;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH:
			setCONTEXT__CORR__eModelToTypeGraph((ModelToTypeGraph) newValue);
			return;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS:
			setCREATE__CORR__ePrimitiveTypeToTPrimitiveClass((PrimitiveTypeToTClass) newValue);
			return;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE:
			setCREATE__CORR__typeToTAbstractType((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_SRC_EMODEL:
			setCONTEXT__SRC__eModel((Model) null);
			return;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_SRC_EPRIMITIVE_TYPE:
			setCREATE__SRC__ePrimitiveType((PrimitiveTypeLong) null);
			return;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_TRG_TPRIMITIVE_CLASS:
			setCREATE__TRG__tPrimitiveClass((TClass) null);
			return;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) null);
			return;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH:
			setCONTEXT__CORR__eModelToTypeGraph((ModelToTypeGraph) null);
			return;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS:
			setCREATE__CORR__ePrimitiveTypeToTPrimitiveClass((PrimitiveTypeToTClass) null);
			return;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE:
			setCREATE__CORR__typeToTAbstractType((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_SRC_EMODEL:
			return contexT__SRC__eModel != null;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_SRC_EPRIMITIVE_TYPE:
			return creatE__SRC__ePrimitiveType != null;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_TRG_TPRIMITIVE_CLASS:
			return creatE__TRG__tPrimitiveClass != null;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			return contexT__TRG__typeGraph != null;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH:
			return contexT__CORR__eModelToTypeGraph != null;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_EPRIMITIVE_TYPE_TO_TPRIMITIVE_CLASS:
			return creatE__CORR__ePrimitiveTypeToTPrimitiveClass != null;
		case ModiscoTGGPackage.PRIMITIVE_TYPE_IS_LONG_MARKER__CREATE_CORR_TYPE_TO_TABSTRACT_TYPE:
			return creatE__CORR__typeToTAbstractType != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveTypeIsLong__MarkerImpl
