/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import maintenancemodel.Calendar;
import maintenancemodel.IRoomTypeMaintenance;
import maintenancemodel.MaintenancemodelPackage;
import maintenancemodel.Room;
import maintenancemodel.RoomHandler;
import maintenancemodel.RoomMaintenance;
import maintenancemodel.RoomStatusEnum;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypeEnum;
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
 * <!-- begin-user-doc --> An implementation of the maintenancemodel object '
 * <em><b>Room Maintenance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link maintenancemodel.impl.RoomMaintenanceImpl#getRoomTypes <em>Room
 * Types</em>}</li>
 * <li>{@link maintenancemodel.impl.RoomMaintenanceImpl#getRooms <em>Rooms</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomMaintenanceImpl extends MinimalEObjectImpl.Container implements
		RoomMaintenance {
	/**
	 * The cached value of the '{@link #getRoomTypes() <em>Room Types</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRoomTypes()
	 * @generated NOT
	 * @ordered
	 */
	protected RoomTypesHandler roomTypes = new RoomTypesHandlerImpl();

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRooms()
	 * @generated NOT
	 * @ordered
	 */
	protected RoomHandler rooms = new RoomHandlerImpl();

	/**
	 * <!-- begin-user-doc --> Get a new instance of RoomMaintenanceImpl. <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public RoomMaintenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.ROOM_MAINTENANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoomTypesHandler getRoomTypes() {
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRoomTypes(RoomTypesHandler newRoomTypes,
			NotificationChain msgs) {
		RoomTypesHandler oldRoomTypes = roomTypes;
		roomTypes = newRoomTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES,
					oldRoomTypes, newRoomTypes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRoomTypes(RoomTypesHandler newRoomTypes) {
		if (newRoomTypes != roomTypes) {
			NotificationChain msgs = null;
			if (roomTypes != null)
				msgs = ((InternalEObject) roomTypes)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES,
								null, msgs);
			if (newRoomTypes != null)
				msgs = ((InternalEObject) newRoomTypes)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES,
								null, msgs);
			msgs = basicSetRoomTypes(newRoomTypes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES,
					newRoomTypes, newRoomTypes));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoomHandler getRooms() {
		return rooms;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRooms(RoomHandler newRooms,
			NotificationChain msgs) {
		RoomHandler oldRooms = rooms;
		rooms = newRooms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS, oldRooms,
					newRooms);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRooms(RoomHandler newRooms) {
		if (newRooms != rooms) {
			NotificationChain msgs = null;
			if (rooms != null)
				msgs = ((InternalEObject) rooms)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS,
								null, msgs);
			if (newRooms != null)
				msgs = ((InternalEObject) newRooms)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS,
								null, msgs);
			msgs = basicSetRooms(newRooms, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS, newRooms,
					newRooms));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @generated NOT
	 */
	public int addRoom(int roomID, String roomTypeID) {
		int result = this.rooms.addRoom(roomID, this.roomTypes
				.getStringToRoomType().get(roomTypeID));
		if (result == 0) {
			if (this.roomTypes.addRoomToRoomType(roomTypeID) == 0) {
				return 0;
			}
			return 2;
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @generated NOT
	 */
	public int removeRoom(int roomID) {
		if (this.rooms.removeRoom(roomID) == 0
				&& this.roomTypes.removeRoomFromRoomType(this.rooms
						.getRoom(roomID).getRoomType().getID()) == 0) {
			return 0;
		}
		return 1;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @generated NOT
	 */
	public int addRoomType(String roomTypeID, String roomTypeEnum, int price,
			int maxNrOfGuests, String description) {
		return this.roomTypes.addRoomType(roomTypeID, roomTypeEnum, price,
				maxNrOfGuests, description);
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int removeRoomType(String roomType) {
		return this.roomTypes.removeRoomType(roomType);
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int editRoomStatus(int roomID, String status) {

		Room room;
		try {
			room = this.rooms.getRoom(roomID);
		} catch (NullPointerException e) {
			return 2;
		}

		switch (status.toLowerCase()) {

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
			// The wished status does not exist.
			return 1;
		}

		// TODO: implement this method
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @generated NOT
	 */
	public int editRoomType(String roomTypeID, String roomTypeEnum, int price,
			int maxNrOfGuests, String description) {
		if (roomTypeID == null || !this.roomTypes.exists(roomTypeID)) {
			return 1;
		}
		if (roomTypeEnum == null
				|| !this.getRoomTypeEnums().contains(roomTypeEnum)) {
			return 2;
		}
		if (price < 0) {
			return 3;
		}
		if (maxNrOfGuests < 0) {
			return 4;
		}

		RoomType rt = this.roomTypes.getRoomType(roomTypeID);
		rt.setRoomTypeEnum(RoomTypeEnum.valueOf(roomTypeEnum));
		rt.setPrice(price);
		rt.setMaxNrOfGuests(maxNrOfGuests);

		if (description != null) {
			rt.setDescription(description);
		}

		return 0;
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getRoomStatus(int roomID) {
		if (this.rooms.exists(roomID)) {
			System.out.println(this.rooms.getRoom(roomID).getRoomStatusEnum()
					.toString());
			return this.rooms.getRoom(roomID).getRoomStatusEnum().toString();
		}
		return "failure";
		// TODO: test
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @generated NOT
	 */
	public EList<String> getRoomStatuses() {
		RoomStatusEnum[] enums = RoomStatusEnum.values();
		EList<String> strings = new BasicEList<String>(enums.length);

		for (RoomStatusEnum e : enums) {
			strings.add(e.toString());
		}

		return strings;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @generated NOT
	 */
	public String getRoomTypeEnum(String roomTypeID) {
		String result = null;
		if (roomTypes.exists(roomTypeID)) {
			result = roomTypes.getRoomType(roomTypeID).getRoomTypeEnum()
					.toString();
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getRoomTypePrice(String roomTypeID) {

		if (this.roomTypes.exists(roomTypeID)) {
			return this.roomTypes.getRoomType(roomTypeID).getPrice();
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getRoomTypeMaxNrOfGuests(String roomTypeID) {
		if (this.roomTypes.exists(roomTypeID)) {
			return this.roomTypes.getRoomType(roomTypeID).getMaxNrOfGuests();
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getRoomTypeDescription(String roomTypeID) {
		if (this.roomTypes.exists(roomTypeID)) {
			return this.roomTypes.getRoomType(roomTypeID).getDescription();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @generated NOT
	 */
	public String getRoomTypeID(int roomID) {
		if (this.rooms.exists(roomID)) {
			return this.rooms.getRoom(roomID).getRoomType().getID();
		}
		return "failure mohahah";
		// TODO: test
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @generated NOT
	 */
	public EList<String> getRoomTypeEnums() {
		return this.roomTypes.getRoomTypeEnums();
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getNrOfRoomsofType(String roomTypeID) {
		if (this.roomTypes.exists(roomTypeID)) {
			return this.roomTypes.getRoomType(roomTypeID).getRoomsOfType()
					.size();
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int editRoom(int roomID, String roomTypeID) {

		if (this.removeRoom(roomID) == 0) {
			return this.addRoom(roomID, roomTypeID);
		}
		return 3;
		// TODO:test
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Integer> getRoomIDs() {
		Integer[] ids = this.rooms.getIntegerToRoomMap().keySet()
				.toArray(new Integer[0]);
		return new BasicEList<Integer>(Arrays.asList(ids));
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<String> getRoomTypeIDs() {
		return this.roomTypes.getRoomTypeIDs();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES:
			return basicSetRoomTypes(null, msgs);
		case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS:
			return basicSetRooms(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES:
			setRoomTypes((RoomTypesHandler) newValue);
			return;
		case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS:
			setRooms((RoomHandler) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOM_TYPES:
			setRoomTypes((RoomTypesHandler) null);
			return;
		case MaintenancemodelPackage.ROOM_MAINTENANCE__ROOMS:
			setRooms((RoomHandler) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IRoomTypeMaintenance.class) {
			switch (baseOperationID) {
			case MaintenancemodelPackage.IROOM_TYPE_MAINTENANCE___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING:
				return MaintenancemodelPackage.ROOM_MAINTENANCE___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING;
			case MaintenancemodelPackage.IROOM_TYPE_MAINTENANCE___REMOVE_ROOM_TYPE__STRING:
				return MaintenancemodelPackage.ROOM_MAINTENANCE___REMOVE_ROOM_TYPE__STRING;
			case MaintenancemodelPackage.IROOM_TYPE_MAINTENANCE___EDIT_ROOM_TYPE__STRING_STRING_INT_INT_STRING:
				return MaintenancemodelPackage.ROOM_MAINTENANCE___EDIT_ROOM_TYPE__STRING_STRING_INT_INT_STRING;
			case MaintenancemodelPackage.IROOM_TYPE_MAINTENANCE___GET_ROOM_TYPE_IDS:
				return MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_IDS;
			case MaintenancemodelPackage.IROOM_TYPE_MAINTENANCE___GET_ROOM_TYPE_ENUM__STRING:
				return MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_ENUM__STRING;
			case MaintenancemodelPackage.IROOM_TYPE_MAINTENANCE___GET_ROOM_TYPE_PRICE__STRING:
				return MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_PRICE__STRING;
			case MaintenancemodelPackage.IROOM_TYPE_MAINTENANCE___GET_ROOM_TYPE_MAX_NR_OF_GUESTS__STRING:
				return MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_MAX_NR_OF_GUESTS__STRING;
			case MaintenancemodelPackage.IROOM_TYPE_MAINTENANCE___GET_ROOM_TYPE_DESCRIPTION__STRING:
				return MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_DESCRIPTION__STRING;
			case MaintenancemodelPackage.IROOM_TYPE_MAINTENANCE___GET_ROOM_TYPE_ENUMS:
				return MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_ENUMS;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case MaintenancemodelPackage.ROOM_MAINTENANCE___ADD_ROOM__INT_STRING:
			return addRoom((Integer) arguments.get(0),
					(String) arguments.get(1));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___REMOVE_ROOM__INT:
			return removeRoom((Integer) arguments.get(0));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___EDIT_ROOM_STATUS__INT_STRING:
			return editRoomStatus((Integer) arguments.get(0),
					(String) arguments.get(1));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___EDIT_ROOM__INT_STRING:
			return editRoom((Integer) arguments.get(0),
					(String) arguments.get(1));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_IDS:
			return getRoomIDs();
		case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_STATUS__INT:
			return getRoomStatus((Integer) arguments.get(0));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_STATUSES:
			return getRoomStatuses();
		case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_ID__INT:
			return getRoomTypeID((Integer) arguments.get(0));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_NR_OF_ROOMSOF_TYPE__STRING:
			return getNrOfRoomsofType((String) arguments.get(0));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING:
			return addRoomType((String) arguments.get(0),
					(String) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3), (String) arguments.get(4));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___REMOVE_ROOM_TYPE__STRING:
			return removeRoomType((String) arguments.get(0));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___EDIT_ROOM_TYPE__STRING_STRING_INT_INT_STRING:
			return editRoomType((String) arguments.get(0),
					(String) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3), (String) arguments.get(4));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_IDS:
			return getRoomTypeIDs();
		case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_ENUM__STRING:
			return getRoomTypeEnum((String) arguments.get(0));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_PRICE__STRING:
			return getRoomTypePrice((String) arguments.get(0));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_MAX_NR_OF_GUESTS__STRING:
			return getRoomTypeMaxNrOfGuests((String) arguments.get(0));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_DESCRIPTION__STRING:
			return getRoomTypeDescription((String) arguments.get(0));
		case MaintenancemodelPackage.ROOM_MAINTENANCE___GET_ROOM_TYPE_ENUMS:
			return getRoomTypeEnums();
		}
		return super.eInvoke(operationID, arguments);
	}

} // RoomMaintenanceImpl
