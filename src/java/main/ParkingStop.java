import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ParkingStop {

    private String tags;
    private LocalTime entry, exit;
    private long duration;

    public ParkingStop(String tag)
    {
        tags = tag;
    }

    public void setEntry(LocalTime entry) {
        this.entry = entry;
    }

    public void setExit(LocalTime exit) {
        this.exit = exit;
    }

    public LocalTime getEntry() {
        entry = LocalTime.now();
        return entry;
    }



    public LocalTime getExit() {
        exit = LocalTime.now();
        return exit;
    }


    public long getDuration()
    {
        duration = Duration.between(getEntry(), getExit()).get(ChronoUnit.MINUTES);
        return duration;
    }
}
