/**
 */
package maintenancemodel.impl;

import maintenancemodel.MaintenancemodelPackage;
import maintenancemodel.Room;
import maintenancemodel.RoomHandler;
import maintenancemodel.RoomStatusEnum;
import maintenancemodel.RoomType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the maintenancemodel object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.RoomImpl#getRoomID <em>Room ID</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomImpl#getRoomStatusEnum <em>Room Status Enum</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getRoomID() <em>Room ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomID()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomID() <em>Room ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomID()
	 * @generated
	 * @ordered
	 */
	protected int roomID = ROOM_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomType;
	
	/**
	 * Used to convert String to RoomType
	 * @generated NOT
	 */
	protected RoomHandler rtHandler = new RoomHandlerImpl();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RoomImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Constructor with parameters.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RoomImpl(int numberID, RoomType roomType) {
		this();
		this.roomID = numberID;
		this.roomType = roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomID() {
		return roomID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomID(int newRoomID) {
		int oldRoomID = roomID;
		roomID = newRoomID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM__ROOM_ID, oldRoomID, roomID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM__ROOM_STATUS_ENUM, oldRoomStatusEnum, roomStatusEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoomType(RoomType newRoomType, NotificationChain msgs) {
		RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM__ROOM_TYPE, oldRoomType, newRoomType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(RoomType newRoomType) {
		if (newRoomType != roomType) {
			NotificationChain msgs = null;
			if (roomType != null)
				msgs = ((InternalEObject)roomType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.ROOM__ROOM_TYPE, null, msgs);
			if (newRoomType != null)
				msgs = ((InternalEObject)newRoomType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.ROOM__ROOM_TYPE, null, msgs);
			msgs = basicSetRoomType(newRoomType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM__ROOM_TYPE, newRoomType, newRoomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaintenancemodelPackage.ROOM__ROOM_TYPE:
				return basicSetRoomType(null, msgs);
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
			case MaintenancemodelPackage.ROOM__ROOM_ID:
				return getRoomID();
			case MaintenancemodelPackage.ROOM__ROOM_STATUS_ENUM:
				return getRoomStatusEnum();
			case MaintenancemodelPackage.ROOM__ROOM_TYPE:
				return getRoomType();
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
			case MaintenancemodelPackage.ROOM__ROOM_ID:
				setRoomID((Integer)newValue);
				return;
			case MaintenancemodelPackage.ROOM__ROOM_STATUS_ENUM:
				setRoomStatusEnum((RoomStatusEnum)newValue);
				return;
			case MaintenancemodelPackage.ROOM__ROOM_TYPE:
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
			case MaintenancemodelPackage.ROOM__ROOM_ID:
				setRoomID(ROOM_ID_EDEFAULT);
				return;
			case MaintenancemodelPackage.ROOM__ROOM_STATUS_ENUM:
				setRoomStatusEnum(ROOM_STATUS_ENUM_EDEFAULT);
				return;
			case MaintenancemodelPackage.ROOM__ROOM_TYPE:
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
			case MaintenancemodelPackage.ROOM__ROOM_ID:
				return roomID != ROOM_ID_EDEFAULT;
			case MaintenancemodelPackage.ROOM__ROOM_STATUS_ENUM:
				return roomStatusEnum != ROOM_STATUS_ENUM_EDEFAULT;
			case MaintenancemodelPackage.ROOM__ROOM_TYPE:
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
		result.append(" (roomID: ");
		result.append(roomID);
		result.append(", roomStatusEnum: ");
		result.append(roomStatusEnum);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
