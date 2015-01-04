/**
 */
package bookingmodel;

import java.util.List;

/**
 * An interface class which represents BookingProvides, extending EObject.
 * The interface extends an EObject and has 20 methods;
 * setBookingHandler - setting a value of the booking handler reference
 * removeBooking - removes a booking
 * getBooking - gets a specific booking
 * getPrice - gets the price of a specific booking
 * book - make a booking 
 * pay - make a payment of a specific booking
 * editBooking - edit a specific booking
 * setPersonalDetails - set details to a guest/customer
 * choosePaymentMethod - choose paymentmethod such as bankcard, cash or voucher
 * setPaymentDetails - set details to a payment
 * checkOut - check out a guest
 * checkIn - check in a guest
 * enableSelfManagement - enable self management for a guest
 * addServiceNote - add a specific service note
 * editServiceNote - edit a specific service note
 * removeServiceNote - remove a specific service note
 * getServiceNote - get a specific service note 
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.BookingProvides#getBookingHandler <em>Booking Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.BookingmodelPackage#getBookingProvides()
 * @model
 * @generated 
 */
public interface BookingProvides extends IBookingProvidesForCustomer, IBookingProvidesForGuest, IBookingProvidesForHost {
	/**
	 * Returns the booking handler.
	 * @return the value of the '<em>Booking Handler</em>' reference.
	 * @see #setBookingHandler(BookingHandler)
	 * @see bookingmodel.BookingmodelPackage#getBookingProvides_BookingHandler()
	 * @model required="true" ordered="false"
	 * @generated NOT
	 */
	BookingHandler getBookingHandler();

	/**
	 * Sets the booking handler.
	 * @param value the new value of the '<em>Booking Handler</em>' reference.
	 * @see #getBookingHandler()
	 * @generated NOT
	 */
	void setBookingHandler(BookingHandler value);

	/**
	 * Returns the value of the '<em><b>Service Note Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Note Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Note Handler</em>' containment reference.
	 * @see #setServiceNoteHandler(ServiceNoteHandler)
	 * @see bookingmodel.BookingmodelPackage#getBookingProvides_ServiceNoteHandler()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ServiceNoteHandler getServiceNoteHandler();

	/**
	 * Sets the value of the '{@link bookingmodel.BookingProvides#getServiceNoteHandler <em>Service Note Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Note Handler</em>' containment reference.
	 * @see #getServiceNoteHandler()
	 * @generated
	 */
	void setServiceNoteHandler(ServiceNoteHandler value);

	/**
	 * Make a text string into a list. 
	 * @model dataType="types.String" ordered="false" textDataType="types.String" textRequired="true" textOrdered="false"
	 * @generated NOT
	 */
	List<String> stringToList(String text);

} // BookingProvides
