/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * A class representing an interface Guest which extends an EObject.
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
 * @see bookingmodel.ModelPackage#getGuest()
 * @maintenancemodel
 * @generated NOT
 */
public interface Guest extends EObject {
	/**
	 * Returns the number of a specific room.
	 * @return the value of the '<em>Room Nr</em>' attribute.
	 * @see #setRoomNr(int)
	 * @see bookingmodel.ModelPackage#getGuest_RoomNr()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
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
	 * There are two types of guests: guest and VIP.
	 * @return the value of the '<em>Guest Types</em>' attribute.
	 * @see bookingmodel.GuestTypes
	 * @see #setGuestTypes(GuestTypes)
	 * @see bookingmodel.ModelPackage#getGuest_GuestTypes()
	 * @maintenancemodel required="true" ordered="false"
	 * @generated NOT
	 */
	GuestTypes getGuestTypes();

	/**
	 * Sets the type to a guest.
	 *  * There are two types of guests: guest and VIP.
	 * @param value the new value of the '<em>Guest Types</em>' attribute.
	 * @see bookingmodel.GuestTypes
	 * @see #getGuestTypes()
	 * @generated NOT
	 */
	void setGuestTypes(GuestTypes value);

} // Guest
