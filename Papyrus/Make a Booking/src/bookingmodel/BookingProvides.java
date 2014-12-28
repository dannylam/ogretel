/**
 */
package bookingmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.BookingProvides#getBookingHandler <em>Booking Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.BookingmodelPackage#getBookingProvides()
 * @model
 * @generated
 */
public interface BookingProvides extends IBookingProvidesForCustomer, IBookingProvidesForGuest, IBookingProvidesForHost {
	/**
	 * Returns the value of the '<em><b>Booking Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Handler</em>' reference.
	 * @see #setBookingHandler(BookingHandler)
	 * @see bookingmodel.BookingmodelPackage#getBookingProvides_BookingHandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingHandler getBookingHandler();

	/**
	 * Sets the value of the '{@link bookingmodel.BookingProvides#getBookingHandler <em>Booking Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Handler</em>' reference.
	 * @see #getBookingHandler()
	 * @generated
	 */
	void setBookingHandler(BookingHandler value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.String" ordered="false" textDataType="types.String" textRequired="true" textOrdered="false"
	 * @generated
	 */
	EList<String> stringToList(String text);

} // BookingProvides
