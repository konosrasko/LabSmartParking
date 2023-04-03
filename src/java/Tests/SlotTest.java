import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

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
        ParkingStop parkstop = new ParkingStop("1");
        parkstop.setEntry(LocalTime.of(12,00,00));
        parkstop.setExit(LocalTime.of(14,30,00));
        slot.setPStop(parkstop);
        assertEquals(150,slot.calcTime());
    }


}