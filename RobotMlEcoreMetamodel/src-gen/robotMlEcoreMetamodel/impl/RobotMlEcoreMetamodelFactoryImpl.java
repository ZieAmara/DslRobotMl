/**
 */
package robotMlEcoreMetamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robotMlEcoreMetamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotMlEcoreMetamodelFactoryImpl extends EFactoryImpl implements RobotMlEcoreMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobotMlEcoreMetamodelFactory init() {
		try {
			RobotMlEcoreMetamodelFactory theRobotMlEcoreMetamodelFactory = (RobotMlEcoreMetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(RobotMlEcoreMetamodelPackage.eNS_URI);
			if (theRobotMlEcoreMetamodelFactory != null) {
				return theRobotMlEcoreMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobotMlEcoreMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotMlEcoreMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RobotMlEcoreMetamodelPackage.PROGRAM:
			return createProgram();
		case RobotMlEcoreMetamodelPackage.FUNCTION:
			return createFunction();
		case RobotMlEcoreMetamodelPackage.NEW_ECLASS45:
			return createNewEClass45();
		case RobotMlEcoreMetamodelPackage.RETURN_TYPE:
			return createReturnType();
		case RobotMlEcoreMetamodelPackage.VARIABLE:
			return createVariable();
		case RobotMlEcoreMetamodelPackage.IF:
			return createIf();
		case RobotMlEcoreMetamodelPackage.LOOP:
			return createLoop();
		case RobotMlEcoreMetamodelPackage.FORWARD:
			return createForward();
		case RobotMlEcoreMetamodelPackage.ROTATE_LEFT:
			return createRotateLeft();
		case RobotMlEcoreMetamodelPackage.BACKWARD:
			return createBackward();
		case RobotMlEcoreMetamodelPackage.ROTATE_RIGHT:
			return createRotateRight();
		case RobotMlEcoreMetamodelPackage.RIGHT:
			return createRight();
		case RobotMlEcoreMetamodelPackage.LEFT:
			return createLeft();
		case RobotMlEcoreMetamodelPackage.SET_SPEED:
			return createSetSpeed();
		case RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN:
			return createVariableAssign();
		case RobotMlEcoreMetamodelPackage.CLOCK:
			return createClock();
		case RobotMlEcoreMetamodelPackage.FUNCTION_CALL:
			return createFunctionCall();
		case RobotMlEcoreMetamodelPackage.PARAMETER:
			return createParameter();
		case RobotMlEcoreMetamodelPackage.BOOLEAN_EXPR:
			return createBooleanExpr();
		case RobotMlEcoreMetamodelPackage.LOWER_THAN:
			return createLowerThan();
		case RobotMlEcoreMetamodelPackage.UPPER_THAN:
			return createUpperThan();
		case RobotMlEcoreMetamodelPackage.EQUAL_TO:
			return createEqualTo();
		case RobotMlEcoreMetamodelPackage.ADD:
			return createAdd();
		case RobotMlEcoreMetamodelPackage.MULTIPLICATION:
			return createMultiplication();
		case RobotMlEcoreMetamodelPackage.SUB:
			return createSub();
		case RobotMlEcoreMetamodelPackage.DIVISION:
			return createDivision();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RobotMlEcoreMetamodelPackage.UNIT:
			return createUnitFromString(eDataType, initialValue);
		case RobotMlEcoreMetamodelPackage.TYPE:
			return createTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RobotMlEcoreMetamodelPackage.UNIT:
			return convertUnitToString(eDataType, instanceValue);
		case RobotMlEcoreMetamodelPackage.TYPE:
			return convertTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewEClass45 createNewEClass45() {
		NewEClass45Impl newEClass45 = new NewEClass45Impl();
		return newEClass45;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType createReturnType() {
		ReturnTypeImpl returnType = new ReturnTypeImpl();
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Forward createForward() {
		ForwardImpl forward = new ForwardImpl();
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotateLeft createRotateLeft() {
		RotateLeftImpl rotateLeft = new RotateLeftImpl();
		return rotateLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Backward createBackward() {
		BackwardImpl backward = new BackwardImpl();
		return backward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotateRight createRotateRight() {
		RotateRightImpl rotateRight = new RotateRightImpl();
		return rotateRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Right createRight() {
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Left createLeft() {
		LeftImpl left = new LeftImpl();
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetSpeed createSetSpeed() {
		SetSpeedImpl setSpeed = new SetSpeedImpl();
		return setSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableAssign createVariableAssign() {
		VariableAssignImpl variableAssign = new VariableAssignImpl();
		return variableAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanExpr createBooleanExpr() {
		BooleanExprImpl booleanExpr = new BooleanExprImpl();
		return booleanExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LowerThan createLowerThan() {
		LowerThanImpl lowerThan = new LowerThanImpl();
		return lowerThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpperThan createUpperThan() {
		UpperThanImpl upperThan = new UpperThanImpl();
		return upperThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EqualTo createEqualTo() {
		EqualToImpl equalTo = new EqualToImpl();
		return equalTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sub createSub() {
		SubImpl sub = new SubImpl();
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnitFromString(EDataType eDataType, String initialValue) {
		Unit result = Unit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RobotMlEcoreMetamodelPackage getRobotMlEcoreMetamodelPackage() {
		return (RobotMlEcoreMetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobotMlEcoreMetamodelPackage getPackage() {
		return RobotMlEcoreMetamodelPackage.eINSTANCE;
	}

} //RobotMlEcoreMetamodelFactoryImpl
