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
 *   <li>{@link projectSierraModel.impl.ContainableElementImpl#getContainedIn <em>Contained In</em>}</li>
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
	 * The cached value of the '{@link #getContainedIn() <em>Contained In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedIn()
	 * @generated
	 * @ordered
	 */
	protected ContainableElement containedIn;

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
						ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINED_IN, ContainableElement.class, msgs);
			if (newContains != null)
				msgs = ((InternalEObject) newContains).eInverseAdd(this,
						ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINED_IN, ContainableElement.class, msgs);
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
	public ContainableElement getContainedIn() {
		if (containedIn != null && containedIn.eIsProxy()) {
			InternalEObject oldContainedIn = (InternalEObject) containedIn;
			containedIn = (ContainableElement) eResolveProxy(oldContainedIn);
			if (containedIn != oldContainedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINED_IN, oldContainedIn, containedIn));
			}
		}
		return containedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainableElement basicGetContainedIn() {
		return containedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedIn(ContainableElement newContainedIn, NotificationChain msgs) {
		ContainableElement oldContainedIn = containedIn;
		containedIn = newContainedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINED_IN, oldContainedIn, newContainedIn);
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
	public void setContainedIn(ContainableElement newContainedIn) {
		if (newContainedIn != containedIn) {
			NotificationChain msgs = null;
			if (containedIn != null)
				msgs = ((InternalEObject) containedIn).eInverseRemove(this,
						ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS, ContainableElement.class, msgs);
			if (newContainedIn != null)
				msgs = ((InternalEObject) newContainedIn).eInverseAdd(this,
						ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS, ContainableElement.class, msgs);
			msgs = basicSetContainedIn(newContainedIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINED_IN, newContainedIn, newContainedIn));
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
						ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINED_IN, ContainableElement.class, msgs);
			return basicSetContains((ContainableElement) otherEnd, msgs);
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINED_IN:
			if (containedIn != null)
				msgs = ((InternalEObject) containedIn).eInverseRemove(this,
						ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS, ContainableElement.class, msgs);
			return basicSetContainedIn((ContainableElement) otherEnd, msgs);
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
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINED_IN:
			return basicSetContainedIn(null, msgs);
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
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINED_IN:
			if (resolve)
				return getContainedIn();
			return basicGetContainedIn();
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
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINED_IN:
			setContainedIn((ContainableElement) newValue);
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
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINED_IN:
			setContainedIn((ContainableElement) null);
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
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINED_IN:
			return containedIn != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainableElementImpl
