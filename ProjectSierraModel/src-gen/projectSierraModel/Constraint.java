/**
 */
package projectSierraModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Constraint#getHasExpression <em>Has Expression</em>}</li>
 *   <li>{@link projectSierraModel.Constraint#getIsExpressedIn <em>Is Expressed In</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Expression</em>' attribute.
	 * @see #setHasExpression(String)
	 * @see projectSierraModel.ProjectSierraModelPackage#getConstraint_HasExpression()
	 * @model
	 * @generated
	 */
	String getHasExpression();

	/**
	 * Sets the value of the '{@link projectSierraModel.Constraint#getHasExpression <em>Has Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Expression</em>' attribute.
	 * @see #getHasExpression()
	 * @generated
	 */
	void setHasExpression(String value);

	/**
	 * Returns the value of the '<em><b>Is Expressed In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Expressed In</em>' attribute.
	 * @see #setIsExpressedIn(String)
	 * @see projectSierraModel.ProjectSierraModelPackage#getConstraint_IsExpressedIn()
	 * @model
	 * @generated
	 */
	String getIsExpressedIn();

	/**
	 * Sets the value of the '{@link projectSierraModel.Constraint#getIsExpressedIn <em>Is Expressed In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Expressed In</em>' attribute.
	 * @see #getIsExpressedIn()
	 * @generated
	 */
	void setIsExpressedIn(String value);

} // Constraint
