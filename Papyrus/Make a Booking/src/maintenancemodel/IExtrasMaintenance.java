/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>IExtras Maintenance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see maintenancemodel.MaintenancemodelPackage#getIExtrasMaintenance()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IExtrasMaintenance extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" extraIDDataType="org.eclipse.uml2.types.String" extraIDRequired="true" extraIDOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" isProductDataType="org.eclipse.uml2.types.Boolean" isProductRequired="true" isProductOrdered="false"
	 * @generated
	 */
	int addExtra(String extraID, int price, String name, String description, boolean isProduct);

	/**
	 * <!-- begin-user-doc -->
	 * @return
	 * true if Extra indicated by extraID exists, false otherwise 
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" extraIDDataType="org.eclipse.uml2.types.String" extraIDRequired="true" extraIDOrdered="false"
	 * @generated
	 */
	boolean exists(String extraID);

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
	int removeExtra(String extraID);

} // IExtrasMaintenance
