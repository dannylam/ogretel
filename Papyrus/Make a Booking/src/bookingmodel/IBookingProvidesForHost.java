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
	 * Enable self management to a specific host.
	 * @model dataType="types.Integer" required="true" ordered="false"
	 * @generated NOT
	 */
	int enableSelfManagement();

	/**
	 * Add a specific service note.
	 * @param serviceNote
	 * @model dataType="types.Integer" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated NOT
	 */
	int addServiceNote(String serviceNote);

	/**
	 * Edit a service note by changing a specific service note into a new service note.
	 * @param oldServiceNote, newServiceNote
	 * @model dataType="types.Integer" required="true" ordered="false" oldServiceNoteDataType="types.String" oldServiceNoteRequired="true" oldServiceNoteOrdered="false" newServiceNoteDataType="types.String" newServiceNoteRequired="true" newServiceNoteOrdered="false"
	 * @generated NOT
	 */
	int editServiceNote(String oldServiceNote, String newServiceNote);

	/**
	 * Remove a specific service note
	 * @param serviceNote
	 * @model dataType="types.Integer" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated NOT
	 */
	int removeServiceNote(String serviceNote);

	/**
	 * Get service notes from a specific booking.
	 * @param bookingRef
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<String> getServiceNotes(String bookingRef);

} // IBookingProvidesForHost
