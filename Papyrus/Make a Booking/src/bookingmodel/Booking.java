/**
 */
package bookingmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.Booking#getBookingRef <em>Booking Ref</em>}</li>
 *   <li>{@link bookingmodel.Booking#getDate <em>Date</em>}</li>
 *   <li>{@link bookingmodel.Booking#getNrOfNights <em>Nr Of Nights</em>}</li>
 *   <li>{@link bookingmodel.Booking#getExtraList <em>Extra List</em>}</li>
 *   <li>{@link bookingmodel.Booking#getServiceNotes <em>Service Notes</em>}</li>
 *   <li>{@link bookingmodel.Booking#getNrOfGuests <em>Nr Of Guests</em>}</li>
 *   <li>{@link bookingmodel.Booking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link bookingmodel.Booking#getGuestList <em>Guest List</em>}</li>
 *   <li>{@link bookingmodel.Booking#isPayed <em>Is Payed</em>}</li>
 *   <li>{@link bookingmodel.Booking#getRoomGuestMap <em>Room Guest Map</em>}</li>
 *   <li>{@link bookingmodel.Booking#getRoomTypeMap <em>Room Type Map</em>}</li>
 *   <li>{@link bookingmodel.Booking#getPaymentMethod <em>Payment Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.ModelPackage#getBooking()
 * @maintenancemodel
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking Ref</b></em>' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Ref</em>' attribute.
	 * @see #setBookingRef(String)
	 * @see bookingmodel.ModelPackage#getBooking_BookingRef()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBookingRef();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getBookingRef <em>Booking Ref</em>}' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Ref</em>' attribute.
	 * @see #getBookingRef()
	 * @generated
	 */
	void setBookingRef(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see bookingmodel.ModelPackage#getBooking_Date()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getDate <em>Date</em>}' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Nr Of Nights</b></em>' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Of Nights</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Nights</em>' attribute.
	 * @see #setNrOfNights(int)
	 * @see bookingmodel.ModelPackage#getBooking_NrOfNights()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNrOfNights();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getNrOfNights <em>Nr Of Nights</em>}' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Nights</em>' attribute.
	 * @see #getNrOfNights()
	 * @generated
	 */
	void setNrOfNights(int value);

	/**
	 * Returns the value of the '<em><b>Extra List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra List</em>' attribute list.
	 * @see bookingmodel.ModelPackage#getBooking_ExtraList()
	 * @maintenancemodel ordered="false"
	 * @generated
	 */
	EList<String> getExtraList();

	/**
	 * Returns the value of the '<em><b>Service Notes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Notes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Notes</em>' attribute list.
	 * @see bookingmodel.ModelPackage#getBooking_ServiceNotes()
	 * @maintenancemodel ordered="false"
	 * @generated
	 */
	EList<String> getServiceNotes();

	/**
	 * Returns the value of the '<em><b>Nr Of Guests</b></em>' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Of Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Guests</em>' attribute.
	 * @see #setNrOfGuests(int)
	 * @see bookingmodel.ModelPackage#getBooking_NrOfGuests()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNrOfGuests();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getNrOfGuests <em>Nr Of Guests</em>}' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Guests</em>' attribute.
	 * @see #getNrOfGuests()
	 * @generated
	 */
	void setNrOfGuests(int value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see bookingmodel.ModelPackage#getBooking_Customer()
	 * @maintenancemodel required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getCustomer <em>Customer</em>}' reference.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Guest List</b></em>' reference list.
	 * The list contents are of type {@link bookingmodel.Guest}.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest List</em>' reference list.
	 * @see bookingmodel.ModelPackage#getBooking_GuestList()
	 * @maintenancemodel required="true" ordered="false"
	 * @generated
	 */
	EList<Guest> getGuestList();

	/**
	 * Returns the value of the '<em><b>Is Payed</b></em>' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Payed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Payed</em>' attribute.
	 * @see #setIsPayed(boolean)
	 * @see bookingmodel.ModelPackage#getBooking_IsPayed()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPayed();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#isPayed <em>Is Payed</em>}' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Payed</em>' attribute.
	 * @see #isPayed()
	 * @generated
	 */
	void setIsPayed(boolean value);

	/**
	 * Returns the value of the '<em><b>Room Guest Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Guest Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Guest Map</em>' map.
	 * @see bookingmodel.ModelPackage#getBooking_RoomGuestMap()
	 * @maintenancemodel mapType="maintenancemodel.RoomtypeToGuestIDEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" ordered="false"
	 * @generated
	 */
	EMap<String, String> getRoomGuestMap();

	/**
	 * Returns the value of the '<em><b>Room Type Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type Map</em>' map.
	 * @see bookingmodel.ModelPackage#getBooking_RoomTypeMap()
	 * @maintenancemodel mapType="maintenancemodel.NrToRoomEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>" ordered="false"
	 * @generated
	 */
	EMap<String, Integer> getRoomTypeMap();

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' attribute.
	 * The literals are from the enumeration {@link bookingmodel.PaymentMethod}.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' attribute.
	 * @see bookingmodel.PaymentMethod
	 * @see #setPaymentMethod(PaymentMethod)
	 * @see bookingmodel.ModelPackage#getBooking_PaymentMethod()
	 * @maintenancemodel required="true" ordered="false"
	 * @generated
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getPaymentMethod <em>Payment Method</em>}' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' attribute.
	 * @see bookingmodel.PaymentMethod
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(PaymentMethod value);

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean checkedInAllGuest();

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean checkedInAGuest();

} // Booking
