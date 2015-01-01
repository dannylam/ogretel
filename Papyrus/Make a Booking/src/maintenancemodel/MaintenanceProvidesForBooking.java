/**
 */
package maintenancemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>Maintenance Provides For Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.MaintenanceProvidesForBooking#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link maintenancemodel.MaintenanceProvidesForBooking#getRooms <em>Rooms</em>}</li>
 *   <li>{@link maintenancemodel.MaintenanceProvidesForBooking#getExtraHandler <em>Extra Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.MaintenancemodelPackage#getMaintenanceProvidesForBooking()
 * @model
 * @generated
 */
public interface MaintenanceProvidesForBooking extends IMaintenanceProvidesForBooking {
	/**
	 * Returns the value of the '<em><b>Room Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Types</em>' containment reference.
	 * @see #setRoomTypes(RoomTypesHandler)
	 * @see maintenancemodel.MaintenancemodelPackage#getMaintenanceProvidesForBooking_RoomTypes()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RoomTypesHandler getRoomTypes();

	/**
	 * Sets the value of the '{@link maintenancemodel.MaintenanceProvidesForBooking#getRoomTypes <em>Room Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Types</em>' containment reference.
	 * @see #getRoomTypes()
	 * @generated
	 */
	void setRoomTypes(RoomTypesHandler value);

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
	 * @see maintenancemodel.MaintenancemodelPackage#getMaintenanceProvidesForBooking_Rooms()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RoomHandler getRooms();

	/**
	 * Sets the value of the '{@link maintenancemodel.MaintenanceProvidesForBooking#getRooms <em>Rooms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rooms</em>' containment reference.
	 * @see #getRooms()
	 * @generated
	 */
	void setRooms(RoomHandler value);

	/**
	 * Returns the value of the '<em><b>Extra Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Handler</em>' containment reference.
	 * @see #setExtraHandler(ExtraHandler)
	 * @see maintenancemodel.MaintenancemodelPackage#getMaintenanceProvidesForBooking_ExtraHandler()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ExtraHandler getExtraHandler();

	/**
	 * Sets the value of the '{@link maintenancemodel.MaintenanceProvidesForBooking#getExtraHandler <em>Extra Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Handler</em>' containment reference.
	 * @see #getExtraHandler()
	 * @generated
	 */
	void setExtraHandler(ExtraHandler value);

} // MaintenanceProvidesForBooking
