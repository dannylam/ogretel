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

	//---------------------------------------------------------------------------------------------

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
		assertTrue(this.rm.getRoomTypeIDs().contains(roomTypeID));

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
		//		RoomType gettedRT = null;
		//		assertTrue(gettedRT.getID() == roomTypeID);
		//		assertTrue(gettedRT.getRoomTypeEnum() == RoomTypeEnum.SINGLEBED);
		//		assertTrue(gettedRT.getDescription() == "Här bor en apa.");
		//		assertTrue(gettedRT.getMaxNrOfGuests() == 1);
		//		assertTrue(gettedRT.getPrice() == 200);

	}

	//---------------------------------------------------------------------------------------------

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
		assertTrue(this.rm.getRoomIDs().contains(10));	
	}

	/**
	 * Tests whether it is possible to remove a Room.
	 * @generated NOT
	 */
	@Test
	public void testRemoveRoom() {

		String roomTypeID = "Alone";
		String roomTypeEnum = "singlebed";
		int price = 250;
		int maxNrOfGuests = 1;
		String description = "Here you can be alone for a while. Just relax. Mmmm.";

		int addRT = this.rm.addRoomType(roomTypeID, roomTypeEnum, price, maxNrOfGuests, description);
		assertTrue(addRT == 0);

		int addedR = this.rm.addRoom(11, roomTypeID);

		assertTrue(addedR == 0);
		assertTrue(this.rm.getRoomIDs().contains(11));

		int rmR = this.rm.removeRoom(11);
		assertTrue(rmR == 0);
		assertTrue(!this.rm.getRoomIDs().contains(11));
	}

	/**
	 * Tests whether it is possible to edit a Room.
	 * @generated NOT
	 */
	@Test
	public void testEditRoom() {
		//First RoomType
		String roomTypeID = "Alone";
		String roomTypeEnum = "singlebed";
		int price = 250;
		int maxNrOfGuests = 1;
		String description = "Here you can be alone for a while. Just relax. Mmmm.";

		//Add the RT
		int addRT = this.rm.addRoomType(roomTypeID, roomTypeEnum, price, maxNrOfGuests, description);
		assertTrue(addRT == 0);

		//Add a R12 with the RT
		int addedR = this.rm.addRoom(12, roomTypeID);
		assertTrue(addedR == 0);
		assertTrue(this.rm.getRoomIDs().contains(12));

		//New RT
		String roomTypeID2 = " Not Alone";
		String roomTypeEnum2 = "singlebed";
		int price2 = 300;
		int maxNrOfGuests2 = 2;
		String description2 = "Now this Room can have two guests.";

		//edit the R12 (give new RT)
		int edR = this.rm.editRoom(12, roomTypeID2);
		assertTrue(edR == 0);

	}

	/**
	 * Tests the function getRoomStatuses
	 * @generated NOT
	 */
	public void testGetRoomStatuses(){
		//TODO
	}

	//---------------------------------------------------------------------------------------------

	/**
	 * Tests whether it is possible to get a Rooms status.
	 * @generated NOT
	 */
	@Test
	public void testGetRoomStatus() {

		//Create RoomType
		String roomTypeID = "Family";
		String roomTypeEnum = "doublebed";
		int price = 1000;
		int maxNrOfGuests = 8;
		String description = "Very many people can live in hea'.";

		//Add the RT
		int addRT = this.rm.addRoomType(roomTypeID, roomTypeEnum, price, maxNrOfGuests, description);
		assertTrue(addRT == 0);

		//Create R with RT
		int addedR = this.rm.addRoom(13, roomTypeID);
		assertTrue(addedR == 0);
		assertTrue(this.rm.getRoomIDs().contains(13));

		//Check Status
		assertTrue(this.rm.getRoomStatus(13) == "Vacant");

	}

	/**
	 * Tests whether it is possible to edit a Rooms status.
	 * @generated NOT
	 */
	@Test
	public void testEditRoomStatus() {

		//Create RoomType
		String roomTypeID = "Large Family";
		String roomTypeEnum = "doublebed";
		int price = 1100;
		int maxNrOfGuests = 10;
		String description = "Very many people can live in hea'. Many more.";

		//Add the RT
		int addRT = this.rm.addRoomType(roomTypeID, roomTypeEnum, price, maxNrOfGuests, description);
		assertTrue(addRT == 0);

		//Create R with RT
		int addedR = this.rm.addRoom(14, roomTypeID);
		assertTrue(addedR == 0);
		assertTrue(this.rm.getRoomIDs().contains(14));

		//Check Status
		assertTrue(this.rm.getRoomStatus(14) == "Vacant");

		//Edit Status
		int edStat = this.rm.editRoomStatus(14, "busy");
		assertTrue(edStat == 0);
		assertTrue(this.rm.getRoomStatus(14) == "Busy");
	}

	//---------------------------------------------------------------------------------------------

	/**
	 * Tests whether it is possible to get a Rooms RoomType ID.
	 * @generated NOT
	 */
	@Test
	public void testGetRoomTypeID() {

		//Create RoomType
		String roomTypeID = "Bajs hihi";
		String roomTypeEnum = "luxurysuite";
		int price = 1000;
		int maxNrOfGuests = 8;
		String description = "Hello.";

		//Add the RT
		int addRT = this.rm.addRoomType(roomTypeID, roomTypeEnum, price, maxNrOfGuests, description);
		assertTrue(addRT == 0);

		//Create R with RT
		int addedR = this.rm.addRoom(15, roomTypeID);
		assertTrue(addedR == 0);
		assertTrue(this.rm.getRoomIDs().contains(15));

		//Get the RoomTypeEnum
		assertTrue(this.rm.getRoomTypeID(15) == roomTypeID);

	}

	//----------------------------------------------------------------------------------------------

	/**
	 * Tests whether it is possible to get the list of all RoomTypeEnums.
	 * @generated NOT
	 */
	@Test
	public void testGetRoomTypeEnums() {

		assertTrue(this.rm.getRoomTypeEnums() != null);

		//Create RoomType
		String roomTypeID = "László";
		String roomTypeEnum = "luxurysuite";
		int price = 500;
		int maxNrOfGuests = 3;
		String description = "Hello to you.";

		//Add the RT
		int addRT = this.rm.addRoomType(roomTypeID, roomTypeEnum, price, maxNrOfGuests, description);
		assertTrue(addRT == 0);
		
		// Get it
		assertTrue(this.rm.getRoomTypeEnums().contains(roomTypeID));
		
	}

}
