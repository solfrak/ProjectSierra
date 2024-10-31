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
import org.eclipse.emf.ecore.util.InternalEList;

import projectSierraModel.ActivityDiagram;
import projectSierraModel.ContainableElement;
import projectSierraModel.ExchangeElement;
import projectSierraModel.PerformingElement;
import projectSierraModel.ProjectSierraModelPackage;
import projectSierraModel.SpecializableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.ActivityDiagramImpl#getContainableElements <em>Containable Elements</em>}</li>
 *   <li>{@link projectSierraModel.impl.ActivityDiagramImpl#getSpecializableElements <em>Specializable Elements</em>}</li>
 *   <li>{@link projectSierraModel.impl.ActivityDiagramImpl#getExchangeElements <em>Exchange Elements</em>}</li>
 *   <li>{@link projectSierraModel.impl.ActivityDiagramImpl#getPerformingElements <em>Performing Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDiagramImpl extends MinimalEObjectImpl.Container implements ActivityDiagram {
	/**
	 * The cached value of the '{@link #getContainableElements() <em>Containable Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainableElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainableElement> containableElements;

	/**
	 * The cached value of the '{@link #getSpecializableElements() <em>Specializable Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializableElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecializableElement> specializableElements;

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
	 * The cached value of the '{@link #getPerformingElements() <em>Performing Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformingElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformingElement> performingElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.ACTIVITY_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainableElement> getContainableElements() {
		if (containableElements == null) {
			containableElements = new EObjectContainmentEList<ContainableElement>(ContainableElement.class, this,
					ProjectSierraModelPackage.ACTIVITY_DIAGRAM__CONTAINABLE_ELEMENTS);
		}
		return containableElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecializableElement> getSpecializableElements() {
		if (specializableElements == null) {
			specializableElements = new EObjectContainmentEList<SpecializableElement>(SpecializableElement.class, this,
					ProjectSierraModelPackage.ACTIVITY_DIAGRAM__SPECIALIZABLE_ELEMENTS);
		}
		return specializableElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeElement> getExchangeElements() {
		if (exchangeElements == null) {
			exchangeElements = new EObjectContainmentEList<ExchangeElement>(ExchangeElement.class, this,
					ProjectSierraModelPackage.ACTIVITY_DIAGRAM__EXCHANGE_ELEMENTS);
		}
		return exchangeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerformingElement> getPerformingElements() {
		if (performingElements == null) {
			performingElements = new EObjectContainmentEList<PerformingElement>(PerformingElement.class, this,
					ProjectSierraModelPackage.ACTIVITY_DIAGRAM__PERFORMING_ELEMENTS);
		}
		return performingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__CONTAINABLE_ELEMENTS:
			return ((InternalEList<?>) getContainableElements()).basicRemove(otherEnd, msgs);
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__SPECIALIZABLE_ELEMENTS:
			return ((InternalEList<?>) getSpecializableElements()).basicRemove(otherEnd, msgs);
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__EXCHANGE_ELEMENTS:
			return ((InternalEList<?>) getExchangeElements()).basicRemove(otherEnd, msgs);
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__PERFORMING_ELEMENTS:
			return ((InternalEList<?>) getPerformingElements()).basicRemove(otherEnd, msgs);
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
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__CONTAINABLE_ELEMENTS:
			return getContainableElements();
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__SPECIALIZABLE_ELEMENTS:
			return getSpecializableElements();
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__EXCHANGE_ELEMENTS:
			return getExchangeElements();
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__PERFORMING_ELEMENTS:
			return getPerformingElements();
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
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__CONTAINABLE_ELEMENTS:
			getContainableElements().clear();
			getContainableElements().addAll((Collection<? extends ContainableElement>) newValue);
			return;
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__SPECIALIZABLE_ELEMENTS:
			getSpecializableElements().clear();
			getSpecializableElements().addAll((Collection<? extends SpecializableElement>) newValue);
			return;
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__EXCHANGE_ELEMENTS:
			getExchangeElements().clear();
			getExchangeElements().addAll((Collection<? extends ExchangeElement>) newValue);
			return;
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__PERFORMING_ELEMENTS:
			getPerformingElements().clear();
			getPerformingElements().addAll((Collection<? extends PerformingElement>) newValue);
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
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__CONTAINABLE_ELEMENTS:
			getContainableElements().clear();
			return;
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__SPECIALIZABLE_ELEMENTS:
			getSpecializableElements().clear();
			return;
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__EXCHANGE_ELEMENTS:
			getExchangeElements().clear();
			return;
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__PERFORMING_ELEMENTS:
			getPerformingElements().clear();
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
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__CONTAINABLE_ELEMENTS:
			return containableElements != null && !containableElements.isEmpty();
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__SPECIALIZABLE_ELEMENTS:
			return specializableElements != null && !specializableElements.isEmpty();
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__EXCHANGE_ELEMENTS:
			return exchangeElements != null && !exchangeElements.isEmpty();
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM__PERFORMING_ELEMENTS:
			return performingElements != null && !performingElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityDiagramImpl
