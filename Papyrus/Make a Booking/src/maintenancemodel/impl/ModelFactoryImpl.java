/**
 */
package maintenancemodel.impl;

import java.util.Map;

import maintenancemodel.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the maintenancemodel
 * <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModelPackage.ROOM_TYPE:
			return createRoomType();
		case ModelPackage.EXPERIENCE:
			return createExperience();
		case ModelPackage.ABSTRACT_EXTRA:
			return createAbstractExtra();
		case ModelPackage.PRODUCT:
			return createProduct();
		case ModelPackage.ROOM:
			return createRoom();
		case ModelPackage.EXTRA_HANDLER:
			return createExtraHandler();
		case ModelPackage.INTEGER_TO_EXTRA_MAP:
			return (EObject) createIntegerToExtraMap();
		case ModelPackage.ROOM_HANDLER:
			return createRoomHandler();
		case ModelPackage.INTEGER_TO_ROOM_MAP:
			return (EObject) createIntegerToRoomMap();
		case ModelPackage.CALENDAR:
			return createCalendar();
		case ModelPackage.ROOM_TYPES_HANDLER:
			return createRoomTypesHandler();
		case ModelPackage.STRING_TO_ROOM_TYPE:
			return (EObject) createStringToRoomType();
		case ModelPackage.STRING_TO_LISTS_MAP:
			return (EObject) createStringToListsMap();
		case ModelPackage.EXTRAS_MAINTENANCE:
			return createExtrasMaintenance();
		case ModelPackage.ROOM_MAINTENANCE:
			return createRoomMaintenance();
		case ModelPackage.MAINTENANCE_PROVIDES_FOR_BOOKING:
			return createMaintenanceProvidesForBooking();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ModelPackage.ROOM_TYPE_ENUM:
			return createRoomTypeEnumFromString(eDataType, initialValue);
		case ModelPackage.EXPERIENCE_STATUS_ENUM:
			return createExperienceStatusEnumFromString(eDataType, initialValue);
		case ModelPackage.PRODUCT_STATUS_ENUM:
			return createProductStatusEnumFromString(eDataType, initialValue);
		case ModelPackage.ROOM_STATUS_ENUM:
			return createRoomStatusEnumFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ModelPackage.ROOM_TYPE_ENUM:
			return convertRoomTypeEnumToString(eDataType, instanceValue);
		case ModelPackage.EXPERIENCE_STATUS_ENUM:
			return convertExperienceStatusEnumToString(eDataType, instanceValue);
		case ModelPackage.PRODUCT_STATUS_ENUM:
			return convertProductStatusEnumToString(eDataType, instanceValue);
		case ModelPackage.ROOM_STATUS_ENUM:
			return convertRoomStatusEnumToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Experience createExperience() {
		ExperienceImpl experience = new ExperienceImpl();
		return experience;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExtraHandler createExtraHandler() {
		ExtraHandlerImpl extraHandler = new ExtraHandlerImpl();
		return extraHandler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map.Entry<Integer, Extra> createIntegerToExtraMap() {
		IntegerToExtraMapImpl integerToExtraMap = new IntegerToExtraMapImpl();
		return integerToExtraMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoomHandler createRoomHandler() {
		RoomHandlerImpl roomHandler = new RoomHandlerImpl();
		return roomHandler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map.Entry<Integer, Room> createIntegerToRoomMap() {
		IntegerToRoomMapImpl integerToRoomMap = new IntegerToRoomMapImpl();
		return integerToRoomMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Calendar createCalendar() {
		CalendarImpl calendar = new CalendarImpl();
		return calendar;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoomTypesHandler createRoomTypesHandler() {
		RoomTypesHandlerImpl roomTypesHandler = new RoomTypesHandlerImpl();
		return roomTypesHandler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Map.Entry<String, RoomType> createStringToRoomType() {
		StringToRoomTypeImpl stringToRoomType = new StringToRoomTypeImpl();
		return stringToRoomType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map.Entry<String, EList<Integer>> createStringToListsMap() {
		StringToListsMapImpl stringToListsMap = new StringToListsMapImpl();
		return stringToListsMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExtrasMaintenance createExtrasMaintenance() {
		ExtrasMaintenanceImpl extrasMaintenance = new ExtrasMaintenanceImpl();
		return extrasMaintenance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoomMaintenance createRoomMaintenance() {
		RoomMaintenanceImpl roomMaintenance = new RoomMaintenanceImpl();
		return roomMaintenance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MaintenanceProvidesForBooking createMaintenanceProvidesForBooking() {
		MaintenanceProvidesForBookingImpl maintenanceProvidesForBooking = new MaintenanceProvidesForBookingImpl();
		return maintenanceProvidesForBooking;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoomTypeEnum createRoomTypeEnumFromString(EDataType eDataType,
			String initialValue) {
		RoomTypeEnum result = RoomTypeEnum.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertRoomTypeEnumToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExperienceStatusEnum createExperienceStatusEnumFromString(
			EDataType eDataType, String initialValue) {
		ExperienceStatusEnum result = ExperienceStatusEnum.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertExperienceStatusEnumToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProductStatusEnum createProductStatusEnumFromString(
			EDataType eDataType, String initialValue) {
		ProductStatusEnum result = ProductStatusEnum.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertProductStatusEnumToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoomStatusEnum createRoomStatusEnumFromString(EDataType eDataType,
			String initialValue) {
		RoomStatusEnum result = RoomStatusEnum.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertRoomStatusEnumToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

	/**
	 * This is wrong!
	 * 
	 * @generated NOT
	 */
	public AbstractExtra createAbstractExtra() {
		return null;
	}

} // ModelFactoryImpl
