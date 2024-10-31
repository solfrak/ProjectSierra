/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projectSierraModel.Capabilitty;
import projectSierraModel.InvolveableElement;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Involveable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.InvolveableElementImpl#getIsInvolvedIn <em>Is Involved In</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InvolveableElementImpl extends SpecializableElementImpl implements InvolveableElement {
	/**
	 * The cached value of the '{@link #getIsInvolvedIn() <em>Is Involved In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInvolvedIn()
	 * @generated
	 * @ordered
	 */
	protected Capabilitty isInvolvedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvolveableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.INVOLVEABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilitty getIsInvolvedIn() {
		if (isInvolvedIn != null && isInvolvedIn.eIsProxy()) {
			InternalEObject oldIsInvolvedIn = (InternalEObject) isInvolvedIn;
			isInvolvedIn = (Capabilitty) eResolveProxy(oldIsInvolvedIn);
			if (isInvolvedIn != oldIsInvolvedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.INVOLVEABLE_ELEMENT__IS_INVOLVED_IN, oldIsInvolvedIn,
							isInvolvedIn));
			}
		}
		return isInvolvedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilitty basicGetIsInvolvedIn() {
		return isInvolvedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsInvolvedIn(Capabilitty newIsInvolvedIn, NotificationChain msgs) {
		Capabilitty oldIsInvolvedIn = isInvolvedIn;
		isInvolvedIn = newIsInvolvedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.INVOLVEABLE_ELEMENT__IS_INVOLVED_IN, oldIsInvolvedIn, newIsInvolvedIn);
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
	public void setIsInvolvedIn(Capabilitty newIsInvolvedIn) {
		if (newIsInvolvedIn != isInvolvedIn) {
			NotificationChain msgs = null;
			if (isInvolvedIn != null)
				msgs = ((InternalEObject) isInvolvedIn).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITTY__INVOLVES, Capabilitty.class, msgs);
			if (newIsInvolvedIn != null)
				msgs = ((InternalEObject) newIsInvolvedIn).eInverseAdd(this,
						ProjectSierraModelPackage.CAPABILITTY__INVOLVES, Capabilitty.class, msgs);
			msgs = basicSetIsInvolvedIn(newIsInvolvedIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.INVOLVEABLE_ELEMENT__IS_INVOLVED_IN, newIsInvolvedIn, newIsInvolvedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.INVOLVEABLE_ELEMENT__IS_INVOLVED_IN:
			if (isInvolvedIn != null)
				msgs = ((InternalEObject) isInvolvedIn).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITTY__INVOLVES, Capabilitty.class, msgs);
			return basicSetIsInvolvedIn((Capabilitty) otherEnd, msgs);
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
		case ProjectSierraModelPackage.INVOLVEABLE_ELEMENT__IS_INVOLVED_IN:
			return basicSetIsInvolvedIn(null, msgs);
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
		case ProjectSierraModelPackage.INVOLVEABLE_ELEMENT__IS_INVOLVED_IN:
			if (resolve)
				return getIsInvolvedIn();
			return basicGetIsInvolvedIn();
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
		case ProjectSierraModelPackage.INVOLVEABLE_ELEMENT__IS_INVOLVED_IN:
			setIsInvolvedIn((Capabilitty) newValue);
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
		case ProjectSierraModelPackage.INVOLVEABLE_ELEMENT__IS_INVOLVED_IN:
			setIsInvolvedIn((Capabilitty) null);
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
		case ProjectSierraModelPackage.INVOLVEABLE_ELEMENT__IS_INVOLVED_IN:
			return isInvolvedIn != null;
		}
		return super.eIsSet(featureID);
	}

} //InvolveableElementImpl
