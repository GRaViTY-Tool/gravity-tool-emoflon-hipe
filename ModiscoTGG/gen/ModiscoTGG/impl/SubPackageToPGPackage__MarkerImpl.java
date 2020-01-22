/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.PackageToTPackage;
import ModiscoTGG.SubPackageToPGPackage__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Package To PG Package Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.SubPackageToPGPackage__MarkerImpl#getCREATE__SRC__mPackage <em>CREATE SRC mPackage</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SubPackageToPGPackage__MarkerImpl#getCONTEXT__SRC__mParentPackage <em>CONTEXT SRC mParent Package</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SubPackageToPGPackage__MarkerImpl#getCONTEXT__TRG__tParent <em>CONTEXT TRG tParent</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SubPackageToPGPackage__MarkerImpl#getCREATE__TRG__tSub <em>CREATE TRG tSub</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SubPackageToPGPackage__MarkerImpl#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SubPackageToPGPackage__MarkerImpl#getCREATE__CORR__mPackageToTSub <em>CREATE CORR mPackage To TSub</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SubPackageToPGPackage__MarkerImpl#getCONTEXT__CORR__mParentPackageToTParent <em>CONTEXT CORR mParent Package To TParent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubPackageToPGPackage__MarkerImpl extends TGGRuleApplicationImpl implements SubPackageToPGPackage__Marker {
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
	 * The cached value of the '{@link #getCONTEXT__SRC__mParentPackage() <em>CONTEXT SRC mParent Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mParentPackage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.java.Package contexT__SRC__mParentPackage;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tParent() <em>CONTEXT TRG tParent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tParent()
	 * @generated
	 * @ordered
	 */
	protected TPackage contexT__TRG__tParent;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tSub() <em>CREATE TRG tSub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tSub()
	 * @generated
	 * @ordered
	 */
	protected TPackage creatE__TRG__tSub;

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
	 * The cached value of the '{@link #getCREATE__CORR__mPackageToTSub() <em>CREATE CORR mPackage To TSub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mPackageToTSub()
	 * @generated
	 * @ordered
	 */
	protected PackageToTPackage creatE__CORR__mPackageToTSub;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mParentPackageToTParent() <em>CONTEXT CORR mParent Package To TParent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mParentPackageToTParent()
	 * @generated
	 * @ordered
	 */
	protected PackageToTPackage contexT__CORR__mParentPackageToTParent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubPackageToPGPackage__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getSubPackageToPGPackage__Marker();
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
							ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE,
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
					ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE, oldCREATE__SRC__mPackage,
					creatE__SRC__mPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.modisco.java.Package getCONTEXT__SRC__mParentPackage() {
		if (contexT__SRC__mParentPackage != null && contexT__SRC__mParentPackage.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mParentPackage = (InternalEObject) contexT__SRC__mParentPackage;
			contexT__SRC__mParentPackage = (org.eclipse.modisco.java.Package) eResolveProxy(
					oldCONTEXT__SRC__mParentPackage);
			if (contexT__SRC__mParentPackage != oldCONTEXT__SRC__mParentPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MPARENT_PACKAGE,
							oldCONTEXT__SRC__mParentPackage, contexT__SRC__mParentPackage));
			}
		}
		return contexT__SRC__mParentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.java.Package basicGetCONTEXT__SRC__mParentPackage() {
		return contexT__SRC__mParentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mParentPackage(org.eclipse.modisco.java.Package newCONTEXT__SRC__mParentPackage) {
		org.eclipse.modisco.java.Package oldCONTEXT__SRC__mParentPackage = contexT__SRC__mParentPackage;
		contexT__SRC__mParentPackage = newCONTEXT__SRC__mParentPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MPARENT_PACKAGE,
					oldCONTEXT__SRC__mParentPackage, contexT__SRC__mParentPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getCONTEXT__TRG__tParent() {
		if (contexT__TRG__tParent != null && contexT__TRG__tParent.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tParent = (InternalEObject) contexT__TRG__tParent;
			contexT__TRG__tParent = (TPackage) eResolveProxy(oldCONTEXT__TRG__tParent);
			if (contexT__TRG__tParent != oldCONTEXT__TRG__tParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TPARENT,
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
	public TPackage basicGetCONTEXT__TRG__tParent() {
		return contexT__TRG__tParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tParent(TPackage newCONTEXT__TRG__tParent) {
		TPackage oldCONTEXT__TRG__tParent = contexT__TRG__tParent;
		contexT__TRG__tParent = newCONTEXT__TRG__tParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TPARENT, oldCONTEXT__TRG__tParent,
					contexT__TRG__tParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getCREATE__TRG__tSub() {
		if (creatE__TRG__tSub != null && creatE__TRG__tSub.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tSub = (InternalEObject) creatE__TRG__tSub;
			creatE__TRG__tSub = (TPackage) eResolveProxy(oldCREATE__TRG__tSub);
			if (creatE__TRG__tSub != oldCREATE__TRG__tSub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TSUB, oldCREATE__TRG__tSub,
							creatE__TRG__tSub));
			}
		}
		return creatE__TRG__tSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage basicGetCREATE__TRG__tSub() {
		return creatE__TRG__tSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tSub(TPackage newCREATE__TRG__tSub) {
		TPackage oldCREATE__TRG__tSub = creatE__TRG__tSub;
		creatE__TRG__tSub = newCREATE__TRG__tSub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TSUB, oldCREATE__TRG__tSub,
					creatE__TRG__tSub));
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
							ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH,
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
					ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH,
					oldCONTEXT__TRG__typeGraph, contexT__TRG__typeGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageToTPackage getCREATE__CORR__mPackageToTSub() {
		if (creatE__CORR__mPackageToTSub != null && creatE__CORR__mPackageToTSub.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mPackageToTSub = (InternalEObject) creatE__CORR__mPackageToTSub;
			creatE__CORR__mPackageToTSub = (PackageToTPackage) eResolveProxy(oldCREATE__CORR__mPackageToTSub);
			if (creatE__CORR__mPackageToTSub != oldCREATE__CORR__mPackageToTSub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TSUB,
							oldCREATE__CORR__mPackageToTSub, creatE__CORR__mPackageToTSub));
			}
		}
		return creatE__CORR__mPackageToTSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageToTPackage basicGetCREATE__CORR__mPackageToTSub() {
		return creatE__CORR__mPackageToTSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mPackageToTSub(PackageToTPackage newCREATE__CORR__mPackageToTSub) {
		PackageToTPackage oldCREATE__CORR__mPackageToTSub = creatE__CORR__mPackageToTSub;
		creatE__CORR__mPackageToTSub = newCREATE__CORR__mPackageToTSub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TSUB,
					oldCREATE__CORR__mPackageToTSub, creatE__CORR__mPackageToTSub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageToTPackage getCONTEXT__CORR__mParentPackageToTParent() {
		if (contexT__CORR__mParentPackageToTParent != null && contexT__CORR__mParentPackageToTParent.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mParentPackageToTParent = (InternalEObject) contexT__CORR__mParentPackageToTParent;
			contexT__CORR__mParentPackageToTParent = (PackageToTPackage) eResolveProxy(
					oldCONTEXT__CORR__mParentPackageToTParent);
			if (contexT__CORR__mParentPackageToTParent != oldCONTEXT__CORR__mParentPackageToTParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MPARENT_PACKAGE_TO_TPARENT,
							oldCONTEXT__CORR__mParentPackageToTParent, contexT__CORR__mParentPackageToTParent));
			}
		}
		return contexT__CORR__mParentPackageToTParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageToTPackage basicGetCONTEXT__CORR__mParentPackageToTParent() {
		return contexT__CORR__mParentPackageToTParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mParentPackageToTParent(PackageToTPackage newCONTEXT__CORR__mParentPackageToTParent) {
		PackageToTPackage oldCONTEXT__CORR__mParentPackageToTParent = contexT__CORR__mParentPackageToTParent;
		contexT__CORR__mParentPackageToTParent = newCONTEXT__CORR__mParentPackageToTParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MPARENT_PACKAGE_TO_TPARENT,
					oldCONTEXT__CORR__mParentPackageToTParent, contexT__CORR__mParentPackageToTParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE:
			if (resolve)
				return getCREATE__SRC__mPackage();
			return basicGetCREATE__SRC__mPackage();
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MPARENT_PACKAGE:
			if (resolve)
				return getCONTEXT__SRC__mParentPackage();
			return basicGetCONTEXT__SRC__mParentPackage();
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TPARENT:
			if (resolve)
				return getCONTEXT__TRG__tParent();
			return basicGetCONTEXT__TRG__tParent();
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TSUB:
			if (resolve)
				return getCREATE__TRG__tSub();
			return basicGetCREATE__TRG__tSub();
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			if (resolve)
				return getCONTEXT__TRG__typeGraph();
			return basicGetCONTEXT__TRG__typeGraph();
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TSUB:
			if (resolve)
				return getCREATE__CORR__mPackageToTSub();
			return basicGetCREATE__CORR__mPackageToTSub();
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MPARENT_PACKAGE_TO_TPARENT:
			if (resolve)
				return getCONTEXT__CORR__mParentPackageToTParent();
			return basicGetCONTEXT__CORR__mParentPackageToTParent();
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
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE:
			setCREATE__SRC__mPackage((org.eclipse.modisco.java.Package) newValue);
			return;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MPARENT_PACKAGE:
			setCONTEXT__SRC__mParentPackage((org.eclipse.modisco.java.Package) newValue);
			return;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TPARENT:
			setCONTEXT__TRG__tParent((TPackage) newValue);
			return;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TSUB:
			setCREATE__TRG__tSub((TPackage) newValue);
			return;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TSUB:
			setCREATE__CORR__mPackageToTSub((PackageToTPackage) newValue);
			return;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MPARENT_PACKAGE_TO_TPARENT:
			setCONTEXT__CORR__mParentPackageToTParent((PackageToTPackage) newValue);
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
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE:
			setCREATE__SRC__mPackage((org.eclipse.modisco.java.Package) null);
			return;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MPARENT_PACKAGE:
			setCONTEXT__SRC__mParentPackage((org.eclipse.modisco.java.Package) null);
			return;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TPARENT:
			setCONTEXT__TRG__tParent((TPackage) null);
			return;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TSUB:
			setCREATE__TRG__tSub((TPackage) null);
			return;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) null);
			return;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TSUB:
			setCREATE__CORR__mPackageToTSub((PackageToTPackage) null);
			return;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MPARENT_PACKAGE_TO_TPARENT:
			setCONTEXT__CORR__mParentPackageToTParent((PackageToTPackage) null);
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
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_SRC_MPACKAGE:
			return creatE__SRC__mPackage != null;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_SRC_MPARENT_PACKAGE:
			return contexT__SRC__mParentPackage != null;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TPARENT:
			return contexT__TRG__tParent != null;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_TRG_TSUB:
			return creatE__TRG__tSub != null;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			return contexT__TRG__typeGraph != null;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CREATE_CORR_MPACKAGE_TO_TSUB:
			return creatE__CORR__mPackageToTSub != null;
		case ModiscoTGGPackage.SUB_PACKAGE_TO_PG_PACKAGE_MARKER__CONTEXT_CORR_MPARENT_PACKAGE_TO_TPARENT:
			return contexT__CORR__mParentPackageToTParent != null;
		}
		return super.eIsSet(featureID);
	}

} //SubPackageToPGPackage__MarkerImpl
