/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Customer#getPaymentDetail <em>Payment Detail</em>}</li>
 *   <li>{@link model.Customer#getPaymentDetails <em>Payment Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Detail</em>' reference.
	 * @see #setPaymentDetail(PaymentDetails)
	 * @see model.ModelPackage#getCustomer_PaymentDetail()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentDetails getPaymentDetail();

	/**
	 * Sets the value of the '{@link model.Customer#getPaymentDetail <em>Payment Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Detail</em>' reference.
	 * @see #getPaymentDetail()
	 * @generated
	 */
	void setPaymentDetail(PaymentDetails value);

	/**
	 * Returns the value of the '<em><b>Payment Details</b></em>' reference list.
	 * The list contents are of type {@link model.PaymentDetails}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Details</em>' reference list.
	 * @see model.ModelPackage#getCustomer_PaymentDetails()
	 * @model type="model.PaymentDetails" required="true" ordered="false"
	 * @generated
	 */
	EList getPaymentDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthDataType="org.eclipse.uml2.types.Integer" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearDataType="org.eclipse.uml2.types.Integer" expiryYearRequired="true" expiryYearOrdered="false"
	 * @generated
	 */
	void setPaymentDetails(String ccNumber, String ccv, int expiryMonth, int expiryYear);

} // Customer
