/**
 */
package bookingmodel;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.BookingHandler#getBookingsMap <em>Bookings Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.ModelPackage#getBookingHandler()
 * @model
 * @generated
 */
public interface BookingHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Bookings Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link bookingmodel.Booking},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings Map</em>' map.
	 * @see bookingmodel.ModelPackage#getBookingHandler_BookingsMap()
	 * @model mapType="model.bookingRefToBookingEntry<org.eclipse.emf.ecore.EString, model.Booking>" ordered="false"
	 * @generated
	 */
	EMap<String, Booking> getBookingsMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	boolean exists(String bookingRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void addBooking(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void removeBooking(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	Booking getBooking(String bookingRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void editBooking(Booking booking);

} // BookingHandler
