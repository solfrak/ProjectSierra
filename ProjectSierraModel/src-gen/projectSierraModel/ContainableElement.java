/**
 */
package projectSierraModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.ContainableElement#getContains <em>Contains</em>}</li>
 *   <li>{@link projectSierraModel.ContainableElement#getIsContainedIn <em>Is Contained In</em>}</li>
 *   <li>{@link projectSierraModel.ContainableElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getContainableElement()
 * @model abstract="true"
 * @generated
 */
public interface ContainableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link projectSierraModel.ContainableElement}.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.ContainableElement#getIsContainedIn <em>Is Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getContainableElement_Contains()
	 * @see projectSierraModel.ContainableElement#getIsContainedIn
	 * @model opposite="isContainedIn"
	 * @generated
	 */
	EList<ContainableElement> getContains();

	/**
	 * Returns the value of the '<em><b>Is Contained In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.ContainableElement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Contained In</em>' reference.
	 * @see #setIsContainedIn(ContainableElement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getContainableElement_IsContainedIn()
	 * @see projectSierraModel.ContainableElement#getContains
	 * @model opposite="contains"
	 * @generated
	 */
	ContainableElement getIsContainedIn();

	/**
	 * Sets the value of the '{@link projectSierraModel.ContainableElement#getIsContainedIn <em>Is Contained In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Contained In</em>' reference.
	 * @see #getIsContainedIn()
	 * @generated
	 */
	void setIsContainedIn(ContainableElement value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projectSierraModel.ProjectSierraModelPackage#getContainableElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projectSierraModel.ContainableElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ContainableElement
