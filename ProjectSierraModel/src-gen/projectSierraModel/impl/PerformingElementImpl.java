/**
 */
package projectSierraModel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import projectSierraModel.ExchangeElement;
import projectSierraModel.Function;
import projectSierraModel.PerformingElement;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performing Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.PerformingElementImpl#getPerforms <em>Performs</em>}</li>
 *   <li>{@link projectSierraModel.impl.PerformingElementImpl#getExchangeElements <em>Exchange Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PerformingElementImpl extends MinimalEObjectImpl.Container implements PerformingElement {
	/**
	 * The cached value of the '{@link #getPerforms() <em>Performs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> performs;

	/**
	 * The cached value of the '{@link #getExchangeElements() <em>Exchange Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeElement> exchangeElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.PERFORMING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getPerforms() {
		if (performs == null) {
			performs = new EObjectWithInverseResolvingEList<Function>(Function.class, this,
					ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS,
					ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY);
		}
		return performs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeElement> getExchangeElements() {
		if (exchangeElements == null) {
			exchangeElements = new EObjectContainmentEList<ExchangeElement>(ExchangeElement.class, this,
					ProjectSierraModelPackage.PERFORMING_ELEMENT__EXCHANGE_ELEMENTS);
		}
		return exchangeElements;
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
		case ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPerforms()).basicAdd(otherEnd, msgs);
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
		case ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS:
			return ((InternalEList<?>) getPerforms()).basicRemove(otherEnd, msgs);
		case ProjectSierraModelPackage.PERFORMING_ELEMENT__EXCHANGE_ELEMENTS:
			return ((InternalEList<?>) getExchangeElements()).basicRemove(otherEnd, msgs);
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
		case ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS:
			return getPerforms();
		case ProjectSierraModelPackage.PERFORMING_ELEMENT__EXCHANGE_ELEMENTS:
			return getExchangeElements();
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
		case ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS:
			getPerforms().clear();
			getPerforms().addAll((Collection<? extends Function>) newValue);
			return;
		case ProjectSierraModelPackage.PERFORMING_ELEMENT__EXCHANGE_ELEMENTS:
			getExchangeElements().clear();
			getExchangeElements().addAll((Collection<? extends ExchangeElement>) newValue);
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
		case ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS:
			getPerforms().clear();
			return;
		case ProjectSierraModelPackage.PERFORMING_ELEMENT__EXCHANGE_ELEMENTS:
			getExchangeElements().clear();
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
		case ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS:
			return performs != null && !performs.isEmpty();
		case ProjectSierraModelPackage.PERFORMING_ELEMENT__EXCHANGE_ELEMENTS:
			return exchangeElements != null && !exchangeElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PerformingElementImpl
