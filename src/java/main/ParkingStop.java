import java.time.Duration;
import java.time.LocalTime;

public class ParkingStop {

    private String tags;
    private LocalTime entry, exit;
    private Duration duration;

    public ParkingStop(String tag)
    {
        tags = tag;
    }

    public LocalTime getEntry() {
        return LocalTime.now();
    }



    public LocalTime getExit() {
        return LocalTime.now();
    }


    public Duration getDuration()
    {
        duration = Duration.between(getEntry(), getExit());
        return duration;
    }


}
