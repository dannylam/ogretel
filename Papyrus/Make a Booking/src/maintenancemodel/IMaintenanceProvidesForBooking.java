/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 *
 * @see maintenancemodel.MaintenancemodelPackage#getIMaintenanceProvidesForBooking()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IMaintenanceProvidesForBooking extends EObject {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false" roomTypeIDsDataType="org.eclipse.uml2.types.String" roomTypeIDsMany="true" roomTypeIDsOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated
	 */
	boolean canBook(EList<String> roomTypeIDs, String start, String end);

	/**
	 * A method that creates a booking with given parameters in our calendar
	 * @return int: 0 if successful, else int to be connected with an error-message
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated NOT
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDsDataType="org.eclipse.uml2.types.String" roomTypeIDsMany="true" roomTypeIDsOrdered="false"
	 * @generated
	 */
	int getPriceRoom(EList<String> roomTypeIDs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDsDataType="org.eclipse.uml2.types.Integer" extraIDsMany="true" extraIDsOrdered="false"
	 * @generated
	 */
	int getPriceExtra(EList<Integer> extraIDs);

} // IMaintenanceProvidesForBooking
