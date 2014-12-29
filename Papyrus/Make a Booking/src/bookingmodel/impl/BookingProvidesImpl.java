/**
 */
package bookingmodel.impl;

import bookingmodel.Booking;
import bookingmodel.BookingHandler;
import bookingmodel.BookingProvides;
import bookingmodel.BookingmodelPackage;
import bookingmodel.IBookingProvidesForGuest;
import bookingmodel.IBookingProvidesForHost;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int enableSelfManagement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * Checks-in the guests of the booking by setting the booking as active
	 * and the guest provided the email as responsible if the booking is not already
	 * checked in and is valid.
	 * Returns an integer indicating the result of the invoke, where 0 stands for success.
	 * 
	 * @generated NOT
	 */
	public int checkIn(String bookingRef, String guestEmail) {
		int result = 0;
		if(this.bookingHandler.exists(bookingRef) && !this.bookingHandler.getBooking(bookingRef).checkedInAllGuest()){
			
			//get vacant rooms from maintenance which are to be added in the map roomtypeToRoomID in booking
			maintenanceComponent.setBookingAsActive(bookingRef);
			this.bookingHandler.getBooking(bookingRef).setResponsibleGuestToAllRooms(guestEmail);
			
			
		}
		// TODO: check if correct
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * TODO: javadoc
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking getBooking(String bookingRef) {
		if(bookingRef!= null){
			return this.bookingHandler.getBooking(bookingRef);
		} else {
			//TODO:change this later on
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int pay(String bookingRef) {
		int result = 0;
		/*
		 *check if this booking exists and is not null
		 *get the price
		 *take the paymentdetails from the customer of this booking
		 *invoke pay() in banking 
		 */
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getPrice(String bookingRef) {
		// TODO: implement this method
		/*
		 * Ska från en bookingRef få reda på vilka extras och hur många av varjerumstyp vi har
		 * och därefter kan vi fråga maintenance om vad priset för varje är och sedan summera och returnera
		 */
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: javadoc
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int removeBooking(String bookingRef) {
		int result = 0;
		//checka att bookingref är av bra format etc sen
		//this.getBookingHandler().removeBooking(bookingRef);
		// TODO: implement this method
		return result;
	}

	/**
	 * TODO: javadoc
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int editBooking(String bookingRef, String startDate, String endDate, int nrOfGuests, String roomTypes, String extras) {
		int result = 0;
		/*
		 * Check with the changes if they are possible, ask maintenacne, if so, then the changes are registered 
		 * in the booking
		 * */
		
		//TODO: implement this method
		return result;
	}

	/**
	 * TODO: javadoc
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int setPaymentMethod(String method) {
		int result = 0;
		/*
		 * Check if the method matches with one of the enums in paymentmethod
		 * set the paymentmethod in booking as this method
		 * 
		 */
		// TODO: implement this method
		return result;
	}


	/**
	 * TODO: javadoc
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int setPaymentDetails(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, String customerEmail) {
		int result = 0;
		/*
		 * check if there exists a customer with that email
		 * create a paymentdetails with all those imparams
		 * set this paymentdetails to that customer
		 */
		// TODO: implement this method
		return result;
	}

	/**
	 *TODO: javadoc
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int setPersonalDetails(String firstName, String lastName, int age, String email, String bookingRef) {
		int result = 0;
		/*
		 * create a customer with these inparams
		 * assign this customer to the booking of that bookingreference 
		 */
		
		// TODO: implement this method
		return result;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String book(String startDate, String endDate, int nrOfGuests, String roomTypes, String extras) {
		String bookingRef = "";
		// TODO: implement this method

		/*
		 * 
		 */
		
		/*if(maintenanceComponent.canBook(roomTypes, startDate, endDate){
			Booking booking = new BookingImpl(nrOfGuests, startDate, endDate, stringToList(roomTypes), stringToList(extras));	
			//
			
			this.bookingHandler.addBooking(booking);
		}*/
		return bookingRef;
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
			case BookingmodelPackage.BOOKING_PROVIDES___SET_PAYMENT_METHOD__STRING:
				return setPaymentMethod((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_PROVIDES___SET_PAYMENT_DETAILS__STRING_STRING_INT_INT_STRING_STRING_STRING:
				return setPaymentDetails((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6));
			case BookingmodelPackage.BOOKING_PROVIDES___SET_PERSONAL_DETAILS__STRING_STRING_INT_STRING_STRING:
				return setPersonalDetails((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case BookingmodelPackage.BOOKING_PROVIDES___BOOK__STRING_STRING_INT_STRING_STRING:
				return book((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingProvidesImpl
