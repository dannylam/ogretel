/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * An interface handling extras. 
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.ExtraHandler#getIntToExtraMap <em>Int To Extra Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.MaintenancemodelPackage#getExtraHandler()
 * @model
 * @generated NOT
 */
public interface ExtraHandler extends EObject {

	/**
	 * Returns the value of the '<em><b>Int To Extra Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link maintenancemodel.Extra},
	 * <p>
	 * If the meaning of the '<em>Int To Extra Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @return the value of the '<em>Int To Extra Map</em>' map.
	 * @see maintenancemodel.MaintenancemodelPackage#getExtraHandler_IntToExtraMap()
	 * @model mapType="maintenancemodel.IntegerToExtraEntry<org.eclipse.uml2.types.String, maintenancemodel.Extra>" ordered="false"
	 * @generated
	 */
	EMap<String, Extra> getIntToExtraMap();

	/**
	 * Returns if the element exists or not.
	 * @return true if there is a Extra with extraID given by inparam
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" extraIDDataType="org.eclipse.uml2.types.String" extraIDRequired="true" extraIDOrdered="false"
	 * @generated NOT
	 */
	boolean exists(String extraID);

	/**
	 * Adds an extra to the Map
	 * @param extraID 
	 * 		The extras ID
	 * @param price
	 * 		How muck an extra will cost
	 * @param name
	 * 		What the Extra is called
	 * @param description
	 * 		A short text to describe the extra.
	 * @param isProduct
	 * 		If true, the extra should be a product, else it is an experience.
	 * @return returns 1 if the ID already exists. Returns 0 if ok.
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDDataType="org.eclipse.uml2.types.String" extraIDRequired="true" extraIDOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" isProductDataType="org.eclipse.uml2.types.Boolean" isProductRequired="true" isProductOrdered="false"
	 * @generated NOT
	 */
	int addExtra(String extraID, int price, String name, String description, boolean isProduct);

	/**
	 * Removes an extra from the system
	 * @return
	 * Returns 1 if the Extra was failed to be removed.
	 * Returns 0 if everything was successful.
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDDataType="org.eclipse.uml2.types.String" extraIDRequired="true" extraIDOrdered="false"
	 * @generated NOT
	 */
	int removeExtra(String extraID);

	/**
	 * Returns a EList of extras
	 * @return EList with extras
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	EList<String> getExtras();

	/**
	 * Returns the price for the extra
	 * @return the price for the extra with given extraID
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDDataType="org.eclipse.uml2.types.String" extraIDRequired="true" extraIDOrdered="false"
	 * @generated NOT
	 */
	int getPrice(String extraID);

	/**
	 * Returns an extra
	 * @return the extra from given String, if no extra then returns null.
	 * @generated NOT
	 */
	public Extra getExtra(String ID);

} // ExtraHandler
