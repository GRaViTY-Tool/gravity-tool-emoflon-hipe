/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.ReturnType__Marker;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.modisco.MMethodDefinition;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodDefinition;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Type Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.ReturnType__MarkerImpl#getCONTEXT__SRC__eReturnType <em>CONTEXT SRC eReturn Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ReturnType__MarkerImpl#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ReturnType__MarkerImpl#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ReturnType__MarkerImpl#getCONTEXT__TRG__tAbstractType <em>CONTEXT TRG tAbstract Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ReturnType__MarkerImpl#getCONTEXT__TRG__tMethodDefinition <em>CONTEXT TRG tMethod Definition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ReturnType__MarkerImpl#getCONTEXT__CORR__eReturnTypeToTAbstractType <em>CONTEXT CORR eReturn Type To TAbstract Type</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ReturnType__MarkerImpl#getCONTEXT__CORR__mMethodDefinitionToTMethodDefinition <em>CONTEXT CORR mMethod Definition To TMethod Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnType__MarkerImpl extends TGGRuleApplicationImpl implements ReturnType__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__eReturnType() <em>CONTEXT SRC eReturn Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type contexT__SRC__eReturnType;

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
	 * The cached value of the '{@link #getCONTEXT__SRC__mDefinition() <em>CONTEXT SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mDefinition()
	 * @generated
	 * @ordered
	 */
	protected MMethodDefinition contexT__SRC__mDefinition;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tMethodDefinition() <em>CONTEXT TRG tMethod Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tMethodDefinition()
	 * @generated
	 * @ordered
	 */
	protected TMethodDefinition contexT__TRG__tMethodDefinition;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eReturnTypeToTAbstractType() <em>CONTEXT CORR eReturn Type To TAbstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eReturnTypeToTAbstractType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__eReturnTypeToTAbstractType;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mMethodDefinitionToTMethodDefinition() <em>CONTEXT CORR mMethod Definition To TMethod Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mMethodDefinitionToTMethodDefinition()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember contexT__CORR__mMethodDefinitionToTMethodDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnType__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getReturnType__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getCONTEXT__SRC__eReturnType() {
		if (contexT__SRC__eReturnType != null && contexT__SRC__eReturnType.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eReturnType = (InternalEObject) contexT__SRC__eReturnType;
			contexT__SRC__eReturnType = (Type) eResolveProxy(oldCONTEXT__SRC__eReturnType);
			if (contexT__SRC__eReturnType != oldCONTEXT__SRC__eReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_SRC_ERETURN_TYPE,
							oldCONTEXT__SRC__eReturnType, contexT__SRC__eReturnType));
			}
		}
		return contexT__SRC__eReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetCONTEXT__SRC__eReturnType() {
		return contexT__SRC__eReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eReturnType(Type newCONTEXT__SRC__eReturnType) {
		Type oldCONTEXT__SRC__eReturnType = contexT__SRC__eReturnType;
		contexT__SRC__eReturnType = newCONTEXT__SRC__eReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_SRC_ERETURN_TYPE, oldCONTEXT__SRC__eReturnType,
					contexT__SRC__eReturnType));
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
							ModiscoTGGPackage.RETURN_TYPE_MARKER__CREATE_SRC_ETYPE_ACCESS, oldCREATE__SRC__eTypeAccess,
							creatE__SRC__eTypeAccess));
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
					ModiscoTGGPackage.RETURN_TYPE_MARKER__CREATE_SRC_ETYPE_ACCESS, oldCREATE__SRC__eTypeAccess,
					creatE__SRC__eTypeAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodDefinition getCONTEXT__SRC__mDefinition() {
		if (contexT__SRC__mDefinition != null && contexT__SRC__mDefinition.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mDefinition = (InternalEObject) contexT__SRC__mDefinition;
			contexT__SRC__mDefinition = (MMethodDefinition) eResolveProxy(oldCONTEXT__SRC__mDefinition);
			if (contexT__SRC__mDefinition != oldCONTEXT__SRC__mDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_SRC_MDEFINITION, oldCONTEXT__SRC__mDefinition,
							contexT__SRC__mDefinition));
			}
		}
		return contexT__SRC__mDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodDefinition basicGetCONTEXT__SRC__mDefinition() {
		return contexT__SRC__mDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mDefinition(MMethodDefinition newCONTEXT__SRC__mDefinition) {
		MMethodDefinition oldCONTEXT__SRC__mDefinition = contexT__SRC__mDefinition;
		contexT__SRC__mDefinition = newCONTEXT__SRC__mDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_SRC_MDEFINITION, oldCONTEXT__SRC__mDefinition,
					contexT__SRC__mDefinition));
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
							ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE,
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
					ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE, oldCONTEXT__TRG__tAbstractType,
					contexT__TRG__tAbstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodDefinition getCONTEXT__TRG__tMethodDefinition() {
		if (contexT__TRG__tMethodDefinition != null && contexT__TRG__tMethodDefinition.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tMethodDefinition = (InternalEObject) contexT__TRG__tMethodDefinition;
			contexT__TRG__tMethodDefinition = (TMethodDefinition) eResolveProxy(oldCONTEXT__TRG__tMethodDefinition);
			if (contexT__TRG__tMethodDefinition != oldCONTEXT__TRG__tMethodDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_TRG_TMETHOD_DEFINITION,
							oldCONTEXT__TRG__tMethodDefinition, contexT__TRG__tMethodDefinition));
			}
		}
		return contexT__TRG__tMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition basicGetCONTEXT__TRG__tMethodDefinition() {
		return contexT__TRG__tMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tMethodDefinition(TMethodDefinition newCONTEXT__TRG__tMethodDefinition) {
		TMethodDefinition oldCONTEXT__TRG__tMethodDefinition = contexT__TRG__tMethodDefinition;
		contexT__TRG__tMethodDefinition = newCONTEXT__TRG__tMethodDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_TRG_TMETHOD_DEFINITION,
					oldCONTEXT__TRG__tMethodDefinition, contexT__TRG__tMethodDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__eReturnTypeToTAbstractType() {
		if (contexT__CORR__eReturnTypeToTAbstractType != null && contexT__CORR__eReturnTypeToTAbstractType.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eReturnTypeToTAbstractType = (InternalEObject) contexT__CORR__eReturnTypeToTAbstractType;
			contexT__CORR__eReturnTypeToTAbstractType = (TypeToTAbstractType) eResolveProxy(
					oldCONTEXT__CORR__eReturnTypeToTAbstractType);
			if (contexT__CORR__eReturnTypeToTAbstractType != oldCONTEXT__CORR__eReturnTypeToTAbstractType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_CORR_ERETURN_TYPE_TO_TABSTRACT_TYPE,
							oldCONTEXT__CORR__eReturnTypeToTAbstractType, contexT__CORR__eReturnTypeToTAbstractType));
			}
		}
		return contexT__CORR__eReturnTypeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__eReturnTypeToTAbstractType() {
		return contexT__CORR__eReturnTypeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eReturnTypeToTAbstractType(
			TypeToTAbstractType newCONTEXT__CORR__eReturnTypeToTAbstractType) {
		TypeToTAbstractType oldCONTEXT__CORR__eReturnTypeToTAbstractType = contexT__CORR__eReturnTypeToTAbstractType;
		contexT__CORR__eReturnTypeToTAbstractType = newCONTEXT__CORR__eReturnTypeToTAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_CORR_ERETURN_TYPE_TO_TABSTRACT_TYPE,
					oldCONTEXT__CORR__eReturnTypeToTAbstractType, contexT__CORR__eReturnTypeToTAbstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember getCONTEXT__CORR__mMethodDefinitionToTMethodDefinition() {
		if (contexT__CORR__mMethodDefinitionToTMethodDefinition != null
				&& contexT__CORR__mMethodDefinitionToTMethodDefinition.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mMethodDefinitionToTMethodDefinition = (InternalEObject) contexT__CORR__mMethodDefinitionToTMethodDefinition;
			contexT__CORR__mMethodDefinitionToTMethodDefinition = (MDefinitionToTMember) eResolveProxy(
					oldCONTEXT__CORR__mMethodDefinitionToTMethodDefinition);
			if (contexT__CORR__mMethodDefinitionToTMethodDefinition != oldCONTEXT__CORR__mMethodDefinitionToTMethodDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_CORR_MMETHOD_DEFINITION_TO_TMETHOD_DEFINITION,
							oldCONTEXT__CORR__mMethodDefinitionToTMethodDefinition,
							contexT__CORR__mMethodDefinitionToTMethodDefinition));
			}
		}
		return contexT__CORR__mMethodDefinitionToTMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTMember basicGetCONTEXT__CORR__mMethodDefinitionToTMethodDefinition() {
		return contexT__CORR__mMethodDefinitionToTMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mMethodDefinitionToTMethodDefinition(
			MDefinitionToTMember newCONTEXT__CORR__mMethodDefinitionToTMethodDefinition) {
		MDefinitionToTMember oldCONTEXT__CORR__mMethodDefinitionToTMethodDefinition = contexT__CORR__mMethodDefinitionToTMethodDefinition;
		contexT__CORR__mMethodDefinitionToTMethodDefinition = newCONTEXT__CORR__mMethodDefinitionToTMethodDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_CORR_MMETHOD_DEFINITION_TO_TMETHOD_DEFINITION,
					oldCONTEXT__CORR__mMethodDefinitionToTMethodDefinition,
					contexT__CORR__mMethodDefinitionToTMethodDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_SRC_ERETURN_TYPE:
			if (resolve)
				return getCONTEXT__SRC__eReturnType();
			return basicGetCONTEXT__SRC__eReturnType();
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CREATE_SRC_ETYPE_ACCESS:
			if (resolve)
				return getCREATE__SRC__eTypeAccess();
			return basicGetCREATE__SRC__eTypeAccess();
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_SRC_MDEFINITION:
			if (resolve)
				return getCONTEXT__SRC__mDefinition();
			return basicGetCONTEXT__SRC__mDefinition();
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE:
			if (resolve)
				return getCONTEXT__TRG__tAbstractType();
			return basicGetCONTEXT__TRG__tAbstractType();
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_TRG_TMETHOD_DEFINITION:
			if (resolve)
				return getCONTEXT__TRG__tMethodDefinition();
			return basicGetCONTEXT__TRG__tMethodDefinition();
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_CORR_ERETURN_TYPE_TO_TABSTRACT_TYPE:
			if (resolve)
				return getCONTEXT__CORR__eReturnTypeToTAbstractType();
			return basicGetCONTEXT__CORR__eReturnTypeToTAbstractType();
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_CORR_MMETHOD_DEFINITION_TO_TMETHOD_DEFINITION:
			if (resolve)
				return getCONTEXT__CORR__mMethodDefinitionToTMethodDefinition();
			return basicGetCONTEXT__CORR__mMethodDefinitionToTMethodDefinition();
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
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_SRC_ERETURN_TYPE:
			setCONTEXT__SRC__eReturnType((Type) newValue);
			return;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CREATE_SRC_ETYPE_ACCESS:
			setCREATE__SRC__eTypeAccess((TypeAccess) newValue);
			return;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_SRC_MDEFINITION:
			setCONTEXT__SRC__mDefinition((MMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE:
			setCONTEXT__TRG__tAbstractType((TAbstractType) newValue);
			return;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_TRG_TMETHOD_DEFINITION:
			setCONTEXT__TRG__tMethodDefinition((TMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_CORR_ERETURN_TYPE_TO_TABSTRACT_TYPE:
			setCONTEXT__CORR__eReturnTypeToTAbstractType((TypeToTAbstractType) newValue);
			return;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_CORR_MMETHOD_DEFINITION_TO_TMETHOD_DEFINITION:
			setCONTEXT__CORR__mMethodDefinitionToTMethodDefinition((MDefinitionToTMember) newValue);
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
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_SRC_ERETURN_TYPE:
			setCONTEXT__SRC__eReturnType((Type) null);
			return;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CREATE_SRC_ETYPE_ACCESS:
			setCREATE__SRC__eTypeAccess((TypeAccess) null);
			return;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_SRC_MDEFINITION:
			setCONTEXT__SRC__mDefinition((MMethodDefinition) null);
			return;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE:
			setCONTEXT__TRG__tAbstractType((TAbstractType) null);
			return;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_TRG_TMETHOD_DEFINITION:
			setCONTEXT__TRG__tMethodDefinition((TMethodDefinition) null);
			return;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_CORR_ERETURN_TYPE_TO_TABSTRACT_TYPE:
			setCONTEXT__CORR__eReturnTypeToTAbstractType((TypeToTAbstractType) null);
			return;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_CORR_MMETHOD_DEFINITION_TO_TMETHOD_DEFINITION:
			setCONTEXT__CORR__mMethodDefinitionToTMethodDefinition((MDefinitionToTMember) null);
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
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_SRC_ERETURN_TYPE:
			return contexT__SRC__eReturnType != null;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CREATE_SRC_ETYPE_ACCESS:
			return creatE__SRC__eTypeAccess != null;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_SRC_MDEFINITION:
			return contexT__SRC__mDefinition != null;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_TRG_TABSTRACT_TYPE:
			return contexT__TRG__tAbstractType != null;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_TRG_TMETHOD_DEFINITION:
			return contexT__TRG__tMethodDefinition != null;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_CORR_ERETURN_TYPE_TO_TABSTRACT_TYPE:
			return contexT__CORR__eReturnTypeToTAbstractType != null;
		case ModiscoTGGPackage.RETURN_TYPE_MARKER__CONTEXT_CORR_MMETHOD_DEFINITION_TO_TMETHOD_DEFINITION:
			return contexT__CORR__mMethodDefinitionToTMethodDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //ReturnType__MarkerImpl
