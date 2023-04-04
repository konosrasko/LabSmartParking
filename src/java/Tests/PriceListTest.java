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
        pricelist.addPriceScale(1,120,20,1);
        pricelist.addPriceScale(2,1440,60,3);
        pricelist.addPriceScale(3,2880,240,2);
        assertEquals(11.25,pricelist.calculate_cost(pk.getDuration()));
    }

    @Test
    void PriceListTestMinus() {
        PriceList pricelistMinus = new PriceList(2);

            assertThrows(IllegalArgumentException.class,()->pricelistMinus.addPriceScale(1,120,10,-10));


    }

    @Test
    void PriceListTestDouble() {
        PriceList pricelistDouble = new PriceList(3);
        pricelistDouble.addPriceScale(1,245,25,1);
        pricelistDouble.addPriceScale(2,755,13,3);
        assertEquals(129.6923076923077,pricelistDouble.calculate_cost(755));
    }

    @Test
    void PriceListEndScaleTest() {
        PriceList pricelistDouble = new PriceList(3);

        assertThrows(IllegalArgumentException.class,()->  pricelistDouble.addPriceScale(1,245,250,1));

    }

    @Test          //Για το ID οταν ειναι
    void ChangePriceScaleTest(){
        PriceList pricelistGetScales = new PriceList(4);
        pricelistGetScales.addPriceScale(1,120,10,1);
        pricelistGetScales.addPriceScale(2,240,10,1);
        pricelistGetScales.addPriceScale(3,1440,20,1);
        pricelistGetScales.changePriceScale(3,2880,10,2.5);

    }

    @Test
    void changePriceScaleTest(){
        PriceList PLchangeScale = new PriceList(5);
        ParkingStop ps = new ParkingStop("asd");
        ps.setEntry(LocalTime.of(12,00,00));
        ps.setExit(LocalTime.of(14,45,00));
        PLchangeScale.setId(0);
        PLchangeScale.addPriceScale(0,240,10,1);
        PLchangeScale.addPriceScale(1,1440,30,1);
        PLchangeScale.changePriceScale(PLchangeScale.getId(),300,20,1);
        assertEquals(17.5,PLchangeScale.calculate_cost(ps.getDuration()));
    }
}