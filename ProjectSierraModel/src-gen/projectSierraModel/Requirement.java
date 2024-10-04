/**
 */
package projectSierraModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.Requirement#getHasRationale <em>Has Rationale</em>}</li>
 *   <li>{@link projectSierraModel.Requirement#getHasConstraint <em>Has Constraint</em>}</li>
 *   <li>{@link projectSierraModel.Requirement#getDerives <em>Derives</em>}</li>
 *   <li>{@link projectSierraModel.Requirement#getIsDerivedFrom <em>Is Derived From</em>}</li>
 *   <li>{@link projectSierraModel.Requirement#getRefines <em>Refines</em>}</li>
 *   <li>{@link projectSierraModel.Requirement#getIsRefinedBy <em>Is Refined By</em>}</li>
 *   <li>{@link projectSierraModel.Requirement#getSpecifies <em>Specifies</em>}</li>
 *   <li>{@link projectSierraModel.Requirement#getJustifies <em>Justifies</em>}</li>
 * </ul>
 *
 * @see projectSierraModel.ProjectSierraModelPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends ContainableElement {
	/**
	 * Returns the value of the '<em><b>Has Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Rationale</em>' attribute.
	 * @see #setHasRationale(String)
	 * @see projectSierraModel.ProjectSierraModelPackage#getRequirement_HasRationale()
	 * @model
	 * @generated
	 */
	String getHasRationale();

	/**
	 * Sets the value of the '{@link projectSierraModel.Requirement#getHasRationale <em>Has Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Rationale</em>' attribute.
	 * @see #getHasRationale()
	 * @generated
	 */
	void setHasRationale(String value);

	/**
	 * Returns the value of the '<em><b>Has Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Constraint</em>' reference.
	 * @see #setHasConstraint(Constraint)
	 * @see projectSierraModel.ProjectSierraModelPackage#getRequirement_HasConstraint()
	 * @model
	 * @generated
	 */
	Constraint getHasConstraint();

	/**
	 * Sets the value of the '{@link projectSierraModel.Requirement#getHasConstraint <em>Has Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Constraint</em>' reference.
	 * @see #getHasConstraint()
	 * @generated
	 */
	void setHasConstraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Derives</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Requirement#getIsDerivedFrom <em>Is Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derives</em>' reference.
	 * @see #setDerives(Requirement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getRequirement_Derives()
	 * @see projectSierraModel.Requirement#getIsDerivedFrom
	 * @model opposite="isDerivedFrom"
	 * @generated
	 */
	Requirement getDerives();

	/**
	 * Sets the value of the '{@link projectSierraModel.Requirement#getDerives <em>Derives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derives</em>' reference.
	 * @see #getDerives()
	 * @generated
	 */
	void setDerives(Requirement value);

	/**
	 * Returns the value of the '<em><b>Is Derived From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Requirement#getDerives <em>Derives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived From</em>' reference.
	 * @see #setIsDerivedFrom(Requirement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getRequirement_IsDerivedFrom()
	 * @see projectSierraModel.Requirement#getDerives
	 * @model opposite="derives"
	 * @generated
	 */
	Requirement getIsDerivedFrom();

	/**
	 * Sets the value of the '{@link projectSierraModel.Requirement#getIsDerivedFrom <em>Is Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived From</em>' reference.
	 * @see #getIsDerivedFrom()
	 * @generated
	 */
	void setIsDerivedFrom(Requirement value);

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Requirement#getIsRefinedBy <em>Is Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(Requirement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getRequirement_Refines()
	 * @see projectSierraModel.Requirement#getIsRefinedBy
	 * @model opposite="isRefinedBy"
	 * @generated
	 */
	Requirement getRefines();

	/**
	 * Sets the value of the '{@link projectSierraModel.Requirement#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(Requirement value);

	/**
	 * Returns the value of the '<em><b>Is Refined By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.Requirement#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Refined By</em>' reference.
	 * @see #setIsRefinedBy(Requirement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getRequirement_IsRefinedBy()
	 * @see projectSierraModel.Requirement#getRefines
	 * @model opposite="refines"
	 * @generated
	 */
	Requirement getIsRefinedBy();

	/**
	 * Sets the value of the '{@link projectSierraModel.Requirement#getIsRefinedBy <em>Is Refined By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Refined By</em>' reference.
	 * @see #getIsRefinedBy()
	 * @generated
	 */
	void setIsRefinedBy(Requirement value);

	/**
	 * Returns the value of the '<em><b>Specifies</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.DesignElement#getIsSpecifiedBy <em>Is Specified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifies</em>' reference.
	 * @see #setSpecifies(DesignElement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getRequirement_Specifies()
	 * @see projectSierraModel.DesignElement#getIsSpecifiedBy
	 * @model opposite="isSpecifiedBy"
	 * @generated
	 */
	DesignElement getSpecifies();

	/**
	 * Sets the value of the '{@link projectSierraModel.Requirement#getSpecifies <em>Specifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specifies</em>' reference.
	 * @see #getSpecifies()
	 * @generated
	 */
	void setSpecifies(DesignElement value);

	/**
	 * Returns the value of the '<em><b>Justifies</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projectSierraModel.DesignElement#getIsJustifiedBy <em>Is Justified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justifies</em>' reference.
	 * @see #setJustifies(DesignElement)
	 * @see projectSierraModel.ProjectSierraModelPackage#getRequirement_Justifies()
	 * @see projectSierraModel.DesignElement#getIsJustifiedBy
	 * @model opposite="isJustifiedBy"
	 * @generated
	 */
	DesignElement getJustifies();

	/**
	 * Sets the value of the '{@link projectSierraModel.Requirement#getJustifies <em>Justifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justifies</em>' reference.
	 * @see #getJustifies()
	 * @generated
	 */
	void setJustifies(DesignElement value);

} // Requirement
