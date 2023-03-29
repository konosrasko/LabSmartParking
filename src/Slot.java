import java.util.ArrayList;
import java.util.List;

public class Slot {
    private String name;
    private List<PriceList> priceList= new ArrayList<>();
    private List<ParkingStop> parkingSpot = new ArrayList<>();
    public Slot(String name){
        this.name=name;
    }

    public void addPriceList(PriceList priceScale){
        priceList.add(priceScale);
    }

    public void addParkingSpot(ParkingStop pSpot){
        parkingSpot.add(pSpot);
    }

}
