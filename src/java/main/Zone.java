import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zone {
    private String name;
    private List<Slot> slotList = new ArrayList<>();
    private  int flag;

    public Zone(){

    }
    public Zone(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
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


    public void printSlotList(){
        for(Slot slotList : slotList)
            System.out.println(slotList.getName());
    }

    public void slotNameChange(String oldName,String newName){
        for(Slot slotList : slotList){
            if (slotList.getName().equals(oldName))
                slotList.setName(newName);
        }
    }

    public boolean slotExistance(String slotName){
        boolean flag = false;
        for(Slot slotList : slotList){
            if (slotList.getName().equals(slotName))
                flag= true;
        }
        return flag;
    }
}
