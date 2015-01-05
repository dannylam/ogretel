/**
 */
package maintenancemodel;

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
	 * @see #setStringToListsMap(EMap)
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
	 * @generated NOT
	 */
	void setStringToListsMap(EMap<String, EList<Integer>> value);

	/**
	 * <!-- begin-user-doc -->
	 * Get the lowest capacity (free rooms) of the days in the interval.
	 * 
	 * @param start
	 *            amount of days from now that the interval starts.
	 * @param end
	 *            amount of days from now that the interval ends.
	 * @param roomType
	 *            the roomtypeID to get capacity for
	 *            
	 * @return int of available rooms of roomtype
	 * 
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false" startDataType="org.eclipse.uml2.types.Integer" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.Integer" endRequired="true" endOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated NOT
	 */
	Integer getCap(int start, int end, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * Add or remove rooms from the capacity (number of
	 * free rooms) of the days in the interval for the roomtype.
	 * 
	 * @param start
	 *            amount of days from now that the interval starts.
	 * @param end
	 *            amount of days from now that the interval ends.
	 * @param roomType
	 *            the roomtypeID to set capacity for
	 * @param nrOfRooms
	 *            number of rooms to add or remove. If the number is >= 0 they
	 *            will be added, and if the number is < 0 they will be removed.
	 * @return 0 if everything went ok else 1. 
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" startDataType="org.eclipse.uml2.types.Integer" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.Integer" endRequired="true" endOrdered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false"
	 * @generated NOT
	 */
	int setCap(int start, int end, String roomTypeID, int nrOfRooms);

	/**
	 * <!-- begin-user-doc -->
	 * Increases the capacity during given date for the given roomtype.
	 * @return
	 * 0 if successful
	 * 1 if roomType invalid
	 * 2 if start < 0
	 * 3 if end out of bounds
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" startDataType="org.eclipse.uml2.types.Integer" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.Integer" endRequired="true" endOrdered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false" incrementDataType="org.eclipse.uml2.types.Integer" incrementRequired="true" incrementOrdered="false"
	 * @generated
	 */
	int incCap(int start, int end, String roomTypeID, int increment);

	/**
	 * <!-- begin-user-doc -->
	 * Decreases the capacity during given date for the given roomtype.
	 * @return
	 * 0 if successful
	 * 1 if roomType invalid
	 * 2 if decCap would result in cap < 0 
	 * 3 if start < 0
	 * 4 if end out of bounds
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" startDataType="org.eclipse.uml2.types.Integer" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.Integer" endRequired="true" endOrdered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false" decrementDataType="org.eclipse.uml2.types.Integer" decrementRequired="true" decrementOrdered="false"
	 * @generated
	 */
	int decCap(int start, int end, String roomTypeID, int decrement);

	/**
	 * <!-- begin-user-doc -->
	 * @return
	 * 0 if successfully added
	 * 1 if roomTypeID already part of entry in Map
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int addEntry(String roomTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * @return
	 * 0 if successfully added
	 * 1 if roomTypeID invalid
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeIDDataType="org.eclipse.uml2.types.String" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int removeEntry(String roomTypeID);

} // Calendar
