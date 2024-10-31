/**
 */
package projectSierraModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Exchange#getSendsTo <em>Sends To</em>}</li>
 *   <li>{@link projectSierraModel.Exchange#getReceivesFrom <em>Receives From</em>}</li>
 *   <li>{@link projectSierraModel.Exchange#getConveys <em>Conveys</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getExchange()
 * @model
 * @generated
 */
public interface Exchange extends ContainableElement {
	/**
	 * Returns the value of the '<em><b>Sends To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends To</em>' reference.
	 * @see #setSendsTo(ExchangeElement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getExchange_SendsTo()
	 * @model required="true"
	 * @generated
	 */
	ExchangeElement getSendsTo();

	/**
	 * Sets the value of the '{@link projectSierraModel.Exchange#getSendsTo <em>Sends To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sends To</em>' reference.
	 * @see #getSendsTo()
	 * @generated
	 */
	void setSendsTo(ExchangeElement value);

	/**
	 * Returns the value of the '<em><b>Receives From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives From</em>' reference.
	 * @see #setReceivesFrom(ExchangeElement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getExchange_ReceivesFrom()
	 * @model required="true"
	 * @generated
	 */
	ExchangeElement getReceivesFrom();

	/**
	 * Sets the value of the '{@link projectSierraModel.Exchange#getReceivesFrom <em>Receives From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receives From</em>' reference.
	 * @see #getReceivesFrom()
	 * @generated
	 */
	void setReceivesFrom(ExchangeElement value);

	/**
	 * Returns the value of the '<em><b>Conveys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conveys</em>' containment reference.
	 * @see #setConveys(Item)
	 * @see projectSierraModel.ProjectSierraModelPackage#getExchange_Conveys()
	 * @model containment="true"
	 * @generated
	 */
	Item getConveys();

	/**
	 * Sets the value of the '{@link projectSierraModel.Exchange#getConveys <em>Conveys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conveys</em>' containment reference.
	 * @see #getConveys()
	 * @generated
	 */
	void setConveys(Item value);

} // Exchange
