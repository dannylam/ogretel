/**
 * 
 */
package host;

import static org.junit.Assert.*;
import maintenancemodel.IRoomMaintenance;
import maintenancemodel.impl.RoomMaintenanceImpl;

import org.junit.Test;

import bookingmodel.BookingHandler;
import bookingmodel.BookingProvides;
import bookingmodel.impl.BookingHandlerImpl;
import bookingmodel.impl.BookingProvidesImpl;

/**
 * @author Paula
 *
 */
public class testBookingProvidesImpl {
	String bookingRef;
	String guestEmail = "grischa@group4.se";
	String startDate = "141230";
	String endDate = "150104";
	int nrOfGuests = 3;
	String roomTypes = "Single";
	String extras = "Soaps";
	
	private BookingProvides bp = new BookingProvidesImpl();
	
	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#checkIn(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testCheckIn() {
		
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#checkOut(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testCheckOut() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#pay(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testPayStringStringIntIntStringString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#pay(java.lang.String)}.
	 */
	@Test
	public void testPayString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#getPrice(java.lang.String)}.
	 */
	@Test
	public void testGetPrice() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#removeBooking(java.lang.String)}.
	 */
	@Test
	public void testRemoveBooking() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#editBooking(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testEditBooking() {
		testBook();
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		int edBP = bp.editBooking(bookingRef, startDate, endDate, nrOfGuests, roomTypes, extras);
		
		assertTrue(edBP == 0);
		
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#setPaymentMethod(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testSetPaymentMethod() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#setPaymentDetails(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testSetPaymentDetails() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#setPersonalDetails(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testSetPersonalDetails() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#book(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testBook() {
		assertTrue(bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef));
		
		fail("Not yet implemented");
	}

}
