/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.NumberLiteralToTNumberNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.java.NumberLiteral;

import org.gravity.typegraph.basic.annotations.TNumberNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Literal To TNumber Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.NumberLiteralToTNumberNodeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.impl.NumberLiteralToTNumberNodeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberLiteralToTNumberNodeImpl extends EObjectImpl implements NumberLiteralToTNumberNode {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected NumberLiteral source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TNumberNode target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberLiteralToTNumberNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getNumberLiteralToTNumberNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberLiteral getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (NumberLiteral) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberLiteral basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(NumberLiteral newSource) {
		NumberLiteral oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TNumberNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TNumberNode) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNumberNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TNumberNode newTarget) {
		TNumberNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE__TARGET:
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
		case ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE__SOURCE:
			setSource((NumberLiteral) newValue);
			return;
		case ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE__TARGET:
			setTarget((TNumberNode) newValue);
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
		case ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE__SOURCE:
			setSource((NumberLiteral) null);
			return;
		case ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE__TARGET:
			setTarget((TNumberNode) null);
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
		case ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE__SOURCE:
			return source != null;
		case ModiscoTGGPackage.NUMBER_LITERAL_TO_TNUMBER_NODE__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

} //NumberLiteralToTNumberNodeImpl
