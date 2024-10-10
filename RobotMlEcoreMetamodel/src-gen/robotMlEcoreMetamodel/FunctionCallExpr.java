/**
 */
package robotMlEcoreMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.FunctionCallExpr#getFunction <em>Function</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.FunctionCallExpr#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getFunctionCallExpr()
 * @model
 * @generated
 */
public interface FunctionCallExpr extends ExpressionUnair {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(Function)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getFunctionCallExpr_Function()
	 * @model required="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.FunctionCallExpr#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link robotMlEcoreMetamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getFunctionCallExpr_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

} // FunctionCallExpr
