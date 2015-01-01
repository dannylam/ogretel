/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import maintenancemodel.Calendar;
import maintenancemodel.MaintenancemodelPackage;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypeEnum;
import maintenancemodel.RoomTypesHandler;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
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
 * <em><b>Room Types Handler</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link maintenancemodel.impl.RoomTypesHandlerImpl#getStringToRoomType
 * <em>String To Room Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomTypesHandlerImpl extends MinimalEObjectImpl.Container
		implements RoomTypesHandler {
	/**
	 * The cached value of the '{@link #getStringToRoomType()
	 * <em>String To Room Type</em>}' map. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStringToRoomType()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, RoomType> stringToRoomType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public RoomTypesHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.ROOM_TYPES_HANDLER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMap<String, RoomType> getStringToRoomType() {
		if (stringToRoomType == null) {
			stringToRoomType = new EcoreEMap<String, RoomType>(
					MaintenancemodelPackage.Literals.STRING_TO_ROOM_TYPE_MAP,
					StringToRoomTypeMapImpl.class,
					this,
					MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE);
		}
		return stringToRoomType;
	}

	/**
	 * Returns true if there is a RoomType with the given String ID
	 * 
	 * @param ID
	 *            the RoomType ID to be checked if it exists
	 * 
	 * @generated NOT
	 */
	public boolean exists(String ID) {

		return this.getStringToRoomType().containsKey(ID);
		// TODO: TEST
	}

	/**
	 * <!-- begin-user-doc --> Add a RoomType with the given parameters <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int addRoomType(String roomTypeID, String roomTypeEnum, int price,
			int maxNrOfGuests, String description) {

		if (price >= 0) {
			if (maxNrOfGuests >= 0) {
				if (roomTypeEnum != null
						&& getRoomTypeEnums().contains(roomTypeEnum)) {
					if (roomTypeID != null
							&& !getRoomTypeIDs().contains(roomTypeID)) {
						RoomType newRT = new RoomTypeImpl(roomTypeID,
								roomTypeEnum, price, maxNrOfGuests, description);
						this.getStringToRoomType().put(newRT.getID(), newRT);
						return 0;
					}
					return 1;
				}
				return 2;
			}
			return 3;
		}
		return 4;

		// TODO
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getPrice(String roomTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<String> getRoomTypeIDs() {
		String[] ids = this.stringToRoomType.keySet()
				.toArray(new String[0]);
		return new BasicEList<String>(Arrays.asList(ids));
	}

	/**
	 * <!-- begin-user-doc --> Get the RoomType from its ID. <!-- end-user-doc
	 * -->
	 * 
	 * @generated NOT
	 */
	public RoomType getRoomType(String roomTypeID) {

		if (this.getStringToRoomType().containsKey(roomTypeID)) {
			return this.getStringToRoomType().get(roomTypeID);
		}
		return null;

		// TODO: test. & is return null good?
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Calendar getCalendar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<String> getRoomTypeEnums() {
		RoomTypeEnum[] enums = RoomTypeEnum.values();
		EList<String> strings = new BasicEList<String>(enums.length);

		for (RoomTypeEnum e : enums) {
			strings.add(e.toString());
		}

		return strings;
	}

	/**
	 * Returns the RoomTypeEnum associated with the String that is sent in. The
	 * possible strings are "singlebed", "doublebed" and "luxurysuite",
	 * otherwise singlebed is returned as default.
	 * 
	 * @generated NOT
	 */
	public RoomTypeEnum stringToRoomTypeEnum(String roomTypeEnum) {

		switch (roomTypeEnum) {
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
	 * <!-- begin-user-doc --> Remove the RoomType sent in from the list of
	 * known objects of the RoomType class. If it was removed 0 is returned else
	 * 1. <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int removeRoomType(String roomType) {

		if (exists(roomType)) {
			this.getStringToRoomType().remove(roomType);
			return 0;
		}
		return 1;

		// TODO: TEST
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc --> Return true if the RoomType sent in exists in the
	 * list of RoomType objects. <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	private boolean exists(RoomType roomType) {
		// return this.roomType.contains(roomType);
		return true;
		// TODO something
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
			return ((InternalEList<?>) getStringToRoomType()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
			if (coreType)
				return getStringToRoomType();
			else
				return getStringToRoomType().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
			((EStructuralFeature.Setting) getStringToRoomType()).set(newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
			getStringToRoomType().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
			return stringToRoomType != null && !stringToRoomType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case MaintenancemodelPackage.ROOM_TYPES_HANDLER___EXISTS__STRING:
			return exists((String) arguments.get(0));
		case MaintenancemodelPackage.ROOM_TYPES_HANDLER___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING:
			return addRoomType((String) arguments.get(0),
					(String) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3), (String) arguments.get(4));
		case MaintenancemodelPackage.ROOM_TYPES_HANDLER___REMOVE_ROOM_TYPE__STRING:
			return removeRoomType((String) arguments.get(0));
		case MaintenancemodelPackage.ROOM_TYPES_HANDLER___GET_PRICE__STRING:
			return getPrice((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // RoomTypesHandlerImpl
