/**
 */
package robotMlEcoreMetamodel.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import robotMlEcoreMetamodel.Function;
import robotMlEcoreMetamodel.RobotMlEcoreMetamodelFactory;
import robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage;

/**
 * This is the item provider adapter for a {@link robotMlEcoreMetamodel.Function} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Function_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Function_name_feature",
								"_UI_Function_type"),
						RobotMlEcoreMetamodelPackage.Literals.FUNCTION__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__RETURNTYPE);
			childrenFeatures.add(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY);
			childrenFeatures.add(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__PARAMETER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Function.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Function"));
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
		String label = ((Function) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Function_type")
				: getString("_UI_Function_type") + " " + label;
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

		switch (notification.getFeatureID(Function.class)) {
		case RobotMlEcoreMetamodelPackage.FUNCTION__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case RobotMlEcoreMetamodelPackage.FUNCTION__RETURNTYPE:
		case RobotMlEcoreMetamodelPackage.FUNCTION__BODY:
		case RobotMlEcoreMetamodelPackage.FUNCTION__PARAMETER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__RETURNTYPE,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createReturnType()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createIf()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createForward()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createRotateLeft()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createBackward()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createRotateRight()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createRight()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createLeft()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createSetSpeed()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createVariableAssign()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createClock()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.FUNCTION__PARAMETER,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createParameter()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RobotMlEcoreMetamodelEditPlugin.INSTANCE;
	}

}
