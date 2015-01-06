/**
 */
package bookingmodel;

import java.util.List;

/**
 * An interface class which represents BookingProvides, extending EObject, which is a interface
 * containing all the methods which the booking component provides for its users.
 * It implements the interfaces IBookingProvidesForCustomer, IBookingProvidesForGuest & IBookingProvidesForHost.
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
	 * Make a text string into a list. 
	 * @model dataType="types.String" ordered="false" textDataType="types.String" textRequired="true" textOrdered="false"
	 * @generated NOT
	 */
	List<String> stringToList(String text);

} // BookingProvides
