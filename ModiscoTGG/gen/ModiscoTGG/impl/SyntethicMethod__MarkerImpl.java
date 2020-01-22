/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ClassDeclarationToTClass;
import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.MSyntethicMethodToTSyntethicMethod;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.SyntethicMethod__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.ClassDeclaration;

import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MSyntheticMethodDefinition;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSyntethicMethod;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Syntethic Method Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.SyntethicMethod__MarkerImpl#getCONTEXT__SRC__mClass <em>CONTEXT SRC mClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SyntethicMethod__MarkerImpl#getCONTEXT__SRC__mDef <em>CONTEXT SRC mDef</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SyntethicMethod__MarkerImpl#getCREATE__SRC__mSyntethic <em>CREATE SRC mSyntethic</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SyntethicMethod__MarkerImpl#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SyntethicMethod__MarkerImpl#getCONTEXT__TRG__tDef <em>CONTEXT TRG tDef</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SyntethicMethod__MarkerImpl#getCONTEXT__TRG__tSig <em>CONTEXT TRG tSig</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SyntethicMethod__MarkerImpl#getCREATE__TRG__tSyntethic <em>CREATE TRG tSyntethic</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SyntethicMethod__MarkerImpl#getCONTEXT__CORR__mClassDeclarationToTClass <em>CONTEXT CORR mClass Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SyntethicMethod__MarkerImpl#getCONTEXT__CORR__mDefinitionToTMember <em>CONTEXT CORR mDefinition To TMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.SyntethicMethod__MarkerImpl#getCREATE__CORR__mSyntToTSynt <em>CREATE CORR mSynt To TSynt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SyntethicMethod__MarkerImpl extends TGGRuleApplicationImpl implements SyntethicMethod__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mClass() <em>CONTEXT SRC mClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mClass()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclaration contexT__SRC__mClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mDef() <em>CONTEXT SRC mDef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mDef()
	 * @generated
	 * @ordered
	 */
	protected MMethodDefinition contexT__SRC__mDef;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mSyntethic() <em>CREATE SRC mSyntethic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mSyntethic()
	 * @generated
	 * @ordered
	 */
	protected MSyntheticMethodDefinition creatE__SRC__mSyntethic;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tClass() <em>CONTEXT TRG tClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tClass()
	 * @generated
	 * @ordered
	 */
	protected TClass contexT__TRG__tClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tDef() <em>CONTEXT TRG tDef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tDef()
	 * @generated
	 * @ordered
	 */
	protected TMethodDefinition contexT__TRG__tDef;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tSig() <em>CONTEXT TRG tSig</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tSig()
	 * @generated
	 * @ordered
	 */
	protected TMethodSignature contexT__TRG__tSig;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tSyntethic() <em>CREATE TRG tSyntethic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tSyntethic()
	 * @generated
	 * @ordered
	 */
	protected TSyntethicMethod creatE__TRG__tSyntethic;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mClassDeclarationToTClass() <em>CONTEXT CORR mClass Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mClassDeclarationToTClass()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclarationToTClass contexT__CORR__mClassDeclarationToTClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mDefinitionToTMember() <em>CONTEXT CORR mDefinition To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mDefinitionToTMember()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember contexT__CORR__mDefinitionToTMember;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mSyntToTSynt() <em>CREATE CORR mSynt To TSynt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mSyntToTSynt()
	 * @generated
	 * @ordered
	 */
	protected MSyntethicMethodToTSyntethicMethod creatE__CORR__mSyntToTSynt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyntethicMethod__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getSyntethicMethod__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclaration getCONTEXT__SRC__mClass() {
		if (contexT__SRC__mClass != null && contexT__SRC__mClass.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mClass = (InternalEObject) contexT__SRC__mClass;
			contexT__SRC__mClass = (ClassDeclaration) eResolveProxy(oldCONTEXT__SRC__mClass);
			if (contexT__SRC__mClass != oldCONTEXT__SRC__mClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MCLASS, oldCONTEXT__SRC__mClass,
							contexT__SRC__mClass));
			}
		}
		return contexT__SRC__mClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration basicGetCONTEXT__SRC__mClass() {
		return contexT__SRC__mClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mClass(ClassDeclaration newCONTEXT__SRC__mClass) {
		ClassDeclaration oldCONTEXT__SRC__mClass = contexT__SRC__mClass;
		contexT__SRC__mClass = newCONTEXT__SRC__mClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MCLASS, oldCONTEXT__SRC__mClass,
					contexT__SRC__mClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodDefinition getCONTEXT__SRC__mDef() {
		if (contexT__SRC__mDef != null && contexT__SRC__mDef.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mDef = (InternalEObject) contexT__SRC__mDef;
			contexT__SRC__mDef = (MMethodDefinition) eResolveProxy(oldCONTEXT__SRC__mDef);
			if (contexT__SRC__mDef != oldCONTEXT__SRC__mDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MDEF, oldCONTEXT__SRC__mDef,
							contexT__SRC__mDef));
			}
		}
		return contexT__SRC__mDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodDefinition basicGetCONTEXT__SRC__mDef() {
		return contexT__SRC__mDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mDef(MMethodDefinition newCONTEXT__SRC__mDef) {
		MMethodDefinition oldCONTEXT__SRC__mDef = contexT__SRC__mDef;
		contexT__SRC__mDef = newCONTEXT__SRC__mDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MDEF, oldCONTEXT__SRC__mDef,
					contexT__SRC__mDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSyntheticMethodDefinition getCREATE__SRC__mSyntethic() {
		if (creatE__SRC__mSyntethic != null && creatE__SRC__mSyntethic.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mSyntethic = (InternalEObject) creatE__SRC__mSyntethic;
			creatE__SRC__mSyntethic = (MSyntheticMethodDefinition) eResolveProxy(oldCREATE__SRC__mSyntethic);
			if (creatE__SRC__mSyntethic != oldCREATE__SRC__mSyntethic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_SRC_MSYNTETHIC,
							oldCREATE__SRC__mSyntethic, creatE__SRC__mSyntethic));
			}
		}
		return creatE__SRC__mSyntethic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSyntheticMethodDefinition basicGetCREATE__SRC__mSyntethic() {
		return creatE__SRC__mSyntethic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mSyntethic(MSyntheticMethodDefinition newCREATE__SRC__mSyntethic) {
		MSyntheticMethodDefinition oldCREATE__SRC__mSyntethic = creatE__SRC__mSyntethic;
		creatE__SRC__mSyntethic = newCREATE__SRC__mSyntethic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_SRC_MSYNTETHIC, oldCREATE__SRC__mSyntethic,
					creatE__SRC__mSyntethic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getCONTEXT__TRG__tClass() {
		if (contexT__TRG__tClass != null && contexT__TRG__tClass.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tClass = (InternalEObject) contexT__TRG__tClass;
			contexT__TRG__tClass = (TClass) eResolveProxy(oldCONTEXT__TRG__tClass);
			if (contexT__TRG__tClass != oldCONTEXT__TRG__tClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TCLASS, oldCONTEXT__TRG__tClass,
							contexT__TRG__tClass));
			}
		}
		return contexT__TRG__tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetCONTEXT__TRG__tClass() {
		return contexT__TRG__tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tClass(TClass newCONTEXT__TRG__tClass) {
		TClass oldCONTEXT__TRG__tClass = contexT__TRG__tClass;
		contexT__TRG__tClass = newCONTEXT__TRG__tClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TCLASS, oldCONTEXT__TRG__tClass,
					contexT__TRG__tClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodDefinition getCONTEXT__TRG__tDef() {
		if (contexT__TRG__tDef != null && contexT__TRG__tDef.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tDef = (InternalEObject) contexT__TRG__tDef;
			contexT__TRG__tDef = (TMethodDefinition) eResolveProxy(oldCONTEXT__TRG__tDef);
			if (contexT__TRG__tDef != oldCONTEXT__TRG__tDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TDEF, oldCONTEXT__TRG__tDef,
							contexT__TRG__tDef));
			}
		}
		return contexT__TRG__tDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition basicGetCONTEXT__TRG__tDef() {
		return contexT__TRG__tDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tDef(TMethodDefinition newCONTEXT__TRG__tDef) {
		TMethodDefinition oldCONTEXT__TRG__tDef = contexT__TRG__tDef;
		contexT__TRG__tDef = newCONTEXT__TRG__tDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TDEF, oldCONTEXT__TRG__tDef,
					contexT__TRG__tDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodSignature getCONTEXT__TRG__tSig() {
		if (contexT__TRG__tSig != null && contexT__TRG__tSig.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tSig = (InternalEObject) contexT__TRG__tSig;
			contexT__TRG__tSig = (TMethodSignature) eResolveProxy(oldCONTEXT__TRG__tSig);
			if (contexT__TRG__tSig != oldCONTEXT__TRG__tSig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TSIG, oldCONTEXT__TRG__tSig,
							contexT__TRG__tSig));
			}
		}
		return contexT__TRG__tSig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature basicGetCONTEXT__TRG__tSig() {
		return contexT__TRG__tSig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tSig(TMethodSignature newCONTEXT__TRG__tSig) {
		TMethodSignature oldCONTEXT__TRG__tSig = contexT__TRG__tSig;
		contexT__TRG__tSig = newCONTEXT__TRG__tSig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TSIG, oldCONTEXT__TRG__tSig,
					contexT__TRG__tSig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSyntethicMethod getCREATE__TRG__tSyntethic() {
		if (creatE__TRG__tSyntethic != null && creatE__TRG__tSyntethic.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tSyntethic = (InternalEObject) creatE__TRG__tSyntethic;
			creatE__TRG__tSyntethic = (TSyntethicMethod) eResolveProxy(oldCREATE__TRG__tSyntethic);
			if (creatE__TRG__tSyntethic != oldCREATE__TRG__tSyntethic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_TRG_TSYNTETHIC,
							oldCREATE__TRG__tSyntethic, creatE__TRG__tSyntethic));
			}
		}
		return creatE__TRG__tSyntethic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSyntethicMethod basicGetCREATE__TRG__tSyntethic() {
		return creatE__TRG__tSyntethic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tSyntethic(TSyntethicMethod newCREATE__TRG__tSyntethic) {
		TSyntethicMethod oldCREATE__TRG__tSyntethic = creatE__TRG__tSyntethic;
		creatE__TRG__tSyntethic = newCREATE__TRG__tSyntethic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_TRG_TSYNTETHIC, oldCREATE__TRG__tSyntethic,
					creatE__TRG__tSyntethic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclarationToTClass getCONTEXT__CORR__mClassDeclarationToTClass() {
		if (contexT__CORR__mClassDeclarationToTClass != null && contexT__CORR__mClassDeclarationToTClass.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mClassDeclarationToTClass = (InternalEObject) contexT__CORR__mClassDeclarationToTClass;
			contexT__CORR__mClassDeclarationToTClass = (ClassDeclarationToTClass) eResolveProxy(
					oldCONTEXT__CORR__mClassDeclarationToTClass);
			if (contexT__CORR__mClassDeclarationToTClass != oldCONTEXT__CORR__mClassDeclarationToTClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MCLASS_DECLARATION_TO_TCLASS,
							oldCONTEXT__CORR__mClassDeclarationToTClass, contexT__CORR__mClassDeclarationToTClass));
			}
		}
		return contexT__CORR__mClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclarationToTClass basicGetCONTEXT__CORR__mClassDeclarationToTClass() {
		return contexT__CORR__mClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mClassDeclarationToTClass(
			ClassDeclarationToTClass newCONTEXT__CORR__mClassDeclarationToTClass) {
		ClassDeclarationToTClass oldCONTEXT__CORR__mClassDeclarationToTClass = contexT__CORR__mClassDeclarationToTClass;
		contexT__CORR__mClassDeclarationToTClass = newCONTEXT__CORR__mClassDeclarationToTClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MCLASS_DECLARATION_TO_TCLASS,
					oldCONTEXT__CORR__mClassDeclarationToTClass, contexT__CORR__mClassDeclarationToTClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember getCONTEXT__CORR__mDefinitionToTMember() {
		if (contexT__CORR__mDefinitionToTMember != null && contexT__CORR__mDefinitionToTMember.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mDefinitionToTMember = (InternalEObject) contexT__CORR__mDefinitionToTMember;
			contexT__CORR__mDefinitionToTMember = (MDefinitionToTMember) eResolveProxy(
					oldCONTEXT__CORR__mDefinitionToTMember);
			if (contexT__CORR__mDefinitionToTMember != oldCONTEXT__CORR__mDefinitionToTMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER,
							oldCONTEXT__CORR__mDefinitionToTMember, contexT__CORR__mDefinitionToTMember));
			}
		}
		return contexT__CORR__mDefinitionToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTMember basicGetCONTEXT__CORR__mDefinitionToTMember() {
		return contexT__CORR__mDefinitionToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mDefinitionToTMember(MDefinitionToTMember newCONTEXT__CORR__mDefinitionToTMember) {
		MDefinitionToTMember oldCONTEXT__CORR__mDefinitionToTMember = contexT__CORR__mDefinitionToTMember;
		contexT__CORR__mDefinitionToTMember = newCONTEXT__CORR__mDefinitionToTMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER,
					oldCONTEXT__CORR__mDefinitionToTMember, contexT__CORR__mDefinitionToTMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSyntethicMethodToTSyntethicMethod getCREATE__CORR__mSyntToTSynt() {
		if (creatE__CORR__mSyntToTSynt != null && creatE__CORR__mSyntToTSynt.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mSyntToTSynt = (InternalEObject) creatE__CORR__mSyntToTSynt;
			creatE__CORR__mSyntToTSynt = (MSyntethicMethodToTSyntethicMethod) eResolveProxy(
					oldCREATE__CORR__mSyntToTSynt);
			if (creatE__CORR__mSyntToTSynt != oldCREATE__CORR__mSyntToTSynt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_CORR_MSYNT_TO_TSYNT,
							oldCREATE__CORR__mSyntToTSynt, creatE__CORR__mSyntToTSynt));
			}
		}
		return creatE__CORR__mSyntToTSynt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSyntethicMethodToTSyntethicMethod basicGetCREATE__CORR__mSyntToTSynt() {
		return creatE__CORR__mSyntToTSynt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mSyntToTSynt(MSyntethicMethodToTSyntethicMethod newCREATE__CORR__mSyntToTSynt) {
		MSyntethicMethodToTSyntethicMethod oldCREATE__CORR__mSyntToTSynt = creatE__CORR__mSyntToTSynt;
		creatE__CORR__mSyntToTSynt = newCREATE__CORR__mSyntToTSynt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_CORR_MSYNT_TO_TSYNT,
					oldCREATE__CORR__mSyntToTSynt, creatE__CORR__mSyntToTSynt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MCLASS:
			if (resolve)
				return getCONTEXT__SRC__mClass();
			return basicGetCONTEXT__SRC__mClass();
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MDEF:
			if (resolve)
				return getCONTEXT__SRC__mDef();
			return basicGetCONTEXT__SRC__mDef();
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_SRC_MSYNTETHIC:
			if (resolve)
				return getCREATE__SRC__mSyntethic();
			return basicGetCREATE__SRC__mSyntethic();
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TCLASS:
			if (resolve)
				return getCONTEXT__TRG__tClass();
			return basicGetCONTEXT__TRG__tClass();
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TDEF:
			if (resolve)
				return getCONTEXT__TRG__tDef();
			return basicGetCONTEXT__TRG__tDef();
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TSIG:
			if (resolve)
				return getCONTEXT__TRG__tSig();
			return basicGetCONTEXT__TRG__tSig();
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_TRG_TSYNTETHIC:
			if (resolve)
				return getCREATE__TRG__tSyntethic();
			return basicGetCREATE__TRG__tSyntethic();
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MCLASS_DECLARATION_TO_TCLASS:
			if (resolve)
				return getCONTEXT__CORR__mClassDeclarationToTClass();
			return basicGetCONTEXT__CORR__mClassDeclarationToTClass();
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER:
			if (resolve)
				return getCONTEXT__CORR__mDefinitionToTMember();
			return basicGetCONTEXT__CORR__mDefinitionToTMember();
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_CORR_MSYNT_TO_TSYNT:
			if (resolve)
				return getCREATE__CORR__mSyntToTSynt();
			return basicGetCREATE__CORR__mSyntToTSynt();
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
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MCLASS:
			setCONTEXT__SRC__mClass((ClassDeclaration) newValue);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MDEF:
			setCONTEXT__SRC__mDef((MMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_SRC_MSYNTETHIC:
			setCREATE__SRC__mSyntethic((MSyntheticMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TCLASS:
			setCONTEXT__TRG__tClass((TClass) newValue);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TDEF:
			setCONTEXT__TRG__tDef((TMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TSIG:
			setCONTEXT__TRG__tSig((TMethodSignature) newValue);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_TRG_TSYNTETHIC:
			setCREATE__TRG__tSyntethic((TSyntethicMethod) newValue);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MCLASS_DECLARATION_TO_TCLASS:
			setCONTEXT__CORR__mClassDeclarationToTClass((ClassDeclarationToTClass) newValue);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER:
			setCONTEXT__CORR__mDefinitionToTMember((MDefinitionToTMember) newValue);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_CORR_MSYNT_TO_TSYNT:
			setCREATE__CORR__mSyntToTSynt((MSyntethicMethodToTSyntethicMethod) newValue);
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
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MCLASS:
			setCONTEXT__SRC__mClass((ClassDeclaration) null);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MDEF:
			setCONTEXT__SRC__mDef((MMethodDefinition) null);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_SRC_MSYNTETHIC:
			setCREATE__SRC__mSyntethic((MSyntheticMethodDefinition) null);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TCLASS:
			setCONTEXT__TRG__tClass((TClass) null);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TDEF:
			setCONTEXT__TRG__tDef((TMethodDefinition) null);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TSIG:
			setCONTEXT__TRG__tSig((TMethodSignature) null);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_TRG_TSYNTETHIC:
			setCREATE__TRG__tSyntethic((TSyntethicMethod) null);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MCLASS_DECLARATION_TO_TCLASS:
			setCONTEXT__CORR__mClassDeclarationToTClass((ClassDeclarationToTClass) null);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER:
			setCONTEXT__CORR__mDefinitionToTMember((MDefinitionToTMember) null);
			return;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_CORR_MSYNT_TO_TSYNT:
			setCREATE__CORR__mSyntToTSynt((MSyntethicMethodToTSyntethicMethod) null);
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
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MCLASS:
			return contexT__SRC__mClass != null;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_SRC_MDEF:
			return contexT__SRC__mDef != null;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_SRC_MSYNTETHIC:
			return creatE__SRC__mSyntethic != null;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TCLASS:
			return contexT__TRG__tClass != null;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TDEF:
			return contexT__TRG__tDef != null;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_TRG_TSIG:
			return contexT__TRG__tSig != null;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_TRG_TSYNTETHIC:
			return creatE__TRG__tSyntethic != null;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MCLASS_DECLARATION_TO_TCLASS:
			return contexT__CORR__mClassDeclarationToTClass != null;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CONTEXT_CORR_MDEFINITION_TO_TMEMBER:
			return contexT__CORR__mDefinitionToTMember != null;
		case ModiscoTGGPackage.SYNTETHIC_METHOD_MARKER__CREATE_CORR_MSYNT_TO_TSYNT:
			return creatE__CORR__mSyntToTSynt != null;
		}
		return super.eIsSet(featureID);
	}

} //SyntethicMethod__MarkerImpl
