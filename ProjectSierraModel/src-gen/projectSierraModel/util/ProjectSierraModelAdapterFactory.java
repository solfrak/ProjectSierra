/**
 */
package projectSierraModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import projectSierraModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see projectSierraModel.ProjectSierraModelPackage
 * @generated
 */
public class ProjectSierraModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProjectSierraModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectSierraModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProjectSierraModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectSierraModelSwitch<Adapter> modelSwitch = new ProjectSierraModelSwitch<Adapter>() {
		@Override
		public Adapter caseCapabilitty(Capabilitty object) {
			return createCapabilittyAdapter();
		}

		@Override
		public Adapter caseSpecializableElement(SpecializableElement object) {
			return createSpecializableElementAdapter();
		}

		@Override
		public Adapter caseContainableElement(ContainableElement object) {
			return createContainableElementAdapter();
		}

		@Override
		public Adapter caseActivityDiagram(ActivityDiagram object) {
			return createActivityDiagramAdapter();
		}

		@Override
		public Adapter caseExchangeElement(ExchangeElement object) {
			return createExchangeElementAdapter();
		}

		@Override
		public Adapter caseExchange(Exchange object) {
			return createExchangeAdapter();
		}

		@Override
		public Adapter caseItem(Item object) {
			return createItemAdapter();
		}

		@Override
		public Adapter caseFunction(Function object) {
			return createFunctionAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseInput(Input object) {
			return createInputAdapter();
		}

		@Override
		public Adapter caseOuput(Ouput object) {
			return createOuputAdapter();
		}

		@Override
		public Adapter casePerformingElement(PerformingElement object) {
			return createPerformingElementAdapter();
		}

		@Override
		public Adapter caseInvolveableElement(InvolveableElement object) {
			return createInvolveableElementAdapter();
		}

		@Override
		public Adapter caseActor(Actor object) {
			return createActorAdapter();
		}

		@Override
		public Adapter caseEntity(Entity object) {
			return createEntityAdapter();
		}

		@Override
		public Adapter caseChain(Chain object) {
			return createChainAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.Capabilitty <em>Capabilitty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.Capabilitty
	 * @generated
	 */
	public Adapter createCapabilittyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.SpecializableElement <em>Specializable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.SpecializableElement
	 * @generated
	 */
	public Adapter createSpecializableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.ContainableElement <em>Containable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.ContainableElement
	 * @generated
	 */
	public Adapter createContainableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.ActivityDiagram <em>Activity Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.ActivityDiagram
	 * @generated
	 */
	public Adapter createActivityDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.ExchangeElement <em>Exchange Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.ExchangeElement
	 * @generated
	 */
	public Adapter createExchangeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.PerformingElement <em>Performing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.PerformingElement
	 * @generated
	 */
	public Adapter createPerformingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.InvolveableElement <em>Involveable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.InvolveableElement
	 * @generated
	 */
	public Adapter createInvolveableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.Chain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.Chain
	 * @generated
	 */
	public Adapter createChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.Ouput <em>Ouput</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.Ouput
	 * @generated
	 */
	public Adapter createOuputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projectSierraModel.Exchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projectSierraModel.Exchange
	 * @generated
	 */
	public Adapter createExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProjectSierraModelAdapterFactory
