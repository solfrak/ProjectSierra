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

import projectSierraModel.Function;
import projectSierraModel.Input;
import projectSierraModel.Output;
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
 *   <li>{@link projectSierraModel.impl.FunctionImpl#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link projectSierraModel.impl.FunctionImpl#getIsPerformedBy <em>Is Performed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends ExchangingElementImpl implements Function {
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
	 * The cached value of the '{@link #getHasOutput() <em>Has Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutput()
	 * @generated
	 * @ordered
	 */
	protected Output hasOutput;

	/**
	 * The cached value of the '{@link #getIsPerformedBy() <em>Is Performed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPerformedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformingElement> isPerformedBy;

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
	public Output getHasOutput() {
		if (hasOutput != null && hasOutput.eIsProxy()) {
			InternalEObject oldHasOutput = (InternalEObject) hasOutput;
			hasOutput = (Output) eResolveProxy(oldHasOutput);
			if (hasOutput != oldHasOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjectSierraModelPackage.FUNCTION__HAS_OUTPUT, oldHasOutput, hasOutput));
			}
		}
		return hasOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetHasOutput() {
		return hasOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasOutput(Output newHasOutput, NotificationChain msgs) {
		Output oldHasOutput = hasOutput;
		hasOutput = newHasOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjectSierraModelPackage.FUNCTION__HAS_OUTPUT, oldHasOutput, newHasOutput);
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
	public void setHasOutput(Output newHasOutput) {
		if (newHasOutput != hasOutput) {
			NotificationChain msgs = null;
			if (hasOutput != null)
				msgs = ((InternalEObject) hasOutput).eInverseRemove(this,
						ProjectSierraModelPackage.OUTPUT__IS_OUTPUT_OF, Output.class, msgs);
			if (newHasOutput != null)
				msgs = ((InternalEObject) newHasOutput).eInverseAdd(this,
						ProjectSierraModelPackage.OUTPUT__IS_OUTPUT_OF, Output.class, msgs);
			msgs = basicSetHasOutput(newHasOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.FUNCTION__HAS_OUTPUT,
					newHasOutput, newHasOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerformingElement> getIsPerformedBy() {
		if (isPerformedBy == null) {
			isPerformedBy = new EObjectWithInverseResolvingEList.ManyInverse<PerformingElement>(PerformingElement.class,
					this, ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY,
					ProjectSierraModelPackage.PERFORMING_ELEMENT__PERFORMS);
		}
		return isPerformedBy;
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
		case ProjectSierraModelPackage.FUNCTION__HAS_OUTPUT:
			if (hasOutput != null)
				msgs = ((InternalEObject) hasOutput).eInverseRemove(this,
						ProjectSierraModelPackage.OUTPUT__IS_OUTPUT_OF, Output.class, msgs);
			return basicSetHasOutput((Output) otherEnd, msgs);
		case ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsPerformedBy()).basicAdd(otherEnd, msgs);
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
		case ProjectSierraModelPackage.FUNCTION__HAS_OUTPUT:
			return basicSetHasOutput(null, msgs);
		case ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY:
			return ((InternalEList<?>) getIsPerformedBy()).basicRemove(otherEnd, msgs);
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
		case ProjectSierraModelPackage.FUNCTION__HAS_OUTPUT:
			if (resolve)
				return getHasOutput();
			return basicGetHasOutput();
		case ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY:
			return getIsPerformedBy();
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
		case ProjectSierraModelPackage.FUNCTION__HAS_OUTPUT:
			setHasOutput((Output) newValue);
			return;
		case ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY:
			getIsPerformedBy().clear();
			getIsPerformedBy().addAll((Collection<? extends PerformingElement>) newValue);
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
		case ProjectSierraModelPackage.FUNCTION__HAS_OUTPUT:
			setHasOutput((Output) null);
			return;
		case ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY:
			getIsPerformedBy().clear();
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
		case ProjectSierraModelPackage.FUNCTION__HAS_OUTPUT:
			return hasOutput != null;
		case ProjectSierraModelPackage.FUNCTION__IS_PERFORMED_BY:
			return isPerformedBy != null && !isPerformedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
