import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Slot {
    private String name;
    private ParkingStop pStop;
    private List<PriceList> priceList= new ArrayList<>();
    private List<ParkingStop> parkingStop = new ArrayList<>();
    private ParkingStop p;

    public Slot(){

    }
    public Slot(String name){
        this.name=name;

    }

    public void addPriceList(PriceList priceList1){
        priceList.add(priceList1);
    }


    public void addParkingSpot(String tag){
        this.pStop = new ParkingStop(tag);
        parkingStop.add(pStop);
    }

    public double calcTime()
    {

        return pStop.getDuration();
    }

    public String getName() {
        return name;
    }

    public List<PriceList> getPriceList() {
        return priceList;
    }

    public List<ParkingStop> getParkingStop() {
        return parkingStop;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPStop(ParkingStop pStop) {
        this.pStop = pStop;
    }
}
