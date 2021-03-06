/**
 */
package bookingmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * A representation of the literals of the enumeration '<em><b>Payment Method</b></em>',
 * and utility methods for working with them. There are three types of enum:
 * BANKCARD
 * CASH 
 * VOUCHER
 * @see bookingmodel.BookingmodelPackage#getPaymentMethod()
 * @model
 * @generated
 */
public enum PaymentMethod implements Enumerator {
	/**
	 * The '<em><b>Bankcard</b></em>' literal object.
	 * @see #BANKCARD_VALUE
	 * @generated NOT
	 * @ordered
	 */
	BANKCARD(0, "bankcard", "bankcard"),

	/**
	 * The '<em><b>Cash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASH_VALUE
	 * @generated NOT
	 * @ordered
	 */
	CASH(1, "cash", "cash"),

	/**
	 * The '<em><b>Voucher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOUCHER_VALUE
	 * @generated NOT
	 * @ordered
	 */
	VOUCHER(2, "voucher", "voucher");

	/**
	 * The '<em><b>Bankcard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bankcard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BANKCARD
	 * @model name="bankcard"
	 * @generated NOT
	 * @ordered
	 */
	public static final int BANKCARD_VALUE = 0;

	/**
	 * The '<em><b>Cash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASH
	 * @model name="cash"
	 * @generated NOT
	 * @ordered
	 */
	public static final int CASH_VALUE = 1;

	/**
	 * The '<em><b>Voucher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Voucher</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOUCHER
	 * @model name="voucher"
	 * @generated NOT
	 * @ordered
	 */
	public static final int VOUCHER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Payment Method</b></em>' enumerators.
	 * @generated
	 */
	private static final PaymentMethod[] VALUES_ARRAY =
		new PaymentMethod[] {
			BANKCARD,
			CASH,
			VOUCHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Payment Method</b></em>' enumerators.
	 * @generated NOT
	 */
	public static final List<PaymentMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Payment Method</b></em>' literal with the specified literal value.
	 * @generated NOT
	 */
	public static PaymentMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Method</b></em>' literal with the specified name.
	 * @generated NOT
	 */
	public static PaymentMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Method</b></em>' literal with the specified integer value.
	 * @generated NOT
	 */
	public static PaymentMethod get(int value) {
		switch (value) {
			case BANKCARD_VALUE: return BANKCARD;
			case CASH_VALUE: return CASH;
			case VOUCHER_VALUE: return VOUCHER;
		}
		return null;
	}

	/**
	 * @generated NOT
	 */
	private final int value;

	/**
	 * @generated NOT
	 */
	private final String name;

	/**
	 * @generated NOT
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * @generated NOT
	 */
	private PaymentMethod(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PaymentMethod
