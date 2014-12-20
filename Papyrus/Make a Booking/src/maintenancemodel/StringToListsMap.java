/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String To Lists Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.StringToListsMap#getKey <em>Key</em>}</li>
 *   <li>{@link maintenancemodel.StringToListsMap#getRoomTypeCapTable <em>Room Type Cap Table</em>}</li>
 *   <li>{@link maintenancemodel.StringToListsMap#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.ModelPackage#getStringToListsMap()
 * @model
 * @generated
 */
public interface StringToListsMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see maintenancemodel.ModelPackage#getStringToListsMap_Key()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link maintenancemodel.StringToListsMap#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Room Type Cap Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type Cap Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type Cap Table</em>' reference.
	 * @see #setRoomTypeCapTable(StringToListsMap)
	 * @see maintenancemodel.ModelPackage#getStringToListsMap_RoomTypeCapTable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StringToListsMap getRoomTypeCapTable();

	/**
	 * Sets the value of the '{@link maintenancemodel.StringToListsMap#getRoomTypeCapTable <em>Room Type Cap Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type Cap Table</em>' reference.
	 * @see #getRoomTypeCapTable()
	 * @generated
	 */
	void setRoomTypeCapTable(StringToListsMap value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see maintenancemodel.ModelPackage#getStringToListsMap_Value()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Integer> getValue();

} // StringToListsMap
