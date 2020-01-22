/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.MSyntethicMethodToTSyntethicMethod;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.gravity.modisco.MSyntheticMethodDefinition;

import org.gravity.typegraph.basic.TSyntethicMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSyntethic Method To TSyntethic Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.MSyntethicMethodToTSyntethicMethodImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.impl.MSyntethicMethodToTSyntethicMethodImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSyntethicMethodToTSyntethicMethodImpl extends EObjectImpl implements MSyntethicMethodToTSyntethicMethod {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MSyntheticMethodDefinition source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TSyntethicMethod target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSyntethicMethodToTSyntethicMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getMSyntethicMethodToTSyntethicMethod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSyntheticMethodDefinition getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (MSyntheticMethodDefinition) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSyntheticMethodDefinition basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(MSyntheticMethodDefinition newSource) {
		MSyntheticMethodDefinition oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSyntethicMethod getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TSyntethicMethod) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSyntethicMethod basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TSyntethicMethod newTarget) {
		TSyntethicMethod oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET:
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
		case ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE:
			setSource((MSyntheticMethodDefinition) newValue);
			return;
		case ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET:
			setTarget((TSyntethicMethod) newValue);
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
		case ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE:
			setSource((MSyntheticMethodDefinition) null);
			return;
		case ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET:
			setTarget((TSyntethicMethod) null);
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
		case ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__SOURCE:
			return source != null;
		case ModiscoTGGPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

} //MSyntethicMethodToTSyntethicMethodImpl
