import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

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
        assertEquals(18,pricelist.calculate_cost(pricelist.calculate_cost(pk.getDuration())));

    }

    @Test
    void PriceListTestMinus() throws  Exception{
        PriceList pricelistMinus = new PriceList(2);
        pricelistMinus.addPriceScale(-120,10,-10);
        assertEquals(18,pricelistMinus.calculate_cost(pricelistMinus));

    }
    @Test
    void PriceListTestDouble() throws  Exception{
        PriceList pricelistDouble = new PriceList(3);
        pricelistDouble.addPriceScale(245,25,1);
        pricelistDouble.addPriceScale(755,13,3);
        pricelistDouble.calculate_cost(240);
    }

    @Test
    void PriceListEndScaleTest() throws  Exception{
        PriceList pricelistDouble = new PriceList(3);
        pricelistDouble.addPriceScale(245,250,1);
        pricelistDouble.calculate_cost(240);
    }





}