/**
 */
package projectSierraModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchanging Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.ExchangingElement#getSendsTo <em>Sends To</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getExchangingElement()
 * @model abstract="true"
 * @generated
 */
public interface ExchangingElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Sends To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends To</em>' reference.
	 * @see #setSendsTo(Exchange)
	 * @see projectSierraModel.ProjectSierraModelPackage#getExchangingElement_SendsTo()
	 * @model
	 * @generated
	 */
	Exchange getSendsTo();

	/**
	 * Sets the value of the '{@link projectSierraModel.ExchangingElement#getSendsTo <em>Sends To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sends To</em>' reference.
	 * @see #getSendsTo()
	 * @generated
	 */
	void setSendsTo(Exchange value);

} // ExchangingElement
