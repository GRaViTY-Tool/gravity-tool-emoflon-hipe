/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ModelToPg__Marker;
import ModiscoTGG.ModelToTypeGraph;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MGravityModel;

import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model To Pg Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.ModelToPg__MarkerImpl#getCREATE__SRC__mModel <em>CREATE SRC mModel</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ModelToPg__MarkerImpl#getCREATE__TRG__tPG <em>CREATE TRG tPG</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ModelToPg__MarkerImpl#getCREATE__CORR__mModelToTPG <em>CREATE CORR mModel To TPG</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelToPg__MarkerImpl extends TGGRuleApplicationImpl implements ModelToPg__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__mModel() <em>CREATE SRC mModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mModel()
	 * @generated
	 * @ordered
	 */
	protected MGravityModel creatE__SRC__mModel;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tPG() <em>CREATE TRG tPG</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tPG()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph creatE__TRG__tPG;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mModelToTPG() <em>CREATE CORR mModel To TPG</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mModelToTPG()
	 * @generated
	 * @ordered
	 */
	protected ModelToTypeGraph creatE__CORR__mModelToTPG;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelToPg__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getModelToPg__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MGravityModel getCREATE__SRC__mModel() {
		if (creatE__SRC__mModel != null && creatE__SRC__mModel.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mModel = (InternalEObject) creatE__SRC__mModel;
			creatE__SRC__mModel = (MGravityModel) eResolveProxy(oldCREATE__SRC__mModel);
			if (creatE__SRC__mModel != oldCREATE__SRC__mModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_SRC_MMODEL, oldCREATE__SRC__mModel,
							creatE__SRC__mModel));
			}
		}
		return creatE__SRC__mModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGravityModel basicGetCREATE__SRC__mModel() {
		return creatE__SRC__mModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mModel(MGravityModel newCREATE__SRC__mModel) {
		MGravityModel oldCREATE__SRC__mModel = creatE__SRC__mModel;
		creatE__SRC__mModel = newCREATE__SRC__mModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_SRC_MMODEL, oldCREATE__SRC__mModel,
					creatE__SRC__mModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getCREATE__TRG__tPG() {
		if (creatE__TRG__tPG != null && creatE__TRG__tPG.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tPG = (InternalEObject) creatE__TRG__tPG;
			creatE__TRG__tPG = (TypeGraph) eResolveProxy(oldCREATE__TRG__tPG);
			if (creatE__TRG__tPG != oldCREATE__TRG__tPG) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_TRG_TPG, oldCREATE__TRG__tPG,
							creatE__TRG__tPG));
			}
		}
		return creatE__TRG__tPG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph basicGetCREATE__TRG__tPG() {
		return creatE__TRG__tPG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tPG(TypeGraph newCREATE__TRG__tPG) {
		TypeGraph oldCREATE__TRG__tPG = creatE__TRG__tPG;
		creatE__TRG__tPG = newCREATE__TRG__tPG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_TRG_TPG,
					oldCREATE__TRG__tPG, creatE__TRG__tPG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelToTypeGraph getCREATE__CORR__mModelToTPG() {
		if (creatE__CORR__mModelToTPG != null && creatE__CORR__mModelToTPG.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mModelToTPG = (InternalEObject) creatE__CORR__mModelToTPG;
			creatE__CORR__mModelToTPG = (ModelToTypeGraph) eResolveProxy(oldCREATE__CORR__mModelToTPG);
			if (creatE__CORR__mModelToTPG != oldCREATE__CORR__mModelToTPG) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_CORR_MMODEL_TO_TPG,
							oldCREATE__CORR__mModelToTPG, creatE__CORR__mModelToTPG));
			}
		}
		return creatE__CORR__mModelToTPG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelToTypeGraph basicGetCREATE__CORR__mModelToTPG() {
		return creatE__CORR__mModelToTPG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mModelToTPG(ModelToTypeGraph newCREATE__CORR__mModelToTPG) {
		ModelToTypeGraph oldCREATE__CORR__mModelToTPG = creatE__CORR__mModelToTPG;
		creatE__CORR__mModelToTPG = newCREATE__CORR__mModelToTPG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_CORR_MMODEL_TO_TPG, oldCREATE__CORR__mModelToTPG,
					creatE__CORR__mModelToTPG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_SRC_MMODEL:
			if (resolve)
				return getCREATE__SRC__mModel();
			return basicGetCREATE__SRC__mModel();
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_TRG_TPG:
			if (resolve)
				return getCREATE__TRG__tPG();
			return basicGetCREATE__TRG__tPG();
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_CORR_MMODEL_TO_TPG:
			if (resolve)
				return getCREATE__CORR__mModelToTPG();
			return basicGetCREATE__CORR__mModelToTPG();
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
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_SRC_MMODEL:
			setCREATE__SRC__mModel((MGravityModel) newValue);
			return;
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_TRG_TPG:
			setCREATE__TRG__tPG((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_CORR_MMODEL_TO_TPG:
			setCREATE__CORR__mModelToTPG((ModelToTypeGraph) newValue);
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
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_SRC_MMODEL:
			setCREATE__SRC__mModel((MGravityModel) null);
			return;
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_TRG_TPG:
			setCREATE__TRG__tPG((TypeGraph) null);
			return;
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_CORR_MMODEL_TO_TPG:
			setCREATE__CORR__mModelToTPG((ModelToTypeGraph) null);
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
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_SRC_MMODEL:
			return creatE__SRC__mModel != null;
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_TRG_TPG:
			return creatE__TRG__tPG != null;
		case ModiscoTGGPackage.MODEL_TO_PG_MARKER__CREATE_CORR_MMODEL_TO_TPG:
			return creatE__CORR__mModelToTPG != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelToPg__MarkerImpl
