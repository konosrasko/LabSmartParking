import java.util.ArrayList;
import java.util.List;

public class Parking {
    private String name;
    private List<Zone> zoneList = new ArrayList<>();

    public Parking(String name){
        this.name=name;
    }

    public addZone(Zone zone){
        zoneList.add(zone);
    }

}
