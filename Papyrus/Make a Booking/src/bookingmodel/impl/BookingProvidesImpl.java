/**
 */
package bookingmodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import javax.xml.soap.SOAPException;

import maintenancemodel.MaintenanceProvidesForBooking;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
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
import bookingmodel.CustomerInfo;
import bookingmodel.IBookingProvidesForGuest;
import bookingmodel.IBookingProvidesForHost;
import bookingmodel.PaymentDetails;
import bookingmodel.PaymentMethod;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Booking Provides</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bookingmodel.impl.BookingProvidesImpl#getBookingHandler <em>Booking Handler</em>}</li>
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
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public boolean isPayed(String bookingRef) {
		if (this.bookingHandler.isActive(bookingRef)) {
			return this.bookingHandler.getBooking(bookingRef).isPayed();
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String getStartDate(String bookingRef) {
		if (this.bookingHandler.isActive(bookingRef)) {
			return this.getBookingHandler().getBooking(bookingRef).getStartDate();
		}
		return "Booking reference does not exist";
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String getEndDate(String bookingRef) {
		if (this.bookingHandler.isActive(bookingRef)) {	
			return this.getBookingHandler().getBooking(bookingRef).getEndDate();
		}	
		return "Booking reference does not exist";
	}	

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int getNrOfGuests(String bookingRef) {
		if (this.bookingHandler.exists(bookingRef)) {
			return this.getBookingHandler().getBooking(bookingRef).getNrOfGuests();
		}	
		return -1;
	}
	
	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public List<String> getExtras(String bookingRef) {
		if (this.bookingHandler.exists(bookingRef)) {
			return this.getBookingHandler().getBooking(bookingRef).getExtras();
		}	
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public List<Integer> getRooms(String bookingRef) {
		if (this.bookingHandler.exists(bookingRef)) {
			return this.getBookingHandler().getBooking(bookingRef).getRoomIDs();
		}	
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String getPaymentMethod(String bookingRef) {
		if (this.bookingHandler.exists(bookingRef)) {	
			return this.getBookingHandler().getBooking(bookingRef).getPaymentMethod().toString();
		}	
		return "Booking reference does not exist";
	}	

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public List<String> getRoomTypes(String bookingRef) {
		if (this.bookingHandler.exists(bookingRef)) {
			return this.getBookingHandler().getBooking(bookingRef).getRoomTypes();
		}	
		return null;
	}
	
	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public List<String> getServiceNotes(String bookingRef) {
		if (this.bookingHandler.exists(bookingRef)) {	
			return this.getBookingHandler().getBooking(bookingRef).getServiceNotes();
		}	
		return null;
	}
	
	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public List <String> getBookingRef(String customerEmail) {
		return this.getBookingHandler().getCustomerEmailToBookingRefEntry().get(customerEmail);
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String getCustomerName(String bookingRef) {
		if(this.getBookingHandler().exists(bookingRef)){
			return this.bookingHandler.getBooking(bookingRef).getCustomer().getFirstName();
		} else {
			return "Booking reference does not exist";
		}
	}


	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String getCustomerLastName(String bookingRef) {
		if(this.getBookingHandler().exists(bookingRef)){
			return this.bookingHandler.getBooking(bookingRef).getCustomer().getFirstName();
		} else {
			return "Booking reference does not exist";
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int getCustomerAge(String bookingRef) {
		if(this.getBookingHandler().exists(bookingRef)){
			return this.bookingHandler.getBooking(bookingRef).getCustomer().getAge();
		} else {
			return -1;
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String getCustomerEmail(String bookingRef) {
		if(this.getBookingHandler().exists(bookingRef)){
			return this.bookingHandler.getBooking(bookingRef).getCustomer().getEmail();
		} else {
			return "Booking reference does not exist";
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String getCcNr(String bookingRef) {
		if(this.getBookingHandler().exists(bookingRef)){
			return this.bookingHandler.getBooking(bookingRef).getCustomer().getPaymentDetails().getCcNr();
		} else {
			return "Booking reference does not exist";
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String getCcV(String bookingRef) {
		if(this.getBookingHandler().exists(bookingRef)){
			return this.bookingHandler.getBooking(bookingRef).getCustomer().getPaymentDetails().getCcV();
		} else {
			return "Booking reference does not exist";
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int getExpMonth(String bookingRef) {
		if(this.getBookingHandler().exists(bookingRef)){
			return this.bookingHandler.getBooking(bookingRef).getCustomer().getPaymentDetails().getExpMonth();
		} else {
			return -1;
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int getExpYear(String bookingRef) {
		if(this.getBookingHandler().exists(bookingRef)){
			return this.bookingHandler.getBooking(bookingRef).getCustomer().getPaymentDetails().getExpMonth();
		} else {
			return -1;
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String getCardFirstName(String bookingRef) {
		if(this.getBookingHandler().exists(bookingRef)){
			return this.bookingHandler.getBooking(bookingRef).getCustomer().getPaymentDetails().getFirstName();
		} else {
			return "Booking reference does not exist";
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String geCardtLastName(String bookingRef) {
		if(this.getBookingHandler().exists(bookingRef)){
			return this.bookingHandler.getBooking(bookingRef).getCustomer().getPaymentDetails().getLastName();
		} else {
			return "Booking reference does not exist";
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int checkIn(String bookingRef, String roomsType, String guestEmail) {
		if (this.bookingHandler.isActive(bookingRef)) {
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
	public int checkOut(int roomID) {
		Booking booking = this.getBookingHandler().getBooking(roomID);
		if (this.getBookingHandler().exists(booking.getBookingRef())) {
			if(booking.checkedInRoom(roomID) && !booking.checkedOutRoom(roomID)){
				String guestEmail = this.getResponsibleGuest(roomID);
				booking.removeResponsibleGuest(roomID, guestEmail);
				
				//check if the booking has been is payed or not, 
				//if not, return an int indicating that the room needs to be payed
				if(!this.isPayed(booking.getBookingRef())){
					booking.setResponsibleGuest(roomID, guestEmail);
					return this.getPrice(booking.getBookingRef());
				}
	
				//checks if the the guest is the last person to check-out and therefore needs to pay for all the remaining extras
				if(booking.checkedOutAllRooms() && !booking.allExtrasPayed()){
					booking.setResponsibleGuest(roomID, guestEmail);
					return this.maintenanceComponent.getPriceExtra(booking.getExtras()) + this.getPrice(booking.getBookingRef());
				}
				
				//removes the bookingreference from the room in the map of rooms and which bookingreference they belong to
				this.bookingHandler.getRoomIDToBookingRefMap().put(roomID, null);
				if(this.maintenanceComponent.setInactive(roomID) == -1){
					return -3;
				}
	
			} else {
				return -2;
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
			if(!booking.isPayed() && booking.getPaymentMethod().toString().equals("bankcard")){
				int price = getPrice(bookingRef);
				if (price != -1) {
					PaymentDetails bookingdetails = booking.getCustomer().getPaymentDetails();
		
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
		//TODO
		if(this.bookingHandler.exists(this.bookingHandler.getBooking(roomID).getBookingRef())){
			if(!extras.equals(null)){
				EList<String> extrasToBePayed = null;
				for(String extra: extras){
					if(!this.getBookingHandler().getBooking(roomID).getExtraToIsPayedMap().get(extra).booleanValue()){
						extrasToBePayed.add(extra);
					}
				}
				if(!extrasToBePayed.equals(null)){	
					//mark these extras in the booking as payed
					this.bookingHandler.getBooking(roomID).setExtrasAsPayed(extrasToBePayed);
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
			if(!booking.getRoomIDToGuestMap().get(roomID).getValue().equals("out")){
				EList <String> roomType = (EList<String>) this.stringToList(booking.getRoomIDToRoomTypeMap().get(roomID).getValue());
					return paySum(ccNumber, ccv, expMonth, expYear, firstName, lastName,
							maintenanceComponent.getPriceRoom(roomType));
			}
			return 4;
		}	
		return -1;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public boolean isBookingPayed(String bookingRef) {
		if(this.getBookingHandler().exists(bookingRef)){
			return this.bookingHandler.getBooking(bookingRef).isPayed();
		} else {
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public boolean isExtraPayed(int roomID) {
		if(this.getBookingHandler().exists(this.bookingHandler.getBooking(roomID).getBookingRef())){
			return this.bookingHandler.getBooking(roomID).isPayed();
		} else {
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public boolean isRoomPayed(int roomID) {
		if(this.getBookingHandler().exists(this.bookingHandler.getBooking(roomID).getBookingRef())){
			return this.bookingHandler.getBooking(roomID).isPayed() || this.bookingHandler.getBooking(roomID).checkedOutRoom(roomID);
		} else {
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public boolean existBooking(String bookingRef) {
		return this.bookingHandler.exists(bookingRef);
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public List<String> getExistingBookings() {
		String[] bookings =this.bookingHandler.getBookingsMap().entrySet().toArray(new String[0]);
		return new BasicEList<String>(Arrays.asList(bookings));
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public boolean isCheckedOut(int roomID) {
		if(this.getBookingHandler().exists(this.bookingHandler.getBooking(roomID).getBookingRef())){
			return this.bookingHandler.getBooking(roomID).checkedOutRoom(roomID);
		} else {
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public boolean isCheckedIn(int roomID) {
		if(this.getBookingHandler().exists(this.bookingHandler.getBooking(roomID).getBookingRef())){
			return this.bookingHandler.getBooking(roomID).checkedInRoom(roomID);
		} else {
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public String getResponsibleGuest(int roomID) {
		if(this.getBookingHandler().exists(this.bookingHandler.getBooking(roomID).getBookingRef())){
			return this.bookingHandler.getBooking(roomID).getRoomIDToGuestMap().get(roomID).getValue();
		} else {
			return "Booking reference does not exist";
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public List<Integer> getRoomID(String guestEmail) {
		return this.bookingHandler.getGuestEmailToRoomIDEntry().get(guestEmail);
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int addServiceNotes(int roomID, List<String> serviceNote) {
		if(this.getBookingHandler().exists(this.getBookingHandler().getBooking(roomID).getBookingRef())){
			return this.bookingHandler.getBooking(roomID).setServices(serviceNote);
		} else {
			return -1;
		}
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public int RemoveServiceNotes(int roomID, List<String> serviceNotes) {
		if(this.getBookingHandler().exists(this.getBookingHandler().getBooking(roomID).getBookingRef())){
			return this.bookingHandler.getBooking(roomID).getServiceNotes().removeServices(serviceNotes); //TODO add method
		}
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
		if (this.bookingHandler.isActive(bookingRef)) {
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
		if(this.bookingHandler.isActive(bookingRef)){
			Booking booking = this.bookingHandler.getBooking(bookingRef);
			String oldStartDate = booking.getStartDate();
			String oldEndDate = booking.getEndDate();
			EList <String> oldRoomTypes = booking.getRoomTypes();
			int oldPrice = this.getPrice(booking.getBookingRef());
			
			//momentairly removes the current booking from maintenance
			this.maintenanceComponent.removeBooking(oldRoomTypes, oldStartDate, oldEndDate);

			//checks with maintenance if the change is possible
			if (this.maintenanceComponent.canBook(
				(EList<String>) roomTypes, startDate, endDate, nrOfGuests)) {

				this.maintenanceComponent.makeBooking((EList<String>)roomTypes, startDate, endDate, nrOfGuests);
				
				//sets the change in the booking
				this.bookingHandler.editBooking(bookingRef, startDate, endDate,
						nrOfGuests, roomTypes, extras, services);
				
				//if this booking is already payed and the price 
				if(booking.isPayed() && this.getPrice(bookingRef) > oldPrice){
					return this.getPrice(bookingRef) - oldPrice;
				}
				return 0;
			} else {
				this.maintenanceComponent.makeBooking((EList<String>)oldRoomTypes, oldStartDate, oldEndDate, nrOfGuests);
				return -2;
			}
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
			switch (metShod) {
			case "bankcard":
				paymentMethod = PaymentMethod.BANKCARD;
				break;

			case "cash":
				paymentMethod = PaymentMethod.CASH;
				break;

			case "voucher":
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
				customer.setPaymentDetails(paymentDetails);
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
	 * TODO 
	 */
	public String book(String startDate, String endDate, int nrOfGuests, List<String> roomTypes, List<String> extras, List<String> services) {
		if(!startDate.equals(null) && !endDate.equals(null) && nrOfGuests > 0 && !roomTypes.equals(null)){
			if (this.maintenanceComponent.canBook((EList<String>) roomTypes, startDate, endDate, nrOfGuests)) {
				return this.bookingHandler.addBooking(nrOfGuests, startDate, endDate, roomTypes, extras, services);
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
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == CustomerInfo.class) {
			switch (baseOperationID) {
				case BookingmodelPackage.CUSTOMER_INFO___GET_CUSTOMER_NAME__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_CUSTOMER_NAME__STRING;
				case BookingmodelPackage.CUSTOMER_INFO___GET_CUSTOMER_LAST_NAME__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_CUSTOMER_LAST_NAME__STRING;
				case BookingmodelPackage.CUSTOMER_INFO___GET_CUSTOMER_AGE__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_CUSTOMER_AGE__STRING;
				case BookingmodelPackage.CUSTOMER_INFO___GET_CUSTOMER_EMAIL__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_CUSTOMER_EMAIL__STRING;
				case BookingmodelPackage.CUSTOMER_INFO___GET_CC_NR__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_CC_NR__STRING;
				case BookingmodelPackage.CUSTOMER_INFO___GET_CC_V__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_CC_V__STRING;
				case BookingmodelPackage.CUSTOMER_INFO___GET_EXP_MONTH__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_EXP_MONTH__STRING;
				case BookingmodelPackage.CUSTOMER_INFO___GET_EXP_YEAR__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_EXP_YEAR__STRING;
				case BookingmodelPackage.CUSTOMER_INFO___GET_CARD_FIRST_NAME__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_CARD_FIRST_NAME__STRING;
				case BookingmodelPackage.CUSTOMER_INFO___GE_CARDT_LAST_NAME__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GE_CARDT_LAST_NAME__STRING;
				default: return -1;
			}
		}
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
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___IS_BOOKING_PAYED__STRING: return BookingmodelPackage.BOOKING_PROVIDES___IS_BOOKING_PAYED__STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___IS_EXTRA_PAYED__INT: return BookingmodelPackage.BOOKING_PROVIDES___IS_EXTRA_PAYED__INT;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___IS_ROOM_PAYED__INT: return BookingmodelPackage.BOOKING_PROVIDES___IS_ROOM_PAYED__INT;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___EXIST_BOOKING__STRING: return BookingmodelPackage.BOOKING_PROVIDES___EXIST_BOOKING__STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___GET_EXISTING_BOOKINGS: return BookingmodelPackage.BOOKING_PROVIDES___GET_EXISTING_BOOKINGS;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___GET_ACTIVE_BOOKINGS: return BookingmodelPackage.BOOKING_PROVIDES___GET_ACTIVE_BOOKINGS;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___IS_CHECKED_OUT__INT: return BookingmodelPackage.BOOKING_PROVIDES___IS_CHECKED_OUT__INT;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___IS_CHECKED_IN__INT: return BookingmodelPackage.BOOKING_PROVIDES___IS_CHECKED_IN__INT;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___GET_RESPONSIBLE_GUEST__INT: return BookingmodelPackage.BOOKING_PROVIDES___GET_RESPONSIBLE_GUEST__INT;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___GET_ROOM_ID__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_ROOM_ID__STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___ADD_SERVICE_NOTES__INT_ELIST: return BookingmodelPackage.BOOKING_PROVIDES___ADD_SERVICE_NOTES__INT_ELIST;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___REMOVE_SERVICE_NOTES__INT_ELIST: return BookingmodelPackage.BOOKING_PROVIDES___REMOVE_SERVICE_NOTES__INT_ELIST;
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
			case BookingmodelPackage.BOOKING_PROVIDES___GET_START_DATE__STRING:
				return getStartDate((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_END_DATE__STRING:
				return getEndDate((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_NR_OF_GUESTS__STRING:
				return getNrOfGuests((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_EXTRAS__STRING:
				return getExtras((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_ROOMS__STRING:
				return getRooms((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_PAYMENT_METHOD__STRING:
				return getPaymentMethod((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_ROOM_TYPES__STRING:
				return getRoomTypes((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_SERVICE_NOTES__STRING:
				return getServiceNotes((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_BOOKING_REF__STRING:
				return getBookingRef((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_CUSTOMER_NAME__STRING:
				return getCustomerName((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_CUSTOMER_LAST_NAME__STRING:
				return getCustomerLastName((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_CUSTOMER_AGE__STRING:
				return getCustomerAge((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_CUSTOMER_EMAIL__STRING:
				return getCustomerEmail((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_CC_NR__STRING:
				return getCcNr((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_CC_V__STRING:
				return getCcV((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_EXP_MONTH__STRING:
				return getExpMonth((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_EXP_YEAR__STRING:
				return getExpYear((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_CARD_FIRST_NAME__STRING:
				return getCardFirstName((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GE_CARDT_LAST_NAME__STRING:
				return geCardtLastName((String)arguments.get(0));
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
			case BookingmodelPackage.BOOKING_PROVIDES___IS_BOOKING_PAYED__STRING:
				return isBookingPayed((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___IS_EXTRA_PAYED__INT:
				return isExtraPayed((Integer)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___IS_ROOM_PAYED__INT:
				return isRoomPayed((Integer)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___EXIST_BOOKING__STRING:
				return existBooking((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_EXISTING_BOOKINGS:
				return getExistingBookings();
			case BookingmodelPackage.BOOKING_PROVIDES___GET_ACTIVE_BOOKINGS:
				return getActiveBookings();
			case BookingmodelPackage.BOOKING_PROVIDES___IS_CHECKED_OUT__INT:
				return isCheckedOut((Integer)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___IS_CHECKED_IN__INT:
				return isCheckedIn((Integer)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_RESPONSIBLE_GUEST__INT:
				return getResponsibleGuest((Integer)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_ROOM_ID__STRING:
				return getRoomID((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___ADD_SERVICE_NOTES__INT_ELIST:
				return addServiceNotes((Integer)arguments.get(0), (EList<String>)arguments.get(1));
			case BookingmodelPackage.BOOKING_PROVIDES___REMOVE_SERVICE_NOTES__INT_ELIST:
				return RemoveServiceNotes((Integer)arguments.get(0), (EList<String>)arguments.get(1));
			case BookingmodelPackage.BOOKING_PROVIDES___STRING_TO_LIST__STRING:
				return stringToList((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
} // BookingProvidesImpl
