import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ParkingStopTest {

    @Test
    void ParkingStopTest(){
        ParkingStop pk = new ParkingStop("pk1");
        pk.setEntry(LocalTime.of(12,01,00));
        pk.setExit(LocalTime.now());
        pk.getDuration();
        System.out.println(pk.getDuration());

    }

    @Test
    void ParkingStopName(){
        ParkingStop pk = new ParkingStop("pkNamePrint");
        assertEquals("pkNamePrint",pk.getTags());
    }

    @Test
    void ParkingStopEntryExitTest(){
        ParkingStop pk = new ParkingStop("pkEntryExitTest");
        pk.setEntry(LocalTime.of(12,01,00));
        pk.setExit(LocalTime.now());
        System.out.println(pk.getEntry()+"|||||||"+pk.getExit());
    }

}