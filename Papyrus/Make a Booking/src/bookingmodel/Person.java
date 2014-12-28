/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link bookingmodel.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link bookingmodel.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link bookingmodel.Person#getTelephoneNr <em>Telephone Nr</em>}</li>
 *   <li>{@link bookingmodel.Person#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.BookingmodelPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see bookingmodel.BookingmodelPackage#getPerson_FirstName()
	 * @model unique="false" dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link bookingmodel.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see bookingmodel.BookingmodelPackage#getPerson_LastName()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link bookingmodel.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see bookingmodel.BookingmodelPackage#getPerson_Email()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link bookingmodel.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Telephone Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Nr</em>' attribute.
	 * @see #setTelephoneNr(String)
	 * @see bookingmodel.BookingmodelPackage#getPerson_TelephoneNr()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTelephoneNr();

	/**
	 * Sets the value of the '{@link bookingmodel.Person#getTelephoneNr <em>Telephone Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone Nr</em>' attribute.
	 * @see #getTelephoneNr()
	 * @generated
	 */
	void setTelephoneNr(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see bookingmodel.BookingmodelPackage#getPerson_Address()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link bookingmodel.Person#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // Person
