/**
 */
package projectSierraModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Port#getIsPortOf <em>Is Port Of</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends ExchangingElement {
	/**
	 * Returns the value of the '<em><b>Is Port Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Function#getHasPort <em>Has Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Port Of</em>' reference.
	 * @see #setIsPortOf(Function)
	 * @see projectSierraModel.ProjectSierraModelPackage#getPort_IsPortOf()
	 * @see projectSierraModel.Function#getHasPort
	 * @model opposite="hasPort"
	 * @generated
	 */
	Function getIsPortOf();

	/**
	 * Sets the value of the '{@link projectSierraModel.Port#getIsPortOf <em>Is Port Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Port Of</em>' reference.
	 * @see #getIsPortOf()
	 * @generated
	 */
	void setIsPortOf(Function value);

} // Port
