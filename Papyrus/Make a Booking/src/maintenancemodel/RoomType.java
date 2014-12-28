/**
 */
package maintenancemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.RoomType#getPrice <em>Price</em>}</li>
 *   <li>{@link maintenancemodel.RoomType#getMaxNrOfGuests <em>Max Nr Of Guests</em>}</li>
 *   <li>{@link maintenancemodel.RoomType#getDescription <em>Description</em>}</li>
 *   <li>{@link maintenancemodel.RoomType#getRoomTypeEnum <em>Room Type Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.MaintenancemodelPackage#getRoomType()
 * @model
 * @generated
 */
public interface RoomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see maintenancemodel.MaintenancemodelPackage#getRoomType_Price()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link maintenancemodel.RoomType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Max Nr Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Nr Of Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Nr Of Guests</em>' attribute.
	 * @see #setMaxNrOfGuests(int)
	 * @see maintenancemodel.MaintenancemodelPackage#getRoomType_MaxNrOfGuests()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMaxNrOfGuests();

	/**
	 * Sets the value of the '{@link maintenancemodel.RoomType#getMaxNrOfGuests <em>Max Nr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Nr Of Guests</em>' attribute.
	 * @see #getMaxNrOfGuests()
	 * @generated
	 */
	void setMaxNrOfGuests(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see maintenancemodel.MaintenancemodelPackage#getRoomType_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link maintenancemodel.RoomType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Room Type Enum</b></em>' attribute.
	 * The literals are from the enumeration {@link maintenancemodel.RoomTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type Enum</em>' attribute.
	 * @see maintenancemodel.RoomTypeEnum
	 * @see #setRoomTypeEnum(RoomTypeEnum)
	 * @see maintenancemodel.MaintenancemodelPackage#getRoomType_RoomTypeEnum()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomTypeEnum getRoomTypeEnum();

	/**
	 * Sets the value of the '{@link maintenancemodel.RoomType#getRoomTypeEnum <em>Room Type Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type Enum</em>' attribute.
	 * @see maintenancemodel.RoomTypeEnum
	 * @see #getRoomTypeEnum()
	 * @generated
	 */
	void setRoomTypeEnum(RoomTypeEnum value);

} // RoomType
