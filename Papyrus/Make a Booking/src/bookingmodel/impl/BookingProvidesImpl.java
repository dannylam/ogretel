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
	public BookingProvidesImpl() {
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
	 * Converts a String into a List
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
	/*
	 * THIS IS WRONG. IT SHOULD TAKE IN A BOOKINGREFERENCE AND ROOMSTYPE. NATTI
	 */
	public int checkIn(int roomID, String guestEmail) {
		int result = 0;
		Booking booking = this.getBookingHandler().getBooking(roomID);
			if(this.getBookingHandler().exists(booking.getBookingRef())){
			//get the rooms from maintenance
			//add the room 
			booking.setResponsibleGuest(roomID, guestEmail);
		} else {
			result = -1;
		}
		return result;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int checkOut(int roomID, String guestEmail) {
		int result = 0;
		Booking booking = this.getBookingHandler().getBooking(roomID);
		if(this.getBookingHandler().exists(booking.getBookingRef())){
			booking.removeResponsibleGuest(roomID, guestEmail);
			//Set the roomID as available in maintenance
		} else {
			result = -1;
		}
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int pay(String ccNumber, String ccv, int expMonth, int expYear, String firstName, String lastName, List<String> extra) {
		return this.pay(ccNumber, ccv, expMonth, expYear, firstName, lastName, this.maintenanceComponent.getPriceExtra((EList<String>) extra));
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * Makes a payment
	 * @return
	 * 		if 0 all went well.
	 * 		if 1 an error occoured
	 * 		if 2 invalid creditcard
	 * 		if 3 not enough money on card or invalid card.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private int pay(String ccNumber, String ccv, int expMonth,
						int expYear, String firstName, String lastName, int sum) {
		try {
			se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires banking = se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
				.instance();
			if (!banking.isCreditCardValid(ccNumber, ccv,  expMonth, 
						expYear, firstName, lastName)) {
				return 2;
			}
			if (!banking.makePayment(ccNumber, ccv,  expMonth, 
					expYear, firstName, lastName, sum)) {
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
	 *  Makes a payment
	 * @return
	 * 		if 0 all went well.
	 * 		if 1 an error occoured
	 * 		if 2 invalid creditcard
	 * 		if 3 not enough money on card or invalid card.
	 * 		if 4 invalid amount
	 * @generated NOT
	 */
	public int pay(String bookingRef) {
		int price = getPrice(bookingRef);
		if(price != -1) {
			PaymentDetails bookingdetails = getBookingHandler().getBooking(bookingRef).getCustomer().getPaymentDetails().get(0);
			return pay(bookingdetails.getCcNr(), bookingdetails.getCcV(),bookingdetails.getExpMonth(),
							bookingdetails.getExpYear(), bookingdetails.getFirstName(), bookingdetails.getLastName(),
							price);
		} else {
			return 4;
		}
	}

	/**
	 * @inhertDoc
	 * @generated NOT
	 */
	public int getPrice(String bookingRef) {
		if(this.bookingHandler.exists(bookingRef)){
			int extraPrice = this.maintenanceComponent.getPriceExtra(this.bookingHandler.getBooking(bookingRef).getExtras());
			int roomTypesPrice = this.maintenanceComponent.getPriceRoom(this.bookingHandler.getBooking(bookingRef).getRoomTypes());
		
			return extraPrice + roomTypesPrice;
		} else {
			return -1;
		}
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
		
		if(this.getBookingHandler().exists(bookingRef)){
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
		    } else {
		    	result = -1;
		    }
		} else {
			result = -1;
		}	
		return result;
	}


	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int setPaymentDetails(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, String customerEmail, String bookingRef) {
		int result = 0;
		if(this.getBookingHandler().exists(bookingRef)){
			PaymentDetails paymentDetails = new PaymentDetailsImpl();
			paymentDetails.setCcNr(ccNumber);
			paymentDetails.setCcV(ccv);
			paymentDetails.setExpMonth(expiryMonth);
			paymentDetails.setExpYear(expiryYear);
			paymentDetails.setFirstName(firstName);
			paymentDetails.setLastName(lastName);

			Customer customer = this.getBookingHandler().getBooking(bookingRef).getCustomer();
			if(customer.getEmail().equals(customerEmail)){
				customer.getPaymentDetails().add(paymentDetails);
			} else {
				result = -1;
			}
		} else {
			result = -1;
		}
		return result;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int setPersonalDetails(String firstName, String lastName, int age, String email, String bookingRef) {
		int result = 0;
		if(this.getBookingHandler().exists(bookingRef)){
			Customer customer = new CustomerImpl();
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
			customer.setEmail(email);
			customer.setAge(age);
			this.getBookingHandler().getBooking(bookingRef).setCustomer(customer);
		} else {
			result = -1;
		}
		return result;
	}


	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public String book(String startDate, String endDate, int nrOfGuests, String roomTypes, String extras) {
		String bookingRef = "";
		// TODO: implement this method

		if(this.maintenanceComponent.canBook( (EList<String>) stringToList(roomTypes), startDate, endDate)){
			Booking booking = new BookingImpl(nrOfGuests, startDate, endDate, stringToList(roomTypes), stringToList(extras));	
			//tell maintenance to set those roomtypes and extras as busy
			this.bookingHandler.addBooking(booking);
			bookingRef = booking.getBookingRef();
		}

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
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST___CHECK_IN__INT_STRING: return BookingmodelPackage.BOOKING_PROVIDES___CHECK_IN__INT_STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST___CHECK_OUT__INT_STRING: return BookingmodelPackage.BOOKING_PROVIDES___CHECK_OUT__INT_STRING;
				case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST___PAY__STRING_STRING_INT_INT_STRING_STRING_ELIST: return BookingmodelPackage.BOOKING_PROVIDES___PAY__STRING_STRING_INT_INT_STRING_STRING_ELIST;
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
			case BookingmodelPackage.BOOKING_PROVIDES___CHECK_IN__INT_STRING:
				return checkIn((Integer)arguments.get(0), (String)arguments.get(1));
			case BookingmodelPackage.BOOKING_PROVIDES___CHECK_OUT__INT_STRING:
				return checkOut((Integer)arguments.get(0), (String)arguments.get(1));
			case BookingmodelPackage.BOOKING_PROVIDES___PAY__STRING_STRING_INT_INT_STRING_STRING_ELIST:
				return pay((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (List<String>)arguments.get(6));
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
