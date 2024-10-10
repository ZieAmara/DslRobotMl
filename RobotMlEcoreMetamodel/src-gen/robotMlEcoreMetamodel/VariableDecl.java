/**
 */
package robotMlEcoreMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.VariableDecl#getName <em>Name</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.VariableDecl#getType <em>Type</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.VariableDecl#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getVariableDecl()
 * @model
 * @generated
 */
public interface VariableDecl extends Statement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getVariableDecl_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.VariableDecl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link robotMlEcoreMetamodel.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see robotMlEcoreMetamodel.Type
	 * @see #setType(Type)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getVariableDecl_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.VariableDecl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see robotMlEcoreMetamodel.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' containment reference.
	 * @see #setValeur(Expression)
	 * @see robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage#getVariableDecl_Valeur()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValeur();

	/**
	 * Sets the value of the '{@link robotMlEcoreMetamodel.VariableDecl#getValeur <em>Valeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' containment reference.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(Expression value);

} // VariableDecl
