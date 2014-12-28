/**
 */
package maintenancemodel;

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
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	ExtraHandler getExtras();

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
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	int editExtra(int price, String name, String description, int ID);

} // IExtrasMaintenance
