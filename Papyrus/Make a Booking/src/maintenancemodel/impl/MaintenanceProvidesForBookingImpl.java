/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import maintenancemodel.ExtraHandler;
import maintenancemodel.MaintenanceProvidesForBooking;
import maintenancemodel.MaintenancemodelPackage;
import maintenancemodel.Room;
import maintenancemodel.RoomHandler;
import maintenancemodel.RoomStatusEnum;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypesHandler;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Maintenance Provides For Booking</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.MaintenanceProvidesForBookingImpl#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link maintenancemodel.impl.MaintenanceProvidesForBookingImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link maintenancemodel.impl.MaintenanceProvidesForBookingImpl#getExtraHandler <em>Extra Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaintenanceProvidesForBookingImpl extends
MinimalEObjectImpl.Container implements MaintenanceProvidesForBooking {

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
	 * The cached value of the '{@link #getExtraHandler()
	 * <em>Extra Handler</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExtraHandler()
	 * @generated NOT
	 * @ordered
	 */
	protected ExtraHandler extraHandler = new ExtraHandlerImpl();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public MaintenanceProvidesForBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.MAINTENANCE_PROVIDES_FOR_BOOKING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypesHandler getRoomTypes() {
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoomTypes(RoomTypesHandler newRoomTypes,
			NotificationChain msgs) {
		RoomTypesHandler oldRoomTypes = roomTypes;
		roomTypes = newRoomTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES, oldRoomTypes, newRoomTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypes(RoomTypesHandler newRoomTypes) {
		if (newRoomTypes != roomTypes) {
			NotificationChain msgs = null;
			if (roomTypes != null)
				msgs = ((InternalEObject)roomTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES, null, msgs);
			if (newRoomTypes != null)
				msgs = ((InternalEObject)newRoomTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES, null, msgs);
			msgs = basicSetRoomTypes(newRoomTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES, newRoomTypes, newRoomTypes));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler getRooms() {
		return rooms;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRooms(RoomHandler newRooms,
			NotificationChain msgs) {
		RoomHandler oldRooms = rooms;
		rooms = newRooms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS, oldRooms, newRooms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRooms(RoomHandler newRooms) {
		if (newRooms != rooms) {
			NotificationChain msgs = null;
			if (rooms != null)
				msgs = ((InternalEObject)rooms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS, null, msgs);
			if (newRooms != null)
				msgs = ((InternalEObject)newRooms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS, null, msgs);
			msgs = basicSetRooms(newRooms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS, newRooms, newRooms));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraHandler getExtraHandler() {
		return extraHandler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtraHandler(ExtraHandler newExtraHandler,
			NotificationChain msgs) {
		ExtraHandler oldExtraHandler = extraHandler;
		extraHandler = newExtraHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER, oldExtraHandler, newExtraHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraHandler(ExtraHandler newExtraHandler) {
		if (newExtraHandler != extraHandler) {
			NotificationChain msgs = null;
			if (extraHandler != null)
				msgs = ((InternalEObject)extraHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER, null, msgs);
			if (newExtraHandler != null)
				msgs = ((InternalEObject)newExtraHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER, null, msgs);
			msgs = basicSetExtraHandler(newExtraHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER, newExtraHandler, newExtraHandler));
	}

	/**
	 * <!-- begin-user-doc --> Check if it is possible to book the requested
	 * roomtypes for the requested interval. <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean canBook(EList<String> roomTypeIDs, String start, String end) {

		// false if incorrect formats
		if (start.length() != 6 && end.length() != 6) {
			return false;
		}

		// Using a Set, every roomTypeID is only included once
		Set<String> types = new CopyOnWriteArraySet<String>(roomTypeIDs);

		// For all requested roomtypes
		for (String id : types) {

			// false if invalid roomTypeID
			if (!this.roomTypes.exists(id)) {
				return false;
			}

			int amount = 0;
			// Check how many of this type
			for (String id2 : roomTypeIDs) {
				if (id2.equals(id)) {
					amount++;
				}
			}

			DateFormat dateFormat = new SimpleDateFormat("yyMMdd");
			String currDate = dateFormat.format(new Date());

			int startDays = this.getDaysBetween(currDate, start);
			int endDays = this.getDaysBetween(currDate, end);


			// Check if cap is lower as the amount of identical roomTypeIDs
			if(this.roomTypes.getCalendar().getCap(startDays, endDays, id) < amount){
				return false;
			}

		}
		return true;

		// TODO test

	}

	private int getYear(String date) throws NumberFormatException{
		return Integer.parseInt(date.substring(0, 2));
	}

	private int getMonth(String date) throws NumberFormatException{
		return Integer.parseInt(date.substring(2, 4));
	}

	private int getDay(String date) throws NumberFormatException{
		return Integer.parseInt(date.substring(4, 6));
	}

	private Integer getDaysBetween(String date1, String date2) {
		
		int year1; int year2;
		int month1; int month2;
		int day1; int day2;
		try{
			year1 = getYear(date1); 
			month1 = getMonth(date1); 
			day1 = getDay(date1);

			year2 = getYear(date2);
			month2 = getMonth(date2);
			day2 = getDay(date2);
			
		}catch(NumberFormatException e){
			return -1;
		}

		// Validate
		if (!isDateValid(year1, month1, day1)
				|| !isDateValid(year2, month2, day2)) {
			return -1;
		}

		//Compute span
		int dateSpan = this.getDayOfYear(year2, month2, day2) - this.getDayOfYear(year1, month1, day1);

		return dateSpan;
	}

	private int getDayOfYear(int year, int month, int day) {
		int result = day;

		for (int j = 0; j < year; j++) {
			for (int i = 0; i < month; i++) {
				if (i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11) {
					// March, May, July, August, October, December
					result += 31;
				} else if (i == 3 || i == 5 || i == 8 || i == 10) {
					// April, June, September, November
					result += 30;
				} else if (i == 1) {
					// February
					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
						result += 29;
					} else {
						result += 28;
					}
				}
				// January not required
			}
		}

		return result;
	}

	private boolean isDateValid(int year, int month, int day) {
		return year > 0 && year < 100 && month > 0 && month < 13 && day > 0
				&& day < 32;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int makeBooking(EList<String> roomTypeIDs, String start, String end) {
		
		maintenancemodel.Calendar calendar = roomTypes.getCalendar();
		
		DateFormat dateFormat = new SimpleDateFormat("yyMMdd");
		String currDate = dateFormat.format(new Date());

		int startDays = this.getDaysBetween(currDate, start);
		int endDays = this.getDaysBetween(currDate, end);
		
		int result = 0;
		
		if(canBook(roomTypeIDs, start, end)){
			for(int i = 0; i < roomTypeIDs.size(); i++){
				calendar.decCap(startDays, endDays, roomTypeIDs.get(i), 1);
				result++;
			}
		}
		
		if(result == roomTypeIDs.size()){
			roomTypes.setCalendar(calendar);
			return 0;
		}

		return 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int removeBooking(EList<String> roomTypeID, String start, String end) {

		DateFormat dateFormat = new SimpleDateFormat("yyMMdd");
		String currDate = dateFormat.format(new Date());

		int startDays = this.getDaysBetween(currDate, start);
		int endDays = this.getDaysBetween(currDate, end);

		maintenancemodel.Calendar copyOfCalendar = roomTypes.getCalendar();

		int result = 0;

		for(int i = 0; i < roomTypeID.size(); i++){
			if(copyOfCalendar.incCap(startDays, endDays, roomTypeID.get(i), 1) != 0){
				result++;
			};
		}

		if(result == 0){
			roomTypes.setCalendar(copyOfCalendar);
			return 0;
		}

		return 1;
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int setActive(String roomTypeID) {
		if (roomTypes.exists(roomTypeID)) {
			RoomType rt = roomTypes.getRoomType(roomTypeID);
			EList<Room> roomsOfType = rt.getRoomsOfType();
			for (Room r : roomsOfType) {
				if (r.getRoomStatusEnum().equals(RoomStatusEnum.VACANT)) {
					return r.getRoomID();
				}
			}
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getPriceRoom(EList<String> roomTypeIDs) {
		int sum = 0;
		for (String id : roomTypeIDs) {
			if (!roomTypes.exists(id)) {
				return -1;
			}
			sum += roomTypes.getPrice(id);
		}

		return sum;
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getPriceExtra(EList<String> extraIDs) {
		int sum = 0;
		for (String id : extraIDs) {
			if (!extraHandler.exists(id)) {
				return -1;
			}
			sum += extraHandler.getPrice(id);
		}

		return sum;
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int setInactive(int roomID) {
		if (this.rooms.exists(roomID)) {
			this.rooms.getRoom(roomID).setRoomStatusEnum(RoomStatusEnum.VACANT);
			return 0;
		}
		return 1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES:
				return basicSetRoomTypes(null, msgs);
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS:
				return basicSetRooms(null, msgs);
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER:
				return basicSetExtraHandler(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES:
				return getRoomTypes();
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS:
				return getRooms();
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER:
				return getExtraHandler();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES:
				setRoomTypes((RoomTypesHandler)newValue);
				return;
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS:
				setRooms((RoomHandler)newValue);
				return;
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER:
				setExtraHandler((ExtraHandler)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES:
				setRoomTypes((RoomTypesHandler)null);
				return;
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS:
				setRooms((RoomHandler)null);
				return;
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER:
				setExtraHandler((ExtraHandler)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES:
				return roomTypes != null;
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS:
				return rooms != null;
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER:
				return extraHandler != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___CAN_BOOK__ELIST_STRING_STRING:
				return canBook((EList<String>)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___MAKE_BOOKING__ELIST_STRING_STRING:
				return makeBooking((EList<String>)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___REMOVE_BOOKING__ELIST_STRING_STRING:
				return removeBooking((EList<String>)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___SET_ACTIVE__STRING:
				return setActive((String)arguments.get(0));
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_ROOM__ELIST:
				return getPriceRoom((EList<String>)arguments.get(0));
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_EXTRA__ELIST:
				return getPriceExtra((EList<String>)arguments.get(0));
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___SET_INACTIVE__INT:
				return setInactive((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // MaintenanceProvidesForBookingImpl
