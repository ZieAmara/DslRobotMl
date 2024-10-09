/**
 */
package robotMlEcoreMetamodel.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import robotMlEcoreMetamodel.Loop;
import robotMlEcoreMetamodel.RobotMlEcoreMetamodelFactory;
import robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage;

/**
 * This is the item provider adapter for a {@link robotMlEcoreMetamodel.Loop} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopItemProvider extends ControlStructureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY);
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
	 * This returns Loop.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Loop"));
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
		return getString("_UI_Loop_type");
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

		switch (notification.getFeatureID(Loop.class)) {
		case RobotMlEcoreMetamodelPackage.LOOP__BODY:
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

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createIf()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createForward()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createRotateLeft()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createBackward()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createRotateRight()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createRight()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createLeft()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createSetSpeed()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createVariableAssign()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createClock()));

		newChildDescriptors.add(createChildParameter(RobotMlEcoreMetamodelPackage.Literals.LOOP__BODY,
				RobotMlEcoreMetamodelFactory.eINSTANCE.createFunctionCall()));
	}

}
