/**
 */
package projectSierraModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projectSierraModel.Constraint;
import projectSierraModel.ProjectSierraModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectSierraModel.impl.ConstraintImpl#getHasExpression <em>Has Expression</em>}</li>
 *   <li>{@link projectSierraModel.impl.ConstraintImpl#getIsExpressedIn <em>Is Expressed In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint {
	/**
	 * The default value of the '{@link #getHasExpression() <em>Has Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasExpression() <em>Has Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasExpression()
	 * @generated
	 * @ordered
	 */
	protected String hasExpression = HAS_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsExpressedIn() <em>Is Expressed In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExpressedIn()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_EXPRESSED_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsExpressedIn() <em>Is Expressed In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExpressedIn()
	 * @generated
	 * @ordered
	 */
	protected String isExpressedIn = IS_EXPRESSED_IN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectSierraModelPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHasExpression() {
		return hasExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasExpression(String newHasExpression) {
		String oldHasExpression = hasExpression;
		hasExpression = newHasExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.CONSTRAINT__HAS_EXPRESSION,
					oldHasExpression, hasExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsExpressedIn() {
		return isExpressedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExpressedIn(String newIsExpressedIn) {
		String oldIsExpressedIn = isExpressedIn;
		isExpressedIn = newIsExpressedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectSierraModelPackage.CONSTRAINT__IS_EXPRESSED_IN,
					oldIsExpressedIn, isExpressedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjectSierraModelPackage.CONSTRAINT__HAS_EXPRESSION:
			return getHasExpression();
		case ProjectSierraModelPackage.CONSTRAINT__IS_EXPRESSED_IN:
			return getIsExpressedIn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjectSierraModelPackage.CONSTRAINT__HAS_EXPRESSION:
			setHasExpression((String) newValue);
			return;
		case ProjectSierraModelPackage.CONSTRAINT__IS_EXPRESSED_IN:
			setIsExpressedIn((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProjectSierraModelPackage.CONSTRAINT__HAS_EXPRESSION:
			setHasExpression(HAS_EXPRESSION_EDEFAULT);
			return;
		case ProjectSierraModelPackage.CONSTRAINT__IS_EXPRESSED_IN:
			setIsExpressedIn(IS_EXPRESSED_IN_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProjectSierraModelPackage.CONSTRAINT__HAS_EXPRESSION:
			return HAS_EXPRESSION_EDEFAULT == null ? hasExpression != null
					: !HAS_EXPRESSION_EDEFAULT.equals(hasExpression);
		case ProjectSierraModelPackage.CONSTRAINT__IS_EXPRESSED_IN:
			return IS_EXPRESSED_IN_EDEFAULT == null ? isExpressedIn != null
					: !IS_EXPRESSED_IN_EDEFAULT.equals(isExpressedIn);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (hasExpression: ");
		result.append(hasExpression);
		result.append(", isExpressedIn: ");
		result.append(isExpressedIn);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
