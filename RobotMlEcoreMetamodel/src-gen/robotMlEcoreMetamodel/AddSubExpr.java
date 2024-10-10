/**
 */
package robotMlEcoreMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Sub Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.AddSubExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.AddSubExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.AddSubExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getAddSubExpr()
 * @model
 * @generated
 */
public interface AddSubExpr extends ArithmeticExpr {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(MultiDivExpr)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getAddSubExpr_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultiDivExpr getLeft();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.AddSubExpr#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(MultiDivExpr value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference list.
	 * The list contents are of type {@link robotMlEcoreMetamodel.AddSubOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference list.
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getAddSubExpr_Operator()
	 * @model containment="true"
	 * @generated
	 */
	EList<AddSubOperator> getOperator();

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference list.
	 * The list contents are of type {@link robotMlEcoreMetamodel.AddSubbRightExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference list.
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getAddSubExpr_Right()
	 * @model containment="true"
	 * @generated
	 */
	EList<AddSubbRightExp> getRight();

} // AddSubExpr
