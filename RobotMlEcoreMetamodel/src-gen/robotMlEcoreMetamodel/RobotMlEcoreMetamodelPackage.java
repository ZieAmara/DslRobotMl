/**
 */
package robotMlEcoreMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface RobotMlEcoreMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robotMlEcoreMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/robotMlEcoreMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robotMlEcoreMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotMlEcoreMetamodelPackage eINSTANCE = robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ProgramImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FUNCTION = 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.FunctionImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURNTYPE = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETER = 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ReturnTypeImpl <em>Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ReturnTypeImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.StatementImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 3;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.VariableDeclImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getVariableDecl()
	 * @generated
	 */
	int VARIABLE_DECL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__TYPE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__VALEUR = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Variable Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.MovementImpl <em>Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.MovementImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getMovement()
	 * @generated
	 */
	int MOVEMENT = 5;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__DISTANCE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ControlStructureImpl <em>Control Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ControlStructureImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getControlStructure()
	 * @generated
	 */
	int CONTROL_STRUCTURE = 6;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.IfImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getIf()
	 * @generated
	 */
	int IF = 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = CONTROL_STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.LoopImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 8;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__CONDITION = CONTROL_STRUCTURE__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BODY = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ForwardImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 9;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD__DISTANCE = MOVEMENT__DISTANCE;

	/**
	 * The number of structural features of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.BackwardImpl <em>Backward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.BackwardImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getBackward()
	 * @generated
	 */
	int BACKWARD = 10;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD__DISTANCE = MOVEMENT__DISTANCE;

	/**
	 * The number of structural features of the '<em>Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.RightImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 11;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__DISTANCE = MOVEMENT__DISTANCE;

	/**
	 * The number of structural features of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.LeftImpl <em>Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.LeftImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getLeft()
	 * @generated
	 */
	int LEFT = 12;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT__DISTANCE = MOVEMENT__DISTANCE;

	/**
	 * The number of structural features of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.SetSpeedImpl <em>Set Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.SetSpeedImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getSetSpeed()
	 * @generated
	 */
	int SET_SPEED = 13;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED__UNIT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED__DISTANCE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.VariableAssignImpl <em>Variable Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.VariableAssignImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getVariableAssign()
	 * @generated
	 */
	int VARIABLE_ASSIGN = 14;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGN__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGN__VALEUR = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGN_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ClockImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 15;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__ANGLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ExpressionImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 16;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.FunctionCallImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 17;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FUNCTION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ARGUMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ParameterImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.BooleanExprImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getBooleanExpr()
	 * @generated
	 */
	int BOOLEAN_EXPR = 19;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ArithmeticExprImpl <em>Arithmetic Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ArithmeticExprImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getArithmeticExpr()
	 * @generated
	 */
	int ARITHMETIC_EXPR = 20;

	/**
	 * The number of structural features of the '<em>Arithmetic Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arithmetic Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.BooleanOPeratorImpl <em>Boolean OPerator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.BooleanOPeratorImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getBooleanOPerator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 21;

	/**
	 * The number of structural features of the '<em>Boolean OPerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Boolean OPerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ReturnExpImpl <em>Return Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ReturnExpImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getReturnExp()
	 * @generated
	 */
	int RETURN_EXP = 22;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ExpressionUnairImpl <em>Expression Unair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ExpressionUnairImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getExpressionUnair()
	 * @generated
	 */
	int EXPRESSION_UNAIR = 23;

	/**
	 * The number of structural features of the '<em>Expression Unair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_UNAIR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression Unair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_UNAIR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.FunctionCallExprImpl <em>Function Call Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.FunctionCallExprImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getFunctionCallExpr()
	 * @generated
	 */
	int FUNCTION_CALL_EXPR = 24;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPR__FUNCTION = EXPRESSION_UNAIR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPR__ARGUMENTS = EXPRESSION_UNAIR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPR_FEATURE_COUNT = EXPRESSION_UNAIR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPR_OPERATION_COUNT = EXPRESSION_UNAIR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.VariableCallExprImpl <em>Variable Call Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.VariableCallExprImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getVariableCallExpr()
	 * @generated
	 */
	int VARIABLE_CALL_EXPR = 25;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CALL_EXPR__VARIABLE = EXPRESSION_UNAIR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Call Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CALL_EXPR_FEATURE_COUNT = EXPRESSION_UNAIR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Call Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CALL_EXPR_OPERATION_COUNT = EXPRESSION_UNAIR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.AddSubExprImpl <em>Add Sub Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.AddSubExprImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getAddSubExpr()
	 * @generated
	 */
	int ADD_SUB_EXPR = 26;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SUB_EXPR__LEFT = ARITHMETIC_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SUB_EXPR__OPERATOR = ARITHMETIC_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SUB_EXPR__RIGHT = ARITHMETIC_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add Sub Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SUB_EXPR_FEATURE_COUNT = ARITHMETIC_EXPR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Add Sub Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SUB_EXPR_OPERATION_COUNT = ARITHMETIC_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.MultiDivExprImpl <em>Multi Div Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.MultiDivExprImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getMultiDivExpr()
	 * @generated
	 */
	int MULTI_DIV_EXPR = 27;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DIV_EXPR__RIGHT = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DIV_EXPR__LEFT = 1;

	/**
	 * The number of structural features of the '<em>Multi Div Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DIV_EXPR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Multi Div Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DIV_EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.AddSubOperatorImpl <em>Add Sub Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.AddSubOperatorImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getAddSubOperator()
	 * @generated
	 */
	int ADD_SUB_OPERATOR = 28;

	/**
	 * The number of structural features of the '<em>Add Sub Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SUB_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Add Sub Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SUB_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.MultiDivOperatorImpl <em>Multi Div Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.MultiDivOperatorImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getMultiDivOperator()
	 * @generated
	 */
	int MULTI_DIV_OPERATOR = 29;

	/**
	 * The number of structural features of the '<em>Multi Div Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DIV_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Multi Div Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DIV_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.BaseExprImpl <em>Base Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.BaseExprImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getBaseExpr()
	 * @generated
	 */
	int BASE_EXPR = 30;

	/**
	 * The number of structural features of the '<em>Base Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_EXPR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.GetSensorsImpl <em>Get Sensors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.GetSensorsImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getGetSensors()
	 * @generated
	 */
	int GET_SENSORS = 31;

	/**
	 * The number of structural features of the '<em>Get Sensors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SENSORS_FEATURE_COUNT = BASE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Get Sensors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_SENSORS_OPERATION_COUNT = BASE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ValueImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 32;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = BASE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = BASE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.MultiDivRightExpImpl <em>Multi Div Right Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.MultiDivRightExpImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getMultiDivRightExp()
	 * @generated
	 */
	int MULTI_DIV_RIGHT_EXP = 33;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DIV_RIGHT_EXP__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DIV_RIGHT_EXP__RIGHT = 1;

	/**
	 * The number of structural features of the '<em>Multi Div Right Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DIV_RIGHT_EXP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Multi Div Right Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DIV_RIGHT_EXP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.AddSubbRightExpImpl <em>Add Subb Right Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.AddSubbRightExpImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getAddSubbRightExp()
	 * @generated
	 */
	int ADD_SUBB_RIGHT_EXP = 34;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SUBB_RIGHT_EXP__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SUBB_RIGHT_EXP__RIGHT = 1;

	/**
	 * The number of structural features of the '<em>Add Subb Right Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SUBB_RIGHT_EXP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Add Subb Right Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SUBB_RIGHT_EXP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.Type
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 36;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.Unit
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 35;

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see robotMlEcoreMetamodel.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.Program#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see robotMlEcoreMetamodel.Program#getFunction()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Function();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see robotMlEcoreMetamodel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link robotMlEcoreMetamodel.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotMlEcoreMetamodel.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.Function#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returntype</em>'.
	 * @see robotMlEcoreMetamodel.Function#getReturntype()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Returntype();

	/**
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.Function#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see robotMlEcoreMetamodel.Function#getBody()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.Function#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see robotMlEcoreMetamodel.Function#getParameter()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameter();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type</em>'.
	 * @see robotMlEcoreMetamodel.ReturnType
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for the attribute '{@link robotMlEcoreMetamodel.ReturnType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see robotMlEcoreMetamodel.ReturnType#getType()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_Type();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see robotMlEcoreMetamodel.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.VariableDecl <em>Variable Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Decl</em>'.
	 * @see robotMlEcoreMetamodel.VariableDecl
	 * @generated
	 */
	EClass getVariableDecl();

	/**
	 * Returns the meta object for the attribute '{@link robotMlEcoreMetamodel.VariableDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotMlEcoreMetamodel.VariableDecl#getName()
	 * @see #getVariableDecl()
	 * @generated
	 */
	EAttribute getVariableDecl_Name();

	/**
	 * Returns the meta object for the attribute '{@link robotMlEcoreMetamodel.VariableDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see robotMlEcoreMetamodel.VariableDecl#getType()
	 * @see #getVariableDecl()
	 * @generated
	 */
	EAttribute getVariableDecl_Type();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.VariableDecl#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valeur</em>'.
	 * @see robotMlEcoreMetamodel.VariableDecl#getValeur()
	 * @see #getVariableDecl()
	 * @generated
	 */
	EReference getVariableDecl_Valeur();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement</em>'.
	 * @see robotMlEcoreMetamodel.Movement
	 * @generated
	 */
	EClass getMovement();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.Movement#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see robotMlEcoreMetamodel.Movement#getDistance()
	 * @see #getMovement()
	 * @generated
	 */
	EReference getMovement_Distance();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Structure</em>'.
	 * @see robotMlEcoreMetamodel.ControlStructure
	 * @generated
	 */
	EClass getControlStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.ControlStructure#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see robotMlEcoreMetamodel.ControlStructure#getCondition()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Condition();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see robotMlEcoreMetamodel.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see robotMlEcoreMetamodel.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.If#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see robotMlEcoreMetamodel.If#getThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Then();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see robotMlEcoreMetamodel.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.Loop#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see robotMlEcoreMetamodel.Loop#getBody()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Body();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see robotMlEcoreMetamodel.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Backward <em>Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backward</em>'.
	 * @see robotMlEcoreMetamodel.Backward
	 * @generated
	 */
	EClass getBackward();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see robotMlEcoreMetamodel.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left</em>'.
	 * @see robotMlEcoreMetamodel.Left
	 * @generated
	 */
	EClass getLeft();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.SetSpeed <em>Set Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Speed</em>'.
	 * @see robotMlEcoreMetamodel.SetSpeed
	 * @generated
	 */
	EClass getSetSpeed();

	/**
	 * Returns the meta object for the attribute '{@link robotMlEcoreMetamodel.SetSpeed#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see robotMlEcoreMetamodel.SetSpeed#getUnit()
	 * @see #getSetSpeed()
	 * @generated
	 */
	EAttribute getSetSpeed_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.SetSpeed#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see robotMlEcoreMetamodel.SetSpeed#getDistance()
	 * @see #getSetSpeed()
	 * @generated
	 */
	EReference getSetSpeed_Distance();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.VariableAssign <em>Variable Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assign</em>'.
	 * @see robotMlEcoreMetamodel.VariableAssign
	 * @generated
	 */
	EClass getVariableAssign();

	/**
	 * Returns the meta object for the reference '{@link robotMlEcoreMetamodel.VariableAssign#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see robotMlEcoreMetamodel.VariableAssign#getVariable()
	 * @see #getVariableAssign()
	 * @generated
	 */
	EReference getVariableAssign_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.VariableAssign#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valeur</em>'.
	 * @see robotMlEcoreMetamodel.VariableAssign#getValeur()
	 * @see #getVariableAssign()
	 * @generated
	 */
	EReference getVariableAssign_Valeur();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see robotMlEcoreMetamodel.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.Clock#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see robotMlEcoreMetamodel.Clock#getAngle()
	 * @see #getClock()
	 * @generated
	 */
	EReference getClock_Angle();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see robotMlEcoreMetamodel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see robotMlEcoreMetamodel.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link robotMlEcoreMetamodel.FunctionCall#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see robotMlEcoreMetamodel.FunctionCall#getFunction()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.FunctionCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see robotMlEcoreMetamodel.FunctionCall#getArguments()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Arguments();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see robotMlEcoreMetamodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link robotMlEcoreMetamodel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotMlEcoreMetamodel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link robotMlEcoreMetamodel.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see robotMlEcoreMetamodel.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.BooleanExpr <em>Boolean Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expr</em>'.
	 * @see robotMlEcoreMetamodel.BooleanExpr
	 * @generated
	 */
	EClass getBooleanExpr();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.BooleanExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see robotMlEcoreMetamodel.BooleanExpr#getLeft()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EReference getBooleanExpr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.BooleanExpr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see robotMlEcoreMetamodel.BooleanExpr#getRight()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EReference getBooleanExpr_Right();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.BooleanExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see robotMlEcoreMetamodel.BooleanExpr#getOperator()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EReference getBooleanExpr_Operator();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.ArithmeticExpr <em>Arithmetic Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expr</em>'.
	 * @see robotMlEcoreMetamodel.ArithmeticExpr
	 * @generated
	 */
	EClass getArithmeticExpr();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.BooleanOPerator <em>Boolean OPerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean OPerator</em>'.
	 * @see robotMlEcoreMetamodel.BooleanOPerator
	 * @generated
	 */
	EClass getBooleanOPerator();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.ReturnExp <em>Return Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Exp</em>'.
	 * @see robotMlEcoreMetamodel.ReturnExp
	 * @generated
	 */
	EClass getReturnExp();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.ReturnExp#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robotMlEcoreMetamodel.ReturnExp#getExpression()
	 * @see #getReturnExp()
	 * @generated
	 */
	EReference getReturnExp_Expression();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.ExpressionUnair <em>Expression Unair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Unair</em>'.
	 * @see robotMlEcoreMetamodel.ExpressionUnair
	 * @generated
	 */
	EClass getExpressionUnair();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.FunctionCallExpr <em>Function Call Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call Expr</em>'.
	 * @see robotMlEcoreMetamodel.FunctionCallExpr
	 * @generated
	 */
	EClass getFunctionCallExpr();

	/**
	 * Returns the meta object for the reference '{@link robotMlEcoreMetamodel.FunctionCallExpr#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see robotMlEcoreMetamodel.FunctionCallExpr#getFunction()
	 * @see #getFunctionCallExpr()
	 * @generated
	 */
	EReference getFunctionCallExpr_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.FunctionCallExpr#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see robotMlEcoreMetamodel.FunctionCallExpr#getArguments()
	 * @see #getFunctionCallExpr()
	 * @generated
	 */
	EReference getFunctionCallExpr_Arguments();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.VariableCallExpr <em>Variable Call Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Call Expr</em>'.
	 * @see robotMlEcoreMetamodel.VariableCallExpr
	 * @generated
	 */
	EClass getVariableCallExpr();

	/**
	 * Returns the meta object for the reference '{@link robotMlEcoreMetamodel.VariableCallExpr#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see robotMlEcoreMetamodel.VariableCallExpr#getVariable()
	 * @see #getVariableCallExpr()
	 * @generated
	 */
	EReference getVariableCallExpr_Variable();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.AddSubExpr <em>Add Sub Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Sub Expr</em>'.
	 * @see robotMlEcoreMetamodel.AddSubExpr
	 * @generated
	 */
	EClass getAddSubExpr();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.AddSubExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see robotMlEcoreMetamodel.AddSubExpr#getLeft()
	 * @see #getAddSubExpr()
	 * @generated
	 */
	EReference getAddSubExpr_Left();

	/**
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.AddSubExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operator</em>'.
	 * @see robotMlEcoreMetamodel.AddSubExpr#getOperator()
	 * @see #getAddSubExpr()
	 * @generated
	 */
	EReference getAddSubExpr_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.AddSubExpr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right</em>'.
	 * @see robotMlEcoreMetamodel.AddSubExpr#getRight()
	 * @see #getAddSubExpr()
	 * @generated
	 */
	EReference getAddSubExpr_Right();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.MultiDivExpr <em>Multi Div Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Div Expr</em>'.
	 * @see robotMlEcoreMetamodel.MultiDivExpr
	 * @generated
	 */
	EClass getMultiDivExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.MultiDivExpr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right</em>'.
	 * @see robotMlEcoreMetamodel.MultiDivExpr#getRight()
	 * @see #getMultiDivExpr()
	 * @generated
	 */
	EReference getMultiDivExpr_Right();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.MultiDivExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see robotMlEcoreMetamodel.MultiDivExpr#getLeft()
	 * @see #getMultiDivExpr()
	 * @generated
	 */
	EReference getMultiDivExpr_Left();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.AddSubOperator <em>Add Sub Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Sub Operator</em>'.
	 * @see robotMlEcoreMetamodel.AddSubOperator
	 * @generated
	 */
	EClass getAddSubOperator();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.MultiDivOperator <em>Multi Div Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Div Operator</em>'.
	 * @see robotMlEcoreMetamodel.MultiDivOperator
	 * @generated
	 */
	EClass getMultiDivOperator();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.BaseExpr <em>Base Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Expr</em>'.
	 * @see robotMlEcoreMetamodel.BaseExpr
	 * @generated
	 */
	EClass getBaseExpr();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.GetSensors <em>Get Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Sensors</em>'.
	 * @see robotMlEcoreMetamodel.GetSensors
	 * @generated
	 */
	EClass getGetSensors();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see robotMlEcoreMetamodel.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.MultiDivRightExp <em>Multi Div Right Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Div Right Exp</em>'.
	 * @see robotMlEcoreMetamodel.MultiDivRightExp
	 * @generated
	 */
	EClass getMultiDivRightExp();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.MultiDivRightExp#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see robotMlEcoreMetamodel.MultiDivRightExp#getOperator()
	 * @see #getMultiDivRightExp()
	 * @generated
	 */
	EReference getMultiDivRightExp_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.MultiDivRightExp#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see robotMlEcoreMetamodel.MultiDivRightExp#getRight()
	 * @see #getMultiDivRightExp()
	 * @generated
	 */
	EReference getMultiDivRightExp_Right();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.AddSubbRightExp <em>Add Subb Right Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Subb Right Exp</em>'.
	 * @see robotMlEcoreMetamodel.AddSubbRightExp
	 * @generated
	 */
	EClass getAddSubbRightExp();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.AddSubbRightExp#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see robotMlEcoreMetamodel.AddSubbRightExp#getOperator()
	 * @see #getAddSubbRightExp()
	 * @generated
	 */
	EReference getAddSubbRightExp_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link robotMlEcoreMetamodel.AddSubbRightExp#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see robotMlEcoreMetamodel.AddSubbRightExp#getRight()
	 * @see #getAddSubbRightExp()
	 * @generated
	 */
	EReference getAddSubbRightExp_Right();

	/**
	 * Returns the meta object for enum '{@link robotMlEcoreMetamodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see robotMlEcoreMetamodel.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link robotMlEcoreMetamodel.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit</em>'.
	 * @see robotMlEcoreMetamodel.Unit
	 * @generated
	 */
	EEnum getUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotMlEcoreMetamodelFactory getRobotMlEcoreMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.ProgramImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__FUNCTION = eINSTANCE.getProgram_Function();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.FunctionImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Returntype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURNTYPE = eINSTANCE.getFunction_Returntype();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__BODY = eINSTANCE.getFunction_Body();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETER = eINSTANCE.getFunction_Parameter();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.ReturnTypeImpl <em>Return Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.ReturnTypeImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getReturnType()
		 * @generated
		 */
		EClass RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__TYPE = eINSTANCE.getReturnType_Type();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.StatementImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.VariableDeclImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getVariableDecl()
		 * @generated
		 */
		EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECL__NAME = eINSTANCE.getVariableDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECL__TYPE = eINSTANCE.getVariableDecl_Type();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECL__VALEUR = eINSTANCE.getVariableDecl_Valeur();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.MovementImpl <em>Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.MovementImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getMovement()
		 * @generated
		 */
		EClass MOVEMENT = eINSTANCE.getMovement();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVEMENT__DISTANCE = eINSTANCE.getMovement_Distance();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.ControlStructureImpl <em>Control Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.ControlStructureImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getControlStructure()
		 * @generated
		 */
		EClass CONTROL_STRUCTURE = eINSTANCE.getControlStructure();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__CONDITION = eINSTANCE.getControlStructure_Condition();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.IfImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN = eINSTANCE.getIf_Then();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.LoopImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BODY = eINSTANCE.getLoop_Body();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.ForwardImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getForward()
		 * @generated
		 */
		EClass FORWARD = eINSTANCE.getForward();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.BackwardImpl <em>Backward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.BackwardImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getBackward()
		 * @generated
		 */
		EClass BACKWARD = eINSTANCE.getBackward();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.RightImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getRight()
		 * @generated
		 */
		EClass RIGHT = eINSTANCE.getRight();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.LeftImpl <em>Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.LeftImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getLeft()
		 * @generated
		 */
		EClass LEFT = eINSTANCE.getLeft();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.SetSpeedImpl <em>Set Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.SetSpeedImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getSetSpeed()
		 * @generated
		 */
		EClass SET_SPEED = eINSTANCE.getSetSpeed();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_SPEED__UNIT = eINSTANCE.getSetSpeed_Unit();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_SPEED__DISTANCE = eINSTANCE.getSetSpeed_Distance();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.VariableAssignImpl <em>Variable Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.VariableAssignImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getVariableAssign()
		 * @generated
		 */
		EClass VARIABLE_ASSIGN = eINSTANCE.getVariableAssign();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGN__VARIABLE = eINSTANCE.getVariableAssign_Variable();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGN__VALEUR = eINSTANCE.getVariableAssign_Valeur();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.ClockImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK__ANGLE = eINSTANCE.getClock_Angle();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.ExpressionImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.FunctionCallImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__FUNCTION = eINSTANCE.getFunctionCall_Function();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__ARGUMENTS = eINSTANCE.getFunctionCall_Arguments();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.ParameterImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.BooleanExprImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getBooleanExpr()
		 * @generated
		 */
		EClass BOOLEAN_EXPR = eINSTANCE.getBooleanExpr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPR__LEFT = eINSTANCE.getBooleanExpr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPR__RIGHT = eINSTANCE.getBooleanExpr_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPR__OPERATOR = eINSTANCE.getBooleanExpr_Operator();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.ArithmeticExprImpl <em>Arithmetic Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.ArithmeticExprImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getArithmeticExpr()
		 * @generated
		 */
		EClass ARITHMETIC_EXPR = eINSTANCE.getArithmeticExpr();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.BooleanOPeratorImpl <em>Boolean OPerator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.BooleanOPeratorImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getBooleanOPerator()
		 * @generated
		 */
		EClass BOOLEAN_OPERATOR = eINSTANCE.getBooleanOPerator();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.ReturnExpImpl <em>Return Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.ReturnExpImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getReturnExp()
		 * @generated
		 */
		EClass RETURN_EXP = eINSTANCE.getReturnExp();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_EXP__EXPRESSION = eINSTANCE.getReturnExp_Expression();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.ExpressionUnairImpl <em>Expression Unair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.ExpressionUnairImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getExpressionUnair()
		 * @generated
		 */
		EClass EXPRESSION_UNAIR = eINSTANCE.getExpressionUnair();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.FunctionCallExprImpl <em>Function Call Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.FunctionCallExprImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getFunctionCallExpr()
		 * @generated
		 */
		EClass FUNCTION_CALL_EXPR = eINSTANCE.getFunctionCallExpr();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_EXPR__FUNCTION = eINSTANCE.getFunctionCallExpr_Function();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_EXPR__ARGUMENTS = eINSTANCE.getFunctionCallExpr_Arguments();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.VariableCallExprImpl <em>Variable Call Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.VariableCallExprImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getVariableCallExpr()
		 * @generated
		 */
		EClass VARIABLE_CALL_EXPR = eINSTANCE.getVariableCallExpr();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CALL_EXPR__VARIABLE = eINSTANCE.getVariableCallExpr_Variable();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.AddSubExprImpl <em>Add Sub Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.AddSubExprImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getAddSubExpr()
		 * @generated
		 */
		EClass ADD_SUB_EXPR = eINSTANCE.getAddSubExpr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_SUB_EXPR__LEFT = eINSTANCE.getAddSubExpr_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_SUB_EXPR__OPERATOR = eINSTANCE.getAddSubExpr_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_SUB_EXPR__RIGHT = eINSTANCE.getAddSubExpr_Right();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.MultiDivExprImpl <em>Multi Div Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.MultiDivExprImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getMultiDivExpr()
		 * @generated
		 */
		EClass MULTI_DIV_EXPR = eINSTANCE.getMultiDivExpr();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_DIV_EXPR__RIGHT = eINSTANCE.getMultiDivExpr_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_DIV_EXPR__LEFT = eINSTANCE.getMultiDivExpr_Left();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.AddSubOperatorImpl <em>Add Sub Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.AddSubOperatorImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getAddSubOperator()
		 * @generated
		 */
		EClass ADD_SUB_OPERATOR = eINSTANCE.getAddSubOperator();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.MultiDivOperatorImpl <em>Multi Div Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.MultiDivOperatorImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getMultiDivOperator()
		 * @generated
		 */
		EClass MULTI_DIV_OPERATOR = eINSTANCE.getMultiDivOperator();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.BaseExprImpl <em>Base Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.BaseExprImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getBaseExpr()
		 * @generated
		 */
		EClass BASE_EXPR = eINSTANCE.getBaseExpr();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.GetSensorsImpl <em>Get Sensors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.GetSensorsImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getGetSensors()
		 * @generated
		 */
		EClass GET_SENSORS = eINSTANCE.getGetSensors();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.ValueImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.MultiDivRightExpImpl <em>Multi Div Right Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.MultiDivRightExpImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getMultiDivRightExp()
		 * @generated
		 */
		EClass MULTI_DIV_RIGHT_EXP = eINSTANCE.getMultiDivRightExp();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_DIV_RIGHT_EXP__OPERATOR = eINSTANCE.getMultiDivRightExp_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_DIV_RIGHT_EXP__RIGHT = eINSTANCE.getMultiDivRightExp_Right();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.AddSubbRightExpImpl <em>Add Subb Right Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.AddSubbRightExpImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getAddSubbRightExp()
		 * @generated
		 */
		EClass ADD_SUBB_RIGHT_EXP = eINSTANCE.getAddSubbRightExp();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_SUBB_RIGHT_EXP__OPERATOR = eINSTANCE.getAddSubbRightExp_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_SUBB_RIGHT_EXP__RIGHT = eINSTANCE.getAddSubbRightExp_Right();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.Type
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.Unit <em>Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.Unit
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getUnit()
		 * @generated
		 */
		EEnum UNIT = eINSTANCE.getUnit();

	}

} //RobotMlEcoreMetamodelPackage
