/**
 */
package bookingmodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.soap.SOAPException;

import maintenancemodel.MaintenanceProvidesForBooking;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
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
	 * The cached value of the '{@link #getBookingHandler() <em>Booking Handler</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBookingHandler()
	 * @generated
	 * @ordered
	 */
	protected BookingHandler bookingHandler;

	/**
	 * The cached value of the '{@link #getServiceNoteHandler() <em>Service Note Handler</em>}' containment reference.
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
	 * @generated NOT
	 */
	public BookingProvidesImpl() {
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
		return bookingHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookingHandler(BookingHandler newBookingHandler, NotificationChain msgs) {
		BookingHandler oldBookingHandler = bookingHandler;
		bookingHandler = newBookingHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER, oldBookingHandler, newBookingHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingHandler(BookingHandler newBookingHandler) {
		if (newBookingHandler != bookingHandler) {
			NotificationChain msgs = null;
			if (bookingHandler != null)
				msgs = ((InternalEObject)bookingHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER, null, msgs);
			if (newBookingHandler != null)
				msgs = ((InternalEObject)newBookingHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER, null, msgs);
			msgs = basicSetBookingHandler(newBookingHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER, newBookingHandler, newBookingHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNoteHandler getServiceNoteHandler() {
		return serviceNoteHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceNoteHandler(ServiceNoteHandler newServiceNoteHandler, NotificationChain msgs) {
		ServiceNoteHandler oldServiceNoteHandler = serviceNoteHandler;
		serviceNoteHandler = newServiceNoteHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING_PROVIDES__SERVICE_NOTE_HANDLER, oldServiceNoteHandler, newServiceNoteHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNoteHandler(ServiceNoteHandler newServiceNoteHandler) {
		if (newServiceNoteHandler != serviceNoteHandler) {
			NotificationChain msgs = null;
			if (serviceNoteHandler != null)
				msgs = ((InternalEObject)serviceNoteHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BookingmodelPackage.BOOKING_PROVIDES__SERVICE_NOTE_HANDLER, null, msgs);
			if (newServiceNoteHandler != null)
				msgs = ((InternalEObject)newServiceNoteHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BookingmodelPackage.BOOKING_PROVIDES__SERVICE_NOTE_HANDLER, null, msgs);
			msgs = basicSetServiceNoteHandler(newServiceNoteHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING_PROVIDES__SERVICE_NOTE_HANDLER, newServiceNoteHandler, newServiceNoteHandler));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
				return basicSetBookingHandler(null, msgs);
			case BookingmodelPackage.BOOKING_PROVIDES__SERVICE_NOTE_HANDLER:
				return basicSetServiceNoteHandler(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int addServiceNote(String serviceNote, String description) {
		if(!serviceNote.equals(null) && !serviceNote.equals(description)){
			return this.serviceNoteHandler.addServiceNote(serviceNote, description);
		}
		return 1;
	}


	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int editServiceNoteDescription(String serviceNote, String description) {
		if(!serviceNote.equals(null) && !serviceNote.equals(description)){
			return this.serviceNoteHandler.editServiceNoteDescription(serviceNote, description);
		}
		return 2;
	}
	
	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int removeServiceNote(String serviceNote) {
		if(!serviceNote.equals(null)){
			return this.serviceNoteHandler.removeServiceNote(serviceNote);
		}
		return 2;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public EList<String> getServiceNotesOfBooking(String bookingRef) {
		if (this.bookingHandler.exists(bookingRef)) {
			return this.bookingHandler.getBooking(bookingRef).getServiceNotes();
		}
		return null;
	}
	
	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public EList<String> getServiceNotes() {
		return this.serviceNoteHandler.getServices();
	}

	
	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String getServiceNoteDescription(String serviceNote) {
		if(!serviceNote.equals(null)){
			return this.serviceNoteHandler.getServiceNoteDescription(serviceNote);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public boolean isPayed(String bookingRef) {
		if (this.bookingHandler.exists(bookingRef)) {
			return this.bookingHandler.getBooking(bookingRef).isPayed();
		}
		return false;
	}

	/**
	 * {@inheritDoc}
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
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int checkOut(int roomID, String guestEmail) {
		Booking booking = this.getBookingHandler().getBooking(roomID);
		if (this.getBookingHandler().exists(booking.getBookingRef())) {
			if(booking.checkedInRoom(roomID)){
				booking.removeResponsibleGuest(roomID, guestEmail);

				//check if the booking has been is payed or not, 
				//if not, return an int indicating that the room needs to be payed
				if(!this.isPayed(booking.getBookingRef())){
					return 3;
				}
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
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int payBooking(String bookingRef) {
		int result = -1;
		if(this.getBookingHandler().exists(bookingRef)){
			Booking booking = this.getBookingHandler().getBooking(bookingRef);
			if(!booking.isIsPayed() && booking.getPaymentMethod().toString().equals("bankcard")){
				int price = getPrice(bookingRef);
				if (price != -1) {
					PaymentDetails bookingdetails = booking.getCustomer().getPaymentDetails()
							.get(0);
		
					result = paySum(bookingdetails.getCcNr(), bookingdetails.getCcV(),
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
	 * {inheritDoc}
	 * @generated NOT
	 */
	public int payExtra(String ccNumber, String ccv, int expMonth, int expYear, String firstName, String lastName, List<String> extras, int roomID) {
		if(this.bookingHandler.exists(this.bookingHandler.getBooking(roomID).getBookingRef())){
			if(!extras.equals(null)){
				EList<String> extrasToBePayed = null;
				for(String extra: extras){
					if(!this.getBookingHandler().getBooking(roomID).getExtraToIsPayedMap().get(extra).booleanValue()){
						extrasToBePayed.add(extra);
					}
				}
				if(!extrasToBePayed.equals(null)){
				return paySum(ccNumber, ccv, expMonth, expYear, firstName, lastName,
						maintenanceComponent.getPriceExtra(extrasToBePayed));
				}
				return 4;
			}
			return 5;
		}
		return -1;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int payRoom(String ccNumber, String ccv, int expMonth, int expYear, String firstName, String lastName, int roomID) {
		if(this.bookingHandler.exists(this.bookingHandler.getBooking(roomID).getBookingRef())){
			Booking booking = this.getBookingHandler().getBooking(roomID);
			if(!booking.getRoomIDToISPayed.get(roomID).booleanValue()){ //TODO: add something with roomIDs and payed
				EList <String> roomType = (EList<String>) this.stringToList(booking.getRoomIDToRoomTypeMap().get(roomID).getValue());
					return paySum(ccNumber, ccv, expMonth, expYear, firstName, lastName,
							maintenanceComponent.getPriceRoom(roomType));
			}
			return 4;
		}	
		return -1;
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
	private int paySum(String ccNumber, String ccv, int expMonth, int expYear,
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
	 * {@inheritDoc}
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
	 * {@inheritDoc}
	 * Removes the booking
	 * @param bookingRef
	 * Bookingreference
	 * @generated NOT
	 */
	public int removeBooking(String bookingRef) {
		return this.getBookingHandler().removeBooking(bookingRef);
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int editBooking(String bookingRef, String startDate, String endDate, int nrOfGuests, List<String> roomTypes, List<String> extras, List<String> services) {
		if(this.bookingHandler.exists(bookingRef)){
			Booking booking = this.bookingHandler.getBooking(bookingRef);
			
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
				roomTypes = booking.getRoomTypes();
			}
			if(extras.equals(null)){
				extras = booking.getExtras();
			}
			if(services.equals(null)){
				services = booking.getServiceNotes();
			} else {
				List <String> newServiceNotes = new ArrayList <String>();
				for(String service: services)
				if(this.serviceNoteHandler.exists(service)){
					newServiceNotes.add(service);
					
				}
				services = newServiceNotes;
			}
			
			//checks with maintenance if the change is possible
			if (this.maintenanceComponent.canBook(
				(EList<String>) roomTypes, startDate, endDate)) {
				
				//sets the change in the booking
				this.bookingHandler.editBooking(bookingRef, startDate, endDate,
						nrOfGuests, roomTypes, extras, services);
				return 0;
			}
			return 1;
		}
		return -1;
		
	}

	/**
	 * {@inheritDoc}
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
			return 1;
		}
		return -1;
	}

	/**
	 * {@inheritDoc}
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
	 * {@inheritDoc}
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
		if(!startDate.equals(null) && !endDate.equals(null) && nrOfGuests > 0 && !roomTypes.equals(null)){
			if (this.maintenanceComponent.canBook((EList<String>) roomTypes, startDate, endDate)) {
				if(!services.equals(null)){
					List <String> newServiceNotes = new ArrayList <String>();
					for(String service: services)
						if(this.serviceNoteHandler.exists(service)){
							newServiceNotes.add(service);
						}
					services = newServiceNotes;
				}
				return addBooking(nrOfGuests, startDate, endDate, roomTypes, extras, services);
			}
			return "";
		}
		return "Startdate, enddate, number of guests and roomtypes cannot be empty";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
				return getBookingHandler();
			case BookingmodelPackage.BOOKING_PROVIDES__SERVICE_NOTE_HANDLER:
				return getServiceNoteHandler();
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
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST___PAY_EXTRA__STRING_STRING_INT_INT_STRING_STRING_ELIST_INT: return BookingmodelPackage.BOOKING_PROVIDES___PAY_EXTRA__STRING_STRING_INT_INT_STRING_STRING_ELIST_INT;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST___PAY_ROOM__STRING_STRING_INT_INT_STRING_STRING_INT: return BookingmodelPackage.BOOKING_PROVIDES___PAY_ROOM__STRING_STRING_INT_INT_STRING_STRING_INT;
				default: return -1;
			}
		}
		if (baseClass == IBookingProvidesForHost.class) {
			switch (baseOperationID) {
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
			case BookingmodelPackage.BOOKING_PROVIDES___PAY_BOOKING__STRING:
				return payBooking((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_PRICE__STRING:
				return getPrice((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___REMOVE_BOOKING__STRING:
				return removeBooking((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___EDIT_BOOKING__STRING_STRING_STRING_INT_ELIST_ELIST_ELIST:
				return editBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (EList<String>)arguments.get(4), (EList<String>)arguments.get(5), (EList<String>)arguments.get(6));
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
			case BookingmodelPackage.BOOKING_PROVIDES___PAY_EXTRA__STRING_STRING_INT_INT_STRING_STRING_ELIST_INT:
				return payExtra((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (EList<String>)arguments.get(6), (Integer)arguments.get(7));
			case BookingmodelPackage.BOOKING_PROVIDES___PAY_ROOM__STRING_STRING_INT_INT_STRING_STRING_INT:
				return payRoom((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Integer)arguments.get(6));
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
