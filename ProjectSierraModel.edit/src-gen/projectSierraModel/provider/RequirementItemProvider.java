/**
 */
package projectSierraModel.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import projectSierraModel.ProjectSierraModelPackage;
import projectSierraModel.Requirement;

/**
 * This is the item provider adapter for a {@link projectSierraModel.Requirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementItemProvider extends ContainableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addHasRationalePropertyDescriptor(object);
			addHasConstraintPropertyDescriptor(object);
			addDerivesPropertyDescriptor(object);
			addIsDerivedFromPropertyDescriptor(object);
			addRefinesPropertyDescriptor(object);
			addIsRefinedByPropertyDescriptor(object);
			addSpecifiesPropertyDescriptor(object);
			addJustifiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Has Rationale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasRationalePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_hasRationale_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_hasRationale_feature",
								"_UI_Requirement_type"),
						ProjectSierraModelPackage.Literals.REQUIREMENT__HAS_RATIONALE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Has Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_hasConstraint_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_hasConstraint_feature",
								"_UI_Requirement_type"),
						ProjectSierraModelPackage.Literals.REQUIREMENT__HAS_CONSTRAINT, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Derives feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_derives_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_derives_feature",
								"_UI_Requirement_type"),
						ProjectSierraModelPackage.Literals.REQUIREMENT__DERIVES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Derived From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDerivedFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Requirement_isDerivedFrom_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Requirement_isDerivedFrom_feature",
						"_UI_Requirement_type"),
				ProjectSierraModelPackage.Literals.REQUIREMENT__IS_DERIVED_FROM, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Refines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_refines_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_refines_feature",
								"_UI_Requirement_type"),
						ProjectSierraModelPackage.Literals.REQUIREMENT__REFINES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Refined By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRefinedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_isRefinedBy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_isRefinedBy_feature",
								"_UI_Requirement_type"),
						ProjectSierraModelPackage.Literals.REQUIREMENT__IS_REFINED_BY, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Specifies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecifiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_specifies_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_specifies_feature",
								"_UI_Requirement_type"),
						ProjectSierraModelPackage.Literals.REQUIREMENT__SPECIFIES, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Justifies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJustifiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_justifies_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_justifies_feature",
								"_UI_Requirement_type"),
						ProjectSierraModelPackage.Literals.REQUIREMENT__JUSTIFIES, true, false, true, null, null,
						null));
	}

	/**
	 * This returns Requirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Requirement"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Requirement) object).getHasRationale();
		return label == null || label.length() == 0 ? getString("_UI_Requirement_type")
				: getString("_UI_Requirement_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Requirement.class)) {
		case ProjectSierraModelPackage.REQUIREMENT__HAS_RATIONALE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
