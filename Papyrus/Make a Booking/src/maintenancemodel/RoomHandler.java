/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link maintenancemodel.RoomHandler#getRoom <em>Room</em>}</li>
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
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link maintenancemodel.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see maintenancemodel.MaintenancemodelPackage#getRoomHandler_Room()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> getRoom();

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
	 * @model mapType="maintenancemodel.IntegerToRoomMap<org.eclipse.emf.ecore.EIntegerObject, maintenancemodel.Room>" ordered="false"
	 * @generated
	 */
	EMap<Integer, Room> getIntegerToRoomMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	boolean exists(int ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" numberIDDataType="org.eclipse.uml2.types.Integer" numberIDRequired="true" numberIDOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	int addRoom(int numberID, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	int removeRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	Room getRoom(int ID);

} // RoomHandler
