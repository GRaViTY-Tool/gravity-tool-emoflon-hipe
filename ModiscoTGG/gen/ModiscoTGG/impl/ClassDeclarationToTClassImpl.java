/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.ClassDeclarationToTClass;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.java.ClassDeclaration;

import org.gravity.typegraph.basic.TClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Declaration To TClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.ClassDeclarationToTClassImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.impl.ClassDeclarationToTClassImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDeclarationToTClassImpl extends EObjectImpl implements ClassDeclarationToTClass {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclaration source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TClass target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDeclarationToTClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getClassDeclarationToTClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclaration getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ClassDeclaration) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ClassDeclaration newSource) {
		ClassDeclaration oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClass getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TClass) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TClass newTarget) {
		TClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS__TARGET,
					oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS__TARGET:
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
		case ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS__SOURCE:
			setSource((ClassDeclaration) newValue);
			return;
		case ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS__TARGET:
			setTarget((TClass) newValue);
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
		case ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS__SOURCE:
			setSource((ClassDeclaration) null);
			return;
		case ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS__TARGET:
			setTarget((TClass) null);
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
		case ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS__SOURCE:
			return source != null;
		case ModiscoTGGPackage.CLASS_DECLARATION_TO_TCLASS__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassDeclarationToTClassImpl
