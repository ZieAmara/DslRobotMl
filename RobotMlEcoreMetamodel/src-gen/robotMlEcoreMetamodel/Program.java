/**
 */
package robotMlEcoreMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.Program#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link robotMlEcoreMetamodel.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getProgram_Function()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunction();

} // Program
