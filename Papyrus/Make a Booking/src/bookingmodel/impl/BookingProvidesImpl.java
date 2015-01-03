/**
 */
package bookingmodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import javax.xml.soap.SOAPException;

import maintenancemodel.MaintenanceProvidesForBooking;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import bookingmodel.Booking;
import bookingmodel.BookingHandler;
import bookingmodel.BookingProvides;
import bookingmodel.BookingmodelPackage;
import bookingmodel.Customer;
import bookingmodel.IBookingProvidesForGuest;
import bookingmodel.IBookingProvidesForHost;
import bookingmodel.PaymentDetails;
import bookingmodel.PaymentMethod;
import bookingmodel.ServiceNoteHandler;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Booking Provides</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bookingmodel.impl.BookingProvidesImpl#getBookingHandler <em>Booking Handler</em>}</li>
 *   <li>{@link bookingmodel.impl.BookingProvidesImpl#getServiceNoteHandler <em>Service Note Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingProvidesImpl extends MinimalEObjectImpl.Container implements
		BookingProvides {
	/**
	 * The cached value of the '{@link #getBookingHandler() <em>Booking Handler</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBookingHandler()
	 * @generated
	 * @ordered
	 */
	protected BookingHandler bookingHandler;

	/**
	 * The cached value of the '{@link #getServiceNoteHandler() <em>Service Note Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNoteHandler()
	 * @generated
	 * @ordered
	 */
	protected ServiceNoteHandler serviceNoteHandler;

	/**
	 * @generated NOT
	 */
	protected MaintenanceProvidesForBooking maintenanceComponent;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingProvidesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingmodelPackage.Literals.BOOKING_PROVIDES;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler getBookingHandler() {
		if (bookingHandler != null && bookingHandler.eIsProxy()) {
			InternalEObject oldBookingHandler = (InternalEObject)bookingHandler;
			bookingHandler = (BookingHandler)eResolveProxy(oldBookingHandler);
			if (bookingHandler != oldBookingHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER, oldBookingHandler, bookingHandler));
			}
		}
		return bookingHandler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler basicGetBookingHandler() {
		return bookingHandler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingHandler(BookingHandler newBookingHandler) {
		BookingHandler oldBookingHandler = bookingHandler;
		bookingHandler = newBookingHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER, oldBookingHandler, bookingHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNoteHandler getServiceNoteHandler() {
		if (serviceNoteHandler != null && serviceNoteHandler.eIsProxy()) {
			InternalEObject oldServiceNoteHandler = (InternalEObject)serviceNoteHandler;
			serviceNoteHandler = (ServiceNoteHandler)eResolveProxy(oldServiceNoteHandler);
			if (serviceNoteHandler != oldServiceNoteHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingmodelPackage.BOOKING_PROVIDES__SERVICE_NOTE_HANDLER, oldServiceNoteHandler, serviceNoteHandler));
			}
		}
		return serviceNoteHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNoteHandler basicGetServiceNoteHandler() {
		return serviceNoteHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNoteHandler(ServiceNoteHandler newServiceNoteHandler) {
		ServiceNoteHandler oldServiceNoteHandler = serviceNoteHandler;
		serviceNoteHandler = newServiceNoteHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING_PROVIDES__SERVICE_NOTE_HANDLER, oldServiceNoteHandler, serviceNoteHandler));
	}

	/**
	 * Converts a String into a List
	 * 
	 * @generated NOT
	 */
	public List<String> stringToList(String text) {
		return Arrays.asList(text.split("\\s*,\\s*"));
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int enableSelfManagement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int addServiceNote(String serviceNote, String description) {
		if(!serviceNote.equals(null) && !serviceNote.equals(description)){
			return this.serviceNoteHandler.addServiceNote(serviceNote, description);
		}
		return 1;
	}


	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int editServiceNoteDescription(String serviceNote, String description) {
		if(!serviceNote.equals(null) && !serviceNote.equals(description)){
			return this.serviceNoteHandler.editServiceNoteDescription(serviceNote, description);
		}
		return 2;
	}
	
	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int removeServiceNote(String serviceNote) {
		if(!serviceNote.equals(null)){
			return this.serviceNoteHandler.removeServiceNote(serviceNote);
		}
		return 2;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public EList<String> getServiceNotesOfBooking(String bookingRef) {
		if (this.bookingHandler.exists(bookingRef)) {
			return this.bookingHandler.getBooking(bookingRef).getServiceNotes();
		}
		return null;
	}
	
	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public EList<String> getServiceNotes() {
		return this.serviceNoteHandler.getServices();
	}

	
	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public String getServiceNoteDescription(String serviceNote) {
		if(!serviceNote.equals(null)){
			return this.serviceNoteHandler.getServiceNoteDescription(serviceNote);
		}
		return null;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public boolean isPayed(String bookingRef) {
		if (this.bookingHandler.exists(bookingRef)) {
			return this.bookingHandler.getBooking(bookingRef).isIsPayed();
		}
		return false;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int checkIn(String bookingRef, String roomsType, String guestEmail) {
		if (this.bookingHandler.exists(bookingRef)) {
			Booking booking = this.bookingHandler.getBooking(bookingRef);

			// get a room from maintenance
			int roomID = maintenanceComponent.setActive(roomsType);

			if(roomID != -1){
				//add the room and the booking reference in the map of rooms and which bookingreference they belong to
				this.bookingHandler.getRoomIDToBookingRefMap().put(roomID, bookingRef);
			
				// set the guest as responsible to the room
				booking.setResponsibleGuest(roomID, guestEmail);
				return 0;
			} 
		} 
		return -1;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int checkOut(int roomID, String guestEmail) {
		Booking booking = this.getBookingHandler().getBooking(roomID);
		if (this.getBookingHandler().exists(booking.getBookingRef())) {
			if(booking.checkedInRoom(roomID)){
				booking.removeResponsibleGuest(roomID, guestEmail);
				
				//removes the bookingreference from the room in the map of rooms and which bookingreference they belong to
				this.bookingHandler.getRoomIDToBookingRefMap().put(roomID, null);
				if(this.maintenanceComponent.setInactive(roomID) == -1){
					return 2;
				}
			} else {
				return 1;
			}	
		} else {
			return -1;
		}
		return 0;
	}


	/**
	 * @inheritDoc
	 * Pays for an extra
	 * @param ccNumber
	 * The cards ccNumber
	 * @param ccv
	 * The cards ccv number
	 * @param expMonth
	 * the month the card expiers
	 * @param expYear
	 * The year the card expiers
	 * @param firstName
	 * The card owners first name
	 * @param lastName 
	 * Same as firstName but last name
	 * @param extra
	 * A list of the extras to pay
	 * 
	 * @return 
	 * 			0 if success 
	 * 			1 if an error occurred
	 * 			2 if the credit card is invalid
	 * 			3 if not enough money on the card or invalid card
	 * @generated
	 */
	public int pay(String ccNumber, String ccv, int expMonth, int expYear, String firstName, String lastName, List<String> extra, int roomID) {
		return pay(ccNumber, ccv, expMonth, expYear, firstName, lastName,
				maintenanceComponent.getPriceExtra((EList<String>) extra));
	}


	/**
	 * Makes a payment
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return	0 if success 
	 * 			1 if an error occurred
	 * 			2 if the credit card is invalid
	 * 			3 if not enough money on the card or invalid card
	 * @generated NOT
	 */
	private int pay(String ccNumber, String ccv, int expMonth, int expYear,
			String firstName, String lastName, int sum) {
		try {
			se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires banking = se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
					.instance();
			if (!banking.isCreditCardValid(ccNumber, ccv, expMonth, expYear,
					firstName, lastName)) {
				return 2;
			}
			if (!banking.makePayment(ccNumber, ccv, expMonth, expYear,
					firstName, lastName, sum)) {
				return 3;
			}

		} catch (SOAPException e) {
			System.err
					.println("Error occurred while communicating with the bank");
			e.printStackTrace();
			return 1;
		}
		return 0;
	}

	/**
	 * @inheritDoc
	 * Pays for a booking
	 * @param ccNumber
	 * The cards ccNumber
	 * @param ccv
	 * The cards ccv number
	 * @param expMonth
	 * the month the card expiers
	 * @param expYear
	 * The year the card expiers
	 * @param firstName
	 * The card owners first name
	 * @param lastName 
	 * Same as firstName but last name
	 * @param extra
	 * A list of the extras to pay
	 * @generated NOT
	 */
	public int pay(String bookingRef) {
		int result = -1;
		if(this.getBookingHandler().exists(bookingRef)){
			Booking booking = this.getBookingHandler().getBooking(bookingRef);
			if(!booking.isIsPayed() && booking.getPaymentMethod().toString().equals("bankcard")){
				int price = getPrice(bookingRef);
				if (price != -1) {
					PaymentDetails bookingdetails = booking.getCustomer().getPaymentDetails()
							.get(0);
		
					result = pay(bookingdetails.getCcNr(), bookingdetails.getCcV(),
							bookingdetails.getExpMonth(), bookingdetails.getExpYear(),
							bookingdetails.getFirstName(),
							bookingdetails.getLastName(), price);
					if(result == 0){
						this.bookingHandler.getBooking(bookingRef).setIsPayed(true);
					}
				}
				result = 4;	
			}
			result = 5;
		}
		return result;
	}

	/**
	 * @inhertDoc
	 * Get a price for the booking
	 * @param bookingRef
	 * A bookingreference
	 * @return
	 * The bookings price
	 * If the booking doesnt exist, -1 is returned
	 * @generated NOT
	 */
	public int getPrice(String bookingRef) {
		if (this.bookingHandler.exists(bookingRef)) {
			int extraPrice = this.maintenanceComponent
					.getPriceExtra(this.bookingHandler.getBooking(bookingRef)
							.getExtras());
			int roomTypesPrice = this.maintenanceComponent
					.getPriceRoom(this.bookingHandler.getBooking(bookingRef)
							.getRoomTypes());
			return extraPrice + roomTypesPrice;
		} else {
			return -1;
		}
	}

	/**
	 * @inheritDoc
	 * Removes the booking
	 * @param bookingRef
	 * Bookingreference
	 * @generated NOT
	 */
	public int removeBooking(String bookingRef) {
		return this.getBookingHandler().removeBooking(bookingRef);
	}

	/**
	 * @inheritDoc
	 * Edits a booking
	 * @param bookingRef
	 * Bookingreference of an existing booking
	 * @param startDate
	 * The date you want the booking to start
	 * @param endDate
	 * The date you want the booking to end
	 * @param nrOfGuests
	 * The amount of guests the booking will have
	 * @param roomTypes
	 * What room type the booking will contain
	 * @param extras
	 * Any extras the booking shoulg contain
	 * 
	 * @return TODO
	 * 
	 * 
	 * @generated NOT
	 */
	public int editBooking(String bookingRef, String startDate, String endDate,
			int nrOfGuests, String roomTypes, String extras) {
		if(this.bookingHandler.exists(bookingRef)){
			Booking booking = this.bookingHandler.getBooking(bookingRef);
			List <String> rts = this.stringToList(roomTypes);
			List <String> xtras = this.stringToList(extras);
			
			//checks if any inparam is null, meaning not changed, if so, takes the value stored in the booking
			if(startDate.equals(null)){
				startDate = booking.getStartDate();
			}
			if(endDate.equals(null)){
				endDate = booking.getEndDate();
			}
			if(nrOfGuests == 0){
				nrOfGuests = booking.getNrOfGuests();
			}
			if(roomTypes.equals(null)){
				rts = booking.getRoomTypes();
			}
			if(xtras.equals(null)){
				xtras = booking.getExtras();
			}
			
			//checks with maintenance if the change is possible
			if (this.maintenanceComponent.canBook(
				(EList<String>) rts, startDate, endDate)) {
				
				//sets the change in the booking
				this.bookingHandler.editBooking(bookingRef, startDate, endDate,
						nrOfGuests, rts, xtras);
				return 0;
			}
			return 1;
		}
		return -1;
		
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 **/
	public int setPaymentMethod(String method, String bookingRef) {
		if (this.getBookingHandler().exists(bookingRef)) {
			PaymentMethod paymentMethod = null;
			switch (method) {
			case "BANKCARD":
				paymentMethod = PaymentMethod.BANKCARD;
				break;

			case "CASH":
				paymentMethod = PaymentMethod.CASH;
				break;

			case "VOUCHER":
				paymentMethod = PaymentMethod.VOUCHER;
				break;

			default:
				// do nothing
				break;
			}
			if (!paymentMethod.equals(null)) {
				this.getBookingHandler().getBooking(bookingRef)
						.setPaymentMethod(paymentMethod);
				return 0;
			} 
		}
		return -1;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int setPaymentDetails(String ccNumber, String ccv, int expiryMonth,
			int expiryYear, String firstName, String lastName,
			String customerEmail, String bookingRef) {
		if (this.getBookingHandler().exists(bookingRef)) {
			PaymentDetails paymentDetails = new PaymentDetailsImpl();
			paymentDetails.setCcNr(ccNumber);
			paymentDetails.setCcV(ccv);
			paymentDetails.setExpMonth(expiryMonth);
			paymentDetails.setExpYear(expiryYear);
			paymentDetails.setFirstName(firstName);
			paymentDetails.setLastName(lastName);

			Customer customer = this.getBookingHandler().getBooking(bookingRef)
					.getCustomer();
			if (customer.getEmail().equals(customerEmail)) {
				customer.getPaymentDetails().add(paymentDetails);
				return 0;
			}
		}
		return -1;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int setPersonalDetails(String firstName, String lastName, int age,
			String email, String bookingRef) {
		if (this.getBookingHandler().exists(bookingRef)) {
			if(age >= 18){
				Customer customer = new CustomerImpl();
				customer.setFirstName(firstName);
				customer.setLastName(lastName);
				customer.setEmail(email);
				customer.setAge(age);
				this.getBookingHandler().getBooking(bookingRef)
					.setCustomer(customer);
			return 0;
			}
			return 1;
		} 
		return -1;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String book(String startDate, String endDate, int nrOfGuests, List<String> roomTypes, List<String> extras, List<String> services) {
		String bookingRef = "";
		
		if(!startDate.equals(null) && !endDate.equals(null) && nrOfGuests > 0 && !roomTypes.equals(null)){
			if (this.maintenanceComponent.canBook((EList<String>) roomTypes, startDate, endDate)) {
				Booking booking = new BookingImpl(nrOfGuests, startDate, endDate, roomTypes, extras);
				this.bookingHandler.addBooking(booking);
				bookingRef = booking.getBookingRef();
			}
			return "Startdate, enddate, number of guests and roomtypes cannot be empty";
		}
		return bookingRef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
				if (resolve) return getBookingHandler();
				return basicGetBookingHandler();
			case BookingmodelPackage.BOOKING_PROVIDES__SERVICE_NOTE_HANDLER:
				if (resolve) return getServiceNoteHandler();
				return basicGetServiceNoteHandler();
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
			case BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
				setBookingHandler((BookingHandler)newValue);
				return;
			case BookingmodelPackage.BOOKING_PROVIDES__SERVICE_NOTE_HANDLER:
				setServiceNoteHandler((ServiceNoteHandler)newValue);
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
			case BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
				setBookingHandler((BookingHandler)null);
				return;
			case BookingmodelPackage.BOOKING_PROVIDES__SERVICE_NOTE_HANDLER:
				setServiceNoteHandler((ServiceNoteHandler)null);
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
			case BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
				return bookingHandler != null;
			case BookingmodelPackage.BOOKING_PROVIDES__SERVICE_NOTE_HANDLER:
				return serviceNoteHandler != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IBookingProvidesForGuest.class) {
			switch (baseOperationID) {
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST___CHECK_IN__STRING_STRING_STRING: return BookingmodelPackage.BOOKING_PROVIDES___CHECK_IN__STRING_STRING_STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST___CHECK_OUT__INT_STRING: return BookingmodelPackage.BOOKING_PROVIDES___CHECK_OUT__INT_STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST___PAY__STRING_STRING_INT_INT_STRING_STRING_ELIST_INT: return BookingmodelPackage.BOOKING_PROVIDES___PAY__STRING_STRING_INT_INT_STRING_STRING_ELIST_INT;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST___PAY__STRING_STRING_INT_INT_STRING_STRING_INT: return BookingmodelPackage.BOOKING_PROVIDES___PAY__STRING_STRING_INT_INT_STRING_STRING_INT;
				default: return -1;
			}
		}
		if (baseClass == IBookingProvidesForHost.class) {
			switch (baseOperationID) {
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___ENABLE_SELF_MANAGEMENT: return BookingmodelPackage.BOOKING_PROVIDES___ENABLE_SELF_MANAGEMENT;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___ADD_SERVICE_NOTE__STRING_STRING: return BookingmodelPackage.BOOKING_PROVIDES___ADD_SERVICE_NOTE__STRING_STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___REMOVE_SERVICE_NOTE__STRING: return BookingmodelPackage.BOOKING_PROVIDES___REMOVE_SERVICE_NOTE__STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___GET_SERVICE_NOTES_OF_BOOKING__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_SERVICE_NOTES_OF_BOOKING__STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___EDIT_SERVICE_NOTE_DESCRIPTION__STRING_STRING: return BookingmodelPackage.BOOKING_PROVIDES___EDIT_SERVICE_NOTE_DESCRIPTION__STRING_STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___GET_SERVICE_NOTES: return BookingmodelPackage.BOOKING_PROVIDES___GET_SERVICE_NOTES;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___GET_SERVICE_NOTE_DESCRIPTION__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_SERVICE_NOTE_DESCRIPTION__STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___IS_PAYED__STRING: return BookingmodelPackage.BOOKING_PROVIDES___IS_PAYED__STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case BookingmodelPackage.BOOKING_PROVIDES___PAY__STRING:
				return pay((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_PRICE__STRING:
				return getPrice((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___REMOVE_BOOKING__STRING:
				return removeBooking((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___EDIT_BOOKING__STRING_STRING_STRING_INT_STRING_STRING:
				return editBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case BookingmodelPackage.BOOKING_PROVIDES___SET_PAYMENT_METHOD__STRING_STRING:
				return setPaymentMethod((String)arguments.get(0), (String)arguments.get(1));
			case BookingmodelPackage.BOOKING_PROVIDES___SET_PAYMENT_DETAILS__STRING_STRING_INT_INT_STRING_STRING_STRING_STRING:
				return setPaymentDetails((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7));
			case BookingmodelPackage.BOOKING_PROVIDES___SET_PERSONAL_DETAILS__STRING_STRING_INT_STRING_STRING:
				return setPersonalDetails((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case BookingmodelPackage.BOOKING_PROVIDES___BOOK__STRING_STRING_INT_ELIST_ELIST_ELIST:
				return book((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (EList<String>)arguments.get(3), (EList<String>)arguments.get(4), (EList<String>)arguments.get(5));
			case BookingmodelPackage.BOOKING_PROVIDES___CHECK_IN__STRING_STRING_STRING:
				return checkIn((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case BookingmodelPackage.BOOKING_PROVIDES___CHECK_OUT__INT_STRING:
				return checkOut((Integer)arguments.get(0), (String)arguments.get(1));
			case BookingmodelPackage.BOOKING_PROVIDES___PAY__STRING_STRING_INT_INT_STRING_STRING_ELIST_INT:
				return pay((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (EList<?>)arguments.get(6), (Integer)arguments.get(7));
			case BookingmodelPackage.BOOKING_PROVIDES___PAY__STRING_STRING_INT_INT_STRING_STRING_INT:
				return pay((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Integer)arguments.get(6));
			case BookingmodelPackage.BOOKING_PROVIDES___ENABLE_SELF_MANAGEMENT:
				return enableSelfManagement();
			case BookingmodelPackage.BOOKING_PROVIDES___ADD_SERVICE_NOTE__STRING_STRING:
				return addServiceNote((String)arguments.get(0), (String)arguments.get(1));
			case BookingmodelPackage.BOOKING_PROVIDES___REMOVE_SERVICE_NOTE__STRING:
				return removeServiceNote((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_SERVICE_NOTES_OF_BOOKING__STRING:
				return getServiceNotesOfBooking((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___EDIT_SERVICE_NOTE_DESCRIPTION__STRING_STRING:
				return editServiceNoteDescription((String)arguments.get(0), (String)arguments.get(1));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_SERVICE_NOTES:
				return getServiceNotes();
			case BookingmodelPackage.BOOKING_PROVIDES___GET_SERVICE_NOTE_DESCRIPTION__STRING:
				return getServiceNoteDescription((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___IS_PAYED__STRING:
				return isPayed((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___STRING_TO_LIST__STRING:
				return stringToList((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // BookingProvidesImpl
