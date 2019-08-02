class Maths{
    int selling_price;
    int cost_price;
    String fullname;

    // A getter - Profit method returning an integer answer(Profit)
    int profit(){
        int amount = selling_price - cost_price;
        return amount;
    }
    // getter method returning full name
    String getName(){
        return fullname;
    }
}
public class Getters_Returns{
    public static void main(String[] args){
        Maths myself = new Maths();
        myself.selling_price  = 45;
        myself.cost_price = 30;
        myself.fullname = "Percy Brown";
        String name = myself.getName();
        System.out.println("My name is " + name);
        int profit = myself.profit();
        System.out.println("The profit gained is GHC" + profit);
    }
}
