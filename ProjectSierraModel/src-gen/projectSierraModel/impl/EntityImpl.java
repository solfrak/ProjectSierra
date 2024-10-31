/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import projectSierraModel.Entity;
import projectSierraModel.Function;
import projectSierraModel.PerformingElement;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.EntityImpl#getPerforms <em>Performs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends InvolveableElementImpl implements Entity {
	/**
	 * The cached value of the '{@link #getPerforms() <em>Performs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerforms()
	 * @generated
	 * @ordered
	 */
	protected Function performs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getPerforms() {
		if (performs != null && performs.eIsProxy()) {
			InternalEObject oldPerforms = (InternalEObject) performs;
			performs = (Function) eResolveProxy(oldPerforms);
			if (performs != oldPerforms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.ENTITY__PERFORMS, oldPerforms, performs));
			}
		}
		return performs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetPerforms() {
		return performs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerforms(Function newPerforms, NotificationChain msgs) {
		Function oldPerforms = performs;
		performs = newPerforms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.ENTITY__PERFORMS, oldPerforms, newPerforms);
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
	public void setPerforms(Function newPerforms) {
		if (newPerforms != performs) {
			NotificationChain msgs = null;
			if (performs != null)
				msgs = ((InternalEObject) performs).eInverseRemove(this,
						ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY, Function.class, msgs);
			if (newPerforms != null)
				msgs = ((InternalEObject) newPerforms).eInverseAdd(this,
						ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY, Function.class, msgs);
			msgs = basicSetPerforms(newPerforms, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.ENTITY__PERFORMS,
					newPerforms, newPerforms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.ENTITY__PERFORMS:
			if (performs != null)
				msgs = ((InternalEObject) performs).eInverseRemove(this,
						ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY, Function.class, msgs);
			return basicSetPerforms((Function) otherEnd, msgs);
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
		case ProjectSierraModelPackage.ENTITY__PERFORMS:
			return basicSetPerforms(null, msgs);
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
		case ProjectSierraModelPackage.ENTITY__PERFORMS:
			if (resolve)
				return getPerforms();
			return basicGetPerforms();
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
		case ProjectSierraModelPackage.ENTITY__PERFORMS:
			setPerforms((Function) newValue);
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
		case ProjectSierraModelPackage.ENTITY__PERFORMS:
			setPerforms((Function) null);
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
		case ProjectSierraModelPackage.ENTITY__PERFORMS:
			return performs != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PerformingElement.class) {
			switch (derivedFeatureID) {
			case ProjectSierraModelPackage.ENTITY__PERFORMS:
				return ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PerformingElement.class) {
			switch (baseFeatureID) {
			case ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS:
				return ProjectSierraModelPackage.ENTITY__PERFORMS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EntityImpl
