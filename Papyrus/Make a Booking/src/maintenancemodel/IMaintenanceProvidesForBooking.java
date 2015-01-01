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
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeMany="true" roomTypeOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated
	 */
	int makeBooking(EList<String> roomType, String start, String end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeMany="true" roomTypeOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated
	 */
	int removeBooking(EList<String> roomType, int nrOfRooms, String start, String end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int setActive(String roomTypeID);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDsDataType="org.eclipse.uml2.types.String" roomTypeIDsMany="true" roomTypeIDsOrdered="false"
	 * @generated
	 */
	int getPriceRoom(EList<String> roomTypeIDs);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDsMany="true" extraIDsOrdered="false"
	 * @generated
	 */
	int getPriceExtra(EList<String> extraIDs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	int setInactive(int roomID);

} // IMaintenanceProvidesForBooking
