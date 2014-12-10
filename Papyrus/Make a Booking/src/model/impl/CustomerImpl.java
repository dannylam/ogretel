/**
 */
package model.impl;

import java.util.Collection;

import model.Customer;
import model.ModelPackage;
import model.PaymentDetails;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.CustomerImpl#getPaymentDetail <em>Payment Detail</em>}</li>
 *   <li>{@link model.impl.CustomerImpl#getPaymentDetails <em>Payment Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The cached value of the '{@link #getPaymentDetail() <em>Payment Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDetail()
	 * @generated
	 * @ordered
	 */
	protected PaymentDetails paymentDetail;

	/**
	 * The cached value of the '{@link #getPaymentDetails() <em>Payment Details</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDetails()
	 * @generated
	 * @ordered
	 */
	protected EList paymentDetails;

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
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails getPaymentDetail() {
		if (paymentDetail != null && paymentDetail.eIsProxy()) {
			InternalEObject oldPaymentDetail = (InternalEObject)paymentDetail;
			paymentDetail = (PaymentDetails)eResolveProxy(oldPaymentDetail);
			if (paymentDetail != oldPaymentDetail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CUSTOMER__PAYMENT_DETAIL, oldPaymentDetail, paymentDetail));
			}
		}
		return paymentDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails basicGetPaymentDetail() {
		return paymentDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDetail(PaymentDetails newPaymentDetail) {
		PaymentDetails oldPaymentDetail = paymentDetail;
		paymentDetail = newPaymentDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CUSTOMER__PAYMENT_DETAIL, oldPaymentDetail, paymentDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPaymentDetails() {
		if (paymentDetails == null) {
			paymentDetails = new EObjectResolvingEList(PaymentDetails.class, this, ModelPackage.CUSTOMER__PAYMENT_DETAILS);
		}
		return paymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDetails(String ccNumber, String ccv, int expiryMonth, int expiryYear) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CUSTOMER__PAYMENT_DETAIL:
				if (resolve) return getPaymentDetail();
				return basicGetPaymentDetail();
			case ModelPackage.CUSTOMER__PAYMENT_DETAILS:
				return getPaymentDetails();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.CUSTOMER__PAYMENT_DETAIL:
				setPaymentDetail((PaymentDetails)newValue);
				return;
			case ModelPackage.CUSTOMER__PAYMENT_DETAILS:
				getPaymentDetails().clear();
				getPaymentDetails().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.CUSTOMER__PAYMENT_DETAIL:
				setPaymentDetail((PaymentDetails)null);
				return;
			case ModelPackage.CUSTOMER__PAYMENT_DETAILS:
				getPaymentDetails().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.CUSTOMER__PAYMENT_DETAIL:
				return paymentDetail != null;
			case ModelPackage.CUSTOMER__PAYMENT_DETAILS:
				return paymentDetails != null && !paymentDetails.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomerImpl
