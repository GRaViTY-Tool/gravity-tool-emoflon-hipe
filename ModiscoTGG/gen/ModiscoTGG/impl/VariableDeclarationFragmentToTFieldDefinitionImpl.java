/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ModiscoTGGPackage;
import ModiscoTGG.VariableDeclarationFragmentToTFieldDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.java.VariableDeclarationFragment;

import org.gravity.typegraph.basic.TFieldDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Fragment To TField Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.VariableDeclarationFragmentToTFieldDefinitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.impl.VariableDeclarationFragmentToTFieldDefinitionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationFragmentToTFieldDefinitionImpl extends EObjectImpl
		implements VariableDeclarationFragmentToTFieldDefinition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationFragment source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TFieldDefinition target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationFragmentToTFieldDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getVariableDeclarationFragmentToTFieldDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragment getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (VariableDeclarationFragment) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__SOURCE, oldSource,
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
	public VariableDeclarationFragment basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(VariableDeclarationFragment newSource) {
		VariableDeclarationFragment oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldDefinition getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TFieldDefinition) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__TARGET, oldTarget,
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
	public TFieldDefinition basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TFieldDefinition newTarget) {
		TFieldDefinition oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__TARGET:
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
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__SOURCE:
			setSource((VariableDeclarationFragment) newValue);
			return;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__TARGET:
			setTarget((TFieldDefinition) newValue);
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
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__SOURCE:
			setSource((VariableDeclarationFragment) null);
			return;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__TARGET:
			setTarget((TFieldDefinition) null);
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
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__SOURCE:
			return source != null;
		case ModiscoTGGPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclarationFragmentToTFieldDefinitionImpl
