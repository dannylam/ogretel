/**
 */
package maintenancemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>IMaintenance Provides For Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see maintenancemodel.MaintenancemodelPackage#getIMaintenanceProvidesForBooking()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IMaintenanceProvidesForBooking extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated
	 */
	boolean canBook(String roomType, String start, String end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated
	 */
	void makeBooking(String roomType, String start, String end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false" startDataType="org.eclipse.uml2.types.String" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.String" endRequired="true" endOrdered="false"
	 * @generated
	 */
	int removeBooking(String roomType, int nrOfRooms, String start, String end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	int setBookingAsActive(String bookingRef);

} // IMaintenanceProvidesForBooking
