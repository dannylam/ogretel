/**
 */
package maintenancemodel.util;

import java.util.Map;

import maintenancemodel.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the maintenancemodel's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the maintenancemodel,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see maintenancemodel.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached maintenancemodel package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the maintenancemodel until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.ROOM_TYPE: {
				RoomType roomType = (RoomType)theEObject;
				T result = caseRoomType(roomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXPERIENCE: {
				Experience experience = (Experience)theEObject;
				T result = caseExperience(experience);
				if (result == null) result = caseAbstractExtra(experience);
				if (result == null) result = caseExtra(experience);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABSTRACT_EXTRA: {
				AbstractExtra abstractExtra = (AbstractExtra)theEObject;
				T result = caseAbstractExtra(abstractExtra);
				if (result == null) result = caseExtra(abstractExtra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXTRA: {
				Extra extra = (Extra)theEObject;
				T result = caseExtra(extra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseAbstractExtra(product);
				if (result == null) result = caseExtra(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXTRA_HANDLER: {
				ExtraHandler extraHandler = (ExtraHandler)theEObject;
				T result = caseExtraHandler(extraHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTEGER_TO_EXTRA_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<Integer, Extra> integerToExtraMap = (Map.Entry<Integer, Extra>)theEObject;
				T result = caseIntegerToExtraMap(integerToExtraMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROOM_HANDLER: {
				RoomHandler roomHandler = (RoomHandler)theEObject;
				T result = caseRoomHandler(roomHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTEGER_TO_ROOM_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<Integer, Room> integerToRoomMap = (Map.Entry<Integer, Room>)theEObject;
				T result = caseIntegerToRoomMap(integerToRoomMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CALENDAR: {
				Calendar calendar = (Calendar)theEObject;
				T result = caseCalendar(calendar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROOM_TYPES_HANDLER: {
				RoomTypesHandler roomTypesHandler = (RoomTypesHandler)theEObject;
				T result = caseRoomTypesHandler(roomTypesHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STRING_TO_ROOM_TYPE: {
				@SuppressWarnings("unchecked") Map.Entry<String, RoomTypeEnum> stringToRoomType = (Map.Entry<String, RoomTypeEnum>)theEObject;
				T result = caseStringToRoomType(stringToRoomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STRING_TO_LISTS_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, EList<Integer>> stringToListsMap = (Map.Entry<String, EList<Integer>>)theEObject;
				T result = caseStringToListsMap(stringToListsMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMAINTENANCE_PROVIDES_FOR_BOOKING: {
				IMaintenanceProvidesForBooking iMaintenanceProvidesForBooking = (IMaintenanceProvidesForBooking)theEObject;
				T result = caseIMaintenanceProvidesForBooking(iMaintenanceProvidesForBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IROOM_MAINTENANCE: {
				IRoomMaintenance iRoomMaintenance = (IRoomMaintenance)theEObject;
				T result = caseIRoomMaintenance(iRoomMaintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IEXTRAS_MAINTENANCE: {
				IExtrasMaintenance iExtrasMaintenance = (IExtrasMaintenance)theEObject;
				T result = caseIExtrasMaintenance(iExtrasMaintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXTRAS_MAINTENANCE: {
				ExtrasMaintenance extrasMaintenance = (ExtrasMaintenance)theEObject;
				T result = caseExtrasMaintenance(extrasMaintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROOM_MAINTENANCE: {
				RoomMaintenance roomMaintenance = (RoomMaintenance)theEObject;
				T result = caseRoomMaintenance(roomMaintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING: {
				MaintenanceProvidesForBooking maintenanceProvidesForBooking = (MaintenanceProvidesForBooking)theEObject;
				T result = caseMaintenanceProvidesForBooking(maintenanceProvidesForBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomType(RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experience</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experience</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperience(Experience object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractExtra(AbstractExtra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtra(Extra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extra Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extra Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtraHandler(ExtraHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer To Extra Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer To Extra Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerToExtraMap(Map.Entry<Integer, Extra> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomHandler(RoomHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer To Room Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer To Room Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerToRoomMap(Map.Entry<Integer, Room> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendar(Calendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Types Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Types Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomTypesHandler(RoomTypesHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToRoomType(Map.Entry<String, RoomTypeEnum> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Lists Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Lists Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToListsMap(Map.Entry<String, EList<Integer>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMaintenance Provides For Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMaintenance Provides For Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMaintenanceProvidesForBooking(IMaintenanceProvidesForBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRoom Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRoom Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRoomMaintenance(IRoomMaintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IExtras Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IExtras Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIExtrasMaintenance(IExtrasMaintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extras Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extras Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtrasMaintenance(ExtrasMaintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomMaintenance(RoomMaintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintenance Provides For Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintenance Provides For Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintenanceProvidesForBooking(MaintenanceProvidesForBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
