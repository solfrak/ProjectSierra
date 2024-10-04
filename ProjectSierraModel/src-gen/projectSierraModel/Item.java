/**
 */
package projectSierraModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Item#getConveys <em>Conveys</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Conveys</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Exchange#getIsConveyedBy <em>Is Conveyed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conveys</em>' reference.
	 * @see #setConveys(Exchange)
	 * @see projectSierraModel.ProjectSierraModelPackage#getItem_Conveys()
	 * @see projectSierraModel.Exchange#getIsConveyedBy
	 * @model opposite="isConveyedBy"
	 * @generated
	 */
	Exchange getConveys();

	/**
	 * Sets the value of the '{@link projectSierraModel.Item#getConveys <em>Conveys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conveys</em>' reference.
	 * @see #getConveys()
	 * @generated
	 */
	void setConveys(Exchange value);

} // Item
