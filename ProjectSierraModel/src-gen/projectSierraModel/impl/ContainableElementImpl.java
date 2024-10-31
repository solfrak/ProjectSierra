/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projectSierraModel.ContainableElement;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Containable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.ContainableElementImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link projectSierraModel.impl.ContainableElementImpl#getIsContainedIn <em>Is Contained In</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainableElementImpl extends MinimalEObjectImpl.Container implements ContainableElement {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected ContainableElement contains;

	/**
	 * The cached value of the '{@link #getIsContainedIn() <em>Is Contained In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsContainedIn()
	 * @generated
	 * @ordered
	 */
	protected ContainableElement isContainedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.CONTAINABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainableElement getContains() {
		if (contains != null && contains.eIsProxy()) {
			InternalEObject oldContains = (InternalEObject) contains;
			contains = (ContainableElement) eResolveProxy(oldContains);
			if (contains != oldContains) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS, oldContains, contains));
			}
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainableElement basicGetContains() {
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContains(ContainableElement newContains, NotificationChain msgs) {
		ContainableElement oldContains = contains;
		contains = newContains;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS, oldContains, newContains);
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
	public void setContains(ContainableElement newContains) {
		if (newContains != contains) {
			NotificationChain msgs = null;
			if (contains != null)
				msgs = ((InternalEObject) contains).eInverseRemove(this,
						ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN, ContainableElement.class, msgs);
			if (newContains != null)
				msgs = ((InternalEObject) newContains).eInverseAdd(this,
						ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN, ContainableElement.class, msgs);
			msgs = basicSetContains(newContains, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS, newContains, newContains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainableElement getIsContainedIn() {
		if (isContainedIn != null && isContainedIn.eIsProxy()) {
			InternalEObject oldIsContainedIn = (InternalEObject) isContainedIn;
			isContainedIn = (ContainableElement) eResolveProxy(oldIsContainedIn);
			if (isContainedIn != oldIsContainedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN, oldIsContainedIn,
							isContainedIn));
			}
		}
		return isContainedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainableElement basicGetIsContainedIn() {
		return isContainedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsContainedIn(ContainableElement newIsContainedIn, NotificationChain msgs) {
		ContainableElement oldIsContainedIn = isContainedIn;
		isContainedIn = newIsContainedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN, oldIsContainedIn, newIsContainedIn);
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
	public void setIsContainedIn(ContainableElement newIsContainedIn) {
		if (newIsContainedIn != isContainedIn) {
			NotificationChain msgs = null;
			if (isContainedIn != null)
				msgs = ((InternalEObject) isContainedIn).eInverseRemove(this,
						ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS, ContainableElement.class, msgs);
			if (newIsContainedIn != null)
				msgs = ((InternalEObject) newIsContainedIn).eInverseAdd(this,
						ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS, ContainableElement.class, msgs);
			msgs = basicSetIsContainedIn(newIsContainedIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN, newIsContainedIn,
					newIsContainedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS:
			if (contains != null)
				msgs = ((InternalEObject) contains).eInverseRemove(this,
						ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN, ContainableElement.class, msgs);
			return basicSetContains((ContainableElement) otherEnd, msgs);
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN:
			if (isContainedIn != null)
				msgs = ((InternalEObject) isContainedIn).eInverseRemove(this,
						ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS, ContainableElement.class, msgs);
			return basicSetIsContainedIn((ContainableElement) otherEnd, msgs);
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
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS:
			return basicSetContains(null, msgs);
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN:
			return basicSetIsContainedIn(null, msgs);
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
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS:
			if (resolve)
				return getContains();
			return basicGetContains();
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN:
			if (resolve)
				return getIsContainedIn();
			return basicGetIsContainedIn();
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
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS:
			setContains((ContainableElement) newValue);
			return;
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN:
			setIsContainedIn((ContainableElement) newValue);
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
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS:
			setContains((ContainableElement) null);
			return;
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN:
			setIsContainedIn((ContainableElement) null);
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
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS:
			return contains != null;
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN:
			return isContainedIn != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainableElementImpl
