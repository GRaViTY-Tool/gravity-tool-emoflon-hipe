/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MMethodNameToTMethod;
import ModiscoTGG.MethodName__Marker;
import ModiscoTGG.ModelToTypeGraph;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodName;

import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Name Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.MethodName__MarkerImpl#getCONTEXT__SRC__mModel <em>CONTEXT SRC mModel</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodName__MarkerImpl#getCREATE__SRC__mName <em>CREATE SRC mName</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodName__MarkerImpl#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodName__MarkerImpl#getCREATE__TRG__tName <em>CREATE TRG tName</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodName__MarkerImpl#getCREATE__CORR__mNameToTName <em>CREATE CORR mName To TName</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodName__MarkerImpl#getCONTEXT__CORR__modelToPg <em>CONTEXT CORR model To Pg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodName__MarkerImpl extends TGGRuleApplicationImpl implements MethodName__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mModel() <em>CONTEXT SRC mModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mModel()
	 * @generated
	 * @ordered
	 */
	protected MGravityModel contexT__SRC__mModel;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mName() <em>CREATE SRC mName</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mName()
	 * @generated
	 * @ordered
	 */
	protected MMethodName creatE__SRC__mName;

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
	 * The cached value of the '{@link #getCREATE__TRG__tName() <em>CREATE TRG tName</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tName()
	 * @generated
	 * @ordered
	 */
	protected TMethod creatE__TRG__tName;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mNameToTName() <em>CREATE CORR mName To TName</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mNameToTName()
	 * @generated
	 * @ordered
	 */
	protected MMethodNameToTMethod creatE__CORR__mNameToTName;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__modelToPg() <em>CONTEXT CORR model To Pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__modelToPg()
	 * @generated
	 * @ordered
	 */
	protected ModelToTypeGraph contexT__CORR__modelToPg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodName__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getMethodName__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MGravityModel getCONTEXT__SRC__mModel() {
		if (contexT__SRC__mModel != null && contexT__SRC__mModel.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mModel = (InternalEObject) contexT__SRC__mModel;
			contexT__SRC__mModel = (MGravityModel) eResolveProxy(oldCONTEXT__SRC__mModel);
			if (contexT__SRC__mModel != oldCONTEXT__SRC__mModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_SRC_MMODEL, oldCONTEXT__SRC__mModel,
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
	public MGravityModel basicGetCONTEXT__SRC__mModel() {
		return contexT__SRC__mModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mModel(MGravityModel newCONTEXT__SRC__mModel) {
		MGravityModel oldCONTEXT__SRC__mModel = contexT__SRC__mModel;
		contexT__SRC__mModel = newCONTEXT__SRC__mModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_SRC_MMODEL, oldCONTEXT__SRC__mModel,
					contexT__SRC__mModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodName getCREATE__SRC__mName() {
		if (creatE__SRC__mName != null && creatE__SRC__mName.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mName = (InternalEObject) creatE__SRC__mName;
			creatE__SRC__mName = (MMethodName) eResolveProxy(oldCREATE__SRC__mName);
			if (creatE__SRC__mName != oldCREATE__SRC__mName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_SRC_MNAME, oldCREATE__SRC__mName,
							creatE__SRC__mName));
			}
		}
		return creatE__SRC__mName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodName basicGetCREATE__SRC__mName() {
		return creatE__SRC__mName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mName(MMethodName newCREATE__SRC__mName) {
		MMethodName oldCREATE__SRC__mName = creatE__SRC__mName;
		creatE__SRC__mName = newCREATE__SRC__mName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_SRC_MNAME, oldCREATE__SRC__mName, creatE__SRC__mName));
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
							ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_TRG_PG, oldCONTEXT__TRG__pg,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_TRG_PG,
					oldCONTEXT__TRG__pg, contexT__TRG__pg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethod getCREATE__TRG__tName() {
		if (creatE__TRG__tName != null && creatE__TRG__tName.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tName = (InternalEObject) creatE__TRG__tName;
			creatE__TRG__tName = (TMethod) eResolveProxy(oldCREATE__TRG__tName);
			if (creatE__TRG__tName != oldCREATE__TRG__tName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_TRG_TNAME, oldCREATE__TRG__tName,
							creatE__TRG__tName));
			}
		}
		return creatE__TRG__tName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethod basicGetCREATE__TRG__tName() {
		return creatE__TRG__tName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tName(TMethod newCREATE__TRG__tName) {
		TMethod oldCREATE__TRG__tName = creatE__TRG__tName;
		creatE__TRG__tName = newCREATE__TRG__tName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_TRG_TNAME, oldCREATE__TRG__tName, creatE__TRG__tName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodNameToTMethod getCREATE__CORR__mNameToTName() {
		if (creatE__CORR__mNameToTName != null && creatE__CORR__mNameToTName.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mNameToTName = (InternalEObject) creatE__CORR__mNameToTName;
			creatE__CORR__mNameToTName = (MMethodNameToTMethod) eResolveProxy(oldCREATE__CORR__mNameToTName);
			if (creatE__CORR__mNameToTName != oldCREATE__CORR__mNameToTName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_CORR_MNAME_TO_TNAME,
							oldCREATE__CORR__mNameToTName, creatE__CORR__mNameToTName));
			}
		}
		return creatE__CORR__mNameToTName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodNameToTMethod basicGetCREATE__CORR__mNameToTName() {
		return creatE__CORR__mNameToTName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mNameToTName(MMethodNameToTMethod newCREATE__CORR__mNameToTName) {
		MMethodNameToTMethod oldCREATE__CORR__mNameToTName = creatE__CORR__mNameToTName;
		creatE__CORR__mNameToTName = newCREATE__CORR__mNameToTName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_CORR_MNAME_TO_TNAME, oldCREATE__CORR__mNameToTName,
					creatE__CORR__mNameToTName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelToTypeGraph getCONTEXT__CORR__modelToPg() {
		if (contexT__CORR__modelToPg != null && contexT__CORR__modelToPg.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__modelToPg = (InternalEObject) contexT__CORR__modelToPg;
			contexT__CORR__modelToPg = (ModelToTypeGraph) eResolveProxy(oldCONTEXT__CORR__modelToPg);
			if (contexT__CORR__modelToPg != oldCONTEXT__CORR__modelToPg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_PG, oldCONTEXT__CORR__modelToPg,
							contexT__CORR__modelToPg));
			}
		}
		return contexT__CORR__modelToPg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelToTypeGraph basicGetCONTEXT__CORR__modelToPg() {
		return contexT__CORR__modelToPg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__modelToPg(ModelToTypeGraph newCONTEXT__CORR__modelToPg) {
		ModelToTypeGraph oldCONTEXT__CORR__modelToPg = contexT__CORR__modelToPg;
		contexT__CORR__modelToPg = newCONTEXT__CORR__modelToPg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_PG, oldCONTEXT__CORR__modelToPg,
					contexT__CORR__modelToPg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_SRC_MMODEL:
			if (resolve)
				return getCONTEXT__SRC__mModel();
			return basicGetCONTEXT__SRC__mModel();
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_SRC_MNAME:
			if (resolve)
				return getCREATE__SRC__mName();
			return basicGetCREATE__SRC__mName();
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_TRG_PG:
			if (resolve)
				return getCONTEXT__TRG__pg();
			return basicGetCONTEXT__TRG__pg();
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_TRG_TNAME:
			if (resolve)
				return getCREATE__TRG__tName();
			return basicGetCREATE__TRG__tName();
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_CORR_MNAME_TO_TNAME:
			if (resolve)
				return getCREATE__CORR__mNameToTName();
			return basicGetCREATE__CORR__mNameToTName();
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_PG:
			if (resolve)
				return getCONTEXT__CORR__modelToPg();
			return basicGetCONTEXT__CORR__modelToPg();
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
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_SRC_MMODEL:
			setCONTEXT__SRC__mModel((MGravityModel) newValue);
			return;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_SRC_MNAME:
			setCREATE__SRC__mName((MMethodName) newValue);
			return;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_TRG_TNAME:
			setCREATE__TRG__tName((TMethod) newValue);
			return;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_CORR_MNAME_TO_TNAME:
			setCREATE__CORR__mNameToTName((MMethodNameToTMethod) newValue);
			return;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_PG:
			setCONTEXT__CORR__modelToPg((ModelToTypeGraph) newValue);
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
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_SRC_MMODEL:
			setCONTEXT__SRC__mModel((MGravityModel) null);
			return;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_SRC_MNAME:
			setCREATE__SRC__mName((MMethodName) null);
			return;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) null);
			return;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_TRG_TNAME:
			setCREATE__TRG__tName((TMethod) null);
			return;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_CORR_MNAME_TO_TNAME:
			setCREATE__CORR__mNameToTName((MMethodNameToTMethod) null);
			return;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_PG:
			setCONTEXT__CORR__modelToPg((ModelToTypeGraph) null);
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
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_SRC_MMODEL:
			return contexT__SRC__mModel != null;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_SRC_MNAME:
			return creatE__SRC__mName != null;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_TRG_PG:
			return contexT__TRG__pg != null;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_TRG_TNAME:
			return creatE__TRG__tName != null;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CREATE_CORR_MNAME_TO_TNAME:
			return creatE__CORR__mNameToTName != null;
		case ModiscoTGGPackage.METHOD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_PG:
			return contexT__CORR__modelToPg != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodName__MarkerImpl
