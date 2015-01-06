/**
 */
package bookingmodel.impl;

import bookingmodel.Booking;
import bookingmodel.BookingHandler;
import bookingmodel.BookingmodelPackage;

import bookingmodel.CustomerEmailToBookingRefEntry;
import bookingmodel.GuestEmailToRoomIDEntry;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * A class that handles all the bookings such as adding and removing.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bookingmodel.impl.BookingHandlerImpl#getBookingsMap <em>Bookings Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingHandlerImpl extends MinimalEObjectImpl.Container implements BookingHandler {
	/**
	 * The cached value of the '{@link #getBookingsMap() <em>Bookings Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingsMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Booking> bookingsMap;

	/**
	 * The cached value of the '{@link #getRoomIDToBookingRefMap() <em>Room ID To Booking Ref Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomIDToBookingRefMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<Integer, String> roomIDToBookingRefMap;

	/**
	 * The cached value of the '{@link #getCustomerEmailToBookingRefEntry() <em>Customer Email To Booking Ref Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerEmailToBookingRefEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerEmailToBookingRefEntry> customerEmailToBookingRefEntry;

	/**
	 * The cached value of the '{@link #getGuestEmailToRoomIDEntry() <em>Guest Email To Room ID Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestEmailToRoomIDEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<GuestEmailToRoomIDEntry> guestEmailToRoomIDEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingmodelPackage.Literals.BOOKING_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Booking> getBookingsMap() {
		if (bookingsMap == null) {
			bookingsMap = new EcoreEMap<String,Booking>(BookingmodelPackage.Literals.BOOKING_REF_TO_BOOKING_ENTRY, BookingRefToBookingEntryImpl.class, this, BookingmodelPackage.BOOKING_HANDLER__BOOKINGS_MAP);
		}
		return bookingsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Integer, String> getRoomIDToBookingRefMap() {
		if (roomIDToBookingRefMap == null) {
			roomIDToBookingRefMap = new EcoreEMap<Integer,String>(BookingmodelPackage.Literals.ROOM_ID_TO_BOOKING_REF_ENTRY, RoomIDToBookingRefEntryImpl.class, this, BookingmodelPackage.BOOKING_HANDLER__ROOM_ID_TO_BOOKING_REF_MAP);
		}
		return roomIDToBookingRefMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerEmailToBookingRefEntry> getCustomerEmailToBookingRefEntry() {
		if (customerEmailToBookingRefEntry == null) {
			customerEmailToBookingRefEntry = new EObjectContainmentEList<CustomerEmailToBookingRefEntry>(CustomerEmailToBookingRefEntry.class, this, BookingmodelPackage.BOOKING_HANDLER__CUSTOMER_EMAIL_TO_BOOKING_REF_ENTRY);
		}
		return customerEmailToBookingRefEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuestEmailToRoomIDEntry> getGuestEmailToRoomIDEntry() {
		if (guestEmailToRoomIDEntry == null) {
			guestEmailToRoomIDEntry = new EObjectContainmentEList<GuestEmailToRoomIDEntry>(GuestEmailToRoomIDEntry.class, this, BookingmodelPackage.BOOKING_HANDLER__GUEST_EMAIL_TO_ROOM_ID_ENTRY);
		}
		return guestEmailToRoomIDEntry;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public boolean exists(String bookingRef) {
		return this.bookingsMap.containsKey(bookingRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String addBooking(int nrOfGuests, String startDate, String endDate, EList<String> roomTypes, EList<String> extras, EList<String> services) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * {@inheritDoc}
	 * @return getBookingRef, if the booking map is not empty
	 * @return null, if the booking map is empty
	 * @generated NOT
	 */
	public String addBooking(int nrOfGuests, String startDate, String endDate, List<String> roomTypes, List<String> extras, List<String> services) {
		if(!this.bookingsMap.equals(null)){
			Booking booking = new BookingImpl(nrOfGuests, startDate, endDate, roomTypes, extras, services);
			booking.setBookingRef(this.generateBookingRef());
			this.bookingsMap.put(booking.getBookingRef(), booking);
			return booking.getBookingRef();
		} 
		return null;
	}
	
	/**
	 * Generates a booking reference to a booking
	 * @return generateBookingRef, if the booking reference is active
	 * @return bookingRef, if the booking reference is not active.
	 * @generated NOT
	 */
	private String generateBookingRef() {
		String bookingRef = UUID.randomUUID().toString();
		if(this.isActive(bookingRef)){
			return generateBookingRef();
		} else {
			return bookingRef;
		}
	}
		
	/**
	 * {@inheritDoc}
	 * @return 0, if removing a booking went correct
	 * @return -1, if removing a booking failed.
	 * @generated NOT
	 */
	public int removeBooking(String bookingRef) {
		if(this.exists(bookingRef)){
			this.bookingsMap.remove(getBooking(bookingRef));
			return 0;
		} 
		return -1;
	}

	/**
	 * {@inheritDoc}
	 * @return the booking reference.
	 * @generated NOT
	 */
	public Booking getBooking(String bookingRef) {
		return this.bookingsMap.get(bookingRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int editBooking(String bookingRef, String startDate, String endDate, int nrOfGuests, EList<String> roomTypes, EList<String> extras, EList<String> services) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * {@inheritDoc}
	 * @return booking with room identification.
	 * @generated NOT
	 */
	public Booking getBooking(int roomID) {
		return this.getBooking(this.roomIDToBookingRefMap.get(roomID).getValue());
	}

	/**
	 * {@inheritDoc}
	 * @return true, if the booking reference is active
	 * @return false, if the booking reference is not active.
	 * @generated NOT
	 */
	public boolean isActive(String bookingRef) {
		if(this.isActive(bookingRef)){
			return !this.bookingsMap.get(bookingRef).checkedOutAllRooms();
		} else {
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 * @param bookingRef, startDate, endDate, nrOfGuests, roomTypes, extras
	 * @return 0, if edit booking was successful.
	 * @generated NOT
	 */
	public int editBooking(String bookingRef, String startDate, String endDate, int nrOfGuests, List<String> roomTypes, List<String> extras, List<String> services) {
			this.getBooking(bookingRef).setStartDate(startDate);
			this.getBooking(bookingRef).setEndDate(endDate);
			this.getBooking(bookingRef).setNrOfGuests(nrOfGuests);
			this.getBooking(bookingRef).setRoomTypes(roomTypes);
			this.getBooking(bookingRef).setExtras(extras);
			this.getBooking(bookingRef).setServices(services);
			return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BookingmodelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
				return ((InternalEList<?>)getBookingsMap()).basicRemove(otherEnd, msgs);
			case BookingmodelPackage.BOOKING_HANDLER__ROOM_ID_TO_BOOKING_REF_MAP:
				return ((InternalEList<?>)getRoomIDToBookingRefMap()).basicRemove(otherEnd, msgs);
			case BookingmodelPackage.BOOKING_HANDLER__CUSTOMER_EMAIL_TO_BOOKING_REF_ENTRY:
				return ((InternalEList<?>)getCustomerEmailToBookingRefEntry()).basicRemove(otherEnd, msgs);
			case BookingmodelPackage.BOOKING_HANDLER__GUEST_EMAIL_TO_ROOM_ID_ENTRY:
				return ((InternalEList<?>)getGuestEmailToRoomIDEntry()).basicRemove(otherEnd, msgs);
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
			case BookingmodelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
				if (coreType) return getBookingsMap();
				else return getBookingsMap().map();
			case BookingmodelPackage.BOOKING_HANDLER__ROOM_ID_TO_BOOKING_REF_MAP:
				if (coreType) return getRoomIDToBookingRefMap();
				else return getRoomIDToBookingRefMap().map();
			case BookingmodelPackage.BOOKING_HANDLER__CUSTOMER_EMAIL_TO_BOOKING_REF_ENTRY:
				return getCustomerEmailToBookingRefEntry();
			case BookingmodelPackage.BOOKING_HANDLER__GUEST_EMAIL_TO_ROOM_ID_ENTRY:
				return getGuestEmailToRoomIDEntry();
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
			case BookingmodelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
				((EStructuralFeature.Setting)getBookingsMap()).set(newValue);
				return;
			case BookingmodelPackage.BOOKING_HANDLER__ROOM_ID_TO_BOOKING_REF_MAP:
				((EStructuralFeature.Setting)getRoomIDToBookingRefMap()).set(newValue);
				return;
			case BookingmodelPackage.BOOKING_HANDLER__CUSTOMER_EMAIL_TO_BOOKING_REF_ENTRY:
				getCustomerEmailToBookingRefEntry().clear();
				getCustomerEmailToBookingRefEntry().addAll((Collection<? extends CustomerEmailToBookingRefEntry>)newValue);
				return;
			case BookingmodelPackage.BOOKING_HANDLER__GUEST_EMAIL_TO_ROOM_ID_ENTRY:
				getGuestEmailToRoomIDEntry().clear();
				getGuestEmailToRoomIDEntry().addAll((Collection<? extends GuestEmailToRoomIDEntry>)newValue);
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
			case BookingmodelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
				getBookingsMap().clear();
				return;
			case BookingmodelPackage.BOOKING_HANDLER__ROOM_ID_TO_BOOKING_REF_MAP:
				getRoomIDToBookingRefMap().clear();
				return;
			case BookingmodelPackage.BOOKING_HANDLER__CUSTOMER_EMAIL_TO_BOOKING_REF_ENTRY:
				getCustomerEmailToBookingRefEntry().clear();
				return;
			case BookingmodelPackage.BOOKING_HANDLER__GUEST_EMAIL_TO_ROOM_ID_ENTRY:
				getGuestEmailToRoomIDEntry().clear();
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
			case BookingmodelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
				return bookingsMap != null && !bookingsMap.isEmpty();
			case BookingmodelPackage.BOOKING_HANDLER__ROOM_ID_TO_BOOKING_REF_MAP:
				return roomIDToBookingRefMap != null && !roomIDToBookingRefMap.isEmpty();
			case BookingmodelPackage.BOOKING_HANDLER__CUSTOMER_EMAIL_TO_BOOKING_REF_ENTRY:
				return customerEmailToBookingRefEntry != null && !customerEmailToBookingRefEntry.isEmpty();
			case BookingmodelPackage.BOOKING_HANDLER__GUEST_EMAIL_TO_ROOM_ID_ENTRY:
				return guestEmailToRoomIDEntry != null && !guestEmailToRoomIDEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BookingmodelPackage.BOOKING_HANDLER___EXISTS__STRING:
				return exists((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_HANDLER___ADD_BOOKING__INT_STRING_STRING_ELIST_ELIST_ELIST:
				return addBooking((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (EList<String>)arguments.get(3), (EList<String>)arguments.get(4), (EList<String>)arguments.get(5));
			case BookingmodelPackage.BOOKING_HANDLER___REMOVE_BOOKING__STRING:
				return removeBooking((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_HANDLER___GET_BOOKING__STRING:
				return getBooking((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_HANDLER___EDIT_BOOKING__STRING_STRING_STRING_INT_ELIST_ELIST_ELIST:
				return editBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (EList<String>)arguments.get(4), (EList<String>)arguments.get(5), (EList<String>)arguments.get(6));
			case BookingmodelPackage.BOOKING_HANDLER___GET_BOOKING__INT:
				return getBooking((Integer)arguments.get(0));
			case BookingmodelPackage.BOOKING_HANDLER___IS_ACTIVE__STRING:
				return isActive((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingHandlerImpl
