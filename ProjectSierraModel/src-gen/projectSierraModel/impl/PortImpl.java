/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projectSierraModel.Function;
import projectSierraModel.Port;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.PortImpl#getIsPortOf <em>Is Port Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends ExchangingElementImpl implements Port {
	/**
	 * The cached value of the '{@link #getIsPortOf() <em>Is Port Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPortOf()
	 * @generated
	 * @ordered
	 */
	protected Function isPortOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getIsPortOf() {
		if (isPortOf != null && isPortOf.eIsProxy()) {
			InternalEObject oldIsPortOf = (InternalEObject) isPortOf;
			isPortOf = (Function) eResolveProxy(oldIsPortOf);
			if (isPortOf != oldIsPortOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.PORT__IS_PORT_OF, oldIsPortOf, isPortOf));
			}
		}
		return isPortOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetIsPortOf() {
		return isPortOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPortOf(Function newIsPortOf, NotificationChain msgs) {
		Function oldIsPortOf = isPortOf;
		isPortOf = newIsPortOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.PORT__IS_PORT_OF, oldIsPortOf, newIsPortOf);
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
	public void setIsPortOf(Function newIsPortOf) {
		if (newIsPortOf != isPortOf) {
			NotificationChain msgs = null;
			if (isPortOf != null)
				msgs = ((InternalEObject) isPortOf).eInverseRemove(this, ProjectSierraModelPackage.FUNCTION__HAS_PORT,
						Function.class, msgs);
			if (newIsPortOf != null)
				msgs = ((InternalEObject) newIsPortOf).eInverseAdd(this, ProjectSierraModelPackage.FUNCTION__HAS_PORT,
						Function.class, msgs);
			msgs = basicSetIsPortOf(newIsPortOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.PORT__IS_PORT_OF,
					newIsPortOf, newIsPortOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.PORT__IS_PORT_OF:
			if (isPortOf != null)
				msgs = ((InternalEObject) isPortOf).eInverseRemove(this, ProjectSierraModelPackage.FUNCTION__HAS_PORT,
						Function.class, msgs);
			return basicSetIsPortOf((Function) otherEnd, msgs);
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
		case ProjectSierraModelPackage.PORT__IS_PORT_OF:
			return basicSetIsPortOf(null, msgs);
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
		case ProjectSierraModelPackage.PORT__IS_PORT_OF:
			if (resolve)
				return getIsPortOf();
			return basicGetIsPortOf();
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
		case ProjectSierraModelPackage.PORT__IS_PORT_OF:
			setIsPortOf((Function) newValue);
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
		case ProjectSierraModelPackage.PORT__IS_PORT_OF:
			setIsPortOf((Function) null);
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
		case ProjectSierraModelPackage.PORT__IS_PORT_OF:
			return isPortOf != null;
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
