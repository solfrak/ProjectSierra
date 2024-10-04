/**
 */
package projectSierraModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Involvable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.InvolvableElement#getInvolvedIn <em>Involved In</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getInvolvableElement()
 * @model abstract="true"
 * @generated
 */
public interface InvolvableElement extends SpecializableElement, PerformingElement {
	/**
	 * Returns the value of the '<em><b>Involved In</b></em>' reference list.
	 * The list contents are of type {@link projectSierraModel.Capability}.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capability#getInvolves <em>Involves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved In</em>' reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getInvolvableElement_InvolvedIn()
	 * @see projectSierraModel.Capability#getInvolves
	 * @model opposite="involves"
	 * @generated
	 */
	EList<Capability> getInvolvedIn();

} // InvolvableElement
