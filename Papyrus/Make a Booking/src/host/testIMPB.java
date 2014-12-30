package host;

import static org.junit.Assert.assertTrue;
import maintenancemodel.MaintenanceProvidesForBooking;
import maintenancemodel.impl.MaintenanceProvidesForBookingImpl;

import org.junit.Test;

public class testIMPB {

	MaintenanceProvidesForBooking IMPFB = new MaintenanceProvidesForBookingImpl();
	
	
	/**
	 * Tests whether canBook does what it should i.e see if there are available rooms.
	 */
	@Test
	public void testgetCap() {
		
//		assertTrue(IMPFB.getCalendar().getCap(start, end, roomType));
		
		
	}

}
