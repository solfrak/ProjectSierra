/**
 */
package projectSierraModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Input#getIsInputOf <em>Is Input Of</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends Port {
	/**
	 * Returns the value of the '<em><b>Is Input Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Function#getHasInput <em>Has Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Input Of</em>' reference.
	 * @see #setIsInputOf(Function)
	 * @see projectSierraModel.ProjectSierraModelPackage#getInput_IsInputOf()
	 * @see projectSierraModel.Function#getHasInput
	 * @model opposite="hasInput"
	 * @generated
	 */
	Function getIsInputOf();

	/**
	 * Sets the value of the '{@link projectSierraModel.Input#getIsInputOf <em>Is Input Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Input Of</em>' reference.
	 * @see #getIsInputOf()
	 * @generated
	 */
	void setIsInputOf(Function value);

} // Input
