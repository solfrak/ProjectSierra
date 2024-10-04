/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projectSierraModel.Actor;
import projectSierraModel.Capability;
import projectSierraModel.Chain;
import projectSierraModel.Component;
import projectSierraModel.Constraint;
import projectSierraModel.Entity;
import projectSierraModel.Exchange;
import projectSierraModel.Function;
import projectSierraModel.Input;
import projectSierraModel.Item;
import projectSierraModel.Output;
import projectSierraModel.Port;
import projectSierraModel.ProjectSierraModelFactory;
import projectSierraModel.ProjectSierraModelPackage;
import projectSierraModel.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectSierraModelFactoryImpl extends EFactoryImpl implements ProjectSierraModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjectSierraModelFactory init() {
		try {
			ProjectSierraModelFactory theProjectSierraModelFactory = (ProjectSierraModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(ProjectSierraModelPackage.eNS_URI);
			if (theProjectSierraModelFactory != null) {
				return theProjectSierraModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjectSierraModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectSierraModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ProjectSierraModelPackage.CONSTRAINT:
			return createConstraint();
		case ProjectSierraModelPackage.CAPABILITY:
			return createCapability();
		case ProjectSierraModelPackage.ACTOR:
			return createActor();
		case ProjectSierraModelPackage.ENTITY:
			return createEntity();
		case ProjectSierraModelPackage.COMPONENT:
			return createComponent();
		case ProjectSierraModelPackage.SYSTEM:
			return createSystem();
		case ProjectSierraModelPackage.FUNCTION:
			return createFunction();
		case ProjectSierraModelPackage.ITEM:
			return createItem();
		case ProjectSierraModelPackage.CHAIN:
			return createChain();
		case ProjectSierraModelPackage.PORT:
			return createPort();
		case ProjectSierraModelPackage.INPUT:
			return createInput();
		case ProjectSierraModelPackage.OUTPUT:
			return createOutput();
		case ProjectSierraModelPackage.EXCHANGE:
			return createExchange();
		case ProjectSierraModelPackage.REQUIREMENT:
			return createRequirement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public projectSierraModel.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain createChain() {
		ChainImpl chain = new ChainImpl();
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exchange createExchange() {
		ExchangeImpl exchange = new ExchangeImpl();
		return exchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectSierraModelPackage getProjectSierraModelPackage() {
		return (ProjectSierraModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjectSierraModelPackage getPackage() {
		return ProjectSierraModelPackage.eINSTANCE;
	}

} //ProjectSierraModelFactoryImpl
