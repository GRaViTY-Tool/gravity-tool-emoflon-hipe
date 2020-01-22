/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ModelToTypeGraph;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.ParameterizedTypeToClass__Marker;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterized Type To Class Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.ParameterizedTypeToClass__MarkerImpl#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ParameterizedTypeToClass__MarkerImpl#getCREATE__SRC__eParameterizedType <em>CREATE SRC eParameterized Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ParameterizedTypeToClass__MarkerImpl#getCONTEXT__SRC__eType <em>CONTEXT SRC eType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ParameterizedTypeToClass__MarkerImpl#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ParameterizedTypeToClass__MarkerImpl#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ParameterizedTypeToClass__MarkerImpl#getCONTEXT__TRG__tAbstractType <em>CONTEXT TRG tAbstract Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ParameterizedTypeToClass__MarkerImpl#getCONTEXT__CORR__eModelToPg <em>CONTEXT CORR eModel To Pg</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ParameterizedTypeToClass__MarkerImpl#getCREATE__CORR__eParameterizedTypeToTAbstractType <em>CREATE CORR eParameterized Type To TAbstract Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ParameterizedTypeToClass__MarkerImpl#getCONTEXT__CORR__eTypeToTAbstractType <em>CONTEXT CORR eType To TAbstract Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterizedTypeToClass__MarkerImpl extends TGGRuleApplicationImpl
		implements ParameterizedTypeToClass__Marker {
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
	 * The cached value of the '{@link #getCREATE__SRC__eParameterizedType() <em>CREATE SRC eParameterized Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__eParameterizedType()
	 * @generated
	 * @ordered
	 */
	protected ParameterizedType creatE__SRC__eParameterizedType;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__pg() <em>CONTEXT TRG pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__pg()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph contexT__TRG__pg;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tAbstractType() <em>CONTEXT TRG tAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tAbstractType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType contexT__TRG__tAbstractType;

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
	 * The cached value of the '{@link #getCREATE__CORR__eParameterizedTypeToTAbstractType() <em>CREATE CORR eParameterized Type To TAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__eParameterizedTypeToTAbstractType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType creatE__CORR__eParameterizedTypeToTAbstractType;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eTypeToTAbstractType() <em>CONTEXT CORR eType To TAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eTypeToTAbstractType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__eTypeToTAbstractType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedTypeToClass__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getParameterizedTypeToClass__Marker();
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
							ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL,
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
					ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL, oldCONTEXT__SRC__eModel,
					contexT__SRC__eModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType getCREATE__SRC__eParameterizedType() {
		if (creatE__SRC__eParameterizedType != null && creatE__SRC__eParameterizedType.eIsProxy()) {
			InternalEObject oldCREATE__SRC__eParameterizedType = (InternalEObject) creatE__SRC__eParameterizedType;
			creatE__SRC__eParameterizedType = (ParameterizedType) eResolveProxy(oldCREATE__SRC__eParameterizedType);
			if (creatE__SRC__eParameterizedType != oldCREATE__SRC__eParameterizedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_EPARAMETERIZED_TYPE,
							oldCREATE__SRC__eParameterizedType, creatE__SRC__eParameterizedType));
			}
		}
		return creatE__SRC__eParameterizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedType basicGetCREATE__SRC__eParameterizedType() {
		return creatE__SRC__eParameterizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__eParameterizedType(ParameterizedType newCREATE__SRC__eParameterizedType) {
		ParameterizedType oldCREATE__SRC__eParameterizedType = creatE__SRC__eParameterizedType;
		creatE__SRC__eParameterizedType = newCREATE__SRC__eParameterizedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_EPARAMETERIZED_TYPE,
					oldCREATE__SRC__eParameterizedType, creatE__SRC__eParameterizedType));
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
							ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE,
							oldCONTEXT__SRC__eType, contexT__SRC__eType));
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
					ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE, oldCONTEXT__SRC__eType,
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
							ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS,
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
					ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS,
					oldCREATE__SRC__eTypeAccess, creatE__SRC__eTypeAccess));
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
							ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_PG, oldCONTEXT__TRG__pg,
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
					ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_PG, oldCONTEXT__TRG__pg,
					contexT__TRG__pg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getCONTEXT__TRG__tAbstractType() {
		if (contexT__TRG__tAbstractType != null && contexT__TRG__tAbstractType.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tAbstractType = (InternalEObject) contexT__TRG__tAbstractType;
			contexT__TRG__tAbstractType = (TAbstractType) eResolveProxy(oldCONTEXT__TRG__tAbstractType);
			if (contexT__TRG__tAbstractType != oldCONTEXT__TRG__tAbstractType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TABSTRACT_TYPE,
							oldCONTEXT__TRG__tAbstractType, contexT__TRG__tAbstractType));
			}
		}
		return contexT__TRG__tAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetCONTEXT__TRG__tAbstractType() {
		return contexT__TRG__tAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tAbstractType(TAbstractType newCONTEXT__TRG__tAbstractType) {
		TAbstractType oldCONTEXT__TRG__tAbstractType = contexT__TRG__tAbstractType;
		contexT__TRG__tAbstractType = newCONTEXT__TRG__tAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TABSTRACT_TYPE,
					oldCONTEXT__TRG__tAbstractType, contexT__TRG__tAbstractType));
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
							ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_PG,
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
					ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_PG,
					oldCONTEXT__CORR__eModelToPg, contexT__CORR__eModelToPg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCREATE__CORR__eParameterizedTypeToTAbstractType() {
		if (creatE__CORR__eParameterizedTypeToTAbstractType != null
				&& creatE__CORR__eParameterizedTypeToTAbstractType.eIsProxy()) {
			InternalEObject oldCREATE__CORR__eParameterizedTypeToTAbstractType = (InternalEObject) creatE__CORR__eParameterizedTypeToTAbstractType;
			creatE__CORR__eParameterizedTypeToTAbstractType = (TypeToTAbstractType) eResolveProxy(
					oldCREATE__CORR__eParameterizedTypeToTAbstractType);
			if (creatE__CORR__eParameterizedTypeToTAbstractType != oldCREATE__CORR__eParameterizedTypeToTAbstractType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_CORR_EPARAMETERIZED_TYPE_TO_TABSTRACT_TYPE,
							oldCREATE__CORR__eParameterizedTypeToTAbstractType,
							creatE__CORR__eParameterizedTypeToTAbstractType));
			}
		}
		return creatE__CORR__eParameterizedTypeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCREATE__CORR__eParameterizedTypeToTAbstractType() {
		return creatE__CORR__eParameterizedTypeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__eParameterizedTypeToTAbstractType(
			TypeToTAbstractType newCREATE__CORR__eParameterizedTypeToTAbstractType) {
		TypeToTAbstractType oldCREATE__CORR__eParameterizedTypeToTAbstractType = creatE__CORR__eParameterizedTypeToTAbstractType;
		creatE__CORR__eParameterizedTypeToTAbstractType = newCREATE__CORR__eParameterizedTypeToTAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_CORR_EPARAMETERIZED_TYPE_TO_TABSTRACT_TYPE,
					oldCREATE__CORR__eParameterizedTypeToTAbstractType,
					creatE__CORR__eParameterizedTypeToTAbstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__eTypeToTAbstractType() {
		if (contexT__CORR__eTypeToTAbstractType != null && contexT__CORR__eTypeToTAbstractType.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eTypeToTAbstractType = (InternalEObject) contexT__CORR__eTypeToTAbstractType;
			contexT__CORR__eTypeToTAbstractType = (TypeToTAbstractType) eResolveProxy(
					oldCONTEXT__CORR__eTypeToTAbstractType);
			if (contexT__CORR__eTypeToTAbstractType != oldCONTEXT__CORR__eTypeToTAbstractType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TABSTRACT_TYPE,
							oldCONTEXT__CORR__eTypeToTAbstractType, contexT__CORR__eTypeToTAbstractType));
			}
		}
		return contexT__CORR__eTypeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__eTypeToTAbstractType() {
		return contexT__CORR__eTypeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eTypeToTAbstractType(TypeToTAbstractType newCONTEXT__CORR__eTypeToTAbstractType) {
		TypeToTAbstractType oldCONTEXT__CORR__eTypeToTAbstractType = contexT__CORR__eTypeToTAbstractType;
		contexT__CORR__eTypeToTAbstractType = newCONTEXT__CORR__eTypeToTAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TABSTRACT_TYPE,
					oldCONTEXT__CORR__eTypeToTAbstractType, contexT__CORR__eTypeToTAbstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL:
			if (resolve)
				return getCONTEXT__SRC__eModel();
			return basicGetCONTEXT__SRC__eModel();
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_EPARAMETERIZED_TYPE:
			if (resolve)
				return getCREATE__SRC__eParameterizedType();
			return basicGetCREATE__SRC__eParameterizedType();
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE:
			if (resolve)
				return getCONTEXT__SRC__eType();
			return basicGetCONTEXT__SRC__eType();
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS:
			if (resolve)
				return getCREATE__SRC__eTypeAccess();
			return basicGetCREATE__SRC__eTypeAccess();
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_PG:
			if (resolve)
				return getCONTEXT__TRG__pg();
			return basicGetCONTEXT__TRG__pg();
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TABSTRACT_TYPE:
			if (resolve)
				return getCONTEXT__TRG__tAbstractType();
			return basicGetCONTEXT__TRG__tAbstractType();
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_PG:
			if (resolve)
				return getCONTEXT__CORR__eModelToPg();
			return basicGetCONTEXT__CORR__eModelToPg();
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_CORR_EPARAMETERIZED_TYPE_TO_TABSTRACT_TYPE:
			if (resolve)
				return getCREATE__CORR__eParameterizedTypeToTAbstractType();
			return basicGetCREATE__CORR__eParameterizedTypeToTAbstractType();
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TABSTRACT_TYPE:
			if (resolve)
				return getCONTEXT__CORR__eTypeToTAbstractType();
			return basicGetCONTEXT__CORR__eTypeToTAbstractType();
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
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL:
			setCONTEXT__SRC__eModel((Model) newValue);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_EPARAMETERIZED_TYPE:
			setCREATE__SRC__eParameterizedType((ParameterizedType) newValue);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE:
			setCONTEXT__SRC__eType((Type) newValue);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS:
			setCREATE__SRC__eTypeAccess((TypeAccess) newValue);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TABSTRACT_TYPE:
			setCONTEXT__TRG__tAbstractType((TAbstractType) newValue);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_PG:
			setCONTEXT__CORR__eModelToPg((ModelToTypeGraph) newValue);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_CORR_EPARAMETERIZED_TYPE_TO_TABSTRACT_TYPE:
			setCREATE__CORR__eParameterizedTypeToTAbstractType((TypeToTAbstractType) newValue);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TABSTRACT_TYPE:
			setCONTEXT__CORR__eTypeToTAbstractType((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL:
			setCONTEXT__SRC__eModel((Model) null);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_EPARAMETERIZED_TYPE:
			setCREATE__SRC__eParameterizedType((ParameterizedType) null);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE:
			setCONTEXT__SRC__eType((Type) null);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS:
			setCREATE__SRC__eTypeAccess((TypeAccess) null);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) null);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TABSTRACT_TYPE:
			setCONTEXT__TRG__tAbstractType((TAbstractType) null);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_PG:
			setCONTEXT__CORR__eModelToPg((ModelToTypeGraph) null);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_CORR_EPARAMETERIZED_TYPE_TO_TABSTRACT_TYPE:
			setCREATE__CORR__eParameterizedTypeToTAbstractType((TypeToTAbstractType) null);
			return;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TABSTRACT_TYPE:
			setCONTEXT__CORR__eTypeToTAbstractType((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_EMODEL:
			return contexT__SRC__eModel != null;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_EPARAMETERIZED_TYPE:
			return creatE__SRC__eParameterizedType != null;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_SRC_ETYPE:
			return contexT__SRC__eType != null;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS:
			return creatE__SRC__eTypeAccess != null;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_PG:
			return contexT__TRG__pg != null;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_TRG_TABSTRACT_TYPE:
			return contexT__TRG__tAbstractType != null;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_EMODEL_TO_PG:
			return contexT__CORR__eModelToPg != null;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CREATE_CORR_EPARAMETERIZED_TYPE_TO_TABSTRACT_TYPE:
			return creatE__CORR__eParameterizedTypeToTAbstractType != null;
		case ModiscoTGGPackage.PARAMETERIZED_TYPE_TO_CLASS_MARKER__CONTEXT_CORR_ETYPE_TO_TABSTRACT_TYPE:
			return contexT__CORR__eTypeToTAbstractType != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterizedTypeToClass__MarkerImpl
