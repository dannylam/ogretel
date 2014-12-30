/**
 */
package bookingmodel.impl;

import bookingmodel.BookingmodelPackage;
import bookingmodel.PaymentDetails;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bookingmodel.impl.PaymentDetailsImpl#getCcNr <em>Cc Nr</em>}</li>
 *   <li>{@link bookingmodel.impl.PaymentDetailsImpl#getCcV <em>Cc V</em>}</li>
 *   <li>{@link bookingmodel.impl.PaymentDetailsImpl#getExpMonth <em>Exp Month</em>}</li>
 *   <li>{@link bookingmodel.impl.PaymentDetailsImpl#getExpYear <em>Exp Year</em>}</li>
 *   <li>{@link bookingmodel.impl.PaymentDetailsImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link bookingmodel.impl.PaymentDetailsImpl#getLastName <em>Last Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentDetailsImpl extends MinimalEObjectImpl.Container implements PaymentDetails {
	/**
	 * The default value of the '{@link #getCcNr() <em>Cc Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcNr()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcNr() <em>Cc Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcNr()
	 * @generated
	 * @ordered
	 */
	protected String ccNr = CC_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcV() <em>Cc V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcV()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_V_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcV() <em>Cc V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcV()
	 * @generated
	 * @ordered
	 */
	protected String ccV = CC_V_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpMonth() <em>Exp Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int EXP_MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpMonth() <em>Exp Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpMonth()
	 * @generated
	 * @ordered
	 */
	protected int expMonth = EXP_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpYear() <em>Exp Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpYear()
	 * @generated
	 * @ordered
	 */
	protected static final int EXP_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpYear() <em>Exp Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpYear()
	 * @generated
	 * @ordered
	 */
	protected int expYear = EXP_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingmodelPackage.Literals.PAYMENT_DETAILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCcNr() {
		return ccNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcNr(String newCcNr) {
		String oldCcNr = ccNr;
		ccNr = newCcNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.PAYMENT_DETAILS__CC_NR, oldCcNr, ccNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCcV() {
		return ccV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcV(String newCcV) {
		String oldCcV = ccV;
		ccV = newCcV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.PAYMENT_DETAILS__CC_V, oldCcV, ccV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpMonth() {
		return expMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpMonth(int newExpMonth) {
		int oldExpMonth = expMonth;
		expMonth = newExpMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.PAYMENT_DETAILS__EXP_MONTH, oldExpMonth, expMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpYear() {
		return expYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpYear(int newExpYear) {
		int oldExpYear = expYear;
		expYear = newExpYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.PAYMENT_DETAILS__EXP_YEAR, oldExpYear, expYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.PAYMENT_DETAILS__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.PAYMENT_DETAILS__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingmodelPackage.PAYMENT_DETAILS__CC_NR:
				return getCcNr();
			case BookingmodelPackage.PAYMENT_DETAILS__CC_V:
				return getCcV();
			case BookingmodelPackage.PAYMENT_DETAILS__EXP_MONTH:
				return getExpMonth();
			case BookingmodelPackage.PAYMENT_DETAILS__EXP_YEAR:
				return getExpYear();
			case BookingmodelPackage.PAYMENT_DETAILS__FIRST_NAME:
				return getFirstName();
			case BookingmodelPackage.PAYMENT_DETAILS__LAST_NAME:
				return getLastName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BookingmodelPackage.PAYMENT_DETAILS__CC_NR:
				setCcNr((String)newValue);
				return;
			case BookingmodelPackage.PAYMENT_DETAILS__CC_V:
				setCcV((String)newValue);
				return;
			case BookingmodelPackage.PAYMENT_DETAILS__EXP_MONTH:
				setExpMonth((Integer)newValue);
				return;
			case BookingmodelPackage.PAYMENT_DETAILS__EXP_YEAR:
				setExpYear((Integer)newValue);
				return;
			case BookingmodelPackage.PAYMENT_DETAILS__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case BookingmodelPackage.PAYMENT_DETAILS__LAST_NAME:
				setLastName((String)newValue);
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
			case BookingmodelPackage.PAYMENT_DETAILS__CC_NR:
				setCcNr(CC_NR_EDEFAULT);
				return;
			case BookingmodelPackage.PAYMENT_DETAILS__CC_V:
				setCcV(CC_V_EDEFAULT);
				return;
			case BookingmodelPackage.PAYMENT_DETAILS__EXP_MONTH:
				setExpMonth(EXP_MONTH_EDEFAULT);
				return;
			case BookingmodelPackage.PAYMENT_DETAILS__EXP_YEAR:
				setExpYear(EXP_YEAR_EDEFAULT);
				return;
			case BookingmodelPackage.PAYMENT_DETAILS__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case BookingmodelPackage.PAYMENT_DETAILS__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
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
			case BookingmodelPackage.PAYMENT_DETAILS__CC_NR:
				return CC_NR_EDEFAULT == null ? ccNr != null : !CC_NR_EDEFAULT.equals(ccNr);
			case BookingmodelPackage.PAYMENT_DETAILS__CC_V:
				return CC_V_EDEFAULT == null ? ccV != null : !CC_V_EDEFAULT.equals(ccV);
			case BookingmodelPackage.PAYMENT_DETAILS__EXP_MONTH:
				return expMonth != EXP_MONTH_EDEFAULT;
			case BookingmodelPackage.PAYMENT_DETAILS__EXP_YEAR:
				return expYear != EXP_YEAR_EDEFAULT;
			case BookingmodelPackage.PAYMENT_DETAILS__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case BookingmodelPackage.PAYMENT_DETAILS__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ccNr: ");
		result.append(ccNr);
		result.append(", ccV: ");
		result.append(ccV);
		result.append(", expMonth: ");
		result.append(expMonth);
		result.append(", expYear: ");
		result.append(expYear);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(')');
		return result.toString();
	}

} //PaymentDetailsImpl
