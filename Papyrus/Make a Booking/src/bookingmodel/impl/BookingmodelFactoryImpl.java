/**
 */
package bookingmodel.impl;

import bookingmodel.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingmodelFactoryImpl extends EFactoryImpl implements BookingmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookingmodelFactory init() {
		try {
			BookingmodelFactory theBookingmodelFactory = (BookingmodelFactory)EPackage.Registry.INSTANCE.getEFactory(BookingmodelPackage.eNS_URI);
			if (theBookingmodelFactory != null) {
				return theBookingmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BookingmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BookingmodelPackage.ROOM_TO_GUEST_ID_ENTRY: return (EObject)createRoomToGuestIDEntry();
			case BookingmodelPackage.ROOM_TYPE_TO_ROOM_ID_ENTRY: return (EObject)createRoomTypeToRoomIDEntry();
			case BookingmodelPackage.BOOKING_REF_TO_BOOKING_ENTRY: return (EObject)createBookingRefToBookingEntry();
			case BookingmodelPackage.BOOKING: return createBooking();
			case BookingmodelPackage.CUSTOMER: return createCustomer();
			case BookingmodelPackage.PAYMENT_DETAILS: return createPaymentDetails();
			case BookingmodelPackage.GUEST: return createGuest();
			case BookingmodelPackage.EXTRA_TO_IS_PAYED_ENTRY: return (EObject)createExtraToIsPayedEntry();
			case BookingmodelPackage.BOOKING_HANDLER: return createBookingHandler();
			case BookingmodelPackage.BOOKING_PROVIDES: return createBookingProvides();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BookingmodelPackage.GUEST_TYPES:
				return createGuestTypesFromString(eDataType, initialValue);
			case BookingmodelPackage.PAYMENT_METHOD:
				return createPaymentMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BookingmodelPackage.GUEST_TYPES:
				return convertGuestTypesToString(eDataType, instanceValue);
			case BookingmodelPackage.PAYMENT_METHOD:
				return convertPaymentMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Integer, String> createRoomToGuestIDEntry() {
		RoomToGuestIDEntryImpl roomToGuestIDEntry = new RoomToGuestIDEntryImpl();
		return roomToGuestIDEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Integer> createRoomTypeToRoomIDEntry() {
		RoomTypeToRoomIDEntryImpl roomTypeToRoomIDEntry = new RoomTypeToRoomIDEntryImpl();
		return roomTypeToRoomIDEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Booking> createBookingRefToBookingEntry() {
		BookingRefToBookingEntryImpl bookingRefToBookingEntry = new BookingRefToBookingEntryImpl();
		return bookingRefToBookingEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails createPaymentDetails() {
		PaymentDetailsImpl paymentDetails = new PaymentDetailsImpl();
		return paymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest createGuest() {
		GuestImpl guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Boolean> createExtraToIsPayedEntry() {
		ExtraToIsPayedEntryImpl extraToIsPayedEntry = new ExtraToIsPayedEntryImpl();
		return extraToIsPayedEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler createBookingHandler() {
		BookingHandlerImpl bookingHandler = new BookingHandlerImpl();
		return bookingHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingProvides createBookingProvides() {
		BookingProvidesImpl bookingProvides = new BookingProvidesImpl();
		return bookingProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestTypes createGuestTypesFromString(EDataType eDataType, String initialValue) {
		GuestTypes result = GuestTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuestTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod createPaymentMethodFromString(EDataType eDataType, String initialValue) {
		PaymentMethod result = PaymentMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingmodelPackage getBookingmodelPackage() {
		return (BookingmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BookingmodelPackage getPackage() {
		return BookingmodelPackage.eINSTANCE;
	}

} //BookingmodelFactoryImpl
