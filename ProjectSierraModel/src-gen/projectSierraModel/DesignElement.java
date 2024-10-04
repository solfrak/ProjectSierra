/**
 */
package projectSierraModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.DesignElement#getIsSpecifiedBy <em>Is Specified By</em>}</li>
 *   <li>{@link projectSierraModel.DesignElement#getIsJustifiedBy <em>Is Justified By</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getDesignElement()
 * @model abstract="true"
 * @generated
 */
public interface DesignElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Specified By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Requirement#getSpecifies <em>Specifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Specified By</em>' reference.
	 * @see #setIsSpecifiedBy(Requirement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getDesignElement_IsSpecifiedBy()
	 * @see projectSierraModel.Requirement#getSpecifies
	 * @model opposite="specifies"
	 * @generated
	 */
	Requirement getIsSpecifiedBy();

	/**
	 * Sets the value of the '{@link projectSierraModel.DesignElement#getIsSpecifiedBy <em>Is Specified By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Specified By</em>' reference.
	 * @see #getIsSpecifiedBy()
	 * @generated
	 */
	void setIsSpecifiedBy(Requirement value);

	/**
	 * Returns the value of the '<em><b>Is Justified By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Requirement#getJustifies <em>Justifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Justified By</em>' reference.
	 * @see #setIsJustifiedBy(Requirement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getDesignElement_IsJustifiedBy()
	 * @see projectSierraModel.Requirement#getJustifies
	 * @model opposite="justifies"
	 * @generated
	 */
	Requirement getIsJustifiedBy();

	/**
	 * Sets the value of the '{@link projectSierraModel.DesignElement#getIsJustifiedBy <em>Is Justified By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Justified By</em>' reference.
	 * @see #getIsJustifiedBy()
	 * @generated
	 */
	void setIsJustifiedBy(Requirement value);

} // DesignElement
