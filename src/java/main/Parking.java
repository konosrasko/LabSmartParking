import java.util.ArrayList;
import java.util.Arrays;
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

    public void printZoneList(){
        System.out.println(Arrays.toString(zoneList.toArray()));
    }

    public void zoneNameChange(String oldName,String newName){
        for(Zone zoneList : zoneList){
            if (zoneList.getName().equals(oldName))
                zoneList.setName(newName);
        }
    }

    public void addZone(Zone zone){
        zoneList.add(zone);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int numberOfZones()
    {
        return zoneList.size();
    }

}
