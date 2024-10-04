/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projectSierraModel.Capability;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.SystemImpl#getSupport <em>Support</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ComponentImpl implements projectSierraModel.System {
	/**
	 * The cached value of the '{@link #getSupport() <em>Support</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupport()
	 * @generated
	 * @ordered
	 */
	protected Capability support;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getSupport() {
		if (support != null && support.eIsProxy()) {
			InternalEObject oldSupport = (InternalEObject) support;
			support = (Capability) eResolveProxy(oldSupport);
			if (support != oldSupport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectSierraModelPackage.SYSTEM__SUPPORT,
							oldSupport, support));
			}
		}
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetSupport() {
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupport(Capability newSupport, NotificationChain msgs) {
		Capability oldSupport = support;
		support = newSupport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.SYSTEM__SUPPORT, oldSupport, newSupport);
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
	public void setSupport(Capability newSupport) {
		if (newSupport != support) {
			NotificationChain msgs = null;
			if (support != null)
				msgs = ((InternalEObject) support).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITY__IS_SUPPORTED_BY, Capability.class, msgs);
			if (newSupport != null)
				msgs = ((InternalEObject) newSupport).eInverseAdd(this,
						ProjectSierraModelPackage.CAPABILITY__IS_SUPPORTED_BY, Capability.class, msgs);
			msgs = basicSetSupport(newSupport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.SYSTEM__SUPPORT, newSupport,
					newSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.SYSTEM__SUPPORT:
			if (support != null)
				msgs = ((InternalEObject) support).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITY__IS_SUPPORTED_BY, Capability.class, msgs);
			return basicSetSupport((Capability) otherEnd, msgs);
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
		case ProjectSierraModelPackage.SYSTEM__SUPPORT:
			return basicSetSupport(null, msgs);
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
		case ProjectSierraModelPackage.SYSTEM__SUPPORT:
			if (resolve)
				return getSupport();
			return basicGetSupport();
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
		case ProjectSierraModelPackage.SYSTEM__SUPPORT:
			setSupport((Capability) newValue);
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
		case ProjectSierraModelPackage.SYSTEM__SUPPORT:
			setSupport((Capability) null);
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
		case ProjectSierraModelPackage.SYSTEM__SUPPORT:
			return support != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
