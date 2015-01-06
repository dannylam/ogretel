/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;
import maintenancemodel.Calendar;
import maintenancemodel.MaintenancemodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the maintenancemodel object '
 * <em><b>Calendar</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.CalendarImpl#getStringToListsMap <em>String To Lists Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalendarImpl extends MinimalEObjectImpl.Container implements
		Calendar {
	/**
	 * The cached value of the '{@link #getStringToListsMap()
	 * <em>String To Lists Map</em>}' map. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStringToListsMap()
	 * @generated NOT
	 * @ordered
	 */
	protected EMap<String, EList<Integer>> stringToListsMap;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.CALENDAR;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EMap<String, EList<Integer>> getStringToListsMap() {
		return stringToListsMap;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringToListsMap(Map.Entry<String, EList<Integer>> newStringToListsMap, NotificationChain msgs) {
		Map.Entry<String, EList<Integer>> oldStringToListsMap = stringToListsMap;
		stringToListsMap = newStringToListsMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP, oldStringToListsMap, newStringToListsMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringToListsMap(Map.Entry<String, EList<Integer>> newStringToListsMap) {
		if (newStringToListsMap != stringToListsMap) {
			NotificationChain msgs = null;
			if (stringToListsMap != null)
				msgs = ((InternalEObject)stringToListsMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP, null, msgs);
			if (newStringToListsMap != null)
				msgs = ((InternalEObject)newStringToListsMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP, null, msgs);
			msgs = basicSetStringToListsMap(newStringToListsMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP, newStringToListsMap, newStringToListsMap));
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetStringToListsMap(
			EMap<String, EList<Integer>> newStringToListsMap,
			NotificationChain msgs) {
		EMap<String, EList<Integer>> oldStringToListsMap = stringToListsMap;
		stringToListsMap = newStringToListsMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP,
					oldStringToListsMap, newStringToListsMap);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
	public void setStringToListsMap(
			EMap<String, EList<Integer>> newStringToListsMap) {
		if (newStringToListsMap != stringToListsMap) {
			NotificationChain msgs = null;
			if (stringToListsMap != null)
				msgs = ((InternalEObject) stringToListsMap)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP,
								null, msgs);
			if (newStringToListsMap != null)
				msgs = ((InternalEObject) newStringToListsMap)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP,
								null, msgs);
			msgs = basicSetStringToListsMap(newStringToListsMap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP,
					newStringToListsMap, newStringToListsMap));
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer getCap(int start, int end, String roomType) {
		if(start < 0 && end < start){
			return 0;
		}
		
		EList<Integer> capacities = this.getStringToListsMap().get(roomType);
		Integer cap = capacities.get(start);

		// Get the capacity of the day with the lowest capacity
		for (int day = start; day <= end; day++) {
			if (capacities.get(day) < cap) {
				cap = capacities.get(day);
			}
		}

		return cap;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int setCap(int start, int end, String roomType, int nrOfRooms) {
		// Check that the roomType is valid
		if (this.getStringToListsMap().containsKey(roomType)) {
			EList<Integer> capacities = this.getStringToListsMap().get(roomType);

			// Check that start & end are valid
			if (0 <= start && start < end && end < capacities.size()) {

				for (int day = start; day <= end; day++) {
					Integer newCapacity = capacities.get(day) + nrOfRooms;
					capacities.add(day, newCapacity);
				}
				return 0;
			}
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
	public int incCap(int start, int end, String roomType, int increment) {
		if (!this.stringToListsMap.containsKey(roomType)) {
			return 1;
		}

		if (start < 0) {
			return 2;
		}

		EList<Integer> table = this.stringToListsMap.get(roomType);

		if (table.size() < end) {
			return 3;
		}

		for (int i = start; i <= end; i++) {
			table.set(i, table.get(i) + increment);
		}

		return 0;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc} 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int decCap(int start, int end, String roomType, int decrement) {
		if (!this.stringToListsMap.containsKey(roomType)) {
			return 1;
		}

		if (this.getCap(start, end, roomType) - decrement < 0) {
			return 2;
		}

		if (start < 0) {
			return 3;
		}

		EList<Integer> table = this.stringToListsMap.get(roomType);

		if (table.size() < end) {
			return 4;
		}

		for (int i = start; i <= end; i++) {
			table.set(i, table.get(i) - decrement);
		}

		return 0;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * {@inheritDoc} 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int addEntry(String roomTypeID) {
		if(!this.stringToListsMap.containsKey(roomTypeID)){
			this.stringToListsMap.put(roomTypeID, new BasicEList<Integer>(365));
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
	public int getDaysBetween(String date1, String date2) {
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		try {
			year1 = getYear(date1);
			month1 = getMonth(date1);
			day1 = getDay(date1);

			year2 = getYear(date2);
			month2 = getMonth(date2);
			day2 = getDay(date2);

		} catch (NumberFormatException e) {
			return -1;
		}

		// Validate
		if (!isDateValid(year1, month1, day1)
				|| !isDateValid(year2, month2, day2)) {
			return -1;
		}
		
		int dayOfYear1 = this.getDayOfYear(year1, month1, day1);
		if(dayOfYear1 < 0){
			return -1;
		}
		
		int dayOfYear2 = this.getDayOfYear(year2, month2, day2);
		if(dayOfYear2 < 0 || dayOfYear2 < dayOfYear1){
			return -1;
		}
		
		// Compute span
		int dateSpan = dayOfYear2 - dayOfYear1;

		return dateSpan;
	}
	
	public int removeEntry(String roomTypeID) {
		if(this.stringToListsMap.containsKey(roomTypeID)){
			this.stringToListsMap.removeKey(roomTypeID);
			return 0;
		}
		return 1;
	}


	private int getYear(String date) throws NumberFormatException {
		return Integer.parseInt(date.substring(0, 2));
	}

	private int getMonth(String date) throws NumberFormatException {
		return Integer.parseInt(date.substring(2, 4));
	}

	private int getDay(String date) throws NumberFormatException {
		return Integer.parseInt(date.substring(4, 6));
	}

	private int getDayOfYear(int year, int month, int day) {
		if(year < 0 || month < 0 || day < 0){
			return -1;
		}
		
		int result = day;

		for (int j = 0; j < year; j++) {
			for (int i = 0; i < month; i++) {
				if (i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11) {
					// March, May, July, August, October, December
					result += 31;
				} else if (i == 3 || i == 5 || i == 8 || i == 10) {
					// April, June, September, November
					result += 30;
				} else if (i == 1) {
					// February
					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
						result += 29;
					} else {
						result += 28;
					}
				}
				// January not required
			}
		}

		return result;
	}

	private boolean isDateValid(int year, int month, int day) {
		return year > 0 && year < 100 && month > 0 && month < 13 && day > 0
				&& day < 32;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP:
				return basicSetStringToListsMap(null, msgs);
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
			case MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP:
				return getStringToListsMap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP:
			setStringToListsMap((EMap<String, EList<Integer>>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP:
			setStringToListsMap((EMap<String, EList<Integer>>) null);
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
			case MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP:
				return stringToListsMap != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case MaintenancemodelPackage.CALENDAR___GET_CAP__INT_INT_STRING:
				return getCap((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2));
			case MaintenancemodelPackage.CALENDAR___SET_CAP__INT_INT_STRING_INT:
				return setCap((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3));
			case MaintenancemodelPackage.CALENDAR___INC_CAP__INT_INT_STRING_INT:
				return incCap((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3));
			case MaintenancemodelPackage.CALENDAR___DEC_CAP__INT_INT_STRING_INT:
				return decCap((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3));
			case MaintenancemodelPackage.CALENDAR___ADD_ENTRY__STRING:
				return addEntry((String)arguments.get(0));
			case MaintenancemodelPackage.CALENDAR___REMOVE_ENTRY__STRING:
				return removeEntry((String)arguments.get(0));
			case MaintenancemodelPackage.CALENDAR___GET_DAYS_BETWEEN__STRING_STRING:
				return getDaysBetween((String)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} // CalendarImpl
