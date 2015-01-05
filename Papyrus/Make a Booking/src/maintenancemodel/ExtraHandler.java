/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>Extra Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.ExtraHandler#getIntToExtraMap <em>Int To Extra Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.MaintenancemodelPackage#getExtraHandler()
 * @model
 * @generated
 */
public interface ExtraHandler extends EObject {

	/**
	 * Returns the value of the '<em><b>Int To Extra Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link maintenancemodel.Extra},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int To Extra Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int To Extra Map</em>' map.
	 * @see maintenancemodel.MaintenancemodelPackage#getExtraHandler_IntToExtraMap()
	 * @model mapType="maintenancemodel.IntegerToExtraEntry<org.eclipse.uml2.types.String, maintenancemodel.Extra>" ordered="false"
	 * @generated
	 */
	EMap<String, Extra> getIntToExtraMap();

	/**
	 * <!-- begin-user-doc -->
	 * Checks if the extra exists in the system.
	 * @return true if there is a Extra with extraID given by inparam
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" extraIDDataType="org.eclipse.uml2.types.String" extraIDRequired="true" extraIDOrdered="false"
	 * @generated NOT
	 */
	boolean exists(String extraID);

	/**
	 * <!-- begin-user-doc -->
	 * Adds an extra to the system
	 * @return
	 * 0 if successful
	 * 1 if not successful
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDDataType="org.eclipse.uml2.types.String" extraIDRequired="true" extraIDOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" isProductDataType="org.eclipse.uml2.types.Boolean" isProductRequired="true" isProductOrdered="false"
	 * @generated NOT
	 */
	int addExtra(String extraID, int price, String name, String description, boolean isProduct);

	/**
	 * <!-- begin-user-doc -->
	 * Removes an extra from the system
	 * @return
	 * 0 if successul
	 * 1 if not successful
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDDataType="org.eclipse.uml2.types.String" extraIDRequired="true" extraIDOrdered="false"
	 * @generated NOT
	 */
	int removeExtra(String extraID);

	/**
	 * <!-- begin-user-doc -->
	 * Returns an EList of extras
	 * @return EList of extras
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	EList<String> getExtras();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the price for the extra
	 * @return the price for the extra with given extraID
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDDataType="org.eclipse.uml2.types.String" extraIDRequired="true" extraIDOrdered="false"
	 * @generated NOT
	 */
	int getPrice(String extraID);

	/**
	 * <!-- begin-user-doc -->
	 * Returns an extra
	 * @return the extra from given String, if no extra then returns null.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Extra getExtra(String ID);

} // ExtraHandler
