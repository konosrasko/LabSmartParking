public class Main {
    public static void main(String[] args) {
            Parking p1 = new Parking("     ");

            Slot s1 = new Slot("njdsa");

            PriceList pL1 = new PriceList(1);

            pL1.addPriceScale(60, 20, 2);
            pL1.addPriceScale(120, 30, 3);
            pL1.addPriceScale(30, 10, 5);

            s1.addPriceList(pL1);



    }
}