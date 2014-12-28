
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
 * @see bookingmodel.ModelPackage#getPerson()
 * @maintenancemodel
 * @generated NOT
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute,
	 * that is the first name of the guest/customer.
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see bookingmodel.ModelPackage#getPerson_FirstName()
	 * @maintenancemodel unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link bookingmodel.Person#getFirstName <em>First Name</em>}' attribute,
	 * that is the first name of the guest/customer.
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated NOT
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute,
	 * that is the last name of the guest/customer.
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see bookingmodel.ModelPackage#getPerson_LastName()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link bookingmodel.Person#getLastName <em>Last Name</em>}' attribute,
	 * that is the last name of the guest/customer.
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated NOT
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute,
	 * that is the email of the guest/customer.
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see bookingmodel.ModelPackage#getPerson_Email()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link bookingmodel.Person#getEmail <em>Email</em>}' attribute,
	 * that is the email of the guest/customer.
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated NOT
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Telephone Nr</b></em>' attribute,
	 * that is the telephone number of a guest/customer.
	 * @return the value of the '<em>Telephone Nr</em>' attribute.
	 * @see #setTelephoneNr(String)
	 * @see bookingmodel.ModelPackage#getPerson_TelephoneNr()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getTelephoneNr();

	/**
	 * Sets the value of the '{@link bookingmodel.Person#getTelephoneNr <em>Telephone Nr</em>}' attribute,
	 * that is the telephone number of a guest/customer.
	 * @param value the new value of the '<em>Telephone Nr</em>' attribute.
	 * @see #getTelephoneNr()
	 * @generated NOT
	 */
	void setTelephoneNr(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute,
	 * that is the address of a guest/customer.
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see bookingmodel.ModelPackage#getPerson_Address()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated NOT
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link bookingmodel.Person#getAddress <em>Address</em>}' attribute,
	 * that is the address of a guest/customer.
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated NOT
	 */
	void setAddress(String value);

} // Person
