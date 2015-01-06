package host;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import maintenancemodel.IExtrasMaintenance;
import maintenancemodel.IMaintenanceProvidesForBooking;
import maintenancemodel.IRoomMaintenance;
import maintenancemodel.IRoomTypeMaintenance;
import maintenancemodel.impl.ExtrasMaintenanceImpl;
import maintenancemodel.impl.MaintenanceProvidesForBookingImpl;
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
	static BookingProvides bookingprovides  	= new BookingProvidesImpl();
	static RoomMaintenanceImpl rmi = new RoomMaintenanceImpl();
	static IRoomMaintenance roomMaintenence = rmi; 
	static IRoomTypeMaintenance roomTypeMaintenance = rmi;
	static IMaintenanceProvidesForBooking mpb   = new MaintenanceProvidesForBookingImpl();
	static IExtrasMaintenance extraMaintenance = new ExtrasMaintenanceImpl();

	//User 1
	static String firstName = "Nils";
	static String lastName	 = "Holgersson";
	static int age			 = 22;
	static String email	 = "ride@goose.se";
	//card User 1
	static String ccNumber  = "1234 1234 1234 1234";
	static String ccv		 = "225";				
	static int expMonth     = 9;
	static int expYear		 = 18;

	//globalBookingRef
	static String bookingReference = "";

	/*
	 * Set up before the tests begin.
	 */
	@BeforeClass
	public static void setUpBeforeClass () throws Exception {
		roomTypeMaintenance.addRoomType("Economic", "doublebed", 100, 3, "A fine room indeed");
		for(int i=1; i<10; i++) {
			roomMaintenence.addRoom(i, "Economic");
		}
		addExtras();
		makeABooking();
		
	}

	//Adds extras to the system
	private static void addExtras() {
		extraMaintenance.addExtra("1", 100, "Bag of SWAG", "All the swag you'll ever need", true);
		extraMaintenance.addExtra("2", 100, "Souna", "Hot and sweaty, mhh mmhh mmmmmmmmmm", true);
	}

	/*
	 * Creates a booking in the system to make sure we have it during testing.
	 * It is not payed. The global "bookingReference" 
	 */
	private static void makeABooking() {
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
	public void testMABAltFlow1a(){
		String startDate 		 = "150110";
		String endDate   	 	 = "150112";
		int nrOfGuests   		 = 2;
		List<String> roomTypes	 = new ArrayList <String>();
		List<String> extras		 = new ArrayList <String>();
		List<String> services    = new ArrayList <String>();
		
		extras.add("1");
		extras.add("2");
		
		services.add("Took a cab");
		
		roomTypes.add("Economic");

		String bookingRef = bookingprovides.book(startDate, endDate, nrOfGuests, roomTypes, extras, services);
		assertFalse(bookingRef.compareTo("") == 0);
		
		assertTrue(bookingprovides.getExtras(bookingRef).size() == 2);
		assertTrue(bookingprovides.getServiceNotes(bookingRef).size() == 1);
		int price = bookingprovides.getPrice(bookingRef);
		System.out.println("Price: " + price);	
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
	 * Alt flow MAB: chosen number of guests is invalid (is below 1)
	 */
	public void testMABAltFlow2c(){
		int nrOfGuests   		 = -2;
		List<String> roomTypes	 = new ArrayList <String>();
		List<String> extras		 = new ArrayList <String>();
		List<String> services    = new ArrayList <String>();
		roomTypes.add("Economic");

		String bookingRef = bookingprovides.book("150310", "150315", nrOfGuests, roomTypes, extras, services);
		assertFalse(bookingRef.equals(""));
	}

	/*
	 * Alt flow MAB: chosen roomtype(s) is invalid (doesn’t exist)
	 */
	public void testMABAltFlow2d(){
		int nrOfGuests   		 = 2;
		List<String> roomTypes	 = new ArrayList <String>();
		List<String> extras		 = new ArrayList <String>();
		List<String> services    = new ArrayList <String>();
		roomTypes.add("Doesn't exit");
		roomTypes.add("Does not exist either");

		String bookingRef = bookingprovides.book("150310", "150315", nrOfGuests, roomTypes, extras, services);
		assertFalse(bookingRef.equals(""));
	}

	/*
	 * Alt flow MAB: chosen amount of roomtype(s) is invalid (is below 1)
	 */
	public void testMABAltFlow2e(){
		int nrOfGuests   		 = 2;
		List<String> roomTypes	 = new ArrayList <String>();
		List<String> extras		 = new ArrayList <String>();
		List<String> services    = new ArrayList <String>();

		String bookingRef = bookingprovides.book("150310", "150315", nrOfGuests, roomTypes, extras, services);
		assertFalse(bookingRef.equals(""));
	}

	/*
	 * Alt flow MAB: Personal details are invalid, person is too young, 
	 * below legal age limit
	 */
	public void testMABAltFlow6(){
		String startDate 		 = "150110";
		String endDate   	 	 = "150112";
		int nrOfGuests   		 = 2;
		List<String> roomTypes	 = new ArrayList <String>();
		List<String> extras		 = new ArrayList <String>();
		List<String> services    = new ArrayList <String>();

		roomTypes.add("Economic");

		String bookingRef = bookingprovides.book(startDate, endDate, nrOfGuests, roomTypes, extras, services);
		assertFalse(bookingRef.equals(""));

		int price = bookingprovides.getPrice(bookingRef);
		System.out.println("Price: " + price);
		//Finds the price acceptable
		assertTrue(bookingprovides.setPersonalDetails(firstName, lastName, 12, email, bookingRef) != 0);

	}

	/*
	 * Alt flow MAB: Payment details are invalid
	 */
	public void testMABAltFlow8(){
		String startDate 		 = "150110";
		String endDate   	 	 = "150112";
		int nrOfGuests   		 = 2;
		List<String> roomTypes	 = new ArrayList <String>();
		List<String> extras		 = new ArrayList <String>();
		List<String> services    = new ArrayList <String>();

		roomTypes.add("Economic");

		String bookingRef = bookingprovides.book(startDate, endDate, nrOfGuests, roomTypes, extras, services);
		assertFalse(bookingRef.equals(""));

		int price = bookingprovides.getPrice(bookingRef);
		System.out.println("Price: " + price);
		//Finds the price accepteble
		assertTrue(bookingprovides.setPersonalDetails(firstName, lastName, age, email, bookingRef) == 0);
		bookingprovides.setPaymentDetails(null, null, 0, 0, null, null, null, bookingRef);
		assertTrue(bookingprovides.payBooking(bookingRef) != 0);

	}


	/*
	 * Main flow make a booking
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
		assertTrue(extraMaintenance.exists("1"));
		assertTrue(extraMaintenance.exists("2"));
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
		String oldRS = roomMaintenence.getRoomStatus(4);
		assertTrue(oldRS.equals("Vacant"));
		roomMaintenence.editRoomStatus(4, "busy");
		assertFalse(roomMaintenence.getRoomStatus(4).equals(oldRS));
	}

	@Test
	public void testEditRoom() {
		roomTypeMaintenance.addRoomType("ToBeEdited", "doublebed", 100, 3, "A fine room indeed");
		roomMaintenence.addRoom(100, "ToBeEdited");
		
		List<String> roomTs = new ArrayList<String>();
		roomTs.add("ToBeEdited");
		
		//Make booking
		String bookingReference = bookingprovides.book("150110", "150114", 2, roomTs,
				new ArrayList <String>(), new ArrayList <String>());

		bookingprovides.setPersonalDetails(firstName, lastName, age, email, bookingReference);
		bookingprovides.setPaymentDetails(ccNumber, ccv, expMonth, expYear, firstName, lastName, email, bookingReference);
		bookingprovides.setPaymentMethod("bankcard", bookingReference);
				
		roomTs.add("ToBeEdited");
		
		//Edit the booking (already know it exists...)
		int price = bookingprovides.editBooking(bookingReference, "150111", "150115", 3, roomTs, new ArrayList<String>(), new ArrayList<String>());
		assertTrue( price>0 );
	}
}
