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
 *   <li>{@link maintenancemodel.RoomTypesHandler#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link maintenancemodel.RoomTypesHandler#getStringToRoomType <em>String To Room Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.ModelPackage#getRoomTypesHandler()
 * @maintenancemodel
 * @generated
 */
public interface RoomTypesHandler extends EObject {
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
	 * @see maintenancemodel.ModelPackage#getRoomTypesHandler_RoomType()
	 * @maintenancemodel ordered="false"
	 * @generated
	 */
	EList<RoomType> getRoomType();

	/**
	 * Returns the value of the '<em><b>String To Room Type</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link maintenancemodel.RoomTypeEnum},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String To Room Type</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String To Room Type</em>' map.
	 * @see maintenancemodel.ModelPackage#getRoomTypesHandler_StringToRoomType()
	 * @maintenancemodel mapType="maintenancemodel.StringToRoomType<org.eclipse.emf.ecore.EString, maintenancemodel.RoomTypeEnum>" ordered="false"
	 * @generated
	 */
	EMap<String, RoomTypeEnum> getStringToRoomType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	boolean exists(int ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @maintenancemodel roomTypeRequired="true" roomTypeOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" maxNrOfGuestsDataType="org.eclipse.uml2.types.Integer" maxNrOfGuestsRequired="true" maxNrOfGuestsOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void addRoomType(String roomType, int price, int maxNrOfGuests, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @maintenancemodel roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void removeRoomType(RoomType roomType);

} // RoomTypesHandler
