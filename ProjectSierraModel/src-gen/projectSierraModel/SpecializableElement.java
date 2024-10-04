/**
 */
package projectSierraModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specializable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.SpecializableElement#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link projectSierraModel.SpecializableElement#getIsSpcecializedBy <em>Is Spcecialized By</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getSpecializableElement()
 * @model abstract="true"
 * @generated
 */
public interface SpecializableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.SpecializableElement#getIsSpcecializedBy <em>Is Spcecialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference.
	 * @see #setSpecializes(SpecializableElement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getSpecializableElement_Specializes()
	 * @see projectSierraModel.SpecializableElement#getIsSpcecializedBy
	 * @model opposite="isSpcecializedBy" transient="true"
	 * @generated
	 */
	SpecializableElement getSpecializes();

	/**
	 * Sets the value of the '{@link projectSierraModel.SpecializableElement#getSpecializes <em>Specializes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializes</em>' reference.
	 * @see #getSpecializes()
	 * @generated
	 */
	void setSpecializes(SpecializableElement value);

	/**
	 * Returns the value of the '<em><b>Is Spcecialized By</b></em>' reference list.
	 * The list contents are of type {@link projectSierraModel.SpecializableElement}.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.SpecializableElement#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Spcecialized By</em>' reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getSpecializableElement_IsSpcecializedBy()
	 * @see projectSierraModel.SpecializableElement#getSpecializes
	 * @model opposite="specializes" transient="true"
	 * @generated
	 */
	EList<SpecializableElement> getIsSpcecializedBy();

} // SpecializableElement
