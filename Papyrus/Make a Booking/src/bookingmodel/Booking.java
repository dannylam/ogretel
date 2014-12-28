/**
 */
package bookingmodel;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * An interface class which represents Booking, extending EObject.
 * which extends an EObject and has 21 methods:
 * getBookingRef - get a specific booking
 * setBookingRef - set a value to a specific booking reference
 * getDate - get a date of a specific booking
 * setDate - set a date to a specific booking
 * getNrOfNights - get number of nights of a specific booking
 * setNrOfNights - set number of nights to a specific booking
 * getExtraList - get a list of extras
 * getServiceNotes - get a list of service notes
 * getNrOfGuests - get the number of guests of a specific booking
 * setNrOfGuests - set number of guests to a specific booking
 * getCustomer - get customer from a specific booking
 * setCustomer - set customer to a specific booking
 * getGuestList - get a list of guests
 * isPayed - checks if the booking has been payed or not
 * setIsPayed - set the booking to Payed
 * getRoomGuestMap - get a set of rooms and their responsible guests
 * getRoomTypeMap - get a set of roomtypes
 * getPaymentMethod - get the payment method of a specific booking
 * setPaymentMethod - set the payment method to a specific booking
 * checkedInAllGuest - check if all guests are checked in.
 * checkedInAGuest - check if a specific guest is checked in.
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.Booking#getBookingRef <em>Booking Ref</em>}</li>
 *   <li>{@link bookingmodel.Booking#getDate <em>Date</em>}</li>
 *   <li>{@link bookingmodel.Booking#getNrOfNights <em>Nr Of Nights</em>}</li>
 *   <li>{@link bookingmodel.Booking#getExtraList <em>Extra List</em>}</li>
 *   <li>{@link bookingmodel.Booking#getServiceNotes <em>Service Notes</em>}</li>
 *   <li>{@link bookingmodel.Booking#getNrOfGuests <em>Nr Of Guests</em>}</li>
 *   <li>{@link bookingmodel.Booking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link bookingmodel.Booking#getGuestList <em>Guest List</em>}</li>
 *   <li>{@link bookingmodel.Booking#isPayed <em>Is Payed</em>}</li>
 *   <li>{@link bookingmodel.Booking#getRoomGuestMap <em>Room Guest Map</em>}</li>
 *   <li>{@link bookingmodel.Booking#getRoomTypeMap <em>Room Type Map</em>}</li>
 *   <li>{@link bookingmodel.Booking#getPaymentMethod <em>Payment Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.BookingmodelPackage#getBooking()
 * @model
 * @generated NOT
 */
public interface Booking extends EObject {
	/**
	 * A method that returns the value of the '<em><b>Booking Ref</b></em>' attribute.
	 * @return the value of the '<em>Booking Ref</em>' attribute.
	 * @see #setBookingRef(String)
	 * @see bookingmodel.BookingmodelPackage#getBooking_BookingRef()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getBookingRef();

	/**
	 * A method that sets the value 
	 * of the '{@link bookingmodel.Booking#getBookingRef <em>Booking Ref</em>}' attribute.
	 * @param value the new value of the '<em>Booking Ref</em>' attribute.
	 * @see #getBookingRef()
	 * @generated NOT
	 */
	void setBookingRef(String value);

	/**
	 * Returns the start of a date.
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see bookingmodel.BookingmodelPackage#getBooking_StartDate()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getStartDate();

	/**
	 * Sets the start of a date.
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated NOT
	 */
	void setStartDate(String value);

	/**
	 * Returns the end of a date.
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see bookingmodel.BookingmodelPackage#getBooking_EndDate()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getEndDate();

	/**
	 * Sets the end of a date.
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated NOT
	 */
	void setEndDate(String value);

	/**
	 * A method that returns the value of the '<em><b>Service Notes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * Returns a service.
	 * @return the value of the '<em>Service Notes</em>' attribute list.
	 * @see bookingmodel.BookingmodelPackage#getBooking_ServiceNotes()
	 * @model ordered="false"
	 * @generated NOT
	 */
	EList<String> getServiceNotes();

	/**
	 * Returns the number of guests.
	 * @return the value of the '<em>Nr Of Guests</em>' attribute.
	 * @see #setNrOfGuests(int)
	 * @see bookingmodel.BookingmodelPackage#getBooking_NrOfGuests()
	 * @model dataType="types.Integer" required="true" ordered="false"
	 * @generated NOT
	 */
	int getNrOfGuests();

	/**
	 * Sets the number of guests.
	 * @param value the new value of the '<em>Nr Of Guests</em>' attribute.
	 * @see #getNrOfGuests()
	 * @generated NOT
	 */
	void setNrOfGuests(int value);

	/**
	 * Returns a customer.
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see bookingmodel.BookingmodelPackage#getBooking_Customer()
	 * @model required="true" ordered="false"
	 * @generated NOT
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getCustomer <em>Customer</em>}' reference.
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated NOT
	 */
	void setCustomer(Customer value);

	/**
	 * Returns a list of guests.
	 * @return the value of the '<em>Guest List</em>' reference list.
	 * @see bookingmodel.BookingmodelPackage#getBooking_GuestList()
	 * @model required="true" ordered="false"
	 * @generated NOT
	 */
	EList<Guest> getGuestList();

	/**
	 * Returns false or true if a payment has been made.
	 * @return the value of the '<em>Is Payed</em>' attribute.
	 * @see #setIsPayed(boolean)
	 * @see bookingmodel.BookingmodelPackage#getBooking_IsPayed()
	 * @model dataType="types.Boolean" required="true" ordered="false"
	 * @generated NOT
	 */
	boolean isIsPayed();

	/**
	 * Sets false or true to a made payment.
	 * @param value the new value of the '<em>Is Payed</em>' attribute.
	 * @see #isIsPayed()
	 * @generated NOT
	 */
	void setIsPayed(boolean value);

	/**
	 * Returns a set of room IDs and their responsible guests.
	 * @return the value of the '<em>Room ID To Guest Map</em>' map.
	 * @see bookingmodel.BookingmodelPackage#getBooking_RoomIDToGuestMap()
	 * @model mapType="bookingmodel.RoomToGuestIDEntry<org.eclipse.emf.ecore.EIntegerObject, org.eclipse.emf.ecore.EString>" ordered="false"
	 * @generated NOT
	 */
	EMap<Integer, String> getRoomIDToGuestMap();

	/**
	 * Returns a set of room IDs and their responsible guests.
	 * @return the value of the '<em>Room Type To Room ID Map</em>' map.
	 * @see bookingmodel.BookingmodelPackage#getBooking_RoomTypeToRoomIDMap()
	 * @model mapType="bookingmodel.RoomTypeToRoomIDEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>" ordered="false"
	 * @generated NOT
	 */
	EMap<String, Integer> getRoomTypeToRoomIDMap();

	/**
	 * Returns the payment method: credit card, cash or voucher.
	 * @return the value of the '<em>Payment Method</em>' attribute.
	 * @see bookingmodel.PaymentMethod
	 * @see #setPaymentMethod(PaymentMethod)
	 * @see bookingmodel.BookingmodelPackage#getBooking_PaymentMethod()
	 * @model required="true" ordered="false"
	 * @generated NOT
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * Sets the payment method: credit card, cash or voucher.
	 * @param value the new value of the '<em>Payment Method</em>' attribute.
	 * @see bookingmodel.PaymentMethod
	 * @see #getPaymentMethod()
	 * @generated NOT
	 */
	void setPaymentMethod(PaymentMethod value);

	/**
	 * Returns a set of payed extras.
	 * @return the value of the '<em>Extra To Is Payed Map</em>' map.
	 * @see bookingmodel.BookingmodelPackage#getBooking_ExtraToIsPayedMap()
	 * @model mapType="bookingmodel.ExtraToIsPayedEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EBooleanObject>" ordered="false"
	 * @generated NOT
	 */
	EMap<String, Boolean> getExtraToIsPayedMap();

	/**
	 * A method that checks if all guests are checked in.
	 * @model dataType="types.Boolean" required="true" ordered="false"
	 * @generated NOT
	 */
	boolean checkedInAllGuest();

	/**
	 * A method that checks if a guest is checked in.
	 * @model dataType="types.Boolean" required="true" ordered="false"
	 * @generated NOT
	 */
	boolean checkedInAGuest();

	/**
	 * Sets a responsible guest to a specific roomID by using their email.
	 * @model dataType="types.Integer" required="true" ordered="false" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	int setResponsibleGuest(int roomID, String guestEmail);

	/**
	 * Sets a guest as responsible to all the rooms in the booking by using their email
	 * @model dataType="types.Integer" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	int setResponsibleGuestToAllRooms(String guestEmail);	
	
	/**
	 * Returns the number of rooms.
	 * @model kind="operation" dataType="types.Integer" required="true" ordered="false"
	 * @generated NOT
	 */
	int getNrOfRooms();

	/**
	 * Sets extras into a list.
	 * @model dataType="types.Integer" required="true" ordered="false" extrasDataType="types.String" extrasMany="true" extrasOrdered="false"
	 * @generated NOT
	 */
	int setExtras(List<String> extras);

	/**
	 * Sets roomtypes into a list.
	 * @model dataType="types.Integer" required="true" ordered="false" roomTypesDataType="types.String" roomTypesMany="true" roomTypesOrdered="false"
	 * @generated NOT
	 */
	int setRoomTypes(List<String> roomTypes);

} // Booking
