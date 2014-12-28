/**
 */
package bookingmodel;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.Booking#getBookingRef <em>Booking Ref</em>}</li>
 *   <li>{@link bookingmodel.Booking#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link bookingmodel.Booking#getEndDate <em>End Date</em>}</li>
 *   <li>{@link bookingmodel.Booking#getServiceNotes <em>Service Notes</em>}</li>
 *   <li>{@link bookingmodel.Booking#getNrOfGuests <em>Nr Of Guests</em>}</li>
 *   <li>{@link bookingmodel.Booking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link bookingmodel.Booking#getGuestList <em>Guest List</em>}</li>
 *   <li>{@link bookingmodel.Booking#isIsPayed <em>Is Payed</em>}</li>
 *   <li>{@link bookingmodel.Booking#getRoomIDToGuestMap <em>Room ID To Guest Map</em>}</li>
 *   <li>{@link bookingmodel.Booking#getRoomTypeToRoomIDMap <em>Room Type To Room ID Map</em>}</li>
 *   <li>{@link bookingmodel.Booking#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link bookingmodel.Booking#getExtraToIsPayedMap <em>Extra To Is Payed Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.BookingmodelPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Ref</em>' attribute.
	 * @see #setBookingRef(String)
	 * @see bookingmodel.BookingmodelPackage#getBooking_BookingRef()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBookingRef();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getBookingRef <em>Booking Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Ref</em>' attribute.
	 * @see #getBookingRef()
	 * @generated
	 */
	void setBookingRef(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see bookingmodel.BookingmodelPackage#getBooking_StartDate()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see bookingmodel.BookingmodelPackage#getBooking_EndDate()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * Returns the value of the '<em><b>Service Notes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Notes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Notes</em>' attribute list.
	 * @see bookingmodel.BookingmodelPackage#getBooking_ServiceNotes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getServiceNotes();

	/**
	 * Returns the value of the '<em><b>Nr Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Of Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Guests</em>' attribute.
	 * @see #setNrOfGuests(int)
	 * @see bookingmodel.BookingmodelPackage#getBooking_NrOfGuests()
	 * @model dataType="types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNrOfGuests();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getNrOfGuests <em>Nr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Guests</em>' attribute.
	 * @see #getNrOfGuests()
	 * @generated
	 */
	void setNrOfGuests(int value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see bookingmodel.BookingmodelPackage#getBooking_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getCustomer <em>Customer</em>}' reference.
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest List</em>' reference list.
	 * @see bookingmodel.BookingmodelPackage#getBooking_GuestList()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Guest> getGuestList();

	/**
	 * Returns the value of the '<em><b>Is Payed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Payed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Payed</em>' attribute.
	 * @see #setIsPayed(boolean)
	 * @see bookingmodel.BookingmodelPackage#getBooking_IsPayed()
	 * @model dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsPayed();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#isIsPayed <em>Is Payed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Payed</em>' attribute.
	 * @see #isIsPayed()
	 * @generated
	 */
	void setIsPayed(boolean value);

	/**
	 * Returns the value of the '<em><b>Room ID To Guest Map</b></em>' map.
	 * The key is of type {@link java.lang.Integer},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room ID To Guest Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room ID To Guest Map</em>' map.
	 * @see bookingmodel.BookingmodelPackage#getBooking_RoomIDToGuestMap()
	 * @model mapType="bookingmodel.RoomToGuestIDEntry<org.eclipse.emf.ecore.EIntegerObject, org.eclipse.emf.ecore.EString>" ordered="false"
	 * @generated
	 */
	EMap<Integer, String> getRoomIDToGuestMap();

	/**
	 * Returns the value of the '<em><b>Room Type To Room ID Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type To Room ID Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type To Room ID Map</em>' map.
	 * @see bookingmodel.BookingmodelPackage#getBooking_RoomTypeToRoomIDMap()
	 * @model mapType="bookingmodel.RoomTypeToRoomIDEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>" ordered="false"
	 * @generated
	 */
	EMap<String, Integer> getRoomTypeToRoomIDMap();

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' attribute.
	 * The literals are from the enumeration {@link bookingmodel.PaymentMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' attribute.
	 * @see bookingmodel.PaymentMethod
	 * @see #setPaymentMethod(PaymentMethod)
	 * @see bookingmodel.BookingmodelPackage#getBooking_PaymentMethod()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * Sets the value of the '{@link bookingmodel.Booking#getPaymentMethod <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' attribute.
	 * @see bookingmodel.PaymentMethod
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Extra To Is Payed Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Boolean},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra To Is Payed Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra To Is Payed Map</em>' map.
	 * @see bookingmodel.BookingmodelPackage#getBooking_ExtraToIsPayedMap()
	 * @model mapType="bookingmodel.ExtraToIsPayedEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EBooleanObject>" ordered="false"
	 * @generated
	 */
	EMap<String, Boolean> getExtraToIsPayedMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean checkedInAllGuest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean checkedInAGuest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated
	 */
	int setResponsibleGuest(int roomID, String guestEmail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNrOfRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" extrasDataType="types.String" extrasMany="true" extrasOrdered="false"
	 * @generated
	 */
	int setExtras(List<String> extras);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" roomTypesDataType="types.String" roomTypesMany="true" roomTypesOrdered="false"
	 * @generated
	 */
	int setRoomTypes(List<String> roomTypes);

} // Booking
