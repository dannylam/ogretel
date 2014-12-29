/**
 */
package bookingmodel.impl;

import bookingmodel.Booking;
import bookingmodel.BookingHandler;
import bookingmodel.BookingmodelPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Handler</b></em>'.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingsMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Booking> bookingsMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingmodelPackage.Literals.BOOKING_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Booking> getBookingsMap() {
		if (bookingsMap == null) {
			bookingsMap = new EcoreEMap<String,Booking>(BookingmodelPackage.Literals.BOOKING_REF_TO_BOOKING_ENTRY, BookingRefToBookingEntryImpl.class, this, BookingmodelPackage.BOOKING_HANDLER__BOOKINGS_MAP);
		}
		return bookingsMap;
	}

	/**
	 * TODO: javadoc
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean exists(String bookingRef) {
		return this.bookingsMap.containsKey(bookingRef);
		//TODO:check if correct
	}

	/**
	 * TODO: javadoc
	 * @return 
	 * @generated NOT
	 */
	public int addBooking(Booking booking) {
		int result = 0;
		this.bookingsMap.put(booking.getBookingRef(), booking);
		//TODO: check if correct
		return result;
	}

	/**
	 * TODO: javadoc
	 * @generated NOT
	 */
	public int removeBooking(String bookingRef) {
		int result = 0;
		if(this.exists(bookingRef)){
			this.bookingsMap.remove(getBooking(bookingRef));
		}	
		//TODO: check if correct
		return result;
	}

	/**
	 * TODO: javadoc
	 * @generated NOT
	 */
	public Booking getBooking(String bookingRef) {
		return this.bookingsMap.get(bookingRef);
		//TODO: check if correct
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int editBooking(String bookingRef, String startDate, String endDate, int nrOfGuests, List<String> roomTypes, List<String> extras) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int editBooking(String bookingRef, String startDate, String endDate, int nrOfGuests, String roomTypes, String extras) {
		int result = 0;
		// TODO: implement this method
		/*check which inparams which are null, these are not to be changed, and have their oldvalue
		 * then create a new booking with the old booking reference */
		 
			if(this.exists(bookingRef)) {			//kolla om booking ref finns
					
					this.getBooking(bookingRef).setStartDate(startDate);
					
					this.getBooking(bookingRef).setEndDate(endDate);
					
					this.getBooking(bookingRef).setNrOfGuests(nrOfGuests);
	
			//		this.getBooking(bookingRef).setRoomTypes(roomTypes);
					
			//		this.getBooking(bookingRef).setExtras(extras);
			}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BookingmodelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
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
			case BookingmodelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
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
			case BookingmodelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
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
			case BookingmodelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
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
			case BookingmodelPackage.BOOKING_HANDLER__BOOKINGS_MAP:
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
			case BookingmodelPackage.BOOKING_HANDLER___EXISTS__STRING:
				return exists((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_HANDLER___ADD_BOOKING__BOOKING:
				return addBooking((Booking)arguments.get(0));
			case BookingmodelPackage.BOOKING_HANDLER___REMOVE_BOOKING__STRING:
				return removeBooking((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_HANDLER___GET_BOOKING__STRING:
				return getBooking((String)arguments.get(0));
			case BookingmodelPackage.BOOKING_HANDLER___EDIT_BOOKING__STRING_STRING_STRING_INT_ELIST_ELIST:
				return editBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (List<String>)arguments.get(4), (List<String>)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingHandlerImpl
