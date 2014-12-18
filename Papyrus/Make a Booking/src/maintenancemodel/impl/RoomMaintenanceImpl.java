/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;

import maintenancemodel.ModelPackage;
import maintenancemodel.Room;
import maintenancemodel.RoomHandler;
import maintenancemodel.RoomMaintenance;
import maintenancemodel.RoomTypes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Maintenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.RoomMaintenanceImpl#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomMaintenanceImpl#getRooms <em>Rooms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomMaintenanceImpl extends MinimalEObjectImpl.Container implements RoomMaintenance {
	/**
	 * The cached value of the '{@link #getRoomTypes() <em>Room Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypes()
	 * @generated
	 * @ordered
	 */
	protected RoomTypes roomTypes;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected RoomHandler rooms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomMaintenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROOM_MAINTENANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypes getRoomTypes() {
		if (roomTypes != null && roomTypes.eIsProxy()) {
			InternalEObject oldRoomTypes = (InternalEObject)roomTypes;
			roomTypes = (RoomTypes)eResolveProxy(oldRoomTypes);
			if (roomTypes != oldRoomTypes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ROOM_MAINTENANCE__ROOM_TYPES, oldRoomTypes, roomTypes));
			}
		}
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypes basicGetRoomTypes() {
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypes(RoomTypes newRoomTypes) {
		RoomTypes oldRoomTypes = roomTypes;
		roomTypes = newRoomTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_MAINTENANCE__ROOM_TYPES, oldRoomTypes, roomTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler getRooms() {
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRooms(RoomHandler newRooms, NotificationChain msgs) {
		RoomHandler oldRooms = rooms;
		rooms = newRooms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_MAINTENANCE__ROOMS, oldRooms, newRooms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRooms(RoomHandler newRooms) {
		if (newRooms != rooms) {
			NotificationChain msgs = null;
			if (rooms != null)
				msgs = ((InternalEObject)rooms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ROOM_MAINTENANCE__ROOMS, null, msgs);
			if (newRooms != null)
				msgs = ((InternalEObject)newRooms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ROOM_MAINTENANCE__ROOMS, null, msgs);
			msgs = basicSetRooms(newRooms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_MAINTENANCE__ROOMS, newRooms, newRooms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypes getRoomType(int ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoomType(String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoom(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom(int ID) {
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
	public void addRoom(int numberID, String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editRoomStatus(int roomID, Enumerator status) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getRoomStatus(int roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editRoomType(String roomType, int price, int maxNrOfGuests, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editRoom(int numberID, String roomType) {
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
			case ModelPackage.ROOM_MAINTENANCE__ROOMS:
				return basicSetRooms(null, msgs);
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
			case ModelPackage.ROOM_MAINTENANCE__ROOM_TYPES:
				if (resolve) return getRoomTypes();
				return basicGetRoomTypes();
			case ModelPackage.ROOM_MAINTENANCE__ROOMS:
				return getRooms();
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
			case ModelPackage.ROOM_MAINTENANCE__ROOM_TYPES:
				setRoomTypes((RoomTypes)newValue);
				return;
			case ModelPackage.ROOM_MAINTENANCE__ROOMS:
				setRooms((RoomHandler)newValue);
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
			case ModelPackage.ROOM_MAINTENANCE__ROOM_TYPES:
				setRoomTypes((RoomTypes)null);
				return;
			case ModelPackage.ROOM_MAINTENANCE__ROOMS:
				setRooms((RoomHandler)null);
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
			case ModelPackage.ROOM_MAINTENANCE__ROOM_TYPES:
				return roomTypes != null;
			case ModelPackage.ROOM_MAINTENANCE__ROOMS:
				return rooms != null;
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
			case ModelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE__INT:
				return getRoomType((Integer)arguments.get(0));
			case ModelPackage.ROOM_MAINTENANCE___REMOVE_ROOM_TYPE__STRING:
				removeRoomType((String)arguments.get(0));
				return null;
			case ModelPackage.ROOM_MAINTENANCE___REMOVE_ROOM__ROOM:
				removeRoom((Room)arguments.get(0));
				return null;
			case ModelPackage.ROOM_MAINTENANCE___GET_ROOM__INT:
				return getRoom((Integer)arguments.get(0));
			case ModelPackage.ROOM_MAINTENANCE___ADD_ROOM_TYPE__STRING_INT_INT_STRING:
				addRoomType((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
				return null;
			case ModelPackage.ROOM_MAINTENANCE___ADD_ROOM__INT_STRING:
				addRoom((Integer)arguments.get(0), (String)arguments.get(1));
				return null;
			case ModelPackage.ROOM_MAINTENANCE___EDIT_ROOM_STATUS__INT_ENUMERATOR:
				editRoomStatus((Integer)arguments.get(0), (Enumerator)arguments.get(1));
				return null;
			case ModelPackage.ROOM_MAINTENANCE___GET_ROOM_STATUS__INT:
				return getRoomStatus((Integer)arguments.get(0));
			case ModelPackage.ROOM_MAINTENANCE___EDIT_ROOM_TYPE__STRING_INT_INT_STRING:
				editRoomType((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
				return null;
			case ModelPackage.ROOM_MAINTENANCE___EDIT_ROOM__INT_STRING:
				editRoom((Integer)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomMaintenanceImpl
