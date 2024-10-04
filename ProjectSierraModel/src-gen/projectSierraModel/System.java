/**
 */
package projectSierraModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.System#getSupport <em>Support</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Component {
	/**
	 * Returns the value of the '<em><b>Support</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Capability#getIsSupportedBy <em>Is Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support</em>' reference.
	 * @see #setSupport(Capability)
	 * @see projectSierraModel.ProjectSierraModelPackage#getSystem_Support()
	 * @see projectSierraModel.Capability#getIsSupportedBy
	 * @model opposite="isSupportedBy"
	 * @generated
	 */
	Capability getSupport();

	/**
	 * Sets the value of the '{@link projectSierraModel.System#getSupport <em>Support</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support</em>' reference.
	 * @see #getSupport()
	 * @generated
	 */
	void setSupport(Capability value);

} // System
