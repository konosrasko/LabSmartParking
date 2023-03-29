import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingTest {
    Parking parking = new Parking("asd");
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


}

