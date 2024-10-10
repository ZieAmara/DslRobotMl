/**
 */
package robotMlEcoreMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.VariableAssign#getVariable <em>Variable</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.VariableAssign#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getVariableAssign()
 * @model
 * @generated
 */
public interface VariableAssign extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(VariableDecl)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getVariableAssign_Variable()
	 * @model required="true"
	 * @generated
	 */
	VariableDecl getVariable();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.VariableAssign#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableDecl value);

	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' containment reference.
	 * @see #setValeur(Expression)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getVariableAssign_Valeur()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValeur();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.VariableAssign#getValeur <em>Valeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' containment reference.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(Expression value);

} // VariableAssign
