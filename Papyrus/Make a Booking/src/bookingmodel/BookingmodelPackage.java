/**
 */
package bookingmodel;

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
 * @see bookingmodel.BookingmodelFactory
 * @model kind="package"
 * @generated
 */
public interface BookingmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bookingmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///bookingmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bookingmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookingmodelPackage eINSTANCE = bookingmodel.impl.BookingmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link bookingmodel.impl.RoomtypeToGuestIDEntryImpl <em>Roomtype To Guest ID Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.impl.RoomtypeToGuestIDEntryImpl
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getRoomtypeToGuestIDEntry()
	 * @generated
	 */
	int ROOMTYPE_TO_GUEST_ID_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMTYPE_TO_GUEST_ID_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMTYPE_TO_GUEST_ID_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Roomtype To Guest ID Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMTYPE_TO_GUEST_ID_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Roomtype To Guest ID Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMTYPE_TO_GUEST_ID_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bookingmodel.impl.NrToRoomEntryImpl <em>Nr To Room Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.impl.NrToRoomEntryImpl
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getNrToRoomEntry()
	 * @generated
	 */
	int NR_TO_ROOM_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NR_TO_ROOM_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NR_TO_ROOM_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Nr To Room Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NR_TO_ROOM_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nr To Room Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NR_TO_ROOM_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bookingmodel.impl.BookingRefToBookingEntryImpl <em>Booking Ref To Booking Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.impl.BookingRefToBookingEntryImpl
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getBookingRefToBookingEntry()
	 * @generated
	 */
	int BOOKING_REF_TO_BOOKING_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_REF_TO_BOOKING_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_REF_TO_BOOKING_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Booking Ref To Booking Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_REF_TO_BOOKING_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Booking Ref To Booking Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_REF_TO_BOOKING_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bookingmodel.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.impl.BookingImpl
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 3;

	/**
	 * The feature id for the '<em><b>Booking Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_REF = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__DATE = 1;

	/**
	 * The feature id for the '<em><b>Nr Of Nights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__NR_OF_NIGHTS = 2;

	/**
	 * The feature id for the '<em><b>Service Notes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__SERVICE_NOTES = 3;

	/**
	 * The feature id for the '<em><b>Nr Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__NR_OF_GUESTS = 4;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CUSTOMER = 5;

	/**
	 * The feature id for the '<em><b>Guest List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__GUEST_LIST = 6;

	/**
	 * The feature id for the '<em><b>Is Payed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__IS_PAYED = 7;

	/**
	 * The feature id for the '<em><b>Room Guest Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_GUEST_MAP = 8;

	/**
	 * The feature id for the '<em><b>Room Type Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_TYPE_MAP = 9;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PAYMENT_METHOD = 10;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Checked In All Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECKED_IN_ALL_GUEST = 0;

	/**
	 * The operation id for the '<em>Checked In AGuest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECKED_IN_AGUEST = 1;

	/**
	 * The operation id for the '<em>Set Responsible Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___SET_RESPONSIBLE_GUEST__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Get Nr Of Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GET_NR_OF_ROOMS = 3;

	/**
	 * The operation id for the '<em>Set Extras</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___SET_EXTRAS__ELIST = 4;

	/**
	 * The operation id for the '<em>Set Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___SET_ROOM_TYPES__ELIST = 5;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link bookingmodel.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.impl.PersonImpl
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 8;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Telephone Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TELEPHONE_NR = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESS = 4;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bookingmodel.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.impl.CustomerImpl
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 4;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = PERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Telephone Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__TELEPHONE_NR = PERSON__TELEPHONE_NR;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = PERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>Payment Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PAYMENT_DETAILS = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bookingmodel.impl.PaymentDetailsImpl <em>Payment Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.impl.PaymentDetailsImpl
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getPaymentDetails()
	 * @generated
	 */
	int PAYMENT_DETAILS = 5;

	/**
	 * The feature id for the '<em><b>Cc Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__CC_NR = 0;

	/**
	 * The feature id for the '<em><b>Cc V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__CC_V = 1;

	/**
	 * The feature id for the '<em><b>Exp Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__EXP_MONTH = 2;

	/**
	 * The feature id for the '<em><b>Exp Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__EXP_YEAR = 3;

	/**
	 * The number of structural features of the '<em>Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bookingmodel.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.impl.GuestImpl
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 6;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__EMAIL = PERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Telephone Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__TELEPHONE_NR = PERSON__TELEPHONE_NR;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__ADDRESS = PERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>Room Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__ROOM_NR = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guest Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__GUEST_TYPES = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bookingmodel.impl.ExtraToIsPayedEntryImpl <em>Extra To Is Payed Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.impl.ExtraToIsPayedEntryImpl
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getExtraToIsPayedEntry()
	 * @generated
	 */
	int EXTRA_TO_IS_PAYED_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_TO_IS_PAYED_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_TO_IS_PAYED_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Extra To Is Payed Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_TO_IS_PAYED_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Extra To Is Payed Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_TO_IS_PAYED_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bookingmodel.impl.BookingHandlerImpl <em>Booking Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.impl.BookingHandlerImpl
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getBookingHandler()
	 * @generated
	 */
	int BOOKING_HANDLER = 9;

	/**
	 * The feature id for the '<em><b>Bookings Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER__BOOKINGS_MAP = 0;

	/**
	 * The number of structural features of the '<em>Booking Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___EXISTS__STRING = 0;

	/**
	 * The operation id for the '<em>Add Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___ADD_BOOKING__BOOKING = 1;

	/**
	 * The operation id for the '<em>Remove Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___REMOVE_BOOKING__STRING = 2;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___GET_BOOKING__STRING = 3;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER___EDIT_BOOKING__STRING_STRING_STRING_INT_STRING_STRING = 4;

	/**
	 * The number of operations of the '<em>Booking Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_HANDLER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link bookingmodel.IBookingProvidesForHost <em>IBooking Provides For Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.IBookingProvidesForHost
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getIBookingProvidesForHost()
	 * @generated
	 */
	int IBOOKING_PROVIDES_FOR_HOST = 10;

	/**
	 * The number of structural features of the '<em>IBooking Provides For Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_HOST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Enable Self Management</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_HOST___ENABLE_SELF_MANAGEMENT = 0;

	/**
	 * The operation id for the '<em>Add Service Note</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_HOST___ADD_SERVICE_NOTE__STRING = 1;

	/**
	 * The operation id for the '<em>Edit Service Note</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_HOST___EDIT_SERVICE_NOTE__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Remove Service Note</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_HOST___REMOVE_SERVICE_NOTE__STRING = 3;

	/**
	 * The operation id for the '<em>Get Service Notes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_HOST___GET_SERVICE_NOTES__STRING = 4;

	/**
	 * The number of operations of the '<em>IBooking Provides For Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_HOST_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link bookingmodel.IBookingProvidesForCustomer <em>IBooking Provides For Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.IBookingProvidesForCustomer
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getIBookingProvidesForCustomer()
	 * @generated
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER = 11;

	/**
	 * The number of structural features of the '<em>IBooking Provides For Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER___GET_BOOKING__STRING = 0;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER___PAY__STRING = 1;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER___GET_PRICE__STRING = 2;

	/**
	 * The operation id for the '<em>Remove Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER___REMOVE_BOOKING__STRING = 3;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER___EDIT_BOOKING__STRING_STRING_STRING_INT_STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Choose Payment Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER___CHOOSE_PAYMENT_METHOD__STRING = 5;

	/**
	 * The operation id for the '<em>Set Payment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER___SET_PAYMENT_DETAILS__STRING_STRING_INT_INT_STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Set Personal Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER___SET_PERSONAL_DETAILS__STRING_STRING_INT_STRING = 7;

	/**
	 * The operation id for the '<em>Set Customer To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER___SET_CUSTOMER_TO_BOOKING__STRING_STRING = 8;

	/**
	 * The operation id for the '<em>Book</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER___BOOK__STRING_STRING_INT_STRING_STRING = 9;

	/**
	 * The number of operations of the '<em>IBooking Provides For Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_CUSTOMER_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link bookingmodel.IBookingProvidesForGuest <em>IBooking Provides For Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.IBookingProvidesForGuest
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getIBookingProvidesForGuest()
	 * @generated
	 */
	int IBOOKING_PROVIDES_FOR_GUEST = 12;

	/**
	 * The number of structural features of the '<em>IBooking Provides For Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_GUEST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_GUEST___CHECK_IN__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_GUEST___CHECK_OUT__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_GUEST___PAY__STRING_STRING_INT_INT_STRING_STRING = 2;

	/**
	 * The number of operations of the '<em>IBooking Provides For Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_PROVIDES_FOR_GUEST_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link bookingmodel.impl.BookingProvidesImpl <em>Booking Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.impl.BookingProvidesImpl
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getBookingProvides()
	 * @generated
	 */
	int BOOKING_PROVIDES = 13;

	/**
	 * The feature id for the '<em><b>Booking Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES__BOOKING_HANDLER = IBOOKING_PROVIDES_FOR_CUSTOMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booking Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES_FEATURE_COUNT = IBOOKING_PROVIDES_FOR_CUSTOMER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___GET_BOOKING__STRING = IBOOKING_PROVIDES_FOR_CUSTOMER___GET_BOOKING__STRING;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___PAY__STRING = IBOOKING_PROVIDES_FOR_CUSTOMER___PAY__STRING;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___GET_PRICE__STRING = IBOOKING_PROVIDES_FOR_CUSTOMER___GET_PRICE__STRING;

	/**
	 * The operation id for the '<em>Remove Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___REMOVE_BOOKING__STRING = IBOOKING_PROVIDES_FOR_CUSTOMER___REMOVE_BOOKING__STRING;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___EDIT_BOOKING__STRING_STRING_STRING_INT_STRING_STRING = IBOOKING_PROVIDES_FOR_CUSTOMER___EDIT_BOOKING__STRING_STRING_STRING_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Choose Payment Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___CHOOSE_PAYMENT_METHOD__STRING = IBOOKING_PROVIDES_FOR_CUSTOMER___CHOOSE_PAYMENT_METHOD__STRING;

	/**
	 * The operation id for the '<em>Set Payment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___SET_PAYMENT_DETAILS__STRING_STRING_INT_INT_STRING_STRING = IBOOKING_PROVIDES_FOR_CUSTOMER___SET_PAYMENT_DETAILS__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Set Personal Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___SET_PERSONAL_DETAILS__STRING_STRING_INT_STRING = IBOOKING_PROVIDES_FOR_CUSTOMER___SET_PERSONAL_DETAILS__STRING_STRING_INT_STRING;

	/**
	 * The operation id for the '<em>Set Customer To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___SET_CUSTOMER_TO_BOOKING__STRING_STRING = IBOOKING_PROVIDES_FOR_CUSTOMER___SET_CUSTOMER_TO_BOOKING__STRING_STRING;

	/**
	 * The operation id for the '<em>Book</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___BOOK__STRING_STRING_INT_STRING_STRING = IBOOKING_PROVIDES_FOR_CUSTOMER___BOOK__STRING_STRING_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___CHECK_IN__STRING_STRING = IBOOKING_PROVIDES_FOR_CUSTOMER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___CHECK_OUT__STRING_STRING = IBOOKING_PROVIDES_FOR_CUSTOMER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___PAY__STRING_STRING_INT_INT_STRING_STRING = IBOOKING_PROVIDES_FOR_CUSTOMER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Enable Self Management</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___ENABLE_SELF_MANAGEMENT = IBOOKING_PROVIDES_FOR_CUSTOMER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Service Note</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___ADD_SERVICE_NOTE__STRING = IBOOKING_PROVIDES_FOR_CUSTOMER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Edit Service Note</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___EDIT_SERVICE_NOTE__STRING_STRING = IBOOKING_PROVIDES_FOR_CUSTOMER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Remove Service Note</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___REMOVE_SERVICE_NOTE__STRING = IBOOKING_PROVIDES_FOR_CUSTOMER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Service Notes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___GET_SERVICE_NOTES__STRING = IBOOKING_PROVIDES_FOR_CUSTOMER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>String To List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES___STRING_TO_LIST__STRING = IBOOKING_PROVIDES_FOR_CUSTOMER_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Booking Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PROVIDES_OPERATION_COUNT = IBOOKING_PROVIDES_FOR_CUSTOMER_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link bookingmodel.GuestTypes <em>Guest Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.GuestTypes
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getGuestTypes()
	 * @generated
	 */
	int GUEST_TYPES = 14;

	/**
	 * The meta object id for the '{@link bookingmodel.PaymentMethod <em>Payment Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookingmodel.PaymentMethod
	 * @see bookingmodel.impl.BookingmodelPackageImpl#getPaymentMethod()
	 * @generated
	 */
	int PAYMENT_METHOD = 15;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Roomtype To Guest ID Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roomtype To Guest ID Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true" keyOrdered="false"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EClass getRoomtypeToGuestIDEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getRoomtypeToGuestIDEntry()
	 * @generated
	 */
	EAttribute getRoomtypeToGuestIDEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getRoomtypeToGuestIDEntry()
	 * @generated
	 */
	EAttribute getRoomtypeToGuestIDEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Nr To Room Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nr To Room Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true" keyOrdered="false"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EClass getNrToRoomEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getNrToRoomEntry()
	 * @generated
	 */
	EAttribute getNrToRoomEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getNrToRoomEntry()
	 * @generated
	 */
	EAttribute getNrToRoomEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Booking Ref To Booking Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Ref To Booking Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true" keyOrdered="false"
	 *        valueType="bookingmodel.Booking" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EClass getBookingRefToBookingEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getBookingRefToBookingEntry()
	 * @generated
	 */
	EAttribute getBookingRefToBookingEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getBookingRefToBookingEntry()
	 * @generated
	 */
	EReference getBookingRefToBookingEntry_Value();

	/**
	 * Returns the meta object for class '{@link bookingmodel.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see bookingmodel.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Booking#getBookingRef <em>Booking Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Ref</em>'.
	 * @see bookingmodel.Booking#getBookingRef()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingRef();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Booking#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see bookingmodel.Booking#getDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Date();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Booking#getNrOfNights <em>Nr Of Nights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Nights</em>'.
	 * @see bookingmodel.Booking#getNrOfNights()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_NrOfNights();

	/**
	 * Returns the meta object for the attribute list '{@link bookingmodel.Booking#getServiceNotes <em>Service Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Notes</em>'.
	 * @see bookingmodel.Booking#getServiceNotes()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_ServiceNotes();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Booking#getNrOfGuests <em>Nr Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Guests</em>'.
	 * @see bookingmodel.Booking#getNrOfGuests()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_NrOfGuests();

	/**
	 * Returns the meta object for the reference '{@link bookingmodel.Booking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see bookingmodel.Booking#getCustomer()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Customer();

	/**
	 * Returns the meta object for the reference list '{@link bookingmodel.Booking#getGuestList <em>Guest List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guest List</em>'.
	 * @see bookingmodel.Booking#getGuestList()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_GuestList();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Booking#isIsPayed <em>Is Payed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Payed</em>'.
	 * @see bookingmodel.Booking#isIsPayed()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_IsPayed();

	/**
	 * Returns the meta object for the map '{@link bookingmodel.Booking#getRoomGuestMap <em>Room Guest Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Room Guest Map</em>'.
	 * @see bookingmodel.Booking#getRoomGuestMap()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RoomGuestMap();

	/**
	 * Returns the meta object for the map '{@link bookingmodel.Booking#getRoomTypeMap <em>Room Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Room Type Map</em>'.
	 * @see bookingmodel.Booking#getRoomTypeMap()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RoomTypeMap();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Booking#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method</em>'.
	 * @see bookingmodel.Booking#getPaymentMethod()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_PaymentMethod();

	/**
	 * Returns the meta object for the '{@link bookingmodel.Booking#checkedInAllGuest() <em>Checked In All Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Checked In All Guest</em>' operation.
	 * @see bookingmodel.Booking#checkedInAllGuest()
	 * @generated
	 */
	EOperation getBooking__CheckedInAllGuest();

	/**
	 * Returns the meta object for the '{@link bookingmodel.Booking#checkedInAGuest() <em>Checked In AGuest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Checked In AGuest</em>' operation.
	 * @see bookingmodel.Booking#checkedInAGuest()
	 * @generated
	 */
	EOperation getBooking__CheckedInAGuest();

	/**
	 * Returns the meta object for the '{@link bookingmodel.Booking#setResponsibleGuest(java.lang.String, java.lang.String) <em>Set Responsible Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Responsible Guest</em>' operation.
	 * @see bookingmodel.Booking#setResponsibleGuest(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBooking__SetResponsibleGuest__String_String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.Booking#getNrOfRooms() <em>Get Nr Of Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nr Of Rooms</em>' operation.
	 * @see bookingmodel.Booking#getNrOfRooms()
	 * @generated
	 */
	EOperation getBooking__GetNrOfRooms();

	/**
	 * Returns the meta object for the '{@link bookingmodel.Booking#setExtras(org.eclipse.emf.common.util.EList) <em>Set Extras</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Extras</em>' operation.
	 * @see bookingmodel.Booking#setExtras(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBooking__SetExtras__EList();

	/**
	 * Returns the meta object for the '{@link bookingmodel.Booking#setRoomTypes(org.eclipse.emf.common.util.EList) <em>Set Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Room Types</em>' operation.
	 * @see bookingmodel.Booking#setRoomTypes(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBooking__SetRoomTypes__EList();

	/**
	 * Returns the meta object for class '{@link bookingmodel.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see bookingmodel.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the reference list '{@link bookingmodel.Customer#getPaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payment Details</em>'.
	 * @see bookingmodel.Customer#getPaymentDetails()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_PaymentDetails();

	/**
	 * Returns the meta object for class '{@link bookingmodel.PaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Details</em>'.
	 * @see bookingmodel.PaymentDetails
	 * @generated
	 */
	EClass getPaymentDetails();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.PaymentDetails#getCcNr <em>Cc Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Nr</em>'.
	 * @see bookingmodel.PaymentDetails#getCcNr()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_CcNr();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.PaymentDetails#getCcV <em>Cc V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc V</em>'.
	 * @see bookingmodel.PaymentDetails#getCcV()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_CcV();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.PaymentDetails#getExpMonth <em>Exp Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exp Month</em>'.
	 * @see bookingmodel.PaymentDetails#getExpMonth()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_ExpMonth();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.PaymentDetails#getExpYear <em>Exp Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exp Year</em>'.
	 * @see bookingmodel.PaymentDetails#getExpYear()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_ExpYear();

	/**
	 * Returns the meta object for class '{@link bookingmodel.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see bookingmodel.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Guest#getRoomNr <em>Room Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Nr</em>'.
	 * @see bookingmodel.Guest#getRoomNr()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_RoomNr();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Guest#getGuestTypes <em>Guest Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guest Types</em>'.
	 * @see bookingmodel.Guest#getGuestTypes()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_GuestTypes();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Extra To Is Payed Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra To Is Payed Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true" keyOrdered="false"
	 *        valueDataType="org.eclipse.emf.ecore.EBooleanObject" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EClass getExtraToIsPayedEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getExtraToIsPayedEntry()
	 * @generated
	 */
	EAttribute getExtraToIsPayedEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getExtraToIsPayedEntry()
	 * @generated
	 */
	EAttribute getExtraToIsPayedEntry_Value();

	/**
	 * Returns the meta object for class '{@link bookingmodel.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see bookingmodel.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see bookingmodel.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see bookingmodel.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see bookingmodel.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Person#getTelephoneNr <em>Telephone Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone Nr</em>'.
	 * @see bookingmodel.Person#getTelephoneNr()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_TelephoneNr();

	/**
	 * Returns the meta object for the attribute '{@link bookingmodel.Person#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see bookingmodel.Person#getAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Address();

	/**
	 * Returns the meta object for class '{@link bookingmodel.BookingHandler <em>Booking Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Handler</em>'.
	 * @see bookingmodel.BookingHandler
	 * @generated
	 */
	EClass getBookingHandler();

	/**
	 * Returns the meta object for the map '{@link bookingmodel.BookingHandler#getBookingsMap <em>Bookings Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Bookings Map</em>'.
	 * @see bookingmodel.BookingHandler#getBookingsMap()
	 * @see #getBookingHandler()
	 * @generated
	 */
	EReference getBookingHandler_BookingsMap();

	/**
	 * Returns the meta object for the '{@link bookingmodel.BookingHandler#exists(java.lang.String) <em>Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exists</em>' operation.
	 * @see bookingmodel.BookingHandler#exists(java.lang.String)
	 * @generated
	 */
	EOperation getBookingHandler__Exists__String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.BookingHandler#addBooking(bookingmodel.Booking) <em>Add Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Booking</em>' operation.
	 * @see bookingmodel.BookingHandler#addBooking(bookingmodel.Booking)
	 * @generated
	 */
	EOperation getBookingHandler__AddBooking__Booking();

	/**
	 * Returns the meta object for the '{@link bookingmodel.BookingHandler#removeBooking(java.lang.String) <em>Remove Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Booking</em>' operation.
	 * @see bookingmodel.BookingHandler#removeBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingHandler__RemoveBooking__String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.BookingHandler#getBooking(java.lang.String) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see bookingmodel.BookingHandler#getBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingHandler__GetBooking__String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.BookingHandler#editBooking(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String) <em>Edit Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Booking</em>' operation.
	 * @see bookingmodel.BookingHandler#editBooking(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBookingHandler__EditBooking__String_String_String_int_String_String();

	/**
	 * Returns the meta object for class '{@link bookingmodel.IBookingProvidesForHost <em>IBooking Provides For Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking Provides For Host</em>'.
	 * @see bookingmodel.IBookingProvidesForHost
	 * @generated
	 */
	EClass getIBookingProvidesForHost();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForHost#enableSelfManagement() <em>Enable Self Management</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enable Self Management</em>' operation.
	 * @see bookingmodel.IBookingProvidesForHost#enableSelfManagement()
	 * @generated
	 */
	EOperation getIBookingProvidesForHost__EnableSelfManagement();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForHost#addServiceNote(java.lang.String) <em>Add Service Note</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Service Note</em>' operation.
	 * @see bookingmodel.IBookingProvidesForHost#addServiceNote(java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForHost__AddServiceNote__String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForHost#editServiceNote(java.lang.String, java.lang.String) <em>Edit Service Note</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Service Note</em>' operation.
	 * @see bookingmodel.IBookingProvidesForHost#editServiceNote(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForHost__EditServiceNote__String_String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForHost#removeServiceNote(java.lang.String) <em>Remove Service Note</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Service Note</em>' operation.
	 * @see bookingmodel.IBookingProvidesForHost#removeServiceNote(java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForHost__RemoveServiceNote__String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForHost#getServiceNotes(java.lang.String) <em>Get Service Notes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service Notes</em>' operation.
	 * @see bookingmodel.IBookingProvidesForHost#getServiceNotes(java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForHost__GetServiceNotes__String();

	/**
	 * Returns the meta object for class '{@link bookingmodel.IBookingProvidesForCustomer <em>IBooking Provides For Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking Provides For Customer</em>'.
	 * @see bookingmodel.IBookingProvidesForCustomer
	 * @generated
	 */
	EClass getIBookingProvidesForCustomer();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForCustomer#getBooking(java.lang.String) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see bookingmodel.IBookingProvidesForCustomer#getBooking(java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForCustomer__GetBooking__String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForCustomer#pay(java.lang.String) <em>Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay</em>' operation.
	 * @see bookingmodel.IBookingProvidesForCustomer#pay(java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForCustomer__Pay__String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForCustomer#getPrice(java.lang.String) <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see bookingmodel.IBookingProvidesForCustomer#getPrice(java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForCustomer__GetPrice__String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForCustomer#removeBooking(java.lang.String) <em>Remove Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Booking</em>' operation.
	 * @see bookingmodel.IBookingProvidesForCustomer#removeBooking(java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForCustomer__RemoveBooking__String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForCustomer#editBooking(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String) <em>Edit Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Booking</em>' operation.
	 * @see bookingmodel.IBookingProvidesForCustomer#editBooking(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForCustomer__EditBooking__String_String_String_int_String_String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForCustomer#choosePaymentMethod(java.lang.String) <em>Choose Payment Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Choose Payment Method</em>' operation.
	 * @see bookingmodel.IBookingProvidesForCustomer#choosePaymentMethod(java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForCustomer__ChoosePaymentMethod__String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForCustomer#setPaymentDetails(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Set Payment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Payment Details</em>' operation.
	 * @see bookingmodel.IBookingProvidesForCustomer#setPaymentDetails(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForCustomer__SetPaymentDetails__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForCustomer#setPersonalDetails(java.lang.String, java.lang.String, int, java.lang.String) <em>Set Personal Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Personal Details</em>' operation.
	 * @see bookingmodel.IBookingProvidesForCustomer#setPersonalDetails(java.lang.String, java.lang.String, int, java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForCustomer__SetPersonalDetails__String_String_int_String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForCustomer#setCustomerToBooking(java.lang.String, java.lang.String) <em>Set Customer To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Customer To Booking</em>' operation.
	 * @see bookingmodel.IBookingProvidesForCustomer#setCustomerToBooking(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForCustomer__SetCustomerToBooking__String_String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForCustomer#book(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String) <em>Book</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Book</em>' operation.
	 * @see bookingmodel.IBookingProvidesForCustomer#book(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForCustomer__Book__String_String_int_String_String();

	/**
	 * Returns the meta object for class '{@link bookingmodel.IBookingProvidesForGuest <em>IBooking Provides For Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking Provides For Guest</em>'.
	 * @see bookingmodel.IBookingProvidesForGuest
	 * @generated
	 */
	EClass getIBookingProvidesForGuest();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForGuest#checkIn(java.lang.String, java.lang.String) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see bookingmodel.IBookingProvidesForGuest#checkIn(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForGuest__CheckIn__String_String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForGuest#checkOut(java.lang.String, java.lang.String) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see bookingmodel.IBookingProvidesForGuest#checkOut(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForGuest__CheckOut__String_String();

	/**
	 * Returns the meta object for the '{@link bookingmodel.IBookingProvidesForGuest#pay(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay</em>' operation.
	 * @see bookingmodel.IBookingProvidesForGuest#pay(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookingProvidesForGuest__Pay__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link bookingmodel.BookingProvides <em>Booking Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Provides</em>'.
	 * @see bookingmodel.BookingProvides
	 * @generated
	 */
	EClass getBookingProvides();

	/**
	 * Returns the meta object for the reference '{@link bookingmodel.BookingProvides#getBookingHandler <em>Booking Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking Handler</em>'.
	 * @see bookingmodel.BookingProvides#getBookingHandler()
	 * @see #getBookingProvides()
	 * @generated
	 */
	EReference getBookingProvides_BookingHandler();

	/**
	 * Returns the meta object for the '{@link bookingmodel.BookingProvides#stringToList(java.lang.String) <em>String To List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>String To List</em>' operation.
	 * @see bookingmodel.BookingProvides#stringToList(java.lang.String)
	 * @generated
	 */
	EOperation getBookingProvides__StringToList__String();

	/**
	 * Returns the meta object for enum '{@link bookingmodel.GuestTypes <em>Guest Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guest Types</em>'.
	 * @see bookingmodel.GuestTypes
	 * @generated
	 */
	EEnum getGuestTypes();

	/**
	 * Returns the meta object for enum '{@link bookingmodel.PaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Method</em>'.
	 * @see bookingmodel.PaymentMethod
	 * @generated
	 */
	EEnum getPaymentMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BookingmodelFactory getBookingmodelFactory();

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
		 * The meta object literal for the '{@link bookingmodel.impl.RoomtypeToGuestIDEntryImpl <em>Roomtype To Guest ID Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.impl.RoomtypeToGuestIDEntryImpl
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getRoomtypeToGuestIDEntry()
		 * @generated
		 */
		EClass ROOMTYPE_TO_GUEST_ID_ENTRY = eINSTANCE.getRoomtypeToGuestIDEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOMTYPE_TO_GUEST_ID_ENTRY__KEY = eINSTANCE.getRoomtypeToGuestIDEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOMTYPE_TO_GUEST_ID_ENTRY__VALUE = eINSTANCE.getRoomtypeToGuestIDEntry_Value();

		/**
		 * The meta object literal for the '{@link bookingmodel.impl.NrToRoomEntryImpl <em>Nr To Room Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.impl.NrToRoomEntryImpl
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getNrToRoomEntry()
		 * @generated
		 */
		EClass NR_TO_ROOM_ENTRY = eINSTANCE.getNrToRoomEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NR_TO_ROOM_ENTRY__KEY = eINSTANCE.getNrToRoomEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NR_TO_ROOM_ENTRY__VALUE = eINSTANCE.getNrToRoomEntry_Value();

		/**
		 * The meta object literal for the '{@link bookingmodel.impl.BookingRefToBookingEntryImpl <em>Booking Ref To Booking Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.impl.BookingRefToBookingEntryImpl
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getBookingRefToBookingEntry()
		 * @generated
		 */
		EClass BOOKING_REF_TO_BOOKING_ENTRY = eINSTANCE.getBookingRefToBookingEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_REF_TO_BOOKING_ENTRY__KEY = eINSTANCE.getBookingRefToBookingEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_REF_TO_BOOKING_ENTRY__VALUE = eINSTANCE.getBookingRefToBookingEntry_Value();

		/**
		 * The meta object literal for the '{@link bookingmodel.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.impl.BookingImpl
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Booking Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_REF = eINSTANCE.getBooking_BookingRef();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__DATE = eINSTANCE.getBooking_Date();

		/**
		 * The meta object literal for the '<em><b>Nr Of Nights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__NR_OF_NIGHTS = eINSTANCE.getBooking_NrOfNights();

		/**
		 * The meta object literal for the '<em><b>Service Notes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__SERVICE_NOTES = eINSTANCE.getBooking_ServiceNotes();

		/**
		 * The meta object literal for the '<em><b>Nr Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__NR_OF_GUESTS = eINSTANCE.getBooking_NrOfGuests();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__CUSTOMER = eINSTANCE.getBooking_Customer();

		/**
		 * The meta object literal for the '<em><b>Guest List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__GUEST_LIST = eINSTANCE.getBooking_GuestList();

		/**
		 * The meta object literal for the '<em><b>Is Payed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__IS_PAYED = eINSTANCE.getBooking_IsPayed();

		/**
		 * The meta object literal for the '<em><b>Room Guest Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOM_GUEST_MAP = eINSTANCE.getBooking_RoomGuestMap();

		/**
		 * The meta object literal for the '<em><b>Room Type Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOM_TYPE_MAP = eINSTANCE.getBooking_RoomTypeMap();

		/**
		 * The meta object literal for the '<em><b>Payment Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PAYMENT_METHOD = eINSTANCE.getBooking_PaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Checked In All Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___CHECKED_IN_ALL_GUEST = eINSTANCE.getBooking__CheckedInAllGuest();

		/**
		 * The meta object literal for the '<em><b>Checked In AGuest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___CHECKED_IN_AGUEST = eINSTANCE.getBooking__CheckedInAGuest();

		/**
		 * The meta object literal for the '<em><b>Set Responsible Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___SET_RESPONSIBLE_GUEST__STRING_STRING = eINSTANCE.getBooking__SetResponsibleGuest__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Nr Of Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GET_NR_OF_ROOMS = eINSTANCE.getBooking__GetNrOfRooms();

		/**
		 * The meta object literal for the '<em><b>Set Extras</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___SET_EXTRAS__ELIST = eINSTANCE.getBooking__SetExtras__EList();

		/**
		 * The meta object literal for the '<em><b>Set Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___SET_ROOM_TYPES__ELIST = eINSTANCE.getBooking__SetRoomTypes__EList();

		/**
		 * The meta object literal for the '{@link bookingmodel.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.impl.CustomerImpl
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Payment Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__PAYMENT_DETAILS = eINSTANCE.getCustomer_PaymentDetails();

		/**
		 * The meta object literal for the '{@link bookingmodel.impl.PaymentDetailsImpl <em>Payment Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.impl.PaymentDetailsImpl
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getPaymentDetails()
		 * @generated
		 */
		EClass PAYMENT_DETAILS = eINSTANCE.getPaymentDetails();

		/**
		 * The meta object literal for the '<em><b>Cc Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__CC_NR = eINSTANCE.getPaymentDetails_CcNr();

		/**
		 * The meta object literal for the '<em><b>Cc V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__CC_V = eINSTANCE.getPaymentDetails_CcV();

		/**
		 * The meta object literal for the '<em><b>Exp Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__EXP_MONTH = eINSTANCE.getPaymentDetails_ExpMonth();

		/**
		 * The meta object literal for the '<em><b>Exp Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__EXP_YEAR = eINSTANCE.getPaymentDetails_ExpYear();

		/**
		 * The meta object literal for the '{@link bookingmodel.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.impl.GuestImpl
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '<em><b>Room Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__ROOM_NR = eINSTANCE.getGuest_RoomNr();

		/**
		 * The meta object literal for the '<em><b>Guest Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__GUEST_TYPES = eINSTANCE.getGuest_GuestTypes();

		/**
		 * The meta object literal for the '{@link bookingmodel.impl.ExtraToIsPayedEntryImpl <em>Extra To Is Payed Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.impl.ExtraToIsPayedEntryImpl
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getExtraToIsPayedEntry()
		 * @generated
		 */
		EClass EXTRA_TO_IS_PAYED_ENTRY = eINSTANCE.getExtraToIsPayedEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_TO_IS_PAYED_ENTRY__KEY = eINSTANCE.getExtraToIsPayedEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_TO_IS_PAYED_ENTRY__VALUE = eINSTANCE.getExtraToIsPayedEntry_Value();

		/**
		 * The meta object literal for the '{@link bookingmodel.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.impl.PersonImpl
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Telephone Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TELEPHONE_NR = eINSTANCE.getPerson_TelephoneNr();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ADDRESS = eINSTANCE.getPerson_Address();

		/**
		 * The meta object literal for the '{@link bookingmodel.impl.BookingHandlerImpl <em>Booking Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.impl.BookingHandlerImpl
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getBookingHandler()
		 * @generated
		 */
		EClass BOOKING_HANDLER = eINSTANCE.getBookingHandler();

		/**
		 * The meta object literal for the '<em><b>Bookings Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_HANDLER__BOOKINGS_MAP = eINSTANCE.getBookingHandler_BookingsMap();

		/**
		 * The meta object literal for the '<em><b>Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___EXISTS__STRING = eINSTANCE.getBookingHandler__Exists__String();

		/**
		 * The meta object literal for the '<em><b>Add Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___ADD_BOOKING__BOOKING = eINSTANCE.getBookingHandler__AddBooking__Booking();

		/**
		 * The meta object literal for the '<em><b>Remove Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___REMOVE_BOOKING__STRING = eINSTANCE.getBookingHandler__RemoveBooking__String();

		/**
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___GET_BOOKING__STRING = eINSTANCE.getBookingHandler__GetBooking__String();

		/**
		 * The meta object literal for the '<em><b>Edit Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_HANDLER___EDIT_BOOKING__STRING_STRING_STRING_INT_STRING_STRING = eINSTANCE.getBookingHandler__EditBooking__String_String_String_int_String_String();

		/**
		 * The meta object literal for the '{@link bookingmodel.IBookingProvidesForHost <em>IBooking Provides For Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.IBookingProvidesForHost
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getIBookingProvidesForHost()
		 * @generated
		 */
		EClass IBOOKING_PROVIDES_FOR_HOST = eINSTANCE.getIBookingProvidesForHost();

		/**
		 * The meta object literal for the '<em><b>Enable Self Management</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_HOST___ENABLE_SELF_MANAGEMENT = eINSTANCE.getIBookingProvidesForHost__EnableSelfManagement();

		/**
		 * The meta object literal for the '<em><b>Add Service Note</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_HOST___ADD_SERVICE_NOTE__STRING = eINSTANCE.getIBookingProvidesForHost__AddServiceNote__String();

		/**
		 * The meta object literal for the '<em><b>Edit Service Note</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_HOST___EDIT_SERVICE_NOTE__STRING_STRING = eINSTANCE.getIBookingProvidesForHost__EditServiceNote__String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Service Note</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_HOST___REMOVE_SERVICE_NOTE__STRING = eINSTANCE.getIBookingProvidesForHost__RemoveServiceNote__String();

		/**
		 * The meta object literal for the '<em><b>Get Service Notes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_HOST___GET_SERVICE_NOTES__STRING = eINSTANCE.getIBookingProvidesForHost__GetServiceNotes__String();

		/**
		 * The meta object literal for the '{@link bookingmodel.IBookingProvidesForCustomer <em>IBooking Provides For Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.IBookingProvidesForCustomer
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getIBookingProvidesForCustomer()
		 * @generated
		 */
		EClass IBOOKING_PROVIDES_FOR_CUSTOMER = eINSTANCE.getIBookingProvidesForCustomer();

		/**
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_CUSTOMER___GET_BOOKING__STRING = eINSTANCE.getIBookingProvidesForCustomer__GetBooking__String();

		/**
		 * The meta object literal for the '<em><b>Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_CUSTOMER___PAY__STRING = eINSTANCE.getIBookingProvidesForCustomer__Pay__String();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_CUSTOMER___GET_PRICE__STRING = eINSTANCE.getIBookingProvidesForCustomer__GetPrice__String();

		/**
		 * The meta object literal for the '<em><b>Remove Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_CUSTOMER___REMOVE_BOOKING__STRING = eINSTANCE.getIBookingProvidesForCustomer__RemoveBooking__String();

		/**
		 * The meta object literal for the '<em><b>Edit Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_CUSTOMER___EDIT_BOOKING__STRING_STRING_STRING_INT_STRING_STRING = eINSTANCE.getIBookingProvidesForCustomer__EditBooking__String_String_String_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Choose Payment Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_CUSTOMER___CHOOSE_PAYMENT_METHOD__STRING = eINSTANCE.getIBookingProvidesForCustomer__ChoosePaymentMethod__String();

		/**
		 * The meta object literal for the '<em><b>Set Payment Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_CUSTOMER___SET_PAYMENT_DETAILS__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIBookingProvidesForCustomer__SetPaymentDetails__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Set Personal Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_CUSTOMER___SET_PERSONAL_DETAILS__STRING_STRING_INT_STRING = eINSTANCE.getIBookingProvidesForCustomer__SetPersonalDetails__String_String_int_String();

		/**
		 * The meta object literal for the '<em><b>Set Customer To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_CUSTOMER___SET_CUSTOMER_TO_BOOKING__STRING_STRING = eINSTANCE.getIBookingProvidesForCustomer__SetCustomerToBooking__String_String();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_CUSTOMER___BOOK__STRING_STRING_INT_STRING_STRING = eINSTANCE.getIBookingProvidesForCustomer__Book__String_String_int_String_String();

		/**
		 * The meta object literal for the '{@link bookingmodel.IBookingProvidesForGuest <em>IBooking Provides For Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.IBookingProvidesForGuest
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getIBookingProvidesForGuest()
		 * @generated
		 */
		EClass IBOOKING_PROVIDES_FOR_GUEST = eINSTANCE.getIBookingProvidesForGuest();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_GUEST___CHECK_IN__STRING_STRING = eINSTANCE.getIBookingProvidesForGuest__CheckIn__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_GUEST___CHECK_OUT__STRING_STRING = eINSTANCE.getIBookingProvidesForGuest__CheckOut__String_String();

		/**
		 * The meta object literal for the '<em><b>Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_PROVIDES_FOR_GUEST___PAY__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIBookingProvidesForGuest__Pay__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '{@link bookingmodel.impl.BookingProvidesImpl <em>Booking Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.impl.BookingProvidesImpl
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getBookingProvides()
		 * @generated
		 */
		EClass BOOKING_PROVIDES = eINSTANCE.getBookingProvides();

		/**
		 * The meta object literal for the '<em><b>Booking Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_PROVIDES__BOOKING_HANDLER = eINSTANCE.getBookingProvides_BookingHandler();

		/**
		 * The meta object literal for the '<em><b>String To List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_PROVIDES___STRING_TO_LIST__STRING = eINSTANCE.getBookingProvides__StringToList__String();

		/**
		 * The meta object literal for the '{@link bookingmodel.GuestTypes <em>Guest Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.GuestTypes
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getGuestTypes()
		 * @generated
		 */
		EEnum GUEST_TYPES = eINSTANCE.getGuestTypes();

		/**
		 * The meta object literal for the '{@link bookingmodel.PaymentMethod <em>Payment Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookingmodel.PaymentMethod
		 * @see bookingmodel.impl.BookingmodelPackageImpl#getPaymentMethod()
		 * @generated
		 */
		EEnum PAYMENT_METHOD = eINSTANCE.getPaymentMethod();

	}

} //BookingmodelPackage