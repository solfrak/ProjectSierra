/**
 */
package projectSierraModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projectSierraModel.Capability;
import projectSierraModel.Function;
import projectSierraModel.InvolvableElement;
import projectSierraModel.PerformingElement;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Involvable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.InvolvableElementImpl#getPerforms <em>Performs</em>}</li>
 *   <li>{@link projectSierraModel.impl.InvolvableElementImpl#getInvolvedIn <em>Involved In</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InvolvableElementImpl extends SpecializableElementImpl implements InvolvableElement {
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
	 * The cached value of the '{@link #getInvolvedIn() <em>Involved In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> involvedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvolvableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.INVOLVABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getPerforms() {
		if (performs == null) {
			performs = new EObjectWithInverseResolvingEList.ManyInverse<Function>(Function.class, this,
					ProjectSierraModelPackage.INVOLVABLE_ELEMENT__PERFORMS,
					ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY);
		}
		return performs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getInvolvedIn() {
		if (involvedIn == null) {
			involvedIn = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this,
					ProjectSierraModelPackage.INVOLVABLE_ELEMENT__INVOLVED_IN,
					ProjectSierraModelPackage.CAPABILITY__INVOLVES);
		}
		return involvedIn;
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
		case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__PERFORMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPerforms()).basicAdd(otherEnd, msgs);
		case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__INVOLVED_IN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInvolvedIn()).basicAdd(otherEnd, msgs);
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
		case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__PERFORMS:
			return ((InternalEList<?>) getPerforms()).basicRemove(otherEnd, msgs);
		case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__INVOLVED_IN:
			return ((InternalEList<?>) getInvolvedIn()).basicRemove(otherEnd, msgs);
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
		case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__PERFORMS:
			return getPerforms();
		case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__INVOLVED_IN:
			return getInvolvedIn();
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
		case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__PERFORMS:
			getPerforms().clear();
			getPerforms().addAll((Collection<? extends Function>) newValue);
			return;
		case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__INVOLVED_IN:
			getInvolvedIn().clear();
			getInvolvedIn().addAll((Collection<? extends Capability>) newValue);
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
		case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__PERFORMS:
			getPerforms().clear();
			return;
		case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__INVOLVED_IN:
			getInvolvedIn().clear();
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
		case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__PERFORMS:
			return performs != null && !performs.isEmpty();
		case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__INVOLVED_IN:
			return involvedIn != null && !involvedIn.isEmpty();
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
			case ProjectSierraModelPackage.INVOLVABLE_ELEMENT__PERFORMS:
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
				return ProjectSierraModelPackage.INVOLVABLE_ELEMENT__PERFORMS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InvolvableElementImpl
