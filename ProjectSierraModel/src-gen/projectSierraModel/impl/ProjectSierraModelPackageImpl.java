/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import projectSierraModel.ActivityDiagram;
import projectSierraModel.Actor;
import projectSierraModel.Capabilitty;
import projectSierraModel.Chain;
import projectSierraModel.ContainableElement;
import projectSierraModel.Entity;
import projectSierraModel.Exchange;
import projectSierraModel.ExchangeElement;
import projectSierraModel.Function;
import projectSierraModel.Input;
import projectSierraModel.InvolveableElement;
import projectSierraModel.Item;
import projectSierraModel.Ouput;
import projectSierraModel.PerformingElement;
import projectSierraModel.Port;
import projectSierraModel.ProjectSierraModelFactory;
import projectSierraModel.ProjectSierraModelPackage;
import projectSierraModel.SpecializableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectSierraModelPackageImpl extends EPackageImpl implements ProjectSierraModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilittyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass involveableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ouputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see projectSierraModel.ProjectSierraModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProjectSierraModelPackageImpl() {
		super(eNS_URI, ProjectSierraModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProjectSierraModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProjectSierraModelPackage init() {
		if (isInited)
			return (ProjectSierraModelPackage) EPackage.Registry.INSTANCE
					.getEPackage(ProjectSierraModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProjectSierraModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProjectSierraModelPackageImpl theProjectSierraModelPackage = registeredProjectSierraModelPackage instanceof ProjectSierraModelPackageImpl
				? (ProjectSierraModelPackageImpl) registeredProjectSierraModelPackage
				: new ProjectSierraModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theProjectSierraModelPackage.createPackageContents();

		// Initialize created meta-data
		theProjectSierraModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProjectSierraModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProjectSierraModelPackage.eNS_URI, theProjectSierraModelPackage);
		return theProjectSierraModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilitty() {
		return capabilittyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitty_Includes() {
		return (EReference) capabilittyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitty_IsIncludedIn() {
		return (EReference) capabilittyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitty_Extends() {
		return (EReference) capabilittyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitty_IsExtendedBy() {
		return (EReference) capabilittyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitty_IsImplementedBy() {
		return (EReference) capabilittyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitty_Involves() {
		return (EReference) capabilittyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecializableElement() {
		return specializableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecializableElement_Specializes() {
		return (EReference) specializableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecializableElement_IsSpecializedBy() {
		return (EReference) specializableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainableElement() {
		return containableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainableElement_Contains() {
		return (EReference) containableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainableElement_IsContainedIn() {
		return (EReference) containableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDiagram() {
		return activityDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDiagram_ContainableElements() {
		return (EReference) activityDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDiagram_SpecializableElements() {
		return (EReference) activityDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDiagram_ExchangeElements() {
		return (EReference) activityDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDiagram_PerformingElements() {
		return (EReference) activityDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeElement() {
		return exchangeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformingElement() {
		return performingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformingElement_Performs() {
		return (EReference) performingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvolveableElement() {
		return involveableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvolveableElement_IsInvolvedIn() {
		return (EReference) involveableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_HasPort() {
		return (EReference) functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_HasInput() {
		return (EReference) functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_HasOuput() {
		return (EReference) functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_IsPerformedBy() {
		return (EReference) functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChain() {
		return chainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChain_Implements() {
		return (EReference) chainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_IsPortOf() {
		return (EReference) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_IsInputOf() {
		return (EReference) inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOuput() {
		return ouputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOuput_IsOuputOf() {
		return (EReference) ouputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchange() {
		return exchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchange_SendsTo() {
		return (EReference) exchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchange_ReceivesFrom() {
		return (EReference) exchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchange_Conveys() {
		return (EReference) exchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectSierraModelFactory getProjectSierraModelFactory() {
		return (ProjectSierraModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		capabilittyEClass = createEClass(CAPABILITTY);
		createEReference(capabilittyEClass, CAPABILITTY__INCLUDES);
		createEReference(capabilittyEClass, CAPABILITTY__IS_INCLUDED_IN);
		createEReference(capabilittyEClass, CAPABILITTY__EXTENDS);
		createEReference(capabilittyEClass, CAPABILITTY__IS_EXTENDED_BY);
		createEReference(capabilittyEClass, CAPABILITTY__IS_IMPLEMENTED_BY);
		createEReference(capabilittyEClass, CAPABILITTY__INVOLVES);

		specializableElementEClass = createEClass(SPECIALIZABLE_ELEMENT);
		createEReference(specializableElementEClass, SPECIALIZABLE_ELEMENT__SPECIALIZES);
		createEReference(specializableElementEClass, SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY);

		containableElementEClass = createEClass(CONTAINABLE_ELEMENT);
		createEReference(containableElementEClass, CONTAINABLE_ELEMENT__CONTAINS);
		createEReference(containableElementEClass, CONTAINABLE_ELEMENT__IS_CONTAINED_IN);

		activityDiagramEClass = createEClass(ACTIVITY_DIAGRAM);
		createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__CONTAINABLE_ELEMENTS);
		createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__SPECIALIZABLE_ELEMENTS);
		createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__EXCHANGE_ELEMENTS);
		createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__PERFORMING_ELEMENTS);

		exchangeElementEClass = createEClass(EXCHANGE_ELEMENT);

		exchangeEClass = createEClass(EXCHANGE);
		createEReference(exchangeEClass, EXCHANGE__SENDS_TO);
		createEReference(exchangeEClass, EXCHANGE__RECEIVES_FROM);
		createEReference(exchangeEClass, EXCHANGE__CONVEYS);

		itemEClass = createEClass(ITEM);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__HAS_PORT);
		createEReference(functionEClass, FUNCTION__HAS_INPUT);
		createEReference(functionEClass, FUNCTION__HAS_OUPUT);
		createEReference(functionEClass, FUNCTION__IS_PERFORMED_BY);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__IS_PORT_OF);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__IS_INPUT_OF);

		ouputEClass = createEClass(OUPUT);
		createEReference(ouputEClass, OUPUT__IS_OUPUT_OF);

		performingElementEClass = createEClass(PERFORMING_ELEMENT);
		createEReference(performingElementEClass, PERFORMING_ELEMENT__PERFORMS);

		involveableElementEClass = createEClass(INVOLVEABLE_ELEMENT);
		createEReference(involveableElementEClass, INVOLVEABLE_ELEMENT__IS_INVOLVED_IN);

		actorEClass = createEClass(ACTOR);

		entityEClass = createEClass(ENTITY);

		chainEClass = createEClass(CHAIN);
		createEReference(chainEClass, CHAIN__IMPLEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		capabilittyEClass.getESuperTypes().add(this.getSpecializableElement());
		exchangeEClass.getESuperTypes().add(this.getContainableElement());
		functionEClass.getESuperTypes().add(this.getExchangeElement());
		portEClass.getESuperTypes().add(this.getExchangeElement());
		inputEClass.getESuperTypes().add(this.getPort());
		ouputEClass.getESuperTypes().add(this.getPort());
		involveableElementEClass.getESuperTypes().add(this.getSpecializableElement());
		actorEClass.getESuperTypes().add(this.getInvolveableElement());
		actorEClass.getESuperTypes().add(this.getPerformingElement());
		entityEClass.getESuperTypes().add(this.getInvolveableElement());
		entityEClass.getESuperTypes().add(this.getPerformingElement());
		chainEClass.getESuperTypes().add(this.getContainableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(capabilittyEClass, Capabilitty.class, "Capabilitty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilitty_Includes(), this.getCapabilitty(), this.getCapabilitty_IsIncludedIn(), "includes",
				null, 0, -1, Capabilitty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitty_IsIncludedIn(), this.getCapabilitty(), this.getCapabilitty_Includes(),
				"isIncludedIn", null, 0, 1, Capabilitty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitty_Extends(), this.getCapabilitty(), this.getCapabilitty_IsExtendedBy(), "extends",
				null, 0, 1, Capabilitty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitty_IsExtendedBy(), this.getCapabilitty(), this.getCapabilitty_Extends(),
				"isExtendedBy", null, 0, -1, Capabilitty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitty_IsImplementedBy(), this.getChain(), this.getChain_Implements(), "isImplementedBy",
				null, 1, 1, Capabilitty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitty_Involves(), this.getInvolveableElement(),
				this.getInvolveableElement_IsInvolvedIn(), "involves", null, 1, -1, Capabilitty.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(specializableElementEClass, SpecializableElement.class, "SpecializableElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecializableElement_Specializes(), this.getSpecializableElement(),
				this.getSpecializableElement_IsSpecializedBy(), "specializes", null, 0, 1, SpecializableElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecializableElement_IsSpecializedBy(), this.getSpecializableElement(),
				this.getSpecializableElement_Specializes(), "isSpecializedBy", null, 0, 1, SpecializableElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containableElementEClass, ContainableElement.class, "ContainableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainableElement_Contains(), this.getContainableElement(),
				this.getContainableElement_IsContainedIn(), "contains", null, 1, 1, ContainableElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainableElement_IsContainedIn(), this.getContainableElement(),
				this.getContainableElement_Contains(), "isContainedIn", null, 0, 1, ContainableElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityDiagramEClass, ActivityDiagram.class, "ActivityDiagram", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityDiagram_ContainableElements(), this.getContainableElement(), null,
				"containableElements", null, 0, -1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDiagram_SpecializableElements(), this.getSpecializableElement(), null,
				"specializableElements", null, 0, -1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDiagram_ExchangeElements(), this.getExchangeElement(), null, "exchangeElements", null,
				0, -1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDiagram_PerformingElements(), this.getPerformingElement(), null, "performingElements",
				null, 0, -1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exchangeElementEClass, ExchangeElement.class, "ExchangeElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(exchangeEClass, Exchange.class, "Exchange", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExchange_SendsTo(), this.getExchangeElement(), null, "sendsTo", null, 1, 1, Exchange.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchange_ReceivesFrom(), this.getExchangeElement(), null, "receivesFrom", null, 1, 1,
				Exchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchange_Conveys(), this.getItem(), null, "conveys", null, 0, 1, Exchange.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_HasPort(), this.getPort(), this.getPort_IsPortOf(), "hasPort", null, 0, 1,
				Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_HasInput(), this.getInput(), this.getInput_IsInputOf(), "hasInput", null, 0, 1,
				Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_HasOuput(), this.getOuput(), this.getOuput_IsOuputOf(), "hasOuput", null, 0, 1,
				Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_IsPerformedBy(), this.getPerformingElement(), this.getPerformingElement_Performs(),
				"isPerformedBy", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_IsPortOf(), this.getFunction(), this.getFunction_HasPort(), "isPortOf", null, 0, 1,
				Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_IsInputOf(), this.getFunction(), this.getFunction_HasInput(), "isInputOf", null, 0, 1,
				Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ouputEClass, Ouput.class, "Ouput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOuput_IsOuputOf(), this.getFunction(), this.getFunction_HasOuput(), "isOuputOf", null, 0, 1,
				Ouput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performingElementEClass, PerformingElement.class, "PerformingElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformingElement_Performs(), this.getFunction(), this.getFunction_IsPerformedBy(),
				"performs", null, 0, 1, PerformingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(involveableElementEClass, InvolveableElement.class, "InvolveableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvolveableElement_IsInvolvedIn(), this.getCapabilitty(), this.getCapabilitty_Involves(),
				"isInvolvedIn", null, 1, 1, InvolveableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chainEClass, Chain.class, "Chain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChain_Implements(), this.getCapabilitty(), this.getCapabilitty_IsImplementedBy(),
				"implements", null, 0, 1, Chain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProjectSierraModelPackageImpl
