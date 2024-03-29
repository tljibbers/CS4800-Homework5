import java.util.ArrayList;

public class customerLoyalty implements itemInterface {
    private itemInterface decoratedInterface;
    public customerLoyalty(itemInterface iInterface)
    {
        this.decoratedInterface = iInterface;
    }

    public double calculateCost(ArrayList<Double> foodList)
    {
        double discountedPrice = decoratedInterface.calculateCost(foodList);
        discountedPrice = discountedPrice * .90;
        
        return discountedPrice;
    }
}