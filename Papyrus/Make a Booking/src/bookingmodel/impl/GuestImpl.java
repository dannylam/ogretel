/**
 */
package bookingmodel.impl;

import bookingmodel.BookingmodelPackage;
import bookingmodel.Guest;
import bookingmodel.GuestTypes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bookingmodel.impl.GuestImpl#getRoomNr <em>Room Nr</em>}</li>
 *   <li>{@link bookingmodel.impl.GuestImpl#getGuestTypes <em>Guest Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuestImpl extends PersonImpl implements Guest {
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
	 * The default value of the '{@link #getGuestTypes() <em>Guest Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestTypes()
	 * @generated
	 * @ordered
	 */
	protected static final GuestTypes GUEST_TYPES_EDEFAULT = GuestTypes.REGULAR;

	/**
	 * The cached value of the '{@link #getGuestTypes() <em>Guest Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestTypes()
	 * @generated
	 * @ordered
	 */
	protected GuestTypes guestTypes = GUEST_TYPES_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return BookingmodelPackage.Literals.GUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.GUEST__ROOM_NR, oldRoomNr, roomNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestTypes getGuestTypes() {
		return guestTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestTypes(GuestTypes newGuestTypes) {
		GuestTypes oldGuestTypes = guestTypes;
		guestTypes = newGuestTypes == null ? GUEST_TYPES_EDEFAULT : newGuestTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingmodelPackage.GUEST__GUEST_TYPES, oldGuestTypes, guestTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingmodelPackage.GUEST__ROOM_NR:
				return getRoomNr();
			case BookingmodelPackage.GUEST__GUEST_TYPES:
				return getGuestTypes();
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
			case BookingmodelPackage.GUEST__ROOM_NR:
				setRoomNr((Integer)newValue);
				return;
			case BookingmodelPackage.GUEST__GUEST_TYPES:
				setGuestTypes((GuestTypes)newValue);
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
			case BookingmodelPackage.GUEST__ROOM_NR:
				setRoomNr(ROOM_NR_EDEFAULT);
				return;
			case BookingmodelPackage.GUEST__GUEST_TYPES:
				setGuestTypes(GUEST_TYPES_EDEFAULT);
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
			case BookingmodelPackage.GUEST__ROOM_NR:
				return roomNr != ROOM_NR_EDEFAULT;
			case BookingmodelPackage.GUEST__GUEST_TYPES:
				return guestTypes != GUEST_TYPES_EDEFAULT;
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
		result.append(" (roomNr: ");
		result.append(roomNr);
		result.append(", guestTypes: ");
		result.append(guestTypes);
		result.append(')');
		return result.toString();
	}

} //GuestImpl
