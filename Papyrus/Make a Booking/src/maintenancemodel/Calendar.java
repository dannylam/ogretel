/**
 */
package maintenancemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see maintenancemodel.ModelPackage#getCalendar()
 * @model
 * @generated
 */
public interface Calendar extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" startDataType="org.eclipse.uml2.types.Integer" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.Integer" endRequired="true" endOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	int getCap(int start, int end, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startDataType="org.eclipse.uml2.types.Integer" startRequired="true" startOrdered="false" endDataType="org.eclipse.uml2.types.Integer" endRequired="true" endOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" nrOfRoomsDataType="org.eclipse.uml2.types.Integer" nrOfRoomsRequired="true" nrOfRoomsOrdered="false"
	 * @generated
	 */
	void setCap(int start, int end, String roomType, int nrOfRooms);

} // Calendar
