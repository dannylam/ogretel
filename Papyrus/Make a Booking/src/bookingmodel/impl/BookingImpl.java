/**
 */
package bookingmodel.impl;

import bookingmodel.Booking;
import bookingmodel.BookingmodelPackage;
import bookingmodel.Customer;
import bookingmodel.Guest;
import bookingmodel.PaymentMethod;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bookingmodel.impl.BookingImpl#getBookingRef <em>Booking Ref</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getServiceNotes <em>Service Notes</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getNrOfGuests <em>Nr Of Guests</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getGuestList <em>Guest List</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#isIsPayed <em>Is Payed</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getRoomIDToGuestMap <em>Room ID To Guest Map</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getRoomTypeToRoomIDMap <em>Room Type To Room ID Map</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingImpl#getExtraToIsPayedMap <em>Extra To Is Payed Map</em>}</li>
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
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceNotes() <em>Service Notes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceNotes;

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
	 * The cached value of the '{@link #getGuestList() <em>Guest List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestList()
	 * @generated
	 * @ordered
	 */
	protected EList<Guest> guestList;

	/**
	 * The default value of the '{@link #isIsPayed() <em>Is Payed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPayed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PAYED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPayed() <em>Is Payed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPayed()
	 * @generated
	 * @ordered
	 */
	protected boolean isPayed = IS_PAYED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomIDToGuestMap() <em>Room ID To Guest Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomIDToGuestMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<Integer, String> roomIDToGuestMap;

	/**
	 * The cached value of the '{@link #getRoomTypeToRoomIDMap() <em>Room Type To Room ID Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeToRoomIDMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Integer> roomTypeToRoomIDMap;

	/**
	 * The default value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentMethod PAYMENT_METHOD_EDEFAULT = PaymentMethod.BANKCARD;

	/**
	 * The cached value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod paymentMethod = PAYMENT_METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtraToIsPayedMap() <em>Extra To Is Payed Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraToIsPayedMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Boolean> extraToIsPayedMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}
	
	/**
	 * TODO: Javadoc
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BookingImpl(int nrOfGuests, String startDate, String endDate, List<String> roomTypes, List<String> extras) {
		this.setNrOfGuests(nrOfGuests);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setRoomTypes(roomTypes);
		this.setExtras(extras);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingmodelPackage.Literals.BOOKING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING__BOOKING_REF, oldBookingRef, bookingRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setStartDate(String newStartDate) {
		if(!(newStartDate.equals(null))){
		String oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING__START_DATE, oldStartDate, startDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setEndDate(String newEndDate) {
		if(!(newEndDate.equals(null))){
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING__END_DATE, oldEndDate, endDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceNotes() {
		if (serviceNotes == null) {
			serviceNotes = new EDataTypeUniqueEList<String>(String.class, this, BookingmodelPackage.BOOKING__SERVICE_NOTES);
		}
		return serviceNotes;
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
		if(!(newNrOfGuests != 0)){
		int oldNrOfGuests = nrOfGuests;
		nrOfGuests = newNrOfGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING__NR_OF_GUESTS, oldNrOfGuests, nrOfGuests));
		}
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingmodelPackage.BOOKING__CUSTOMER, oldCustomer, customer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guest> getGuestList() {
		if (guestList == null) {
			guestList = new EObjectResolvingEList<Guest>(Guest.class, this, BookingmodelPackage.BOOKING__GUEST_LIST);
		}
		return guestList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPayed() {
		return isPayed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPayed(boolean newIsPayed) {
		boolean oldIsPayed = isPayed;
		isPayed = newIsPayed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING__IS_PAYED, oldIsPayed, isPayed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Integer, String> getRoomIDToGuestMap() {
		if (roomIDToGuestMap == null) {
			roomIDToGuestMap = new EcoreEMap<Integer,String>(BookingmodelPackage.Literals.ROOM_TO_GUEST_ID_ENTRY, RoomToGuestIDEntryImpl.class, this, BookingmodelPackage.BOOKING__ROOM_ID_TO_GUEST_MAP);
		}
		return roomIDToGuestMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Integer> getRoomTypeToRoomIDMap() {
		if (roomTypeToRoomIDMap == null) {
			roomTypeToRoomIDMap = new EcoreEMap<String,Integer>(BookingmodelPackage.Literals.ROOM_TYPE_TO_ROOM_ID_ENTRY, RoomTypeToRoomIDEntryImpl.class, this, BookingmodelPackage.BOOKING__ROOM_TYPE_TO_ROOM_ID_MAP);
		}
		return roomTypeToRoomIDMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentMethod(PaymentMethod newPaymentMethod) {
		PaymentMethod oldPaymentMethod = paymentMethod;
		paymentMethod = newPaymentMethod == null ? PAYMENT_METHOD_EDEFAULT : newPaymentMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING__PAYMENT_METHOD, oldPaymentMethod, paymentMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Boolean> getExtraToIsPayedMap() {
		if (extraToIsPayedMap == null) {
			extraToIsPayedMap = new EcoreEMap<String,Boolean>(BookingmodelPackage.Literals.EXTRA_TO_IS_PAYED_ENTRY, ExtraToIsPayedEntryImpl.class, this, BookingmodelPackage.BOOKING__EXTRA_TO_IS_PAYED_MAP);
		}
		return extraToIsPayedMap;
	}


	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public boolean checkedInAllGuest() {
		boolean hasResponsible = true;
		if(!this.roomIDToGuestMap.isEmpty()){
			for (String guestEmail: roomIDToGuestMap.values()) {
				while(hasResponsible){
					if(guestEmail.isEmpty() || guestEmail.equals("out")){
						hasResponsible = false;
					}
				}
			}
		}
		return hasResponsible;
		//TODO: Lägga till try-catch och fånga exceptions på ett lämpligt sätt.
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public boolean checkedInAGuest() {
		boolean hasResponsible = false;
		if(!this.roomIDToGuestMap.isEmpty()){
			for (String guestEmail : roomIDToGuestMap.values()) {
				while(!hasResponsible){
					if(!guestEmail.isEmpty() || !guestEmail.equals("out")){
						hasResponsible = true;
					}
				}
			}
		}
		return hasResponsible;
		//TODO: Lägga till try-catch och fånga exceptions på ett lämpligt sätt.
	}

	/**
	 * @inheritDoc
	 *TODO: check if correct
	 * @generated NOT
	 */
	public int setResponsibleGuest(int roomID, String guestEmail) {
		int result = 0;
		if(this.roomIDToGuestMap.get(roomID).getValue().isEmpty()){
			this.roomIDToGuestMap.get(roomID).setValue(guestEmail);
		}
		return result;
	}
	
	/**
	 * @inheritDoc
	 *TODO: check if correct
	 * @generated NOT
	 */
	public int setResponsibleGuestToAllRooms(String guestEmail) {
		int result = 0;
		if(!this.roomIDToGuestMap.isEmpty()){
			int i = 0;
			for (String key: this.roomIDToGuestMap.values()) {
				if(key.isEmpty()){
					this.roomIDToGuestMap.get(i).setValue(guestEmail);
				}
			i++;
			}
		}
		return result;
	}

	/**
	 * @inheritDoc 
	 * TODO: check if its correct
	 * @generated NOT
	 */
	public int getNrOfRooms() {
		return this.roomTypeToRoomIDMap.size(); 
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public void generateBookingRef() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int setRoomIDs(List<Integer> roomIDs) {
		int result = 0;
		//TODO check if map is not empty first
		for (int i = 0; i < roomIDs.size(); i++) {
			this.roomIDToGuestMap.put(roomIDs.get(i),roomIDToGuestMap.get(i).getValue());
		}
		return result;
		//TODO check if its correct
	}
	
	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int setExtras(List<String> extras) {
		int result = 0;
		//TODO check if map is not empty first
		for (int i = 0; i < extras.size(); i++) {
			this.extraToIsPayedMap.put(extras.get(i),false);
		}
		return result;
		//TODO check if its correct
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int setRoomTypes(List<String> roomTypes) {
		int result = 0;
		if(!(roomTypes.isEmpty())){
		//TODO check if map is not empty first
			for (int i = 0; i < roomTypes.size(); i++) {
				this.roomTypeToRoomIDMap.put(roomTypes.get(i), null);
				this.roomIDToGuestMap.put(null,roomTypes.get(i));
			}
		}
		return result;
		//TODO check if its correct
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BookingmodelPackage.BOOKING__ROOM_ID_TO_GUEST_MAP:
				return ((InternalEList<?>)getRoomIDToGuestMap()).basicRemove(otherEnd, msgs);
			case BookingmodelPackage.BOOKING__ROOM_TYPE_TO_ROOM_ID_MAP:
				return ((InternalEList<?>)getRoomTypeToRoomIDMap()).basicRemove(otherEnd, msgs);
			case BookingmodelPackage.BOOKING__EXTRA_TO_IS_PAYED_MAP:
				return ((InternalEList<?>)getExtraToIsPayedMap()).basicRemove(otherEnd, msgs);
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
			case BookingmodelPackage.BOOKING__BOOKING_REF:
				return getBookingRef();
			case BookingmodelPackage.BOOKING__START_DATE:
				return getStartDate();
			case BookingmodelPackage.BOOKING__END_DATE:
				return getEndDate();
			case BookingmodelPackage.BOOKING__SERVICE_NOTES:
				return getServiceNotes();
			case BookingmodelPackage.BOOKING__NR_OF_GUESTS:
				return getNrOfGuests();
			case BookingmodelPackage.BOOKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case BookingmodelPackage.BOOKING__GUEST_LIST:
				return getGuestList();
			case BookingmodelPackage.BOOKING__IS_PAYED:
				return isIsPayed();
			case BookingmodelPackage.BOOKING__ROOM_ID_TO_GUEST_MAP:
				if (coreType) return getRoomIDToGuestMap();
				else return getRoomIDToGuestMap().map();
			case BookingmodelPackage.BOOKING__ROOM_TYPE_TO_ROOM_ID_MAP:
				if (coreType) return getRoomTypeToRoomIDMap();
				else return getRoomTypeToRoomIDMap().map();
			case BookingmodelPackage.BOOKING__PAYMENT_METHOD:
				return getPaymentMethod();
			case BookingmodelPackage.BOOKING__EXTRA_TO_IS_PAYED_MAP:
				if (coreType) return getExtraToIsPayedMap();
				else return getExtraToIsPayedMap().map();
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
			case BookingmodelPackage.BOOKING__BOOKING_REF:
				setBookingRef((String)newValue);
				return;
			case BookingmodelPackage.BOOKING__START_DATE:
				setStartDate((String)newValue);
				return;
			case BookingmodelPackage.BOOKING__END_DATE:
				setEndDate((String)newValue);
				return;
			case BookingmodelPackage.BOOKING__SERVICE_NOTES:
				getServiceNotes().clear();
				getServiceNotes().addAll((Collection<? extends String>)newValue);
				return;
			case BookingmodelPackage.BOOKING__NR_OF_GUESTS:
				setNrOfGuests((Integer)newValue);
				return;
			case BookingmodelPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case BookingmodelPackage.BOOKING__GUEST_LIST:
				getGuestList().clear();
				getGuestList().addAll((Collection<? extends Guest>)newValue);
				return;
			case BookingmodelPackage.BOOKING__IS_PAYED:
				setIsPayed((Boolean)newValue);
				return;
			case BookingmodelPackage.BOOKING__ROOM_ID_TO_GUEST_MAP:
				((EStructuralFeature.Setting)getRoomIDToGuestMap()).set(newValue);
				return;
			case BookingmodelPackage.BOOKING__ROOM_TYPE_TO_ROOM_ID_MAP:
				((EStructuralFeature.Setting)getRoomTypeToRoomIDMap()).set(newValue);
				return;
			case BookingmodelPackage.BOOKING__PAYMENT_METHOD:
				setPaymentMethod((PaymentMethod)newValue);
				return;
			case BookingmodelPackage.BOOKING__EXTRA_TO_IS_PAYED_MAP:
				((EStructuralFeature.Setting)getExtraToIsPayedMap()).set(newValue);
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
			case BookingmodelPackage.BOOKING__BOOKING_REF:
				setBookingRef(BOOKING_REF_EDEFAULT);
				return;
			case BookingmodelPackage.BOOKING__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case BookingmodelPackage.BOOKING__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case BookingmodelPackage.BOOKING__SERVICE_NOTES:
				getServiceNotes().clear();
				return;
			case BookingmodelPackage.BOOKING__NR_OF_GUESTS:
				setNrOfGuests(NR_OF_GUESTS_EDEFAULT);
				return;
			case BookingmodelPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case BookingmodelPackage.BOOKING__GUEST_LIST:
				getGuestList().clear();
				return;
			case BookingmodelPackage.BOOKING__IS_PAYED:
				setIsPayed(IS_PAYED_EDEFAULT);
				return;
			case BookingmodelPackage.BOOKING__ROOM_ID_TO_GUEST_MAP:
				getRoomIDToGuestMap().clear();
				return;
			case BookingmodelPackage.BOOKING__ROOM_TYPE_TO_ROOM_ID_MAP:
				getRoomTypeToRoomIDMap().clear();
				return;
			case BookingmodelPackage.BOOKING__PAYMENT_METHOD:
				setPaymentMethod(PAYMENT_METHOD_EDEFAULT);
				return;
			case BookingmodelPackage.BOOKING__EXTRA_TO_IS_PAYED_MAP:
				getExtraToIsPayedMap().clear();
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
			case BookingmodelPackage.BOOKING__BOOKING_REF:
				return BOOKING_REF_EDEFAULT == null ? bookingRef != null : !BOOKING_REF_EDEFAULT.equals(bookingRef);
			case BookingmodelPackage.BOOKING__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case BookingmodelPackage.BOOKING__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case BookingmodelPackage.BOOKING__SERVICE_NOTES:
				return serviceNotes != null && !serviceNotes.isEmpty();
			case BookingmodelPackage.BOOKING__NR_OF_GUESTS:
				return nrOfGuests != NR_OF_GUESTS_EDEFAULT;
			case BookingmodelPackage.BOOKING__CUSTOMER:
				return customer != null;
			case BookingmodelPackage.BOOKING__GUEST_LIST:
				return guestList != null && !guestList.isEmpty();
			case BookingmodelPackage.BOOKING__IS_PAYED:
				return isPayed != IS_PAYED_EDEFAULT;
			case BookingmodelPackage.BOOKING__ROOM_ID_TO_GUEST_MAP:
				return roomIDToGuestMap != null && !roomIDToGuestMap.isEmpty();
			case BookingmodelPackage.BOOKING__ROOM_TYPE_TO_ROOM_ID_MAP:
				return roomTypeToRoomIDMap != null && !roomTypeToRoomIDMap.isEmpty();
			case BookingmodelPackage.BOOKING__PAYMENT_METHOD:
				return paymentMethod != PAYMENT_METHOD_EDEFAULT;
			case BookingmodelPackage.BOOKING__EXTRA_TO_IS_PAYED_MAP:
				return extraToIsPayedMap != null && !extraToIsPayedMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BookingmodelPackage.BOOKING___CHECKED_IN_ALL_GUEST:
				return checkedInAllGuest();
			case BookingmodelPackage.BOOKING___CHECKED_IN_AGUEST:
				return checkedInAGuest();
			case BookingmodelPackage.BOOKING___SET_RESPONSIBLE_GUEST__INT_STRING:
				return setResponsibleGuest((Integer)arguments.get(0), (String)arguments.get(1));
			case BookingmodelPackage.BOOKING___SET_RESPONSIBLE_GUEST_TO_ALL_ROOMS__STRING:
				return setResponsibleGuestToAllRooms((String)arguments.get(0));
			case BookingmodelPackage.BOOKING___GET_NR_OF_ROOMS:
				return getNrOfRooms();
			case BookingmodelPackage.BOOKING___SET_EXTRAS__ELIST:
				return setExtras((EList<String>)arguments.get(0));
			case BookingmodelPackage.BOOKING___SET_ROOM_TYPES__ELIST:
				return setRoomTypes((EList<String>)arguments.get(0));
			case BookingmodelPackage.BOOKING___SET_ROOM_IDS__ELIST:
				return setRoomIDs((EList<Integer>)arguments.get(0));
			case BookingmodelPackage.BOOKING___GENERATE_BOOKING_REF:
				generateBookingRef();
				return null;
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
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
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
