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

}