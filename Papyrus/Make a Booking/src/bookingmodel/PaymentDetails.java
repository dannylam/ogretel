/**
 */
package bookingmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bookingmodel.PaymentDetails#getCcNr <em>Cc Nr</em>}</li>
 *   <li>{@link bookingmodel.PaymentDetails#getCcV <em>Cc V</em>}</li>
 *   <li>{@link bookingmodel.PaymentDetails#getExpMonth <em>Exp Month</em>}</li>
 *   <li>{@link bookingmodel.PaymentDetails#getExpYear <em>Exp Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see bookingmodel.ModelPackage#getPaymentDetails()
 * @model
 * @generated
 */
public interface PaymentDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>Cc Nr</b></em>' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Nr</em>' attribute.
	 * @see #setCcNr(String)
	 * @see bookingmodel.ModelPackage#getPaymentDetails_CcNr()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCcNr();

	/**
	 * Sets the value of the '{@link bookingmodel.PaymentDetails#getCcNr <em>Cc Nr</em>}' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Nr</em>' attribute.
	 * @see #getCcNr()
	 * @generated
	 */
	void setCcNr(String value);

	/**
	 * Returns the value of the '<em><b>Cc V</b></em>' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc V</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc V</em>' attribute.
	 * @see #setCcV(String)
	 * @see bookingmodel.ModelPackage#getPaymentDetails_CcV()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCcV();

	/**
	 * Sets the value of the '{@link bookingmodel.PaymentDetails#getCcV <em>Cc V</em>}' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc V</em>' attribute.
	 * @see #getCcV()
	 * @generated
	 */
	void setCcV(String value);

	/**
	 * Returns the value of the '<em><b>Exp Month</b></em>' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp Month</em>' attribute.
	 * @see #setExpMonth(int)
	 * @see bookingmodel.ModelPackage#getPaymentDetails_ExpMonth()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExpMonth();

	/**
	 * Sets the value of the '{@link bookingmodel.PaymentDetails#getExpMonth <em>Exp Month</em>}' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Month</em>' attribute.
	 * @see #getExpMonth()
	 * @generated
	 */
	void setExpMonth(int value);

	/**
	 * Returns the value of the '<em><b>Exp Year</b></em>' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp Year</em>' attribute.
	 * @see #setExpYear(int)
	 * @see bookingmodel.ModelPackage#getPaymentDetails_ExpYear()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExpYear();

	/**
	 * Sets the value of the '{@link bookingmodel.PaymentDetails#getExpYear <em>Exp Year</em>}' attribute.
	 * TODO: Javadoc, glöm inte markera generated NOT när man är klar
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Year</em>' attribute.
	 * @see #getExpYear()
	 * @generated
	 */
	void setExpYear(int value);

} // PaymentDetails
