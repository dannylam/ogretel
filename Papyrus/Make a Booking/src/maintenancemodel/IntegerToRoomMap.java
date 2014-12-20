/**
 */
package maintenancemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer To Room Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.IntegerToRoomMap#getKey <em>Key</em>}</li>
 *   <li>{@link maintenancemodel.IntegerToRoomMap#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.ModelPackage#getIntegerToRoomMap()
 * @model
 * @generated
 */
public interface IntegerToRoomMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(int)
	 * @see maintenancemodel.ModelPackage#getIntegerToRoomMap_Key()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getKey();

	/**
	 * Sets the value of the '{@link maintenancemodel.IntegerToRoomMap#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Room)
	 * @see maintenancemodel.ModelPackage#getIntegerToRoomMap_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getValue();

	/**
	 * Sets the value of the '{@link maintenancemodel.IntegerToRoomMap#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Room value);

} // IntegerToRoomMap
