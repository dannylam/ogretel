/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.Guest#getRoomNr <em>Room Nr</em>}</li>
 *   <li>{@link bookingmodel.Guest#getGuestTypes <em>Guest Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.ModelPackage#getGuest()
 * @model
 * @generated
 */
public interface Guest extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Nr</em>' attribute.
	 * @see #setRoomNr(int)
	 * @see bookingmodel.ModelPackage#getGuest_RoomNr()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRoomNr();

	/**
	 * Sets the value of the '{@link bookingmodel.Guest#getRoomNr <em>Room Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Nr</em>' attribute.
	 * @see #getRoomNr()
	 * @generated
	 */
	void setRoomNr(int value);

	/**
	 * Returns the value of the '<em><b>Guest Types</b></em>' attribute.
	 * The literals are from the enumeration {@link bookingmodel.GuestTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest Types</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest Types</em>' attribute.
	 * @see bookingmodel.GuestTypes
	 * @see #setGuestTypes(GuestTypes)
	 * @see bookingmodel.ModelPackage#getGuest_GuestTypes()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GuestTypes getGuestTypes();

	/**
	 * Sets the value of the '{@link bookingmodel.Guest#getGuestTypes <em>Guest Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest Types</em>' attribute.
	 * @see bookingmodel.GuestTypes
	 * @see #getGuestTypes()
	 * @generated
	 */
	void setGuestTypes(GuestTypes value);

} // Guest
