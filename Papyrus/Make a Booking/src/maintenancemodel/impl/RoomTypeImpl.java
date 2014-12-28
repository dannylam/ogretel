/**
 */
package maintenancemodel.impl;

import maintenancemodel.MaintenancemodelPackage;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypeEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the maintenancemodel object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.RoomTypeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomTypeImpl#getMaxNrOfGuests <em>Max Nr Of Guests</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomTypeImpl#getRoomTypeEnum <em>Room Type Enum</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomTypeImpl#getRoomTypeID <em>Room Type ID</em>}</li>
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getRoomTypeID() <em>Room Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomTypeID() <em>Room Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeID()
	 * @generated
	 * @ordered
	 */
	protected String roomTypeID = ROOM_TYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * The ID of the RoomType used in the Map
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String ID = "Default RoomType ID";
	
	
	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getID() {
		return ID;
	}

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
	 * Creates RoomType with given parameters.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoomTypeImpl(String roomTypeID, String roomTypeEnum, int price,
			int maxNrOfGuests, String description) {
		
		this.ID = roomTypeID;
		this.roomTypeEnum = this.stringToRoomTypeEnum(roomTypeEnum);
		this.price = price;
		this.maxNrOfGuests = maxNrOfGuests;
		this.description = description;

		// TODO Auto-generated constructor stub
	}


	/**
	 * Returns the RoomTypeEnum associated with the String that is sent in.
	 * The possible strings are "singlebed", "doublebed" and "luxurysuite",
	 * otherwise singlebed is returned as default.
	 * @generated NOT
	 */
	private RoomTypeEnum stringToRoomTypeEnum(String roomTypeEnum){
		
		switch(roomTypeEnum){
		case "doublebed":
			return RoomTypeEnum.DOUBLEBED;
		case "singlebed":
			return RoomTypeEnum.SINGLEBED;
		case "luxurysuite":
			return RoomTypeEnum.LUXURYSUITE;
		default:
			return RoomTypeEnum.SINGLEBED;
		}
		
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.ROOM_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM_TYPE__PRICE, oldPrice, price));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM_TYPE__MAX_NR_OF_GUESTS, oldMaxNrOfGuests, maxNrOfGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM_TYPE__ROOM_TYPE_ENUM, oldRoomTypeEnum, roomTypeEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomTypeID() {
		return roomTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeID(String newRoomTypeID) {
		String oldRoomTypeID = roomTypeID;
		roomTypeID = newRoomTypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM_TYPE__ROOM_TYPE_ID, oldRoomTypeID, roomTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancemodelPackage.ROOM_TYPE__PRICE:
				return getPrice();
			case MaintenancemodelPackage.ROOM_TYPE__MAX_NR_OF_GUESTS:
				return getMaxNrOfGuests();
			case MaintenancemodelPackage.ROOM_TYPE__DESCRIPTION:
				return getDescription();
			case MaintenancemodelPackage.ROOM_TYPE__ROOM_TYPE_ENUM:
				return getRoomTypeEnum();
			case MaintenancemodelPackage.ROOM_TYPE__ROOM_TYPE_ID:
				return getRoomTypeID();
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
			case MaintenancemodelPackage.ROOM_TYPE__PRICE:
				setPrice((Integer)newValue);
				return;
			case MaintenancemodelPackage.ROOM_TYPE__MAX_NR_OF_GUESTS:
				setMaxNrOfGuests((Integer)newValue);
				return;
			case MaintenancemodelPackage.ROOM_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MaintenancemodelPackage.ROOM_TYPE__ROOM_TYPE_ENUM:
				setRoomTypeEnum((RoomTypeEnum)newValue);
				return;
			case MaintenancemodelPackage.ROOM_TYPE__ROOM_TYPE_ID:
				setRoomTypeID((String)newValue);
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
			case MaintenancemodelPackage.ROOM_TYPE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case MaintenancemodelPackage.ROOM_TYPE__MAX_NR_OF_GUESTS:
				setMaxNrOfGuests(MAX_NR_OF_GUESTS_EDEFAULT);
				return;
			case MaintenancemodelPackage.ROOM_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MaintenancemodelPackage.ROOM_TYPE__ROOM_TYPE_ENUM:
				setRoomTypeEnum(ROOM_TYPE_ENUM_EDEFAULT);
				return;
			case MaintenancemodelPackage.ROOM_TYPE__ROOM_TYPE_ID:
				setRoomTypeID(ROOM_TYPE_ID_EDEFAULT);
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
			case MaintenancemodelPackage.ROOM_TYPE__PRICE:
				return price != PRICE_EDEFAULT;
			case MaintenancemodelPackage.ROOM_TYPE__MAX_NR_OF_GUESTS:
				return maxNrOfGuests != MAX_NR_OF_GUESTS_EDEFAULT;
			case MaintenancemodelPackage.ROOM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MaintenancemodelPackage.ROOM_TYPE__ROOM_TYPE_ENUM:
				return roomTypeEnum != ROOM_TYPE_ENUM_EDEFAULT;
			case MaintenancemodelPackage.ROOM_TYPE__ROOM_TYPE_ID:
				return ROOM_TYPE_ID_EDEFAULT == null ? roomTypeID != null : !ROOM_TYPE_ID_EDEFAULT.equals(roomTypeID);
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
		result.append(", description: ");
		result.append(description);
		result.append(", roomTypeEnum: ");
		result.append(roomTypeEnum);
		result.append(", roomTypeID: ");
		result.append(roomTypeID);
		result.append(')');
		return result.toString();
	}

} //RoomTypeImpl
