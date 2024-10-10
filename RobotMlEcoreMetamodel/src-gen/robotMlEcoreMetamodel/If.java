/**
 */
package robotMlEcoreMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.If#getElse <em>Else</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.If#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getIf()
 * @model
 * @generated
 */
public interface If extends ControlStructure {
	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Statement)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getIf_Else()
	 * @model containment="true"
	 * @generated
	 */
	Statement getElse();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.If#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Statement value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Statement)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getIf_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getThen();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.If#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Statement value);

} // If
