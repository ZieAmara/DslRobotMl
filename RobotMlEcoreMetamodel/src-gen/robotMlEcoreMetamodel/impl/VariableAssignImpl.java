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
import robotMlEcoreMetamodel.VariableAssign;
import robotMlEcoreMetamodel.VariableDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.impl.VariableAssignImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.impl.VariableAssignImpl#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableAssignImpl extends StatementImpl implements VariableAssign {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableDecl variable;

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
	protected VariableAssignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotMlEcoreMetamodelPackage.Literals.VARIABLE_ASSIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDecl getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject) variable;
			variable = (VariableDecl) eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDecl basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(VariableDecl newVariable) {
		VariableDecl oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VARIABLE, oldVariable, variable));
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
					RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VALEUR, oldValeur, newValeur);
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
						EOPPOSITE_FEATURE_BASE - RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VALEUR, null, msgs);
			if (newValeur != null)
				msgs = ((InternalEObject) newValeur).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VALEUR, null, msgs);
			msgs = basicSetValeur(newValeur, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VALEUR,
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
		case RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VALEUR:
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
		case RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VARIABLE:
			if (resolve)
				return getVariable();
			return basicGetVariable();
		case RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VALEUR:
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
		case RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VARIABLE:
			setVariable((VariableDecl) newValue);
			return;
		case RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VALEUR:
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
		case RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VARIABLE:
			setVariable((VariableDecl) null);
			return;
		case RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VALEUR:
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
		case RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VARIABLE:
			return variable != null;
		case RobotMlEcoreMetamodelPackage.VARIABLE_ASSIGN__VALEUR:
			return valeur != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableAssignImpl
