/**
 */
package projectSierraModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Involveable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.InvolveableElement#getIsInvolvedIn <em>Is Involved In</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getInvolveableElement()
 * @model abstract="true"
 * @generated
 */
public interface InvolveableElement extends SpecializableElement {
	/**
	 * Returns the value of the '<em><b>Is Involved In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capabilitty#getInvolves <em>Involves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Involved In</em>' reference.
	 * @see #setIsInvolvedIn(Capabilitty)
	 * @see projectSierraModel.ProjectSierraModelPackage#getInvolveableElement_IsInvolvedIn()
	 * @see projectSierraModel.Capabilitty#getInvolves
	 * @model opposite="involves" required="true"
	 * @generated
	 */
	Capabilitty getIsInvolvedIn();

	/**
	 * Sets the value of the '{@link projectSierraModel.InvolveableElement#getIsInvolvedIn <em>Is Involved In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Involved In</em>' reference.
	 * @see #getIsInvolvedIn()
	 * @generated
	 */
	void setIsInvolvedIn(Capabilitty value);

} // InvolveableElement
