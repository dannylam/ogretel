/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking Provides For Host</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ModelPackage#getIBookingProvidesForHost()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBookingProvidesForHost extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestEmailDataType="org.eclipse.uml2.types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated
	 */
	void enableSelfManagement(String guestEmail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceNoteDataType="org.eclipse.uml2.types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated
	 */
	void addServiceNote(String serviceNote);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model oldServiceNoteDataType="org.eclipse.uml2.types.String" oldServiceNoteRequired="true" oldServiceNoteOrdered="false" newServiceNoteDataType="org.eclipse.uml2.types.String" newServiceNoteRequired="true" newServiceNoteOrdered="false"
	 * @generated
	 */
	void editServiceNote(String oldServiceNote, String newServiceNote);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceNoteDataType="org.eclipse.uml2.types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated
	 */
	void removeServiceNote(String serviceNote);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	void getServiceNotes(String bookingRef);

} // IBookingProvidesForHost
