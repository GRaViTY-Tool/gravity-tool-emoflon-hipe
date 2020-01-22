/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ASTNodeToTAnnotatable;
import ModiscoTGG.FieldDefinition__Marker;
import ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement;
import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.MSignatureToTSignature;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldSignature;

import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Definition Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.FieldDefinition__MarkerImpl#getCREATE__SRC__mDefinition <em>CREATE SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldDefinition__MarkerImpl#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldDefinition__MarkerImpl#getCREATE__TRG__tDefinition <em>CREATE TRG tDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldDefinition__MarkerImpl#getCONTEXT__TRG__tFieldSignature <em>CONTEXT TRG tField Signature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldDefinition__MarkerImpl#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldDefinition__MarkerImpl#getCREATE__CORR__mDefinitionToTDefinition <em>CREATE CORR mDefinition To TDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldDefinition__MarkerImpl#getCREATE__CORR__mDefinitionToTMember <em>CREATE CORR mDefinition To TMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldDefinition__MarkerImpl#getCONTEXT__CORR__mSignatureToTFieldSignature <em>CONTEXT CORR mSignature To TField Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldDefinition__MarkerImpl extends TGGRuleApplicationImpl implements FieldDefinition__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__mDefinition() <em>CREATE SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mDefinition()
	 * @generated
	 * @ordered
	 */
	protected MFieldDefinition creatE__SRC__mDefinition;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mSignature() <em>CONTEXT SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mSignature()
	 * @generated
	 * @ordered
	 */
	protected MFieldSignature contexT__SRC__mSignature;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tDefinition() <em>CREATE TRG tDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tDefinition()
	 * @generated
	 * @ordered
	 */
	protected TFieldDefinition creatE__TRG__tDefinition;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tFieldSignature() <em>CONTEXT TRG tField Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tFieldSignature()
	 * @generated
	 * @ordered
	 */
	protected TFieldSignature contexT__TRG__tFieldSignature;

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
	 * The cached value of the '{@link #getCREATE__CORR__mDefinitionToTDefinition() <em>CREATE CORR mDefinition To TDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mDefinitionToTDefinition()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElementToTAbstractFlowElement creatE__CORR__mDefinitionToTDefinition;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mDefinitionToTMember() <em>CREATE CORR mDefinition To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mDefinitionToTMember()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember creatE__CORR__mDefinitionToTMember;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mSignatureToTFieldSignature() <em>CONTEXT CORR mSignature To TField Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mSignatureToTFieldSignature()
	 * @generated
	 * @ordered
	 */
	protected MSignatureToTSignature contexT__CORR__mSignatureToTFieldSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldDefinition__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getFieldDefinition__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFieldDefinition getCREATE__SRC__mDefinition() {
		if (creatE__SRC__mDefinition != null && creatE__SRC__mDefinition.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mDefinition = (InternalEObject) creatE__SRC__mDefinition;
			creatE__SRC__mDefinition = (MFieldDefinition) eResolveProxy(oldCREATE__SRC__mDefinition);
			if (creatE__SRC__mDefinition != oldCREATE__SRC__mDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_SRC_MDEFINITION,
							oldCREATE__SRC__mDefinition, creatE__SRC__mDefinition));
			}
		}
		return creatE__SRC__mDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldDefinition basicGetCREATE__SRC__mDefinition() {
		return creatE__SRC__mDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mDefinition(MFieldDefinition newCREATE__SRC__mDefinition) {
		MFieldDefinition oldCREATE__SRC__mDefinition = creatE__SRC__mDefinition;
		creatE__SRC__mDefinition = newCREATE__SRC__mDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_SRC_MDEFINITION, oldCREATE__SRC__mDefinition,
					creatE__SRC__mDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFieldSignature getCONTEXT__SRC__mSignature() {
		if (contexT__SRC__mSignature != null && contexT__SRC__mSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mSignature = (InternalEObject) contexT__SRC__mSignature;
			contexT__SRC__mSignature = (MFieldSignature) eResolveProxy(oldCONTEXT__SRC__mSignature);
			if (contexT__SRC__mSignature != oldCONTEXT__SRC__mSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE,
							oldCONTEXT__SRC__mSignature, contexT__SRC__mSignature));
			}
		}
		return contexT__SRC__mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldSignature basicGetCONTEXT__SRC__mSignature() {
		return contexT__SRC__mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mSignature(MFieldSignature newCONTEXT__SRC__mSignature) {
		MFieldSignature oldCONTEXT__SRC__mSignature = contexT__SRC__mSignature;
		contexT__SRC__mSignature = newCONTEXT__SRC__mSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE, oldCONTEXT__SRC__mSignature,
					contexT__SRC__mSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldDefinition getCREATE__TRG__tDefinition() {
		if (creatE__TRG__tDefinition != null && creatE__TRG__tDefinition.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tDefinition = (InternalEObject) creatE__TRG__tDefinition;
			creatE__TRG__tDefinition = (TFieldDefinition) eResolveProxy(oldCREATE__TRG__tDefinition);
			if (creatE__TRG__tDefinition != oldCREATE__TRG__tDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_TRG_TDEFINITION,
							oldCREATE__TRG__tDefinition, creatE__TRG__tDefinition));
			}
		}
		return creatE__TRG__tDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldDefinition basicGetCREATE__TRG__tDefinition() {
		return creatE__TRG__tDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tDefinition(TFieldDefinition newCREATE__TRG__tDefinition) {
		TFieldDefinition oldCREATE__TRG__tDefinition = creatE__TRG__tDefinition;
		creatE__TRG__tDefinition = newCREATE__TRG__tDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_TRG_TDEFINITION, oldCREATE__TRG__tDefinition,
					creatE__TRG__tDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldSignature getCONTEXT__TRG__tFieldSignature() {
		if (contexT__TRG__tFieldSignature != null && contexT__TRG__tFieldSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tFieldSignature = (InternalEObject) contexT__TRG__tFieldSignature;
			contexT__TRG__tFieldSignature = (TFieldSignature) eResolveProxy(oldCONTEXT__TRG__tFieldSignature);
			if (contexT__TRG__tFieldSignature != oldCONTEXT__TRG__tFieldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE,
							oldCONTEXT__TRG__tFieldSignature, contexT__TRG__tFieldSignature));
			}
		}
		return contexT__TRG__tFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldSignature basicGetCONTEXT__TRG__tFieldSignature() {
		return contexT__TRG__tFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tFieldSignature(TFieldSignature newCONTEXT__TRG__tFieldSignature) {
		TFieldSignature oldCONTEXT__TRG__tFieldSignature = contexT__TRG__tFieldSignature;
		contexT__TRG__tFieldSignature = newCONTEXT__TRG__tFieldSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE,
					oldCONTEXT__TRG__tFieldSignature, contexT__TRG__tFieldSignature));
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
							ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION,
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
					ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION,
					oldCREATE__CORR__mBodyToTAnnotation, creatE__CORR__mBodyToTAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElementToTAbstractFlowElement getCREATE__CORR__mDefinitionToTDefinition() {
		if (creatE__CORR__mDefinitionToTDefinition != null && creatE__CORR__mDefinitionToTDefinition.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mDefinitionToTDefinition = (InternalEObject) creatE__CORR__mDefinitionToTDefinition;
			creatE__CORR__mDefinitionToTDefinition = (MAbstractFlowElementToTAbstractFlowElement) eResolveProxy(
					oldCREATE__CORR__mDefinitionToTDefinition);
			if (creatE__CORR__mDefinitionToTDefinition != oldCREATE__CORR__mDefinitionToTDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TDEFINITION,
							oldCREATE__CORR__mDefinitionToTDefinition, creatE__CORR__mDefinitionToTDefinition));
			}
		}
		return creatE__CORR__mDefinitionToTDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElementToTAbstractFlowElement basicGetCREATE__CORR__mDefinitionToTDefinition() {
		return creatE__CORR__mDefinitionToTDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mDefinitionToTDefinition(
			MAbstractFlowElementToTAbstractFlowElement newCREATE__CORR__mDefinitionToTDefinition) {
		MAbstractFlowElementToTAbstractFlowElement oldCREATE__CORR__mDefinitionToTDefinition = creatE__CORR__mDefinitionToTDefinition;
		creatE__CORR__mDefinitionToTDefinition = newCREATE__CORR__mDefinitionToTDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TDEFINITION,
					oldCREATE__CORR__mDefinitionToTDefinition, creatE__CORR__mDefinitionToTDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember getCREATE__CORR__mDefinitionToTMember() {
		if (creatE__CORR__mDefinitionToTMember != null && creatE__CORR__mDefinitionToTMember.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mDefinitionToTMember = (InternalEObject) creatE__CORR__mDefinitionToTMember;
			creatE__CORR__mDefinitionToTMember = (MDefinitionToTMember) eResolveProxy(
					oldCREATE__CORR__mDefinitionToTMember);
			if (creatE__CORR__mDefinitionToTMember != oldCREATE__CORR__mDefinitionToTMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER,
							oldCREATE__CORR__mDefinitionToTMember, creatE__CORR__mDefinitionToTMember));
			}
		}
		return creatE__CORR__mDefinitionToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTMember basicGetCREATE__CORR__mDefinitionToTMember() {
		return creatE__CORR__mDefinitionToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mDefinitionToTMember(MDefinitionToTMember newCREATE__CORR__mDefinitionToTMember) {
		MDefinitionToTMember oldCREATE__CORR__mDefinitionToTMember = creatE__CORR__mDefinitionToTMember;
		creatE__CORR__mDefinitionToTMember = newCREATE__CORR__mDefinitionToTMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER,
					oldCREATE__CORR__mDefinitionToTMember, creatE__CORR__mDefinitionToTMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSignatureToTSignature getCONTEXT__CORR__mSignatureToTFieldSignature() {
		if (contexT__CORR__mSignatureToTFieldSignature != null
				&& contexT__CORR__mSignatureToTFieldSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mSignatureToTFieldSignature = (InternalEObject) contexT__CORR__mSignatureToTFieldSignature;
			contexT__CORR__mSignatureToTFieldSignature = (MSignatureToTSignature) eResolveProxy(
					oldCONTEXT__CORR__mSignatureToTFieldSignature);
			if (contexT__CORR__mSignatureToTFieldSignature != oldCONTEXT__CORR__mSignatureToTFieldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE,
							oldCONTEXT__CORR__mSignatureToTFieldSignature, contexT__CORR__mSignatureToTFieldSignature));
			}
		}
		return contexT__CORR__mSignatureToTFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSignatureToTSignature basicGetCONTEXT__CORR__mSignatureToTFieldSignature() {
		return contexT__CORR__mSignatureToTFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mSignatureToTFieldSignature(
			MSignatureToTSignature newCONTEXT__CORR__mSignatureToTFieldSignature) {
		MSignatureToTSignature oldCONTEXT__CORR__mSignatureToTFieldSignature = contexT__CORR__mSignatureToTFieldSignature;
		contexT__CORR__mSignatureToTFieldSignature = newCONTEXT__CORR__mSignatureToTFieldSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE,
					oldCONTEXT__CORR__mSignatureToTFieldSignature, contexT__CORR__mSignatureToTFieldSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_SRC_MDEFINITION:
			if (resolve)
				return getCREATE__SRC__mDefinition();
			return basicGetCREATE__SRC__mDefinition();
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE:
			if (resolve)
				return getCONTEXT__SRC__mSignature();
			return basicGetCONTEXT__SRC__mSignature();
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_TRG_TDEFINITION:
			if (resolve)
				return getCREATE__TRG__tDefinition();
			return basicGetCREATE__TRG__tDefinition();
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE:
			if (resolve)
				return getCONTEXT__TRG__tFieldSignature();
			return basicGetCONTEXT__TRG__tFieldSignature();
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			if (resolve)
				return getCREATE__CORR__mBodyToTAnnotation();
			return basicGetCREATE__CORR__mBodyToTAnnotation();
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TDEFINITION:
			if (resolve)
				return getCREATE__CORR__mDefinitionToTDefinition();
			return basicGetCREATE__CORR__mDefinitionToTDefinition();
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER:
			if (resolve)
				return getCREATE__CORR__mDefinitionToTMember();
			return basicGetCREATE__CORR__mDefinitionToTMember();
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE:
			if (resolve)
				return getCONTEXT__CORR__mSignatureToTFieldSignature();
			return basicGetCONTEXT__CORR__mSignatureToTFieldSignature();
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
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_SRC_MDEFINITION:
			setCREATE__SRC__mDefinition((MFieldDefinition) newValue);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE:
			setCONTEXT__SRC__mSignature((MFieldSignature) newValue);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_TRG_TDEFINITION:
			setCREATE__TRG__tDefinition((TFieldDefinition) newValue);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE:
			setCONTEXT__TRG__tFieldSignature((TFieldSignature) newValue);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			setCREATE__CORR__mBodyToTAnnotation((ASTNodeToTAnnotatable) newValue);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TDEFINITION:
			setCREATE__CORR__mDefinitionToTDefinition((MAbstractFlowElementToTAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER:
			setCREATE__CORR__mDefinitionToTMember((MDefinitionToTMember) newValue);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE:
			setCONTEXT__CORR__mSignatureToTFieldSignature((MSignatureToTSignature) newValue);
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
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_SRC_MDEFINITION:
			setCREATE__SRC__mDefinition((MFieldDefinition) null);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE:
			setCONTEXT__SRC__mSignature((MFieldSignature) null);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_TRG_TDEFINITION:
			setCREATE__TRG__tDefinition((TFieldDefinition) null);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE:
			setCONTEXT__TRG__tFieldSignature((TFieldSignature) null);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			setCREATE__CORR__mBodyToTAnnotation((ASTNodeToTAnnotatable) null);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TDEFINITION:
			setCREATE__CORR__mDefinitionToTDefinition((MAbstractFlowElementToTAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER:
			setCREATE__CORR__mDefinitionToTMember((MDefinitionToTMember) null);
			return;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE:
			setCONTEXT__CORR__mSignatureToTFieldSignature((MSignatureToTSignature) null);
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
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_SRC_MDEFINITION:
			return creatE__SRC__mDefinition != null;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE:
			return contexT__SRC__mSignature != null;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_TRG_TDEFINITION:
			return creatE__TRG__tDefinition != null;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_TRG_TFIELD_SIGNATURE:
			return contexT__TRG__tFieldSignature != null;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			return creatE__CORR__mBodyToTAnnotation != null;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TDEFINITION:
			return creatE__CORR__mDefinitionToTDefinition != null;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER:
			return creatE__CORR__mDefinitionToTMember != null;
		case ModiscoTGGPackage.FIELD_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TFIELD_SIGNATURE:
			return contexT__CORR__mSignatureToTFieldSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldDefinition__MarkerImpl
