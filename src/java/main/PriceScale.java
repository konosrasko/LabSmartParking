public class PriceScale {

    private int duration;
    private int id;
    private int scale;
    private double cost;

    protected PriceScale(){

    }
    protected PriceScale(int id,int duration, int scale, double cost) //Each "scale" minutes costs "cost" euros
    {
        this.id=id;
        this.duration = duration;
        this.scale = scale;
        this.cost = cost; //per scale unit
    }

    protected void setDuration(int duration) {
        this.duration = duration;
    }

    protected void setScale(int scale) {
        this.scale = scale;
    }

    protected void setCost(double cost) {
        this.cost = cost;
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

    public int getId()
    {
        return id;
    }

}
