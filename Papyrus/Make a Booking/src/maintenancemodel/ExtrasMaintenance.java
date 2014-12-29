/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;





/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>Extras Maintenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.ExtrasMaintenance#getExtras <em>Extras</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.MaintenancemodelPackage#getExtrasMaintenance()
 * @model
 * @generated
 */
public interface ExtrasMaintenance extends IExtrasMaintenance {
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
	 * @see maintenancemodel.MaintenancemodelPackage#getExtrasMaintenance_Extras()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getExtras();

	/**
	 * Sets the value of the '{@link maintenancemodel.ExtrasMaintenance#getExtras <em>Extras</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extras</em>' containment reference.
	 * @see #getExtras()
	 * @generated
	 */
	void setExtras(ExtraHandler value);

} // ExtrasMaintenance
