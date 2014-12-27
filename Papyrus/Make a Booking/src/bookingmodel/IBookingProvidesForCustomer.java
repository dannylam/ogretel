/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of an interface of IBookingProvidesForCustomer, extending EObject.
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
 * @see bookingmodel.ModelPackage#getIBookingProvidesForCustomer()
 * @maintenancemodel interface="true" abstract="true"
 * @generated NOT
 */
public interface IBookingProvidesForCustomer extends EObject {
	/**
	 * Get a specific booking.
	 * @maintenancemodel bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void getBooking(String bookingRef);

	/**
	 * Make a booking such as number of nights, number of guests,
	 * start and end date, number of rooms, roomtypes and extras.
	 * @maintenancemodel nrOfNightsDataType="org.eclipse.uml2.types.Integer" nrOfNightsRequired="true" nrOfNightsOrdered="false" nrOfGuestsDataType="org.eclipse.uml2.types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" dateDataType="org.eclipse.uml2.types.String" dateRequired="true" dateOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false" roomTypesDataType="org.eclipse.uml2.types.String" roomTypesRequired="true" roomTypesOrdered="false" extrasDataType="org.eclipse.uml2.types.String" extrasRequired="true" extrasOrdered="false"
	 * @generated NOT
	 */
	void book(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras);

	/**
	 * Pay the price of a specific booking.
	 * @maintenancemodel bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void pay(String bookingRef);

	/**
	 * Get the price of a specific booking.
	 * @maintenancemodel bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void getPrice(String bookingRef);

	/**
	 * A method for removing a specific booking
	 * @maintenancemodel bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT 
	 */
	void removeBooking(String bookingRef);

	/**
	 * A method for editing a specific booking such as number of nights, number of guests,
	 * start and end date, number of rooms, room types, extras and 
	 * booking reference. 
	 * @maintenancemodel nrOfNightsDataType="org.eclipse.uml2.types.Integer" nrOfNightsRequired="true" nrOfNightsOrdered="false" nrOfGuestsDataType="org.eclipse.uml2.types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" dateDataType="org.eclipse.uml2.types.String" dateRequired="true" dateOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false" roomTypesDataType="org.eclipse.uml2.types.String" roomTypesRequired="true" roomTypesOrdered="false" extrasDataType="org.eclipse.uml2.types.String" extrasRequired="true" extrasOrdered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void editBooking(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras, String bookingRef);

	/**
	 * A method for choosing a payment method such as credit card, cash and voucher
	 * @maintenancemodel methodDataType="org.eclipse.uml2.types.String" methodRequired="true" methodOrdered="false"
	 * @generated NOT 
	 */
	void choosePaymentMethod(String method);

	/**
	 * Set payment details such as credit card number, card code verification, 
	 * expiration month, expiration year, first name and last name.
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" ccNrDataType="org.eclipse.uml2.types.String" ccNrRequired="true" ccNrOrdered="false" ccVDataType="org.eclipse.uml2.types.String" ccVRequired="true" ccVOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.Integer" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.Integer" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated NOT
	 */
	int setPaymentDetails(String ccNr, String ccV, int expiryMonth, int expiryYear, String firstName, String lastName);

	/**
	 * Set personal details such as first name, last name, age and email of a guest.
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" ageDataType="org.eclipse.uml2.types.Integer" ageRequired="true" ageOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 * @generated NOT
	 */
	int setPersonalDetails(String firstName, String lastName, int age, String email);

} // IBookingProvidesForCustomer
