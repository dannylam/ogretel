package host;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import maintenancemodel.impl.RoomMaintenanceImpl;

import org.junit.BeforeClass;
import org.junit.Test;

import bookingmodel.BookingProvides;
import bookingmodel.impl.BookingProvidesImpl;


public class testUseCases {

	RoomMaintenanceImpl roomMaintenence = new RoomMaintenanceImpl();
	BookingProvides bookingprovides  	= new BookingProvidesImpl();

	//User 1
	String firstName = "Nils";
	String lastName	 = "Holgersson";
	int age			 = 22;
	String email	 = "ride@goose.se";
	//card User 1
	String ccNumber  = "1234 1234 1234 1234";
	String ccv		 = "225";				
	int expMonth     = 9;
	int expYear		 = 18;

	//globalBookingRef
	String bookingReference = "";

	/*
	 * Set up before the tests begin.
	 */
	@BeforeClass
	public void setUpBeforeClass () throws Exception {
		roomMaintenence.addRoomType("Economic", "doublebed", 100, 3, "A fine room indeed");
		for(int i=1; i<10; i++) {
			roomMaintenence.addRoom(i, "Economic");
		}

		makeABooking();
	}

	/*
	 * Creates a booking in the system to make sure we have it during testing.
	 * It is not payed. The global "bookingReference" 
	 */
	private void makeABooking() {
		List <String> roomTs = new ArrayList <String>();
		roomTs.add("Economics");
		bookingReference = bookingprovides.book("150110", "150114", 2, roomTs,
				new ArrayList <String>(), new ArrayList <String>());

		bookingprovides.setPersonalDetails(firstName, lastName, age, email, bookingReference);
		bookingprovides.setPaymentDetails(ccNumber, ccv, expMonth, expYear, firstName, lastName, email, bookingReference);
		bookingprovides.setPaymentMethod("bankcard", bookingReference);
	}

	/*
	 * Main flow of making a booking
	 */
	@Test
	public void testMakeABookingMainFlow() {
		String startDate 		 = "150110";
		String endDate   	 	 = "150112";
		int nrOfGuests   		 = 2;
		List<String> roomTypes	 = new ArrayList <String>();
		List<String> extras		 = new ArrayList <String>();
		List<String> services    = new ArrayList <String>();

		roomTypes.add("Economic");

		String bookingRef = bookingprovides.book(startDate, endDate, nrOfGuests, roomTypes, extras, services);
		assertFalse(bookingRef.compareTo("") == 0);

		int price = bookingprovides.getPrice(bookingRef);
		System.out.println("Price: " + price);
		//Finds the price accepteble
		assertTrue(bookingprovides.setPersonalDetails(firstName, lastName, age, email, bookingRef) == 0);
		assertTrue(bookingprovides.setPaymentDetails(ccNumber, ccv, expMonth, expYear, firstName, lastName, email, bookingRef) == 0);

		//Wants to pay dirrectly
		assertTrue(bookingprovides.setPaymentMethod("bankcard", bookingReference) == 0);
		assertTrue(bookingprovides.payBooking(bookingRef) == 0);
		//Gives the bookingRef
		System.out.println(bookingRef);
	}

	/*
	 * Main flow check in and out
	 */
	@Test
	public void testCheckInCheckOut() {
		//CheckIn
		assertTrue(bookingprovides.checkIn(bookingReference, "Economic", email) == 0);
		int roomID = bookingprovides.getRooms(bookingReference).get(0);
		assertTrue(bookingprovides.isCheckedIn(roomID));
		//CheckOut
		int price = bookingprovides.checkOut(roomID);
		assertTrue(price >= 0);
		assertTrue(bookingprovides.payBooking(bookingReference) == 0);
		assertTrue(bookingprovides.isCheckedOut(roomID));
	}
	
	/*
	 * Alternativ flow CheckIn: The booking number does not exist.
	 */
	@Test
	public void testCheckInAltFlow2(){
		int checkin = bookingprovides.checkIn(bookingReference, "Economic", email);
		assertTrue(checkin == -1);
	}
	

	@Test
	public void testEditAvalabilityOfRoom() {

	}


}
