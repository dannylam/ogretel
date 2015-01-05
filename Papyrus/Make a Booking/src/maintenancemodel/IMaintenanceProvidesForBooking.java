/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;
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
 * @generated
 */
public interface IMaintenanceProvidesForBooking extends EObject {

	/**
	 * A method that checks if a booking can be made with given parameters
	 * 
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 *        roomTypeIDsDataType="org.eclipse.uml2.types.String"
	 *        roomTypeIDsMany="true" roomTypeIDsOrdered="false"
	 *        startDataType="org.eclipse.uml2.types.String" startRequired="true"
	 *        startOrdered="false" endDataType="org.eclipse.uml2.types.String"
	 *        endRequired="true" endOrdered="false"
	 * @generated NOT
	 */
	boolean canBook(EList<String> roomTypeIDs, String start, String end);

	/**
	 * <!-- begin-user-doc -->
	 * Edits the availability in the system according to booking.
	 * @return
	 * 0 if successful
	 * 1 if any String entry in the List couldn't be added to the system.
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDsDataType="org.eclipse.uml2.types.String" roomTypeIDsRequired="true" roomTypeIDsMany="true" roomTypeIDsOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated NOT
	 */
	int makeBooking(EList<String> roomTypeIDs, String start, String end);

	/**
	 * <!-- begin-user-doc -->
	 * Removes a booking from the system.
	 * @return
	 * 0 if successful
	 * 1 if any String entry in the List is doesn't match with the start and end date. 
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDMany="true" roomTypeIDOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated NOT
	 */
	int removeBooking(EList<String> roomTypeID, String start, String end);

	/**
	 * <!-- begin-user-doc -->
	 * @return
	 * roomID if successful
	 * -1 if roomTypeID is invalid
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int setActive(String roomTypeID);

	/**
	 * <!-- begin-user-doc --> 
	 * @return
	 * the sum of the prices of the RoomTypes indicated by the String entries in the List roomTypeIDs
	 * -1 if any String entry in the List is invalid   
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDsDataType="org.eclipse.uml2.types.String" roomTypeIDsMany="true" roomTypeIDsOrdered="false"
	 * @generated NOT
	 */
	int getPriceRoom(EList<String> roomTypeIDs);

	/**
	 * <!-- begin-user-doc -->
	 * @return
	 * the sum of the prices of the Extras indicated by the String entries in the List extraIDs
	 * -1 if any String entry in the List is invalid   
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDsMany="true" extraIDsOrdered="false"
	 * @generated NOT
	 */
	int getPriceExtra(EList<String> extraIDs);

	/**
	 * <!-- begin-user-doc -->
	 * @return
	 * 0 if successful
	 * 1 if roomID invalid
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	int setInactive(int roomID);

} // IMaintenanceProvidesForBooking
