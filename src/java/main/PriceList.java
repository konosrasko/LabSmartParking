import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PriceList {

    ParkingStop Duration = new ParkingStop("knt8565");
    private int id;
    private long totalDuration;
    private List<PriceScale> scaleList = new ArrayList<>();

    ParkingStop pStop= new ParkingStop("asd");

    public PriceList(int id)
    {
        this.id = id;
    }

    public void  addPriceScale(int end, int scale, double cost)
    {
        if((end>0 || scale>0) && (end>scale) && cost>=0 ) {
            scaleList.add(new PriceScale(end, scale, cost));
        }else {
            System.out.println("Your input is not valid.");
        }

    }

    public double calculate_cost()
    {
        totalDuration = pStop.getDuration();
        double totalCost=0;
        int i=0;
        while (totalDuration>0){
            if(totalDuration>=scaleList.get(i).getDuration()) {
                totalCost += scaleList.get(i).getCost() * (scaleList.get(i).getDuration()/scaleList.get(i).getScale()) ;
                totalDuration -= scaleList.get(i).getDuration();
                i++;
            }else{
                totalCost += scaleList.get(i).getCost() * ((totalDuration/scaleList.get(i).getScale())+1) ;
                totalDuration=0;
            }
        }

        System.out.println("Your total cost is: "+totalCost);
        return totalCost;
    }






}
