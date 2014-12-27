/**
 */
package bookingmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the interface '<em><b>Booking</b></em>'
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
 * @see bookingmodel.ModelPackage#getBooking()
 * @maintenancemodel
 * @generated NOT
 */
public interface Booking extends EObject {
	/**
	 * A method that returns the value of the '<em><b>Booking Ref</b></em>' attribute.
	 * @return the value of the '<em>Booking Ref</em>' attribute.
	 * @see #setBookingRef(String)
	 * @see bookingmodel.ModelPackage#getBooking_BookingRef()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
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
	 * A method that returns the value of the '<em><b>Date</b></em>' attribute.
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see bookingmodel.ModelPackage#getBooking_Date()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getDate();

	/**
	 * A method that sets the value of the '{@link bookingmodel.Booking#getDate <em>Date</em>}' attribute.
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated NOT
	 */
	void setDate(String value);

	/**
	 * A method that returns the value of the '<em><b>Nr Of Nights</b></em>' attribute.
	 * @return the value of the '<em>Nr Of Nights</em>' attribute.
	 * @see #setNrOfNights(int)
	 * @see bookingmodel.ModelPackage#getBooking_NrOfNights()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated NOT
	 */
	int getNrOfNights();

	/**
	 * A method that sets the value 
	 * of the '{@link bookingmodel.Booking#getNrOfNights <em>Nr Of Nights</em>}' attribute.
	 * @param value the new value of the '<em>Nr Of Nights</em>' attribute.
	 * @see #getNrOfNights()
	 * @generated NOT
	 */
	void setNrOfNights(int value);

	/**
	 * A method that returns the value of the '<em><b>Extra List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * @return the value of the '<em>Extra List</em>' attribute list.
	 * @see bookingmodel.ModelPackage#getBooking_ExtraList()
	 * @maintenancemodel ordered="false"
	 * @generated NOT
	 */
	EList<String> getExtraList();

	/**
	 * A method that returns the value of the '<em><b>Service Notes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * @return the value of the '<em>Service Notes</em>' attribute list.
	 * @see bookingmodel.ModelPackage#getBooking_ServiceNotes()
	 * @maintenancemodel ordered="false"
	 * @generated NOT
	 */
	EList<String> getServiceNotes();

	/**
	 * A method that returns the value of the '<em><b>Nr Of Guests</b></em>' attribute.
	 * @return the value of the '<em>Nr Of Guests</em>' attribute.
	 * @see #setNrOfGuests(int)
	 * @see bookingmodel.ModelPackage#getBooking_NrOfGuests()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated NOT
	 */
	int getNrOfGuests();

	/**
	 * A method that sets the value 
	 * of the '{@link bookingmodel.Booking#getNrOfGuests <em>Nr Of Guests</em>}' attribute.
	 * @param value the new value of the '<em>Nr Of Guests</em>' attribute.
	 * @see #getNrOfGuests()
	 * @generated NOT
	 */
	void setNrOfGuests(int value);

	/**
	 * A method that returns the value of the '<em><b>Customer</b></em>' reference.
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see bookingmodel.ModelPackage#getBooking_Customer()
	 * @maintenancemodel required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * A method that sets the value 
	 * of the '{@link bookingmodel.Booking#getCustomer <em>Customer</em>}' reference.
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated NOT
	 */
	void setCustomer(Customer value);

	/**
	 * A method that returns the value of the '<em><b>Guest List</b></em>' reference list.
	 * The list contents are of type {@link bookingmodel.Guest}.
	 * @return the value of the '<em>Guest List</em>' reference list.
	 * @see bookingmodel.ModelPackage#getBooking_GuestList()
	 * @maintenancemodel required="true" ordered="false"
	 * @generated NOT
	 */
	EList<Guest> getGuestList();

	/**
	 * A method that returns the value (true/false) of the '<em><b>Is Payed</b></em>' attribute,
	 * if it is payed or not.
	 * @return the value of the '<em>Is Payed</em>' attribute.
	 * @see #setIsPayed(boolean)
	 * @see bookingmodel.ModelPackage#getBooking_IsPayed()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated NOT
	 */
	boolean isPayed();

	/**
	 * A method that sets the value 
	 * of the '{@link bookingmodel.Booking#isPayed <em>Is Payed</em>}' attribute,
	 * with parameter of the new value of the isPayed attribute.
	 * @param value
	 * @see #isPayed()
	 * @generated NOT
	 */
	void setIsPayed(boolean value);

	/**
	 * Returns the value of the '<em><b>Room Guest Map</b></em>' map.
	 * It will get a set of rooms and their responsible guests.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * RoomGuestMap is a set of guests.
	 * @return the value of the '<em>Room Guest Map</em>' map.
	 * @see bookingmodel.ModelPackage#getBooking_RoomGuestMap()
	 * @maintenancemodel mapType="maintenancemodel.RoomtypeToGuestIDEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" ordered="false"
	 * @generated NOT
	 */
	EMap<String, String> getRoomGuestMap();

	/**
	 * Returns the value of the '<em><b>Room Type Map</b></em>' map.
	 * RoomTypeMap is a set of roomtypes.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * @return the value of the '<em>Room Type Map</em>' map.
	 * @see bookingmodel.ModelPackage#getBooking_RoomTypeMap()
	 * @maintenancemodel mapType="maintenancemodel.NrToRoomEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>" ordered="false"
	 * @generated NOT
	 */
	EMap<String, Integer> getRoomTypeMap();

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' attribute.
	 * The literals are from the enumeration {@link bookingmodel.PaymentMethod}.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' attribute.
	 * @see bookingmodel.PaymentMethod
	 * @see #setPaymentMethod(PaymentMethod)
	 * @see bookingmodel.ModelPackage#getBooking_PaymentMethod()
	 * @maintenancemodel required="true" ordered="false"
	 * @generated NOT
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * A method that sets the payment value of 
	 * the '{@link bookingmodel.Booking#getPaymentMethod <em>Payment Method</em>}' attribute.
	 * @param value the new value of the '<em>Payment Method</em>' attribute.
	 * @see bookingmodel.PaymentMethod
	 * @see #getPaymentMethod()
	 * @generated NOT
	 */
	void setPaymentMethod(PaymentMethod value);

	/**
	 * A method that checks if all guests are checked in.
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated NOT
	 */
	boolean checkedInAllGuest();

	/**
	 * A method that checks if a guest is checked in.
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated NOT
	 */
	boolean checkedInAGuest();

} // Booking
