/**
 */
package bookingmodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import bookingmodel.Booking;
import bookingmodel.Customer;
import bookingmodel.Guest;
import bookingmodel.ModelPackage;
import bookingmodel.PaymentMethod;

/**
 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bookingmodel.impl.BookingImpl#getBookingRef <em>Booking Ref</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getDate <em>Date</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getNrOfNights <em>Nr Of Nights</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getExtraList <em>Extra List</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getServiceNotes <em>Service Notes</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getNrOfGuests <em>Nr Of Guests</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getGuestList <em>Guest List</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#isPayed <em>Is Payed</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getRoomGuestMap <em>Room Guest Map</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getRoomTypeMap <em>Room Type Map</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getPaymentMethod <em>Payment Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getBookingRef() <em>Booking Ref</em>}' attribute.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingRef() <em>Booking Ref</em>}' attribute.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingRef()
	 * @generated
	 * @ordered
	 */
	protected String bookingRef = BOOKING_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNrOfNights() <em>Nr Of Nights</em>}' attribute.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfNights()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_NIGHTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfNights() <em>Nr Of Nights</em>}' attribute.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfNights()
	 * @generated
	 * @ordered
	 */
	protected int nrOfNights = NR_OF_NIGHTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtraList() <em>Extra List</em>}' attribute list.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> extraList;

	/**
	 * The cached value of the '{@link #getServiceNotes() <em>Service Notes</em>}' attribute list.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceNotes;

	/**
	 * The default value of the '{@link #getNrOfGuests() <em>Nr Of Guests</em>}' attribute.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfGuests() <em>Nr Of Guests</em>}' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int nrOfGuests = NR_OF_GUESTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getGuestList() <em>Guest List</em>}' reference list.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestList()
	 * @generated
	 * @ordered
	 */
	protected EList<Guest> guestList;

	/**
	 * The default value of the '{@link #isPayed() <em>Is Payed</em>}' attribute.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPayed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PAYED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPayed() <em>Is Payed</em>}' attribute.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPayed()
	 * @generated
	 * @ordered
	 */
	protected boolean isPayed = IS_PAYED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomGuestMap() <em>Room Guest Map</em>}' map.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomGuestMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> roomGuestMap;

	/**
	 * The cached value of the '{@link #getRoomTypeMap() <em>Room Type Map</em>}' map.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Integer> roomTypeMap;

	/**
	 * The default value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentMethod PAYMENT_METHOD_EDEFAULT = PaymentMethod.BANKCARD;

	/**
	 * The cached value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod paymentMethod = PAYMENT_METHOD_EDEFAULT;

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	public BookingImpl(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras) {
		// TODO Auto-generated constructor stub
		this.setNrOfNights(nrOfNights);
		this.setNrOfGuests(nrOfGuests);
		this.setDate(date);
		//this.								// finns ej setNrOfRooms
		this.roomTypeMap.put(roomTypes,0);	// should be a list instead: change constructor to list, and add checks in BookingHandlerImpl
		this.extraList.add(extras); 		// should be a list instead: change constructor to list, and add checks in BookingHandlerImpl
	}

	/**
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOOKING;
	}

	/**
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingRef() {
		return bookingRef;
	}

	/**
	 * 
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
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
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
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
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfNights() {
		return nrOfNights;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
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
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExtraList() {
		if (extraList == null) {
			extraList = new EDataTypeUniqueEList<String>(String.class, this, ModelPackage.BOOKING__EXTRA_LIST);
		}
		return extraList;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceNotes() {
		if (serviceNotes == null) {
			serviceNotes = new EDataTypeUniqueEList<String>(String.class, this, ModelPackage.BOOKING__SERVICE_NOTES);
		}
		return serviceNotes;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfGuests() {
		return nrOfGuests;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
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
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
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
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
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
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guest> getGuestList() {
		if (guestList == null) {
			guestList = new EObjectResolvingEList<Guest>(Guest.class, this, ModelPackage.BOOKING__GUEST_LIST);
		}
		return guestList;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPayed() {
		return isPayed;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPayed(boolean newIsPayed) {
		boolean oldIsPayed = isPayed;
		isPayed = newIsPayed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__IS_PAYED, oldIsPayed, isPayed));
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getRoomGuestMap() {
		if (roomGuestMap == null) {
			roomGuestMap = new EcoreEMap<String,String>(ModelPackage.Literals.ROOMTYPE_TO_GUEST_ID_ENTRY, RoomtypeToGuestIDEntryImpl.class, this, ModelPackage.BOOKING__ROOM_GUEST_MAP);
		}
		return roomGuestMap;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Integer> getRoomTypeMap() {
		if (roomTypeMap == null) {
			roomTypeMap = new EcoreEMap<String,Integer>(ModelPackage.Literals.NR_TO_ROOM_ENTRY, NrToRoomEntryImpl.class, this, ModelPackage.BOOKING__ROOM_TYPE_MAP);
		}
		return roomTypeMap;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentMethod(PaymentMethod newPaymentMethod) {
		PaymentMethod oldPaymentMethod = paymentMethod;
		paymentMethod = newPaymentMethod == null ? PAYMENT_METHOD_EDEFAULT : newPaymentMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING__PAYMENT_METHOD, oldPaymentMethod, paymentMethod));
	}

	/**
	 * Checks if all the rooms in the booking
	 * has a responsible guest. If so, then true is returned,
	 * otherwise false is returned.
	 * @generated NOT
	 */
	public boolean checkedInAllGuest() {
		boolean hasResponsible = true;
		if(!this.roomGuestMap.isEmpty()){
			for (String guestEmail: roomGuestMap.values()) {
				while(hasResponsible){
					if(guestEmail.isEmpty() || guestEmail.equals("out")){
						hasResponsible = false;
					}
				}
			}
		}
		return hasResponsible;
		
		//TODO: Lägga till try-catch och fånga exceptions på ett lämpligt sätt.
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
	}

	/**
	 * Checks if at least one room in the booking
	 * has a responsible guest. If so, then true is returned,
	 * otherwise false is returned.
	 * @generated
	 */
	public boolean checkedInAGuest() {
		boolean hasResponsible = false;
		if(!this.roomGuestMap.isEmpty()){
			for (String guestEmail : roomGuestMap.values()) {
				while(!hasResponsible){
					if(!guestEmail.isEmpty() || !guestEmail.equals("out")){
						hasResponsible = true;
					}
				}
			}
		}
		return hasResponsible;
		//TODO: Lägga till try-catch och fånga exceptions på ett lämpligt sätt.
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BOOKING__ROOM_GUEST_MAP:
				return ((InternalEList<?>)getRoomGuestMap()).basicRemove(otherEnd, msgs);
			case ModelPackage.BOOKING__ROOM_TYPE_MAP:
				return ((InternalEList<?>)getRoomTypeMap()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.BOOKING__BOOKING_REF:
				return getBookingRef();
			case ModelPackage.BOOKING__DATE:
				return getDate();
			case ModelPackage.BOOKING__NR_OF_NIGHTS:
				return getNrOfNights();
			case ModelPackage.BOOKING__EXTRA_LIST:
				return getExtraList();
			case ModelPackage.BOOKING__SERVICE_NOTES:
				return getServiceNotes();
			case ModelPackage.BOOKING__NR_OF_GUESTS:
				return getNrOfGuests();
			case ModelPackage.BOOKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ModelPackage.BOOKING__GUEST_LIST:
				return getGuestList();
			case ModelPackage.BOOKING__IS_PAYED:
				return isPayed();
			case ModelPackage.BOOKING__ROOM_GUEST_MAP:
				if (coreType) return getRoomGuestMap();
				else return getRoomGuestMap().map();
			case ModelPackage.BOOKING__ROOM_TYPE_MAP:
				if (coreType) return getRoomTypeMap();
				else return getRoomTypeMap().map();
			case ModelPackage.BOOKING__PAYMENT_METHOD:
				return getPaymentMethod();
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
			case ModelPackage.BOOKING__BOOKING_REF:
				setBookingRef((String)newValue);
				return;
			case ModelPackage.BOOKING__DATE:
				setDate((String)newValue);
				return;
			case ModelPackage.BOOKING__NR_OF_NIGHTS:
				setNrOfNights((Integer)newValue);
				return;
			case ModelPackage.BOOKING__EXTRA_LIST:
				getExtraList().clear();
				getExtraList().addAll((Collection<? extends String>)newValue);
				return;
			case ModelPackage.BOOKING__SERVICE_NOTES:
				getServiceNotes().clear();
				getServiceNotes().addAll((Collection<? extends String>)newValue);
				return;
			case ModelPackage.BOOKING__NR_OF_GUESTS:
				setNrOfGuests((Integer)newValue);
				return;
			case ModelPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ModelPackage.BOOKING__GUEST_LIST:
				getGuestList().clear();
				getGuestList().addAll((Collection<? extends Guest>)newValue);
				return;
			case ModelPackage.BOOKING__IS_PAYED:
				setIsPayed((Boolean)newValue);
				return;
			case ModelPackage.BOOKING__ROOM_GUEST_MAP:
				((EStructuralFeature.Setting)getRoomGuestMap()).set(newValue);
				return;
			case ModelPackage.BOOKING__ROOM_TYPE_MAP:
				((EStructuralFeature.Setting)getRoomTypeMap()).set(newValue);
				return;
			case ModelPackage.BOOKING__PAYMENT_METHOD:
				setPaymentMethod((PaymentMethod)newValue);
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
				getExtraList().clear();
				return;
			case ModelPackage.BOOKING__SERVICE_NOTES:
				getServiceNotes().clear();
				return;
			case ModelPackage.BOOKING__NR_OF_GUESTS:
				setNrOfGuests(NR_OF_GUESTS_EDEFAULT);
				return;
			case ModelPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ModelPackage.BOOKING__GUEST_LIST:
				getGuestList().clear();
				return;
			case ModelPackage.BOOKING__IS_PAYED:
				setIsPayed(IS_PAYED_EDEFAULT);
				return;
			case ModelPackage.BOOKING__ROOM_GUEST_MAP:
				getRoomGuestMap().clear();
				return;
			case ModelPackage.BOOKING__ROOM_TYPE_MAP:
				getRoomTypeMap().clear();
				return;
			case ModelPackage.BOOKING__PAYMENT_METHOD:
				setPaymentMethod(PAYMENT_METHOD_EDEFAULT);
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
			case ModelPackage.BOOKING__BOOKING_REF:
				return BOOKING_REF_EDEFAULT == null ? bookingRef != null : !BOOKING_REF_EDEFAULT.equals(bookingRef);
			case ModelPackage.BOOKING__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ModelPackage.BOOKING__NR_OF_NIGHTS:
				return nrOfNights != NR_OF_NIGHTS_EDEFAULT;
			case ModelPackage.BOOKING__EXTRA_LIST:
				return extraList != null && !extraList.isEmpty();
			case ModelPackage.BOOKING__SERVICE_NOTES:
				return serviceNotes != null && !serviceNotes.isEmpty();
			case ModelPackage.BOOKING__NR_OF_GUESTS:
				return nrOfGuests != NR_OF_GUESTS_EDEFAULT;
			case ModelPackage.BOOKING__CUSTOMER:
				return customer != null;
			case ModelPackage.BOOKING__GUEST_LIST:
				return guestList != null && !guestList.isEmpty();
			case ModelPackage.BOOKING__IS_PAYED:
				return isPayed != IS_PAYED_EDEFAULT;
			case ModelPackage.BOOKING__ROOM_GUEST_MAP:
				return roomGuestMap != null && !roomGuestMap.isEmpty();
			case ModelPackage.BOOKING__ROOM_TYPE_MAP:
				return roomTypeMap != null && !roomTypeMap.isEmpty();
			case ModelPackage.BOOKING__PAYMENT_METHOD:
				return paymentMethod != PAYMENT_METHOD_EDEFAULT;
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
			case ModelPackage.BOOKING___CHECKED_IN_ALL_GUEST:
				return checkedInAllGuest();
			case ModelPackage.BOOKING___CHECKED_IN_AGUEST:
				return checkedInAGuest();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (bookingRef: ");
		result.append(bookingRef);
		result.append(", date: ");
		result.append(date);
		result.append(", nrOfNights: ");
		result.append(nrOfNights);
		result.append(", extraList: ");
		result.append(extraList);
		result.append(", serviceNotes: ");
		result.append(serviceNotes);
		result.append(", nrOfGuests: ");
		result.append(nrOfGuests);
		result.append(", isPayed: ");
		result.append(isPayed);
		result.append(", paymentMethod: ");
		result.append(paymentMethod);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
