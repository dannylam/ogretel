/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import maintenancemodel.Extra;
import maintenancemodel.ExtraHandler;
import maintenancemodel.ModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the maintenancemodel object '<em><b>Extra Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.ExtraHandlerImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link maintenancemodel.impl.ExtraHandlerImpl#getIntToExtraMap <em>Int To Extra Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtraHandlerImpl extends MinimalEObjectImpl.Container implements ExtraHandler {
	/**
	 * The cached value of the '{@link #getExtra() <em>Extra</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtra()
	 * @generated
	 * @ordered
	 */
	protected EList<Extra> extra;

	/**
	 * The cached value of the '{@link #getIntToExtraMap() <em>Int To Extra Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntToExtraMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<Integer, Extra> intToExtraMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtraHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXTRA_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extra> getExtra() {
		if (extra == null) {
			extra = new EObjectResolvingEList<Extra>(Extra.class, this, ModelPackage.EXTRA_HANDLER__EXTRA);
		}
		return extra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Integer, Extra> getIntToExtraMap() {
		if (intToExtraMap == null) {
			intToExtraMap = new EcoreEMap<Integer,Extra>(ModelPackage.Literals.INTEGER_TO_EXTRA_MAP, IntegerToExtraMapImpl.class, this, ModelPackage.EXTRA_HANDLER__INT_TO_EXTRA_MAP);
		}
		return intToExtraMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean exists(int ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addExtra(int price, String ID, String name, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeExtra(Extra extra) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extra getExtra(int ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.EXTRA_HANDLER__INT_TO_EXTRA_MAP:
				return ((InternalEList<?>)getIntToExtraMap()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EXTRA_HANDLER__EXTRA:
				return getExtra();
			case ModelPackage.EXTRA_HANDLER__INT_TO_EXTRA_MAP:
				if (coreType) return getIntToExtraMap();
				else return getIntToExtraMap().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.EXTRA_HANDLER__EXTRA:
				getExtra().clear();
				getExtra().addAll((Collection<? extends Extra>)newValue);
				return;
			case ModelPackage.EXTRA_HANDLER__INT_TO_EXTRA_MAP:
				((EStructuralFeature.Setting)getIntToExtraMap()).set(newValue);
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
			case ModelPackage.EXTRA_HANDLER__EXTRA:
				getExtra().clear();
				return;
			case ModelPackage.EXTRA_HANDLER__INT_TO_EXTRA_MAP:
				getIntToExtraMap().clear();
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
			case ModelPackage.EXTRA_HANDLER__EXTRA:
				return extra != null && !extra.isEmpty();
			case ModelPackage.EXTRA_HANDLER__INT_TO_EXTRA_MAP:
				return intToExtraMap != null && !intToExtraMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.EXTRA_HANDLER___EXISTS__INT:
				return exists((Integer)arguments.get(0));
			case ModelPackage.EXTRA_HANDLER___ADD_EXTRA__INT_STRING_STRING_STRING:
				addExtra((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case ModelPackage.EXTRA_HANDLER___REMOVE_EXTRA__EXTRA:
				removeExtra((Extra)arguments.get(0));
				return null;
			case ModelPackage.EXTRA_HANDLER___GET_EXTRA__INT:
				return getExtra((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExtraHandlerImpl
