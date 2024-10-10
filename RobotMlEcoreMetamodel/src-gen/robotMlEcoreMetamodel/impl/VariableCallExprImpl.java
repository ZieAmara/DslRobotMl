/**
 */
package robotMlEcoreMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage;
import robotMlEcoreMetamodel.VariableCallExpr;
import robotMlEcoreMetamodel.VariableDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Call Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.impl.VariableCallExprImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableCallExprImpl extends ExpressionUnairImpl implements VariableCallExpr {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableCallExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotMlEcoreMetamodelPackage.Literals.VARIABLE_CALL_EXPR;
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
							RobotMlEcoreMetamodelPackage.VARIABLE_CALL_EXPR__VARIABLE, oldVariable, variable));
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
					RobotMlEcoreMetamodelPackage.VARIABLE_CALL_EXPR__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RobotMlEcoreMetamodelPackage.VARIABLE_CALL_EXPR__VARIABLE:
			if (resolve)
				return getVariable();
			return basicGetVariable();
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
		case RobotMlEcoreMetamodelPackage.VARIABLE_CALL_EXPR__VARIABLE:
			setVariable((VariableDecl) newValue);
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
		case RobotMlEcoreMetamodelPackage.VARIABLE_CALL_EXPR__VARIABLE:
			setVariable((VariableDecl) null);
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
		case RobotMlEcoreMetamodelPackage.VARIABLE_CALL_EXPR__VARIABLE:
			return variable != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableCallExprImpl
