/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;

import maintenancemodel.Calendar;
import maintenancemodel.ExtraHandler;
import maintenancemodel.MaintenanceProvidesForBooking;
import maintenancemodel.MaintenancemodelPackage;
import maintenancemodel.RoomHandler;
import maintenancemodel.RoomTypesHandler;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the maintenancemodel object '<em><b>Maintenance Provides For Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.MaintenanceProvidesForBookingImpl#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link maintenancemodel.impl.MaintenanceProvidesForBookingImpl#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link maintenancemodel.impl.MaintenanceProvidesForBookingImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link maintenancemodel.impl.MaintenanceProvidesForBookingImpl#getExtraHandler <em>Extra Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaintenanceProvidesForBookingImpl extends MinimalEObjectImpl.Container implements MaintenanceProvidesForBooking {
	
	/**
	 * The cached value of the '{@link #getCalendar() <em>Calendar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected Calendar calendar;

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
	 * @generated NOT
	 * @ordered
	 */
	protected RoomHandler rooms = new RoomHandlerImpl();

	/**
	 * The cached value of the '{@link #getExtraHandler() <em>Extra Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraHandler()
	 * @generated NOT
	 * @ordered
	 */
	protected ExtraHandler extraHandler = new ExtraHandlerImpl();

	/**
	 * @generated NOT
	 */
	public MaintenanceProvidesForBookingImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.MAINTENANCE_PROVIDES_FOR_BOOKING;
	}

	/**
	 * @inheritDoc
	 * @generated
	 */
	public Calendar getCalendar() {
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalendar(Calendar newCalendar, NotificationChain msgs) {
		Calendar oldCalendar = calendar;
		calendar = newCalendar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR, oldCalendar, newCalendar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @inheritDoc
	 * @generated
	 */
	public void setCalendar(Calendar newCalendar) {
		if (newCalendar != calendar) {
			NotificationChain msgs = null;
			if (calendar != null)
				msgs = ((InternalEObject)calendar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR, null, msgs);
			if (newCalendar != null)
				msgs = ((InternalEObject)newCalendar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR, null, msgs);
			msgs = basicSetCalendar(newCalendar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR, newCalendar, newCalendar));
	}

	/**
	 * @inheritDoc
	 * @generated
	 */
	public RoomTypesHandler getRoomTypes() {
		return roomTypes;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetRoomTypes(RoomTypesHandler newRoomTypes, NotificationChain msgs) {
		RoomTypesHandler oldRoomTypes = roomTypes;
		roomTypes = newRoomTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES, oldRoomTypes, newRoomTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @inheritDoc
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
	 * @inheritDoc
	 * @generated
	 */
	public RoomHandler getRooms() {
		return rooms;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetRooms(RoomHandler newRooms, NotificationChain msgs) {
		RoomHandler oldRooms = rooms;
		rooms = newRooms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS, oldRooms, newRooms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @inheritDoc
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraHandler getExtraHandler() {
		return extraHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtraHandler(ExtraHandler newExtraHandler, NotificationChain msgs) {
		ExtraHandler oldExtraHandler = extraHandler;
		extraHandler = newExtraHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER, oldExtraHandler, newExtraHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean canBook(EList<String> roomTypeIDs, String start, String end) {
		
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int makeBooking(String roomType, String start, String end) {
		// TODO: implement this method
		// calendar.AddEvent?
		throw new UnsupportedOperationException();
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int removeBooking(String roomType, int nrOfRooms, String start, String end) {
		// TODO: implement this method
		// Booking: BookingHandler/Bookingprovidesfor: exists(bookingRef): boolean
		// removeBooking	
		// calendar.unSet()?
		throw new UnsupportedOperationException();
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int setBookingAsActive(String bookingRef) {
		// TODO: implement this method
		// RoomImpl: setRoomStatusEnum(RoomStatusEnum status): void
		// protected RoomStatusEnum roomStatusEnum -> kontroll
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriceRoom(EList<String> roomTypeIDs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriceExtra(EList<Integer> extraIDs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR:
				return basicSetCalendar(null, msgs);
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
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR:
				return getCalendar();
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
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR:
				setCalendar((Calendar)newValue);
				return;
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
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR:
				setCalendar((Calendar)null);
				return;
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
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR:
				return calendar != null;
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
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___CAN_BOOK__ELIST_STRING_STRING:
				return canBook((EList<String>)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___MAKE_BOOKING__STRING_STRING_STRING:
				return makeBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___REMOVE_BOOKING__STRING_INT_STRING_STRING:
				return removeBooking((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___SET_BOOKING_AS_ACTIVE__STRING:
				return setBookingAsActive((String)arguments.get(0));
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_ROOM__ELIST:
				return getPriceRoom((EList<String>)arguments.get(0));
			case MaintenancemodelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_EXTRA__ELIST:
				return getPriceExtra((EList<Integer>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}


} //MaintenanceProvidesForBookingImpl
