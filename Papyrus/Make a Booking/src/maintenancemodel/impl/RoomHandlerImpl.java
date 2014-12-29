/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;

import maintenancemodel.MaintenancemodelPackage;
import maintenancemodel.Room;
import maintenancemodel.RoomHandler;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypesHandler;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the maintenancemodel object '
 * <em><b>Room Handler</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.RoomHandlerImpl#getIntegerToRoomMap <em>Integer To Room Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomHandlerImpl extends MinimalEObjectImpl.Container implements
		RoomHandler {
	/**
	 * The cached value of the '{@link #getIntegerToRoomMap() <em>Integer To Room Map</em>}' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getIntegerToRoomMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<Integer, Room> integerToRoomMap;
	
	/**
	 * Handles RoomTypes
	 * @generated NOT
	 */
	protected RoomTypesHandler rtHandler = new RoomTypesHandlerImpl();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.ROOM_HANDLER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Integer, Room> getIntegerToRoomMap() {
		if (integerToRoomMap == null) {
			integerToRoomMap = new EcoreEMap<Integer,Room>(MaintenancemodelPackage.Literals.INTEGER_TO_ROOM_MAP, IntegerToRoomMapImpl.class, this, MaintenancemodelPackage.ROOM_HANDLER__INTEGER_TO_ROOM_MAP);
		}
		return integerToRoomMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean exists(int roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc --> 
	 * Adds a Room with the given ID and Roomtype.
	 * <!-- end-user-doc -->
	 * 
	 * @return
	 * @generated NOT
	 */
	public int addRoom(int numberID, RoomType roomType) {
		
			Room r = new RoomImpl(numberID, roomType);	
			this.getIntegerToRoomMap().put(numberID, r);
			return 0;
		// No null check?
		// TODO TEST
	}

	/**
	 * <!-- begin-user-doc -->
	 * If the Room exists it is removed.
	 * @return 0 if it was removed else 1.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int removeRoom(int roomID) {
		
		if(this.exists(roomID)){
			this.getIntegerToRoomMap().removeKey(roomID);
			return 0;
		}
		return 1;
		
		// TODO: test
	}

	/**
	 * <!-- begin-user-doc --> {@inheritDoc} <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Room getRoom(int ID) {
		return this.integerToRoomMap.get(new Integer(ID));

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaintenancemodelPackage.ROOM_HANDLER__INTEGER_TO_ROOM_MAP:
				return ((InternalEList<?>)getIntegerToRoomMap()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancemodelPackage.ROOM_HANDLER__INTEGER_TO_ROOM_MAP:
				if (coreType) return getIntegerToRoomMap();
				else return getIntegerToRoomMap().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MaintenancemodelPackage.ROOM_HANDLER__INTEGER_TO_ROOM_MAP:
				((EStructuralFeature.Setting)getIntegerToRoomMap()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MaintenancemodelPackage.ROOM_HANDLER__INTEGER_TO_ROOM_MAP:
				getIntegerToRoomMap().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MaintenancemodelPackage.ROOM_HANDLER__INTEGER_TO_ROOM_MAP:
				return integerToRoomMap != null && !integerToRoomMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case MaintenancemodelPackage.ROOM_HANDLER___EXISTS__INT:
				return exists((Integer)arguments.get(0));
			case MaintenancemodelPackage.ROOM_HANDLER___ADD_ROOM__INT_ROOMTYPE:
				return addRoom((Integer)arguments.get(0), (RoomType)arguments.get(1));
			case MaintenancemodelPackage.ROOM_HANDLER___REMOVE_ROOM__INT:
				return removeRoom((Integer)arguments.get(0));
			case MaintenancemodelPackage.ROOM_HANDLER___GET_ROOM__INT:
				return getRoom((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // RoomHandlerImpl
