/**
 */
package projectSierraModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Exchange#getReceivesFrom <em>Receives From</em>}</li>
 *   <li>{@link projectSierraModel.Exchange#getIsConveyedBy <em>Is Conveyed By</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getExchange()
 * @model
 * @generated
 */
public interface Exchange extends ContainableElement {
	/**
	 * Returns the value of the '<em><b>Receives From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives From</em>' reference.
	 * @see #setReceivesFrom(ExchangingElement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getExchange_ReceivesFrom()
	 * @model
	 * @generated
	 */
	ExchangingElement getReceivesFrom();

	/**
	 * Sets the value of the '{@link projectSierraModel.Exchange#getReceivesFrom <em>Receives From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receives From</em>' reference.
	 * @see #getReceivesFrom()
	 * @generated
	 */
	void setReceivesFrom(ExchangingElement value);

	/**
	 * Returns the value of the '<em><b>Is Conveyed By</b></em>' reference list.
	 * The list contents are of type {@link projectSierraModel.Item}.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Item#getConveys <em>Conveys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Conveyed By</em>' reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getExchange_IsConveyedBy()
	 * @see projectSierraModel.Item#getConveys
	 * @model opposite="conveys"
	 * @generated
	 */
	EList<Item> getIsConveyedBy();

} // Exchange
