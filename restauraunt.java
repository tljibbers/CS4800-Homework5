import java.util.ArrayList;

public class restauraunt {
    static double burgTotal;
    static double fryTotal;
    static double hotDogTotal; 
    public static void main(String[] args) {
        applyOrder();
        
    }

    public static void applyOrder()
    {
        itemInterface burg = new burger();
        itemInterface hotd = new hotDog();
        itemInterface fry = new fries();
        itemInterface ord = new order();
        ArrayList<Double> burgerList = new ArrayList<Double>();
        ArrayList<Double> fryList = new ArrayList<Double>();
        ArrayList<Double> hotDogList = new ArrayList<Double>();
        ArrayList<Double> foodList = new ArrayList<Double>();
        double lettuce = .10;
        double tomato = .15;
        double onions = .20;
        double mustard = .00;
        double ketchup = .00;
        double cheese = .15;
        double bacon = .30;
        double salt = .00;
        double gravy = .50;
        double relish = .30;
        double honeyMustard = .30;
        double mayo = .30;
        double peppers = .50;
        
        ((burger) burg).setBasePrice(burgerList);
        ((burger) burg).addTopping(lettuce, burgerList);
        ((burger) burg).addTopping(tomato, burgerList);
        ((burger) burg).addTopping(onions, burgerList);
        ((burger) burg).addTopping(mustard, burgerList);
        ((burger) burg).addTopping(ketchup, burgerList);
        burgTotal = burg.calculateCost(burgerList);
        System.out.println("Total of the burger:");
        System.out.println(burgTotal);

        ((hotDog) hotd).setBasePrice(hotDogList);
        ((hotDog) hotd).addTopping(peppers, hotDogList);
        ((hotDog) hotd).addTopping(mayo, hotDogList);
        ((hotDog) hotd).addTopping(relish, hotDogList);
        ((hotDog) hotd).addTopping(honeyMustard, hotDogList);
        hotDogTotal = hotd.calculateCost(hotDogList);
        System.out.println("Total of the hot dog:");
        System.out.println(hotDogTotal);
        
        ((fries) fry).setBasePrice(fryList);
        ((fries) fry).addTopping(bacon, fryList);
        ((fries) fry).addTopping(cheese, fryList);
        ((fries) fry).addTopping(salt, fryList);
        ((fries) fry).addTopping(gravy, fryList);
        fryTotal = fry.calculateCost(fryList);
        System.out.println("Total of the fries");
        System.out.println(fryTotal);

        foodList.add(burgTotal);
        foodList.add(hotDogTotal);
        foodList.add(fryTotal);

        System.out.println("Total of the food altogether");
        System.out.println(ord.calculateCost(foodList));

        ord = new customerLoyalty(ord);
        System.out.println("Total of the food altogether + 10 percent off customer loyalty discount:");
        System.out.println(ord.calculateCost(foodList));





        

    }
}
