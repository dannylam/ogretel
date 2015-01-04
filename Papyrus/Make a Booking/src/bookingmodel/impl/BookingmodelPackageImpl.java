/**
 */
package bookingmodel.impl;

import bookingmodel.Booking;
import bookingmodel.BookingHandler;
import bookingmodel.BookingProvides;
import bookingmodel.BookingmodelFactory;
import bookingmodel.BookingmodelPackage;
import bookingmodel.Customer;
import bookingmodel.Guest;
import bookingmodel.GuestTypes;
import bookingmodel.IBookingProvidesForCustomer;
import bookingmodel.IBookingProvidesForGuest;
import bookingmodel.IBookingProvidesForHost;
import bookingmodel.PaymentDetails;
import bookingmodel.PaymentMethod;
import bookingmodel.Person;
import bookingmodel.ServiceNoteHandler;
import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import types.TypesPackage;
import types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingmodelPackageImpl extends EPackageImpl implements BookingmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomToGuestIDEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomIDToRoomTypeEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingRefToBookingEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraToIsPayedEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingProvidesForHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingProvidesForCustomerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingProvidesForGuestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingProvidesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomIDToBookingRefEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceNoteHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceNoteToDescriptionEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guestTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentMethodEEnum = null;

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
	 * @see bookingmodel.BookingmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BookingmodelPackageImpl() {
		super(eNS_URI, BookingmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BookingmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BookingmodelPackage init() {
		if (isInited) return (BookingmodelPackage)EPackage.Registry.INSTANCE.getEPackage(BookingmodelPackage.eNS_URI);

		// Obtain or create and register package
		BookingmodelPackageImpl theBookingmodelPackage = (BookingmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BookingmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BookingmodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theBookingmodelPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theBookingmodelPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBookingmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BookingmodelPackage.eNS_URI, theBookingmodelPackage);
		return theBookingmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomToGuestIDEntry() {
		return roomToGuestIDEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomToGuestIDEntry_Key() {
		return (EAttribute)roomToGuestIDEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomToGuestIDEntry_Value() {
		return (EAttribute)roomToGuestIDEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomIDToRoomTypeEntry() {
		return roomIDToRoomTypeEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomIDToRoomTypeEntry_Key() {
		return (EAttribute)roomIDToRoomTypeEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomIDToRoomTypeEntry_Value() {
		return (EAttribute)roomIDToRoomTypeEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingRefToBookingEntry() {
		return bookingRefToBookingEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingRefToBookingEntry_Key() {
		return (EAttribute)bookingRefToBookingEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingRefToBookingEntry_Value() {
		return (EReference)bookingRefToBookingEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingRef() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_StartDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_EndDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_ServiceNotes() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_NrOfGuests() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Customer() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_GuestList() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_IsPayed() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_RoomIDToGuestMap() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_RoomIDToRoomTypeMap() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_PaymentMethod() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_ExtraToIsPayedMap() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__CheckedInAllRooms() {
		return bookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__CheckedInRoom__int() {
		return bookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__SetResponsibleGuest__int_String() {
		return bookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__SetResponsibleGuestToAllRooms__String() {
		return bookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__GetNrOfRooms() {
		return bookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__SetExtras__EList() {
		return bookingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__SetRoomTypes__EList() {
		return bookingEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__SetRoomIDs__EList() {
		return bookingEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__SetServices__EList() {
		return bookingEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__GenerateBookingRef() {
		return bookingEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__GetExtras() {
		return bookingEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__GetRoomTypes() {
		return bookingEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__GetRoomIDs() {
		return bookingEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__RemoveResponsibleGuestToAllRooms__String() {
		return bookingEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__RemoveResponsibleGuest__int_String() {
		return bookingEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_PaymentDetails() {
		return (EReference)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentDetails() {
		return paymentDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_CcNr() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_CcV() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_ExpMonth() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_ExpYear() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_FirstName() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_LastName() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuest() {
		return guestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_RoomNr() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_GuestTypes() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtraToIsPayedEntry() {
		return extraToIsPayedEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtraToIsPayedEntry_Key() {
		return (EAttribute)extraToIsPayedEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtraToIsPayedEntry_Value() {
		return (EAttribute)extraToIsPayedEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FirstName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_LastName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Email() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_TelephoneNr() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Address() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Age() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingHandler() {
		return bookingHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingHandler_BookingsMap() {
		return (EReference)bookingHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingHandler_RoomIDToBookingRefMap() {
		return (EReference)bookingHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__Exists__String() {
		return bookingHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__AddBooking__Booking() {
		return bookingHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__RemoveBooking__String() {
		return bookingHandlerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__GetBooking__String() {
		return bookingHandlerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__EditBooking__String_String_String_int_EList_EList_EList() {
		return bookingHandlerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingHandler__GetBooking__int() {
		return bookingHandlerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBookingProvidesForHost() {
		return iBookingProvidesForHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForHost__AddServiceNote__String_String() {
		return iBookingProvidesForHostEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForHost__RemoveServiceNote__String() {
		return iBookingProvidesForHostEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForHost__GetServiceNotesOfBooking__String() {
		return iBookingProvidesForHostEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForHost__EditServiceNoteDescription__String_String() {
		return iBookingProvidesForHostEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForHost__GetServiceNotes() {
		return iBookingProvidesForHostEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForHost__GetServiceNoteDescription__String() {
		return iBookingProvidesForHostEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForHost__IsPayed__String() {
		return iBookingProvidesForHostEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBookingProvidesForCustomer() {
		return iBookingProvidesForCustomerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__PayBooking__String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__GetPrice__String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__RemoveBooking__String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__EditBooking__String_String_String_int_EList_EList_EList() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__SetPaymentMethod__String_String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__SetPaymentDetails__String_String_int_int_String_String_String_String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__SetPersonalDetails__String_String_int_String_String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__Book__String_String_int_EList_EList_EList() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBookingProvidesForGuest() {
		return iBookingProvidesForGuestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForGuest__CheckIn__String_String_String() {
		return iBookingProvidesForGuestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForGuest__CheckOut__int_String() {
		return iBookingProvidesForGuestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForGuest__PayExtra__String_String_int_int_String_String_EList_int() {
		return iBookingProvidesForGuestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForGuest__PayRoom__String_String_int_int_String_String_int() {
		return iBookingProvidesForGuestEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingProvides() {
		return bookingProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingProvides_BookingHandler() {
		return (EReference)bookingProvidesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingProvides_ServiceNoteHandler() {
		return (EReference)bookingProvidesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingProvides__StringToList__String() {
		return bookingProvidesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomIDToBookingRefEntry() {
		return roomIDToBookingRefEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomIDToBookingRefEntry_Key() {
		return (EAttribute)roomIDToBookingRefEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomIDToBookingRefEntry_Value() {
		return (EAttribute)roomIDToBookingRefEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceNoteHandler() {
		return serviceNoteHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceNoteHandler_ServiceNoteMap() {
		return (EReference)serviceNoteHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceNoteHandler__Exists__String() {
		return serviceNoteHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceNoteHandler__AddServiceNote__String_String() {
		return serviceNoteHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceNoteHandler__RemoveServiceNote__String() {
		return serviceNoteHandlerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceNoteHandler__GetServiceNoteDescription__String() {
		return serviceNoteHandlerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceNoteHandler__EditServiceNoteDescription__String_String() {
		return serviceNoteHandlerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceNoteHandler__GetServices() {
		return serviceNoteHandlerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceNoteToDescriptionEntry() {
		return serviceNoteToDescriptionEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceNoteToDescriptionEntry_Key() {
		return (EAttribute)serviceNoteToDescriptionEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceNoteToDescriptionEntry_Value() {
		return (EAttribute)serviceNoteToDescriptionEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuestTypes() {
		return guestTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentMethod() {
		return paymentMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingmodelFactory getBookingmodelFactory() {
		return (BookingmodelFactory)getEFactoryInstance();
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
		roomToGuestIDEntryEClass = createEClass(ROOM_TO_GUEST_ID_ENTRY);
		createEAttribute(roomToGuestIDEntryEClass, ROOM_TO_GUEST_ID_ENTRY__KEY);
		createEAttribute(roomToGuestIDEntryEClass, ROOM_TO_GUEST_ID_ENTRY__VALUE);

		roomIDToRoomTypeEntryEClass = createEClass(ROOM_ID_TO_ROOM_TYPE_ENTRY);
		createEAttribute(roomIDToRoomTypeEntryEClass, ROOM_ID_TO_ROOM_TYPE_ENTRY__KEY);
		createEAttribute(roomIDToRoomTypeEntryEClass, ROOM_ID_TO_ROOM_TYPE_ENTRY__VALUE);

		bookingRefToBookingEntryEClass = createEClass(BOOKING_REF_TO_BOOKING_ENTRY);
		createEAttribute(bookingRefToBookingEntryEClass, BOOKING_REF_TO_BOOKING_ENTRY__KEY);
		createEReference(bookingRefToBookingEntryEClass, BOOKING_REF_TO_BOOKING_ENTRY__VALUE);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__BOOKING_REF);
		createEAttribute(bookingEClass, BOOKING__START_DATE);
		createEAttribute(bookingEClass, BOOKING__END_DATE);
		createEAttribute(bookingEClass, BOOKING__SERVICE_NOTES);
		createEAttribute(bookingEClass, BOOKING__NR_OF_GUESTS);
		createEReference(bookingEClass, BOOKING__CUSTOMER);
		createEReference(bookingEClass, BOOKING__GUEST_LIST);
		createEAttribute(bookingEClass, BOOKING__IS_PAYED);
		createEReference(bookingEClass, BOOKING__ROOM_ID_TO_GUEST_MAP);
		createEReference(bookingEClass, BOOKING__ROOM_ID_TO_ROOM_TYPE_MAP);
		createEReference(bookingEClass, BOOKING__EXTRA_TO_IS_PAYED_MAP);
		createEAttribute(bookingEClass, BOOKING__PAYMENT_METHOD);
		createEOperation(bookingEClass, BOOKING___CHECKED_IN_ALL_ROOMS);
		createEOperation(bookingEClass, BOOKING___CHECKED_IN_ROOM__INT);
		createEOperation(bookingEClass, BOOKING___SET_RESPONSIBLE_GUEST__INT_STRING);
		createEOperation(bookingEClass, BOOKING___SET_RESPONSIBLE_GUEST_TO_ALL_ROOMS__STRING);
		createEOperation(bookingEClass, BOOKING___GET_NR_OF_ROOMS);
		createEOperation(bookingEClass, BOOKING___SET_EXTRAS__ELIST);
		createEOperation(bookingEClass, BOOKING___SET_ROOM_TYPES__ELIST);
		createEOperation(bookingEClass, BOOKING___SET_ROOM_IDS__ELIST);
		createEOperation(bookingEClass, BOOKING___SET_SERVICES__ELIST);
		createEOperation(bookingEClass, BOOKING___GENERATE_BOOKING_REF);
		createEOperation(bookingEClass, BOOKING___GET_EXTRAS);
		createEOperation(bookingEClass, BOOKING___GET_ROOM_TYPES);
		createEOperation(bookingEClass, BOOKING___GET_ROOM_IDS);
		createEOperation(bookingEClass, BOOKING___REMOVE_RESPONSIBLE_GUEST_TO_ALL_ROOMS__STRING);
		createEOperation(bookingEClass, BOOKING___REMOVE_RESPONSIBLE_GUEST__INT_STRING);

		customerEClass = createEClass(CUSTOMER);
		createEReference(customerEClass, CUSTOMER__PAYMENT_DETAILS);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEAttribute(personEClass, PERSON__LAST_NAME);
		createEAttribute(personEClass, PERSON__EMAIL);
		createEAttribute(personEClass, PERSON__TELEPHONE_NR);
		createEAttribute(personEClass, PERSON__ADDRESS);
		createEAttribute(personEClass, PERSON__AGE);

		paymentDetailsEClass = createEClass(PAYMENT_DETAILS);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__CC_NR);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__CC_V);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__EXP_MONTH);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__EXP_YEAR);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__FIRST_NAME);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__LAST_NAME);

		guestEClass = createEClass(GUEST);
		createEAttribute(guestEClass, GUEST__ROOM_NR);
		createEAttribute(guestEClass, GUEST__GUEST_TYPES);

		extraToIsPayedEntryEClass = createEClass(EXTRA_TO_IS_PAYED_ENTRY);
		createEAttribute(extraToIsPayedEntryEClass, EXTRA_TO_IS_PAYED_ENTRY__KEY);
		createEAttribute(extraToIsPayedEntryEClass, EXTRA_TO_IS_PAYED_ENTRY__VALUE);

		bookingHandlerEClass = createEClass(BOOKING_HANDLER);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__BOOKINGS_MAP);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__ROOM_ID_TO_BOOKING_REF_MAP);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___EXISTS__STRING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___ADD_BOOKING__BOOKING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___REMOVE_BOOKING__STRING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___GET_BOOKING__STRING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___EDIT_BOOKING__STRING_STRING_STRING_INT_ELIST_ELIST_ELIST);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___GET_BOOKING__INT);

		roomIDToBookingRefEntryEClass = createEClass(ROOM_ID_TO_BOOKING_REF_ENTRY);
		createEAttribute(roomIDToBookingRefEntryEClass, ROOM_ID_TO_BOOKING_REF_ENTRY__KEY);
		createEAttribute(roomIDToBookingRefEntryEClass, ROOM_ID_TO_BOOKING_REF_ENTRY__VALUE);

		iBookingProvidesForHostEClass = createEClass(IBOOKING_PROVIDES_FOR_HOST);
		createEOperation(iBookingProvidesForHostEClass, IBOOKING_PROVIDES_FOR_HOST___ADD_SERVICE_NOTE__STRING_STRING);
		createEOperation(iBookingProvidesForHostEClass, IBOOKING_PROVIDES_FOR_HOST___REMOVE_SERVICE_NOTE__STRING);
		createEOperation(iBookingProvidesForHostEClass, IBOOKING_PROVIDES_FOR_HOST___GET_SERVICE_NOTES_OF_BOOKING__STRING);
		createEOperation(iBookingProvidesForHostEClass, IBOOKING_PROVIDES_FOR_HOST___EDIT_SERVICE_NOTE_DESCRIPTION__STRING_STRING);
		createEOperation(iBookingProvidesForHostEClass, IBOOKING_PROVIDES_FOR_HOST___GET_SERVICE_NOTES);
		createEOperation(iBookingProvidesForHostEClass, IBOOKING_PROVIDES_FOR_HOST___GET_SERVICE_NOTE_DESCRIPTION__STRING);
		createEOperation(iBookingProvidesForHostEClass, IBOOKING_PROVIDES_FOR_HOST___IS_PAYED__STRING);

		iBookingProvidesForCustomerEClass = createEClass(IBOOKING_PROVIDES_FOR_CUSTOMER);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___PAY_BOOKING__STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___GET_PRICE__STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___REMOVE_BOOKING__STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___EDIT_BOOKING__STRING_STRING_STRING_INT_ELIST_ELIST_ELIST);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___SET_PAYMENT_METHOD__STRING_STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___SET_PAYMENT_DETAILS__STRING_STRING_INT_INT_STRING_STRING_STRING_STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___SET_PERSONAL_DETAILS__STRING_STRING_INT_STRING_STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___BOOK__STRING_STRING_INT_ELIST_ELIST_ELIST);

		iBookingProvidesForGuestEClass = createEClass(IBOOKING_PROVIDES_FOR_GUEST);
		createEOperation(iBookingProvidesForGuestEClass, IBOOKING_PROVIDES_FOR_GUEST___CHECK_IN__STRING_STRING_STRING);
		createEOperation(iBookingProvidesForGuestEClass, IBOOKING_PROVIDES_FOR_GUEST___CHECK_OUT__INT_STRING);
		createEOperation(iBookingProvidesForGuestEClass, IBOOKING_PROVIDES_FOR_GUEST___PAY_EXTRA__STRING_STRING_INT_INT_STRING_STRING_ELIST_INT);
		createEOperation(iBookingProvidesForGuestEClass, IBOOKING_PROVIDES_FOR_GUEST___PAY_ROOM__STRING_STRING_INT_INT_STRING_STRING_INT);

		bookingProvidesEClass = createEClass(BOOKING_PROVIDES);
		createEReference(bookingProvidesEClass, BOOKING_PROVIDES__BOOKING_HANDLER);
		createEReference(bookingProvidesEClass, BOOKING_PROVIDES__SERVICE_NOTE_HANDLER);
		createEOperation(bookingProvidesEClass, BOOKING_PROVIDES___STRING_TO_LIST__STRING);

		serviceNoteHandlerEClass = createEClass(SERVICE_NOTE_HANDLER);
		createEReference(serviceNoteHandlerEClass, SERVICE_NOTE_HANDLER__SERVICE_NOTE_MAP);
		createEOperation(serviceNoteHandlerEClass, SERVICE_NOTE_HANDLER___EXISTS__STRING);
		createEOperation(serviceNoteHandlerEClass, SERVICE_NOTE_HANDLER___ADD_SERVICE_NOTE__STRING_STRING);
		createEOperation(serviceNoteHandlerEClass, SERVICE_NOTE_HANDLER___REMOVE_SERVICE_NOTE__STRING);
		createEOperation(serviceNoteHandlerEClass, SERVICE_NOTE_HANDLER___GET_SERVICE_NOTE_DESCRIPTION__STRING);
		createEOperation(serviceNoteHandlerEClass, SERVICE_NOTE_HANDLER___EDIT_SERVICE_NOTE_DESCRIPTION__STRING_STRING);
		createEOperation(serviceNoteHandlerEClass, SERVICE_NOTE_HANDLER___GET_SERVICES);

		serviceNoteToDescriptionEntryEClass = createEClass(SERVICE_NOTE_TO_DESCRIPTION_ENTRY);
		createEAttribute(serviceNoteToDescriptionEntryEClass, SERVICE_NOTE_TO_DESCRIPTION_ENTRY__KEY);
		createEAttribute(serviceNoteToDescriptionEntryEClass, SERVICE_NOTE_TO_DESCRIPTION_ENTRY__VALUE);

		// Create enums
		guestTypesEEnum = createEEnum(GUEST_TYPES);
		paymentMethodEEnum = createEEnum(PAYMENT_METHOD);
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
		customerEClass.getESuperTypes().add(this.getPerson());
		guestEClass.getESuperTypes().add(this.getPerson());
		bookingProvidesEClass.getESuperTypes().add(this.getIBookingProvidesForCustomer());
		bookingProvidesEClass.getESuperTypes().add(this.getIBookingProvidesForGuest());
		bookingProvidesEClass.getESuperTypes().add(this.getIBookingProvidesForHost());

		// Initialize classes, features, and operations; add parameters
		initEClass(roomToGuestIDEntryEClass, Map.Entry.class, "RoomToGuestIDEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomToGuestIDEntry_Key(), ecorePackage.getEIntegerObject(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomToGuestIDEntry_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomIDToRoomTypeEntryEClass, Map.Entry.class, "RoomIDToRoomTypeEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomIDToRoomTypeEntry_Key(), ecorePackage.getEIntegerObject(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomIDToRoomTypeEntry_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingRefToBookingEntryEClass, Map.Entry.class, "BookingRefToBookingEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookingRefToBookingEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingRefToBookingEntry_Value(), this.getBooking(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_BookingRef(), theTypesPackage.getString(), "bookingRef", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_StartDate(), theTypesPackage.getString(), "startDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_EndDate(), theTypesPackage.getString(), "endDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_ServiceNotes(), ecorePackage.getEString(), "serviceNotes", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_NrOfGuests(), theTypesPackage.getInteger(), "nrOfGuests", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Customer(), this.getCustomer(), null, "customer", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_GuestList(), this.getGuest(), null, "guestList", null, 1, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_IsPayed(), theTypesPackage.getBoolean(), "isPayed", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_RoomIDToGuestMap(), this.getRoomToGuestIDEntry(), null, "roomIDToGuestMap", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_RoomIDToRoomTypeMap(), this.getRoomIDToRoomTypeEntry(), null, "roomIDToRoomTypeMap", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_ExtraToIsPayedMap(), this.getExtraToIsPayedEntry(), null, "extraToIsPayedMap", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_PaymentMethod(), this.getPaymentMethod(), "paymentMethod", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBooking__CheckedInAllRooms(), theTypesPackage.getBoolean(), "checkedInAllRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getBooking__CheckedInRoom__int(), theTypesPackage.getBoolean(), "checkedInRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__SetResponsibleGuest__int_String(), theTypesPackage.getInteger(), "setResponsibleGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "guestEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__SetResponsibleGuestToAllRooms__String(), theTypesPackage.getInteger(), "setResponsibleGuestToAllRooms", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "guestEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__GetNrOfRooms(), theTypesPackage.getInteger(), "getNrOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__SetExtras__EList(), theTypesPackage.getInteger(), "setExtras", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "extras", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__SetRoomTypes__EList(), theTypesPackage.getInteger(), "setRoomTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__SetRoomIDs__EList(), theTypesPackage.getInteger(), "setRoomIDs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomIDs", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBooking__SetServices__EList(), theTypesPackage.getInteger(), "setServices", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "services", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__GenerateBookingRef(), theTypesPackage.getString(), "generateBookingRef", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBooking__GetExtras(), theTypesPackage.getString(), "getExtras", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBooking__GetRoomTypes(), theTypesPackage.getString(), "getRoomTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBooking__GetRoomIDs(), theTypesPackage.getInteger(), "getRoomIDs", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBooking__RemoveResponsibleGuestToAllRooms__String(), theTypesPackage.getInteger(), "removeResponsibleGuestToAllRooms", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "guestEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__RemoveResponsibleGuest__int_String(), theTypesPackage.getInteger(), "removeResponsibleGuest", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "guestEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomer_PaymentDetails(), this.getPaymentDetails(), null, "paymentDetails", null, 1, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Email(), theTypesPackage.getString(), "email", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_TelephoneNr(), theTypesPackage.getString(), "telephoneNr", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Address(), theTypesPackage.getString(), "Address", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Age(), theTypesPackage.getInteger(), "age", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(paymentDetailsEClass, PaymentDetails.class, "PaymentDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentDetails_CcNr(), theTypesPackage.getString(), "ccNr", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_CcV(), theTypesPackage.getString(), "ccV", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_ExpMonth(), theTypesPackage.getInteger(), "expMonth", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_ExpYear(), theTypesPackage.getInteger(), "expYear", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guestEClass, Guest.class, "Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuest_RoomNr(), theTypesPackage.getInteger(), "roomNr", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_GuestTypes(), this.getGuestTypes(), "guestTypes", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(extraToIsPayedEntryEClass, Map.Entry.class, "ExtraToIsPayedEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtraToIsPayedEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExtraToIsPayedEntry_Value(), ecorePackage.getEBooleanObject(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingHandlerEClass, BookingHandler.class, "BookingHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingHandler_BookingsMap(), this.getBookingRefToBookingEntry(), null, "bookingsMap", null, 0, -1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingHandler_RoomIDToBookingRefMap(), this.getRoomIDToBookingRefEntry(), null, "roomIDToBookingRefMap", null, 0, -1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBookingHandler__Exists__String(), theTypesPackage.getBoolean(), "exists", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__AddBooking__Booking(), theTypesPackage.getInteger(), "addBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__RemoveBooking__String(), theTypesPackage.getInteger(), "removeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__GetBooking__String(), this.getBooking(), "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__EditBooking__String_String_String_int_EList_EList_EList(), theTypesPackage.getInteger(), "editBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "extras", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "services", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__GetBooking__int(), this.getBooking(), "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomIDToBookingRefEntryEClass, Map.Entry.class, "RoomIDToBookingRefEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomIDToBookingRefEntry_Key(), ecorePackage.getEIntegerObject(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomIDToBookingRefEntry_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iBookingProvidesForHostEClass, IBookingProvidesForHost.class, "IBookingProvidesForHost", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBookingProvidesForHost__AddServiceNote__String_String(), theTypesPackage.getInteger(), "addServiceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForHost__RemoveServiceNote__String(), theTypesPackage.getInteger(), "removeServiceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForHost__GetServiceNotesOfBooking__String(), theTypesPackage.getString(), "getServiceNotesOfBooking", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForHost__EditServiceNoteDescription__String_String(), theTypesPackage.getInteger(), "editServiceNoteDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookingProvidesForHost__GetServiceNotes(), theTypesPackage.getString(), "getServiceNotes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForHost__GetServiceNoteDescription__String(), theTypesPackage.getString(), "getServiceNoteDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForHost__IsPayed__String(), theTypesPackage.getBoolean(), "isPayed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBookingProvidesForCustomerEClass, IBookingProvidesForCustomer.class, "IBookingProvidesForCustomer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBookingProvidesForCustomer__PayBooking__String(), theTypesPackage.getInteger(), "payBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__GetPrice__String(), theTypesPackage.getInteger(), "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__RemoveBooking__String(), theTypesPackage.getInteger(), "removeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__EditBooking__String_String_String_int_EList_EList_EList(), theTypesPackage.getInteger(), "editBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "extras", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "services", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__SetPaymentMethod__String_String(), theTypesPackage.getInteger(), "setPaymentMethod", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "method", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__SetPaymentDetails__String_String_int_int_String_String_String_String(), theTypesPackage.getInteger(), "setPaymentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__SetPersonalDetails__String_String_int_String_String(), theTypesPackage.getInteger(), "setPersonalDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "age", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__Book__String_String_int_EList_EList_EList(), theTypesPackage.getString(), "book", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "extras", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "services", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBookingProvidesForGuestEClass, IBookingProvidesForGuest.class, "IBookingProvidesForGuest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBookingProvidesForGuest__CheckIn__String_String_String(), theTypesPackage.getInteger(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "guestEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForGuest__CheckOut__int_String(), theTypesPackage.getInteger(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "guestEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForGuest__PayExtra__String_String_int_int_String_String_EList_int(), theTypesPackage.getInteger(), "payExtra", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "expMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "expYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "extra", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForGuest__PayRoom__String_String_int_int_String_String_int(), theTypesPackage.getInteger(), "payRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "expMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "expYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingProvidesEClass, BookingProvides.class, "BookingProvides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingProvides_BookingHandler(), this.getBookingHandler(), null, "bookingHandler", null, 1, 1, BookingProvides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingProvides_ServiceNoteHandler(), this.getServiceNoteHandler(), null, "serviceNoteHandler", null, 1, 1, BookingProvides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBookingProvides__StringToList__String(), theTypesPackage.getString(), "stringToList", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "text", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(serviceNoteHandlerEClass, ServiceNoteHandler.class, "ServiceNoteHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceNoteHandler_ServiceNoteMap(), this.getServiceNoteToDescriptionEntry(), null, "serviceNoteMap", null, 0, -1, ServiceNoteHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getServiceNoteHandler__Exists__String(), theTypesPackage.getBoolean(), "exists", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getServiceNoteHandler__AddServiceNote__String_String(), theTypesPackage.getInteger(), "addServiceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getServiceNoteHandler__RemoveServiceNote__String(), theTypesPackage.getInteger(), "removeServiceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getServiceNoteHandler__GetServiceNoteDescription__String(), theTypesPackage.getString(), "getServiceNoteDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getServiceNoteHandler__EditServiceNoteDescription__String_String(), theTypesPackage.getInteger(), "editServiceNoteDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getServiceNoteHandler__GetServices(), null, "getServices", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(serviceNoteToDescriptionEntryEClass, Map.Entry.class, "ServiceNoteToDescriptionEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceNoteToDescriptionEntry_Key(), theTypesPackage.getString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceNoteToDescriptionEntry_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(guestTypesEEnum, GuestTypes.class, "GuestTypes");
		addEEnumLiteral(guestTypesEEnum, GuestTypes.REGULAR);
		addEEnumLiteral(guestTypesEEnum, GuestTypes.BLACK_LISTED);
		addEEnumLiteral(guestTypesEEnum, GuestTypes.VIP);

		initEEnum(paymentMethodEEnum, PaymentMethod.class, "PaymentMethod");
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.BANKCARD);
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.CASH);
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.VOUCHER);

		// Create resource
		createResource(eNS_URI);
	}

} //BookingmodelPackageImpl
