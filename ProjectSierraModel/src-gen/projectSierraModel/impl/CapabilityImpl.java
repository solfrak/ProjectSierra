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

import projectSierraModel.Capability;
import projectSierraModel.Chain;
import projectSierraModel.InvolvableElement;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.CapabilityImpl#getInvolves <em>Involves</em>}</li>
 *   <li>{@link projectSierraModel.impl.CapabilityImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link projectSierraModel.impl.CapabilityImpl#getIsIncludedIn <em>Is Included In</em>}</li>
 *   <li>{@link projectSierraModel.impl.CapabilityImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link projectSierraModel.impl.CapabilityImpl#getIsExtendedBy <em>Is Extended By</em>}</li>
 *   <li>{@link projectSierraModel.impl.CapabilityImpl#getIsSupportedBy <em>Is Supported By</em>}</li>
 *   <li>{@link projectSierraModel.impl.CapabilityImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends SpecializableElementImpl implements Capability {
	/**
	 * The cached value of the '{@link #getInvolves() <em>Involves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolves()
	 * @generated
	 * @ordered
	 */
	protected EList<InvolvableElement> involves;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected Capability includes;

	/**
	 * The cached value of the '{@link #getIsIncludedIn() <em>Is Included In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIncludedIn()
	 * @generated
	 * @ordered
	 */
	protected Capability isIncludedIn;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> extends_;

	/**
	 * The cached value of the '{@link #getIsExtendedBy() <em>Is Extended By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExtendedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> isExtendedBy;

	/**
	 * The cached value of the '{@link #getIsSupportedBy() <em>Is Supported By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSupportedBy()
	 * @generated
	 * @ordered
	 */
	protected projectSierraModel.System isSupportedBy;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected Chain implements_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvolvableElement> getInvolves() {
		if (involves == null) {
			involves = new EObjectWithInverseResolvingEList.ManyInverse<InvolvableElement>(InvolvableElement.class,
					this, ProjectSierraModelPackage.CAPABILITY__INVOLVES,
					ProjectSierraModelPackage.INVOLVABLE_ELEMENT__INVOLVED_IN);
		}
		return involves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getIncludes() {
		if (includes != null && includes.eIsProxy()) {
			InternalEObject oldIncludes = (InternalEObject) includes;
			includes = (Capability) eResolveProxy(oldIncludes);
			if (includes != oldIncludes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.CAPABILITY__INCLUDES, oldIncludes, includes));
			}
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetIncludes() {
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludes(Capability newIncludes, NotificationChain msgs) {
		Capability oldIncludes = includes;
		includes = newIncludes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CAPABILITY__INCLUDES, oldIncludes, newIncludes);
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
	public void setIncludes(Capability newIncludes) {
		if (newIncludes != includes) {
			NotificationChain msgs = null;
			if (includes != null)
				msgs = ((InternalEObject) includes).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITY__IS_INCLUDED_IN, Capability.class, msgs);
			if (newIncludes != null)
				msgs = ((InternalEObject) newIncludes).eInverseAdd(this,
						ProjectSierraModelPackage.CAPABILITY__IS_INCLUDED_IN, Capability.class, msgs);
			msgs = basicSetIncludes(newIncludes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.CAPABILITY__INCLUDES,
					newIncludes, newIncludes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getIsIncludedIn() {
		if (isIncludedIn != null && isIncludedIn.eIsProxy()) {
			InternalEObject oldIsIncludedIn = (InternalEObject) isIncludedIn;
			isIncludedIn = (Capability) eResolveProxy(oldIsIncludedIn);
			if (isIncludedIn != oldIsIncludedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.CAPABILITY__IS_INCLUDED_IN, oldIsIncludedIn, isIncludedIn));
			}
		}
		return isIncludedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetIsIncludedIn() {
		return isIncludedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsIncludedIn(Capability newIsIncludedIn, NotificationChain msgs) {
		Capability oldIsIncludedIn = isIncludedIn;
		isIncludedIn = newIsIncludedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CAPABILITY__IS_INCLUDED_IN, oldIsIncludedIn, newIsIncludedIn);
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
	public void setIsIncludedIn(Capability newIsIncludedIn) {
		if (newIsIncludedIn != isIncludedIn) {
			NotificationChain msgs = null;
			if (isIncludedIn != null)
				msgs = ((InternalEObject) isIncludedIn).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITY__INCLUDES, Capability.class, msgs);
			if (newIsIncludedIn != null)
				msgs = ((InternalEObject) newIsIncludedIn).eInverseAdd(this,
						ProjectSierraModelPackage.CAPABILITY__INCLUDES, Capability.class, msgs);
			msgs = basicSetIsIncludedIn(newIsIncludedIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.CAPABILITY__IS_INCLUDED_IN,
					newIsIncludedIn, newIsIncludedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this,
					ProjectSierraModelPackage.CAPABILITY__EXTENDS,
					ProjectSierraModelPackage.CAPABILITY__IS_EXTENDED_BY);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getIsExtendedBy() {
		if (isExtendedBy == null) {
			isExtendedBy = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this,
					ProjectSierraModelPackage.CAPABILITY__IS_EXTENDED_BY,
					ProjectSierraModelPackage.CAPABILITY__EXTENDS);
		}
		return isExtendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public projectSierraModel.System getIsSupportedBy() {
		if (isSupportedBy != null && isSupportedBy.eIsProxy()) {
			InternalEObject oldIsSupportedBy = (InternalEObject) isSupportedBy;
			isSupportedBy = (projectSierraModel.System) eResolveProxy(oldIsSupportedBy);
			if (isSupportedBy != oldIsSupportedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.CAPABILITY__IS_SUPPORTED_BY, oldIsSupportedBy, isSupportedBy));
			}
		}
		return isSupportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public projectSierraModel.System basicGetIsSupportedBy() {
		return isSupportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSupportedBy(projectSierraModel.System newIsSupportedBy, NotificationChain msgs) {
		projectSierraModel.System oldIsSupportedBy = isSupportedBy;
		isSupportedBy = newIsSupportedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CAPABILITY__IS_SUPPORTED_BY, oldIsSupportedBy, newIsSupportedBy);
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
	public void setIsSupportedBy(projectSierraModel.System newIsSupportedBy) {
		if (newIsSupportedBy != isSupportedBy) {
			NotificationChain msgs = null;
			if (isSupportedBy != null)
				msgs = ((InternalEObject) isSupportedBy).eInverseRemove(this, ProjectSierraModelPackage.SYSTEM__SUPPORT,
						projectSierraModel.System.class, msgs);
			if (newIsSupportedBy != null)
				msgs = ((InternalEObject) newIsSupportedBy).eInverseAdd(this, ProjectSierraModelPackage.SYSTEM__SUPPORT,
						projectSierraModel.System.class, msgs);
			msgs = basicSetIsSupportedBy(newIsSupportedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.CAPABILITY__IS_SUPPORTED_BY,
					newIsSupportedBy, newIsSupportedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject) implements_;
			implements_ = (Chain) eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.CAPABILITY__IMPLEMENTS, oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplements(Chain newImplements, NotificationChain msgs) {
		Chain oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CAPABILITY__IMPLEMENTS, oldImplements, newImplements);
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
	public void setImplements(Chain newImplements) {
		if (newImplements != implements_) {
			NotificationChain msgs = null;
			if (implements_ != null)
				msgs = ((InternalEObject) implements_).eInverseRemove(this,
						ProjectSierraModelPackage.CHAIN__IS_IMPLEMENTED_BY, Chain.class, msgs);
			if (newImplements != null)
				msgs = ((InternalEObject) newImplements).eInverseAdd(this,
						ProjectSierraModelPackage.CHAIN__IS_IMPLEMENTED_BY, Chain.class, msgs);
			msgs = basicSetImplements(newImplements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.CAPABILITY__IMPLEMENTS,
					newImplements, newImplements));
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
		case ProjectSierraModelPackage.CAPABILITY__INVOLVES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInvolves()).basicAdd(otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITY__INCLUDES:
			if (includes != null)
				msgs = ((InternalEObject) includes).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITY__IS_INCLUDED_IN, Capability.class, msgs);
			return basicSetIncludes((Capability) otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITY__IS_INCLUDED_IN:
			if (isIncludedIn != null)
				msgs = ((InternalEObject) isIncludedIn).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITY__INCLUDES, Capability.class, msgs);
			return basicSetIsIncludedIn((Capability) otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITY__EXTENDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getExtends()).basicAdd(otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITY__IS_EXTENDED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsExtendedBy()).basicAdd(otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITY__IS_SUPPORTED_BY:
			if (isSupportedBy != null)
				msgs = ((InternalEObject) isSupportedBy).eInverseRemove(this, ProjectSierraModelPackage.SYSTEM__SUPPORT,
						projectSierraModel.System.class, msgs);
			return basicSetIsSupportedBy((projectSierraModel.System) otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITY__IMPLEMENTS:
			if (implements_ != null)
				msgs = ((InternalEObject) implements_).eInverseRemove(this,
						ProjectSierraModelPackage.CHAIN__IS_IMPLEMENTED_BY, Chain.class, msgs);
			return basicSetImplements((Chain) otherEnd, msgs);
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
		case ProjectSierraModelPackage.CAPABILITY__INVOLVES:
			return ((InternalEList<?>) getInvolves()).basicRemove(otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITY__INCLUDES:
			return basicSetIncludes(null, msgs);
		case ProjectSierraModelPackage.CAPABILITY__IS_INCLUDED_IN:
			return basicSetIsIncludedIn(null, msgs);
		case ProjectSierraModelPackage.CAPABILITY__EXTENDS:
			return ((InternalEList<?>) getExtends()).basicRemove(otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITY__IS_EXTENDED_BY:
			return ((InternalEList<?>) getIsExtendedBy()).basicRemove(otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITY__IS_SUPPORTED_BY:
			return basicSetIsSupportedBy(null, msgs);
		case ProjectSierraModelPackage.CAPABILITY__IMPLEMENTS:
			return basicSetImplements(null, msgs);
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
		case ProjectSierraModelPackage.CAPABILITY__INVOLVES:
			return getInvolves();
		case ProjectSierraModelPackage.CAPABILITY__INCLUDES:
			if (resolve)
				return getIncludes();
			return basicGetIncludes();
		case ProjectSierraModelPackage.CAPABILITY__IS_INCLUDED_IN:
			if (resolve)
				return getIsIncludedIn();
			return basicGetIsIncludedIn();
		case ProjectSierraModelPackage.CAPABILITY__EXTENDS:
			return getExtends();
		case ProjectSierraModelPackage.CAPABILITY__IS_EXTENDED_BY:
			return getIsExtendedBy();
		case ProjectSierraModelPackage.CAPABILITY__IS_SUPPORTED_BY:
			if (resolve)
				return getIsSupportedBy();
			return basicGetIsSupportedBy();
		case ProjectSierraModelPackage.CAPABILITY__IMPLEMENTS:
			if (resolve)
				return getImplements();
			return basicGetImplements();
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
		case ProjectSierraModelPackage.CAPABILITY__INVOLVES:
			getInvolves().clear();
			getInvolves().addAll((Collection<? extends InvolvableElement>) newValue);
			return;
		case ProjectSierraModelPackage.CAPABILITY__INCLUDES:
			setIncludes((Capability) newValue);
			return;
		case ProjectSierraModelPackage.CAPABILITY__IS_INCLUDED_IN:
			setIsIncludedIn((Capability) newValue);
			return;
		case ProjectSierraModelPackage.CAPABILITY__EXTENDS:
			getExtends().clear();
			getExtends().addAll((Collection<? extends Capability>) newValue);
			return;
		case ProjectSierraModelPackage.CAPABILITY__IS_EXTENDED_BY:
			getIsExtendedBy().clear();
			getIsExtendedBy().addAll((Collection<? extends Capability>) newValue);
			return;
		case ProjectSierraModelPackage.CAPABILITY__IS_SUPPORTED_BY:
			setIsSupportedBy((projectSierraModel.System) newValue);
			return;
		case ProjectSierraModelPackage.CAPABILITY__IMPLEMENTS:
			setImplements((Chain) newValue);
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
		case ProjectSierraModelPackage.CAPABILITY__INVOLVES:
			getInvolves().clear();
			return;
		case ProjectSierraModelPackage.CAPABILITY__INCLUDES:
			setIncludes((Capability) null);
			return;
		case ProjectSierraModelPackage.CAPABILITY__IS_INCLUDED_IN:
			setIsIncludedIn((Capability) null);
			return;
		case ProjectSierraModelPackage.CAPABILITY__EXTENDS:
			getExtends().clear();
			return;
		case ProjectSierraModelPackage.CAPABILITY__IS_EXTENDED_BY:
			getIsExtendedBy().clear();
			return;
		case ProjectSierraModelPackage.CAPABILITY__IS_SUPPORTED_BY:
			setIsSupportedBy((projectSierraModel.System) null);
			return;
		case ProjectSierraModelPackage.CAPABILITY__IMPLEMENTS:
			setImplements((Chain) null);
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
		case ProjectSierraModelPackage.CAPABILITY__INVOLVES:
			return involves != null && !involves.isEmpty();
		case ProjectSierraModelPackage.CAPABILITY__INCLUDES:
			return includes != null;
		case ProjectSierraModelPackage.CAPABILITY__IS_INCLUDED_IN:
			return isIncludedIn != null;
		case ProjectSierraModelPackage.CAPABILITY__EXTENDS:
			return extends_ != null && !extends_.isEmpty();
		case ProjectSierraModelPackage.CAPABILITY__IS_EXTENDED_BY:
			return isExtendedBy != null && !isExtendedBy.isEmpty();
		case ProjectSierraModelPackage.CAPABILITY__IS_SUPPORTED_BY:
			return isSupportedBy != null;
		case ProjectSierraModelPackage.CAPABILITY__IMPLEMENTS:
			return implements_ != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
