/**
 */
package projectSierraModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Capability#getInvolves <em>Involves</em>}</li>
 *   <li>{@link projectSierraModel.Capability#getIncludes <em>Includes</em>}</li>
 *   <li>{@link projectSierraModel.Capability#getIsIncludedIn <em>Is Included In</em>}</li>
 *   <li>{@link projectSierraModel.Capability#getExtends <em>Extends</em>}</li>
 *   <li>{@link projectSierraModel.Capability#getIsExtendedBy <em>Is Extended By</em>}</li>
 *   <li>{@link projectSierraModel.Capability#getIsSupportedBy <em>Is Supported By</em>}</li>
 *   <li>{@link projectSierraModel.Capability#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends SpecializableElement {
	/**
	 * Returns the value of the '<em><b>Involves</b></em>' reference list.
	 * The list contents are of type {@link projectSierraModel.InvolvableElement}.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.InvolvableElement#getInvolvedIn <em>Involved In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involves</em>' reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapability_Involves()
	 * @see projectSierraModel.InvolvableElement#getInvolvedIn
	 * @model opposite="involvedIn"
	 * @generated
	 */
	EList<InvolvableElement> getInvolves();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capability#getIsIncludedIn <em>Is Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference.
	 * @see #setIncludes(Capability)
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapability_Includes()
	 * @see projectSierraModel.Capability#getIsIncludedIn
	 * @model opposite="isIncludedIn"
	 * @generated
	 */
	Capability getIncludes();

	/**
	 * Sets the value of the '{@link projectSierraModel.Capability#getIncludes <em>Includes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Includes</em>' reference.
	 * @see #getIncludes()
	 * @generated
	 */
	void setIncludes(Capability value);

	/**
	 * Returns the value of the '<em><b>Is Included In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capability#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Included In</em>' reference.
	 * @see #setIsIncludedIn(Capability)
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapability_IsIncludedIn()
	 * @see projectSierraModel.Capability#getIncludes
	 * @model opposite="includes"
	 * @generated
	 */
	Capability getIsIncludedIn();

	/**
	 * Sets the value of the '{@link projectSierraModel.Capability#getIsIncludedIn <em>Is Included In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Included In</em>' reference.
	 * @see #getIsIncludedIn()
	 * @generated
	 */
	void setIsIncludedIn(Capability value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link projectSierraModel.Capability}.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capability#getIsExtendedBy <em>Is Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapability_Extends()
	 * @see projectSierraModel.Capability#getIsExtendedBy
	 * @model opposite="isExtendedBy"
	 * @generated
	 */
	EList<Capability> getExtends();

	/**
	 * Returns the value of the '<em><b>Is Extended By</b></em>' reference list.
	 * The list contents are of type {@link projectSierraModel.Capability}.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capability#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extended By</em>' reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapability_IsExtendedBy()
	 * @see projectSierraModel.Capability#getExtends
	 * @model opposite="extends"
	 * @generated
	 */
	EList<Capability> getIsExtendedBy();

	/**
	 * Returns the value of the '<em><b>Is Supported By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.System#getSupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Supported By</em>' reference.
	 * @see #setIsSupportedBy(projectSierraModel.System)
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapability_IsSupportedBy()
	 * @see projectSierraModel.System#getSupport
	 * @model opposite="support"
	 * @generated
	 */
	projectSierraModel.System getIsSupportedBy();

	/**
	 * Sets the value of the '{@link projectSierraModel.Capability#getIsSupportedBy <em>Is Supported By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Supported By</em>' reference.
	 * @see #getIsSupportedBy()
	 * @generated
	 */
	void setIsSupportedBy(projectSierraModel.System value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Chain#getIsImplementedBy <em>Is Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(Chain)
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapability_Implements()
	 * @see projectSierraModel.Chain#getIsImplementedBy
	 * @model opposite="isImplementedBy"
	 * @generated
	 */
	Chain getImplements();

	/**
	 * Sets the value of the '{@link projectSierraModel.Capability#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(Chain value);

} // Capability
