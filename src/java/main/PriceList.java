import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PriceList {

    private int id;
    private double totalDuration;
    private List<PriceScale> scaleList = new ArrayList<>();



    public PriceList(int id)
    {
        this.id = id;
    }




        public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double calculate_cost(double dur)
    {
        totalDuration = dur;
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
