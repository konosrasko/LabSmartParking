import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PriceList {

    private int id;
    private double totalDuration;
    private List<PriceScale> scaleList = new ArrayList<>();


    public PriceList(){

    }
    public PriceList(int id)
    {
        this.id = id;
    }
    public void  addPriceScale(int id,int end, int scale, double cost)  {

                    if(scale > 0 && (end > scale) && cost >= 0) {
                        scaleList.add(new PriceScale(id, end, scale, cost));
                    }
                    else
                    {
                        throw new IllegalArgumentException ();
                    }
    }

    public void changePriceScale(int id, int end, int scale, double cost)
    {

        for(int i=0;i< scaleList.size();i++)
        {
            if (scaleList.get(i).getId() == id){
                scaleList.get(i).setScale(scale);
                scaleList.get(i).setCost(cost);
                scaleList.get(i).setDuration(end);
            }
        }
    }


//    public void PriceScaleError() throws Exception {
//        for (int i = 1; i < scaleList.size(); i++) {
//            if (scaleList.get(i).getDuration() < scaleList.get(i - 1).getDuration()) {
//                Exception exception = new Exception();
//                throw exception;
//            }
//
//        }
//    }
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
