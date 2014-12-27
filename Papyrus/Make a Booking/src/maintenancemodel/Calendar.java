/**
 */
package maintenancemodel;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.Calendar#getRoomTypeCapTable <em>Room Type Cap Table</em>}</li>
 *   <li>{@link maintenancemodel.Calendar#getStringToListsMap <em>String To Lists Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.ModelPackage#getCalendar()
 * @maintenancemodel
 * @generated
 */
public interface Calendar extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Type Cap Table</b></em>' reference list.
	 * The list contents are of type {@link maintenancemodel.RoomTypesHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type Cap Table</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type Cap Table</em>' reference list.
	 * @see maintenancemodel.ModelPackage#getCalendar_RoomTypeCapTable()
	 * @maintenancemodel ordered="false"
	 * @generated
	 */
	EList<RoomTypesHandler> getRoomTypeCapTable();

	/**
	 * Returns the value of the '<em><b>String To Lists Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String To Lists Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String To Lists Map</em>' map.
	 * @see #setStringToListsMap(Map.Entry)
	 * @see maintenancemodel.ModelPackage#getCalendar_StringToListsMap()
	 * @maintenancemodel mapType="maintenancemodel.StringToListsMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>" ordered="false"
	 * @generated
	 */
	Map.Entry<String, EList<Integer>> getStringToListsMap();

	/**
	 * Sets the value of the '{@link maintenancemodel.Calendar#getStringToListsMap <em>String To Lists Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String To Lists Map</em>' map.
	 * @see #getStringToListsMap()
	 * @generated
	 */
	void setStringToListsMap(Map.Entry<String, EList<Integer>> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" ordered="false" startDataType="org.eclipse.uml2.types.Integer" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.Integer" endRequired="true" endOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	EList<Integer> getCap(int start, int end, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @maintenancemodel startDataType="org.eclipse.uml2.types.Integer" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.Integer" endRequired="true" endOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false"
	 * @generated
	 */
	void setCap(int start, int end, String roomType, int nrOfRooms);

} // Calendar
