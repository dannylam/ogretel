package host;

import static org.junit.Assert.assertTrue;
import maintenancemodel.IRoomMaintenance;
import maintenancemodel.Room;
import maintenancemodel.RoomType;
import maintenancemodel.RoomTypeEnum;
import maintenancemodel.RoomTypesHandler;
import maintenancemodel.impl.RoomMaintenanceImpl;
import maintenancemodel.impl.RoomTypeImpl;
import maintenancemodel.impl.RoomTypesHandlerImpl;

import org.eclipse.emf.common.util.EMap;
import org.junit.Test;

/**
 * Tests RoomMaintenance
 * 
 * @generated NOT
 */
public class testRoomMaintenance {

	private IRoomMaintenance rm = new RoomMaintenanceImpl();

	//
	private RoomTypesHandler rtHandler = new RoomTypesHandlerImpl();
	private EMap<String, RoomType> stringToRoomType = rtHandler
			.getStringToRoomType();

	/**
	 * Tests whether it is possble to add a RoomType.
	 * 
	 * @generated NOT
	 */
	@Test
	public void testStringToRTPutAndThenGet() {

		String roomTypeID = "The best room eva";
		String roomTypeEnum = "doublebed";
		int price = 100;
		int maxNrOfGuests = 3;
		String description = "This room is very cool and I like it a lot.";

		RoomType rt = new RoomTypeImpl(roomTypeID, roomTypeEnum, price,
				maxNrOfGuests, description);
		this.stringToRoomType.put("RTKey", rt);

		RoomType gettedRT = this.stringToRoomType.get("RTKey");

		assertTrue(gettedRT.getID() == roomTypeID);
		assertTrue(gettedRT.getRoomTypeEnum() == RoomTypeEnum.DOUBLEBED);
		assertTrue(gettedRT.getDescription() == description);
		assertTrue(gettedRT.getMaxNrOfGuests() == maxNrOfGuests);
		assertTrue(gettedRT.getPrice() == price);

	}

	/**
	 * Tests whether it is possible to add a RoomType from RoomTypesHandler.
	 * 
	 * @generated NOT
	 */
	@Test
	public void testAddRoomTypeFromHandler() {

		String roomTypeID = "Very good room";
		String roomTypeEnum = "doublebed";
		int price = 100;
		int maxNrOfGuests = 3;
		String description = "This room is very cool and I like it a lot.";

		this.rtHandler.addRoomType(roomTypeID, roomTypeEnum, price,
				maxNrOfGuests, description);

		RoomType gettedRT = this.stringToRoomType.get(roomTypeID);

		assertTrue(gettedRT.getID() == roomTypeID);
		assertTrue(gettedRT.getRoomTypeEnum() == RoomTypeEnum.DOUBLEBED);
		assertTrue(gettedRT.getDescription() == description);
		assertTrue(gettedRT.getMaxNrOfGuests() == maxNrOfGuests);
		assertTrue(gettedRT.getPrice() == price);

	}

	/**
	 * Tests whether it is possible to add a RoomType.
	 * 
	 * @generated NOT
	 */
	@Test
	public void testAddRoomType() {

		String roomTypeID = "Very good room";
		String roomTypeEnum = "doublebed";
		int price = 100;
		int maxNrOfGuests = 3;
		String description = "This room is very cool and I like it a lot.";

		int addRT = this.rm.addRoomType(roomTypeID, roomTypeEnum, price,
				maxNrOfGuests, description);

		// TODO
		// RoomType gettedRT =
		// this.rm.getRoomTypeHandler().getStringToRoomType().get(roomTypeID);

		RoomType gettedRT = null;

		assertTrue(gettedRT.getID() == roomTypeID);
		assertTrue(gettedRT.getRoomTypeEnum() == RoomTypeEnum.DOUBLEBED);
		assertTrue(gettedRT.getDescription() == description);
		assertTrue(gettedRT.getMaxNrOfGuests() == maxNrOfGuests);
		assertTrue(gettedRT.getPrice() == price);
		assertTrue(addRT == 0);

	}

	/**
	 * Tests whether it is possible to remove a RoomType.
	 * 
	 * @generated NOT
	 */
	@Test
	public void testRemoveRoomType() {

		String roomTypeID = "So good room";
		String roomTypeEnum = "doublebed";
		int price = 100;
		int maxNrOfGuests = 3;
		String description = "This room is very cool and I like it a lot.";

		int addRT = this.rm.addRoomType(roomTypeID, roomTypeEnum, price,
				maxNrOfGuests, description);
		assertTrue(addRT == 0);
		// TODO
		// assertTrue(this.rm.getRoomTypeHandler().exists(roomTypeID));

		int remRT = this.rm.removeRoomType(roomTypeID);
		assertTrue(remRT == 0);
		// TODO
		// assertTrue(!this.rm.getRoomTypeHandler().exists(roomTypeID));

	}

	/**
	 * Tests whether it is possible to edit a RoomType.
	 * 
	 * @generated NOT
	 */
	@Test
	public void testEditRoomType() {

		String roomTypeID = "So good room";
		String roomTypeEnum = "doublebed";
		int price = 100;
		int maxNrOfGuests = 3;
		String description = "This room is very cool and I like it a lot.";

		int addRT = this.rm.addRoomType(roomTypeID, roomTypeEnum, price,
				maxNrOfGuests, description);
		assertTrue(addRT == 0);
		// TODO
		// assertTrue(this.rm.getRoomTypeHandler().exists(roomTypeID));

		int edRT = this.rm.editRoomType(roomTypeID, "singlebed", 200, 1,
				"Här bor en apa.");
		assertTrue(edRT == 0);

		// TODO
		// RoomType gettedRT =
		// this.rm.getRoomTypeHandler().getStringToRoomType().get(roomTypeID);

		RoomType gettedRT = null;

		assertTrue(gettedRT.getID() == roomTypeID);
		assertTrue(gettedRT.getRoomTypeEnum() == RoomTypeEnum.SINGLEBED);
		assertTrue(gettedRT.getDescription() == "Här bor en apa.");
		assertTrue(gettedRT.getMaxNrOfGuests() == 1);
		assertTrue(gettedRT.getPrice() == 200);

	}
	
	/**
	 * Tests whether it is possible to add a Room.
	 * @generated NOT
	 */
	@Test
	public void testAddRoom() {
		
		String roomTypeID = "Cosy room";
		String roomTypeEnum = "doublebed";
		int price = 150;
		int maxNrOfGuests = 2;
		String description = "Nice and eciN";
		
		int addRT = this.rm.addRoomType(roomTypeID, roomTypeEnum, price, maxNrOfGuests, description);
		assertTrue(addRT == 0);
		
		int addedR = this.rm.addRoom(10, roomTypeID);
		
		assertTrue(addedR == 0);
		assertTrue(this.rm.getRoomTypeIDs().contains(10));	
	}

}
