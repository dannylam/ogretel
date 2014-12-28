/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * An interface class which represents Person, extending EObject.
 * This class has 10 methods;
 * getFirstName - returns the first name of a person.
 * setFirstName - sets the first name of a person.
 * getLastName - returns the last name of a person.
 * setLastName - sets the last name of a person.
 * getEmail - returns the email address of a person.
 * setEmail - sets the email address of a person.
 * getTelephoneNr - returns the telephone number of a person.
 * setTelephoneNr - sets the telephone number of a person.
 * getAddress - returns the address of a person.
 * setAddress - sets the address of a person.
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
 * @generated NOT
 */
public interface Person extends EObject {
	/**
	 * Returns the first name of a person.
	 * A person is a host, customer or guest.
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see bookingmodel.BookingmodelPackage#getPerson_FirstName()
	 * @model unique="false" dataType="types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getFirstName();

	/**
	 * Sets the first name of a person.
	 * A person is a host, customer or guest.
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated NOT
	 */
	void setFirstName(String value);

	/**
	 * Returns the last name of a person.
	 * A person is a host, customer or guest.
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see bookingmodel.BookingmodelPackage#getPerson_LastName()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getLastName();

	/**
	 * Sets the last name of a person.
	 * A person is a host, customer or guest.
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated NOT
	 */
	void setLastName(String value);

	/**
	 * Returns a person's email.
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see bookingmodel.BookingmodelPackage#getPerson_Email()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getEmail();

	/**
	 * Sets a person's email
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated NOT
	 */
	void setEmail(String value);

	/**
	 * Returns a person's telephone number.
	 * @return the value of the '<em>Telephone Nr</em>' attribute.
	 * @see #setTelephoneNr(String)
	 * @see bookingmodel.BookingmodelPackage#getPerson_TelephoneNr()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getTelephoneNr();

	/**
	 * Sets a person's telephone number.
	 * @param value the new value of the '<em>Telephone Nr</em>' attribute.
	 * @see #getTelephoneNr()
	 * @generated NOT
	 */
	void setTelephoneNr(String value);

	/**
	 * Returns a person's address.
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see bookingmodel.BookingmodelPackage#getPerson_Address()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getAddress();

	/**
	 * Sets a person's address.
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated NOT
	 */
	void setAddress(String value);

} // Person
