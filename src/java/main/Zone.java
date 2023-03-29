import java.util.ArrayList;
import java.util.List;

public class Zone {
    private String name;
    private List<Slot> slotList = new ArrayList<>();
    public Zone(String name){
        this.name=name;
    }

    public void addSlot(Slot slot){
        slotList.add(slot);
    }

    public String getName() {
        return name;
    }

    public List<Slot> getSlotList() {
        return slotList;
    }

}
