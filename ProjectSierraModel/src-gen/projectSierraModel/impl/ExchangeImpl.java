/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import projectSierraModel.Exchange;
import projectSierraModel.ExchangeElement;
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
 *   <li>{@link projectSierraModel.impl.ExchangeImpl#getSendsTo <em>Sends To</em>}</li>
 *   <li>{@link projectSierraModel.impl.ExchangeImpl#getReceivesFrom <em>Receives From</em>}</li>
 *   <li>{@link projectSierraModel.impl.ExchangeImpl#getConveys <em>Conveys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeImpl extends ContainableElementImpl implements Exchange {
	/**
	 * The cached value of the '{@link #getSendsTo() <em>Sends To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsTo()
	 * @generated
	 * @ordered
	 */
	protected ExchangeElement sendsTo;

	/**
	 * The cached value of the '{@link #getReceivesFrom() <em>Receives From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivesFrom()
	 * @generated
	 * @ordered
	 */
	protected ExchangeElement receivesFrom;

	/**
	 * The cached value of the '{@link #getConveys() <em>Conveys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveys()
	 * @generated
	 * @ordered
	 */
	protected Item conveys;

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
	public ExchangeElement getSendsTo() {
		if (sendsTo != null && sendsTo.eIsProxy()) {
			InternalEObject oldSendsTo = (InternalEObject) sendsTo;
			sendsTo = (ExchangeElement) eResolveProxy(oldSendsTo);
			if (sendsTo != oldSendsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.EXCHANGE__SENDS_TO, oldSendsTo, sendsTo));
			}
		}
		return sendsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeElement basicGetSendsTo() {
		return sendsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendsTo(ExchangeElement newSendsTo) {
		ExchangeElement oldSendsTo = sendsTo;
		sendsTo = newSendsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.EXCHANGE__SENDS_TO,
					oldSendsTo, sendsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeElement getReceivesFrom() {
		if (receivesFrom != null && receivesFrom.eIsProxy()) {
			InternalEObject oldReceivesFrom = (InternalEObject) receivesFrom;
			receivesFrom = (ExchangeElement) eResolveProxy(oldReceivesFrom);
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
	public ExchangeElement basicGetReceivesFrom() {
		return receivesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivesFrom(ExchangeElement newReceivesFrom) {
		ExchangeElement oldReceivesFrom = receivesFrom;
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
	public Item getConveys() {
		return conveys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConveys(Item newConveys, NotificationChain msgs) {
		Item oldConveys = conveys;
		conveys = newConveys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.EXCHANGE__CONVEYS, oldConveys, newConveys);
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
	public void setConveys(Item newConveys) {
		if (newConveys != conveys) {
			NotificationChain msgs = null;
			if (conveys != null)
				msgs = ((InternalEObject) conveys).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ProjectSierraModelPackage.EXCHANGE__CONVEYS, null, msgs);
			if (newConveys != null)
				msgs = ((InternalEObject) newConveys).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ProjectSierraModelPackage.EXCHANGE__CONVEYS, null, msgs);
			msgs = basicSetConveys(newConveys, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.EXCHANGE__CONVEYS,
					newConveys, newConveys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.EXCHANGE__CONVEYS:
			return basicSetConveys(null, msgs);
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
		case ProjectSierraModelPackage.EXCHANGE__SENDS_TO:
			if (resolve)
				return getSendsTo();
			return basicGetSendsTo();
		case ProjectSierraModelPackage.EXCHANGE__RECEIVES_FROM:
			if (resolve)
				return getReceivesFrom();
			return basicGetReceivesFrom();
		case ProjectSierraModelPackage.EXCHANGE__CONVEYS:
			return getConveys();
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
		case ProjectSierraModelPackage.EXCHANGE__SENDS_TO:
			setSendsTo((ExchangeElement) newValue);
			return;
		case ProjectSierraModelPackage.EXCHANGE__RECEIVES_FROM:
			setReceivesFrom((ExchangeElement) newValue);
			return;
		case ProjectSierraModelPackage.EXCHANGE__CONVEYS:
			setConveys((Item) newValue);
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
		case ProjectSierraModelPackage.EXCHANGE__SENDS_TO:
			setSendsTo((ExchangeElement) null);
			return;
		case ProjectSierraModelPackage.EXCHANGE__RECEIVES_FROM:
			setReceivesFrom((ExchangeElement) null);
			return;
		case ProjectSierraModelPackage.EXCHANGE__CONVEYS:
			setConveys((Item) null);
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
		case ProjectSierraModelPackage.EXCHANGE__SENDS_TO:
			return sendsTo != null;
		case ProjectSierraModelPackage.EXCHANGE__RECEIVES_FROM:
			return receivesFrom != null;
		case ProjectSierraModelPackage.EXCHANGE__CONVEYS:
			return conveys != null;
		}
		return super.eIsSet(featureID);
	}

} //ExchangeImpl
