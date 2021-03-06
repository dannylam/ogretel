/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>Room Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.RoomHandler#getIntegerToRoomMap <em>Integer To Room Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.MaintenancemodelPackage#getRoomHandler()
 * @model
 * @generated
 */
public interface RoomHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Integer To Room Map</b></em>' map.
	 * The key is of type {@link java.lang.Integer},
	 * and the value is of type {@link maintenancemodel.Room},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer To Room Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer To Room Map</em>' map.
	 * @see maintenancemodel.MaintenancemodelPackage#getRoomHandler_IntegerToRoomMap()
	 * @model mapType="maintenancemodel.IntegerToRoomEntry<org.eclipse.emf.ecore.EIntegerObject, maintenancemodel.Room>" ordered="false"
	 * @generated
	 */
	EMap<Integer, Room> getIntegerToRoomMap();

	/**
	 * <!-- begin-user-doc -->
	 * Checks if the room exists in the system.
	 * @return true if there is a Room with roomID given by inparam
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	boolean exists(int roomID);

	/**
	 * <!-- begin-user-doc -->
	 * Adds a room to the system.
	 * @return
	 * 0 if successful
	 * 1 if not successful
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated NOT
	 */
	int addRoom(int roomID, RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * Removes a room from the system.
	 * @return
	 * 0 if successful
	 * 1 if not successful
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	int removeRoom(int roomID);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the room.
	 * @return the room with given roomID
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	Room getRoom(int roomID);

} // RoomHandler
