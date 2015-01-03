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
	
	//Just nu är BookingProvides en publik konstruktor istället för protected
	BookingProvides bp = new BookingProvidesImpl();
	
	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#checkIn(java.lang.String, java.lang.String)}.
	 * Check-in by first creating a booking, and use its booking reference,
	 * the roomtype (in this case, "Single"), and guestEmail (in this case, grischa@group4.com).
	 * If success, the checkIn method will return 0.
	 * assertTrue will asserts if the condition is true.
	 */
	@Test
	public void testCheckIn() {
		// Create a booking with booking reference
		testBook();
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		// Check in with booking reference, roomtype and email
		int checkIn = bp.checkIn(bookingRef, roomTypes, guestEmail);
		
		// Asserts that the condition is true. If it isn't, it throws an AssertionError with the given message.
		assertTrue("The check in failed.", checkIn==0);
		fail("testCheckIn failed");	
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#checkOut(java.lang.String, java.lang.String)}.
	 * Check-out by first creating a booking, and use its booking reference,
	 * the roomID, and checkOut (in this case, checking out using roomID and guestEmail). 
	 * If success, the checkIn method will return 0.
	 * assertTrue will asserts if the condition is true.
	 */
	@Test
	public void testCheckOut() {
		// Create a roomID and a checkout
		int roomID = 378;
		int checkOut = bp.checkOut(roomID, guestEmail);
		
		// Create a booking
		testBook();
		// Asserts that the condition is true. If it isn't, it throws an AssertionError with the given message.
		assertTrue("The check out failed", checkOut==0);
		
		// Asserts that the guest responsible to the room has been removed and "out" (true).
		// If it isn't, it throws an AssertionError with the given message.
		assertTrue("Failed to remove room.", bp.getBookingHandler().getBooking(roomID).getRoomIDToGuestMap().get(roomID).equals("out"));
		
		// Asserts that the bookingreference connected to the room has been removed (true).
		// If it isn't, it throws an AssertionError with the given message.
		assertTrue("Failed to remove booking reference.", bp.getBookingHandler().getRoomIDToBookingRefMap().get(roomID).equals(null));
		
		fail("testCheckOut failed");
	}
	
	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#pay(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)}.
	 * TODO: implement this method.
	 */
	@Test
	public void testPayStringStringIntIntStringString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#pay(java.lang.String)}.
	 * TODO: implement this method.
	 */
	@Test
	public void testPayString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#getPrice(java.lang.String)}.
	 * Get prive by first creating a booking, and use its booking reference,
	 * and the price of the given bookingRef. 
	 * If success, the getPrice method will return 0.
	 * AssertTrue will asserts if the condition is true.
	 */
	@Test
	public void testGetPrice() {
		// Create a booking
		testBook();
		// 
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		int price = bp.getPrice(bookingRef);
		//this feels a bit ridiculous but Im not sure how else the price should be compared/accessed.
		assertTrue("Failed to get price", price == bp.getPrice(bookingRef));
		fail("GetPrice failed");
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
		
		fail("No booking reference or wrong inparametres.");
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
		
		fail("No booking reference or wrong inparametres.");
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
		fail("No booking reference or wrong inparametres.");
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
		
		fail("No booking reference or wrong inparametres.");
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
		
		fail("No personal details found or wrong inparametres.");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#book(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testBook() {
		assertTrue(bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef));
		
		fail("No booking found or wrong inparametres.");
	}

}
