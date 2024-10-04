/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projectSierraModel.DesignElement;
import projectSierraModel.ProjectSierraModelPackage;
import projectSierraModel.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.DesignElementImpl#getIsSpecifiedBy <em>Is Specified By</em>}</li>
 *   <li>{@link projectSierraModel.impl.DesignElementImpl#getIsJustifiedBy <em>Is Justified By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DesignElementImpl extends MinimalEObjectImpl.Container implements DesignElement {
	/**
	 * The cached value of the '{@link #getIsSpecifiedBy() <em>Is Specified By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpecifiedBy()
	 * @generated
	 * @ordered
	 */
	protected Requirement isSpecifiedBy;

	/**
	 * The cached value of the '{@link #getIsJustifiedBy() <em>Is Justified By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsJustifiedBy()
	 * @generated
	 * @ordered
	 */
	protected Requirement isJustifiedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.DESIGN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getIsSpecifiedBy() {
		if (isSpecifiedBy != null && isSpecifiedBy.eIsProxy()) {
			InternalEObject oldIsSpecifiedBy = (InternalEObject) isSpecifiedBy;
			isSpecifiedBy = (Requirement) eResolveProxy(oldIsSpecifiedBy);
			if (isSpecifiedBy != oldIsSpecifiedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.DESIGN_ELEMENT__IS_SPECIFIED_BY, oldIsSpecifiedBy,
							isSpecifiedBy));
			}
		}
		return isSpecifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetIsSpecifiedBy() {
		return isSpecifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSpecifiedBy(Requirement newIsSpecifiedBy, NotificationChain msgs) {
		Requirement oldIsSpecifiedBy = isSpecifiedBy;
		isSpecifiedBy = newIsSpecifiedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.DESIGN_ELEMENT__IS_SPECIFIED_BY, oldIsSpecifiedBy, newIsSpecifiedBy);
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
	public void setIsSpecifiedBy(Requirement newIsSpecifiedBy) {
		if (newIsSpecifiedBy != isSpecifiedBy) {
			NotificationChain msgs = null;
			if (isSpecifiedBy != null)
				msgs = ((InternalEObject) isSpecifiedBy).eInverseRemove(this,
						ProjectSierraModelPackage.REQUIREMENT__SPECIFIES, Requirement.class, msgs);
			if (newIsSpecifiedBy != null)
				msgs = ((InternalEObject) newIsSpecifiedBy).eInverseAdd(this,
						ProjectSierraModelPackage.REQUIREMENT__SPECIFIES, Requirement.class, msgs);
			msgs = basicSetIsSpecifiedBy(newIsSpecifiedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.DESIGN_ELEMENT__IS_SPECIFIED_BY, newIsSpecifiedBy, newIsSpecifiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getIsJustifiedBy() {
		if (isJustifiedBy != null && isJustifiedBy.eIsProxy()) {
			InternalEObject oldIsJustifiedBy = (InternalEObject) isJustifiedBy;
			isJustifiedBy = (Requirement) eResolveProxy(oldIsJustifiedBy);
			if (isJustifiedBy != oldIsJustifiedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.DESIGN_ELEMENT__IS_JUSTIFIED_BY, oldIsJustifiedBy,
							isJustifiedBy));
			}
		}
		return isJustifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetIsJustifiedBy() {
		return isJustifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsJustifiedBy(Requirement newIsJustifiedBy, NotificationChain msgs) {
		Requirement oldIsJustifiedBy = isJustifiedBy;
		isJustifiedBy = newIsJustifiedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.DESIGN_ELEMENT__IS_JUSTIFIED_BY, oldIsJustifiedBy, newIsJustifiedBy);
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
	public void setIsJustifiedBy(Requirement newIsJustifiedBy) {
		if (newIsJustifiedBy != isJustifiedBy) {
			NotificationChain msgs = null;
			if (isJustifiedBy != null)
				msgs = ((InternalEObject) isJustifiedBy).eInverseRemove(this,
						ProjectSierraModelPackage.REQUIREMENT__JUSTIFIES, Requirement.class, msgs);
			if (newIsJustifiedBy != null)
				msgs = ((InternalEObject) newIsJustifiedBy).eInverseAdd(this,
						ProjectSierraModelPackage.REQUIREMENT__JUSTIFIES, Requirement.class, msgs);
			msgs = basicSetIsJustifiedBy(newIsJustifiedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.DESIGN_ELEMENT__IS_JUSTIFIED_BY, newIsJustifiedBy, newIsJustifiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.DESIGN_ELEMENT__IS_SPECIFIED_BY:
			if (isSpecifiedBy != null)
				msgs = ((InternalEObject) isSpecifiedBy).eInverseRemove(this,
						ProjectSierraModelPackage.REQUIREMENT__SPECIFIES, Requirement.class, msgs);
			return basicSetIsSpecifiedBy((Requirement) otherEnd, msgs);
		case ProjectSierraModelPackage.DESIGN_ELEMENT__IS_JUSTIFIED_BY:
			if (isJustifiedBy != null)
				msgs = ((InternalEObject) isJustifiedBy).eInverseRemove(this,
						ProjectSierraModelPackage.REQUIREMENT__JUSTIFIES, Requirement.class, msgs);
			return basicSetIsJustifiedBy((Requirement) otherEnd, msgs);
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
		case ProjectSierraModelPackage.DESIGN_ELEMENT__IS_SPECIFIED_BY:
			return basicSetIsSpecifiedBy(null, msgs);
		case ProjectSierraModelPackage.DESIGN_ELEMENT__IS_JUSTIFIED_BY:
			return basicSetIsJustifiedBy(null, msgs);
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
		case ProjectSierraModelPackage.DESIGN_ELEMENT__IS_SPECIFIED_BY:
			if (resolve)
				return getIsSpecifiedBy();
			return basicGetIsSpecifiedBy();
		case ProjectSierraModelPackage.DESIGN_ELEMENT__IS_JUSTIFIED_BY:
			if (resolve)
				return getIsJustifiedBy();
			return basicGetIsJustifiedBy();
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
		case ProjectSierraModelPackage.DESIGN_ELEMENT__IS_SPECIFIED_BY:
			setIsSpecifiedBy((Requirement) newValue);
			return;
		case ProjectSierraModelPackage.DESIGN_ELEMENT__IS_JUSTIFIED_BY:
			setIsJustifiedBy((Requirement) newValue);
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
		case ProjectSierraModelPackage.DESIGN_ELEMENT__IS_SPECIFIED_BY:
			setIsSpecifiedBy((Requirement) null);
			return;
		case ProjectSierraModelPackage.DESIGN_ELEMENT__IS_JUSTIFIED_BY:
			setIsJustifiedBy((Requirement) null);
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
		case ProjectSierraModelPackage.DESIGN_ELEMENT__IS_SPECIFIED_BY:
			return isSpecifiedBy != null;
		case ProjectSierraModelPackage.DESIGN_ELEMENT__IS_JUSTIFIED_BY:
			return isJustifiedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //DesignElementImpl
