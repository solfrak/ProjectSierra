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

import projectSierraModel.Capabilitty;
import projectSierraModel.Chain;
import projectSierraModel.InvolveableElement;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capabilitty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.CapabilittyImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link projectSierraModel.impl.CapabilittyImpl#getIsIncludedIn <em>Is Included In</em>}</li>
 *   <li>{@link projectSierraModel.impl.CapabilittyImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link projectSierraModel.impl.CapabilittyImpl#getIsExtendedBy <em>Is Extended By</em>}</li>
 *   <li>{@link projectSierraModel.impl.CapabilittyImpl#getIsImplementedBy <em>Is Implemented By</em>}</li>
 *   <li>{@link projectSierraModel.impl.CapabilittyImpl#getInvolves <em>Involves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilittyImpl extends SpecializableElementImpl implements Capabilitty {
	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Capabilitty> includes;

	/**
	 * The cached value of the '{@link #getIsIncludedIn() <em>Is Included In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIncludedIn()
	 * @generated
	 * @ordered
	 */
	protected Capabilitty isIncludedIn;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected Capabilitty extends_;

	/**
	 * The cached value of the '{@link #getIsExtendedBy() <em>Is Extended By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExtendedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Capabilitty> isExtendedBy;

	/**
	 * The cached value of the '{@link #getIsImplementedBy() <em>Is Implemented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsImplementedBy()
	 * @generated
	 * @ordered
	 */
	protected Chain isImplementedBy;

	/**
	 * The cached value of the '{@link #getInvolves() <em>Involves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolves()
	 * @generated
	 * @ordered
	 */
	protected EList<InvolveableElement> involves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilittyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.CAPABILITTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capabilitty> getIncludes() {
		if (includes == null) {
			includes = new EObjectWithInverseResolvingEList<Capabilitty>(Capabilitty.class, this,
					ProjectSierraModelPackage.CAPABILITTY__INCLUDES,
					ProjectSierraModelPackage.CAPABILITTY__IS_INCLUDED_IN);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilitty getIsIncludedIn() {
		if (isIncludedIn != null && isIncludedIn.eIsProxy()) {
			InternalEObject oldIsIncludedIn = (InternalEObject) isIncludedIn;
			isIncludedIn = (Capabilitty) eResolveProxy(oldIsIncludedIn);
			if (isIncludedIn != oldIsIncludedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.CAPABILITTY__IS_INCLUDED_IN, oldIsIncludedIn, isIncludedIn));
			}
		}
		return isIncludedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilitty basicGetIsIncludedIn() {
		return isIncludedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsIncludedIn(Capabilitty newIsIncludedIn, NotificationChain msgs) {
		Capabilitty oldIsIncludedIn = isIncludedIn;
		isIncludedIn = newIsIncludedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CAPABILITTY__IS_INCLUDED_IN, oldIsIncludedIn, newIsIncludedIn);
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
	public void setIsIncludedIn(Capabilitty newIsIncludedIn) {
		if (newIsIncludedIn != isIncludedIn) {
			NotificationChain msgs = null;
			if (isIncludedIn != null)
				msgs = ((InternalEObject) isIncludedIn).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITTY__INCLUDES, Capabilitty.class, msgs);
			if (newIsIncludedIn != null)
				msgs = ((InternalEObject) newIsIncludedIn).eInverseAdd(this,
						ProjectSierraModelPackage.CAPABILITTY__INCLUDES, Capabilitty.class, msgs);
			msgs = basicSetIsIncludedIn(newIsIncludedIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.CAPABILITTY__IS_INCLUDED_IN,
					newIsIncludedIn, newIsIncludedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilitty getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject) extends_;
			extends_ = (Capabilitty) eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.CAPABILITTY__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilitty basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(Capabilitty newExtends, NotificationChain msgs) {
		Capabilitty oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CAPABILITTY__EXTENDS, oldExtends, newExtends);
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
	public void setExtends(Capabilitty newExtends) {
		if (newExtends != extends_) {
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject) extends_).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITTY__IS_EXTENDED_BY, Capabilitty.class, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject) newExtends).eInverseAdd(this,
						ProjectSierraModelPackage.CAPABILITTY__IS_EXTENDED_BY, Capabilitty.class, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.CAPABILITTY__EXTENDS,
					newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capabilitty> getIsExtendedBy() {
		if (isExtendedBy == null) {
			isExtendedBy = new EObjectWithInverseResolvingEList<Capabilitty>(Capabilitty.class, this,
					ProjectSierraModelPackage.CAPABILITTY__IS_EXTENDED_BY,
					ProjectSierraModelPackage.CAPABILITTY__EXTENDS);
		}
		return isExtendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain getIsImplementedBy() {
		if (isImplementedBy != null && isImplementedBy.eIsProxy()) {
			InternalEObject oldIsImplementedBy = (InternalEObject) isImplementedBy;
			isImplementedBy = (Chain) eResolveProxy(oldIsImplementedBy);
			if (isImplementedBy != oldIsImplementedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.CAPABILITTY__IS_IMPLEMENTED_BY, oldIsImplementedBy,
							isImplementedBy));
			}
		}
		return isImplementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain basicGetIsImplementedBy() {
		return isImplementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsImplementedBy(Chain newIsImplementedBy, NotificationChain msgs) {
		Chain oldIsImplementedBy = isImplementedBy;
		isImplementedBy = newIsImplementedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CAPABILITTY__IS_IMPLEMENTED_BY, oldIsImplementedBy, newIsImplementedBy);
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
	public void setIsImplementedBy(Chain newIsImplementedBy) {
		if (newIsImplementedBy != isImplementedBy) {
			NotificationChain msgs = null;
			if (isImplementedBy != null)
				msgs = ((InternalEObject) isImplementedBy).eInverseRemove(this,
						ProjectSierraModelPackage.CHAIN__IMPLEMENTS, Chain.class, msgs);
			if (newIsImplementedBy != null)
				msgs = ((InternalEObject) newIsImplementedBy).eInverseAdd(this,
						ProjectSierraModelPackage.CHAIN__IMPLEMENTS, Chain.class, msgs);
			msgs = basicSetIsImplementedBy(newIsImplementedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.CAPABILITTY__IS_IMPLEMENTED_BY, newIsImplementedBy, newIsImplementedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvolveableElement> getInvolves() {
		if (involves == null) {
			involves = new EObjectWithInverseResolvingEList<InvolveableElement>(InvolveableElement.class, this,
					ProjectSierraModelPackage.CAPABILITTY__INVOLVES,
					ProjectSierraModelPackage.INVOLVEABLE_ELEMENT__IS_INVOLVED_IN);
		}
		return involves;
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
		case ProjectSierraModelPackage.CAPABILITTY__INCLUDES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncludes()).basicAdd(otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITTY__IS_INCLUDED_IN:
			if (isIncludedIn != null)
				msgs = ((InternalEObject) isIncludedIn).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITTY__INCLUDES, Capabilitty.class, msgs);
			return basicSetIsIncludedIn((Capabilitty) otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITTY__EXTENDS:
			if (extends_ != null)
				msgs = ((InternalEObject) extends_).eInverseRemove(this,
						ProjectSierraModelPackage.CAPABILITTY__IS_EXTENDED_BY, Capabilitty.class, msgs);
			return basicSetExtends((Capabilitty) otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITTY__IS_EXTENDED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsExtendedBy()).basicAdd(otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITTY__IS_IMPLEMENTED_BY:
			if (isImplementedBy != null)
				msgs = ((InternalEObject) isImplementedBy).eInverseRemove(this,
						ProjectSierraModelPackage.CHAIN__IMPLEMENTS, Chain.class, msgs);
			return basicSetIsImplementedBy((Chain) otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITTY__INVOLVES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInvolves()).basicAdd(otherEnd, msgs);
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
		case ProjectSierraModelPackage.CAPABILITTY__INCLUDES:
			return ((InternalEList<?>) getIncludes()).basicRemove(otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITTY__IS_INCLUDED_IN:
			return basicSetIsIncludedIn(null, msgs);
		case ProjectSierraModelPackage.CAPABILITTY__EXTENDS:
			return basicSetExtends(null, msgs);
		case ProjectSierraModelPackage.CAPABILITTY__IS_EXTENDED_BY:
			return ((InternalEList<?>) getIsExtendedBy()).basicRemove(otherEnd, msgs);
		case ProjectSierraModelPackage.CAPABILITTY__IS_IMPLEMENTED_BY:
			return basicSetIsImplementedBy(null, msgs);
		case ProjectSierraModelPackage.CAPABILITTY__INVOLVES:
			return ((InternalEList<?>) getInvolves()).basicRemove(otherEnd, msgs);
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
		case ProjectSierraModelPackage.CAPABILITTY__INCLUDES:
			return getIncludes();
		case ProjectSierraModelPackage.CAPABILITTY__IS_INCLUDED_IN:
			if (resolve)
				return getIsIncludedIn();
			return basicGetIsIncludedIn();
		case ProjectSierraModelPackage.CAPABILITTY__EXTENDS:
			if (resolve)
				return getExtends();
			return basicGetExtends();
		case ProjectSierraModelPackage.CAPABILITTY__IS_EXTENDED_BY:
			return getIsExtendedBy();
		case ProjectSierraModelPackage.CAPABILITTY__IS_IMPLEMENTED_BY:
			if (resolve)
				return getIsImplementedBy();
			return basicGetIsImplementedBy();
		case ProjectSierraModelPackage.CAPABILITTY__INVOLVES:
			return getInvolves();
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
		case ProjectSierraModelPackage.CAPABILITTY__INCLUDES:
			getIncludes().clear();
			getIncludes().addAll((Collection<? extends Capabilitty>) newValue);
			return;
		case ProjectSierraModelPackage.CAPABILITTY__IS_INCLUDED_IN:
			setIsIncludedIn((Capabilitty) newValue);
			return;
		case ProjectSierraModelPackage.CAPABILITTY__EXTENDS:
			setExtends((Capabilitty) newValue);
			return;
		case ProjectSierraModelPackage.CAPABILITTY__IS_EXTENDED_BY:
			getIsExtendedBy().clear();
			getIsExtendedBy().addAll((Collection<? extends Capabilitty>) newValue);
			return;
		case ProjectSierraModelPackage.CAPABILITTY__IS_IMPLEMENTED_BY:
			setIsImplementedBy((Chain) newValue);
			return;
		case ProjectSierraModelPackage.CAPABILITTY__INVOLVES:
			getInvolves().clear();
			getInvolves().addAll((Collection<? extends InvolveableElement>) newValue);
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
		case ProjectSierraModelPackage.CAPABILITTY__INCLUDES:
			getIncludes().clear();
			return;
		case ProjectSierraModelPackage.CAPABILITTY__IS_INCLUDED_IN:
			setIsIncludedIn((Capabilitty) null);
			return;
		case ProjectSierraModelPackage.CAPABILITTY__EXTENDS:
			setExtends((Capabilitty) null);
			return;
		case ProjectSierraModelPackage.CAPABILITTY__IS_EXTENDED_BY:
			getIsExtendedBy().clear();
			return;
		case ProjectSierraModelPackage.CAPABILITTY__IS_IMPLEMENTED_BY:
			setIsImplementedBy((Chain) null);
			return;
		case ProjectSierraModelPackage.CAPABILITTY__INVOLVES:
			getInvolves().clear();
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
		case ProjectSierraModelPackage.CAPABILITTY__INCLUDES:
			return includes != null && !includes.isEmpty();
		case ProjectSierraModelPackage.CAPABILITTY__IS_INCLUDED_IN:
			return isIncludedIn != null;
		case ProjectSierraModelPackage.CAPABILITTY__EXTENDS:
			return extends_ != null;
		case ProjectSierraModelPackage.CAPABILITTY__IS_EXTENDED_BY:
			return isExtendedBy != null && !isExtendedBy.isEmpty();
		case ProjectSierraModelPackage.CAPABILITTY__IS_IMPLEMENTED_BY:
			return isImplementedBy != null;
		case ProjectSierraModelPackage.CAPABILITTY__INVOLVES:
			return involves != null && !involves.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilittyImpl
