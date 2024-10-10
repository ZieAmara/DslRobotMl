/**
 */
package robotMlEcoreMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Subb Right Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.AddSubbRightExp#getOperator <em>Operator</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.AddSubbRightExp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getAddSubbRightExp()
 * @model
 * @generated
 */
public interface AddSubbRightExp extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(AddSubOperator)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getAddSubbRightExp_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AddSubOperator getOperator();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.AddSubbRightExp#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AddSubOperator value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(MultiDivExpr)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getAddSubbRightExp_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultiDivExpr getRight();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.AddSubbRightExp#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(MultiDivExpr value);

} // AddSubbRightExp
