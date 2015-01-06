package host;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import maintenancemodel.ExtraHandler;
import maintenancemodel.ExtrasMaintenance;
import maintenancemodel.IExtrasMaintenance;
import maintenancemodel.MaintenanceProvidesForBooking;
import maintenancemodel.RoomHandler;
import maintenancemodel.impl.ExtraHandlerImpl;
import maintenancemodel.impl.ExtrasMaintenanceImpl;
import maintenancemodel.impl.MaintenanceProvidesForBookingImpl;
import maintenancemodel.impl.RoomHandlerImpl;
import maintenancemodel.impl.RoomMaintenanceImpl;

import org.junit.BeforeClass;
import org.junit.Test;

import bookingmodel.BookingProvides;
import bookingmodel.impl.BookingProvidesImpl;


public class testUseCases {
	/*
	 * A problem we found out to late was that we may have any number of instances in our system
	 * As it is right now we have two differnet RoomtypeHandlers in RoomMaintenence and in MaintenenceProvidesForBooking
	 * If we add a roomtype in Handler we cant reach it through Maintenece.
	 * As mentioned we found this out very late in the prossess and decided that it would take to much time 
	 * to redo the diagram and generate for a singleton pattern or any other pattern that would solve this problem	
	 */
	BookingProvides bookingprovides  	= new BookingProvidesImpl();
	
	RoomHandler roomHandler				= new RoomHandlerImpl();
	RoomMaintenanceImpl roomMaintenence = new RoomMaintenanceImpl(); 
	MaintenanceProvidesForBooking mpb   = new MaintenanceProvidesForBookingImpl();
	ExtraHandler extraHandler			= new ExtraHandlerImpl();
	IExtrasMaintenance extraMaintenance = new ExtrasMaintenanceImpl();
	
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
		addExtras();
		makeABooking();
	}
	
	//Adds extras to the system
	private void addExtras() {
		extraHandler.addExtra("1", 100, "Bag of SWAG", "All the swag you'll ever need", true);
		extraHandler.addExtra("2", 100, "Souna", "Hot and sweaty, mhh mmhh mmmmmmmmmm", true);
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

		//Wants to pay directly
		assertTrue(bookingprovides.setPaymentMethod("bankcard", bookingReference) == 0);
		assertTrue(bookingprovides.payBooking(bookingRef) == 0);
		//Gives the bookingRef
		System.out.println(bookingRef);
	}
	
	/*
	 * Alt flow MAB: the chosen checkin/checkout-date is invalid 
	 * (exists but has passed)
	 */
	public void testMABAltFlow2a(){
		int nrOfGuests   		 = 2;
		List<String> roomTypes	 = new ArrayList <String>();
		List<String> extras		 = new ArrayList <String>();
		List<String> services    = new ArrayList <String>();
		roomTypes.add("Economic");

		String bookingRef = bookingprovides.book("130101", "130112", nrOfGuests, roomTypes, extras, services);
		assertFalse(bookingRef.equals(""));
	}
	
	/*
	 * Alt flow MAB: chosen checkout-date is before checkin-date
	 */
	public void testMABAltFlow2b(){
		int nrOfGuests   		 = 2;
		List<String> roomTypes	 = new ArrayList <String>();
		List<String> extras		 = new ArrayList <String>();
		List<String> services    = new ArrayList <String>();
		roomTypes.add("Economic");

		String bookingRef = bookingprovides.book("150310", "150220", nrOfGuests, roomTypes, extras, services);
		assertFalse(bookingRef.equals(""));
	}
	
	/*
	 * Alt flow MAB: 
	 */
	public void testMABAltFlow2c(){
		
	}
	
	/*
	 * Alt flow MAB: 
	 */
	public void testMABAltFlow2d(){
		
	}
	
	/*
	 * Alt flow MAB: 
	 */
	public void testMABAltFlow2e(){
		
	}
	
	/*
	 * Alt flow MAB: 
	 */
	public void testMABAltFlow6(){
		
	}
	
	/*
	 * Alt flow MAB: 
	 */
	public void testMABAltFlow8(){
		
	}
	
	/*
	 * Alt flow MAB: 
	 */
	public void testMABAltFlow10(){
		
	}
	
	/*
	 * Alt flow MAB: 
	 */
	public void testMABAltFlow13(){
		
	}
	
	/*
	 * Main flow check in and out
	 */
	@Test
	public void testMakeABookingAllternative1A() {
		String startDate 		 = "150210";
		String endDate   	 	 = "150212";
		int nrOfGuests   		 = 2;
		List<String> roomTypes	 = new ArrayList <String>();
		List<String> extras		 = new ArrayList <String>();
		List<String> services    = new ArrayList <String>();
		
		roomTypes.add("Economic");
		extras.add("1");
		extras.add("2");
		services.add("Took a cab from the hotel");
		services.add("Went skydiving");
		
		String bookingRef = bookingprovides.book(startDate, endDate, nrOfGuests, roomTypes, extras, services);
		assertFalse(bookingRef.compareTo("") == 0);
		assertTrue(extraHandler.exists("1"));
		assertTrue(extraHandler.exists("2"));
		assertTrue(bookingprovides.getBookingHandler().getBooking(bookingRef).getExtras().size()       == 2);
		assertTrue(bookingprovides.getBookingHandler().getBooking(bookingRef).getServiceNotes().size() == 2);
		
		
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
	
	/*
	 * Alternative flow CheckOut: Room ID does not exist
	 */
	@Test
	public void testCheckOutAltFlow2a(){
		int checkout = bookingprovides.checkOut(3000);
		assertTrue(checkout == -1);
	}
	
	/*
	 * Alternative flow CheckOut: Room ID status is not busy
	 */
	@Test
	public void testCheckOutAltFlow2b(){
		int checkout = bookingprovides.checkOut(2);
		assertTrue(checkout == -1);
	}	

	@Test
	public void testEditAvalabilityOfRoom() {

	}


}
