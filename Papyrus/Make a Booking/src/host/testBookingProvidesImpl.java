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
 * Testing the class BookingProvidesImpl and its methods.
 */
public class testBookingProvidesImpl {
	String bookingRef;
	String guestEmail = "grischa@group4.se";
	String startDate = "141230";
	String endDate = "150104";
	int nrOfGuests = 3;
	String roomTypes = "Single";
	String extras = "Soaps";
	
	//Just nu är BookingProvides() en publik konstruktor istället för protected
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
		// Create a booking reference and assert true if it is equal to the returned value of a booking.
		testBook();
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		assertTrue(this.bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef));
		
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
	 * If success, the checkOut method will return 0.
	 * assertTrue will asserts if the condition is true.
	 */
	@Test
	public void testCheckOut() {
		// Create a roomID and a checkout
		int roomID = 378;
		int checkOut = bp.checkOut(roomID, guestEmail);
		
		/* TODO: should we create a booking and try to check-out? 
		testBook();*/
		
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
	 * Get price by first creating a booking, and use its booking reference,
	 * and the price of the given bookingRef. 
	 * If success, the getPrice method will return 0.
	 * AssertTrue will asserts if the condition is true.
	 */
	@Test
	public void testGetPrice() {
		// Create a booking reference and assert true if it is equal to the returned value of a booking.
		testBook();
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		assertTrue(this.bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef));
		
		// TODO: this feels a bit ridiculous but Im not sure how else the price should be compared/accessed.
		// TODO: The getPrice returns extraPrice + roomTypesPrice, shouldn't it return 0 as a success?
		assertTrue("Failed to get price", (bp.getPrice(bookingRef) == 0));
		fail("getPrice failed");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#removeBooking(java.lang.String)}.
	 * Test by first creating a booking, and use its booking reference.
	 * assertTrue will asserts if the created booking reference is equals to the returned value of a booking.
	 * Remove the booking reference and assertTrue if it has been removed.
	 * Also assertTrue if the booking reference is NOT equals to the returned value of a booking.
	 */
	@Test
	public void testRemoveBooking() {
		// Create a booking reference and assert true if it is equal to the returned value of a booking.
		testBook();
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		assertTrue(this.bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef));
		
		// Remove a booking reference and assert true if it is NOT equal to the returned value of a booking.
		int rmB = bp.removeBooking(bookingRef);
		assertTrue("Failed to remove a booking", rmB == 0);
		assertTrue("The booking reference is still there!", !(this.bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef)));
		
		fail("removeBooking failed");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#editBooking(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)}.
	 * Test by first creating a booking, and use its booking reference.
	 * assertTrue will asserts if the created booking reference is equals to the returned value of a booking.
	 * Edit the booking reference and assertTrue if it has been edited.
	 * Also assertTrue if the booking reference is NOT equals to the returned value of a booking.
	 */
	@Test
	public void testEditBooking() {
		// Create a booking reference and assert true if it is equal to the returned value of a booking.
		testBook();
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		assertTrue(this.bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef));
		
		// Edit a booking and assert true if it is equal to 0.
		int edBP = bp.editBooking(bookingRef, startDate, endDate, nrOfGuests, roomTypes, extras);
		assertTrue("Failed to edit a booking", edBP == 0);
		
		fail("editBooking failed");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#setPaymentMethod(java.lang.String, java.lang.String)}.
	 * Test by first creating a booking, and use its booking reference.
	 * assertTrue will asserts true if the created booking reference is equals to the returned value of a booking.
	 * Then set payment method and asserts true if it is equal to 0.
	 */
	@Test
	public void testSetPaymentMethod() {
		// Create a booking reference and assert true if it is equal to the returned value of a booking.
		testBook();	
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		assertTrue(this.bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef));
		
		// Set payment method to a specific booking reference and assert true if it is equal to 0.
		String method = "VOUCHER";
		int setPM = bp.setPaymentMethod(method, bookingRef);
		assertTrue("Failed to set payment method", setPM == 0);
		
		fail("setPaymentMethod failed");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#setPaymentDetails(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 * Test by first creating a booking, and use its booking reference.
	 * assertTrue will asserts true if the created booking reference is equals to the returned value of a booking.
	 * Set payment details and asserts true if it is equal to 0.
	 */
	@Test
	public void testSetPaymentDetails() {
		// Create a booking reference and assert true if it is equal to the returned value of a booking.
		testBook();	
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);
		assertTrue(this.bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef));
		
		String ccNumber = "5545 0111 1337 4242 6666";
		String ccv = "112";
		int expiryMonth = 06;
		int expiryYear = 18;
		String firstName = "Mr";
		String lastName =  "Grischa";
		String customerEmail = "grischa@group4.se";
		
		// Set payment details to a specific booking reference and assert true if it is equal to 0.
		int setPaD = bp.setPaymentDetails(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, customerEmail, bookingRef);
		assertTrue("Failed to set payment details", setPaD == 0);
		
		fail("setPaymentDetails failed.");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#setPersonalDetails(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)}.
	 * Test by first creating a booking, and use its booking reference.
	 * assertTrue will asserts true if the created booking reference is equals to the returned value of a booking.
	 * Set personal details and asserts true if it is equal to 0.
	 */
	@Test
	public void testSetPersonalDetails() {
		// Create a booking reference and assert true if it is equal to the returned value of a booking.
		testBook();	
		bookingRef = bp.book(startDate, endDate, nrOfGuests, roomTypes, extras);	
		assertTrue(this.bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef));
		
		String firstName = "Mr";
		String lastName =  "Grischa";
		int age = 30; 
		String customerEmail = "grischa@group4.se";
		
		// Set personal details and asserts true if it is equal to 0.
		//NOTE: i BookingProvidesImpl heter det email och inte customerEmail.
		int setPeD = bp.setPersonalDetails(firstName, lastName, age, customerEmail, bookingRef);
		assertTrue("Failed to set personal details", setPeD == 0);
		
		fail("setPersonalDetails failed.");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#book(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testBook() {
		// Assert true if the booking reference is equal to the returned value of the booking. 
		assertTrue("Failed to book.", bp.book(startDate, endDate, nrOfGuests, roomTypes, extras).equals(bookingRef));
		
		fail("book failed.");
	}

}
