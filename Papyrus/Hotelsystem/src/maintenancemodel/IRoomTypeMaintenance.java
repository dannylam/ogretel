/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Type Maintenance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see maintenancemodel.MaintenancemodelPackage#getIRoomTypeMaintenance()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomTypeMaintenance extends EObject {
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
	 * @return List of the current RoomType IDs.
	 * 
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String"
	 *        ordered="false"
	 * @generated NOT
	 */
	EList<String> getRoomTypeIDs();

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
	 * Makes it simpler for user of the system to choose a correct RoomTypeEnum.
	 * 
	 * @return a list of Strings of the RoomTypeEnum
	 * 
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String"
	 *        ordered="false"
	 * @generated NOT
	 */
	EList<String> getRoomTypeEnums();

} // IRoomTypeMaintenance
