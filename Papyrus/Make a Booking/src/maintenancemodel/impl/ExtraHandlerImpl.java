/**
 */
package maintenancemodel.impl;

import java.lang.reflect.InvocationTargetException;

import maintenancemodel.Extra;
import maintenancemodel.ExtraHandler;
import maintenancemodel.MaintenancemodelPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the maintenancemodel object '<em><b>Extra Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link maintenancemodel.impl.ExtraHandlerImpl#getIntToExtraMap <em>Int To Extra Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtraHandlerImpl extends MinimalEObjectImpl.Container implements ExtraHandler {

	/**
	 * The cached value of the '{@link #getIntToExtraMap() <em>Int To Extra Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntToExtraMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Extra> intToExtraMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ExtraHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancemodelPackage.Literals.EXTRA_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Extra> getIntToExtraMap() {
		if (intToExtraMap == null) {
			intToExtraMap = new EcoreEMap<String,Extra>(MaintenancemodelPackage.Literals.INTEGER_TO_EXTRA_ENTRY, IntegerToExtraEntryImpl.class, this, MaintenancemodelPackage.EXTRA_HANDLER__INT_TO_EXTRA_MAP);
		}
		return intToExtraMap;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 *	{@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean exists(String ID) {
		return intToExtraMap.containsKey(ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int addExtra(String extraID, int price, String name, String description, boolean isProduct) {
		AbstractExtraImpl extra;
		if(intToExtraMap.containsKey(extraID)) {
			return 1;
		}
		if(isProduct) {
			extra = new ProductImpl();
		} else {
			extra = new ExperienceImpl();
		}
		extra.setName(name);
		extra.setID(extraID);
		extra.setPrice(price);
		extra.setDescription(description);
		
		intToExtraMap.put(extraID, extra);
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int removeExtra(String extra) {
		intToExtraMap.remove(extra);
		if(intToExtraMap.get(extra) != null) {
			return 1;
		}
		intToExtraMap.removeKey(extra);
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getExtras() {
		Extra[] extraArray = (Extra[]) intToExtraMap.values().toArray();
		EList<String> list = new BasicInternalEList<String>(getClass());
		for(int i = 0; i < extraArray.length; i++) {
			list.add(extraArray[i].toString());
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Extra getExtra(String ID) {
		return intToExtraMap.get(ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getPrice(String extraID) {
		AbstractExtraImpl extra = (AbstractExtraImpl) intToExtraMap.get(extraID);
		return extra.getPrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaintenancemodelPackage.EXTRA_HANDLER__INT_TO_EXTRA_MAP:
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
			case MaintenancemodelPackage.EXTRA_HANDLER__INT_TO_EXTRA_MAP:
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
			case MaintenancemodelPackage.EXTRA_HANDLER__INT_TO_EXTRA_MAP:
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
			case MaintenancemodelPackage.EXTRA_HANDLER__INT_TO_EXTRA_MAP:
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
			case MaintenancemodelPackage.EXTRA_HANDLER__INT_TO_EXTRA_MAP:
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
			case MaintenancemodelPackage.EXTRA_HANDLER___GET_EXTRAS:
				return getExtras();
			case MaintenancemodelPackage.EXTRA_HANDLER___GET_PRICE__STRING:
				return getPrice((String)arguments.get(0));
			case MaintenancemodelPackage.EXTRA_HANDLER___ADD_EXTRA__STRING_INT_STRING_STRING_BOOLEAN:
				return addExtra((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Boolean)arguments.get(4));
			case MaintenancemodelPackage.EXTRA_HANDLER___REMOVE_EXTRA__STRING:
				return removeExtra((String)arguments.get(0));
			case MaintenancemodelPackage.EXTRA_HANDLER___EXISTS__STRING:
				return exists((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExtraHandlerImpl
