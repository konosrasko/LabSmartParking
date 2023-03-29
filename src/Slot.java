import java.util.ArrayList;
import java.util.List;

public class Slot {
    private String name;
    private List<PriceList> priceList= new ArrayList<>();
    private List<ParkingSpot> parkingSpot = new ArrayList<>();
    public Slot(String name){
        this.name=name;
    }

    public addPriceList(PriceScale priceScale){
        priceList.add(priceScale);
    }

    public addParkingSpot(ParkingSpot pSpot){
        parkingSpot.add(pSpot);
    }

}
