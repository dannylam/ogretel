/**
 */
package bookingmodel;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Info</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see bookingmodel.BookingmodelPackage#getBookingInfo()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BookingInfo extends EObject {
	/**
	 * Returns the start date of the given booking
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getStartDate(String bookingRef);

	/**
	 * Returns the end date of the given booking
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getEndDate(String bookingRef);

	/**
	 * Returns the number of guests of the given booking
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	int getNrOfGuests(String bookingRef);

	/**
	 * Returns a list of extras of the given booking 
	 * @model dataType="types.String" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<String> getExtras(String bookingRef);

	/**
	 * Returns a list of the rooms (which are checked-in) of the given booking 
	 * @model dataType="types.Integer" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */ 
	List<Integer> getRooms(String bookingRef);

	/**
	 * Returns the payment method of the given booking
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getPaymentMethod(String bookingRef);

	/**
	 * Returns a list of roomtypes of the given booking 
	 * @model dataType="types.String" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<String> getRoomTypes(String bookingRef);

	/**
	 * Returns a list of service notes of the given booking 
	 * @model dataType="types.String" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<String> getServiceNotes(String bookingRef);

	/**
	 * Returns the  bookingreferences associated to the customers email.
	 * @model customerEmailDataType="types.String" customerEmailRequired="true" customerEmailOrdered="false"
	 * @generated NOT
	 */
	List<String> getBookingRef(String customerEmail);

} // BookingInfo
