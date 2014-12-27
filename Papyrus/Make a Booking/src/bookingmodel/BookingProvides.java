/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the interface '<em><b>Booking Provides</b></em>'.
 * The interface extends an EObject and has 20 methods;
 * setBookingHandler - setting a value of the booking handler reference
 * removeBooking - removes a booking
 * getBooking - gets a specific booking
 * getPrice - gets the price of a specific booking
 * book - make a booking 
 * pay - make a payment of a specific booking
 * editBooking - edit a specific booking
 * TODO: remove searchRoom - method that searchs after a specific room 
 * setPersonalDetails - set details to a guest
 * choosePaymentMethod - choose paymentmethod such as bankcard, cash or voucher
 * setPaymentDetails - set details to a payment
 * checkOut - check out a guest
 * checkIn - check in a guest
 * TODO: fix pay - 
 * enableSelfManagement - enable self management for a guest
 * addServiceNote - add a specific service note
 * editServiceNote - edit a specific service note
 * removeServiceNote - remove a specific service note
 * getServiceNote - get a specific service note 
 * 
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.BookingProvides#getBookingHandler <em>Booking Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.ModelPackage#getBookingProvides()
 * @model
 * @generated NOT
 */
public interface BookingProvides extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking Handler</b></em>' reference.
	 * @return the value of the '<em>Booking Handler</em>' reference.
	 * @see #setBookingHandler(BookingHandler)
	 * @see bookingmodel.ModelPackage#getBookingProvides_BookingHandler()
	 * @model required="true" ordered="false"
	 * @generated NOT
	 */
	BookingHandler getBookingHandler();

	/**
	 * A method that sets the value 
	 * of '{@link bookingmodel.BookingProvides#getBookingHandler <em>Booking Handler</em>}' reference.
	 * @param value the new value of the '<em>Booking Handler</em>' reference.
	 * @see #getBookingHandler()
	 * @generated NOT
	 */
	void setBookingHandler(BookingHandler value);

	/**
	 * A method that removes a specific booking
	 * @model bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void removeBooking(String bookingRef);

	/**
	 * A method that gets the specific booking
	 * @model bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void getBooking(String bookingRef);

	/**
	 * A method that gets the price of a specific booking
	 * @model bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void getPrice(String bookingRef);

	/**
	 * A method that makes a booking by setting
	 * number of nights, number of guests, the start and end date,
	 * number of rooms, roomtypes and extras.
	 * @param nrOfNights, nrOfGuests, date, nrOfRooms, roomTypes, extras
	 * @model nrOfNightsDataType="org.eclipse.uml2.types.Integer" nrOfNightsRequired="true" nrOfNightsOrdered="false" nrOfGuestsDataType="org.eclipse.uml2.types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" dateDataType="org.eclipse.uml2.types.String" dateRequired="true" dateOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false" roomTypesDataType="org.eclipse.uml2.types.String" roomTypesRequired="true" roomTypesOrdered="false" extrasDataType="org.eclipse.uml2.types.String" extrasRequired="true" extrasOrdered="false"
	 * @generated NOT
	 */
	void book(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras);

	/**
	 * A method that pays a specific booking
	 * @model bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void pay(String bookingRef);

	/**
	 * A method that edit a booking such as 
	 * number of nights, number of guests,
	 * the start and end date, number of rooms, roomtype
	 * extras and booking reference
	 * @param nrOfNights, nrOfGuests, date, nrOfRooms, roomTypes, extras, bookingRef
	 * @model nrOfNightsDataType="org.eclipse.uml2.types.Integer" nrOfNightsRequired="true" nrOfNightsOrdered="false" nrOfGuestsDataType="org.eclipse.uml2.types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" dateDataType="org.eclipse.uml2.types.String" dateRequired="true" dateOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false" roomTypesDataType="org.eclipse.uml2.types.String" roomTypesRequired="true" roomTypesOrdered="false" extrasDataType="org.eclipse.uml2.types.String" extrasRequired="true" extrasOrdered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void editBooking(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras, String bookingRef);

	/**
	 * TODO: REMOVE THIS METHOD
	 * 
	 * @model nrOfNightsDataType="org.eclipse.uml2.types.Integer" nrOfNightsRequired="true" nrOfNightsOrdered="false" nrOfGuestsDataType="org.eclipse.uml2.types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" dateDataType="org.eclipse.uml2.types.String" dateRequired="true" dateOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false" roomTypesDataType="org.eclipse.uml2.types.String" roomTypesRequired="true" roomTypesOrdered="false" extrasDataType="org.eclipse.uml2.types.String" extrasRequired="true" extrasOrdered="false"
	 * @generated NOT
	 */
	void searchRoom(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras);

	/**
	 * A method that sets personal details such as the customer's 
	 * first name, lastname, age and email.
	 * @param firstName, lastName, age, email
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" ageDataType="org.eclipse.uml2.types.Integer" ageRequired="true" ageOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 * @generated NOT
	 */
	int setPersonalDetails(String firstName, String lastName, int age, String email);

	/**
	 * A method that chooses a specific payment method (card, cash, voucher)
	 * @param paymentMethod
	 * @model paymentMethodDataType="org.eclipse.uml2.types.String" paymentMethodRequired="true" paymentMethodOrdered="false"
	 * @generated NOT
	 */
	void choosePaymentMethod(String paymentMethod);

	/**
	 * A method that sets the payment details such as card number,
	 * card code verification, expiration month, expiration year,
	 * the customer's first name and last name.
	 * @param ccNr, ccV, expMonth, expYear
	 * @model ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.Integer" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.Integer" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated NOT
	 */
	void setPaymentDetails(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

	/**
	 * A method that checks out a specific booking reference/guest
	 * @param bookingRef, guestEmail
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false" guestEmailDataType="org.eclipse.uml2.types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	int checkOut(String bookingRef, String guestEmail);

	/**
	 * A method that checks in a specific booking reference/guest
	 * @param bookingRef, guestEmail
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false" guestEmailDataType="org.eclipse.uml2.types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	int checkIn(String bookingRef, String guestEmail);

	/**
	 * TODO: CHANGE THE NAME JUST LIKE IN BankingModel/setPaymentDetails
	 * TODO: How are we supposed to pay for the extras AFTER a booking is done? 
	 * A method that pays when inserting correct card number, 
	 * card code verification, expiration month and expiration year.
	 * @param ccNr, ccV, expMonth, expYear
	 * @model ccNrDataType="org.eclipse.uml2.types.String" ccNrRequired="true" ccNrOrdered="false" ccVDataType="org.eclipse.uml2.types.String" ccVRequired="true" ccVOrdered="false" expMonthDataType="org.eclipse.uml2.types.Integer" expMonthRequired="true" expMonthOrdered="false" expYearDataType="org.eclipse.uml2.types.Integer" expYearRequired="true" expYearOrdered="false"
	 * @generated NOT
	 */
	void pay(String ccNr, String ccV, int expMonth, int expYear);

	/**
	 * A method that enables self management for a specific guest
	 * @param guestEmail
	 * @model guestEmailDataType="org.eclipse.uml2.types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated NOT
	 */
	void enableSelfManagement(String guestEmail);

	/**
	 * A method that adds a service note
	 * @model serviceNoteDataType="org.eclipse.uml2.types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated NOT
	 */
	void addServiceNote(String serviceNote);

	/**
	 * A method that edits a service note by changing a specific service note
	 * into a new service note
	 * @param oldServiceNote, newServiceNote
	 * @model oldServiceNoteDataType="org.eclipse.uml2.types.String" oldServiceNoteRequired="true" oldServiceNoteOrdered="false" newServiceNoteDataType="org.eclipse.uml2.types.String" newServiceNoteRequired="true" newServiceNoteOrdered="false"
	 * @generated NOT 
	 */
	void editServiceNote(String oldServiceNote, String newServiceNote);

	/**
	 * A method that removes a service note.
	 * @param serviceNote
	 * @model serviceNoteDataType="org.eclipse.uml2.types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated NOT
	 */
	void removeServiceNote(String serviceNote);

	/**
	 * A method that gets service notes in a specific booking reference
	 * @param bookingRef
	 * @model bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	void getServiceNotes(String bookingRef);

} // BookingProvides
