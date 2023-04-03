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
        pk.setEntry(LocalTime.of(11,59,00));
        pk.setExit(LocalTime.now());

        assertTrue(pk.getEntry().getHour() <= pk.getExit().getHour() && pk.getEntry().getMinute() <= pk.getExit().getMinute(),"The entry time must be smaller than then exit hour");

        System.out.println(pk.getEntry()+"|||||||"+pk.getExit());

    }


}