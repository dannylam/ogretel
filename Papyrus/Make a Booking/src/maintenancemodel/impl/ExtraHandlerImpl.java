/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import maintenancemodel.Extra;
import maintenancemodel.ExtraHandler;
import maintenancemodel.IntegerToExtraMap;
import maintenancemodel.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extra Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.ExtraHandlerImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link maintenancemodel.impl.ExtraHandlerImpl#getExtraTable <em>Extra Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtraHandlerImpl extends MinimalEObjectImpl.Container implements ExtraHandler {
	/**
	 * The cached value of the '{@link #getExtra() <em>Extra</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtra()
	 * @generated
	 * @ordered
	 */
	protected EList<Extra> extra;

	/**
	 * The cached value of the '{@link #getExtraTable() <em>Extra Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraTable()
	 * @generated
	 * @ordered
	 */
	protected IntegerToExtraMap extraTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtraHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXTRA_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extra> getExtra() {
		if (extra == null) {
			extra = new EObjectResolvingEList<Extra>(Extra.class, this, ModelPackage.EXTRA_HANDLER__EXTRA);
		}
		return extra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerToExtraMap getExtraTable() {
		return extraTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtraTable(IntegerToExtraMap newExtraTable, NotificationChain msgs) {
		IntegerToExtraMap oldExtraTable = extraTable;
		extraTable = newExtraTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.EXTRA_HANDLER__EXTRA_TABLE, oldExtraTable, newExtraTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraTable(IntegerToExtraMap newExtraTable) {
		if (newExtraTable != extraTable) {
			NotificationChain msgs = null;
			if (extraTable != null)
				msgs = ((InternalEObject)extraTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.EXTRA_HANDLER__EXTRA_TABLE, null, msgs);
			if (newExtraTable != null)
				msgs = ((InternalEObject)newExtraTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.EXTRA_HANDLER__EXTRA_TABLE, null, msgs);
			msgs = basicSetExtraTable(newExtraTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXTRA_HANDLER__EXTRA_TABLE, newExtraTable, newExtraTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean exists(int ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addExtra(int price, String ID, String name, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeExtra(Extra extra) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extra getExtra(int ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.EXTRA_HANDLER__EXTRA_TABLE:
				return basicSetExtraTable(null, msgs);
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
			case ModelPackage.EXTRA_HANDLER__EXTRA:
				return getExtra();
			case ModelPackage.EXTRA_HANDLER__EXTRA_TABLE:
				return getExtraTable();
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
			case ModelPackage.EXTRA_HANDLER__EXTRA:
				getExtra().clear();
				getExtra().addAll((Collection<? extends Extra>)newValue);
				return;
			case ModelPackage.EXTRA_HANDLER__EXTRA_TABLE:
				setExtraTable((IntegerToExtraMap)newValue);
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
			case ModelPackage.EXTRA_HANDLER__EXTRA:
				getExtra().clear();
				return;
			case ModelPackage.EXTRA_HANDLER__EXTRA_TABLE:
				setExtraTable((IntegerToExtraMap)null);
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
			case ModelPackage.EXTRA_HANDLER__EXTRA:
				return extra != null && !extra.isEmpty();
			case ModelPackage.EXTRA_HANDLER__EXTRA_TABLE:
				return extraTable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.EXTRA_HANDLER___EXISTS__INT:
				return exists((Integer)arguments.get(0));
			case ModelPackage.EXTRA_HANDLER___ADD_EXTRA__INT_STRING_STRING_STRING:
				addExtra((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case ModelPackage.EXTRA_HANDLER___REMOVE_EXTRA__EXTRA:
				removeExtra((Extra)arguments.get(0));
				return null;
			case ModelPackage.EXTRA_HANDLER___GET_EXTRA__INT:
				return getExtra((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExtraHandlerImpl
