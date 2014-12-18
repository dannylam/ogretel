/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;

import maintenancemodel.Calendar;
import maintenancemodel.MaintenanceProvidesForBooking;
import maintenancemodel.ModelPackage;
import maintenancemodel.RoomHandler;
import maintenancemodel.RoomTypes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintenance Provides For Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.MaintenanceProvidesForBookingImpl#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link maintenancemodel.impl.MaintenanceProvidesForBookingImpl#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link maintenancemodel.impl.MaintenanceProvidesForBookingImpl#getRooms <em>Rooms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaintenanceProvidesForBookingImpl extends MinimalEObjectImpl.Container implements MaintenanceProvidesForBooking {
	/**
	 * The cached value of the '{@link #getCalendar() <em>Calendar</em>}' reference.
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
	 * @generated
	 * @ordered
	 */
	protected RoomTypes roomTypes;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference.
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
	protected MaintenanceProvidesForBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MAINTENANCE_PROVIDES_FOR_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getCalendar() {
		if (calendar != null && calendar.eIsProxy()) {
			InternalEObject oldCalendar = (InternalEObject)calendar;
			calendar = (Calendar)eResolveProxy(oldCalendar);
			if (calendar != oldCalendar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR, oldCalendar, calendar));
			}
		}
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar basicGetCalendar() {
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendar(Calendar newCalendar) {
		Calendar oldCalendar = calendar;
		calendar = newCalendar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR, oldCalendar, calendar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypes getRoomTypes() {
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoomTypes(RoomTypes newRoomTypes, NotificationChain msgs) {
		RoomTypes oldRoomTypes = roomTypes;
		roomTypes = newRoomTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES, oldRoomTypes, newRoomTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypes(RoomTypes newRoomTypes) {
		if (newRoomTypes != roomTypes) {
			NotificationChain msgs = null;
			if (roomTypes != null)
				msgs = ((InternalEObject)roomTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES, null, msgs);
			if (newRoomTypes != null)
				msgs = ((InternalEObject)newRoomTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES, null, msgs);
			msgs = basicSetRoomTypes(newRoomTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES, newRoomTypes, newRoomTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler getRooms() {
		if (rooms != null && rooms.eIsProxy()) {
			InternalEObject oldRooms = (InternalEObject)rooms;
			rooms = (RoomHandler)eResolveProxy(oldRooms);
			if (rooms != oldRooms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS, oldRooms, rooms));
			}
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler basicGetRooms() {
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRooms(RoomHandler newRooms) {
		RoomHandler oldRooms = rooms;
		rooms = newRooms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS, oldRooms, rooms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void canBook(String roomType, int nrOfRooms, String start, String end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeBooking(String roomType, int nrOfRooms, String start, String end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeBooking(String roomType, int nrOfRooms, String start, String end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int setBookingAsActive(String bookingRef) {
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
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES:
				return basicSetRoomTypes(null, msgs);
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
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR:
				if (resolve) return getCalendar();
				return basicGetCalendar();
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES:
				return getRoomTypes();
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS:
				if (resolve) return getRooms();
				return basicGetRooms();
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
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR:
				setCalendar((Calendar)newValue);
				return;
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES:
				setRoomTypes((RoomTypes)newValue);
				return;
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS:
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
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR:
				setCalendar((Calendar)null);
				return;
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES:
				setRoomTypes((RoomTypes)null);
				return;
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS:
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
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR:
				return calendar != null;
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES:
				return roomTypes != null;
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS:
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
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___CAN_BOOK__STRING_INT_STRING_STRING:
				canBook((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___MAKE_BOOKING__STRING_INT_STRING_STRING:
				makeBooking((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___REMOVE_BOOKING__STRING_INT_STRING_STRING:
				removeBooking((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING___SET_BOOKING_AS_ACTIVE__STRING:
				return setBookingAsActive((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MaintenanceProvidesForBookingImpl
