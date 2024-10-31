/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projectSierraModel.Function;
import projectSierraModel.Ouput;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ouput</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.OuputImpl#getIsOuputOf <em>Is Ouput Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OuputImpl extends PortImpl implements Ouput {
	/**
	 * The cached value of the '{@link #getIsOuputOf() <em>Is Ouput Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOuputOf()
	 * @generated
	 * @ordered
	 */
	protected Function isOuputOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OuputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.OUPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getIsOuputOf() {
		if (isOuputOf != null && isOuputOf.eIsProxy()) {
			InternalEObject oldIsOuputOf = (InternalEObject) isOuputOf;
			isOuputOf = (Function) eResolveProxy(oldIsOuputOf);
			if (isOuputOf != oldIsOuputOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.OUPUT__IS_OUPUT_OF, oldIsOuputOf, isOuputOf));
			}
		}
		return isOuputOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetIsOuputOf() {
		return isOuputOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsOuputOf(Function newIsOuputOf, NotificationChain msgs) {
		Function oldIsOuputOf = isOuputOf;
		isOuputOf = newIsOuputOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.OUPUT__IS_OUPUT_OF, oldIsOuputOf, newIsOuputOf);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOuputOf(Function newIsOuputOf) {
		if (newIsOuputOf != isOuputOf) {
			NotificationChain msgs = null;
			if (isOuputOf != null)
				msgs = ((InternalEObject) isOuputOf).eInverseRemove(this, ProjectSierraModelPackage.FUNCTION__HAS_OUPUT,
						Function.class, msgs);
			if (newIsOuputOf != null)
				msgs = ((InternalEObject) newIsOuputOf).eInverseAdd(this, ProjectSierraModelPackage.FUNCTION__HAS_OUPUT,
						Function.class, msgs);
			msgs = basicSetIsOuputOf(newIsOuputOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.OUPUT__IS_OUPUT_OF,
					newIsOuputOf, newIsOuputOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.OUPUT__IS_OUPUT_OF:
			if (isOuputOf != null)
				msgs = ((InternalEObject) isOuputOf).eInverseRemove(this, ProjectSierraModelPackage.FUNCTION__HAS_OUPUT,
						Function.class, msgs);
			return basicSetIsOuputOf((Function) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.OUPUT__IS_OUPUT_OF:
			return basicSetIsOuputOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjectSierraModelPackage.OUPUT__IS_OUPUT_OF:
			if (resolve)
				return getIsOuputOf();
			return basicGetIsOuputOf();
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
		case ProjectSierraModelPackage.OUPUT__IS_OUPUT_OF:
			setIsOuputOf((Function) newValue);
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
		case ProjectSierraModelPackage.OUPUT__IS_OUPUT_OF:
			setIsOuputOf((Function) null);
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
		case ProjectSierraModelPackage.OUPUT__IS_OUPUT_OF:
			return isOuputOf != null;
		}
		return super.eIsSet(featureID);
	}

} //OuputImpl
