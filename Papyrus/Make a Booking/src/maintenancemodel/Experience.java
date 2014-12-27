/**
 */
package maintenancemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the maintenancemodel object '<em><b>Experience</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link maintenancemodel.Experience#getNrOfSpots <em>Nr Of Spots</em>}</li>
 *   <li>{@link maintenancemodel.Experience#getExperienceStatusEnum <em>Experience Status Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see maintenancemodel.ModelPackage#getExperience()
 * @maintenancemodel
 * @generated
 */
public interface Experience extends AbstractExtra {
	/**
	 * Returns the value of the '<em><b>Nr Of Spots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Of Spots</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Spots</em>' attribute.
	 * @see #setNrOfSpots(int)
	 * @see maintenancemodel.ModelPackage#getExperience_NrOfSpots()
	 * @maintenancemodel dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNrOfSpots();

	/**
	 * Sets the value of the '{@link maintenancemodel.Experience#getNrOfSpots <em>Nr Of Spots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Spots</em>' attribute.
	 * @see #getNrOfSpots()
	 * @generated
	 */
	void setNrOfSpots(int value);

	/**
	 * Returns the value of the '<em><b>Experience Status Enum</b></em>' attribute.
	 * The literals are from the enumeration {@link maintenancemodel.ExperienceStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experience Status Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experience Status Enum</em>' attribute.
	 * @see maintenancemodel.ExperienceStatusEnum
	 * @see #setExperienceStatusEnum(ExperienceStatusEnum)
	 * @see maintenancemodel.ModelPackage#getExperience_ExperienceStatusEnum()
	 * @maintenancemodel required="true" ordered="false"
	 * @generated
	 */
	ExperienceStatusEnum getExperienceStatusEnum();

	/**
	 * Sets the value of the '{@link maintenancemodel.Experience#getExperienceStatusEnum <em>Experience Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experience Status Enum</em>' attribute.
	 * @see maintenancemodel.ExperienceStatusEnum
	 * @see #getExperienceStatusEnum()
	 * @generated
	 */
	void setExperienceStatusEnum(ExperienceStatusEnum value);

} // Experience
