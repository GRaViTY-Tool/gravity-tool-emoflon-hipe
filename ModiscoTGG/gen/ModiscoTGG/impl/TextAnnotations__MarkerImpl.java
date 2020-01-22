/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.LineCommentToTTextAnnotation;
import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.TextAnnotations__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.LineComment;

import org.gravity.modisco.MDefinition;

import org.gravity.typegraph.basic.TMember;

import org.gravity.typegraph.basic.annotations.TTextAnnotation;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Annotations Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.TextAnnotations__MarkerImpl#getCREATE__SRC__mComment <em>CREATE SRC mComment</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TextAnnotations__MarkerImpl#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TextAnnotations__MarkerImpl#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TextAnnotations__MarkerImpl#getCREATE__TRG__tText <em>CREATE TRG tText</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TextAnnotations__MarkerImpl#getCREATE__CORR__mCommentToTText <em>CREATE CORR mComment To TText</em>}</li>
 *   <li>{@link ModiscoTGG.impl.TextAnnotations__MarkerImpl#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextAnnotations__MarkerImpl extends TGGRuleApplicationImpl implements TextAnnotations__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__mComment() <em>CREATE SRC mComment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mComment()
	 * @generated
	 * @ordered
	 */
	protected LineComment creatE__SRC__mComment;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__tMember() <em>CONTEXT TRG tMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tMember()
	 * @generated
	 * @ordered
	 */
	protected TMember contexT__TRG__tMember;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tText() <em>CREATE TRG tText</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tText()
	 * @generated
	 * @ordered
	 */
	protected TTextAnnotation creatE__TRG__tText;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__mCommentToTText() <em>CREATE CORR mComment To TText</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__mCommentToTText()
	 * @generated
	 * @ordered
	 */
	protected LineCommentToTTextAnnotation creatE__CORR__mCommentToTText;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextAnnotations__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getTextAnnotations__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineComment getCREATE__SRC__mComment() {
		if (creatE__SRC__mComment != null && creatE__SRC__mComment.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mComment = (InternalEObject) creatE__SRC__mComment;
			creatE__SRC__mComment = (LineComment) eResolveProxy(oldCREATE__SRC__mComment);
			if (creatE__SRC__mComment != oldCREATE__SRC__mComment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_SRC_MCOMMENT, oldCREATE__SRC__mComment,
							creatE__SRC__mComment));
			}
		}
		return creatE__SRC__mComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineComment basicGetCREATE__SRC__mComment() {
		return creatE__SRC__mComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mComment(LineComment newCREATE__SRC__mComment) {
		LineComment oldCREATE__SRC__mComment = creatE__SRC__mComment;
		creatE__SRC__mComment = newCREATE__SRC__mComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_SRC_MCOMMENT, oldCREATE__SRC__mComment,
					creatE__SRC__mComment));
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
							ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_SRC_MMEMBER, oldCONTEXT__SRC__mMember,
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
					ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_SRC_MMEMBER, oldCONTEXT__SRC__mMember,
					contexT__SRC__mMember));
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
							ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_TRG_TMEMBER, oldCONTEXT__TRG__tMember,
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
					ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_TRG_TMEMBER, oldCONTEXT__TRG__tMember,
					contexT__TRG__tMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTextAnnotation getCREATE__TRG__tText() {
		if (creatE__TRG__tText != null && creatE__TRG__tText.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tText = (InternalEObject) creatE__TRG__tText;
			creatE__TRG__tText = (TTextAnnotation) eResolveProxy(oldCREATE__TRG__tText);
			if (creatE__TRG__tText != oldCREATE__TRG__tText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_TRG_TTEXT, oldCREATE__TRG__tText,
							creatE__TRG__tText));
			}
		}
		return creatE__TRG__tText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTextAnnotation basicGetCREATE__TRG__tText() {
		return creatE__TRG__tText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tText(TTextAnnotation newCREATE__TRG__tText) {
		TTextAnnotation oldCREATE__TRG__tText = creatE__TRG__tText;
		creatE__TRG__tText = newCREATE__TRG__tText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_TRG_TTEXT, oldCREATE__TRG__tText,
					creatE__TRG__tText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineCommentToTTextAnnotation getCREATE__CORR__mCommentToTText() {
		if (creatE__CORR__mCommentToTText != null && creatE__CORR__mCommentToTText.eIsProxy()) {
			InternalEObject oldCREATE__CORR__mCommentToTText = (InternalEObject) creatE__CORR__mCommentToTText;
			creatE__CORR__mCommentToTText = (LineCommentToTTextAnnotation) eResolveProxy(
					oldCREATE__CORR__mCommentToTText);
			if (creatE__CORR__mCommentToTText != oldCREATE__CORR__mCommentToTText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_CORR_MCOMMENT_TO_TTEXT,
							oldCREATE__CORR__mCommentToTText, creatE__CORR__mCommentToTText));
			}
		}
		return creatE__CORR__mCommentToTText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineCommentToTTextAnnotation basicGetCREATE__CORR__mCommentToTText() {
		return creatE__CORR__mCommentToTText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__mCommentToTText(LineCommentToTTextAnnotation newCREATE__CORR__mCommentToTText) {
		LineCommentToTTextAnnotation oldCREATE__CORR__mCommentToTText = creatE__CORR__mCommentToTText;
		creatE__CORR__mCommentToTText = newCREATE__CORR__mCommentToTText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_CORR_MCOMMENT_TO_TTEXT,
					oldCREATE__CORR__mCommentToTText, creatE__CORR__mCommentToTText));
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
							ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER,
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
					ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER,
					oldCONTEXT__CORR__mMemberToTMember, contexT__CORR__mMemberToTMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_SRC_MCOMMENT:
			if (resolve)
				return getCREATE__SRC__mComment();
			return basicGetCREATE__SRC__mComment();
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_SRC_MMEMBER:
			if (resolve)
				return getCONTEXT__SRC__mMember();
			return basicGetCONTEXT__SRC__mMember();
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_TRG_TMEMBER:
			if (resolve)
				return getCONTEXT__TRG__tMember();
			return basicGetCONTEXT__TRG__tMember();
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_TRG_TTEXT:
			if (resolve)
				return getCREATE__TRG__tText();
			return basicGetCREATE__TRG__tText();
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_CORR_MCOMMENT_TO_TTEXT:
			if (resolve)
				return getCREATE__CORR__mCommentToTText();
			return basicGetCREATE__CORR__mCommentToTText();
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			if (resolve)
				return getCONTEXT__CORR__mMemberToTMember();
			return basicGetCONTEXT__CORR__mMemberToTMember();
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
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_SRC_MCOMMENT:
			setCREATE__SRC__mComment((LineComment) newValue);
			return;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_SRC_MMEMBER:
			setCONTEXT__SRC__mMember((MDefinition) newValue);
			return;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_TRG_TMEMBER:
			setCONTEXT__TRG__tMember((TMember) newValue);
			return;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_TRG_TTEXT:
			setCREATE__TRG__tText((TTextAnnotation) newValue);
			return;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_CORR_MCOMMENT_TO_TTEXT:
			setCREATE__CORR__mCommentToTText((LineCommentToTTextAnnotation) newValue);
			return;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			setCONTEXT__CORR__mMemberToTMember((MDefinitionToTMember) newValue);
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
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_SRC_MCOMMENT:
			setCREATE__SRC__mComment((LineComment) null);
			return;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_SRC_MMEMBER:
			setCONTEXT__SRC__mMember((MDefinition) null);
			return;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_TRG_TMEMBER:
			setCONTEXT__TRG__tMember((TMember) null);
			return;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_TRG_TTEXT:
			setCREATE__TRG__tText((TTextAnnotation) null);
			return;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_CORR_MCOMMENT_TO_TTEXT:
			setCREATE__CORR__mCommentToTText((LineCommentToTTextAnnotation) null);
			return;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			setCONTEXT__CORR__mMemberToTMember((MDefinitionToTMember) null);
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
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_SRC_MCOMMENT:
			return creatE__SRC__mComment != null;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_SRC_MMEMBER:
			return contexT__SRC__mMember != null;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_TRG_TMEMBER:
			return contexT__TRG__tMember != null;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_TRG_TTEXT:
			return creatE__TRG__tText != null;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CREATE_CORR_MCOMMENT_TO_TTEXT:
			return creatE__CORR__mCommentToTText != null;
		case ModiscoTGGPackage.TEXT_ANNOTATIONS_MARKER__CONTEXT_CORR_MMEMBER_TO_TMEMBER:
			return contexT__CORR__mMemberToTMember != null;
		}
		return super.eIsSet(featureID);
	}

} //TextAnnotations__MarkerImpl
