/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking Provides For Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see bookingmodel.BookingmodelPackage#getIBookingProvidesForGuest()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBookingProvidesForGuest extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated
	 */
	int checkIn(String bookingRef, String guestEmail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated
	 */
	int checkOut(String bookingRef, String guestEmail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" ccNumberDataType="types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="types.String" ccvRequired="true" ccvOrdered="false" expMonthDataType="types.Integer" expMonthRequired="true" expMonthOrdered="false" expYearDataType="types.Integer" expYearRequired="true" expYearOrdered="false" firstNameDataType="types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	int pay(String ccNumber, String ccv, int expMonth, int expYear, String firstName, String lastName);

} // IBookingProvidesForGuest
