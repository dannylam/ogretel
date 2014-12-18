/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking Provides For Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see bookingmodel.ModelPackage#getIBookingProvidesForGuest()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBookingProvidesForGuest extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false" guestEmailDataType="org.eclipse.uml2.types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated
	 */
	int checkIn(String bookingRef, String guestEmail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false" guestEmailDataType="org.eclipse.uml2.types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated
	 */
	int checkOut(String bookingRef, String guestEmail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ccNrDataType="org.eclipse.uml2.types.String" ccNrRequired="true" ccNrOrdered="false" ccVDataType="org.eclipse.uml2.types.String" ccVRequired="true" ccVOrdered="false" expMonthDataType="org.eclipse.uml2.types.Integer" expMonthRequired="true" expMonthOrdered="false" expYearDataType="org.eclipse.uml2.types.Integer" expYearRequired="true" expYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void pay(String ccNr, String ccV, int expMonth, int expYear, String firstName, String lastName);

} // IBookingProvidesForGuest
