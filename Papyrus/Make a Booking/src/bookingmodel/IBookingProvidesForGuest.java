/**
 */
package bookingmodel;

import java.util.List;

import org.eclipse.emf.common.util.EList;
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
 * @generated 
 */
public interface IBookingProvidesForGuest extends EObject {
	/**
	 * Checks in a room of a booking and sets the guest as responsible by using their email.
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false" roomTypeDataType="types.String" roomTypeRequired="true" roomTypeOrdered="false" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	int checkIn(String bookingRef, String roomType, String guestEmail);

	/**
	 * Checks out a room and removes the responsible guest
	 * @model dataType="types.Integer" required="true" ordered="false" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	int checkOut(int roomID, String guestEmail);

	/**
	 * Make a payment by inserting credit card number, 
	 * card code verification, expiration month, expiration year,
	 * first name and last name.
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return	0 if success 
	 * 			1 if an error occurred
	 * 			2 if the credit card is invalid
	 * 			3 if not enough money on the card or invalid card
	 * @param ccNr, ccV, expMonth, expYear, firstName, lastName
	 * @model dataType="types.Integer" required="true" ordered="false" ccNumberDataType="types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="types.String" ccvRequired="true" ccvOrdered="false" expMonthDataType="types.Integer" expMonthRequired="true" expMonthOrdered="false" expYearDataType="types.Integer" expYearRequired="true" expYearOrdered="false" firstNameDataType="types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="types.String" lastNameRequired="true" lastNameOrdered="false" extraRequired="true" extraMany="false" extraOrdered="false"
	 * @generated NOT
	 */
	int pay(String ccNumber, String ccv, int expMonth, int expYear, String firstName, String lastName, List<String> extra);

} // IBookingProvidesForGuest
