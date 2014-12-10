/**
 */
package model;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Guest#getGuestType <em>Guest Type</em>}</li>
 *   <li>{@link model.Guest#getRoomNr <em>Room Nr</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getGuest()
 * @model
 * @generated
 */
public interface Guest extends EObject {
	/**
	 * Returns the value of the '<em><b>Guest Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest Type</em>' attribute.
	 * @see #setGuestType(Enumerator)
	 * @see model.ModelPackage#getGuest_GuestType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Enumerator getGuestType();

	/**
	 * Sets the value of the '{@link model.Guest#getGuestType <em>Guest Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest Type</em>' attribute.
	 * @see #getGuestType()
	 * @generated
	 */
	void setGuestType(Enumerator value);

	/**
	 * Returns the value of the '<em><b>Room Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Nr</em>' attribute.
	 * @see #setRoomNr(int)
	 * @see model.ModelPackage#getGuest_RoomNr()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRoomNr();

	/**
	 * Sets the value of the '{@link model.Guest#getRoomNr <em>Room Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Nr</em>' attribute.
	 * @see #getRoomNr()
	 * @generated
	 */
	void setRoomNr(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestTypeRequired="true" guestTypeOrdered="false"
	 * @generated
	 */
	void setType(Enumerator guestType);

} // Guest
