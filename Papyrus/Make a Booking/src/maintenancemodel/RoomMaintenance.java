/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Maintenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.RoomMaintenance#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link maintenancemodel.RoomMaintenance#getRooms <em>Rooms</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.ModelPackage#getRoomMaintenance()
 * @model
 * @generated
 */
public interface RoomMaintenance extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Types</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Types</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Types</em>' reference.
	 * @see #setRoomTypes(RoomTypes)
	 * @see maintenancemodel.ModelPackage#getRoomMaintenance_RoomTypes()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomTypes getRoomTypes();

	/**
	 * Sets the value of the '{@link maintenancemodel.RoomMaintenance#getRoomTypes <em>Room Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Types</em>' reference.
	 * @see #getRoomTypes()
	 * @generated
	 */
	void setRoomTypes(RoomTypes value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference.
	 * @see #setRooms(RoomHandler)
	 * @see maintenancemodel.ModelPackage#getRoomMaintenance_Rooms()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RoomHandler getRooms();

	/**
	 * Sets the value of the '{@link maintenancemodel.RoomMaintenance#getRooms <em>Rooms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rooms</em>' containment reference.
	 * @see #getRooms()
	 * @generated
	 */
	void setRooms(RoomHandler value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	RoomTypes getRoomType(int ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void removeRoomType(String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void removeRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	Room getRoom(int ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" maxNrOfGuestsDataType="org.eclipse.uml2.types.Integer" maxNrOfGuestsRequired="true" maxNrOfGuestsOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void addRoomType(String roomType, int price, int maxNrOfGuests, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numberIDDataType="org.eclipse.uml2.types.Integer" numberIDRequired="true" numberIDOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void addRoom(int numberID, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	void editRoomStatus(int roomID, Enumerator status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	Enumerator getRoomStatus(int roomID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" maxNrOfGuestsDataType="org.eclipse.uml2.types.Integer" maxNrOfGuestsRequired="true" maxNrOfGuestsOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void editRoomType(String roomType, int price, int maxNrOfGuests, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numberIDDataType="org.eclipse.uml2.types.Integer" numberIDRequired="true" numberIDOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void editRoom(int numberID, String roomType);

} // RoomMaintenance
