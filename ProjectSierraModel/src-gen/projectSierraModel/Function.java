/**
 */
package projectSierraModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Function#getHasPort <em>Has Port</em>}</li>
 *   <li>{@link projectSierraModel.Function#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link projectSierraModel.Function#getHasOuput <em>Has Ouput</em>}</li>
 *   <li>{@link projectSierraModel.Function#getIsPerformedBy <em>Is Performed By</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Has Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Port#getIsPortOf <em>Is Port Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Port</em>' reference.
	 * @see #setHasPort(Port)
	 * @see projectSierraModel.ProjectSierraModelPackage#getFunction_HasPort()
	 * @see projectSierraModel.Port#getIsPortOf
	 * @model opposite="isPortOf"
	 * @generated
	 */
	Port getHasPort();

	/**
	 * Sets the value of the '{@link projectSierraModel.Function#getHasPort <em>Has Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Port</em>' reference.
	 * @see #getHasPort()
	 * @generated
	 */
	void setHasPort(Port value);

	/**
	 * Returns the value of the '<em><b>Has Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Input#getIsInputOf <em>Is Input Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input</em>' reference.
	 * @see #setHasInput(Input)
	 * @see projectSierraModel.ProjectSierraModelPackage#getFunction_HasInput()
	 * @see projectSierraModel.Input#getIsInputOf
	 * @model opposite="isInputOf"
	 * @generated
	 */
	Input getHasInput();

	/**
	 * Sets the value of the '{@link projectSierraModel.Function#getHasInput <em>Has Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Input</em>' reference.
	 * @see #getHasInput()
	 * @generated
	 */
	void setHasInput(Input value);

	/**
	 * Returns the value of the '<em><b>Has Ouput</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Ouput#getIsOuputOf <em>Is Ouput Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Ouput</em>' reference.
	 * @see #setHasOuput(Ouput)
	 * @see projectSierraModel.ProjectSierraModelPackage#getFunction_HasOuput()
	 * @see projectSierraModel.Ouput#getIsOuputOf
	 * @model opposite="isOuputOf"
	 * @generated
	 */
	Ouput getHasOuput();

	/**
	 * Sets the value of the '{@link projectSierraModel.Function#getHasOuput <em>Has Ouput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Ouput</em>' reference.
	 * @see #getHasOuput()
	 * @generated
	 */
	void setHasOuput(Ouput value);

	/**
	 * Returns the value of the '<em><b>Is Performed By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.PerformingElement#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Performed By</em>' reference.
	 * @see #setIsPerformedBy(PerformingElement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getFunction_IsPerformedBy()
	 * @see projectSierraModel.PerformingElement#getPerforms
	 * @model opposite="performs" required="true"
	 * @generated
	 */
	PerformingElement getIsPerformedBy();

	/**
	 * Sets the value of the '{@link projectSierraModel.Function#getIsPerformedBy <em>Is Performed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Performed By</em>' reference.
	 * @see #getIsPerformedBy()
	 * @generated
	 */
	void setIsPerformedBy(PerformingElement value);

} // Function
