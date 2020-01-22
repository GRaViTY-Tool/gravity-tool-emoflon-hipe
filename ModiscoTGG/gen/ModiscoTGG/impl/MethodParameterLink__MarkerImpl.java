/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MEntryToTParameter;
import ModiscoTGG.MethodParameterLink__Marker;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MEntry;

import org.gravity.typegraph.basic.TParameter;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Parameter Link Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.MethodParameterLink__MarkerImpl#getCONTEXT__SRC__mEntry <em>CONTEXT SRC mEntry</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterLink__MarkerImpl#getCONTEXT__SRC__mPrevEntry <em>CONTEXT SRC mPrev Entry</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterLink__MarkerImpl#getCONTEXT__TRG__tParameter <em>CONTEXT TRG tParameter</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterLink__MarkerImpl#getCONTEXT__TRG__tPrevParameter <em>CONTEXT TRG tPrev Parameter</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterLink__MarkerImpl#getCONTEXT__CORR__eSingleVariableDeclarationToTParameter <em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MethodParameterLink__MarkerImpl#getCONTEXT__CORR__mmethodSignatureToTMethodSignature <em>CONTEXT CORR mmethod Signature To TMethod Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodParameterLink__MarkerImpl extends TGGRuleApplicationImpl implements MethodParameterLink__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mEntry() <em>CONTEXT SRC mEntry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mEntry()
	 * @generated
	 * @ordered
	 */
	protected MEntry contexT__SRC__mEntry;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mPrevEntry() <em>CONTEXT SRC mPrev Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mPrevEntry()
	 * @generated
	 * @ordered
	 */
	protected MEntry contexT__SRC__mPrevEntry;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tParameter() <em>CONTEXT TRG tParameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tParameter()
	 * @generated
	 * @ordered
	 */
	protected TParameter contexT__TRG__tParameter;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tPrevParameter() <em>CONTEXT TRG tPrev Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tPrevParameter()
	 * @generated
	 * @ordered
	 */
	protected TParameter contexT__TRG__tPrevParameter;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eSingleVariableDeclarationToTParameter() <em>CONTEXT CORR eSingle Variable Declaration To TParameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eSingleVariableDeclarationToTParameter()
	 * @generated
	 * @ordered
	 */
	protected MEntryToTParameter contexT__CORR__eSingleVariableDeclarationToTParameter;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__mmethodSignatureToTMethodSignature() <em>CONTEXT CORR mmethod Signature To TMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__mmethodSignatureToTMethodSignature()
	 * @generated
	 * @ordered
	 */
	protected MEntryToTParameter contexT__CORR__mmethodSignatureToTMethodSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterLink__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getMethodParameterLink__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEntry getCONTEXT__SRC__mEntry() {
		if (contexT__SRC__mEntry != null && contexT__SRC__mEntry.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mEntry = (InternalEObject) contexT__SRC__mEntry;
			contexT__SRC__mEntry = (MEntry) eResolveProxy(oldCONTEXT__SRC__mEntry);
			if (contexT__SRC__mEntry != oldCONTEXT__SRC__mEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MENTRY, oldCONTEXT__SRC__mEntry,
							contexT__SRC__mEntry));
			}
		}
		return contexT__SRC__mEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntry basicGetCONTEXT__SRC__mEntry() {
		return contexT__SRC__mEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mEntry(MEntry newCONTEXT__SRC__mEntry) {
		MEntry oldCONTEXT__SRC__mEntry = contexT__SRC__mEntry;
		contexT__SRC__mEntry = newCONTEXT__SRC__mEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MENTRY, oldCONTEXT__SRC__mEntry,
					contexT__SRC__mEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEntry getCONTEXT__SRC__mPrevEntry() {
		if (contexT__SRC__mPrevEntry != null && contexT__SRC__mPrevEntry.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mPrevEntry = (InternalEObject) contexT__SRC__mPrevEntry;
			contexT__SRC__mPrevEntry = (MEntry) eResolveProxy(oldCONTEXT__SRC__mPrevEntry);
			if (contexT__SRC__mPrevEntry != oldCONTEXT__SRC__mPrevEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MPREV_ENTRY,
							oldCONTEXT__SRC__mPrevEntry, contexT__SRC__mPrevEntry));
			}
		}
		return contexT__SRC__mPrevEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntry basicGetCONTEXT__SRC__mPrevEntry() {
		return contexT__SRC__mPrevEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mPrevEntry(MEntry newCONTEXT__SRC__mPrevEntry) {
		MEntry oldCONTEXT__SRC__mPrevEntry = contexT__SRC__mPrevEntry;
		contexT__SRC__mPrevEntry = newCONTEXT__SRC__mPrevEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MPREV_ENTRY,
					oldCONTEXT__SRC__mPrevEntry, contexT__SRC__mPrevEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParameter getCONTEXT__TRG__tParameter() {
		if (contexT__TRG__tParameter != null && contexT__TRG__tParameter.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tParameter = (InternalEObject) contexT__TRG__tParameter;
			contexT__TRG__tParameter = (TParameter) eResolveProxy(oldCONTEXT__TRG__tParameter);
			if (contexT__TRG__tParameter != oldCONTEXT__TRG__tParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPARAMETER,
							oldCONTEXT__TRG__tParameter, contexT__TRG__tParameter));
			}
		}
		return contexT__TRG__tParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter basicGetCONTEXT__TRG__tParameter() {
		return contexT__TRG__tParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tParameter(TParameter newCONTEXT__TRG__tParameter) {
		TParameter oldCONTEXT__TRG__tParameter = contexT__TRG__tParameter;
		contexT__TRG__tParameter = newCONTEXT__TRG__tParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPARAMETER, oldCONTEXT__TRG__tParameter,
					contexT__TRG__tParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParameter getCONTEXT__TRG__tPrevParameter() {
		if (contexT__TRG__tPrevParameter != null && contexT__TRG__tPrevParameter.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tPrevParameter = (InternalEObject) contexT__TRG__tPrevParameter;
			contexT__TRG__tPrevParameter = (TParameter) eResolveProxy(oldCONTEXT__TRG__tPrevParameter);
			if (contexT__TRG__tPrevParameter != oldCONTEXT__TRG__tPrevParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPREV_PARAMETER,
							oldCONTEXT__TRG__tPrevParameter, contexT__TRG__tPrevParameter));
			}
		}
		return contexT__TRG__tPrevParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter basicGetCONTEXT__TRG__tPrevParameter() {
		return contexT__TRG__tPrevParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tPrevParameter(TParameter newCONTEXT__TRG__tPrevParameter) {
		TParameter oldCONTEXT__TRG__tPrevParameter = contexT__TRG__tPrevParameter;
		contexT__TRG__tPrevParameter = newCONTEXT__TRG__tPrevParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPREV_PARAMETER,
					oldCONTEXT__TRG__tPrevParameter, contexT__TRG__tPrevParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEntryToTParameter getCONTEXT__CORR__eSingleVariableDeclarationToTParameter() {
		if (contexT__CORR__eSingleVariableDeclarationToTParameter != null
				&& contexT__CORR__eSingleVariableDeclarationToTParameter.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eSingleVariableDeclarationToTParameter = (InternalEObject) contexT__CORR__eSingleVariableDeclarationToTParameter;
			contexT__CORR__eSingleVariableDeclarationToTParameter = (MEntryToTParameter) eResolveProxy(
					oldCONTEXT__CORR__eSingleVariableDeclarationToTParameter);
			if (contexT__CORR__eSingleVariableDeclarationToTParameter != oldCONTEXT__CORR__eSingleVariableDeclarationToTParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_ESINGLE_VARIABLE_DECLARATION_TO_TPARAMETER,
							oldCONTEXT__CORR__eSingleVariableDeclarationToTParameter,
							contexT__CORR__eSingleVariableDeclarationToTParameter));
			}
		}
		return contexT__CORR__eSingleVariableDeclarationToTParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntryToTParameter basicGetCONTEXT__CORR__eSingleVariableDeclarationToTParameter() {
		return contexT__CORR__eSingleVariableDeclarationToTParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eSingleVariableDeclarationToTParameter(
			MEntryToTParameter newCONTEXT__CORR__eSingleVariableDeclarationToTParameter) {
		MEntryToTParameter oldCONTEXT__CORR__eSingleVariableDeclarationToTParameter = contexT__CORR__eSingleVariableDeclarationToTParameter;
		contexT__CORR__eSingleVariableDeclarationToTParameter = newCONTEXT__CORR__eSingleVariableDeclarationToTParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_ESINGLE_VARIABLE_DECLARATION_TO_TPARAMETER,
					oldCONTEXT__CORR__eSingleVariableDeclarationToTParameter,
					contexT__CORR__eSingleVariableDeclarationToTParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEntryToTParameter getCONTEXT__CORR__mmethodSignatureToTMethodSignature() {
		if (contexT__CORR__mmethodSignatureToTMethodSignature != null
				&& contexT__CORR__mmethodSignatureToTMethodSignature.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__mmethodSignatureToTMethodSignature = (InternalEObject) contexT__CORR__mmethodSignatureToTMethodSignature;
			contexT__CORR__mmethodSignatureToTMethodSignature = (MEntryToTParameter) eResolveProxy(
					oldCONTEXT__CORR__mmethodSignatureToTMethodSignature);
			if (contexT__CORR__mmethodSignatureToTMethodSignature != oldCONTEXT__CORR__mmethodSignatureToTMethodSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE,
							oldCONTEXT__CORR__mmethodSignatureToTMethodSignature,
							contexT__CORR__mmethodSignatureToTMethodSignature));
			}
		}
		return contexT__CORR__mmethodSignatureToTMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntryToTParameter basicGetCONTEXT__CORR__mmethodSignatureToTMethodSignature() {
		return contexT__CORR__mmethodSignatureToTMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__mmethodSignatureToTMethodSignature(
			MEntryToTParameter newCONTEXT__CORR__mmethodSignatureToTMethodSignature) {
		MEntryToTParameter oldCONTEXT__CORR__mmethodSignatureToTMethodSignature = contexT__CORR__mmethodSignatureToTMethodSignature;
		contexT__CORR__mmethodSignatureToTMethodSignature = newCONTEXT__CORR__mmethodSignatureToTMethodSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE,
					oldCONTEXT__CORR__mmethodSignatureToTMethodSignature,
					contexT__CORR__mmethodSignatureToTMethodSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MENTRY:
			if (resolve)
				return getCONTEXT__SRC__mEntry();
			return basicGetCONTEXT__SRC__mEntry();
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MPREV_ENTRY:
			if (resolve)
				return getCONTEXT__SRC__mPrevEntry();
			return basicGetCONTEXT__SRC__mPrevEntry();
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPARAMETER:
			if (resolve)
				return getCONTEXT__TRG__tParameter();
			return basicGetCONTEXT__TRG__tParameter();
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPREV_PARAMETER:
			if (resolve)
				return getCONTEXT__TRG__tPrevParameter();
			return basicGetCONTEXT__TRG__tPrevParameter();
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_ESINGLE_VARIABLE_DECLARATION_TO_TPARAMETER:
			if (resolve)
				return getCONTEXT__CORR__eSingleVariableDeclarationToTParameter();
			return basicGetCONTEXT__CORR__eSingleVariableDeclarationToTParameter();
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE:
			if (resolve)
				return getCONTEXT__CORR__mmethodSignatureToTMethodSignature();
			return basicGetCONTEXT__CORR__mmethodSignatureToTMethodSignature();
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
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MENTRY:
			setCONTEXT__SRC__mEntry((MEntry) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MPREV_ENTRY:
			setCONTEXT__SRC__mPrevEntry((MEntry) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPARAMETER:
			setCONTEXT__TRG__tParameter((TParameter) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPREV_PARAMETER:
			setCONTEXT__TRG__tPrevParameter((TParameter) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_ESINGLE_VARIABLE_DECLARATION_TO_TPARAMETER:
			setCONTEXT__CORR__eSingleVariableDeclarationToTParameter((MEntryToTParameter) newValue);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE:
			setCONTEXT__CORR__mmethodSignatureToTMethodSignature((MEntryToTParameter) newValue);
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
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MENTRY:
			setCONTEXT__SRC__mEntry((MEntry) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MPREV_ENTRY:
			setCONTEXT__SRC__mPrevEntry((MEntry) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPARAMETER:
			setCONTEXT__TRG__tParameter((TParameter) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPREV_PARAMETER:
			setCONTEXT__TRG__tPrevParameter((TParameter) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_ESINGLE_VARIABLE_DECLARATION_TO_TPARAMETER:
			setCONTEXT__CORR__eSingleVariableDeclarationToTParameter((MEntryToTParameter) null);
			return;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE:
			setCONTEXT__CORR__mmethodSignatureToTMethodSignature((MEntryToTParameter) null);
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
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MENTRY:
			return contexT__SRC__mEntry != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_SRC_MPREV_ENTRY:
			return contexT__SRC__mPrevEntry != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPARAMETER:
			return contexT__TRG__tParameter != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_TRG_TPREV_PARAMETER:
			return contexT__TRG__tPrevParameter != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_ESINGLE_VARIABLE_DECLARATION_TO_TPARAMETER:
			return contexT__CORR__eSingleVariableDeclarationToTParameter != null;
		case ModiscoTGGPackage.METHOD_PARAMETER_LINK_MARKER__CONTEXT_CORR_MMETHOD_SIGNATURE_TO_TMETHOD_SIGNATURE:
			return contexT__CORR__mmethodSignatureToTMethodSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodParameterLink__MarkerImpl