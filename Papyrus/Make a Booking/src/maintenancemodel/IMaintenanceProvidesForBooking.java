/**
 */
package maintenancemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the maintenancemodel object '<em><b>IMaintenance Provides For Booking</b></em>'.
 *
 * The interface extends an EObject and has 4 methods:
 * canBook - Checks if a booking can be made with given parameters
 * makeBooking - Creates a booking with given parameters in our calendar
 * removeBooking - Removes a booking with given parameters from our calendar
 * setAsActive - Sets a booking as active
 *
 * @see maintenancemodel.MaintenancemodelPackage#getIMaintenanceProvidesForBooking()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface IMaintenanceProvidesForBooking extends EObject {
	
	/**
	 * A method that checks if a booking can be made with given parameters
	 * @return boolean: true if booking is possible, else false.
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated NOT
	 */
	boolean canBook(String roomType, String start, String end);

	/**
<<<<<<< HEAD
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated
=======
	 * A method that creates a booking with given parameters in our calendar
	 * @return int: 0 if successful, else int to be connected with an error-message
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated NOT
>>>>>>> branch 'classcodegens' of https://github.com/dannylam/ogretel.git
	 */
	int makeBooking(String roomType, String start, String end);

	/**
	 * A method that removes a booking with given parameters from our calendar
	 * @return int: 0 if successful, else int to be connected with an error-message
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated NOT
	 */
	int removeBooking(String roomType, int nrOfRooms, String start, String end);

	/**
	 * A method to set a booking as active
	 * @return int: 0 is successful, else int to be connected with an error-message
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int setBookingAsActive(String bookingRef);

} // IMaintenanceProvidesForBooking
