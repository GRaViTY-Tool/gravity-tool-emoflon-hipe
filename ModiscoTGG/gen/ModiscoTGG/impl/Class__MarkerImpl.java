/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ASTNodeToTAnnotatable;
import ModiscoTGG.ClassDeclarationToTClass;
import ModiscoTGG.Class__Marker;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.PackageToTPackage;
import ModiscoTGG.TypeToTAbstractType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MClass;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.Class__MarkerImpl#getCONTEXT__SRC__mPackage <em>CONTEXT SRC mPackage</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Class__MarkerImpl#getCREATE__SRC__mType <em>CREATE SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Class__MarkerImpl#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Class__MarkerImpl#getCONTEXT__TRG__tPackage <em>CONTEXT TRG tPackage</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Class__MarkerImpl#getCREATE__TRG__tType <em>CREATE TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Class__MarkerImpl#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Class__MarkerImpl#getCREATE__CORR__mClassDeclarationToTClass <em>CREATE CORR mClass Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Class__MarkerImpl#getCONTEXT__CORR__mPackageToTPackage <em>CONTEXT CORR mPackage To TPackage</em>}</li>
 *   <li>{@link ModiscoTGG.impl.Class__MarkerImpl#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Class__MarkerImpl extends TGGRuleApplicationImpl implements Class__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mPackage() <em>CONTEXT SRC mPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mPackage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.java.Package contexT__SRC__mPackage;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__mType() <em>CREATE SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mType()
	 * @generated
	 * @ordered
	 */
	protected MClass creatE__SRC__mType;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tPackage() <em>CONTEXT TRG tPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tPackage()
	 * @generated
	 * @ordered
	 */
	protected TPackage contexT__TRG__tPackage;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tType() <em>CREATE TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tType()
	 * @generated
	 * @ordered
	 */
	protected TClass creatE__TRG__tType;

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
	 * The cached value of the '{@link #getCREATE__CORR__mClassDeclarationToTClass() <em>CREATE CORR mClass Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mClassDeclarationToTClass()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclarationToTClass creatE__CORR__mClassDeclarationToTClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mPackageToTPackage() <em>CONTEXT CORR mPackage To TPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mPackageToTPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageToTPackage contexT__CORR__mPackageToTPackage;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mTypeToTType() <em>CREATE CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mTypeToTType()
	 * @generated
	 * @ordered
	 */
	protected TypeToTAbstractType creatE__CORR__mTypeToTType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getClass__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.modisco.java.Package getCONTEXT__SRC__mPackage() {
		if (contexT__SRC__mPackage != null && contexT__SRC__mPackage.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mPackage = (InternalEObject) contexT__SRC__mPackage;
			contexT__SRC__mPackage = (org.eclipse.modisco.java.Package) eResolveProxy(oldCONTEXT__SRC__mPackage);
			if (contexT__SRC__mPackage != oldCONTEXT__SRC__mPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_MARKER__CONTEXT_SRC_MPACKAGE, oldCONTEXT__SRC__mPackage,
							contexT__SRC__mPackage));
			}
		}
		return contexT__SRC__mPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.java.Package basicGetCONTEXT__SRC__mPackage() {
		return contexT__SRC__mPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mPackage(org.eclipse.modisco.java.Package newCONTEXT__SRC__mPackage) {
		org.eclipse.modisco.java.Package oldCONTEXT__SRC__mPackage = contexT__SRC__mPackage;
		contexT__SRC__mPackage = newCONTEXT__SRC__mPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.CLASS_MARKER__CONTEXT_SRC_MPACKAGE,
					oldCONTEXT__SRC__mPackage, contexT__SRC__mPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MClass getCREATE__SRC__mType() {
		if (creatE__SRC__mType != null && creatE__SRC__mType.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mType = (InternalEObject) creatE__SRC__mType;
			creatE__SRC__mType = (MClass) eResolveProxy(oldCREATE__SRC__mType);
			if (creatE__SRC__mType != oldCREATE__SRC__mType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_MARKER__CREATE_SRC_MTYPE, oldCREATE__SRC__mType,
							creatE__SRC__mType));
			}
		}
		return creatE__SRC__mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass basicGetCREATE__SRC__mType() {
		return creatE__SRC__mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mType(MClass newCREATE__SRC__mType) {
		MClass oldCREATE__SRC__mType = creatE__SRC__mType;
		creatE__SRC__mType = newCREATE__SRC__mType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.CLASS_MARKER__CREATE_SRC_MTYPE,
					oldCREATE__SRC__mType, creatE__SRC__mType));
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
							ModiscoTGGPackage.CLASS_MARKER__CONTEXT_TRG_PG, oldCONTEXT__TRG__pg, contexT__TRG__pg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.CLASS_MARKER__CONTEXT_TRG_PG,
					oldCONTEXT__TRG__pg, contexT__TRG__pg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage getCONTEXT__TRG__tPackage() {
		if (contexT__TRG__tPackage != null && contexT__TRG__tPackage.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tPackage = (InternalEObject) contexT__TRG__tPackage;
			contexT__TRG__tPackage = (TPackage) eResolveProxy(oldCONTEXT__TRG__tPackage);
			if (contexT__TRG__tPackage != oldCONTEXT__TRG__tPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_MARKER__CONTEXT_TRG_TPACKAGE, oldCONTEXT__TRG__tPackage,
							contexT__TRG__tPackage));
			}
		}
		return contexT__TRG__tPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage basicGetCONTEXT__TRG__tPackage() {
		return contexT__TRG__tPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tPackage(TPackage newCONTEXT__TRG__tPackage) {
		TPackage oldCONTEXT__TRG__tPackage = contexT__TRG__tPackage;
		contexT__TRG__tPackage = newCONTEXT__TRG__tPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.CLASS_MARKER__CONTEXT_TRG_TPACKAGE,
					oldCONTEXT__TRG__tPackage, contexT__TRG__tPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getCREATE__TRG__tType() {
		if (creatE__TRG__tType != null && creatE__TRG__tType.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tType = (InternalEObject) creatE__TRG__tType;
			creatE__TRG__tType = (TClass) eResolveProxy(oldCREATE__TRG__tType);
			if (creatE__TRG__tType != oldCREATE__TRG__tType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_MARKER__CREATE_TRG_TTYPE, oldCREATE__TRG__tType,
							creatE__TRG__tType));
			}
		}
		return creatE__TRG__tType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetCREATE__TRG__tType() {
		return creatE__TRG__tType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tType(TClass newCREATE__TRG__tType) {
		TClass oldCREATE__TRG__tType = creatE__TRG__tType;
		creatE__TRG__tType = newCREATE__TRG__tType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.CLASS_MARKER__CREATE_TRG_TTYPE,
					oldCREATE__TRG__tType, creatE__TRG__tType));
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
							ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION,
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
					ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION,
					oldCREATE__CORR__mBodyToTAnnotation, creatE__CORR__mBodyToTAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclarationToTClass getCREATE__CORR__mClassDeclarationToTClass() {
		if (creatE__CORR__mClassDeclarationToTClass != null && creatE__CORR__mClassDeclarationToTClass.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mClassDeclarationToTClass = (InternalEObject) creatE__CORR__mClassDeclarationToTClass;
			creatE__CORR__mClassDeclarationToTClass = (ClassDeclarationToTClass) eResolveProxy(
					oldCREATE__CORR__mClassDeclarationToTClass);
			if (creatE__CORR__mClassDeclarationToTClass != oldCREATE__CORR__mClassDeclarationToTClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MCLASS_DECLARATION_TO_TCLASS,
							oldCREATE__CORR__mClassDeclarationToTClass, creatE__CORR__mClassDeclarationToTClass));
			}
		}
		return creatE__CORR__mClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclarationToTClass basicGetCREATE__CORR__mClassDeclarationToTClass() {
		return creatE__CORR__mClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mClassDeclarationToTClass(
			ClassDeclarationToTClass newCREATE__CORR__mClassDeclarationToTClass) {
		ClassDeclarationToTClass oldCREATE__CORR__mClassDeclarationToTClass = creatE__CORR__mClassDeclarationToTClass;
		creatE__CORR__mClassDeclarationToTClass = newCREATE__CORR__mClassDeclarationToTClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MCLASS_DECLARATION_TO_TCLASS,
					oldCREATE__CORR__mClassDeclarationToTClass, creatE__CORR__mClassDeclarationToTClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageToTPackage getCONTEXT__CORR__mPackageToTPackage() {
		if (contexT__CORR__mPackageToTPackage != null && contexT__CORR__mPackageToTPackage.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mPackageToTPackage = (InternalEObject) contexT__CORR__mPackageToTPackage;
			contexT__CORR__mPackageToTPackage = (PackageToTPackage) eResolveProxy(oldCONTEXT__CORR__mPackageToTPackage);
			if (contexT__CORR__mPackageToTPackage != oldCONTEXT__CORR__mPackageToTPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_MARKER__CONTEXT_CORR_MPACKAGE_TO_TPACKAGE,
							oldCONTEXT__CORR__mPackageToTPackage, contexT__CORR__mPackageToTPackage));
			}
		}
		return contexT__CORR__mPackageToTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageToTPackage basicGetCONTEXT__CORR__mPackageToTPackage() {
		return contexT__CORR__mPackageToTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mPackageToTPackage(PackageToTPackage newCONTEXT__CORR__mPackageToTPackage) {
		PackageToTPackage oldCONTEXT__CORR__mPackageToTPackage = contexT__CORR__mPackageToTPackage;
		contexT__CORR__mPackageToTPackage = newCONTEXT__CORR__mPackageToTPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_MARKER__CONTEXT_CORR_MPACKAGE_TO_TPACKAGE,
					oldCONTEXT__CORR__mPackageToTPackage, contexT__CORR__mPackageToTPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType getCREATE__CORR__mTypeToTType() {
		if (creatE__CORR__mTypeToTType != null && creatE__CORR__mTypeToTType.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mTypeToTType = (InternalEObject) creatE__CORR__mTypeToTType;
			creatE__CORR__mTypeToTType = (TypeToTAbstractType) eResolveProxy(oldCREATE__CORR__mTypeToTType);
			if (creatE__CORR__mTypeToTType != oldCREATE__CORR__mTypeToTType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MTYPE_TO_TTYPE, oldCREATE__CORR__mTypeToTType,
							creatE__CORR__mTypeToTType));
			}
		}
		return creatE__CORR__mTypeToTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeToTAbstractType basicGetCREATE__CORR__mTypeToTType() {
		return creatE__CORR__mTypeToTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mTypeToTType(TypeToTAbstractType newCREATE__CORR__mTypeToTType) {
		TypeToTAbstractType oldCREATE__CORR__mTypeToTType = creatE__CORR__mTypeToTType;
		creatE__CORR__mTypeToTType = newCREATE__CORR__mTypeToTType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MTYPE_TO_TTYPE, oldCREATE__CORR__mTypeToTType,
					creatE__CORR__mTypeToTType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_SRC_MPACKAGE:
			if (resolve)
				return getCONTEXT__SRC__mPackage();
			return basicGetCONTEXT__SRC__mPackage();
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_SRC_MTYPE:
			if (resolve)
				return getCREATE__SRC__mType();
			return basicGetCREATE__SRC__mType();
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_TRG_PG:
			if (resolve)
				return getCONTEXT__TRG__pg();
			return basicGetCONTEXT__TRG__pg();
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_TRG_TPACKAGE:
			if (resolve)
				return getCONTEXT__TRG__tPackage();
			return basicGetCONTEXT__TRG__tPackage();
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_TRG_TTYPE:
			if (resolve)
				return getCREATE__TRG__tType();
			return basicGetCREATE__TRG__tType();
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			if (resolve)
				return getCREATE__CORR__mBodyToTAnnotation();
			return basicGetCREATE__CORR__mBodyToTAnnotation();
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MCLASS_DECLARATION_TO_TCLASS:
			if (resolve)
				return getCREATE__CORR__mClassDeclarationToTClass();
			return basicGetCREATE__CORR__mClassDeclarationToTClass();
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_CORR_MPACKAGE_TO_TPACKAGE:
			if (resolve)
				return getCONTEXT__CORR__mPackageToTPackage();
			return basicGetCONTEXT__CORR__mPackageToTPackage();
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MTYPE_TO_TTYPE:
			if (resolve)
				return getCREATE__CORR__mTypeToTType();
			return basicGetCREATE__CORR__mTypeToTType();
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
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_SRC_MPACKAGE:
			setCONTEXT__SRC__mPackage((org.eclipse.modisco.java.Package) newValue);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_SRC_MTYPE:
			setCREATE__SRC__mType((MClass) newValue);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_TRG_TPACKAGE:
			setCONTEXT__TRG__tPackage((TPackage) newValue);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_TRG_TTYPE:
			setCREATE__TRG__tType((TClass) newValue);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			setCREATE__CORR__mBodyToTAnnotation((ASTNodeToTAnnotatable) newValue);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MCLASS_DECLARATION_TO_TCLASS:
			setCREATE__CORR__mClassDeclarationToTClass((ClassDeclarationToTClass) newValue);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_CORR_MPACKAGE_TO_TPACKAGE:
			setCONTEXT__CORR__mPackageToTPackage((PackageToTPackage) newValue);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MTYPE_TO_TTYPE:
			setCREATE__CORR__mTypeToTType((TypeToTAbstractType) newValue);
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
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_SRC_MPACKAGE:
			setCONTEXT__SRC__mPackage((org.eclipse.modisco.java.Package) null);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_SRC_MTYPE:
			setCREATE__SRC__mType((MClass) null);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_TRG_PG:
			setCONTEXT__TRG__pg((TypeGraph) null);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_TRG_TPACKAGE:
			setCONTEXT__TRG__tPackage((TPackage) null);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_TRG_TTYPE:
			setCREATE__TRG__tType((TClass) null);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			setCREATE__CORR__mBodyToTAnnotation((ASTNodeToTAnnotatable) null);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MCLASS_DECLARATION_TO_TCLASS:
			setCREATE__CORR__mClassDeclarationToTClass((ClassDeclarationToTClass) null);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_CORR_MPACKAGE_TO_TPACKAGE:
			setCONTEXT__CORR__mPackageToTPackage((PackageToTPackage) null);
			return;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MTYPE_TO_TTYPE:
			setCREATE__CORR__mTypeToTType((TypeToTAbstractType) null);
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
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_SRC_MPACKAGE:
			return contexT__SRC__mPackage != null;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_SRC_MTYPE:
			return creatE__SRC__mType != null;
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_TRG_PG:
			return contexT__TRG__pg != null;
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_TRG_TPACKAGE:
			return contexT__TRG__tPackage != null;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_TRG_TTYPE:
			return creatE__TRG__tType != null;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MBODY_TO_TANNOTATION:
			return creatE__CORR__mBodyToTAnnotation != null;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MCLASS_DECLARATION_TO_TCLASS:
			return creatE__CORR__mClassDeclarationToTClass != null;
		case ModiscoTGGPackage.CLASS_MARKER__CONTEXT_CORR_MPACKAGE_TO_TPACKAGE:
			return contexT__CORR__mPackageToTPackage != null;
		case ModiscoTGGPackage.CLASS_MARKER__CREATE_CORR_MTYPE_TO_TTYPE:
			return creatE__CORR__mTypeToTType != null;
		}
		return super.eIsSet(featureID);
	}

} //Class__MarkerImpl
