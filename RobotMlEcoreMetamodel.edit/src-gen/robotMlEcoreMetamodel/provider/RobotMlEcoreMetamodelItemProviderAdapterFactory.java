/**
 */
package robotMlEcoreMetamodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import robotMlEcoreMetamodel.util.RobotMlEcoreMetamodelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotMlEcoreMetamodelItemProviderAdapterFactory extends RobotMlEcoreMetamodelAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotMlEcoreMetamodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Program} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramItemProvider programItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramAdapter() {
		if (programItemProvider == null) {
			programItemProvider = new ProgramItemProvider(this);
		}

		return programItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.NewEClass45} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewEClass45ItemProvider newEClass45ItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.NewEClass45}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNewEClass45Adapter() {
		if (newEClass45ItemProvider == null) {
			newEClass45ItemProvider = new NewEClass45ItemProvider(this);
		}

		return newEClass45ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.ReturnType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnTypeItemProvider returnTypeItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.ReturnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReturnTypeAdapter() {
		if (returnTypeItemProvider == null) {
			returnTypeItemProvider = new ReturnTypeItemProvider(this);
		}

		return returnTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.If} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfItemProvider ifItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.If}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfAdapter() {
		if (ifItemProvider == null) {
			ifItemProvider = new IfItemProvider(this);
		}

		return ifItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Loop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopItemProvider loopItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Loop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoopAdapter() {
		if (loopItemProvider == null) {
			loopItemProvider = new LoopItemProvider(this);
		}

		return loopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Forward} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForwardItemProvider forwardItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Forward}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForwardAdapter() {
		if (forwardItemProvider == null) {
			forwardItemProvider = new ForwardItemProvider(this);
		}

		return forwardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.RotateLeft} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotateLeftItemProvider rotateLeftItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.RotateLeft}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRotateLeftAdapter() {
		if (rotateLeftItemProvider == null) {
			rotateLeftItemProvider = new RotateLeftItemProvider(this);
		}

		return rotateLeftItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Backward} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackwardItemProvider backwardItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Backward}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBackwardAdapter() {
		if (backwardItemProvider == null) {
			backwardItemProvider = new BackwardItemProvider(this);
		}

		return backwardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.RotateRight} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotateRightItemProvider rotateRightItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.RotateRight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRotateRightAdapter() {
		if (rotateRightItemProvider == null) {
			rotateRightItemProvider = new RotateRightItemProvider(this);
		}

		return rotateRightItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Right} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightItemProvider rightItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Right}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRightAdapter() {
		if (rightItemProvider == null) {
			rightItemProvider = new RightItemProvider(this);
		}

		return rightItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Left} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeftItemProvider leftItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Left}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeftAdapter() {
		if (leftItemProvider == null) {
			leftItemProvider = new LeftItemProvider(this);
		}

		return leftItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.SetSpeed} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetSpeedItemProvider setSpeedItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.SetSpeed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetSpeedAdapter() {
		if (setSpeedItemProvider == null) {
			setSpeedItemProvider = new SetSpeedItemProvider(this);
		}

		return setSpeedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.VariableAssign} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableAssignItemProvider variableAssignItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.VariableAssign}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAssignAdapter() {
		if (variableAssignItemProvider == null) {
			variableAssignItemProvider = new VariableAssignItemProvider(this);
		}

		return variableAssignItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Clock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockItemProvider clockItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Clock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClockAdapter() {
		if (clockItemProvider == null) {
			clockItemProvider = new ClockItemProvider(this);
		}

		return clockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.FunctionCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallItemProvider functionCallItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.FunctionCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionCallAdapter() {
		if (functionCallItemProvider == null) {
			functionCallItemProvider = new FunctionCallItemProvider(this);
		}

		return functionCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.BooleanExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanExprItemProvider booleanExprItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.BooleanExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanExprAdapter() {
		if (booleanExprItemProvider == null) {
			booleanExprItemProvider = new BooleanExprItemProvider(this);
		}

		return booleanExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.LowerThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowerThanItemProvider lowerThanItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.LowerThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLowerThanAdapter() {
		if (lowerThanItemProvider == null) {
			lowerThanItemProvider = new LowerThanItemProvider(this);
		}

		return lowerThanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.UpperThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpperThanItemProvider upperThanItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.UpperThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpperThanAdapter() {
		if (upperThanItemProvider == null) {
			upperThanItemProvider = new UpperThanItemProvider(this);
		}

		return upperThanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.EqualTo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualToItemProvider equalToItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.EqualTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqualToAdapter() {
		if (equalToItemProvider == null) {
			equalToItemProvider = new EqualToItemProvider(this);
		}

		return equalToItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Add} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddItemProvider addItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Add}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddAdapter() {
		if (addItemProvider == null) {
			addItemProvider = new AddItemProvider(this);
		}

		return addItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Multiplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicationItemProvider multiplicationItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Multiplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplicationAdapter() {
		if (multiplicationItemProvider == null) {
			multiplicationItemProvider = new MultiplicationItemProvider(this);
		}

		return multiplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Sub} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubItemProvider subItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Sub}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubAdapter() {
		if (subItemProvider == null) {
			subItemProvider = new SubItemProvider(this);
		}

		return subItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotMlEcoreMetamodel.Division} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivisionItemProvider divisionItemProvider;

	/**
	 * This creates an adapter for a {@link robotMlEcoreMetamodel.Division}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDivisionAdapter() {
		if (divisionItemProvider == null) {
			divisionItemProvider = new DivisionItemProvider(this);
		}

		return divisionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (programItemProvider != null)
			programItemProvider.dispose();
		if (functionItemProvider != null)
			functionItemProvider.dispose();
		if (newEClass45ItemProvider != null)
			newEClass45ItemProvider.dispose();
		if (returnTypeItemProvider != null)
			returnTypeItemProvider.dispose();
		if (variableItemProvider != null)
			variableItemProvider.dispose();
		if (ifItemProvider != null)
			ifItemProvider.dispose();
		if (loopItemProvider != null)
			loopItemProvider.dispose();
		if (forwardItemProvider != null)
			forwardItemProvider.dispose();
		if (rotateLeftItemProvider != null)
			rotateLeftItemProvider.dispose();
		if (backwardItemProvider != null)
			backwardItemProvider.dispose();
		if (rotateRightItemProvider != null)
			rotateRightItemProvider.dispose();
		if (rightItemProvider != null)
			rightItemProvider.dispose();
		if (leftItemProvider != null)
			leftItemProvider.dispose();
		if (setSpeedItemProvider != null)
			setSpeedItemProvider.dispose();
		if (variableAssignItemProvider != null)
			variableAssignItemProvider.dispose();
		if (clockItemProvider != null)
			clockItemProvider.dispose();
		if (functionCallItemProvider != null)
			functionCallItemProvider.dispose();
		if (parameterItemProvider != null)
			parameterItemProvider.dispose();
		if (booleanExprItemProvider != null)
			booleanExprItemProvider.dispose();
		if (lowerThanItemProvider != null)
			lowerThanItemProvider.dispose();
		if (upperThanItemProvider != null)
			upperThanItemProvider.dispose();
		if (equalToItemProvider != null)
			equalToItemProvider.dispose();
		if (addItemProvider != null)
			addItemProvider.dispose();
		if (multiplicationItemProvider != null)
			multiplicationItemProvider.dispose();
		if (subItemProvider != null)
			subItemProvider.dispose();
		if (divisionItemProvider != null)
			divisionItemProvider.dispose();
	}

}
