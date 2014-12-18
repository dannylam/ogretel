/**
 */
package bookingmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import bookingmodel.ModelPackage;
import bookingmodel.PaymentDetails;

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
		return ModelPackage.Literals.PAYMENT_DETAILS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PAYMENT_DETAILS__CC_NR, oldCcNr, ccNr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PAYMENT_DETAILS__CC_V, oldCcV, ccV));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PAYMENT_DETAILS__EXP_MONTH, oldExpMonth, expMonth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PAYMENT_DETAILS__EXP_YEAR, oldExpYear, expYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PAYMENT_DETAILS__CC_NR:
				return getCcNr();
			case ModelPackage.PAYMENT_DETAILS__CC_V:
				return getCcV();
			case ModelPackage.PAYMENT_DETAILS__EXP_MONTH:
				return getExpMonth();
			case ModelPackage.PAYMENT_DETAILS__EXP_YEAR:
				return getExpYear();
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
			case ModelPackage.PAYMENT_DETAILS__CC_NR:
				setCcNr((String)newValue);
				return;
			case ModelPackage.PAYMENT_DETAILS__CC_V:
				setCcV((String)newValue);
				return;
			case ModelPackage.PAYMENT_DETAILS__EXP_MONTH:
				setExpMonth((Integer)newValue);
				return;
			case ModelPackage.PAYMENT_DETAILS__EXP_YEAR:
				setExpYear((Integer)newValue);
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
			case ModelPackage.PAYMENT_DETAILS__CC_NR:
				setCcNr(CC_NR_EDEFAULT);
				return;
			case ModelPackage.PAYMENT_DETAILS__CC_V:
				setCcV(CC_V_EDEFAULT);
				return;
			case ModelPackage.PAYMENT_DETAILS__EXP_MONTH:
				setExpMonth(EXP_MONTH_EDEFAULT);
				return;
			case ModelPackage.PAYMENT_DETAILS__EXP_YEAR:
				setExpYear(EXP_YEAR_EDEFAULT);
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
			case ModelPackage.PAYMENT_DETAILS__CC_NR:
				return CC_NR_EDEFAULT == null ? ccNr != null : !CC_NR_EDEFAULT.equals(ccNr);
			case ModelPackage.PAYMENT_DETAILS__CC_V:
				return CC_V_EDEFAULT == null ? ccV != null : !CC_V_EDEFAULT.equals(ccV);
			case ModelPackage.PAYMENT_DETAILS__EXP_MONTH:
				return expMonth != EXP_MONTH_EDEFAULT;
			case ModelPackage.PAYMENT_DETAILS__EXP_YEAR:
				return expYear != EXP_YEAR_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //PaymentDetailsImpl
