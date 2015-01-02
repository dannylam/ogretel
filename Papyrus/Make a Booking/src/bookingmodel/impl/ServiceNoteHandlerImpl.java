/**
 */
package bookingmodel.impl;

import bookingmodel.BookingmodelPackage;
import bookingmodel.ServiceNoteHandler;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Note Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bookingmodel.impl.ServiceNoteHandlerImpl#getServiceNoteMap <em>Service Note Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceNoteHandlerImpl extends MinimalEObjectImpl.Container implements ServiceNoteHandler {
	/**
	 * The cached value of the '{@link #getServiceNoteMap() <em>Service Note Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNoteMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> serviceNoteMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceNoteHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingmodelPackage.Literals.SERVICE_NOTE_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getServiceNoteMap() {
		if (serviceNoteMap == null) {
			serviceNoteMap = new EcoreEMap<String,String>(BookingmodelPackage.Literals.SERVICE_NOTE_TO_DESCRIPTION_ENTRY, ServiceNoteToDescriptionEntryImpl.class, this, BookingmodelPackage.SERVICE_NOTE_HANDLER__SERVICE_NOTE_MAP);
		}
		return serviceNoteMap;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public boolean exists(String serviceNote) {
		return this.serviceNoteMap.contains(serviceNote);
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int addServiceNote(String serviceNote, String description) {
		if(!this.serviceNoteMap.equals(null)){
			this.serviceNoteMap.put(serviceNote, description);
			return 0;
		} else {
			return -1;
		}
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int removeServiceNote(String serviceNote) {
		if(!this.serviceNoteMap.isEmpty()){
			if(this.exists(serviceNote)){
				this.serviceNoteMap.remove(serviceNote);
			} else {
				return 1;
			}
			return 0;
		} else {
			return -1;
		}
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public String getServiceNoteDescription(String serviceNote) {
		String description = null;
		if(!this.serviceNoteMap.isEmpty()){
			if(this.exists(serviceNote)){
				description =  this.serviceNoteMap.get(serviceNote);
			} 
		}
		return description;
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public int editServiceNoteDescription(String serviceNote, String description) {
		if(!this.serviceNoteMap.isEmpty()){
			if(this.exists(serviceNote)){
				this.serviceNoteMap.put(serviceNote, description);
			} else {
				return 1;
			}
			return 0;
		} else {
			return -1;
		}
	}

	/**
	 * @inheritDoc
	 * @generated NOT
	 */
	public EList<String> getServices() {
		if(!this.serviceNoteMap.isEmpty()){
			String[] services = this.serviceNoteMap.keySet().toArray(new String[0]);
			return new BasicEList(Arrays.asList(services));
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BookingmodelPackage.SERVICE_NOTE_HANDLER__SERVICE_NOTE_MAP:
				return ((InternalEList<?>)getServiceNoteMap()).basicRemove(otherEnd, msgs);
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
			case BookingmodelPackage.SERVICE_NOTE_HANDLER__SERVICE_NOTE_MAP:
				if (coreType) return getServiceNoteMap();
				else return getServiceNoteMap().map();
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
			case BookingmodelPackage.SERVICE_NOTE_HANDLER__SERVICE_NOTE_MAP:
				((EStructuralFeature.Setting)getServiceNoteMap()).set(newValue);
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
			case BookingmodelPackage.SERVICE_NOTE_HANDLER__SERVICE_NOTE_MAP:
				getServiceNoteMap().clear();
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
			case BookingmodelPackage.SERVICE_NOTE_HANDLER__SERVICE_NOTE_MAP:
				return serviceNoteMap != null && !serviceNoteMap.isEmpty();
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
			case BookingmodelPackage.SERVICE_NOTE_HANDLER___EXISTS__STRING:
				return exists((String)arguments.get(0));
			case BookingmodelPackage.SERVICE_NOTE_HANDLER___ADD_SERVICE_NOTE__STRING:
				return addServiceNote((String)arguments.get(0), (String)arguments.get(1));
			case BookingmodelPackage.SERVICE_NOTE_HANDLER___REMOVE_SERVICE_NOTE__STRING:
				return removeServiceNote((String)arguments.get(0));
			case BookingmodelPackage.SERVICE_NOTE_HANDLER___GET_SERVICE_NOTE_DESCRIPTION__STRING:
				return getServiceNoteDescription((String)arguments.get(0));
			case BookingmodelPackage.SERVICE_NOTE_HANDLER___EDIT_SERVICE_NOTE_DESCRIPTION__STRING:
				return editServiceNoteDescription((String)arguments.get(0), (String)arguments.get(1));
			case BookingmodelPackage.SERVICE_NOTE_HANDLER___GET_SERVICES:
				return getServices();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceNoteHandlerImpl
