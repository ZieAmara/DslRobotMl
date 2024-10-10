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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robotMlEcoreMetamodel.Function;
import robotMlEcoreMetamodel.Parameter;
import robotMlEcoreMetamodel.ReturnType;
import robotMlEcoreMetamodel.RobotMlEcoreMetamodelPackage;
import robotMlEcoreMetamodel.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotMlEcoreMetamodel.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.impl.FunctionImpl#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.impl.FunctionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link robotMlEcoreMetamodel.impl.FunctionImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
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
	 * The cached value of the '{@link #getReturntype() <em>Returntype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturntype()
	 * @generated
	 * @ordered
	 */
	protected ReturnType returntype;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> body;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotMlEcoreMetamodelPackage.Literals.FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMlEcoreMetamodelPackage.FUNCTION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getReturntype() {
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturntype(ReturnType newReturntype, NotificationChain msgs) {
		ReturnType oldReturntype = returntype;
		returntype = newReturntype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotMlEcoreMetamodelPackage.FUNCTION__RETURNTYPE, oldReturntype, newReturntype);
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
	public void setReturntype(ReturnType newReturntype) {
		if (newReturntype != returntype) {
			NotificationChain msgs = null;
			if (returntype != null)
				msgs = ((InternalEObject) returntype).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotMlEcoreMetamodelPackage.FUNCTION__RETURNTYPE, null, msgs);
			if (newReturntype != null)
				msgs = ((InternalEObject) newReturntype).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotMlEcoreMetamodelPackage.FUNCTION__RETURNTYPE, null, msgs);
			msgs = basicSetReturntype(newReturntype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMlEcoreMetamodelPackage.FUNCTION__RETURNTYPE,
					newReturntype, newReturntype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<Statement>(Statement.class, this,
					RobotMlEcoreMetamodelPackage.FUNCTION__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					RobotMlEcoreMetamodelPackage.FUNCTION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotMlEcoreMetamodelPackage.FUNCTION__RETURNTYPE:
			return basicSetReturntype(null, msgs);
		case RobotMlEcoreMetamodelPackage.FUNCTION__BODY:
			return ((InternalEList<?>) getBody()).basicRemove(otherEnd, msgs);
		case RobotMlEcoreMetamodelPackage.FUNCTION__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
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
		case RobotMlEcoreMetamodelPackage.FUNCTION__NAME:
			return getName();
		case RobotMlEcoreMetamodelPackage.FUNCTION__RETURNTYPE:
			return getReturntype();
		case RobotMlEcoreMetamodelPackage.FUNCTION__BODY:
			return getBody();
		case RobotMlEcoreMetamodelPackage.FUNCTION__PARAMETER:
			return getParameter();
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
		case RobotMlEcoreMetamodelPackage.FUNCTION__NAME:
			setName((String) newValue);
			return;
		case RobotMlEcoreMetamodelPackage.FUNCTION__RETURNTYPE:
			setReturntype((ReturnType) newValue);
			return;
		case RobotMlEcoreMetamodelPackage.FUNCTION__BODY:
			getBody().clear();
			getBody().addAll((Collection<? extends Statement>) newValue);
			return;
		case RobotMlEcoreMetamodelPackage.FUNCTION__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends Parameter>) newValue);
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
		case RobotMlEcoreMetamodelPackage.FUNCTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RobotMlEcoreMetamodelPackage.FUNCTION__RETURNTYPE:
			setReturntype((ReturnType) null);
			return;
		case RobotMlEcoreMetamodelPackage.FUNCTION__BODY:
			getBody().clear();
			return;
		case RobotMlEcoreMetamodelPackage.FUNCTION__PARAMETER:
			getParameter().clear();
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
		case RobotMlEcoreMetamodelPackage.FUNCTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RobotMlEcoreMetamodelPackage.FUNCTION__RETURNTYPE:
			return returntype != null;
		case RobotMlEcoreMetamodelPackage.FUNCTION__BODY:
			return body != null && !body.isEmpty();
		case RobotMlEcoreMetamodelPackage.FUNCTION__PARAMETER:
			return parameter != null && !parameter.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
