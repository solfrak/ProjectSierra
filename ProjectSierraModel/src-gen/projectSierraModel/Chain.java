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
 *   <li>{@link projectSierraModel.Chain#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getChain()
 * @model
 * @generated
 */
public interface Chain extends ContainableElement {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capabilitty#getIsImplementedBy <em>Is Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(Capabilitty)
	 * @see projectSierraModel.ProjectSierraModelPackage#getChain_Implements()
	 * @see projectSierraModel.Capabilitty#getIsImplementedBy
	 * @model opposite="isImplementedBy"
	 * @generated
	 */
	Capabilitty getImplements();

	/**
	 * Sets the value of the '{@link projectSierraModel.Chain#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(Capabilitty value);

} // Chain
