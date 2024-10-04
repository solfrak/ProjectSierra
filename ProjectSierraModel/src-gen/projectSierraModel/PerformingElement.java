/**
 */
package projectSierraModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.PerformingElement#getPerforms <em>Performs</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getPerformingElement()
 * @model abstract="true"
 * @generated
 */
public interface PerformingElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Performs</b></em>' reference list.
	 * The list contents are of type {@link projectSierraModel.Function}.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Function#getIsPerformedBy <em>Is Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs</em>' reference list.
	 * @see projectSierraModel.ProjectSierraModelPackage#getPerformingElement_Performs()
	 * @see projectSierraModel.Function#getIsPerformedBy
	 * @model opposite="isPerformedBy"
	 * @generated
	 */
	EList<Function> getPerforms();

} // PerformingElement
