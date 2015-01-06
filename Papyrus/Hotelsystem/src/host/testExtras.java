package host;

import static org.junit.Assert.assertTrue;
import maintenancemodel.AbstractExtra;
import maintenancemodel.ExtraHandler;
import maintenancemodel.impl.ExtraHandlerImpl;

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
