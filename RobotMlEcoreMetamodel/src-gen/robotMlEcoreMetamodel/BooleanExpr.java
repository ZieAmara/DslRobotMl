/**
 */
package robotMlEcoreMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.BooleanExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.BooleanExpr#getRight <em>Right</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.BooleanExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getBooleanExpr()
 * @model
 * @generated
 */
public interface BooleanExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ArithmeticExpr)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getBooleanExpr_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArithmeticExpr getLeft();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.BooleanExpr#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ArithmeticExpr value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ArithmeticExpr)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getBooleanExpr_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArithmeticExpr getRight();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.BooleanExpr#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ArithmeticExpr value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(BooleanOPerator)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getBooleanExpr_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanOPerator getOperator();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.BooleanExpr#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOPerator value);

} // BooleanExpr
