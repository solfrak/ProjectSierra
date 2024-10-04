/**
 */
package projectSierraModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Output#getIsOutputOf <em>Is Output Of</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends Port {
	/**
	 * Returns the value of the '<em><b>Is Output Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Function#getHasOutput <em>Has Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Output Of</em>' reference.
	 * @see #setIsOutputOf(Function)
	 * @see projectSierraModel.ProjectSierraModelPackage#getOutput_IsOutputOf()
	 * @see projectSierraModel.Function#getHasOutput
	 * @model opposite="hasOutput"
	 * @generated
	 */
	Function getIsOutputOf();

	/**
	 * Sets the value of the '{@link projectSierraModel.Output#getIsOutputOf <em>Is Output Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Output Of</em>' reference.
	 * @see #getIsOutputOf()
	 * @generated
	 */
	void setIsOutputOf(Function value);

} // Output
