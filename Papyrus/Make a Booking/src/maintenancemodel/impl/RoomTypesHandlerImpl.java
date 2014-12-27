/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import maintenancemodel.MaintenancemodelPackage;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypeEnum;
import maintenancemodel.RoomTypesHandler;
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
 * An implementation of the maintenancemodel object '<em><b>Room Types Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.RoomTypesHandlerImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomTypesHandlerImpl#getStringToRoomType <em>String To Room Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomTypesHandlerImpl extends MinimalEObjectImpl.Container implements RoomTypesHandler {
	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType> roomType;

	/**
	 * The cached value of the '{@link #getStringToRoomType() <em>String To Room Type</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringToRoomType()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, RoomTypeEnum> stringToRoomType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypesHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.ROOM_TYPES_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomType() {
		if (roomType == null) {
			roomType = new EObjectResolvingEList<RoomType>(RoomType.class, this, MaintenancemodelPackage.ROOM_TYPES_HANDLER__ROOM_TYPE);
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, RoomTypeEnum> getStringToRoomType() {
		if (stringToRoomType == null) {
			stringToRoomType = new EcoreEMap<String,RoomTypeEnum>(MaintenancemodelPackage.Literals.STRING_TO_ROOM_TYPE, StringToRoomTypeImpl.class, this, MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE);
		}
		return stringToRoomType;
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
	public void addRoomType(String roomType, int price, int maxNrOfGuests, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoomType(RoomType roomType) {
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
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
				return ((InternalEList<?>)getStringToRoomType()).basicRemove(otherEnd, msgs);
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
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__ROOM_TYPE:
				return getRoomType();
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
				if (coreType) return getStringToRoomType();
				else return getStringToRoomType().map();
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
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__ROOM_TYPE:
				getRoomType().clear();
				getRoomType().addAll((Collection<? extends RoomType>)newValue);
				return;
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
				((EStructuralFeature.Setting)getStringToRoomType()).set(newValue);
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
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__ROOM_TYPE:
				getRoomType().clear();
				return;
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
				getStringToRoomType().clear();
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
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__ROOM_TYPE:
				return roomType != null && !roomType.isEmpty();
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
				return stringToRoomType != null && !stringToRoomType.isEmpty();
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
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER___EXISTS__INT:
				return exists((Integer)arguments.get(0));
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER___ADD_ROOM_TYPE__STRING_INT_INT_STRING:
				addRoomType((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
				return null;
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER___REMOVE_ROOM_TYPE__ROOMTYPE:
				removeRoomType((RoomType)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomTypesHandlerImpl
