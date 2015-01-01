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
 * Testing the booking provides class.
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
		//checka in med bookingref, guestemail och roomstype.
		//ej skapa bokning/edit
		
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
		testBook();
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		
		assertTrue(this.bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef));
		
		int rmB = bp.removeBooking(bookingRef);
		assertTrue(rmB == 0);
		assertTrue(!(this.bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef)));
		
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
		testBook();			// antag att det finns en bokningsreferens redan
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		
		String method = "VOUCHER";
		int setPM = bp.setPaymentMethod(method, bookingRef);
		
		assertTrue(setPM == 0);
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#setPaymentDetails(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testSetPaymentDetails() {
		testBook();			
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		
		String ccNumber = "5545 0111 1337 4242 6666";
		String ccv = "112";
		int expiryMonth = 06;
		int expiryYear = 18;
		String firstName = "Mr";
		String lastName =  "Grischa";
		String customerEmail = "grischa@group4.se";
		
		int setPaD = bp.setPaymentDetails(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, customerEmail, bookingRef);
	
		assertTrue(setPaD == 0);
		
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#setPersonalDetails(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testSetPersonalDetails() {
		testBook();			
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		
		String firstName = "Mr";
		String lastName =  "Grischa";
		int age = 30; 
		String customerEmail = "grischa@group4.se";
		
		//NOTE: i BookingProvidesImpl heter det email och inte customerEmail.
		int setPeD = bp.setPersonalDetails(firstName, lastName, age, customerEmail, bookingRef);
		
		assertTrue(setPeD == 0);
		
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
