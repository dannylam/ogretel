/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.RoomTypes#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link maintenancemodel.RoomTypes#getRoomTypeTable <em>Room Type Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.ModelPackage#getRoomTypes()
 * @model
 * @generated
 */
public interface RoomTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' reference list.
	 * The list contents are of type {@link maintenancemodel.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' reference list.
	 * @see maintenancemodel.ModelPackage#getRoomTypes_RoomType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomType> getRoomType();

	/**
	 * Returns the value of the '<em><b>Room Type Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type Table</em>' containment reference.
	 * @see #setRoomTypeTable(StringToRoomType)
	 * @see maintenancemodel.ModelPackage#getRoomTypes_RoomTypeTable()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringToRoomType getRoomTypeTable();

	/**
	 * Sets the value of the '{@link maintenancemodel.RoomTypes#getRoomTypeTable <em>Room Type Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type Table</em>' containment reference.
	 * @see #getRoomTypeTable()
	 * @generated
	 */
	void setRoomTypeTable(StringToRoomType value);

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
	 * @model roomTypeRequired="true" roomTypeOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" maxNrOfGuestsDataType="org.eclipse.uml2.types.Integer" maxNrOfGuestsRequired="true" maxNrOfGuestsOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void addRoomType(String roomType, int price, int maxNrOfGuests, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void removeRoomType(RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	RoomType getRoomType(String name);

} // RoomTypes
