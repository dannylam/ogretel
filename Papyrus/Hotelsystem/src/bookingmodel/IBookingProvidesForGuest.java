/**
 */
package bookingmodel;

import java.util.List;

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
	 * Checks in a room of a booking and sets the guest as responsible by using their email.
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return	0 if success 
	 * 			-1 if an the booking reference does not exist
	 * 			1 if there are no rooms of the given roomtype vacant
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false" roomTypeDataType="types.String" roomTypeRequired="true" roomTypeOrdered="false" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	int checkIn(String bookingRef, String roomType, String guestEmail);

	/**
	 * Checks out a room and removes the responsible guest
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return	the price to pay at checkout
	 * 			-1 if an the booking reference does not exist
	 * 			-2 if the room has not been checked-in or is not already checked out
	 * 			-3 if the room could not be set as vacant
	 * @model dataType="types.Integer" required="true" ordered="false" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated 
	 */
	int checkOut(int roomID);

	/**
	 * Make a payment for extra(s) from a room by inserting credit card number, 
	 * card code verification, expiration month, expiration year,
	 * first name and last name.
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return 
	 * 			0 if success 
	 * 			1 if an error occurred
	 * 			2 if the credit card is invalid
	 * 			3 if not enough money on the card or invalid card
	 * 			4 if the extra(s) is already payed
	 * 			5 if the extra(s) given are empty
	 * 			-1 if the booking reference does not exist
	 * Pays for an extra
	 * @param ccNumber
	 * The cards ccNumber
	 * @param ccv
	 * The cards ccv number
	 * @param expMonth
	 * the month the card expiers
	 * @param expYear
	 * The year the card expiers
	 * @param firstName
	 * The card owners first name
	 * @param lastName 
	 * Same as firstName but last name
	 * @param extra
	 * A list of the extras to pay
	 * @model dataType="types.Integer" required="true" ordered="false" ccNumberDataType="types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="types.String" ccvRequired="true" ccvOrdered="false" expMonthDataType="types.Integer" expMonthRequired="true" expMonthOrdered="false" expYearDataType="types.Integer" expYearRequired="true" expYearOrdered="false" firstNameDataType="types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="types.String" lastNameRequired="true" lastNameOrdered="false" extraDataType="types.String" extraMany="true" extraOrdered="false" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	int payExtra(String ccNumber, String ccv, int expMonth, int expYear, String firstName, String lastName, List<String> extra, int roomID);

	/**
	 * Make a payment for a room by inserting credit card number, 
	 * card code verification, expiration month, expiration year,
	 * first name and last name.
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return	0 if success 
	 * 			1 if an error occurred
	 * 			2 if the credit card is invalid
	 * 			3 if not enough money on the card or invalid card
	 * 			4 if the room is already payed
	 * 			-1 if the booking reference does not exist
	 * @model dataType="types.Integer" required="true" ordered="false" ccNumberDataType="types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="types.String" ccvRequired="true" ccvOrdered="false" expMonthDataType="types.Integer" expMonthRequired="true" expMonthOrdered="false" expYearDataType="types.Integer" expYearRequired="true" expYearOrdered="false" firstNameDataType="types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="types.String" lastNameRequired="true" lastNameOrdered="false" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	int payRoom(String ccNumber, String ccv, int expMonth, int expYear, String firstName, String lastName, int roomID);

} // IBookingProvidesForGuest
