/**
 */
package projectSierraModel;

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
 *   <li>{@link projectSierraModel.ContainableElement#getContainedIn <em>Contained In</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getContainableElement()
 * @model abstract="true"
 * @generated
 */
public interface ContainableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.ContainableElement#getContainedIn <em>Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference.
	 * @see #setContains(ContainableElement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getContainableElement_Contains()
	 * @see projectSierraModel.ContainableElement#getContainedIn
	 * @model opposite="containedIn"
	 * @generated
	 */
	ContainableElement getContains();

	/**
	 * Sets the value of the '{@link projectSierraModel.ContainableElement#getContains <em>Contains</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(ContainableElement value);

	/**
	 * Returns the value of the '<em><b>Contained In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.ContainableElement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In</em>' reference.
	 * @see #setContainedIn(ContainableElement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getContainableElement_ContainedIn()
	 * @see projectSierraModel.ContainableElement#getContains
	 * @model opposite="contains"
	 * @generated
	 */
	ContainableElement getContainedIn();

	/**
	 * Sets the value of the '{@link projectSierraModel.ContainableElement#getContainedIn <em>Contained In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained In</em>' reference.
	 * @see #getContainedIn()
	 * @generated
	 */
	void setContainedIn(ContainableElement value);

} // ContainableElement