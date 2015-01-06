/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * An interface representing the information a customer has,
 * such as getCustomerName, getLastName, getCustomerAge, 
 * getCustomerEmail, getCcNr, getCcV, getExpMonth, 
 * getExpYear, getCardFirstName, getCardLastName
 *
 * @see bookingmodel.BookingmodelPackage#getCustomerInfo()
 * @model interface="true" abstract="true"
 * @generated NOT
 */
public interface CustomerInfo extends EObject {
	/**
	 * Returns the name of the customer associated to the booking reference
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getCustomerName(String bookingRef);

	/**
	 * Returns the last name of the customer associated to the booking reference
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getCustomerLastName(String bookingRef);

	/**
	 * Returns the age of the customer associated to the booking reference. 
	 * Returns -1 if the booking reference does not exist.
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int getCustomerAge(String bookingRef);

	/**
	 * Returns the email of the customer associated to the booking reference
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */ 
	String getCustomerEmail(String bookingRef);

	/**
	 * Returns the ccnr of the bank card associated to the booking reference
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getCcNr(String bookingRef);

	/**
	 * Returns the ccv of the bank card associated to the booking reference
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getCcV(String bookingRef);

	/**
	 * Returns the expiry month of the bank card associated to the booking reference
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int getExpMonth(String bookingRef);

	/**
	 * Returns the expiry year of the bank card associated to the booking reference
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int getExpYear(String bookingRef);

	/**
	 * Returns the first name of the bank card associated to the booking reference
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getCardFirstName(String bookingRef);

	/**
	 * Returns the last name of the bank card associated to the booking reference
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String geCardtLastName(String bookingRef);

} // CustomerInfo
