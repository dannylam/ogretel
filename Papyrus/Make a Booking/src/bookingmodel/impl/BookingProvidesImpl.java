/**
 */
package bookingmodel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import bookingmodel.BookingHandler;
import bookingmodel.BookingProvides;
import bookingmodel.ModelPackage;

/**
 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
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
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingHandler()
	 * @generated
	 * @ordered
	 */
	protected BookingHandler bookingHandler;

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingProvidesImpl() {
		super();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOOKING_PROVIDES;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BOOKING_PROVIDES__BOOKING_HANDLER, oldBookingHandler, bookingHandler));
			}
		}
		return bookingHandler;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler basicGetBookingHandler() {
		return bookingHandler;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingHandler(BookingHandler newBookingHandler) {
		BookingHandler oldBookingHandler = bookingHandler;
		bookingHandler = newBookingHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING_PROVIDES__BOOKING_HANDLER, oldBookingHandler, bookingHandler));
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeBooking(String bookingRef) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBooking(String bookingRef) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getPrice(String bookingRef) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void book(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pay(String bookingRef) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editBooking(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras, String bookingRef) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchRoom(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int setPersonalDetails(String firstName, String lastName, int age, String email) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void choosePaymentMethod(String paymentMethod) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDetails(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int checkOut(String bookingRef, String guestEmail) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int checkIn(String bookingRef, String guestEmail) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pay(String ccNr, String ccV, int expMonth, int expYear) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enableSelfManagement(String guestEmail) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addServiceNote(String serviceNote) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editServiceNote(String oldServiceNote, String newServiceNote) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeServiceNote(String serviceNote) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getServiceNotes(String bookingRef) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDetails(String ccNr, String ccV, int expiryMonth, int expiryYear, String firstName, String lastName, int result) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void choosePaymentMethod(Enumerator method) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
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
			case ModelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
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
			case ModelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
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
			case ModelPackage.BOOKING_PROVIDES__BOOKING_HANDLER:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.BOOKING_PROVIDES___REMOVE_BOOKING__STRING:
				removeBooking((String)arguments.get(0));
				return null;
			case ModelPackage.BOOKING_PROVIDES___GET_BOOKING__STRING:
				getBooking((String)arguments.get(0));
				return null;
			case ModelPackage.BOOKING_PROVIDES___GET_PRICE__STRING:
				getPrice((String)arguments.get(0));
				return null;
			case ModelPackage.BOOKING_PROVIDES___BOOK__INT_INT_STRING_INT_STRING_STRING:
				book((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
				return null;
			case ModelPackage.BOOKING_PROVIDES___PAY__STRING:
				pay((String)arguments.get(0));
				return null;
			case ModelPackage.BOOKING_PROVIDES___EDIT_BOOKING__INT_INT_STRING_INT_STRING_STRING_STRING:
				editBooking((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6));
				return null;
			case ModelPackage.BOOKING_PROVIDES___SEARCH_ROOM__INT_INT_STRING_INT_STRING_STRING:
				searchRoom((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
				return null;
			case ModelPackage.BOOKING_PROVIDES___SET_PERSONAL_DETAILS__STRING_STRING_INT_STRING:
				return setPersonalDetails((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
			case ModelPackage.BOOKING_PROVIDES___CHOOSE_PAYMENT_METHOD__STRING:
				choosePaymentMethod((String)arguments.get(0));
				return null;
			case ModelPackage.BOOKING_PROVIDES___SET_PAYMENT_DETAILS__STRING_STRING_INT_INT_STRING_STRING:
				setPaymentDetails((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
				return null;
			case ModelPackage.BOOKING_PROVIDES___CHECK_OUT__STRING_STRING:
				return checkOut((String)arguments.get(0), (String)arguments.get(1));
			case ModelPackage.BOOKING_PROVIDES___CHECK_IN__STRING_STRING:
				return checkIn((String)arguments.get(0), (String)arguments.get(1));
			case ModelPackage.BOOKING_PROVIDES___PAY__STRING_STRING_INT_INT:
				pay((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case ModelPackage.BOOKING_PROVIDES___ENABLE_SELF_MANAGEMENT__STRING:
				enableSelfManagement((String)arguments.get(0));
				return null;
			case ModelPackage.BOOKING_PROVIDES___ADD_SERVICE_NOTE__STRING:
				addServiceNote((String)arguments.get(0));
				return null;
			case ModelPackage.BOOKING_PROVIDES___EDIT_SERVICE_NOTE__STRING_STRING:
				editServiceNote((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ModelPackage.BOOKING_PROVIDES___REMOVE_SERVICE_NOTE__STRING:
				removeServiceNote((String)arguments.get(0));
				return null;
			case ModelPackage.BOOKING_PROVIDES___GET_SERVICE_NOTES__STRING:
				getServiceNotes((String)arguments.get(0));
				return null;
			case ModelPackage.BOOKING_PROVIDES___SET_PAYMENT_DETAILS__STRING_STRING_INT_INT_STRING_STRING_INT:
				setPaymentDetails((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Integer)arguments.get(6));
				return null;
			case ModelPackage.BOOKING_PROVIDES___CHOOSE_PAYMENT_METHOD__ENUMERATOR:
				choosePaymentMethod((Enumerator)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingProvidesImpl
