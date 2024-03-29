import java.util.ArrayList;

public class hotDog implements itemInterface{

    double basePrice = 5.35;
  

    public ArrayList<Double> setBasePrice(ArrayList<Double> hotDogList)
    {
        hotDogList.add(basePrice);
        return hotDogList;
    }

    public ArrayList<Double> addTopping(double topping, ArrayList<Double> hotDogList)
    {
        hotDogList.add(topping);
        return hotDogList;
    }

    public double calculateCost(ArrayList<Double> hotDogList)
    {
        double totalPrice = 0;
        for(int i = 0; i < hotDogList.size(); i++)
        {
            totalPrice += hotDogList.get(i);
        }
        return totalPrice;
    }

    
}
