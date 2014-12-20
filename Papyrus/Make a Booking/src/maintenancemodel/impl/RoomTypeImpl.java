/**
 */
package maintenancemodel.impl;

import maintenancemodel.ModelPackage;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypeEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.RoomTypeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomTypeImpl#getMaxNrOfGuests <em>Max Nr Of Guests</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomTypeImpl#getDesciption <em>Desciption</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomTypeImpl#getRoomTypeEnum <em>Room Type Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomTypeImpl extends MinimalEObjectImpl.Container implements RoomType {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNrOfGuests() <em>Max Nr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNrOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NR_OF_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNrOfGuests() <em>Max Nr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNrOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int maxNrOfGuests = MAX_NR_OF_GUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesciption() <em>Desciption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesciption()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesciption() <em>Desciption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesciption()
	 * @generated
	 * @ordered
	 */
	protected String desciption = DESCIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomTypeEnum() <em>Room Type Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeEnum()
	 * @generated
	 * @ordered
	 */
	protected static final RoomTypeEnum ROOM_TYPE_ENUM_EDEFAULT = RoomTypeEnum.SINGLEBED;

	/**
	 * The cached value of the '{@link #getRoomTypeEnum() <em>Room Type Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeEnum()
	 * @generated
	 * @ordered
	 */
	protected RoomTypeEnum roomTypeEnum = ROOM_TYPE_ENUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROOM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_TYPE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNrOfGuests() {
		return maxNrOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNrOfGuests(int newMaxNrOfGuests) {
		int oldMaxNrOfGuests = maxNrOfGuests;
		maxNrOfGuests = newMaxNrOfGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_TYPE__MAX_NR_OF_GUESTS, oldMaxNrOfGuests, maxNrOfGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesciption() {
		return desciption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesciption(String newDesciption) {
		String oldDesciption = desciption;
		desciption = newDesciption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_TYPE__DESCIPTION, oldDesciption, desciption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeEnum getRoomTypeEnum() {
		return roomTypeEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeEnum(RoomTypeEnum newRoomTypeEnum) {
		RoomTypeEnum oldRoomTypeEnum = roomTypeEnum;
		roomTypeEnum = newRoomTypeEnum == null ? ROOM_TYPE_ENUM_EDEFAULT : newRoomTypeEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_TYPE__ROOM_TYPE_ENUM, oldRoomTypeEnum, roomTypeEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ROOM_TYPE__PRICE:
				return getPrice();
			case ModelPackage.ROOM_TYPE__MAX_NR_OF_GUESTS:
				return getMaxNrOfGuests();
			case ModelPackage.ROOM_TYPE__DESCIPTION:
				return getDesciption();
			case ModelPackage.ROOM_TYPE__ROOM_TYPE_ENUM:
				return getRoomTypeEnum();
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
			case ModelPackage.ROOM_TYPE__PRICE:
				setPrice((Integer)newValue);
				return;
			case ModelPackage.ROOM_TYPE__MAX_NR_OF_GUESTS:
				setMaxNrOfGuests((Integer)newValue);
				return;
			case ModelPackage.ROOM_TYPE__DESCIPTION:
				setDesciption((String)newValue);
				return;
			case ModelPackage.ROOM_TYPE__ROOM_TYPE_ENUM:
				setRoomTypeEnum((RoomTypeEnum)newValue);
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
			case ModelPackage.ROOM_TYPE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ModelPackage.ROOM_TYPE__MAX_NR_OF_GUESTS:
				setMaxNrOfGuests(MAX_NR_OF_GUESTS_EDEFAULT);
				return;
			case ModelPackage.ROOM_TYPE__DESCIPTION:
				setDesciption(DESCIPTION_EDEFAULT);
				return;
			case ModelPackage.ROOM_TYPE__ROOM_TYPE_ENUM:
				setRoomTypeEnum(ROOM_TYPE_ENUM_EDEFAULT);
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
			case ModelPackage.ROOM_TYPE__PRICE:
				return price != PRICE_EDEFAULT;
			case ModelPackage.ROOM_TYPE__MAX_NR_OF_GUESTS:
				return maxNrOfGuests != MAX_NR_OF_GUESTS_EDEFAULT;
			case ModelPackage.ROOM_TYPE__DESCIPTION:
				return DESCIPTION_EDEFAULT == null ? desciption != null : !DESCIPTION_EDEFAULT.equals(desciption);
			case ModelPackage.ROOM_TYPE__ROOM_TYPE_ENUM:
				return roomTypeEnum != ROOM_TYPE_ENUM_EDEFAULT;
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
		result.append(" (price: ");
		result.append(price);
		result.append(", maxNrOfGuests: ");
		result.append(maxNrOfGuests);
		result.append(", desciption: ");
		result.append(desciption);
		result.append(", roomTypeEnum: ");
		result.append(roomTypeEnum);
		result.append(')');
		return result.toString();
	}

} //RoomTypeImpl
