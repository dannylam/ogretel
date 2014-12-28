/**
 */
package bookingmodel.util;

import bookingmodel.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bookingmodel.BookingmodelPackage
 * @generated
 */
public class BookingmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BookingmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BookingmodelPackage.eINSTANCE;
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
	protected BookingmodelSwitch<Adapter> modelSwitch =
		new BookingmodelSwitch<Adapter>() {
			@Override
			public Adapter caseRoomtypeToGuestIDEntry(Map.Entry<String, String> object) {
				return createRoomtypeToGuestIDEntryAdapter();
			}
			@Override
			public Adapter caseNrToRoomEntry(Map.Entry<String, Integer> object) {
				return createNrToRoomEntryAdapter();
			}
			@Override
			public Adapter caseBookingRefToBookingEntry(Map.Entry<String, Booking> object) {
				return createBookingRefToBookingEntryAdapter();
			}
			@Override
			public Adapter caseBooking(Booking object) {
				return createBookingAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter casePaymentDetails(PaymentDetails object) {
				return createPaymentDetailsAdapter();
			}
			@Override
			public Adapter caseGuest(Guest object) {
				return createGuestAdapter();
			}
			@Override
			public Adapter caseExtraToIsPayedEntry(Map.Entry<String, Boolean> object) {
				return createExtraToIsPayedEntryAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseBookingHandler(BookingHandler object) {
				return createBookingHandlerAdapter();
			}
			@Override
			public Adapter caseIBookingProvidesForHost(IBookingProvidesForHost object) {
				return createIBookingProvidesForHostAdapter();
			}
			@Override
			public Adapter caseIBookingProvidesForCustomer(IBookingProvidesForCustomer object) {
				return createIBookingProvidesForCustomerAdapter();
			}
			@Override
			public Adapter caseIBookingProvidesForGuest(IBookingProvidesForGuest object) {
				return createIBookingProvidesForGuestAdapter();
			}
			@Override
			public Adapter caseBookingProvides(BookingProvides object) {
				return createBookingProvidesAdapter();
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
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Roomtype To Guest ID Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createRoomtypeToGuestIDEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Nr To Room Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createNrToRoomEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Booking Ref To Booking Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createBookingRefToBookingEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bookingmodel.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bookingmodel.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bookingmodel.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bookingmodel.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bookingmodel.PaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bookingmodel.PaymentDetails
	 * @generated
	 */
	public Adapter createPaymentDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bookingmodel.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bookingmodel.Guest
	 * @generated
	 */
	public Adapter createGuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Extra To Is Payed Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createExtraToIsPayedEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bookingmodel.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bookingmodel.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bookingmodel.BookingHandler <em>Booking Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bookingmodel.BookingHandler
	 * @generated
	 */
	public Adapter createBookingHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bookingmodel.IBookingProvidesForHost <em>IBooking Provides For Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bookingmodel.IBookingProvidesForHost
	 * @generated
	 */
	public Adapter createIBookingProvidesForHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bookingmodel.IBookingProvidesForCustomer <em>IBooking Provides For Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bookingmodel.IBookingProvidesForCustomer
	 * @generated
	 */
	public Adapter createIBookingProvidesForCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bookingmodel.IBookingProvidesForGuest <em>IBooking Provides For Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bookingmodel.IBookingProvidesForGuest
	 * @generated
	 */
	public Adapter createIBookingProvidesForGuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bookingmodel.BookingProvides <em>Booking Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bookingmodel.BookingProvides
	 * @generated
	 */
	public Adapter createBookingProvidesAdapter() {
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

} //BookingmodelAdapterFactory
