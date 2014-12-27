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
	 * @model priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" IDDataType="org.eclipse.uml2.types.String" IDRequired="true" IDOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void addExtra(int price, String ID, String name, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model extraRequired="true" extraOrdered="false"
	 * @generated
	 */
	void removeExtra(Extra extra);

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
	 * @model priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" IDDataType="org.eclipse.uml2.types.String" IDRequired="true" IDOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void editExtra(int price, String ID, String name, String description);

} // IExtrasMaintenance
