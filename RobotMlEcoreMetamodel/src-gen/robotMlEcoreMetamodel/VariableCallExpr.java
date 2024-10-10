/**
 */
package robotMlEcoreMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Call Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.VariableCallExpr#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getVariableCallExpr()
 * @model
 * @generated
 */
public interface VariableCallExpr extends ExpressionUnair {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(VariableDecl)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getVariableCallExpr_Variable()
	 * @model required="true"
	 * @generated
	 */
	VariableDecl getVariable();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.VariableCallExpr#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableDecl value);

} // VariableCallExpr
