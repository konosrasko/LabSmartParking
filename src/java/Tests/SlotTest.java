import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlotTest {
    ParkingStop parkingStop = new ParkingStop("knt9123");
    Parking p1 = new Parking("limani");
    Zone ZoneA= new Zone("ZoneA");
    Slot slot = new Slot("1");
    PriceList pl1 = new PriceList(1);


    @Test
    void slotExistanceTest(){
        ZoneA.addSlot(new Slot("Slot1"));
        ZoneA.addSlot(new Slot("Slot2"));
        ZoneA.addSlot(new Slot("Slot3"));
        ZoneA.addSlot(new Slot("Slot4"));
        assertTrue(ZoneA.slotExistance("Slot1"));
        assertTrue(ZoneA.slotExistance("Slot2"));
        assertTrue(ZoneA.slotExistance("Slot3"));
        assertTrue(ZoneA.slotExistance("Slot4"));
    }

    @Test
    void SlotPL(){
        Slot slot = new Slot("slot");
        slot.addParkingSpot("1");
        assertEquals("slot",slot.getName());
    }

    @Test
    void SlotCalcTimeTest(){
        Slot slot = new Slot();
        System.out.println(slot.calcTime());
    }

//    @Test
//    void SlotTest(){
//        pl1.addPriceScale(120,10,1);
//        pl1.addPriceScale(1440,60,3);
//        slot.addPriceList(pl1);
//        ZoneA.addSlot(slot);
//        p1.addZone(ZoneA);
//        pl1.calculate_cost(120);
//        assertEquals(12,pl1.getTotalCost());
//
//    }

}