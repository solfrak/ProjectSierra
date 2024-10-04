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
	int SPECIALIZABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT__SPECIALIZES = 0;

	/**
	 * The feature id for the '<em><b>Is Spcecialized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY = 1;

	/**
	 * The number of structural features of the '<em>Specializable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specializable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ContainableElementImpl <em>Containable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ContainableElementImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getContainableElement()
	 * @generated
	 */
	int CONTAINABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT__CONTAINED_IN = 1;

	/**
	 * The number of structural features of the '<em>Containable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Containable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ConstraintImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Has Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__HAS_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Is Expressed In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__IS_EXPRESSED_IN = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.CapabilityImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 3;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SPECIALIZES = SPECIALIZABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Spcecialized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_SPCECIALIZED_BY = SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Involves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INVOLVES = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INCLUDES = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Included In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_INCLUDED_IN = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__EXTENDS = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Extended By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_EXTENDED_BY = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Supported By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_SUPPORTED_BY = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IMPLEMENTS = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = SPECIALIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.InvolvableElementImpl <em>Involvable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.InvolvableElementImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getInvolvableElement()
	 * @generated
	 */
	int INVOLVABLE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__SPECIALIZES = SPECIALIZABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Spcecialized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__IS_SPCECIALIZED_BY = SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__PERFORMS = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Involved In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__INVOLVED_IN = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Involvable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT_FEATURE_COUNT = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Involvable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT_OPERATION_COUNT = SPECIALIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ActorImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 5;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SPECIALIZES = INVOLVABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Spcecialized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_SPCECIALIZED_BY = INVOLVABLE_ELEMENT__IS_SPCECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PERFORMS = INVOLVABLE_ELEMENT__PERFORMS;

	/**
	 * The feature id for the '<em><b>Involved In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INVOLVED_IN = INVOLVABLE_ELEMENT__INVOLVED_IN;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = INVOLVABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = INVOLVABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.EntityImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SPECIALIZES = INVOLVABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Spcecialized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_SPCECIALIZED_BY = INVOLVABLE_ELEMENT__IS_SPCECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PERFORMS = INVOLVABLE_ELEMENT__PERFORMS;

	/**
	 * The feature id for the '<em><b>Involved In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INVOLVED_IN = INVOLVABLE_ELEMENT__INVOLVED_IN;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = INVOLVABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = INVOLVABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ComponentImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTAINS = CONTAINABLE_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTAINED_IN = CONTAINABLE_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PERFORMS = CONTAINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CONTAINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = CONTAINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.SystemImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINS = COMPONENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTAINED_IN = COMPONENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PERFORMS = COMPONENT__PERFORMS;

	/**
	 * The feature id for the '<em><b>Support</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUPPORT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.PerformingElementImpl <em>Performing Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.PerformingElementImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getPerformingElement()
	 * @generated
	 */
	int PERFORMING_ELEMENT = 9;

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
	 * The meta object id for the '{@link projectSierraModel.impl.ExchangingElementImpl <em>Exchanging Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ExchangingElementImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getExchangingElement()
	 * @generated
	 */
	int EXCHANGING_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Sends To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGING_ELEMENT__SENDS_TO = 0;

	/**
	 * The number of structural features of the '<em>Exchanging Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGING_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exchanging Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.FunctionImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 11;

	/**
	 * The feature id for the '<em><b>Sends To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SENDS_TO = EXCHANGING_ELEMENT__SENDS_TO;

	/**
	 * The feature id for the '<em><b>Has Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_PORT = EXCHANGING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_INPUT = EXCHANGING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_OUTPUT = EXCHANGING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Performed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_PERFORMED_BY = EXCHANGING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = EXCHANGING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = EXCHANGING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ItemImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 12;

	/**
	 * The feature id for the '<em><b>Conveys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CONVEYS = 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ChainImpl <em>Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ChainImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getChain()
	 * @generated
	 */
	int CHAIN = 13;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__CONTAINS = CONTAINABLE_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__CONTAINED_IN = CONTAINABLE_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Is Implemented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__IS_IMPLEMENTED_BY = CONTAINABLE_ELEMENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link projectSierraModel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.PortImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 14;

	/**
	 * The feature id for the '<em><b>Sends To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SENDS_TO = EXCHANGING_ELEMENT__SENDS_TO;

	/**
	 * The feature id for the '<em><b>Is Port Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_PORT_OF = EXCHANGING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = EXCHANGING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = EXCHANGING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.InputImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 15;

	/**
	 * The feature id for the '<em><b>Sends To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SENDS_TO = PORT__SENDS_TO;

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
	 * The meta object id for the '{@link projectSierraModel.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.OutputImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 16;

	/**
	 * The feature id for the '<em><b>Sends To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__SENDS_TO = PORT__SENDS_TO;

	/**
	 * The feature id for the '<em><b>Is Port Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IS_PORT_OF = PORT__IS_PORT_OF;

	/**
	 * The feature id for the '<em><b>Is Output Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IS_OUTPUT_OF = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.ExchangeImpl <em>Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.ExchangeImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getExchange()
	 * @generated
	 */
	int EXCHANGE = 17;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__CONTAINS = CONTAINABLE_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__CONTAINED_IN = CONTAINABLE_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Receives From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__RECEIVES_FROM = CONTAINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Conveyed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__IS_CONVEYED_BY = CONTAINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_FEATURE_COUNT = CONTAINABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_OPERATION_COUNT = CONTAINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.RequirementImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 18;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONTAINS = CONTAINABLE_ELEMENT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONTAINED_IN = CONTAINABLE_ELEMENT__CONTAINED_IN;

	/**
	 * The feature id for the '<em><b>Has Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__HAS_RATIONALE = CONTAINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__HAS_CONSTRAINT = CONTAINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Derives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVES = CONTAINABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Derived From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_DERIVED_FROM = CONTAINABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFINES = CONTAINABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Refined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_REFINED_BY = CONTAINABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Specifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SPECIFIES = CONTAINABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Justifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__JUSTIFIES = CONTAINABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = CONTAINABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = CONTAINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectSierraModel.impl.DesignElementImpl <em>Design Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectSierraModel.impl.DesignElementImpl
	 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getDesignElement()
	 * @generated
	 */
	int DESIGN_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Is Specified By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__IS_SPECIFIED_BY = 0;

	/**
	 * The feature id for the '<em><b>Is Justified By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__IS_JUSTIFIED_BY = 1;

	/**
	 * The number of structural features of the '<em>Design Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Design Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the reference list '{@link projectSierraModel.SpecializableElement#getIsSpcecializedBy <em>Is Spcecialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Spcecialized By</em>'.
	 * @see projectSierraModel.SpecializableElement#getIsSpcecializedBy()
	 * @see #getSpecializableElement()
	 * @generated
	 */
	EReference getSpecializableElement_IsSpcecializedBy();

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
	 * Returns the meta object for the reference '{@link projectSierraModel.ContainableElement#getContainedIn <em>Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contained In</em>'.
	 * @see projectSierraModel.ContainableElement#getContainedIn()
	 * @see #getContainableElement()
	 * @generated
	 */
	EReference getContainableElement_ContainedIn();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see projectSierraModel.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link projectSierraModel.Constraint#getHasExpression <em>Has Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Expression</em>'.
	 * @see projectSierraModel.Constraint#getHasExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_HasExpression();

	/**
	 * Returns the meta object for the attribute '{@link projectSierraModel.Constraint#getIsExpressedIn <em>Is Expressed In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Expressed In</em>'.
	 * @see projectSierraModel.Constraint#getIsExpressedIn()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_IsExpressedIn();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see projectSierraModel.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the reference list '{@link projectSierraModel.Capability#getInvolves <em>Involves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involves</em>'.
	 * @see projectSierraModel.Capability#getInvolves()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Involves();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Capability#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Includes</em>'.
	 * @see projectSierraModel.Capability#getIncludes()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Includes();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Capability#getIsIncludedIn <em>Is Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Included In</em>'.
	 * @see projectSierraModel.Capability#getIsIncludedIn()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_IsIncludedIn();

	/**
	 * Returns the meta object for the reference list '{@link projectSierraModel.Capability#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see projectSierraModel.Capability#getExtends()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Extends();

	/**
	 * Returns the meta object for the reference list '{@link projectSierraModel.Capability#getIsExtendedBy <em>Is Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Extended By</em>'.
	 * @see projectSierraModel.Capability#getIsExtendedBy()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_IsExtendedBy();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Capability#getIsSupportedBy <em>Is Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Supported By</em>'.
	 * @see projectSierraModel.Capability#getIsSupportedBy()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_IsSupportedBy();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Capability#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see projectSierraModel.Capability#getImplements()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Implements();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.InvolvableElement <em>Involvable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Involvable Element</em>'.
	 * @see projectSierraModel.InvolvableElement
	 * @generated
	 */
	EClass getInvolvableElement();

	/**
	 * Returns the meta object for the reference list '{@link projectSierraModel.InvolvableElement#getInvolvedIn <em>Involved In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved In</em>'.
	 * @see projectSierraModel.InvolvableElement#getInvolvedIn()
	 * @see #getInvolvableElement()
	 * @generated
	 */
	EReference getInvolvableElement_InvolvedIn();

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
	 * Returns the meta object for class '{@link projectSierraModel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see projectSierraModel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see projectSierraModel.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.System#getSupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Support</em>'.
	 * @see projectSierraModel.System#getSupport()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Support();

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
	 * Returns the meta object for class '{@link projectSierraModel.ExchangingElement <em>Exchanging Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchanging Element</em>'.
	 * @see projectSierraModel.ExchangingElement
	 * @generated
	 */
	EClass getExchangingElement();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.ExchangingElement#getSendsTo <em>Sends To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sends To</em>'.
	 * @see projectSierraModel.ExchangingElement#getSendsTo()
	 * @see #getExchangingElement()
	 * @generated
	 */
	EReference getExchangingElement_SendsTo();

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
	 * Returns the meta object for the reference '{@link projectSierraModel.Function#getHasOutput <em>Has Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Output</em>'.
	 * @see projectSierraModel.Function#getHasOutput()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasOutput();

	/**
	 * Returns the meta object for the reference list '{@link projectSierraModel.Function#getIsPerformedBy <em>Is Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Performed By</em>'.
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
	 * Returns the meta object for the reference '{@link projectSierraModel.Item#getConveys <em>Conveys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conveys</em>'.
	 * @see projectSierraModel.Item#getConveys()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Conveys();

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
	 * Returns the meta object for the reference '{@link projectSierraModel.Chain#getIsImplementedBy <em>Is Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Implemented By</em>'.
	 * @see projectSierraModel.Chain#getIsImplementedBy()
	 * @see #getChain()
	 * @generated
	 */
	EReference getChain_IsImplementedBy();

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
	 * Returns the meta object for class '{@link projectSierraModel.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see projectSierraModel.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Output#getIsOutputOf <em>Is Output Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Output Of</em>'.
	 * @see projectSierraModel.Output#getIsOutputOf()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_IsOutputOf();

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
	 * Returns the meta object for the reference list '{@link projectSierraModel.Exchange#getIsConveyedBy <em>Is Conveyed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Conveyed By</em>'.
	 * @see projectSierraModel.Exchange#getIsConveyedBy()
	 * @see #getExchange()
	 * @generated
	 */
	EReference getExchange_IsConveyedBy();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see projectSierraModel.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link projectSierraModel.Requirement#getHasRationale <em>Has Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Rationale</em>'.
	 * @see projectSierraModel.Requirement#getHasRationale()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_HasRationale();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Requirement#getHasConstraint <em>Has Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Constraint</em>'.
	 * @see projectSierraModel.Requirement#getHasConstraint()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_HasConstraint();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Requirement#getDerives <em>Derives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derives</em>'.
	 * @see projectSierraModel.Requirement#getDerives()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Derives();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Requirement#getIsDerivedFrom <em>Is Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Derived From</em>'.
	 * @see projectSierraModel.Requirement#getIsDerivedFrom()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_IsDerivedFrom();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Requirement#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see projectSierraModel.Requirement#getRefines()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Refines();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Requirement#getIsRefinedBy <em>Is Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Refined By</em>'.
	 * @see projectSierraModel.Requirement#getIsRefinedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_IsRefinedBy();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Requirement#getSpecifies <em>Specifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specifies</em>'.
	 * @see projectSierraModel.Requirement#getSpecifies()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Specifies();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.Requirement#getJustifies <em>Justifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Justifies</em>'.
	 * @see projectSierraModel.Requirement#getJustifies()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Justifies();

	/**
	 * Returns the meta object for class '{@link projectSierraModel.DesignElement <em>Design Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Element</em>'.
	 * @see projectSierraModel.DesignElement
	 * @generated
	 */
	EClass getDesignElement();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.DesignElement#getIsSpecifiedBy <em>Is Specified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Specified By</em>'.
	 * @see projectSierraModel.DesignElement#getIsSpecifiedBy()
	 * @see #getDesignElement()
	 * @generated
	 */
	EReference getDesignElement_IsSpecifiedBy();

	/**
	 * Returns the meta object for the reference '{@link projectSierraModel.DesignElement#getIsJustifiedBy <em>Is Justified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Justified By</em>'.
	 * @see projectSierraModel.DesignElement#getIsJustifiedBy()
	 * @see #getDesignElement()
	 * @generated
	 */
	EReference getDesignElement_IsJustifiedBy();

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
		 * The meta object literal for the '<em><b>Is Spcecialized By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZABLE_ELEMENT__IS_SPCECIALIZED_BY = eINSTANCE.getSpecializableElement_IsSpcecializedBy();

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
		 * The meta object literal for the '<em><b>Contained In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINABLE_ELEMENT__CONTAINED_IN = eINSTANCE.getContainableElement_ContainedIn();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.ConstraintImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Has Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__HAS_EXPRESSION = eINSTANCE.getConstraint_HasExpression();

		/**
		 * The meta object literal for the '<em><b>Is Expressed In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__IS_EXPRESSED_IN = eINSTANCE.getConstraint_IsExpressedIn();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.CapabilityImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Involves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__INVOLVES = eINSTANCE.getCapability_Involves();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__INCLUDES = eINSTANCE.getCapability_Includes();

		/**
		 * The meta object literal for the '<em><b>Is Included In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__IS_INCLUDED_IN = eINSTANCE.getCapability_IsIncludedIn();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__EXTENDS = eINSTANCE.getCapability_Extends();

		/**
		 * The meta object literal for the '<em><b>Is Extended By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__IS_EXTENDED_BY = eINSTANCE.getCapability_IsExtendedBy();

		/**
		 * The meta object literal for the '<em><b>Is Supported By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__IS_SUPPORTED_BY = eINSTANCE.getCapability_IsSupportedBy();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__IMPLEMENTS = eINSTANCE.getCapability_Implements();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.InvolvableElementImpl <em>Involvable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.InvolvableElementImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getInvolvableElement()
		 * @generated
		 */
		EClass INVOLVABLE_ELEMENT = eINSTANCE.getInvolvableElement();

		/**
		 * The meta object literal for the '<em><b>Involved In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOLVABLE_ELEMENT__INVOLVED_IN = eINSTANCE.getInvolvableElement_InvolvedIn();

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
		 * The meta object literal for the '{@link projectSierraModel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.ComponentImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.SystemImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Support</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SUPPORT = eINSTANCE.getSystem_Support();

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
		 * The meta object literal for the '{@link projectSierraModel.impl.ExchangingElementImpl <em>Exchanging Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.ExchangingElementImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getExchangingElement()
		 * @generated
		 */
		EClass EXCHANGING_ELEMENT = eINSTANCE.getExchangingElement();

		/**
		 * The meta object literal for the '<em><b>Sends To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGING_ELEMENT__SENDS_TO = eINSTANCE.getExchangingElement_SendsTo();

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
		 * The meta object literal for the '<em><b>Has Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_OUTPUT = eINSTANCE.getFunction_HasOutput();

		/**
		 * The meta object literal for the '<em><b>Is Performed By</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Conveys</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__CONVEYS = eINSTANCE.getItem_Conveys();

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
		 * The meta object literal for the '<em><b>Is Implemented By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN__IS_IMPLEMENTED_BY = eINSTANCE.getChain_IsImplementedBy();

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
		 * The meta object literal for the '{@link projectSierraModel.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.OutputImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Is Output Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__IS_OUTPUT_OF = eINSTANCE.getOutput_IsOutputOf();

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
		 * The meta object literal for the '<em><b>Receives From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE__RECEIVES_FROM = eINSTANCE.getExchange_ReceivesFrom();

		/**
		 * The meta object literal for the '<em><b>Is Conveyed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE__IS_CONVEYED_BY = eINSTANCE.getExchange_IsConveyedBy();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.RequirementImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Has Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__HAS_RATIONALE = eINSTANCE.getRequirement_HasRationale();

		/**
		 * The meta object literal for the '<em><b>Has Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__HAS_CONSTRAINT = eINSTANCE.getRequirement_HasConstraint();

		/**
		 * The meta object literal for the '<em><b>Derives</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DERIVES = eINSTANCE.getRequirement_Derives();

		/**
		 * The meta object literal for the '<em><b>Is Derived From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__IS_DERIVED_FROM = eINSTANCE.getRequirement_IsDerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REFINES = eINSTANCE.getRequirement_Refines();

		/**
		 * The meta object literal for the '<em><b>Is Refined By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__IS_REFINED_BY = eINSTANCE.getRequirement_IsRefinedBy();

		/**
		 * The meta object literal for the '<em><b>Specifies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SPECIFIES = eINSTANCE.getRequirement_Specifies();

		/**
		 * The meta object literal for the '<em><b>Justifies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__JUSTIFIES = eINSTANCE.getRequirement_Justifies();

		/**
		 * The meta object literal for the '{@link projectSierraModel.impl.DesignElementImpl <em>Design Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectSierraModel.impl.DesignElementImpl
		 * @see projectSierraModel.impl.ProjectSierraModelPackageImpl#getDesignElement()
		 * @generated
		 */
		EClass DESIGN_ELEMENT = eINSTANCE.getDesignElement();

		/**
		 * The meta object literal for the '<em><b>Is Specified By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ELEMENT__IS_SPECIFIED_BY = eINSTANCE.getDesignElement_IsSpecifiedBy();

		/**
		 * The meta object literal for the '<em><b>Is Justified By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ELEMENT__IS_JUSTIFIED_BY = eINSTANCE.getDesignElement_IsJustifiedBy();

	}

} //ProjectSierraModelPackage
