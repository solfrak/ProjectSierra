/**
 */
package projectSierraModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Chain#getIsImplementedBy <em>Is Implemented By</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getChain()
 * @model
 * @generated
 */
public interface Chain extends ContainableElement {
	/**
	 * Returns the value of the '<em><b>Is Implemented By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capability#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Implemented By</em>' reference.
	 * @see #setIsImplementedBy(Capability)
	 * @see projectSierraModel.ProjectSierraModelPackage#getChain_IsImplementedBy()
	 * @see projectSierraModel.Capability#getImplements
	 * @model opposite="implements"
	 * @generated
	 */
	Capability getIsImplementedBy();

	/**
	 * Sets the value of the '{@link projectSierraModel.Chain#getIsImplementedBy <em>Is Implemented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Implemented By</em>' reference.
	 * @see #getIsImplementedBy()
	 * @generated
	 */
	void setIsImplementedBy(Capability value);

} // Chain
