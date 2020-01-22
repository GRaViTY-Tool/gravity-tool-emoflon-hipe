/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MSingleVariableAccessToTAccess;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.gravity.modisco.MSingleVariableAccess;

import org.gravity.typegraph.basic.TAccess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSingle Variable Access To TAccess</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.MSingleVariableAccessToTAccessImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MSingleVariableAccessToTAccessImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSingleVariableAccessToTAccessImpl extends EObjectImpl implements MSingleVariableAccessToTAccess {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MSingleVariableAccess source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TAccess target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSingleVariableAccessToTAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getMSingleVariableAccessToTAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSingleVariableAccess getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (MSingleVariableAccess) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSingleVariableAccess basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(MSingleVariableAccess newSource) {
		MSingleVariableAccess oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAccess getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TAccess) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAccess basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TAccess newTarget) {
		TAccess oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS__TARGET:
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
		case ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS__SOURCE:
			setSource((MSingleVariableAccess) newValue);
			return;
		case ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS__TARGET:
			setTarget((TAccess) newValue);
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
		case ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS__SOURCE:
			setSource((MSingleVariableAccess) null);
			return;
		case ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS__TARGET:
			setTarget((TAccess) null);
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
		case ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS__SOURCE:
			return source != null;
		case ModiscoTGGPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

} //MSingleVariableAccessToTAccessImpl
