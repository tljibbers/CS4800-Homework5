import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class decoratorTest {

    burger b = new burger();
    fries f = new fries();
    hotDog hd = new hotDog();
    itemInterface it;
    ArrayList<Double> burgList = new ArrayList<Double>();
    ArrayList<Double> fryList = new ArrayList<Double>();
    ArrayList<Double> hotDogList = new ArrayList<Double>();
    ArrayList<Double> foodList = new ArrayList<Double>();
    double zero = 0;


    @Test
    public void testBasePrice()
    {
        assertEquals(burgList, b.setBasePrice(burgList));
        assertEquals(fryList, f.setBasePrice(fryList));
        assertEquals(hotDogList, hd.setBasePrice(hotDogList));
    }

    @Test
    public void testAddTopping()
    {
        assertEquals(burgList, b.addTopping(0.1, burgList));
        assertEquals(fryList, f.addTopping(0.1, fryList));
        assertEquals(hotDogList, hd.addTopping(0.1, hotDogList));
    }

    @Test
    public void testCalculateCost()
    {
        assertEquals(zero, b.calculateCost(burgList), 1e-15);
        assertEquals(zero, f.calculateCost(fryList), 1e-15);
        assertEquals(zero, hd.calculateCost(hotDogList), 1e-15);
        it = new customerLoyalty(it);
        assertEquals(zero, it.calculateCost(foodList), 1e-15);
       
        
    }
    
}
