/**
 */
package maintenancemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extras Maintenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.ExtrasMaintenance#getExtras <em>Extras</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.ModelPackage#getExtrasMaintenance()
 * @model
 * @generated
 */
public interface ExtrasMaintenance extends EObject {
	/**
	 * Returns the value of the '<em><b>Extras</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extras</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extras</em>' containment reference.
	 * @see #setExtras(ExtraHandler)
	 * @see maintenancemodel.ModelPackage#getExtrasMaintenance_Extras()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ExtraHandler getExtras();

	/**
	 * Sets the value of the '{@link maintenancemodel.ExtrasMaintenance#getExtras <em>Extras</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extras</em>' containment reference.
	 * @see #getExtras()
	 * @generated
	 */
	void setExtras(ExtraHandler value);

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
	 * @model IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	void getExtra(int ID);

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
	 * @model priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false" IDDataType="org.eclipse.uml2.types.String" IDRequired="true" IDOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void editExtra(int price, String ID, String name, String description);

} // ExtrasMaintenance
