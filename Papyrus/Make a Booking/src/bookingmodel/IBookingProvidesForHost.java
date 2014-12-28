/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking Provides For Host</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see bookingmodel.BookingmodelPackage#getIBookingProvidesForHost()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBookingProvidesForHost extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int enableSelfManagement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated
	 */
	int addServiceNote(String serviceNote);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" oldServiceNoteDataType="types.String" oldServiceNoteRequired="true" oldServiceNoteOrdered="false" newServiceNoteDataType="types.String" newServiceNoteRequired="true" newServiceNoteOrdered="false"
	 * @generated
	 */
	int editServiceNote(String oldServiceNote, String newServiceNote);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated
	 */
	int removeServiceNote(String serviceNote);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.String" required="true" ordered="false" bookingRefDataType="types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	String getServiceNotes(String bookingRef);

} // IBookingProvidesForHost
