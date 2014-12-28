/**
 */
package maintenancemodel.impl;

import java.util.Map;

import maintenancemodel.AbstractExtra;
import maintenancemodel.Calendar;
import maintenancemodel.Experience;
import maintenancemodel.ExperienceStatusEnum;
import maintenancemodel.Extra;
import maintenancemodel.ExtraHandler;
import maintenancemodel.ExtrasMaintenance;
import maintenancemodel.IExtrasMaintenance;
import maintenancemodel.IMaintenanceProvidesForBooking;
import maintenancemodel.IRoomMaintenance;
import maintenancemodel.MaintenanceProvidesForBooking;
import maintenancemodel.MaintenancemodelFactory;
import maintenancemodel.MaintenancemodelPackage;
import maintenancemodel.Product;
import maintenancemodel.ProductStatusEnum;
import maintenancemodel.Room;
import maintenancemodel.RoomHandler;
import maintenancemodel.RoomMaintenance;
import maintenancemodel.RoomStatusEnum;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypeEnum;
import maintenancemodel.RoomTypesHandler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaintenancemodelPackageImpl extends EPackageImpl implements MaintenancemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experienceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerToExtraMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerToRoomMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypesHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToRoomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToListsMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iMaintenanceProvidesForBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRoomMaintenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iExtrasMaintenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extrasMaintenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomMaintenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintenanceProvidesForBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roomTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum experienceStatusEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productStatusEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roomStatusEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see maintenancemodel.MaintenancemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MaintenancemodelPackageImpl() {
		super(eNS_URI, MaintenancemodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MaintenancemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MaintenancemodelPackage init() {
		if (isInited) return (MaintenancemodelPackage)EPackage.Registry.INSTANCE.getEPackage(MaintenancemodelPackage.eNS_URI);

		// Obtain or create and register package
		MaintenancemodelPackageImpl theMaintenancemodelPackage = (MaintenancemodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MaintenancemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MaintenancemodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMaintenancemodelPackage.createPackageContents();

		// Initialize created meta-data
		theMaintenancemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMaintenancemodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MaintenancemodelPackage.eNS_URI, theMaintenancemodelPackage);
		return theMaintenancemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomType() {
		return roomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Price() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_MaxNrOfGuests() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Description() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_RoomTypeEnum() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_RoomTypeID() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperience() {
		return experienceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperience_NrOfSpots() {
		return (EAttribute)experienceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperience_ExperienceStatusEnum() {
		return (EAttribute)experienceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperience_NrOfSpotsFree() {
		return (EAttribute)experienceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractExtra() {
		return abstractExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractExtra_ID() {
		return (EAttribute)abstractExtraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractExtra_Price() {
		return (EAttribute)abstractExtraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractExtra_Name() {
		return (EAttribute)abstractExtraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractExtra_Description() {
		return (EAttribute)abstractExtraEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtra() {
		return extraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtra__IsAvailable() {
		return extraEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Stock() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_ProductStatusEnum() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_NumberID() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomStatusEnum() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_RoomType() {
		return (EReference)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtraHandler() {
		return extraHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtraHandler_IntToExtraMap() {
		return (EReference)extraHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtraHandler__Exists__int() {
		return extraHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtraHandler__AddExtra__int_String_String_String_boolean() {
		return extraHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtraHandler__RemoveExtra__int() {
		return extraHandlerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtraHandler__GetExtra__int() {
		return extraHandlerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtraHandler__GetPrice__int() {
		return extraHandlerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerToExtraMap() {
		return integerToExtraMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerToExtraMap_Key() {
		return (EAttribute)integerToExtraMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerToExtraMap_Value() {
		return (EReference)integerToExtraMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomHandler() {
		return roomHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomHandler_IntegerToRoomMap() {
		return (EReference)roomHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandler__Exists__int() {
		return roomHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandler__AddRoom__int_String() {
		return roomHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandler__RemoveRoom__Room() {
		return roomHandlerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandler__GetRoom__int() {
		return roomHandlerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerToRoomMap() {
		return integerToRoomMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerToRoomMap_Key() {
		return (EAttribute)integerToRoomMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerToRoomMap_Value() {
		return (EReference)integerToRoomMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendar() {
		return calendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalendar_RoomTypeCapTable() {
		return (EReference)calendarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalendar_StringToListsMap() {
		return (EReference)calendarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCalendar__GetCap__int_int_String() {
		return calendarEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCalendar__SetCap__int_int_String_int() {
		return calendarEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomTypesHandler() {
		return roomTypesHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomTypesHandler_StringToRoomType() {
		return (EReference)roomTypesHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypesHandler__Exists__String() {
		return roomTypesHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypesHandler__AddRoomType__String_String_int_int_String() {
		return roomTypesHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypesHandler__RemoveRoomType__String() {
		return roomTypesHandlerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypesHandler__GetPrice__String() {
		return roomTypesHandlerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToRoomType() {
		return stringToRoomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToRoomType_Key() {
		return (EAttribute)stringToRoomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToRoomType_Value() {
		return (EReference)stringToRoomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToListsMap() {
		return stringToListsMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToListsMap_Key() {
		return (EAttribute)stringToListsMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToListsMap_Value() {
		return (EAttribute)stringToListsMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIMaintenanceProvidesForBooking() {
		return iMaintenanceProvidesForBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMaintenanceProvidesForBooking__CanBook__String_String_String() {
		return iMaintenanceProvidesForBookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMaintenanceProvidesForBooking__MakeBooking__String_String_String() {
		return iMaintenanceProvidesForBookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMaintenanceProvidesForBooking__RemoveBooking__String_int_String_String() {
		return iMaintenanceProvidesForBookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMaintenanceProvidesForBooking__SetBookingAsActive__String() {
		return iMaintenanceProvidesForBookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMaintenanceProvidesForBooking__GetPriceRoom__String() {
		return iMaintenanceProvidesForBookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMaintenanceProvidesForBooking__GetPriceExtra__int() {
		return iMaintenanceProvidesForBookingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoomMaintenance() {
		return iRoomMaintenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__AddRoom__int_String() {
		return iRoomMaintenanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__RemoveRoom__int() {
		return iRoomMaintenanceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__AddRoomType__String_String_int_int_String() {
		return iRoomMaintenanceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__RemoveRoomType__String() {
		return iRoomMaintenanceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__GetRoomHandler() {
		return iRoomMaintenanceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__GetRoomTypeHandler() {
		return iRoomMaintenanceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__GetRoom__int() {
		return iRoomMaintenanceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__GetRoomType__String() {
		return iRoomMaintenanceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__EditRoomStatus__int_String() {
		return iRoomMaintenanceEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__GetRoomStatus__int() {
		return iRoomMaintenanceEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__EditRoomType__String_String_int_int_String() {
		return iRoomMaintenanceEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__EditRoom__int_String() {
		return iRoomMaintenanceEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIExtrasMaintenance() {
		return iExtrasMaintenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIExtrasMaintenance__AddExtra__int_String_String_String_boolean() {
		return iExtrasMaintenanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIExtrasMaintenance__RemoveExtra__int() {
		return iExtrasMaintenanceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIExtrasMaintenance__GetExtras() {
		return iExtrasMaintenanceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIExtrasMaintenance__GetExtra__int() {
		return iExtrasMaintenanceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIExtrasMaintenance__EditExtra__int_String_String_int() {
		return iExtrasMaintenanceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtrasMaintenance() {
		return extrasMaintenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtrasMaintenance_Extras() {
		return (EReference)extrasMaintenanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomMaintenance() {
		return roomMaintenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomMaintenance_RoomTypes() {
		return (EReference)roomMaintenanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomMaintenance_Rooms() {
		return (EReference)roomMaintenanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintenanceProvidesForBooking() {
		return maintenanceProvidesForBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaintenanceProvidesForBooking_Calendar() {
		return (EReference)maintenanceProvidesForBookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaintenanceProvidesForBooking_RoomTypes() {
		return (EReference)maintenanceProvidesForBookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaintenanceProvidesForBooking_Rooms() {
		return (EReference)maintenanceProvidesForBookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaintenanceProvidesForBooking_ExtraHandler() {
		return (EReference)maintenanceProvidesForBookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoomTypeEnum() {
		return roomTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExperienceStatusEnum() {
		return experienceStatusEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductStatusEnum() {
		return productStatusEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoomStatusEnum() {
		return roomStatusEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenancemodelFactory getMaintenancemodelFactory() {
		return (MaintenancemodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__PRICE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__MAX_NR_OF_GUESTS);
		createEAttribute(roomTypeEClass, ROOM_TYPE__DESCRIPTION);
		createEAttribute(roomTypeEClass, ROOM_TYPE__ROOM_TYPE_ENUM);
		createEAttribute(roomTypeEClass, ROOM_TYPE__ROOM_TYPE_ID);

		experienceEClass = createEClass(EXPERIENCE);
		createEAttribute(experienceEClass, EXPERIENCE__NR_OF_SPOTS);
		createEAttribute(experienceEClass, EXPERIENCE__EXPERIENCE_STATUS_ENUM);
		createEAttribute(experienceEClass, EXPERIENCE__NR_OF_SPOTS_FREE);

		abstractExtraEClass = createEClass(ABSTRACT_EXTRA);
		createEAttribute(abstractExtraEClass, ABSTRACT_EXTRA__ID);
		createEAttribute(abstractExtraEClass, ABSTRACT_EXTRA__PRICE);
		createEAttribute(abstractExtraEClass, ABSTRACT_EXTRA__NAME);
		createEAttribute(abstractExtraEClass, ABSTRACT_EXTRA__DESCRIPTION);

		extraEClass = createEClass(EXTRA);
		createEOperation(extraEClass, EXTRA___IS_AVAILABLE);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__STOCK);
		createEAttribute(productEClass, PRODUCT__PRODUCT_STATUS_ENUM);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__NUMBER_ID);
		createEAttribute(roomEClass, ROOM__ROOM_STATUS_ENUM);
		createEReference(roomEClass, ROOM__ROOM_TYPE);

		extraHandlerEClass = createEClass(EXTRA_HANDLER);
		createEReference(extraHandlerEClass, EXTRA_HANDLER__INT_TO_EXTRA_MAP);
		createEOperation(extraHandlerEClass, EXTRA_HANDLER___EXISTS__INT);
		createEOperation(extraHandlerEClass, EXTRA_HANDLER___ADD_EXTRA__INT_STRING_STRING_STRING_BOOLEAN);
		createEOperation(extraHandlerEClass, EXTRA_HANDLER___REMOVE_EXTRA__INT);
		createEOperation(extraHandlerEClass, EXTRA_HANDLER___GET_EXTRA__INT);
		createEOperation(extraHandlerEClass, EXTRA_HANDLER___GET_PRICE__INT);

		integerToExtraMapEClass = createEClass(INTEGER_TO_EXTRA_MAP);
		createEAttribute(integerToExtraMapEClass, INTEGER_TO_EXTRA_MAP__KEY);
		createEReference(integerToExtraMapEClass, INTEGER_TO_EXTRA_MAP__VALUE);

		roomHandlerEClass = createEClass(ROOM_HANDLER);
		createEReference(roomHandlerEClass, ROOM_HANDLER__INTEGER_TO_ROOM_MAP);
		createEOperation(roomHandlerEClass, ROOM_HANDLER___EXISTS__INT);
		createEOperation(roomHandlerEClass, ROOM_HANDLER___ADD_ROOM__INT_STRING);
		createEOperation(roomHandlerEClass, ROOM_HANDLER___REMOVE_ROOM__ROOM);
		createEOperation(roomHandlerEClass, ROOM_HANDLER___GET_ROOM__INT);

		integerToRoomMapEClass = createEClass(INTEGER_TO_ROOM_MAP);
		createEAttribute(integerToRoomMapEClass, INTEGER_TO_ROOM_MAP__KEY);
		createEReference(integerToRoomMapEClass, INTEGER_TO_ROOM_MAP__VALUE);

		calendarEClass = createEClass(CALENDAR);
		createEReference(calendarEClass, CALENDAR__ROOM_TYPE_CAP_TABLE);
		createEReference(calendarEClass, CALENDAR__STRING_TO_LISTS_MAP);
		createEOperation(calendarEClass, CALENDAR___GET_CAP__INT_INT_STRING);
		createEOperation(calendarEClass, CALENDAR___SET_CAP__INT_INT_STRING_INT);

		roomTypesHandlerEClass = createEClass(ROOM_TYPES_HANDLER);
		createEReference(roomTypesHandlerEClass, ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE);
		createEOperation(roomTypesHandlerEClass, ROOM_TYPES_HANDLER___EXISTS__STRING);
		createEOperation(roomTypesHandlerEClass, ROOM_TYPES_HANDLER___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING);
		createEOperation(roomTypesHandlerEClass, ROOM_TYPES_HANDLER___REMOVE_ROOM_TYPE__STRING);
		createEOperation(roomTypesHandlerEClass, ROOM_TYPES_HANDLER___GET_PRICE__STRING);

		stringToRoomTypeEClass = createEClass(STRING_TO_ROOM_TYPE);
		createEAttribute(stringToRoomTypeEClass, STRING_TO_ROOM_TYPE__KEY);
		createEReference(stringToRoomTypeEClass, STRING_TO_ROOM_TYPE__VALUE);

		stringToListsMapEClass = createEClass(STRING_TO_LISTS_MAP);
		createEAttribute(stringToListsMapEClass, STRING_TO_LISTS_MAP__KEY);
		createEAttribute(stringToListsMapEClass, STRING_TO_LISTS_MAP__VALUE);

		iMaintenanceProvidesForBookingEClass = createEClass(IMAINTENANCE_PROVIDES_FOR_BOOKING);
		createEOperation(iMaintenanceProvidesForBookingEClass, IMAINTENANCE_PROVIDES_FOR_BOOKING___CAN_BOOK__STRING_STRING_STRING);
		createEOperation(iMaintenanceProvidesForBookingEClass, IMAINTENANCE_PROVIDES_FOR_BOOKING___MAKE_BOOKING__STRING_STRING_STRING);
		createEOperation(iMaintenanceProvidesForBookingEClass, IMAINTENANCE_PROVIDES_FOR_BOOKING___REMOVE_BOOKING__STRING_INT_STRING_STRING);
		createEOperation(iMaintenanceProvidesForBookingEClass, IMAINTENANCE_PROVIDES_FOR_BOOKING___SET_BOOKING_AS_ACTIVE__STRING);
		createEOperation(iMaintenanceProvidesForBookingEClass, IMAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_ROOM__STRING);
		createEOperation(iMaintenanceProvidesForBookingEClass, IMAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_EXTRA__INT);

		iRoomMaintenanceEClass = createEClass(IROOM_MAINTENANCE);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___ADD_ROOM__INT_STRING);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___REMOVE_ROOM__INT);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___REMOVE_ROOM_TYPE__STRING);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___GET_ROOM_HANDLER);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___GET_ROOM_TYPE_HANDLER);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___GET_ROOM__INT);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___GET_ROOM_TYPE__STRING);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___EDIT_ROOM_STATUS__INT_STRING);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___GET_ROOM_STATUS__INT);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___EDIT_ROOM_TYPE__STRING_STRING_INT_INT_STRING);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___EDIT_ROOM__INT_STRING);

		iExtrasMaintenanceEClass = createEClass(IEXTRAS_MAINTENANCE);
		createEOperation(iExtrasMaintenanceEClass, IEXTRAS_MAINTENANCE___ADD_EXTRA__INT_STRING_STRING_STRING_BOOLEAN);
		createEOperation(iExtrasMaintenanceEClass, IEXTRAS_MAINTENANCE___REMOVE_EXTRA__INT);
		createEOperation(iExtrasMaintenanceEClass, IEXTRAS_MAINTENANCE___GET_EXTRAS);
		createEOperation(iExtrasMaintenanceEClass, IEXTRAS_MAINTENANCE___GET_EXTRA__INT);
		createEOperation(iExtrasMaintenanceEClass, IEXTRAS_MAINTENANCE___EDIT_EXTRA__INT_STRING_STRING_INT);

		extrasMaintenanceEClass = createEClass(EXTRAS_MAINTENANCE);
		createEReference(extrasMaintenanceEClass, EXTRAS_MAINTENANCE__EXTRAS);

		roomMaintenanceEClass = createEClass(ROOM_MAINTENANCE);
		createEReference(roomMaintenanceEClass, ROOM_MAINTENANCE__ROOM_TYPES);
		createEReference(roomMaintenanceEClass, ROOM_MAINTENANCE__ROOMS);

		maintenanceProvidesForBookingEClass = createEClass(MAINTENANCE_PROVIDES_FOR_BOOKING);
		createEReference(maintenanceProvidesForBookingEClass, MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR);
		createEReference(maintenanceProvidesForBookingEClass, MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES);
		createEReference(maintenanceProvidesForBookingEClass, MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS);
		createEReference(maintenanceProvidesForBookingEClass, MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER);

		// Create enums
		roomTypeEnumEEnum = createEEnum(ROOM_TYPE_ENUM);
		experienceStatusEnumEEnum = createEEnum(EXPERIENCE_STATUS_ENUM);
		productStatusEnumEEnum = createEEnum(PRODUCT_STATUS_ENUM);
		roomStatusEnumEEnum = createEEnum(ROOM_STATUS_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		experienceEClass.getESuperTypes().add(this.getAbstractExtra());
		abstractExtraEClass.getESuperTypes().add(this.getExtra());
		productEClass.getESuperTypes().add(this.getAbstractExtra());
		extrasMaintenanceEClass.getESuperTypes().add(this.getIExtrasMaintenance());
		roomMaintenanceEClass.getESuperTypes().add(this.getIRoomMaintenance());
		maintenanceProvidesForBookingEClass.getESuperTypes().add(this.getIMaintenanceProvidesForBooking());

		// Initialize classes, features, and operations; add parameters
		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_MaxNrOfGuests(), theTypesPackage.getInteger(), "maxNrOfGuests", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Description(), theTypesPackage.getString(), "description", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_RoomTypeEnum(), this.getRoomTypeEnum(), "roomTypeEnum", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_RoomTypeID(), theTypesPackage.getString(), "roomTypeID", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(experienceEClass, Experience.class, "Experience", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperience_NrOfSpots(), theTypesPackage.getInteger(), "nrOfSpots", null, 1, 1, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExperience_ExperienceStatusEnum(), this.getExperienceStatusEnum(), "experienceStatusEnum", null, 1, 1, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExperience_NrOfSpotsFree(), theTypesPackage.getInteger(), "nrOfSpotsFree", null, 1, 1, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractExtraEClass, AbstractExtra.class, "AbstractExtra", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractExtra_ID(), theTypesPackage.getInteger(), "ID", null, 1, 1, AbstractExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractExtra_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, AbstractExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractExtra_Name(), theTypesPackage.getString(), "name", null, 1, 1, AbstractExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractExtra_Description(), theTypesPackage.getString(), "description", null, 1, 1, AbstractExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(extraEClass, Extra.class, "Extra", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getExtra__IsAvailable(), theTypesPackage.getBoolean(), "isAvailable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_Stock(), theTypesPackage.getInteger(), "stock", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProduct_ProductStatusEnum(), this.getProductStatusEnum(), "productStatusEnum", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_NumberID(), theTypesPackage.getInteger(), "numberID", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomStatusEnum(), this.getRoomStatusEnum(), "roomStatusEnum", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomType(), this.getRoomType(), null, "roomType", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(extraHandlerEClass, ExtraHandler.class, "ExtraHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtraHandler_IntToExtraMap(), this.getIntegerToExtraMap(), null, "intToExtraMap", null, 0, -1, ExtraHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getExtraHandler__Exists__int(), theTypesPackage.getBoolean(), "exists", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtraHandler__AddExtra__int_String_String_String_boolean(), theTypesPackage.getInteger(), "addExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "isProduct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtraHandler__RemoveExtra__int(), theTypesPackage.getInteger(), "removeExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "extra", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtraHandler__GetExtra__int(), this.getExtra(), "getExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtraHandler__GetPrice__int(), theTypesPackage.getInteger(), "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "extraID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(integerToExtraMapEClass, Map.Entry.class, "IntegerToExtraMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerToExtraMap_Key(), ecorePackage.getEIntegerObject(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIntegerToExtraMap_Value(), this.getExtra(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomHandlerEClass, RoomHandler.class, "RoomHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomHandler_IntegerToRoomMap(), this.getIntegerToRoomMap(), null, "integerToRoomMap", null, 0, -1, RoomHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomHandler__Exists__int(), theTypesPackage.getBoolean(), "exists", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandler__AddRoom__int_String(), theTypesPackage.getInteger(), "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "numberID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandler__RemoveRoom__Room(), theTypesPackage.getInteger(), "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandler__GetRoom__int(), this.getRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(integerToRoomMapEClass, Map.Entry.class, "IntegerToRoomMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerToRoomMap_Key(), ecorePackage.getEIntegerObject(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIntegerToRoomMap_Value(), this.getRoom(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(calendarEClass, Calendar.class, "Calendar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalendar_RoomTypeCapTable(), this.getRoomTypesHandler(), null, "roomTypeCapTable", null, 0, -1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCalendar_StringToListsMap(), this.getStringToListsMap(), null, "stringToListsMap", null, 1, 1, Calendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCalendar__GetCap__int_int_String(), theTypesPackage.getInteger(), "getCap", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCalendar__SetCap__int_int_String_int(), null, "setCap", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nrOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomTypesHandlerEClass, RoomTypesHandler.class, "RoomTypesHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomTypesHandler_StringToRoomType(), this.getStringToRoomType(), null, "stringToRoomType", null, 0, -1, RoomTypesHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomTypesHandler__Exists__String(), theTypesPackage.getBoolean(), "exists", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomTypesHandler__AddRoomType__String_String_int_int_String(), theTypesPackage.getInteger(), "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomTypeEnum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "maxNrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomTypesHandler__RemoveRoomType__String(), theTypesPackage.getInteger(), "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomTypesHandler__GetPrice__String(), theTypesPackage.getInteger(), "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(stringToRoomTypeEClass, Map.Entry.class, "StringToRoomType", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToRoomType_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStringToRoomType_Value(), this.getRoomType(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringToListsMapEClass, Map.Entry.class, "StringToListsMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToListsMap_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStringToListsMap_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iMaintenanceProvidesForBookingEClass, IMaintenanceProvidesForBooking.class, "IMaintenanceProvidesForBooking", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIMaintenanceProvidesForBooking__CanBook__String_String_String(), theTypesPackage.getBoolean(), "canBook", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIMaintenanceProvidesForBooking__MakeBooking__String_String_String(), theTypesPackage.getInteger(), "makeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIMaintenanceProvidesForBooking__RemoveBooking__String_int_String_String(), theTypesPackage.getInteger(), "removeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nrOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIMaintenanceProvidesForBooking__SetBookingAsActive__String(), theTypesPackage.getInteger(), "setBookingAsActive", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIMaintenanceProvidesForBooking__GetPriceRoom__String(), theTypesPackage.getInteger(), "getPriceRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIMaintenanceProvidesForBooking__GetPriceExtra__int(), theTypesPackage.getInteger(), "getPriceExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "extraID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iRoomMaintenanceEClass, IRoomMaintenance.class, "IRoomMaintenance", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIRoomMaintenance__AddRoom__int_String(), theTypesPackage.getInteger(), "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__RemoveRoom__int(), theTypesPackage.getInteger(), "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__AddRoomType__String_String_int_int_String(), theTypesPackage.getInteger(), "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeEnum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "maxNrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__RemoveRoomType__String(), theTypesPackage.getInteger(), "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoomMaintenance__GetRoomHandler(), this.getRoomHandler(), "getRoomHandler", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoomMaintenance__GetRoomTypeHandler(), this.getRoomTypesHandler(), "getRoomTypeHandler", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__GetRoom__int(), this.getRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__GetRoomType__String(), this.getRoomType(), "getRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__EditRoomStatus__int_String(), theTypesPackage.getInteger(), "editRoomStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "status", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__GetRoomStatus__int(), theTypesPackage.getString(), "getRoomStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__EditRoomType__String_String_int_int_String(), theTypesPackage.getInteger(), "editRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeEnum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "maxNrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__EditRoom__int_String(), theTypesPackage.getInteger(), "editRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iExtrasMaintenanceEClass, IExtrasMaintenance.class, "IExtrasMaintenance", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIExtrasMaintenance__AddExtra__int_String_String_String_boolean(), theTypesPackage.getInteger(), "addExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "isProduct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIExtrasMaintenance__RemoveExtra__int(), theTypesPackage.getInteger(), "removeExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "extra", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIExtrasMaintenance__GetExtras(), this.getExtraHandler(), "getExtras", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIExtrasMaintenance__GetExtra__int(), this.getExtra(), "getExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIExtrasMaintenance__EditExtra__int_String_String_int(), theTypesPackage.getInteger(), "editExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(extrasMaintenanceEClass, ExtrasMaintenance.class, "ExtrasMaintenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtrasMaintenance_Extras(), this.getExtraHandler(), null, "extras", null, 1, 1, ExtrasMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomMaintenanceEClass, RoomMaintenance.class, "RoomMaintenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomMaintenance_RoomTypes(), this.getRoomTypesHandler(), null, "roomTypes", null, 1, 1, RoomMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomMaintenance_Rooms(), this.getRoomHandler(), null, "rooms", null, 1, 1, RoomMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(maintenanceProvidesForBookingEClass, MaintenanceProvidesForBooking.class, "MaintenanceProvidesForBooking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaintenanceProvidesForBooking_Calendar(), this.getCalendar(), null, "calendar", null, 1, 1, MaintenanceProvidesForBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMaintenanceProvidesForBooking_RoomTypes(), this.getRoomTypesHandler(), null, "roomTypes", null, 1, 1, MaintenanceProvidesForBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMaintenanceProvidesForBooking_Rooms(), this.getRoomHandler(), null, "rooms", null, 1, 1, MaintenanceProvidesForBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMaintenanceProvidesForBooking_ExtraHandler(), this.getExtraHandler(), null, "extraHandler", null, 1, 1, MaintenanceProvidesForBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(roomTypeEnumEEnum, RoomTypeEnum.class, "RoomTypeEnum");
		addEEnumLiteral(roomTypeEnumEEnum, RoomTypeEnum.SINGLEBED);
		addEEnumLiteral(roomTypeEnumEEnum, RoomTypeEnum.DOUBLEBED);
		addEEnumLiteral(roomTypeEnumEEnum, RoomTypeEnum.LUXURYSUITE);

		initEEnum(experienceStatusEnumEEnum, ExperienceStatusEnum.class, "ExperienceStatusEnum");
		addEEnumLiteral(experienceStatusEnumEEnum, ExperienceStatusEnum.READY);
		addEEnumLiteral(experienceStatusEnumEEnum, ExperienceStatusEnum.MAINTENANCE);

		initEEnum(productStatusEnumEEnum, ProductStatusEnum.class, "ProductStatusEnum");
		addEEnumLiteral(productStatusEnumEEnum, ProductStatusEnum.IN_STOCK);
		addEEnumLiteral(productStatusEnumEEnum, ProductStatusEnum.OUT_OF_STOCK);
		addEEnumLiteral(productStatusEnumEEnum, ProductStatusEnum.RESTOCKING);

		initEEnum(roomStatusEnumEEnum, RoomStatusEnum.class, "RoomStatusEnum");
		addEEnumLiteral(roomStatusEnumEEnum, RoomStatusEnum.VACANT);
		addEEnumLiteral(roomStatusEnumEEnum, RoomStatusEnum.BUSY);
		addEEnumLiteral(roomStatusEnumEEnum, RoomStatusEnum.MAINTENANCE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (roomTypeEnumEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "originalName", "Luxury suite"
		   });
	}

} //MaintenancemodelPackageImpl
