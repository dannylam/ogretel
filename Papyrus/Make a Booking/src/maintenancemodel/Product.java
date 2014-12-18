/**
 */
package maintenancemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.Product#getStock <em>Stock</em>}</li>
 *   <li>{@link maintenancemodel.Product#getProductStatusEnum <em>Product Status Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.ModelPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends AbstractExtra {
	/**
	 * Returns the value of the '<em><b>Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock</em>' attribute.
	 * @see #setStock(int)
	 * @see maintenancemodel.ModelPackage#getProduct_Stock()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getStock();

	/**
	 * Sets the value of the '{@link maintenancemodel.Product#getStock <em>Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock</em>' attribute.
	 * @see #getStock()
	 * @generated
	 */
	void setStock(int value);

	/**
	 * Returns the value of the '<em><b>Product Status Enum</b></em>' attribute.
	 * The literals are from the enumeration {@link maintenancemodel.ProductStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Status Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Status Enum</em>' attribute.
	 * @see maintenancemodel.ProductStatusEnum
	 * @see #setProductStatusEnum(ProductStatusEnum)
	 * @see maintenancemodel.ModelPackage#getProduct_ProductStatusEnum()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProductStatusEnum getProductStatusEnum();

	/**
	 * Sets the value of the '{@link maintenancemodel.Product#getProductStatusEnum <em>Product Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Status Enum</em>' attribute.
	 * @see maintenancemodel.ProductStatusEnum
	 * @see #getProductStatusEnum()
	 * @generated
	 */
	void setProductStatusEnum(ProductStatusEnum value);

} // Product
