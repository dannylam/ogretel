package host;

import static org.junit.Assert.assertTrue;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypeEnum;
import maintenancemodel.RoomTypesHandler;
import maintenancemodel.impl.RoomTypeImpl;
import maintenancemodel.impl.RoomTypesHandlerImpl;
import maintenancemodel.impl.StringToRoomTypeImpl;

import org.eclipse.emf.common.util.EMap;
import org.junit.Test;


/**
 * Tests RoomMaintenance
 * @generated NOT
 */
public class testRoomMaintenance {

	private RoomTypesHandler rtHandler = new RoomTypesHandlerImpl();
	private EMap<String, RoomType> stringToRoomType = rtHandler.getStringToRoomType();
	
	/**
	 * Tests whether it is possble to add a RoomType.
	 * @generated NOT
	 */
	@Test
	public void testStringToRTPutAndThenGet() {
		
		String roomTypeID = "The best room eva";
		String roomTypeEnum = "doublebed";
		int price = 100;
		int maxNrOfGuests = 3;
		String description = "This room is very cool and I like it a lot.";
		

		RoomType rt = new RoomTypeImpl(roomTypeID, roomTypeEnum, price, maxNrOfGuests, description);
		this.stringToRoomType.put("RTKey", rt);
		
		RoomType gettedRT = this.stringToRoomType.get("RTKey");
		
		assertTrue(gettedRT.getID() == roomTypeID);
		assertTrue(gettedRT.getRoomTypeEnum() == RoomTypeEnum.DOUBLEBED);
		assertTrue(gettedRT.getDescription() == description);
		assertTrue(gettedRT.getMaxNrOfGuests() == maxNrOfGuests);
		assertTrue(gettedRT.getPrice() == price);
		
	}
	
//	/**
//	 * Tests whether it is possble to add a RoomType.
//	 * @generated NOT
//	 */
//	@Test
//	public void testAddRoomType() {
//		
//		String roomTypeID = "The best room eva";
//		String roomTypeEnum = "doublebed";
//		int price = 100;
//		int maxNrOfGuests = 3;
//		String description = "This room is very cool and I like it a lot.";
//		
//		this.rtHandler.addRoomType(roomTypeID, roomTypeEnum, price, maxNrOfGuests, description);
//		
//		this.stringToRoomType.get(roomTypeID).toString();
//		assertTrue(1 == 1);
//		
//	}

}
