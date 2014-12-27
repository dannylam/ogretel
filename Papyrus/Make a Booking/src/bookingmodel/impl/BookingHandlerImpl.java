/**
 */
package bookingmodel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import bookingmodel.Booking;
import bookingmodel.BookingHandler;
import bookingmodel.ModelPackage;

/**
 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
 * <!-- begin-user-doc -->
 * An implementation of the maintenancemodel object '<em><b>Booking Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bookingmodel.impl.BookingHandlerImpl#getBookingsMap <em>Bookings Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingHandlerImpl extends MinimalEObjectImpl.Container implements BookingHandler {
	/**
	 * The cached value of the '{@link #getBookingsMap() <em>Bookings Map</em>}' map.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingsMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Booking> bookingsMap;

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingHandlerImpl() {
		super();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOOKING_HANDLER;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Booking> getBookingsMap() {
		if (bookingsMap == null) {
			bookingsMap = new EcoreEMap<String,Booking>(ModelPackage.Literals.BOOKING_REF_TO_BOOKING_ENTRY, bookingRefToBookingEntryImpl.class, this, ModelPackage.BOOKING_HANDLER__BOOKINGS_MAP);
		}
		return bookingsMap;
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean exists(String bookingRef) {
		return this.bookingsMap.containsKey(bookingRef);
		//TODO: Lägga till try-catch och fånga exceptions på ett lämpligt sätt.
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addBooking(Booking booking) {
		this.bookingsMap.put(booking.getBookingRef(), booking);
		//TODO: Lägga till try-catch och fånga exceptions på ett lämpligt sätt.
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeBooking(Booking booking) {
		this.bookingsMap.remove(booking);
		//TODO: Lägga till try-catch och fånga exceptions på ett lämpligt sätt.
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking getBooking(String bookingRef) {
		return this.bookingsMap.get(bookingRef);
		//TODO: Lägga till try-catch och fånga exceptions på ett lämpligt sätt.
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
	}

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editBooking(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras, String bookingRef) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
				return ((InternalEList<?>)getBookingsMap()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
				if (coreType) return getBookingsMap();
				else return getBookingsMap().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
				((EStructuralFeature.Setting)getBookingsMap()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
				getBookingsMap().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
				return bookingsMap != null && !bookingsMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.BOOKING_HANDLER___EXISTS__STRING:
				return exists((String)arguments.get(0));
			case ModelPackage.BOOKING_HANDLER___ADD_BOOKING__BOOKING:
				addBooking((Booking)arguments.get(0));
				return null;
			case ModelPackage.BOOKING_HANDLER___REMOVE_BOOKING__BOOKING:
				removeBooking((Booking)arguments.get(0));
				return null;
			case ModelPackage.BOOKING_HANDLER___GET_BOOKING__STRING:
				return getBooking((String)arguments.get(0));
			case ModelPackage.BOOKING_PROVIDES___EDIT_BOOKING__INT_INT_STRING_INT_STRING_STRING_STRING:
				editBooking((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingHandlerImpl
