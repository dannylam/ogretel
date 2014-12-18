/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.RoomHandler#getRoom <em>Room</em>}</li>
 *   <li>{@link maintenancemodel.RoomHandler#getRoomTable <em>Room Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.ModelPackage#getRoomHandler()
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
	 * @see maintenancemodel.ModelPackage#getRoomHandler_Room()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> getRoom();

	/**
	 * Returns the value of the '<em><b>Room Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Table</em>' containment reference.
	 * @see #setRoomTable(IntegerToRoomMap)
	 * @see maintenancemodel.ModelPackage#getRoomHandler_RoomTable()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	IntegerToRoomMap getRoomTable();

	/**
	 * Sets the value of the '{@link maintenancemodel.RoomHandler#getRoomTable <em>Room Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Table</em>' containment reference.
	 * @see #getRoomTable()
	 * @generated
	 */
	void setRoomTable(IntegerToRoomMap value);

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
	 * @model numberIDDataType="org.eclipse.uml2.types.Integer" numberIDRequired="true" numberIDOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void addRoom(int numberID, String roomType);

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

} // RoomHandler
