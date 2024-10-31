/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projectSierraModel.*;

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
		case ProjectSierraModelPackage.CAPABILITTY:
			return createCapabilitty();
		case ProjectSierraModelPackage.ACTIVITY_DIAGRAM:
			return createActivityDiagram();
		case ProjectSierraModelPackage.EXCHANGE:
			return createExchange();
		case ProjectSierraModelPackage.ITEM:
			return createItem();
		case ProjectSierraModelPackage.FUNCTION:
			return createFunction();
		case ProjectSierraModelPackage.PORT:
			return createPort();
		case ProjectSierraModelPackage.INPUT:
			return createInput();
		case ProjectSierraModelPackage.OUPUT:
			return createOuput();
		case ProjectSierraModelPackage.ACTOR:
			return createActor();
		case ProjectSierraModelPackage.ENTITY:
			return createEntity();
		case ProjectSierraModelPackage.CHAIN:
			return createChain();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capabilitty createCapabilitty() {
		CapabilittyImpl capabilitty = new CapabilittyImpl();
		return capabilitty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagram createActivityDiagram() {
		ActivityDiagramImpl activityDiagram = new ActivityDiagramImpl();
		return activityDiagram;
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
	public Ouput createOuput() {
		OuputImpl ouput = new OuputImpl();
		return ouput;
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
