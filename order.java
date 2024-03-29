import java.util.ArrayList;

public class order implements itemInterface{
    
    public double calculateCost(ArrayList<Double> foodList)
    {
        double fullPrice = 0;
        for(int i = 0; i < foodList.size(); i++)
        {
            fullPrice += foodList.get(i);
        }
        return fullPrice;
    }

}
