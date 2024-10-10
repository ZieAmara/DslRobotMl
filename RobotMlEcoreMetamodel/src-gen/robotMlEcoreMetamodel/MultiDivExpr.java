/**
 */
package robotMlEcoreMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Div Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.MultiDivExpr#getRight <em>Right</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.MultiDivExpr#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getMultiDivExpr()
 * @model
 * @generated
 */
public interface MultiDivExpr extends EObject {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference list.
	 * The list contents are of type {@link robotMlEcoreMetamodel.MultiDivRightExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference list.
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getMultiDivExpr_Right()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultiDivRightExp> getRight();

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(BaseExpr)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getMultiDivExpr_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BaseExpr getLeft();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.MultiDivExpr#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(BaseExpr value);

} // MultiDivExpr
