/**
 */
package bookingmodel.impl;
import bookingmodel.BookingHandler;
import bookingmodel.BookingProvides;
import bookingmodel.BookingmodelPackage;
import bookingmodel.Customer;
import bookingmodel.IBookingProvidesForGuest;
import bookingmodel.IBookingProvidesForHost;
import bookingmodel.PaymentDetails;
import bookingmodel.PaymentMethod;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import maintenancemodel.MaintenanceProvidesForBooking;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Provides</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bookingmodel.impl.BookingProvidesImpl#getBookingHandler <em>Booking Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingProvidesImpl extends MinimalEObjectImpl.Container implements BookingProvides {
	/**
	 * The cached value of the '{@link #getBookingHandler() <em>Booking Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingHandler()
	 * @generated
	 * @ordered
	 */
	protected BookingHandler bookingHandler;

	/**
	 * TODO: javadoc
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected MaintenanceProvidesForBooking maintenanceComponent;

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingProvidesImpl() {
		super();
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingmodelPackage.Literals.BOOKING_PROVIDES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler basicGetBookingHandler() {
		return bookingHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingHandler(BookingHandler newBookingHandler) {
		BookingHandler oldBookingHandler = bookingHandler;
		bookingHandler = newBookingHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER, oldBookingHandler, bookingHandler));
	}

	/**
	 * TODO: javadoc
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public int addServiceNote(String serviceNote) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int editServiceNote(String oldServiceNote, String newServiceNote) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int removeServiceNote(String serviceNote) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getServiceNotes(String bookingRef) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int checkIn(String bookingRef, String guestEmail) {
		int result = 0;
		if(this.bookingHandler.exists(bookingRef) && !this.bookingHandler.getBooking(bookingRef).checkedInAllGuest()){
			
			/*
			 * Give maintenance the roomstypes for this booking and get roomIDs in return
			 * Maintenance will then set these roomIDs as checkedIn
			 * Then set the guest as responsible
			 */
			this.bookingHandler.getBooking(bookingRef).setResponsibleGuestToAllRooms(guestEmail);
			//maintenanceComponent.setBookingAsActive(bookingRef); denna metoden ska väl bort i maintenance?
			
		}
		//TODO: implement this method, we are waiting for maintenance 
		// TODO: check other cases
		return result;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int checkOut(String bookingRef, String guestEmail) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int pay(String ccNumber, String ccv, int expMonth, int expYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int pay(String bookingRef) {
		int result = 0;
		if(this.getBookingHandler().exists(bookingRef)){
			int price = this.getPrice(bookingRef);
			PaymentDetails paymentdetails = this.bookingHandler.getBooking(bookingRef).getCustomer().getPaymentDetails().get(0);
			//invoke pay() in bankingcomponent med price & get delar från paymentdetails
		}
		// TODO: check other cases
		//TODO: we are waiting for the banking code to be added
		return result;
	}

	/**
	 * @inhertDoc
	 * @generated NOT
	 */
	public int getPrice(String bookingRef) {
		int price = 0;
		String extras = this.bookingHandler.getBooking(bookingRef).getExtraToIsPayedMap().keySet().toString();
		//String roomtypes = this.bookingHandler.getBooking(bookingRef).getRoomTypeToRoomIDMap().values().toString();
		
		//maintenanceComponent.getPrice(extras);
		//maintenanceComponent.getPrice(roomtypes);
		/*
		 * Ska från en bookingRef få reda på vilka extras och hur många av varjerumstyp vi har
		 * och därefter kan vi fråga maintenance om vad priset för varje är och sedan summera och returnera
		 */
		//TODO: implement this method, we are waiting for maintenance 
		// TODO: check other cases
		return price;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int removeBooking(String bookingRef) {
		return this.getBookingHandler().removeBooking(bookingRef);
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int editBooking(String bookingRef, String startDate, String endDate, int nrOfGuests, String roomTypes, String extras) {
		int result = 0;
		/*
		 * Check with the changes if they are possible, ask maintenacne, if so, then the changes are registered 
		 * in the booking
		 * */
		
		this.bookingHandler.editBooking(bookingRef, startDate, endDate, nrOfGuests, this.stringToList(roomTypes), this.stringToList(extras));
		
		//TODO: implement this method, we are waiting for maintenance 
		// TODO: check other cases
		return result;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	**/
	public int setPaymentMethod(String method, String bookingRef) {
		int result = 0;
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
	        		//do nothing
	        		break;
	        }

	     if(!paymentMethod.equals(null)){
	    	 this.getBookingHandler().getBooking(bookingRef).setPaymentMethod(paymentMethod);
	     }
		return result;
		// TODO: check other cases
	}


	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int setPaymentDetails(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, String customerEmail, String bookingRef) {
		int result = 0;
		/*
		 * check if there exists a booking with that booking reference
		 * create a paymentdetails with all those imparams
		 * set this paymentdetails to the customer of that booking
		 */
		// TODO: implement this method
		return result;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int setPersonalDetails(String firstName, String lastName, int age, String email, String bookingRef) {
		int result = 0;
		Customer customer = new CustomerImpl();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmail(email);
		customer.setAge(age);
		this.getBookingHandler().getBooking(bookingRef).setCustomer(customer);
		// TODO: check other cases
		return result;
	}


	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public String book(String startDate, String endDate, int nrOfGuests, String roomTypes, String extras) {
		String bookingRef = "";
		// TODO: implement this method

		/*if(maintenanceComponent.canBook(roomTypes, startDate, endDate){
			Booking booking = new BookingImpl(nrOfGuests, startDate, endDate, stringToList(roomTypes), stringToList(extras));	
			//tell maintenance to set those roomtypes and extras as busy
			this.bookingHandler.addBooking(booking);
			bookingRef = booking.getBookingRef();
		}*/
		return bookingRef;
		// TODO: check other cases
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
				if (resolve) return getBookingHandler();
				return basicGetBookingHandler();
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
			case BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
				setBookingHandler((BookingHandler)newValue);
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
			case BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
				setBookingHandler((BookingHandler)null);
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
			case BookingmodelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
				return bookingHandler != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IBookingProvidesForGuest.class) {
			switch (baseOperationID) {
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST___CHECK_IN__STRING_STRING: return BookingmodelPackage.BOOKING_PROVIDES___CHECK_IN__STRING_STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST___CHECK_OUT__STRING_STRING: return BookingmodelPackage.BOOKING_PROVIDES___CHECK_OUT__STRING_STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST___PAY__STRING_STRING_INT_INT_STRING_STRING: return BookingmodelPackage.BOOKING_PROVIDES___PAY__STRING_STRING_INT_INT_STRING_STRING;
				default: return -1;
			}
		}
		if (baseClass == IBookingProvidesForHost.class) {
			switch (baseOperationID) {
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___ENABLE_SELF_MANAGEMENT: return BookingmodelPackage.BOOKING_PROVIDES___ENABLE_SELF_MANAGEMENT;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___ADD_SERVICE_NOTE__STRING: return BookingmodelPackage.BOOKING_PROVIDES___ADD_SERVICE_NOTE__STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___EDIT_SERVICE_NOTE__STRING_STRING: return BookingmodelPackage.BOOKING_PROVIDES___EDIT_SERVICE_NOTE__STRING_STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___REMOVE_SERVICE_NOTE__STRING: return BookingmodelPackage.BOOKING_PROVIDES___REMOVE_SERVICE_NOTE__STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST___GET_SERVICE_NOTES__STRING: return BookingmodelPackage.BOOKING_PROVIDES___GET_SERVICE_NOTES__STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BookingmodelPackage.BOOKING_PROVIDES___STRING_TO_LIST__STRING:
				return stringToList((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___ENABLE_SELF_MANAGEMENT:
				return enableSelfManagement();
			case BookingmodelPackage.BOOKING_PROVIDES___ADD_SERVICE_NOTE__STRING:
				return addServiceNote((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___EDIT_SERVICE_NOTE__STRING_STRING:
				return editServiceNote((String)arguments.get(0), (String)arguments.get(1));
			case BookingmodelPackage.BOOKING_PROVIDES___REMOVE_SERVICE_NOTE__STRING:
				return removeServiceNote((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___GET_SERVICE_NOTES__STRING:
				return getServiceNotes((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___CHECK_IN__STRING_STRING:
				return checkIn((String)arguments.get(0), (String)arguments.get(1));
			case BookingmodelPackage.BOOKING_PROVIDES___CHECK_OUT__STRING_STRING:
				return checkOut((String)arguments.get(0), (String)arguments.get(1));
			case BookingmodelPackage.BOOKING_PROVIDES___PAY__STRING_STRING_INT_INT_STRING_STRING:
				return pay((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
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
			case BookingmodelPackage.BOOKING_PROVIDES___BOOK__STRING_STRING_INT_STRING_STRING:
				return book((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingProvidesImpl
