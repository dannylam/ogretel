/**
 */
package bookingmodel;

import java.util.List;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * An interface class which represents BookingHandler, extending EObject.
 * The interface extends an EObject and has 5 methods; 
 * exists - checks if the booking reference exists
 * addBooking - adding a booking
 * removeBooking - remove a booking 
 * getBooking - get a specific booking reference
 * editBooking - edit nrOfNights, nrOfGuests, date, nrOfRooms, 
 * roomTypes and extras in booking specific booking reference
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.BookingHandler#getBookingsMap <em>Bookings Map</em>}</li>
 * </ul>
 * </p>
 * 
 * @see bookingmodel.BookingmodelPackage#getBookingHandler()
 * @model
 * @generated NOT
 */
public interface BookingHandler extends EObject {
	 /**
	 * Returns the value of the '<em><b>Bookings Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link bookingmodel.Booking},
	 * BookingsMap is a set of bookings.
	 * @return the value of the '<em>Bookings Map</em>' map.
	 * @see bookingmodel.BookingmodelPackage#getBookingHandler_BookingsMap()
	 * @model mapType="bookingmodel.BookingRefToBookingEntry<org.eclipse.emf.ecore.EString, bookingmodel.Booking>" ordered="false"
	 * @generated
	 */
	EMap<String, Booking> getBookingsMap();

	/**
	 * A method that checks if the booking reference exists
	 * @param bookingRef
	 * @return boolean which indicating if the given booking reference exists in the map of bookings
	 * @model dataType="types.Boolean" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	boolean exists(String bookingRef);

	/**
	 * Adds a booking to the map where the key is the bookingreference and the value the booking. 
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @param booking
	 *  //TODO
	 * @return  0 if success 
	 * 			1 if ??
	 * 			2 if ??
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated NOT
	 */
	int addBooking(Booking booking);

	/**
	 * Removes a booking from the map with the given booking reference.
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @param booking
	 * //TODO
	 * @return  0 if success 
	 * 			1 if ??
	 * 			2 if ??
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int removeBooking(String bookingRef);

	/**
	 * Gets a booking with a specific booking reference.
	 * @param bookingRef
	 * @return a booking
	 * @model required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	Booking getBooking(String bookingRef);

	/**
	 * Edits a booking's, nr of nights, nr of guests, start of the date, 
	 * end of the date, the type of the rooms and extras with the given booking reference.
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @param bookingRef, nrOfNights, nrOfGuests, startDate, endDate, roomTypes, extras
	 *  //TODO
	 * @return  0 if success 
	 * 			1 if ??
	 * 			2 if ??
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false" startDateDataType="types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="types.String" endDateRequired="true" endDateOrdered="false" nrOfGuestsDataType="types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" roomTypesRequired="true" roomTypesMany="false" roomTypesOrdered="false" extrasMany="false" extrasOrdered="false"
	 * @generated
	 */
	int editBooking(String bookingRef, String startDate, String endDate, int nrOfGuests, List<String> roomTypes, List<String> extras);

} // BookingHandler
