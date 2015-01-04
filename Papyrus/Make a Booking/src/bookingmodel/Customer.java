/**
 */
package bookingmodel;


 /**
 * An interface class which represents a Customer, extending EObject.
 * with one method;
 * getPaymentDetails - return a list of payment details.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.Customer#getPaymentDetails <em>Payment Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.BookingmodelPackage#getCustomer()
 * @model
 * @generated 
 */
public interface Customer extends Person {
	/**
	 * Returns the value of the '<em><b>Payment Details</b></em>' reference list.
	 * The list contents are of type {@link bookingmodel.PaymentDetails}.
	 * @return the value of the '<em>Payment Details</em>' reference list.
	 * @see bookingmodel.BookingmodelPackage#getCustomer_PaymentDetails()
	 * @model required="true" ordered="false"
	 * @generated 
	 */
	PaymentDetails getPaymentDetails();

	/**
	 * Sets the value of the '{@link bookingmodel.Customer#getPaymentDetails <em>Payment Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Details</em>' containment reference.
	 * @see #getPaymentDetails()
	 * @generated
	 */
	void setPaymentDetails(PaymentDetails value);

} // Customer
