
package bookingmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * A representation of the literals of the enumeration '<em><b>Guest Types</b></em>',
 * and utility methods for working with them.
 * @see bookingmodel.ModelPackage#getGuestTypes()
 * @maintenancemodel
 * @generated
 */
public enum GuestTypes implements Enumerator {
	/**
	 * The '<em><b>Regular</b></em>' literal object.
	 * @see #REGULAR_VALUE
	 * @generated NOT
	 * @ordered
	 */
	REGULAR(0, "Regular", "Regular"),

	/**
	 * The '<em><b>Black Listed</b></em>' literal object.
	 * @see #BLACK_LISTED_VALUE
	 * @generated NOT
	 * @ordered
	 */
	BLACK_LISTED(1, "BlackListed", "BlackListed"),

	/**
	 * The '<em><b>VIP</b></em>' literal object.
	 * @see #VIP_VALUE
	 * @generated NOT
	 * @ordered
	 */
	VIP(2, "VIP", "VIP");

	/**
	 * The '<em><b>Regular</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>Regular</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #REGULAR
	 * @maintenancemodel name="Regular"
	 * @generated NOT
	 * @ordered
	 */
	public static final int REGULAR_VALUE = 0;

	/**
	 * The '<em><b>Black Listed</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>Black Listed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #BLACK_LISTED
	 * @maintenancemodel name="BlackListed"
	 * @generated NOT
	 * @ordered
	 */
	public static final int BLACK_LISTED_VALUE = 1;

	/**
	 * The '<em><b>VIP</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>VIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #VIP
	 * @maintenancemodel
	 * @generated NOT
	 * @ordered
	 */
	public static final int VIP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Guest Types</b></em>' enumerators.
	 * @generated NOT
	 */
	private static final GuestTypes[] VALUES_ARRAY =
		new GuestTypes[] {
			REGULAR,
			BLACK_LISTED,
			VIP,
		};

	/**
	 * A public read-only list of all the '<em><b>Guest Types</b></em>' enumerators.
	 * @generated NOT
	 */
	public static final List<GuestTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Guest Types</b></em>' literal with the specified literal value.
	 * @generated NOT
	 */
	public static GuestTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuestTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guest Types</b></em>' literal with the specified name.
	 * @generated NOT
	 */
	public static GuestTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuestTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guest Types</b></em>' literal with the specified integer value.
	 * @generated NOT
	 */
	public static GuestTypes get(int value) {
		switch (value) {
			case REGULAR_VALUE: return REGULAR;
			case BLACK_LISTED_VALUE: return BLACK_LISTED;
			case VIP_VALUE: return VIP;
		}
		return null;
	}

	private final int value;

	private final String name;

	private final String literal;

	private GuestTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	public int getValue() {
	  return value;
	}

	public String getName() {
	  return name;
	}

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
	
} //GuestTypes
