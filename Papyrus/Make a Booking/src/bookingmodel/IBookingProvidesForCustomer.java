/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking Provides For Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see bookingmodel.BookingmodelPackage#getIBookingProvidesForCustomer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBookingProvidesForCustomer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	Booking getBooking(String bookingRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	int pay(String bookingRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	int getPrice(String bookingRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	int removeBooking(String bookingRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false" startDateDataType="types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="types.String" endDateRequired="true" endDateOrdered="false" nrOfGuestsDataType="types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" roomTypesDataType="types.String" roomTypesRequired="true" roomTypesOrdered="false" extrasDataType="types.String" extrasRequired="true" extrasOrdered="false"
	 * @generated
	 */
	int editBooking(String bookingRef, String startDate, String endDate, int nrOfGuests, String roomTypes, String extras);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" methodDataType="types.String" methodRequired="true" methodOrdered="false"
	 * @generated
	 */
	int choosePaymentMethod(String method);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" ccNumberDataType="types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="types.Integer" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="types.Integer" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	int setPaymentDetails(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" firstNameDataType="types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="types.String" lastNameRequired="true" lastNameOrdered="false" ageDataType="types.Integer" ageRequired="true" ageOrdered="false" emailDataType="types.String" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	int setPersonalDetails(String firstName, String lastName, int age, String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" customerEmailDataType="types.String" customerEmailRequired="true" customerEmailOrdered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	int setCustomerToBooking(String customerEmail, String bookingRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" startDateDataType="types.String" startDateRequired="true" startDateOrdered="false" endDateDataType="types.String" endDateRequired="true" endDateOrdered="false" nrOfGuestsDataType="types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" roomTypesDataType="types.String" roomTypesRequired="true" roomTypesOrdered="false" extrasDataType="types.String" extrasRequired="true" extrasOrdered="false"
	 * @generated
	 */
	int book(String startDate, String endDate, int nrOfGuests, String roomTypes, String extras);

} // IBookingProvidesForCustomer
