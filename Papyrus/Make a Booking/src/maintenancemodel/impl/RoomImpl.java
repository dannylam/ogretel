/**
 */
package maintenancemodel.impl;

import maintenancemodel.ModelPackage;
import maintenancemodel.Room;
import maintenancemodel.RoomStatusEnum;
import maintenancemodel.RoomType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.RoomImpl#getNumberID <em>Number ID</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomImpl#getRoomStatusEnum <em>Room Status Enum</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getNumberID() <em>Number ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberID()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberID() <em>Number ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberID()
	 * @generated
	 * @ordered
	 */
	protected int numberID = NUMBER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomStatusEnum() <em>Room Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomStatusEnum()
	 * @generated
	 * @ordered
	 */
	protected static final RoomStatusEnum ROOM_STATUS_ENUM_EDEFAULT = RoomStatusEnum.VACANT;

	/**
	 * The cached value of the '{@link #getRoomStatusEnum() <em>Room Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomStatusEnum()
	 * @generated
	 * @ordered
	 */
	protected RoomStatusEnum roomStatusEnum = ROOM_STATUS_ENUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}
	
	/**
	 * Creates a RoomImpl with the given ID and RoomType.
	 * @generated NOT
	 */
	protected RoomImpl(int numberID, String roomType){
		this.numberID = numberID;
//		this.roomType = stringToRoomType.getValue(roomType);
//		The line above does not work because the StringToRoomType class does not
//		behave like a Map yet.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberID() {
		return numberID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberID(int newNumberID) {
		int oldNumberID = numberID;
		numberID = newNumberID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__NUMBER_ID, oldNumberID, numberID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStatusEnum getRoomStatusEnum() {
		return roomStatusEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomStatusEnum(RoomStatusEnum newRoomStatusEnum) {
		RoomStatusEnum oldRoomStatusEnum = roomStatusEnum;
		roomStatusEnum = newRoomStatusEnum == null ? ROOM_STATUS_ENUM_EDEFAULT : newRoomStatusEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__ROOM_STATUS_ENUM, oldRoomStatusEnum, roomStatusEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomType() {
		if (roomType != null && roomType.eIsProxy()) {
			InternalEObject oldRoomType = (InternalEObject)roomType;
			roomType = (RoomType)eResolveProxy(oldRoomType);
			if (roomType != oldRoomType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
			}
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(RoomType newRoomType) {
		RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ROOM__NUMBER_ID:
				return getNumberID();
			case ModelPackage.ROOM__ROOM_STATUS_ENUM:
				return getRoomStatusEnum();
			case ModelPackage.ROOM__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
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
			case ModelPackage.ROOM__NUMBER_ID:
				setNumberID((Integer)newValue);
				return;
			case ModelPackage.ROOM__ROOM_STATUS_ENUM:
				setRoomStatusEnum((RoomStatusEnum)newValue);
				return;
			case ModelPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)newValue);
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
			case ModelPackage.ROOM__NUMBER_ID:
				setNumberID(NUMBER_ID_EDEFAULT);
				return;
			case ModelPackage.ROOM__ROOM_STATUS_ENUM:
				setRoomStatusEnum(ROOM_STATUS_ENUM_EDEFAULT);
				return;
			case ModelPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)null);
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
			case ModelPackage.ROOM__NUMBER_ID:
				return numberID != NUMBER_ID_EDEFAULT;
			case ModelPackage.ROOM__ROOM_STATUS_ENUM:
				return roomStatusEnum != ROOM_STATUS_ENUM_EDEFAULT;
			case ModelPackage.ROOM__ROOM_TYPE:
				return roomType != null;
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
		result.append(" (numberID: ");
		result.append(numberID);
		result.append(", roomStatusEnum: ");
		result.append(roomStatusEnum);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
