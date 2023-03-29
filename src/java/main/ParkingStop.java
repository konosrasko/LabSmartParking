public class ParkingStop {

    private String tags;
    private int entry, exit;
    private int duration;

    public ParkingStop(String tag)
    {
        tags = tag;
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }

    public int getExit() {
        return exit;
    }

    public void setExit(int exit) {
        this.exit = exit;
    }

    public int getDuration()
    {
        duration = exit - entry;
        return duration;
    }


}
