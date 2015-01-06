package host;

import java.util.ArrayList;
import java.util.List;

import maintenancemodel.impl.RoomMaintenanceImpl;

import org.junit.BeforeClass;
import org.junit.Test;

import bookingmodel.BookingProvides;
import bookingmodel.impl.BookingProvidesImpl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


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
	
	@BeforeClass
	public void setUpBeforeClass () throws Exception {
		roomMaintenence.addRoomType("Economic", "doublebed", 100, 3, "A fine room indeed");
		for(int i=1; i<10; i++) {
			roomMaintenence.addRoom(i, "Economic");
		}
	}
	
	@Test
	public void testMakeABooking() {
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
		assertTrue(bookingprovides.payBooking(bookingRef) == 0);
		
		//Gives the bookingRef
		System.out.println(bookingRef);
	}
		
	@Test
	public void testCheckInCheckOut() {
		
	}
	
	@Test
	public void testEditAvalabilityOfRoom() {
		
	}

	
}
