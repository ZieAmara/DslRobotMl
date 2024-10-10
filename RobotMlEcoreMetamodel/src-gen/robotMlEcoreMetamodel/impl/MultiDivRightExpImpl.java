/**
 */
package robotMlEcoreMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robotMlEcoreMetamodel.BaseExpr;
import robotMlEcoreMetamodel.MultiDivOperator;
import robotMlEcoreMetamodel.MultiDivRightExp;
import robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Div Right Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.impl.MultiDivRightExpImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.impl.MultiDivRightExpImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiDivRightExpImpl extends MinimalEObjectImpl.Container implements MultiDivRightExp {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected MultiDivOperator operator;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected BaseExpr right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiDivRightExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotMlEcoreMetamodelPackage.Literals.MULTI_DIV_RIGHT_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiDivOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(MultiDivOperator newOperator, NotificationChain msgs) {
		MultiDivOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__OPERATOR, oldOperator, newOperator);
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
	public void setOperator(MultiDivOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject) operator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__OPERATOR, null,
						msgs);
			if (newOperator != null)
				msgs = ((InternalEObject) newOperator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__OPERATOR, null,
						msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseExpr getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(BaseExpr newRight, NotificationChain msgs) {
		BaseExpr oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__RIGHT, oldRight, newRight);
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
	public void setRight(BaseExpr newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject) right).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject) newRight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__OPERATOR:
			return basicSetOperator(null, msgs);
		case RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__RIGHT:
			return basicSetRight(null, msgs);
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
		case RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__OPERATOR:
			return getOperator();
		case RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__RIGHT:
			return getRight();
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
		case RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__OPERATOR:
			setOperator((MultiDivOperator) newValue);
			return;
		case RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__RIGHT:
			setRight((BaseExpr) newValue);
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
		case RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__OPERATOR:
			setOperator((MultiDivOperator) null);
			return;
		case RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__RIGHT:
			setRight((BaseExpr) null);
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
		case RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__OPERATOR:
			return operator != null;
		case RobotMlEcoreMetamodelPackage.MULTI_DIV_RIGHT_EXP__RIGHT:
			return right != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiDivRightExpImpl
