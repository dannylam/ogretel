/**
 */
package bookingmodel;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * An interface class which represents booking provides for the host, extending EObject.
 * It has 5 methods;
 * enableSelfManagement - enable self management.
 * addServiceNote - add a specific service note.
 * editServiceNote - edit a specific service note
 * removeServiceNote - remove a specific service note.
 * getServiceNote - get a specific service note.
 * @see bookingmodel.BookingmodelPackage#getIBookingProvidesForHost()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBookingProvidesForHost extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Boolean" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	boolean isBookingPayed(String bookingRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Boolean" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	boolean isExtraPayed(int roomID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Boolean" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	boolean isRoomPayed(int roomID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Boolean" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	boolean existBooking(String bookingRef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="types.String" ordered="false"
	 * @generated
	 */
	EList<String> getExistingBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="types.String" ordered="false"
	 * @generated
	 */
	EList<String> getActiveBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Boolean" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	boolean isCheckedOut(int roomID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Boolean" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	boolean isCheckedIn(int roomID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.String" required="true" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	String getResponsibleGuest(int roomID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" guestEmailDataType="types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated
	 */
	int getRoomID(String guestEmail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated
	 */
	int addService(int roomID, String serviceNote);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" roomIDDataType="types.Integer" roomIDRequired="true" roomIDOrdered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated
	 */
	int removeService(int roomID, String serviceNote);

	/**
	 * Returns the service notes from a specific booking. 
	 * @model dataType="types.String" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<String> getServiceNotes(String bookingRef);

	/**
	 * Returns is the given booking is payed or not
	 * @model bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	boolean isPayed(String bookingRef);

	/**
	 * Returns the start date of a booking
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getStartDate(String bookingRef);

	/**
	 * Returns the end date of a booking
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getEndDate(String bookingRef);

	/**
	 * Returns the number of guests of a booking
	 * @model dataType="types.Integer" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	int getNrOfGuests(String bookingRef);

	/**
	 * Returns the extras of a booking
	 * @model dataType="types.String" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<String> getExtras(String bookingRef);

	/**
	 * Returns a list of the rooms of a booking
	 * @model dataType="types.Integer" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<Integer> getRooms(String bookingRef);

	/**
	 * Returns the paymentmethod of a booking
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	String getPaymentMethod(String bookingRef);

	/**
	 * Returns a list of the roomtypes of a booking
	 * @model dataType="types.String" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated NOT
	 */
	List<String> getRoomTypes(String bookingRef);


} // IBookingProvidesForHost
