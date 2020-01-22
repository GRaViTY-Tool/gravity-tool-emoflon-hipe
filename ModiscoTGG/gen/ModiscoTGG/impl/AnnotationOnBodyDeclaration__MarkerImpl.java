/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ASTNodeToTAnnotatable;
import ModiscoTGG.AnnotationOnBodyDeclaration__Marker;
import ModiscoTGG.AnnotationToTAnnotation;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.BodyDeclaration;

import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation On Body Declaration Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.AnnotationOnBodyDeclaration__MarkerImpl#getCREATE__SRC__Annotation <em>CREATE SRC Annotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationOnBodyDeclaration__MarkerImpl#getCONTEXT__SRC__astNode <em>CONTEXT SRC ast Node</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationOnBodyDeclaration__MarkerImpl#getCONTEXT__TRG__tAnnotable <em>CONTEXT TRG tAnnotable</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationOnBodyDeclaration__MarkerImpl#getCREATE__TRG__tAnnotation <em>CREATE TRG tAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationOnBodyDeclaration__MarkerImpl#getCREATE__CORR__AnnotationToTAnnotation <em>CREATE CORR Annotation To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationOnBodyDeclaration__MarkerImpl#getCONTEXT__CORR__aSTNodeToTAnnotable <em>CONTEXT CORR aST Node To TAnnotable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationOnBodyDeclaration__MarkerImpl extends TGGRuleApplicationImpl
		implements AnnotationOnBodyDeclaration__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__Annotation() <em>CREATE SRC Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__Annotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation creatE__SRC__Annotation;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__astNode() <em>CONTEXT SRC ast Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__astNode()
	 * @generated
	 * @ordered
	 */
	protected BodyDeclaration contexT__SRC__astNode;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tAnnotable() <em>CONTEXT TRG tAnnotable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tAnnotable()
	 * @generated
	 * @ordered
	 */
	protected TAnnotatable contexT__TRG__tAnnotable;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tAnnotation() <em>CREATE TRG tAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tAnnotation()
	 * @generated
	 * @ordered
	 */
	protected TAnnotation creatE__TRG__tAnnotation;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__AnnotationToTAnnotation() <em>CREATE CORR Annotation To TAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__AnnotationToTAnnotation()
	 * @generated
	 * @ordered
	 */
	protected AnnotationToTAnnotation creatE__CORR__AnnotationToTAnnotation;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__aSTNodeToTAnnotable() <em>CONTEXT CORR aST Node To TAnnotable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__aSTNodeToTAnnotable()
	 * @generated
	 * @ordered
	 */
	protected ASTNodeToTAnnotatable contexT__CORR__aSTNodeToTAnnotable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationOnBodyDeclaration__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getAnnotationOnBodyDeclaration__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getCREATE__SRC__Annotation() {
		if (creatE__SRC__Annotation != null && creatE__SRC__Annotation.eIsProxy()) {
			InternalEObject oldCREATE__SRC__Annotation = (InternalEObject) creatE__SRC__Annotation;
			creatE__SRC__Annotation = (Annotation) eResolveProxy(oldCREATE__SRC__Annotation);
			if (creatE__SRC__Annotation != oldCREATE__SRC__Annotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_SRC_ANNOTATION,
							oldCREATE__SRC__Annotation, creatE__SRC__Annotation));
			}
		}
		return creatE__SRC__Annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetCREATE__SRC__Annotation() {
		return creatE__SRC__Annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__Annotation(Annotation newCREATE__SRC__Annotation) {
		Annotation oldCREATE__SRC__Annotation = creatE__SRC__Annotation;
		creatE__SRC__Annotation = newCREATE__SRC__Annotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_SRC_ANNOTATION,
					oldCREATE__SRC__Annotation, creatE__SRC__Annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyDeclaration getCONTEXT__SRC__astNode() {
		if (contexT__SRC__astNode != null && contexT__SRC__astNode.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__astNode = (InternalEObject) contexT__SRC__astNode;
			contexT__SRC__astNode = (BodyDeclaration) eResolveProxy(oldCONTEXT__SRC__astNode);
			if (contexT__SRC__astNode != oldCONTEXT__SRC__astNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_SRC_AST_NODE,
							oldCONTEXT__SRC__astNode, contexT__SRC__astNode));
			}
		}
		return contexT__SRC__astNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyDeclaration basicGetCONTEXT__SRC__astNode() {
		return contexT__SRC__astNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__astNode(BodyDeclaration newCONTEXT__SRC__astNode) {
		BodyDeclaration oldCONTEXT__SRC__astNode = contexT__SRC__astNode;
		contexT__SRC__astNode = newCONTEXT__SRC__astNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_SRC_AST_NODE,
					oldCONTEXT__SRC__astNode, contexT__SRC__astNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotatable getCONTEXT__TRG__tAnnotable() {
		if (contexT__TRG__tAnnotable != null && contexT__TRG__tAnnotable.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tAnnotable = (InternalEObject) contexT__TRG__tAnnotable;
			contexT__TRG__tAnnotable = (TAnnotatable) eResolveProxy(oldCONTEXT__TRG__tAnnotable);
			if (contexT__TRG__tAnnotable != oldCONTEXT__TRG__tAnnotable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_TRG_TANNOTABLE,
							oldCONTEXT__TRG__tAnnotable, contexT__TRG__tAnnotable));
			}
		}
		return contexT__TRG__tAnnotable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAnnotatable basicGetCONTEXT__TRG__tAnnotable() {
		return contexT__TRG__tAnnotable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tAnnotable(TAnnotatable newCONTEXT__TRG__tAnnotable) {
		TAnnotatable oldCONTEXT__TRG__tAnnotable = contexT__TRG__tAnnotable;
		contexT__TRG__tAnnotable = newCONTEXT__TRG__tAnnotable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_TRG_TANNOTABLE,
					oldCONTEXT__TRG__tAnnotable, contexT__TRG__tAnnotable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotation getCREATE__TRG__tAnnotation() {
		if (creatE__TRG__tAnnotation != null && creatE__TRG__tAnnotation.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tAnnotation = (InternalEObject) creatE__TRG__tAnnotation;
			creatE__TRG__tAnnotation = (TAnnotation) eResolveProxy(oldCREATE__TRG__tAnnotation);
			if (creatE__TRG__tAnnotation != oldCREATE__TRG__tAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_TRG_TANNOTATION,
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
	public TAnnotation basicGetCREATE__TRG__tAnnotation() {
		return creatE__TRG__tAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tAnnotation(TAnnotation newCREATE__TRG__tAnnotation) {
		TAnnotation oldCREATE__TRG__tAnnotation = creatE__TRG__tAnnotation;
		creatE__TRG__tAnnotation = newCREATE__TRG__tAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_TRG_TANNOTATION,
					oldCREATE__TRG__tAnnotation, creatE__TRG__tAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationToTAnnotation getCREATE__CORR__AnnotationToTAnnotation() {
		if (creatE__CORR__AnnotationToTAnnotation != null && creatE__CORR__AnnotationToTAnnotation.eIsProxy()) {
			InternalEObject oldCREATE__CORR__AnnotationToTAnnotation = (InternalEObject) creatE__CORR__AnnotationToTAnnotation;
			creatE__CORR__AnnotationToTAnnotation = (AnnotationToTAnnotation) eResolveProxy(
					oldCREATE__CORR__AnnotationToTAnnotation);
			if (creatE__CORR__AnnotationToTAnnotation != oldCREATE__CORR__AnnotationToTAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_CORR_ANNOTATION_TO_TANNOTATION,
							oldCREATE__CORR__AnnotationToTAnnotation, creatE__CORR__AnnotationToTAnnotation));
			}
		}
		return creatE__CORR__AnnotationToTAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationToTAnnotation basicGetCREATE__CORR__AnnotationToTAnnotation() {
		return creatE__CORR__AnnotationToTAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__AnnotationToTAnnotation(
			AnnotationToTAnnotation newCREATE__CORR__AnnotationToTAnnotation) {
		AnnotationToTAnnotation oldCREATE__CORR__AnnotationToTAnnotation = creatE__CORR__AnnotationToTAnnotation;
		creatE__CORR__AnnotationToTAnnotation = newCREATE__CORR__AnnotationToTAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_CORR_ANNOTATION_TO_TANNOTATION,
					oldCREATE__CORR__AnnotationToTAnnotation, creatE__CORR__AnnotationToTAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASTNodeToTAnnotatable getCONTEXT__CORR__aSTNodeToTAnnotable() {
		if (contexT__CORR__aSTNodeToTAnnotable != null && contexT__CORR__aSTNodeToTAnnotable.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__aSTNodeToTAnnotable = (InternalEObject) contexT__CORR__aSTNodeToTAnnotable;
			contexT__CORR__aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) eResolveProxy(
					oldCONTEXT__CORR__aSTNodeToTAnnotable);
			if (contexT__CORR__aSTNodeToTAnnotable != oldCONTEXT__CORR__aSTNodeToTAnnotable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_CORR_AST_NODE_TO_TANNOTABLE,
							oldCONTEXT__CORR__aSTNodeToTAnnotable, contexT__CORR__aSTNodeToTAnnotable));
			}
		}
		return contexT__CORR__aSTNodeToTAnnotable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTNodeToTAnnotatable basicGetCONTEXT__CORR__aSTNodeToTAnnotable() {
		return contexT__CORR__aSTNodeToTAnnotable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__aSTNodeToTAnnotable(ASTNodeToTAnnotatable newCONTEXT__CORR__aSTNodeToTAnnotable) {
		ASTNodeToTAnnotatable oldCONTEXT__CORR__aSTNodeToTAnnotable = contexT__CORR__aSTNodeToTAnnotable;
		contexT__CORR__aSTNodeToTAnnotable = newCONTEXT__CORR__aSTNodeToTAnnotable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_CORR_AST_NODE_TO_TANNOTABLE,
					oldCONTEXT__CORR__aSTNodeToTAnnotable, contexT__CORR__aSTNodeToTAnnotable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_SRC_ANNOTATION:
			if (resolve)
				return getCREATE__SRC__Annotation();
			return basicGetCREATE__SRC__Annotation();
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_SRC_AST_NODE:
			if (resolve)
				return getCONTEXT__SRC__astNode();
			return basicGetCONTEXT__SRC__astNode();
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_TRG_TANNOTABLE:
			if (resolve)
				return getCONTEXT__TRG__tAnnotable();
			return basicGetCONTEXT__TRG__tAnnotable();
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_TRG_TANNOTATION:
			if (resolve)
				return getCREATE__TRG__tAnnotation();
			return basicGetCREATE__TRG__tAnnotation();
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_CORR_ANNOTATION_TO_TANNOTATION:
			if (resolve)
				return getCREATE__CORR__AnnotationToTAnnotation();
			return basicGetCREATE__CORR__AnnotationToTAnnotation();
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_CORR_AST_NODE_TO_TANNOTABLE:
			if (resolve)
				return getCONTEXT__CORR__aSTNodeToTAnnotable();
			return basicGetCONTEXT__CORR__aSTNodeToTAnnotable();
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
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_SRC_ANNOTATION:
			setCREATE__SRC__Annotation((Annotation) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_SRC_AST_NODE:
			setCONTEXT__SRC__astNode((BodyDeclaration) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_TRG_TANNOTABLE:
			setCONTEXT__TRG__tAnnotable((TAnnotatable) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_TRG_TANNOTATION:
			setCREATE__TRG__tAnnotation((TAnnotation) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_CORR_ANNOTATION_TO_TANNOTATION:
			setCREATE__CORR__AnnotationToTAnnotation((AnnotationToTAnnotation) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_CORR_AST_NODE_TO_TANNOTABLE:
			setCONTEXT__CORR__aSTNodeToTAnnotable((ASTNodeToTAnnotatable) newValue);
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
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_SRC_ANNOTATION:
			setCREATE__SRC__Annotation((Annotation) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_SRC_AST_NODE:
			setCONTEXT__SRC__astNode((BodyDeclaration) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_TRG_TANNOTABLE:
			setCONTEXT__TRG__tAnnotable((TAnnotatable) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_TRG_TANNOTATION:
			setCREATE__TRG__tAnnotation((TAnnotation) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_CORR_ANNOTATION_TO_TANNOTATION:
			setCREATE__CORR__AnnotationToTAnnotation((AnnotationToTAnnotation) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_CORR_AST_NODE_TO_TANNOTABLE:
			setCONTEXT__CORR__aSTNodeToTAnnotable((ASTNodeToTAnnotatable) null);
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
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_SRC_ANNOTATION:
			return creatE__SRC__Annotation != null;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_SRC_AST_NODE:
			return contexT__SRC__astNode != null;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_TRG_TANNOTABLE:
			return contexT__TRG__tAnnotable != null;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_TRG_TANNOTATION:
			return creatE__TRG__tAnnotation != null;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CREATE_CORR_ANNOTATION_TO_TANNOTATION:
			return creatE__CORR__AnnotationToTAnnotation != null;
		case ModiscoTGGPackage.ANNOTATION_ON_BODY_DECLARATION_MARKER__CONTEXT_CORR_AST_NODE_TO_TANNOTABLE:
			return contexT__CORR__aSTNodeToTAnnotable != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationOnBodyDeclaration__MarkerImpl
