/**
 * 
 */
package host;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import bookingmodel.BookingProvides;
import bookingmodel.Customer;
import bookingmodel.impl.BookingProvidesImpl;

/**
 * Testing the class BookingProvidesImpl and its methods.
 */
public class testBookingProvidesImpl {
	String bookingRef;
	String guestEmail;
	String startDate;
	String endDate;
	int nrOfGuests;
	List <String> roomTypes;
	List <String> extras;
	List <String> services;
	
	//Just nu ‰r BookingProvides() en publik konstruktor ist‰llet fˆr protected
	BookingProvides bp = new BookingProvidesImpl();
	
	private void setValues(String guestEmail, String startDate, String endDate, int nrOfGuests, List <String> roomTypes, List <String> extras, List <String> services){
		this.guestEmail = guestEmail;
		this.startDate = startDate;
		this.endDate = endDate;
		this.nrOfGuests = nrOfGuests;
		this.roomTypes = roomTypes;
		this.extras = extras;
		this.services = services;
	}
	
	@Test
	public void testUseCaseMakeABooking(){
		List<String> roomTypes = new ArrayList <String> ();
		this.roomTypes.add("Single");
		List<String> extras = new ArrayList <String> ();
		extras.add("Soaps");
		List<String> services = new ArrayList <String> ();
		this.setValues("grischa@group4.se", "141230", "150104", 3, roomTypes, extras, services);
		testMakeABooking();
	}
	
	private void testMakeABooking(){
		this.testBook();
		this.testSetPersonalDetails();
		this.testSetPaymentDetails();
		this.testSetPaymentMethod(); //pay by card
		this.testPayBooking(); //pay booking directly
	}
	
	@Test
	public void testUseCaseCheckIn(){
		this.testCheckIn();
	}
	
	@Test
	public void testUseCaseCheckOut(){
		this.testCheckIn();
	}
	

	@Test
	public void testUseCaseEditABooking(){
		List<String> roomTypes = new ArrayList <String> ();
		this.roomTypes.add("Double");
		List<String> extras = new ArrayList <String> ();
		extras.add("Shampoo");
		List<String> services = new ArrayList <String> ();
		this.setValues("grischa@group4.se", "141230", "150104", 3, roomTypes, extras, services);
		this.testMakeABooking();
		this.testEditBooking();
	}
	
	//TODO: typ done okej
		/**
		 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#book(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)}.
		 * Test make a booking.
		 * 
		 * Also testes the getters:
		 * getStartDate, getEndDate, getNrOfGuests, getRoomTypes, getExtras, getServiceNotes
		 */
		private void testBook() {
			// Create a booking reference 
			bp.book(startDate, endDate, nrOfGuests, roomTypes, extras, services);	
			
			// Assert true if the imparams is equal to what is stored in the booking
			assertTrue(bp.getStartDate(bookingRef).equals(startDate));
			assertTrue(bp.getEndDate(bookingRef).equals(endDate));
			assertTrue(bp.getNrOfGuests(bookingRef) == nrOfGuests);
			assertTrue(bp.getRoomTypes(bookingRef).equals(roomTypes));
			assertTrue(bp.getExtras(bookingRef).equals(extras));
			assertTrue(bp.getServiceNotes(bookingRef).equals(services));
			fail("Failed to book.");
		}

		//TODO: typ done okej
		/**
		 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#setPersonalDetails(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)}.
		 * Test by first creating a booking, and use its booking reference.
		 * assertTrue will asserts true if the created booking reference is equals to the returned value of a booking.
		 * Set personal details and asserts true if it is equal to 0.
		 */
		private void testSetPersonalDetails() {		
			//borde ändras! vi får enbart använda metoder tillgängliga i bp
			String firstName = "Mr";
			String lastName =  "Grischa";
			int age = 30; 
			String customerEmail = "grischa@group4.se";
			String bookingRef = bp.getBookingRef(customerEmail);
			
			// Set personal details and asserts true if it is equal to 0 and the details are saved for the customer
			int setPeD = bp.setPersonalDetails(firstName, lastName, age, customerEmail, bookingRef);
			assertTrue("Failed to set personal details", setPeD == 0);
			assertTrue(bp.getCustomerName(customerEmail).equals(firstName));
			assertTrue(bp.getCustomerLastName(customerEmail).equals(lastName));
			assertTrue(bp.getCustomerAge(customerEmail) == age);	
			assertTrue(bp.getCustomerEmail(customerEmail).equals(customerEmail));
			fail("setPersonalDetails failed.");
		}

		//TODO: typ done okej
		/**
		 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#setPaymentDetails(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
		 * Test by first creating a booking, and use its booking reference.
		 * assertTrue will asserts true if the created booking reference is equals to the returned value of a booking.
		 * Set payment details and asserts true if it is equal to 0.
		 */
		private void testSetPaymentDetails() {
			String ccNumber = "5545 0111 1337 4242 6666";
			String ccv = "112";
			int expiryMonth = 06;
			int expiryYear = 18;
			String firstName = "Mr";
			String lastName =  "Grischa";
			String customerEmail = "grischa@group4.se";
			String bookingRef = bp.getBookingRef(customerEmail);
			
			// Set payment details to a specific booking reference and assert true if it is equal to 0.
			int setPaD = bp.setPaymentDetails(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, customerEmail, bookingRef);
			
			assertTrue("Failed to set payment details", setPaD == 0);
			
			assertTrue(bp.getCcNr(bookingRef).equals(ccNumber));
			assertTrue(bp.getCcV(bookingRef).equals(ccv));
			assertTrue(bp.getExpMonth(bookingRef) == expiryMonth);
			assertTrue(bp.getExpYear(bookingRef) == expiryYear);
			assertTrue(bp.getCardFirstName(bookingRef).equals(firstName));
			assertTrue(bp.geCardtLastName(bookingRef).equals(lastName));
			assertTrue(bp.getCustomerEmail(bookingRef).equals(customerEmail));
			fail("setPaymentDetails failed.");
		}
	
		//TODO: typ done okej
		/**
		 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#setPaymentMethod(java.lang.String, java.lang.String)}.
		 * Test by first creating a booking, and use its booking reference.
		 * assertTrue will asserts true if the created booking reference is equals to the returned value of a booking.
		 * Then set payment method and asserts true if it is equal to 0.
		 * 
		 * Also testes the getter:
		 * getPaymentMethod
		 */
		private void testSetPaymentMethod() {
			// Set payment method to a specific booking reference and assert true if it is equal to 0.
			String method = "VOUCHER";
			int setPM = bp.setPaymentMethod(method, bookingRef);
			assertTrue("Failed to set payment method", setPM == 0);
			assertTrue(bp.getPaymentMethod(bookingRef).equals(method));
			fail("setPaymentMethod failed");
		}
		
		//TODO: typ done okej
		/**
		 * Testes the method for paying a booking
		 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#pay(java.lang.String)}.
		 */
		private void testPayBooking() {
			bp.payBooking(bookingRef);
			assertTrue("Failed to test pay booking", bp.isBookingPayed(bookingRef));
			fail("Test pay booking failed");
		}

	
	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#checkIn(java.lang.String, java.lang.String)}.
	 * Check-in by first creating a booking, and use its booking reference,
	 * the roomtype (in this case, "Single"), and guestEmail (in this case, grischa@group4.com).
	 * If success, the checkIn method will return 0.
	 * assertTrue will asserts if the condition is true.
	 */
	@Test
	public void testCheckIn() {
		
		// Check in with booking reference, roomtype and email
		int checkIn = bp.checkIn(bookingRef, roomTypes.get(0), guestEmail);
		
		//Get concrete rooms, TODO: check if any of these rooms has that email address as responsible, if so assertTrue
		int roomID = bp.getRooms(bookingRef).get(0);
		
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
		//make a new booking which is supposed to be unpayed
		String bookingRef = bp.book("150103", "150114", nrOfGuests, roomTypes, extras, services);
				
		//pay for the booking so that we can check-out without any problems
		bp.payBooking(bookingRef);
		
		//checkIn in order to be able to get concrete rooms
		bp.checkIn(bookingRef, roomTypes.get(0), guestEmail);
				
		//Get a from the booking in order to be able to check-out
		int roomID = bp.getRooms(bookingRef).get(0);

		//invoke check-out
		int checkOut = bp.checkOut(roomID, guestEmail);

		// Asserts that the condition is true. If it isn't, it throws an AssertionError with the given message.
		assertTrue("The check out failed", checkOut==0);
		
		// Asserts true if the guest responsible to the room has been removed and "out".
		// If it isn't, it throws an AssertionError with the given message.
		assertTrue("Failed to remove room.", bp.isCheckedOut(roomID)); //TODO a method somethinglike this
		
		// Asserts true if the booking reference connected to the room has been removed.
		// If it isn't, it throws an AssertionError with the given message.
		assertTrue("Failed to remove booking reference.", bp.getBookingHandler().getRoomIDToBookingRefMap().get(roomID).equals(null));
		
		fail("testCheckOut failed");
	}
	
	

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#pay(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)}.
	 * TODO: implement this method.
	 */
	@Test
	public void testPayRoomID() {
		//must ensure these works before one can test pay for a room
		this.testBook();
		this.testCheckIn();
		
		//make a new booking which is supposed to be unpayed
		String bookingRef = bp.book("150107", "150117", nrOfGuests, roomTypes, extras, services);
		
		//checkIn in order to be able to get concrete rooms
		bp.checkIn(bookingRef, roomTypes.get(0), guestEmail);
		
		//Get a room from the booking when checking in
		Integer roomNrOneOfBooking = bp.getRooms(bookingRef).get(0);
		
		//give some new bank-card information
		String ccNumber = "000 0932 1337 4999 2323";
		String ccv = "221";
		int expiryMonth = 9;
		int expiryYear = 16;
		String firstName = "Mr";
		String lastName =  "Grischa";
		
		//invoke payroom
		bp.payRoom(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, roomNrOneOfBooking);
		
		assertTrue("Failed to test pay room", bp.isRoomPayed(roomNrOneOfBooking)); //TODO: add that method
		fail("Test pay room failed");
	}
	
	@Test
	public void testIsPayed(){
		
	}
	@Test
	public void testGetServiceNotes(){
		
	}
	
	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#pay(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)}.
	 * TODO: implement this method.
	 */
	@Test
	public void testPayExtra(){
		//must ensure these works before one can test pay for an extra
		this.testBook();
		this.testCheckIn();

		//make a new booking which is supposed to be unpayed
		String bookingRef = bp.book("150123", "150128", nrOfGuests, roomTypes, extras, services);
		
		//checkIn in order to be able to get concrete rooms
		bp.checkIn(bookingRef, roomTypes.get(0), guestEmail);
				
		//Get a room from the booking when checking in
		Integer roomID = bp.getRooms(bookingRef).get(0);
		
		//Get a extra to pay for
		List <String> extras = bp.getExtras(bookingRef);
				
		//give some new bank-card information
		String ccNumber = "000 0932 1337 4999 2323";
		String ccv = "221";
		int expiryMonth = 9;
		int expiryYear = 16;
		String firstName = "Mr";
		String lastName =  "Grischa";
		
		//invoke pay extra
		bp.payExtra(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, extras, roomID);
		

		assertTrue("Failed to test pay extra", bp.isPayed(extras)); //TODO: add that method
		fail("Test pay extra failed");
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
		// Remove a booking reference and assert true if it is NOT equal to the returned value of a booking.
		int rmB = bp.removeBooking(bookingRef);
		
		assertTrue("Failed to remove a booking", rmB == 0);
		assertTrue("The booking reference is still there!", !(this.bp.book(startDate, endDate, nrOfGuests, roomTypes, extras, services).equals(bookingRef)));
		fail("removeBooking failed");
	}

	/**
	 * Test method for {@link bookingmodel.impl.BookingProvidesImpl#editBooking(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)}.
	 * Test by first creating a booking, and use its booking reference.
	 * assertTrue will asserts if the created booking reference is equals to the returned value of a booking.
	 * Edit the booking reference and assertTrue if it has been edited.
	 * Also assertTrue if the booking reference is NOT equals to the returned value of a booking.
	 * 
	 * Also testes the getters:
	 * getStartDate, getEndDate, getNrOfGuests, getRoomTypes, getExtras, getServiceNotes
	 */
	@Test
	public void testEditBooking() {
		// Edit a booking and assert true if it is equal to 0.
		int edBP = bp.editBooking(bookingRef, startDate, endDate, nrOfGuests, roomTypes, extras, services);
		assertTrue("Failed to edit a booking", edBP == 0);
		
		// Assert true if the imparams is equal to what is stored in the booking
		assertTrue(bp.getStartDate(bookingRef).equals(startDate));
		assertTrue(bp.getEndDate(bookingRef).equals(endDate));
		assertTrue(bp.getNrOfGuests(bookingRef) == nrOfGuests);
		assertTrue(bp.getRoomTypes(bookingRef).equals(roomTypes));
		assertTrue(bp.getExtras(bookingRef).equals(extras));
		assertTrue(bp.getServiceNotes(bookingRef).equals(services));

		fail("editBooking failed");
	}





	
}
