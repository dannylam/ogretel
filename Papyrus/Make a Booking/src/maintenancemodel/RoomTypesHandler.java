/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>Room Types Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.RoomTypesHandler#getStringToRoomType <em>String To Room Type</em>}</li>
 *   <li>{@link maintenancemodel.RoomTypesHandler#getCalendar <em>Calendar</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.MaintenancemodelPackage#getRoomTypesHandler()
 * @model
 * @generated
 */
public interface RoomTypesHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>String To Room Type</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link maintenancemodel.RoomType},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String To Room Type</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String To Room Type</em>' map.
	 * @see maintenancemodel.MaintenancemodelPackage#getRoomTypesHandler_StringToRoomType()
	 * @model mapType="maintenancemodel.StringToRoomTypeEntry<org.eclipse.emf.ecore.EString, maintenancemodel.RoomType>" ordered="false"
	 * @generated
	 */
	EMap<String, RoomType> getStringToRoomType();

	/**
	 * <!-- begin-user-doc -->
	 * Checks if the roomtype exists in the system.
	 * @return true if roomTypeID valid, else false
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	boolean exists(String roomTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * Adds a roomtype to the system
	 * @return
	 * 0 if successful
	 * 1 if roomTypeID invalid
	 * 2 if roomTypeEnum invalid
	 * 3 if maxNrOfGuests <= 0
	 * 4 if price < 0
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false" roomTypeEnumDataType="org.eclipse.uml2.types.String" roomTypeEnumRequired="true" roomTypeEnumOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" maxNrOfGuestsDataType="org.eclipse.uml2.types.Integer" maxNrOfGuestsRequired="true" maxNrOfGuestsOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	int addRoomType(String roomTypeID, String roomTypeEnum, int price, int maxNrOfGuests, String description);

	/**
	 * <!-- begin-user-doc --> Remove the RoomType sent in from the list of
	 * known objects of the RoomType class.
	 * @return
	 * 0 if it was removed 
	 * 1 else
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int removeRoomType(String roomTypeID);


	/**
	 * <!-- begin-user-doc -->
	 * @return
	 * price if roomTypeID valid
	 * -1 otherwise
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int getPrice(String roomTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * @return List of all RoomTypeIDs currently in the system
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getRoomTypeIDs();

	/**
	 * <!-- begin-user-doc -->
	 * @return RoomType indicated by roomTypeID, null if invalid
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	RoomType getRoomType(String roomTypeID);

	/**
	 * Returns the value of the '<em><b>Calendar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar</em>' containment reference.
	 * @see #setCalendar(Calendar)
	 * @see maintenancemodel.MaintenancemodelPackage#getRoomTypesHandler_Calendar()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Calendar getCalendar();

	/**
	 * Sets the value of the '{@link maintenancemodel.RoomTypesHandler#getCalendar <em>Calendar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar</em>' containment reference.
	 * @see #getCalendar()
	 * @generated
	 */
	void setCalendar(Calendar value);

	/**
	 * <!-- begin-user-doc -->
	 * @return List of Strings of the available RoomTypeEnums
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getRoomTypeEnums();

	/**
	 * <!-- begin-user-doc -->
	 * @return
	 * 0 if successful
	 * 1 if roomTypeID invalid
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated NOT
	 */
	int addRoomToRoomTypeEntry(String roomTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * @return
	 * 0 if successful
	 * 1 if roomTypeID invalid
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int removeRoomFromRoomTypeEntry(String roomTypeID);

} // RoomTypesHandler
