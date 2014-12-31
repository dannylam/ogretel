/**
 */
package maintenancemodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Room Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see maintenancemodel.MaintenancemodelPackage#getRoomTypeEnum()
 * @model
 * @generated
 */
public enum RoomTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Singlebed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLEBED_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLEBED(0, "Singlebed", "Singlebed"),

	/**
	 * The '<em><b>Doublebed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLEBED_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLEBED(1, "Doublebed", "Doublebed"),

	/**
	 * The '<em><b>Luxurysuite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUXURYSUITE_VALUE
	 * @generated
	 * @ordered
	 */
	LUXURYSUITE(2, "Luxurysuite", "Luxurysuite");

	/**
	 * The '<em><b>Singlebed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Singlebed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLEBED
	 * @model name="Singlebed"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLEBED_VALUE = 0;

	/**
	 * The '<em><b>Doublebed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Doublebed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLEBED
	 * @model name="Doublebed"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLEBED_VALUE = 1;

	/**
	 * The '<em><b>Luxurysuite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Luxurysuite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LUXURYSUITE
	 * @model name="Luxurysuite"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Luxury suite'"
	 * @generated
	 * @ordered
	 */
	public static final int LUXURYSUITE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Room Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoomTypeEnum[] VALUES_ARRAY =
		new RoomTypeEnum[] {
			SINGLEBED,
			DOUBLEBED,
			LUXURYSUITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Room Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoomTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Room Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoomTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoomTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Room Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoomTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoomTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Room Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoomTypeEnum get(int value) {
		switch (value) {
			case SINGLEBED_VALUE: return SINGLEBED;
			case DOUBLEBED_VALUE: return DOUBLEBED;
			case LUXURYSUITE_VALUE: return LUXURYSUITE;
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
	private RoomTypeEnum(int value, String name, String literal) {
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
	
} //RoomTypeEnum
