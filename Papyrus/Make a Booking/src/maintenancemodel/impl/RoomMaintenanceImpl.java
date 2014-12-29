/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import maintenancemodel.MaintenancemodelPackage;
import maintenancemodel.Room;
import maintenancemodel.RoomHandler;
import maintenancemodel.RoomMaintenance;
import maintenancemodel.RoomStatusEnum;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypesHandler;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the maintenancemodel object '<em><b>Room Maintenance</b></em>'.
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
	 * The cached value of the '{@link #getRoomTypes() <em>Room Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypes()
	 * @generated NOT
	 * @ordered
	 */
	protected RoomTypesHandler roomTypes = new RoomTypesHandlerImpl();

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
	 * Get a new instance of RoomMaintenanceImpl.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoomMaintenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.ROOM_MAINTENANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypesHandler getRoomTypes() {
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoomTypes(RoomTypesHandler newRoomTypes, NotificationChain msgs) {
		RoomTypesHandler oldRoomTypes = roomTypes;
		roomTypes = newRoomTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES, oldRoomTypes, newRoomTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypes(RoomTypesHandler newRoomTypes) {
		if (newRoomTypes != roomTypes) {
			NotificationChain msgs = null;
			if (roomTypes != null)
				msgs = ((InternalEObject)roomTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES, null, msgs);
			if (newRoomTypes != null)
				msgs = ((InternalEObject)newRoomTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES, null, msgs);
			msgs = basicSetRoomTypes(newRoomTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES, newRoomTypes, newRoomTypes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS, oldRooms, newRooms);
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
				msgs = ((InternalEObject)rooms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS, null, msgs);
			if (newRooms != null)
				msgs = ((InternalEObject)newRooms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS, null, msgs);
			msgs = basicSetRooms(newRooms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS, newRooms, newRooms));
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int addRoom(int roomID, String roomType) {
		
		//TODO add case where roomID not unique (suggested return value = 2)
		
		if(this.getRoomTypeHandler().exists(roomType)){
			RoomType rt = this.getRoomTypeHandler().getStringToRoomType().get(roomType);
			this.getRoomHandler().addRoom(roomID, rt);
			return 0;
		}
		return 1;
		
		// TODO TEST
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int removeRoom(int roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int addRoomType(String roomTypeID, String roomTypeEnum, int price, int maxNrOfGuests, String description) {
		
		if(roomTypeID != null && roomTypeEnum != null && price >= 0 && maxNrOfGuests >= 0){
			this.getRoomTypeHandler().addRoomType(roomTypeID, roomTypeEnum, price, maxNrOfGuests, description);
			return 0;	
		}
		return 1;
		// TODO
	}

	/**
	 * <!-- begin-user-doc -->
	 * Remove the RoomType wit the given ID.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int removeRoomType(String roomType) {
		return this.getRoomTypeHandler().removeRoomType(roomType);
		// TODO
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the RoomHandler.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoomHandler getRoomHandler() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return this.rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoomTypesHandler getRoomTypeHandler() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return this.roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * If 0 is returned everything went fine
	 * If 1 is returned the status is not ok and nothing has been changed.
	 * If 2 is returned the roomID does not exist.
	 *  <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int editRoomStatus(int roomID, String status) {

		Room room;
		try{
			room = this.rooms.getRoom(roomID);
		}catch(NullPointerException e){
			return 2;
		}

		switch(status){

		case "vacant":
			room.setRoomStatusEnum(RoomStatusEnum.VACANT);
			return 0;
		case "busy":
			room.setRoomStatusEnum(RoomStatusEnum.BUSY);
			return 0;
		case "maintenance":
			room.setRoomStatusEnum(RoomStatusEnum.MAINTENANCE);
			return 0;

		default:
			//The wished status does not exist.
			return 1;
		}

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRoomStatus(int roomID) {
		//kolla om rumsID existerar?
		return this.rooms.getRoom(roomID).getRoomStatusEnum().toString();
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRoomStatuses() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomTypeEnum(String roomTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomTypePrice(String roomTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomTypeMaxNrOfGuests(String roomTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomTypeDescription(String roomTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomTypeID(int roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRoomTypeEnums() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Edit the RoomType with @param roomTypeID
	 * so that it has the values given in the other parameters.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int editRoomType(String roomTypeID, String roomTypeEnum, int price, int maxNrOfGuests, String description) {
		this.removeRoomType(roomTypeID);
		return this.addRoomType(roomTypeID, roomTypeEnum, price, maxNrOfGuests, description);
		
		// TODO: TEST
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int editRoom(int roomID, String roomTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRoomIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of the current RoomType IDs.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getRoomTypeIDs() {
		
		String[] ids = this.roomTypes.getStringToRoomType().keySet().toArray(new String[0]);
		return new BasicEList( Arrays.asList(ids) );
		// TODO: test
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES:
				return basicSetRoomTypes(null, msgs);
			case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS:
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
			case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES:
				return getRoomTypes();
			case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS:
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
			case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES:
				setRoomTypes((RoomTypesHandler)newValue);
				return;
			case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS:
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
			case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES:
				setRoomTypes((RoomTypesHandler)null);
				return;
			case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS:
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
			case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES:
				return roomTypes != null;
			case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS:
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
			case MaintenancemodelPackage.ROOM_MAINTENANCE___ADD_ROOM__INT_STRING:
				return addRoom((Integer)arguments.get(0), (String)arguments.get(1));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___REMOVE_ROOM__INT:
				return removeRoom((Integer)arguments.get(0));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING:
				return addRoomType((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___REMOVE_ROOM_TYPE__STRING:
				return removeRoomType((String)arguments.get(0));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___EDIT_ROOM_STATUS__INT_STRING:
				return editRoomStatus((Integer)arguments.get(0), (String)arguments.get(1));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___EDIT_ROOM_TYPE__STRING_STRING_INT_INT_STRING:
				return editRoomType((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___EDIT_ROOM__INT_STRING:
				return editRoom((Integer)arguments.get(0), (String)arguments.get(1));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_IDS:
				return getRoomIDs();
			case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_IDS:
				return getRoomTypeIDs();
			case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_STATUS__INT:
				return getRoomStatus((Integer)arguments.get(0));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_STATUSES:
				return getRoomStatuses();
			case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_ENUM__STRING:
				return getRoomTypeEnum((String)arguments.get(0));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_PRICE__STRING:
				return getRoomTypePrice((String)arguments.get(0));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_MAX_NR_OF_GUESTS__STRING:
				return getRoomTypeMaxNrOfGuests((String)arguments.get(0));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_DESCRIPTION__STRING:
				return getRoomTypeDescription((String)arguments.get(0));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_ID__INT:
				return getRoomTypeID((Integer)arguments.get(0));
			case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_ENUMS:
				return getRoomTypeEnums();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomMaintenanceImpl
