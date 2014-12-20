/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import maintenancemodel.ModelPackage;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypes;
import maintenancemodel.StringToRoomType;

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
 * An implementation of the model object '<em><b>Room Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.RoomTypesImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomTypesImpl#getRoomTypeTable <em>Room Type Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomTypesImpl extends MinimalEObjectImpl.Container implements RoomTypes {
	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType> roomType;

	/**
	 * The cached value of the '{@link #getRoomTypeTable() <em>Room Type Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeTable()
	 * @generated
	 * @ordered
	 */
	protected StringToRoomType roomTypeTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROOM_TYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomType() {
		if (roomType == null) {
			roomType = new EObjectResolvingEList<RoomType>(RoomType.class, this, ModelPackage.ROOM_TYPES__ROOM_TYPE);
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringToRoomType getRoomTypeTable() {
		return roomTypeTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoomTypeTable(StringToRoomType newRoomTypeTable, NotificationChain msgs) {
		StringToRoomType oldRoomTypeTable = roomTypeTable;
		roomTypeTable = newRoomTypeTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_TYPES__ROOM_TYPE_TABLE, oldRoomTypeTable, newRoomTypeTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeTable(StringToRoomType newRoomTypeTable) {
		if (newRoomTypeTable != roomTypeTable) {
			NotificationChain msgs = null;
			if (roomTypeTable != null)
				msgs = ((InternalEObject)roomTypeTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ROOM_TYPES__ROOM_TYPE_TABLE, null, msgs);
			if (newRoomTypeTable != null)
				msgs = ((InternalEObject)newRoomTypeTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ROOM_TYPES__ROOM_TYPE_TABLE, null, msgs);
			msgs = basicSetRoomTypeTable(newRoomTypeTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_TYPES__ROOM_TYPE_TABLE, newRoomTypeTable, newRoomTypeTable));
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
	public void addRoomType(String roomType, int price, int maxNrOfGuests, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoomType(RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomType(String name) {
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
			case ModelPackage.ROOM_TYPES__ROOM_TYPE_TABLE:
				return basicSetRoomTypeTable(null, msgs);
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
			case ModelPackage.ROOM_TYPES__ROOM_TYPE:
				return getRoomType();
			case ModelPackage.ROOM_TYPES__ROOM_TYPE_TABLE:
				return getRoomTypeTable();
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
			case ModelPackage.ROOM_TYPES__ROOM_TYPE:
				getRoomType().clear();
				getRoomType().addAll((Collection<? extends RoomType>)newValue);
				return;
			case ModelPackage.ROOM_TYPES__ROOM_TYPE_TABLE:
				setRoomTypeTable((StringToRoomType)newValue);
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
			case ModelPackage.ROOM_TYPES__ROOM_TYPE:
				getRoomType().clear();
				return;
			case ModelPackage.ROOM_TYPES__ROOM_TYPE_TABLE:
				setRoomTypeTable((StringToRoomType)null);
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
			case ModelPackage.ROOM_TYPES__ROOM_TYPE:
				return roomType != null && !roomType.isEmpty();
			case ModelPackage.ROOM_TYPES__ROOM_TYPE_TABLE:
				return roomTypeTable != null;
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
			case ModelPackage.ROOM_TYPES___EXISTS__INT:
				return exists((Integer)arguments.get(0));
			case ModelPackage.ROOM_TYPES___ADD_ROOM_TYPE__STRING_INT_INT_STRING:
				addRoomType((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
				return null;
			case ModelPackage.ROOM_TYPES___REMOVE_ROOM_TYPE__ROOMTYPE:
				removeRoomType((RoomType)arguments.get(0));
				return null;
			case ModelPackage.ROOM_TYPES___GET_ROOM_TYPE__STRING:
				return getRoomType((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomTypesImpl
