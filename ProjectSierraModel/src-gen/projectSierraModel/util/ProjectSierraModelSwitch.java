/**
 */
package projectSierraModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import projectSierraModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see projectSierraModel.ProjectSierraModelPackage
 * @generated
 */
public class ProjectSierraModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProjectSierraModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectSierraModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ProjectSierraModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ProjectSierraModelPackage.CAPABILITTY: {
			Capabilitty capabilitty = (Capabilitty) theEObject;
			T result = caseCapabilitty(capabilitty);
			if (result == null)
				result = caseSpecializableElement(capabilitty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.SPECIALIZABLE_ELEMENT: {
			SpecializableElement specializableElement = (SpecializableElement) theEObject;
			T result = caseSpecializableElement(specializableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.CONTAINABLE_ELEMENT: {
			ContainableElement containableElement = (ContainableElement) theEObject;
			T result = caseContainableElement(containableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM: {
			ActivityDiagram activityDiagram = (ActivityDiagram) theEObject;
			T result = caseActivityDiagram(activityDiagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.EXCHANGE_ELEMENT: {
			ExchangeElement exchangeElement = (ExchangeElement) theEObject;
			T result = caseExchangeElement(exchangeElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.EXCHANGE: {
			Exchange exchange = (Exchange) theEObject;
			T result = caseExchange(exchange);
			if (result == null)
				result = caseContainableElement(exchange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.ITEM: {
			Item item = (Item) theEObject;
			T result = caseItem(item);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.FUNCTION: {
			Function function = (Function) theEObject;
			T result = caseFunction(function);
			if (result == null)
				result = caseExchangeElement(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.PORT: {
			Port port = (Port) theEObject;
			T result = casePort(port);
			if (result == null)
				result = caseExchangeElement(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = casePort(input);
			if (result == null)
				result = caseExchangeElement(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.OUPUT: {
			Ouput ouput = (Ouput) theEObject;
			T result = caseOuput(ouput);
			if (result == null)
				result = casePort(ouput);
			if (result == null)
				result = caseExchangeElement(ouput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.PERFORMING_ELEMENT: {
			PerformingElement performingElement = (PerformingElement) theEObject;
			T result = casePerformingElement(performingElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.INVOLVEABLE_ELEMENT: {
			InvolveableElement involveableElement = (InvolveableElement) theEObject;
			T result = caseInvolveableElement(involveableElement);
			if (result == null)
				result = caseSpecializableElement(involveableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.ACTOR: {
			Actor actor = (Actor) theEObject;
			T result = caseActor(actor);
			if (result == null)
				result = caseInvolveableElement(actor);
			if (result == null)
				result = casePerformingElement(actor);
			if (result == null)
				result = caseSpecializableElement(actor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.ENTITY: {
			Entity entity = (Entity) theEObject;
			T result = caseEntity(entity);
			if (result == null)
				result = caseInvolveableElement(entity);
			if (result == null)
				result = casePerformingElement(entity);
			if (result == null)
				result = caseSpecializableElement(entity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjectSierraModelPackage.CHAIN: {
			Chain chain = (Chain) theEObject;
			T result = caseChain(chain);
			if (result == null)
				result = caseContainableElement(chain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capabilitty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capabilitty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilitty(Capabilitty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specializable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specializable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecializableElement(SpecializableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainableElement(ContainableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDiagram(ActivityDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeElement(ExchangeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performing Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performing Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformingElement(PerformingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Involveable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Involveable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvolveableElement(InvolveableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChain(Chain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ouput</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ouput</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOuput(Ouput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchange(Exchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProjectSierraModelSwitch
