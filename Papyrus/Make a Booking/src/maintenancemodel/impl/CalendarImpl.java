/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;

import maintenancemodel.Calendar;
import maintenancemodel.MaintenancemodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the maintenancemodel object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.CalendarImpl#getStringToListsMap <em>String To Lists Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalendarImpl extends MinimalEObjectImpl.Container implements Calendar {
	/**
	 * The cached value of the '{@link #getStringToListsMap() <em>String To Lists Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringToListsMap()
	 * @generated NOT
	 * @ordered
	 */
	protected EMap<String, EList<Integer>> stringToListsMap;
	
	/**
	 * Max amount of Rooms that can be available a day.
	 * @generated NOT
	 */
	protected static final Integer MAX_CAPACITY = 725;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.CALENDAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String,EList<Integer>> getStringToListsMap() {
		return stringToListsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetStringToListsMap(EMap<String, EList<Integer>> newStringToListsMap, NotificationChain msgs) {
		EMap<String,EList<Integer>> oldStringToListsMap = stringToListsMap;
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
	 * @generated NOT
	 */
	public void setStringToListsMap(EMap<String, EList<Integer>> newValue) {
		if (newValue != stringToListsMap) {
			NotificationChain msgs = null;
			if (stringToListsMap != null)
				msgs = ((InternalEObject)stringToListsMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP, null, msgs);
			msgs = basicSetStringToListsMap(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Get the lowest capacity (free rooms) of the days in the interval.
	 * @param start
	 * 		amount of days from now that the interval starts.
	 * @param end
	 * 		amount of days from now that the interval ends.
	 * @param roomType
	 * 		the roomtypeID to get capacity for
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer getCap(int start, int end, String roomType) {
		
		Integer cap = this.MAX_CAPACITY;
		
		EList<Integer> capacities = this.getStringToListsMap().get(roomType);
		//Get the capacity of the day with the lowest capacity:
		for(int day=start; day<=end; day++){
			if(capacities.get(day) < cap){
				cap = capacities.get(day);
			}
		}
		
		return cap;
		// TODO: test
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int setCap(int start, int end, String roomType, int nrOfRooms) {
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
			case MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP:
				return basicSetStringToListsMap(null, msgs);
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
			case MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP:
				return getStringToListsMap();
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
			case MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP:
				setStringToListsMap((EMap<String, EList<Integer>>)newValue);
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
			case MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP:
				setStringToListsMap((EMap<String, EList<Integer>>)null);
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
			case MaintenancemodelPackage.CALENDAR__STRING_TO_LISTS_MAP:
				return stringToListsMap != null;
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
			case MaintenancemodelPackage.CALENDAR___GET_CAP__INT_INT_STRING:
				return getCap((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2));
			case MaintenancemodelPackage.CALENDAR___SET_CAP__INT_INT_STRING_INT:
				return setCap((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}


} //CalendarImpl
