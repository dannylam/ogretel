/**
 */
package maintenancemodel.impl;

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
import maintenancemodel.IntegerToExtraMap;
import maintenancemodel.IntegerToRoomMap;
import maintenancemodel.MaintenanceProvidesForBooking;
import maintenancemodel.ModelFactory;
import maintenancemodel.ModelPackage;
import maintenancemodel.Product;
import maintenancemodel.ProductStatusEnum;
import maintenancemodel.Room;
import maintenancemodel.RoomHandler;
import maintenancemodel.RoomMaintenance;
import maintenancemodel.RoomStatusEnum;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypeEnum;
import maintenancemodel.RoomTypes;
import maintenancemodel.StringToListsMap;
import maintenancemodel.StringToRoomType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
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
	private EClass roomTypesEClass = null;

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
	private EClass maintenanceProvidesForBookingEClass = null;

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
	 * @see maintenancemodel.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
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
	public EAttribute getRoomType_Desciption() {
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
	public EOperation getExtra__GetPrice() {
		return extraEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtra__GetID() {
		return extraEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtra__GetName() {
		return extraEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtra__GetDescription() {
		return extraEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtra__IsAvailable() {
		return extraEClass.getEOperations().get(4);
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
	public EReference getExtraHandler_Extra() {
		return (EReference)extraHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtraHandler_ExtraTable() {
		return (EReference)extraHandlerEClass.getEStructuralFeatures().get(1);
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
	public EOperation getExtraHandler__AddExtra__int_String_String_String() {
		return extraHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtraHandler__RemoveExtra__Extra() {
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
	public EReference getRoomHandler_Room() {
		return (EReference)roomHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomHandler_RoomTable() {
		return (EReference)roomHandlerEClass.getEStructuralFeatures().get(1);
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
	public EOperation getIRoomMaintenance__RemoveRoom__Room() {
		return iRoomMaintenanceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__AddRoomType__String_int_int_String() {
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
	public EOperation getIRoomMaintenance__GetRooms() {
		return iRoomMaintenanceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__GetRoomTypes() {
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
	public EOperation getIRoomMaintenance__GetRoomType__int() {
		return iRoomMaintenanceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomMaintenance__EditRoomStatus__int_Enumerator() {
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
	public EOperation getIRoomMaintenance__EditRoomType__String_int_int_String() {
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
	public EOperation getIExtrasMaintenance__AddExtra__int_String_String_String() {
		return iExtrasMaintenanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIExtrasMaintenance__RemoveExtra__Extra() {
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
	public EOperation getIExtrasMaintenance__EditExtra__int_String_String_String() {
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
	public EOperation getExtrasMaintenance__RemoveExtra__Extra() {
		return extrasMaintenanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtrasMaintenance__GetExtra__int() {
		return extrasMaintenanceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtrasMaintenance__AddExtra__int_String_String_String() {
		return extrasMaintenanceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtrasMaintenance__EditExtra__int_String_String_String() {
		return extrasMaintenanceEClass.getEOperations().get(3);
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
	public EOperation getRoomMaintenance__GetRoomType__int() {
		return roomMaintenanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomMaintenance__RemoveRoomType__String() {
		return roomMaintenanceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomMaintenance__RemoveRoom__Room() {
		return roomMaintenanceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomMaintenance__GetRoom__int() {
		return roomMaintenanceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomMaintenance__AddRoomType__String_int_int_String() {
		return roomMaintenanceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomMaintenance__AddRoom__int_String() {
		return roomMaintenanceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomMaintenance__EditRoomStatus__int_Enumerator() {
		return roomMaintenanceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomMaintenance__GetRoomStatus__int() {
		return roomMaintenanceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomMaintenance__EditRoomType__String_int_int_String() {
		return roomMaintenanceEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomMaintenance__EditRoom__int_String() {
		return roomMaintenanceEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomTypes() {
		return roomTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomTypes_RoomType() {
		return (EReference)roomTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomTypes_RoomTypeTable() {
		return (EReference)roomTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypes__Exists__int() {
		return roomTypesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypes__AddRoomType__String_int_int_String() {
		return roomTypesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypes__RemoveRoomType__RoomType() {
		return roomTypesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomTypes__GetRoomType__String() {
		return roomTypesEClass.getEOperations().get(3);
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
	public EOperation getMaintenanceProvidesForBooking__CanBook__String_int_String_String() {
		return maintenanceProvidesForBookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaintenanceProvidesForBooking__MakeBooking__String_int_String_String() {
		return maintenanceProvidesForBookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaintenanceProvidesForBooking__RemoveBooking__String_int_String_String() {
		return maintenanceProvidesForBookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaintenanceProvidesForBooking__SetBookingAsActive__String() {
		return maintenanceProvidesForBookingEClass.getEOperations().get(3);
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
	public EReference getStringToListsMap_RoomTypeCapTable() {
		return (EReference)stringToListsMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToListsMap_Value() {
		return (EAttribute)stringToListsMapEClass.getEStructuralFeatures().get(2);
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
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
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
		createEAttribute(roomTypeEClass, ROOM_TYPE__DESCIPTION);
		createEAttribute(roomTypeEClass, ROOM_TYPE__ROOM_TYPE_ENUM);

		experienceEClass = createEClass(EXPERIENCE);
		createEAttribute(experienceEClass, EXPERIENCE__NR_OF_SPOTS);
		createEAttribute(experienceEClass, EXPERIENCE__EXPERIENCE_STATUS_ENUM);

		abstractExtraEClass = createEClass(ABSTRACT_EXTRA);
		createEAttribute(abstractExtraEClass, ABSTRACT_EXTRA__ID);
		createEAttribute(abstractExtraEClass, ABSTRACT_EXTRA__PRICE);
		createEAttribute(abstractExtraEClass, ABSTRACT_EXTRA__NAME);
		createEAttribute(abstractExtraEClass, ABSTRACT_EXTRA__DESCRIPTION);

		extraEClass = createEClass(EXTRA);
		createEOperation(extraEClass, EXTRA___GET_PRICE);
		createEOperation(extraEClass, EXTRA___GET_ID);
		createEOperation(extraEClass, EXTRA___GET_NAME);
		createEOperation(extraEClass, EXTRA___GET_DESCRIPTION);
		createEOperation(extraEClass, EXTRA___IS_AVAILABLE);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__STOCK);
		createEAttribute(productEClass, PRODUCT__PRODUCT_STATUS_ENUM);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__NUMBER_ID);
		createEAttribute(roomEClass, ROOM__ROOM_STATUS_ENUM);
		createEReference(roomEClass, ROOM__ROOM_TYPE);

		extraHandlerEClass = createEClass(EXTRA_HANDLER);
		createEReference(extraHandlerEClass, EXTRA_HANDLER__EXTRA);
		createEReference(extraHandlerEClass, EXTRA_HANDLER__EXTRA_TABLE);
		createEOperation(extraHandlerEClass, EXTRA_HANDLER___EXISTS__INT);
		createEOperation(extraHandlerEClass, EXTRA_HANDLER___ADD_EXTRA__INT_STRING_STRING_STRING);
		createEOperation(extraHandlerEClass, EXTRA_HANDLER___REMOVE_EXTRA__EXTRA);
		createEOperation(extraHandlerEClass, EXTRA_HANDLER___GET_EXTRA__INT);

		integerToExtraMapEClass = createEClass(INTEGER_TO_EXTRA_MAP);
		createEAttribute(integerToExtraMapEClass, INTEGER_TO_EXTRA_MAP__KEY);
		createEReference(integerToExtraMapEClass, INTEGER_TO_EXTRA_MAP__VALUE);

		roomHandlerEClass = createEClass(ROOM_HANDLER);
		createEReference(roomHandlerEClass, ROOM_HANDLER__ROOM);
		createEReference(roomHandlerEClass, ROOM_HANDLER__ROOM_TABLE);
		createEOperation(roomHandlerEClass, ROOM_HANDLER___EXISTS__INT);
		createEOperation(roomHandlerEClass, ROOM_HANDLER___ADD_ROOM__INT_STRING);
		createEOperation(roomHandlerEClass, ROOM_HANDLER___REMOVE_ROOM__ROOM);
		createEOperation(roomHandlerEClass, ROOM_HANDLER___GET_ROOM__INT);

		integerToRoomMapEClass = createEClass(INTEGER_TO_ROOM_MAP);
		createEAttribute(integerToRoomMapEClass, INTEGER_TO_ROOM_MAP__KEY);
		createEReference(integerToRoomMapEClass, INTEGER_TO_ROOM_MAP__VALUE);

		calendarEClass = createEClass(CALENDAR);
		createEOperation(calendarEClass, CALENDAR___GET_CAP__INT_INT_STRING);
		createEOperation(calendarEClass, CALENDAR___SET_CAP__INT_INT_STRING_INT);

		iMaintenanceProvidesForBookingEClass = createEClass(IMAINTENANCE_PROVIDES_FOR_BOOKING);
		createEOperation(iMaintenanceProvidesForBookingEClass, IMAINTENANCE_PROVIDES_FOR_BOOKING___CAN_BOOK__STRING_STRING_STRING);
		createEOperation(iMaintenanceProvidesForBookingEClass, IMAINTENANCE_PROVIDES_FOR_BOOKING___MAKE_BOOKING__STRING_STRING_STRING);
		createEOperation(iMaintenanceProvidesForBookingEClass, IMAINTENANCE_PROVIDES_FOR_BOOKING___REMOVE_BOOKING__STRING_INT_STRING_STRING);
		createEOperation(iMaintenanceProvidesForBookingEClass, IMAINTENANCE_PROVIDES_FOR_BOOKING___SET_BOOKING_AS_ACTIVE__STRING);

		iRoomMaintenanceEClass = createEClass(IROOM_MAINTENANCE);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___ADD_ROOM__INT_STRING);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___REMOVE_ROOM__ROOM);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___ADD_ROOM_TYPE__STRING_INT_INT_STRING);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___REMOVE_ROOM_TYPE__STRING);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___GET_ROOMS);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___GET_ROOM_TYPES);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___GET_ROOM__INT);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___GET_ROOM_TYPE__INT);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___EDIT_ROOM_STATUS__INT_ENUMERATOR);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___GET_ROOM_STATUS__INT);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___EDIT_ROOM_TYPE__STRING_INT_INT_STRING);
		createEOperation(iRoomMaintenanceEClass, IROOM_MAINTENANCE___EDIT_ROOM__INT_STRING);

		iExtrasMaintenanceEClass = createEClass(IEXTRAS_MAINTENANCE);
		createEOperation(iExtrasMaintenanceEClass, IEXTRAS_MAINTENANCE___ADD_EXTRA__INT_STRING_STRING_STRING);
		createEOperation(iExtrasMaintenanceEClass, IEXTRAS_MAINTENANCE___REMOVE_EXTRA__EXTRA);
		createEOperation(iExtrasMaintenanceEClass, IEXTRAS_MAINTENANCE___GET_EXTRAS);
		createEOperation(iExtrasMaintenanceEClass, IEXTRAS_MAINTENANCE___GET_EXTRA__INT);
		createEOperation(iExtrasMaintenanceEClass, IEXTRAS_MAINTENANCE___EDIT_EXTRA__INT_STRING_STRING_STRING);

		extrasMaintenanceEClass = createEClass(EXTRAS_MAINTENANCE);
		createEReference(extrasMaintenanceEClass, EXTRAS_MAINTENANCE__EXTRAS);
		createEOperation(extrasMaintenanceEClass, EXTRAS_MAINTENANCE___REMOVE_EXTRA__EXTRA);
		createEOperation(extrasMaintenanceEClass, EXTRAS_MAINTENANCE___GET_EXTRA__INT);
		createEOperation(extrasMaintenanceEClass, EXTRAS_MAINTENANCE___ADD_EXTRA__INT_STRING_STRING_STRING);
		createEOperation(extrasMaintenanceEClass, EXTRAS_MAINTENANCE___EDIT_EXTRA__INT_STRING_STRING_STRING);

		roomMaintenanceEClass = createEClass(ROOM_MAINTENANCE);
		createEReference(roomMaintenanceEClass, ROOM_MAINTENANCE__ROOM_TYPES);
		createEReference(roomMaintenanceEClass, ROOM_MAINTENANCE__ROOMS);
		createEOperation(roomMaintenanceEClass, ROOM_MAINTENANCE___GET_ROOM_TYPE__INT);
		createEOperation(roomMaintenanceEClass, ROOM_MAINTENANCE___REMOVE_ROOM_TYPE__STRING);
		createEOperation(roomMaintenanceEClass, ROOM_MAINTENANCE___REMOVE_ROOM__ROOM);
		createEOperation(roomMaintenanceEClass, ROOM_MAINTENANCE___GET_ROOM__INT);
		createEOperation(roomMaintenanceEClass, ROOM_MAINTENANCE___ADD_ROOM_TYPE__STRING_INT_INT_STRING);
		createEOperation(roomMaintenanceEClass, ROOM_MAINTENANCE___ADD_ROOM__INT_STRING);
		createEOperation(roomMaintenanceEClass, ROOM_MAINTENANCE___EDIT_ROOM_STATUS__INT_ENUMERATOR);
		createEOperation(roomMaintenanceEClass, ROOM_MAINTENANCE___GET_ROOM_STATUS__INT);
		createEOperation(roomMaintenanceEClass, ROOM_MAINTENANCE___EDIT_ROOM_TYPE__STRING_INT_INT_STRING);
		createEOperation(roomMaintenanceEClass, ROOM_MAINTENANCE___EDIT_ROOM__INT_STRING);

		roomTypesEClass = createEClass(ROOM_TYPES);
		createEReference(roomTypesEClass, ROOM_TYPES__ROOM_TYPE);
		createEReference(roomTypesEClass, ROOM_TYPES__ROOM_TYPE_TABLE);
		createEOperation(roomTypesEClass, ROOM_TYPES___EXISTS__INT);
		createEOperation(roomTypesEClass, ROOM_TYPES___ADD_ROOM_TYPE__STRING_INT_INT_STRING);
		createEOperation(roomTypesEClass, ROOM_TYPES___REMOVE_ROOM_TYPE__ROOMTYPE);
		createEOperation(roomTypesEClass, ROOM_TYPES___GET_ROOM_TYPE__STRING);

		stringToRoomTypeEClass = createEClass(STRING_TO_ROOM_TYPE);
		createEAttribute(stringToRoomTypeEClass, STRING_TO_ROOM_TYPE__KEY);
		createEReference(stringToRoomTypeEClass, STRING_TO_ROOM_TYPE__VALUE);

		maintenanceProvidesForBookingEClass = createEClass(MAINTENANCE_PROVIDES_FOR_BOOKING);
		createEReference(maintenanceProvidesForBookingEClass, MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR);
		createEReference(maintenanceProvidesForBookingEClass, MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES);
		createEReference(maintenanceProvidesForBookingEClass, MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS);
		createEOperation(maintenanceProvidesForBookingEClass, MAINTENANCE_PROVIDES_FOR_BOOKING___CAN_BOOK__STRING_INT_STRING_STRING);
		createEOperation(maintenanceProvidesForBookingEClass, MAINTENANCE_PROVIDES_FOR_BOOKING___MAKE_BOOKING__STRING_INT_STRING_STRING);
		createEOperation(maintenanceProvidesForBookingEClass, MAINTENANCE_PROVIDES_FOR_BOOKING___REMOVE_BOOKING__STRING_INT_STRING_STRING);
		createEOperation(maintenanceProvidesForBookingEClass, MAINTENANCE_PROVIDES_FOR_BOOKING___SET_BOOKING_AS_ACTIVE__STRING);

		stringToListsMapEClass = createEClass(STRING_TO_LISTS_MAP);
		createEAttribute(stringToListsMapEClass, STRING_TO_LISTS_MAP__KEY);
		createEReference(stringToListsMapEClass, STRING_TO_LISTS_MAP__ROOM_TYPE_CAP_TABLE);
		createEAttribute(stringToListsMapEClass, STRING_TO_LISTS_MAP__VALUE);

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

		// Initialize classes, features, and operations; add parameters
		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_MaxNrOfGuests(), theTypesPackage.getInteger(), "maxNrOfGuests", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Desciption(), theTypesPackage.getString(), "desciption", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_RoomTypeEnum(), this.getRoomTypeEnum(), "roomTypeEnum", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(experienceEClass, Experience.class, "Experience", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperience_NrOfSpots(), theTypesPackage.getInteger(), "nrOfSpots", null, 1, 1, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExperience_ExperienceStatusEnum(), this.getExperienceStatusEnum(), "experienceStatusEnum", null, 1, 1, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractExtraEClass, AbstractExtra.class, "AbstractExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractExtra_ID(), theTypesPackage.getString(), "ID", null, 1, 1, AbstractExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractExtra_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, AbstractExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractExtra_Name(), theTypesPackage.getString(), "name", null, 1, 1, AbstractExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractExtra_Description(), theTypesPackage.getString(), "description", null, 1, 1, AbstractExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(extraEClass, Extra.class, "Extra", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getExtra__GetPrice(), theTypesPackage.getInteger(), "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExtra__GetID(), theTypesPackage.getString(), "getID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExtra__GetName(), theTypesPackage.getString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExtra__GetDescription(), theTypesPackage.getString(), "getDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExtra__IsAvailable(), theTypesPackage.getBoolean(), "isAvailable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_Stock(), theTypesPackage.getInteger(), "stock", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProduct_ProductStatusEnum(), this.getProductStatusEnum(), "productStatusEnum", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_NumberID(), theTypesPackage.getInteger(), "numberID", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomStatusEnum(), this.getRoomStatusEnum(), "roomStatusEnum", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomType(), this.getRoomType(), null, "roomType", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(extraHandlerEClass, ExtraHandler.class, "ExtraHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtraHandler_Extra(), this.getExtra(), null, "extra", null, 0, -1, ExtraHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExtraHandler_ExtraTable(), this.getIntegerToExtraMap(), null, "extraTable", null, 1, 1, ExtraHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getExtraHandler__Exists__int(), theTypesPackage.getBoolean(), "exists", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtraHandler__AddExtra__int_String_String_String(), null, "addExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtraHandler__RemoveExtra__Extra(), null, "removeExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExtra(), "extra", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtraHandler__GetExtra__int(), this.getExtra(), "getExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(integerToExtraMapEClass, IntegerToExtraMap.class, "IntegerToExtraMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerToExtraMap_Key(), theTypesPackage.getInteger(), "key", null, 1, 1, IntegerToExtraMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIntegerToExtraMap_Value(), this.getExtra(), null, "value", null, 1, 1, IntegerToExtraMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomHandlerEClass, RoomHandler.class, "RoomHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomHandler_Room(), this.getRoom(), null, "room", null, 0, -1, RoomHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomHandler_RoomTable(), this.getIntegerToRoomMap(), null, "roomTable", null, 1, 1, RoomHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomHandler__Exists__int(), theTypesPackage.getBoolean(), "exists", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandler__AddRoom__int_String(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "numberID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandler__RemoveRoom__Room(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandler__GetRoom__int(), this.getRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(integerToRoomMapEClass, IntegerToRoomMap.class, "IntegerToRoomMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerToRoomMap_Key(), theTypesPackage.getInteger(), "key", null, 1, 1, IntegerToRoomMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIntegerToRoomMap_Value(), this.getRoom(), null, "value", null, 1, 1, IntegerToRoomMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(calendarEClass, Calendar.class, "Calendar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCalendar__GetCap__int_int_String(), theTypesPackage.getInteger(), "getCap", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCalendar__SetCap__int_int_String_int(), null, "setCap", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nrOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iMaintenanceProvidesForBookingEClass, IMaintenanceProvidesForBooking.class, "IMaintenanceProvidesForBooking", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIMaintenanceProvidesForBooking__CanBook__String_String_String(), theTypesPackage.getBoolean(), "canBook", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIMaintenanceProvidesForBooking__MakeBooking__String_String_String(), null, "makeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
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

		initEClass(iRoomMaintenanceEClass, IRoomMaintenance.class, "IRoomMaintenance", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIRoomMaintenance__AddRoom__int_String(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "numberID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__RemoveRoom__Room(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__AddRoomType__String_int_int_String(), null, "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "maxNrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__RemoveRoomType__String(), null, "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoomMaintenance__GetRooms(), null, "getRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoomMaintenance__GetRoomTypes(), null, "getRoomTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__GetRoom__int(), this.getRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__GetRoomType__int(), this.getRoomType(), "getRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__EditRoomStatus__int_Enumerator(), theTypesPackage.getInteger(), "editRoomStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEEnumerator(), "status", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__GetRoomStatus__int(), ecorePackage.getEEnumerator(), "getRoomStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__EditRoomType__String_int_int_String(), null, "editRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "maxNrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomMaintenance__EditRoom__int_String(), null, "editRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "numberID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iExtrasMaintenanceEClass, IExtrasMaintenance.class, "IExtrasMaintenance", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIExtrasMaintenance__AddExtra__int_String_String_String(), null, "addExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIExtrasMaintenance__RemoveExtra__Extra(), null, "removeExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExtra(), "extra", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIExtrasMaintenance__GetExtras(), null, "getExtras", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIExtrasMaintenance__GetExtra__int(), null, "getExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIExtrasMaintenance__EditExtra__int_String_String_String(), null, "editExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(extrasMaintenanceEClass, ExtrasMaintenance.class, "ExtrasMaintenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtrasMaintenance_Extras(), this.getExtraHandler(), null, "extras", null, 0, 1, ExtrasMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExtrasMaintenance__RemoveExtra__Extra(), null, "removeExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExtra(), "extra", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtrasMaintenance__GetExtra__int(), null, "getExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtrasMaintenance__AddExtra__int_String_String_String(), null, "addExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExtrasMaintenance__EditExtra__int_String_String_String(), null, "editExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomMaintenanceEClass, RoomMaintenance.class, "RoomMaintenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomMaintenance_RoomTypes(), this.getRoomTypes(), null, "roomTypes", null, 1, 1, RoomMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomMaintenance_Rooms(), this.getRoomHandler(), null, "rooms", null, 1, 1, RoomMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomMaintenance__GetRoomType__int(), this.getRoomTypes(), "getRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomMaintenance__RemoveRoomType__String(), null, "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomMaintenance__RemoveRoom__Room(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomMaintenance__GetRoom__int(), this.getRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomMaintenance__AddRoomType__String_int_int_String(), null, "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "maxNrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomMaintenance__AddRoom__int_String(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "numberID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomMaintenance__EditRoomStatus__int_Enumerator(), null, "editRoomStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEEnumerator(), "status", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomMaintenance__GetRoomStatus__int(), ecorePackage.getEEnumerator(), "getRoomStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomMaintenance__EditRoomType__String_int_int_String(), null, "editRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "maxNrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomMaintenance__EditRoom__int_String(), null, "editRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "numberID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomTypesEClass, RoomTypes.class, "RoomTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomTypes_RoomType(), this.getRoomType(), null, "roomType", null, 0, -1, RoomTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomTypes_RoomTypeTable(), this.getStringToRoomType(), null, "roomTypeTable", null, 1, 1, RoomTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomTypes__Exists__int(), theTypesPackage.getBoolean(), "exists", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomTypes__AddRoomType__String_int_int_String(), null, "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "maxNrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomTypes__RemoveRoomType__RoomType(), null, "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomTypes__GetRoomType__String(), this.getRoomType(), "getRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(stringToRoomTypeEClass, StringToRoomType.class, "StringToRoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToRoomType_Key(), ecorePackage.getEString(), "key", null, 1, 1, StringToRoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStringToRoomType_Value(), this.getRoomType(), null, "value", null, 1, 1, StringToRoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(maintenanceProvidesForBookingEClass, MaintenanceProvidesForBooking.class, "MaintenanceProvidesForBooking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaintenanceProvidesForBooking_Calendar(), this.getCalendar(), null, "calendar", null, 1, 1, MaintenanceProvidesForBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMaintenanceProvidesForBooking_RoomTypes(), this.getRoomTypes(), null, "roomTypes", null, 1, 1, MaintenanceProvidesForBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMaintenanceProvidesForBooking_Rooms(), this.getRoomHandler(), null, "rooms", null, 1, 1, MaintenanceProvidesForBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMaintenanceProvidesForBooking__CanBook__String_int_String_String(), null, "canBook", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nrOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMaintenanceProvidesForBooking__MakeBooking__String_int_String_String(), null, "makeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nrOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMaintenanceProvidesForBooking__RemoveBooking__String_int_String_String(), null, "removeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nrOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMaintenanceProvidesForBooking__SetBookingAsActive__String(), theTypesPackage.getInteger(), "setBookingAsActive", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(stringToListsMapEClass, StringToListsMap.class, "StringToListsMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToListsMap_Key(), ecorePackage.getEString(), "key", null, 1, 1, StringToListsMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStringToListsMap_RoomTypeCapTable(), this.getStringToListsMap(), null, "roomTypeCapTable", null, 1, 1, StringToListsMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStringToListsMap_Value(), ecorePackage.getEInt(), "value", null, 0, -1, StringToListsMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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

} //ModelPackageImpl
