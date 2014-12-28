/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * An interface class which represents booking provides for the host, extending EObject.
 * It has 5 methods;
 * enableSelfManagement - enable self management.
 * addServiceNote - add a specific service note.
 * editServiceNote - edit a specific service note
 * removeServiceNote - remove a specific service note.
 * getServiceNote - get a specific service note.
 * @see bookingmodel.ModelPackage#getIBookingProvidesForHost()
 * @maintenancemodel interface="true" abstract="true"
 * @generated NOT
 */
public interface IBookingProvidesForHost extends EObject {
	/**
	 * Enable self management to a specific host.
	 * @param guestEmail
	 * @maintenancemodel guestEmailDataType="org.eclipse.uml2.types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	void enableSelfManagement(String guestEmail);

	/**
	 * Add a specific service note.
	 * @param serviceNote
	 * @maintenancemodel serviceNoteDataType="org.eclipse.uml2.types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated NOT
	 */
	void addServiceNote(String serviceNote);

	/**
	 * Edit a service note by changing a specific service note into a new service note.
	 * @param oldServiceNote, newServiceNote
	 * @maintenancemodel oldServiceNoteDataType="org.eclipse.uml2.types.String" oldServiceNoteRequired="true" oldServiceNoteOrdered="false" newServiceNoteDataType="org.eclipse.uml2.types.String" newServiceNoteRequired="true" newServiceNoteOrdered="false"
	 * @generated NOT
	 */
	void editServiceNote(String oldServiceNote, String newServiceNote);

	/**
	 * Remove a specific service note
	 * @param serviceNote
	 * @maintenancemodel serviceNoteDataType="org.eclipse.uml2.types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated NOT 
	 */
	void removeServiceNote(String serviceNote);

	/**
	 * Get service notes from a specific booking.
	 * @param bookingRef
	 * @maintenancemodel bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void getServiceNotes(String bookingRef);

} // IBookingProvidesForHost
