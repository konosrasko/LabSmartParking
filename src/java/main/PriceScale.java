public class PriceScale {

    private int duration;
    private int scale;
    private double cost;



    protected PriceScale(int duration, int scale, double cost) //Each "scale" minutes costs "cost" euros
    {
        this.duration = duration;
        this.scale = scale;
        this.cost = cost; //per scale unit
    }


    public double getCost(){
        return cost;
    }
    public int getScale()
    {
        return scale;
    }

    public int getDuration()
    {
        return duration;
    }






}
