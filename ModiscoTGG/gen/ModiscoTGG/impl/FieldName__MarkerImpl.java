/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.FieldName__Marker;
import ModiscoTGG.MFieldNameToTField;
import ModiscoTGG.ModelToTypeGraph;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MGravityModel;

import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Name Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.FieldName__MarkerImpl#getCREATE__SRC__mFieldName <em>CREATE SRC mField Name</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldName__MarkerImpl#getCONTEXT__SRC__model <em>CONTEXT SRC model</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldName__MarkerImpl#getCREATE__TRG__tField <em>CREATE TRG tField</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldName__MarkerImpl#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldName__MarkerImpl#getCREATE__CORR__eFieldDeclarationToTField <em>CREATE CORR eField Declaration To TField</em>}</li>
 *   <li>{@link ModiscoTGG.impl.FieldName__MarkerImpl#getCONTEXT__CORR__modelToTypeGraph <em>CONTEXT CORR model To Type Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldName__MarkerImpl extends TGGRuleApplicationImpl implements FieldName__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__mFieldName() <em>CREATE SRC mField Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__mFieldName()
	 * @generated
	 * @ordered
	 */
	protected MFieldName creatE__SRC__mFieldName;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__model() <em>CONTEXT SRC model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__model()
	 * @generated
	 * @ordered
	 */
	protected MGravityModel contexT__SRC__model;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__tField() <em>CREATE TRG tField</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__tField()
	 * @generated
	 * @ordered
	 */
	protected TField creatE__TRG__tField;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__typeGraph() <em>CONTEXT TRG type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__typeGraph()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph contexT__TRG__typeGraph;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__eFieldDeclarationToTField() <em>CREATE CORR eField Declaration To TField</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__eFieldDeclarationToTField()
	 * @generated
	 * @ordered
	 */
	protected MFieldNameToTField creatE__CORR__eFieldDeclarationToTField;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__modelToTypeGraph() <em>CONTEXT CORR model To Type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__modelToTypeGraph()
	 * @generated
	 * @ordered
	 */
	protected ModelToTypeGraph contexT__CORR__modelToTypeGraph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldName__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getFieldName__Marker();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFieldName getCREATE__SRC__mFieldName() {
		if (creatE__SRC__mFieldName != null && creatE__SRC__mFieldName.eIsProxy()) {
			InternalEObject oldCREATE__SRC__mFieldName = (InternalEObject) creatE__SRC__mFieldName;
			creatE__SRC__mFieldName = (MFieldName) eResolveProxy(oldCREATE__SRC__mFieldName);
			if (creatE__SRC__mFieldName != oldCREATE__SRC__mFieldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_SRC_MFIELD_NAME, oldCREATE__SRC__mFieldName,
							creatE__SRC__mFieldName));
			}
		}
		return creatE__SRC__mFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldName basicGetCREATE__SRC__mFieldName() {
		return creatE__SRC__mFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__SRC__mFieldName(MFieldName newCREATE__SRC__mFieldName) {
		MFieldName oldCREATE__SRC__mFieldName = creatE__SRC__mFieldName;
		creatE__SRC__mFieldName = newCREATE__SRC__mFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_SRC_MFIELD_NAME, oldCREATE__SRC__mFieldName,
					creatE__SRC__mFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MGravityModel getCONTEXT__SRC__model() {
		if (contexT__SRC__model != null && contexT__SRC__model.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__model = (InternalEObject) contexT__SRC__model;
			contexT__SRC__model = (MGravityModel) eResolveProxy(oldCONTEXT__SRC__model);
			if (contexT__SRC__model != oldCONTEXT__SRC__model) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_SRC_MODEL, oldCONTEXT__SRC__model,
							contexT__SRC__model));
			}
		}
		return contexT__SRC__model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGravityModel basicGetCONTEXT__SRC__model() {
		return contexT__SRC__model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__SRC__model(MGravityModel newCONTEXT__SRC__model) {
		MGravityModel oldCONTEXT__SRC__model = contexT__SRC__model;
		contexT__SRC__model = newCONTEXT__SRC__model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_SRC_MODEL, oldCONTEXT__SRC__model,
					contexT__SRC__model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TField getCREATE__TRG__tField() {
		if (creatE__TRG__tField != null && creatE__TRG__tField.eIsProxy()) {
			InternalEObject oldCREATE__TRG__tField = (InternalEObject) creatE__TRG__tField;
			creatE__TRG__tField = (TField) eResolveProxy(oldCREATE__TRG__tField);
			if (creatE__TRG__tField != oldCREATE__TRG__tField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_TRG_TFIELD, oldCREATE__TRG__tField,
							creatE__TRG__tField));
			}
		}
		return creatE__TRG__tField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TField basicGetCREATE__TRG__tField() {
		return creatE__TRG__tField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__TRG__tField(TField newCREATE__TRG__tField) {
		TField oldCREATE__TRG__tField = creatE__TRG__tField;
		creatE__TRG__tField = newCREATE__TRG__tField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_TRG_TFIELD, oldCREATE__TRG__tField,
					creatE__TRG__tField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph getCONTEXT__TRG__typeGraph() {
		if (contexT__TRG__typeGraph != null && contexT__TRG__typeGraph.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__typeGraph = (InternalEObject) contexT__TRG__typeGraph;
			contexT__TRG__typeGraph = (TypeGraph) eResolveProxy(oldCONTEXT__TRG__typeGraph);
			if (contexT__TRG__typeGraph != oldCONTEXT__TRG__typeGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_TRG_TYPE_GRAPH, oldCONTEXT__TRG__typeGraph,
							contexT__TRG__typeGraph));
			}
		}
		return contexT__TRG__typeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph basicGetCONTEXT__TRG__typeGraph() {
		return contexT__TRG__typeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__TRG__typeGraph(TypeGraph newCONTEXT__TRG__typeGraph) {
		TypeGraph oldCONTEXT__TRG__typeGraph = contexT__TRG__typeGraph;
		contexT__TRG__typeGraph = newCONTEXT__TRG__typeGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_TRG_TYPE_GRAPH, oldCONTEXT__TRG__typeGraph,
					contexT__TRG__typeGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFieldNameToTField getCREATE__CORR__eFieldDeclarationToTField() {
		if (creatE__CORR__eFieldDeclarationToTField != null && creatE__CORR__eFieldDeclarationToTField.eIsProxy()) {
			InternalEObject oldCREATE__CORR__eFieldDeclarationToTField = (InternalEObject) creatE__CORR__eFieldDeclarationToTField;
			creatE__CORR__eFieldDeclarationToTField = (MFieldNameToTField) eResolveProxy(
					oldCREATE__CORR__eFieldDeclarationToTField);
			if (creatE__CORR__eFieldDeclarationToTField != oldCREATE__CORR__eFieldDeclarationToTField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_CORR_EFIELD_DECLARATION_TO_TFIELD,
							oldCREATE__CORR__eFieldDeclarationToTField, creatE__CORR__eFieldDeclarationToTField));
			}
		}
		return creatE__CORR__eFieldDeclarationToTField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldNameToTField basicGetCREATE__CORR__eFieldDeclarationToTField() {
		return creatE__CORR__eFieldDeclarationToTField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCREATE__CORR__eFieldDeclarationToTField(
			MFieldNameToTField newCREATE__CORR__eFieldDeclarationToTField) {
		MFieldNameToTField oldCREATE__CORR__eFieldDeclarationToTField = creatE__CORR__eFieldDeclarationToTField;
		creatE__CORR__eFieldDeclarationToTField = newCREATE__CORR__eFieldDeclarationToTField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_CORR_EFIELD_DECLARATION_TO_TFIELD,
					oldCREATE__CORR__eFieldDeclarationToTField, creatE__CORR__eFieldDeclarationToTField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelToTypeGraph getCONTEXT__CORR__modelToTypeGraph() {
		if (contexT__CORR__modelToTypeGraph != null && contexT__CORR__modelToTypeGraph.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__modelToTypeGraph = (InternalEObject) contexT__CORR__modelToTypeGraph;
			contexT__CORR__modelToTypeGraph = (ModelToTypeGraph) eResolveProxy(oldCONTEXT__CORR__modelToTypeGraph);
			if (contexT__CORR__modelToTypeGraph != oldCONTEXT__CORR__modelToTypeGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_TYPE_GRAPH,
							oldCONTEXT__CORR__modelToTypeGraph, contexT__CORR__modelToTypeGraph));
			}
		}
		return contexT__CORR__modelToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelToTypeGraph basicGetCONTEXT__CORR__modelToTypeGraph() {
		return contexT__CORR__modelToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCONTEXT__CORR__modelToTypeGraph(ModelToTypeGraph newCONTEXT__CORR__modelToTypeGraph) {
		ModelToTypeGraph oldCONTEXT__CORR__modelToTypeGraph = contexT__CORR__modelToTypeGraph;
		contexT__CORR__modelToTypeGraph = newCONTEXT__CORR__modelToTypeGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_TYPE_GRAPH,
					oldCONTEXT__CORR__modelToTypeGraph, contexT__CORR__modelToTypeGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_SRC_MFIELD_NAME:
			if (resolve)
				return getCREATE__SRC__mFieldName();
			return basicGetCREATE__SRC__mFieldName();
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_SRC_MODEL:
			if (resolve)
				return getCONTEXT__SRC__model();
			return basicGetCONTEXT__SRC__model();
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_TRG_TFIELD:
			if (resolve)
				return getCREATE__TRG__tField();
			return basicGetCREATE__TRG__tField();
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			if (resolve)
				return getCONTEXT__TRG__typeGraph();
			return basicGetCONTEXT__TRG__typeGraph();
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_CORR_EFIELD_DECLARATION_TO_TFIELD:
			if (resolve)
				return getCREATE__CORR__eFieldDeclarationToTField();
			return basicGetCREATE__CORR__eFieldDeclarationToTField();
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_TYPE_GRAPH:
			if (resolve)
				return getCONTEXT__CORR__modelToTypeGraph();
			return basicGetCONTEXT__CORR__modelToTypeGraph();
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
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_SRC_MFIELD_NAME:
			setCREATE__SRC__mFieldName((MFieldName) newValue);
			return;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_SRC_MODEL:
			setCONTEXT__SRC__model((MGravityModel) newValue);
			return;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_TRG_TFIELD:
			setCREATE__TRG__tField((TField) newValue);
			return;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) newValue);
			return;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_CORR_EFIELD_DECLARATION_TO_TFIELD:
			setCREATE__CORR__eFieldDeclarationToTField((MFieldNameToTField) newValue);
			return;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_TYPE_GRAPH:
			setCONTEXT__CORR__modelToTypeGraph((ModelToTypeGraph) newValue);
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
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_SRC_MFIELD_NAME:
			setCREATE__SRC__mFieldName((MFieldName) null);
			return;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_SRC_MODEL:
			setCONTEXT__SRC__model((MGravityModel) null);
			return;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_TRG_TFIELD:
			setCREATE__TRG__tField((TField) null);
			return;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			setCONTEXT__TRG__typeGraph((TypeGraph) null);
			return;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_CORR_EFIELD_DECLARATION_TO_TFIELD:
			setCREATE__CORR__eFieldDeclarationToTField((MFieldNameToTField) null);
			return;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_TYPE_GRAPH:
			setCONTEXT__CORR__modelToTypeGraph((ModelToTypeGraph) null);
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
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_SRC_MFIELD_NAME:
			return creatE__SRC__mFieldName != null;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_SRC_MODEL:
			return contexT__SRC__model != null;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_TRG_TFIELD:
			return creatE__TRG__tField != null;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_TRG_TYPE_GRAPH:
			return contexT__TRG__typeGraph != null;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CREATE_CORR_EFIELD_DECLARATION_TO_TFIELD:
			return creatE__CORR__eFieldDeclarationToTField != null;
		case ModiscoTGGPackage.FIELD_NAME_MARKER__CONTEXT_CORR_MODEL_TO_TYPE_GRAPH:
			return contexT__CORR__modelToTypeGraph != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldName__MarkerImpl
