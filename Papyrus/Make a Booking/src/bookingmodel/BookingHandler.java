/**
 */
package bookingmodel;

import java.util.List;
import org.eclipse.emf.common.util.EList;
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
 * @generated 
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
	 * Returns the value of the '<em><b>Room ID To Booking Ref Map</b></em>' map.
	 * The key is of type {@link java.lang.Integer},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room ID To Booking Ref Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room ID To Booking Ref Map</em>' map.
	 * @see bookingmodel.BookingmodelPackage#getBookingHandler_RoomIDToBookingRefMap()
	 * @model mapType="bookingmodel.RoomIDToBookingRefEntry<org.eclipse.emf.ecore.EIntegerObject, org.eclipse.emf.ecore.EString>" ordered="false"
	 * @generated
	 */
	EMap<Integer, String> getRoomIDToBookingRefMap();

	/**
	 * A method that checks if the booking reference exists
	 * @param bookingRef
	 * @return boolean which indicating if the given booking reference exists in the map of bookings
	 * @model dataType="types.Boolean" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	boolean exists(String bookingRef);

	/**
	 * Creates and adds a booking to the map where the key is a bookingreference and the value the booking. 
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @param booking
	 * @return a bookingreference if success 
	 * 			null if the map of bookings is null
	 * @model dataType="types.String" required="true" ordered="false" nrOfGuestsDataType="types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" startDateDataType="types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="types.String" endDateRequired="true" endDateOrdered="false" roomTypesDataType="types.String" roomTypesMany="true" roomTypesOrdered="false" extrasDataType="types.String" extrasMany="true" extrasOrdered="false" servicesDataType="types.String" servicesMany="true" servicesOrdered="false"
	 * @generated NOT
	 */
	String addBooking(int nrOfGuests, String startDate, String endDate, List<String> roomTypes, List<String> extras, List<String> services);

	/**
	 * Removes a booking from the map with the given booking reference.
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @param booking
	 * @return  0 if success 
	 * 			-1 if the booking reference does not exist
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int removeBooking(String bookingRef);

	/**
	 * Returns a booking with a specific booking reference.
	 * @param bookingRef
	 * @return a booking
	 * @model required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	Booking getBooking(String bookingRef);

	/**
	 * Edits a booking with the specified parameters given.
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return  0 if success 
	 * 			-1 if the booking reference does not exist
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false" startDateDataType="types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="types.String" endDateRequired="true" endDateOrdered="false" nrOfGuestsDataType="types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" roomTypesDataType="types.String" roomTypesMany="true" roomTypesOrdered="false" extrasDataType="types.String" extrasMany="true" extrasOrdered="false" servicesDataType="types.String" servicesMany="true" servicesOrdered="false"
	 * @generated NOT
	 */
	int editBooking(String bookingRef, String startDate, String endDate, int nrOfGuests, List<String> roomTypes, List<String> extras, List<String> services);

	/**
	 *  Returns the booking which a rooms is associated to if that room is already checked in.
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return  the booking reference associaated with the room.
	 * @model required="true" ordered="false" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	Booking getBooking(int roomID);

	/**
	 * Returns if a booking is active or not
	 * @model dataType="types.Boolean" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	boolean isActive(String bookingRef);

} // BookingHandler
