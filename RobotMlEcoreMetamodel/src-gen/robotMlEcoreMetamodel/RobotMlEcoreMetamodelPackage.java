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
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference list.
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
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.NewEClass45Impl <em>New EClass45</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.NewEClass45Impl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getNewEClass45()
	 * @generated
	 */
	int NEW_ECLASS45 = 2;

	/**
	 * The number of structural features of the '<em>New EClass45</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS45_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass45</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS45_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ReturnTypeImpl <em>Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ReturnTypeImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 3;

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
	int STATEMENT = 4;

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
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.VariableImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.MovementImpl <em>Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.MovementImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getMovement()
	 * @generated
	 */
	int MOVEMENT = 6;

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
	int CONTROL_STRUCTURE = 7;

	/**
	 * The feature id for the '<em><b>Booleanexpression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__BOOLEANEXPRESSION = STATEMENT_FEATURE_COUNT + 0;

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
	int IF = 8;

	/**
	 * The feature id for the '<em><b>Booleanexpression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BOOLEANEXPRESSION = CONTROL_STRUCTURE__BOOLEANEXPRESSION;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference list.
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
	int LOOP = 9;

	/**
	 * The feature id for the '<em><b>Booleanexpression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BOOLEANEXPRESSION = CONTROL_STRUCTURE__BOOLEANEXPRESSION;

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
	int FORWARD = 10;

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
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.RotationImpl <em>Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.RotationImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 16;

	/**
	 * The number of structural features of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.RotateLeftImpl <em>Rotate Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.RotateLeftImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getRotateLeft()
	 * @generated
	 */
	int ROTATE_LEFT = 11;

	/**
	 * The number of structural features of the '<em>Rotate Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_LEFT_FEATURE_COUNT = ROTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rotate Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_LEFT_OPERATION_COUNT = ROTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.BackwardImpl <em>Backward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.BackwardImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getBackward()
	 * @generated
	 */
	int BACKWARD = 12;

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
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.RotateRightImpl <em>Rotate Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.RotateRightImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getRotateRight()
	 * @generated
	 */
	int ROTATE_RIGHT = 13;

	/**
	 * The number of structural features of the '<em>Rotate Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_RIGHT_FEATURE_COUNT = ROTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rotate Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_RIGHT_OPERATION_COUNT = ROTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.RightImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 14;

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
	int LEFT = 15;

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
	int SET_SPEED = 17;

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
	int VARIABLE_ASSIGN = 18;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGN__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

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
	int CLOCK = 19;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__ANGLE = ROTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = ROTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = ROTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.ExpressionImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 20;

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
	int FUNCTION_CALL = 21;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FUNCTION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

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
	int PARAMETER = 22;

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
	int BOOLEAN_EXPR = 23;

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
	int ARITHMETIC_EXPR = 24;

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
	int BOOLEAN_OPERATOR = 25;

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
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.LowerThanImpl <em>Lower Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.LowerThanImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getLowerThan()
	 * @generated
	 */
	int LOWER_THAN = 26;

	/**
	 * The number of structural features of the '<em>Lower Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lower Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.UpperThanImpl <em>Upper Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.UpperThanImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getUpperThan()
	 * @generated
	 */
	int UPPER_THAN = 27;

	/**
	 * The number of structural features of the '<em>Upper Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_THAN_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Upper Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_THAN_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.EqualToImpl <em>Equal To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.EqualToImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getEqualTo()
	 * @generated
	 */
	int EQUAL_TO = 28;

	/**
	 * The number of structural features of the '<em>Equal To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.AddImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 29;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = ARITHMETIC_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = ARITHMETIC_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.MultiplicationImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 30;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = ARITHMETIC_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_OPERATION_COUNT = ARITHMETIC_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.NewEClass74Impl <em>New EClass74</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.NewEClass74Impl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getNewEClass74()
	 * @generated
	 */
	int NEW_ECLASS74 = 31;

	/**
	 * The number of structural features of the '<em>New EClass74</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS74_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass74</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS74_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.SubImpl <em>Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.SubImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getSub()
	 * @generated
	 */
	int SUB = 32;

	/**
	 * The number of structural features of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FEATURE_COUNT = ARITHMETIC_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OPERATION_COUNT = ARITHMETIC_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.impl.DivisionImpl
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 33;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = ARITHMETIC_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = ARITHMETIC_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.Type
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 35;

	/**
	 * The meta object id for the '{@link robotMlEcoreMetamodel.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotMlEcoreMetamodel.Unit
	 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 34;

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
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.Function#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Returntype</em>'.
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
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.NewEClass45 <em>New EClass45</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass45</em>'.
	 * @see robotMlEcoreMetamodel.NewEClass45
	 * @generated
	 */
	EClass getNewEClass45();

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
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see robotMlEcoreMetamodel.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link robotMlEcoreMetamodel.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotMlEcoreMetamodel.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link robotMlEcoreMetamodel.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see robotMlEcoreMetamodel.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

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
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.ControlStructure#getBooleanexpression <em>Booleanexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Booleanexpression</em>'.
	 * @see robotMlEcoreMetamodel.ControlStructure#getBooleanexpression()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Booleanexpression();

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
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else</em>'.
	 * @see robotMlEcoreMetamodel.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.If#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then</em>'.
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
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.RotateLeft <em>Rotate Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate Left</em>'.
	 * @see robotMlEcoreMetamodel.RotateLeft
	 * @generated
	 */
	EClass getRotateLeft();

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
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.RotateRight <em>Rotate Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate Right</em>'.
	 * @see robotMlEcoreMetamodel.RotateRight
	 * @generated
	 */
	EClass getRotateRight();

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
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation</em>'.
	 * @see robotMlEcoreMetamodel.Rotation
	 * @generated
	 */
	EClass getRotation();

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
	 * Returns the meta object for the containment reference list '{@link robotMlEcoreMetamodel.FunctionCall#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see robotMlEcoreMetamodel.FunctionCall#getExpression()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Expression();

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
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.LowerThan <em>Lower Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Than</em>'.
	 * @see robotMlEcoreMetamodel.LowerThan
	 * @generated
	 */
	EClass getLowerThan();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.UpperThan <em>Upper Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Than</em>'.
	 * @see robotMlEcoreMetamodel.UpperThan
	 * @generated
	 */
	EClass getUpperThan();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.EqualTo <em>Equal To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal To</em>'.
	 * @see robotMlEcoreMetamodel.EqualTo
	 * @generated
	 */
	EClass getEqualTo();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see robotMlEcoreMetamodel.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see robotMlEcoreMetamodel.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.NewEClass74 <em>New EClass74</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass74</em>'.
	 * @see robotMlEcoreMetamodel.NewEClass74
	 * @generated
	 */
	EClass getNewEClass74();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Sub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub</em>'.
	 * @see robotMlEcoreMetamodel.Sub
	 * @generated
	 */
	EClass getSub();

	/**
	 * Returns the meta object for class '{@link robotMlEcoreMetamodel.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see robotMlEcoreMetamodel.Division
	 * @generated
	 */
	EClass getDivision();

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
		 * The meta object literal for the '<em><b>Returntype</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.NewEClass45Impl <em>New EClass45</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.NewEClass45Impl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getNewEClass45()
		 * @generated
		 */
		EClass NEW_ECLASS45 = eINSTANCE.getNewEClass45();

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
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.VariableImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

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
		 * The meta object literal for the '<em><b>Booleanexpression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__BOOLEANEXPRESSION = eINSTANCE.getControlStructure_Booleanexpression();

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
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.RotateLeftImpl <em>Rotate Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.RotateLeftImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getRotateLeft()
		 * @generated
		 */
		EClass ROTATE_LEFT = eINSTANCE.getRotateLeft();

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
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.RotateRightImpl <em>Rotate Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.RotateRightImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getRotateRight()
		 * @generated
		 */
		EClass ROTATE_RIGHT = eINSTANCE.getRotateRight();

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
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.RotationImpl <em>Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.RotationImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getRotation()
		 * @generated
		 */
		EClass ROTATION = eINSTANCE.getRotation();

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
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__EXPRESSION = eINSTANCE.getFunctionCall_Expression();

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
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.LowerThanImpl <em>Lower Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.LowerThanImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getLowerThan()
		 * @generated
		 */
		EClass LOWER_THAN = eINSTANCE.getLowerThan();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.UpperThanImpl <em>Upper Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.UpperThanImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getUpperThan()
		 * @generated
		 */
		EClass UPPER_THAN = eINSTANCE.getUpperThan();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.EqualToImpl <em>Equal To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.EqualToImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getEqualTo()
		 * @generated
		 */
		EClass EQUAL_TO = eINSTANCE.getEqualTo();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.AddImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.MultiplicationImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.NewEClass74Impl <em>New EClass74</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.NewEClass74Impl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getNewEClass74()
		 * @generated
		 */
		EClass NEW_ECLASS74 = eINSTANCE.getNewEClass74();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.SubImpl <em>Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.SubImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getSub()
		 * @generated
		 */
		EClass SUB = eINSTANCE.getSub();

		/**
		 * The meta object literal for the '{@link robotMlEcoreMetamodel.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotMlEcoreMetamodel.impl.DivisionImpl
		 * @see robotMlEcoreMetamodel.impl.RobotMlEcoreMetamodelPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

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
