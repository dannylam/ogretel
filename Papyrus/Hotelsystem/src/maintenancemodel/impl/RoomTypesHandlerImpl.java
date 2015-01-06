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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the maintenancemodel object '
 * <em><b>Room Types Handler</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.RoomTypesHandlerImpl#getStringToRoomType <em>String To Room Type</em>}</li>
 *   <li>{@link maintenancemodel.impl.RoomTypesHandlerImpl#getCalendar <em>Calendar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomTypesHandlerImpl extends MinimalEObjectImpl.Container
		implements RoomTypesHandler {
	/**
	 * The cached value of the '{@link #getStringToRoomType() <em>String To Room Type</em>}' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStringToRoomType()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, RoomType> stringToRoomType;

	/**
	 * The cached value of the '{@link #getCalendar() <em>Calendar</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected Calendar calendar = new CalendarImpl();

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
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.ROOM_TYPES_HANDLER;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EMap<String, RoomType> getStringToRoomType() {
		if (stringToRoomType == null) {
			stringToRoomType = new EcoreEMap<String, RoomType>(
					MaintenancemodelPackage.Literals.STRING_TO_ROOM_TYPE_ENTRY,
					StringToRoomTypeEntryImpl.class,
					this,
					MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE);
		}
		return stringToRoomType;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean exists(String roomTypeID) {
		return this.getStringToRoomType().containsKey(roomTypeID);
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int addRoomType(String roomTypeID, String roomTypeEnum, int price,
			int maxNrOfGuests, String description) {
		if (price < 0) {
			if (maxNrOfGuests <= 0) {
				if (roomTypeEnum != null
						&& getRoomTypeEnums().contains(roomTypeEnum)) {
					if (roomTypeID != null
							&& !getRoomTypeIDs().contains(roomTypeID)) {
						RoomType newRT = new RoomTypeImpl(roomTypeID,
								roomTypeEnum, price, maxNrOfGuests, description);
						this.stringToRoomType.put(newRT.getID(), newRT);
						this.getCalendar().addEntry(roomTypeID);
						return 0;
					}
					return 1;
				}
				return 2;
			}
			return 3;
		}
		return 4;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc} 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getPrice(String roomTypeID) {
		if (this.exists(roomTypeID)) {
			return this.getRoomType(roomTypeID).getPrice();
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc} 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<String> getRoomTypeIDs() {
		String[] ids = this.stringToRoomType.keySet().toArray(new String[0]);
		return new BasicEList<String>(Arrays.asList(ids));
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc} 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public RoomType getRoomType(String roomTypeID) {
		if (this.getStringToRoomType().containsKey(roomTypeID)) {
			return this.getStringToRoomType().get(roomTypeID);
		}
		return null;
	}

	/**
	  * <!-- begin-user-doc --> 
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Calendar getCalendar() {
		return calendar;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalendar(Calendar newCalendar,
			NotificationChain msgs) {
		Calendar oldCalendar = calendar;
		calendar = newCalendar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.ROOM_TYPES_HANDLER__CALENDAR, oldCalendar, newCalendar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setCalendar(Calendar newCalendar) {
		if (newCalendar != calendar) {
			NotificationChain msgs = null;
			if (calendar != null)
				msgs = ((InternalEObject) calendar)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MaintenancemodelPackage.ROOM_TYPES_HANDLER__CALENDAR,
								null, msgs);
			if (newCalendar != null)
				msgs = ((InternalEObject) newCalendar)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MaintenancemodelPackage.ROOM_TYPES_HANDLER__CALENDAR,
								null, msgs);
			msgs = basicSetCalendar(newCalendar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MaintenancemodelPackage.ROOM_TYPES_HANDLER__CALENDAR,
					newCalendar, newCalendar));
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc} 
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc} 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int addRoomToRoomTypeEntry(String roomTypeID) {
		// If 1st Room of RoomType, create new entry in Map in Calendar
		if (!this.calendar.getStringToListsMap().containsKey(roomTypeID)) {
			this.calendar.addEntry(roomTypeID);
		}
		if (this.calendar.incCap(0, 365, roomTypeID, 1) == 0) {
			return 0;
		}
		return 1;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc} 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int removeRoomFromRoomTypeEntry(String roomTypeID) {
		if (this.calendar.getStringToListsMap().containsKey(roomTypeID)
				&& this.calendar.decCap(0, 365, roomTypeID, 1) == 0) {
			return 0;
		}
		return 1;
	}

	/**
	 * Returns the RoomTypeEnum associated with the String that is sent in. The
	 * possible strings are "singlebed", "doublebed" and "luxurysuite",
	 * otherwise singlebed is returned as default.
	 * 
	 * @generated NOT
	 */
	public RoomTypeEnum stringToRoomTypeEnum(String roomTypeEnum) {
		if(roomTypeEnum.toLowerCase().equals("doublebed")){
			return RoomTypeEnum.DOUBLEBED;
		}else if(roomTypeEnum.toLowerCase().equals("singlebed")){
			return RoomTypeEnum.SINGLEBED;
		}else if(roomTypeEnum.toLowerCase().equals("luxurysuite")){
			return RoomTypeEnum.LUXURYSUITE;
		}else {
			return RoomTypeEnum.SINGLEBED; 
		}
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc} 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int removeRoomType(String roomType) {
		if (this.exists(roomType)
				&& this.getCalendar().removeEntry(roomType) == 0) {
			this.getStringToRoomType().remove(roomType);
			return 0;
		}
		return 1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
				return ((InternalEList<?>)getStringToRoomType()).basicRemove(otherEnd, msgs);
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__CALENDAR:
				return basicSetCalendar(null, msgs);
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
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
				if (coreType) return getStringToRoomType();
				else return getStringToRoomType().map();
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__CALENDAR:
				return getCalendar();
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
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
				((EStructuralFeature.Setting)getStringToRoomType()).set(newValue);
				return;
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__CALENDAR:
				setCalendar((Calendar)newValue);
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
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
				getStringToRoomType().clear();
				return;
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__CALENDAR:
				setCalendar((Calendar)null);
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
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE:
				return stringToRoomType != null && !stringToRoomType.isEmpty();
			case MaintenancemodelPackage.ROOM_TYPES_HANDLER__CALENDAR:
				return calendar != null;
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
