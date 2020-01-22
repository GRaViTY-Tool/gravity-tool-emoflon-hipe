/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MDefinitionToTMember;
import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition;
import ModiscoTGG.VariableDeclarationFragment__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.java.VariableDeclarationFragment;

import org.gravity.modisco.MFieldDefinition;

import org.gravity.typegraph.basic.TFieldDefinition;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Fragment Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.VariableDeclarationFragment__MarkerImpl#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.VariableDeclarationFragment__MarkerImpl#getCREATE__SRC__varDeclFragment <em>CREATE SRC var Decl Fragment</em>}</li>
 *   <li>{@link ModiscoTGG.impl.VariableDeclarationFragment__MarkerImpl#getCONTEXT__TRG__tDefinition <em>CONTEXT TRG tDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.VariableDeclarationFragment__MarkerImpl#getCONTEXT__CORR__eFieldDeclarationToTFieldDefinition <em>CONTEXT CORR eField Declaration To TField Definition</em>}</li>
 *   <li>{@link ModiscoTGG.impl.VariableDeclarationFragment__MarkerImpl#getCREATE__CORR__varDeclFragmentToTFieldDefinition <em>CREATE CORR var Decl Fragment To TField Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationFragment__MarkerImpl extends TGGRuleApplicationImpl
		implements VariableDeclarationFragment__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__mDefinition() <em>CONTEXT SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__mDefinition()
	 * @generated
	 * @ordered
	 */
	protected MFieldDefinition contexT__SRC__mDefinition;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__varDeclFragment() <em>CREATE SRC var Decl Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__varDeclFragment()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationFragment creatE__SRC__varDeclFragment;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__tDefinition() <em>CONTEXT TRG tDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__tDefinition()
	 * @generated
	 * @ordered
	 */
	protected TFieldDefinition contexT__TRG__tDefinition;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__eFieldDeclarationToTFieldDefinition() <em>CONTEXT CORR eField Declaration To TField Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__eFieldDeclarationToTFieldDefinition()
	 * @generated
	 * @ordered
	 */
	protected MDefinitionToTMember contexT__CORR__eFieldDeclarationToTFieldDefinition;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__varDeclFragmentToTFieldDefinition() <em>CREATE CORR var Decl Fragment To TField Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__varDeclFragmentToTFieldDefinition()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationFragmentToTFieldDefinition creatE__CORR__varDeclFragmentToTFieldDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationFragment__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getVariableDeclarationFragment__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFieldDefinition getCONTEXT__SRC__mDefinition() {
		if (contexT__SRC__mDefinition != null && contexT__SRC__mDefinition.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__mDefinition = (InternalEObject) contexT__SRC__mDefinition;
			contexT__SRC__mDefinition = (MFieldDefinition) eResolveProxy(oldCONTEXT__SRC__mDefinition);
			if (contexT__SRC__mDefinition != oldCONTEXT__SRC__mDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_SRC_MDEFINITION,
							oldCONTEXT__SRC__mDefinition, contexT__SRC__mDefinition));
			}
		}
		return contexT__SRC__mDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldDefinition basicGetCONTEXT__SRC__mDefinition() {
		return contexT__SRC__mDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__mDefinition(MFieldDefinition newCONTEXT__SRC__mDefinition) {
		MFieldDefinition oldCONTEXT__SRC__mDefinition = contexT__SRC__mDefinition;
		contexT__SRC__mDefinition = newCONTEXT__SRC__mDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_SRC_MDEFINITION,
					oldCONTEXT__SRC__mDefinition, contexT__SRC__mDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragment getCREATE__SRC__varDeclFragment() {
		if (creatE__SRC__varDeclFragment != null && creatE__SRC__varDeclFragment.eIsProxy()) {
			InternalEObject oldCREATE__SRC__varDeclFragment = (InternalEObject) creatE__SRC__varDeclFragment;
			creatE__SRC__varDeclFragment = (VariableDeclarationFragment) eResolveProxy(oldCREATE__SRC__varDeclFragment);
			if (creatE__SRC__varDeclFragment != oldCREATE__SRC__varDeclFragment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_SRC_VAR_DECL_FRAGMENT,
							oldCREATE__SRC__varDeclFragment, creatE__SRC__varDeclFragment));
			}
		}
		return creatE__SRC__varDeclFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationFragment basicGetCREATE__SRC__varDeclFragment() {
		return creatE__SRC__varDeclFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__varDeclFragment(VariableDeclarationFragment newCREATE__SRC__varDeclFragment) {
		VariableDeclarationFragment oldCREATE__SRC__varDeclFragment = creatE__SRC__varDeclFragment;
		creatE__SRC__varDeclFragment = newCREATE__SRC__varDeclFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_SRC_VAR_DECL_FRAGMENT,
					oldCREATE__SRC__varDeclFragment, creatE__SRC__varDeclFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldDefinition getCONTEXT__TRG__tDefinition() {
		if (contexT__TRG__tDefinition != null && contexT__TRG__tDefinition.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__tDefinition = (InternalEObject) contexT__TRG__tDefinition;
			contexT__TRG__tDefinition = (TFieldDefinition) eResolveProxy(oldCONTEXT__TRG__tDefinition);
			if (contexT__TRG__tDefinition != oldCONTEXT__TRG__tDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_TRG_TDEFINITION,
							oldCONTEXT__TRG__tDefinition, contexT__TRG__tDefinition));
			}
		}
		return contexT__TRG__tDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldDefinition basicGetCONTEXT__TRG__tDefinition() {
		return contexT__TRG__tDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__tDefinition(TFieldDefinition newCONTEXT__TRG__tDefinition) {
		TFieldDefinition oldCONTEXT__TRG__tDefinition = contexT__TRG__tDefinition;
		contexT__TRG__tDefinition = newCONTEXT__TRG__tDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_TRG_TDEFINITION,
					oldCONTEXT__TRG__tDefinition, contexT__TRG__tDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember getCONTEXT__CORR__eFieldDeclarationToTFieldDefinition() {
		if (contexT__CORR__eFieldDeclarationToTFieldDefinition != null
				&& contexT__CORR__eFieldDeclarationToTFieldDefinition.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__eFieldDeclarationToTFieldDefinition = (InternalEObject) contexT__CORR__eFieldDeclarationToTFieldDefinition;
			contexT__CORR__eFieldDeclarationToTFieldDefinition = (MDefinitionToTMember) eResolveProxy(
					oldCONTEXT__CORR__eFieldDeclarationToTFieldDefinition);
			if (contexT__CORR__eFieldDeclarationToTFieldDefinition != oldCONTEXT__CORR__eFieldDeclarationToTFieldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD_DEFINITION,
							oldCONTEXT__CORR__eFieldDeclarationToTFieldDefinition,
							contexT__CORR__eFieldDeclarationToTFieldDefinition));
			}
		}
		return contexT__CORR__eFieldDeclarationToTFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDefinitionToTMember basicGetCONTEXT__CORR__eFieldDeclarationToTFieldDefinition() {
		return contexT__CORR__eFieldDeclarationToTFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__eFieldDeclarationToTFieldDefinition(
			MDefinitionToTMember newCONTEXT__CORR__eFieldDeclarationToTFieldDefinition) {
		MDefinitionToTMember oldCONTEXT__CORR__eFieldDeclarationToTFieldDefinition = contexT__CORR__eFieldDeclarationToTFieldDefinition;
		contexT__CORR__eFieldDeclarationToTFieldDefinition = newCONTEXT__CORR__eFieldDeclarationToTFieldDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD_DEFINITION,
					oldCONTEXT__CORR__eFieldDeclarationToTFieldDefinition,
					contexT__CORR__eFieldDeclarationToTFieldDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragmentToTFieldDefinition getCREATE__CORR__varDeclFragmentToTFieldDefinition() {
		if (creatE__CORR__varDeclFragmentToTFieldDefinition != null
				&& creatE__CORR__varDeclFragmentToTFieldDefinition.eIsProxy()) {
			InternalEObject oldCREATE__CORR__varDeclFragmentToTFieldDefinition = (InternalEObject) creatE__CORR__varDeclFragmentToTFieldDefinition;
			creatE__CORR__varDeclFragmentToTFieldDefinition = (VariableDeclarationFragmentToTFieldDefinition) eResolveProxy(
					oldCREATE__CORR__varDeclFragmentToTFieldDefinition);
			if (creatE__CORR__varDeclFragmentToTFieldDefinition != oldCREATE__CORR__varDeclFragmentToTFieldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_CORR_VAR_DECL_FRAGMENT_TO_TFIELD_DEFINITION,
							oldCREATE__CORR__varDeclFragmentToTFieldDefinition,
							creatE__CORR__varDeclFragmentToTFieldDefinition));
			}
		}
		return creatE__CORR__varDeclFragmentToTFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationFragmentToTFieldDefinition basicGetCREATE__CORR__varDeclFragmentToTFieldDefinition() {
		return creatE__CORR__varDeclFragmentToTFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__varDeclFragmentToTFieldDefinition(
			VariableDeclarationFragmentToTFieldDefinition newCREATE__CORR__varDeclFragmentToTFieldDefinition) {
		VariableDeclarationFragmentToTFieldDefinition oldCREATE__CORR__varDeclFragmentToTFieldDefinition = creatE__CORR__varDeclFragmentToTFieldDefinition;
		creatE__CORR__varDeclFragmentToTFieldDefinition = newCREATE__CORR__varDeclFragmentToTFieldDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_CORR_VAR_DECL_FRAGMENT_TO_TFIELD_DEFINITION,
					oldCREATE__CORR__varDeclFragmentToTFieldDefinition,
					creatE__CORR__varDeclFragmentToTFieldDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_SRC_MDEFINITION:
			if (resolve)
				return getCONTEXT__SRC__mDefinition();
			return basicGetCONTEXT__SRC__mDefinition();
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_SRC_VAR_DECL_FRAGMENT:
			if (resolve)
				return getCREATE__SRC__varDeclFragment();
			return basicGetCREATE__SRC__varDeclFragment();
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_TRG_TDEFINITION:
			if (resolve)
				return getCONTEXT__TRG__tDefinition();
			return basicGetCONTEXT__TRG__tDefinition();
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD_DEFINITION:
			if (resolve)
				return getCONTEXT__CORR__eFieldDeclarationToTFieldDefinition();
			return basicGetCONTEXT__CORR__eFieldDeclarationToTFieldDefinition();
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_CORR_VAR_DECL_FRAGMENT_TO_TFIELD_DEFINITION:
			if (resolve)
				return getCREATE__CORR__varDeclFragmentToTFieldDefinition();
			return basicGetCREATE__CORR__varDeclFragmentToTFieldDefinition();
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
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_SRC_MDEFINITION:
			setCONTEXT__SRC__mDefinition((MFieldDefinition) newValue);
			return;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_SRC_VAR_DECL_FRAGMENT:
			setCREATE__SRC__varDeclFragment((VariableDeclarationFragment) newValue);
			return;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_TRG_TDEFINITION:
			setCONTEXT__TRG__tDefinition((TFieldDefinition) newValue);
			return;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD_DEFINITION:
			setCONTEXT__CORR__eFieldDeclarationToTFieldDefinition((MDefinitionToTMember) newValue);
			return;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_CORR_VAR_DECL_FRAGMENT_TO_TFIELD_DEFINITION:
			setCREATE__CORR__varDeclFragmentToTFieldDefinition(
					(VariableDeclarationFragmentToTFieldDefinition) newValue);
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
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_SRC_MDEFINITION:
			setCONTEXT__SRC__mDefinition((MFieldDefinition) null);
			return;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_SRC_VAR_DECL_FRAGMENT:
			setCREATE__SRC__varDeclFragment((VariableDeclarationFragment) null);
			return;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_TRG_TDEFINITION:
			setCONTEXT__TRG__tDefinition((TFieldDefinition) null);
			return;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD_DEFINITION:
			setCONTEXT__CORR__eFieldDeclarationToTFieldDefinition((MDefinitionToTMember) null);
			return;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_CORR_VAR_DECL_FRAGMENT_TO_TFIELD_DEFINITION:
			setCREATE__CORR__varDeclFragmentToTFieldDefinition((VariableDeclarationFragmentToTFieldDefinition) null);
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
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_SRC_MDEFINITION:
			return contexT__SRC__mDefinition != null;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_SRC_VAR_DECL_FRAGMENT:
			return creatE__SRC__varDeclFragment != null;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_TRG_TDEFINITION:
			return contexT__TRG__tDefinition != null;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CONTEXT_CORR_EFIELD_DECLARATION_TO_TFIELD_DEFINITION:
			return contexT__CORR__eFieldDeclarationToTFieldDefinition != null;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_MARKER__CREATE_CORR_VAR_DECL_FRAGMENT_TO_TFIELD_DEFINITION:
			return creatE__CORR__varDeclFragmentToTFieldDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclarationFragment__MarkerImpl
