/**
 */
package robotMlEcoreMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Div Right Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.MultiDivRightExp#getOperator <em>Operator</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.MultiDivRightExp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getMultiDivRightExp()
 * @model
 * @generated
 */
public interface MultiDivRightExp extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(MultiDivOperator)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getMultiDivRightExp_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultiDivOperator getOperator();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.MultiDivRightExp#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(MultiDivOperator value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(BaseExpr)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getMultiDivRightExp_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BaseExpr getRight();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.MultiDivRightExp#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(BaseExpr value);

} // MultiDivRightExp
