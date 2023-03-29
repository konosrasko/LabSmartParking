import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZoneTest {

    Zone a = new Zone("asd");
    Slot b = new Slot("1");
    Slot c = new Slot ("2");
    Slot d = new Slot ("3");



    @Test
    void zoneNameShouldBeEntered ()
    {
        assertFalse(this.a.getName() == "" , "you must enter a name ");
    }


    @Test
    void slotNameShouldBeEntered()
    {
            assertFalse(b.getName() == "" ,  " enter a name for the slot ");
    }
    @Test

    void slotsShouldBeAdded()
    {
        a.addSlot(b);
        a.addSlot(c);
        a.addSlot(d);
        assertTrue(a.getSlotList().size() > 0 , "Failed to add the slots ");

    }
    }


