/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ClassDeclarationToTClass;
import ModiscoTGG.ClassExtendsClass__Marker;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.typegraph.basic.TClass;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Extends Class Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.ClassExtendsClass__MarkerImpl#getCONTEXT__SRC__eClassDeclaration <em>CONTEXT SRC eClass Declaration</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassExtendsClass__MarkerImpl#getCONTEXT__SRC__eExtendedClass <em>CONTEXT SRC eExtended Class</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassExtendsClass__MarkerImpl#getCREATE__SRC__eTypeAccess <em>CREATE SRC eType Access</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassExtendsClass__MarkerImpl#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassExtendsClass__MarkerImpl#getCONTEXT__TRG__tExtendedClass <em>CONTEXT TRG tExtended Class</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassExtendsClass__MarkerImpl#getCONTEXT__CORR__eClassDeclarationToTClass <em>CONTEXT CORR eClass Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassExtendsClass__MarkerImpl#getCONTEXT__CORR__eExtendedClassToTExtendedClass <em>CONTEXT CORR eExtended Class To TExtended Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassExtendsClass__MarkerImpl extends TGGRuleApplicationImpl implements ClassExtendsClass__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__eClassDeclaration() <em>CONTEXT SRC eClass Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eClassDeclaration()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclaration contexT__SRC__eClassDeclaration;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__eExtendedClass() <em>CONTEXT SRC eExtended Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__eExtendedClass()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclaration contexT__SRC__eExtendedClass;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tClass() <em>CONTEXT TRG tClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tClass()
	 * @generated
	 * @ordered
	 */
	protected TClass contexT__TRG__tClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tExtendedClass() <em>CONTEXT TRG tExtended Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tExtendedClass()
	 * @generated
	 * @ordered
	 */
	protected TClass contexT__TRG__tExtendedClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eClassDeclarationToTClass() <em>CONTEXT CORR eClass Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eClassDeclarationToTClass()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclarationToTClass contexT__CORR__eClassDeclarationToTClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eExtendedClassToTExtendedClass() <em>CONTEXT CORR eExtended Class To TExtended Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eExtendedClassToTExtendedClass()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclarationToTClass contexT__CORR__eExtendedClassToTExtendedClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassExtendsClass__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getClassExtendsClass__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclaration getCONTEXT__SRC__eClassDeclaration() {
		if (contexT__SRC__eClassDeclaration != null && contexT__SRC__eClassDeclaration.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eClassDeclaration = (InternalEObject) contexT__SRC__eClassDeclaration;
			contexT__SRC__eClassDeclaration = (ClassDeclaration) eResolveProxy(oldCONTEXT__SRC__eClassDeclaration);
			if (contexT__SRC__eClassDeclaration != oldCONTEXT__SRC__eClassDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_ECLASS_DECLARATION,
							oldCONTEXT__SRC__eClassDeclaration, contexT__SRC__eClassDeclaration));
			}
		}
		return contexT__SRC__eClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration basicGetCONTEXT__SRC__eClassDeclaration() {
		return contexT__SRC__eClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eClassDeclaration(ClassDeclaration newCONTEXT__SRC__eClassDeclaration) {
		ClassDeclaration oldCONTEXT__SRC__eClassDeclaration = contexT__SRC__eClassDeclaration;
		contexT__SRC__eClassDeclaration = newCONTEXT__SRC__eClassDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_ECLASS_DECLARATION,
					oldCONTEXT__SRC__eClassDeclaration, contexT__SRC__eClassDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclaration getCONTEXT__SRC__eExtendedClass() {
		if (contexT__SRC__eExtendedClass != null && contexT__SRC__eExtendedClass.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__eExtendedClass = (InternalEObject) contexT__SRC__eExtendedClass;
			contexT__SRC__eExtendedClass = (ClassDeclaration) eResolveProxy(oldCONTEXT__SRC__eExtendedClass);
			if (contexT__SRC__eExtendedClass != oldCONTEXT__SRC__eExtendedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_EEXTENDED_CLASS,
							oldCONTEXT__SRC__eExtendedClass, contexT__SRC__eExtendedClass));
			}
		}
		return contexT__SRC__eExtendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration basicGetCONTEXT__SRC__eExtendedClass() {
		return contexT__SRC__eExtendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__eExtendedClass(ClassDeclaration newCONTEXT__SRC__eExtendedClass) {
		ClassDeclaration oldCONTEXT__SRC__eExtendedClass = contexT__SRC__eExtendedClass;
		contexT__SRC__eExtendedClass = newCONTEXT__SRC__eExtendedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_EEXTENDED_CLASS,
					oldCONTEXT__SRC__eExtendedClass, contexT__SRC__eExtendedClass));
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
							ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS,
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
					ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS, oldCREATE__SRC__eTypeAccess,
					creatE__SRC__eTypeAccess));
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
							ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TCLASS, oldCONTEXT__TRG__tClass,
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
					ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TCLASS, oldCONTEXT__TRG__tClass,
					contexT__TRG__tClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getCONTEXT__TRG__tExtendedClass() {
		if (contexT__TRG__tExtendedClass != null && contexT__TRG__tExtendedClass.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tExtendedClass = (InternalEObject) contexT__TRG__tExtendedClass;
			contexT__TRG__tExtendedClass = (TClass) eResolveProxy(oldCONTEXT__TRG__tExtendedClass);
			if (contexT__TRG__tExtendedClass != oldCONTEXT__TRG__tExtendedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TEXTENDED_CLASS,
							oldCONTEXT__TRG__tExtendedClass, contexT__TRG__tExtendedClass));
			}
		}
		return contexT__TRG__tExtendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetCONTEXT__TRG__tExtendedClass() {
		return contexT__TRG__tExtendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tExtendedClass(TClass newCONTEXT__TRG__tExtendedClass) {
		TClass oldCONTEXT__TRG__tExtendedClass = contexT__TRG__tExtendedClass;
		contexT__TRG__tExtendedClass = newCONTEXT__TRG__tExtendedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TEXTENDED_CLASS,
					oldCONTEXT__TRG__tExtendedClass, contexT__TRG__tExtendedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclarationToTClass getCONTEXT__CORR__eClassDeclarationToTClass() {
		if (contexT__CORR__eClassDeclarationToTClass != null && contexT__CORR__eClassDeclarationToTClass.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eClassDeclarationToTClass = (InternalEObject) contexT__CORR__eClassDeclarationToTClass;
			contexT__CORR__eClassDeclarationToTClass = (ClassDeclarationToTClass) eResolveProxy(
					oldCONTEXT__CORR__eClassDeclarationToTClass);
			if (contexT__CORR__eClassDeclarationToTClass != oldCONTEXT__CORR__eClassDeclarationToTClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS,
							oldCONTEXT__CORR__eClassDeclarationToTClass, contexT__CORR__eClassDeclarationToTClass));
			}
		}
		return contexT__CORR__eClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclarationToTClass basicGetCONTEXT__CORR__eClassDeclarationToTClass() {
		return contexT__CORR__eClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eClassDeclarationToTClass(
			ClassDeclarationToTClass newCONTEXT__CORR__eClassDeclarationToTClass) {
		ClassDeclarationToTClass oldCONTEXT__CORR__eClassDeclarationToTClass = contexT__CORR__eClassDeclarationToTClass;
		contexT__CORR__eClassDeclarationToTClass = newCONTEXT__CORR__eClassDeclarationToTClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS,
					oldCONTEXT__CORR__eClassDeclarationToTClass, contexT__CORR__eClassDeclarationToTClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclarationToTClass getCONTEXT__CORR__eExtendedClassToTExtendedClass() {
		if (contexT__CORR__eExtendedClassToTExtendedClass != null
				&& contexT__CORR__eExtendedClassToTExtendedClass.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eExtendedClassToTExtendedClass = (InternalEObject) contexT__CORR__eExtendedClassToTExtendedClass;
			contexT__CORR__eExtendedClassToTExtendedClass = (ClassDeclarationToTClass) eResolveProxy(
					oldCONTEXT__CORR__eExtendedClassToTExtendedClass);
			if (contexT__CORR__eExtendedClassToTExtendedClass != oldCONTEXT__CORR__eExtendedClassToTExtendedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_EEXTENDED_CLASS_TO_TEXTENDED_CLASS,
							oldCONTEXT__CORR__eExtendedClassToTExtendedClass,
							contexT__CORR__eExtendedClassToTExtendedClass));
			}
		}
		return contexT__CORR__eExtendedClassToTExtendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclarationToTClass basicGetCONTEXT__CORR__eExtendedClassToTExtendedClass() {
		return contexT__CORR__eExtendedClassToTExtendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eExtendedClassToTExtendedClass(
			ClassDeclarationToTClass newCONTEXT__CORR__eExtendedClassToTExtendedClass) {
		ClassDeclarationToTClass oldCONTEXT__CORR__eExtendedClassToTExtendedClass = contexT__CORR__eExtendedClassToTExtendedClass;
		contexT__CORR__eExtendedClassToTExtendedClass = newCONTEXT__CORR__eExtendedClassToTExtendedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_EEXTENDED_CLASS_TO_TEXTENDED_CLASS,
					oldCONTEXT__CORR__eExtendedClassToTExtendedClass, contexT__CORR__eExtendedClassToTExtendedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_ECLASS_DECLARATION:
			if (resolve)
				return getCONTEXT__SRC__eClassDeclaration();
			return basicGetCONTEXT__SRC__eClassDeclaration();
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_EEXTENDED_CLASS:
			if (resolve)
				return getCONTEXT__SRC__eExtendedClass();
			return basicGetCONTEXT__SRC__eExtendedClass();
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS:
			if (resolve)
				return getCREATE__SRC__eTypeAccess();
			return basicGetCREATE__SRC__eTypeAccess();
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TCLASS:
			if (resolve)
				return getCONTEXT__TRG__tClass();
			return basicGetCONTEXT__TRG__tClass();
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TEXTENDED_CLASS:
			if (resolve)
				return getCONTEXT__TRG__tExtendedClass();
			return basicGetCONTEXT__TRG__tExtendedClass();
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS:
			if (resolve)
				return getCONTEXT__CORR__eClassDeclarationToTClass();
			return basicGetCONTEXT__CORR__eClassDeclarationToTClass();
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_EEXTENDED_CLASS_TO_TEXTENDED_CLASS:
			if (resolve)
				return getCONTEXT__CORR__eExtendedClassToTExtendedClass();
			return basicGetCONTEXT__CORR__eExtendedClassToTExtendedClass();
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
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_ECLASS_DECLARATION:
			setCONTEXT__SRC__eClassDeclaration((ClassDeclaration) newValue);
			return;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_EEXTENDED_CLASS:
			setCONTEXT__SRC__eExtendedClass((ClassDeclaration) newValue);
			return;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS:
			setCREATE__SRC__eTypeAccess((TypeAccess) newValue);
			return;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TCLASS:
			setCONTEXT__TRG__tClass((TClass) newValue);
			return;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TEXTENDED_CLASS:
			setCONTEXT__TRG__tExtendedClass((TClass) newValue);
			return;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS:
			setCONTEXT__CORR__eClassDeclarationToTClass((ClassDeclarationToTClass) newValue);
			return;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_EEXTENDED_CLASS_TO_TEXTENDED_CLASS:
			setCONTEXT__CORR__eExtendedClassToTExtendedClass((ClassDeclarationToTClass) newValue);
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
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_ECLASS_DECLARATION:
			setCONTEXT__SRC__eClassDeclaration((ClassDeclaration) null);
			return;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_EEXTENDED_CLASS:
			setCONTEXT__SRC__eExtendedClass((ClassDeclaration) null);
			return;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS:
			setCREATE__SRC__eTypeAccess((TypeAccess) null);
			return;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TCLASS:
			setCONTEXT__TRG__tClass((TClass) null);
			return;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TEXTENDED_CLASS:
			setCONTEXT__TRG__tExtendedClass((TClass) null);
			return;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS:
			setCONTEXT__CORR__eClassDeclarationToTClass((ClassDeclarationToTClass) null);
			return;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_EEXTENDED_CLASS_TO_TEXTENDED_CLASS:
			setCONTEXT__CORR__eExtendedClassToTExtendedClass((ClassDeclarationToTClass) null);
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
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_ECLASS_DECLARATION:
			return contexT__SRC__eClassDeclaration != null;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_SRC_EEXTENDED_CLASS:
			return contexT__SRC__eExtendedClass != null;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CREATE_SRC_ETYPE_ACCESS:
			return creatE__SRC__eTypeAccess != null;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TCLASS:
			return contexT__TRG__tClass != null;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_TRG_TEXTENDED_CLASS:
			return contexT__TRG__tExtendedClass != null;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_ECLASS_DECLARATION_TO_TCLASS:
			return contexT__CORR__eClassDeclarationToTClass != null;
		case ModiscoTGGPackage.CLASS_EXTENDS_CLASS_MARKER__CONTEXT_CORR_EEXTENDED_CLASS_TO_TEXTENDED_CLASS:
			return contexT__CORR__eExtendedClassToTExtendedClass != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassExtendsClass__MarkerImpl
