/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projectSierraModel.Exchange;
import projectSierraModel.Item;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.ItemImpl#getConveys <em>Conveys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The cached value of the '{@link #getConveys() <em>Conveys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveys()
	 * @generated
	 * @ordered
	 */
	protected Exchange conveys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exchange getConveys() {
		if (conveys != null && conveys.eIsProxy()) {
			InternalEObject oldConveys = (InternalEObject) conveys;
			conveys = (Exchange) eResolveProxy(oldConveys);
			if (conveys != oldConveys) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectSierraModelPackage.ITEM__CONVEYS,
							oldConveys, conveys));
			}
		}
		return conveys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exchange basicGetConveys() {
		return conveys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConveys(Exchange newConveys, NotificationChain msgs) {
		Exchange oldConveys = conveys;
		conveys = newConveys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.ITEM__CONVEYS, oldConveys, newConveys);
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
	public void setConveys(Exchange newConveys) {
		if (newConveys != conveys) {
			NotificationChain msgs = null;
			if (conveys != null)
				msgs = ((InternalEObject) conveys).eInverseRemove(this,
						ProjectSierraModelPackage.EXCHANGE__IS_CONVEYED_BY, Exchange.class, msgs);
			if (newConveys != null)
				msgs = ((InternalEObject) newConveys).eInverseAdd(this,
						ProjectSierraModelPackage.EXCHANGE__IS_CONVEYED_BY, Exchange.class, msgs);
			msgs = basicSetConveys(newConveys, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.ITEM__CONVEYS, newConveys,
					newConveys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.ITEM__CONVEYS:
			if (conveys != null)
				msgs = ((InternalEObject) conveys).eInverseRemove(this,
						ProjectSierraModelPackage.EXCHANGE__IS_CONVEYED_BY, Exchange.class, msgs);
			return basicSetConveys((Exchange) otherEnd, msgs);
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
		case ProjectSierraModelPackage.ITEM__CONVEYS:
			return basicSetConveys(null, msgs);
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
		case ProjectSierraModelPackage.ITEM__CONVEYS:
			if (resolve)
				return getConveys();
			return basicGetConveys();
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
		case ProjectSierraModelPackage.ITEM__CONVEYS:
			setConveys((Exchange) newValue);
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
		case ProjectSierraModelPackage.ITEM__CONVEYS:
			setConveys((Exchange) null);
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
		case ProjectSierraModelPackage.ITEM__CONVEYS:
			return conveys != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemImpl
