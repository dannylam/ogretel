/**
 */
package maintenancemodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Product Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see maintenancemodel.ModelPackage#getProductStatusEnum()
 * @maintenancemodel
 * @generated
 */
public enum ProductStatusEnum implements Enumerator {
	/**
	 * The '<em><b>In Stock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_STOCK_VALUE
	 * @generated
	 * @ordered
	 */
	IN_STOCK(0, "inStock", "inStock"),

	/**
	 * The '<em><b>Out Of Stock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_OF_STOCK_VALUE
	 * @generated
	 * @ordered
	 */
	OUT_OF_STOCK(1, "outOfStock", "outOfStock"),

	/**
	 * The '<em><b>Restocking</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTOCKING_VALUE
	 * @generated
	 * @ordered
	 */
	RESTOCKING(2, "restocking", "restocking");

	/**
	 * The '<em><b>In Stock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Stock</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_STOCK
	 * @maintenancemodel name="inStock"
	 * @generated
	 * @ordered
	 */
	public static final int IN_STOCK_VALUE = 0;

	/**
	 * The '<em><b>Out Of Stock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Out Of Stock</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUT_OF_STOCK
	 * @maintenancemodel name="outOfStock"
	 * @generated
	 * @ordered
	 */
	public static final int OUT_OF_STOCK_VALUE = 1;

	/**
	 * The '<em><b>Restocking</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Restocking</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESTOCKING
	 * @maintenancemodel name="restocking"
	 * @generated
	 * @ordered
	 */
	public static final int RESTOCKING_VALUE = 2;

	/**
	 * An array of all the '<em><b>Product Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProductStatusEnum[] VALUES_ARRAY =
		new ProductStatusEnum[] {
			IN_STOCK,
			OUT_OF_STOCK,
			RESTOCKING,
		};

	/**
	 * A public read-only list of all the '<em><b>Product Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProductStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Product Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductStatusEnum get(int value) {
		switch (value) {
			case IN_STOCK_VALUE: return IN_STOCK;
			case OUT_OF_STOCK_VALUE: return OUT_OF_STOCK;
			case RESTOCKING_VALUE: return RESTOCKING;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProductStatusEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ProductStatusEnum
