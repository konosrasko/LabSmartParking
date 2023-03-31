import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PriceList {


    private int id;
    private long totalDuration;
    private List<PriceScale> scaleList = new ArrayList<>();

    ParkingStop pStop = new ParkingStop("asd");

    public PriceList(int id) {
        this.id = id;
    }

    public void addPriceScale(int end, int scale, double cost) {


        scaleList.add(new PriceScale(end, scale, cost));

    }

    public void PriceScaleDouble() {
        for (int i = 0; i < scaleList.size(); i++) {
            if (scaleList.get(i).getDuration() < scaleList.get(i - 1).getDuration()) {
                Exception exception = new Exception();
                exception.getMessage();
            }

        }

        public double calculate_cost()
        {
            totalDuration = pStop.getDuration();
            double totalCost = 0;
            int i = 0;
            while (totalDuration > 0) {
                if (totalDuration >= scaleList.get(i).getDuration()) {
                    totalCost += scaleList.get(i).getCost() * (scaleList.get(i).getDuration() / scaleList.get(i).getScale());
                    totalDuration -= scaleList.get(i).getDuration();
                    i++;
                } else {
                    totalCost += scaleList.get(i).getCost() * ((totalDuration / scaleList.get(i).getScale()) + 1);
                    totalDuration = 0;
                }
            }

            System.out.println("Your total cost is: " + totalCost);
            return totalCost;
        }
    }
}
