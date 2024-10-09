/**
 */
package robotMlEcoreMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.Movement#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getMovement()
 * @model abstract="true"
 * @generated
 */
public interface Movement extends Statement {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(Expression)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getMovement_Distance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getDistance();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.Movement#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Expression value);

} // Movement
