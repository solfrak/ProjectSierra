/**
 */
package projectSierraModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ouput</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Ouput#getIsOuputOf <em>Is Ouput Of</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getOuput()
 * @model
 * @generated
 */
public interface Ouput extends Port {
	/**
	 * Returns the value of the '<em><b>Is Ouput Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Function#getHasOuput <em>Has Ouput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ouput Of</em>' reference.
	 * @see #setIsOuputOf(Function)
	 * @see projectSierraModel.ProjectSierraModelPackage#getOuput_IsOuputOf()
	 * @see projectSierraModel.Function#getHasOuput
	 * @model opposite="hasOuput"
	 * @generated
	 */
	Function getIsOuputOf();

	/**
	 * Sets the value of the '{@link projectSierraModel.Ouput#getIsOuputOf <em>Is Ouput Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ouput Of</em>' reference.
	 * @see #getIsOuputOf()
	 * @generated
	 */
	void setIsOuputOf(Function value);

} // Ouput
