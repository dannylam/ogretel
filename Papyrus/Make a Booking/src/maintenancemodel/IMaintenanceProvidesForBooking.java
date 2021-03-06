/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the maintenancemodel object '<em><b>IMaintenance Provides For Booking</b></em>'.
 * 
 * @see maintenancemodel.MaintenancemodelPackage#getIMaintenanceProvidesForBooking()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IMaintenanceProvidesForBooking extends EObject {
	/**
	 * A method that checks if a booking can be made with given parameters
	 * @return
	 * true if booking is possible
	 * false if booking is not possible
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomTypeIDsDataType="org.eclipse.uml2.types.String" roomTypeIDsMany="true" roomTypeIDsOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false" nrOfGuestsDataType="org.eclipse.uml2.types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false"
	 * @generated NOT
	 */
	boolean canBook(EList<String> roomTypeIDs, String start, String end, int nrOfGuests);

	/**
	 * Edits the availability in the system according to booking.
	 * @return
	 * 0 if successful
	 * 1 if any String entry in the List couldn't be added to the system.
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDsDataType="org.eclipse.uml2.types.String" roomTypeIDsRequired="true" roomTypeIDsMany="true" roomTypeIDsOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false" nrOfGuestsDataType="org.eclipse.uml2.types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false"
	 * @generated NOT
	 */
	int makeBooking(EList<String> roomTypeIDs, String start, String end, int nrOfGuests);

	/**
	 * Removes a booking from the system.
	 * @return
	 * 0 if successful
	 * 1 if any String entry in the List is doesn't match with the start and end date. 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDMany="true" roomTypeIDOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated NOT
	 */
	int removeBooking(EList<String> roomTypeID, String start, String end);

	/**
	 * Sets a room of roomTypeID as active
	 * @return
	 * roomID if successful
	 * -1 if roomTypeID is invalid
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated NOT
	 */
	int setActive(String roomTypeID);

	/**
	 * Get the price of all rooms in the EList
	 * @return
	 * the sum of the prices of the RoomTypes indicated by the String entries in the List roomTypeIDs
	 * -1 if any String entry in the List is invalid   
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDsDataType="org.eclipse.uml2.types.String" roomTypeIDsMany="true" roomTypeIDsOrdered="false"
	 * @generated NOT
	 */
	int getPriceRoom(EList<String> roomTypeIDs);

	/**
	 * Gets the price of all extras in the EList
	 * @return
	 * the sum of the prices of the Extras indicated by the String entries in the List extraIDs
	 * -1 if any String entry in the List is invalid   
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDsMany="true" extraIDsOrdered="false"
	 * @generated NOT
	 */
	int getPriceExtra(EList<String> extraIDs);

	/**
	 * Sets a room of roomTypeID as inactive
	 * @return
	 * 0 if successful
	 * 1 if roomID invalid
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	int setInactive(int roomID);

} // IMaintenanceProvidesForBooking
