/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ModelToTypeGraph;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeParameter__Marker;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.TypeParameter;

import org.gravity.modisco.MGravityModel;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.TypeParameter__MarkerImpl#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypeParameter__MarkerImpl#getCREATE__SRC__typeParameter <em>CREATE SRC type Parameter</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypeParameter__MarkerImpl#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypeParameter__MarkerImpl#getCREATE__TRG__tClass <em>CREATE TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypeParameter__MarkerImpl#getCREATE__CORR__eAnonymousClassDeclarationToTClass <em>CREATE CORR eAnonymous Class Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TypeParameter__MarkerImpl#getCONTEXT__CORR__eModelToPg <em>CONTEXT CORR eModel To Pg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameter__MarkerImpl extends TGGRuleApplicationImpl implements TypeParameter__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__eModel() <em>CONTEXT SRC eModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eModel()
	 * @generated
	 * @ordered
	 */
	protected MGravityModel contexT__SRC__eModel;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__typeParameter() <em>CREATE SRC type Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__typeParameter()
	 * @generated
	 * @ordered
	 */
	protected TypeParameter creatE__SRC__typeParameter;

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
	 * The cached value of the '{@link #getCREATE__TRG__tClass() <em>CREATE TRG tClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tClass()
	 * @generated
	 * @ordered
	 */
	protected TClass creatE__TRG__tClass;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__eAnonymousClassDeclarationToTClass() <em>CREATE CORR eAnonymous Class Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__eAnonymousClassDeclarationToTClass()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType creatE__CORR__eAnonymousClassDeclarationToTClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eModelToPg() <em>CONTEXT CORR eModel To Pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eModelToPg()
	 * @generated
	 * @ordered
	 */
	protected ModelToTypeGraph contexT__CORR__eModelToPg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameter__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getTypeParameter__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MGravityModel getCONTEXT__SRC__eModel() {
		if (contexT__SRC__eModel != null && contexT__SRC__eModel.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eModel = (InternalEObject) contexT__SRC__eModel;
			contexT__SRC__eModel = (MGravityModel) eResolveProxy(oldCONTEXT__SRC__eModel);
			if (contexT__SRC__eModel != oldCONTEXT__SRC__eModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_SRC_EMODEL, oldCONTEXT__SRC__eModel,
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
	public MGravityModel basicGetCONTEXT__SRC__eModel() {
		return contexT__SRC__eModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eModel(MGravityModel newCONTEXT__SRC__eModel) {
		MGravityModel oldCONTEXT__SRC__eModel = contexT__SRC__eModel;
		contexT__SRC__eModel = newCONTEXT__SRC__eModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_SRC_EMODEL, oldCONTEXT__SRC__eModel,
					contexT__SRC__eModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter getCREATE__SRC__typeParameter() {
		if (creatE__SRC__typeParameter != null && creatE__SRC__typeParameter.eIsProxy()) {
			InternalEObject oldCREATE__SRC__typeParameter = (InternalEObject) creatE__SRC__typeParameter;
			creatE__SRC__typeParameter = (TypeParameter) eResolveProxy(oldCREATE__SRC__typeParameter);
			if (creatE__SRC__typeParameter != oldCREATE__SRC__typeParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_SRC_TYPE_PARAMETER,
							oldCREATE__SRC__typeParameter, creatE__SRC__typeParameter));
			}
		}
		return creatE__SRC__typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter basicGetCREATE__SRC__typeParameter() {
		return creatE__SRC__typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__typeParameter(TypeParameter newCREATE__SRC__typeParameter) {
		TypeParameter oldCREATE__SRC__typeParameter = creatE__SRC__typeParameter;
		creatE__SRC__typeParameter = newCREATE__SRC__typeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_SRC_TYPE_PARAMETER, oldCREATE__SRC__typeParameter,
					creatE__SRC__typeParameter));
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
							ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_TRG_PG, oldCONTEXT__TRG__pg,
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
					ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_TRG_PG, oldCONTEXT__TRG__pg, contexT__TRG__pg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getCREATE__TRG__tClass() {
		if (creatE__TRG__tClass != null && creatE__TRG__tClass.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tClass = (InternalEObject) creatE__TRG__tClass;
			creatE__TRG__tClass = (TClass) eResolveProxy(oldCREATE__TRG__tClass);
			if (creatE__TRG__tClass != oldCREATE__TRG__tClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_TRG_TCLASS, oldCREATE__TRG__tClass,
							creatE__TRG__tClass));
			}
		}
		return creatE__TRG__tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetCREATE__TRG__tClass() {
		return creatE__TRG__tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tClass(TClass newCREATE__TRG__tClass) {
		TClass oldCREATE__TRG__tClass = creatE__TRG__tClass;
		creatE__TRG__tClass = newCREATE__TRG__tClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_TRG_TCLASS, oldCREATE__TRG__tClass,
					creatE__TRG__tClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCREATE__CORR__eAnonymousClassDeclarationToTClass() {
		if (creatE__CORR__eAnonymousClassDeclarationToTClass != null
				&& creatE__CORR__eAnonymousClassDeclarationToTClass.eIsProxy()) {
			InternalEObject oldCREATE__CORR__eAnonymousClassDeclarationToTClass = (InternalEObject) creatE__CORR__eAnonymousClassDeclarationToTClass;
			creatE__CORR__eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) eResolveProxy(
					oldCREATE__CORR__eAnonymousClassDeclarationToTClass);
			if (creatE__CORR__eAnonymousClassDeclarationToTClass != oldCREATE__CORR__eAnonymousClassDeclarationToTClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS,
							oldCREATE__CORR__eAnonymousClassDeclarationToTClass,
							creatE__CORR__eAnonymousClassDeclarationToTClass));
			}
		}
		return creatE__CORR__eAnonymousClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCREATE__CORR__eAnonymousClassDeclarationToTClass() {
		return creatE__CORR__eAnonymousClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__eAnonymousClassDeclarationToTClass(
			TypeToTAbstractType newCREATE__CORR__eAnonymousClassDeclarationToTClass) {
		TypeToTAbstractType oldCREATE__CORR__eAnonymousClassDeclarationToTClass = creatE__CORR__eAnonymousClassDeclarationToTClass;
		creatE__CORR__eAnonymousClassDeclarationToTClass = newCREATE__CORR__eAnonymousClassDeclarationToTClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS,
					oldCREATE__CORR__eAnonymousClassDeclarationToTClass,
					creatE__CORR__eAnonymousClassDeclarationToTClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelToTypeGraph getCONTEXT__CORR__eModelToPg() {
		if (contexT__CORR__eModelToPg != null && contexT__CORR__eModelToPg.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eModelToPg = (InternalEObject) contexT__CORR__eModelToPg;
			contexT__CORR__eModelToPg = (ModelToTypeGraph) eResolveProxy(oldCONTEXT__CORR__eModelToPg);
			if (contexT__CORR__eModelToPg != oldCONTEXT__CORR__eModelToPg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_CORR_EMODEL_TO_PG,
							oldCONTEXT__CORR__eModelToPg, contexT__CORR__eModelToPg));
			}
		}
		return contexT__CORR__eModelToPg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelToTypeGraph basicGetCONTEXT__CORR__eModelToPg() {
		return contexT__CORR__eModelToPg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eModelToPg(ModelToTypeGraph newCONTEXT__CORR__eModelToPg) {
		ModelToTypeGraph oldCONTEXT__CORR__eModelToPg = contexT__CORR__eModelToPg;
		contexT__CORR__eModelToPg = newCONTEXT__CORR__eModelToPg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_CORR_EMODEL_TO_PG, oldCONTEXT__CORR__eModelToPg,
					contexT__CORR__eModelToPg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_SRC_EMODEL:
			if (resolve)
				return getCONTEXT__SRC__eModel();
			return basicGetCONTEXT__SRC__eModel();
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_SRC_TYPE_PARAMETER:
			if (resolve)
				return getCREATE__SRC__typeParameter();
			return basicGetCREATE__SRC__typeParameter();
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_TRG_PG:
			if (resolve)
				return getCONTEXT__TRG__pg();
			return basicGetCONTEXT__TRG__pg();
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_TRG_TCLASS:
			if (resolve)
				return getCREATE__TRG__tClass();
			return basicGetCREATE__TRG__tClass();
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			if (resolve)
				return getCREATE__CORR__eAnonymousClassDeclarationToTClass();
			return basicGetCREATE__CORR__eAnonymousClassDeclarationToTClass();
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_CORR_EMODEL_TO_PG:
			if (resolve)
				return getCONTEXT__CORR__eModelToPg();
			return basicGetCONTEXT__CORR__eModelToPg();
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
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_SRC_EMODEL:
			setCONTEXT__SRC__eModel((MGravityModel) newValue);
			return;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_SRC_TYPE_PARAMETER:
			setCREATE__SRC__typeParameter((TypeParameter) newValue);
			return;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_TRG_TCLASS:
			setCREATE__TRG__tClass((TClass) newValue);
			return;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			setCREATE__CORR__eAnonymousClassDeclarationToTClass((TypeToTAbstractType) newValue);
			return;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_CORR_EMODEL_TO_PG:
			setCONTEXT__CORR__eModelToPg((ModelToTypeGraph) newValue);
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
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_SRC_EMODEL:
			setCONTEXT__SRC__eModel((MGravityModel) null);
			return;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_SRC_TYPE_PARAMETER:
			setCREATE__SRC__typeParameter((TypeParameter) null);
			return;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) null);
			return;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_TRG_TCLASS:
			setCREATE__TRG__tClass((TClass) null);
			return;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			setCREATE__CORR__eAnonymousClassDeclarationToTClass((TypeToTAbstractType) null);
			return;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_CORR_EMODEL_TO_PG:
			setCONTEXT__CORR__eModelToPg((ModelToTypeGraph) null);
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
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_SRC_EMODEL:
			return contexT__SRC__eModel != null;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_SRC_TYPE_PARAMETER:
			return creatE__SRC__typeParameter != null;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_TRG_PG:
			return contexT__TRG__pg != null;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_TRG_TCLASS:
			return creatE__TRG__tClass != null;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CREATE_CORR_EANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			return creatE__CORR__eAnonymousClassDeclarationToTClass != null;
		case ModiscoTGGPackage.TYPE_PARAMETER_MARKER__CONTEXT_CORR_EMODEL_TO_PG:
			return contexT__CORR__eModelToPg != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeParameter__MarkerImpl
