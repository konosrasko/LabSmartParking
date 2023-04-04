public class Main {
    public static void main(String[] args) {

PriceList pl = new PriceList(1);

try{
    pl.addPriceScale(1,-2,3);
}
catch (IllegalArgumentException e)
{
    System.out.println("ASd");
}



    }
}