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
	 * @model mapType="maintenancemodel.IntegerToExtraMap<org.eclipse.emf.ecore.EString, maintenancemodel.Extra>" ordered="false"
	 * @generated
	 */
	EMap<String, Extra> getIntToExtraMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" extraIDRequired="true" extraIDOrdered="false"
	 * @generated
	 */
	boolean exists(String extraID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDRequired="true" extraIDOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" isProductDataType="org.eclipse.uml2.types.Boolean" isProductRequired="true" isProductOrdered="false"
	 * @generated
	 */
	int addExtra(String extraID, int price, String name, String description, boolean isProduct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDRequired="true" extraIDOrdered="false"
	 * @generated
	 */
	int removeExtra(String extraID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getExtras();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDDataType="org.eclipse.uml2.types.String" extraIDRequired="true" extraIDOrdered="false"
	 * @generated
	 */
	int getPrice(String extraID);

	/**
	 * <!-- begin-user-doc -->
	 * Returns null if there is no Extra with that key
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	
	public Extra getExtra(int ID);

} // ExtraHandler
