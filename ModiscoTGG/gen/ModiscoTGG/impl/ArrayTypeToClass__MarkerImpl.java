/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ArrayTypeToClass__Marker;
import ModiscoTGG.ModelToTypeGraph;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type To Class Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.ArrayTypeToClass__MarkerImpl#getCREATE__SRC__eArrayType <em>CREATE SRC eArray Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ArrayTypeToClass__MarkerImpl#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ArrayTypeToClass__MarkerImpl#getCONTEXT__SRC__eType <em>CONTEXT SRC eType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ArrayTypeToClass__MarkerImpl#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ArrayTypeToClass__MarkerImpl#getCONTEXT__TRG__tArrayClass <em>CONTEXT TRG tArray Class</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ArrayTypeToClass__MarkerImpl#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ArrayTypeToClass__MarkerImpl#getCREATE__CORR__eArrayTypeToTArrayClass <em>CREATE CORR eArray Type To TArray Class</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ArrayTypeToClass__MarkerImpl#getCONTEXT__CORR__eModelToTypeGraph <em>CONTEXT CORR eModel To Type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ArrayTypeToClass__MarkerImpl#getCONTEXT__CORR__eTypeToTArrayClass <em>CONTEXT CORR eType To TArray Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTypeToClass__MarkerImpl extends TGGRuleApplicationImpl implements ArrayTypeToClass__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__eArrayType() <em>CREATE SRC eArray Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__eArrayType()
	 * @generated
	 * @ordered
	 */
	protected ArrayType creatE__SRC__eArrayType;

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
	 * The cached value of the '{@link #getCONTEXT__SRC__eType() <em>CONTEXT SRC eType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eType()
	 * @generated
	 * @ordered
	 */
	protected Type contexT__SRC__eType;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tArrayClass() <em>CONTEXT TRG tArray Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tArrayClass()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType contexT__TRG__tArrayClass;

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
	 * The cached value of the '{@link #getCREATE__CORR__eArrayTypeToTArrayClass() <em>CREATE CORR eArray Type To TArray Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__eArrayTypeToTArrayClass()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType creatE__CORR__eArrayTypeToTArrayClass;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__eTypeToTArrayClass() <em>CONTEXT CORR eType To TArray Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eTypeToTArrayClass()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__eTypeToTArrayClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeToClass__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getArrayTypeToClass__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayType getCREATE__SRC__eArrayType() {
		if (creatE__SRC__eArrayType != null && creatE__SRC__eArrayType.eIsProxy()) {
			InternalEObject oldCREATE__SRC__eArrayType = (InternalEObject) creatE__SRC__eArrayType;
			creatE__SRC__eArrayType = (ArrayType) eResolveProxy(oldCREATE__SRC__eArrayType);
			if (creatE__SRC__eArrayType != oldCREATE__SRC__eArrayType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_EARRAY_TYPE,
							oldCREATE__SRC__eArrayType, creatE__SRC__eArrayType));
			}
		}
		return creatE__SRC__eArrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType basicGetCREATE__SRC__eArrayType() {
		return creatE__SRC__eArrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__eArrayType(ArrayType newCREATE__SRC__eArrayType) {
		ArrayType oldCREATE__SRC__eArrayType = creatE__SRC__eArrayType;
		creatE__SRC__eArrayType = newCREATE__SRC__eArrayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_EARRAY_TYPE, oldCREATE__SRC__eArrayType,
					creatE__SRC__eArrayType));
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
							ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL, oldCONTEXT__SRC__eModel,
							contexT__SRC__eModel));
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
					ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL, oldCONTEXT__SRC__eModel,
					contexT__SRC__eModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getCONTEXT__SRC__eType() {
		if (contexT__SRC__eType != null && contexT__SRC__eType.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eType = (InternalEObject) contexT__SRC__eType;
			contexT__SRC__eType = (Type) eResolveProxy(oldCONTEXT__SRC__eType);
			if (contexT__SRC__eType != oldCONTEXT__SRC__eType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE, oldCONTEXT__SRC__eType,
							contexT__SRC__eType));
			}
		}
		return contexT__SRC__eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetCONTEXT__SRC__eType() {
		return contexT__SRC__eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eType(Type newCONTEXT__SRC__eType) {
		Type oldCONTEXT__SRC__eType = contexT__SRC__eType;
		contexT__SRC__eType = newCONTEXT__SRC__eType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE, oldCONTEXT__SRC__eType,
					contexT__SRC__eType));
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
							ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS,
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
					ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS, oldCREATE__SRC__eTypeAccess,
					creatE__SRC__eTypeAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getCONTEXT__TRG__tArrayClass() {
		if (contexT__TRG__tArrayClass != null && contexT__TRG__tArrayClass.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tArrayClass = (InternalEObject) contexT__TRG__tArrayClass;
			contexT__TRG__tArrayClass = (TAbstractType) eResolveProxy(oldCONTEXT__TRG__tArrayClass);
			if (contexT__TRG__tArrayClass != oldCONTEXT__TRG__tArrayClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TARRAY_CLASS,
							oldCONTEXT__TRG__tArrayClass, contexT__TRG__tArrayClass));
			}
		}
		return contexT__TRG__tArrayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetCONTEXT__TRG__tArrayClass() {
		return contexT__TRG__tArrayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tArrayClass(TAbstractType newCONTEXT__TRG__tArrayClass) {
		TAbstractType oldCONTEXT__TRG__tArrayClass = contexT__TRG__tArrayClass;
		contexT__TRG__tArrayClass = newCONTEXT__TRG__tArrayClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TARRAY_CLASS,
					oldCONTEXT__TRG__tArrayClass, contexT__TRG__tArrayClass));
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
							ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TYPE_GRAPH,
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
					ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TYPE_GRAPH, oldCONTEXT__TRG__typeGraph,
					contexT__TRG__typeGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCREATE__CORR__eArrayTypeToTArrayClass() {
		if (creatE__CORR__eArrayTypeToTArrayClass != null && creatE__CORR__eArrayTypeToTArrayClass.eIsProxy()) {
			InternalEObject oldCREATE__CORR__eArrayTypeToTArrayClass = (InternalEObject) creatE__CORR__eArrayTypeToTArrayClass;
			creatE__CORR__eArrayTypeToTArrayClass = (TypeToTAbstractType) eResolveProxy(
					oldCREATE__CORR__eArrayTypeToTArrayClass);
			if (creatE__CORR__eArrayTypeToTArrayClass != oldCREATE__CORR__eArrayTypeToTArrayClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_CORR_EARRAY_TYPE_TO_TARRAY_CLASS,
							oldCREATE__CORR__eArrayTypeToTArrayClass, creatE__CORR__eArrayTypeToTArrayClass));
			}
		}
		return creatE__CORR__eArrayTypeToTArrayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCREATE__CORR__eArrayTypeToTArrayClass() {
		return creatE__CORR__eArrayTypeToTArrayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__eArrayTypeToTArrayClass(TypeToTAbstractType newCREATE__CORR__eArrayTypeToTArrayClass) {
		TypeToTAbstractType oldCREATE__CORR__eArrayTypeToTArrayClass = creatE__CORR__eArrayTypeToTArrayClass;
		creatE__CORR__eArrayTypeToTArrayClass = newCREATE__CORR__eArrayTypeToTArrayClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_CORR_EARRAY_TYPE_TO_TARRAY_CLASS,
					oldCREATE__CORR__eArrayTypeToTArrayClass, creatE__CORR__eArrayTypeToTArrayClass));
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
							ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH,
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
					ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH,
					oldCONTEXT__CORR__eModelToTypeGraph, contexT__CORR__eModelToTypeGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__eTypeToTArrayClass() {
		if (contexT__CORR__eTypeToTArrayClass != null && contexT__CORR__eTypeToTArrayClass.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eTypeToTArrayClass = (InternalEObject) contexT__CORR__eTypeToTArrayClass;
			contexT__CORR__eTypeToTArrayClass = (TypeToTAbstractType) eResolveProxy(
					oldCONTEXT__CORR__eTypeToTArrayClass);
			if (contexT__CORR__eTypeToTArrayClass != oldCONTEXT__CORR__eTypeToTArrayClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TARRAY_CLASS,
							oldCONTEXT__CORR__eTypeToTArrayClass, contexT__CORR__eTypeToTArrayClass));
			}
		}
		return contexT__CORR__eTypeToTArrayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__eTypeToTArrayClass() {
		return contexT__CORR__eTypeToTArrayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eTypeToTArrayClass(TypeToTAbstractType newCONTEXT__CORR__eTypeToTArrayClass) {
		TypeToTAbstractType oldCONTEXT__CORR__eTypeToTArrayClass = contexT__CORR__eTypeToTArrayClass;
		contexT__CORR__eTypeToTArrayClass = newCONTEXT__CORR__eTypeToTArrayClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TARRAY_CLASS,
					oldCONTEXT__CORR__eTypeToTArrayClass, contexT__CORR__eTypeToTArrayClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_EARRAY_TYPE:
			if (resolve)
				return getCREATE__SRC__eArrayType();
			return basicGetCREATE__SRC__eArrayType();
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL:
			if (resolve)
				return getCONTEXT__SRC__eModel();
			return basicGetCONTEXT__SRC__eModel();
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE:
			if (resolve)
				return getCONTEXT__SRC__eType();
			return basicGetCONTEXT__SRC__eType();
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS:
			if (resolve)
				return getCREATE__SRC__eTypeAccess();
			return basicGetCREATE__SRC__eTypeAccess();
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TARRAY_CLASS:
			if (resolve)
				return getCONTEXT__TRG__tArrayClass();
			return basicGetCONTEXT__TRG__tArrayClass();
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			if (resolve)
				return getCONTEXT__TRG__typeGraph();
			return basicGetCONTEXT__TRG__typeGraph();
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_CORR_EARRAY_TYPE_TO_TARRAY_CLASS:
			if (resolve)
				return getCREATE__CORR__eArrayTypeToTArrayClass();
			return basicGetCREATE__CORR__eArrayTypeToTArrayClass();
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH:
			if (resolve)
				return getCONTEXT__CORR__eModelToTypeGraph();
			return basicGetCONTEXT__CORR__eModelToTypeGraph();
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TARRAY_CLASS:
			if (resolve)
				return getCONTEXT__CORR__eTypeToTArrayClass();
			return basicGetCONTEXT__CORR__eTypeToTArrayClass();
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
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_EARRAY_TYPE:
			setCREATE__SRC__eArrayType((ArrayType) newValue);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL:
			setCONTEXT__SRC__eModel((Model) newValue);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE:
			setCONTEXT__SRC__eType((Type) newValue);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS:
			setCREATE__SRC__eTypeAccess((TypeAccess) newValue);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TARRAY_CLASS:
			setCONTEXT__TRG__tArrayClass((TAbstractType) newValue);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_CORR_EARRAY_TYPE_TO_TARRAY_CLASS:
			setCREATE__CORR__eArrayTypeToTArrayClass((TypeToTAbstractType) newValue);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH:
			setCONTEXT__CORR__eModelToTypeGraph((ModelToTypeGraph) newValue);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TARRAY_CLASS:
			setCONTEXT__CORR__eTypeToTArrayClass((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_EARRAY_TYPE:
			setCREATE__SRC__eArrayType((ArrayType) null);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL:
			setCONTEXT__SRC__eModel((Model) null);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE:
			setCONTEXT__SRC__eType((Type) null);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS:
			setCREATE__SRC__eTypeAccess((TypeAccess) null);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TARRAY_CLASS:
			setCONTEXT__TRG__tArrayClass((TAbstractType) null);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) null);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_CORR_EARRAY_TYPE_TO_TARRAY_CLASS:
			setCREATE__CORR__eArrayTypeToTArrayClass((TypeToTAbstractType) null);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH:
			setCONTEXT__CORR__eModelToTypeGraph((ModelToTypeGraph) null);
			return;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TARRAY_CLASS:
			setCONTEXT__CORR__eTypeToTArrayClass((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_EARRAY_TYPE:
			return creatE__SRC__eArrayType != null;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL:
			return contexT__SRC__eModel != null;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE:
			return contexT__SRC__eType != null;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS:
			return creatE__SRC__eTypeAccess != null;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TARRAY_CLASS:
			return contexT__TRG__tArrayClass != null;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			return contexT__TRG__typeGraph != null;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CREATE_CORR_EARRAY_TYPE_TO_TARRAY_CLASS:
			return creatE__CORR__eArrayTypeToTArrayClass != null;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_TYPE_GRAPH:
			return contexT__CORR__eModelToTypeGraph != null;
		case ModiscoTGGPackage.ARRAY_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TARRAY_CLASS:
			return contexT__CORR__eTypeToTArrayClass != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayTypeToClass__MarkerImpl
