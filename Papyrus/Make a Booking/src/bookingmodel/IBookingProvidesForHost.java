/**
 */
package bookingmodel;

import java.util.List;

import org.eclipse.emf.common.util.EList;
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
	 * Returns the service notes from a specific booking. 
	 * @model dataType="types.String" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<String> getServiceNotes(String bookingRef);

	/**
	 * Changes a the description of a service note.
	 * @model dataType="types.Integer" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false" descriptionDataType="types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated NOT
	 */
	int editServiceNoteDescription(String serviceNote, String description);

	/**
	 * Returns is the given booking is payed or not
	 * @model bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	boolean isPayed(String bookingRef);

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
	 * @generated
	 */
	int getNrOfGuests(String bookingRef);

	/**
	 * Returns the extras of a booking
	 * @model dataType="types.String" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	List<String> getExtras(String bookingRef);

	/**
	 * Returns a list of the rooms of a booking
	 * @model dataType="types.Integer" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	List<Integer> getRooms(String bookingRef);

	/**
	 * Returns the paymentmethod of a booking
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	String getPaymentMethod(String bookingRef);

	/**
	 * Returns a list of the roomtypes of a booking
	 * @model dataType="types.String" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	List<String> getRoomTypes(String bookingRef);


} // IBookingProvidesForHost
