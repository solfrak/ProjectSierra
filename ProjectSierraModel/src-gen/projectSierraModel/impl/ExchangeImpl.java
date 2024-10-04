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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projectSierraModel.Exchange;
import projectSierraModel.ExchangingElement;
import projectSierraModel.Item;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.ExchangeImpl#getReceivesFrom <em>Receives From</em>}</li>
 *   <li>{@link projectSierraModel.impl.ExchangeImpl#getIsConveyedBy <em>Is Conveyed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeImpl extends ContainableElementImpl implements Exchange {
	/**
	 * The cached value of the '{@link #getReceivesFrom() <em>Receives From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivesFrom()
	 * @generated
	 * @ordered
	 */
	protected ExchangingElement receivesFrom;

	/**
	 * The cached value of the '{@link #getIsConveyedBy() <em>Is Conveyed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConveyedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> isConveyedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangingElement getReceivesFrom() {
		if (receivesFrom != null && receivesFrom.eIsProxy()) {
			InternalEObject oldReceivesFrom = (InternalEObject) receivesFrom;
			receivesFrom = (ExchangingElement) eResolveProxy(oldReceivesFrom);
			if (receivesFrom != oldReceivesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.EXCHANGE__RECEIVES_FROM, oldReceivesFrom, receivesFrom));
			}
		}
		return receivesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangingElement basicGetReceivesFrom() {
		return receivesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivesFrom(ExchangingElement newReceivesFrom) {
		ExchangingElement oldReceivesFrom = receivesFrom;
		receivesFrom = newReceivesFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.EXCHANGE__RECEIVES_FROM,
					oldReceivesFrom, receivesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getIsConveyedBy() {
		if (isConveyedBy == null) {
			isConveyedBy = new EObjectWithInverseResolvingEList<Item>(Item.class, this,
					ProjectSierraModelPackage.EXCHANGE__IS_CONVEYED_BY, ProjectSierraModelPackage.ITEM__CONVEYS);
		}
		return isConveyedBy;
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
		case ProjectSierraModelPackage.EXCHANGE__IS_CONVEYED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsConveyedBy()).basicAdd(otherEnd, msgs);
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
		case ProjectSierraModelPackage.EXCHANGE__IS_CONVEYED_BY:
			return ((InternalEList<?>) getIsConveyedBy()).basicRemove(otherEnd, msgs);
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
		case ProjectSierraModelPackage.EXCHANGE__RECEIVES_FROM:
			if (resolve)
				return getReceivesFrom();
			return basicGetReceivesFrom();
		case ProjectSierraModelPackage.EXCHANGE__IS_CONVEYED_BY:
			return getIsConveyedBy();
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
		case ProjectSierraModelPackage.EXCHANGE__RECEIVES_FROM:
			setReceivesFrom((ExchangingElement) newValue);
			return;
		case ProjectSierraModelPackage.EXCHANGE__IS_CONVEYED_BY:
			getIsConveyedBy().clear();
			getIsConveyedBy().addAll((Collection<? extends Item>) newValue);
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
		case ProjectSierraModelPackage.EXCHANGE__RECEIVES_FROM:
			setReceivesFrom((ExchangingElement) null);
			return;
		case ProjectSierraModelPackage.EXCHANGE__IS_CONVEYED_BY:
			getIsConveyedBy().clear();
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
		case ProjectSierraModelPackage.EXCHANGE__RECEIVES_FROM:
			return receivesFrom != null;
		case ProjectSierraModelPackage.EXCHANGE__IS_CONVEYED_BY:
			return isConveyedBy != null && !isConveyedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExchangeImpl
