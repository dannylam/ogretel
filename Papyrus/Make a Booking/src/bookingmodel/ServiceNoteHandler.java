/**
 */
package bookingmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * TODO classjavadoc
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Note Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.ServiceNoteHandler#getServiceNoteMap <em>Service Note Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.BookingmodelPackage#getServiceNoteHandler()
 * @model
 * @generated
 */
public interface ServiceNoteHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Note Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Note Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Note Map</em>' map.
	 * @see bookingmodel.BookingmodelPackage#getServiceNoteHandler_ServiceNoteMap()
	 * @model mapType="bookingmodel.ServiceNoteToDescriptionEntry<types.String, org.eclipse.emf.ecore.EString>" ordered="false"
	 * @generated
	 */
	EMap<String, String> getServiceNoteMap();

	/**
	 * Checks if the service exists in the map of services. Returns true if the service exists and
	 * false otherwise.
	 * @model dataType="types.Boolean" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated NOT
	 */
	boolean exists(String serviceNote);

	/**
	 * Adds a service note with its description into the map of services
	 * @return	0 if success 
	 * 			-1 if the map is null
	 * @model dataType="types.Integer" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false" descriptionDataType="types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated NOT
	 */
	int addServiceNote(String serviceNote, String description);

	/**
	 * Removes a service to the map of services
	 * @return	0 if success 
	 * 			-1 if the map is null
	 * 			1 if the service does not exist in the map
	 * @model dataType="types.Integer" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated NOT
	 */
	int removeServiceNote(String serviceNote);

	/**
	 * Return the description of a service note. If the service note does not exist in the map or the map is empty
	 * null is returned.
	 * @model dataType="types.String" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false"
	 * @generated NOT
	 */
	String getServiceNoteDescription(String serviceNote);

	/**
	 * Changes the description of a service note.
	 * @return	0 if success 
	 * 			-1 if the map is null
	 * 			1 if the service does not exist in the map
	 * @model dataType="types.String" required="true" ordered="false" serviceNoteDataType="types.String" serviceNoteRequired="true" serviceNoteOrdered="false" descriptionDataType="types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated NOT
	 */
	int editServiceNoteDescription(String serviceNote, String description);

	/**
	 * Returns a list of all services if the map is not null. Otherwise, null is returned.
	 * @model kind="operation" required="true" many="false"
	 * @generated NOT
	 */
	EList<String> getServices();

} // ServiceNoteHandler
