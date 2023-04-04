import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ParkingStop {

    private String tags;
    private LocalTime entry, exit;
    private long duration;
    public ParkingStop(){

    }
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
        return entry;
    }

    public LocalTime getExit() {
        return exit;
    }

    public double getDuration()
    {

        duration = Duration.between(this.entry, this.exit).toMinutes();

        return duration;
    }

    public String getTags() {
        return tags;
    }


}
