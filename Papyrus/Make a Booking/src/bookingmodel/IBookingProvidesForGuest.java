/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>IBooking Provides For Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see bookingmodel.ModelPackage#getIBookingProvidesForGuest()
 * @maintenancemodel interface="true" abstract="true"
 * @generated
 */
public interface IBookingProvidesForGuest extends EObject {
	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false" guestEmailDataType="org.eclipse.uml2.types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated
	 */
	int checkIn(String bookingRef, String guestEmail);

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false" guestEmailDataType="org.eclipse.uml2.types.String" guestEmailRequired="true" guestEmailOrdered="false"
	 * @generated
	 */
	int checkOut(String bookingRef, String guestEmail);

	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @maintenancemodel ccNrDataType="org.eclipse.uml2.types.String" ccNrRequired="true" ccNrOrdered="false" ccVDataType="org.eclipse.uml2.types.String" ccVRequired="true" ccVOrdered="false" expMonthDataType="org.eclipse.uml2.types.Integer" expMonthRequired="true" expMonthOrdered="false" expYearDataType="org.eclipse.uml2.types.Integer" expYearRequired="true" expYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void pay(String ccNr, String ccV, int expMonth, int expYear, String firstName, String lastName);
	
	/**
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @maintenancemodel nrOfNightsDataType="org.eclipse.uml2.types.Integer" nrOfNightsRequired="true" nrOfNightsOrdered="false" nrOfGuestsDataType="org.eclipse.uml2.types.Integer" nrOfGuestsRequired="true" nrOfGuestsOrdered="false" dateDataType="org.eclipse.uml2.types.String" dateRequired="true" dateOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false" roomTypesDataType="org.eclipse.uml2.types.String" roomTypesRequired="true" roomTypesOrdered="false" extrasDataType="org.eclipse.uml2.types.String" extrasRequired="true" extrasOrdered="false" bookingRefDataType="org.eclipse.uml2.types.String" bookingRefRequired="true" bookingRefOrdered="false"
	 * @generated
	 */
	void editBooking(int nrOfNights, int nrOfGuests, String date, int nrOfRooms, String roomTypes, String extras, String bookingRef);


} // IBookingProvidesForGuest
