import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

class PriceListTest {

    @Test
    void PriceListTest() throws  Exception{
        PriceList pricelist = new PriceList(1);
        ParkingStop pk = new ParkingStop("aSD");
        pk.setEntry(LocalTime.of(12,01,00));
        pk.setExit(LocalTime.now());
        pricelist.addPriceScale(120,20,1);
        pricelist.addPriceScale(1440,60,3);
        pricelist.addPriceScale(2880,240,2);
        assertEquals(78,pricelist.calculate_cost(1500));

    }

    @Test
    void PriceListTestMinus() throws  Exception{
        PriceList pricelistMinus = new PriceList(2);
        ParkingStop pk = new ParkingStop("aSD");
        pk.setEntry(LocalTime.of(12,01,00));
        pk.setExit(LocalTime.now());
        pricelistMinus.addPriceScale(-120,10,-10);

    }
    @Test
    void PriceListTestDouble() throws  Exception{
        PriceList pricelistDouble = new PriceList(3);
        pricelistDouble.addPriceScale(245,25,1);
        pricelistDouble.addPriceScale(755,13,3);
        assertEquals(70.84615384615385,pricelistDouble.calculate_cost(500));
    }

    @Test
    void PriceListEndScaleTest() throws  Exception{
        PriceList pricelistDouble = new PriceList(3);
        pricelistDouble.addPriceScale(245,250,1);
        pricelistDouble.calculate_cost(240);

    }

    @Test
    void PriceListTestString(){

    }

}