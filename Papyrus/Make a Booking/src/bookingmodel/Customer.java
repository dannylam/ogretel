/**
 */
package bookingmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the interface of a '<em><b>Customer</b></em>',
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
 * @see bookingmodel.ModelPackage#getCustomer()
 * @maintenancemodel
 * @generated NOT
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment Details</b></em>' reference list.
	 * The list contents are of type {@link bookingmodel.PaymentDetails}.
	 * @return the value of the '<em>Payment Details</em>' reference list.
	 * @see bookingmodel.ModelPackage#getCustomer_PaymentDetails()
	 * @maintenancemodel required="true" ordered="false"
	 * @generated NOT
	 */
	EList<PaymentDetails> getPaymentDetails();

} // Customer
