/**
 */
package ModiscoTGG.impl;

import ModiscoTGG.AnnotationMemberValuePairToTAnnotationValue;
import ModiscoTGG.ModiscoTGGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.java.AnnotationMemberValuePair;

import org.gravity.typegraph.basic.annotations.TAnnotationValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Member Value Pair To TAnnotation Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValuePairToTAnnotationValueImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ModiscoTGG.impl.AnnotationMemberValuePairToTAnnotationValueImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationMemberValuePairToTAnnotationValueImpl extends EObjectImpl
		implements AnnotationMemberValuePairToTAnnotationValue {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected AnnotationMemberValuePair source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TAnnotationValue target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberValuePairToTAnnotationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoTGGPackage.eINSTANCE.getAnnotationMemberValuePairToTAnnotationValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePair getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (AnnotationMemberValuePair) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__SOURCE, oldSource,
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
	public AnnotationMemberValuePair basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(AnnotationMemberValuePair newSource) {
		AnnotationMemberValuePair oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAnnotationValue getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TAnnotationValue) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__TARGET, oldTarget,
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
	public TAnnotationValue basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TAnnotationValue newTarget) {
		TAnnotationValue oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__TARGET:
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__SOURCE:
			setSource((AnnotationMemberValuePair) newValue);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__TARGET:
			setTarget((TAnnotationValue) newValue);
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__SOURCE:
			setSource((AnnotationMemberValuePair) null);
			return;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__TARGET:
			setTarget((TAnnotationValue) null);
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
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__SOURCE:
			return source != null;
		case ModiscoTGGPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationMemberValuePairToTAnnotationValueImpl
