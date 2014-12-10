/**
 */
package model.impl;

import model.Guest;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.GuestImpl#getGuestType <em>Guest Type</em>}</li>
 *   <li>{@link model.impl.GuestImpl#getRoomNr <em>Room Nr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuestImpl extends MinimalEObjectImpl.Container implements Guest {
	/**
	 * The default value of the '{@link #getGuestType() <em>Guest Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestType()
	 * @generated
	 * @ordered
	 */
	protected static final Enumerator GUEST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuestType() <em>Guest Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestType()
	 * @generated
	 * @ordered
	 */
	protected Enumerator guestType = GUEST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomNr() <em>Room Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNr()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNr() <em>Room Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNr()
	 * @generated
	 * @ordered
	 */
	protected int roomNr = ROOM_NR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getGuestType() {
		return guestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestType(Enumerator newGuestType) {
		Enumerator oldGuestType = guestType;
		guestType = newGuestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUEST__GUEST_TYPE, oldGuestType, guestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNr() {
		return roomNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNr(int newRoomNr) {
		int oldRoomNr = roomNr;
		roomNr = newRoomNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUEST__ROOM_NR, oldRoomNr, roomNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Enumerator guestType) {
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
			case ModelPackage.GUEST__GUEST_TYPE:
				return getGuestType();
			case ModelPackage.GUEST__ROOM_NR:
				return new Integer(getRoomNr());
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
			case ModelPackage.GUEST__GUEST_TYPE:
				setGuestType((Enumerator)newValue);
				return;
			case ModelPackage.GUEST__ROOM_NR:
				setRoomNr(((Integer)newValue).intValue());
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
			case ModelPackage.GUEST__GUEST_TYPE:
				setGuestType(GUEST_TYPE_EDEFAULT);
				return;
			case ModelPackage.GUEST__ROOM_NR:
				setRoomNr(ROOM_NR_EDEFAULT);
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
			case ModelPackage.GUEST__GUEST_TYPE:
				return GUEST_TYPE_EDEFAULT == null ? guestType != null : !GUEST_TYPE_EDEFAULT.equals(guestType);
			case ModelPackage.GUEST__ROOM_NR:
				return roomNr != ROOM_NR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (guestType: ");
		result.append(guestType);
		result.append(", roomNr: ");
		result.append(roomNr);
		result.append(')');
		return result.toString();
	}

} //GuestImpl
