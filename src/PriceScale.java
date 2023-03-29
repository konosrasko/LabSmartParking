public class PriceScale {

    private int duration;

    private int vehicleDur, returnDur;
    private int scale;
    private double cost;

    protected PriceScale(int duration, int scale, double cost) //Each "scale" minutes costs "cost" euros
    {
        this.duration = duration;
        this.scale = scale;
        this.cost = cost; //per scale unit
    }


    public double calculate_cost(int x)
    {
        double totalCost;
        if (x>0)
            totalCost = cost;
        else
            totalCost = 0;

        vehicleDur = x;
        if(vehicleDur>duration)
        {
            vehicleDur = duration;
            returnDur = x-vehicleDur;
        }else {
            returnDur = 0;
        }

        while (scale < vehicleDur)
        {
            totalCost = totalCost + cost;
            scale = scale +scale;
        }

        return totalCost;
    }

    public int getScale()
    {
        return scale;
    }

    public int getDuration()
    {
        return duration;
    }

    public int getVehicleDur()
    {
        return returnDur;
    }





}
