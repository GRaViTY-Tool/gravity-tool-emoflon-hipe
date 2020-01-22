/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ASTNodeToTAnnotatable;
import ModiscoTGG.ConstructorDefinition__Marker;
import ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement;
import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.MSignatureToTSignature;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MMethodSignature;

import org.gravity.typegraph.basic.TConstructor;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Definition Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.ConstructorDefinition__MarkerImpl#getCREATE__SRC__mDefinition <em>CREATE SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorDefinition__MarkerImpl#getCONTEXT__SRC__mSignature <em>CONTEXT SRC mSignature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorDefinition__MarkerImpl#getCREATE__TRG__tAnnotation <em>CREATE TRG tAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorDefinition__MarkerImpl#getCREATE__TRG__tDefinition <em>CREATE TRG tDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorDefinition__MarkerImpl#getCONTEXT__TRG__tMethodSignature <em>CONTEXT TRG tMethod Signature</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorDefinition__MarkerImpl#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorDefinition__MarkerImpl#getCREATE__CORR__mDefinitionToTMember <em>CREATE CORR mDefinition To TMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorDefinition__MarkerImpl#getCREATE__CORR__mFlowElementToTFlowElement <em>CREATE CORR mFlow Element To TFlow Element</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ConstructorDefinition__MarkerImpl#getCONTEXT__CORR__mSignatureToTMethodSignature <em>CONTEXT CORR mSignature To TMethod Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorDefinition__MarkerImpl extends TGGRuleApplicationImpl implements ConstructorDefinition__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__mDefinition() <em>CREATE SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mDefinition()
	 * @generated
	 * @ordered
	 */
	protected MConstructorDefinition creatE__SRC__mDefinition;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mSignature() <em>CONTEXT SRC mSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mSignature()
	 * @generated
	 * @ordered
	 */
	protected MMethodSignature contexT__SRC__mSignature;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tAnnotation() <em>CREATE TRG tAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tAnnotation()
	 * @generated
	 * @ordered
	 */
	protected TConstructor creatE__TRG__tAnnotation;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tDefinition() <em>CREATE TRG tDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tDefinition()
	 * @generated
	 * @ordered
	 */
	protected TMethodDefinition creatE__TRG__tDefinition;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tMethodSignature() <em>CONTEXT TRG tMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tMethodSignature()
	 * @generated
	 * @ordered
	 */
	protected TMethodSignature contexT__TRG__tMethodSignature;

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
	 * The cached value of the '{@link #getCREATE__CORR__mDefinitionToTMember() <em>CREATE CORR mDefinition To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mDefinitionToTMember()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember creatE__CORR__mDefinitionToTMember;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__mSignatureToTMethodSignature() <em>CONTEXT CORR mSignature To TMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mSignatureToTMethodSignature()
	 * @generated
	 * @ordered
	 */
	protected MSignatureToTSignature contexT__CORR__mSignatureToTMethodSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorDefinition__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getConstructorDefinition__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MConstructorDefinition getCREATE__SRC__mDefinition() {
		if (creatE__SRC__mDefinition != null && creatE__SRC__mDefinition.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mDefinition = (InternalEObject) creatE__SRC__mDefinition;
			creatE__SRC__mDefinition = (MConstructorDefinition) eResolveProxy(oldCREATE__SRC__mDefinition);
			if (creatE__SRC__mDefinition != oldCREATE__SRC__mDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_SRC_MDEFINITION,
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
	public MConstructorDefinition basicGetCREATE__SRC__mDefinition() {
		return creatE__SRC__mDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mDefinition(MConstructorDefinition newCREATE__SRC__mDefinition) {
		MConstructorDefinition oldCREATE__SRC__mDefinition = creatE__SRC__mDefinition;
		creatE__SRC__mDefinition = newCREATE__SRC__mDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_SRC_MDEFINITION,
					oldCREATE__SRC__mDefinition, creatE__SRC__mDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodSignature getCONTEXT__SRC__mSignature() {
		if (contexT__SRC__mSignature != null && contexT__SRC__mSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mSignature = (InternalEObject) contexT__SRC__mSignature;
			contexT__SRC__mSignature = (MMethodSignature) eResolveProxy(oldCONTEXT__SRC__mSignature);
			if (contexT__SRC__mSignature != oldCONTEXT__SRC__mSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE,
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
	public MMethodSignature basicGetCONTEXT__SRC__mSignature() {
		return contexT__SRC__mSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mSignature(MMethodSignature newCONTEXT__SRC__mSignature) {
		MMethodSignature oldCONTEXT__SRC__mSignature = contexT__SRC__mSignature;
		contexT__SRC__mSignature = newCONTEXT__SRC__mSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE,
					oldCONTEXT__SRC__mSignature, contexT__SRC__mSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConstructor getCREATE__TRG__tAnnotation() {
		if (creatE__TRG__tAnnotation != null && creatE__TRG__tAnnotation.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tAnnotation = (InternalEObject) creatE__TRG__tAnnotation;
			creatE__TRG__tAnnotation = (TConstructor) eResolveProxy(oldCREATE__TRG__tAnnotation);
			if (creatE__TRG__tAnnotation != oldCREATE__TRG__tAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TANNOTATION,
							oldCREATE__TRG__tAnnotation, creatE__TRG__tAnnotation));
			}
		}
		return creatE__TRG__tAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConstructor basicGetCREATE__TRG__tAnnotation() {
		return creatE__TRG__tAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tAnnotation(TConstructor newCREATE__TRG__tAnnotation) {
		TConstructor oldCREATE__TRG__tAnnotation = creatE__TRG__tAnnotation;
		creatE__TRG__tAnnotation = newCREATE__TRG__tAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TANNOTATION,
					oldCREATE__TRG__tAnnotation, creatE__TRG__tAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodDefinition getCREATE__TRG__tDefinition() {
		if (creatE__TRG__tDefinition != null && creatE__TRG__tDefinition.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tDefinition = (InternalEObject) creatE__TRG__tDefinition;
			creatE__TRG__tDefinition = (TMethodDefinition) eResolveProxy(oldCREATE__TRG__tDefinition);
			if (creatE__TRG__tDefinition != oldCREATE__TRG__tDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TDEFINITION,
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
	public TMethodDefinition basicGetCREATE__TRG__tDefinition() {
		return creatE__TRG__tDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tDefinition(TMethodDefinition newCREATE__TRG__tDefinition) {
		TMethodDefinition oldCREATE__TRG__tDefinition = creatE__TRG__tDefinition;
		creatE__TRG__tDefinition = newCREATE__TRG__tDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TDEFINITION,
					oldCREATE__TRG__tDefinition, creatE__TRG__tDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodSignature getCONTEXT__TRG__tMethodSignature() {
		if (contexT__TRG__tMethodSignature != null && contexT__TRG__tMethodSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tMethodSignature = (InternalEObject) contexT__TRG__tMethodSignature;
			contexT__TRG__tMethodSignature = (TMethodSignature) eResolveProxy(oldCONTEXT__TRG__tMethodSignature);
			if (contexT__TRG__tMethodSignature != oldCONTEXT__TRG__tMethodSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_TRG_TMETHOD_SIGNATURE,
							oldCONTEXT__TRG__tMethodSignature, contexT__TRG__tMethodSignature));
			}
		}
		return contexT__TRG__tMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature basicGetCONTEXT__TRG__tMethodSignature() {
		return contexT__TRG__tMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tMethodSignature(TMethodSignature newCONTEXT__TRG__tMethodSignature) {
		TMethodSignature oldCONTEXT__TRG__tMethodSignature = contexT__TRG__tMethodSignature;
		contexT__TRG__tMethodSignature = newCONTEXT__TRG__tMethodSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_TRG_TMETHOD_SIGNATURE,
					oldCONTEXT__TRG__tMethodSignature, contexT__TRG__tMethodSignature));
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
							ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION,
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
					ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION,
					oldCREATE__CORR__mBodyToTAnnotation, creatE__CORR__mBodyToTAnnotation));
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
							ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER,
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
					ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER,
					oldCREATE__CORR__mDefinitionToTMember, creatE__CORR__mDefinitionToTMember));
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
							ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT,
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
					ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT,
					oldCREATE__CORR__mFlowElementToTFlowElement, creatE__CORR__mFlowElementToTFlowElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSignatureToTSignature getCONTEXT__CORR__mSignatureToTMethodSignature() {
		if (contexT__CORR__mSignatureToTMethodSignature != null
				&& contexT__CORR__mSignatureToTMethodSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mSignatureToTMethodSignature = (InternalEObject) contexT__CORR__mSignatureToTMethodSignature;
			contexT__CORR__mSignatureToTMethodSignature = (MSignatureToTSignature) eResolveProxy(
					oldCONTEXT__CORR__mSignatureToTMethodSignature);
			if (contexT__CORR__mSignatureToTMethodSignature != oldCONTEXT__CORR__mSignatureToTMethodSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TMETHOD_SIGNATURE,
							oldCONTEXT__CORR__mSignatureToTMethodSignature,
							contexT__CORR__mSignatureToTMethodSignature));
			}
		}
		return contexT__CORR__mSignatureToTMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSignatureToTSignature basicGetCONTEXT__CORR__mSignatureToTMethodSignature() {
		return contexT__CORR__mSignatureToTMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mSignatureToTMethodSignature(
			MSignatureToTSignature newCONTEXT__CORR__mSignatureToTMethodSignature) {
		MSignatureToTSignature oldCONTEXT__CORR__mSignatureToTMethodSignature = contexT__CORR__mSignatureToTMethodSignature;
		contexT__CORR__mSignatureToTMethodSignature = newCONTEXT__CORR__mSignatureToTMethodSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TMETHOD_SIGNATURE,
					oldCONTEXT__CORR__mSignatureToTMethodSignature, contexT__CORR__mSignatureToTMethodSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_SRC_MDEFINITION:
			if (resolve)
				return getCREATE__SRC__mDefinition();
			return basicGetCREATE__SRC__mDefinition();
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE:
			if (resolve)
				return getCONTEXT__SRC__mSignature();
			return basicGetCONTEXT__SRC__mSignature();
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TANNOTATION:
			if (resolve)
				return getCREATE__TRG__tAnnotation();
			return basicGetCREATE__TRG__tAnnotation();
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TDEFINITION:
			if (resolve)
				return getCREATE__TRG__tDefinition();
			return basicGetCREATE__TRG__tDefinition();
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_TRG_TMETHOD_SIGNATURE:
			if (resolve)
				return getCONTEXT__TRG__tMethodSignature();
			return basicGetCONTEXT__TRG__tMethodSignature();
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			if (resolve)
				return getCREATE__CORR__mBodyToTAnnotation();
			return basicGetCREATE__CORR__mBodyToTAnnotation();
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER:
			if (resolve)
				return getCREATE__CORR__mDefinitionToTMember();
			return basicGetCREATE__CORR__mDefinitionToTMember();
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			if (resolve)
				return getCREATE__CORR__mFlowElementToTFlowElement();
			return basicGetCREATE__CORR__mFlowElementToTFlowElement();
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TMETHOD_SIGNATURE:
			if (resolve)
				return getCONTEXT__CORR__mSignatureToTMethodSignature();
			return basicGetCONTEXT__CORR__mSignatureToTMethodSignature();
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
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_SRC_MDEFINITION:
			setCREATE__SRC__mDefinition((MConstructorDefinition) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE:
			setCONTEXT__SRC__mSignature((MMethodSignature) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TANNOTATION:
			setCREATE__TRG__tAnnotation((TConstructor) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TDEFINITION:
			setCREATE__TRG__tDefinition((TMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_TRG_TMETHOD_SIGNATURE:
			setCONTEXT__TRG__tMethodSignature((TMethodSignature) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			setCREATE__CORR__mBodyToTAnnotation((ASTNodeToTAnnotatable) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER:
			setCREATE__CORR__mDefinitionToTMember((MDefinitionToTMember) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			setCREATE__CORR__mFlowElementToTFlowElement((MAbstractFlowElementToTAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TMETHOD_SIGNATURE:
			setCONTEXT__CORR__mSignatureToTMethodSignature((MSignatureToTSignature) newValue);
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
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_SRC_MDEFINITION:
			setCREATE__SRC__mDefinition((MConstructorDefinition) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE:
			setCONTEXT__SRC__mSignature((MMethodSignature) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TANNOTATION:
			setCREATE__TRG__tAnnotation((TConstructor) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TDEFINITION:
			setCREATE__TRG__tDefinition((TMethodDefinition) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_TRG_TMETHOD_SIGNATURE:
			setCONTEXT__TRG__tMethodSignature((TMethodSignature) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			setCREATE__CORR__mBodyToTAnnotation((ASTNodeToTAnnotatable) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER:
			setCREATE__CORR__mDefinitionToTMember((MDefinitionToTMember) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			setCREATE__CORR__mFlowElementToTFlowElement((MAbstractFlowElementToTAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TMETHOD_SIGNATURE:
			setCONTEXT__CORR__mSignatureToTMethodSignature((MSignatureToTSignature) null);
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
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_SRC_MDEFINITION:
			return creatE__SRC__mDefinition != null;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_SRC_MSIGNATURE:
			return contexT__SRC__mSignature != null;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TANNOTATION:
			return creatE__TRG__tAnnotation != null;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_TRG_TDEFINITION:
			return creatE__TRG__tDefinition != null;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_TRG_TMETHOD_SIGNATURE:
			return contexT__TRG__tMethodSignature != null;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			return creatE__CORR__mBodyToTAnnotation != null;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MDEFINITION_TO_TMEMBER:
			return creatE__CORR__mDefinitionToTMember != null;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CREATE_CORR_MFLOW_ELEMENT_TO_TFLOW_ELEMENT:
			return creatE__CORR__mFlowElementToTFlowElement != null;
		case ModiscoTGGPackage.CONSTRUCTOR_DEFINITION_MARKER__CONTEXT_CORR_MSIGNATURE_TO_TMETHOD_SIGNATURE:
			return contexT__CORR__mSignatureToTMethodSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstructorDefinition__MarkerImpl
