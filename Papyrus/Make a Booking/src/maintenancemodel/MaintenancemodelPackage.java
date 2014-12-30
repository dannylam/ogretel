/**
 */
package maintenancemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see maintenancemodel.MaintenancemodelFactory
 * @model kind="package"
 * @generated
 */
public interface MaintenancemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maintenancemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///maintenancemodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "maintenancemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaintenancemodelPackage eINSTANCE = maintenancemodel.impl.MaintenancemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.RoomTypeImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Max Nr Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__MAX_NR_OF_GUESTS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Room Type Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ROOM_TYPE_ENUM = 3;

	/**
	 * The feature id for the '<em><b>Room Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ROOM_TYPE_ID = 4;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenancemodel.Extra <em>Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.Extra
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getExtra()
	 * @generated
	 */
	int EXTRA = 3;

	/**
	 * The number of structural features of the '<em>Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Is Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA___IS_AVAILABLE = 0;

	/**
	 * The number of operations of the '<em>Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.AbstractExtraImpl <em>Abstract Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.AbstractExtraImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getAbstractExtra()
	 * @generated
	 */
	int ABSTRACT_EXTRA = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXTRA__ID = EXTRA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXTRA__PRICE = EXTRA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXTRA__NAME = EXTRA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXTRA__DESCRIPTION = EXTRA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXTRA_FEATURE_COUNT = EXTRA_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXTRA___IS_AVAILABLE = EXTRA___IS_AVAILABLE;

	/**
	 * The number of operations of the '<em>Abstract Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXTRA_OPERATION_COUNT = EXTRA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.ExperienceImpl <em>Experience</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.ExperienceImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getExperience()
	 * @generated
	 */
	int EXPERIENCE = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__ID = ABSTRACT_EXTRA__ID;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__PRICE = ABSTRACT_EXTRA__PRICE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__NAME = ABSTRACT_EXTRA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__DESCRIPTION = ABSTRACT_EXTRA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Nr Of Spots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__NR_OF_SPOTS = ABSTRACT_EXTRA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Experience Status Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__EXPERIENCE_STATUS_ENUM = ABSTRACT_EXTRA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nr Of Spots Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__NR_OF_SPOTS_FREE = ABSTRACT_EXTRA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE_FEATURE_COUNT = ABSTRACT_EXTRA_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE___IS_AVAILABLE = ABSTRACT_EXTRA___IS_AVAILABLE;

	/**
	 * The number of operations of the '<em>Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE_OPERATION_COUNT = ABSTRACT_EXTRA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.ProductImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = ABSTRACT_EXTRA__ID;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = ABSTRACT_EXTRA__PRICE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = ABSTRACT_EXTRA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = ABSTRACT_EXTRA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__STOCK = ABSTRACT_EXTRA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Status Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_STATUS_ENUM = ABSTRACT_EXTRA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = ABSTRACT_EXTRA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___IS_AVAILABLE = ABSTRACT_EXTRA___IS_AVAILABLE;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = ABSTRACT_EXTRA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.RoomImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 5;

	/**
	 * The feature id for the '<em><b>Room ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_ID = 0;

	/**
	 * The feature id for the '<em><b>Room Status Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_STATUS_ENUM = 1;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.ExtraHandlerImpl <em>Extra Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.ExtraHandlerImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getExtraHandler()
	 * @generated
	 */
	int EXTRA_HANDLER = 6;

	/**
	 * The feature id for the '<em><b>Int To Extra Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_HANDLER__INT_TO_EXTRA_MAP = 0;

	/**
	 * The number of structural features of the '<em>Extra Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_HANDLER___EXISTS__INT = 0;

	/**
	 * The operation id for the '<em>Add Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_HANDLER___ADD_EXTRA__INT_INT_STRING_STRING_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Remove Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_HANDLER___REMOVE_EXTRA__INT = 2;

	/**
	 * The operation id for the '<em>Get Extras</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_HANDLER___GET_EXTRAS = 3;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_HANDLER___GET_PRICE__INT = 4;

	/**
	 * The number of operations of the '<em>Extra Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_HANDLER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.IntegerToExtraMapImpl <em>Integer To Extra Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.IntegerToExtraMapImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getIntegerToExtraMap()
	 * @generated
	 */
	int INTEGER_TO_EXTRA_MAP = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TO_EXTRA_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TO_EXTRA_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Integer To Extra Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TO_EXTRA_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Integer To Extra Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TO_EXTRA_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.RoomHandlerImpl <em>Room Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.RoomHandlerImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoomHandler()
	 * @generated
	 */
	int ROOM_HANDLER = 8;

	/**
	 * The feature id for the '<em><b>Integer To Room Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER__INTEGER_TO_ROOM_MAP = 0;

	/**
	 * The number of structural features of the '<em>Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___EXISTS__INT = 0;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___ADD_ROOM__INT_ROOMTYPE = 1;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___REMOVE_ROOM__INT = 2;

	/**
	 * The operation id for the '<em>Get Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___GET_ROOM__INT = 3;

	/**
	 * The number of operations of the '<em>Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.IntegerToRoomMapImpl <em>Integer To Room Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.IntegerToRoomMapImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getIntegerToRoomMap()
	 * @generated
	 */
	int INTEGER_TO_ROOM_MAP = 9;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TO_ROOM_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TO_ROOM_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Integer To Room Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TO_ROOM_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Integer To Room Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TO_ROOM_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.CalendarImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 10;

	/**
	 * The feature id for the '<em><b>String To Lists Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__STRING_TO_LISTS_MAP = 0;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Cap</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR___GET_CAP__INT_INT_STRING = 0;

	/**
	 * The operation id for the '<em>Set Cap</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR___SET_CAP__INT_INT_STRING_INT = 1;

	/**
	 * The number of operations of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.RoomTypesHandlerImpl <em>Room Types Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.RoomTypesHandlerImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoomTypesHandler()
	 * @generated
	 */
	int ROOM_TYPES_HANDLER = 17;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.StringToRoomTypeImpl <em>String To Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.StringToRoomTypeImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getStringToRoomType()
	 * @generated
	 */
	int STRING_TO_ROOM_TYPE = 18;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.StringToListsMapImpl <em>String To Lists Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.StringToListsMapImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getStringToListsMap()
	 * @generated
	 */
	int STRING_TO_LISTS_MAP = 11;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_LISTS_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_LISTS_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Lists Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_LISTS_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Lists Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_LISTS_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenancemodel.IMaintenanceProvidesForBooking <em>IMaintenance Provides For Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.IMaintenanceProvidesForBooking
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getIMaintenanceProvidesForBooking()
	 * @generated
	 */
	int IMAINTENANCE_PROVIDES_FOR_BOOKING = 12;

	/**
	 * The number of structural features of the '<em>IMaintenance Provides For Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAINTENANCE_PROVIDES_FOR_BOOKING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Can Book</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAINTENANCE_PROVIDES_FOR_BOOKING___CAN_BOOK__ELIST_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Make Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAINTENANCE_PROVIDES_FOR_BOOKING___MAKE_BOOKING__ELIST_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Remove Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAINTENANCE_PROVIDES_FOR_BOOKING___REMOVE_BOOKING__ELIST_INT_STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Get Room And Set Active</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAINTENANCE_PROVIDES_FOR_BOOKING___GET_ROOM_AND_SET_ACTIVE__STRING = 3;

	/**
	 * The operation id for the '<em>Get Price Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_ROOM__ELIST = 4;

	/**
	 * The operation id for the '<em>Get Price Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_EXTRA__ELIST = 5;

	/**
	 * The number of operations of the '<em>IMaintenance Provides For Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAINTENANCE_PROVIDES_FOR_BOOKING_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link maintenancemodel.IRoomMaintenance <em>IRoom Maintenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.IRoomMaintenance
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getIRoomMaintenance()
	 * @generated
	 */
	int IROOM_MAINTENANCE = 13;

	/**
	 * The number of structural features of the '<em>IRoom Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___ADD_ROOM__INT_STRING = 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___REMOVE_ROOM__INT = 1;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING = 2;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___REMOVE_ROOM_TYPE__STRING = 3;

	/**
	 * The operation id for the '<em>Edit Room Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___EDIT_ROOM_STATUS__INT_STRING = 4;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___EDIT_ROOM_TYPE__STRING_STRING_INT_INT_STRING = 5;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___EDIT_ROOM__INT_STRING = 6;

	/**
	 * The operation id for the '<em>Get Room IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___GET_ROOM_IDS = 7;

	/**
	 * The operation id for the '<em>Get Room Type IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___GET_ROOM_TYPE_IDS = 8;

	/**
	 * The operation id for the '<em>Get Room Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___GET_ROOM_STATUS__INT = 9;

	/**
	 * The operation id for the '<em>Get Room Statuses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___GET_ROOM_STATUSES = 10;

	/**
	 * The operation id for the '<em>Get Room Type Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___GET_ROOM_TYPE_ENUM__STRING = 11;

	/**
	 * The operation id for the '<em>Get Room Type Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___GET_ROOM_TYPE_PRICE__STRING = 12;

	/**
	 * The operation id for the '<em>Get Room Type Max Nr Of Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___GET_ROOM_TYPE_MAX_NR_OF_GUESTS__STRING = 13;

	/**
	 * The operation id for the '<em>Get Room Type Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___GET_ROOM_TYPE_DESCRIPTION__STRING = 14;

	/**
	 * The operation id for the '<em>Get Room Type ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___GET_ROOM_TYPE_ID__INT = 15;

	/**
	 * The operation id for the '<em>Get Room Type Enums</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE___GET_ROOM_TYPE_ENUMS = 16;

	/**
	 * The number of operations of the '<em>IRoom Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MAINTENANCE_OPERATION_COUNT = 17;

	/**
	 * The meta object id for the '{@link maintenancemodel.IExtrasMaintenance <em>IExtras Maintenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.IExtrasMaintenance
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getIExtrasMaintenance()
	 * @generated
	 */
	int IEXTRAS_MAINTENANCE = 14;

	/**
	 * The number of structural features of the '<em>IExtras Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXTRAS_MAINTENANCE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXTRAS_MAINTENANCE___ADD_EXTRA__INT_INT_STRING_STRING_BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Remove Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXTRAS_MAINTENANCE___REMOVE_EXTRA__INT = 1;

	/**
	 * The operation id for the '<em>Get Extras</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXTRAS_MAINTENANCE___GET_EXTRAS = 2;

	/**
	 * The operation id for the '<em>Edit Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXTRAS_MAINTENANCE___EDIT_EXTRA__INT_INT_STRING_STRING = 3;

	/**
	 * The number of operations of the '<em>IExtras Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXTRAS_MAINTENANCE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.ExtrasMaintenanceImpl <em>Extras Maintenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.ExtrasMaintenanceImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getExtrasMaintenance()
	 * @generated
	 */
	int EXTRAS_MAINTENANCE = 15;

	/**
	 * The feature id for the '<em><b>Extras</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAS_MAINTENANCE__EXTRAS = IEXTRAS_MAINTENANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extras Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAS_MAINTENANCE_FEATURE_COUNT = IEXTRAS_MAINTENANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAS_MAINTENANCE___ADD_EXTRA__INT_INT_STRING_STRING_BOOLEAN = IEXTRAS_MAINTENANCE___ADD_EXTRA__INT_INT_STRING_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Remove Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAS_MAINTENANCE___REMOVE_EXTRA__INT = IEXTRAS_MAINTENANCE___REMOVE_EXTRA__INT;

	/**
	 * The operation id for the '<em>Get Extras</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAS_MAINTENANCE___GET_EXTRAS = IEXTRAS_MAINTENANCE___GET_EXTRAS;

	/**
	 * The operation id for the '<em>Edit Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAS_MAINTENANCE___EDIT_EXTRA__INT_INT_STRING_STRING = IEXTRAS_MAINTENANCE___EDIT_EXTRA__INT_INT_STRING_STRING;

	/**
	 * The number of operations of the '<em>Extras Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAS_MAINTENANCE_OPERATION_COUNT = IEXTRAS_MAINTENANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.RoomMaintenanceImpl <em>Room Maintenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.RoomMaintenanceImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoomMaintenance()
	 * @generated
	 */
	int ROOM_MAINTENANCE = 16;

	/**
	 * The feature id for the '<em><b>Room Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE__ROOM_TYPES = IROOM_MAINTENANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE__ROOMS = IROOM_MAINTENANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Room Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE_FEATURE_COUNT = IROOM_MAINTENANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___ADD_ROOM__INT_STRING = IROOM_MAINTENANCE___ADD_ROOM__INT_STRING;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___REMOVE_ROOM__INT = IROOM_MAINTENANCE___REMOVE_ROOM__INT;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING = IROOM_MAINTENANCE___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___REMOVE_ROOM_TYPE__STRING = IROOM_MAINTENANCE___REMOVE_ROOM_TYPE__STRING;

	/**
	 * The operation id for the '<em>Edit Room Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___EDIT_ROOM_STATUS__INT_STRING = IROOM_MAINTENANCE___EDIT_ROOM_STATUS__INT_STRING;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___EDIT_ROOM_TYPE__STRING_STRING_INT_INT_STRING = IROOM_MAINTENANCE___EDIT_ROOM_TYPE__STRING_STRING_INT_INT_STRING;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___EDIT_ROOM__INT_STRING = IROOM_MAINTENANCE___EDIT_ROOM__INT_STRING;

	/**
	 * The operation id for the '<em>Get Room IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___GET_ROOM_IDS = IROOM_MAINTENANCE___GET_ROOM_IDS;

	/**
	 * The operation id for the '<em>Get Room Type IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___GET_ROOM_TYPE_IDS = IROOM_MAINTENANCE___GET_ROOM_TYPE_IDS;

	/**
	 * The operation id for the '<em>Get Room Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___GET_ROOM_STATUS__INT = IROOM_MAINTENANCE___GET_ROOM_STATUS__INT;

	/**
	 * The operation id for the '<em>Get Room Statuses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___GET_ROOM_STATUSES = IROOM_MAINTENANCE___GET_ROOM_STATUSES;

	/**
	 * The operation id for the '<em>Get Room Type Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___GET_ROOM_TYPE_ENUM__STRING = IROOM_MAINTENANCE___GET_ROOM_TYPE_ENUM__STRING;

	/**
	 * The operation id for the '<em>Get Room Type Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___GET_ROOM_TYPE_PRICE__STRING = IROOM_MAINTENANCE___GET_ROOM_TYPE_PRICE__STRING;

	/**
	 * The operation id for the '<em>Get Room Type Max Nr Of Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___GET_ROOM_TYPE_MAX_NR_OF_GUESTS__STRING = IROOM_MAINTENANCE___GET_ROOM_TYPE_MAX_NR_OF_GUESTS__STRING;

	/**
	 * The operation id for the '<em>Get Room Type Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___GET_ROOM_TYPE_DESCRIPTION__STRING = IROOM_MAINTENANCE___GET_ROOM_TYPE_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get Room Type ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___GET_ROOM_TYPE_ID__INT = IROOM_MAINTENANCE___GET_ROOM_TYPE_ID__INT;

	/**
	 * The operation id for the '<em>Get Room Type Enums</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE___GET_ROOM_TYPE_ENUMS = IROOM_MAINTENANCE___GET_ROOM_TYPE_ENUMS;

	/**
	 * The number of operations of the '<em>Room Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MAINTENANCE_OPERATION_COUNT = IROOM_MAINTENANCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String To Room Type</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Room Types Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPES_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPES_HANDLER___EXISTS__STRING = 0;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPES_HANDLER___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING = 1;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPES_HANDLER___REMOVE_ROOM_TYPE__STRING = 2;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPES_HANDLER___GET_PRICE__STRING = 3;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPES_HANDLER___GET_ROOM_TYPES = 4;

	/**
	 * The operation id for the '<em>Get Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPES_HANDLER___GET_ROOM_TYPE__STRING = 5;

	/**
	 * The number of operations of the '<em>Room Types Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPES_HANDLER_OPERATION_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ROOM_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ROOM_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ROOM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenancemodel.impl.MaintenanceProvidesForBookingImpl <em>Maintenance Provides For Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.impl.MaintenanceProvidesForBookingImpl
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getMaintenanceProvidesForBooking()
	 * @generated
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING = 19;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR = IMAINTENANCE_PROVIDES_FOR_BOOKING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Room Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES = IMAINTENANCE_PROVIDES_FOR_BOOKING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS = IMAINTENANCE_PROVIDES_FOR_BOOKING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extra Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER = IMAINTENANCE_PROVIDES_FOR_BOOKING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Maintenance Provides For Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING_FEATURE_COUNT = IMAINTENANCE_PROVIDES_FOR_BOOKING_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Can Book</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING___CAN_BOOK__ELIST_STRING_STRING = IMAINTENANCE_PROVIDES_FOR_BOOKING___CAN_BOOK__ELIST_STRING_STRING;

	/**
	 * The operation id for the '<em>Make Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING___MAKE_BOOKING__ELIST_STRING_STRING = IMAINTENANCE_PROVIDES_FOR_BOOKING___MAKE_BOOKING__ELIST_STRING_STRING;

	/**
	 * The operation id for the '<em>Remove Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING___REMOVE_BOOKING__ELIST_INT_STRING_STRING = IMAINTENANCE_PROVIDES_FOR_BOOKING___REMOVE_BOOKING__ELIST_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Get Room And Set Active</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING___GET_ROOM_AND_SET_ACTIVE__STRING = IMAINTENANCE_PROVIDES_FOR_BOOKING___GET_ROOM_AND_SET_ACTIVE__STRING;

	/**
	 * The operation id for the '<em>Get Price Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_ROOM__ELIST = IMAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_ROOM__ELIST;

	/**
	 * The operation id for the '<em>Get Price Extra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_EXTRA__ELIST = IMAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_EXTRA__ELIST;

	/**
	 * The number of operations of the '<em>Maintenance Provides For Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROVIDES_FOR_BOOKING_OPERATION_COUNT = IMAINTENANCE_PROVIDES_FOR_BOOKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maintenancemodel.RoomTypeEnum <em>Room Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.RoomTypeEnum
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoomTypeEnum()
	 * @generated
	 */
	int ROOM_TYPE_ENUM = 20;

	/**
	 * The meta object id for the '{@link maintenancemodel.ExperienceStatusEnum <em>Experience Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.ExperienceStatusEnum
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getExperienceStatusEnum()
	 * @generated
	 */
	int EXPERIENCE_STATUS_ENUM = 21;

	/**
	 * The meta object id for the '{@link maintenancemodel.ProductStatusEnum <em>Product Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.ProductStatusEnum
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getProductStatusEnum()
	 * @generated
	 */
	int PRODUCT_STATUS_ENUM = 22;

	/**
	 * The meta object id for the '{@link maintenancemodel.RoomStatusEnum <em>Room Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenancemodel.RoomStatusEnum
	 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoomStatusEnum()
	 * @generated
	 */
	int ROOM_STATUS_ENUM = 23;


	/**
	 * Returns the meta object for class '{@link maintenancemodel.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see maintenancemodel.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.RoomType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see maintenancemodel.RoomType#getPrice()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Price();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.RoomType#getMaxNrOfGuests <em>Max Nr Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Nr Of Guests</em>'.
	 * @see maintenancemodel.RoomType#getMaxNrOfGuests()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_MaxNrOfGuests();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.RoomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see maintenancemodel.RoomType#getDescription()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Description();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.RoomType#getRoomTypeEnum <em>Room Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type Enum</em>'.
	 * @see maintenancemodel.RoomType#getRoomTypeEnum()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_RoomTypeEnum();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.RoomType#getRoomTypeID <em>Room Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type ID</em>'.
	 * @see maintenancemodel.RoomType#getRoomTypeID()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_RoomTypeID();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.Experience <em>Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experience</em>'.
	 * @see maintenancemodel.Experience
	 * @generated
	 */
	EClass getExperience();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.Experience#getNrOfSpots <em>Nr Of Spots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Spots</em>'.
	 * @see maintenancemodel.Experience#getNrOfSpots()
	 * @see #getExperience()
	 * @generated
	 */
	EAttribute getExperience_NrOfSpots();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.Experience#getExperienceStatusEnum <em>Experience Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experience Status Enum</em>'.
	 * @see maintenancemodel.Experience#getExperienceStatusEnum()
	 * @see #getExperience()
	 * @generated
	 */
	EAttribute getExperience_ExperienceStatusEnum();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.Experience#getNrOfSpotsFree <em>Nr Of Spots Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Spots Free</em>'.
	 * @see maintenancemodel.Experience#getNrOfSpotsFree()
	 * @see #getExperience()
	 * @generated
	 */
	EAttribute getExperience_NrOfSpotsFree();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.AbstractExtra <em>Abstract Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Extra</em>'.
	 * @see maintenancemodel.AbstractExtra
	 * @generated
	 */
	EClass getAbstractExtra();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.AbstractExtra#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see maintenancemodel.AbstractExtra#getID()
	 * @see #getAbstractExtra()
	 * @generated
	 */
	EAttribute getAbstractExtra_ID();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.AbstractExtra#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see maintenancemodel.AbstractExtra#getPrice()
	 * @see #getAbstractExtra()
	 * @generated
	 */
	EAttribute getAbstractExtra_Price();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.AbstractExtra#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maintenancemodel.AbstractExtra#getName()
	 * @see #getAbstractExtra()
	 * @generated
	 */
	EAttribute getAbstractExtra_Name();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.AbstractExtra#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see maintenancemodel.AbstractExtra#getDescription()
	 * @see #getAbstractExtra()
	 * @generated
	 */
	EAttribute getAbstractExtra_Description();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.Extra <em>Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra</em>'.
	 * @see maintenancemodel.Extra
	 * @generated
	 */
	EClass getExtra();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.Extra#isAvailable() <em>Is Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Available</em>' operation.
	 * @see maintenancemodel.Extra#isAvailable()
	 * @generated
	 */
	EOperation getExtra__IsAvailable();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see maintenancemodel.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.Product#getStock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stock</em>'.
	 * @see maintenancemodel.Product#getStock()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Stock();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.Product#getProductStatusEnum <em>Product Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Status Enum</em>'.
	 * @see maintenancemodel.Product#getProductStatusEnum()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductStatusEnum();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see maintenancemodel.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.Room#getRoomID <em>Room ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room ID</em>'.
	 * @see maintenancemodel.Room#getRoomID()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomID();

	/**
	 * Returns the meta object for the attribute '{@link maintenancemodel.Room#getRoomStatusEnum <em>Room Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Status Enum</em>'.
	 * @see maintenancemodel.Room#getRoomStatusEnum()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomStatusEnum();

	/**
	 * Returns the meta object for the containment reference '{@link maintenancemodel.Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Room Type</em>'.
	 * @see maintenancemodel.Room#getRoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_RoomType();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.ExtraHandler <em>Extra Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Handler</em>'.
	 * @see maintenancemodel.ExtraHandler
	 * @generated
	 */
	EClass getExtraHandler();

	/**
	 * Returns the meta object for the map '{@link maintenancemodel.ExtraHandler#getIntToExtraMap <em>Int To Extra Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Int To Extra Map</em>'.
	 * @see maintenancemodel.ExtraHandler#getIntToExtraMap()
	 * @see #getExtraHandler()
	 * @generated
	 */
	EReference getExtraHandler_IntToExtraMap();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.ExtraHandler#exists(int) <em>Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exists</em>' operation.
	 * @see maintenancemodel.ExtraHandler#exists(int)
	 * @generated
	 */
	EOperation getExtraHandler__Exists__int();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.ExtraHandler#addExtra(int, int, java.lang.String, java.lang.String, boolean) <em>Add Extra</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Extra</em>' operation.
	 * @see maintenancemodel.ExtraHandler#addExtra(int, int, java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getExtraHandler__AddExtra__int_int_String_String_boolean();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.ExtraHandler#removeExtra(int) <em>Remove Extra</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Extra</em>' operation.
	 * @see maintenancemodel.ExtraHandler#removeExtra(int)
	 * @generated
	 */
	EOperation getExtraHandler__RemoveExtra__int();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.ExtraHandler#getExtras() <em>Get Extras</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Extras</em>' operation.
	 * @see maintenancemodel.ExtraHandler#getExtras()
	 * @generated
	 */
	EOperation getExtraHandler__GetExtras();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.ExtraHandler#getPrice(int) <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see maintenancemodel.ExtraHandler#getPrice(int)
	 * @generated
	 */
	EOperation getExtraHandler__GetPrice__int();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Integer To Extra Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer To Extra Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EIntegerObject" keyRequired="true" keyOrdered="false"
	 *        valueType="maintenancemodel.Extra" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EClass getIntegerToExtraMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntegerToExtraMap()
	 * @generated
	 */
	EAttribute getIntegerToExtraMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntegerToExtraMap()
	 * @generated
	 */
	EReference getIntegerToExtraMap_Value();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.RoomHandler <em>Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Handler</em>'.
	 * @see maintenancemodel.RoomHandler
	 * @generated
	 */
	EClass getRoomHandler();

	/**
	 * Returns the meta object for the map '{@link maintenancemodel.RoomHandler#getIntegerToRoomMap <em>Integer To Room Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Integer To Room Map</em>'.
	 * @see maintenancemodel.RoomHandler#getIntegerToRoomMap()
	 * @see #getRoomHandler()
	 * @generated
	 */
	EReference getRoomHandler_IntegerToRoomMap();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.RoomHandler#exists(int) <em>Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exists</em>' operation.
	 * @see maintenancemodel.RoomHandler#exists(int)
	 * @generated
	 */
	EOperation getRoomHandler__Exists__int();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.RoomHandler#addRoom(int, maintenancemodel.RoomType) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see maintenancemodel.RoomHandler#addRoom(int, maintenancemodel.RoomType)
	 * @generated
	 */
	EOperation getRoomHandler__AddRoom__int_RoomType();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.RoomHandler#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see maintenancemodel.RoomHandler#removeRoom(int)
	 * @generated
	 */
	EOperation getRoomHandler__RemoveRoom__int();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.RoomHandler#getRoom(int) <em>Get Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room</em>' operation.
	 * @see maintenancemodel.RoomHandler#getRoom(int)
	 * @generated
	 */
	EOperation getRoomHandler__GetRoom__int();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Integer To Room Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer To Room Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EIntegerObject" keyRequired="true" keyOrdered="false"
	 *        valueType="maintenancemodel.Room" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EClass getIntegerToRoomMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntegerToRoomMap()
	 * @generated
	 */
	EAttribute getIntegerToRoomMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntegerToRoomMap()
	 * @generated
	 */
	EReference getIntegerToRoomMap_Value();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar</em>'.
	 * @see maintenancemodel.Calendar
	 * @generated
	 */
	EClass getCalendar();

	/**
	 * Returns the meta object for the map '{@link maintenancemodel.Calendar#getStringToListsMap <em>String To Lists Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>String To Lists Map</em>'.
	 * @see maintenancemodel.Calendar#getStringToListsMap()
	 * @see #getCalendar()
	 * @generated
	 */
	EReference getCalendar_StringToListsMap();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.Calendar#getCap(int, int, java.lang.String) <em>Get Cap</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cap</em>' operation.
	 * @see maintenancemodel.Calendar#getCap(int, int, java.lang.String)
	 * @generated
	 */
	EOperation getCalendar__GetCap__int_int_String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.Calendar#setCap(int, int, java.lang.String, int) <em>Set Cap</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Cap</em>' operation.
	 * @see maintenancemodel.Calendar#setCap(int, int, java.lang.String, int)
	 * @generated
	 */
	EOperation getCalendar__SetCap__int_int_String_int();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.RoomTypesHandler <em>Room Types Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Types Handler</em>'.
	 * @see maintenancemodel.RoomTypesHandler
	 * @generated
	 */
	EClass getRoomTypesHandler();

	/**
	 * Returns the meta object for the map '{@link maintenancemodel.RoomTypesHandler#getStringToRoomType <em>String To Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>String To Room Type</em>'.
	 * @see maintenancemodel.RoomTypesHandler#getStringToRoomType()
	 * @see #getRoomTypesHandler()
	 * @generated
	 */
	EReference getRoomTypesHandler_StringToRoomType();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.RoomTypesHandler#exists(java.lang.String) <em>Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exists</em>' operation.
	 * @see maintenancemodel.RoomTypesHandler#exists(java.lang.String)
	 * @generated
	 */
	EOperation getRoomTypesHandler__Exists__String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.RoomTypesHandler#addRoomType(java.lang.String, java.lang.String, int, int, java.lang.String) <em>Add Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type</em>' operation.
	 * @see maintenancemodel.RoomTypesHandler#addRoomType(java.lang.String, java.lang.String, int, int, java.lang.String)
	 * @generated
	 */
	EOperation getRoomTypesHandler__AddRoomType__String_String_int_int_String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.RoomTypesHandler#removeRoomType(java.lang.String) <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see maintenancemodel.RoomTypesHandler#removeRoomType(java.lang.String)
	 * @generated
	 */
	EOperation getRoomTypesHandler__RemoveRoomType__String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.RoomTypesHandler#getPrice(java.lang.String) <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see maintenancemodel.RoomTypesHandler#getPrice(java.lang.String)
	 * @generated
	 */
	EOperation getRoomTypesHandler__GetPrice__String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.RoomTypesHandler#getRoomTypes() <em>Get Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types</em>' operation.
	 * @see maintenancemodel.RoomTypesHandler#getRoomTypes()
	 * @generated
	 */
	EOperation getRoomTypesHandler__GetRoomTypes();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.RoomTypesHandler#getRoomType(java.lang.String) <em>Get Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type</em>' operation.
	 * @see maintenancemodel.RoomTypesHandler#getRoomType(java.lang.String)
	 * @generated
	 */
	EOperation getRoomTypesHandler__GetRoomType__String();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Room Type</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true" keyOrdered="false"
	 *        valueType="maintenancemodel.RoomType" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EClass getStringToRoomType();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToRoomType()
	 * @generated
	 */
	EAttribute getStringToRoomType_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToRoomType()
	 * @generated
	 */
	EReference getStringToRoomType_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Lists Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Lists Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true" keyOrdered="false"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject" valueMany="true" valueOrdered="false"
	 * @generated
	 */
	EClass getStringToListsMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToListsMap()
	 * @generated
	 */
	EAttribute getStringToListsMap_Key();

	/**
	 * Returns the meta object for the attribute list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToListsMap()
	 * @generated
	 */
	EAttribute getStringToListsMap_Value();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.IMaintenanceProvidesForBooking <em>IMaintenance Provides For Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMaintenance Provides For Booking</em>'.
	 * @see maintenancemodel.IMaintenanceProvidesForBooking
	 * @generated
	 */
	EClass getIMaintenanceProvidesForBooking();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IMaintenanceProvidesForBooking#canBook(org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String) <em>Can Book</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Book</em>' operation.
	 * @see maintenancemodel.IMaintenanceProvidesForBooking#canBook(org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIMaintenanceProvidesForBooking__CanBook__EList_String_String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IMaintenanceProvidesForBooking#makeBooking(org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String) <em>Make Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Booking</em>' operation.
	 * @see maintenancemodel.IMaintenanceProvidesForBooking#makeBooking(org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIMaintenanceProvidesForBooking__MakeBooking__EList_String_String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IMaintenanceProvidesForBooking#removeBooking(org.eclipse.emf.common.util.EList, int, java.lang.String, java.lang.String) <em>Remove Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Booking</em>' operation.
	 * @see maintenancemodel.IMaintenanceProvidesForBooking#removeBooking(org.eclipse.emf.common.util.EList, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIMaintenanceProvidesForBooking__RemoveBooking__EList_int_String_String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IMaintenanceProvidesForBooking#getRoomAndSetActive(java.lang.String) <em>Get Room And Set Active</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room And Set Active</em>' operation.
	 * @see maintenancemodel.IMaintenanceProvidesForBooking#getRoomAndSetActive(java.lang.String)
	 * @generated
	 */
	EOperation getIMaintenanceProvidesForBooking__GetRoomAndSetActive__String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IMaintenanceProvidesForBooking#getPriceRoom(org.eclipse.emf.common.util.EList) <em>Get Price Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price Room</em>' operation.
	 * @see maintenancemodel.IMaintenanceProvidesForBooking#getPriceRoom(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getIMaintenanceProvidesForBooking__GetPriceRoom__EList();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IMaintenanceProvidesForBooking#getPriceExtra(org.eclipse.emf.common.util.EList) <em>Get Price Extra</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price Extra</em>' operation.
	 * @see maintenancemodel.IMaintenanceProvidesForBooking#getPriceExtra(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getIMaintenanceProvidesForBooking__GetPriceExtra__EList();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.IRoomMaintenance <em>IRoom Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Maintenance</em>'.
	 * @see maintenancemodel.IRoomMaintenance
	 * @generated
	 */
	EClass getIRoomMaintenance();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#addRoom(int, java.lang.String) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#addRoom(int, java.lang.String)
	 * @generated
	 */
	EOperation getIRoomMaintenance__AddRoom__int_String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#removeRoom(int)
	 * @generated
	 */
	EOperation getIRoomMaintenance__RemoveRoom__int();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#addRoomType(java.lang.String, java.lang.String, int, int, java.lang.String) <em>Add Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#addRoomType(java.lang.String, java.lang.String, int, int, java.lang.String)
	 * @generated
	 */
	EOperation getIRoomMaintenance__AddRoomType__String_String_int_int_String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#removeRoomType(java.lang.String) <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#removeRoomType(java.lang.String)
	 * @generated
	 */
	EOperation getIRoomMaintenance__RemoveRoomType__String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#editRoomStatus(int, java.lang.String) <em>Edit Room Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room Status</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#editRoomStatus(int, java.lang.String)
	 * @generated
	 */
	EOperation getIRoomMaintenance__EditRoomStatus__int_String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#editRoomType(java.lang.String, java.lang.String, int, int, java.lang.String) <em>Edit Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room Type</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#editRoomType(java.lang.String, java.lang.String, int, int, java.lang.String)
	 * @generated
	 */
	EOperation getIRoomMaintenance__EditRoomType__String_String_int_int_String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#editRoom(int, java.lang.String) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#editRoom(int, java.lang.String)
	 * @generated
	 */
	EOperation getIRoomMaintenance__EditRoom__int_String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#getRoomIDs() <em>Get Room IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room IDs</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#getRoomIDs()
	 * @generated
	 */
	EOperation getIRoomMaintenance__GetRoomIDs();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#getRoomTypeIDs() <em>Get Room Type IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type IDs</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#getRoomTypeIDs()
	 * @generated
	 */
	EOperation getIRoomMaintenance__GetRoomTypeIDs();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#getRoomStatus(int) <em>Get Room Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Status</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#getRoomStatus(int)
	 * @generated
	 */
	EOperation getIRoomMaintenance__GetRoomStatus__int();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#getRoomStatuses() <em>Get Room Statuses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Statuses</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#getRoomStatuses()
	 * @generated
	 */
	EOperation getIRoomMaintenance__GetRoomStatuses();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#getRoomTypeEnum(java.lang.String) <em>Get Room Type Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type Enum</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#getRoomTypeEnum(java.lang.String)
	 * @generated
	 */
	EOperation getIRoomMaintenance__GetRoomTypeEnum__String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#getRoomTypePrice(java.lang.String) <em>Get Room Type Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type Price</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#getRoomTypePrice(java.lang.String)
	 * @generated
	 */
	EOperation getIRoomMaintenance__GetRoomTypePrice__String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#getRoomTypeMaxNrOfGuests(java.lang.String) <em>Get Room Type Max Nr Of Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type Max Nr Of Guests</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#getRoomTypeMaxNrOfGuests(java.lang.String)
	 * @generated
	 */
	EOperation getIRoomMaintenance__GetRoomTypeMaxNrOfGuests__String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#getRoomTypeDescription(java.lang.String) <em>Get Room Type Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type Description</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#getRoomTypeDescription(java.lang.String)
	 * @generated
	 */
	EOperation getIRoomMaintenance__GetRoomTypeDescription__String();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#getRoomTypeID(int) <em>Get Room Type ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type ID</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#getRoomTypeID(int)
	 * @generated
	 */
	EOperation getIRoomMaintenance__GetRoomTypeID__int();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IRoomMaintenance#getRoomTypeEnums() <em>Get Room Type Enums</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type Enums</em>' operation.
	 * @see maintenancemodel.IRoomMaintenance#getRoomTypeEnums()
	 * @generated
	 */
	EOperation getIRoomMaintenance__GetRoomTypeEnums();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.IExtrasMaintenance <em>IExtras Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IExtras Maintenance</em>'.
	 * @see maintenancemodel.IExtrasMaintenance
	 * @generated
	 */
	EClass getIExtrasMaintenance();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IExtrasMaintenance#addExtra(int, int, java.lang.String, java.lang.String, boolean) <em>Add Extra</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Extra</em>' operation.
	 * @see maintenancemodel.IExtrasMaintenance#addExtra(int, int, java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getIExtrasMaintenance__AddExtra__int_int_String_String_boolean();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IExtrasMaintenance#removeExtra(int) <em>Remove Extra</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Extra</em>' operation.
	 * @see maintenancemodel.IExtrasMaintenance#removeExtra(int)
	 * @generated
	 */
	EOperation getIExtrasMaintenance__RemoveExtra__int();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IExtrasMaintenance#getExtras() <em>Get Extras</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Extras</em>' operation.
	 * @see maintenancemodel.IExtrasMaintenance#getExtras()
	 * @generated
	 */
	EOperation getIExtrasMaintenance__GetExtras();

	/**
	 * Returns the meta object for the '{@link maintenancemodel.IExtrasMaintenance#editExtra(int, int, java.lang.String, java.lang.String) <em>Edit Extra</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Extra</em>' operation.
	 * @see maintenancemodel.IExtrasMaintenance#editExtra(int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIExtrasMaintenance__EditExtra__int_int_String_String();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.ExtrasMaintenance <em>Extras Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extras Maintenance</em>'.
	 * @see maintenancemodel.ExtrasMaintenance
	 * @generated
	 */
	EClass getExtrasMaintenance();

	/**
	 * Returns the meta object for the containment reference '{@link maintenancemodel.ExtrasMaintenance#getExtras <em>Extras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extras</em>'.
	 * @see maintenancemodel.ExtrasMaintenance#getExtras()
	 * @see #getExtrasMaintenance()
	 * @generated
	 */
	EReference getExtrasMaintenance_Extras();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.RoomMaintenance <em>Room Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Maintenance</em>'.
	 * @see maintenancemodel.RoomMaintenance
	 * @generated
	 */
	EClass getRoomMaintenance();

	/**
	 * Returns the meta object for the containment reference '{@link maintenancemodel.RoomMaintenance#getRoomTypes <em>Room Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Room Types</em>'.
	 * @see maintenancemodel.RoomMaintenance#getRoomTypes()
	 * @see #getRoomMaintenance()
	 * @generated
	 */
	EReference getRoomMaintenance_RoomTypes();

	/**
	 * Returns the meta object for the containment reference '{@link maintenancemodel.RoomMaintenance#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rooms</em>'.
	 * @see maintenancemodel.RoomMaintenance#getRooms()
	 * @see #getRoomMaintenance()
	 * @generated
	 */
	EReference getRoomMaintenance_Rooms();

	/**
	 * Returns the meta object for class '{@link maintenancemodel.MaintenanceProvidesForBooking <em>Maintenance Provides For Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintenance Provides For Booking</em>'.
	 * @see maintenancemodel.MaintenanceProvidesForBooking
	 * @generated
	 */
	EClass getMaintenanceProvidesForBooking();

	/**
	 * Returns the meta object for the containment reference '{@link maintenancemodel.MaintenanceProvidesForBooking#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calendar</em>'.
	 * @see maintenancemodel.MaintenanceProvidesForBooking#getCalendar()
	 * @see #getMaintenanceProvidesForBooking()
	 * @generated
	 */
	EReference getMaintenanceProvidesForBooking_Calendar();

	/**
	 * Returns the meta object for the containment reference '{@link maintenancemodel.MaintenanceProvidesForBooking#getRoomTypes <em>Room Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Room Types</em>'.
	 * @see maintenancemodel.MaintenanceProvidesForBooking#getRoomTypes()
	 * @see #getMaintenanceProvidesForBooking()
	 * @generated
	 */
	EReference getMaintenanceProvidesForBooking_RoomTypes();

	/**
	 * Returns the meta object for the containment reference '{@link maintenancemodel.MaintenanceProvidesForBooking#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rooms</em>'.
	 * @see maintenancemodel.MaintenanceProvidesForBooking#getRooms()
	 * @see #getMaintenanceProvidesForBooking()
	 * @generated
	 */
	EReference getMaintenanceProvidesForBooking_Rooms();

	/**
	 * Returns the meta object for the containment reference '{@link maintenancemodel.MaintenanceProvidesForBooking#getExtraHandler <em>Extra Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extra Handler</em>'.
	 * @see maintenancemodel.MaintenanceProvidesForBooking#getExtraHandler()
	 * @see #getMaintenanceProvidesForBooking()
	 * @generated
	 */
	EReference getMaintenanceProvidesForBooking_ExtraHandler();

	/**
	 * Returns the meta object for enum '{@link maintenancemodel.RoomTypeEnum <em>Room Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Type Enum</em>'.
	 * @see maintenancemodel.RoomTypeEnum
	 * @generated
	 */
	EEnum getRoomTypeEnum();

	/**
	 * Returns the meta object for enum '{@link maintenancemodel.ExperienceStatusEnum <em>Experience Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Experience Status Enum</em>'.
	 * @see maintenancemodel.ExperienceStatusEnum
	 * @generated
	 */
	EEnum getExperienceStatusEnum();

	/**
	 * Returns the meta object for enum '{@link maintenancemodel.ProductStatusEnum <em>Product Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Product Status Enum</em>'.
	 * @see maintenancemodel.ProductStatusEnum
	 * @generated
	 */
	EEnum getProductStatusEnum();

	/**
	 * Returns the meta object for enum '{@link maintenancemodel.RoomStatusEnum <em>Room Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Status Enum</em>'.
	 * @see maintenancemodel.RoomStatusEnum
	 * @generated
	 */
	EEnum getRoomStatusEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MaintenancemodelFactory getMaintenancemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.RoomTypeImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__PRICE = eINSTANCE.getRoomType_Price();

		/**
		 * The meta object literal for the '<em><b>Max Nr Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__MAX_NR_OF_GUESTS = eINSTANCE.getRoomType_MaxNrOfGuests();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__DESCRIPTION = eINSTANCE.getRoomType_Description();

		/**
		 * The meta object literal for the '<em><b>Room Type Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__ROOM_TYPE_ENUM = eINSTANCE.getRoomType_RoomTypeEnum();

		/**
		 * The meta object literal for the '<em><b>Room Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__ROOM_TYPE_ID = eINSTANCE.getRoomType_RoomTypeID();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.ExperienceImpl <em>Experience</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.ExperienceImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getExperience()
		 * @generated
		 */
		EClass EXPERIENCE = eINSTANCE.getExperience();

		/**
		 * The meta object literal for the '<em><b>Nr Of Spots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENCE__NR_OF_SPOTS = eINSTANCE.getExperience_NrOfSpots();

		/**
		 * The meta object literal for the '<em><b>Experience Status Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENCE__EXPERIENCE_STATUS_ENUM = eINSTANCE.getExperience_ExperienceStatusEnum();

		/**
		 * The meta object literal for the '<em><b>Nr Of Spots Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENCE__NR_OF_SPOTS_FREE = eINSTANCE.getExperience_NrOfSpotsFree();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.AbstractExtraImpl <em>Abstract Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.AbstractExtraImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getAbstractExtra()
		 * @generated
		 */
		EClass ABSTRACT_EXTRA = eINSTANCE.getAbstractExtra();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EXTRA__ID = eINSTANCE.getAbstractExtra_ID();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EXTRA__PRICE = eINSTANCE.getAbstractExtra_Price();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EXTRA__NAME = eINSTANCE.getAbstractExtra_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EXTRA__DESCRIPTION = eINSTANCE.getAbstractExtra_Description();

		/**
		 * The meta object literal for the '{@link maintenancemodel.Extra <em>Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.Extra
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getExtra()
		 * @generated
		 */
		EClass EXTRA = eINSTANCE.getExtra();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRA___IS_AVAILABLE = eINSTANCE.getExtra__IsAvailable();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.ProductImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__STOCK = eINSTANCE.getProduct_Stock();

		/**
		 * The meta object literal for the '<em><b>Product Status Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_STATUS_ENUM = eINSTANCE.getProduct_ProductStatusEnum();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.RoomImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Room ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_ID = eINSTANCE.getRoom_RoomID();

		/**
		 * The meta object literal for the '<em><b>Room Status Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_STATUS_ENUM = eINSTANCE.getRoom_RoomStatusEnum();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOM_TYPE = eINSTANCE.getRoom_RoomType();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.ExtraHandlerImpl <em>Extra Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.ExtraHandlerImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getExtraHandler()
		 * @generated
		 */
		EClass EXTRA_HANDLER = eINSTANCE.getExtraHandler();

		/**
		 * The meta object literal for the '<em><b>Int To Extra Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRA_HANDLER__INT_TO_EXTRA_MAP = eINSTANCE.getExtraHandler_IntToExtraMap();

		/**
		 * The meta object literal for the '<em><b>Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRA_HANDLER___EXISTS__INT = eINSTANCE.getExtraHandler__Exists__int();

		/**
		 * The meta object literal for the '<em><b>Add Extra</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRA_HANDLER___ADD_EXTRA__INT_INT_STRING_STRING_BOOLEAN = eINSTANCE.getExtraHandler__AddExtra__int_int_String_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Remove Extra</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRA_HANDLER___REMOVE_EXTRA__INT = eINSTANCE.getExtraHandler__RemoveExtra__int();

		/**
		 * The meta object literal for the '<em><b>Get Extras</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRA_HANDLER___GET_EXTRAS = eINSTANCE.getExtraHandler__GetExtras();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRA_HANDLER___GET_PRICE__INT = eINSTANCE.getExtraHandler__GetPrice__int();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.IntegerToExtraMapImpl <em>Integer To Extra Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.IntegerToExtraMapImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getIntegerToExtraMap()
		 * @generated
		 */
		EClass INTEGER_TO_EXTRA_MAP = eINSTANCE.getIntegerToExtraMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TO_EXTRA_MAP__KEY = eINSTANCE.getIntegerToExtraMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_TO_EXTRA_MAP__VALUE = eINSTANCE.getIntegerToExtraMap_Value();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.RoomHandlerImpl <em>Room Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.RoomHandlerImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoomHandler()
		 * @generated
		 */
		EClass ROOM_HANDLER = eINSTANCE.getRoomHandler();

		/**
		 * The meta object literal for the '<em><b>Integer To Room Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_HANDLER__INTEGER_TO_ROOM_MAP = eINSTANCE.getRoomHandler_IntegerToRoomMap();

		/**
		 * The meta object literal for the '<em><b>Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLER___EXISTS__INT = eINSTANCE.getRoomHandler__Exists__int();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLER___ADD_ROOM__INT_ROOMTYPE = eINSTANCE.getRoomHandler__AddRoom__int_RoomType();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLER___REMOVE_ROOM__INT = eINSTANCE.getRoomHandler__RemoveRoom__int();

		/**
		 * The meta object literal for the '<em><b>Get Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLER___GET_ROOM__INT = eINSTANCE.getRoomHandler__GetRoom__int();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.IntegerToRoomMapImpl <em>Integer To Room Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.IntegerToRoomMapImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getIntegerToRoomMap()
		 * @generated
		 */
		EClass INTEGER_TO_ROOM_MAP = eINSTANCE.getIntegerToRoomMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TO_ROOM_MAP__KEY = eINSTANCE.getIntegerToRoomMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_TO_ROOM_MAP__VALUE = eINSTANCE.getIntegerToRoomMap_Value();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.CalendarImpl <em>Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.CalendarImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getCalendar()
		 * @generated
		 */
		EClass CALENDAR = eINSTANCE.getCalendar();

		/**
		 * The meta object literal for the '<em><b>String To Lists Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDAR__STRING_TO_LISTS_MAP = eINSTANCE.getCalendar_StringToListsMap();

		/**
		 * The meta object literal for the '<em><b>Get Cap</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALENDAR___GET_CAP__INT_INT_STRING = eINSTANCE.getCalendar__GetCap__int_int_String();

		/**
		 * The meta object literal for the '<em><b>Set Cap</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALENDAR___SET_CAP__INT_INT_STRING_INT = eINSTANCE.getCalendar__SetCap__int_int_String_int();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.RoomTypesHandlerImpl <em>Room Types Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.RoomTypesHandlerImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoomTypesHandler()
		 * @generated
		 */
		EClass ROOM_TYPES_HANDLER = eINSTANCE.getRoomTypesHandler();

		/**
		 * The meta object literal for the '<em><b>String To Room Type</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPES_HANDLER__STRING_TO_ROOM_TYPE = eINSTANCE.getRoomTypesHandler_StringToRoomType();

		/**
		 * The meta object literal for the '<em><b>Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPES_HANDLER___EXISTS__STRING = eINSTANCE.getRoomTypesHandler__Exists__String();

		/**
		 * The meta object literal for the '<em><b>Add Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPES_HANDLER___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING = eINSTANCE.getRoomTypesHandler__AddRoomType__String_String_int_int_String();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPES_HANDLER___REMOVE_ROOM_TYPE__STRING = eINSTANCE.getRoomTypesHandler__RemoveRoomType__String();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPES_HANDLER___GET_PRICE__STRING = eINSTANCE.getRoomTypesHandler__GetPrice__String();

		/**
		 * The meta object literal for the '<em><b>Get Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPES_HANDLER___GET_ROOM_TYPES = eINSTANCE.getRoomTypesHandler__GetRoomTypes();

		/**
		 * The meta object literal for the '<em><b>Get Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPES_HANDLER___GET_ROOM_TYPE__STRING = eINSTANCE.getRoomTypesHandler__GetRoomType__String();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.StringToRoomTypeImpl <em>String To Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.StringToRoomTypeImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getStringToRoomType()
		 * @generated
		 */
		EClass STRING_TO_ROOM_TYPE = eINSTANCE.getStringToRoomType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_ROOM_TYPE__KEY = eINSTANCE.getStringToRoomType_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_ROOM_TYPE__VALUE = eINSTANCE.getStringToRoomType_Value();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.StringToListsMapImpl <em>String To Lists Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.StringToListsMapImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getStringToListsMap()
		 * @generated
		 */
		EClass STRING_TO_LISTS_MAP = eINSTANCE.getStringToListsMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_LISTS_MAP__KEY = eINSTANCE.getStringToListsMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_LISTS_MAP__VALUE = eINSTANCE.getStringToListsMap_Value();

		/**
		 * The meta object literal for the '{@link maintenancemodel.IMaintenanceProvidesForBooking <em>IMaintenance Provides For Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.IMaintenanceProvidesForBooking
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getIMaintenanceProvidesForBooking()
		 * @generated
		 */
		EClass IMAINTENANCE_PROVIDES_FOR_BOOKING = eINSTANCE.getIMaintenanceProvidesForBooking();

		/**
		 * The meta object literal for the '<em><b>Can Book</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAINTENANCE_PROVIDES_FOR_BOOKING___CAN_BOOK__ELIST_STRING_STRING = eINSTANCE.getIMaintenanceProvidesForBooking__CanBook__EList_String_String();

		/**
		 * The meta object literal for the '<em><b>Make Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAINTENANCE_PROVIDES_FOR_BOOKING___MAKE_BOOKING__ELIST_STRING_STRING = eINSTANCE.getIMaintenanceProvidesForBooking__MakeBooking__EList_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAINTENANCE_PROVIDES_FOR_BOOKING___REMOVE_BOOKING__ELIST_INT_STRING_STRING = eINSTANCE.getIMaintenanceProvidesForBooking__RemoveBooking__EList_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Room And Set Active</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAINTENANCE_PROVIDES_FOR_BOOKING___GET_ROOM_AND_SET_ACTIVE__STRING = eINSTANCE.getIMaintenanceProvidesForBooking__GetRoomAndSetActive__String();

		/**
		 * The meta object literal for the '<em><b>Get Price Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_ROOM__ELIST = eINSTANCE.getIMaintenanceProvidesForBooking__GetPriceRoom__EList();

		/**
		 * The meta object literal for the '<em><b>Get Price Extra</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAINTENANCE_PROVIDES_FOR_BOOKING___GET_PRICE_EXTRA__ELIST = eINSTANCE.getIMaintenanceProvidesForBooking__GetPriceExtra__EList();

		/**
		 * The meta object literal for the '{@link maintenancemodel.IRoomMaintenance <em>IRoom Maintenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.IRoomMaintenance
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getIRoomMaintenance()
		 * @generated
		 */
		EClass IROOM_MAINTENANCE = eINSTANCE.getIRoomMaintenance();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___ADD_ROOM__INT_STRING = eINSTANCE.getIRoomMaintenance__AddRoom__int_String();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___REMOVE_ROOM__INT = eINSTANCE.getIRoomMaintenance__RemoveRoom__int();

		/**
		 * The meta object literal for the '<em><b>Add Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___ADD_ROOM_TYPE__STRING_STRING_INT_INT_STRING = eINSTANCE.getIRoomMaintenance__AddRoomType__String_String_int_int_String();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___REMOVE_ROOM_TYPE__STRING = eINSTANCE.getIRoomMaintenance__RemoveRoomType__String();

		/**
		 * The meta object literal for the '<em><b>Edit Room Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___EDIT_ROOM_STATUS__INT_STRING = eINSTANCE.getIRoomMaintenance__EditRoomStatus__int_String();

		/**
		 * The meta object literal for the '<em><b>Edit Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___EDIT_ROOM_TYPE__STRING_STRING_INT_INT_STRING = eINSTANCE.getIRoomMaintenance__EditRoomType__String_String_int_int_String();

		/**
		 * The meta object literal for the '<em><b>Edit Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___EDIT_ROOM__INT_STRING = eINSTANCE.getIRoomMaintenance__EditRoom__int_String();

		/**
		 * The meta object literal for the '<em><b>Get Room IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___GET_ROOM_IDS = eINSTANCE.getIRoomMaintenance__GetRoomIDs();

		/**
		 * The meta object literal for the '<em><b>Get Room Type IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___GET_ROOM_TYPE_IDS = eINSTANCE.getIRoomMaintenance__GetRoomTypeIDs();

		/**
		 * The meta object literal for the '<em><b>Get Room Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___GET_ROOM_STATUS__INT = eINSTANCE.getIRoomMaintenance__GetRoomStatus__int();

		/**
		 * The meta object literal for the '<em><b>Get Room Statuses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___GET_ROOM_STATUSES = eINSTANCE.getIRoomMaintenance__GetRoomStatuses();

		/**
		 * The meta object literal for the '<em><b>Get Room Type Enum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___GET_ROOM_TYPE_ENUM__STRING = eINSTANCE.getIRoomMaintenance__GetRoomTypeEnum__String();

		/**
		 * The meta object literal for the '<em><b>Get Room Type Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___GET_ROOM_TYPE_PRICE__STRING = eINSTANCE.getIRoomMaintenance__GetRoomTypePrice__String();

		/**
		 * The meta object literal for the '<em><b>Get Room Type Max Nr Of Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___GET_ROOM_TYPE_MAX_NR_OF_GUESTS__STRING = eINSTANCE.getIRoomMaintenance__GetRoomTypeMaxNrOfGuests__String();

		/**
		 * The meta object literal for the '<em><b>Get Room Type Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___GET_ROOM_TYPE_DESCRIPTION__STRING = eINSTANCE.getIRoomMaintenance__GetRoomTypeDescription__String();

		/**
		 * The meta object literal for the '<em><b>Get Room Type ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___GET_ROOM_TYPE_ID__INT = eINSTANCE.getIRoomMaintenance__GetRoomTypeID__int();

		/**
		 * The meta object literal for the '<em><b>Get Room Type Enums</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MAINTENANCE___GET_ROOM_TYPE_ENUMS = eINSTANCE.getIRoomMaintenance__GetRoomTypeEnums();

		/**
		 * The meta object literal for the '{@link maintenancemodel.IExtrasMaintenance <em>IExtras Maintenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.IExtrasMaintenance
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getIExtrasMaintenance()
		 * @generated
		 */
		EClass IEXTRAS_MAINTENANCE = eINSTANCE.getIExtrasMaintenance();

		/**
		 * The meta object literal for the '<em><b>Add Extra</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IEXTRAS_MAINTENANCE___ADD_EXTRA__INT_INT_STRING_STRING_BOOLEAN = eINSTANCE.getIExtrasMaintenance__AddExtra__int_int_String_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Remove Extra</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IEXTRAS_MAINTENANCE___REMOVE_EXTRA__INT = eINSTANCE.getIExtrasMaintenance__RemoveExtra__int();

		/**
		 * The meta object literal for the '<em><b>Get Extras</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IEXTRAS_MAINTENANCE___GET_EXTRAS = eINSTANCE.getIExtrasMaintenance__GetExtras();

		/**
		 * The meta object literal for the '<em><b>Edit Extra</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IEXTRAS_MAINTENANCE___EDIT_EXTRA__INT_INT_STRING_STRING = eINSTANCE.getIExtrasMaintenance__EditExtra__int_int_String_String();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.ExtrasMaintenanceImpl <em>Extras Maintenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.ExtrasMaintenanceImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getExtrasMaintenance()
		 * @generated
		 */
		EClass EXTRAS_MAINTENANCE = eINSTANCE.getExtrasMaintenance();

		/**
		 * The meta object literal for the '<em><b>Extras</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRAS_MAINTENANCE__EXTRAS = eINSTANCE.getExtrasMaintenance_Extras();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.RoomMaintenanceImpl <em>Room Maintenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.RoomMaintenanceImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoomMaintenance()
		 * @generated
		 */
		EClass ROOM_MAINTENANCE = eINSTANCE.getRoomMaintenance();

		/**
		 * The meta object literal for the '<em><b>Room Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MAINTENANCE__ROOM_TYPES = eINSTANCE.getRoomMaintenance_RoomTypes();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MAINTENANCE__ROOMS = eINSTANCE.getRoomMaintenance_Rooms();

		/**
		 * The meta object literal for the '{@link maintenancemodel.impl.MaintenanceProvidesForBookingImpl <em>Maintenance Provides For Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.impl.MaintenanceProvidesForBookingImpl
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getMaintenanceProvidesForBooking()
		 * @generated
		 */
		EClass MAINTENANCE_PROVIDES_FOR_BOOKING = eINSTANCE.getMaintenanceProvidesForBooking();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENANCE_PROVIDES_FOR_BOOKING__CALENDAR = eINSTANCE.getMaintenanceProvidesForBooking_Calendar();

		/**
		 * The meta object literal for the '<em><b>Room Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENANCE_PROVIDES_FOR_BOOKING__ROOM_TYPES = eINSTANCE.getMaintenanceProvidesForBooking_RoomTypes();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENANCE_PROVIDES_FOR_BOOKING__ROOMS = eINSTANCE.getMaintenanceProvidesForBooking_Rooms();

		/**
		 * The meta object literal for the '<em><b>Extra Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENANCE_PROVIDES_FOR_BOOKING__EXTRA_HANDLER = eINSTANCE.getMaintenanceProvidesForBooking_ExtraHandler();

		/**
		 * The meta object literal for the '{@link maintenancemodel.RoomTypeEnum <em>Room Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.RoomTypeEnum
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoomTypeEnum()
		 * @generated
		 */
		EEnum ROOM_TYPE_ENUM = eINSTANCE.getRoomTypeEnum();

		/**
		 * The meta object literal for the '{@link maintenancemodel.ExperienceStatusEnum <em>Experience Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.ExperienceStatusEnum
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getExperienceStatusEnum()
		 * @generated
		 */
		EEnum EXPERIENCE_STATUS_ENUM = eINSTANCE.getExperienceStatusEnum();

		/**
		 * The meta object literal for the '{@link maintenancemodel.ProductStatusEnum <em>Product Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.ProductStatusEnum
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getProductStatusEnum()
		 * @generated
		 */
		EEnum PRODUCT_STATUS_ENUM = eINSTANCE.getProductStatusEnum();

		/**
		 * The meta object literal for the '{@link maintenancemodel.RoomStatusEnum <em>Room Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenancemodel.RoomStatusEnum
		 * @see maintenancemodel.impl.MaintenancemodelPackageImpl#getRoomStatusEnum()
		 * @generated
		 */
		EEnum ROOM_STATUS_ENUM = eINSTANCE.getRoomStatusEnum();

	}

} //MaintenancemodelPackage
