/**
 */
package model;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * key; Roomtype: String
 * value; GuestEmail: String
 * value is "out" when a room which has previously 
 * been checked-in is checked-out in a specific booking 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Booking#getBookingRef <em>Booking Ref</em>}</li>
 *   <li>{@link model.Booking#getDate <em>Date</em>}</li>
 *   <li>{@link model.Booking#getNrOfNights <em>Nr Of Nights</em>}</li>
 *   <li>{@link model.Booking#getExtraList <em>Extra List</em>}</li>
 *   <li>{@link model.Booking#getRoomMap <em>Room Map</em>}</li>
 *   <li>{@link model.Booking#getGuestList <em>Guest List</em>}</li>
 *   <li>{@link model.Booking#getServiceNotes <em>Service Notes</em>}</li>
 *   <li>{@link model.Booking#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link model.Booking#getNrOfGuests <em>Nr Of Guests</em>}</li>
 *   <li>{@link model.Booking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link model.Booking#getGuest <em>Guest</em>}</li>
 *   <li>{@link model.Booking#isIspayed <em>Ispayed</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getBooking()
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
	 * @see model.ModelPackage#getBooking_BookingRef()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBookingRef();

	/**
	 * Sets the value of the '{@link model.Booking#getBookingRef <em>Booking Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Ref</em>' attribute.
	 * @see #getBookingRef()
	 * @generated
	 */
	void setBookingRef(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see model.ModelPackage#getBooking_Date()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link model.Booking#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Nr Of Nights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Of Nights</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Nights</em>' attribute.
	 * @see #setNrOfNights(int)
	 * @see model.ModelPackage#getBooking_NrOfNights()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNrOfNights();

	/**
	 * Sets the value of the '{@link model.Booking#getNrOfNights <em>Nr Of Nights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Nights</em>' attribute.
	 * @see #getNrOfNights()
	 * @generated
	 */
	void setNrOfNights(int value);

	/**
	 * Returns the value of the '<em><b>Extra List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra List</em>' attribute.
	 * @see #setExtraList(EList)
	 * @see model.ModelPackage#getBooking_ExtraList()
	 * @model required="true" many="false" ordered="false"
	 * @generated
	 */
	EList getExtraList();

	/**
	 * Sets the value of the '{@link model.Booking#getExtraList <em>Extra List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra List</em>' attribute.
	 * @see #getExtraList()
	 * @generated
	 */
	void setExtraList(EList value);

	/**
	 * Returns the value of the '<em><b>Room Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Map</em>' attribute.
	 * @see #setRoomMap(Map)
	 * @see model.ModelPackage#getBooking_RoomMap()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Map getRoomMap();

	/**
	 * Sets the value of the '{@link model.Booking#getRoomMap <em>Room Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Map</em>' attribute.
	 * @see #getRoomMap()
	 * @generated
	 */
	void setRoomMap(Map value);

	/**
	 * Returns the value of the '<em><b>Guest List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest List</em>' attribute.
	 * @see #setGuestList(EList)
	 * @see model.ModelPackage#getBooking_GuestList()
	 * @model required="true" many="false" ordered="false"
	 * @generated
	 */
	EList getGuestList();

	/**
	 * Sets the value of the '{@link model.Booking#getGuestList <em>Guest List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest List</em>' attribute.
	 * @see #getGuestList()
	 * @generated
	 */
	void setGuestList(EList value);

	/**
	 * Returns the value of the '<em><b>Service Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Notes</em>' attribute.
	 * @see #setServiceNotes(EList)
	 * @see model.ModelPackage#getBooking_ServiceNotes()
	 * @model required="true" many="false" ordered="false"
	 * @generated
	 */
	EList getServiceNotes();

	/**
	 * Sets the value of the '{@link model.Booking#getServiceNotes <em>Service Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Notes</em>' attribute.
	 * @see #getServiceNotes()
	 * @generated
	 */
	void setServiceNotes(EList value);

	/**
	 * Returns the value of the '<em><b>Customer ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer ID</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer ID</em>' reference.
	 * @see #setCustomerID(Customer)
	 * @see model.ModelPackage#getBooking_CustomerID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomerID();

	/**
	 * Sets the value of the '{@link model.Booking#getCustomerID <em>Customer ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer ID</em>' reference.
	 * @see #getCustomerID()
	 * @generated
	 */
	void setCustomerID(Customer value);

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
	 * @see model.ModelPackage#getBooking_NrOfGuests()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNrOfGuests();

	/**
	 * Sets the value of the '{@link model.Booking#getNrOfGuests <em>Nr Of Guests</em>}' attribute.
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
	 * @see model.ModelPackage#getBooking_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link model.Booking#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Guest</b></em>' reference list.
	 * The list contents are of type {@link model.Guest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest</em>' reference list.
	 * @see model.ModelPackage#getBooking_Guest()
	 * @model type="model.Guest" required="true" ordered="false"
	 * @generated
	 */
	EList getGuest();

	/**
	 * Returns the value of the '<em><b>Ispayed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ispayed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ispayed</em>' attribute.
	 * @see #setIspayed(boolean)
	 * @see model.ModelPackage#getBooking_Ispayed()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIspayed();

	/**
	 * Sets the value of the '{@link model.Booking#isIspayed <em>Ispayed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ispayed</em>' attribute.
	 * @see #isIspayed()
	 * @generated
	 */
	void setIspayed(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean checkedInAllGuest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean checkedInAGuest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model isPayedDataType="org.eclipse.uml2.types.Boolean" isPayedRequired="true" isPayedOrdered="false"
	 * @generated
	 */
	void isPayed(boolean isPayed);

} // Booking
