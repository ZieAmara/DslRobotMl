/**
 */
package robotMlEcoreMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robotMlEcoreMetamodel.Expression;
import robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage;
import robotMlEcoreMetamodel.Type;
import robotMlEcoreMetamodel.VariableDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.impl.VariableDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.impl.VariableDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.impl.VariableDeclImpl#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclImpl extends StatementImpl implements VariableDecl {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.NUMBER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected Expression valeur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotMlEcoreMetamodelPackage.Literals.VARIABLE_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMlEcoreMetamodelPackage.VARIABLE_DECL__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMlEcoreMetamodelPackage.VARIABLE_DECL__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValeur() {
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValeur(Expression newValeur, NotificationChain msgs) {
		Expression oldValeur = valeur;
		valeur = newValeur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotMlEcoreMetamodelPackage.VARIABLE_DECL__VALEUR, oldValeur, newValeur);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValeur(Expression newValeur) {
		if (newValeur != valeur) {
			NotificationChain msgs = null;
			if (valeur != null)
				msgs = ((InternalEObject) valeur).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotMlEcoreMetamodelPackage.VARIABLE_DECL__VALEUR, null, msgs);
			if (newValeur != null)
				msgs = ((InternalEObject) newValeur).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotMlEcoreMetamodelPackage.VARIABLE_DECL__VALEUR, null, msgs);
			msgs = basicSetValeur(newValeur, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMlEcoreMetamodelPackage.VARIABLE_DECL__VALEUR,
					newValeur, newValeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__VALEUR:
			return basicSetValeur(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__NAME:
			return getName();
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__TYPE:
			return getType();
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__VALEUR:
			return getValeur();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__NAME:
			setName((String) newValue);
			return;
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__TYPE:
			setType((Type) newValue);
			return;
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__VALEUR:
			setValeur((Expression) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__VALEUR:
			setValeur((Expression) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__TYPE:
			return type != TYPE_EDEFAULT;
		case RobotMlEcoreMetamodelPackage.VARIABLE_DECL__VALEUR:
			return valeur != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //VariableDeclImpl
