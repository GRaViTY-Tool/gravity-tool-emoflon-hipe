/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ModelToTypeGraph;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.PackageToPGPackage__Marker;
import ModiscoTGG.PackageToTPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Model;

import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package To PG Package Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.PackageToPGPackage__MarkerImpl#getCONTEXT__SRC__mModel <em>CONTEXT SRC mModel</em>}</li>
 *   <li>{@link ModiscoTGG.impl.PackageToPGPackage__MarkerImpl#getCREATE__SRC__mPackage <em>CREATE SRC mPackage</em>}</li>
 *   <li>{@link ModiscoTGG.impl.PackageToPGPackage__MarkerImpl#getCREATE__TRG__tPackage <em>CREATE TRG tPackage</em>}</li>
 *   <li>{@link ModiscoTGG.impl.PackageToPGPackage__MarkerImpl#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.impl.PackageToPGPackage__MarkerImpl#getCONTEXT__CORR__mModelToTypeGraph <em>CONTEXT CORR mModel To Type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.impl.PackageToPGPackage__MarkerImpl#getCREATE__CORR__mPackageToTPackage <em>CREATE CORR mPackage To TPackage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageToPGPackage__MarkerImpl extends TGGRuleApplicationImpl implements PackageToPGPackage__Marker {
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
	 * The cached value of the '{@link #getCREATE__SRC__mPackage() <em>CREATE SRC mPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mPackage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.java.Package creatE__SRC__mPackage;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tPackage() <em>CREATE TRG tPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tPackage()
	 * @generated
	 * @ordered
	 */
	protected TPackage creatE__TRG__tPackage;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__mModelToTypeGraph() <em>CONTEXT CORR mModel To Type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mModelToTypeGraph()
	 * @generated
	 * @ordered
	 */
	protected ModelToTypeGraph contexT__CORR__mModelToTypeGraph;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mPackageToTPackage() <em>CREATE CORR mPackage To TPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mPackageToTPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageToTPackage creatE__CORR__mPackageToTPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageToPGPackage__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getPackageToPGPackage__Marker();
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
							ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MMODEL, oldCONTEXT__SRC__mModel,
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
					ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MMODEL, oldCONTEXT__SRC__mModel,
					contexT__SRC__mModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.modisco.java.Package getCREATE__SRC__mPackage() {
		if (creatE__SRC__mPackage != null && creatE__SRC__mPackage.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mPackage = (InternalEObject) creatE__SRC__mPackage;
			creatE__SRC__mPackage = (org.eclipse.modisco.java.Package) eResolveProxy(oldCREATE__SRC__mPackage);
			if (creatE__SRC__mPackage != oldCREATE__SRC__mPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE,
							oldCREATE__SRC__mPackage, creatE__SRC__mPackage));
			}
		}
		return creatE__SRC__mPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.java.Package basicGetCREATE__SRC__mPackage() {
		return creatE__SRC__mPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mPackage(org.eclipse.modisco.java.Package newCREATE__SRC__mPackage) {
		org.eclipse.modisco.java.Package oldCREATE__SRC__mPackage = creatE__SRC__mPackage;
		creatE__SRC__mPackage = newCREATE__SRC__mPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE, oldCREATE__SRC__mPackage,
					creatE__SRC__mPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getCREATE__TRG__tPackage() {
		if (creatE__TRG__tPackage != null && creatE__TRG__tPackage.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tPackage = (InternalEObject) creatE__TRG__tPackage;
			creatE__TRG__tPackage = (TPackage) eResolveProxy(oldCREATE__TRG__tPackage);
			if (creatE__TRG__tPackage != oldCREATE__TRG__tPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TPACKAGE,
							oldCREATE__TRG__tPackage, creatE__TRG__tPackage));
			}
		}
		return creatE__TRG__tPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage basicGetCREATE__TRG__tPackage() {
		return creatE__TRG__tPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tPackage(TPackage newCREATE__TRG__tPackage) {
		TPackage oldCREATE__TRG__tPackage = creatE__TRG__tPackage;
		creatE__TRG__tPackage = newCREATE__TRG__tPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TPACKAGE, oldCREATE__TRG__tPackage,
					creatE__TRG__tPackage));
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
							ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH,
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
					ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH, oldCONTEXT__TRG__typeGraph,
					contexT__TRG__typeGraph));
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
							ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH,
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
					ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH,
					oldCONTEXT__CORR__mModelToTypeGraph, contexT__CORR__mModelToTypeGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageToTPackage getCREATE__CORR__mPackageToTPackage() {
		if (creatE__CORR__mPackageToTPackage != null && creatE__CORR__mPackageToTPackage.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mPackageToTPackage = (InternalEObject) creatE__CORR__mPackageToTPackage;
			creatE__CORR__mPackageToTPackage = (PackageToTPackage) eResolveProxy(oldCREATE__CORR__mPackageToTPackage);
			if (creatE__CORR__mPackageToTPackage != oldCREATE__CORR__mPackageToTPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TPACKAGE,
							oldCREATE__CORR__mPackageToTPackage, creatE__CORR__mPackageToTPackage));
			}
		}
		return creatE__CORR__mPackageToTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageToTPackage basicGetCREATE__CORR__mPackageToTPackage() {
		return creatE__CORR__mPackageToTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mPackageToTPackage(PackageToTPackage newCREATE__CORR__mPackageToTPackage) {
		PackageToTPackage oldCREATE__CORR__mPackageToTPackage = creatE__CORR__mPackageToTPackage;
		creatE__CORR__mPackageToTPackage = newCREATE__CORR__mPackageToTPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TPACKAGE,
					oldCREATE__CORR__mPackageToTPackage, creatE__CORR__mPackageToTPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MMODEL:
			if (resolve)
				return getCONTEXT__SRC__mModel();
			return basicGetCONTEXT__SRC__mModel();
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE:
			if (resolve)
				return getCREATE__SRC__mPackage();
			return basicGetCREATE__SRC__mPackage();
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TPACKAGE:
			if (resolve)
				return getCREATE__TRG__tPackage();
			return basicGetCREATE__TRG__tPackage();
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			if (resolve)
				return getCONTEXT__TRG__typeGraph();
			return basicGetCONTEXT__TRG__typeGraph();
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH:
			if (resolve)
				return getCONTEXT__CORR__mModelToTypeGraph();
			return basicGetCONTEXT__CORR__mModelToTypeGraph();
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TPACKAGE:
			if (resolve)
				return getCREATE__CORR__mPackageToTPackage();
			return basicGetCREATE__CORR__mPackageToTPackage();
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
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MMODEL:
			setCONTEXT__SRC__mModel((Model) newValue);
			return;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE:
			setCREATE__SRC__mPackage((org.eclipse.modisco.java.Package) newValue);
			return;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TPACKAGE:
			setCREATE__TRG__tPackage((TPackage) newValue);
			return;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH:
			setCONTEXT__CORR__mModelToTypeGraph((ModelToTypeGraph) newValue);
			return;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TPACKAGE:
			setCREATE__CORR__mPackageToTPackage((PackageToTPackage) newValue);
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
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MMODEL:
			setCONTEXT__SRC__mModel((Model) null);
			return;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE:
			setCREATE__SRC__mPackage((org.eclipse.modisco.java.Package) null);
			return;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TPACKAGE:
			setCREATE__TRG__tPackage((TPackage) null);
			return;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) null);
			return;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH:
			setCONTEXT__CORR__mModelToTypeGraph((ModelToTypeGraph) null);
			return;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TPACKAGE:
			setCREATE__CORR__mPackageToTPackage((PackageToTPackage) null);
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
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MMODEL:
			return contexT__SRC__mModel != null;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE:
			return creatE__SRC__mPackage != null;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TPACKAGE:
			return creatE__TRG__tPackage != null;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			return contexT__TRG__typeGraph != null;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MMODEL_TO_TYPE_GRAPH:
			return contexT__CORR__mModelToTypeGraph != null;
		case ModiscoTGGPackage.PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TPACKAGE:
			return creatE__CORR__mPackageToTPackage != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageToPGPackage__MarkerImpl
