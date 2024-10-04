/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projectSierraModel.Constraint;
import projectSierraModel.DesignElement;
import projectSierraModel.ProjectSierraModelPackage;
import projectSierraModel.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.RequirementImpl#getHasRationale <em>Has Rationale</em>}</li>
 *   <li>{@link projectSierraModel.impl.RequirementImpl#getHasConstraint <em>Has Constraint</em>}</li>
 *   <li>{@link projectSierraModel.impl.RequirementImpl#getDerives <em>Derives</em>}</li>
 *   <li>{@link projectSierraModel.impl.RequirementImpl#getIsDerivedFrom <em>Is Derived From</em>}</li>
 *   <li>{@link projectSierraModel.impl.RequirementImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link projectSierraModel.impl.RequirementImpl#getIsRefinedBy <em>Is Refined By</em>}</li>
 *   <li>{@link projectSierraModel.impl.RequirementImpl#getSpecifies <em>Specifies</em>}</li>
 *   <li>{@link projectSierraModel.impl.RequirementImpl#getJustifies <em>Justifies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends ContainableElementImpl implements Requirement {
	/**
	 * The default value of the '{@link #getHasRationale() <em>Has Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasRationale() <em>Has Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRationale()
	 * @generated
	 * @ordered
	 */
	protected String hasRationale = HAS_RATIONALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasConstraint() <em>Has Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConstraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint hasConstraint;

	/**
	 * The cached value of the '{@link #getDerives() <em>Derives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerives()
	 * @generated
	 * @ordered
	 */
	protected Requirement derives;

	/**
	 * The cached value of the '{@link #getIsDerivedFrom() <em>Is Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected Requirement isDerivedFrom;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected Requirement refines;

	/**
	 * The cached value of the '{@link #getIsRefinedBy() <em>Is Refined By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRefinedBy()
	 * @generated
	 * @ordered
	 */
	protected Requirement isRefinedBy;

	/**
	 * The cached value of the '{@link #getSpecifies() <em>Specifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifies()
	 * @generated
	 * @ordered
	 */
	protected DesignElement specifies;

	/**
	 * The cached value of the '{@link #getJustifies() <em>Justifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifies()
	 * @generated
	 * @ordered
	 */
	protected DesignElement justifies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHasRationale() {
		return hasRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRationale(String newHasRationale) {
		String oldHasRationale = hasRationale;
		hasRationale = newHasRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.REQUIREMENT__HAS_RATIONALE,
					oldHasRationale, hasRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getHasConstraint() {
		if (hasConstraint != null && hasConstraint.eIsProxy()) {
			InternalEObject oldHasConstraint = (InternalEObject) hasConstraint;
			hasConstraint = (Constraint) eResolveProxy(oldHasConstraint);
			if (hasConstraint != oldHasConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.REQUIREMENT__HAS_CONSTRAINT, oldHasConstraint, hasConstraint));
			}
		}
		return hasConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetHasConstraint() {
		return hasConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasConstraint(Constraint newHasConstraint) {
		Constraint oldHasConstraint = hasConstraint;
		hasConstraint = newHasConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.REQUIREMENT__HAS_CONSTRAINT,
					oldHasConstraint, hasConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getDerives() {
		if (derives != null && derives.eIsProxy()) {
			InternalEObject oldDerives = (InternalEObject) derives;
			derives = (Requirement) eResolveProxy(oldDerives);
			if (derives != oldDerives) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.REQUIREMENT__DERIVES, oldDerives, derives));
			}
		}
		return derives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetDerives() {
		return derives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerives(Requirement newDerives, NotificationChain msgs) {
		Requirement oldDerives = derives;
		derives = newDerives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.REQUIREMENT__DERIVES, oldDerives, newDerives);
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
	public void setDerives(Requirement newDerives) {
		if (newDerives != derives) {
			NotificationChain msgs = null;
			if (derives != null)
				msgs = ((InternalEObject) derives).eInverseRemove(this,
						ProjectSierraModelPackage.REQUIREMENT__IS_DERIVED_FROM, Requirement.class, msgs);
			if (newDerives != null)
				msgs = ((InternalEObject) newDerives).eInverseAdd(this,
						ProjectSierraModelPackage.REQUIREMENT__IS_DERIVED_FROM, Requirement.class, msgs);
			msgs = basicSetDerives(newDerives, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.REQUIREMENT__DERIVES,
					newDerives, newDerives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getIsDerivedFrom() {
		if (isDerivedFrom != null && isDerivedFrom.eIsProxy()) {
			InternalEObject oldIsDerivedFrom = (InternalEObject) isDerivedFrom;
			isDerivedFrom = (Requirement) eResolveProxy(oldIsDerivedFrom);
			if (isDerivedFrom != oldIsDerivedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.REQUIREMENT__IS_DERIVED_FROM, oldIsDerivedFrom, isDerivedFrom));
			}
		}
		return isDerivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetIsDerivedFrom() {
		return isDerivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDerivedFrom(Requirement newIsDerivedFrom, NotificationChain msgs) {
		Requirement oldIsDerivedFrom = isDerivedFrom;
		isDerivedFrom = newIsDerivedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.REQUIREMENT__IS_DERIVED_FROM, oldIsDerivedFrom, newIsDerivedFrom);
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
	public void setIsDerivedFrom(Requirement newIsDerivedFrom) {
		if (newIsDerivedFrom != isDerivedFrom) {
			NotificationChain msgs = null;
			if (isDerivedFrom != null)
				msgs = ((InternalEObject) isDerivedFrom).eInverseRemove(this,
						ProjectSierraModelPackage.REQUIREMENT__DERIVES, Requirement.class, msgs);
			if (newIsDerivedFrom != null)
				msgs = ((InternalEObject) newIsDerivedFrom).eInverseAdd(this,
						ProjectSierraModelPackage.REQUIREMENT__DERIVES, Requirement.class, msgs);
			msgs = basicSetIsDerivedFrom(newIsDerivedFrom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.REQUIREMENT__IS_DERIVED_FROM, newIsDerivedFrom, newIsDerivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getRefines() {
		if (refines != null && refines.eIsProxy()) {
			InternalEObject oldRefines = (InternalEObject) refines;
			refines = (Requirement) eResolveProxy(oldRefines);
			if (refines != oldRefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.REQUIREMENT__REFINES, oldRefines, refines));
			}
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefines(Requirement newRefines, NotificationChain msgs) {
		Requirement oldRefines = refines;
		refines = newRefines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.REQUIREMENT__REFINES, oldRefines, newRefines);
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
	public void setRefines(Requirement newRefines) {
		if (newRefines != refines) {
			NotificationChain msgs = null;
			if (refines != null)
				msgs = ((InternalEObject) refines).eInverseRemove(this,
						ProjectSierraModelPackage.REQUIREMENT__IS_REFINED_BY, Requirement.class, msgs);
			if (newRefines != null)
				msgs = ((InternalEObject) newRefines).eInverseAdd(this,
						ProjectSierraModelPackage.REQUIREMENT__IS_REFINED_BY, Requirement.class, msgs);
			msgs = basicSetRefines(newRefines, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.REQUIREMENT__REFINES,
					newRefines, newRefines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getIsRefinedBy() {
		if (isRefinedBy != null && isRefinedBy.eIsProxy()) {
			InternalEObject oldIsRefinedBy = (InternalEObject) isRefinedBy;
			isRefinedBy = (Requirement) eResolveProxy(oldIsRefinedBy);
			if (isRefinedBy != oldIsRefinedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.REQUIREMENT__IS_REFINED_BY, oldIsRefinedBy, isRefinedBy));
			}
		}
		return isRefinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetIsRefinedBy() {
		return isRefinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsRefinedBy(Requirement newIsRefinedBy, NotificationChain msgs) {
		Requirement oldIsRefinedBy = isRefinedBy;
		isRefinedBy = newIsRefinedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.REQUIREMENT__IS_REFINED_BY, oldIsRefinedBy, newIsRefinedBy);
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
	public void setIsRefinedBy(Requirement newIsRefinedBy) {
		if (newIsRefinedBy != isRefinedBy) {
			NotificationChain msgs = null;
			if (isRefinedBy != null)
				msgs = ((InternalEObject) isRefinedBy).eInverseRemove(this,
						ProjectSierraModelPackage.REQUIREMENT__REFINES, Requirement.class, msgs);
			if (newIsRefinedBy != null)
				msgs = ((InternalEObject) newIsRefinedBy).eInverseAdd(this,
						ProjectSierraModelPackage.REQUIREMENT__REFINES, Requirement.class, msgs);
			msgs = basicSetIsRefinedBy(newIsRefinedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.REQUIREMENT__IS_REFINED_BY,
					newIsRefinedBy, newIsRefinedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignElement getSpecifies() {
		if (specifies != null && specifies.eIsProxy()) {
			InternalEObject oldSpecifies = (InternalEObject) specifies;
			specifies = (DesignElement) eResolveProxy(oldSpecifies);
			if (specifies != oldSpecifies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.REQUIREMENT__SPECIFIES, oldSpecifies, specifies));
			}
		}
		return specifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignElement basicGetSpecifies() {
		return specifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecifies(DesignElement newSpecifies, NotificationChain msgs) {
		DesignElement oldSpecifies = specifies;
		specifies = newSpecifies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.REQUIREMENT__SPECIFIES, oldSpecifies, newSpecifies);
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
	public void setSpecifies(DesignElement newSpecifies) {
		if (newSpecifies != specifies) {
			NotificationChain msgs = null;
			if (specifies != null)
				msgs = ((InternalEObject) specifies).eInverseRemove(this,
						ProjectSierraModelPackage.DESIGN_ELEMENT__IS_SPECIFIED_BY, DesignElement.class, msgs);
			if (newSpecifies != null)
				msgs = ((InternalEObject) newSpecifies).eInverseAdd(this,
						ProjectSierraModelPackage.DESIGN_ELEMENT__IS_SPECIFIED_BY, DesignElement.class, msgs);
			msgs = basicSetSpecifies(newSpecifies, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.REQUIREMENT__SPECIFIES,
					newSpecifies, newSpecifies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignElement getJustifies() {
		if (justifies != null && justifies.eIsProxy()) {
			InternalEObject oldJustifies = (InternalEObject) justifies;
			justifies = (DesignElement) eResolveProxy(oldJustifies);
			if (justifies != oldJustifies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.REQUIREMENT__JUSTIFIES, oldJustifies, justifies));
			}
		}
		return justifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignElement basicGetJustifies() {
		return justifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJustifies(DesignElement newJustifies, NotificationChain msgs) {
		DesignElement oldJustifies = justifies;
		justifies = newJustifies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.REQUIREMENT__JUSTIFIES, oldJustifies, newJustifies);
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
	public void setJustifies(DesignElement newJustifies) {
		if (newJustifies != justifies) {
			NotificationChain msgs = null;
			if (justifies != null)
				msgs = ((InternalEObject) justifies).eInverseRemove(this,
						ProjectSierraModelPackage.DESIGN_ELEMENT__IS_JUSTIFIED_BY, DesignElement.class, msgs);
			if (newJustifies != null)
				msgs = ((InternalEObject) newJustifies).eInverseAdd(this,
						ProjectSierraModelPackage.DESIGN_ELEMENT__IS_JUSTIFIED_BY, DesignElement.class, msgs);
			msgs = basicSetJustifies(newJustifies, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.REQUIREMENT__JUSTIFIES,
					newJustifies, newJustifies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectSierraModelPackage.REQUIREMENT__DERIVES:
			if (derives != null)
				msgs = ((InternalEObject) derives).eInverseRemove(this,
						ProjectSierraModelPackage.REQUIREMENT__IS_DERIVED_FROM, Requirement.class, msgs);
			return basicSetDerives((Requirement) otherEnd, msgs);
		case ProjectSierraModelPackage.REQUIREMENT__IS_DERIVED_FROM:
			if (isDerivedFrom != null)
				msgs = ((InternalEObject) isDerivedFrom).eInverseRemove(this,
						ProjectSierraModelPackage.REQUIREMENT__DERIVES, Requirement.class, msgs);
			return basicSetIsDerivedFrom((Requirement) otherEnd, msgs);
		case ProjectSierraModelPackage.REQUIREMENT__REFINES:
			if (refines != null)
				msgs = ((InternalEObject) refines).eInverseRemove(this,
						ProjectSierraModelPackage.REQUIREMENT__IS_REFINED_BY, Requirement.class, msgs);
			return basicSetRefines((Requirement) otherEnd, msgs);
		case ProjectSierraModelPackage.REQUIREMENT__IS_REFINED_BY:
			if (isRefinedBy != null)
				msgs = ((InternalEObject) isRefinedBy).eInverseRemove(this,
						ProjectSierraModelPackage.REQUIREMENT__REFINES, Requirement.class, msgs);
			return basicSetIsRefinedBy((Requirement) otherEnd, msgs);
		case ProjectSierraModelPackage.REQUIREMENT__SPECIFIES:
			if (specifies != null)
				msgs = ((InternalEObject) specifies).eInverseRemove(this,
						ProjectSierraModelPackage.DESIGN_ELEMENT__IS_SPECIFIED_BY, DesignElement.class, msgs);
			return basicSetSpecifies((DesignElement) otherEnd, msgs);
		case ProjectSierraModelPackage.REQUIREMENT__JUSTIFIES:
			if (justifies != null)
				msgs = ((InternalEObject) justifies).eInverseRemove(this,
						ProjectSierraModelPackage.DESIGN_ELEMENT__IS_JUSTIFIED_BY, DesignElement.class, msgs);
			return basicSetJustifies((DesignElement) otherEnd, msgs);
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
		case ProjectSierraModelPackage.REQUIREMENT__DERIVES:
			return basicSetDerives(null, msgs);
		case ProjectSierraModelPackage.REQUIREMENT__IS_DERIVED_FROM:
			return basicSetIsDerivedFrom(null, msgs);
		case ProjectSierraModelPackage.REQUIREMENT__REFINES:
			return basicSetRefines(null, msgs);
		case ProjectSierraModelPackage.REQUIREMENT__IS_REFINED_BY:
			return basicSetIsRefinedBy(null, msgs);
		case ProjectSierraModelPackage.REQUIREMENT__SPECIFIES:
			return basicSetSpecifies(null, msgs);
		case ProjectSierraModelPackage.REQUIREMENT__JUSTIFIES:
			return basicSetJustifies(null, msgs);
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
		case ProjectSierraModelPackage.REQUIREMENT__HAS_RATIONALE:
			return getHasRationale();
		case ProjectSierraModelPackage.REQUIREMENT__HAS_CONSTRAINT:
			if (resolve)
				return getHasConstraint();
			return basicGetHasConstraint();
		case ProjectSierraModelPackage.REQUIREMENT__DERIVES:
			if (resolve)
				return getDerives();
			return basicGetDerives();
		case ProjectSierraModelPackage.REQUIREMENT__IS_DERIVED_FROM:
			if (resolve)
				return getIsDerivedFrom();
			return basicGetIsDerivedFrom();
		case ProjectSierraModelPackage.REQUIREMENT__REFINES:
			if (resolve)
				return getRefines();
			return basicGetRefines();
		case ProjectSierraModelPackage.REQUIREMENT__IS_REFINED_BY:
			if (resolve)
				return getIsRefinedBy();
			return basicGetIsRefinedBy();
		case ProjectSierraModelPackage.REQUIREMENT__SPECIFIES:
			if (resolve)
				return getSpecifies();
			return basicGetSpecifies();
		case ProjectSierraModelPackage.REQUIREMENT__JUSTIFIES:
			if (resolve)
				return getJustifies();
			return basicGetJustifies();
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
		case ProjectSierraModelPackage.REQUIREMENT__HAS_RATIONALE:
			setHasRationale((String) newValue);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__HAS_CONSTRAINT:
			setHasConstraint((Constraint) newValue);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__DERIVES:
			setDerives((Requirement) newValue);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__IS_DERIVED_FROM:
			setIsDerivedFrom((Requirement) newValue);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__REFINES:
			setRefines((Requirement) newValue);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__IS_REFINED_BY:
			setIsRefinedBy((Requirement) newValue);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__SPECIFIES:
			setSpecifies((DesignElement) newValue);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__JUSTIFIES:
			setJustifies((DesignElement) newValue);
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
		case ProjectSierraModelPackage.REQUIREMENT__HAS_RATIONALE:
			setHasRationale(HAS_RATIONALE_EDEFAULT);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__HAS_CONSTRAINT:
			setHasConstraint((Constraint) null);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__DERIVES:
			setDerives((Requirement) null);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__IS_DERIVED_FROM:
			setIsDerivedFrom((Requirement) null);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__REFINES:
			setRefines((Requirement) null);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__IS_REFINED_BY:
			setIsRefinedBy((Requirement) null);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__SPECIFIES:
			setSpecifies((DesignElement) null);
			return;
		case ProjectSierraModelPackage.REQUIREMENT__JUSTIFIES:
			setJustifies((DesignElement) null);
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
		case ProjectSierraModelPackage.REQUIREMENT__HAS_RATIONALE:
			return HAS_RATIONALE_EDEFAULT == null ? hasRationale != null : !HAS_RATIONALE_EDEFAULT.equals(hasRationale);
		case ProjectSierraModelPackage.REQUIREMENT__HAS_CONSTRAINT:
			return hasConstraint != null;
		case ProjectSierraModelPackage.REQUIREMENT__DERIVES:
			return derives != null;
		case ProjectSierraModelPackage.REQUIREMENT__IS_DERIVED_FROM:
			return isDerivedFrom != null;
		case ProjectSierraModelPackage.REQUIREMENT__REFINES:
			return refines != null;
		case ProjectSierraModelPackage.REQUIREMENT__IS_REFINED_BY:
			return isRefinedBy != null;
		case ProjectSierraModelPackage.REQUIREMENT__SPECIFIES:
			return specifies != null;
		case ProjectSierraModelPackage.REQUIREMENT__JUSTIFIES:
			return justifies != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (hasRationale: ");
		result.append(hasRationale);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
