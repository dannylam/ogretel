/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import maintenancemodel.MaintenancemodelPackage;
import maintenancemodel.Room;
import maintenancemodel.RoomHandler;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the maintenancemodel object '<em><b>Room Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.RoomHandlerImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomHandlerImpl#getIntegerToRoomMap <em>Integer To Room Map</em>}</li>
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
	 * The cached value of the '{@link #getIntegerToRoomMap() <em>Integer To Room Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerToRoomMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<Integer, Room> integerToRoomMap;

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
		return MaintenancemodelPackage.Literals.ROOM_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectResolvingEList<Room>(Room.class, this, MaintenancemodelPackage.ROOM_HANDLER__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Integer, Room> getIntegerToRoomMap() {
		if (integerToRoomMap == null) {
			integerToRoomMap = new EcoreEMap<Integer,Room>(MaintenancemodelPackage.Literals.INTEGER_TO_ROOM_MAP, IntegerToRoomMapImpl.class, this, MaintenancemodelPackage.ROOM_HANDLER__INTEGER_TO_ROOM_MAP);
		}
		return integerToRoomMap;
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
	public int addRoom(int numberID, String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int removeRoom(Room room) {
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
			case MaintenancemodelPackage.ROOM_HANDLER__INTEGER_TO_ROOM_MAP:
				return ((InternalEList<?>)getIntegerToRoomMap()).basicRemove(otherEnd, msgs);
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
			case MaintenancemodelPackage.ROOM_HANDLER__ROOM:
				return getRoom();
			case MaintenancemodelPackage.ROOM_HANDLER__INTEGER_TO_ROOM_MAP:
				if (coreType) return getIntegerToRoomMap();
				else return getIntegerToRoomMap().map();
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
			case MaintenancemodelPackage.ROOM_HANDLER__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection<? extends Room>)newValue);
				return;
			case MaintenancemodelPackage.ROOM_HANDLER__INTEGER_TO_ROOM_MAP:
				((EStructuralFeature.Setting)getIntegerToRoomMap()).set(newValue);
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
			case MaintenancemodelPackage.ROOM_HANDLER__ROOM:
				getRoom().clear();
				return;
			case MaintenancemodelPackage.ROOM_HANDLER__INTEGER_TO_ROOM_MAP:
				getIntegerToRoomMap().clear();
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
			case MaintenancemodelPackage.ROOM_HANDLER__ROOM:
				return room != null && !room.isEmpty();
			case MaintenancemodelPackage.ROOM_HANDLER__INTEGER_TO_ROOM_MAP:
				return integerToRoomMap != null && !integerToRoomMap.isEmpty();
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
			case MaintenancemodelPackage.ROOM_HANDLER___EXISTS__INT:
				return exists((Integer)arguments.get(0));
			case MaintenancemodelPackage.ROOM_HANDLER___ADD_ROOM__INT_STRING:
				return addRoom((Integer)arguments.get(0), (String)arguments.get(1));
			case MaintenancemodelPackage.ROOM_HANDLER___REMOVE_ROOM__ROOM:
				return removeRoom((Room)arguments.get(0));
			case MaintenancemodelPackage.ROOM_HANDLER___GET_ROOM__INT:
				return getRoom((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomHandlerImpl
