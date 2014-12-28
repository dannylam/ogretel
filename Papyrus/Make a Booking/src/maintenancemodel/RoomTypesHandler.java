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
	 * @model mapType="maintenancemodel.StringToRoomType<org.eclipse.emf.ecore.EString, maintenancemodel.RoomType>" ordered="false"
	 * @generated
	 */
	EMap<String, RoomType> getStringToRoomType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" IDDataType="org.eclipse.uml2.types.String" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	boolean exists(String ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false" roomTypeEnumRequired="true" roomTypeEnumOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" maxNrOfGuestsDataType="org.eclipse.uml2.types.Integer" maxNrOfGuestsRequired="true" maxNrOfGuestsOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	int addRoomType(String roomTypeID, String roomTypeEnum, int price, int maxNrOfGuests, String description);

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
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int getPrice(String roomTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getRoomTypes();

} // RoomTypesHandler
