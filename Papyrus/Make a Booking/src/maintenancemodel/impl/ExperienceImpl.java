/**
 */
package maintenancemodel.impl;

import maintenancemodel.Experience;
import maintenancemodel.ExperienceStatusEnum;
import maintenancemodel.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the maintenancemodel object '<em><b>Experience</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.ExperienceImpl#getNrOfSpots <em>Nr Of Spots</em>}</li>
 *   <li>{@link maintenancemodel.impl.ExperienceImpl#getExperienceStatusEnum <em>Experience Status Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperienceImpl extends AbstractExtraImpl implements Experience {
	/**
	 * The default value of the '{@link #getNrOfSpots() <em>Nr Of Spots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfSpots()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_SPOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfSpots() <em>Nr Of Spots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfSpots()
	 * @generated
	 * @ordered
	 */
	protected int nrOfSpots = NR_OF_SPOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExperienceStatusEnum() <em>Experience Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperienceStatusEnum()
	 * @generated
	 * @ordered
	 */
	protected static final ExperienceStatusEnum EXPERIENCE_STATUS_ENUM_EDEFAULT = ExperienceStatusEnum.READY;

	/**
	 * The cached value of the '{@link #getExperienceStatusEnum() <em>Experience Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperienceStatusEnum()
	 * @generated
	 * @ordered
	 */
	protected ExperienceStatusEnum experienceStatusEnum = EXPERIENCE_STATUS_ENUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperienceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXPERIENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfSpots() {
		return nrOfSpots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrOfSpots(int newNrOfSpots) {
		int oldNrOfSpots = nrOfSpots;
		nrOfSpots = newNrOfSpots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXPERIENCE__NR_OF_SPOTS, oldNrOfSpots, nrOfSpots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperienceStatusEnum getExperienceStatusEnum() {
		return experienceStatusEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperienceStatusEnum(ExperienceStatusEnum newExperienceStatusEnum) {
		ExperienceStatusEnum oldExperienceStatusEnum = experienceStatusEnum;
		experienceStatusEnum = newExperienceStatusEnum == null ? EXPERIENCE_STATUS_ENUM_EDEFAULT : newExperienceStatusEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXPERIENCE__EXPERIENCE_STATUS_ENUM, oldExperienceStatusEnum, experienceStatusEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EXPERIENCE__NR_OF_SPOTS:
				return getNrOfSpots();
			case ModelPackage.EXPERIENCE__EXPERIENCE_STATUS_ENUM:
				return getExperienceStatusEnum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.EXPERIENCE__NR_OF_SPOTS:
				setNrOfSpots((Integer)newValue);
				return;
			case ModelPackage.EXPERIENCE__EXPERIENCE_STATUS_ENUM:
				setExperienceStatusEnum((ExperienceStatusEnum)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.EXPERIENCE__NR_OF_SPOTS:
				setNrOfSpots(NR_OF_SPOTS_EDEFAULT);
				return;
			case ModelPackage.EXPERIENCE__EXPERIENCE_STATUS_ENUM:
				setExperienceStatusEnum(EXPERIENCE_STATUS_ENUM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.EXPERIENCE__NR_OF_SPOTS:
				return nrOfSpots != NR_OF_SPOTS_EDEFAULT;
			case ModelPackage.EXPERIENCE__EXPERIENCE_STATUS_ENUM:
				return experienceStatusEnum != EXPERIENCE_STATUS_ENUM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nrOfSpots: ");
		result.append(nrOfSpots);
		result.append(", experienceStatusEnum: ");
		result.append(experienceStatusEnum);
		result.append(')');
		return result.toString();
	}

} //ExperienceImpl
