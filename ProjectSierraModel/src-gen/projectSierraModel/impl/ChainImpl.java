/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projectSierraModel.Capability;
import projectSierraModel.Chain;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.ChainImpl#getIsImplementedBy <em>Is Implemented By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChainImpl extends ContainableElementImpl implements Chain {
	/**
	 * The cached value of the '{@link #getIsImplementedBy() <em>Is Implemented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsImplementedBy()
	 * @generated
	 * @ordered
	 */
	protected Capability isImplementedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getIsImplementedBy() {
		if (isImplementedBy != null && isImplementedBy.eIsProxy()) {
			InternalEObject oldIsImplementedBy = (InternalEObject) isImplementedBy;
			isImplementedBy = (Capability) eResolveProxy(oldIsImplementedBy);
			if (isImplementedBy != oldIsImplementedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.CHAIN__IS_IMPLEMENTED_BY, oldIsImplementedBy, isImplementedBy));
			}
		}
		return isImplementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetIsImplementedBy() {
		return isImplementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsImplementedBy(Capability newIsImplementedBy, NotificationChain msgs) {
		Capability oldIsImplementedBy = isImplementedBy;
		isImplementedBy = newIsImplementedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CHAIN__IS_IMPLEMENTED_BY, oldIsImplementedBy, newIsImplementedBy);
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
	public void setIsImplementedBy(Capability newIsImplementedBy) {
		if (newIsImplementedBy != isImplementedBy) {
			NotificationChain msgs = null;
			if (isImplementedBy != null)
				msgs = ((InternalEObject) isImplementedBy).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITY__IMPLEMENTS, Capability.class, msgs);
			if (newIsImplementedBy != null)
				msgs = ((InternalEObject) newIsImplementedBy).eInverseAdd(this,
						ProjectSierraModelPackage.CAPABILITY__IMPLEMENTS, Capability.class, msgs);
			msgs = basicSetIsImplementedBy(newIsImplementedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.CHAIN__IS_IMPLEMENTED_BY,
					newIsImplementedBy, newIsImplementedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.CHAIN__IS_IMPLEMENTED_BY:
			if (isImplementedBy != null)
				msgs = ((InternalEObject) isImplementedBy).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITY__IMPLEMENTS, Capability.class, msgs);
			return basicSetIsImplementedBy((Capability) otherEnd, msgs);
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
		case ProjectSierraModelPackage.CHAIN__IS_IMPLEMENTED_BY:
			return basicSetIsImplementedBy(null, msgs);
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
		case ProjectSierraModelPackage.CHAIN__IS_IMPLEMENTED_BY:
			if (resolve)
				return getIsImplementedBy();
			return basicGetIsImplementedBy();
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
		case ProjectSierraModelPackage.CHAIN__IS_IMPLEMENTED_BY:
			setIsImplementedBy((Capability) newValue);
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
		case ProjectSierraModelPackage.CHAIN__IS_IMPLEMENTED_BY:
			setIsImplementedBy((Capability) null);
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
		case ProjectSierraModelPackage.CHAIN__IS_IMPLEMENTED_BY:
			return isImplementedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //ChainImpl
