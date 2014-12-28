/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;
import maintenancemodel.Extra;
import maintenancemodel.ExtraHandler;
import maintenancemodel.ExtrasMaintenance;
import maintenancemodel.MaintenancemodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the maintenancemodel object '<em><b>Extras Maintenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.ExtrasMaintenanceImpl#getExtras <em>Extras</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtrasMaintenanceImpl extends MinimalEObjectImpl.Container implements ExtrasMaintenance {
	/**
	 * The cached value of the '{@link #getExtras() <em>Extras</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtras()
	 * @generated
	 * @ordered
	 */
	protected ExtraHandler extras;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtrasMaintenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.EXTRAS_MAINTENANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ExtraHandler getExtras() {
		return extras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtras(ExtraHandler newExtras, NotificationChain msgs) {
		ExtraHandler oldExtras = extras;
		extras = newExtras;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.EXTRAS_MAINTENANCE__EXTRAS, oldExtras, newExtras);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtras(ExtraHandler newExtras) {
		if (newExtras != extras) {
			NotificationChain msgs = null;
			if (extras != null)
				msgs = ((InternalEObject)extras).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.EXTRAS_MAINTENANCE__EXTRAS, null, msgs);
			if (newExtras != null)
				msgs = ((InternalEObject)newExtras).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.EXTRAS_MAINTENANCE__EXTRAS, null, msgs);
			msgs = basicSetExtras(newExtras, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.EXTRAS_MAINTENANCE__EXTRAS, newExtras, newExtras));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int addExtra(int price, String ID, String name, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int removeExtra(Extra extra) {
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
		return extras.getExtra(ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int editExtra(int price, String ID, String name, String description) {
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
			case MaintenancemodelPackage.EXTRAS_MAINTENANCE__EXTRAS:
				return basicSetExtras(null, msgs);
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
			case MaintenancemodelPackage.EXTRAS_MAINTENANCE__EXTRAS:
				return getExtras();
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
			case MaintenancemodelPackage.EXTRAS_MAINTENANCE__EXTRAS:
				setExtras((ExtraHandler)newValue);
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
			case MaintenancemodelPackage.EXTRAS_MAINTENANCE__EXTRAS:
				setExtras((ExtraHandler)null);
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
			case MaintenancemodelPackage.EXTRAS_MAINTENANCE__EXTRAS:
				return extras != null;
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
			case MaintenancemodelPackage.EXTRAS_MAINTENANCE___ADD_EXTRA__INT_STRING_STRING_STRING:
				return addExtra((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case MaintenancemodelPackage.EXTRAS_MAINTENANCE___REMOVE_EXTRA__EXTRA:
				return removeExtra((Extra)arguments.get(0));
			case MaintenancemodelPackage.EXTRAS_MAINTENANCE___GET_EXTRA__INT:
				return getExtra((Integer)arguments.get(0));
			case MaintenancemodelPackage.EXTRAS_MAINTENANCE___EDIT_EXTRA__INT_STRING_STRING_STRING:
				return editExtra((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExtrasMaintenanceImpl
