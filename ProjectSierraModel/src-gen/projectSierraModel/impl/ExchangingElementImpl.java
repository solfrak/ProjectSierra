/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projectSierraModel.Exchange;
import projectSierraModel.ExchangingElement;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchanging Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.ExchangingElementImpl#getSendsTo <em>Sends To</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExchangingElementImpl extends MinimalEObjectImpl.Container implements ExchangingElement {
	/**
	 * The cached value of the '{@link #getSendsTo() <em>Sends To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsTo()
	 * @generated
	 * @ordered
	 */
	protected Exchange sendsTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.EXCHANGING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exchange getSendsTo() {
		if (sendsTo != null && sendsTo.eIsProxy()) {
			InternalEObject oldSendsTo = (InternalEObject) sendsTo;
			sendsTo = (Exchange) eResolveProxy(oldSendsTo);
			if (sendsTo != oldSendsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.EXCHANGING_ELEMENT__SENDS_TO, oldSendsTo, sendsTo));
			}
		}
		return sendsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exchange basicGetSendsTo() {
		return sendsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendsTo(Exchange newSendsTo) {
		Exchange oldSendsTo = sendsTo;
		sendsTo = newSendsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.EXCHANGING_ELEMENT__SENDS_TO, oldSendsTo, sendsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjectSierraModelPackage.EXCHANGING_ELEMENT__SENDS_TO:
			if (resolve)
				return getSendsTo();
			return basicGetSendsTo();
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
		case ProjectSierraModelPackage.EXCHANGING_ELEMENT__SENDS_TO:
			setSendsTo((Exchange) newValue);
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
		case ProjectSierraModelPackage.EXCHANGING_ELEMENT__SENDS_TO:
			setSendsTo((Exchange) null);
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
		case ProjectSierraModelPackage.EXCHANGING_ELEMENT__SENDS_TO:
			return sendsTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ExchangingElementImpl
