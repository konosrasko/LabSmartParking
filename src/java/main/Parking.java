import java.util.ArrayList;
import java.util.List;

public class Parking {
    private String name;
    private List<Zone> zoneList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<Zone> getZoneList() {
        return zoneList;
    }

    public Parking(String name){
        this.name=name;
    }


    public void addZone(Zone zone){
        zoneList.add(zone);
    }

}
