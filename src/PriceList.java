import java.util.ArrayList;
import java.util.List;

public class PriceList {

    private int id;
    private int startingDate;
    private int endingDate;
    private int totalDuration;
    private List<PriceScale> scaleList = new ArrayList<>();
    private int totalcost;
    private double totalCost;

    public PriceList(int id)
    {
        this.id = id;
    }

    public void  addPriceScale(int end, int scale, double cost)
    {
        scaleList.add(new PriceScale(end, scale, cost));

    }

    public void calculate_cost(int totalDuration)
    {
        this.totalDuration = totalDuration;
        int i=0;
        while (this.totalDuration>0){
            if(this.totalDuration>=scaleList.get(i).getDuration()) {
                this.totalCost += scaleList.get(i).getCost() * (scaleList.get(i).getDuration()/scaleList.get(i).getScale()) ;
                this.totalDuration -= scaleList.get(i).getDuration();
            }else{
                this.totalCost += scaleList.get(i).getCost() * ((this.totalDuration/scaleList.get(i).getScale())+1) ;
                this.totalDuration=0;
            }
        }

        System.out.println("Your total cost is: "+totalCost);


    }

    public double getTotalCost() {
        return totalCost;
    }





}
