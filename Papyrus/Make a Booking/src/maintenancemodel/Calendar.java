/**
 */
package maintenancemodel;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.Calendar#getStringToListsMap <em>String To Lists Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.MaintenancemodelPackage#getCalendar()
 * @model
 * @generated
 */
public interface Calendar extends EObject {
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
	 * @see maintenancemodel.MaintenancemodelPackage#getCalendar_StringToListsMap()
	 * @model mapType="maintenancemodel.StringToListsMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>" ordered="false"
	 * @generated NOT
	 */
	EMap<String, EList<Integer>> getStringToListsMap();

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
	 * Sets the value of the '{@link maintenancemodel.Calendar#getStringToListsMap <em>String To Lists Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String To Lists Map</em>' map.
	 * @see #getStringToListsMap()
	 * @generated NOT
	 */
	void setStringToListsMap(EMap<String, EList<Integer>> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false" startDataType="org.eclipse.uml2.types.Integer" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.Integer" endRequired="true" endOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated NOT
	 */
	Integer getCap(int start, int end, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" startDataType="org.eclipse.uml2.types.Integer" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.Integer" endRequired="true" endOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false"
	 * @generated
	 */
	int setCap(int start, int end, String roomType, int nrOfRooms);

} // Calendar
