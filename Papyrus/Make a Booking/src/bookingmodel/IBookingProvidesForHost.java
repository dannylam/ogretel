/**
 */
package bookingmodel;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * An interface class which represents booking provides for the host, extending EObject.
 * It has 5 methods;
 * enableSelfManagement - enable self management.
 * addServiceNote - add a specific service note.
 * editServiceNote - edit a specific service note
 * removeServiceNote - remove a specific service note.
 * getServiceNote - get a specific service note.
 * @see bookingmodel.BookingmodelPackage#getIBookingProvidesForHost()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBookingProvidesForHost extends EObject {

	/**
	 * Returns is the given booking is payed or not
	 * @model dataType="types.Boolean" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	boolean isBookingPayed(String bookingRef);

	/**
	 * Returns is the given extra is payed or not
	 * @model dataType="types.Boolean" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	boolean isExtraPayed(int roomID);

	/**
	 * Returns is the given room is payed or not
	 * @model dataType="types.Boolean" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	boolean isRoomPayed(int roomID);

	/**
	 * Returns is the given booking exists or not
	 * @model dataType="types.Boolean" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	boolean existBooking(String bookingRef);

	/**
	 * Return a list of all existing bookings
	 * @model kind="operation" dataType="types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getExistingBookings();

	/**
	 * Return a list of all active bookings
	 * @model kind="operation" dataType="types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getActiveBookings();

	/**
	 * Returns is the given room is checked-out or not
	 * @model dataType="types.Boolean" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated  NOT
	 */
	boolean isCheckedOut(int roomID);

	/**
	 * Returns is the given room is checked-in or not
	 * @model dataType="types.Boolean" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	boolean isCheckedIn(int roomID);

	/**
	 * Returns is the responsible guest for the given room
	 * @model dataType="types.String" required="true" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	String getResponsibleGuest(int roomID);

	/**
	 * Returns is the room of the responsible guest
	 * @model dataType="types.Integer" required="true" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	List<Integer> getRoomID(String guestEmail);

	/**
	 * Adds the list of service notes to a room
	 * @model dataType="types.Integer" required="true" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false" serviceNoteDataType="types.String" serviceNoteMany="true" serviceNoteOrdered="false"
	 * @generated
	 */
	int addServiceNotes(int roomID, List<String> serviceNote);

	/**
	 * Removes the list of service notes to a room
	 * @model dataType="types.Integer" required="true" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false" serviceNoteDataType="types.String" serviceNoteMany="true" serviceNoteOrdered="false"
	 * @generated
	 */
	int RemoveServiceNotes(int roomID, List<String> serviceNote);

	/**
	 * Returns the service notes from a specific booking. 
	 * @model dataType="types.String" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<String> getServiceNotes(String bookingRef);

	/**
	 * Returns the start date of a booking
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getStartDate(String bookingRef);

	/**
	 * Returns the end date of a booking
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getEndDate(String bookingRef);

	/**
	 * Returns the number of guests of a booking
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int getNrOfGuests(String bookingRef);

	/**
	 * Returns the extras of a booking
	 * @model dataType="types.String" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<String> getExtras(String bookingRef);

	/**
	 * Returns a list of the rooms of a booking
	 * @model dataType="types.Integer" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<Integer> getRooms(String bookingRef);

	/**
	 * Returns the paymentmethod of a booking
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getPaymentMethod(String bookingRef);

	/**
	 * Returns a list of the roomtypes of a booking
	 * @model dataType="types.String" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<String> getRoomTypes(String bookingRef);


} // IBookingProvidesForHost
