/**
 */
package bookingmodel.util;

import bookingmodel.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see bookingmodel.BookingmodelPackage
 * @generated
 */
public class BookingmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BookingmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = BookingmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BookingmodelPackage.ROOM_TO_GUEST_ID_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<Integer, String> roomToGuestIDEntry = (Map.Entry<Integer, String>)theEObject;
				T result = caseRoomToGuestIDEntry(roomToGuestIDEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.ROOM_TYPE_TO_ROOM_ID_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Integer> roomTypeToRoomIDEntry = (Map.Entry<String, Integer>)theEObject;
				T result = caseRoomTypeToRoomIDEntry(roomTypeToRoomIDEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.BOOKING_REF_TO_BOOKING_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Booking> bookingRefToBookingEntry = (Map.Entry<String, Booking>)theEObject;
				T result = caseBookingRefToBookingEntry(bookingRefToBookingEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.BOOKING: {
				Booking booking = (Booking)theEObject;
				T result = caseBooking(booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.CUSTOMER: {
				Customer customer = (Customer)theEObject;
				T result = caseCustomer(customer);
				if (result == null) result = casePerson(customer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.PAYMENT_DETAILS: {
				PaymentDetails paymentDetails = (PaymentDetails)theEObject;
				T result = casePaymentDetails(paymentDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.GUEST: {
				Guest guest = (Guest)theEObject;
				T result = caseGuest(guest);
				if (result == null) result = casePerson(guest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.EXTRA_TO_IS_PAYED_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Boolean> extraToIsPayedEntry = (Map.Entry<String, Boolean>)theEObject;
				T result = caseExtraToIsPayedEntry(extraToIsPayedEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.BOOKING_HANDLER: {
				BookingHandler bookingHandler = (BookingHandler)theEObject;
				T result = caseBookingHandler(bookingHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.IBOOKING_PROVIDES_FOR_HOST: {
				IBookingProvidesForHost iBookingProvidesForHost = (IBookingProvidesForHost)theEObject;
				T result = caseIBookingProvidesForHost(iBookingProvidesForHost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.IBOOKING_PROVIDES_FOR_CUSTOMER: {
				IBookingProvidesForCustomer iBookingProvidesForCustomer = (IBookingProvidesForCustomer)theEObject;
				T result = caseIBookingProvidesForCustomer(iBookingProvidesForCustomer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.IBOOKING_PROVIDES_FOR_GUEST: {
				IBookingProvidesForGuest iBookingProvidesForGuest = (IBookingProvidesForGuest)theEObject;
				T result = caseIBookingProvidesForGuest(iBookingProvidesForGuest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BookingmodelPackage.BOOKING_PROVIDES: {
				BookingProvides bookingProvides = (BookingProvides)theEObject;
				T result = caseBookingProvides(bookingProvides);
				if (result == null) result = caseIBookingProvidesForCustomer(bookingProvides);
				if (result == null) result = caseIBookingProvidesForGuest(bookingProvides);
				if (result == null) result = caseIBookingProvidesForHost(bookingProvides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room To Guest ID Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room To Guest ID Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomToGuestIDEntry(Map.Entry<Integer, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type To Room ID Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type To Room ID Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomTypeToRoomIDEntry(Map.Entry<String, Integer> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Ref To Booking Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Ref To Booking Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingRefToBookingEntry(Map.Entry<String, Booking> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooking(Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomer(Customer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentDetails(PaymentDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuest(Guest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extra To Is Payed Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extra To Is Payed Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtraToIsPayedEntry(Map.Entry<String, Boolean> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingHandler(BookingHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBooking Provides For Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBooking Provides For Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBookingProvidesForHost(IBookingProvidesForHost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBooking Provides For Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBooking Provides For Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBookingProvidesForCustomer(IBookingProvidesForCustomer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBooking Provides For Guest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBooking Provides For Guest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBookingProvidesForGuest(IBookingProvidesForGuest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingProvides(BookingProvides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BookingmodelSwitch
