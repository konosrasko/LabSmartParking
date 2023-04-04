import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class PriceListTest {


    @Test
    void PriceListTest() {
        PriceList pricelist = new PriceList(1);
        ParkingStop pk = new ParkingStop("aSD");
        pk.setEntry(LocalTime.of(12,00,00));
        pk.setExit(LocalTime.of(14,45,00));
        pricelist.addPriceScale(120,20,1);
        pricelist.addPriceScale(1440,60,3);
        pricelist.addPriceScale(2880,240,2);
        assertEquals(11.25,pricelist.calculate_cost(pk.getDuration()));
    }

    @Test
    void PriceListTestMinus() {
        PriceList pricelistMinus = new PriceList(2);

            assertThrows(IllegalArgumentException.class,()->pricelistMinus.addPriceScale(120,10,-10));


    }

    @Test
    void PriceListTestDouble() {
        PriceList pricelistDouble = new PriceList(3);
        pricelistDouble.addPriceScale(245,25,1);
        pricelistDouble.addPriceScale(755,13,3);
        pricelistDouble.calculate_cost(240);
    }

    @Test
    void PriceListEndScaleTest() {
        PriceList pricelistDouble = new PriceList(3);

        assertThrows(IllegalArgumentException.class,()->  pricelistDouble.addPriceScale(245,250,1));

    }

    @Test          //Για το ID οταν ειναι
    void ChangePriceScaleTest(){
        PriceList pricelistGetScales = new PriceList(4);
        pricelistGetScales.addPriceScale(120,10,1);
        pricelistGetScales.addPriceScale(240,10,1);
        pricelistGetScales.addPriceScale(1440,20,1);
        pricelistGetScales.changePriceScale(2,2880,10,2.5);

    }



}