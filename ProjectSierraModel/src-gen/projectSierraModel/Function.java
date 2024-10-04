/**
 */
package projectSierraModel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link projectSierraModel.Function#getHasOutput <em>Has Output</em>}</li>
 *   <li>{@link projectSierraModel.Function#getIsPerformedBy <em>Is Performed By</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends ExchangingElement {
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
	 * Returns the value of the '<em><b>Has Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Output#getIsOutputOf <em>Is Output Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output</em>' reference.
	 * @see #setHasOutput(Output)
	 * @see projectSierraModel.ProjectSierraModelPackage#getFunction_HasOutput()
	 * @see projectSierraModel.Output#getIsOutputOf
	 * @model opposite="isOutputOf"
	 * @generated
	 */
	Output getHasOutput();

	/**
	 * Sets the value of the '{@link projectSierraModel.Function#getHasOutput <em>Has Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Output</em>' reference.
	 * @see #getHasOutput()
	 * @generated
	 */
	void setHasOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Is Performed By</b></em>' reference list.
	 * The list contents are of type {@link projectSierraModel.PerformingElement}.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.PerformingElement#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Performed By</em>' reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getFunction_IsPerformedBy()
	 * @see projectSierraModel.PerformingElement#getPerforms
	 * @model opposite="performs"
	 * @generated
	 */
	EList<PerformingElement> getIsPerformedBy();

} // Function
