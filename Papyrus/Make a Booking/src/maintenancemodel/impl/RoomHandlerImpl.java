/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import maintenancemodel.IntegerToRoomMap;
import maintenancemodel.ModelPackage;
import maintenancemodel.Room;
import maintenancemodel.RoomHandler;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.RoomHandlerImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomHandlerImpl#getRoomTable <em>Room Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomHandlerImpl extends MinimalEObjectImpl.Container implements RoomHandler {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;

	/**
	 * The cached value of the '{@link #getRoomTable() <em>Room Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTable()
	 * @generated
	 * @ordered
	 */
	protected IntegerToRoomMap roomTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROOM_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectResolvingEList<Room>(Room.class, this, ModelPackage.ROOM_HANDLER__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerToRoomMap getRoomTable() {
		return roomTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoomTable(IntegerToRoomMap newRoomTable, NotificationChain msgs) {
		IntegerToRoomMap oldRoomTable = roomTable;
		roomTable = newRoomTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_HANDLER__ROOM_TABLE, oldRoomTable, newRoomTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTable(IntegerToRoomMap newRoomTable) {
		if (newRoomTable != roomTable) {
			NotificationChain msgs = null;
			if (roomTable != null)
				msgs = ((InternalEObject)roomTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ROOM_HANDLER__ROOM_TABLE, null, msgs);
			if (newRoomTable != null)
				msgs = ((InternalEObject)newRoomTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ROOM_HANDLER__ROOM_TABLE, null, msgs);
			msgs = basicSetRoomTable(newRoomTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_HANDLER__ROOM_TABLE, newRoomTable, newRoomTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean exists(int ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoom(int numberID, String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoom(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom(int ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ROOM_HANDLER__ROOM_TABLE:
				return basicSetRoomTable(null, msgs);
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
			case ModelPackage.ROOM_HANDLER__ROOM:
				return getRoom();
			case ModelPackage.ROOM_HANDLER__ROOM_TABLE:
				return getRoomTable();
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
			case ModelPackage.ROOM_HANDLER__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection<? extends Room>)newValue);
				return;
			case ModelPackage.ROOM_HANDLER__ROOM_TABLE:
				setRoomTable((IntegerToRoomMap)newValue);
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
			case ModelPackage.ROOM_HANDLER__ROOM:
				getRoom().clear();
				return;
			case ModelPackage.ROOM_HANDLER__ROOM_TABLE:
				setRoomTable((IntegerToRoomMap)null);
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
			case ModelPackage.ROOM_HANDLER__ROOM:
				return room != null && !room.isEmpty();
			case ModelPackage.ROOM_HANDLER__ROOM_TABLE:
				return roomTable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.ROOM_HANDLER___EXISTS__INT:
				return exists((Integer)arguments.get(0));
			case ModelPackage.ROOM_HANDLER___ADD_ROOM__INT_STRING:
				addRoom((Integer)arguments.get(0), (String)arguments.get(1));
				return null;
			case ModelPackage.ROOM_HANDLER___REMOVE_ROOM__ROOM:
				removeRoom((Room)arguments.get(0));
				return null;
			case ModelPackage.ROOM_HANDLER___GET_ROOM__INT:
				return getRoom((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomHandlerImpl
