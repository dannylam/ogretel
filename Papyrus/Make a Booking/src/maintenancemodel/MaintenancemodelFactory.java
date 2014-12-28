/**
 */
package maintenancemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see maintenancemodel.MaintenancemodelPackage
 * @generated
 */
public interface MaintenancemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaintenancemodelFactory eINSTANCE = maintenancemodel.impl.MaintenancemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Type</em>'.
	 * @generated
	 */
	RoomType createRoomType();

	/**
	 * Returns a new object of class '<em>Experience</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experience</em>'.
	 * @generated
	 */
	Experience createExperience();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Extra Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extra Handler</em>'.
	 * @generated
	 */
	ExtraHandler createExtraHandler();

	/**
	 * Returns a new object of class '<em>Room Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Handler</em>'.
	 * @generated
	 */
	RoomHandler createRoomHandler();

	/**
	 * Returns a new object of class '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar</em>'.
	 * @generated
	 */
	Calendar createCalendar();

	/**
	 * Returns a new object of class '<em>Room Types Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Types Handler</em>'.
	 * @generated
	 */
	RoomTypesHandler createRoomTypesHandler();

	/**
	 * Returns a new object of class '<em>Extras Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extras Maintenance</em>'.
	 * @generated
	 */
	ExtrasMaintenance createExtrasMaintenance();

	/**
	 * Returns a new object of class '<em>Room Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Maintenance</em>'.
	 * @generated
	 */
	RoomMaintenance createRoomMaintenance();

	/**
	 * Returns a new object of class '<em>Maintenance Provides For Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maintenance Provides For Booking</em>'.
	 * @generated
	 */
	MaintenanceProvidesForBooking createMaintenanceProvidesForBooking();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MaintenancemodelPackage getMaintenancemodelPackage();

} //MaintenancemodelFactory
