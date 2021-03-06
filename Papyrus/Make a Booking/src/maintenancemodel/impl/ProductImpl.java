/**
 */
package maintenancemodel.impl;

import maintenancemodel.MaintenancemodelPackage;
import maintenancemodel.Product;
import maintenancemodel.ProductStatusEnum;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the maintenancemodel object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.ProductImpl#getStock <em>Stock</em>}</li>
 *   <li>{@link maintenancemodel.impl.ProductImpl#getProductStatusEnum <em>Product Status Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends AbstractExtraImpl implements Product {
	/**
	 * The default value of the '{@link #getStock() <em>Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStock()
	 * @generated
	 * @ordered
	 */
	protected static final int STOCK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStock() <em>Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStock()
	 * @generated
	 * @ordered
	 */
	protected int stock = STOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductStatusEnum() <em>Product Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStatusEnum()
	 * @generated
	 * @ordered
	 */
	protected static final ProductStatusEnum PRODUCT_STATUS_ENUM_EDEFAULT = ProductStatusEnum.IN_STOCK;

	/**
	 * The cached value of the '{@link #getProductStatusEnum() <em>Product Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStatusEnum()
	 * @generated
	 * @ordered
	 */
	protected ProductStatusEnum productStatusEnum = PRODUCT_STATUS_ENUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setStock(int newStock) {
		int oldStock = stock;
		stock = newStock;
		if(stock == 0) {
			productStatusEnum = ProductStatusEnum.OUT_OF_STOCK;
		} else {
			productStatusEnum = ProductStatusEnum.IN_STOCK;
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.PRODUCT__STOCK, oldStock, stock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProductStatusEnum getProductStatusEnum() {
		return productStatusEnum;
	}
	
	@Override
	public boolean isAvailable() {
		if(getProductStatusEnum() == ProductStatusEnum.IN_STOCK) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setProductStatusEnum(ProductStatusEnum newProductStatusEnum) {
		ProductStatusEnum oldProductStatusEnum = productStatusEnum;
		productStatusEnum = newProductStatusEnum == null ? PRODUCT_STATUS_ENUM_EDEFAULT : newProductStatusEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.PRODUCT__PRODUCT_STATUS_ENUM, oldProductStatusEnum, productStatusEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancemodelPackage.PRODUCT__STOCK:
				return getStock();
			case MaintenancemodelPackage.PRODUCT__PRODUCT_STATUS_ENUM:
				return getProductStatusEnum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MaintenancemodelPackage.PRODUCT__STOCK:
				setStock((Integer)newValue);
				return;
			case MaintenancemodelPackage.PRODUCT__PRODUCT_STATUS_ENUM:
				setProductStatusEnum((ProductStatusEnum)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MaintenancemodelPackage.PRODUCT__STOCK:
				setStock(STOCK_EDEFAULT);
				return;
			case MaintenancemodelPackage.PRODUCT__PRODUCT_STATUS_ENUM:
				setProductStatusEnum(PRODUCT_STATUS_ENUM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MaintenancemodelPackage.PRODUCT__STOCK:
				return stock != STOCK_EDEFAULT;
			case MaintenancemodelPackage.PRODUCT__PRODUCT_STATUS_ENUM:
				return productStatusEnum != PRODUCT_STATUS_ENUM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stock: ");
		result.append(stock);
		result.append(", productStatusEnum: ");
		result.append(productStatusEnum);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
