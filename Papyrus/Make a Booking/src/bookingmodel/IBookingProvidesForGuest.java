/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * A class representing an interface of IBookingProvidesForGuest, extending EObject.
 * This class has 4 methods;
 * checkIn - check in a specific guest/booking
 * checkOut - check out a specific guest/booking
 * pay - make a payment of a specific booking
 * editBooking - edit a specific booking
 * @see bookingmodel.ModelPackage#getIBookingProvidesForGuest()
 * @maintenancemodel interface="true" abstract="true"
 * @generated NOT
 */
public interface IBookingProvidesForGuest extends EObject {
	/**
	 * Check in a specific booking and guest.
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false" guestEmailDataType="org.eclipse.uml2.types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	int checkIn(String bookingRef, String guestEmail);

	/**
	 * Check out a specific booking and guest.
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false" guestEmailDataType="org.eclipse.uml2.types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	int checkOut(String bookingRef, String guestEmail);

	/**
	 * Make a payment by inserting credit card number, card code verification, 
	 * expiration month, expiration year, first name and last name.
	 * @maintenancemodel ccNrDataType="org.eclipse.uml2.types.String" ccNrRequired="true" ccNrOrdered="false" ccVDataType="org.eclipse.uml2.types.String" ccVRequired="true" ccVOrdered="false" expMonthDataType="org.eclipse.uml2.types.Integer" expMonthRequired="true" expMonthOrdered="false" expYearDataType="org.eclipse.uml2.types.Integer" expYearRequired="true" expYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated NOT 
	 */
	void pay(String ccNr, String ccV, int expMonth, int expYear, String firstName, String lastName);
	
	/**
	 * Edit a booking such as number of nights, number of guests,
	 * start and end date, number of rooms, roomtypes, extras and booking reference.
	 * @return 
	 * @maintenancemodel nrOfNightsDataType="org.eclipse.uml2.types.Integer" nrOfNightsRequired="true" nrOfNightsOrdered="false" nrOfGuestsDataType="org.eclipse.uml2.types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" dateDataType="org.eclipse.uml2.types.String" dateRequired="true" dateOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false" roomTypesDataType="org.eclipse.uml2.types.String" roomTypesRequired="true" roomTypesOrdered="false" extrasDataType="org.eclipse.uml2.types.String" extrasRequired="true" extrasOrdered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void editBooking(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras, String bookingRef);


} // IBookingProvidesForGuest
