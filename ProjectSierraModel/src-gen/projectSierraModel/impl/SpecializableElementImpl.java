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

import projectSierraModel.ProjectSierraModelPackage;
import projectSierraModel.SpecializableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specializable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.SpecializableElementImpl#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link projectSierraModel.impl.SpecializableElementImpl#getIsSpcecializedBy <em>Is Spcecialized By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpecializableElementImpl extends MinimalEObjectImpl.Container implements SpecializableElement {
	/**
	 * The cached value of the '{@link #getSpecializes() <em>Specializes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializes()
	 * @generated
	 * @ordered
	 */
	protected SpecializableElement specializes;

	/**
	 * The cached value of the '{@link #getIsSpcecializedBy() <em>Is Spcecialized By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpcecializedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecializableElement> isSpcecializedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.SPECIALIZABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializableElement getSpecializes() {
		if (specializes != null && specializes.eIsProxy()) {
			InternalEObject oldSpecializes = (InternalEObject) specializes;
			specializes = (SpecializableElement) eResolveProxy(oldSpecializes);
			if (specializes != oldSpecializes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES, oldSpecializes, specializes));
			}
		}
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializableElement basicGetSpecializes() {
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializes(SpecializableElement newSpecializes, NotificationChain msgs) {
		SpecializableElement oldSpecializes = specializes;
		specializes = newSpecializes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES, oldSpecializes, newSpecializes);
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
	public void setSpecializes(SpecializableElement newSpecializes) {
		if (newSpecializes != specializes) {
			NotificationChain msgs = null;
			if (specializes != null)
				msgs = ((InternalEObject) specializes).eInverseRemove(this,
						ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY, SpecializableElement.class,
						msgs);
			if (newSpecializes != null)
				msgs = ((InternalEObject) newSpecializes).eInverseAdd(this,
						ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY, SpecializableElement.class,
						msgs);
			msgs = basicSetSpecializes(newSpecializes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES, newSpecializes, newSpecializes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecializableElement> getIsSpcecializedBy() {
		if (isSpcecializedBy == null) {
			isSpcecializedBy = new EObjectWithInverseResolvingEList<SpecializableElement>(SpecializableElement.class,
					this, ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY,
					ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES);
		}
		return isSpcecializedBy;
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
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			if (specializes != null)
				msgs = ((InternalEObject) specializes).eInverseRemove(this,
						ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY, SpecializableElement.class,
						msgs);
			return basicSetSpecializes((SpecializableElement) otherEnd, msgs);
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsSpcecializedBy()).basicAdd(otherEnd, msgs);
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
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			return basicSetSpecializes(null, msgs);
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY:
			return ((InternalEList<?>) getIsSpcecializedBy()).basicRemove(otherEnd, msgs);
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
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			if (resolve)
				return getSpecializes();
			return basicGetSpecializes();
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY:
			return getIsSpcecializedBy();
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
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			setSpecializes((SpecializableElement) newValue);
			return;
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY:
			getIsSpcecializedBy().clear();
			getIsSpcecializedBy().addAll((Collection<? extends SpecializableElement>) newValue);
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
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			setSpecializes((SpecializableElement) null);
			return;
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY:
			getIsSpcecializedBy().clear();
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
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			return specializes != null;
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY:
			return isSpcecializedBy != null && !isSpcecializedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecializableElementImpl
