/**
 */
package projectSierraModel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
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
 *   <li>{@link projectSierraModel.impl.ContainableElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainableElementImpl extends MinimalEObjectImpl.Container implements ContainableElement {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainableElement> contains;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	public EList<ContainableElement> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList<ContainableElement>(ContainableElement.class, this,
					ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS,
					ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN);
		}
		return contains;
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.CONTAINABLE_ELEMENT__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContains()).basicAdd(otherEnd, msgs);
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
			return ((InternalEList<?>) getContains()).basicRemove(otherEnd, msgs);
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
			return getContains();
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN:
			if (resolve)
				return getIsContainedIn();
			return basicGetIsContainedIn();
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__CONTAINS:
			getContains().clear();
			getContains().addAll((Collection<? extends ContainableElement>) newValue);
			return;
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN:
			setIsContainedIn((ContainableElement) newValue);
			return;
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__NAME:
			setName((String) newValue);
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
			getContains().clear();
			return;
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN:
			setIsContainedIn((ContainableElement) null);
			return;
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
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
			return contains != null && !contains.isEmpty();
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__IS_CONTAINED_IN:
			return isContainedIn != null;
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ContainableElementImpl
