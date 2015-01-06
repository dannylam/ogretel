/**
 */
package bookingmodel;


/**
 * An interface class which represents Guest, extending EObject.
 * This class has 4 methods;
 * getRoomNr - return the value of a specific room
 * setRoomNr - set a number to a specific room
 * getGuestTypes - return the type of the guest
 * setGuestTypes - set a type to the guest
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.Guest#getRoomNr <em>Room Nr</em>}</li>
 *   <li>{@link bookingmodel.Guest#getGuestTypes <em>Guest Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.BookingmodelPackage#getGuest()
 * @model
 * @generated NOT
 */
public interface Guest extends Person {
	/**
	 * Returns the number of a specific room.
	 * @return the value of the '<em>Room Nr</em>' attribute.
	 * @see #setRoomNr(int)
	 * @see bookingmodel.BookingmodelPackage#getGuest_RoomNr()
	 * @model dataType="types.Integer" required="true" ordered="false"
	 * @generated NOT
	 */
	int getRoomNr();

	/**
	 * Set a number to a specific room.
	 * @param value the new value of the '<em>Room Nr</em>' attribute.
	 * @see #getRoomNr()
	 * @generated NOT
	 */
	void setRoomNr(int value);

	/**
	 * Get the type of a specific guest.
	 * There are three types of guests: guest, blacklisted and VIP.
	 * @return the value of the '<em>Guest Types</em>' attribute.
	 * @see bookingmodel.GuestTypes
	 * @see #setGuestTypes(GuestTypes)
	 * @see bookingmodel.BookingmodelPackage#getGuest_GuestTypes()
	 * @model required="true" ordered="false"
	 * @generated NOT
	 */
	GuestTypes getGuestTypes();

	/**
	 * Sets the type to a guest.
	 * There are three types of guests: guest, VIP and blacklisted.
	 * @param value the new value of the '<em>Guest Types</em>' attribute.
	 * @see bookingmodel.GuestTypes
	 * @see #getGuestTypes()
	 * @generated NOT
	 */
	void setGuestTypes(GuestTypes value);

} // Guest
