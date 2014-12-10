/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.PaymentDetails#getCcNr <em>Cc Nr</em>}</li>
 *   <li>{@link model.PaymentDetails#getCcV <em>Cc V</em>}</li>
 *   <li>{@link model.PaymentDetails#getExpMonth <em>Exp Month</em>}</li>
 *   <li>{@link model.PaymentDetails#getExpYear <em>Exp Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getPaymentDetails()
 * @model
 * @generated
 */
public interface PaymentDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>Cc Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Nr</em>' attribute.
	 * @see #setCcNr(String)
	 * @see model.ModelPackage#getPaymentDetails_CcNr()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCcNr();

	/**
	 * Sets the value of the '{@link model.PaymentDetails#getCcNr <em>Cc Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Nr</em>' attribute.
	 * @see #getCcNr()
	 * @generated
	 */
	void setCcNr(String value);

	/**
	 * Returns the value of the '<em><b>Cc V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc V</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc V</em>' attribute.
	 * @see #setCcV(String)
	 * @see model.ModelPackage#getPaymentDetails_CcV()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCcV();

	/**
	 * Sets the value of the '{@link model.PaymentDetails#getCcV <em>Cc V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc V</em>' attribute.
	 * @see #getCcV()
	 * @generated
	 */
	void setCcV(String value);

	/**
	 * Returns the value of the '<em><b>Exp Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp Month</em>' attribute.
	 * @see #setExpMonth(int)
	 * @see model.ModelPackage#getPaymentDetails_ExpMonth()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExpMonth();

	/**
	 * Sets the value of the '{@link model.PaymentDetails#getExpMonth <em>Exp Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Month</em>' attribute.
	 * @see #getExpMonth()
	 * @generated
	 */
	void setExpMonth(int value);

	/**
	 * Returns the value of the '<em><b>Exp Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp Year</em>' attribute.
	 * @see #setExpYear(int)
	 * @see model.ModelPackage#getPaymentDetails_ExpYear()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExpYear();

	/**
	 * Sets the value of the '{@link model.PaymentDetails#getExpYear <em>Exp Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Year</em>' attribute.
	 * @see #getExpYear()
	 * @generated
	 */
	void setExpYear(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false"
	 * @generated
	 */
	void setCcv(String ccv);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getCcv();

} // PaymentDetails
