/**
 */
package bookingmodel;

import java.util.List;
import org.eclipse.emf.common.util.EList;
/**
 * An interface class which represents booking provides for the customer, extending EObject.
 *
 * @see bookingmodel.BookingmodelPackage#getIBookingProvidesForCustomer()
 * @model interface="true" abstract="true"
 * @generated 
 */
public interface IBookingProvidesForCustomer extends BookingInfo, CustomerInfo {
	/**
	 * Makes a payment for a specific booking
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return	0 if success 
	 * 			1 if an error occurred
	 * 			2 if the credit card is invalid
	 * 			3 if not enough money on the card or invalid card
	 * 			4 if the amount is invalid 
	 * 			5 if the booking is already payed or the payment method is not by card
	 * 			-1 if the booking reference does not exist
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
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int payBooking(String bookingRef);

	/**
	 * 
	 * Returns the price of a specific booking.
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return  the price if the booking is returned if success
	 * 			-1 if not success
	 * @param bookingRef
	 * A bookingreference
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int getPrice(String bookingRef);

	/**
	 * A method for removing a specific booking
	 * @param bookingRef
	 *  The integer returned by the function indicates success or failure and reason for failure.
	 * @return  0 if success
	 * 			-1 if the bookingreference does not exit
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int removeBooking(String bookingRef);

	/**
	 * A method for editing a specific booking such as number of nights, number of guests,
	 * start and end date, number of rooms, room types, extras and 
	 * booking reference. 
	 * @return  0 if success 
	 * 			1 if the booking is not possible
	 * 		 	-1 if the booking reference does not exist
	 * @param bookingRef
	 * Bookingreference of an existing booking
	 * @param startDate
	 * The date you want the booking to start
	 * @param endDate
	 * The date you want the booking to end
	 * @param nrOfGuests
	 * The amount of guests the booking will have
	 * @param roomTypes
	 * What room type the booking will contain
	 * @param extras
	 * Any extras the booking should contain
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false" startDateDataType="types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="types.String" endDateRequired="true" endDateOrdered="false" nrOfGuestsDataType="types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" roomTypesDataType="types.String" roomTypesMany="true" roomTypesOrdered="false" extrasDataType="types.String" extrasMany="true" extrasOrdered="false" servicesDataType="types.String" servicesMany="true" servicesOrdered="false"
	 * @generated NOT
	 */
	int editBooking(String bookingRef, String startDate, String endDate, int nrOfGuests, List<String> roomTypes, List<String> extras, List<String> services);

	/**
	 * Sets the method for paying a booking to the booking with the given booking reference
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return  0 if success
	 * 			-1 if the booking reference does not exist
	 * 			1 if the paymentmethod given is not "bankcard, cash or voucher"
	 * @param method, bookingRef
	 * @model dataType="types.Integer" required="true" ordered="false" methodDataType="types.String" methodRequired="true" methodOrdered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int setPaymentMethod(String method, String bookingRef);

	/**
	 * Sets the payment details of a customer of a booking by using the booking reference
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return  0 if success
	 * 			-1 if the booking reference does not exist
	 * @model dataType="types.Integer" required="true" ordered="false" ccNumberDataType="types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="types.Integer" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="types.Integer" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="types.String" lastNameRequired="true" lastNameOrdered="false" customerEmailDataType="types.String" customerEmailRequired="true" customerEmailOrdered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int setPaymentDetails(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, String customerEmail, String bookingRef);

	/**
	 * Set personal details such as first name, last name, age and email of a customer and assigns this customer to a booking if
	 * the customers age is above 18.
	 * The integer returned by the function indicates success or failure and reason for failure.
	 * @return  0 if success
	 * 			-1 if the bookingreference does not exist
	 * 			1 if the age of the customer is below 18
	 * @param firstName, lastName, age, email
	 * @model dataType="types.Integer" required="true" ordered="false" firstNameDataType="types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="types.String" lastNameRequired="true" lastNameOrdered="false" ageDataType="types.Integer" ageRequired="true" ageOrdered="false" emailDataType="types.String" emailRequired="true" emailOrdered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int setPersonalDetails(String firstName, String lastName, int age, String email, String bookingRef);
	
	/**
	 * Make a booking such for the given start- and enddate, number of guests,
	 * roomtypes (and how many of each roomtype), extras and services.
	 * @return the booking reference if success
	 * 			empty if the booking was not successful
	 * 			"Startdate, enddate, number of guests and roomtypes cannot be empty" if one or more params are empty
	 * @model dataType="types.String" required="true" ordered="false" startDateDataType="types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="types.String" endDateRequired="true" endDateOrdered="false" nrOfGuestsDataType="types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" roomTypesDataType="types.String" roomTypesMany="true" roomTypesOrdered="false" extrasDataType="types.String" extrasMany="true" extrasOrdered="false" servicesDataType="types.String" servicesMany="true" servicesOrdered="false"
	 * @generated NOT
	 */
	String book(String startDate, String endDate, int nrOfGuests, List<String> roomTypes, List<String> extras, List<String> services);

} // IBookingProvidesForCustomer
