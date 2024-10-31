/**
 */
package projectSierraModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capabilitty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Capabilitty#getIncludes <em>Includes</em>}</li>
 *   <li>{@link projectSierraModel.Capabilitty#getIsIncludedIn <em>Is Included In</em>}</li>
 *   <li>{@link projectSierraModel.Capabilitty#getExtends <em>Extends</em>}</li>
 *   <li>{@link projectSierraModel.Capabilitty#getIsExtendedBy <em>Is Extended By</em>}</li>
 *   <li>{@link projectSierraModel.Capabilitty#getIsImplementedBy <em>Is Implemented By</em>}</li>
 *   <li>{@link projectSierraModel.Capabilitty#getInvolves <em>Involves</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getCapabilitty()
 * @model
 * @generated
 */
public interface Capabilitty extends SpecializableElement {
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link projectSierraModel.Capabilitty}.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capabilitty#getIsIncludedIn <em>Is Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapabilitty_Includes()
	 * @see projectSierraModel.Capabilitty#getIsIncludedIn
	 * @model opposite="isIncludedIn"
	 * @generated
	 */
	EList<Capabilitty> getIncludes();

	/**
	 * Returns the value of the '<em><b>Is Included In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capabilitty#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Included In</em>' reference.
	 * @see #setIsIncludedIn(Capabilitty)
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapabilitty_IsIncludedIn()
	 * @see projectSierraModel.Capabilitty#getIncludes
	 * @model opposite="includes"
	 * @generated
	 */
	Capabilitty getIsIncludedIn();

	/**
	 * Sets the value of the '{@link projectSierraModel.Capabilitty#getIsIncludedIn <em>Is Included In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Included In</em>' reference.
	 * @see #getIsIncludedIn()
	 * @generated
	 */
	void setIsIncludedIn(Capabilitty value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capabilitty#getIsExtendedBy <em>Is Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Capabilitty)
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapabilitty_Extends()
	 * @see projectSierraModel.Capabilitty#getIsExtendedBy
	 * @model opposite="isExtendedBy"
	 * @generated
	 */
	Capabilitty getExtends();

	/**
	 * Sets the value of the '{@link projectSierraModel.Capabilitty#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Capabilitty value);

	/**
	 * Returns the value of the '<em><b>Is Extended By</b></em>' reference list.
	 * The list contents are of type {@link projectSierraModel.Capabilitty}.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capabilitty#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extended By</em>' reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapabilitty_IsExtendedBy()
	 * @see projectSierraModel.Capabilitty#getExtends
	 * @model opposite="extends"
	 * @generated
	 */
	EList<Capabilitty> getIsExtendedBy();

	/**
	 * Returns the value of the '<em><b>Is Implemented By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Chain#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Implemented By</em>' reference.
	 * @see #setIsImplementedBy(Chain)
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapabilitty_IsImplementedBy()
	 * @see projectSierraModel.Chain#getImplements
	 * @model opposite="implements" required="true"
	 * @generated
	 */
	Chain getIsImplementedBy();

	/**
	 * Sets the value of the '{@link projectSierraModel.Capabilitty#getIsImplementedBy <em>Is Implemented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Implemented By</em>' reference.
	 * @see #getIsImplementedBy()
	 * @generated
	 */
	void setIsImplementedBy(Chain value);

	/**
	 * Returns the value of the '<em><b>Involves</b></em>' reference list.
	 * The list contents are of type {@link projectSierraModel.InvolveableElement}.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.InvolveableElement#getIsInvolvedIn <em>Is Involved In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involves</em>' reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getCapabilitty_Involves()
	 * @see projectSierraModel.InvolveableElement#getIsInvolvedIn
	 * @model opposite="isInvolvedIn" required="true"
	 * @generated
	 */
	EList<InvolveableElement> getInvolves();

} // Capabilitty
