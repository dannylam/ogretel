/**
 */
package bookingmodel.impl;

import bookingmodel.BookingmodelPackage;
import bookingmodel.Customer;
import bookingmodel.PaymentDetails;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * A class representing a customer.
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bookingmodel.impl.CustomerImpl#getPaymentDetails <em>Payment Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerImpl extends PersonImpl implements Customer {
	/**
	 * The cached value of the '{@link #getPaymentDetails() <em>Payment Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDetails()
	 * @generated
	 * @ordered
	 */
	protected PaymentDetails paymentDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingmodelPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentDetails(PaymentDetails newPaymentDetails, NotificationChain msgs) {
		PaymentDetails oldPaymentDetails = paymentDetails;
		paymentDetails = newPaymentDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BookingmodelPackage.CUSTOMER__PAYMENT_DETAILS, oldPaymentDetails, newPaymentDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDetails(PaymentDetails newPaymentDetails) {
		if (newPaymentDetails != paymentDetails) {
			NotificationChain msgs = null;
			if (paymentDetails != null)
				msgs = ((InternalEObject)paymentDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BookingmodelPackage.CUSTOMER__PAYMENT_DETAILS, null, msgs);
			if (newPaymentDetails != null)
				msgs = ((InternalEObject)newPaymentDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BookingmodelPackage.CUSTOMER__PAYMENT_DETAILS, null, msgs);
			msgs = basicSetPaymentDetails(newPaymentDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.CUSTOMER__PAYMENT_DETAILS, newPaymentDetails, newPaymentDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BookingmodelPackage.CUSTOMER__PAYMENT_DETAILS:
				return basicSetPaymentDetails(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingmodelPackage.CUSTOMER__PAYMENT_DETAILS:
				return getPaymentDetails();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BookingmodelPackage.CUSTOMER__PAYMENT_DETAILS:
				setPaymentDetails((PaymentDetails)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BookingmodelPackage.CUSTOMER__PAYMENT_DETAILS:
				setPaymentDetails((PaymentDetails)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BookingmodelPackage.CUSTOMER__PAYMENT_DETAILS:
				return paymentDetails != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerImpl
