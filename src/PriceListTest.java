import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceListTest {

    @Test
    void PriceListTest(){
        PriceList pricelist = new PriceList(1);
        pricelist.addPriceScale(120,20,1);
        pricelist.addPriceScale(1440,60,3);
        pricelist.addPriceScale(2880,240,2);
        pricelist.calculate_cost(1440);
    }

    @Test
    void PriceListTestMinus(){
        PriceList pricelistMinus = new PriceList(2);
        pricelistMinus.addPriceScale(-10,0,-10);
        pricelistMinus.calculate_cost(240);
    }
    @Test
    void PriceListTestDouble(){
        PriceList pricelistDouble = new PriceList(3);
        pricelistDouble.addPriceScale(245,25,1);
        pricelistDouble.addPriceScale(755,13,3);
        pricelistDouble.calculate_cost(240);
    }
}