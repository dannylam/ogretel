/**
 */
package maintenancemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>IRoom Maintenance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see maintenancemodel.MaintenancemodelPackage#getIRoomMaintenance()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomMaintenance extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	int addRoom(int roomID, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	int removeRoom(int roomID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false" roomTypeEnumDataType="org.eclipse.uml2.types.String" roomTypeEnumRequired="true" roomTypeEnumOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" maxNrOfGuestsDataType="org.eclipse.uml2.types.Integer" maxNrOfGuestsRequired="true" maxNrOfGuestsOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
<<<<<<< HEAD
	int addRoomType(String roomTypeID, String roomTypeEnum, int price, int maxNrOfGuests, String description);
=======
	int addRoomType(String roomTypeID, String roomType, int price, int maxNrOfGuests, String description);
>>>>>>> branch 'classcodegens' of https://github.com/dannylam/ogretel.git

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int removeRoomType(String roomTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	RoomHandler getRoomHandler();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	RoomTypesHandler getRoomTypeHandler();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	Room getRoom(int roomID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	RoomType getRoomType(String roomTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false" statusDataType="org.eclipse.uml2.types.String" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	int editRoomStatus(int roomID, String status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	String getRoomStatus(int roomID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false" roomTypeEnumDataType="org.eclipse.uml2.types.String" roomTypeEnumRequired="true" roomTypeEnumOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" maxNrOfGuestsDataType="org.eclipse.uml2.types.Integer" maxNrOfGuestsRequired="true" maxNrOfGuestsOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	int editRoomType(String roomTypeID, String roomTypeEnum, int price, int maxNrOfGuests, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int editRoom(int roomID, String roomTypeID);

} // IRoomMaintenance
