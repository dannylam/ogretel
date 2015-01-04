/**
 */
package bookingmodel;

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
	 * Add a specific service note and its description.
	 * @return	0 if success 
	 * 			-1 if the map of service notes is null
	 * 			1 if the inparams are null
	 * @param serviceNote, description
	 * @model dataType="types.Integer" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false" descriptionDataType="types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated NOT
	 */
	int addServiceNote(String serviceNote, String description);

	/**
	 * Remove a specific service note
	 * @return	0 if success 
	 * 			-1 if of service notes is null
	 * 			1 if the service does not exist
	 * 			2 if the inparam are null
	 * @param serviceNote
	 * @model dataType="types.Integer" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated NOT
	 */
	int removeServiceNote(String serviceNote);

	/**
	 * Returns the service notes from a specific booking. 
	 * @param bookingRef
	 * @model required="true" many="false" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	EList<String> getServiceNotesOfBooking(String bookingRef);

	/**
	 * Changes a the description of a service note.
	 * @model dataType="types.Integer" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false" descriptionDataType="types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated NOT
	 */
	int editServiceNoteDescription(String serviceNote, String description);

	/**
	 * Returns a list of all the service notes. 
	 * @model kind="operation" required="true" many="false" ordered="false"
	 * @generated NOT
	 */
	EList<String> getServiceNotes();

	/**
	 * Returns the description of a service note
	 * @model dataType="types.String" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated NOT
	 */
	String getServiceNoteDescription(String serviceNote);

	/**
	 * Returns is the given booking is payed or not
	 * @model bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	boolean isPayed(String bookingRef);


} // IBookingProvidesForHost
