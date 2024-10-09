/**
 */
package robotMlEcoreMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.ReturnType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getReturnType()
 * @model
 * @generated
 */
public interface ReturnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link robotMlEcoreMetamodel.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see robotMlEcoreMetamodel.Type
	 * @see #setType(Type)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getReturnType_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.ReturnType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see robotMlEcoreMetamodel.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // ReturnType
