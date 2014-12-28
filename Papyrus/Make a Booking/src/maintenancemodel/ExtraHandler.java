/**
 */
package maintenancemodel;

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
	 * The key is of type {@link java.lang.Integer},
	 * and the value is of type {@link maintenancemodel.Extra},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int To Extra Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int To Extra Map</em>' map.
	 * @see maintenancemodel.MaintenancemodelPackage#getExtraHandler_IntToExtraMap()
	 * @model mapType="maintenancemodel.IntegerToExtraMap<org.eclipse.emf.ecore.EIntegerObject, maintenancemodel.Extra>" ordered="false"
	 * @generated
	 */
	EMap<Integer, Extra> getIntToExtraMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	boolean exists(int ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" IDDataType="org.eclipse.uml2.types.String" IDRequired="true" IDOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" isProductDataType="org.eclipse.uml2.types.Boolean" isProductRequired="true" isProductOrdered="false"
	 * @generated
	 */
	int addExtra(int price, String ID, String name, String description, boolean isProduct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraDataType="org.eclipse.uml2.types.Integer" extraRequired="true" extraOrdered="false"
	 * @generated
	 */
	int removeExtra(int extra);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	Extra getExtra(int ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDDataType="org.eclipse.uml2.types.Integer" extraIDRequired="true" extraIDOrdered="false"
	 * @generated
	 */
	int getPrice(int extraID);

} // ExtraHandler
