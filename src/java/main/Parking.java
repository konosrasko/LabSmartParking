import java.util.ArrayList;
import java.util.List;

public class Parking {
    private String name;
    private List<Zone> zoneList = new ArrayList<>();

    public Parking(String name){
            this.name=name;
    }

    public String getName() {
        return name;
    }

    public List<Zone> getZoneList() {
        return zoneList;
    }



    public void addZone(Zone zone){
        zoneList.add(zone);
    }

    public void setName(String name) {
        this.name = name;
    }
}
