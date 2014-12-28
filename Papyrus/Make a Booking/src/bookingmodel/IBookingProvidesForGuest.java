/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
* An interface class which represents booking provides for the guest, extending EObject.
 * This class has 3 methods;
 * checkIn - check in a specific guest/booking
 * checkOut - check out a specific guest/booking
 * pay - make a payment of a specific booking
 * 
 * @see bookingmodel.BookingmodelPackage#getIBookingProvidesForGuest()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface IBookingProvidesForGuest extends EObject {
	/**
	 * Checks in a guest/booking reference.
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	int checkIn(String bookingRef, String guestEmail);

	/**
	 * Checks out a guest/booking reference.
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	int checkOut(String bookingRef, String guestEmail);

	/**
	 * Make a payment by inserting credit card number, 
	 * card code verification, expiration month, expiration year,
	 * first name and last name.
	 * @param ccNr, ccV, expMonth, expYear, firstName, lastName
	 * @model dataType="types.Integer" required="true" ordered="false" ccNumberDataType="types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="types.String" ccvRequired="true" ccvOrdered="false" expMonthDataType="types.Integer" expMonthRequired="true" expMonthOrdered="false" expYearDataType="types.Integer" expYearRequired="true" expYearOrdered="false" firstNameDataType="types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated NOT
	 */
	int pay(String ccNumber, String ccv, int expMonth, int expYear, String firstName, String lastName);

} // IBookingProvidesForGuest
