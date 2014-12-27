/**
 */
package bookingmodel;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the interface '<em><b>Booking Handler</b></em>'.
 * The interface extends an EObject and has 5 methods; 
 * exists - checks if the booking reference exists
 * add - adding a booking
 * remove - remove a booking 
 * get - get a specific booking reference
 * edit - edit nrOfNights, nrOfGuests, date, nrOfRooms, 
 * roomTypes and extras in booking specific booking reference
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.BookingHandler#getBookingsMap <em>Bookings Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.ModelPackage#getBookingHandler()
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
	 * @see bookingmodel.ModelPackage#getBookingHandler_BookingsMap()
	 * @model mapType="model.bookingRefToBookingEntry<org.eclipse.emf.ecore.EString, model.Booking>" ordered="false"
	 * @generated NOT
	 */
	EMap<String, Booking> getBookingsMap();

	/**
	 * A method that checks if the booking reference exists
	 * @param bookingRef
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	boolean exists(String bookingRef);

	/**
	 * A method that adds a booking 
	 * @param booking
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated NOT
	 */
	void addBooking(Booking booking);

	/**
	 * A method that removes a booking 
	 * @param booking
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated NOT
	 */
	void removeBooking(Booking booking);

	/**
	 * A method that gets a booking with booking reference
	 * @param bookingRef
	 * @model required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	Booking getBooking(String bookingRef);

	/**
	 * A method that edits nr of nights, nr of guests, nr of rooms, 
	 * the type of the rooms, extras and booking reference of a room.
	 * @param nrOfNights, nrOfGuests, date, nrOfRooms, roomTypes, extras, bookingRef
	 * @model nrOfNightsDataType="org.eclipse.uml2.types.Integer" nrOfNightsRequired="true" nrOfNightsOrdered="false" nrOfGuestsDataType="org.eclipse.uml2.types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" dateDataType="org.eclipse.uml2.types.String" dateRequired="true" dateOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false" roomTypesDataType="org.eclipse.uml2.types.String" roomTypesRequired="true" roomTypesOrdered="false" extrasDataType="org.eclipse.uml2.types.String" extrasRequired="true" extrasOrdered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void editBooking(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras, String bookingRef);


} // BookingHandler
