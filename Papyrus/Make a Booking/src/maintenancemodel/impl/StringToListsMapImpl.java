/**
 */
package maintenancemodel.impl;

import java.util.Collection;

import maintenancemodel.ModelPackage;
import maintenancemodel.StringToListsMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String To Lists Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.StringToListsMapImpl#getKey <em>Key</em>}</li>
 *   <li>{@link maintenancemodel.impl.StringToListsMapImpl#getRoomTypeCapTable <em>Room Type Cap Table</em>}</li>
 *   <li>{@link maintenancemodel.impl.StringToListsMapImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringToListsMapImpl extends MinimalEObjectImpl.Container implements StringToListsMap {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomTypeCapTable() <em>Room Type Cap Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeCapTable()
	 * @generated
	 * @ordered
	 */
	protected StringToListsMap roomTypeCapTable;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringToListsMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.STRING_TO_LISTS_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STRING_TO_LISTS_MAP__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringToListsMap getRoomTypeCapTable() {
		if (roomTypeCapTable != null && roomTypeCapTable.eIsProxy()) {
			InternalEObject oldRoomTypeCapTable = (InternalEObject)roomTypeCapTable;
			roomTypeCapTable = (StringToListsMap)eResolveProxy(oldRoomTypeCapTable);
			if (roomTypeCapTable != oldRoomTypeCapTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.STRING_TO_LISTS_MAP__ROOM_TYPE_CAP_TABLE, oldRoomTypeCapTable, roomTypeCapTable));
			}
		}
		return roomTypeCapTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringToListsMap basicGetRoomTypeCapTable() {
		return roomTypeCapTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeCapTable(StringToListsMap newRoomTypeCapTable) {
		StringToListsMap oldRoomTypeCapTable = roomTypeCapTable;
		roomTypeCapTable = newRoomTypeCapTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STRING_TO_LISTS_MAP__ROOM_TYPE_CAP_TABLE, oldRoomTypeCapTable, roomTypeCapTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getValue() {
		if (value == null) {
			value = new EDataTypeUniqueEList<Integer>(Integer.class, this, ModelPackage.STRING_TO_LISTS_MAP__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.STRING_TO_LISTS_MAP__KEY:
				return getKey();
			case ModelPackage.STRING_TO_LISTS_MAP__ROOM_TYPE_CAP_TABLE:
				if (resolve) return getRoomTypeCapTable();
				return basicGetRoomTypeCapTable();
			case ModelPackage.STRING_TO_LISTS_MAP__VALUE:
				return getValue();
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
			case ModelPackage.STRING_TO_LISTS_MAP__KEY:
				setKey((String)newValue);
				return;
			case ModelPackage.STRING_TO_LISTS_MAP__ROOM_TYPE_CAP_TABLE:
				setRoomTypeCapTable((StringToListsMap)newValue);
				return;
			case ModelPackage.STRING_TO_LISTS_MAP__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Integer>)newValue);
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
			case ModelPackage.STRING_TO_LISTS_MAP__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case ModelPackage.STRING_TO_LISTS_MAP__ROOM_TYPE_CAP_TABLE:
				setRoomTypeCapTable((StringToListsMap)null);
				return;
			case ModelPackage.STRING_TO_LISTS_MAP__VALUE:
				getValue().clear();
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
			case ModelPackage.STRING_TO_LISTS_MAP__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case ModelPackage.STRING_TO_LISTS_MAP__ROOM_TYPE_CAP_TABLE:
				return roomTypeCapTable != null;
			case ModelPackage.STRING_TO_LISTS_MAP__VALUE:
				return value != null && !value.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (key: ");
		result.append(key);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //StringToListsMapImpl
