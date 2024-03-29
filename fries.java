import java.util.ArrayList;

public class fries implements itemInterface{
    
    double basePrice = 3.30;
  

    public ArrayList<Double> setBasePrice(ArrayList<Double> fryList)
    {
        fryList.add(basePrice);
        return fryList;
    }

    public ArrayList<Double> addTopping(double topping, ArrayList<Double> fryList)
    {
        
        fryList.add(topping);
        
        return fryList;
    }

    public double calculateCost(ArrayList<Double> fryList)
    {
        double totalPrice = 0;
        for(int i = 0; i < fryList.size(); i++)
        {
            totalPrice += fryList.get(i);
        }
        return totalPrice;
    }
}
