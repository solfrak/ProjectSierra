/**
 */
package projectSierraModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see projectSierraModel.ProjectSierraModelFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectSierraModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projectSierraModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/projectSierraModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projectSierraModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectSierraModelPackage eINSTANCE = projectSierraModel.impl.ProjectSierraModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.SpecializableElementImpl <em>Specializable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.SpecializableElementImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getSpecializableElement()
	 * @generated
	 */
	int SPECIALIZABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT__SPECIALIZES = 0;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Specializable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Specializable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.CapabilittyImpl <em>Capabilitty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.CapabilittyImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getCapabilitty()
	 * @generated
	 */
	int CAPABILITTY = 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITTY__SPECIALIZES = SPECIALIZABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITTY__IS_SPECIALIZED_BY = SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITTY__NAME = SPECIALIZABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITTY__INCLUDES = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Included In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITTY__IS_INCLUDED_IN = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITTY__EXTENDS = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Extended By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITTY__IS_EXTENDED_BY = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Implemented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITTY__IS_IMPLEMENTED_BY = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Involves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITTY__INVOLVES = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Capabilitty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITTY_FEATURE_COUNT = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Capabilitty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITTY_OPERATION_COUNT = SPECIALIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ContainableElementImpl <em>Containable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ContainableElementImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getContainableElement()
	 * @generated
	 */
	int CONTAINABLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Is Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT__IS_CONTAINED_IN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Containable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Containable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ActivityDiagramImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getActivityDiagram()
	 * @generated
	 */
	int ACTIVITY_DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Containable Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__CONTAINABLE_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Specializable Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__SPECIALIZABLE_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Exchange Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__EXCHANGE_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Performing Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__PERFORMING_ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Activity Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Activity Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ExchangeElementImpl <em>Exchange Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ExchangeElementImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getExchangeElement()
	 * @generated
	 */
	int EXCHANGE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Exchange Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exchange Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ActorImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 13;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.EntityImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 14;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.PerformingElementImpl <em>Performing Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.PerformingElementImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getPerformingElement()
	 * @generated
	 */
	int PERFORMING_ELEMENT = 11;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.InvolveableElementImpl <em>Involveable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.InvolveableElementImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getInvolveableElement()
	 * @generated
	 */
	int INVOLVEABLE_ELEMENT = 12;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.FunctionImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 7;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ItemImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 6;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ChainImpl <em>Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ChainImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getChain()
	 * @generated
	 */
	int CHAIN = 15;

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Capabilitty <em>Capabilitty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilitty</em>'.
	 * @see projectSierraModel.Capabilitty
	 * @generated
	 */
	EClass getCapabilitty();

	/**
	 * Returns the meta object for the reference list '{@link projectSierraModel.Capabilitty#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see projectSierraModel.Capabilitty#getIncludes()
	 * @see #getCapabilitty()
	 * @generated
	 */
	EReference getCapabilitty_Includes();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Capabilitty#getIsIncludedIn <em>Is Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Included In</em>'.
	 * @see projectSierraModel.Capabilitty#getIsIncludedIn()
	 * @see #getCapabilitty()
	 * @generated
	 */
	EReference getCapabilitty_IsIncludedIn();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Capabilitty#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see projectSierraModel.Capabilitty#getExtends()
	 * @see #getCapabilitty()
	 * @generated
	 */
	EReference getCapabilitty_Extends();

	/**
	 * Returns the meta object for the reference list '{@link projectSierraModel.Capabilitty#getIsExtendedBy <em>Is Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Extended By</em>'.
	 * @see projectSierraModel.Capabilitty#getIsExtendedBy()
	 * @see #getCapabilitty()
	 * @generated
	 */
	EReference getCapabilitty_IsExtendedBy();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Capabilitty#getIsImplementedBy <em>Is Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Implemented By</em>'.
	 * @see projectSierraModel.Capabilitty#getIsImplementedBy()
	 * @see #getCapabilitty()
	 * @generated
	 */
	EReference getCapabilitty_IsImplementedBy();

	/**
	 * Returns the meta object for the reference list '{@link projectSierraModel.Capabilitty#getInvolves <em>Involves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involves</em>'.
	 * @see projectSierraModel.Capabilitty#getInvolves()
	 * @see #getCapabilitty()
	 * @generated
	 */
	EReference getCapabilitty_Involves();

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.PortImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 8;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.InputImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 9;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.OuputImpl <em>Ouput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.OuputImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getOuput()
	 * @generated
	 */
	int OUPUT = 10;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ExchangeImpl <em>Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ExchangeImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getExchange()
	 * @generated
	 */
	int EXCHANGE = 5;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__CONTAINS = CONTAINABLE_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Is Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__IS_CONTAINED_IN = CONTAINABLE_ELEMENT__IS_CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__NAME = CONTAINABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sends To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__SENDS_TO = CONTAINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receives From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__RECEIVES_FROM = CONTAINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conveys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__CONVEYS = CONTAINABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_FEATURE_COUNT = CONTAINABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_OPERATION_COUNT = CONTAINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = EXCHANGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_PORT = EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_INPUT = EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Ouput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_OUPUT = EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_PERFORMED_BY = EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = EXCHANGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = EXCHANGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Port Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_PORT_OF = EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = EXCHANGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Is Port Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IS_PORT_OF = PORT__IS_PORT_OF;

	/**
	 * The feature id for the '<em><b>Is Input Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IS_INPUT_OF = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUPUT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Is Port Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUPUT__IS_PORT_OF = PORT__IS_PORT_OF;

	/**
	 * The feature id for the '<em><b>Is Ouput Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUPUT__IS_OUPUT_OF = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ouput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ouput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUPUT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMING_ELEMENT__PERFORMS = 0;

	/**
	 * The number of structural features of the '<em>Performing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMING_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Performing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEABLE_ELEMENT__SPECIALIZES = SPECIALIZABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEABLE_ELEMENT__IS_SPECIALIZED_BY = SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEABLE_ELEMENT__NAME = SPECIALIZABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Involved In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEABLE_ELEMENT__IS_INVOLVED_IN = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Involveable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEABLE_ELEMENT_FEATURE_COUNT = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Involveable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEABLE_ELEMENT_OPERATION_COUNT = SPECIALIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SPECIALIZES = INVOLVEABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_SPECIALIZED_BY = INVOLVEABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = INVOLVEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Involved In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_INVOLVED_IN = INVOLVEABLE_ELEMENT__IS_INVOLVED_IN;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PERFORMS = INVOLVEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = INVOLVEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = INVOLVEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SPECIALIZES = INVOLVEABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_SPECIALIZED_BY = INVOLVEABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = INVOLVEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Involved In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_INVOLVED_IN = INVOLVEABLE_ELEMENT__IS_INVOLVED_IN;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PERFORMS = INVOLVEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = INVOLVEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = INVOLVEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__CONTAINS = CONTAINABLE_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Is Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__IS_CONTAINED_IN = CONTAINABLE_ELEMENT__IS_CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__NAME = CONTAINABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__IMPLEMENTS = CONTAINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FEATURE_COUNT = CONTAINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_OPERATION_COUNT = CONTAINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link projectSierraModel.SpecializableElement <em>Specializable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specializable Element</em>'.
	 * @see projectSierraModel.SpecializableElement
	 * @generated
	 */
	EClass getSpecializableElement();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.SpecializableElement#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes</em>'.
	 * @see projectSierraModel.SpecializableElement#getSpecializes()
	 * @see #getSpecializableElement()
	 * @generated
	 */
	EReference getSpecializableElement_Specializes();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Specialized By</em>'.
	 * @see projectSierraModel.SpecializableElement#getIsSpecializedBy()
	 * @see #getSpecializableElement()
	 * @generated
	 */
	EReference getSpecializableElement_IsSpecializedBy();

	/**
	 * Returns the meta object for the attribute '{@link projectSierraModel.SpecializableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectSierraModel.SpecializableElement#getName()
	 * @see #getSpecializableElement()
	 * @generated
	 */
	EAttribute getSpecializableElement_Name();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.ContainableElement <em>Containable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containable Element</em>'.
	 * @see projectSierraModel.ContainableElement
	 * @generated
	 */
	EClass getContainableElement();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.ContainableElement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contains</em>'.
	 * @see projectSierraModel.ContainableElement#getContains()
	 * @see #getContainableElement()
	 * @generated
	 */
	EReference getContainableElement_Contains();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.ContainableElement#getIsContainedIn <em>Is Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Contained In</em>'.
	 * @see projectSierraModel.ContainableElement#getIsContainedIn()
	 * @see #getContainableElement()
	 * @generated
	 */
	EReference getContainableElement_IsContainedIn();

	/**
	 * Returns the meta object for the attribute '{@link projectSierraModel.ContainableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectSierraModel.ContainableElement#getName()
	 * @see #getContainableElement()
	 * @generated
	 */
	EAttribute getContainableElement_Name();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.ActivityDiagram <em>Activity Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Diagram</em>'.
	 * @see projectSierraModel.ActivityDiagram
	 * @generated
	 */
	EClass getActivityDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link projectSierraModel.ActivityDiagram#getContainableElements <em>Containable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containable Elements</em>'.
	 * @see projectSierraModel.ActivityDiagram#getContainableElements()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_ContainableElements();

	/**
	 * Returns the meta object for the containment reference list '{@link projectSierraModel.ActivityDiagram#getSpecializableElements <em>Specializable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializable Elements</em>'.
	 * @see projectSierraModel.ActivityDiagram#getSpecializableElements()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_SpecializableElements();

	/**
	 * Returns the meta object for the containment reference list '{@link projectSierraModel.ActivityDiagram#getExchangeElements <em>Exchange Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Elements</em>'.
	 * @see projectSierraModel.ActivityDiagram#getExchangeElements()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_ExchangeElements();

	/**
	 * Returns the meta object for the containment reference list '{@link projectSierraModel.ActivityDiagram#getPerformingElements <em>Performing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performing Elements</em>'.
	 * @see projectSierraModel.ActivityDiagram#getPerformingElements()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_PerformingElements();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.ExchangeElement <em>Exchange Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Element</em>'.
	 * @see projectSierraModel.ExchangeElement
	 * @generated
	 */
	EClass getExchangeElement();

	/**
	 * Returns the meta object for the attribute '{@link projectSierraModel.ExchangeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectSierraModel.ExchangeElement#getName()
	 * @see #getExchangeElement()
	 * @generated
	 */
	EAttribute getExchangeElement_Name();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see projectSierraModel.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see projectSierraModel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.PerformingElement <em>Performing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performing Element</em>'.
	 * @see projectSierraModel.PerformingElement
	 * @generated
	 */
	EClass getPerformingElement();

	/**
	 * Returns the meta object for the reference list '{@link projectSierraModel.PerformingElement#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performs</em>'.
	 * @see projectSierraModel.PerformingElement#getPerforms()
	 * @see #getPerformingElement()
	 * @generated
	 */
	EReference getPerformingElement_Performs();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.InvolveableElement <em>Involveable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Involveable Element</em>'.
	 * @see projectSierraModel.InvolveableElement
	 * @generated
	 */
	EClass getInvolveableElement();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.InvolveableElement#getIsInvolvedIn <em>Is Involved In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Involved In</em>'.
	 * @see projectSierraModel.InvolveableElement#getIsInvolvedIn()
	 * @see #getInvolveableElement()
	 * @generated
	 */
	EReference getInvolveableElement_IsInvolvedIn();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see projectSierraModel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Function#getHasPort <em>Has Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Port</em>'.
	 * @see projectSierraModel.Function#getHasPort()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasPort();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Function#getHasInput <em>Has Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Input</em>'.
	 * @see projectSierraModel.Function#getHasInput()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasInput();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Function#getHasOuput <em>Has Ouput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Ouput</em>'.
	 * @see projectSierraModel.Function#getHasOuput()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasOuput();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Function#getIsPerformedBy <em>Is Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Performed By</em>'.
	 * @see projectSierraModel.Function#getIsPerformedBy()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_IsPerformedBy();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see projectSierraModel.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Chain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain</em>'.
	 * @see projectSierraModel.Chain
	 * @generated
	 */
	EClass getChain();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Chain#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see projectSierraModel.Chain#getImplements()
	 * @see #getChain()
	 * @generated
	 */
	EReference getChain_Implements();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see projectSierraModel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Port#getIsPortOf <em>Is Port Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Port Of</em>'.
	 * @see projectSierraModel.Port#getIsPortOf()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_IsPortOf();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see projectSierraModel.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Input#getIsInputOf <em>Is Input Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Input Of</em>'.
	 * @see projectSierraModel.Input#getIsInputOf()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_IsInputOf();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Ouput <em>Ouput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ouput</em>'.
	 * @see projectSierraModel.Ouput
	 * @generated
	 */
	EClass getOuput();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Ouput#getIsOuputOf <em>Is Ouput Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Ouput Of</em>'.
	 * @see projectSierraModel.Ouput#getIsOuputOf()
	 * @see #getOuput()
	 * @generated
	 */
	EReference getOuput_IsOuputOf();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Exchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange</em>'.
	 * @see projectSierraModel.Exchange
	 * @generated
	 */
	EClass getExchange();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Exchange#getSendsTo <em>Sends To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sends To</em>'.
	 * @see projectSierraModel.Exchange#getSendsTo()
	 * @see #getExchange()
	 * @generated
	 */
	EReference getExchange_SendsTo();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Exchange#getReceivesFrom <em>Receives From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receives From</em>'.
	 * @see projectSierraModel.Exchange#getReceivesFrom()
	 * @see #getExchange()
	 * @generated
	 */
	EReference getExchange_ReceivesFrom();

	/**
	 * Returns the meta object for the containment reference '{@link projectSierraModel.Exchange#getConveys <em>Conveys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conveys</em>'.
	 * @see projectSierraModel.Exchange#getConveys()
	 * @see #getExchange()
	 * @generated
	 */
	EReference getExchange_Conveys();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjectSierraModelFactory getProjectSierraModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.CapabilittyImpl <em>Capabilitty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.CapabilittyImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getCapabilitty()
		 * @generated
		 */
		EClass CAPABILITTY = eINSTANCE.getCapabilitty();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITTY__INCLUDES = eINSTANCE.getCapabilitty_Includes();

		/**
		 * The meta object literal for the '<em><b>Is Included In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITTY__IS_INCLUDED_IN = eINSTANCE.getCapabilitty_IsIncludedIn();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITTY__EXTENDS = eINSTANCE.getCapabilitty_Extends();

		/**
		 * The meta object literal for the '<em><b>Is Extended By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITTY__IS_EXTENDED_BY = eINSTANCE.getCapabilitty_IsExtendedBy();

		/**
		 * The meta object literal for the '<em><b>Is Implemented By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITTY__IS_IMPLEMENTED_BY = eINSTANCE.getCapabilitty_IsImplementedBy();

		/**
		 * The meta object literal for the '<em><b>Involves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITTY__INVOLVES = eINSTANCE.getCapabilitty_Involves();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.SpecializableElementImpl <em>Specializable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.SpecializableElementImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getSpecializableElement()
		 * @generated
		 */
		EClass SPECIALIZABLE_ELEMENT = eINSTANCE.getSpecializableElement();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZABLE_ELEMENT__SPECIALIZES = eINSTANCE.getSpecializableElement_Specializes();

		/**
		 * The meta object literal for the '<em><b>Is Specialized By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY = eINSTANCE.getSpecializableElement_IsSpecializedBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZABLE_ELEMENT__NAME = eINSTANCE.getSpecializableElement_Name();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.ContainableElementImpl <em>Containable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.ContainableElementImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getContainableElement()
		 * @generated
		 */
		EClass CONTAINABLE_ELEMENT = eINSTANCE.getContainableElement();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINABLE_ELEMENT__CONTAINS = eINSTANCE.getContainableElement_Contains();

		/**
		 * The meta object literal for the '<em><b>Is Contained In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINABLE_ELEMENT__IS_CONTAINED_IN = eINSTANCE.getContainableElement_IsContainedIn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINABLE_ELEMENT__NAME = eINSTANCE.getContainableElement_Name();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.ActivityDiagramImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getActivityDiagram()
		 * @generated
		 */
		EClass ACTIVITY_DIAGRAM = eINSTANCE.getActivityDiagram();

		/**
		 * The meta object literal for the '<em><b>Containable Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__CONTAINABLE_ELEMENTS = eINSTANCE.getActivityDiagram_ContainableElements();

		/**
		 * The meta object literal for the '<em><b>Specializable Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__SPECIALIZABLE_ELEMENTS = eINSTANCE.getActivityDiagram_SpecializableElements();

		/**
		 * The meta object literal for the '<em><b>Exchange Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__EXCHANGE_ELEMENTS = eINSTANCE.getActivityDiagram_ExchangeElements();

		/**
		 * The meta object literal for the '<em><b>Performing Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__PERFORMING_ELEMENTS = eINSTANCE.getActivityDiagram_PerformingElements();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.ExchangeElementImpl <em>Exchange Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.ExchangeElementImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getExchangeElement()
		 * @generated
		 */
		EClass EXCHANGE_ELEMENT = eINSTANCE.getExchangeElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_ELEMENT__NAME = eINSTANCE.getExchangeElement_Name();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.ActorImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.EntityImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.PerformingElementImpl <em>Performing Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.PerformingElementImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getPerformingElement()
		 * @generated
		 */
		EClass PERFORMING_ELEMENT = eINSTANCE.getPerformingElement();

		/**
		 * The meta object literal for the '<em><b>Performs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMING_ELEMENT__PERFORMS = eINSTANCE.getPerformingElement_Performs();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.InvolveableElementImpl <em>Involveable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.InvolveableElementImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getInvolveableElement()
		 * @generated
		 */
		EClass INVOLVEABLE_ELEMENT = eINSTANCE.getInvolveableElement();

		/**
		 * The meta object literal for the '<em><b>Is Involved In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOLVEABLE_ELEMENT__IS_INVOLVED_IN = eINSTANCE.getInvolveableElement_IsInvolvedIn();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.FunctionImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Has Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_PORT = eINSTANCE.getFunction_HasPort();

		/**
		 * The meta object literal for the '<em><b>Has Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_INPUT = eINSTANCE.getFunction_HasInput();

		/**
		 * The meta object literal for the '<em><b>Has Ouput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_OUPUT = eINSTANCE.getFunction_HasOuput();

		/**
		 * The meta object literal for the '<em><b>Is Performed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__IS_PERFORMED_BY = eINSTANCE.getFunction_IsPerformedBy();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.ItemImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.ChainImpl <em>Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.ChainImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getChain()
		 * @generated
		 */
		EClass CHAIN = eINSTANCE.getChain();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN__IMPLEMENTS = eINSTANCE.getChain_Implements();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.PortImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Is Port Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__IS_PORT_OF = eINSTANCE.getPort_IsPortOf();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.InputImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Is Input Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__IS_INPUT_OF = eINSTANCE.getInput_IsInputOf();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.OuputImpl <em>Ouput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.OuputImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getOuput()
		 * @generated
		 */
		EClass OUPUT = eINSTANCE.getOuput();

		/**
		 * The meta object literal for the '<em><b>Is Ouput Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUPUT__IS_OUPUT_OF = eINSTANCE.getOuput_IsOuputOf();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.ExchangeImpl <em>Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.ExchangeImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getExchange()
		 * @generated
		 */
		EClass EXCHANGE = eINSTANCE.getExchange();

		/**
		 * The meta object literal for the '<em><b>Sends To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE__SENDS_TO = eINSTANCE.getExchange_SendsTo();

		/**
		 * The meta object literal for the '<em><b>Receives From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE__RECEIVES_FROM = eINSTANCE.getExchange_ReceivesFrom();

		/**
		 * The meta object literal for the '<em><b>Conveys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE__CONVEYS = eINSTANCE.getExchange_Conveys();

	}

} //ProjectSierraModelPackage
