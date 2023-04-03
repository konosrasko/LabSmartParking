import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parking {
    private String name;
    private List<Zone> zoneList = new ArrayList<>();
    public Parking(){}

    public Parking(String name){
            this.name=name;
    }

    public void setName(String name) {

            this.name = name;





    }

    public String getName() {
        return name;
    }

    public List<Zone> getZoneList() {
        return zoneList;
    }

    public void printZoneList(){
        for(Zone zoneList : zoneList)
            System.out.println(zoneList.getName());
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

    public int numberOfZones() {
        return zoneList.size();
    }

    public boolean zoneExistance(String slotName){
        boolean flag = false;
        for(Zone zoneList : zoneList){
            if (zoneList.getName().equals(slotName))
                flag= true;
        }
        return flag;
    }
}
