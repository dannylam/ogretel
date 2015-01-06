/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the maintenancemodel object '
 * <em><b>IRoom Maintenance</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see maintenancemodel.MaintenancemodelPackage#getIRoomMaintenance()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomMaintenance extends EObject {
	/**
	 * Adds a new room of the given room type to the system. The roomID must be
	 * unique and the roomTypeID must exist in the system. The integer returned
	 * by the function indicates success or failure and reason for failure.
	 * 
	 * @return 0 if success 1 if roomID not
	 *         unique 2 if roomTypeID does not exist
	 * 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true"
	 *        ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer"
	 *        roomIDRequired="true" roomIDOrdered="false"
	 *        roomTypeDataType="org.eclipse.uml2.types.String"
	 *        roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated NOT
	 */
	int addRoom(int roomID, String roomTypeID);

	/**
	 * Removes a Room from the system.
	 * 
	 * @return 0 if successful 1 if Room with roomID does not exist
	 * 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true"
	 *        ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer"
	 *        roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	int removeRoom(int roomID);

	/**
	 * If 0 is returned everything went fine If 1 is returned the status is not
	 * ok and nothing has been changed. If 2 is returned the roomID does not
	 * exist.
	 * 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true"
	 *        ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer"
	 *        roomIDRequired="true" roomIDOrdered="false"
	 *        statusDataType="org.eclipse.uml2.types.String"
	 *        statusRequired="true" statusOrdered="false"
	 * @generated NOT
	 */
	int editRoomStatus(int roomID, String status);

	/**
	 * Edit the Room with @param roomID. I.e. give it
	 * another (or same, if you feel like it...) RoomType.
	 * 
	 * @return 0 if success 1 if roomID not
	 *         unique 2 if roomTypeID does not exist
	 *          
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true"
	 *        ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer"
	 *        roomIDRequired="true" roomIDOrdered="false"
	 *        roomTypeIDDataType="org.eclipse.uml2.types.String"
	 *        roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated NOT
	 */
	int editRoom(int roomID, String roomTypeID);

	/**
	 * @return List of the current Room IDs.
	 * 
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String"
	 *        ordered="false"
	 * @generated NOT
	 */
	EList<Integer> getRoomIDs();

	/**
	 * @return
	 * String of RoomStatusEnum of Room indicated by roomID, otherwise null
	 * 
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer"
	 *        roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	String getRoomStatus(int roomID);

	/**
	 * Makes it simpler for user of the system to choose a correct
	 * RoomStatusEnum.
	 * 
	 * @return a list of Strings of the RoomStatusEnum
	 * 
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String"
	 *        ordered="false"
	 * @generated NOT
	 */
	EList<String> getRoomStatuses();

	/**
	 * @return
	 * RoomTypeID of RoomType of Room indicated by roomID
	 * null if roomID invalid
	 * 
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer"
	 *        roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	String getRoomTypeID(int roomID);
	
	/**
	 * <!-- begin-user-doc -->
	 * @return
	 * number of Rooms with RoomType indicated by roomTypeID
	 * -1 if roomTypeID invalid
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int getNrOfRoomsofType(String roomTypeID);

} // IRoomMaintenance
