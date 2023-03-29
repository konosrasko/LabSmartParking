import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PriceList {

    private int id;
    private int startingDate;
    private int endingDate;
    private int totalDuration;
    private List<PriceScale> scaleList = new ArrayList<>();


    public PriceList(int id)
    {
        this.id = id;
    }

    public void addPriceScale(int end, int scale, double cost)
    {
        scaleList.add(new PriceScale(end, scale, cost));
    }

    public void calculate_cost(int totalDuration)
    {
        double totalCost=0;
        this.totalDuration = totalDuration;

        for(int i=0; i<scaleList.size(); i++)
        {
            if(this.totalDuration>0) {
                totalCost = totalCost + scaleList.get(i).calculate_cost(this.totalDuration);
                this.totalDuration = scaleList.get(i).getVehicleDur();
            }else{
                break;
            }
        }

        System.out.println("Your total cost is: "+totalCost);

    }



}
