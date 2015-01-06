package host;

import static org.junit.Assert.assertTrue;

import maintenancemodel.Experience;
import maintenancemodel.AbstractExtra;
import maintenancemodel.Product;
import maintenancemodel.Extra;
import maintenancemodel.ExtraHandler;
import maintenancemodel.ExtrasMaintenance;

import maintenancemodel.impl.ExperienceImpl;
import maintenancemodel.impl.AbstractExtraImpl;
import maintenancemodel.impl.ProductImpl;
import maintenancemodel.impl.ExtraHandlerImpl;
import maintenancemodel.impl.ExtrasMaintenanceImpl;

import org.eclipse.emf.common.util.EMap;
import org.junit.Test;

public class testExtras {
	@Test
	public void testAddExtra () {
		ExtraHandler extraHandler = new ExtraHandlerImpl();
		
		String description = "Such fun, verry wow";
		int price = 100;
		
		String experienceName = "Yoloing";
		String experienceID = "0";
		
		String productName = "Bag of swag";
		String productID = "1";
		
		extraHandler.addExtra(experienceID, price, experienceName, description, false);
		extraHandler.addExtra(productID,  price, productName,    description, true);
		
		AbstractExtra experience = (AbstractExtra) extraHandler.getExtra(experienceID);
		AbstractExtra product = (AbstractExtra) extraHandler.getExtra(productID);
	
		assertTrue(experience.getDescription().compareTo(description) == 0);
		assertTrue(experience.getName().compareTo(experienceName) == 0);
		assertTrue(experience.getPrice() == price);
		assertTrue(experience.getID() == experienceID);
		
		assertTrue(product.getDescription().compareTo(description) == 0);
		assertTrue(product.getName().compareTo(productName) == 0);
		assertTrue(product.getPrice() == price);
		assertTrue(product.getID() == productID);	
		}
	
	@Test
	public void testRemoveAndExistsExtra() {
		ExtraHandler extraHandler = new ExtraHandlerImpl();
		String description = "Such fun, verry wow";
		int price = 100;
		String name = "Yoloing";
		String ID = "0";
		
		extraHandler.addExtra(ID, price, name, description, false);
		AbstractExtra extra = (AbstractExtra) extraHandler.getExtra(ID);
		assertTrue(extraHandler.exists(ID));
		extraHandler.removeExtra(ID);
		assertTrue(extraHandler.getExtra(ID) == null);
	}
}
