/**
 */
package maintenancemodel.impl;

import maintenancemodel.Experience;
import maintenancemodel.ExperienceStatusEnum;
import maintenancemodel.MaintenancemodelPackage;
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
 *   <li>{@link maintenancemodel.impl.ExperienceImpl#getNrOfSpotsFree <em>Nr Of Spots Free</em>}</li>
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
	 * The default value of the '{@link #getNrOfSpotsFree() <em>Nr Of Spots Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfSpotsFree()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_SPOTS_FREE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfSpotsFree() <em>Nr Of Spots Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfSpotsFree()
	 * @generated
	 * @ordered
	 */
	protected int nrOfSpotsFree = NR_OF_SPOTS_FREE_EDEFAULT;

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
		return MaintenancemodelPackage.Literals.EXPERIENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfSpots() {
		return nrOfSpots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setNrOfSpots(int newNrOfSpots) {
		if(newNrOfSpots > nrOfSpots) {
			return;
		}
		int oldNrOfSpots = nrOfSpotsFree;
		nrOfSpotsFree = newNrOfSpots;
		
		if(nrOfSpots < 1) {
			experienceStatusEnum = ExperienceStatusEnum.MAINTENANCE;
		} else {
			experienceStatusEnum = EXPERIENCE_STATUS_ENUM_EDEFAULT;
		}
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.EXPERIENCE__NR_OF_SPOTS, oldNrOfSpots, nrOfSpots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ExperienceStatusEnum getExperienceStatusEnum() {
		return experienceStatusEnum;
	}

	@Override
	public boolean isAvailable() {
		if (experienceStatusEnum == ExperienceStatusEnum.READY) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperienceStatusEnum(ExperienceStatusEnum newExperienceStatusEnum) {
		ExperienceStatusEnum oldExperienceStatusEnum = experienceStatusEnum;
		experienceStatusEnum = newExperienceStatusEnum == null ? EXPERIENCE_STATUS_ENUM_EDEFAULT : newExperienceStatusEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.EXPERIENCE__EXPERIENCE_STATUS_ENUM, oldExperienceStatusEnum, experienceStatusEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNrOfSpotsFree() {
		return nrOfSpotsFree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setNrOfSpotsFree(int newNrOfSpotsFree) {
		int oldNrOfSpotsFree = nrOfSpotsFree;
		nrOfSpotsFree = newNrOfSpotsFree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancemodelPackage.EXPERIENCE__NR_OF_SPOTS_FREE, oldNrOfSpotsFree, nrOfSpotsFree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancemodelPackage.EXPERIENCE__NR_OF_SPOTS:
				return getNrOfSpots();
			case MaintenancemodelPackage.EXPERIENCE__EXPERIENCE_STATUS_ENUM:
				return getExperienceStatusEnum();
			case MaintenancemodelPackage.EXPERIENCE__NR_OF_SPOTS_FREE:
				return getNrOfSpotsFree();
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
			case MaintenancemodelPackage.EXPERIENCE__NR_OF_SPOTS:
				setNrOfSpots((Integer)newValue);
				return;
			case MaintenancemodelPackage.EXPERIENCE__EXPERIENCE_STATUS_ENUM:
				setExperienceStatusEnum((ExperienceStatusEnum)newValue);
				return;
			case MaintenancemodelPackage.EXPERIENCE__NR_OF_SPOTS_FREE:
				setNrOfSpotsFree((Integer)newValue);
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
			case MaintenancemodelPackage.EXPERIENCE__NR_OF_SPOTS:
				setNrOfSpots(NR_OF_SPOTS_EDEFAULT);
				return;
			case MaintenancemodelPackage.EXPERIENCE__EXPERIENCE_STATUS_ENUM:
				setExperienceStatusEnum(EXPERIENCE_STATUS_ENUM_EDEFAULT);
				return;
			case MaintenancemodelPackage.EXPERIENCE__NR_OF_SPOTS_FREE:
				setNrOfSpotsFree(NR_OF_SPOTS_FREE_EDEFAULT);
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
			case MaintenancemodelPackage.EXPERIENCE__NR_OF_SPOTS:
				return nrOfSpots != NR_OF_SPOTS_EDEFAULT;
			case MaintenancemodelPackage.EXPERIENCE__EXPERIENCE_STATUS_ENUM:
				return experienceStatusEnum != EXPERIENCE_STATUS_ENUM_EDEFAULT;
			case MaintenancemodelPackage.EXPERIENCE__NR_OF_SPOTS_FREE:
				return nrOfSpotsFree != NR_OF_SPOTS_FREE_EDEFAULT;
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
		result.append(", nrOfSpotsFree: ");
		result.append(nrOfSpotsFree);
		result.append(')');
		return result.toString();
	}

} //ExperienceImpl
