/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.FieldAccessWrite__Marker;
import ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement;
import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.MSingleVariableAccessToTAccess;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.VariableDeclarationFragment;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MSingleVariableAccess;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TWrite;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Access Write Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCONTEXT__SRC__mField <em>CONTEXT SRC mField</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCONTEXT__SRC__varDeclFrag <em>CONTEXT SRC var Decl Frag</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCONTEXT__TRG__tField <em>CONTEXT TRG tField</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCREATE__CORR__mAccessToTAccess <em>CREATE CORR mAccess To TAccess</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCREATE__CORR__mFlowOwnerToTFlowOwner <em>CREATE CORR mFlow Owner To TFlow Owner</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldAccessWrite__MarkerImpl#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldAccessWrite__MarkerImpl extends TGGRuleApplicationImpl implements FieldAccessWrite__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__mAccess() <em>CREATE SRC mAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mAccess()
	 * @generated
	 * @ordered
	 */
	protected MSingleVariableAccess creatE__SRC__mAccess;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mField() <em>CONTEXT SRC mField</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mField()
	 * @generated
	 * @ordered
	 */
	protected MFieldDefinition contexT__SRC__mField;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mMember() <em>CONTEXT SRC mMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mMember()
	 * @generated
	 * @ordered
	 */
	protected MDefinition contexT__SRC__mMember;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mType() <em>CONTEXT SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mType()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeDeclaration contexT__SRC__mType;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__varDeclFrag() <em>CONTEXT SRC var Decl Frag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__varDeclFrag()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationFragment contexT__SRC__varDeclFrag;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tAccess() <em>CREATE TRG tAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tAccess()
	 * @generated
	 * @ordered
	 */
	protected TWrite creatE__TRG__tAccess;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tField() <em>CONTEXT TRG tField</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tField()
	 * @generated
	 * @ordered
	 */
	protected TFieldDefinition contexT__TRG__tField;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tMember() <em>CONTEXT TRG tMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tMember()
	 * @generated
	 * @ordered
	 */
	protected TMember contexT__TRG__tMember;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tType() <em>CONTEXT TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tType()
	 * @generated
	 * @ordered
	 */
	protected TAbstractType contexT__TRG__tType;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mAccessToTAccess() <em>CREATE CORR mAccess To TAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mAccessToTAccess()
	 * @generated
	 * @ordered
	 */
	protected MSingleVariableAccessToTAccess creatE__CORR__mAccessToTAccess;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mFlowOwnerToTFlowOwner() <em>CREATE CORR mFlow Owner To TFlow Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mFlowOwnerToTFlowOwner()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElementToTAbstractFlowElement creatE__CORR__mFlowOwnerToTFlowOwner;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mMemberToTMember() <em>CONTEXT CORR mMember To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mMemberToTMember()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember contexT__CORR__mMemberToTMember;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mMethodToTMethod() <em>CONTEXT CORR mMethod To TMethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mMethodToTMethod()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember contexT__CORR__mMethodToTMethod;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mTypeToTType() <em>CONTEXT CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mTypeToTType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType contexT__CORR__mTypeToTType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldAccessWrite__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getFieldAccessWrite__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSingleVariableAccess getCREATE__SRC__mAccess() {
		if (creatE__SRC__mAccess != null && creatE__SRC__mAccess.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mAccess = (InternalEObject) creatE__SRC__mAccess;
			creatE__SRC__mAccess = (MSingleVariableAccess) eResolveProxy(oldCREATE__SRC__mAccess);
			if (creatE__SRC__mAccess != oldCREATE__SRC__mAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_SRC_MACCESS, oldCREATE__SRC__mAccess,
							creatE__SRC__mAccess));
			}
		}
		return creatE__SRC__mAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSingleVariableAccess basicGetCREATE__SRC__mAccess() {
		return creatE__SRC__mAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mAccess(MSingleVariableAccess newCREATE__SRC__mAccess) {
		MSingleVariableAccess oldCREATE__SRC__mAccess = creatE__SRC__mAccess;
		creatE__SRC__mAccess = newCREATE__SRC__mAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_SRC_MACCESS, oldCREATE__SRC__mAccess,
					creatE__SRC__mAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFieldDefinition getCONTEXT__SRC__mField() {
		if (contexT__SRC__mField != null && contexT__SRC__mField.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mField = (InternalEObject) contexT__SRC__mField;
			contexT__SRC__mField = (MFieldDefinition) eResolveProxy(oldCONTEXT__SRC__mField);
			if (contexT__SRC__mField != oldCONTEXT__SRC__mField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MFIELD, oldCONTEXT__SRC__mField,
							contexT__SRC__mField));
			}
		}
		return contexT__SRC__mField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldDefinition basicGetCONTEXT__SRC__mField() {
		return contexT__SRC__mField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mField(MFieldDefinition newCONTEXT__SRC__mField) {
		MFieldDefinition oldCONTEXT__SRC__mField = contexT__SRC__mField;
		contexT__SRC__mField = newCONTEXT__SRC__mField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MFIELD, oldCONTEXT__SRC__mField,
					contexT__SRC__mField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinition getCONTEXT__SRC__mMember() {
		if (contexT__SRC__mMember != null && contexT__SRC__mMember.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mMember = (InternalEObject) contexT__SRC__mMember;
			contexT__SRC__mMember = (MDefinition) eResolveProxy(oldCONTEXT__SRC__mMember);
			if (contexT__SRC__mMember != oldCONTEXT__SRC__mMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MMEMBER, oldCONTEXT__SRC__mMember,
							contexT__SRC__mMember));
			}
		}
		return contexT__SRC__mMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinition basicGetCONTEXT__SRC__mMember() {
		return contexT__SRC__mMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mMember(MDefinition newCONTEXT__SRC__mMember) {
		MDefinition oldCONTEXT__SRC__mMember = contexT__SRC__mMember;
		contexT__SRC__mMember = newCONTEXT__SRC__mMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MMEMBER, oldCONTEXT__SRC__mMember,
					contexT__SRC__mMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeDeclaration getCONTEXT__SRC__mType() {
		if (contexT__SRC__mType != null && contexT__SRC__mType.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mType = (InternalEObject) contexT__SRC__mType;
			contexT__SRC__mType = (AbstractTypeDeclaration) eResolveProxy(oldCONTEXT__SRC__mType);
			if (contexT__SRC__mType != oldCONTEXT__SRC__mType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MTYPE, oldCONTEXT__SRC__mType,
							contexT__SRC__mType));
			}
		}
		return contexT__SRC__mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration basicGetCONTEXT__SRC__mType() {
		return contexT__SRC__mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mType(AbstractTypeDeclaration newCONTEXT__SRC__mType) {
		AbstractTypeDeclaration oldCONTEXT__SRC__mType = contexT__SRC__mType;
		contexT__SRC__mType = newCONTEXT__SRC__mType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MTYPE, oldCONTEXT__SRC__mType,
					contexT__SRC__mType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragment getCONTEXT__SRC__varDeclFrag() {
		if (contexT__SRC__varDeclFrag != null && contexT__SRC__varDeclFrag.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__varDeclFrag = (InternalEObject) contexT__SRC__varDeclFrag;
			contexT__SRC__varDeclFrag = (VariableDeclarationFragment) eResolveProxy(oldCONTEXT__SRC__varDeclFrag);
			if (contexT__SRC__varDeclFrag != oldCONTEXT__SRC__varDeclFrag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_VAR_DECL_FRAG,
							oldCONTEXT__SRC__varDeclFrag, contexT__SRC__varDeclFrag));
			}
		}
		return contexT__SRC__varDeclFrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationFragment basicGetCONTEXT__SRC__varDeclFrag() {
		return contexT__SRC__varDeclFrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__varDeclFrag(VariableDeclarationFragment newCONTEXT__SRC__varDeclFrag) {
		VariableDeclarationFragment oldCONTEXT__SRC__varDeclFrag = contexT__SRC__varDeclFrag;
		contexT__SRC__varDeclFrag = newCONTEXT__SRC__varDeclFrag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_VAR_DECL_FRAG,
					oldCONTEXT__SRC__varDeclFrag, contexT__SRC__varDeclFrag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TWrite getCREATE__TRG__tAccess() {
		if (creatE__TRG__tAccess != null && creatE__TRG__tAccess.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tAccess = (InternalEObject) creatE__TRG__tAccess;
			creatE__TRG__tAccess = (TWrite) eResolveProxy(oldCREATE__TRG__tAccess);
			if (creatE__TRG__tAccess != oldCREATE__TRG__tAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_TRG_TACCESS, oldCREATE__TRG__tAccess,
							creatE__TRG__tAccess));
			}
		}
		return creatE__TRG__tAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TWrite basicGetCREATE__TRG__tAccess() {
		return creatE__TRG__tAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tAccess(TWrite newCREATE__TRG__tAccess) {
		TWrite oldCREATE__TRG__tAccess = creatE__TRG__tAccess;
		creatE__TRG__tAccess = newCREATE__TRG__tAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_TRG_TACCESS, oldCREATE__TRG__tAccess,
					creatE__TRG__tAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldDefinition getCONTEXT__TRG__tField() {
		if (contexT__TRG__tField != null && contexT__TRG__tField.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tField = (InternalEObject) contexT__TRG__tField;
			contexT__TRG__tField = (TFieldDefinition) eResolveProxy(oldCONTEXT__TRG__tField);
			if (contexT__TRG__tField != oldCONTEXT__TRG__tField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TFIELD, oldCONTEXT__TRG__tField,
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
	public TFieldDefinition basicGetCONTEXT__TRG__tField() {
		return contexT__TRG__tField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tField(TFieldDefinition newCONTEXT__TRG__tField) {
		TFieldDefinition oldCONTEXT__TRG__tField = contexT__TRG__tField;
		contexT__TRG__tField = newCONTEXT__TRG__tField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TFIELD, oldCONTEXT__TRG__tField,
					contexT__TRG__tField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMember getCONTEXT__TRG__tMember() {
		if (contexT__TRG__tMember != null && contexT__TRG__tMember.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tMember = (InternalEObject) contexT__TRG__tMember;
			contexT__TRG__tMember = (TMember) eResolveProxy(oldCONTEXT__TRG__tMember);
			if (contexT__TRG__tMember != oldCONTEXT__TRG__tMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TMEMBER, oldCONTEXT__TRG__tMember,
							contexT__TRG__tMember));
			}
		}
		return contexT__TRG__tMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMember basicGetCONTEXT__TRG__tMember() {
		return contexT__TRG__tMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tMember(TMember newCONTEXT__TRG__tMember) {
		TMember oldCONTEXT__TRG__tMember = contexT__TRG__tMember;
		contexT__TRG__tMember = newCONTEXT__TRG__tMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TMEMBER, oldCONTEXT__TRG__tMember,
					contexT__TRG__tMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractType getCONTEXT__TRG__tType() {
		if (contexT__TRG__tType != null && contexT__TRG__tType.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tType = (InternalEObject) contexT__TRG__tType;
			contexT__TRG__tType = (TAbstractType) eResolveProxy(oldCONTEXT__TRG__tType);
			if (contexT__TRG__tType != oldCONTEXT__TRG__tType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TTYPE, oldCONTEXT__TRG__tType,
							contexT__TRG__tType));
			}
		}
		return contexT__TRG__tType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractType basicGetCONTEXT__TRG__tType() {
		return contexT__TRG__tType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tType(TAbstractType newCONTEXT__TRG__tType) {
		TAbstractType oldCONTEXT__TRG__tType = contexT__TRG__tType;
		contexT__TRG__tType = newCONTEXT__TRG__tType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TTYPE, oldCONTEXT__TRG__tType,
					contexT__TRG__tType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSingleVariableAccessToTAccess getCREATE__CORR__mAccessToTAccess() {
		if (creatE__CORR__mAccessToTAccess != null && creatE__CORR__mAccessToTAccess.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mAccessToTAccess = (InternalEObject) creatE__CORR__mAccessToTAccess;
			creatE__CORR__mAccessToTAccess = (MSingleVariableAccessToTAccess) eResolveProxy(
					oldCREATE__CORR__mAccessToTAccess);
			if (creatE__CORR__mAccessToTAccess != oldCREATE__CORR__mAccessToTAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MACCESS_TO_TACCESS,
							oldCREATE__CORR__mAccessToTAccess, creatE__CORR__mAccessToTAccess));
			}
		}
		return creatE__CORR__mAccessToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSingleVariableAccessToTAccess basicGetCREATE__CORR__mAccessToTAccess() {
		return creatE__CORR__mAccessToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mAccessToTAccess(MSingleVariableAccessToTAccess newCREATE__CORR__mAccessToTAccess) {
		MSingleVariableAccessToTAccess oldCREATE__CORR__mAccessToTAccess = creatE__CORR__mAccessToTAccess;
		creatE__CORR__mAccessToTAccess = newCREATE__CORR__mAccessToTAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MACCESS_TO_TACCESS,
					oldCREATE__CORR__mAccessToTAccess, creatE__CORR__mAccessToTAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElementToTAbstractFlowElement getCREATE__CORR__mFlowOwnerToTFlowOwner() {
		if (creatE__CORR__mFlowOwnerToTFlowOwner != null && creatE__CORR__mFlowOwnerToTFlowOwner.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mFlowOwnerToTFlowOwner = (InternalEObject) creatE__CORR__mFlowOwnerToTFlowOwner;
			creatE__CORR__mFlowOwnerToTFlowOwner = (MAbstractFlowElementToTAbstractFlowElement) eResolveProxy(
					oldCREATE__CORR__mFlowOwnerToTFlowOwner);
			if (creatE__CORR__mFlowOwnerToTFlowOwner != oldCREATE__CORR__mFlowOwnerToTFlowOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MFLOW_OWNER_TO_TFLOW_OWNER,
							oldCREATE__CORR__mFlowOwnerToTFlowOwner, creatE__CORR__mFlowOwnerToTFlowOwner));
			}
		}
		return creatE__CORR__mFlowOwnerToTFlowOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElementToTAbstractFlowElement basicGetCREATE__CORR__mFlowOwnerToTFlowOwner() {
		return creatE__CORR__mFlowOwnerToTFlowOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mFlowOwnerToTFlowOwner(
			MAbstractFlowElementToTAbstractFlowElement newCREATE__CORR__mFlowOwnerToTFlowOwner) {
		MAbstractFlowElementToTAbstractFlowElement oldCREATE__CORR__mFlowOwnerToTFlowOwner = creatE__CORR__mFlowOwnerToTFlowOwner;
		creatE__CORR__mFlowOwnerToTFlowOwner = newCREATE__CORR__mFlowOwnerToTFlowOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MFLOW_OWNER_TO_TFLOW_OWNER,
					oldCREATE__CORR__mFlowOwnerToTFlowOwner, creatE__CORR__mFlowOwnerToTFlowOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember getCONTEXT__CORR__mMemberToTMember() {
		if (contexT__CORR__mMemberToTMember != null && contexT__CORR__mMemberToTMember.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mMemberToTMember = (InternalEObject) contexT__CORR__mMemberToTMember;
			contexT__CORR__mMemberToTMember = (MDefinitionToTMember) eResolveProxy(oldCONTEXT__CORR__mMemberToTMember);
			if (contexT__CORR__mMemberToTMember != oldCONTEXT__CORR__mMemberToTMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER,
							oldCONTEXT__CORR__mMemberToTMember, contexT__CORR__mMemberToTMember));
			}
		}
		return contexT__CORR__mMemberToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTMember basicGetCONTEXT__CORR__mMemberToTMember() {
		return contexT__CORR__mMemberToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mMemberToTMember(MDefinitionToTMember newCONTEXT__CORR__mMemberToTMember) {
		MDefinitionToTMember oldCONTEXT__CORR__mMemberToTMember = contexT__CORR__mMemberToTMember;
		contexT__CORR__mMemberToTMember = newCONTEXT__CORR__mMemberToTMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER,
					oldCONTEXT__CORR__mMemberToTMember, contexT__CORR__mMemberToTMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember getCONTEXT__CORR__mMethodToTMethod() {
		if (contexT__CORR__mMethodToTMethod != null && contexT__CORR__mMethodToTMethod.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mMethodToTMethod = (InternalEObject) contexT__CORR__mMethodToTMethod;
			contexT__CORR__mMethodToTMethod = (MDefinitionToTMember) eResolveProxy(oldCONTEXT__CORR__mMethodToTMethod);
			if (contexT__CORR__mMethodToTMethod != oldCONTEXT__CORR__mMethodToTMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD,
							oldCONTEXT__CORR__mMethodToTMethod, contexT__CORR__mMethodToTMethod));
			}
		}
		return contexT__CORR__mMethodToTMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTMember basicGetCONTEXT__CORR__mMethodToTMethod() {
		return contexT__CORR__mMethodToTMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mMethodToTMethod(MDefinitionToTMember newCONTEXT__CORR__mMethodToTMethod) {
		MDefinitionToTMember oldCONTEXT__CORR__mMethodToTMethod = contexT__CORR__mMethodToTMethod;
		contexT__CORR__mMethodToTMethod = newCONTEXT__CORR__mMethodToTMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD,
					oldCONTEXT__CORR__mMethodToTMethod, contexT__CORR__mMethodToTMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCONTEXT__CORR__mTypeToTType() {
		if (contexT__CORR__mTypeToTType != null && contexT__CORR__mTypeToTType.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mTypeToTType = (InternalEObject) contexT__CORR__mTypeToTType;
			contexT__CORR__mTypeToTType = (TypeToTAbstractType) eResolveProxy(oldCONTEXT__CORR__mTypeToTType);
			if (contexT__CORR__mTypeToTType != oldCONTEXT__CORR__mTypeToTType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
							oldCONTEXT__CORR__mTypeToTType, contexT__CORR__mTypeToTType));
			}
		}
		return contexT__CORR__mTypeToTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCONTEXT__CORR__mTypeToTType() {
		return contexT__CORR__mTypeToTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mTypeToTType(TypeToTAbstractType newCONTEXT__CORR__mTypeToTType) {
		TypeToTAbstractType oldCONTEXT__CORR__mTypeToTType = contexT__CORR__mTypeToTType;
		contexT__CORR__mTypeToTType = newCONTEXT__CORR__mTypeToTType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE,
					oldCONTEXT__CORR__mTypeToTType, contexT__CORR__mTypeToTType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_SRC_MACCESS:
			if (resolve)
				return getCREATE__SRC__mAccess();
			return basicGetCREATE__SRC__mAccess();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MFIELD:
			if (resolve)
				return getCONTEXT__SRC__mField();
			return basicGetCONTEXT__SRC__mField();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MMEMBER:
			if (resolve)
				return getCONTEXT__SRC__mMember();
			return basicGetCONTEXT__SRC__mMember();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MTYPE:
			if (resolve)
				return getCONTEXT__SRC__mType();
			return basicGetCONTEXT__SRC__mType();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_VAR_DECL_FRAG:
			if (resolve)
				return getCONTEXT__SRC__varDeclFrag();
			return basicGetCONTEXT__SRC__varDeclFrag();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_TRG_TACCESS:
			if (resolve)
				return getCREATE__TRG__tAccess();
			return basicGetCREATE__TRG__tAccess();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TFIELD:
			if (resolve)
				return getCONTEXT__TRG__tField();
			return basicGetCONTEXT__TRG__tField();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TMEMBER:
			if (resolve)
				return getCONTEXT__TRG__tMember();
			return basicGetCONTEXT__TRG__tMember();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TTYPE:
			if (resolve)
				return getCONTEXT__TRG__tType();
			return basicGetCONTEXT__TRG__tType();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MACCESS_TO_TACCESS:
			if (resolve)
				return getCREATE__CORR__mAccessToTAccess();
			return basicGetCREATE__CORR__mAccessToTAccess();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MFLOW_OWNER_TO_TFLOW_OWNER:
			if (resolve)
				return getCREATE__CORR__mFlowOwnerToTFlowOwner();
			return basicGetCREATE__CORR__mFlowOwnerToTFlowOwner();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			if (resolve)
				return getCONTEXT__CORR__mMemberToTMember();
			return basicGetCONTEXT__CORR__mMemberToTMember();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD:
			if (resolve)
				return getCONTEXT__CORR__mMethodToTMethod();
			return basicGetCONTEXT__CORR__mMethodToTMethod();
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			if (resolve)
				return getCONTEXT__CORR__mTypeToTType();
			return basicGetCONTEXT__CORR__mTypeToTType();
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
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_SRC_MACCESS:
			setCREATE__SRC__mAccess((MSingleVariableAccess) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MFIELD:
			setCONTEXT__SRC__mField((MFieldDefinition) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MMEMBER:
			setCONTEXT__SRC__mMember((MDefinition) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((AbstractTypeDeclaration) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_VAR_DECL_FRAG:
			setCONTEXT__SRC__varDeclFrag((VariableDeclarationFragment) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_TRG_TACCESS:
			setCREATE__TRG__tAccess((TWrite) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TFIELD:
			setCONTEXT__TRG__tField((TFieldDefinition) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TMEMBER:
			setCONTEXT__TRG__tMember((TMember) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TTYPE:
			setCONTEXT__TRG__tType((TAbstractType) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MACCESS_TO_TACCESS:
			setCREATE__CORR__mAccessToTAccess((MSingleVariableAccessToTAccess) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MFLOW_OWNER_TO_TFLOW_OWNER:
			setCREATE__CORR__mFlowOwnerToTFlowOwner((MAbstractFlowElementToTAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			setCONTEXT__CORR__mMemberToTMember((MDefinitionToTMember) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD:
			setCONTEXT__CORR__mMethodToTMethod((MDefinitionToTMember) newValue);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			setCONTEXT__CORR__mTypeToTType((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_SRC_MACCESS:
			setCREATE__SRC__mAccess((MSingleVariableAccess) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MFIELD:
			setCONTEXT__SRC__mField((MFieldDefinition) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MMEMBER:
			setCONTEXT__SRC__mMember((MDefinition) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MTYPE:
			setCONTEXT__SRC__mType((AbstractTypeDeclaration) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_VAR_DECL_FRAG:
			setCONTEXT__SRC__varDeclFrag((VariableDeclarationFragment) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_TRG_TACCESS:
			setCREATE__TRG__tAccess((TWrite) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TFIELD:
			setCONTEXT__TRG__tField((TFieldDefinition) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TMEMBER:
			setCONTEXT__TRG__tMember((TMember) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TTYPE:
			setCONTEXT__TRG__tType((TAbstractType) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MACCESS_TO_TACCESS:
			setCREATE__CORR__mAccessToTAccess((MSingleVariableAccessToTAccess) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MFLOW_OWNER_TO_TFLOW_OWNER:
			setCREATE__CORR__mFlowOwnerToTFlowOwner((MAbstractFlowElementToTAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			setCONTEXT__CORR__mMemberToTMember((MDefinitionToTMember) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD:
			setCONTEXT__CORR__mMethodToTMethod((MDefinitionToTMember) null);
			return;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			setCONTEXT__CORR__mTypeToTType((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_SRC_MACCESS:
			return creatE__SRC__mAccess != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MFIELD:
			return contexT__SRC__mField != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MMEMBER:
			return contexT__SRC__mMember != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_MTYPE:
			return contexT__SRC__mType != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_SRC_VAR_DECL_FRAG:
			return contexT__SRC__varDeclFrag != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_TRG_TACCESS:
			return creatE__TRG__tAccess != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TFIELD:
			return contexT__TRG__tField != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TMEMBER:
			return contexT__TRG__tMember != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_TRG_TTYPE:
			return contexT__TRG__tType != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MACCESS_TO_TACCESS:
			return creatE__CORR__mAccessToTAccess != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CREATE_CORR_MFLOW_OWNER_TO_TFLOW_OWNER:
			return creatE__CORR__mFlowOwnerToTFlowOwner != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			return contexT__CORR__mMemberToTMember != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MMETHOD_TO_TMETHOD:
			return contexT__CORR__mMethodToTMethod != null;
		case ModiscoTGGPackage.FIELD_ACCESS_WRITE_MARKER__CONTEXT_CORR_MTYPE_TO_TTYPE:
			return contexT__CORR__mTypeToTType != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldAccessWrite__MarkerImpl
