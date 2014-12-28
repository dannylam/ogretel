/**
 */
package bookingmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Details</em>' reference list.
	 * @see bookingmodel.BookingmodelPackage#getCustomer_PaymentDetails()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<PaymentDetails> getPaymentDetails();

} // Customer
