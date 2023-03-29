import java.util.ArrayList;
import java.util.List;

public class Slot {
    private String name;
    private List<PriceList> priceList= new ArrayList<>();
    private List<ParkingStop> parkingStop = new ArrayList<>();
    public Slot(String name){
        this.name=name;
    }

    public addPriceList(PriceScale priceScale){
        priceList.add(priceScale);
    }

    public addParkingSpot(ParkingStop pStop){
        parkingStop.add(pStop);
    }

}
