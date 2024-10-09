/**
 */
package robotMlEcoreMetamodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import robotMlEcoreMetamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage
 * @generated
 */
public class RobotMlEcoreMetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobotMlEcoreMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotMlEcoreMetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = RobotMlEcoreMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RobotMlEcoreMetamodelPackage.PROGRAM: {
			Program program = (Program) theEObject;
			T result = caseProgram(program);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.FUNCTION: {
			Function function = (Function) theEObject;
			T result = caseFunction(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.NEW_ECLASS45: {
			NewEClass45 newEClass45 = (NewEClass45) theEObject;
			T result = caseNewEClass45(newEClass45);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.RETURN_TYPE: {
			ReturnType returnType = (ReturnType) theEObject;
			T result = caseReturnType(returnType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseStatement(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.MOVEMENT: {
			Movement movement = (Movement) theEObject;
			T result = caseMovement(movement);
			if (result == null)
				result = caseStatement(movement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.CONTROL_STRUCTURE: {
			ControlStructure controlStructure = (ControlStructure) theEObject;
			T result = caseControlStructure(controlStructure);
			if (result == null)
				result = caseStatement(controlStructure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.IF: {
			If if_ = (If) theEObject;
			T result = caseIf(if_);
			if (result == null)
				result = caseControlStructure(if_);
			if (result == null)
				result = caseStatement(if_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.LOOP: {
			Loop loop = (Loop) theEObject;
			T result = caseLoop(loop);
			if (result == null)
				result = caseControlStructure(loop);
			if (result == null)
				result = caseStatement(loop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.FORWARD: {
			Forward forward = (Forward) theEObject;
			T result = caseForward(forward);
			if (result == null)
				result = caseMovement(forward);
			if (result == null)
				result = caseStatement(forward);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.ROTATE_LEFT: {
			RotateLeft rotateLeft = (RotateLeft) theEObject;
			T result = caseRotateLeft(rotateLeft);
			if (result == null)
				result = caseRotation(rotateLeft);
			if (result == null)
				result = caseStatement(rotateLeft);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.BACKWARD: {
			Backward backward = (Backward) theEObject;
			T result = caseBackward(backward);
			if (result == null)
				result = caseMovement(backward);
			if (result == null)
				result = caseStatement(backward);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.ROTATE_RIGHT: {
			RotateRight rotateRight = (RotateRight) theEObject;
			T result = caseRotateRight(rotateRight);
			if (result == null)
				result = caseRotation(rotateRight);
			if (result == null)
				result = caseStatement(rotateRight);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.RIGHT: {
			Right right = (Right) theEObject;
			T result = caseRight(right);
			if (result == null)
				result = caseMovement(right);
			if (result == null)
				result = caseStatement(right);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.LEFT: {
			Left left = (Left) theEObject;
			T result = caseLeft(left);
			if (result == null)
				result = caseMovement(left);
			if (result == null)
				result = caseStatement(left);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.ROTATION: {
			Rotation rotation = (Rotation) theEObject;
			T result = caseRotation(rotation);
			if (result == null)
				result = caseStatement(rotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.SET_SPEED: {
			SetSpeed setSpeed = (SetSpeed) theEObject;
			T result = caseSetSpeed(setSpeed);
			if (result == null)
				result = caseStatement(setSpeed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN: {
			VariableAssign variableAssign = (VariableAssign) theEObject;
			T result = caseVariableAssign(variableAssign);
			if (result == null)
				result = caseStatement(variableAssign);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.CLOCK: {
			Clock clock = (Clock) theEObject;
			T result = caseClock(clock);
			if (result == null)
				result = caseRotation(clock);
			if (result == null)
				result = caseStatement(clock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.FUNCTION_CALL: {
			FunctionCall functionCall = (FunctionCall) theEObject;
			T result = caseFunctionCall(functionCall);
			if (result == null)
				result = caseStatement(functionCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.BOOLEAN_EXPR: {
			BooleanExpr booleanExpr = (BooleanExpr) theEObject;
			T result = caseBooleanExpr(booleanExpr);
			if (result == null)
				result = caseExpression(booleanExpr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.ARITHMETIC_EXPR: {
			ArithmeticExpr arithmeticExpr = (ArithmeticExpr) theEObject;
			T result = caseArithmeticExpr(arithmeticExpr);
			if (result == null)
				result = caseExpression(arithmeticExpr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.BOOLEAN_OPERATOR: {
			BooleanOPerator booleanOPerator = (BooleanOPerator) theEObject;
			T result = caseBooleanOPerator(booleanOPerator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.LOWER_THAN: {
			LowerThan lowerThan = (LowerThan) theEObject;
			T result = caseLowerThan(lowerThan);
			if (result == null)
				result = caseBooleanOPerator(lowerThan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.UPPER_THAN: {
			UpperThan upperThan = (UpperThan) theEObject;
			T result = caseUpperThan(upperThan);
			if (result == null)
				result = caseBooleanOPerator(upperThan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.EQUAL_TO: {
			EqualTo equalTo = (EqualTo) theEObject;
			T result = caseEqualTo(equalTo);
			if (result == null)
				result = caseBooleanOPerator(equalTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.ADD: {
			Add add = (Add) theEObject;
			T result = caseAdd(add);
			if (result == null)
				result = caseArithmeticExpr(add);
			if (result == null)
				result = caseExpression(add);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.MULTIPLICATION: {
			Multiplication multiplication = (Multiplication) theEObject;
			T result = caseMultiplication(multiplication);
			if (result == null)
				result = caseArithmeticExpr(multiplication);
			if (result == null)
				result = caseExpression(multiplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.NEW_ECLASS74: {
			NewEClass74 newEClass74 = (NewEClass74) theEObject;
			T result = caseNewEClass74(newEClass74);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.SUB: {
			Sub sub = (Sub) theEObject;
			T result = caseSub(sub);
			if (result == null)
				result = caseArithmeticExpr(sub);
			if (result == null)
				result = caseExpression(sub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotMlEcoreMetamodelPackage.DIVISION: {
			Division division = (Division) theEObject;
			T result = caseDivision(division);
			if (result == null)
				result = caseArithmeticExpr(division);
			if (result == null)
				result = caseExpression(division);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass45</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass45</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass45(NewEClass45 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType(ReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovement(Movement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlStructure(ControlStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForward(Forward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotate Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotate Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotateLeft(RotateLeft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackward(Backward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotate Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotate Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotateRight(RotateRight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRight(Right object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeft(Left object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotation(Rotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Speed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Speed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetSpeed(SetSpeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAssign(VariableAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClock(Clock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCall(FunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpr(BooleanExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticExpr(ArithmeticExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean OPerator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean OPerator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOPerator(BooleanOPerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerThan(LowerThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpperThan(UpperThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualTo(EqualTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass74</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass74</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass74(NewEClass74 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSub(Sub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RobotMlEcoreMetamodelSwitch
