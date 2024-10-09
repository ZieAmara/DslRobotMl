/**
 */
package robotMlEcoreMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Speed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.SetSpeed#getUnit <em>Unit</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.SetSpeed#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getSetSpeed()
 * @model
 * @generated
 */
public interface SetSpeed extends Statement {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link robotMlEcoreMetamodel.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see robotMlEcoreMetamodel.Unit
	 * @see #setUnit(Unit)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getSetSpeed_Unit()
	 * @model
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.SetSpeed#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see robotMlEcoreMetamodel.Unit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(Expression)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getSetSpeed_Distance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getDistance();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.SetSpeed#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Expression value);

} // SetSpeed
