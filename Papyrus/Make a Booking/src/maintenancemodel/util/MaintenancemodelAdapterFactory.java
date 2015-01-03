/**
 */
package maintenancemodel.util;

import java.util.Map;

import maintenancemodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see maintenancemodel.MaintenancemodelPackage
 * @generated
 */
public class MaintenancemodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MaintenancemodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenancemodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MaintenancemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintenancemodelSwitch<Adapter> modelSwitch =
		new MaintenancemodelSwitch<Adapter>() {
			@Override
			public Adapter caseRoomType(RoomType object) {
				return createRoomTypeAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseExperience(Experience object) {
				return createExperienceAdapter();
			}
			@Override
			public Adapter caseAbstractExtra(AbstractExtra object) {
				return createAbstractExtraAdapter();
			}
			@Override
			public Adapter caseExtra(Extra object) {
				return createExtraAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseExtraHandler(ExtraHandler object) {
				return createExtraHandlerAdapter();
			}
			@Override
			public Adapter caseIntegerToExtraMap(Map.Entry<String, Extra> object) {
				return createIntegerToExtraMapAdapter();
			}
			@Override
			public Adapter caseRoomHandler(RoomHandler object) {
				return createRoomHandlerAdapter();
			}
			@Override
			public Adapter caseIntegerToRoomMap(Map.Entry<Integer, Room> object) {
				return createIntegerToRoomMapAdapter();
			}
			@Override
			public Adapter caseCalendar(Calendar object) {
				return createCalendarAdapter();
			}
			@Override
			public Adapter caseStringToListsMap(Map.Entry<String, EList<Integer>> object) {
				return createStringToListsMapAdapter();
			}
			@Override
			public Adapter caseIMaintenanceProvidesForBooking(IMaintenanceProvidesForBooking object) {
				return createIMaintenanceProvidesForBookingAdapter();
			}
			@Override
			public Adapter caseIRoomMaintenance(IRoomMaintenance object) {
				return createIRoomMaintenanceAdapter();
			}
			@Override
			public Adapter caseIExtrasMaintenance(IExtrasMaintenance object) {
				return createIExtrasMaintenanceAdapter();
			}
			@Override
			public Adapter caseExtrasMaintenance(ExtrasMaintenance object) {
				return createExtrasMaintenanceAdapter();
			}
			@Override
			public Adapter caseRoomMaintenance(RoomMaintenance object) {
				return createRoomMaintenanceAdapter();
			}
			@Override
			public Adapter caseRoomTypesHandler(RoomTypesHandler object) {
				return createRoomTypesHandlerAdapter();
			}
			@Override
			public Adapter caseStringToRoomTypeMap(Map.Entry<String, RoomType> object) {
				return createStringToRoomTypeMapAdapter();
			}
			@Override
			public Adapter caseMaintenanceProvidesForBooking(MaintenanceProvidesForBooking object) {
				return createMaintenanceProvidesForBookingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.RoomType
	 * @generated
	 */
	public Adapter createRoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.Experience <em>Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.Experience
	 * @generated
	 */
	public Adapter createExperienceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.AbstractExtra <em>Abstract Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.AbstractExtra
	 * @generated
	 */
	public Adapter createAbstractExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.Extra <em>Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.Extra
	 * @generated
	 */
	public Adapter createExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.ExtraHandler <em>Extra Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.ExtraHandler
	 * @generated
	 */
	public Adapter createExtraHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Integer To Extra Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createIntegerToExtraMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.RoomHandler <em>Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.RoomHandler
	 * @generated
	 */
	public Adapter createRoomHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Integer To Room Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createIntegerToRoomMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.Calendar
	 * @generated
	 */
	public Adapter createCalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.RoomTypesHandler <em>Room Types Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.RoomTypesHandler
	 * @generated
	 */
	public Adapter createRoomTypesHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Room Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToRoomTypeMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Lists Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToListsMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.IMaintenanceProvidesForBooking <em>IMaintenance Provides For Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.IMaintenanceProvidesForBooking
	 * @generated
	 */
	public Adapter createIMaintenanceProvidesForBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.IRoomMaintenance <em>IRoom Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.IRoomMaintenance
	 * @generated
	 */
	public Adapter createIRoomMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.IExtrasMaintenance <em>IExtras Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.IExtrasMaintenance
	 * @generated
	 */
	public Adapter createIExtrasMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.ExtrasMaintenance <em>Extras Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.ExtrasMaintenance
	 * @generated
	 */
	public Adapter createExtrasMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.RoomMaintenance <em>Room Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.RoomMaintenance
	 * @generated
	 */
	public Adapter createRoomMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenancemodel.MaintenanceProvidesForBooking <em>Maintenance Provides For Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenancemodel.MaintenanceProvidesForBooking
	 * @generated
	 */
	public Adapter createMaintenanceProvidesForBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MaintenancemodelAdapterFactory
