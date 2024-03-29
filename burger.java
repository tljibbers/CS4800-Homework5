import java.util.ArrayList;

public class burger implements itemInterface{

    double basePrice = 10.50;
   
    public ArrayList<Double> setBasePrice(ArrayList<Double> burgerList)
    {
        burgerList.add(basePrice);
        return burgerList;
    }

  

    public ArrayList<Double> addTopping(double topping, ArrayList<Double> burgerList)
    {
        burgerList.add(topping);
        
        return burgerList;
    }

    public double calculateCost(ArrayList<Double> burgerList)
    {
        double totalPrice = 0;
        for(int i = 0; i < burgerList.size(); i++)
        {
            totalPrice += burgerList.get(i);
        }
        return totalPrice;
    }
}
