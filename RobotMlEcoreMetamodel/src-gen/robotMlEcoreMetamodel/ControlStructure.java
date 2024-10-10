/**
 */
package robotMlEcoreMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.ControlStructure#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getControlStructure()
 * @model abstract="true"
 * @generated
 */
public interface ControlStructure extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link robotMlEcoreMetamodel.BooleanExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getControlStructure_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BooleanExpr> getCondition();

} // ControlStructure
