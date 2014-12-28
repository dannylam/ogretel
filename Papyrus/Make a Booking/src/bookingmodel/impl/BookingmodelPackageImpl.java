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

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	private EClass roomtypeToGuestIDEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nrToRoomEntryEClass = null;

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
	public EClass getRoomtypeToGuestIDEntry() {
		return roomtypeToGuestIDEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomtypeToGuestIDEntry_Key() {
		return (EAttribute)roomtypeToGuestIDEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomtypeToGuestIDEntry_Value() {
		return (EAttribute)roomtypeToGuestIDEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNrToRoomEntry() {
		return nrToRoomEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNrToRoomEntry_Key() {
		return (EAttribute)nrToRoomEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNrToRoomEntry_Value() {
		return (EAttribute)nrToRoomEntryEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getBooking_Date() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_NrOfNights() {
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
	public EReference getBooking_RoomGuestMap() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_RoomTypeMap() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_PaymentMethod() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__CheckedInAllGuest() {
		return bookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__CheckedInAGuest() {
		return bookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__SetResponsibleGuest__String_String() {
		return bookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__GetNrOfRooms() {
		return bookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__SetExtras__EList() {
		return bookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__SetRoomTypes__EList() {
		return bookingEClass.getEOperations().get(5);
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
	public EOperation getBookingHandler__EditBooking__String_String_String_int_String_String() {
		return bookingHandlerEClass.getEOperations().get(4);
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
	public EOperation getIBookingProvidesForHost__EnableSelfManagement() {
		return iBookingProvidesForHostEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForHost__AddServiceNote__String() {
		return iBookingProvidesForHostEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForHost__EditServiceNote__String_String() {
		return iBookingProvidesForHostEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForHost__RemoveServiceNote__String() {
		return iBookingProvidesForHostEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForHost__GetServiceNotes__String() {
		return iBookingProvidesForHostEClass.getEOperations().get(4);
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
	public EOperation getIBookingProvidesForCustomer__GetBooking__String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__Pay__String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__GetPrice__String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__RemoveBooking__String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__EditBooking__String_String_String_int_String_String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__ChoosePaymentMethod__String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__SetPaymentDetails__String_String_int_int_String_String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__SetPersonalDetails__String_String_int_String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__SetCustomerToBooking__String_String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForCustomer__Book__String_String_int_String_String() {
		return iBookingProvidesForCustomerEClass.getEOperations().get(9);
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
	public EOperation getIBookingProvidesForGuest__CheckIn__String_String() {
		return iBookingProvidesForGuestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForGuest__CheckOut__String_String() {
		return iBookingProvidesForGuestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingProvidesForGuest__Pay__String_String_int_int_String_String() {
		return iBookingProvidesForGuestEClass.getEOperations().get(2);
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
	public EOperation getBookingProvides__StringToList__String() {
		return bookingProvidesEClass.getEOperations().get(0);
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
		roomtypeToGuestIDEntryEClass = createEClass(ROOMTYPE_TO_GUEST_ID_ENTRY);
		createEAttribute(roomtypeToGuestIDEntryEClass, ROOMTYPE_TO_GUEST_ID_ENTRY__KEY);
		createEAttribute(roomtypeToGuestIDEntryEClass, ROOMTYPE_TO_GUEST_ID_ENTRY__VALUE);

		nrToRoomEntryEClass = createEClass(NR_TO_ROOM_ENTRY);
		createEAttribute(nrToRoomEntryEClass, NR_TO_ROOM_ENTRY__KEY);
		createEAttribute(nrToRoomEntryEClass, NR_TO_ROOM_ENTRY__VALUE);

		bookingRefToBookingEntryEClass = createEClass(BOOKING_REF_TO_BOOKING_ENTRY);
		createEAttribute(bookingRefToBookingEntryEClass, BOOKING_REF_TO_BOOKING_ENTRY__KEY);
		createEReference(bookingRefToBookingEntryEClass, BOOKING_REF_TO_BOOKING_ENTRY__VALUE);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__BOOKING_REF);
		createEAttribute(bookingEClass, BOOKING__DATE);
		createEAttribute(bookingEClass, BOOKING__NR_OF_NIGHTS);
		createEAttribute(bookingEClass, BOOKING__SERVICE_NOTES);
		createEAttribute(bookingEClass, BOOKING__NR_OF_GUESTS);
		createEReference(bookingEClass, BOOKING__CUSTOMER);
		createEReference(bookingEClass, BOOKING__GUEST_LIST);
		createEAttribute(bookingEClass, BOOKING__IS_PAYED);
		createEReference(bookingEClass, BOOKING__ROOM_GUEST_MAP);
		createEReference(bookingEClass, BOOKING__ROOM_TYPE_MAP);
		createEAttribute(bookingEClass, BOOKING__PAYMENT_METHOD);
		createEOperation(bookingEClass, BOOKING___CHECKED_IN_ALL_GUEST);
		createEOperation(bookingEClass, BOOKING___CHECKED_IN_AGUEST);
		createEOperation(bookingEClass, BOOKING___SET_RESPONSIBLE_GUEST__STRING_STRING);
		createEOperation(bookingEClass, BOOKING___GET_NR_OF_ROOMS);
		createEOperation(bookingEClass, BOOKING___SET_EXTRAS__ELIST);
		createEOperation(bookingEClass, BOOKING___SET_ROOM_TYPES__ELIST);

		customerEClass = createEClass(CUSTOMER);
		createEReference(customerEClass, CUSTOMER__PAYMENT_DETAILS);

		paymentDetailsEClass = createEClass(PAYMENT_DETAILS);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__CC_NR);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__CC_V);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__EXP_MONTH);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__EXP_YEAR);

		guestEClass = createEClass(GUEST);
		createEAttribute(guestEClass, GUEST__ROOM_NR);
		createEAttribute(guestEClass, GUEST__GUEST_TYPES);

		extraToIsPayedEntryEClass = createEClass(EXTRA_TO_IS_PAYED_ENTRY);
		createEAttribute(extraToIsPayedEntryEClass, EXTRA_TO_IS_PAYED_ENTRY__KEY);
		createEAttribute(extraToIsPayedEntryEClass, EXTRA_TO_IS_PAYED_ENTRY__VALUE);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEAttribute(personEClass, PERSON__LAST_NAME);
		createEAttribute(personEClass, PERSON__EMAIL);
		createEAttribute(personEClass, PERSON__TELEPHONE_NR);
		createEAttribute(personEClass, PERSON__ADDRESS);

		bookingHandlerEClass = createEClass(BOOKING_HANDLER);
		createEReference(bookingHandlerEClass, BOOKING_HANDLER__BOOKINGS_MAP);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___EXISTS__STRING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___ADD_BOOKING__BOOKING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___REMOVE_BOOKING__STRING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___GET_BOOKING__STRING);
		createEOperation(bookingHandlerEClass, BOOKING_HANDLER___EDIT_BOOKING__STRING_STRING_STRING_INT_STRING_STRING);

		iBookingProvidesForHostEClass = createEClass(IBOOKING_PROVIDES_FOR_HOST);
		createEOperation(iBookingProvidesForHostEClass, IBOOKING_PROVIDES_FOR_HOST___ENABLE_SELF_MANAGEMENT);
		createEOperation(iBookingProvidesForHostEClass, IBOOKING_PROVIDES_FOR_HOST___ADD_SERVICE_NOTE__STRING);
		createEOperation(iBookingProvidesForHostEClass, IBOOKING_PROVIDES_FOR_HOST___EDIT_SERVICE_NOTE__STRING_STRING);
		createEOperation(iBookingProvidesForHostEClass, IBOOKING_PROVIDES_FOR_HOST___REMOVE_SERVICE_NOTE__STRING);
		createEOperation(iBookingProvidesForHostEClass, IBOOKING_PROVIDES_FOR_HOST___GET_SERVICE_NOTES__STRING);

		iBookingProvidesForCustomerEClass = createEClass(IBOOKING_PROVIDES_FOR_CUSTOMER);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___GET_BOOKING__STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___PAY__STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___GET_PRICE__STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___REMOVE_BOOKING__STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___EDIT_BOOKING__STRING_STRING_STRING_INT_STRING_STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___CHOOSE_PAYMENT_METHOD__STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___SET_PAYMENT_DETAILS__STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___SET_PERSONAL_DETAILS__STRING_STRING_INT_STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___SET_CUSTOMER_TO_BOOKING__STRING_STRING);
		createEOperation(iBookingProvidesForCustomerEClass, IBOOKING_PROVIDES_FOR_CUSTOMER___BOOK__STRING_STRING_INT_STRING_STRING);

		iBookingProvidesForGuestEClass = createEClass(IBOOKING_PROVIDES_FOR_GUEST);
		createEOperation(iBookingProvidesForGuestEClass, IBOOKING_PROVIDES_FOR_GUEST___CHECK_IN__STRING_STRING);
		createEOperation(iBookingProvidesForGuestEClass, IBOOKING_PROVIDES_FOR_GUEST___CHECK_OUT__STRING_STRING);
		createEOperation(iBookingProvidesForGuestEClass, IBOOKING_PROVIDES_FOR_GUEST___PAY__STRING_STRING_INT_INT_STRING_STRING);

		bookingProvidesEClass = createEClass(BOOKING_PROVIDES);
		createEReference(bookingProvidesEClass, BOOKING_PROVIDES__BOOKING_HANDLER);
		createEOperation(bookingProvidesEClass, BOOKING_PROVIDES___STRING_TO_LIST__STRING);

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
		initEClass(roomtypeToGuestIDEntryEClass, Map.Entry.class, "RoomtypeToGuestIDEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomtypeToGuestIDEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomtypeToGuestIDEntry_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nrToRoomEntryEClass, Map.Entry.class, "NrToRoomEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNrToRoomEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNrToRoomEntry_Value(), ecorePackage.getEIntegerObject(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingRefToBookingEntryEClass, Map.Entry.class, "BookingRefToBookingEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookingRefToBookingEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingRefToBookingEntry_Value(), this.getBooking(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_BookingRef(), theTypesPackage.getString(), "bookingRef", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Date(), theTypesPackage.getString(), "date", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_NrOfNights(), theTypesPackage.getInteger(), "nrOfNights", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_ServiceNotes(), ecorePackage.getEString(), "serviceNotes", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_NrOfGuests(), theTypesPackage.getInteger(), "nrOfGuests", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Customer(), this.getCustomer(), null, "customer", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_GuestList(), this.getGuest(), null, "guestList", null, 1, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_IsPayed(), theTypesPackage.getBoolean(), "isPayed", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_RoomGuestMap(), this.getRoomtypeToGuestIDEntry(), null, "roomGuestMap", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_RoomTypeMap(), this.getNrToRoomEntry(), null, "roomTypeMap", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_PaymentMethod(), this.getPaymentMethod(), "paymentMethod", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBooking__CheckedInAllGuest(), theTypesPackage.getBoolean(), "checkedInAllGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__CheckedInAGuest(), theTypesPackage.getBoolean(), "checkedInAGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getBooking__SetResponsibleGuest__String_String(), theTypesPackage.getInteger(), "setResponsibleGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "guestEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__GetNrOfRooms(), theTypesPackage.getInteger(), "getNrOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__SetExtras__EList(), theTypesPackage.getInteger(), "setExtras", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "extras", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__SetRoomTypes__EList(), theTypesPackage.getInteger(), "setRoomTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "extras", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomer_PaymentDetails(), this.getPaymentDetails(), null, "paymentDetails", null, 1, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(paymentDetailsEClass, PaymentDetails.class, "PaymentDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentDetails_CcNr(), theTypesPackage.getString(), "ccNr", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_CcV(), theTypesPackage.getString(), "ccV", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_ExpMonth(), theTypesPackage.getInteger(), "expMonth", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_ExpYear(), theTypesPackage.getInteger(), "expYear", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guestEClass, Guest.class, "Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuest_RoomNr(), theTypesPackage.getInteger(), "roomNr", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_GuestTypes(), this.getGuestTypes(), "guestTypes", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(extraToIsPayedEntryEClass, Map.Entry.class, "ExtraToIsPayedEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtraToIsPayedEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExtraToIsPayedEntry_Value(), ecorePackage.getEBooleanObject(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Email(), theTypesPackage.getString(), "email", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_TelephoneNr(), theTypesPackage.getString(), "telephoneNr", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Address(), theTypesPackage.getString(), "Address", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingHandlerEClass, BookingHandler.class, "BookingHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingHandler_BookingsMap(), this.getBookingRefToBookingEntry(), null, "bookingsMap", null, 0, -1, BookingHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBookingHandler__Exists__String(), theTypesPackage.getBoolean(), "exists", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__AddBooking__Booking(), theTypesPackage.getInteger(), "addBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__RemoveBooking__String(), theTypesPackage.getInteger(), "removeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__GetBooking__String(), this.getBooking(), "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingHandler__EditBooking__String_String_String_int_String_String(), theTypesPackage.getInteger(), "editBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "extras", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBookingProvidesForHostEClass, IBookingProvidesForHost.class, "IBookingProvidesForHost", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIBookingProvidesForHost__EnableSelfManagement(), theTypesPackage.getInteger(), "enableSelfManagement", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForHost__AddServiceNote__String(), theTypesPackage.getInteger(), "addServiceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForHost__EditServiceNote__String_String(), theTypesPackage.getInteger(), "editServiceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "oldServiceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "newServiceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForHost__RemoveServiceNote__String(), theTypesPackage.getInteger(), "removeServiceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceNote", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForHost__GetServiceNotes__String(), theTypesPackage.getString(), "getServiceNotes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBookingProvidesForCustomerEClass, IBookingProvidesForCustomer.class, "IBookingProvidesForCustomer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBookingProvidesForCustomer__GetBooking__String(), this.getBooking(), "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__Pay__String(), theTypesPackage.getInteger(), "pay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__GetPrice__String(), theTypesPackage.getInteger(), "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__RemoveBooking__String(), theTypesPackage.getInteger(), "removeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__EditBooking__String_String_String_int_String_String(), theTypesPackage.getInteger(), "editBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "extras", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__ChoosePaymentMethod__String(), theTypesPackage.getInteger(), "choosePaymentMethod", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "method", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__SetPaymentDetails__String_String_int_int_String_String(), theTypesPackage.getInteger(), "setPaymentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__SetPersonalDetails__String_String_int_String(), theTypesPackage.getInteger(), "setPersonalDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "age", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__SetCustomerToBooking__String_String(), theTypesPackage.getInteger(), "setCustomerToBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "customerEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForCustomer__Book__String_String_int_String_String(), theTypesPackage.getInteger(), "book", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "extras", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBookingProvidesForGuestEClass, IBookingProvidesForGuest.class, "IBookingProvidesForGuest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBookingProvidesForGuest__CheckIn__String_String(), theTypesPackage.getInteger(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "guestEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForGuest__CheckOut__String_String(), theTypesPackage.getInteger(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookingRef", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "guestEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingProvidesForGuest__Pay__String_String_int_int_String_String(), theTypesPackage.getInteger(), "pay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "expMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "expYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingProvidesEClass, BookingProvides.class, "BookingProvides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingProvides_BookingHandler(), this.getBookingHandler(), null, "bookingHandler", null, 1, 1, BookingProvides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBookingProvides__StringToList__String(), theTypesPackage.getString(), "stringToList", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "text", 1, 1, IS_UNIQUE, !IS_ORDERED);

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