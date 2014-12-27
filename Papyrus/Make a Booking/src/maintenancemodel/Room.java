/**
 */
package maintenancemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.Room#getNumberID <em>Number ID</em>}</li>
 *   <li>{@link maintenancemodel.Room#getRoomStatusEnum <em>Room Status Enum</em>}</li>
 *   <li>{@link maintenancemodel.Room#getRoomType <em>Room Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.MaintenancemodelPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Number ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number ID</em>' attribute.
	 * @see #setNumberID(int)
	 * @see maintenancemodel.MaintenancemodelPackage#getRoom_NumberID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberID();

	/**
	 * Sets the value of the '{@link maintenancemodel.Room#getNumberID <em>Number ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number ID</em>' attribute.
	 * @see #getNumberID()
	 * @generated
	 */
	void setNumberID(int value);

	/**
	 * Returns the value of the '<em><b>Room Status Enum</b></em>' attribute.
	 * The literals are from the enumeration {@link maintenancemodel.RoomStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Status Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Status Enum</em>' attribute.
	 * @see maintenancemodel.RoomStatusEnum
	 * @see #setRoomStatusEnum(RoomStatusEnum)
	 * @see maintenancemodel.MaintenancemodelPackage#getRoom_RoomStatusEnum()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomStatusEnum getRoomStatusEnum();

	/**
	 * Sets the value of the '{@link maintenancemodel.Room#getRoomStatusEnum <em>Room Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Status Enum</em>' attribute.
	 * @see maintenancemodel.RoomStatusEnum
	 * @see #getRoomStatusEnum()
	 * @generated
	 */
	void setRoomStatusEnum(RoomStatusEnum value);

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' reference.
	 * @see #setRoomType(RoomType)
	 * @see maintenancemodel.MaintenancemodelPackage#getRoom_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link maintenancemodel.Room#getRoomType <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' reference.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

} // Room
