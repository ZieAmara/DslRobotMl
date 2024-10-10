/**
 */
package robotMlEcoreMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robotMlEcoreMetamodel.AddSubExpr;
import robotMlEcoreMetamodel.AddSubOperator;
import robotMlEcoreMetamodel.AddSubbRightExp;
import robotMlEcoreMetamodel.MultiDivExpr;
import robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Sub Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.impl.AddSubExprImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.impl.AddSubExprImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.impl.AddSubExprImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddSubExprImpl extends ArithmeticExprImpl implements AddSubExpr {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected MultiDivExpr left;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<AddSubOperator> operator;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected EList<AddSubbRightExp> right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddSubExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotMlEcoreMetamodelPackage.Literals.ADD_SUB_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiDivExpr getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(MultiDivExpr newLeft, NotificationChain msgs) {
		MultiDivExpr oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__LEFT, oldLeft, newLeft);
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
	public void setLeft(MultiDivExpr newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject) left).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject) newLeft).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__LEFT,
					newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddSubOperator> getOperator() {
		if (operator == null) {
			operator = new EObjectContainmentEList<AddSubOperator>(AddSubOperator.class, this,
					RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__OPERATOR);
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AddSubbRightExp> getRight() {
		if (right == null) {
			right = new EObjectContainmentEList<AddSubbRightExp>(AddSubbRightExp.class, this,
					RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__RIGHT);
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__LEFT:
			return basicSetLeft(null, msgs);
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__OPERATOR:
			return ((InternalEList<?>) getOperator()).basicRemove(otherEnd, msgs);
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__RIGHT:
			return ((InternalEList<?>) getRight()).basicRemove(otherEnd, msgs);
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
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__LEFT:
			return getLeft();
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__OPERATOR:
			return getOperator();
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__RIGHT:
			return getRight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__LEFT:
			setLeft((MultiDivExpr) newValue);
			return;
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__OPERATOR:
			getOperator().clear();
			getOperator().addAll((Collection<? extends AddSubOperator>) newValue);
			return;
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__RIGHT:
			getRight().clear();
			getRight().addAll((Collection<? extends AddSubbRightExp>) newValue);
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
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__LEFT:
			setLeft((MultiDivExpr) null);
			return;
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__OPERATOR:
			getOperator().clear();
			return;
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__RIGHT:
			getRight().clear();
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
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__LEFT:
			return left != null;
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__OPERATOR:
			return operator != null && !operator.isEmpty();
		case RobotMlEcoreMetamodelPackage.ADD_SUB_EXPR__RIGHT:
			return right != null && !right.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AddSubExprImpl
