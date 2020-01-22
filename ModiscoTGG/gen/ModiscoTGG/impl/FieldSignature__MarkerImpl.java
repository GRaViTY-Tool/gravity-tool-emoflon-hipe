/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.FieldSignature__Marker;
import ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement;
import ModiscoTGG.MFieldNameToTField;
import ModiscoTGG.MSignatureToTSignature;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;

import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldSignature;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Signature Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.FieldSignature__MarkerImpl#getCONTEXT__SRC__mFieldName <em>CONTEXT SRC mField Name</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldSignature__MarkerImpl#getCREATE__SRC__mSignature <em>CREATE SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldSignature__MarkerImpl#getCONTEXT__TRG__tField <em>CONTEXT TRG tField</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldSignature__MarkerImpl#getCREATE__TRG__tSignature <em>CREATE TRG tSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldSignature__MarkerImpl#getCONTEXT__CORR__eFieldDeclarationToTField <em>CONTEXT CORR eField Declaration To TField</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldSignature__MarkerImpl#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldSignature__MarkerImpl#getCREATE__CORR__mSignatureToTSignature <em>CREATE CORR mSignature To TSignature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldSignature__MarkerImpl extends TGGRuleApplicationImpl implements FieldSignature__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mFieldName() <em>CONTEXT SRC mField Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mFieldName()
	 * @generated
	 * @ordered
	 */
	protected MFieldName contexT__SRC__mFieldName;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mSignature() <em>CREATE SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mSignature()
	 * @generated
	 * @ordered
	 */
	protected MFieldSignature creatE__SRC__mSignature;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tField() <em>CONTEXT TRG tField</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tField()
	 * @generated
	 * @ordered
	 */
	protected TField contexT__TRG__tField;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tSignature() <em>CREATE TRG tSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tSignature()
	 * @generated
	 * @ordered
	 */
	protected TFieldSignature creatE__TRG__tSignature;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eFieldDeclarationToTField() <em>CONTEXT CORR eField Declaration To TField</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eFieldDeclarationToTField()
	 * @generated
	 * @ordered
	 */
	protected MFieldNameToTField contexT__CORR__eFieldDeclarationToTField;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mFlowElementToTFlowElement() <em>CREATE CORR mFlow Element To TFlow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mFlowElementToTFlowElement()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElementToTAbstractFlowElement creatE__CORR__mFlowElementToTFlowElement;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mSignatureToTSignature() <em>CREATE CORR mSignature To TSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mSignatureToTSignature()
	 * @generated
	 * @ordered
	 */
	protected MSignatureToTSignature creatE__CORR__mSignatureToTSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldSignature__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getFieldSignature__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFieldName getCONTEXT__SRC__mFieldName() {
		if (contexT__SRC__mFieldName != null && contexT__SRC__mFieldName.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mFieldName = (InternalEObject) contexT__SRC__mFieldName;
			contexT__SRC__mFieldName = (MFieldName) eResolveProxy(oldCONTEXT__SRC__mFieldName);
			if (contexT__SRC__mFieldName != oldCONTEXT__SRC__mFieldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_SRC_MFIELD_NAME,
							oldCONTEXT__SRC__mFieldName, contexT__SRC__mFieldName));
			}
		}
		return contexT__SRC__mFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldName basicGetCONTEXT__SRC__mFieldName() {
		return contexT__SRC__mFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mFieldName(MFieldName newCONTEXT__SRC__mFieldName) {
		MFieldName oldCONTEXT__SRC__mFieldName = contexT__SRC__mFieldName;
		contexT__SRC__mFieldName = newCONTEXT__SRC__mFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_SRC_MFIELD_NAME, oldCONTEXT__SRC__mFieldName,
					contexT__SRC__mFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFieldSignature getCREATE__SRC__mSignature() {
		if (creatE__SRC__mSignature != null && creatE__SRC__mSignature.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mSignature = (InternalEObject) creatE__SRC__mSignature;
			creatE__SRC__mSignature = (MFieldSignature) eResolveProxy(oldCREATE__SRC__mSignature);
			if (creatE__SRC__mSignature != oldCREATE__SRC__mSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE, oldCREATE__SRC__mSignature,
							creatE__SRC__mSignature));
			}
		}
		return creatE__SRC__mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldSignature basicGetCREATE__SRC__mSignature() {
		return creatE__SRC__mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mSignature(MFieldSignature newCREATE__SRC__mSignature) {
		MFieldSignature oldCREATE__SRC__mSignature = creatE__SRC__mSignature;
		creatE__SRC__mSignature = newCREATE__SRC__mSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE, oldCREATE__SRC__mSignature,
					creatE__SRC__mSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TField getCONTEXT__TRG__tField() {
		if (contexT__TRG__tField != null && contexT__TRG__tField.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tField = (InternalEObject) contexT__TRG__tField;
			contexT__TRG__tField = (TField) eResolveProxy(oldCONTEXT__TRG__tField);
			if (contexT__TRG__tField != oldCONTEXT__TRG__tField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_TRG_TFIELD, oldCONTEXT__TRG__tField,
							contexT__TRG__tField));
			}
		}
		return contexT__TRG__tField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TField basicGetCONTEXT__TRG__tField() {
		return contexT__TRG__tField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tField(TField newCONTEXT__TRG__tField) {
		TField oldCONTEXT__TRG__tField = contexT__TRG__tField;
		contexT__TRG__tField = newCONTEXT__TRG__tField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_TRG_TFIELD, oldCONTEXT__TRG__tField,
					contexT__TRG__tField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldSignature getCREATE__TRG__tSignature() {
		if (creatE__TRG__tSignature != null && creatE__TRG__tSignature.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tSignature = (InternalEObject) creatE__TRG__tSignature;
			creatE__TRG__tSignature = (TFieldSignature) eResolveProxy(oldCREATE__TRG__tSignature);
			if (creatE__TRG__tSignature != oldCREATE__TRG__tSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE, oldCREATE__TRG__tSignature,
							creatE__TRG__tSignature));
			}
		}
		return creatE__TRG__tSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldSignature basicGetCREATE__TRG__tSignature() {
		return creatE__TRG__tSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tSignature(TFieldSignature newCREATE__TRG__tSignature) {
		TFieldSignature oldCREATE__TRG__tSignature = creatE__TRG__tSignature;
		creatE__TRG__tSignature = newCREATE__TRG__tSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE, oldCREATE__TRG__tSignature,
					creatE__TRG__tSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFieldNameToTField getCONTEXT__CORR__eFieldDeclarationToTField() {
		if (contexT__CORR__eFieldDeclarationToTField != null && contexT__CORR__eFieldDeclarationToTField.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eFieldDeclarationToTField = (InternalEObject) contexT__CORR__eFieldDeclarationToTField;
			contexT__CORR__eFieldDeclarationToTField = (MFieldNameToTField) eResolveProxy(
					oldCONTEXT__CORR__eFieldDeclarationToTField);
			if (contexT__CORR__eFieldDeclarationToTField != oldCONTEXT__CORR__eFieldDeclarationToTField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD,
							oldCONTEXT__CORR__eFieldDeclarationToTField, contexT__CORR__eFieldDeclarationToTField));
			}
		}
		return contexT__CORR__eFieldDeclarationToTField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldNameToTField basicGetCONTEXT__CORR__eFieldDeclarationToTField() {
		return contexT__CORR__eFieldDeclarationToTField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eFieldDeclarationToTField(
			MFieldNameToTField newCONTEXT__CORR__eFieldDeclarationToTField) {
		MFieldNameToTField oldCONTEXT__CORR__eFieldDeclarationToTField = contexT__CORR__eFieldDeclarationToTField;
		contexT__CORR__eFieldDeclarationToTField = newCONTEXT__CORR__eFieldDeclarationToTField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD,
					oldCONTEXT__CORR__eFieldDeclarationToTField, contexT__CORR__eFieldDeclarationToTField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElementToTAbstractFlowElement getCREATE__CORR__mFlowElementToTFlowElement() {
		if (creatE__CORR__mFlowElementToTFlowElement != null && creatE__CORR__mFlowElementToTFlowElement.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mFlowElementToTFlowElement = (InternalEObject) creatE__CORR__mFlowElementToTFlowElement;
			creatE__CORR__mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) eResolveProxy(
					oldCREATE__CORR__mFlowElementToTFlowElement);
			if (creatE__CORR__mFlowElementToTFlowElement != oldCREATE__CORR__mFlowElementToTFlowElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT,
							oldCREATE__CORR__mFlowElementToTFlowElement, creatE__CORR__mFlowElementToTFlowElement));
			}
		}
		return creatE__CORR__mFlowElementToTFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElementToTAbstractFlowElement basicGetCREATE__CORR__mFlowElementToTFlowElement() {
		return creatE__CORR__mFlowElementToTFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mFlowElementToTFlowElement(
			MAbstractFlowElementToTAbstractFlowElement newCREATE__CORR__mFlowElementToTFlowElement) {
		MAbstractFlowElementToTAbstractFlowElement oldCREATE__CORR__mFlowElementToTFlowElement = creatE__CORR__mFlowElementToTFlowElement;
		creatE__CORR__mFlowElementToTFlowElement = newCREATE__CORR__mFlowElementToTFlowElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT,
					oldCREATE__CORR__mFlowElementToTFlowElement, creatE__CORR__mFlowElementToTFlowElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSignatureToTSignature getCREATE__CORR__mSignatureToTSignature() {
		if (creatE__CORR__mSignatureToTSignature != null && creatE__CORR__mSignatureToTSignature.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mSignatureToTSignature = (InternalEObject) creatE__CORR__mSignatureToTSignature;
			creatE__CORR__mSignatureToTSignature = (MSignatureToTSignature) eResolveProxy(
					oldCREATE__CORR__mSignatureToTSignature);
			if (creatE__CORR__mSignatureToTSignature != oldCREATE__CORR__mSignatureToTSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE,
							oldCREATE__CORR__mSignatureToTSignature, creatE__CORR__mSignatureToTSignature));
			}
		}
		return creatE__CORR__mSignatureToTSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSignatureToTSignature basicGetCREATE__CORR__mSignatureToTSignature() {
		return creatE__CORR__mSignatureToTSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mSignatureToTSignature(
			MSignatureToTSignature newCREATE__CORR__mSignatureToTSignature) {
		MSignatureToTSignature oldCREATE__CORR__mSignatureToTSignature = creatE__CORR__mSignatureToTSignature;
		creatE__CORR__mSignatureToTSignature = newCREATE__CORR__mSignatureToTSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE,
					oldCREATE__CORR__mSignatureToTSignature, creatE__CORR__mSignatureToTSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_SRC_MFIELD_NAME:
			if (resolve)
				return getCONTEXT__SRC__mFieldName();
			return basicGetCONTEXT__SRC__mFieldName();
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE:
			if (resolve)
				return getCREATE__SRC__mSignature();
			return basicGetCREATE__SRC__mSignature();
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_TRG_TFIELD:
			if (resolve)
				return getCONTEXT__TRG__tField();
			return basicGetCONTEXT__TRG__tField();
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE:
			if (resolve)
				return getCREATE__TRG__tSignature();
			return basicGetCREATE__TRG__tSignature();
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD:
			if (resolve)
				return getCONTEXT__CORR__eFieldDeclarationToTField();
			return basicGetCONTEXT__CORR__eFieldDeclarationToTField();
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			if (resolve)
				return getCREATE__CORR__mFlowElementToTFlowElement();
			return basicGetCREATE__CORR__mFlowElementToTFlowElement();
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE:
			if (resolve)
				return getCREATE__CORR__mSignatureToTSignature();
			return basicGetCREATE__CORR__mSignatureToTSignature();
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
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_SRC_MFIELD_NAME:
			setCONTEXT__SRC__mFieldName((MFieldName) newValue);
			return;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE:
			setCREATE__SRC__mSignature((MFieldSignature) newValue);
			return;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_TRG_TFIELD:
			setCONTEXT__TRG__tField((TField) newValue);
			return;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE:
			setCREATE__TRG__tSignature((TFieldSignature) newValue);
			return;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD:
			setCONTEXT__CORR__eFieldDeclarationToTField((MFieldNameToTField) newValue);
			return;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			setCREATE__CORR__mFlowElementToTFlowElement((MAbstractFlowElementToTAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE:
			setCREATE__CORR__mSignatureToTSignature((MSignatureToTSignature) newValue);
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
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_SRC_MFIELD_NAME:
			setCONTEXT__SRC__mFieldName((MFieldName) null);
			return;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE:
			setCREATE__SRC__mSignature((MFieldSignature) null);
			return;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_TRG_TFIELD:
			setCONTEXT__TRG__tField((TField) null);
			return;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE:
			setCREATE__TRG__tSignature((TFieldSignature) null);
			return;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD:
			setCONTEXT__CORR__eFieldDeclarationToTField((MFieldNameToTField) null);
			return;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			setCREATE__CORR__mFlowElementToTFlowElement((MAbstractFlowElementToTAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE:
			setCREATE__CORR__mSignatureToTSignature((MSignatureToTSignature) null);
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
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_SRC_MFIELD_NAME:
			return contexT__SRC__mFieldName != null;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_SRC_MSIGNATURE:
			return creatE__SRC__mSignature != null;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_TRG_TFIELD:
			return contexT__TRG__tField != null;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_TRG_TSIGNATURE:
			return creatE__TRG__tSignature != null;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD:
			return contexT__CORR__eFieldDeclarationToTField != null;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			return creatE__CORR__mFlowElementToTFlowElement != null;
		case ModiscoTGGPackage.FIELD_SIGNATURE_MARKER__CREATE_CORR_MSIGNATURE_TO_TSIGNATURE:
			return creatE__CORR__mSignatureToTSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldSignature__MarkerImpl
