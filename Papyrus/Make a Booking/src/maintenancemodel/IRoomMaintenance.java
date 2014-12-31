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
	 * @return
	 * 0 if success
	 * 1 if roomTypeID does not exist
	 * 2 if roomID not unique
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
	 * @return
	 * 0 if successful
	 * 1 if Room with roomID does not exist
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
	 * 0 if success
	 * 1 if roomTypeID incorrect
	 * 
	 * TODO finish documentation
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int removeRoomType(String roomTypeID);

	/**
	 * TODO finish documentation
	 * 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true"
	 *        ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer"
	 *        roomIDRequired="true" roomIDOrdered="false"
	 *        statusDataType="org.eclipse.uml2.types.String"
	 *        statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	int editRoomStatus(int roomID, String status);

	/**
	 * Edits the properties of a room to the given values.
	 * 
	 * @return
	 * 0 if successful
	 * 1 if 
	 * 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false" roomTypeEnumDataType="org.eclipse.uml2.types.String" roomTypeEnumRequired="true" roomTypeEnumOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" maxNrOfGuestsDataType="org.eclipse.uml2.types.Integer" maxNrOfGuestsRequired="true" maxNrOfGuestsOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false"
	 * @generated
	 */
	int editRoomType(String roomTypeID, String roomTypeEnum, int price, int maxNrOfGuests, String description, int nrOfRooms);

	/**
	 * TODO finish documentation
	 * 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true"
	 *        ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer"
	 *        roomIDRequired="true" roomIDOrdered="false"
	 *        roomTypeIDDataType="org.eclipse.uml2.types.String"
	 *        roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int editRoom(int roomID, String roomTypeID);

	/**
	 * TODO finish documentation
	 * 
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String"
	 *        ordered="false"
	 * @generated
	 */
	EList<Integer> getRoomIDs();

	/**
	 * TODO finish documentation
	 * 
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String"
	 *        ordered="false"
	 * @generated
	 */
	EList<String> getRoomTypeIDs();

	/**
	 * TODO finish documentation
	 * 
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer"
	 *        roomIDRequired="true" roomIDOrdered="false"
	 * @generated
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
	 * @return a String of the RoomTypeEnum belonging to the RoomType indicated by the
	 *         inparam roomTypeID, null if roomTypeID doesn't exist
	 * 
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String"
	 *        roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated NOT
	 */
	String getRoomTypeEnum(String roomTypeID);

	/**
	 * TODO finish documentation
	 * 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true"
	 *        ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String"
	 *        roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int getRoomTypePrice(String roomTypeID);

	/**
	 * TODO finish documentation
	 * 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true"
	 *        ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String"
	 *        roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int getRoomTypeMaxNrOfGuests(String roomTypeID);

	/**
	 * TODO finish documentation
	 * 
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 *        ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String"
	 *        roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	String getRoomTypeDescription(String roomTypeID);

	/**
	 * TODO finish documentation
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int getNrOfRoomsofType(String roomTypeID);

} // IRoomMaintenance
