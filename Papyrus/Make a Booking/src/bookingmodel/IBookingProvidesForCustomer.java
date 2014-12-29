/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * An interface class which represents booking provides for the customer, extending EObject.
 * This class has 8 methods;
 * getBooking - get a specific booking
 * book - make a booking
 * pay - make a payment to a specific booking
 * getPrice - get the price of a specific booking
 * removeBooking - remove a specific booking
 * editBooking - edit a specific booking
 * choosePaymentMethod - choose a specific payment method
 * setPaymentDetails - set details of a payment
 * setPersonalDetails - set details of a guest
 *
 * @see bookingmodel.BookingmodelPackage#getIBookingProvidesForCustomer()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface IBookingProvidesForCustomer extends EObject {
	/**
	 * Pay the price of a specific booking.
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int pay(String bookingRef);

	/**
	 * Get the price of a specific booking.
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int getPrice(String bookingRef);

	/**
	 * A method for removing a specific booking
	 * @param bookingRef
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int removeBooking(String bookingRef);

	/**
	 /**
	 * A method for editing a specific booking such as number of nights, number of guests,
	 * start and end date, number of rooms, room types, extras and 
	 * booking reference. 
	 * @param  nrOfNights, nrOfGuests, date, nrOfRooms, roomTypes, extras, bookingRef
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false" startDateDataType="types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="types.String" endDateRequired="true" endDateOrdered="false" nrOfGuestsDataType="types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" roomTypesDataType="types.String" roomTypesRequired="true" roomTypesOrdered="false" extrasDataType="types.String" extrasRequired="true" extrasOrdered="false"
	 * @generated NOT
	 */
	int editBooking(String bookingRef, String startDate, String endDate, int nrOfGuests, String roomTypes, String extras);

	/**
	 * @model dataType="types.Integer" required="true" ordered="false" firstNameDataType="types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="types.String" lastNameRequired="true" lastNameOrdered="false" ageDataType="types.Integer" ageRequired="true" ageOrdered="false" emailDataType="types.String" emailRequired="true" emailOrdered="false"
	 * @generated NOT
	 */
	int setPaymentDetails(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, String customerEmail);

	/**
	 * Set personal details such as first name, last name, age and email of a customer and assigns this customer to a booking.
	 * @param firstName, lastName, age, email
	 * @model dataType="types.Integer" required="true" ordered="false" customerEmailDataType="types.String" customerEmailRequired="true" customerEmailOrdered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int setPersonalDetails(String firstName, String lastName, int age, String email, String bookingRef);

	/**
	  * Make a booking such as number of nights, number of guests,
	 * start and end date, number of rooms, roomtypes and extras.
	 * @param nrOfNights, nrOfGuests, date, nrOfRooms, roomTypes, extras
	 * @model dataType="types.Integer" required="true" ordered="false" startDateDataType="types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="types.String" endDateRequired="true" endDateOrdered="false" nrOfGuestsDataType="types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" roomTypesDataType="types.String" roomTypesRequired="true" roomTypesOrdered="false" extrasDataType="types.String" extrasRequired="true" extrasOrdered="false"
	 * @generated NOT
	 */
	int book(String startDate, String endDate, int nrOfGuests, String roomTypes, String extras);

} // IBookingProvidesForCustomer
