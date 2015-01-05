/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;

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
	public int removeEntry(String roomTypeID) {
		if(this.stringToListsMap.containsKey(roomTypeID)){
			this.stringToListsMap.removeKey(roomTypeID);
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
		}
		return super.eInvoke(operationID, arguments);
	}

} // CalendarImpl
