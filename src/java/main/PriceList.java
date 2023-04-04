import javax.swing.*;
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
    public void  addPriceScale(int end, int scale, double cost)  {

        if(end>0 && scale>0 && (end>scale) && cost>=0) {
            scaleList.add(new PriceScale(end, scale, cost));
        }
        else
        {
                        throw new IllegalArgumentException ();
        }
    }

    public void changePriceScale(int id, int end, int scale, double cost)
    {
        int index=0;
        boolean found = false;

        for(int i=0;i< scaleList.size();i++)
        {
            if (scaleList.get(i).getId() == id){
                index = i;
                found = true;
                break;
            }
        }

        if(found)
        {
            scaleList.add(index, new PriceScale(end, scale, cost));
        }
    }

    public void setId(int id)  {
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
