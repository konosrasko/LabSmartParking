import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZoneTest {
    Zone zone = new Zone("zone");


    @Test
    void addSlot() {
        Slot slot = new Slot();
        slot.setName("slot1");
        zone.addSlot(slot);
        assertEquals(1 , zone.getSlotList().size());
    }

//    @Test
//    void printSlotList(){
//        zone.addSlot(new Slot("Slot1"));
//        zone.addSlot(new Slot("Slot2"));
//        zone.addSlot(new Slot("Slot3"));
//        zone.printSlotList();
//        assertTrue(true);
//    }

    @Test
    void slotChangeName(){
        zone.addSlot(new Slot("Slot0"));
        zone.addSlot(new Slot("Slot2"));
        zone.addSlot(new Slot("Slot3"));
        zone.slotNameChange("Slot0","Slot1");
        assertTrue(zone.slotExistance("Slot1"));
    }

}