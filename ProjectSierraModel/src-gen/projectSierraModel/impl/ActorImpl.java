/**
 */
package projectSierraModel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import projectSierraModel.Actor;
import projectSierraModel.ExchangeElement;
import projectSierraModel.Function;
import projectSierraModel.PerformingElement;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.ActorImpl#getPerforms <em>Performs</em>}</li>
 *   <li>{@link projectSierraModel.impl.ActorImpl#getExchangeElements <em>Exchange Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends InvolveableElementImpl implements Actor {
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
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getPerforms() {
		if (performs == null) {
			performs = new EObjectWithInverseResolvingEList<Function>(Function.class, this,
					ProjectSierraModelPackage.ACTOR__PERFORMS, ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY);
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
					ProjectSierraModelPackage.ACTOR__EXCHANGE_ELEMENTS);
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
		case ProjectSierraModelPackage.ACTOR__PERFORMS:
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
		case ProjectSierraModelPackage.ACTOR__PERFORMS:
			return ((InternalEList<?>) getPerforms()).basicRemove(otherEnd, msgs);
		case ProjectSierraModelPackage.ACTOR__EXCHANGE_ELEMENTS:
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
		case ProjectSierraModelPackage.ACTOR__PERFORMS:
			return getPerforms();
		case ProjectSierraModelPackage.ACTOR__EXCHANGE_ELEMENTS:
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
		case ProjectSierraModelPackage.ACTOR__PERFORMS:
			getPerforms().clear();
			getPerforms().addAll((Collection<? extends Function>) newValue);
			return;
		case ProjectSierraModelPackage.ACTOR__EXCHANGE_ELEMENTS:
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
		case ProjectSierraModelPackage.ACTOR__PERFORMS:
			getPerforms().clear();
			return;
		case ProjectSierraModelPackage.ACTOR__EXCHANGE_ELEMENTS:
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
		case ProjectSierraModelPackage.ACTOR__PERFORMS:
			return performs != null && !performs.isEmpty();
		case ProjectSierraModelPackage.ACTOR__EXCHANGE_ELEMENTS:
			return exchangeElements != null && !exchangeElements.isEmpty();
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
			case ProjectSierraModelPackage.ACTOR__PERFORMS:
				return ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS;
			case ProjectSierraModelPackage.ACTOR__EXCHANGE_ELEMENTS:
				return ProjectSierraModelPackage.PERFORMING_ELEMENT__EXCHANGE_ELEMENTS;
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
				return ProjectSierraModelPackage.ACTOR__PERFORMS;
			case ProjectSierraModelPackage.PERFORMING_ELEMENT__EXCHANGE_ELEMENTS:
				return ProjectSierraModelPackage.ACTOR__EXCHANGE_ELEMENTS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActorImpl
