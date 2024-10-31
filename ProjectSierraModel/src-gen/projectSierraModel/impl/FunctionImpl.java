/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import projectSierraModel.Function;
import projectSierraModel.Input;
import projectSierraModel.Ouput;
import projectSierraModel.PerformingElement;
import projectSierraModel.Port;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.FunctionImpl#getHasPort <em>Has Port</em>}</li>
 *   <li>{@link projectSierraModel.impl.FunctionImpl#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link projectSierraModel.impl.FunctionImpl#getHasOuput <em>Has Ouput</em>}</li>
 *   <li>{@link projectSierraModel.impl.FunctionImpl#getIsPerformedBy <em>Is Performed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends ExchangeElementImpl implements Function {
	/**
	 * The cached value of the '{@link #getHasPort() <em>Has Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPort()
	 * @generated
	 * @ordered
	 */
	protected Port hasPort;

	/**
	 * The cached value of the '{@link #getHasInput() <em>Has Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInput()
	 * @generated
	 * @ordered
	 */
	protected Input hasInput;

	/**
	 * The cached value of the '{@link #getHasOuput() <em>Has Ouput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOuput()
	 * @generated
	 * @ordered
	 */
	protected Ouput hasOuput;

	/**
	 * The cached value of the '{@link #getIsPerformedBy() <em>Is Performed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPerformedBy()
	 * @generated
	 * @ordered
	 */
	protected PerformingElement isPerformedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getHasPort() {
		if (hasPort != null && hasPort.eIsProxy()) {
			InternalEObject oldHasPort = (InternalEObject) hasPort;
			hasPort = (Port) eResolveProxy(oldHasPort);
			if (hasPort != oldHasPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.FUNCTION__HAS_PORT, oldHasPort, hasPort));
			}
		}
		return hasPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetHasPort() {
		return hasPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPort(Port newHasPort, NotificationChain msgs) {
		Port oldHasPort = hasPort;
		hasPort = newHasPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.FUNCTION__HAS_PORT, oldHasPort, newHasPort);
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
	public void setHasPort(Port newHasPort) {
		if (newHasPort != hasPort) {
			NotificationChain msgs = null;
			if (hasPort != null)
				msgs = ((InternalEObject) hasPort).eInverseRemove(this, ProjectSierraModelPackage.PORT__IS_PORT_OF,
						Port.class, msgs);
			if (newHasPort != null)
				msgs = ((InternalEObject) newHasPort).eInverseAdd(this, ProjectSierraModelPackage.PORT__IS_PORT_OF,
						Port.class, msgs);
			msgs = basicSetHasPort(newHasPort, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.FUNCTION__HAS_PORT,
					newHasPort, newHasPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getHasInput() {
		if (hasInput != null && hasInput.eIsProxy()) {
			InternalEObject oldHasInput = (InternalEObject) hasInput;
			hasInput = (Input) eResolveProxy(oldHasInput);
			if (hasInput != oldHasInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.FUNCTION__HAS_INPUT, oldHasInput, hasInput));
			}
		}
		return hasInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetHasInput() {
		return hasInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasInput(Input newHasInput, NotificationChain msgs) {
		Input oldHasInput = hasInput;
		hasInput = newHasInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.FUNCTION__HAS_INPUT, oldHasInput, newHasInput);
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
	public void setHasInput(Input newHasInput) {
		if (newHasInput != hasInput) {
			NotificationChain msgs = null;
			if (hasInput != null)
				msgs = ((InternalEObject) hasInput).eInverseRemove(this, ProjectSierraModelPackage.INPUT__IS_INPUT_OF,
						Input.class, msgs);
			if (newHasInput != null)
				msgs = ((InternalEObject) newHasInput).eInverseAdd(this, ProjectSierraModelPackage.INPUT__IS_INPUT_OF,
						Input.class, msgs);
			msgs = basicSetHasInput(newHasInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.FUNCTION__HAS_INPUT,
					newHasInput, newHasInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ouput getHasOuput() {
		if (hasOuput != null && hasOuput.eIsProxy()) {
			InternalEObject oldHasOuput = (InternalEObject) hasOuput;
			hasOuput = (Ouput) eResolveProxy(oldHasOuput);
			if (hasOuput != oldHasOuput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.FUNCTION__HAS_OUPUT, oldHasOuput, hasOuput));
			}
		}
		return hasOuput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ouput basicGetHasOuput() {
		return hasOuput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasOuput(Ouput newHasOuput, NotificationChain msgs) {
		Ouput oldHasOuput = hasOuput;
		hasOuput = newHasOuput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.FUNCTION__HAS_OUPUT, oldHasOuput, newHasOuput);
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
	public void setHasOuput(Ouput newHasOuput) {
		if (newHasOuput != hasOuput) {
			NotificationChain msgs = null;
			if (hasOuput != null)
				msgs = ((InternalEObject) hasOuput).eInverseRemove(this, ProjectSierraModelPackage.OUPUT__IS_OUPUT_OF,
						Ouput.class, msgs);
			if (newHasOuput != null)
				msgs = ((InternalEObject) newHasOuput).eInverseAdd(this, ProjectSierraModelPackage.OUPUT__IS_OUPUT_OF,
						Ouput.class, msgs);
			msgs = basicSetHasOuput(newHasOuput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.FUNCTION__HAS_OUPUT,
					newHasOuput, newHasOuput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformingElement getIsPerformedBy() {
		if (isPerformedBy != null && isPerformedBy.eIsProxy()) {
			InternalEObject oldIsPerformedBy = (InternalEObject) isPerformedBy;
			isPerformedBy = (PerformingElement) eResolveProxy(oldIsPerformedBy);
			if (isPerformedBy != oldIsPerformedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY, oldIsPerformedBy, isPerformedBy));
			}
		}
		return isPerformedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformingElement basicGetIsPerformedBy() {
		return isPerformedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPerformedBy(PerformingElement newIsPerformedBy, NotificationChain msgs) {
		PerformingElement oldIsPerformedBy = isPerformedBy;
		isPerformedBy = newIsPerformedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY, oldIsPerformedBy, newIsPerformedBy);
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
	public void setIsPerformedBy(PerformingElement newIsPerformedBy) {
		if (newIsPerformedBy != isPerformedBy) {
			NotificationChain msgs = null;
			if (isPerformedBy != null)
				msgs = ((InternalEObject) isPerformedBy).eInverseRemove(this,
						ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS, PerformingElement.class, msgs);
			if (newIsPerformedBy != null)
				msgs = ((InternalEObject) newIsPerformedBy).eInverseAdd(this,
						ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS, PerformingElement.class, msgs);
			msgs = basicSetIsPerformedBy(newIsPerformedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY,
					newIsPerformedBy, newIsPerformedBy));
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
		case ProjectSierraModelPackage.FUNCTION__HAS_PORT:
			if (hasPort != null)
				msgs = ((InternalEObject) hasPort).eInverseRemove(this, ProjectSierraModelPackage.PORT__IS_PORT_OF,
						Port.class, msgs);
			return basicSetHasPort((Port) otherEnd, msgs);
		case ProjectSierraModelPackage.FUNCTION__HAS_INPUT:
			if (hasInput != null)
				msgs = ((InternalEObject) hasInput).eInverseRemove(this, ProjectSierraModelPackage.INPUT__IS_INPUT_OF,
						Input.class, msgs);
			return basicSetHasInput((Input) otherEnd, msgs);
		case ProjectSierraModelPackage.FUNCTION__HAS_OUPUT:
			if (hasOuput != null)
				msgs = ((InternalEObject) hasOuput).eInverseRemove(this, ProjectSierraModelPackage.OUPUT__IS_OUPUT_OF,
						Ouput.class, msgs);
			return basicSetHasOuput((Ouput) otherEnd, msgs);
		case ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY:
			if (isPerformedBy != null)
				msgs = ((InternalEObject) isPerformedBy).eInverseRemove(this,
						ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS, PerformingElement.class, msgs);
			return basicSetIsPerformedBy((PerformingElement) otherEnd, msgs);
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
		case ProjectSierraModelPackage.FUNCTION__HAS_PORT:
			return basicSetHasPort(null, msgs);
		case ProjectSierraModelPackage.FUNCTION__HAS_INPUT:
			return basicSetHasInput(null, msgs);
		case ProjectSierraModelPackage.FUNCTION__HAS_OUPUT:
			return basicSetHasOuput(null, msgs);
		case ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY:
			return basicSetIsPerformedBy(null, msgs);
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
		case ProjectSierraModelPackage.FUNCTION__HAS_PORT:
			if (resolve)
				return getHasPort();
			return basicGetHasPort();
		case ProjectSierraModelPackage.FUNCTION__HAS_INPUT:
			if (resolve)
				return getHasInput();
			return basicGetHasInput();
		case ProjectSierraModelPackage.FUNCTION__HAS_OUPUT:
			if (resolve)
				return getHasOuput();
			return basicGetHasOuput();
		case ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY:
			if (resolve)
				return getIsPerformedBy();
			return basicGetIsPerformedBy();
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
		case ProjectSierraModelPackage.FUNCTION__HAS_PORT:
			setHasPort((Port) newValue);
			return;
		case ProjectSierraModelPackage.FUNCTION__HAS_INPUT:
			setHasInput((Input) newValue);
			return;
		case ProjectSierraModelPackage.FUNCTION__HAS_OUPUT:
			setHasOuput((Ouput) newValue);
			return;
		case ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY:
			setIsPerformedBy((PerformingElement) newValue);
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
		case ProjectSierraModelPackage.FUNCTION__HAS_PORT:
			setHasPort((Port) null);
			return;
		case ProjectSierraModelPackage.FUNCTION__HAS_INPUT:
			setHasInput((Input) null);
			return;
		case ProjectSierraModelPackage.FUNCTION__HAS_OUPUT:
			setHasOuput((Ouput) null);
			return;
		case ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY:
			setIsPerformedBy((PerformingElement) null);
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
		case ProjectSierraModelPackage.FUNCTION__HAS_PORT:
			return hasPort != null;
		case ProjectSierraModelPackage.FUNCTION__HAS_INPUT:
			return hasInput != null;
		case ProjectSierraModelPackage.FUNCTION__HAS_OUPUT:
			return hasOuput != null;
		case ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY:
			return isPerformedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
