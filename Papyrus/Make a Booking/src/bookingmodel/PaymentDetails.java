/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
* An interface class which represents PaymentDetails, extending EObject.
 * This class has 8 methods;
 * getCcNr - returns the credit card number.
 * setCcNr - sets the credit card number.
 * getCcV - returns the card code verification.
 * setCcV - sets the card code verification.
 * getExpMonth - returns the expiration month.
 * setExpMonth - sets the expiration month.
 * getExpYear - returns the expiration year.
 * setExpYear - sets the expiration year.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.PaymentDetails#getCcNr <em>Cc Nr</em>}</li>
 *   <li>{@link bookingmodel.PaymentDetails#getCcV <em>Cc V</em>}</li>
 *   <li>{@link bookingmodel.PaymentDetails#getExpMonth <em>Exp Month</em>}</li>
 *   <li>{@link bookingmodel.PaymentDetails#getExpYear <em>Exp Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.BookingmodelPackage#getPaymentDetails()
 * @model
 * @generated
 */
public interface PaymentDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>Cc Nr</b></em>' attribute,
	 * that is the credit card number.
	 * @return the value of the '<em>Cc Nr</em>' attribute.
	 * @see #setCcNr(String)
	 * @see bookingmodel.BookingmodelPackage#getPaymentDetails_CcNr()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCcNr();

	/**
	  * Sets the value of the '{@link bookingmodel.PaymentDetails#getCcNr <em>Cc Nr</em>}' attribute,
	 * that is the credit card number.
	 * @param value the new value of the '<em>Cc Nr</em>' attribute.
	 * @see #getCcNr()
	 * @generated
	 */
	void setCcNr(String value);

	/**
	 * Returns the value of the '<em><b>Cc V</b></em>' attribute,
	 * that is the card code verification.
	 * @return the value of the '<em>Cc V</em>' attribute.
	 * @see #setCcV(String)
	 * @see bookingmodel.BookingmodelPackage#getPaymentDetails_CcV()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCcV();

	/**
	 * Sets the value of the '{@link bookingmodel.PaymentDetails#getCcV <em>Cc V</em>}' attribute,
	 * that is the card code verification.
	 * @param value the new value of the '<em>Cc V</em>' attribute.
	 * @see #getCcV()
	 * @generated
	 */
	void setCcV(String value);

	/**
	 * Returns the value of the '<em><b>Exp Month</b></em>' attribute,
	 * that is the expiration month.
	 * @return the value of the '<em>Exp Month</em>' attribute.
	 * @see #setExpMonth(int)
	 * @see bookingmodel.BookingmodelPackage#getPaymentDetails_ExpMonth()
	 * @model dataType="types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExpMonth();

	/**
	 * Sets the value of the '{@link bookingmodel.PaymentDetails#getExpMonth <em>Exp Month</em>}' attribute,
	 * that is the expiration month.
	 * @param value the new value of the '<em>Exp Month</em>' attribute.
	 * @see #getExpMonth()
	 * @generated
	 */
	void setExpMonth(int value);

	/**
	 * Returns the value of the '<em><b>Exp Year</b></em>' attribute, 
	 * that is the expiration year.
	 * @return the value of the '<em>Exp Year</em>' attribute.
	 * @see #setExpYear(int)
	 * @see bookingmodel.BookingmodelPackage#getPaymentDetails_ExpYear()
	 * @model dataType="types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExpYear();

	/**
	 * Sets the value of the '{@link bookingmodel.PaymentDetails#getExpYear <em>Exp Year</em>}' attribute,
	 * that is the expiration year.
	 * @param value the new value of the '<em>Exp Year</em>' attribute.
	 * @see #getExpYear()
	 * @generated
	 */
	void setExpYear(int value);

} // PaymentDetails
