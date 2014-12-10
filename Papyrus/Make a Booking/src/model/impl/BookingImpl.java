/**
 */
package model.impl;

import java.util.Collection;
import java.util.Map;

import model.Booking;
import model.Customer;
import model.Guest;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.BookingImpl#getBookingRef <em>Booking Ref</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getDate <em>Date</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getNrOfNights <em>Nr Of Nights</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getExtraList <em>Extra List</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getRoomMap <em>Room Map</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getGuestList <em>Guest List</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getServiceNotes <em>Service Notes</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getNrOfGuests <em>Nr Of Guests</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link model.impl.BookingImpl#getGuest <em>Guest</em>}</li>
 *   <li>{@link model.impl.BookingImpl#isIspayed <em>Ispayed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getBookingRef() <em>Booking Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingRef() <em>Booking Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingRef()
	 * @generated
	 * @ordered
	 */
	protected String bookingRef = BOOKING_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNrOfNights() <em>Nr Of Nights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfNights()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_NIGHTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfNights() <em>Nr Of Nights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfNights()
	 * @generated
	 * @ordered
	 */
	protected int nrOfNights = NR_OF_NIGHTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraList() <em>Extra List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraList()
	 * @generated
	 * @ordered
	 */
	protected static final EList EXTRA_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtraList() <em>Extra List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraList()
	 * @generated
	 * @ordered
	 */
	protected EList extraList = EXTRA_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomMap() <em>Room Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomMap()
	 * @generated
	 * @ordered
	 */
	protected static final Map ROOM_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomMap() <em>Room Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomMap()
	 * @generated
	 * @ordered
	 */
	protected Map roomMap = ROOM_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuestList() <em>Guest List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestList()
	 * @generated
	 * @ordered
	 */
	protected static final EList GUEST_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuestList() <em>Guest List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestList()
	 * @generated
	 * @ordered
	 */
	protected EList guestList = GUEST_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceNotes() <em>Service Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNotes()
	 * @generated
	 * @ordered
	 */
	protected static final EList SERVICE_NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceNotes() <em>Service Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNotes()
	 * @generated
	 * @ordered
	 */
	protected EList serviceNotes = SERVICE_NOTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomerID() <em>Customer ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerID()
	 * @generated
	 * @ordered
	 */
	protected Customer customerID;

	/**
	 * The default value of the '{@link #getNrOfGuests() <em>Nr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfGuests() <em>Nr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int nrOfGuests = NR_OF_GUESTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getGuest() <em>Guest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuest()
	 * @generated
	 * @ordered
	 */
	protected EList guest;

	/**
	 * The default value of the '{@link #isIspayed() <em>Ispayed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIspayed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISPAYED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIspayed() <em>Ispayed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIspayed()
	 * @generated
	 * @ordered
	 */
	protected boolean ispayed = ISPAYED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingRef() {
		return bookingRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingRef(String newBookingRef) {
		String oldBookingRef = bookingRef;
		bookingRef = newBookingRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__BOOKING_REF, oldBookingRef, bookingRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfNights() {
		return nrOfNights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrOfNights(int newNrOfNights) {
		int oldNrOfNights = nrOfNights;
		nrOfNights = newNrOfNights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__NR_OF_NIGHTS, oldNrOfNights, nrOfNights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExtraList() {
		return extraList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraList(EList newExtraList) {
		EList oldExtraList = extraList;
		extraList = newExtraList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__EXTRA_LIST, oldExtraList, extraList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getRoomMap() {
		return roomMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomMap(Map newRoomMap) {
		Map oldRoomMap = roomMap;
		roomMap = newRoomMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__ROOM_MAP, oldRoomMap, roomMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGuestList() {
		return guestList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestList(EList newGuestList) {
		EList oldGuestList = guestList;
		guestList = newGuestList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__GUEST_LIST, oldGuestList, guestList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServiceNotes() {
		return serviceNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNotes(EList newServiceNotes) {
		EList oldServiceNotes = serviceNotes;
		serviceNotes = newServiceNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__SERVICE_NOTES, oldServiceNotes, serviceNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomerID() {
		if (customerID != null && customerID.eIsProxy()) {
			InternalEObject oldCustomerID = (InternalEObject)customerID;
			customerID = (Customer)eResolveProxy(oldCustomerID);
			if (customerID != oldCustomerID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BOOKING__CUSTOMER_ID, oldCustomerID, customerID));
			}
		}
		return customerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomerID() {
		return customerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerID(Customer newCustomerID) {
		Customer oldCustomerID = customerID;
		customerID = newCustomerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__CUSTOMER_ID, oldCustomerID, customerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfGuests() {
		return nrOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrOfGuests(int newNrOfGuests) {
		int oldNrOfGuests = nrOfGuests;
		nrOfGuests = newNrOfGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__NR_OF_GUESTS, oldNrOfGuests, nrOfGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BOOKING__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGuest() {
		if (guest == null) {
			guest = new EObjectResolvingEList(Guest.class, this, ModelPackage.BOOKING__GUEST);
		}
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIspayed() {
		return ispayed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIspayed(boolean newIspayed) {
		boolean oldIspayed = ispayed;
		ispayed = newIspayed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__ISPAYED, oldIspayed, ispayed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkedInAllGuest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkedInAGuest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isPayed(boolean isPayed) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BOOKING__BOOKING_REF:
				return getBookingRef();
			case ModelPackage.BOOKING__DATE:
				return getDate();
			case ModelPackage.BOOKING__NR_OF_NIGHTS:
				return new Integer(getNrOfNights());
			case ModelPackage.BOOKING__EXTRA_LIST:
				return getExtraList();
			case ModelPackage.BOOKING__ROOM_MAP:
				return getRoomMap();
			case ModelPackage.BOOKING__GUEST_LIST:
				return getGuestList();
			case ModelPackage.BOOKING__SERVICE_NOTES:
				return getServiceNotes();
			case ModelPackage.BOOKING__CUSTOMER_ID:
				if (resolve) return getCustomerID();
				return basicGetCustomerID();
			case ModelPackage.BOOKING__NR_OF_GUESTS:
				return new Integer(getNrOfGuests());
			case ModelPackage.BOOKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ModelPackage.BOOKING__GUEST:
				return getGuest();
			case ModelPackage.BOOKING__ISPAYED:
				return isIspayed() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.BOOKING__BOOKING_REF:
				setBookingRef((String)newValue);
				return;
			case ModelPackage.BOOKING__DATE:
				setDate((String)newValue);
				return;
			case ModelPackage.BOOKING__NR_OF_NIGHTS:
				setNrOfNights(((Integer)newValue).intValue());
				return;
			case ModelPackage.BOOKING__EXTRA_LIST:
				setExtraList((EList)newValue);
				return;
			case ModelPackage.BOOKING__ROOM_MAP:
				setRoomMap((Map)newValue);
				return;
			case ModelPackage.BOOKING__GUEST_LIST:
				setGuestList((EList)newValue);
				return;
			case ModelPackage.BOOKING__SERVICE_NOTES:
				setServiceNotes((EList)newValue);
				return;
			case ModelPackage.BOOKING__CUSTOMER_ID:
				setCustomerID((Customer)newValue);
				return;
			case ModelPackage.BOOKING__NR_OF_GUESTS:
				setNrOfGuests(((Integer)newValue).intValue());
				return;
			case ModelPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ModelPackage.BOOKING__GUEST:
				getGuest().clear();
				getGuest().addAll((Collection)newValue);
				return;
			case ModelPackage.BOOKING__ISPAYED:
				setIspayed(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.BOOKING__BOOKING_REF:
				setBookingRef(BOOKING_REF_EDEFAULT);
				return;
			case ModelPackage.BOOKING__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ModelPackage.BOOKING__NR_OF_NIGHTS:
				setNrOfNights(NR_OF_NIGHTS_EDEFAULT);
				return;
			case ModelPackage.BOOKING__EXTRA_LIST:
				setExtraList(EXTRA_LIST_EDEFAULT);
				return;
			case ModelPackage.BOOKING__ROOM_MAP:
				setRoomMap(ROOM_MAP_EDEFAULT);
				return;
			case ModelPackage.BOOKING__GUEST_LIST:
				setGuestList(GUEST_LIST_EDEFAULT);
				return;
			case ModelPackage.BOOKING__SERVICE_NOTES:
				setServiceNotes(SERVICE_NOTES_EDEFAULT);
				return;
			case ModelPackage.BOOKING__CUSTOMER_ID:
				setCustomerID((Customer)null);
				return;
			case ModelPackage.BOOKING__NR_OF_GUESTS:
				setNrOfGuests(NR_OF_GUESTS_EDEFAULT);
				return;
			case ModelPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ModelPackage.BOOKING__GUEST:
				getGuest().clear();
				return;
			case ModelPackage.BOOKING__ISPAYED:
				setIspayed(ISPAYED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.BOOKING__BOOKING_REF:
				return BOOKING_REF_EDEFAULT == null ? bookingRef != null : !BOOKING_REF_EDEFAULT.equals(bookingRef);
			case ModelPackage.BOOKING__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ModelPackage.BOOKING__NR_OF_NIGHTS:
				return nrOfNights != NR_OF_NIGHTS_EDEFAULT;
			case ModelPackage.BOOKING__EXTRA_LIST:
				return EXTRA_LIST_EDEFAULT == null ? extraList != null : !EXTRA_LIST_EDEFAULT.equals(extraList);
			case ModelPackage.BOOKING__ROOM_MAP:
				return ROOM_MAP_EDEFAULT == null ? roomMap != null : !ROOM_MAP_EDEFAULT.equals(roomMap);
			case ModelPackage.BOOKING__GUEST_LIST:
				return GUEST_LIST_EDEFAULT == null ? guestList != null : !GUEST_LIST_EDEFAULT.equals(guestList);
			case ModelPackage.BOOKING__SERVICE_NOTES:
				return SERVICE_NOTES_EDEFAULT == null ? serviceNotes != null : !SERVICE_NOTES_EDEFAULT.equals(serviceNotes);
			case ModelPackage.BOOKING__CUSTOMER_ID:
				return customerID != null;
			case ModelPackage.BOOKING__NR_OF_GUESTS:
				return nrOfGuests != NR_OF_GUESTS_EDEFAULT;
			case ModelPackage.BOOKING__CUSTOMER:
				return customer != null;
			case ModelPackage.BOOKING__GUEST:
				return guest != null && !guest.isEmpty();
			case ModelPackage.BOOKING__ISPAYED:
				return ispayed != ISPAYED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bookingRef: ");
		result.append(bookingRef);
		result.append(", date: ");
		result.append(date);
		result.append(", nrOfNights: ");
		result.append(nrOfNights);
		result.append(", extraList: ");
		result.append(extraList);
		result.append(", roomMap: ");
		result.append(roomMap);
		result.append(", guestList: ");
		result.append(guestList);
		result.append(", serviceNotes: ");
		result.append(serviceNotes);
		result.append(", nrOfGuests: ");
		result.append(nrOfGuests);
		result.append(", ispayed: ");
		result.append(ispayed);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
