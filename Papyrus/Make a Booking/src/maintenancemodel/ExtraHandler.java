/**
 */
package maintenancemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extra Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.ExtraHandler#getExtra <em>Extra</em>}</li>
 *   <li>{@link maintenancemodel.ExtraHandler#getExtraTable <em>Extra Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.ModelPackage#getExtraHandler()
 * @model
 * @generated
 */
public interface ExtraHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Extra</b></em>' reference list.
	 * The list contents are of type {@link maintenancemodel.Extra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra</em>' reference list.
	 * @see maintenancemodel.ModelPackage#getExtraHandler_Extra()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Extra> getExtra();

	/**
	 * Returns the value of the '<em><b>Extra Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Table</em>' containment reference.
	 * @see #setExtraTable(IntegerToExtraMap)
	 * @see maintenancemodel.ModelPackage#getExtraHandler_ExtraTable()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	IntegerToExtraMap getExtraTable();

	/**
	 * Sets the value of the '{@link maintenancemodel.ExtraHandler#getExtraTable <em>Extra Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Table</em>' containment reference.
	 * @see #getExtraTable()
	 * @generated
	 */
	void setExtraTable(IntegerToExtraMap value);

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
	 * @model required="true" ordered="false" IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	Extra getExtra(int ID);

} // ExtraHandler
