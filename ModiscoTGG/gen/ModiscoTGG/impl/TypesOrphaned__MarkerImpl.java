/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ASTNodeToTAnnotatable;
import ModiscoTGG.ModelToTypeGraph;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;
import ModiscoTGG.TypesOrphaned__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Model;

import org.gravity.modisco.MClass;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types Orphaned Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.TypesOrphaned__MarkerImpl#getCONTEXT__SRC__mModel <em>CONTEXT SRC mModel</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypesOrphaned__MarkerImpl#getCREATE__SRC__mType <em>CREATE SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypesOrphaned__MarkerImpl#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypesOrphaned__MarkerImpl#getCREATE__TRG__tType <em>CREATE TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypesOrphaned__MarkerImpl#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypesOrphaned__MarkerImpl#getCONTEXT__CORR__mModelToTypeGraph <em>CONTEXT CORR mModel To Type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypesOrphaned__MarkerImpl#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypesOrphaned__MarkerImpl extends TGGRuleApplicationImpl implements TypesOrphaned__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mModel() <em>CONTEXT SRC mModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mModel()
	 * @generated
	 * @ordered
	 */
	protected Model contexT__SRC__mModel;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mType() <em>CREATE SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mType()
	 * @generated
	 * @ordered
	 */
	protected MClass creatE__SRC__mType;

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
	 * The cached value of the '{@link #getCREATE__TRG__tType() <em>CREATE TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tType()
	 * @generated
	 * @ordered
	 */
	protected TClass creatE__TRG__tType;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__mModelToTypeGraph() <em>CONTEXT CORR mModel To Type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mModelToTypeGraph()
	 * @generated
	 * @ordered
	 */
	protected ModelToTypeGraph contexT__CORR__mModelToTypeGraph;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mTypeToTType() <em>CREATE CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mTypeToTType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType creatE__CORR__mTypeToTType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesOrphaned__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getTypesOrphaned__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getCONTEXT__SRC__mModel() {
		if (contexT__SRC__mModel != null && contexT__SRC__mModel.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mModel = (InternalEObject) contexT__SRC__mModel;
			contexT__SRC__mModel = (Model) eResolveProxy(oldCONTEXT__SRC__mModel);
			if (contexT__SRC__mModel != oldCONTEXT__SRC__mModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_SRC_MMODEL, oldCONTEXT__SRC__mModel,
							contexT__SRC__mModel));
			}
		}
		return contexT__SRC__mModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetCONTEXT__SRC__mModel() {
		return contexT__SRC__mModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mModel(Model newCONTEXT__SRC__mModel) {
		Model oldCONTEXT__SRC__mModel = contexT__SRC__mModel;
		contexT__SRC__mModel = newCONTEXT__SRC__mModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_SRC_MMODEL, oldCONTEXT__SRC__mModel,
					contexT__SRC__mModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MClass getCREATE__SRC__mType() {
		if (creatE__SRC__mType != null && creatE__SRC__mType.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mType = (InternalEObject) creatE__SRC__mType;
			creatE__SRC__mType = (MClass) eResolveProxy(oldCREATE__SRC__mType);
			if (creatE__SRC__mType != oldCREATE__SRC__mType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_SRC_MTYPE, oldCREATE__SRC__mType,
							creatE__SRC__mType));
			}
		}
		return creatE__SRC__mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass basicGetCREATE__SRC__mType() {
		return creatE__SRC__mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mType(MClass newCREATE__SRC__mType) {
		MClass oldCREATE__SRC__mType = creatE__SRC__mType;
		creatE__SRC__mType = newCREATE__SRC__mType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_SRC_MTYPE, oldCREATE__SRC__mType,
					creatE__SRC__mType));
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
							ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_TRG_PG, oldCONTEXT__TRG__pg,
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
					ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_TRG_PG, oldCONTEXT__TRG__pg, contexT__TRG__pg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getCREATE__TRG__tType() {
		if (creatE__TRG__tType != null && creatE__TRG__tType.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tType = (InternalEObject) creatE__TRG__tType;
			creatE__TRG__tType = (TClass) eResolveProxy(oldCREATE__TRG__tType);
			if (creatE__TRG__tType != oldCREATE__TRG__tType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_TRG_TTYPE, oldCREATE__TRG__tType,
							creatE__TRG__tType));
			}
		}
		return creatE__TRG__tType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetCREATE__TRG__tType() {
		return creatE__TRG__tType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tType(TClass newCREATE__TRG__tType) {
		TClass oldCREATE__TRG__tType = creatE__TRG__tType;
		creatE__TRG__tType = newCREATE__TRG__tType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_TRG_TTYPE, oldCREATE__TRG__tType,
					creatE__TRG__tType));
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
							ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION,
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
					ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION,
					oldCREATE__CORR__mBodyToTAnnotation, creatE__CORR__mBodyToTAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelToTypeGraph getCONTEXT__CORR__mModelToTypeGraph() {
		if (contexT__CORR__mModelToTypeGraph != null && contexT__CORR__mModelToTypeGraph.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mModelToTypeGraph = (InternalEObject) contexT__CORR__mModelToTypeGraph;
			contexT__CORR__mModelToTypeGraph = (ModelToTypeGraph) eResolveProxy(oldCONTEXT__CORR__mModelToTypeGraph);
			if (contexT__CORR__mModelToTypeGraph != oldCONTEXT__CORR__mModelToTypeGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH,
							oldCONTEXT__CORR__mModelToTypeGraph, contexT__CORR__mModelToTypeGraph));
			}
		}
		return contexT__CORR__mModelToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelToTypeGraph basicGetCONTEXT__CORR__mModelToTypeGraph() {
		return contexT__CORR__mModelToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mModelToTypeGraph(ModelToTypeGraph newCONTEXT__CORR__mModelToTypeGraph) {
		ModelToTypeGraph oldCONTEXT__CORR__mModelToTypeGraph = contexT__CORR__mModelToTypeGraph;
		contexT__CORR__mModelToTypeGraph = newCONTEXT__CORR__mModelToTypeGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH,
					oldCONTEXT__CORR__mModelToTypeGraph, contexT__CORR__mModelToTypeGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCREATE__CORR__mTypeToTType() {
		if (creatE__CORR__mTypeToTType != null && creatE__CORR__mTypeToTType.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mTypeToTType = (InternalEObject) creatE__CORR__mTypeToTType;
			creatE__CORR__mTypeToTType = (TypeToTAbstractType) eResolveProxy(oldCREATE__CORR__mTypeToTType);
			if (creatE__CORR__mTypeToTType != oldCREATE__CORR__mTypeToTType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_CORR_MTYPE_TO_TTYPE,
							oldCREATE__CORR__mTypeToTType, creatE__CORR__mTypeToTType));
			}
		}
		return creatE__CORR__mTypeToTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCREATE__CORR__mTypeToTType() {
		return creatE__CORR__mTypeToTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mTypeToTType(TypeToTAbstractType newCREATE__CORR__mTypeToTType) {
		TypeToTAbstractType oldCREATE__CORR__mTypeToTType = creatE__CORR__mTypeToTType;
		creatE__CORR__mTypeToTType = newCREATE__CORR__mTypeToTType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_CORR_MTYPE_TO_TTYPE, oldCREATE__CORR__mTypeToTType,
					creatE__CORR__mTypeToTType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_SRC_MMODEL:
			if (resolve)
				return getCONTEXT__SRC__mModel();
			return basicGetCONTEXT__SRC__mModel();
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_SRC_MTYPE:
			if (resolve)
				return getCREATE__SRC__mType();
			return basicGetCREATE__SRC__mType();
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_TRG_PG:
			if (resolve)
				return getCONTEXT__TRG__pg();
			return basicGetCONTEXT__TRG__pg();
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_TRG_TTYPE:
			if (resolve)
				return getCREATE__TRG__tType();
			return basicGetCREATE__TRG__tType();
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			if (resolve)
				return getCREATE__CORR__mBodyToTAnnotation();
			return basicGetCREATE__CORR__mBodyToTAnnotation();
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH:
			if (resolve)
				return getCONTEXT__CORR__mModelToTypeGraph();
			return basicGetCONTEXT__CORR__mModelToTypeGraph();
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_CORR_MTYPE_TO_TTYPE:
			if (resolve)
				return getCREATE__CORR__mTypeToTType();
			return basicGetCREATE__CORR__mTypeToTType();
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
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_SRC_MMODEL:
			setCONTEXT__SRC__mModel((Model) newValue);
			return;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_SRC_MTYPE:
			setCREATE__SRC__mType((MClass) newValue);
			return;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_TRG_TTYPE:
			setCREATE__TRG__tType((TClass) newValue);
			return;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			setCREATE__CORR__mBodyToTAnnotation((ASTNodeToTAnnotatable) newValue);
			return;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH:
			setCONTEXT__CORR__mModelToTypeGraph((ModelToTypeGraph) newValue);
			return;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_CORR_MTYPE_TO_TTYPE:
			setCREATE__CORR__mTypeToTType((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_SRC_MMODEL:
			setCONTEXT__SRC__mModel((Model) null);
			return;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_SRC_MTYPE:
			setCREATE__SRC__mType((MClass) null);
			return;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) null);
			return;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_TRG_TTYPE:
			setCREATE__TRG__tType((TClass) null);
			return;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			setCREATE__CORR__mBodyToTAnnotation((ASTNodeToTAnnotatable) null);
			return;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH:
			setCONTEXT__CORR__mModelToTypeGraph((ModelToTypeGraph) null);
			return;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_CORR_MTYPE_TO_TTYPE:
			setCREATE__CORR__mTypeToTType((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_SRC_MMODEL:
			return contexT__SRC__mModel != null;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_SRC_MTYPE:
			return creatE__SRC__mType != null;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_TRG_PG:
			return contexT__TRG__pg != null;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_TRG_TTYPE:
			return creatE__TRG__tType != null;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			return creatE__CORR__mBodyToTAnnotation != null;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH:
			return contexT__CORR__mModelToTypeGraph != null;
		case ModiscoTGGPackage.TYPES_ORPHANED_MARKER__CREATE_CORR_MTYPE_TO_TTYPE:
			return creatE__CORR__mTypeToTType != null;
		}
		return super.eIsSet(featureID);
	}

} //TypesOrphaned__MarkerImpl
