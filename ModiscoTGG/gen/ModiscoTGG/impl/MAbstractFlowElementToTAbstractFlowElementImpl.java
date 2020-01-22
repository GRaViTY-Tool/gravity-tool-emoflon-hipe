/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MAbstractFlowElementToTAbstractFlowElement;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.gravity.modisco.MAbstractFlowElement;

import org.gravity.typegraph.basic.TAbstractFlowElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MAbstract Flow Element To TAbstract Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.MAbstractFlowElementToTAbstractFlowElementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MAbstractFlowElementToTAbstractFlowElementImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MAbstractFlowElementToTAbstractFlowElementImpl extends EObjectImpl
		implements MAbstractFlowElementToTAbstractFlowElement {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MAbstractFlowElement source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TAbstractFlowElement target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAbstractFlowElementToTAbstractFlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getMAbstractFlowElementToTAbstractFlowElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (MAbstractFlowElement) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE, oldSource,
							source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAbstractFlowElement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(MAbstractFlowElement newSource) {
		MAbstractFlowElement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAbstractFlowElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TAbstractFlowElement) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET, oldTarget,
							target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAbstractFlowElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TAbstractFlowElement newTarget) {
		TAbstractFlowElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
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
		case ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE:
			setSource((MAbstractFlowElement) newValue);
			return;
		case ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET:
			setTarget((TAbstractFlowElement) newValue);
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
		case ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE:
			setSource((MAbstractFlowElement) null);
			return;
		case ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET:
			setTarget((TAbstractFlowElement) null);
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
		case ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__SOURCE:
			return source != null;
		case ModiscoTGGPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

} //MAbstractFlowElementToTAbstractFlowElementImpl
