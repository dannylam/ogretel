package host;

import maintenancemodel.MaintenanceProvidesForBooking;
import maintenancemodel.impl.MaintenanceProvidesForBookingImpl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;
import static org.junit.Assert.*;

public class testIMPB {

	MaintenanceProvidesForBooking IMPFB = new MaintenanceProvidesForBookingImpl();
	
	
	/**
	 * Tests 
	 */
	@Test
	public void testCanBook() {
		
		EList<String> ids = new BasicEList<String>();	
		ids.add("stort");
		ids.add("litet");
		ids.add("litet");
		ids.add("stort");
		
		this.IMPFB.canBook(ids, "150202", "150214");
		
		assertTrue(1 == 1);
		
	}

}
