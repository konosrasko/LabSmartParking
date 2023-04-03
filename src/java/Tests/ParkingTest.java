import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingTest {
    Parking parking = new Parking("");
    Parking parking2 = new Parking("ZoneA");
    Zone z = new Zone("A");

    ParkingTest() {
    }

    @Test
    void nameShouldBeEntered() {
        assertFalse(parking.getName() == "", "you should enter a name ");
    }

    @Test
    void aZoneShouldBeAdded() {
        int previousSize = parking.getZoneList().size();
        this.parking.addZone(z);
        assertTrue(parking.getZoneList().size() > previousSize , " a Zone failed to be added successfully ");

    }

    @Test
    void areThereAnyZones()
    {
        parking2.addZone(new Zone("A"));
        parking2.addZone(new Zone("B"));
        parking2.addZone(new Zone("C"));
        parking2.addZone(new Zone("D"));
        assertEquals(4, parking2.numberOfZones());

    }


}

