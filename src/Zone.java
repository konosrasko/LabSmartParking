import java.util.ArrayList;
import java.util.List;

public class Zone {
    private String name;

    private List<Slots> slotList = new ArrayList<>();
    public Zone(String name){
        this.name=name;
    }

    public void addSlot(Slot slot){
        slotList.add(slot);
    }

}
