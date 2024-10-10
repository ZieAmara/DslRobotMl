/**
 */
package robotMlEcoreMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.Clock#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getClock()
 * @model
 * @generated
 */
public interface Clock extends Statement {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(Expression)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getClock_Angle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAngle();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.Clock#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Expression value);

} // Clock
