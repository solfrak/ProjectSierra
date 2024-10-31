/**
 */
package projectSierraModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.ActivityDiagram#getContainableElements <em>Containable Elements</em>}</li>
 *   <li>{@link projectSierraModel.ActivityDiagram#getSpecializableElements <em>Specializable Elements</em>}</li>
 *   <li>{@link projectSierraModel.ActivityDiagram#getExchangeElements <em>Exchange Elements</em>}</li>
 *   <li>{@link projectSierraModel.ActivityDiagram#getPerformingElements <em>Performing Elements</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getActivityDiagram()
 * @model
 * @generated
 */
public interface ActivityDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Containable Elements</b></em>' containment reference list.
	 * The list contents are of type {@link projectSierraModel.ContainableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containable Elements</em>' containment reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getActivityDiagram_ContainableElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainableElement> getContainableElements();

	/**
	 * Returns the value of the '<em><b>Specializable Elements</b></em>' containment reference list.
	 * The list contents are of type {@link projectSierraModel.SpecializableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializable Elements</em>' containment reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getActivityDiagram_SpecializableElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecializableElement> getSpecializableElements();

	/**
	 * Returns the value of the '<em><b>Exchange Elements</b></em>' containment reference list.
	 * The list contents are of type {@link projectSierraModel.ExchangeElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Elements</em>' containment reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getActivityDiagram_ExchangeElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExchangeElement> getExchangeElements();

	/**
	 * Returns the value of the '<em><b>Performing Elements</b></em>' containment reference list.
	 * The list contents are of type {@link projectSierraModel.PerformingElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performing Elements</em>' containment reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getActivityDiagram_PerformingElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PerformingElement> getPerformingElements();

} // ActivityDiagram
