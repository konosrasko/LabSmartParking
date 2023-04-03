import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingTest {
    Parking parking = new Parking();
    Parking parking2 = new Parking("ZoneA");
    Zone z = new Zone("A");

    ParkingTest() {
    }

    @Test
    void nameShouldBeEntered() {
        parking.setName("ParkingName");
        assertTrue(parking.getName() == "ParkingName");
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

    @Test
    void zoneNameChangeTest(){
        parking2.addZone(new Zone("A"));
        parking2.zoneNameChange("A","a");
        assertTrue(parking2.getZoneList().get(0).getName() == "a", "The zone name failed to changed successfully");
    }
}

