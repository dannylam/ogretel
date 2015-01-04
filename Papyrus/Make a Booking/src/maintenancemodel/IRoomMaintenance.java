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
	 * Adds a RoomType with the given parameters.
	 * 
	 * @return
	 * 0 if successful
	 * 1 if roomTypeID invalid
	 * 2 if roomTypeEnum invalid
	 * 3 if maxNrOfGuests <= 0
	 * 4 if price < 0
	 * 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true"
	 *        ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String"
	 *        roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 *        roomTypeEnumDataType="org.eclipse.uml2.types.String"
	 *        roomTypeEnumRequired="true" roomTypeEnumOrdered="false"
	 *        priceDataType="org.eclipse.uml2.types.Integer"
	 *        priceRequired="true" priceOrdered="false"
	 *        maxNrOfGuestsDataType="org.eclipse.uml2.types.Integer"
	 *        maxNrOfGuestsRequired="true" maxNrOfGuestsOrdered="false"
	 *        descriptionDataType="org.eclipse.uml2.types.String"
	 *        descriptionRequired="true" descriptionOrdered="false"
	 * @generated NOT
	 */
	int addRoomType(String roomTypeID, String roomTypeEnum, int price,
			int maxNrOfGuests, String description);

	/**
	 * <!-- begin-user-doc --> Remove RoomType indicated by roomTypeID
	 * @return
	 * 0 if successful
	 * 1 otherwise <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated NOT
	 */
	int removeRoomType(String roomTypeID);

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
	 * <!-- begin-user-doc -->
	 * @return
	 * 0 if successful
	 * 1 if roomTypeID invalid
	 * 2 if roomTypeEnum invalid
	 * 3 if price < 0
	 * 4 if maxNrOfGuests < 0 <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false" roomTypeEnumDataType="org.eclipse.uml2.types.String" roomTypeEnumRequired="true" roomTypeEnumOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" maxNrOfGuestsDataType="org.eclipse.uml2.types.Integer" maxNrOfGuestsRequired="true" maxNrOfGuestsOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated NOT
	 */
	int editRoomType(String roomTypeID, String roomTypeEnum, int price,
			int maxNrOfGuests, String description);

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
	 * @return List of the current RoomType IDs.
	 * 
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String"
	 *        ordered="false"
	 * @generated NOT
	 */
	EList<String> getRoomTypeIDs();

	/**
	 * @return
	 * String of RoomStatusEnum of Room indicated by roomID, otherwise "failure"
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
	 * @return a String of the RoomTypeEnum belonging to the RoomType indicated
	 *         by the inparam roomTypeID, null if roomTypeID doesn't exist
	 * 
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String"
	 *        roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated NOT
	 */
	String getRoomTypeEnum(String roomTypeID);

	/**
	 * @return
	 * price of RoomType indicated by roomTypeID
	 * -1 if roomTypeID invalid
	 * 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true"
	 *        ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String"
	 *        roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated NOT
	 */
	int getRoomTypePrice(String roomTypeID);

	/**
	 * @return
	 * maxNrOfGuests of RoomType indicated by roomTypeID
	 * -1 if roomTypeID invalid
	 * 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true"
	 *        ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String"
	 *        roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated NOT
	 */
	int getRoomTypeMaxNrOfGuests(String roomTypeID);

	/**
	 * @return
	 * description of RoomType indicated by roomTypeID
	 * null if roomTypeID invalid
	 * 
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String"
	 *        roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated NOT
	 */
	String getRoomTypeDescription(String roomTypeID);

	/**
	 * @return
	 * RoomTypeID of RoomType of Room indicated by roomID
	 * "failure mohahah" if roomID invalid
	 * 
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer"
	 *        roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	String getRoomTypeID(int roomID);

	/**
	 * Makes it simpler for user of the system to choose a correct RoomTypeEnum.
	 * 
	 * @return a list of Strings of the RoomTypeEnum
	 * 
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String"
	 *        ordered="false"
	 * @generated NOT
	 */
	EList<String> getRoomTypeEnums();

} // IRoomMaintenance
