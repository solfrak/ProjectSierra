/**
 */
package projectSierraModel;

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
 *   <li>{@link projectSierraModel.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getSpecializableElement()
 * @model abstract="true"
 * @generated
 */
public interface SpecializableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference.
	 * @see #setSpecializes(SpecializableElement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getSpecializableElement_Specializes()
	 * @see projectSierraModel.SpecializableElement#getIsSpecializedBy
	 * @model opposite="isSpecializedBy"
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
	 * Returns the value of the '<em><b>Is Specialized By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.SpecializableElement#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Specialized By</em>' reference.
	 * @see #setIsSpecializedBy(SpecializableElement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getSpecializableElement_IsSpecializedBy()
	 * @see projectSierraModel.SpecializableElement#getSpecializes
	 * @model opposite="specializes"
	 * @generated
	 */
	SpecializableElement getIsSpecializedBy();

	/**
	 * Sets the value of the '{@link projectSierraModel.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Specialized By</em>' reference.
	 * @see #getIsSpecializedBy()
	 * @generated
	 */
	void setIsSpecializedBy(SpecializableElement value);

} // SpecializableElement
